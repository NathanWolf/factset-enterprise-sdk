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
 * Per-share figures.
 */
@ApiModel(description = "Per-share figures.")
@JsonPropertyOrder({
  InlineResponse2004ReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFiguresPerShare.JSON_PROPERTY_SALES,
  InlineResponse2004ReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFiguresPerShare.JSON_PROPERTY_RECURRING_DILUTED_EARNINGS,
  InlineResponse2004ReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFiguresPerShare.JSON_PROPERTY_DIVIDENDS,
  InlineResponse2004ReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFiguresPerShare.JSON_PROPERTY_BOOK_VALUE,
  InlineResponse2004ReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFiguresPerShare.JSON_PROPERTY_CASH_FLOW
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse2004ReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFiguresPerShare implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_SALES = "sales";
  private BigDecimal sales;

  public static final String JSON_PROPERTY_RECURRING_DILUTED_EARNINGS = "recurringDilutedEarnings";
  private BigDecimal recurringDilutedEarnings;

  public static final String JSON_PROPERTY_DIVIDENDS = "dividends";
  private BigDecimal dividends;

  public static final String JSON_PROPERTY_BOOK_VALUE = "bookValue";
  private BigDecimal bookValue;

  public static final String JSON_PROPERTY_CASH_FLOW = "cashFlow";
  private BigDecimal cashFlow;


  public InlineResponse2004ReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFiguresPerShare sales(BigDecimal sales) {
    this.sales = sales;
    return this;
  }

   /**
   * Total sales revenue per share.
   * @return sales
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Total sales revenue per share.")
  @JsonProperty(JSON_PROPERTY_SALES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getSales() {
    return sales;
  }


  @JsonProperty(JSON_PROPERTY_SALES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSales(BigDecimal sales) {
    this.sales = sales;
  }


  public InlineResponse2004ReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFiguresPerShare recurringDilutedEarnings(BigDecimal recurringDilutedEarnings) {
    this.recurringDilutedEarnings = recurringDilutedEarnings;
    return this;
  }

   /**
   * Recurring (excluding extraordinary items) diluted earnings per share, which is the ratio of the net income excluding extraordinary items, divided by the diluted shares outstanding. An extraordinary item is an atypical and infrequent gain or loss due to an unforeseeable event.
   * @return recurringDilutedEarnings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Recurring (excluding extraordinary items) diluted earnings per share, which is the ratio of the net income excluding extraordinary items, divided by the diluted shares outstanding. An extraordinary item is an atypical and infrequent gain or loss due to an unforeseeable event.")
  @JsonProperty(JSON_PROPERTY_RECURRING_DILUTED_EARNINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getRecurringDilutedEarnings() {
    return recurringDilutedEarnings;
  }


  @JsonProperty(JSON_PROPERTY_RECURRING_DILUTED_EARNINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRecurringDilutedEarnings(BigDecimal recurringDilutedEarnings) {
    this.recurringDilutedEarnings = recurringDilutedEarnings;
  }


  public InlineResponse2004ReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFiguresPerShare dividends(BigDecimal dividends) {
    this.dividends = dividends;
    return this;
  }

   /**
   * Dividends per share, which is the ratio of the total dividends paid out, divided by the shares outstanding. In general, the figure is based on the gross dividend, i.e. before taxes, except for countries with special tax regimes.
   * @return dividends
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Dividends per share, which is the ratio of the total dividends paid out, divided by the shares outstanding. In general, the figure is based on the gross dividend, i.e. before taxes, except for countries with special tax regimes.")
  @JsonProperty(JSON_PROPERTY_DIVIDENDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getDividends() {
    return dividends;
  }


  @JsonProperty(JSON_PROPERTY_DIVIDENDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDividends(BigDecimal dividends) {
    this.dividends = dividends;
  }


  public InlineResponse2004ReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFiguresPerShare bookValue(BigDecimal bookValue) {
    this.bookValue = bookValue;
    return this;
  }

   /**
   * Book value per share, which is the ratio of the book value (common equity), divided by the shares outstanding.
   * @return bookValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Book value per share, which is the ratio of the book value (common equity), divided by the shares outstanding.")
  @JsonProperty(JSON_PROPERTY_BOOK_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getBookValue() {
    return bookValue;
  }


  @JsonProperty(JSON_PROPERTY_BOOK_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBookValue(BigDecimal bookValue) {
    this.bookValue = bookValue;
  }


  public InlineResponse2004ReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFiguresPerShare cashFlow(BigDecimal cashFlow) {
    this.cashFlow = cashFlow;
    return this;
  }

   /**
   * Cash flow per share, which is the ratio of the net operating cash flow, divided by the diluted shares outstanding.
   * @return cashFlow
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Cash flow per share, which is the ratio of the net operating cash flow, divided by the diluted shares outstanding.")
  @JsonProperty(JSON_PROPERTY_CASH_FLOW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getCashFlow() {
    return cashFlow;
  }


  @JsonProperty(JSON_PROPERTY_CASH_FLOW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCashFlow(BigDecimal cashFlow) {
    this.cashFlow = cashFlow;
  }


  /**
   * Return true if this inline_response_200_4_reportedKeyFigures_firstFiscalYear_currencyDependentKeyFigures_perShare object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2004ReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFiguresPerShare inlineResponse2004ReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFiguresPerShare = (InlineResponse2004ReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFiguresPerShare) o;
    return Objects.equals(this.sales, inlineResponse2004ReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFiguresPerShare.sales) &&
        Objects.equals(this.recurringDilutedEarnings, inlineResponse2004ReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFiguresPerShare.recurringDilutedEarnings) &&
        Objects.equals(this.dividends, inlineResponse2004ReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFiguresPerShare.dividends) &&
        Objects.equals(this.bookValue, inlineResponse2004ReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFiguresPerShare.bookValue) &&
        Objects.equals(this.cashFlow, inlineResponse2004ReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFiguresPerShare.cashFlow);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sales, recurringDilutedEarnings, dividends, bookValue, cashFlow);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2004ReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFiguresPerShare {\n");
    sb.append("    sales: ").append(toIndentedString(sales)).append("\n");
    sb.append("    recurringDilutedEarnings: ").append(toIndentedString(recurringDilutedEarnings)).append("\n");
    sb.append("    dividends: ").append(toIndentedString(dividends)).append("\n");
    sb.append("    bookValue: ").append(toIndentedString(bookValue)).append("\n");
    sb.append("    cashFlow: ").append(toIndentedString(cashFlow)).append("\n");
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

