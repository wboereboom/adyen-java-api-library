/*
 * Adyen Payout API
 *
 * The version of the OpenAPI document: 68
 * Contact: developer-experience@adyen.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.payout;

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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

import com.adyen.model.payout.JSON;

/**
 * SubmitResponse
 */

public class SubmitResponse {
  public static final String SERIALIZED_NAME_ADDITIONAL_DATA = "additionalData";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_DATA)
  private Map<String, String> additionalData = null;

  public static final String SERIALIZED_NAME_PSP_REFERENCE = "pspReference";
  @SerializedName(SERIALIZED_NAME_PSP_REFERENCE)
  private String pspReference;

  public static final String SERIALIZED_NAME_REFUSAL_REASON = "refusalReason";
  @SerializedName(SERIALIZED_NAME_REFUSAL_REASON)
  private String refusalReason;

  public static final String SERIALIZED_NAME_RESULT_CODE = "resultCode";
  @SerializedName(SERIALIZED_NAME_RESULT_CODE)
  private String resultCode;

  public SubmitResponse() { 
  }

  public SubmitResponse additionalData(Map<String, String> additionalData) {
    
    this.additionalData = additionalData;
    return this;
  }

  public SubmitResponse putAdditionalDataItem(String key, String additionalDataItem) {
    if (this.additionalData == null) {
      this.additionalData = new HashMap<>();
    }
    this.additionalData.put(key, additionalDataItem);
    return this;
  }

   /**
   * This field contains additional data, which may be returned in a particular response.
   * @return additionalData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This field contains additional data, which may be returned in a particular response.")

  public Map<String, String> getAdditionalData() {
    return additionalData;
  }


  public void setAdditionalData(Map<String, String> additionalData) {
    this.additionalData = additionalData;
  }


  public SubmitResponse pspReference(String pspReference) {
    
    this.pspReference = pspReference;
    return this;
  }

   /**
   * A new reference to uniquely identify this request.
   * @return pspReference
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A new reference to uniquely identify this request.")

  public String getPspReference() {
    return pspReference;
  }


  public void setPspReference(String pspReference) {
    this.pspReference = pspReference;
  }


  public SubmitResponse refusalReason(String refusalReason) {
    
    this.refusalReason = refusalReason;
    return this;
  }

   /**
   * In case of refusal, an informational message for the reason.
   * @return refusalReason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "In case of refusal, an informational message for the reason.")

  public String getRefusalReason() {
    return refusalReason;
  }


  public void setRefusalReason(String refusalReason) {
    this.refusalReason = refusalReason;
  }


  public SubmitResponse resultCode(String resultCode) {
    
    this.resultCode = resultCode;
    return this;
  }

   /**
   * The response: * In case of success, it is &#x60;payout-submit-received&#x60;. * In case of an error, an informational message is returned.
   * @return resultCode
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The response: * In case of success, it is `payout-submit-received`. * In case of an error, an informational message is returned.")

  public String getResultCode() {
    return resultCode;
  }


  public void setResultCode(String resultCode) {
    this.resultCode = resultCode;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubmitResponse submitResponse = (SubmitResponse) o;
    return Objects.equals(this.additionalData, submitResponse.additionalData) &&
        Objects.equals(this.pspReference, submitResponse.pspReference) &&
        Objects.equals(this.refusalReason, submitResponse.refusalReason) &&
        Objects.equals(this.resultCode, submitResponse.resultCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalData, pspReference, refusalReason, resultCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubmitResponse {\n");
    sb.append("    additionalData: ").append(toIndentedString(additionalData)).append("\n");
    sb.append("    pspReference: ").append(toIndentedString(pspReference)).append("\n");
    sb.append("    refusalReason: ").append(toIndentedString(refusalReason)).append("\n");
    sb.append("    resultCode: ").append(toIndentedString(resultCode)).append("\n");
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
    openapiFields.add("additionalData");
    openapiFields.add("pspReference");
    openapiFields.add("refusalReason");
    openapiFields.add("resultCode");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("pspReference");
    openapiRequiredFields.add("resultCode");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SubmitResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SubmitResponse.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SubmitResponse is not found in the empty JSON string", SubmitResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SubmitResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SubmitResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SubmitResponse.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field pspReference
      if (jsonObj.get("pspReference") != null && !jsonObj.get("pspReference").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pspReference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pspReference").toString()));
      }
      // validate the optional field refusalReason
      if (jsonObj.get("refusalReason") != null && !jsonObj.get("refusalReason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `refusalReason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("refusalReason").toString()));
      }
      // validate the optional field resultCode
      if (jsonObj.get("resultCode") != null && !jsonObj.get("resultCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `resultCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("resultCode").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SubmitResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SubmitResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SubmitResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SubmitResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<SubmitResponse>() {
           @Override
           public void write(JsonWriter out, SubmitResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SubmitResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SubmitResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SubmitResponse
  * @throws IOException if the JSON string is invalid with respect to SubmitResponse
  */
  public static SubmitResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SubmitResponse.class);
  }

 /**
  * Convert an instance of SubmitResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

