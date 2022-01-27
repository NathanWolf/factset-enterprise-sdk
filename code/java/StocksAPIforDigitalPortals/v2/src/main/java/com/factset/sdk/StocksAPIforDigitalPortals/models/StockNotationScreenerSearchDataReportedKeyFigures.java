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
import com.factset.sdk.StocksAPIforDigitalPortals.models.StockNotationScreenerSearchDataCurrencyDependentKeyFigures;
import com.factset.sdk.StocksAPIforDigitalPortals.models.StockNotationScreenerSearchDataEbitMargin;
import com.factset.sdk.StocksAPIforDigitalPortals.models.StockNotationScreenerSearchDataEbitdaMargin;
import com.factset.sdk.StocksAPIforDigitalPortals.models.StockNotationScreenerSearchDataFiscalYear;
import com.factset.sdk.StocksAPIforDigitalPortals.models.StockNotationScreenerSearchDataGrossIncomeMargin;
import com.factset.sdk.StocksAPIforDigitalPortals.models.StockNotationScreenerSearchDataNetIncomeMargin;
import com.factset.sdk.StocksAPIforDigitalPortals.models.StockNotationScreenerSearchDataOperatingMargin;
import com.factset.sdk.StocksAPIforDigitalPortals.models.StockNotationScreenerSearchDataRatios;
import com.factset.sdk.StocksAPIforDigitalPortals.models.StockNotationScreenerSearchDataReturnOnAssets;
import com.factset.sdk.StocksAPIforDigitalPortals.models.StockNotationScreenerSearchDataReturnOnEquity;
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
 * StockNotationScreenerSearchDataReportedKeyFigures
 */
@JsonPropertyOrder({
  StockNotationScreenerSearchDataReportedKeyFigures.JSON_PROPERTY_FISCAL_YEAR,
  StockNotationScreenerSearchDataReportedKeyFigures.JSON_PROPERTY_CURRENCY_DEPENDENT_KEY_FIGURES,
  StockNotationScreenerSearchDataReportedKeyFigures.JSON_PROPERTY_EBIT_MARGIN,
  StockNotationScreenerSearchDataReportedKeyFigures.JSON_PROPERTY_EBITDA_MARGIN,
  StockNotationScreenerSearchDataReportedKeyFigures.JSON_PROPERTY_NET_INCOME_MARGIN,
  StockNotationScreenerSearchDataReportedKeyFigures.JSON_PROPERTY_GROSS_INCOME_MARGIN,
  StockNotationScreenerSearchDataReportedKeyFigures.JSON_PROPERTY_OPERATING_MARGIN,
  StockNotationScreenerSearchDataReportedKeyFigures.JSON_PROPERTY_RETURN_ON_ASSETS,
  StockNotationScreenerSearchDataReportedKeyFigures.JSON_PROPERTY_RETURN_ON_EQUITY,
  StockNotationScreenerSearchDataReportedKeyFigures.JSON_PROPERTY_RATIOS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class StockNotationScreenerSearchDataReportedKeyFigures implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_FISCAL_YEAR = "fiscalYear";
  private StockNotationScreenerSearchDataFiscalYear fiscalYear;

  public static final String JSON_PROPERTY_CURRENCY_DEPENDENT_KEY_FIGURES = "currencyDependentKeyFigures";
  private StockNotationScreenerSearchDataCurrencyDependentKeyFigures currencyDependentKeyFigures;

  public static final String JSON_PROPERTY_EBIT_MARGIN = "ebitMargin";
  private StockNotationScreenerSearchDataEbitMargin ebitMargin;

  public static final String JSON_PROPERTY_EBITDA_MARGIN = "ebitdaMargin";
  private StockNotationScreenerSearchDataEbitdaMargin ebitdaMargin;

  public static final String JSON_PROPERTY_NET_INCOME_MARGIN = "netIncomeMargin";
  private StockNotationScreenerSearchDataNetIncomeMargin netIncomeMargin;

  public static final String JSON_PROPERTY_GROSS_INCOME_MARGIN = "grossIncomeMargin";
  private StockNotationScreenerSearchDataGrossIncomeMargin grossIncomeMargin;

  public static final String JSON_PROPERTY_OPERATING_MARGIN = "operatingMargin";
  private StockNotationScreenerSearchDataOperatingMargin operatingMargin;

  public static final String JSON_PROPERTY_RETURN_ON_ASSETS = "returnOnAssets";
  private StockNotationScreenerSearchDataReturnOnAssets returnOnAssets;

  public static final String JSON_PROPERTY_RETURN_ON_EQUITY = "returnOnEquity";
  private StockNotationScreenerSearchDataReturnOnEquity returnOnEquity;

  public static final String JSON_PROPERTY_RATIOS = "ratios";
  private StockNotationScreenerSearchDataRatios ratios;


  public StockNotationScreenerSearchDataReportedKeyFigures fiscalYear(StockNotationScreenerSearchDataFiscalYear fiscalYear) {
    this.fiscalYear = fiscalYear;
    return this;
  }

   /**
   * Get fiscalYear
   * @return fiscalYear
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_FISCAL_YEAR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public StockNotationScreenerSearchDataFiscalYear getFiscalYear() {
    return fiscalYear;
  }


  @JsonProperty(JSON_PROPERTY_FISCAL_YEAR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFiscalYear(StockNotationScreenerSearchDataFiscalYear fiscalYear) {
    this.fiscalYear = fiscalYear;
  }


  public StockNotationScreenerSearchDataReportedKeyFigures currencyDependentKeyFigures(StockNotationScreenerSearchDataCurrencyDependentKeyFigures currencyDependentKeyFigures) {
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

  public StockNotationScreenerSearchDataCurrencyDependentKeyFigures getCurrencyDependentKeyFigures() {
    return currencyDependentKeyFigures;
  }


  @JsonProperty(JSON_PROPERTY_CURRENCY_DEPENDENT_KEY_FIGURES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrencyDependentKeyFigures(StockNotationScreenerSearchDataCurrencyDependentKeyFigures currencyDependentKeyFigures) {
    this.currencyDependentKeyFigures = currencyDependentKeyFigures;
  }


  public StockNotationScreenerSearchDataReportedKeyFigures ebitMargin(StockNotationScreenerSearchDataEbitMargin ebitMargin) {
    this.ebitMargin = ebitMargin;
    return this;
  }

   /**
   * Get ebitMargin
   * @return ebitMargin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EBIT_MARGIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StockNotationScreenerSearchDataEbitMargin getEbitMargin() {
    return ebitMargin;
  }


  @JsonProperty(JSON_PROPERTY_EBIT_MARGIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEbitMargin(StockNotationScreenerSearchDataEbitMargin ebitMargin) {
    this.ebitMargin = ebitMargin;
  }


  public StockNotationScreenerSearchDataReportedKeyFigures ebitdaMargin(StockNotationScreenerSearchDataEbitdaMargin ebitdaMargin) {
    this.ebitdaMargin = ebitdaMargin;
    return this;
  }

   /**
   * Get ebitdaMargin
   * @return ebitdaMargin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EBITDA_MARGIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StockNotationScreenerSearchDataEbitdaMargin getEbitdaMargin() {
    return ebitdaMargin;
  }


  @JsonProperty(JSON_PROPERTY_EBITDA_MARGIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEbitdaMargin(StockNotationScreenerSearchDataEbitdaMargin ebitdaMargin) {
    this.ebitdaMargin = ebitdaMargin;
  }


  public StockNotationScreenerSearchDataReportedKeyFigures netIncomeMargin(StockNotationScreenerSearchDataNetIncomeMargin netIncomeMargin) {
    this.netIncomeMargin = netIncomeMargin;
    return this;
  }

   /**
   * Get netIncomeMargin
   * @return netIncomeMargin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NET_INCOME_MARGIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StockNotationScreenerSearchDataNetIncomeMargin getNetIncomeMargin() {
    return netIncomeMargin;
  }


  @JsonProperty(JSON_PROPERTY_NET_INCOME_MARGIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNetIncomeMargin(StockNotationScreenerSearchDataNetIncomeMargin netIncomeMargin) {
    this.netIncomeMargin = netIncomeMargin;
  }


  public StockNotationScreenerSearchDataReportedKeyFigures grossIncomeMargin(StockNotationScreenerSearchDataGrossIncomeMargin grossIncomeMargin) {
    this.grossIncomeMargin = grossIncomeMargin;
    return this;
  }

   /**
   * Get grossIncomeMargin
   * @return grossIncomeMargin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_GROSS_INCOME_MARGIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StockNotationScreenerSearchDataGrossIncomeMargin getGrossIncomeMargin() {
    return grossIncomeMargin;
  }


  @JsonProperty(JSON_PROPERTY_GROSS_INCOME_MARGIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGrossIncomeMargin(StockNotationScreenerSearchDataGrossIncomeMargin grossIncomeMargin) {
    this.grossIncomeMargin = grossIncomeMargin;
  }


  public StockNotationScreenerSearchDataReportedKeyFigures operatingMargin(StockNotationScreenerSearchDataOperatingMargin operatingMargin) {
    this.operatingMargin = operatingMargin;
    return this;
  }

   /**
   * Get operatingMargin
   * @return operatingMargin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OPERATING_MARGIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StockNotationScreenerSearchDataOperatingMargin getOperatingMargin() {
    return operatingMargin;
  }


  @JsonProperty(JSON_PROPERTY_OPERATING_MARGIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOperatingMargin(StockNotationScreenerSearchDataOperatingMargin operatingMargin) {
    this.operatingMargin = operatingMargin;
  }


  public StockNotationScreenerSearchDataReportedKeyFigures returnOnAssets(StockNotationScreenerSearchDataReturnOnAssets returnOnAssets) {
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

  public StockNotationScreenerSearchDataReturnOnAssets getReturnOnAssets() {
    return returnOnAssets;
  }


  @JsonProperty(JSON_PROPERTY_RETURN_ON_ASSETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReturnOnAssets(StockNotationScreenerSearchDataReturnOnAssets returnOnAssets) {
    this.returnOnAssets = returnOnAssets;
  }


  public StockNotationScreenerSearchDataReportedKeyFigures returnOnEquity(StockNotationScreenerSearchDataReturnOnEquity returnOnEquity) {
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

  public StockNotationScreenerSearchDataReturnOnEquity getReturnOnEquity() {
    return returnOnEquity;
  }


  @JsonProperty(JSON_PROPERTY_RETURN_ON_EQUITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReturnOnEquity(StockNotationScreenerSearchDataReturnOnEquity returnOnEquity) {
    this.returnOnEquity = returnOnEquity;
  }


  public StockNotationScreenerSearchDataReportedKeyFigures ratios(StockNotationScreenerSearchDataRatios ratios) {
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

  public StockNotationScreenerSearchDataRatios getRatios() {
    return ratios;
  }


  @JsonProperty(JSON_PROPERTY_RATIOS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRatios(StockNotationScreenerSearchDataRatios ratios) {
    this.ratios = ratios;
  }


  /**
   * Return true if this _stock_notation_screener_search_data_reportedKeyFigures object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StockNotationScreenerSearchDataReportedKeyFigures stockNotationScreenerSearchDataReportedKeyFigures = (StockNotationScreenerSearchDataReportedKeyFigures) o;
    return Objects.equals(this.fiscalYear, stockNotationScreenerSearchDataReportedKeyFigures.fiscalYear) &&
        Objects.equals(this.currencyDependentKeyFigures, stockNotationScreenerSearchDataReportedKeyFigures.currencyDependentKeyFigures) &&
        Objects.equals(this.ebitMargin, stockNotationScreenerSearchDataReportedKeyFigures.ebitMargin) &&
        Objects.equals(this.ebitdaMargin, stockNotationScreenerSearchDataReportedKeyFigures.ebitdaMargin) &&
        Objects.equals(this.netIncomeMargin, stockNotationScreenerSearchDataReportedKeyFigures.netIncomeMargin) &&
        Objects.equals(this.grossIncomeMargin, stockNotationScreenerSearchDataReportedKeyFigures.grossIncomeMargin) &&
        Objects.equals(this.operatingMargin, stockNotationScreenerSearchDataReportedKeyFigures.operatingMargin) &&
        Objects.equals(this.returnOnAssets, stockNotationScreenerSearchDataReportedKeyFigures.returnOnAssets) &&
        Objects.equals(this.returnOnEquity, stockNotationScreenerSearchDataReportedKeyFigures.returnOnEquity) &&
        Objects.equals(this.ratios, stockNotationScreenerSearchDataReportedKeyFigures.ratios);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fiscalYear, currencyDependentKeyFigures, ebitMargin, ebitdaMargin, netIncomeMargin, grossIncomeMargin, operatingMargin, returnOnAssets, returnOnEquity, ratios);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StockNotationScreenerSearchDataReportedKeyFigures {\n");
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

