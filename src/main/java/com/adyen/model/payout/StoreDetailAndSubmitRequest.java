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
import com.adyen.model.payout.Address;
import com.adyen.model.payout.Amount;
import com.adyen.model.payout.BankAccount;
import com.adyen.model.payout.Card;
import com.adyen.model.payout.Name;
import com.adyen.model.payout.Recurring;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.Date;
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
 * StoreDetailAndSubmitRequest
 */

public class StoreDetailAndSubmitRequest {
  public static final String SERIALIZED_NAME_ADDITIONAL_DATA = "additionalData";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_DATA)
  private Map<String, String> additionalData = null;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Amount amount;

  public static final String SERIALIZED_NAME_BANK = "bank";
  @SerializedName(SERIALIZED_NAME_BANK)
  private BankAccount bank;

  public static final String SERIALIZED_NAME_BILLING_ADDRESS = "billingAddress";
  @SerializedName(SERIALIZED_NAME_BILLING_ADDRESS)
  private Address billingAddress;

  public static final String SERIALIZED_NAME_CARD = "card";
  @SerializedName(SERIALIZED_NAME_CARD)
  private Card card;

  public static final String SERIALIZED_NAME_DATE_OF_BIRTH = "dateOfBirth";
  @SerializedName(SERIALIZED_NAME_DATE_OF_BIRTH)
  private Date dateOfBirth;

  /**
   * The type of the entity the payout is processed for.
   */
  @JsonAdapter(EntityTypeEnum.Adapter.class)
  public enum EntityTypeEnum {
    NATURALPERSON("NaturalPerson"),
    
    COMPANY("Company");

    private String value;

    EntityTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EntityTypeEnum fromValue(String value) {
      for (EntityTypeEnum b : EntityTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<EntityTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EntityTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EntityTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return EntityTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ENTITY_TYPE = "entityType";
  @SerializedName(SERIALIZED_NAME_ENTITY_TYPE)
  private EntityTypeEnum entityType;

  public static final String SERIALIZED_NAME_FRAUD_OFFSET = "fraudOffset";
  @SerializedName(SERIALIZED_NAME_FRAUD_OFFSET)
  private Integer fraudOffset;

  public static final String SERIALIZED_NAME_MERCHANT_ACCOUNT = "merchantAccount";
  @SerializedName(SERIALIZED_NAME_MERCHANT_ACCOUNT)
  private String merchantAccount;

  public static final String SERIALIZED_NAME_NATIONALITY = "nationality";
  @SerializedName(SERIALIZED_NAME_NATIONALITY)
  private String nationality;

  public static final String SERIALIZED_NAME_RECURRING = "recurring";
  @SerializedName(SERIALIZED_NAME_RECURRING)
  private Recurring recurring;

  public static final String SERIALIZED_NAME_REFERENCE = "reference";
  @SerializedName(SERIALIZED_NAME_REFERENCE)
  private String reference;

  public static final String SERIALIZED_NAME_SELECTED_BRAND = "selectedBrand";
  @SerializedName(SERIALIZED_NAME_SELECTED_BRAND)
  private String selectedBrand;

  public static final String SERIALIZED_NAME_SHOPPER_EMAIL = "shopperEmail";
  @SerializedName(SERIALIZED_NAME_SHOPPER_EMAIL)
  private String shopperEmail;

  public static final String SERIALIZED_NAME_SHOPPER_NAME = "shopperName";
  @SerializedName(SERIALIZED_NAME_SHOPPER_NAME)
  private Name shopperName;

  public static final String SERIALIZED_NAME_SHOPPER_REFERENCE = "shopperReference";
  @SerializedName(SERIALIZED_NAME_SHOPPER_REFERENCE)
  private String shopperReference;

  public static final String SERIALIZED_NAME_SHOPPER_STATEMENT = "shopperStatement";
  @SerializedName(SERIALIZED_NAME_SHOPPER_STATEMENT)
  private String shopperStatement;

  public static final String SERIALIZED_NAME_SOCIAL_SECURITY_NUMBER = "socialSecurityNumber";
  @SerializedName(SERIALIZED_NAME_SOCIAL_SECURITY_NUMBER)
  private String socialSecurityNumber;

  public static final String SERIALIZED_NAME_TELEPHONE_NUMBER = "telephoneNumber";
  @SerializedName(SERIALIZED_NAME_TELEPHONE_NUMBER)
  private String telephoneNumber;

  public StoreDetailAndSubmitRequest() { 
  }

  public StoreDetailAndSubmitRequest additionalData(Map<String, String> additionalData) {
    
    this.additionalData = additionalData;
    return this;
  }

  public StoreDetailAndSubmitRequest putAdditionalDataItem(String key, String additionalDataItem) {
    if (this.additionalData == null) {
      this.additionalData = new HashMap<>();
    }
    this.additionalData.put(key, additionalDataItem);
    return this;
  }

   /**
   * This field contains additional data, which may be required for a particular request.
   * @return additionalData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This field contains additional data, which may be required for a particular request.")

  public Map<String, String> getAdditionalData() {
    return additionalData;
  }


  public void setAdditionalData(Map<String, String> additionalData) {
    this.additionalData = additionalData;
  }


  public StoreDetailAndSubmitRequest amount(Amount amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Amount getAmount() {
    return amount;
  }


  public void setAmount(Amount amount) {
    this.amount = amount;
  }


  public StoreDetailAndSubmitRequest bank(BankAccount bank) {
    
    this.bank = bank;
    return this;
  }

   /**
   * Get bank
   * @return bank
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BankAccount getBank() {
    return bank;
  }


  public void setBank(BankAccount bank) {
    this.bank = bank;
  }


  public StoreDetailAndSubmitRequest billingAddress(Address billingAddress) {
    
    this.billingAddress = billingAddress;
    return this;
  }

   /**
   * Get billingAddress
   * @return billingAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Address getBillingAddress() {
    return billingAddress;
  }


  public void setBillingAddress(Address billingAddress) {
    this.billingAddress = billingAddress;
  }


  public StoreDetailAndSubmitRequest card(Card card) {
    
    this.card = card;
    return this;
  }

   /**
   * Get card
   * @return card
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Card getCard() {
    return card;
  }


  public void setCard(Card card) {
    this.card = card;
  }


  public StoreDetailAndSubmitRequest dateOfBirth(Date dateOfBirth) {
    
    this.dateOfBirth = dateOfBirth;
    return this;
  }

   /**
   * The date of birth. Format: [ISO-8601](https://www.w3.org/TR/NOTE-datetime); example: YYYY-MM-DD For Paysafecard it must be the same as used when registering the Paysafecard account. &gt; This field is mandatory for natural persons.
   * @return dateOfBirth
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The date of birth. Format: [ISO-8601](https://www.w3.org/TR/NOTE-datetime); example: YYYY-MM-DD For Paysafecard it must be the same as used when registering the Paysafecard account. > This field is mandatory for natural persons.")

  public Date getDateOfBirth() {
    return dateOfBirth;
  }


  public void setDateOfBirth(Date dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }


  public StoreDetailAndSubmitRequest entityType(EntityTypeEnum entityType) {
    
    this.entityType = entityType;
    return this;
  }

   /**
   * The type of the entity the payout is processed for.
   * @return entityType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The type of the entity the payout is processed for.")

  public EntityTypeEnum getEntityType() {
    return entityType;
  }


  public void setEntityType(EntityTypeEnum entityType) {
    this.entityType = entityType;
  }


  public StoreDetailAndSubmitRequest fraudOffset(Integer fraudOffset) {
    
    this.fraudOffset = fraudOffset;
    return this;
  }

   /**
   * An integer value that is added to the normal fraud score. The value can be either positive or negative.
   * @return fraudOffset
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An integer value that is added to the normal fraud score. The value can be either positive or negative.")

  public Integer getFraudOffset() {
    return fraudOffset;
  }


  public void setFraudOffset(Integer fraudOffset) {
    this.fraudOffset = fraudOffset;
  }


  public StoreDetailAndSubmitRequest merchantAccount(String merchantAccount) {
    
    this.merchantAccount = merchantAccount;
    return this;
  }

   /**
   * The merchant account identifier, with which you want to process the transaction.
   * @return merchantAccount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The merchant account identifier, with which you want to process the transaction.")

  public String getMerchantAccount() {
    return merchantAccount;
  }


  public void setMerchantAccount(String merchantAccount) {
    this.merchantAccount = merchantAccount;
  }


  public StoreDetailAndSubmitRequest nationality(String nationality) {
    
    this.nationality = nationality;
    return this;
  }

   /**
   * The shopper&#39;s nationality.  A valid value is an ISO 2-character country code (e.g. &#39;NL&#39;).
   * @return nationality
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The shopper's nationality.  A valid value is an ISO 2-character country code (e.g. 'NL').")

  public String getNationality() {
    return nationality;
  }


  public void setNationality(String nationality) {
    this.nationality = nationality;
  }


  public StoreDetailAndSubmitRequest recurring(Recurring recurring) {
    
    this.recurring = recurring;
    return this;
  }

   /**
   * Get recurring
   * @return recurring
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Recurring getRecurring() {
    return recurring;
  }


  public void setRecurring(Recurring recurring) {
    this.recurring = recurring;
  }


  public StoreDetailAndSubmitRequest reference(String reference) {
    
    this.reference = reference;
    return this;
  }

   /**
   * The merchant reference for this payment. This reference will be used in all communication to the merchant about the status of the payout. Although it is a good idea to make sure it is unique, this is not a requirement.
   * @return reference
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The merchant reference for this payment. This reference will be used in all communication to the merchant about the status of the payout. Although it is a good idea to make sure it is unique, this is not a requirement.")

  public String getReference() {
    return reference;
  }


  public void setReference(String reference) {
    this.reference = reference;
  }


  public StoreDetailAndSubmitRequest selectedBrand(String selectedBrand) {
    
    this.selectedBrand = selectedBrand;
    return this;
  }

   /**
   * The name of the brand to make a payout to.  For Paysafecard it must be set to &#x60;paysafecard&#x60;.
   * @return selectedBrand
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the brand to make a payout to.  For Paysafecard it must be set to `paysafecard`.")

  public String getSelectedBrand() {
    return selectedBrand;
  }


  public void setSelectedBrand(String selectedBrand) {
    this.selectedBrand = selectedBrand;
  }


  public StoreDetailAndSubmitRequest shopperEmail(String shopperEmail) {
    
    this.shopperEmail = shopperEmail;
    return this;
  }

   /**
   * The shopper&#39;s email address.
   * @return shopperEmail
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The shopper's email address.")

  public String getShopperEmail() {
    return shopperEmail;
  }


  public void setShopperEmail(String shopperEmail) {
    this.shopperEmail = shopperEmail;
  }


  public StoreDetailAndSubmitRequest shopperName(Name shopperName) {
    
    this.shopperName = shopperName;
    return this;
  }

   /**
   * Get shopperName
   * @return shopperName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Name getShopperName() {
    return shopperName;
  }


  public void setShopperName(Name shopperName) {
    this.shopperName = shopperName;
  }


  public StoreDetailAndSubmitRequest shopperReference(String shopperReference) {
    
    this.shopperReference = shopperReference;
    return this;
  }

   /**
   * The shopper&#39;s reference for the payment transaction.
   * @return shopperReference
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The shopper's reference for the payment transaction.")

  public String getShopperReference() {
    return shopperReference;
  }


  public void setShopperReference(String shopperReference) {
    this.shopperReference = shopperReference;
  }


  public StoreDetailAndSubmitRequest shopperStatement(String shopperStatement) {
    
    this.shopperStatement = shopperStatement;
    return this;
  }

   /**
   * The description of this payout. This description is shown on the bank statement of the shopper (if this is supported by the chosen payment method).
   * @return shopperStatement
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The description of this payout. This description is shown on the bank statement of the shopper (if this is supported by the chosen payment method).")

  public String getShopperStatement() {
    return shopperStatement;
  }


  public void setShopperStatement(String shopperStatement) {
    this.shopperStatement = shopperStatement;
  }


  public StoreDetailAndSubmitRequest socialSecurityNumber(String socialSecurityNumber) {
    
    this.socialSecurityNumber = socialSecurityNumber;
    return this;
  }

   /**
   * The shopper&#39;s social security number.
   * @return socialSecurityNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The shopper's social security number.")

  public String getSocialSecurityNumber() {
    return socialSecurityNumber;
  }


  public void setSocialSecurityNumber(String socialSecurityNumber) {
    this.socialSecurityNumber = socialSecurityNumber;
  }


  public StoreDetailAndSubmitRequest telephoneNumber(String telephoneNumber) {
    
    this.telephoneNumber = telephoneNumber;
    return this;
  }

   /**
   * The shopper&#39;s phone number.
   * @return telephoneNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The shopper's phone number.")

  public String getTelephoneNumber() {
    return telephoneNumber;
  }


  public void setTelephoneNumber(String telephoneNumber) {
    this.telephoneNumber = telephoneNumber;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StoreDetailAndSubmitRequest storeDetailAndSubmitRequest = (StoreDetailAndSubmitRequest) o;
    return Objects.equals(this.additionalData, storeDetailAndSubmitRequest.additionalData) &&
        Objects.equals(this.amount, storeDetailAndSubmitRequest.amount) &&
        Objects.equals(this.bank, storeDetailAndSubmitRequest.bank) &&
        Objects.equals(this.billingAddress, storeDetailAndSubmitRequest.billingAddress) &&
        Objects.equals(this.card, storeDetailAndSubmitRequest.card) &&
        Objects.equals(this.dateOfBirth, storeDetailAndSubmitRequest.dateOfBirth) &&
        Objects.equals(this.entityType, storeDetailAndSubmitRequest.entityType) &&
        Objects.equals(this.fraudOffset, storeDetailAndSubmitRequest.fraudOffset) &&
        Objects.equals(this.merchantAccount, storeDetailAndSubmitRequest.merchantAccount) &&
        Objects.equals(this.nationality, storeDetailAndSubmitRequest.nationality) &&
        Objects.equals(this.recurring, storeDetailAndSubmitRequest.recurring) &&
        Objects.equals(this.reference, storeDetailAndSubmitRequest.reference) &&
        Objects.equals(this.selectedBrand, storeDetailAndSubmitRequest.selectedBrand) &&
        Objects.equals(this.shopperEmail, storeDetailAndSubmitRequest.shopperEmail) &&
        Objects.equals(this.shopperName, storeDetailAndSubmitRequest.shopperName) &&
        Objects.equals(this.shopperReference, storeDetailAndSubmitRequest.shopperReference) &&
        Objects.equals(this.shopperStatement, storeDetailAndSubmitRequest.shopperStatement) &&
        Objects.equals(this.socialSecurityNumber, storeDetailAndSubmitRequest.socialSecurityNumber) &&
        Objects.equals(this.telephoneNumber, storeDetailAndSubmitRequest.telephoneNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalData, amount, bank, billingAddress, card, dateOfBirth, entityType, fraudOffset, merchantAccount, nationality, recurring, reference, selectedBrand, shopperEmail, shopperName, shopperReference, shopperStatement, socialSecurityNumber, telephoneNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StoreDetailAndSubmitRequest {\n");
    sb.append("    additionalData: ").append(toIndentedString(additionalData)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    bank: ").append(toIndentedString(bank)).append("\n");
    sb.append("    billingAddress: ").append(toIndentedString(billingAddress)).append("\n");
    sb.append("    card: ").append(toIndentedString(card)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
    sb.append("    fraudOffset: ").append(toIndentedString(fraudOffset)).append("\n");
    sb.append("    merchantAccount: ").append(toIndentedString(merchantAccount)).append("\n");
    sb.append("    nationality: ").append(toIndentedString(nationality)).append("\n");
    sb.append("    recurring: ").append(toIndentedString(recurring)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    selectedBrand: ").append(toIndentedString(selectedBrand)).append("\n");
    sb.append("    shopperEmail: ").append(toIndentedString(shopperEmail)).append("\n");
    sb.append("    shopperName: ").append(toIndentedString(shopperName)).append("\n");
    sb.append("    shopperReference: ").append(toIndentedString(shopperReference)).append("\n");
    sb.append("    shopperStatement: ").append(toIndentedString(shopperStatement)).append("\n");
    sb.append("    socialSecurityNumber: ").append(toIndentedString(socialSecurityNumber)).append("\n");
    sb.append("    telephoneNumber: ").append(toIndentedString(telephoneNumber)).append("\n");
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
    openapiFields.add("amount");
    openapiFields.add("bank");
    openapiFields.add("billingAddress");
    openapiFields.add("card");
    openapiFields.add("dateOfBirth");
    openapiFields.add("entityType");
    openapiFields.add("fraudOffset");
    openapiFields.add("merchantAccount");
    openapiFields.add("nationality");
    openapiFields.add("recurring");
    openapiFields.add("reference");
    openapiFields.add("selectedBrand");
    openapiFields.add("shopperEmail");
    openapiFields.add("shopperName");
    openapiFields.add("shopperReference");
    openapiFields.add("shopperStatement");
    openapiFields.add("socialSecurityNumber");
    openapiFields.add("telephoneNumber");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("amount");
    openapiRequiredFields.add("dateOfBirth");
    openapiRequiredFields.add("entityType");
    openapiRequiredFields.add("merchantAccount");
    openapiRequiredFields.add("nationality");
    openapiRequiredFields.add("recurring");
    openapiRequiredFields.add("reference");
    openapiRequiredFields.add("shopperEmail");
    openapiRequiredFields.add("shopperReference");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to StoreDetailAndSubmitRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (StoreDetailAndSubmitRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in StoreDetailAndSubmitRequest is not found in the empty JSON string", StoreDetailAndSubmitRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!StoreDetailAndSubmitRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `StoreDetailAndSubmitRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : StoreDetailAndSubmitRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field `amount`
      if (jsonObj.getAsJsonObject("amount") != null) {
        Amount.validateJsonObject(jsonObj.getAsJsonObject("amount"));
      }
      // validate the optional field `bank`
      if (jsonObj.getAsJsonObject("bank") != null) {
        BankAccount.validateJsonObject(jsonObj.getAsJsonObject("bank"));
      }
      // validate the optional field `billingAddress`
      if (jsonObj.getAsJsonObject("billingAddress") != null) {
        Address.validateJsonObject(jsonObj.getAsJsonObject("billingAddress"));
      }
      // validate the optional field `card`
      if (jsonObj.getAsJsonObject("card") != null) {
        Card.validateJsonObject(jsonObj.getAsJsonObject("card"));
      }
      // ensure the field entityType can be parsed to an enum value
      if (jsonObj.get("entityType") != null) {
        if(!jsonObj.get("entityType").isJsonPrimitive()) {
          throw new IllegalArgumentException(String.format("Expected the field `entityType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("entityType").toString()));
        }
        EntityTypeEnum.fromValue(jsonObj.get("entityType").getAsString());
      }
      // validate the optional field merchantAccount
      if (jsonObj.get("merchantAccount") != null && !jsonObj.get("merchantAccount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchantAccount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchantAccount").toString()));
      }
      // validate the optional field nationality
      if (jsonObj.get("nationality") != null && !jsonObj.get("nationality").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nationality` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nationality").toString()));
      }
      // validate the optional field `recurring`
      if (jsonObj.getAsJsonObject("recurring") != null) {
        Recurring.validateJsonObject(jsonObj.getAsJsonObject("recurring"));
      }
      // validate the optional field reference
      if (jsonObj.get("reference") != null && !jsonObj.get("reference").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reference").toString()));
      }
      // validate the optional field selectedBrand
      if (jsonObj.get("selectedBrand") != null && !jsonObj.get("selectedBrand").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `selectedBrand` to be a primitive type in the JSON string but got `%s`", jsonObj.get("selectedBrand").toString()));
      }
      // validate the optional field shopperEmail
      if (jsonObj.get("shopperEmail") != null && !jsonObj.get("shopperEmail").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shopperEmail` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shopperEmail").toString()));
      }
      // validate the optional field `shopperName`
      if (jsonObj.getAsJsonObject("shopperName") != null) {
        Name.validateJsonObject(jsonObj.getAsJsonObject("shopperName"));
      }
      // validate the optional field shopperReference
      if (jsonObj.get("shopperReference") != null && !jsonObj.get("shopperReference").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shopperReference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shopperReference").toString()));
      }
      // validate the optional field shopperStatement
      if (jsonObj.get("shopperStatement") != null && !jsonObj.get("shopperStatement").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shopperStatement` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shopperStatement").toString()));
      }
      // validate the optional field socialSecurityNumber
      if (jsonObj.get("socialSecurityNumber") != null && !jsonObj.get("socialSecurityNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `socialSecurityNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("socialSecurityNumber").toString()));
      }
      // validate the optional field telephoneNumber
      if (jsonObj.get("telephoneNumber") != null && !jsonObj.get("telephoneNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `telephoneNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("telephoneNumber").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StoreDetailAndSubmitRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StoreDetailAndSubmitRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StoreDetailAndSubmitRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StoreDetailAndSubmitRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<StoreDetailAndSubmitRequest>() {
           @Override
           public void write(JsonWriter out, StoreDetailAndSubmitRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StoreDetailAndSubmitRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StoreDetailAndSubmitRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StoreDetailAndSubmitRequest
  * @throws IOException if the JSON string is invalid with respect to StoreDetailAndSubmitRequest
  */
  public static StoreDetailAndSubmitRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StoreDetailAndSubmitRequest.class);
  }

 /**
  * Convert an instance of StoreDetailAndSubmitRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

