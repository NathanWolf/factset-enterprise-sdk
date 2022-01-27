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


package com.factset.sdk.BondsAPIforDigitalPortals.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.BondsAPIforDigitalPortals.models.InlineResponse2004DataIssueVolumeCurrency;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.BondsAPIforDigitalPortals.JSON;


/**
 * Values and value ranges related to the issue volumes of the debt instruments.
 */
@ApiModel(description = "Values and value ranges related to the issue volumes of the debt instruments.")
@JsonPropertyOrder({
  InlineResponse2004DataIssueVolume.JSON_PROPERTY_CURRENCY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse2004DataIssueVolume implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  private java.util.List<InlineResponse2004DataIssueVolumeCurrency> currency = null;


  public InlineResponse2004DataIssueVolume currency(java.util.List<InlineResponse2004DataIssueVolumeCurrency> currency) {
    this.currency = currency;
    return this;
  }

  public InlineResponse2004DataIssueVolume addCurrencyItem(InlineResponse2004DataIssueVolumeCurrency currencyItem) {
    if (this.currency == null) {
      this.currency = new java.util.ArrayList<>();
    }
    this.currency.add(currencyItem);
    return this;
  }

   /**
   * List of main currencies of denomination of the the issue volumes. See endpoint &#x60;/basic/valueUnit/currency/main/list&#x60; for possible values.
   * @return currency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of main currencies of denomination of the the issue volumes. See endpoint `/basic/valueUnit/currency/main/list` for possible values.")
  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<InlineResponse2004DataIssueVolumeCurrency> getCurrency() {
    return currency;
  }


  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrency(java.util.List<InlineResponse2004DataIssueVolumeCurrency> currency) {
    this.currency = currency;
  }


  /**
   * Return true if this inline_response_200_4_data_issue_volume object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2004DataIssueVolume inlineResponse2004DataIssueVolume = (InlineResponse2004DataIssueVolume) o;
    return Objects.equals(this.currency, inlineResponse2004DataIssueVolume.currency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2004DataIssueVolume {\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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

