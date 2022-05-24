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
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse200PerShareCashFlow;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse200PerShareDividends;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse200PerShareEarnings;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse200PerShareNetAssetValue;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse200PerShareSales;
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
 * Estimates for selected per-share figures.
 */
@ApiModel(description = "Estimates for selected per-share figures.")
@JsonPropertyOrder({
  InlineResponse200PerShare.JSON_PROPERTY_DIVIDENDS,
  InlineResponse200PerShare.JSON_PROPERTY_EARNINGS,
  InlineResponse200PerShare.JSON_PROPERTY_CASH_FLOW,
  InlineResponse200PerShare.JSON_PROPERTY_SALES,
  InlineResponse200PerShare.JSON_PROPERTY_NET_ASSET_VALUE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse200PerShare implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_DIVIDENDS = "dividends";
  private InlineResponse200PerShareDividends dividends;

  public static final String JSON_PROPERTY_EARNINGS = "earnings";
  private InlineResponse200PerShareEarnings earnings;

  public static final String JSON_PROPERTY_CASH_FLOW = "cashFlow";
  private InlineResponse200PerShareCashFlow cashFlow;

  public static final String JSON_PROPERTY_SALES = "sales";
  private InlineResponse200PerShareSales sales;

  public static final String JSON_PROPERTY_NET_ASSET_VALUE = "netAssetValue";
  private InlineResponse200PerShareNetAssetValue netAssetValue;

  public InlineResponse200PerShare() { 
  }

  public InlineResponse200PerShare dividends(InlineResponse200PerShareDividends dividends) {
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

  public InlineResponse200PerShareDividends getDividends() {
    return dividends;
  }


  @JsonProperty(JSON_PROPERTY_DIVIDENDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDividends(InlineResponse200PerShareDividends dividends) {
    this.dividends = dividends;
  }


  public InlineResponse200PerShare earnings(InlineResponse200PerShareEarnings earnings) {
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

  public InlineResponse200PerShareEarnings getEarnings() {
    return earnings;
  }


  @JsonProperty(JSON_PROPERTY_EARNINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEarnings(InlineResponse200PerShareEarnings earnings) {
    this.earnings = earnings;
  }


  public InlineResponse200PerShare cashFlow(InlineResponse200PerShareCashFlow cashFlow) {
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

  public InlineResponse200PerShareCashFlow getCashFlow() {
    return cashFlow;
  }


  @JsonProperty(JSON_PROPERTY_CASH_FLOW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCashFlow(InlineResponse200PerShareCashFlow cashFlow) {
    this.cashFlow = cashFlow;
  }


  public InlineResponse200PerShare sales(InlineResponse200PerShareSales sales) {
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

  public InlineResponse200PerShareSales getSales() {
    return sales;
  }


  @JsonProperty(JSON_PROPERTY_SALES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSales(InlineResponse200PerShareSales sales) {
    this.sales = sales;
  }


  public InlineResponse200PerShare netAssetValue(InlineResponse200PerShareNetAssetValue netAssetValue) {
    this.netAssetValue = netAssetValue;
    return this;
  }

   /**
   * Get netAssetValue
   * @return netAssetValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NET_ASSET_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse200PerShareNetAssetValue getNetAssetValue() {
    return netAssetValue;
  }


  @JsonProperty(JSON_PROPERTY_NET_ASSET_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNetAssetValue(InlineResponse200PerShareNetAssetValue netAssetValue) {
    this.netAssetValue = netAssetValue;
  }


  /**
   * Return true if this inline_response_200_perShare object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200PerShare inlineResponse200PerShare = (InlineResponse200PerShare) o;
    return Objects.equals(this.dividends, inlineResponse200PerShare.dividends) &&
        Objects.equals(this.earnings, inlineResponse200PerShare.earnings) &&
        Objects.equals(this.cashFlow, inlineResponse200PerShare.cashFlow) &&
        Objects.equals(this.sales, inlineResponse200PerShare.sales) &&
        Objects.equals(this.netAssetValue, inlineResponse200PerShare.netAssetValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dividends, earnings, cashFlow, sales, netAssetValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200PerShare {\n");
    sb.append("    dividends: ").append(toIndentedString(dividends)).append("\n");
    sb.append("    earnings: ").append(toIndentedString(earnings)).append("\n");
    sb.append("    cashFlow: ").append(toIndentedString(cashFlow)).append("\n");
    sb.append("    sales: ").append(toIndentedString(sales)).append("\n");
    sb.append("    netAssetValue: ").append(toIndentedString(netAssetValue)).append("\n");
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

