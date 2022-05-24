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
import java.time.LocalDate;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.TimeSeriesAPIforDigitalPortals.JSON;


/**
 * InlineResponse2007DataSubsamples
 */
@JsonPropertyOrder({
  InlineResponse2007DataSubsamples.JSON_PROPERTY_DATE,
  InlineResponse2007DataSubsamples.JSON_PROPERTY_FIRST,
  InlineResponse2007DataSubsamples.JSON_PROPERTY_LAST,
  InlineResponse2007DataSubsamples.JSON_PROPERTY_LOW,
  InlineResponse2007DataSubsamples.JSON_PROPERTY_HIGH,
  InlineResponse2007DataSubsamples.JSON_PROPERTY_TRADING_VOLUME,
  InlineResponse2007DataSubsamples.JSON_PROPERTY_TRADING_VALUE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse2007DataSubsamples implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_DATE = "date";
  private LocalDate date;

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

  public InlineResponse2007DataSubsamples() { 
  }

  public InlineResponse2007DataSubsamples date(LocalDate date) {
    this.date = date;
    return this;
  }

   /**
   * Date of the start of the subsample.
   * @return date
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date of the start of the subsample.")
  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LocalDate getDate() {
    return date;
  }


  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDate(LocalDate date) {
    this.date = date;
  }


  public InlineResponse2007DataSubsamples first(BigDecimal first) {
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


  public InlineResponse2007DataSubsamples last(BigDecimal last) {
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


  public InlineResponse2007DataSubsamples low(BigDecimal low) {
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


  public InlineResponse2007DataSubsamples high(BigDecimal high) {
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


  public InlineResponse2007DataSubsamples tradingVolume(BigDecimal tradingVolume) {
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


  public InlineResponse2007DataSubsamples tradingValue(BigDecimal tradingValue) {
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
   * Return true if this inline_response_200_7_data_subsamples object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2007DataSubsamples inlineResponse2007DataSubsamples = (InlineResponse2007DataSubsamples) o;
    return Objects.equals(this.date, inlineResponse2007DataSubsamples.date) &&
        Objects.equals(this.first, inlineResponse2007DataSubsamples.first) &&
        Objects.equals(this.last, inlineResponse2007DataSubsamples.last) &&
        Objects.equals(this.low, inlineResponse2007DataSubsamples.low) &&
        Objects.equals(this.high, inlineResponse2007DataSubsamples.high) &&
        Objects.equals(this.tradingVolume, inlineResponse2007DataSubsamples.tradingVolume) &&
        Objects.equals(this.tradingValue, inlineResponse2007DataSubsamples.tradingValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, first, last, low, high, tradingVolume, tradingValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2007DataSubsamples {\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
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

