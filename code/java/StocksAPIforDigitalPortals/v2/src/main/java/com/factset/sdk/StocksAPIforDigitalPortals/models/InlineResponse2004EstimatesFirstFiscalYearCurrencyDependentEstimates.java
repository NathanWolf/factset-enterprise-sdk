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


package com.factset.sdk.StocksAPIforDigitalPortals.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimatesCurrency;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimatesEbit;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimatesEbitda;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimatesPerShare;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.StocksAPIforDigitalPortals.JSON;


/**
 * Currency-dependent estimates. If no currency has been selected (see parameter &#x60;estimates.currencyDependentEstimates.currency.isoCode&#x60;) the currency in which the analysts report is used.
 */
@ApiModel(description = "Currency-dependent estimates. If no currency has been selected (see parameter `estimates.currencyDependentEstimates.currency.isoCode`) the currency in which the analysts report is used.")
@JsonPropertyOrder({
  InlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimates.JSON_PROPERTY_CURRENCY,
  InlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimates.JSON_PROPERTY_EBIT,
  InlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimates.JSON_PROPERTY_EBITDA,
  InlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimates.JSON_PROPERTY_PER_SHARE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimates implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  private InlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimatesCurrency currency;

  public static final String JSON_PROPERTY_EBIT = "ebit";
  private InlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimatesEbit ebit;

  public static final String JSON_PROPERTY_EBITDA = "ebitda";
  private InlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimatesEbitda ebitda;

  public static final String JSON_PROPERTY_PER_SHARE = "perShare";
  private InlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimatesPerShare perShare;

  public InlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimates() { 
  }

  public InlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimates currency(InlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimatesCurrency currency) {
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

  public InlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimatesCurrency getCurrency() {
    return currency;
  }


  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrency(InlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimatesCurrency currency) {
    this.currency = currency;
  }


  public InlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimates ebit(InlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimatesEbit ebit) {
    this.ebit = ebit;
    return this;
  }

   /**
   * Get ebit
   * @return ebit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EBIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimatesEbit getEbit() {
    return ebit;
  }


  @JsonProperty(JSON_PROPERTY_EBIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEbit(InlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimatesEbit ebit) {
    this.ebit = ebit;
  }


  public InlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimates ebitda(InlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimatesEbitda ebitda) {
    this.ebitda = ebitda;
    return this;
  }

   /**
   * Get ebitda
   * @return ebitda
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EBITDA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimatesEbitda getEbitda() {
    return ebitda;
  }


  @JsonProperty(JSON_PROPERTY_EBITDA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEbitda(InlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimatesEbitda ebitda) {
    this.ebitda = ebitda;
  }


  public InlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimates perShare(InlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimatesPerShare perShare) {
    this.perShare = perShare;
    return this;
  }

   /**
   * Get perShare
   * @return perShare
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PER_SHARE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimatesPerShare getPerShare() {
    return perShare;
  }


  @JsonProperty(JSON_PROPERTY_PER_SHARE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPerShare(InlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimatesPerShare perShare) {
    this.perShare = perShare;
  }


  /**
   * Return true if this inline_response_200_4_estimates_firstFiscalYear_currencyDependentEstimates object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimates inlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimates = (InlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimates) o;
    return Objects.equals(this.currency, inlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimates.currency) &&
        Objects.equals(this.ebit, inlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimates.ebit) &&
        Objects.equals(this.ebitda, inlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimates.ebitda) &&
        Objects.equals(this.perShare, inlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimates.perShare);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currency, ebit, ebitda, perShare);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimates {\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    ebit: ").append(toIndentedString(ebit)).append("\n");
    sb.append("    ebitda: ").append(toIndentedString(ebitda)).append("\n");
    sb.append("    perShare: ").append(toIndentedString(perShare)).append("\n");
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

