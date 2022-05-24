/*
 * FactSet Terms & Conditions API
 * The FactSet Terms & Conditions API exposes Terms & Conditions data for Fixed Income Corporate, Governement & Agency securities. The FactSet Corporate Government & Agency Terms & Conditions library provides descriptive data on the issue level, such as offering details, redemption information, and coupon schedules. Issuer level data is also available. Coverage is global and includes corporate, sovereign, and agency issues. 
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.FactSetTermsandConditions.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.FactSetTermsandConditions.JSON;


/**
 * TermsAndConditionsRequest
 */
@JsonPropertyOrder({
  TermsAndConditionsRequest.JSON_PROPERTY_IDS,
  TermsAndConditionsRequest.JSON_PROPERTY_FIELDS,
  TermsAndConditionsRequest.JSON_PROPERTY_CATEGORIES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TermsAndConditionsRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_IDS = "ids";
  private java.util.List<String> ids = new java.util.ArrayList<>();

  public static final String JSON_PROPERTY_FIELDS = "fields";
  private java.util.List<String> fields = null;

  /**
   * Gets or Sets categories
   */
  public enum CategoriesEnum {
    SECURITY_DETAILS("SECURITY_DETAILS"),
    
    COUPON_DETAILS("COUPON_DETAILS"),
    
    CONVERTIBLE_FEATURES("CONVERTIBLE_FEATURES"),
    
    REDEMPTION_OPTIONS("REDEMPTION_OPTIONS");

    private String value;

    CategoriesEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CategoriesEnum fromValue(String value) {
      for (CategoriesEnum b : CategoriesEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_CATEGORIES = "categories";
  private java.util.List<CategoriesEnum> categories = null;

  public TermsAndConditionsRequest() { 
  }

  @JsonCreator
  public TermsAndConditionsRequest(
    @JsonProperty(value=JSON_PROPERTY_IDS, required=true) java.util.List<String> ids
  ) {
    this();
    this.ids = ids;
  }

  public TermsAndConditionsRequest ids(java.util.List<String> ids) {
    this.ids = ids;
    return this;
  }

  public TermsAndConditionsRequest addIdsItem(String idsItem) {
    this.ids.add(idsItem);
    return this;
  }

   /**
   * List of Fixed Income Security identifiers. Supported symbol types include CUSIP, SEDOL, ISIN, and FactSet Security Permanent Identifier (-S).  **ID LIMIT &#x3D; 250** *per request*. 
   * @return ids
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "List of Fixed Income Security identifiers. Supported symbol types include CUSIP, SEDOL, ISIN, and FactSet Security Permanent Identifier (-S).  **ID LIMIT = 250** *per request*. ")
  @JsonProperty(JSON_PROPERTY_IDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public java.util.List<String> getIds() {
    return ids;
  }


  @JsonProperty(JSON_PROPERTY_IDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIds(java.util.List<String> ids) {
    this.ids = ids;
  }


  public TermsAndConditionsRequest fields(java.util.List<String> fields) {
    this.fields = fields;
    return this;
  }

  public TermsAndConditionsRequest addFieldsItem(String fieldsItem) {
    if (this.fields == null) {
      this.fields = new java.util.ArrayList<>();
    }
    this.fields.add(fieldsItem);
    return this;
  }

   /**
   * List of Terms and Conditions data items.
   * @return fields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of Terms and Conditions data items.")
  @JsonProperty(JSON_PROPERTY_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<String> getFields() {
    return fields;
  }


  @JsonProperty(JSON_PROPERTY_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFields(java.util.List<String> fields) {
    this.fields = fields;
  }


  public TermsAndConditionsRequest categories(java.util.List<CategoriesEnum> categories) {
    this.categories = categories;
    return this;
  }

  public TermsAndConditionsRequest addCategoriesItem(CategoriesEnum categoriesItem) {
    if (this.categories == null) {
      this.categories = new java.util.ArrayList<>();
    }
    this.categories.add(categoriesItem);
    return this;
  }

   /**
   * Selects the Fixed Income metrics by major category - * **SECURITY_DETAILS** &#x3D; Detailed information about the security. * **COUPON_DETAILS** &#x3D; Coupon details. * **CONVERTIBLE_FEATURES** &#x3D; Features of convertible instruments. * **REDEMPTION_OPTIONS** &#x3D; Redemption options. 
   * @return categories
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Selects the Fixed Income metrics by major category - * **SECURITY_DETAILS** = Detailed information about the security. * **COUPON_DETAILS** = Coupon details. * **CONVERTIBLE_FEATURES** = Features of convertible instruments. * **REDEMPTION_OPTIONS** = Redemption options. ")
  @JsonProperty(JSON_PROPERTY_CATEGORIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<CategoriesEnum> getCategories() {
    return categories;
  }


  @JsonProperty(JSON_PROPERTY_CATEGORIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCategories(java.util.List<CategoriesEnum> categories) {
    this.categories = categories;
  }


  /**
   * Return true if this termsAndConditionsRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TermsAndConditionsRequest termsAndConditionsRequest = (TermsAndConditionsRequest) o;
    return Objects.equals(this.ids, termsAndConditionsRequest.ids) &&
        Objects.equals(this.fields, termsAndConditionsRequest.fields) &&
        Objects.equals(this.categories, termsAndConditionsRequest.categories);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ids, fields, categories);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TermsAndConditionsRequest {\n");
    sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
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

}

