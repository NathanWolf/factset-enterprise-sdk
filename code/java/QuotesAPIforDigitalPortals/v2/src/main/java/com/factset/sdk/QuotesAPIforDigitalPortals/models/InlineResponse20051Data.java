/*
 * Prime Developer Trial
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.QuotesAPIforDigitalPortals.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20051DataCoupons;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20051DataCurrency;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.QuotesAPIforDigitalPortals.JSON;


/**
 * List of coupons and currency details.
 */
@ApiModel(description = "List of coupons and currency details.")
@JsonPropertyOrder({
  InlineResponse20051Data.JSON_PROPERTY_CURRENCY,
  InlineResponse20051Data.JSON_PROPERTY_COUPONS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse20051Data implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  private InlineResponse20051DataCurrency currency;

  public static final String JSON_PROPERTY_COUPONS = "coupons";
  private java.util.List<InlineResponse20051DataCoupons> coupons = null;


  public InlineResponse20051Data currency(InlineResponse20051DataCurrency currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse20051DataCurrency getCurrency() {
    return currency;
  }


  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrency(InlineResponse20051DataCurrency currency) {
    this.currency = currency;
  }


  public InlineResponse20051Data coupons(java.util.List<InlineResponse20051DataCoupons> coupons) {
    this.coupons = coupons;
    return this;
  }

  public InlineResponse20051Data addCouponsItem(InlineResponse20051DataCoupons couponsItem) {
    if (this.coupons == null) {
      this.coupons = new java.util.ArrayList<>();
    }
    this.coupons.add(couponsItem);
    return this;
  }

   /**
   * List of coupons in chronological order.
   * @return coupons
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of coupons in chronological order.")
  @JsonProperty(JSON_PROPERTY_COUPONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<InlineResponse20051DataCoupons> getCoupons() {
    return coupons;
  }


  @JsonProperty(JSON_PROPERTY_COUPONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCoupons(java.util.List<InlineResponse20051DataCoupons> coupons) {
    this.coupons = coupons;
  }


  /**
   * Return true if this inline_response_200_51_data object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20051Data inlineResponse20051Data = (InlineResponse20051Data) o;
    return Objects.equals(this.currency, inlineResponse20051Data.currency) &&
        Objects.equals(this.coupons, inlineResponse20051Data.coupons);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currency, coupons);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20051Data {\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    coupons: ").append(toIndentedString(coupons)).append("\n");
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

