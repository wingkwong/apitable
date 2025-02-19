
import { ICollaCommandDef, ExecuteResult } from 'command_manager';
import { CollaCommandName } from 'commands';
import { Selectors } from '../../exports/store';
import { DatasheetActions } from 'model';
import { IJOTAction } from 'engine/ot';
import { FieldType, ResourceType } from 'types';

export interface IUnarchiveRecordsOptions { 
  cmd: CollaCommandName.UnarchiveRecords;
  data: any[];
  datasheetId?: string;
}

export const unarchiveRecords: ICollaCommandDef<IUnarchiveRecordsOptions> = { 
  undoable: false,
  execute: (context, options) => {
    const { state: state } = context;
    const { data } = options;
    const datasheetId = options.datasheetId || Selectors.getActiveDatasheetId(state)!;
    const snapshot = Selectors.getSnapshot(state, datasheetId);

    if (!snapshot) {
      return null;
    }
    
    const actions: IJOTAction[] = [];
    
    const linkFieldIds: string[] = [];
    for (const fieldId in snapshot.meta.fieldMap) {
      const field = snapshot.meta.fieldMap[fieldId]!;
      if (field.type === FieldType.Link) {
        linkFieldIds.push(fieldId);
      }
    }
    
    const unarchiveRecordsActions = DatasheetActions.unarchivedRecords2Action(snapshot, { recordsData: data, linkFields: linkFieldIds });

    if(unarchiveRecordsActions) {
      unarchiveRecordsActions.forEach(action => { 
        actions.push(action);
      });
    }

    return {
      result: ExecuteResult.Success,
      resourceId: datasheetId,
      resourceType: ResourceType.Datasheet,
      actions,
    };
  }
};
