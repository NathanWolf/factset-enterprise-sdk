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


package com.factset.sdk.TimeSeriesAPIforDigitalPortals.models;

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
import com.factset.sdk.TimeSeriesAPIforDigitalPortals.JSON;


/**
 * Single summary record. For the attributes first, last, low, high, see attribute &#x60;valueUnit&#x60; in endpoint &#x60;/prices/get&#x60; for their unit, except for price type yield, where the &#x60;valueUnit&#x60; is always &#x60;percent&#x60; (id&#x3D;258).
 */
@ApiModel(description = "Single summary record. For the attributes first, last, low, high, see attribute `valueUnit` in endpoint `/prices/get` for their unit, except for price type yield, where the `valueUnit` is always `percent` (id=258).")
@JsonPropertyOrder({
  InlineResponse2009DataSubsample.JSON_PROPERTY_TIME,
  InlineResponse2009DataSubsample.JSON_PROPERTY_FIRST,
  InlineResponse2009DataSubsample.JSON_PROPERTY_LAST,
  InlineResponse2009DataSubsample.JSON_PROPERTY_LOW,
  InlineResponse2009DataSubsample.JSON_PROPERTY_HIGH,
  InlineResponse2009DataSubsample.JSON_PROPERTY_TRADING_VOLUME,
  InlineResponse2009DataSubsample.JSON_PROPERTY_TRADING_VALUE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse2009DataSubsample implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_TIME = "time";
  private String time;

  public static final String JSON_PROPERTY_FIRST = "first";
  private BigDecimal first;

  public static final String JSON_PROPERTY_LAST = "last";
  private BigDecimal last;

  public static final String JSON_PROPERTY_LOW = "low";
  private BigDecimal low;

  public static final String JSON_PROPERTY_HIGH = "high";
  private BigDecimal high;

  public static final String JSON_PROPERTY_TRADING_VOLUME = "tradingVolume";
  private BigDecimal tradingVolume;

  public static final String JSON_PROPERTY_TRADING_VALUE = "tradingValue";
  private BigDecimal tradingValue;


  public InlineResponse2009DataSubsample time(String time) {
    this.time = time;
    return this;
  }

   /**
   * Date and time of the start of the subsample.
   * @return time
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date and time of the start of the subsample.")
  @JsonProperty(JSON_PROPERTY_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTime() {
    return time;
  }


  @JsonProperty(JSON_PROPERTY_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTime(String time) {
    this.time = time;
  }


  public InlineResponse2009DataSubsample first(BigDecimal first) {
    this.first = first;
    return this;
  }

   /**
   * First price of the subsample.
   * @return first
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "First price of the subsample.")
  @JsonProperty(JSON_PROPERTY_FIRST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getFirst() {
    return first;
  }


  @JsonProperty(JSON_PROPERTY_FIRST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFirst(BigDecimal first) {
    this.first = first;
  }


  public InlineResponse2009DataSubsample last(BigDecimal last) {
    this.last = last;
    return this;
  }

   /**
   * Last price of the subsample.
   * @return last
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Last price of the subsample.")
  @JsonProperty(JSON_PROPERTY_LAST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getLast() {
    return last;
  }


  @JsonProperty(JSON_PROPERTY_LAST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLast(BigDecimal last) {
    this.last = last;
  }


  public InlineResponse2009DataSubsample low(BigDecimal low) {
    this.low = low;
    return this;
  }

   /**
   * Lowest price of the subsample.
   * @return low
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Lowest price of the subsample.")
  @JsonProperty(JSON_PROPERTY_LOW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getLow() {
    return low;
  }


  @JsonProperty(JSON_PROPERTY_LOW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLow(BigDecimal low) {
    this.low = low;
  }


  public InlineResponse2009DataSubsample high(BigDecimal high) {
    this.high = high;
    return this;
  }

   /**
   * Highest price of the subsample.
   * @return high
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Highest price of the subsample.")
  @JsonProperty(JSON_PROPERTY_HIGH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getHigh() {
    return high;
  }


  @JsonProperty(JSON_PROPERTY_HIGH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHigh(BigDecimal high) {
    this.high = high;
  }


  public InlineResponse2009DataSubsample tradingVolume(BigDecimal tradingVolume) {
    this.tradingVolume = tradingVolume;
    return this;
  }

   /**
   * Accumulated number of units (e.g. shares) traded of the subsample. If the requested type of the price is ask, bid, or yield, the value is empty.
   * @return tradingVolume
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Accumulated number of units (e.g. shares) traded of the subsample. If the requested type of the price is ask, bid, or yield, the value is empty.")
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


  public InlineResponse2009DataSubsample tradingValue(BigDecimal tradingValue) {
    this.tradingValue = tradingValue;
    return this;
  }

   /**
   * Accumulated monetary equivalent (cash value) of the subsample. If the requested type of the price is ask, bid, or yield, the value is empty. See attribute &#x60;currency&#x60; in endpoint &#x60;/prices/get&#x60; for its unit.
   * @return tradingValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Accumulated monetary equivalent (cash value) of the subsample. If the requested type of the price is ask, bid, or yield, the value is empty. See attribute `currency` in endpoint `/prices/get` for its unit.")
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
   * Return true if this inline_response_200_9_data_subsample object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2009DataSubsample inlineResponse2009DataSubsample = (InlineResponse2009DataSubsample) o;
    return Objects.equals(this.time, inlineResponse2009DataSubsample.time) &&
        Objects.equals(this.first, inlineResponse2009DataSubsample.first) &&
        Objects.equals(this.last, inlineResponse2009DataSubsample.last) &&
        Objects.equals(this.low, inlineResponse2009DataSubsample.low) &&
        Objects.equals(this.high, inlineResponse2009DataSubsample.high) &&
        Objects.equals(this.tradingVolume, inlineResponse2009DataSubsample.tradingVolume) &&
        Objects.equals(this.tradingValue, inlineResponse2009DataSubsample.tradingValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(time, first, last, low, high, tradingVolume, tradingValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2009DataSubsample {\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    first: ").append(toIndentedString(first)).append("\n");
    sb.append("    last: ").append(toIndentedString(last)).append("\n");
    sb.append("    low: ").append(toIndentedString(low)).append("\n");
    sb.append("    high: ").append(toIndentedString(high)).append("\n");
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

