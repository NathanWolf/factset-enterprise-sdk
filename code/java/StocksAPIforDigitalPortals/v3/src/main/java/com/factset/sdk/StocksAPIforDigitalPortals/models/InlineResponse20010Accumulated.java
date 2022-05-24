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
 * Summary data accumulated over all trades of the current trading day.
 */
@ApiModel(description = "Summary data accumulated over all trades of the current trading day.")
@JsonPropertyOrder({
  InlineResponse20010Accumulated.JSON_PROPERTY_NUMBER_TRADES,
  InlineResponse20010Accumulated.JSON_PROPERTY_TRADING_VOLUME,
  InlineResponse20010Accumulated.JSON_PROPERTY_TRADING_VALUE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse20010Accumulated implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_NUMBER_TRADES = "numberTrades";
  private BigDecimal numberTrades;

  public static final String JSON_PROPERTY_TRADING_VOLUME = "tradingVolume";
  private BigDecimal tradingVolume;

  public static final String JSON_PROPERTY_TRADING_VALUE = "tradingValue";
  private BigDecimal tradingValue;

  public InlineResponse20010Accumulated() { 
  }

  public InlineResponse20010Accumulated numberTrades(BigDecimal numberTrades) {
    this.numberTrades = numberTrades;
    return this;
  }

   /**
   * Number of trades.
   * @return numberTrades
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of trades.")
  @JsonProperty(JSON_PROPERTY_NUMBER_TRADES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getNumberTrades() {
    return numberTrades;
  }


  @JsonProperty(JSON_PROPERTY_NUMBER_TRADES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumberTrades(BigDecimal numberTrades) {
    this.numberTrades = numberTrades;
  }


  public InlineResponse20010Accumulated tradingVolume(BigDecimal tradingVolume) {
    this.tradingVolume = tradingVolume;
    return this;
  }

   /**
   * Number of shares traded.
   * @return tradingVolume
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of shares traded.")
  @JsonProperty(JSON_PROPERTY_TRADING_VOLUME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getTradingVolume() {
    return tradingVolume;
  }


  @JsonProperty(JSON_PROPERTY_TRADING_VOLUME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTradingVolume(BigDecimal tradingVolume) {
    this.tradingVolume = tradingVolume;
  }


  public InlineResponse20010Accumulated tradingValue(BigDecimal tradingValue) {
    this.tradingValue = tradingValue;
    return this;
  }

   /**
   * Monetary equivalent (cash value) of the trades. See attribute &#x60;currency&#x60; for its currency.
   * @return tradingValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Monetary equivalent (cash value) of the trades. See attribute `currency` for its currency.")
  @JsonProperty(JSON_PROPERTY_TRADING_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getTradingValue() {
    return tradingValue;
  }


  @JsonProperty(JSON_PROPERTY_TRADING_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTradingValue(BigDecimal tradingValue) {
    this.tradingValue = tradingValue;
  }


  /**
   * Return true if this inline_response_200_10_accumulated object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20010Accumulated inlineResponse20010Accumulated = (InlineResponse20010Accumulated) o;
    return Objects.equals(this.numberTrades, inlineResponse20010Accumulated.numberTrades) &&
        Objects.equals(this.tradingVolume, inlineResponse20010Accumulated.tradingVolume) &&
        Objects.equals(this.tradingValue, inlineResponse20010Accumulated.tradingValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numberTrades, tradingVolume, tradingValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20010Accumulated {\n");
    sb.append("    numberTrades: ").append(toIndentedString(numberTrades)).append("\n");
    sb.append("    tradingVolume: ").append(toIndentedString(tradingVolume)).append("\n");
    sb.append("    tradingValue: ").append(toIndentedString(tradingValue)).append("\n");
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

