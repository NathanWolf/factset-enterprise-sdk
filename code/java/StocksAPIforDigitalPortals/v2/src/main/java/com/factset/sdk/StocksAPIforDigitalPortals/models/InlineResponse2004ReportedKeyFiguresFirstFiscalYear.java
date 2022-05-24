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
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse2004ReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFigures;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse2004ReportedKeyFiguresFirstFiscalYearFiscalYear;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse2004ReportedKeyFiguresFirstFiscalYearRatios;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.StocksAPIforDigitalPortals.JSON;


/**
 * Data of the most recent fiscal year that has been requested. If the parameters used in the request refer to data from only one fiscal year, the respective data is found here.
 */
@ApiModel(description = "Data of the most recent fiscal year that has been requested. If the parameters used in the request refer to data from only one fiscal year, the respective data is found here.")
@JsonPropertyOrder({
  InlineResponse2004ReportedKeyFiguresFirstFiscalYear.JSON_PROPERTY_FISCAL_YEAR,
  InlineResponse2004ReportedKeyFiguresFirstFiscalYear.JSON_PROPERTY_CURRENCY_DEPENDENT_KEY_FIGURES,
  InlineResponse2004ReportedKeyFiguresFirstFiscalYear.JSON_PROPERTY_EBIT_MARGIN,
  InlineResponse2004ReportedKeyFiguresFirstFiscalYear.JSON_PROPERTY_EBITDA_MARGIN,
  InlineResponse2004ReportedKeyFiguresFirstFiscalYear.JSON_PROPERTY_NET_INCOME_MARGIN,
  InlineResponse2004ReportedKeyFiguresFirstFiscalYear.JSON_PROPERTY_GROSS_INCOME_MARGIN,
  InlineResponse2004ReportedKeyFiguresFirstFiscalYear.JSON_PROPERTY_OPERATING_MARGIN,
  InlineResponse2004ReportedKeyFiguresFirstFiscalYear.JSON_PROPERTY_RETURN_ON_ASSETS,
  InlineResponse2004ReportedKeyFiguresFirstFiscalYear.JSON_PROPERTY_RETURN_ON_EQUITY,
  InlineResponse2004ReportedKeyFiguresFirstFiscalYear.JSON_PROPERTY_RATIOS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse2004ReportedKeyFiguresFirstFiscalYear implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_FISCAL_YEAR = "fiscalYear";
  private InlineResponse2004ReportedKeyFiguresFirstFiscalYearFiscalYear fiscalYear;

  public static final String JSON_PROPERTY_CURRENCY_DEPENDENT_KEY_FIGURES = "currencyDependentKeyFigures";
  private InlineResponse2004ReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFigures currencyDependentKeyFigures;

  public static final String JSON_PROPERTY_EBIT_MARGIN = "ebitMargin";
  private BigDecimal ebitMargin;

  public static final String JSON_PROPERTY_EBITDA_MARGIN = "ebitdaMargin";
  private BigDecimal ebitdaMargin;

  public static final String JSON_PROPERTY_NET_INCOME_MARGIN = "netIncomeMargin";
  private BigDecimal netIncomeMargin;

  public static final String JSON_PROPERTY_GROSS_INCOME_MARGIN = "grossIncomeMargin";
  private BigDecimal grossIncomeMargin;

  public static final String JSON_PROPERTY_OPERATING_MARGIN = "operatingMargin";
  private BigDecimal operatingMargin;

  public static final String JSON_PROPERTY_RETURN_ON_ASSETS = "returnOnAssets";
  private BigDecimal returnOnAssets;

  public static final String JSON_PROPERTY_RETURN_ON_EQUITY = "returnOnEquity";
  private BigDecimal returnOnEquity;

  public static final String JSON_PROPERTY_RATIOS = "ratios";
  private InlineResponse2004ReportedKeyFiguresFirstFiscalYearRatios ratios;

  public InlineResponse2004ReportedKeyFiguresFirstFiscalYear() { 
  }

  public InlineResponse2004ReportedKeyFiguresFirstFiscalYear fiscalYear(InlineResponse2004ReportedKeyFiguresFirstFiscalYearFiscalYear fiscalYear) {
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

  public InlineResponse2004ReportedKeyFiguresFirstFiscalYearFiscalYear getFiscalYear() {
    return fiscalYear;
  }


  @JsonProperty(JSON_PROPERTY_FISCAL_YEAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFiscalYear(InlineResponse2004ReportedKeyFiguresFirstFiscalYearFiscalYear fiscalYear) {
    this.fiscalYear = fiscalYear;
  }


  public InlineResponse2004ReportedKeyFiguresFirstFiscalYear currencyDependentKeyFigures(InlineResponse2004ReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFigures currencyDependentKeyFigures) {
    this.currencyDependentKeyFigures = currencyDependentKeyFigures;
    return this;
  }

   /**
   * Get currencyDependentKeyFigures
   * @return currencyDependentKeyFigures
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CURRENCY_DEPENDENT_KEY_FIGURES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2004ReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFigures getCurrencyDependentKeyFigures() {
    return currencyDependentKeyFigures;
  }


  @JsonProperty(JSON_PROPERTY_CURRENCY_DEPENDENT_KEY_FIGURES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrencyDependentKeyFigures(InlineResponse2004ReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFigures currencyDependentKeyFigures) {
    this.currencyDependentKeyFigures = currencyDependentKeyFigures;
  }


  public InlineResponse2004ReportedKeyFiguresFirstFiscalYear ebitMargin(BigDecimal ebitMargin) {
    this.ebitMargin = ebitMargin;
    return this;
  }

   /**
   * EBIT margin, which is the ratio of the EBIT, divided by the total sales revenue.
   * @return ebitMargin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "EBIT margin, which is the ratio of the EBIT, divided by the total sales revenue.")
  @JsonProperty(JSON_PROPERTY_EBIT_MARGIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getEbitMargin() {
    return ebitMargin;
  }


  @JsonProperty(JSON_PROPERTY_EBIT_MARGIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEbitMargin(BigDecimal ebitMargin) {
    this.ebitMargin = ebitMargin;
  }


  public InlineResponse2004ReportedKeyFiguresFirstFiscalYear ebitdaMargin(BigDecimal ebitdaMargin) {
    this.ebitdaMargin = ebitdaMargin;
    return this;
  }

   /**
   * EBITDA margin, which is the ratio of the EBITDA, divided by the total sales revenue.
   * @return ebitdaMargin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "EBITDA margin, which is the ratio of the EBITDA, divided by the total sales revenue.")
  @JsonProperty(JSON_PROPERTY_EBITDA_MARGIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getEbitdaMargin() {
    return ebitdaMargin;
  }


  @JsonProperty(JSON_PROPERTY_EBITDA_MARGIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEbitdaMargin(BigDecimal ebitdaMargin) {
    this.ebitdaMargin = ebitdaMargin;
  }


  public InlineResponse2004ReportedKeyFiguresFirstFiscalYear netIncomeMargin(BigDecimal netIncomeMargin) {
    this.netIncomeMargin = netIncomeMargin;
    return this;
  }

   /**
   * Net income margin, which is the ratio of the net income, divided by the total sales revenue.
   * @return netIncomeMargin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Net income margin, which is the ratio of the net income, divided by the total sales revenue.")
  @JsonProperty(JSON_PROPERTY_NET_INCOME_MARGIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getNetIncomeMargin() {
    return netIncomeMargin;
  }


  @JsonProperty(JSON_PROPERTY_NET_INCOME_MARGIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNetIncomeMargin(BigDecimal netIncomeMargin) {
    this.netIncomeMargin = netIncomeMargin;
  }


  public InlineResponse2004ReportedKeyFiguresFirstFiscalYear grossIncomeMargin(BigDecimal grossIncomeMargin) {
    this.grossIncomeMargin = grossIncomeMargin;
    return this;
  }

   /**
   * Gross income margin, which is the ratio of the gross income, divided by the total sales revenue.
   * @return grossIncomeMargin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Gross income margin, which is the ratio of the gross income, divided by the total sales revenue.")
  @JsonProperty(JSON_PROPERTY_GROSS_INCOME_MARGIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getGrossIncomeMargin() {
    return grossIncomeMargin;
  }


  @JsonProperty(JSON_PROPERTY_GROSS_INCOME_MARGIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGrossIncomeMargin(BigDecimal grossIncomeMargin) {
    this.grossIncomeMargin = grossIncomeMargin;
  }


  public InlineResponse2004ReportedKeyFiguresFirstFiscalYear operatingMargin(BigDecimal operatingMargin) {
    this.operatingMargin = operatingMargin;
    return this;
  }

   /**
   * Operating margin, which is the ratio of the operating income, divided by the sales revenue.
   * @return operatingMargin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Operating margin, which is the ratio of the operating income, divided by the sales revenue.")
  @JsonProperty(JSON_PROPERTY_OPERATING_MARGIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getOperatingMargin() {
    return operatingMargin;
  }


  @JsonProperty(JSON_PROPERTY_OPERATING_MARGIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOperatingMargin(BigDecimal operatingMargin) {
    this.operatingMargin = operatingMargin;
  }


  public InlineResponse2004ReportedKeyFiguresFirstFiscalYear returnOnAssets(BigDecimal returnOnAssets) {
    this.returnOnAssets = returnOnAssets;
    return this;
  }

   /**
   * Return on assets (ROA), which is the ratio of the net income, divided by the two-fiscal-year average of the total assets.
   * @return returnOnAssets
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Return on assets (ROA), which is the ratio of the net income, divided by the two-fiscal-year average of the total assets.")
  @JsonProperty(JSON_PROPERTY_RETURN_ON_ASSETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getReturnOnAssets() {
    return returnOnAssets;
  }


  @JsonProperty(JSON_PROPERTY_RETURN_ON_ASSETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReturnOnAssets(BigDecimal returnOnAssets) {
    this.returnOnAssets = returnOnAssets;
  }


  public InlineResponse2004ReportedKeyFiguresFirstFiscalYear returnOnEquity(BigDecimal returnOnEquity) {
    this.returnOnEquity = returnOnEquity;
    return this;
  }

   /**
   * Return on equity (ROE), which is the ratio of the net income, divided by the two-fiscal-year average of the total shareholders&#39; equity.
   * @return returnOnEquity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Return on equity (ROE), which is the ratio of the net income, divided by the two-fiscal-year average of the total shareholders' equity.")
  @JsonProperty(JSON_PROPERTY_RETURN_ON_EQUITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getReturnOnEquity() {
    return returnOnEquity;
  }


  @JsonProperty(JSON_PROPERTY_RETURN_ON_EQUITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReturnOnEquity(BigDecimal returnOnEquity) {
    this.returnOnEquity = returnOnEquity;
  }


  public InlineResponse2004ReportedKeyFiguresFirstFiscalYear ratios(InlineResponse2004ReportedKeyFiguresFirstFiscalYearRatios ratios) {
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

  public InlineResponse2004ReportedKeyFiguresFirstFiscalYearRatios getRatios() {
    return ratios;
  }


  @JsonProperty(JSON_PROPERTY_RATIOS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRatios(InlineResponse2004ReportedKeyFiguresFirstFiscalYearRatios ratios) {
    this.ratios = ratios;
  }


  /**
   * Return true if this inline_response_200_4_reportedKeyFigures_firstFiscalYear object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2004ReportedKeyFiguresFirstFiscalYear inlineResponse2004ReportedKeyFiguresFirstFiscalYear = (InlineResponse2004ReportedKeyFiguresFirstFiscalYear) o;
    return Objects.equals(this.fiscalYear, inlineResponse2004ReportedKeyFiguresFirstFiscalYear.fiscalYear) &&
        Objects.equals(this.currencyDependentKeyFigures, inlineResponse2004ReportedKeyFiguresFirstFiscalYear.currencyDependentKeyFigures) &&
        Objects.equals(this.ebitMargin, inlineResponse2004ReportedKeyFiguresFirstFiscalYear.ebitMargin) &&
        Objects.equals(this.ebitdaMargin, inlineResponse2004ReportedKeyFiguresFirstFiscalYear.ebitdaMargin) &&
        Objects.equals(this.netIncomeMargin, inlineResponse2004ReportedKeyFiguresFirstFiscalYear.netIncomeMargin) &&
        Objects.equals(this.grossIncomeMargin, inlineResponse2004ReportedKeyFiguresFirstFiscalYear.grossIncomeMargin) &&
        Objects.equals(this.operatingMargin, inlineResponse2004ReportedKeyFiguresFirstFiscalYear.operatingMargin) &&
        Objects.equals(this.returnOnAssets, inlineResponse2004ReportedKeyFiguresFirstFiscalYear.returnOnAssets) &&
        Objects.equals(this.returnOnEquity, inlineResponse2004ReportedKeyFiguresFirstFiscalYear.returnOnEquity) &&
        Objects.equals(this.ratios, inlineResponse2004ReportedKeyFiguresFirstFiscalYear.ratios);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fiscalYear, currencyDependentKeyFigures, ebitMargin, ebitdaMargin, netIncomeMargin, grossIncomeMargin, operatingMargin, returnOnAssets, returnOnEquity, ratios);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2004ReportedKeyFiguresFirstFiscalYear {\n");
    sb.append("    fiscalYear: ").append(toIndentedString(fiscalYear)).append("\n");
    sb.append("    currencyDependentKeyFigures: ").append(toIndentedString(currencyDependentKeyFigures)).append("\n");
    sb.append("    ebitMargin: ").append(toIndentedString(ebitMargin)).append("\n");
    sb.append("    ebitdaMargin: ").append(toIndentedString(ebitdaMargin)).append("\n");
    sb.append("    netIncomeMargin: ").append(toIndentedString(netIncomeMargin)).append("\n");
    sb.append("    grossIncomeMargin: ").append(toIndentedString(grossIncomeMargin)).append("\n");
    sb.append("    operatingMargin: ").append(toIndentedString(operatingMargin)).append("\n");
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

