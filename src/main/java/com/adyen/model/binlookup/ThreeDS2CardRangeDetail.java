/*
 * Adyen BinLookup API
 *
 * The version of the OpenAPI document: 52
 * Contact: developer-experience@adyen.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.adyen.model.binlookup;

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
import java.util.ArrayList;
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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.adyen.model.binlookup.JSON;

/**
 * ThreeDS2CardRangeDetail
 */

public class ThreeDS2CardRangeDetail {
  public static final String SERIALIZED_NAME_ACS_INFO_IND = "acsInfoInd";
  @SerializedName(SERIALIZED_NAME_ACS_INFO_IND)
  private List<String> acsInfoInd = null;

  public static final String SERIALIZED_NAME_BRAND_CODE = "brandCode";
  @SerializedName(SERIALIZED_NAME_BRAND_CODE)
  private String brandCode;

  public static final String SERIALIZED_NAME_END_RANGE = "endRange";
  @SerializedName(SERIALIZED_NAME_END_RANGE)
  private String endRange;

  public static final String SERIALIZED_NAME_START_RANGE = "startRange";
  @SerializedName(SERIALIZED_NAME_START_RANGE)
  private String startRange;

  public static final String SERIALIZED_NAME_THREE_D_S2_VERSION = "threeDS2Version";
  @SerializedName(SERIALIZED_NAME_THREE_D_S2_VERSION)
  private String threeDS2Version;

  public static final String SERIALIZED_NAME_THREE_D_S_METHOD_U_R_L = "threeDSMethodURL";
  @SerializedName(SERIALIZED_NAME_THREE_D_S_METHOD_U_R_L)
  private String threeDSMethodURL;

  public ThreeDS2CardRangeDetail() { 
  }

  public ThreeDS2CardRangeDetail acsInfoInd(List<String> acsInfoInd) {
    
    this.acsInfoInd = acsInfoInd;
    return this;
  }

  public ThreeDS2CardRangeDetail addAcsInfoIndItem(String acsInfoIndItem) {
    if (this.acsInfoInd == null) {
      this.acsInfoInd = new ArrayList<>();
    }
    this.acsInfoInd.add(acsInfoIndItem);
    return this;
  }

   /**
   * Provides additional information to the 3DS Server. Possible values: - 01 (Authentication is available at ACS) - 02 (Attempts supported by ACS or DS) - 03 (Decoupled authentication supported) - 04 (Whitelisting supported)
   * @return acsInfoInd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Provides additional information to the 3DS Server. Possible values: - 01 (Authentication is available at ACS) - 02 (Attempts supported by ACS or DS) - 03 (Decoupled authentication supported) - 04 (Whitelisting supported)")

  public List<String> getAcsInfoInd() {
    return acsInfoInd;
  }


  public void setAcsInfoInd(List<String> acsInfoInd) {
    this.acsInfoInd = acsInfoInd;
  }


  public ThreeDS2CardRangeDetail brandCode(String brandCode) {
    
    this.brandCode = brandCode;
    return this;
  }

   /**
   * Card brand.
   * @return brandCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Card brand.")

  public String getBrandCode() {
    return brandCode;
  }


  public void setBrandCode(String brandCode) {
    this.brandCode = brandCode;
  }


  public ThreeDS2CardRangeDetail endRange(String endRange) {
    
    this.endRange = endRange;
    return this;
  }

   /**
   * BIN end range.
   * @return endRange
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "BIN end range.")

  public String getEndRange() {
    return endRange;
  }


  public void setEndRange(String endRange) {
    this.endRange = endRange;
  }


  public ThreeDS2CardRangeDetail startRange(String startRange) {
    
    this.startRange = startRange;
    return this;
  }

   /**
   * BIN start range.
   * @return startRange
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "BIN start range.")

  public String getStartRange() {
    return startRange;
  }


  public void setStartRange(String startRange) {
    this.startRange = startRange;
  }


  public ThreeDS2CardRangeDetail threeDS2Version(String threeDS2Version) {
    
    this.threeDS2Version = threeDS2Version;
    return this;
  }

   /**
   * 3D Secure protocol version.
   * @return threeDS2Version
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "3D Secure protocol version.")

  public String getThreeDS2Version() {
    return threeDS2Version;
  }


  public void setThreeDS2Version(String threeDS2Version) {
    this.threeDS2Version = threeDS2Version;
  }


  public ThreeDS2CardRangeDetail threeDSMethodURL(String threeDSMethodURL) {
    
    this.threeDSMethodURL = threeDSMethodURL;
    return this;
  }

   /**
   * In a 3D Secure 2 browser-based flow, this is the URL where you should send the device fingerprint to.
   * @return threeDSMethodURL
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "In a 3D Secure 2 browser-based flow, this is the URL where you should send the device fingerprint to.")

  public String getThreeDSMethodURL() {
    return threeDSMethodURL;
  }


  public void setThreeDSMethodURL(String threeDSMethodURL) {
    this.threeDSMethodURL = threeDSMethodURL;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ThreeDS2CardRangeDetail threeDS2CardRangeDetail = (ThreeDS2CardRangeDetail) o;
    return Objects.equals(this.acsInfoInd, threeDS2CardRangeDetail.acsInfoInd) &&
        Objects.equals(this.brandCode, threeDS2CardRangeDetail.brandCode) &&
        Objects.equals(this.endRange, threeDS2CardRangeDetail.endRange) &&
        Objects.equals(this.startRange, threeDS2CardRangeDetail.startRange) &&
        Objects.equals(this.threeDS2Version, threeDS2CardRangeDetail.threeDS2Version) &&
        Objects.equals(this.threeDSMethodURL, threeDS2CardRangeDetail.threeDSMethodURL);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acsInfoInd, brandCode, endRange, startRange, threeDS2Version, threeDSMethodURL);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ThreeDS2CardRangeDetail {\n");
    sb.append("    acsInfoInd: ").append(toIndentedString(acsInfoInd)).append("\n");
    sb.append("    brandCode: ").append(toIndentedString(brandCode)).append("\n");
    sb.append("    endRange: ").append(toIndentedString(endRange)).append("\n");
    sb.append("    startRange: ").append(toIndentedString(startRange)).append("\n");
    sb.append("    threeDS2Version: ").append(toIndentedString(threeDS2Version)).append("\n");
    sb.append("    threeDSMethodURL: ").append(toIndentedString(threeDSMethodURL)).append("\n");
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
    openapiFields.add("acsInfoInd");
    openapiFields.add("brandCode");
    openapiFields.add("endRange");
    openapiFields.add("startRange");
    openapiFields.add("threeDS2Version");
    openapiFields.add("threeDSMethodURL");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ThreeDS2CardRangeDetail
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ThreeDS2CardRangeDetail.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ThreeDS2CardRangeDetail is not found in the empty JSON string", ThreeDS2CardRangeDetail.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ThreeDS2CardRangeDetail.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ThreeDS2CardRangeDetail` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (jsonObj.get("acsInfoInd") != null && !jsonObj.get("acsInfoInd").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `acsInfoInd` to be an array in the JSON string but got `%s`", jsonObj.get("acsInfoInd").toString()));
      }
      // validate the optional field brandCode
      if (jsonObj.get("brandCode") != null && !jsonObj.get("brandCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `brandCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("brandCode").toString()));
      }
      // validate the optional field endRange
      if (jsonObj.get("endRange") != null && !jsonObj.get("endRange").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `endRange` to be a primitive type in the JSON string but got `%s`", jsonObj.get("endRange").toString()));
      }
      // validate the optional field startRange
      if (jsonObj.get("startRange") != null && !jsonObj.get("startRange").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `startRange` to be a primitive type in the JSON string but got `%s`", jsonObj.get("startRange").toString()));
      }
      // validate the optional field threeDS2Version
      if (jsonObj.get("threeDS2Version") != null && !jsonObj.get("threeDS2Version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `threeDS2Version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("threeDS2Version").toString()));
      }
      // validate the optional field threeDSMethodURL
      if (jsonObj.get("threeDSMethodURL") != null && !jsonObj.get("threeDSMethodURL").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `threeDSMethodURL` to be a primitive type in the JSON string but got `%s`", jsonObj.get("threeDSMethodURL").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ThreeDS2CardRangeDetail.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ThreeDS2CardRangeDetail' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ThreeDS2CardRangeDetail> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ThreeDS2CardRangeDetail.class));

       return (TypeAdapter<T>) new TypeAdapter<ThreeDS2CardRangeDetail>() {
           @Override
           public void write(JsonWriter out, ThreeDS2CardRangeDetail value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ThreeDS2CardRangeDetail read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ThreeDS2CardRangeDetail given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ThreeDS2CardRangeDetail
  * @throws IOException if the JSON string is invalid with respect to ThreeDS2CardRangeDetail
  */
  public static ThreeDS2CardRangeDetail fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ThreeDS2CardRangeDetail.class);
  }

 /**
  * Convert an instance of ThreeDS2CardRangeDetail to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

