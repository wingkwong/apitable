/*
 * databus-server
 * databus-server APIs
 *
 * The version of the OpenAPI document: 1.2.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.apitable.databusclient.model;

import java.util.Objects;
import com.apitable.databusclient.model.FieldKeyEnum;
import com.apitable.databusclient.model.FieldUpdateRO;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.apitable.databusclient.JSON;

/**
 * RecordUpdateRO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RecordUpdateRO {
  public static final String SERIALIZED_NAME_FIELD_KEY = "fieldKey";
  @SerializedName(SERIALIZED_NAME_FIELD_KEY)
  private FieldKeyEnum fieldKey;

  public static final String SERIALIZED_NAME_RECORDS = "records";
  @SerializedName(SERIALIZED_NAME_RECORDS)
  private List<FieldUpdateRO> records = new ArrayList<>();

  public RecordUpdateRO() {
  }

  public RecordUpdateRO fieldKey(FieldKeyEnum fieldKey) {
    
    this.fieldKey = fieldKey;
    return this;
  }

   /**
   * Get fieldKey
   * @return fieldKey
  **/
  @javax.annotation.Nonnull
  public FieldKeyEnum getFieldKey() {
    return fieldKey;
  }


  public void setFieldKey(FieldKeyEnum fieldKey) {
    this.fieldKey = fieldKey;
  }


  public RecordUpdateRO records(List<FieldUpdateRO> records) {
    
    this.records = records;
    return this;
  }

  public RecordUpdateRO addRecordsItem(FieldUpdateRO recordsItem) {
    if (this.records == null) {
      this.records = new ArrayList<>();
    }
    this.records.add(recordsItem);
    return this;
  }

   /**
   * Get records
   * @return records
  **/
  @javax.annotation.Nonnull
  public List<FieldUpdateRO> getRecords() {
    return records;
  }


  public void setRecords(List<FieldUpdateRO> records) {
    this.records = records;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecordUpdateRO recordUpdateRO = (RecordUpdateRO) o;
    return Objects.equals(this.fieldKey, recordUpdateRO.fieldKey) &&
        Objects.equals(this.records, recordUpdateRO.records);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldKey, records);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecordUpdateRO {\n");
    sb.append("    fieldKey: ").append(toIndentedString(fieldKey)).append("\n");
    sb.append("    records: ").append(toIndentedString(records)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("fieldKey");
    openapiFields.add("records");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("fieldKey");
    openapiRequiredFields.add("records");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to RecordUpdateRO
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RecordUpdateRO.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RecordUpdateRO is not found in the empty JSON string", RecordUpdateRO.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!RecordUpdateRO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RecordUpdateRO` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RecordUpdateRO.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("records").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `records` to be an array in the JSON string but got `%s`", jsonObj.get("records").toString()));
      }

      JsonArray jsonArrayrecords = jsonObj.getAsJsonArray("records");
      // validate the required field `records` (array)
      for (int i = 0; i < jsonArrayrecords.size(); i++) {
        FieldUpdateRO.validateJsonElement(jsonArrayrecords.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RecordUpdateRO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RecordUpdateRO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RecordUpdateRO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RecordUpdateRO.class));

       return (TypeAdapter<T>) new TypeAdapter<RecordUpdateRO>() {
           @Override
           public void write(JsonWriter out, RecordUpdateRO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RecordUpdateRO read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RecordUpdateRO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RecordUpdateRO
  * @throws IOException if the JSON string is invalid with respect to RecordUpdateRO
  */
  public static RecordUpdateRO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RecordUpdateRO.class);
  }

 /**
  * Convert an instance of RecordUpdateRO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

