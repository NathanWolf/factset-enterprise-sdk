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
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse20011SimpleMovingAverageTradingDaysSinceCrossover;
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
 * Simple moving average (SMA), that is the arithmetic mean of a notation’s EOD closing price, for different time ranges.
 */
@ApiModel(description = "Simple moving average (SMA), that is the arithmetic mean of a notation’s EOD closing price, for different time ranges.")
@JsonPropertyOrder({
  InlineResponse20011SimpleMovingAverage.JSON_PROPERTY_DAYS20,
  InlineResponse20011SimpleMovingAverage.JSON_PROPERTY_DAYS50,
  InlineResponse20011SimpleMovingAverage.JSON_PROPERTY_DAYS200,
  InlineResponse20011SimpleMovingAverage.JSON_PROPERTY_TRADING_DAYS_SINCE_CROSSOVER
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse20011SimpleMovingAverage implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_DAYS20 = "days20";
  private BigDecimal days20;

  public static final String JSON_PROPERTY_DAYS50 = "days50";
  private BigDecimal days50;

  public static final String JSON_PROPERTY_DAYS200 = "days200";
  private BigDecimal days200;

  public static final String JSON_PROPERTY_TRADING_DAYS_SINCE_CROSSOVER = "tradingDaysSinceCrossover";
  private InlineResponse20011SimpleMovingAverageTradingDaysSinceCrossover tradingDaysSinceCrossover;

  public InlineResponse20011SimpleMovingAverage() { 
  }

  public InlineResponse20011SimpleMovingAverage days20(BigDecimal days20) {
    this.days20 = days20;
    return this;
  }

   /**
   * 20 trading days.
   * @return days20
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "20 trading days.")
  @JsonProperty(JSON_PROPERTY_DAYS20)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getDays20() {
    return days20;
  }


  @JsonProperty(JSON_PROPERTY_DAYS20)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDays20(BigDecimal days20) {
    this.days20 = days20;
  }


  public InlineResponse20011SimpleMovingAverage days50(BigDecimal days50) {
    this.days50 = days50;
    return this;
  }

   /**
   * 50 trading days.
   * @return days50
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "50 trading days.")
  @JsonProperty(JSON_PROPERTY_DAYS50)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getDays50() {
    return days50;
  }


  @JsonProperty(JSON_PROPERTY_DAYS50)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDays50(BigDecimal days50) {
    this.days50 = days50;
  }


  public InlineResponse20011SimpleMovingAverage days200(BigDecimal days200) {
    this.days200 = days200;
    return this;
  }

   /**
   * 200 trading days.
   * @return days200
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "200 trading days.")
  @JsonProperty(JSON_PROPERTY_DAYS200)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getDays200() {
    return days200;
  }


  @JsonProperty(JSON_PROPERTY_DAYS200)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDays200(BigDecimal days200) {
    this.days200 = days200;
  }


  public InlineResponse20011SimpleMovingAverage tradingDaysSinceCrossover(InlineResponse20011SimpleMovingAverageTradingDaysSinceCrossover tradingDaysSinceCrossover) {
    this.tradingDaysSinceCrossover = tradingDaysSinceCrossover;
    return this;
  }

   /**
   * Get tradingDaysSinceCrossover
   * @return tradingDaysSinceCrossover
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TRADING_DAYS_SINCE_CROSSOVER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse20011SimpleMovingAverageTradingDaysSinceCrossover getTradingDaysSinceCrossover() {
    return tradingDaysSinceCrossover;
  }


  @JsonProperty(JSON_PROPERTY_TRADING_DAYS_SINCE_CROSSOVER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTradingDaysSinceCrossover(InlineResponse20011SimpleMovingAverageTradingDaysSinceCrossover tradingDaysSinceCrossover) {
    this.tradingDaysSinceCrossover = tradingDaysSinceCrossover;
  }


  /**
   * Return true if this inline_response_200_11_simpleMovingAverage object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20011SimpleMovingAverage inlineResponse20011SimpleMovingAverage = (InlineResponse20011SimpleMovingAverage) o;
    return Objects.equals(this.days20, inlineResponse20011SimpleMovingAverage.days20) &&
        Objects.equals(this.days50, inlineResponse20011SimpleMovingAverage.days50) &&
        Objects.equals(this.days200, inlineResponse20011SimpleMovingAverage.days200) &&
        Objects.equals(this.tradingDaysSinceCrossover, inlineResponse20011SimpleMovingAverage.tradingDaysSinceCrossover);
  }

  @Override
  public int hashCode() {
    return Objects.hash(days20, days50, days200, tradingDaysSinceCrossover);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20011SimpleMovingAverage {\n");
    sb.append("    days20: ").append(toIndentedString(days20)).append("\n");
    sb.append("    days50: ").append(toIndentedString(days50)).append("\n");
    sb.append("    days200: ").append(toIndentedString(days200)).append("\n");
    sb.append("    tradingDaysSinceCrossover: ").append(toIndentedString(tradingDaysSinceCrossover)).append("\n");
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

