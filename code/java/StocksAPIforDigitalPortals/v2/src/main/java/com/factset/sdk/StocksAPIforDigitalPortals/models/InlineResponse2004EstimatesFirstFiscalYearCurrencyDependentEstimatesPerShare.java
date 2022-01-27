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
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimatesPerShareCashFlow;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimatesPerShareDividends;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimatesPerShareEarnings;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimatesPerShareSales;
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
 * Per-share figures.
 */
@ApiModel(description = "Per-share figures.")
@JsonPropertyOrder({
  InlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimatesPerShare.JSON_PROPERTY_SALES,
  InlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimatesPerShare.JSON_PROPERTY_EARNINGS,
  InlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimatesPerShare.JSON_PROPERTY_DIVIDENDS,
  InlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimatesPerShare.JSON_PROPERTY_CASH_FLOW
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimatesPerShare implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_SALES = "sales";
  private InlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimatesPerShareSales sales;

  public static final String JSON_PROPERTY_EARNINGS = "earnings";
  private InlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimatesPerShareEarnings earnings;

  public static final String JSON_PROPERTY_DIVIDENDS = "dividends";
  private InlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimatesPerShareDividends dividends;

  public static final String JSON_PROPERTY_CASH_FLOW = "cashFlow";
  private InlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimatesPerShareCashFlow cashFlow;


  public InlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimatesPerShare sales(InlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimatesPerShareSales sales) {
    this.sales = sales;
    return this;
  }

   /**
   * Get sales
   * @return sales
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SALES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimatesPerShareSales getSales() {
    return sales;
  }


  @JsonProperty(JSON_PROPERTY_SALES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSales(InlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimatesPerShareSales sales) {
    this.sales = sales;
  }


  public InlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimatesPerShare earnings(InlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimatesPerShareEarnings earnings) {
    this.earnings = earnings;
    return this;
  }

   /**
   * Get earnings
   * @return earnings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EARNINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimatesPerShareEarnings getEarnings() {
    return earnings;
  }


  @JsonProperty(JSON_PROPERTY_EARNINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEarnings(InlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimatesPerShareEarnings earnings) {
    this.earnings = earnings;
  }


  public InlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimatesPerShare dividends(InlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimatesPerShareDividends dividends) {
    this.dividends = dividends;
    return this;
  }

   /**
   * Get dividends
   * @return dividends
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DIVIDENDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimatesPerShareDividends getDividends() {
    return dividends;
  }


  @JsonProperty(JSON_PROPERTY_DIVIDENDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDividends(InlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimatesPerShareDividends dividends) {
    this.dividends = dividends;
  }


  public InlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimatesPerShare cashFlow(InlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimatesPerShareCashFlow cashFlow) {
    this.cashFlow = cashFlow;
    return this;
  }

   /**
   * Get cashFlow
   * @return cashFlow
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CASH_FLOW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimatesPerShareCashFlow getCashFlow() {
    return cashFlow;
  }


  @JsonProperty(JSON_PROPERTY_CASH_FLOW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCashFlow(InlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimatesPerShareCashFlow cashFlow) {
    this.cashFlow = cashFlow;
  }


  /**
   * Return true if this inline_response_200_4_estimates_firstFiscalYear_currencyDependentEstimates_perShare object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimatesPerShare inlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimatesPerShare = (InlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimatesPerShare) o;
    return Objects.equals(this.sales, inlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimatesPerShare.sales) &&
        Objects.equals(this.earnings, inlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimatesPerShare.earnings) &&
        Objects.equals(this.dividends, inlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimatesPerShare.dividends) &&
        Objects.equals(this.cashFlow, inlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimatesPerShare.cashFlow);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sales, earnings, dividends, cashFlow);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimatesPerShare {\n");
    sb.append("    sales: ").append(toIndentedString(sales)).append("\n");
    sb.append("    earnings: ").append(toIndentedString(earnings)).append("\n");
    sb.append("    dividends: ").append(toIndentedString(dividends)).append("\n");
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

