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
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse2005DataEstimatesFirstFiscalYearRatiosDividendYield;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse2005DataEstimatesFirstFiscalYearRatiosEnterpriseValueEbit;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse2005DataEstimatesFirstFiscalYearRatiosEnterpriseValueEbitda;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse2005DataEstimatesFirstFiscalYearRatiosEnterpriseValueSales;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse2005DataEstimatesFirstFiscalYearRatiosPriceBookValue;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse2005DataEstimatesFirstFiscalYearRatiosPriceCashFlow;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse2005DataEstimatesFirstFiscalYearRatiosPriceEarnings;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse2005DataEstimatesFirstFiscalYearRatiosPriceEarningsGrowth;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse2005DataEstimatesFirstFiscalYearRatiosPriceFreeCashFlow;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse2005DataEstimatesFirstFiscalYearRatiosPriceSales;
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
 * Ratios.
 */
@ApiModel(description = "Ratios.")
@JsonPropertyOrder({
  InlineResponse2005DataEstimatesFirstFiscalYearRatios.JSON_PROPERTY_PRICE_SALES,
  InlineResponse2005DataEstimatesFirstFiscalYearRatios.JSON_PROPERTY_PRICE_EARNINGS,
  InlineResponse2005DataEstimatesFirstFiscalYearRatios.JSON_PROPERTY_PRICE_EARNINGS_GROWTH,
  InlineResponse2005DataEstimatesFirstFiscalYearRatios.JSON_PROPERTY_PRICE_BOOK_VALUE,
  InlineResponse2005DataEstimatesFirstFiscalYearRatios.JSON_PROPERTY_PRICE_CASH_FLOW,
  InlineResponse2005DataEstimatesFirstFiscalYearRatios.JSON_PROPERTY_PRICE_FREE_CASH_FLOW,
  InlineResponse2005DataEstimatesFirstFiscalYearRatios.JSON_PROPERTY_DIVIDEND_YIELD,
  InlineResponse2005DataEstimatesFirstFiscalYearRatios.JSON_PROPERTY_ENTERPRISE_VALUE_EBIT,
  InlineResponse2005DataEstimatesFirstFiscalYearRatios.JSON_PROPERTY_ENTERPRISE_VALUE_EBITDA,
  InlineResponse2005DataEstimatesFirstFiscalYearRatios.JSON_PROPERTY_ENTERPRISE_VALUE_SALES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse2005DataEstimatesFirstFiscalYearRatios implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_PRICE_SALES = "priceSales";
  private InlineResponse2005DataEstimatesFirstFiscalYearRatiosPriceSales priceSales;

  public static final String JSON_PROPERTY_PRICE_EARNINGS = "priceEarnings";
  private InlineResponse2005DataEstimatesFirstFiscalYearRatiosPriceEarnings priceEarnings;

  public static final String JSON_PROPERTY_PRICE_EARNINGS_GROWTH = "priceEarningsGrowth";
  private InlineResponse2005DataEstimatesFirstFiscalYearRatiosPriceEarningsGrowth priceEarningsGrowth;

  public static final String JSON_PROPERTY_PRICE_BOOK_VALUE = "priceBookValue";
  private InlineResponse2005DataEstimatesFirstFiscalYearRatiosPriceBookValue priceBookValue;

  public static final String JSON_PROPERTY_PRICE_CASH_FLOW = "priceCashFlow";
  private InlineResponse2005DataEstimatesFirstFiscalYearRatiosPriceCashFlow priceCashFlow;

  public static final String JSON_PROPERTY_PRICE_FREE_CASH_FLOW = "priceFreeCashFlow";
  private InlineResponse2005DataEstimatesFirstFiscalYearRatiosPriceFreeCashFlow priceFreeCashFlow;

  public static final String JSON_PROPERTY_DIVIDEND_YIELD = "dividendYield";
  private InlineResponse2005DataEstimatesFirstFiscalYearRatiosDividendYield dividendYield;

  public static final String JSON_PROPERTY_ENTERPRISE_VALUE_EBIT = "enterpriseValueEbit";
  private InlineResponse2005DataEstimatesFirstFiscalYearRatiosEnterpriseValueEbit enterpriseValueEbit;

  public static final String JSON_PROPERTY_ENTERPRISE_VALUE_EBITDA = "enterpriseValueEbitda";
  private InlineResponse2005DataEstimatesFirstFiscalYearRatiosEnterpriseValueEbitda enterpriseValueEbitda;

  public static final String JSON_PROPERTY_ENTERPRISE_VALUE_SALES = "enterpriseValueSales";
  private InlineResponse2005DataEstimatesFirstFiscalYearRatiosEnterpriseValueSales enterpriseValueSales;


  public InlineResponse2005DataEstimatesFirstFiscalYearRatios priceSales(InlineResponse2005DataEstimatesFirstFiscalYearRatiosPriceSales priceSales) {
    this.priceSales = priceSales;
    return this;
  }

   /**
   * Get priceSales
   * @return priceSales
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PRICE_SALES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2005DataEstimatesFirstFiscalYearRatiosPriceSales getPriceSales() {
    return priceSales;
  }


  @JsonProperty(JSON_PROPERTY_PRICE_SALES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPriceSales(InlineResponse2005DataEstimatesFirstFiscalYearRatiosPriceSales priceSales) {
    this.priceSales = priceSales;
  }


  public InlineResponse2005DataEstimatesFirstFiscalYearRatios priceEarnings(InlineResponse2005DataEstimatesFirstFiscalYearRatiosPriceEarnings priceEarnings) {
    this.priceEarnings = priceEarnings;
    return this;
  }

   /**
   * Get priceEarnings
   * @return priceEarnings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PRICE_EARNINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2005DataEstimatesFirstFiscalYearRatiosPriceEarnings getPriceEarnings() {
    return priceEarnings;
  }


  @JsonProperty(JSON_PROPERTY_PRICE_EARNINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPriceEarnings(InlineResponse2005DataEstimatesFirstFiscalYearRatiosPriceEarnings priceEarnings) {
    this.priceEarnings = priceEarnings;
  }


  public InlineResponse2005DataEstimatesFirstFiscalYearRatios priceEarningsGrowth(InlineResponse2005DataEstimatesFirstFiscalYearRatiosPriceEarningsGrowth priceEarningsGrowth) {
    this.priceEarningsGrowth = priceEarningsGrowth;
    return this;
  }

   /**
   * Get priceEarningsGrowth
   * @return priceEarningsGrowth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PRICE_EARNINGS_GROWTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2005DataEstimatesFirstFiscalYearRatiosPriceEarningsGrowth getPriceEarningsGrowth() {
    return priceEarningsGrowth;
  }


  @JsonProperty(JSON_PROPERTY_PRICE_EARNINGS_GROWTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPriceEarningsGrowth(InlineResponse2005DataEstimatesFirstFiscalYearRatiosPriceEarningsGrowth priceEarningsGrowth) {
    this.priceEarningsGrowth = priceEarningsGrowth;
  }


  public InlineResponse2005DataEstimatesFirstFiscalYearRatios priceBookValue(InlineResponse2005DataEstimatesFirstFiscalYearRatiosPriceBookValue priceBookValue) {
    this.priceBookValue = priceBookValue;
    return this;
  }

   /**
   * Get priceBookValue
   * @return priceBookValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PRICE_BOOK_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2005DataEstimatesFirstFiscalYearRatiosPriceBookValue getPriceBookValue() {
    return priceBookValue;
  }


  @JsonProperty(JSON_PROPERTY_PRICE_BOOK_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPriceBookValue(InlineResponse2005DataEstimatesFirstFiscalYearRatiosPriceBookValue priceBookValue) {
    this.priceBookValue = priceBookValue;
  }


  public InlineResponse2005DataEstimatesFirstFiscalYearRatios priceCashFlow(InlineResponse2005DataEstimatesFirstFiscalYearRatiosPriceCashFlow priceCashFlow) {
    this.priceCashFlow = priceCashFlow;
    return this;
  }

   /**
   * Get priceCashFlow
   * @return priceCashFlow
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PRICE_CASH_FLOW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2005DataEstimatesFirstFiscalYearRatiosPriceCashFlow getPriceCashFlow() {
    return priceCashFlow;
  }


  @JsonProperty(JSON_PROPERTY_PRICE_CASH_FLOW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPriceCashFlow(InlineResponse2005DataEstimatesFirstFiscalYearRatiosPriceCashFlow priceCashFlow) {
    this.priceCashFlow = priceCashFlow;
  }


  public InlineResponse2005DataEstimatesFirstFiscalYearRatios priceFreeCashFlow(InlineResponse2005DataEstimatesFirstFiscalYearRatiosPriceFreeCashFlow priceFreeCashFlow) {
    this.priceFreeCashFlow = priceFreeCashFlow;
    return this;
  }

   /**
   * Get priceFreeCashFlow
   * @return priceFreeCashFlow
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PRICE_FREE_CASH_FLOW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2005DataEstimatesFirstFiscalYearRatiosPriceFreeCashFlow getPriceFreeCashFlow() {
    return priceFreeCashFlow;
  }


  @JsonProperty(JSON_PROPERTY_PRICE_FREE_CASH_FLOW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPriceFreeCashFlow(InlineResponse2005DataEstimatesFirstFiscalYearRatiosPriceFreeCashFlow priceFreeCashFlow) {
    this.priceFreeCashFlow = priceFreeCashFlow;
  }


  public InlineResponse2005DataEstimatesFirstFiscalYearRatios dividendYield(InlineResponse2005DataEstimatesFirstFiscalYearRatiosDividendYield dividendYield) {
    this.dividendYield = dividendYield;
    return this;
  }

   /**
   * Get dividendYield
   * @return dividendYield
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DIVIDEND_YIELD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2005DataEstimatesFirstFiscalYearRatiosDividendYield getDividendYield() {
    return dividendYield;
  }


  @JsonProperty(JSON_PROPERTY_DIVIDEND_YIELD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDividendYield(InlineResponse2005DataEstimatesFirstFiscalYearRatiosDividendYield dividendYield) {
    this.dividendYield = dividendYield;
  }


  public InlineResponse2005DataEstimatesFirstFiscalYearRatios enterpriseValueEbit(InlineResponse2005DataEstimatesFirstFiscalYearRatiosEnterpriseValueEbit enterpriseValueEbit) {
    this.enterpriseValueEbit = enterpriseValueEbit;
    return this;
  }

   /**
   * Get enterpriseValueEbit
   * @return enterpriseValueEbit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ENTERPRISE_VALUE_EBIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2005DataEstimatesFirstFiscalYearRatiosEnterpriseValueEbit getEnterpriseValueEbit() {
    return enterpriseValueEbit;
  }


  @JsonProperty(JSON_PROPERTY_ENTERPRISE_VALUE_EBIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnterpriseValueEbit(InlineResponse2005DataEstimatesFirstFiscalYearRatiosEnterpriseValueEbit enterpriseValueEbit) {
    this.enterpriseValueEbit = enterpriseValueEbit;
  }


  public InlineResponse2005DataEstimatesFirstFiscalYearRatios enterpriseValueEbitda(InlineResponse2005DataEstimatesFirstFiscalYearRatiosEnterpriseValueEbitda enterpriseValueEbitda) {
    this.enterpriseValueEbitda = enterpriseValueEbitda;
    return this;
  }

   /**
   * Get enterpriseValueEbitda
   * @return enterpriseValueEbitda
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ENTERPRISE_VALUE_EBITDA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2005DataEstimatesFirstFiscalYearRatiosEnterpriseValueEbitda getEnterpriseValueEbitda() {
    return enterpriseValueEbitda;
  }


  @JsonProperty(JSON_PROPERTY_ENTERPRISE_VALUE_EBITDA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnterpriseValueEbitda(InlineResponse2005DataEstimatesFirstFiscalYearRatiosEnterpriseValueEbitda enterpriseValueEbitda) {
    this.enterpriseValueEbitda = enterpriseValueEbitda;
  }


  public InlineResponse2005DataEstimatesFirstFiscalYearRatios enterpriseValueSales(InlineResponse2005DataEstimatesFirstFiscalYearRatiosEnterpriseValueSales enterpriseValueSales) {
    this.enterpriseValueSales = enterpriseValueSales;
    return this;
  }

   /**
   * Get enterpriseValueSales
   * @return enterpriseValueSales
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ENTERPRISE_VALUE_SALES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2005DataEstimatesFirstFiscalYearRatiosEnterpriseValueSales getEnterpriseValueSales() {
    return enterpriseValueSales;
  }


  @JsonProperty(JSON_PROPERTY_ENTERPRISE_VALUE_SALES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnterpriseValueSales(InlineResponse2005DataEstimatesFirstFiscalYearRatiosEnterpriseValueSales enterpriseValueSales) {
    this.enterpriseValueSales = enterpriseValueSales;
  }


  /**
   * Return true if this inline_response_200_5_data_estimates_firstFiscalYear_ratios object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2005DataEstimatesFirstFiscalYearRatios inlineResponse2005DataEstimatesFirstFiscalYearRatios = (InlineResponse2005DataEstimatesFirstFiscalYearRatios) o;
    return Objects.equals(this.priceSales, inlineResponse2005DataEstimatesFirstFiscalYearRatios.priceSales) &&
        Objects.equals(this.priceEarnings, inlineResponse2005DataEstimatesFirstFiscalYearRatios.priceEarnings) &&
        Objects.equals(this.priceEarningsGrowth, inlineResponse2005DataEstimatesFirstFiscalYearRatios.priceEarningsGrowth) &&
        Objects.equals(this.priceBookValue, inlineResponse2005DataEstimatesFirstFiscalYearRatios.priceBookValue) &&
        Objects.equals(this.priceCashFlow, inlineResponse2005DataEstimatesFirstFiscalYearRatios.priceCashFlow) &&
        Objects.equals(this.priceFreeCashFlow, inlineResponse2005DataEstimatesFirstFiscalYearRatios.priceFreeCashFlow) &&
        Objects.equals(this.dividendYield, inlineResponse2005DataEstimatesFirstFiscalYearRatios.dividendYield) &&
        Objects.equals(this.enterpriseValueEbit, inlineResponse2005DataEstimatesFirstFiscalYearRatios.enterpriseValueEbit) &&
        Objects.equals(this.enterpriseValueEbitda, inlineResponse2005DataEstimatesFirstFiscalYearRatios.enterpriseValueEbitda) &&
        Objects.equals(this.enterpriseValueSales, inlineResponse2005DataEstimatesFirstFiscalYearRatios.enterpriseValueSales);
  }

  @Override
  public int hashCode() {
    return Objects.hash(priceSales, priceEarnings, priceEarningsGrowth, priceBookValue, priceCashFlow, priceFreeCashFlow, dividendYield, enterpriseValueEbit, enterpriseValueEbitda, enterpriseValueSales);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2005DataEstimatesFirstFiscalYearRatios {\n");
    sb.append("    priceSales: ").append(toIndentedString(priceSales)).append("\n");
    sb.append("    priceEarnings: ").append(toIndentedString(priceEarnings)).append("\n");
    sb.append("    priceEarningsGrowth: ").append(toIndentedString(priceEarningsGrowth)).append("\n");
    sb.append("    priceBookValue: ").append(toIndentedString(priceBookValue)).append("\n");
    sb.append("    priceCashFlow: ").append(toIndentedString(priceCashFlow)).append("\n");
    sb.append("    priceFreeCashFlow: ").append(toIndentedString(priceFreeCashFlow)).append("\n");
    sb.append("    dividendYield: ").append(toIndentedString(dividendYield)).append("\n");
    sb.append("    enterpriseValueEbit: ").append(toIndentedString(enterpriseValueEbit)).append("\n");
    sb.append("    enterpriseValueEbitda: ").append(toIndentedString(enterpriseValueEbitda)).append("\n");
    sb.append("    enterpriseValueSales: ").append(toIndentedString(enterpriseValueSales)).append("\n");
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

