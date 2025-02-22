/*
 * Management API
 *
 * The version of the OpenAPI document: 1
 * Contact: developer-experience@adyen.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.management;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.Date;

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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.adyen.model.management.JSON;

/**
 * ExternalTerminalAction
 */

public class ExternalTerminalAction {
  public static final String SERIALIZED_NAME_ACTION_TYPE = "actionType";
  @SerializedName(SERIALIZED_NAME_ACTION_TYPE)
  private String actionType;

  public static final String SERIALIZED_NAME_CONFIG = "config";
  @SerializedName(SERIALIZED_NAME_CONFIG)
  private String config;

  public static final String SERIALIZED_NAME_CONFIRMED_AT = "confirmedAt";
  @SerializedName(SERIALIZED_NAME_CONFIRMED_AT)
  private Date confirmedAt;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_RESULT = "result";
  @SerializedName(SERIALIZED_NAME_RESULT)
  private String result;

  public static final String SERIALIZED_NAME_SCHEDULED_AT = "scheduledAt";
  @SerializedName(SERIALIZED_NAME_SCHEDULED_AT)
  private Date scheduledAt;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_TERMINAL_ID = "terminalId";
  @SerializedName(SERIALIZED_NAME_TERMINAL_ID)
  private String terminalId;

  public ExternalTerminalAction() { 
  }

  public ExternalTerminalAction actionType(String actionType) {
    
    this.actionType = actionType;
    return this;
  }

   /**
   * The type of terminal action: **InstallAndroidApp**, **UninstallAndroidApp**, **InstallAndroidCertificate**, or **UninstallAndroidCertificate**.
   * @return actionType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The type of terminal action: **InstallAndroidApp**, **UninstallAndroidApp**, **InstallAndroidCertificate**, or **UninstallAndroidCertificate**.")

  public String getActionType() {
    return actionType;
  }


  public void setActionType(String actionType) {
    this.actionType = actionType;
  }


  public ExternalTerminalAction config(String config) {
    
    this.config = config;
    return this;
  }

   /**
   * Technical information about the terminal action.
   * @return config
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Technical information about the terminal action.")

  public String getConfig() {
    return config;
  }


  public void setConfig(String config) {
    this.config = config;
  }


  public ExternalTerminalAction confirmedAt(Date confirmedAt) {
    
    this.confirmedAt = confirmedAt;
    return this;
  }

   /**
   * The date and time when the action was carried out.
   * @return confirmedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date and time when the action was carried out.")

  public Date getConfirmedAt() {
    return confirmedAt;
  }


  public void setConfirmedAt(Date confirmedAt) {
    this.confirmedAt = confirmedAt;
  }


  public ExternalTerminalAction id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The unique ID of the terminal action.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unique ID of the terminal action.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public ExternalTerminalAction result(String result) {
    
    this.result = result;
    return this;
  }

   /**
   * The result message for the action.
   * @return result
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The result message for the action.")

  public String getResult() {
    return result;
  }


  public void setResult(String result) {
    this.result = result;
  }


  public ExternalTerminalAction scheduledAt(Date scheduledAt) {
    
    this.scheduledAt = scheduledAt;
    return this;
  }

   /**
   * The date and time when the action was scheduled to happen.
   * @return scheduledAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date and time when the action was scheduled to happen.")

  public Date getScheduledAt() {
    return scheduledAt;
  }


  public void setScheduledAt(Date scheduledAt) {
    this.scheduledAt = scheduledAt;
  }


  public ExternalTerminalAction status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * The status of the terminal action: **pending**, **successful**, **failed**, **cancelled**, or **tryLater**.
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The status of the terminal action: **pending**, **successful**, **failed**, **cancelled**, or **tryLater**.")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public ExternalTerminalAction terminalId(String terminalId) {
    
    this.terminalId = terminalId;
    return this;
  }

   /**
   * The unique ID of the terminal that the action applies to.
   * @return terminalId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unique ID of the terminal that the action applies to.")

  public String getTerminalId() {
    return terminalId;
  }


  public void setTerminalId(String terminalId) {
    this.terminalId = terminalId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalTerminalAction externalTerminalAction = (ExternalTerminalAction) o;
    return Objects.equals(this.actionType, externalTerminalAction.actionType) &&
        Objects.equals(this.config, externalTerminalAction.config) &&
        Objects.equals(this.confirmedAt, externalTerminalAction.confirmedAt) &&
        Objects.equals(this.id, externalTerminalAction.id) &&
        Objects.equals(this.result, externalTerminalAction.result) &&
        Objects.equals(this.scheduledAt, externalTerminalAction.scheduledAt) &&
        Objects.equals(this.status, externalTerminalAction.status) &&
        Objects.equals(this.terminalId, externalTerminalAction.terminalId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionType, config, confirmedAt, id, result, scheduledAt, status, terminalId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalTerminalAction {\n");
    sb.append("    actionType: ").append(toIndentedString(actionType)).append("\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    confirmedAt: ").append(toIndentedString(confirmedAt)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    scheduledAt: ").append(toIndentedString(scheduledAt)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    terminalId: ").append(toIndentedString(terminalId)).append("\n");
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
    openapiFields.add("actionType");
    openapiFields.add("config");
    openapiFields.add("confirmedAt");
    openapiFields.add("id");
    openapiFields.add("result");
    openapiFields.add("scheduledAt");
    openapiFields.add("status");
    openapiFields.add("terminalId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ExternalTerminalAction
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ExternalTerminalAction.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ExternalTerminalAction is not found in the empty JSON string", ExternalTerminalAction.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ExternalTerminalAction.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ExternalTerminalAction` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field actionType
      if (jsonObj.get("actionType") != null && !jsonObj.get("actionType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `actionType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("actionType").toString()));
      }
      // validate the optional field config
      if (jsonObj.get("config") != null && !jsonObj.get("config").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `config` to be a primitive type in the JSON string but got `%s`", jsonObj.get("config").toString()));
      }
      // validate the optional field id
      if (jsonObj.get("id") != null && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // validate the optional field result
      if (jsonObj.get("result") != null && !jsonObj.get("result").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `result` to be a primitive type in the JSON string but got `%s`", jsonObj.get("result").toString()));
      }
      // validate the optional field status
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      // validate the optional field terminalId
      if (jsonObj.get("terminalId") != null && !jsonObj.get("terminalId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `terminalId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("terminalId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ExternalTerminalAction.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ExternalTerminalAction' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ExternalTerminalAction> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ExternalTerminalAction.class));

       return (TypeAdapter<T>) new TypeAdapter<ExternalTerminalAction>() {
           @Override
           public void write(JsonWriter out, ExternalTerminalAction value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ExternalTerminalAction read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ExternalTerminalAction given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ExternalTerminalAction
  * @throws IOException if the JSON string is invalid with respect to ExternalTerminalAction
  */
  public static ExternalTerminalAction fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ExternalTerminalAction.class);
  }

 /**
  * Convert an instance of ExternalTerminalAction to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

