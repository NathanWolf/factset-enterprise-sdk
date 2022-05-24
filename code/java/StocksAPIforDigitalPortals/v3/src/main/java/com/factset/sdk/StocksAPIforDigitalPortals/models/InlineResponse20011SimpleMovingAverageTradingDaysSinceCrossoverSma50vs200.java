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
 * Number of trading days since the crossover and direction thereof of the SMA 50 (see parameter &#x60;simpleMovingAverage.days50&#x60;) and the SMA 200 (see parameter &#x60;simpleMovingAverage.days200&#x60;). Only crossovers which occurred in the most recent 300 trading days are considered, hence the attribute &#x60;sma50vs200.numberDays&#x60; cannot exceed the value 300.
 */
@ApiModel(description = "Number of trading days since the crossover and direction thereof of the SMA 50 (see parameter `simpleMovingAverage.days50`) and the SMA 200 (see parameter `simpleMovingAverage.days200`). Only crossovers which occurred in the most recent 300 trading days are considered, hence the attribute `sma50vs200.numberDays` cannot exceed the value 300.")
@JsonPropertyOrder({
  InlineResponse20011SimpleMovingAverageTradingDaysSinceCrossoverSma50vs200.JSON_PROPERTY_NUMBER_DAYS,
  InlineResponse20011SimpleMovingAverageTradingDaysSinceCrossoverSma50vs200.JSON_PROPERTY_DIRECTION
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse20011SimpleMovingAverageTradingDaysSinceCrossoverSma50vs200 implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_NUMBER_DAYS = "numberDays";
  private BigDecimal numberDays;

  /**
   * Direction of the crossing.
   */
  public enum DirectionEnum {
    UP("up"),
    
    DOWN("down");

    private String value;

    DirectionEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static DirectionEnum fromValue(String value) {
      for (DirectionEnum b : DirectionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_DIRECTION = "direction";
  private DirectionEnum direction;

  public InlineResponse20011SimpleMovingAverageTradingDaysSinceCrossoverSma50vs200() { 
  }

  public InlineResponse20011SimpleMovingAverageTradingDaysSinceCrossoverSma50vs200 numberDays(BigDecimal numberDays) {
    this.numberDays = numberDays;
    return this;
  }

   /**
   * Number of trading days.
   * @return numberDays
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of trading days.")
  @JsonProperty(JSON_PROPERTY_NUMBER_DAYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getNumberDays() {
    return numberDays;
  }


  @JsonProperty(JSON_PROPERTY_NUMBER_DAYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumberDays(BigDecimal numberDays) {
    this.numberDays = numberDays;
  }


  public InlineResponse20011SimpleMovingAverageTradingDaysSinceCrossoverSma50vs200 direction(DirectionEnum direction) {
    this.direction = direction;
    return this;
  }

   /**
   * Direction of the crossing.
   * @return direction
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Direction of the crossing.")
  @JsonProperty(JSON_PROPERTY_DIRECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DirectionEnum getDirection() {
    return direction;
  }


  @JsonProperty(JSON_PROPERTY_DIRECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDirection(DirectionEnum direction) {
    this.direction = direction;
  }


  /**
   * Return true if this inline_response_200_11_simpleMovingAverage_tradingDaysSinceCrossover_sma50vs200 object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20011SimpleMovingAverageTradingDaysSinceCrossoverSma50vs200 inlineResponse20011SimpleMovingAverageTradingDaysSinceCrossoverSma50vs200 = (InlineResponse20011SimpleMovingAverageTradingDaysSinceCrossoverSma50vs200) o;
    return Objects.equals(this.numberDays, inlineResponse20011SimpleMovingAverageTradingDaysSinceCrossoverSma50vs200.numberDays) &&
        Objects.equals(this.direction, inlineResponse20011SimpleMovingAverageTradingDaysSinceCrossoverSma50vs200.direction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numberDays, direction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20011SimpleMovingAverageTradingDaysSinceCrossoverSma50vs200 {\n");
    sb.append("    numberDays: ").append(toIndentedString(numberDays)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
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

