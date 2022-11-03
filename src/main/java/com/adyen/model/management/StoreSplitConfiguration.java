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
 * StoreSplitConfiguration
 */

public class StoreSplitConfiguration {
  public static final String SERIALIZED_NAME_BALANCE_ACCOUNT_ID = "balanceAccountId";
  @SerializedName(SERIALIZED_NAME_BALANCE_ACCOUNT_ID)
  private String balanceAccountId;

  public static final String SERIALIZED_NAME_SPLIT_CONFIGURATION_ID = "splitConfigurationId";
  @SerializedName(SERIALIZED_NAME_SPLIT_CONFIGURATION_ID)
  private String splitConfigurationId;

  public StoreSplitConfiguration() { 
  }

  public StoreSplitConfiguration balanceAccountId(String balanceAccountId) {
    
    this.balanceAccountId = balanceAccountId;
    return this;
  }

   /**
   * The [balance account](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/get/balanceAccounts/{id}__queryParam_id) linked to the account holder.
   * @return balanceAccountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The [balance account](https://docs.adyen.com/api-explorer/#/balanceplatform/latest/get/balanceAccounts/{id}__queryParam_id) linked to the account holder.")

  public String getBalanceAccountId() {
    return balanceAccountId;
  }


  public void setBalanceAccountId(String balanceAccountId) {
    this.balanceAccountId = balanceAccountId;
  }


  public StoreSplitConfiguration splitConfigurationId(String splitConfigurationId) {
    
    this.splitConfigurationId = splitConfigurationId;
    return this;
  }

   /**
   * The UUID of the [split configuration](https://docs.adyen.com/marketplaces-and-platforms/classic/split-configuration-for-stores) from the Customer Area.
   * @return splitConfigurationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The UUID of the [split configuration](https://docs.adyen.com/marketplaces-and-platforms/classic/split-configuration-for-stores) from the Customer Area.")

  public String getSplitConfigurationId() {
    return splitConfigurationId;
  }


  public void setSplitConfigurationId(String splitConfigurationId) {
    this.splitConfigurationId = splitConfigurationId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StoreSplitConfiguration storeSplitConfiguration = (StoreSplitConfiguration) o;
    return Objects.equals(this.balanceAccountId, storeSplitConfiguration.balanceAccountId) &&
        Objects.equals(this.splitConfigurationId, storeSplitConfiguration.splitConfigurationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(balanceAccountId, splitConfigurationId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StoreSplitConfiguration {\n");
    sb.append("    balanceAccountId: ").append(toIndentedString(balanceAccountId)).append("\n");
    sb.append("    splitConfigurationId: ").append(toIndentedString(splitConfigurationId)).append("\n");
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
    openapiFields.add("balanceAccountId");
    openapiFields.add("splitConfigurationId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to StoreSplitConfiguration
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (StoreSplitConfiguration.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in StoreSplitConfiguration is not found in the empty JSON string", StoreSplitConfiguration.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!StoreSplitConfiguration.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `StoreSplitConfiguration` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field balanceAccountId
      if (jsonObj.get("balanceAccountId") != null && !jsonObj.get("balanceAccountId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `balanceAccountId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("balanceAccountId").toString()));
      }
      // validate the optional field splitConfigurationId
      if (jsonObj.get("splitConfigurationId") != null && !jsonObj.get("splitConfigurationId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `splitConfigurationId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("splitConfigurationId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StoreSplitConfiguration.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StoreSplitConfiguration' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StoreSplitConfiguration> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StoreSplitConfiguration.class));

       return (TypeAdapter<T>) new TypeAdapter<StoreSplitConfiguration>() {
           @Override
           public void write(JsonWriter out, StoreSplitConfiguration value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StoreSplitConfiguration read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StoreSplitConfiguration given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StoreSplitConfiguration
  * @throws IOException if the JSON string is invalid with respect to StoreSplitConfiguration
  */
  public static StoreSplitConfiguration fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StoreSplitConfiguration.class);
  }

 /**
  * Convert an instance of StoreSplitConfiguration to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

