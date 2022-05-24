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
 * Ratios.
 */
@ApiModel(description = "Ratios.")
@JsonPropertyOrder({
  InlineResponse20011ReportedKeyFiguresFirstFiscalYearRatios.JSON_PROPERTY_PRICE_SALES,
  InlineResponse20011ReportedKeyFiguresFirstFiscalYearRatios.JSON_PROPERTY_PRICE_EARNINGS,
  InlineResponse20011ReportedKeyFiguresFirstFiscalYearRatios.JSON_PROPERTY_PRICE_BOOK_VALUE,
  InlineResponse20011ReportedKeyFiguresFirstFiscalYearRatios.JSON_PROPERTY_PRICE_CASH_FLOW,
  InlineResponse20011ReportedKeyFiguresFirstFiscalYearRatios.JSON_PROPERTY_PRICE_FREE_CASH_FLOW,
  InlineResponse20011ReportedKeyFiguresFirstFiscalYearRatios.JSON_PROPERTY_DIVIDEND_YIELD,
  InlineResponse20011ReportedKeyFiguresFirstFiscalYearRatios.JSON_PROPERTY_ENTERPRISE_VALUE_EBIT,
  InlineResponse20011ReportedKeyFiguresFirstFiscalYearRatios.JSON_PROPERTY_ENTERPRISE_VALUE_EBITDA,
  InlineResponse20011ReportedKeyFiguresFirstFiscalYearRatios.JSON_PROPERTY_ENTERPRISE_VALUE_SALES,
  InlineResponse20011ReportedKeyFiguresFirstFiscalYearRatios.JSON_PROPERTY_DEBT_EQUITY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse20011ReportedKeyFiguresFirstFiscalYearRatios implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_PRICE_SALES = "priceSales";
  private BigDecimal priceSales;

  public static final String JSON_PROPERTY_PRICE_EARNINGS = "priceEarnings";
  private BigDecimal priceEarnings;

  public static final String JSON_PROPERTY_PRICE_BOOK_VALUE = "priceBookValue";
  private BigDecimal priceBookValue;

  public static final String JSON_PROPERTY_PRICE_CASH_FLOW = "priceCashFlow";
  private BigDecimal priceCashFlow;

  public static final String JSON_PROPERTY_PRICE_FREE_CASH_FLOW = "priceFreeCashFlow";
  private BigDecimal priceFreeCashFlow;

  public static final String JSON_PROPERTY_DIVIDEND_YIELD = "dividendYield";
  private BigDecimal dividendYield;

  public static final String JSON_PROPERTY_ENTERPRISE_VALUE_EBIT = "enterpriseValueEbit";
  private BigDecimal enterpriseValueEbit;

  public static final String JSON_PROPERTY_ENTERPRISE_VALUE_EBITDA = "enterpriseValueEbitda";
  private BigDecimal enterpriseValueEbitda;

  public static final String JSON_PROPERTY_ENTERPRISE_VALUE_SALES = "enterpriseValueSales";
  private BigDecimal enterpriseValueSales;

  public static final String JSON_PROPERTY_DEBT_EQUITY = "debtEquity";
  private BigDecimal debtEquity;

  public InlineResponse20011ReportedKeyFiguresFirstFiscalYearRatios() { 
  }

  public InlineResponse20011ReportedKeyFiguresFirstFiscalYearRatios priceSales(BigDecimal priceSales) {
    this.priceSales = priceSales;
    return this;
  }

   /**
   * Ratio of the price, divided by the total sales revenue per share.
   * @return priceSales
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Ratio of the price, divided by the total sales revenue per share.")
  @JsonProperty(JSON_PROPERTY_PRICE_SALES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getPriceSales() {
    return priceSales;
  }


  @JsonProperty(JSON_PROPERTY_PRICE_SALES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPriceSales(BigDecimal priceSales) {
    this.priceSales = priceSales;
  }


  public InlineResponse20011ReportedKeyFiguresFirstFiscalYearRatios priceEarnings(BigDecimal priceEarnings) {
    this.priceEarnings = priceEarnings;
    return this;
  }

   /**
   * Ratio of the price, divided by the reported earnings per share (basic or diluted) by the company.
   * @return priceEarnings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Ratio of the price, divided by the reported earnings per share (basic or diluted) by the company.")
  @JsonProperty(JSON_PROPERTY_PRICE_EARNINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getPriceEarnings() {
    return priceEarnings;
  }


  @JsonProperty(JSON_PROPERTY_PRICE_EARNINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPriceEarnings(BigDecimal priceEarnings) {
    this.priceEarnings = priceEarnings;
  }


  public InlineResponse20011ReportedKeyFiguresFirstFiscalYearRatios priceBookValue(BigDecimal priceBookValue) {
    this.priceBookValue = priceBookValue;
    return this;
  }

   /**
   * Ratio of the price, divided by the book value per share.
   * @return priceBookValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Ratio of the price, divided by the book value per share.")
  @JsonProperty(JSON_PROPERTY_PRICE_BOOK_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getPriceBookValue() {
    return priceBookValue;
  }


  @JsonProperty(JSON_PROPERTY_PRICE_BOOK_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPriceBookValue(BigDecimal priceBookValue) {
    this.priceBookValue = priceBookValue;
  }


  public InlineResponse20011ReportedKeyFiguresFirstFiscalYearRatios priceCashFlow(BigDecimal priceCashFlow) {
    this.priceCashFlow = priceCashFlow;
    return this;
  }

   /**
   * Ratio of the price, divided by the cash flow per share.
   * @return priceCashFlow
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Ratio of the price, divided by the cash flow per share.")
  @JsonProperty(JSON_PROPERTY_PRICE_CASH_FLOW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getPriceCashFlow() {
    return priceCashFlow;
  }


  @JsonProperty(JSON_PROPERTY_PRICE_CASH_FLOW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPriceCashFlow(BigDecimal priceCashFlow) {
    this.priceCashFlow = priceCashFlow;
  }


  public InlineResponse20011ReportedKeyFiguresFirstFiscalYearRatios priceFreeCashFlow(BigDecimal priceFreeCashFlow) {
    this.priceFreeCashFlow = priceFreeCashFlow;
    return this;
  }

   /**
   * Ratio of the price, divided by the free (i.e. without subtraction of dividends) cash flow per share.
   * @return priceFreeCashFlow
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Ratio of the price, divided by the free (i.e. without subtraction of dividends) cash flow per share.")
  @JsonProperty(JSON_PROPERTY_PRICE_FREE_CASH_FLOW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getPriceFreeCashFlow() {
    return priceFreeCashFlow;
  }


  @JsonProperty(JSON_PROPERTY_PRICE_FREE_CASH_FLOW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPriceFreeCashFlow(BigDecimal priceFreeCashFlow) {
    this.priceFreeCashFlow = priceFreeCashFlow;
  }


  public InlineResponse20011ReportedKeyFiguresFirstFiscalYearRatios dividendYield(BigDecimal dividendYield) {
    this.dividendYield = dividendYield;
    return this;
  }

   /**
   * Ratio of the dividend per share, divided by the price.
   * @return dividendYield
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Ratio of the dividend per share, divided by the price.")
  @JsonProperty(JSON_PROPERTY_DIVIDEND_YIELD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getDividendYield() {
    return dividendYield;
  }


  @JsonProperty(JSON_PROPERTY_DIVIDEND_YIELD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDividendYield(BigDecimal dividendYield) {
    this.dividendYield = dividendYield;
  }


  public InlineResponse20011ReportedKeyFiguresFirstFiscalYearRatios enterpriseValueEbit(BigDecimal enterpriseValueEbit) {
    this.enterpriseValueEbit = enterpriseValueEbit;
    return this;
  }

   /**
   * Ratio of the enterprise value, divided by the EBIT.
   * @return enterpriseValueEbit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Ratio of the enterprise value, divided by the EBIT.")
  @JsonProperty(JSON_PROPERTY_ENTERPRISE_VALUE_EBIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getEnterpriseValueEbit() {
    return enterpriseValueEbit;
  }


  @JsonProperty(JSON_PROPERTY_ENTERPRISE_VALUE_EBIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnterpriseValueEbit(BigDecimal enterpriseValueEbit) {
    this.enterpriseValueEbit = enterpriseValueEbit;
  }


  public InlineResponse20011ReportedKeyFiguresFirstFiscalYearRatios enterpriseValueEbitda(BigDecimal enterpriseValueEbitda) {
    this.enterpriseValueEbitda = enterpriseValueEbitda;
    return this;
  }

   /**
   * Ratio of the enterprise value, divided by the EBITDA.
   * @return enterpriseValueEbitda
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Ratio of the enterprise value, divided by the EBITDA.")
  @JsonProperty(JSON_PROPERTY_ENTERPRISE_VALUE_EBITDA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getEnterpriseValueEbitda() {
    return enterpriseValueEbitda;
  }


  @JsonProperty(JSON_PROPERTY_ENTERPRISE_VALUE_EBITDA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnterpriseValueEbitda(BigDecimal enterpriseValueEbitda) {
    this.enterpriseValueEbitda = enterpriseValueEbitda;
  }


  public InlineResponse20011ReportedKeyFiguresFirstFiscalYearRatios enterpriseValueSales(BigDecimal enterpriseValueSales) {
    this.enterpriseValueSales = enterpriseValueSales;
    return this;
  }

   /**
   * Ratio of the enterprise value, divided by the total amount of sales revenue.
   * @return enterpriseValueSales
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Ratio of the enterprise value, divided by the total amount of sales revenue.")
  @JsonProperty(JSON_PROPERTY_ENTERPRISE_VALUE_SALES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getEnterpriseValueSales() {
    return enterpriseValueSales;
  }


  @JsonProperty(JSON_PROPERTY_ENTERPRISE_VALUE_SALES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnterpriseValueSales(BigDecimal enterpriseValueSales) {
    this.enterpriseValueSales = enterpriseValueSales;
  }


  public InlineResponse20011ReportedKeyFiguresFirstFiscalYearRatios debtEquity(BigDecimal debtEquity) {
    this.debtEquity = debtEquity;
    return this;
  }

   /**
   * Total-debt-to-total-equity ratio, which is the ratio of the total debt, divided by the total shareholders&#39; equity.
   * @return debtEquity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Total-debt-to-total-equity ratio, which is the ratio of the total debt, divided by the total shareholders' equity.")
  @JsonProperty(JSON_PROPERTY_DEBT_EQUITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getDebtEquity() {
    return debtEquity;
  }


  @JsonProperty(JSON_PROPERTY_DEBT_EQUITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDebtEquity(BigDecimal debtEquity) {
    this.debtEquity = debtEquity;
  }


  /**
   * Return true if this inline_response_200_11_reportedKeyFigures_firstFiscalYear_ratios object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20011ReportedKeyFiguresFirstFiscalYearRatios inlineResponse20011ReportedKeyFiguresFirstFiscalYearRatios = (InlineResponse20011ReportedKeyFiguresFirstFiscalYearRatios) o;
    return Objects.equals(this.priceSales, inlineResponse20011ReportedKeyFiguresFirstFiscalYearRatios.priceSales) &&
        Objects.equals(this.priceEarnings, inlineResponse20011ReportedKeyFiguresFirstFiscalYearRatios.priceEarnings) &&
        Objects.equals(this.priceBookValue, inlineResponse20011ReportedKeyFiguresFirstFiscalYearRatios.priceBookValue) &&
        Objects.equals(this.priceCashFlow, inlineResponse20011ReportedKeyFiguresFirstFiscalYearRatios.priceCashFlow) &&
        Objects.equals(this.priceFreeCashFlow, inlineResponse20011ReportedKeyFiguresFirstFiscalYearRatios.priceFreeCashFlow) &&
        Objects.equals(this.dividendYield, inlineResponse20011ReportedKeyFiguresFirstFiscalYearRatios.dividendYield) &&
        Objects.equals(this.enterpriseValueEbit, inlineResponse20011ReportedKeyFiguresFirstFiscalYearRatios.enterpriseValueEbit) &&
        Objects.equals(this.enterpriseValueEbitda, inlineResponse20011ReportedKeyFiguresFirstFiscalYearRatios.enterpriseValueEbitda) &&
        Objects.equals(this.enterpriseValueSales, inlineResponse20011ReportedKeyFiguresFirstFiscalYearRatios.enterpriseValueSales) &&
        Objects.equals(this.debtEquity, inlineResponse20011ReportedKeyFiguresFirstFiscalYearRatios.debtEquity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(priceSales, priceEarnings, priceBookValue, priceCashFlow, priceFreeCashFlow, dividendYield, enterpriseValueEbit, enterpriseValueEbitda, enterpriseValueSales, debtEquity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20011ReportedKeyFiguresFirstFiscalYearRatios {\n");
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

