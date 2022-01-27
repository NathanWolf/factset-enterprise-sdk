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


package com.factset.sdk.QuotesAPIforDigitalPortals.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20080LatestPerformance;
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
import com.factset.sdk.QuotesAPIforDigitalPortals.JSON;


/**
 * Most recent trade or price of the trading day.
 */
@ApiModel(description = "Most recent trade or price of the trading day.")
@JsonPropertyOrder({
  InlineResponse20080Latest.JSON_PROPERTY_TIME,
  InlineResponse20080Latest.JSON_PROPERTY_PRICE,
  InlineResponse20080Latest.JSON_PROPERTY_QUOTE_CONDITION,
  InlineResponse20080Latest.JSON_PROPERTY_TRADING_VOLUME,
  InlineResponse20080Latest.JSON_PROPERTY_TRADING_VALUE,
  InlineResponse20080Latest.JSON_PROPERTY_PERFORMANCE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse20080Latest implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_TIME = "time";
  private String time;

  public static final String JSON_PROPERTY_PRICE = "price";
  private BigDecimal price;

  public static final String JSON_PROPERTY_QUOTE_CONDITION = "quoteCondition";
  private String quoteCondition;

  public static final String JSON_PROPERTY_TRADING_VOLUME = "tradingVolume";
  private BigDecimal tradingVolume;

  public static final String JSON_PROPERTY_TRADING_VALUE = "tradingValue";
  private BigDecimal tradingValue;

  public static final String JSON_PROPERTY_PERFORMANCE = "performance";
  private InlineResponse20080LatestPerformance performance;


  public InlineResponse20080Latest time(String time) {
    this.time = time;
    return this;
  }

   /**
   * Date and time.
   * @return time
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date and time.")
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


  public InlineResponse20080Latest price(BigDecimal price) {
    this.price = price;
    return this;
  }

   /**
   * Price value. See attribute &#x60;valueUnit&#x60; for its unit.
   * @return price
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Price value. See attribute `valueUnit` for its unit.")
  @JsonProperty(JSON_PROPERTY_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getPrice() {
    return price;
  }


  @JsonProperty(JSON_PROPERTY_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrice(BigDecimal price) {
    this.price = price;
  }


  public InlineResponse20080Latest quoteCondition(String quoteCondition) {
    this.quoteCondition = quoteCondition;
    return this;
  }

   /**
   * Quote condition. Possible values depend on the values delivered by the supplier of the price information.
   * @return quoteCondition
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Quote condition. Possible values depend on the values delivered by the supplier of the price information.")
  @JsonProperty(JSON_PROPERTY_QUOTE_CONDITION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getQuoteCondition() {
    return quoteCondition;
  }


  @JsonProperty(JSON_PROPERTY_QUOTE_CONDITION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setQuoteCondition(String quoteCondition) {
    this.quoteCondition = quoteCondition;
  }


  public InlineResponse20080Latest tradingVolume(BigDecimal tradingVolume) {
    this.tradingVolume = tradingVolume;
    return this;
  }

   /**
   * Number of units (e.g. shares) traded.
   * @return tradingVolume
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of units (e.g. shares) traded.")
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


  public InlineResponse20080Latest tradingValue(BigDecimal tradingValue) {
    this.tradingValue = tradingValue;
    return this;
  }

   /**
   * Monetary equivalent (cash value) of the trade. See attribute &#x60;currency&#x60; for its unit.
   * @return tradingValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Monetary equivalent (cash value) of the trade. See attribute `currency` for its unit.")
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


  public InlineResponse20080Latest performance(InlineResponse20080LatestPerformance performance) {
    this.performance = performance;
    return this;
  }

   /**
   * Get performance
   * @return performance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PERFORMANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse20080LatestPerformance getPerformance() {
    return performance;
  }


  @JsonProperty(JSON_PROPERTY_PERFORMANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPerformance(InlineResponse20080LatestPerformance performance) {
    this.performance = performance;
  }


  /**
   * Return true if this inline_response_200_80_latest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20080Latest inlineResponse20080Latest = (InlineResponse20080Latest) o;
    return Objects.equals(this.time, inlineResponse20080Latest.time) &&
        Objects.equals(this.price, inlineResponse20080Latest.price) &&
        Objects.equals(this.quoteCondition, inlineResponse20080Latest.quoteCondition) &&
        Objects.equals(this.tradingVolume, inlineResponse20080Latest.tradingVolume) &&
        Objects.equals(this.tradingValue, inlineResponse20080Latest.tradingValue) &&
        Objects.equals(this.performance, inlineResponse20080Latest.performance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(time, price, quoteCondition, tradingVolume, tradingValue, performance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20080Latest {\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    quoteCondition: ").append(toIndentedString(quoteCondition)).append("\n");
    sb.append("    tradingVolume: ").append(toIndentedString(tradingVolume)).append("\n");
    sb.append("    tradingValue: ").append(toIndentedString(tradingValue)).append("\n");
    sb.append("    performance: ").append(toIndentedString(performance)).append("\n");
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

