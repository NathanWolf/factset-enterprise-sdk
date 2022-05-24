/*
 * Stocks API For Digital Portals
 * The stocks API features a screener to search for equity instruments based on stock-specific parameters.  Parameters for up to three fiscal years might now be used in one request; data is available for the ten most recent completed fiscal years. Estimates are available for the current and two consecutive fiscal years.  A separate endpoint returns the possible values and value ranges for the parameters that the endpoint /stock/notation/screener/search accepts: Application developers can request the values and value ranges only for a restricted set of notations that match predefined parameters. This functionality may be used to pre-fill the values and value ranges of the parameters of the /stock/notation/screener/search endpoint so that performing a search always leads to a non-empty set of notations.  The endpoint /stock/notation/ranking/intraday/list ranks stocks notations using intraday figures, for example to build a gainers/losers list.   Additional endpoints include end-of-day benchmark key figures, and selected fundamentals (as of end of fiscal year and with potentially daily updates).  This API is fully integrated with the corresponding Quotes API, allowing access to detailed price and performance information of instruments, as well as basic security identifier cross-reference. For direct access to price histories, please refer to the Time Series API for Digital Portals.  Similar criteria based screener APIs exist for fixed income instruments and securitized derivatives: See the Bonds API and the Securitized Derivatives API for details.
 *
 * The version of the OpenAPI document: 2
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
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse20012DataReportedKeyFiguresFirstFiscalYearRatiosDebtEquity;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse20012DataReportedKeyFiguresFirstFiscalYearRatiosDividendYield;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse20012DataReportedKeyFiguresFirstFiscalYearRatiosEnterpriseValueEbit;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse20012DataReportedKeyFiguresFirstFiscalYearRatiosEnterpriseValueEbitda;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse20012DataReportedKeyFiguresFirstFiscalYearRatiosEnterpriseValueSales;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse20012DataReportedKeyFiguresFirstFiscalYearRatiosPriceBookValue;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse20012DataReportedKeyFiguresFirstFiscalYearRatiosPriceCashFlow;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse20012DataReportedKeyFiguresFirstFiscalYearRatiosPriceEarnings;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse20012DataReportedKeyFiguresFirstFiscalYearRatiosPriceFreeCashFlow;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse20012DataReportedKeyFiguresFirstFiscalYearRatiosPriceSales;
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
  InlineResponse20012DataReportedKeyFiguresFirstFiscalYearRatios.JSON_PROPERTY_PRICE_SALES,
  InlineResponse20012DataReportedKeyFiguresFirstFiscalYearRatios.JSON_PROPERTY_PRICE_EARNINGS,
  InlineResponse20012DataReportedKeyFiguresFirstFiscalYearRatios.JSON_PROPERTY_PRICE_BOOK_VALUE,
  InlineResponse20012DataReportedKeyFiguresFirstFiscalYearRatios.JSON_PROPERTY_PRICE_CASH_FLOW,
  InlineResponse20012DataReportedKeyFiguresFirstFiscalYearRatios.JSON_PROPERTY_PRICE_FREE_CASH_FLOW,
  InlineResponse20012DataReportedKeyFiguresFirstFiscalYearRatios.JSON_PROPERTY_DIVIDEND_YIELD,
  InlineResponse20012DataReportedKeyFiguresFirstFiscalYearRatios.JSON_PROPERTY_ENTERPRISE_VALUE_EBIT,
  InlineResponse20012DataReportedKeyFiguresFirstFiscalYearRatios.JSON_PROPERTY_ENTERPRISE_VALUE_EBITDA,
  InlineResponse20012DataReportedKeyFiguresFirstFiscalYearRatios.JSON_PROPERTY_ENTERPRISE_VALUE_SALES,
  InlineResponse20012DataReportedKeyFiguresFirstFiscalYearRatios.JSON_PROPERTY_DEBT_EQUITY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse20012DataReportedKeyFiguresFirstFiscalYearRatios implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_PRICE_SALES = "priceSales";
  private InlineResponse20012DataReportedKeyFiguresFirstFiscalYearRatiosPriceSales priceSales;

  public static final String JSON_PROPERTY_PRICE_EARNINGS = "priceEarnings";
  private InlineResponse20012DataReportedKeyFiguresFirstFiscalYearRatiosPriceEarnings priceEarnings;

  public static final String JSON_PROPERTY_PRICE_BOOK_VALUE = "priceBookValue";
  private InlineResponse20012DataReportedKeyFiguresFirstFiscalYearRatiosPriceBookValue priceBookValue;

  public static final String JSON_PROPERTY_PRICE_CASH_FLOW = "priceCashFlow";
  private InlineResponse20012DataReportedKeyFiguresFirstFiscalYearRatiosPriceCashFlow priceCashFlow;

  public static final String JSON_PROPERTY_PRICE_FREE_CASH_FLOW = "priceFreeCashFlow";
  private InlineResponse20012DataReportedKeyFiguresFirstFiscalYearRatiosPriceFreeCashFlow priceFreeCashFlow;

  public static final String JSON_PROPERTY_DIVIDEND_YIELD = "dividendYield";
  private InlineResponse20012DataReportedKeyFiguresFirstFiscalYearRatiosDividendYield dividendYield;

  public static final String JSON_PROPERTY_ENTERPRISE_VALUE_EBIT = "enterpriseValueEbit";
  private InlineResponse20012DataReportedKeyFiguresFirstFiscalYearRatiosEnterpriseValueEbit enterpriseValueEbit;

  public static final String JSON_PROPERTY_ENTERPRISE_VALUE_EBITDA = "enterpriseValueEbitda";
  private InlineResponse20012DataReportedKeyFiguresFirstFiscalYearRatiosEnterpriseValueEbitda enterpriseValueEbitda;

  public static final String JSON_PROPERTY_ENTERPRISE_VALUE_SALES = "enterpriseValueSales";
  private InlineResponse20012DataReportedKeyFiguresFirstFiscalYearRatiosEnterpriseValueSales enterpriseValueSales;

  public static final String JSON_PROPERTY_DEBT_EQUITY = "debtEquity";
  private InlineResponse20012DataReportedKeyFiguresFirstFiscalYearRatiosDebtEquity debtEquity;

  public InlineResponse20012DataReportedKeyFiguresFirstFiscalYearRatios() { 
  }

  public InlineResponse20012DataReportedKeyFiguresFirstFiscalYearRatios priceSales(InlineResponse20012DataReportedKeyFiguresFirstFiscalYearRatiosPriceSales priceSales) {
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

  public InlineResponse20012DataReportedKeyFiguresFirstFiscalYearRatiosPriceSales getPriceSales() {
    return priceSales;
  }


  @JsonProperty(JSON_PROPERTY_PRICE_SALES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPriceSales(InlineResponse20012DataReportedKeyFiguresFirstFiscalYearRatiosPriceSales priceSales) {
    this.priceSales = priceSales;
  }


  public InlineResponse20012DataReportedKeyFiguresFirstFiscalYearRatios priceEarnings(InlineResponse20012DataReportedKeyFiguresFirstFiscalYearRatiosPriceEarnings priceEarnings) {
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

  public InlineResponse20012DataReportedKeyFiguresFirstFiscalYearRatiosPriceEarnings getPriceEarnings() {
    return priceEarnings;
  }


  @JsonProperty(JSON_PROPERTY_PRICE_EARNINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPriceEarnings(InlineResponse20012DataReportedKeyFiguresFirstFiscalYearRatiosPriceEarnings priceEarnings) {
    this.priceEarnings = priceEarnings;
  }


  public InlineResponse20012DataReportedKeyFiguresFirstFiscalYearRatios priceBookValue(InlineResponse20012DataReportedKeyFiguresFirstFiscalYearRatiosPriceBookValue priceBookValue) {
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

  public InlineResponse20012DataReportedKeyFiguresFirstFiscalYearRatiosPriceBookValue getPriceBookValue() {
    return priceBookValue;
  }


  @JsonProperty(JSON_PROPERTY_PRICE_BOOK_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPriceBookValue(InlineResponse20012DataReportedKeyFiguresFirstFiscalYearRatiosPriceBookValue priceBookValue) {
    this.priceBookValue = priceBookValue;
  }


  public InlineResponse20012DataReportedKeyFiguresFirstFiscalYearRatios priceCashFlow(InlineResponse20012DataReportedKeyFiguresFirstFiscalYearRatiosPriceCashFlow priceCashFlow) {
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

  public InlineResponse20012DataReportedKeyFiguresFirstFiscalYearRatiosPriceCashFlow getPriceCashFlow() {
    return priceCashFlow;
  }


  @JsonProperty(JSON_PROPERTY_PRICE_CASH_FLOW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPriceCashFlow(InlineResponse20012DataReportedKeyFiguresFirstFiscalYearRatiosPriceCashFlow priceCashFlow) {
    this.priceCashFlow = priceCashFlow;
  }


  public InlineResponse20012DataReportedKeyFiguresFirstFiscalYearRatios priceFreeCashFlow(InlineResponse20012DataReportedKeyFiguresFirstFiscalYearRatiosPriceFreeCashFlow priceFreeCashFlow) {
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

  public InlineResponse20012DataReportedKeyFiguresFirstFiscalYearRatiosPriceFreeCashFlow getPriceFreeCashFlow() {
    return priceFreeCashFlow;
  }


  @JsonProperty(JSON_PROPERTY_PRICE_FREE_CASH_FLOW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPriceFreeCashFlow(InlineResponse20012DataReportedKeyFiguresFirstFiscalYearRatiosPriceFreeCashFlow priceFreeCashFlow) {
    this.priceFreeCashFlow = priceFreeCashFlow;
  }


  public InlineResponse20012DataReportedKeyFiguresFirstFiscalYearRatios dividendYield(InlineResponse20012DataReportedKeyFiguresFirstFiscalYearRatiosDividendYield dividendYield) {
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

  public InlineResponse20012DataReportedKeyFiguresFirstFiscalYearRatiosDividendYield getDividendYield() {
    return dividendYield;
  }


  @JsonProperty(JSON_PROPERTY_DIVIDEND_YIELD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDividendYield(InlineResponse20012DataReportedKeyFiguresFirstFiscalYearRatiosDividendYield dividendYield) {
    this.dividendYield = dividendYield;
  }


  public InlineResponse20012DataReportedKeyFiguresFirstFiscalYearRatios enterpriseValueEbit(InlineResponse20012DataReportedKeyFiguresFirstFiscalYearRatiosEnterpriseValueEbit enterpriseValueEbit) {
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

  public InlineResponse20012DataReportedKeyFiguresFirstFiscalYearRatiosEnterpriseValueEbit getEnterpriseValueEbit() {
    return enterpriseValueEbit;
  }


  @JsonProperty(JSON_PROPERTY_ENTERPRISE_VALUE_EBIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnterpriseValueEbit(InlineResponse20012DataReportedKeyFiguresFirstFiscalYearRatiosEnterpriseValueEbit enterpriseValueEbit) {
    this.enterpriseValueEbit = enterpriseValueEbit;
  }


  public InlineResponse20012DataReportedKeyFiguresFirstFiscalYearRatios enterpriseValueEbitda(InlineResponse20012DataReportedKeyFiguresFirstFiscalYearRatiosEnterpriseValueEbitda enterpriseValueEbitda) {
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

  public InlineResponse20012DataReportedKeyFiguresFirstFiscalYearRatiosEnterpriseValueEbitda getEnterpriseValueEbitda() {
    return enterpriseValueEbitda;
  }


  @JsonProperty(JSON_PROPERTY_ENTERPRISE_VALUE_EBITDA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnterpriseValueEbitda(InlineResponse20012DataReportedKeyFiguresFirstFiscalYearRatiosEnterpriseValueEbitda enterpriseValueEbitda) {
    this.enterpriseValueEbitda = enterpriseValueEbitda;
  }


  public InlineResponse20012DataReportedKeyFiguresFirstFiscalYearRatios enterpriseValueSales(InlineResponse20012DataReportedKeyFiguresFirstFiscalYearRatiosEnterpriseValueSales enterpriseValueSales) {
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

  public InlineResponse20012DataReportedKeyFiguresFirstFiscalYearRatiosEnterpriseValueSales getEnterpriseValueSales() {
    return enterpriseValueSales;
  }


  @JsonProperty(JSON_PROPERTY_ENTERPRISE_VALUE_SALES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnterpriseValueSales(InlineResponse20012DataReportedKeyFiguresFirstFiscalYearRatiosEnterpriseValueSales enterpriseValueSales) {
    this.enterpriseValueSales = enterpriseValueSales;
  }


  public InlineResponse20012DataReportedKeyFiguresFirstFiscalYearRatios debtEquity(InlineResponse20012DataReportedKeyFiguresFirstFiscalYearRatiosDebtEquity debtEquity) {
    this.debtEquity = debtEquity;
    return this;
  }

   /**
   * Get debtEquity
   * @return debtEquity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DEBT_EQUITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse20012DataReportedKeyFiguresFirstFiscalYearRatiosDebtEquity getDebtEquity() {
    return debtEquity;
  }


  @JsonProperty(JSON_PROPERTY_DEBT_EQUITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDebtEquity(InlineResponse20012DataReportedKeyFiguresFirstFiscalYearRatiosDebtEquity debtEquity) {
    this.debtEquity = debtEquity;
  }


  /**
   * Return true if this inline_response_200_12_data_reportedKeyFigures_firstFiscalYear_ratios object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20012DataReportedKeyFiguresFirstFiscalYearRatios inlineResponse20012DataReportedKeyFiguresFirstFiscalYearRatios = (InlineResponse20012DataReportedKeyFiguresFirstFiscalYearRatios) o;
    return Objects.equals(this.priceSales, inlineResponse20012DataReportedKeyFiguresFirstFiscalYearRatios.priceSales) &&
        Objects.equals(this.priceEarnings, inlineResponse20012DataReportedKeyFiguresFirstFiscalYearRatios.priceEarnings) &&
        Objects.equals(this.priceBookValue, inlineResponse20012DataReportedKeyFiguresFirstFiscalYearRatios.priceBookValue) &&
        Objects.equals(this.priceCashFlow, inlineResponse20012DataReportedKeyFiguresFirstFiscalYearRatios.priceCashFlow) &&
        Objects.equals(this.priceFreeCashFlow, inlineResponse20012DataReportedKeyFiguresFirstFiscalYearRatios.priceFreeCashFlow) &&
        Objects.equals(this.dividendYield, inlineResponse20012DataReportedKeyFiguresFirstFiscalYearRatios.dividendYield) &&
        Objects.equals(this.enterpriseValueEbit, inlineResponse20012DataReportedKeyFiguresFirstFiscalYearRatios.enterpriseValueEbit) &&
        Objects.equals(this.enterpriseValueEbitda, inlineResponse20012DataReportedKeyFiguresFirstFiscalYearRatios.enterpriseValueEbitda) &&
        Objects.equals(this.enterpriseValueSales, inlineResponse20012DataReportedKeyFiguresFirstFiscalYearRatios.enterpriseValueSales) &&
        Objects.equals(this.debtEquity, inlineResponse20012DataReportedKeyFiguresFirstFiscalYearRatios.debtEquity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(priceSales, priceEarnings, priceBookValue, priceCashFlow, priceFreeCashFlow, dividendYield, enterpriseValueEbit, enterpriseValueEbitda, enterpriseValueSales, debtEquity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20012DataReportedKeyFiguresFirstFiscalYearRatios {\n");
    sb.append("    priceSales: ").append(toIndentedString(priceSales)).append("\n");
    sb.append("    priceEarnings: ").append(toIndentedString(priceEarnings)).append("\n");
    sb.append("    priceBookValue: ").append(toIndentedString(priceBookValue)).append("\n");
    sb.append("    priceCashFlow: ").append(toIndentedString(priceCashFlow)).append("\n");
    sb.append("    priceFreeCashFlow: ").append(toIndentedString(priceFreeCashFlow)).append("\n");
    sb.append("    dividendYield: ").append(toIndentedString(dividendYield)).append("\n");
    sb.append("    enterpriseValueEbit: ").append(toIndentedString(enterpriseValueEbit)).append("\n");
    sb.append("    enterpriseValueEbitda: ").append(toIndentedString(enterpriseValueEbitda)).append("\n");
    sb.append("    enterpriseValueSales: ").append(toIndentedString(enterpriseValueSales)).append("\n");
    sb.append("    debtEquity: ").append(toIndentedString(debtEquity)).append("\n");
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

