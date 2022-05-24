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
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse2005DataSimpleMovingAverageTradingDaysSinceCrossoverSma20vs50UpNumberDays;
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
 * Value range of the down direction, i.e. the SMA 20 crossed the SMA 50 from above, hence the SMA 20 has currently a lower value.
 */
@ApiModel(description = "Value range of the down direction, i.e. the SMA 20 crossed the SMA 50 from above, hence the SMA 20 has currently a lower value.")
@JsonPropertyOrder({
  InlineResponse2005DataSimpleMovingAverageTradingDaysSinceCrossoverSma20vs50Down.JSON_PROPERTY_NUMBER_DAYS,
  InlineResponse2005DataSimpleMovingAverageTradingDaysSinceCrossoverSma20vs50Down.JSON_PROPERTY_COUNT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse2005DataSimpleMovingAverageTradingDaysSinceCrossoverSma20vs50Down implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_NUMBER_DAYS = "numberDays";
  private InlineResponse2005DataSimpleMovingAverageTradingDaysSinceCrossoverSma20vs50UpNumberDays numberDays;

  public static final String JSON_PROPERTY_COUNT = "count";
  private BigDecimal count;

  public InlineResponse2005DataSimpleMovingAverageTradingDaysSinceCrossoverSma20vs50Down() { 
  }

  public InlineResponse2005DataSimpleMovingAverageTradingDaysSinceCrossoverSma20vs50Down numberDays(InlineResponse2005DataSimpleMovingAverageTradingDaysSinceCrossoverSma20vs50UpNumberDays numberDays) {
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

  public InlineResponse2005DataSimpleMovingAverageTradingDaysSinceCrossoverSma20vs50UpNumberDays getNumberDays() {
    return numberDays;
  }


  @JsonProperty(JSON_PROPERTY_NUMBER_DAYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumberDays(InlineResponse2005DataSimpleMovingAverageTradingDaysSinceCrossoverSma20vs50UpNumberDays numberDays) {
    this.numberDays = numberDays;
  }


  public InlineResponse2005DataSimpleMovingAverageTradingDaysSinceCrossoverSma20vs50Down count(BigDecimal count) {
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
   * Return true if this inline_response_200_5_data_simpleMovingAverage_tradingDaysSinceCrossover_sma20vs50_down object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2005DataSimpleMovingAverageTradingDaysSinceCrossoverSma20vs50Down inlineResponse2005DataSimpleMovingAverageTradingDaysSinceCrossoverSma20vs50Down = (InlineResponse2005DataSimpleMovingAverageTradingDaysSinceCrossoverSma20vs50Down) o;
    return Objects.equals(this.numberDays, inlineResponse2005DataSimpleMovingAverageTradingDaysSinceCrossoverSma20vs50Down.numberDays) &&
        Objects.equals(this.count, inlineResponse2005DataSimpleMovingAverageTradingDaysSinceCrossoverSma20vs50Down.count);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numberDays, count);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2005DataSimpleMovingAverageTradingDaysSinceCrossoverSma20vs50Down {\n");
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

