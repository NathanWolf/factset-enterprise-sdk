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
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse2005DataSimpleMovingAverageTradingDaysSinceCrossoverSma50vs200Down;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse2005DataSimpleMovingAverageTradingDaysSinceCrossoverSma50vs200Up;
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
 * Value ranges of the number of trading days since a crossover of the SMA 50 and the SMA 200.
 */
@ApiModel(description = "Value ranges of the number of trading days since a crossover of the SMA 50 and the SMA 200.")
@JsonPropertyOrder({
  InlineResponse2005DataSimpleMovingAverageTradingDaysSinceCrossoverSma50vs200.JSON_PROPERTY_UP,
  InlineResponse2005DataSimpleMovingAverageTradingDaysSinceCrossoverSma50vs200.JSON_PROPERTY_DOWN
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse2005DataSimpleMovingAverageTradingDaysSinceCrossoverSma50vs200 implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_UP = "up";
  private InlineResponse2005DataSimpleMovingAverageTradingDaysSinceCrossoverSma50vs200Up up;

  public static final String JSON_PROPERTY_DOWN = "down";
  private InlineResponse2005DataSimpleMovingAverageTradingDaysSinceCrossoverSma50vs200Down down;


  public InlineResponse2005DataSimpleMovingAverageTradingDaysSinceCrossoverSma50vs200 up(InlineResponse2005DataSimpleMovingAverageTradingDaysSinceCrossoverSma50vs200Up up) {
    this.up = up;
    return this;
  }

   /**
   * Get up
   * @return up
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_UP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2005DataSimpleMovingAverageTradingDaysSinceCrossoverSma50vs200Up getUp() {
    return up;
  }


  @JsonProperty(JSON_PROPERTY_UP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUp(InlineResponse2005DataSimpleMovingAverageTradingDaysSinceCrossoverSma50vs200Up up) {
    this.up = up;
  }


  public InlineResponse2005DataSimpleMovingAverageTradingDaysSinceCrossoverSma50vs200 down(InlineResponse2005DataSimpleMovingAverageTradingDaysSinceCrossoverSma50vs200Down down) {
    this.down = down;
    return this;
  }

   /**
   * Get down
   * @return down
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DOWN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2005DataSimpleMovingAverageTradingDaysSinceCrossoverSma50vs200Down getDown() {
    return down;
  }


  @JsonProperty(JSON_PROPERTY_DOWN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDown(InlineResponse2005DataSimpleMovingAverageTradingDaysSinceCrossoverSma50vs200Down down) {
    this.down = down;
  }


  /**
   * Return true if this inline_response_200_5_data_simpleMovingAverage_tradingDaysSinceCrossover_sma50vs200 object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2005DataSimpleMovingAverageTradingDaysSinceCrossoverSma50vs200 inlineResponse2005DataSimpleMovingAverageTradingDaysSinceCrossoverSma50vs200 = (InlineResponse2005DataSimpleMovingAverageTradingDaysSinceCrossoverSma50vs200) o;
    return Objects.equals(this.up, inlineResponse2005DataSimpleMovingAverageTradingDaysSinceCrossoverSma50vs200.up) &&
        Objects.equals(this.down, inlineResponse2005DataSimpleMovingAverageTradingDaysSinceCrossoverSma50vs200.down);
  }

  @Override
  public int hashCode() {
    return Objects.hash(up, down);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2005DataSimpleMovingAverageTradingDaysSinceCrossoverSma50vs200 {\n");
    sb.append("    up: ").append(toIndentedString(up)).append("\n");
    sb.append("    down: ").append(toIndentedString(down)).append("\n");
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

