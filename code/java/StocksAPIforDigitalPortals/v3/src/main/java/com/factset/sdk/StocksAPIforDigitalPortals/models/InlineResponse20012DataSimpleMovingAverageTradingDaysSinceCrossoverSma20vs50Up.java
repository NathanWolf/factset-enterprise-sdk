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
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse20012DataSimpleMovingAverageTradingDaysSinceCrossoverSma20vs50UpNumberDays;
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
 * Value range of the up direction, i.e. the SMA 20 crossed the SMA 50 from below, hence the SMA 20 has currently a higher value.
 */
@ApiModel(description = "Value range of the up direction, i.e. the SMA 20 crossed the SMA 50 from below, hence the SMA 20 has currently a higher value.")
@JsonPropertyOrder({
  InlineResponse20012DataSimpleMovingAverageTradingDaysSinceCrossoverSma20vs50Up.JSON_PROPERTY_NUMBER_DAYS,
  InlineResponse20012DataSimpleMovingAverageTradingDaysSinceCrossoverSma20vs50Up.JSON_PROPERTY_COUNT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse20012DataSimpleMovingAverageTradingDaysSinceCrossoverSma20vs50Up implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_NUMBER_DAYS = "numberDays";
  private InlineResponse20012DataSimpleMovingAverageTradingDaysSinceCrossoverSma20vs50UpNumberDays numberDays;

  public static final String JSON_PROPERTY_COUNT = "count";
  private BigDecimal count;

  public InlineResponse20012DataSimpleMovingAverageTradingDaysSinceCrossoverSma20vs50Up() { 
  }

  public InlineResponse20012DataSimpleMovingAverageTradingDaysSinceCrossoverSma20vs50Up numberDays(InlineResponse20012DataSimpleMovingAverageTradingDaysSinceCrossoverSma20vs50UpNumberDays numberDays) {
    this.numberDays = numberDays;
    return this;
  }

   /**
   * Get numberDays
   * @return numberDays
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NUMBER_DAYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse20012DataSimpleMovingAverageTradingDaysSinceCrossoverSma20vs50UpNumberDays getNumberDays() {
    return numberDays;
  }


  @JsonProperty(JSON_PROPERTY_NUMBER_DAYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumberDays(InlineResponse20012DataSimpleMovingAverageTradingDaysSinceCrossoverSma20vs50UpNumberDays numberDays) {
    this.numberDays = numberDays;
  }


  public InlineResponse20012DataSimpleMovingAverageTradingDaysSinceCrossoverSma20vs50Up count(BigDecimal count) {
    this.count = count;
    return this;
  }

   /**
   * Number of notations.
   * @return count
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of notations.")
  @JsonProperty(JSON_PROPERTY_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getCount() {
    return count;
  }


  @JsonProperty(JSON_PROPERTY_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCount(BigDecimal count) {
    this.count = count;
  }


  /**
   * Return true if this inline_response_200_12_data_simpleMovingAverage_tradingDaysSinceCrossover_sma20vs50_up object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20012DataSimpleMovingAverageTradingDaysSinceCrossoverSma20vs50Up inlineResponse20012DataSimpleMovingAverageTradingDaysSinceCrossoverSma20vs50Up = (InlineResponse20012DataSimpleMovingAverageTradingDaysSinceCrossoverSma20vs50Up) o;
    return Objects.equals(this.numberDays, inlineResponse20012DataSimpleMovingAverageTradingDaysSinceCrossoverSma20vs50Up.numberDays) &&
        Objects.equals(this.count, inlineResponse20012DataSimpleMovingAverageTradingDaysSinceCrossoverSma20vs50Up.count);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numberDays, count);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20012DataSimpleMovingAverageTradingDaysSinceCrossoverSma20vs50Up {\n");
    sb.append("    numberDays: ").append(toIndentedString(numberDays)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
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

