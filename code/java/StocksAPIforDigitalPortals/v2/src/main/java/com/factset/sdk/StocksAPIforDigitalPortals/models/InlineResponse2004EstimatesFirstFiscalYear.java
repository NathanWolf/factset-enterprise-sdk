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
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimates;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse2004EstimatesFirstFiscalYearFiscalYear;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse2004EstimatesFirstFiscalYearRatios;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse2004EstimatesFirstFiscalYearReturnOnAssets;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse2004EstimatesFirstFiscalYearReturnOnEquity;
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
 * Estimates for the closest fiscal year that has been requested. If the parameters used in the request refer to data from only one fiscal year, the respective data is found here.
 */
@ApiModel(description = "Estimates for the closest fiscal year that has been requested. If the parameters used in the request refer to data from only one fiscal year, the respective data is found here.")
@JsonPropertyOrder({
  InlineResponse2004EstimatesFirstFiscalYear.JSON_PROPERTY_FISCAL_YEAR,
  InlineResponse2004EstimatesFirstFiscalYear.JSON_PROPERTY_CURRENCY_DEPENDENT_ESTIMATES,
  InlineResponse2004EstimatesFirstFiscalYear.JSON_PROPERTY_RETURN_ON_ASSETS,
  InlineResponse2004EstimatesFirstFiscalYear.JSON_PROPERTY_RETURN_ON_EQUITY,
  InlineResponse2004EstimatesFirstFiscalYear.JSON_PROPERTY_RATIOS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse2004EstimatesFirstFiscalYear implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_FISCAL_YEAR = "fiscalYear";
  private InlineResponse2004EstimatesFirstFiscalYearFiscalYear fiscalYear;

  public static final String JSON_PROPERTY_CURRENCY_DEPENDENT_ESTIMATES = "currencyDependentEstimates";
  private InlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimates currencyDependentEstimates;

  public static final String JSON_PROPERTY_RETURN_ON_ASSETS = "returnOnAssets";
  private InlineResponse2004EstimatesFirstFiscalYearReturnOnAssets returnOnAssets;

  public static final String JSON_PROPERTY_RETURN_ON_EQUITY = "returnOnEquity";
  private InlineResponse2004EstimatesFirstFiscalYearReturnOnEquity returnOnEquity;

  public static final String JSON_PROPERTY_RATIOS = "ratios";
  private InlineResponse2004EstimatesFirstFiscalYearRatios ratios;

  public InlineResponse2004EstimatesFirstFiscalYear() { 
  }

  public InlineResponse2004EstimatesFirstFiscalYear fiscalYear(InlineResponse2004EstimatesFirstFiscalYearFiscalYear fiscalYear) {
    this.fiscalYear = fiscalYear;
    return this;
  }

   /**
   * Get fiscalYear
   * @return fiscalYear
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FISCAL_YEAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2004EstimatesFirstFiscalYearFiscalYear getFiscalYear() {
    return fiscalYear;
  }


  @JsonProperty(JSON_PROPERTY_FISCAL_YEAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFiscalYear(InlineResponse2004EstimatesFirstFiscalYearFiscalYear fiscalYear) {
    this.fiscalYear = fiscalYear;
  }


  public InlineResponse2004EstimatesFirstFiscalYear currencyDependentEstimates(InlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimates currencyDependentEstimates) {
    this.currencyDependentEstimates = currencyDependentEstimates;
    return this;
  }

   /**
   * Get currencyDependentEstimates
   * @return currencyDependentEstimates
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CURRENCY_DEPENDENT_ESTIMATES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimates getCurrencyDependentEstimates() {
    return currencyDependentEstimates;
  }


  @JsonProperty(JSON_PROPERTY_CURRENCY_DEPENDENT_ESTIMATES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrencyDependentEstimates(InlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimates currencyDependentEstimates) {
    this.currencyDependentEstimates = currencyDependentEstimates;
  }


  public InlineResponse2004EstimatesFirstFiscalYear returnOnAssets(InlineResponse2004EstimatesFirstFiscalYearReturnOnAssets returnOnAssets) {
    this.returnOnAssets = returnOnAssets;
    return this;
  }

   /**
   * Get returnOnAssets
   * @return returnOnAssets
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RETURN_ON_ASSETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2004EstimatesFirstFiscalYearReturnOnAssets getReturnOnAssets() {
    return returnOnAssets;
  }


  @JsonProperty(JSON_PROPERTY_RETURN_ON_ASSETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReturnOnAssets(InlineResponse2004EstimatesFirstFiscalYearReturnOnAssets returnOnAssets) {
    this.returnOnAssets = returnOnAssets;
  }


  public InlineResponse2004EstimatesFirstFiscalYear returnOnEquity(InlineResponse2004EstimatesFirstFiscalYearReturnOnEquity returnOnEquity) {
    this.returnOnEquity = returnOnEquity;
    return this;
  }

   /**
   * Get returnOnEquity
   * @return returnOnEquity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RETURN_ON_EQUITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2004EstimatesFirstFiscalYearReturnOnEquity getReturnOnEquity() {
    return returnOnEquity;
  }


  @JsonProperty(JSON_PROPERTY_RETURN_ON_EQUITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReturnOnEquity(InlineResponse2004EstimatesFirstFiscalYearReturnOnEquity returnOnEquity) {
    this.returnOnEquity = returnOnEquity;
  }


  public InlineResponse2004EstimatesFirstFiscalYear ratios(InlineResponse2004EstimatesFirstFiscalYearRatios ratios) {
    this.ratios = ratios;
    return this;
  }

   /**
   * Get ratios
   * @return ratios
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RATIOS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2004EstimatesFirstFiscalYearRatios getRatios() {
    return ratios;
  }


  @JsonProperty(JSON_PROPERTY_RATIOS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRatios(InlineResponse2004EstimatesFirstFiscalYearRatios ratios) {
    this.ratios = ratios;
  }


  /**
   * Return true if this inline_response_200_4_estimates_firstFiscalYear object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2004EstimatesFirstFiscalYear inlineResponse2004EstimatesFirstFiscalYear = (InlineResponse2004EstimatesFirstFiscalYear) o;
    return Objects.equals(this.fiscalYear, inlineResponse2004EstimatesFirstFiscalYear.fiscalYear) &&
        Objects.equals(this.currencyDependentEstimates, inlineResponse2004EstimatesFirstFiscalYear.currencyDependentEstimates) &&
        Objects.equals(this.returnOnAssets, inlineResponse2004EstimatesFirstFiscalYear.returnOnAssets) &&
        Objects.equals(this.returnOnEquity, inlineResponse2004EstimatesFirstFiscalYear.returnOnEquity) &&
        Objects.equals(this.ratios, inlineResponse2004EstimatesFirstFiscalYear.ratios);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fiscalYear, currencyDependentEstimates, returnOnAssets, returnOnEquity, ratios);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2004EstimatesFirstFiscalYear {\n");
    sb.append("    fiscalYear: ").append(toIndentedString(fiscalYear)).append("\n");
    sb.append("    currencyDependentEstimates: ").append(toIndentedString(currencyDependentEstimates)).append("\n");
    sb.append("    returnOnAssets: ").append(toIndentedString(returnOnAssets)).append("\n");
    sb.append("    returnOnEquity: ").append(toIndentedString(returnOnEquity)).append("\n");
    sb.append("    ratios: ").append(toIndentedString(ratios)).append("\n");
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

