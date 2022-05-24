/*
 * Quotes API For Digital Portals
 * The quotes API combines endpoints for retrieving security end-of-day, delayed, and realtime prices with performance key figures and basic reference data on the security and market level.  The API supports over 20 different price types for each quote and comes with basic search endpoints based on security identifiers and instrument names. Market coverage is included in the *Sample Use Cases* section below.  The Digital Portal use case is focused on high-performance applications that are  * serving millions of end-users, * accessible by client browsers via the internet, * supporting subscriptions for streamed updates out-of-the-box, * typically combining a wide variety of *for Digital Portals*-APIs into a highly use-case specific solution for customers, * integrated into complex infrastructures such as existing frontend frameworks, authentication services.  All APIs labelled *for Digital Portals* have been designed for direct use by client web applications and feature extreme low latency: The average response time across all endpoints is 30 ms whereas 99% of all requests are answered in close to under 300ms.  See the Time Series API for Digital Portals for direct access to price histories, and the News API for Digital Portals for searching and fetching related news.
 *
 * The version of the OpenAPI document: 2
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
 * First trade or price of the trading day.
 */
@ApiModel(description = "First trade or price of the trading day.")
@JsonPropertyOrder({
  InlineResponse20079DataFirst.JSON_PROPERTY_TIME,
  InlineResponse20079DataFirst.JSON_PROPERTY_PRICE,
  InlineResponse20079DataFirst.JSON_PROPERTY_TRADING_VOLUME
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse20079DataFirst implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_TIME = "time";
  private String time;

  public static final String JSON_PROPERTY_PRICE = "price";
  private BigDecimal price;

  public static final String JSON_PROPERTY_TRADING_VOLUME = "tradingVolume";
  private BigDecimal tradingVolume;

  public InlineResponse20079DataFirst() { 
  }

  public InlineResponse20079DataFirst time(String time) {
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


  public InlineResponse20079DataFirst price(BigDecimal price) {
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


  public InlineResponse20079DataFirst tradingVolume(BigDecimal tradingVolume) {
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


  /**
   * Return true if this inline_response_200_79_data_first object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20079DataFirst inlineResponse20079DataFirst = (InlineResponse20079DataFirst) o;
    return Objects.equals(this.time, inlineResponse20079DataFirst.time) &&
        Objects.equals(this.price, inlineResponse20079DataFirst.price) &&
        Objects.equals(this.tradingVolume, inlineResponse20079DataFirst.tradingVolume);
  }

  @Override
  public int hashCode() {
    return Objects.hash(time, price, tradingVolume);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20079DataFirst {\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    tradingVolume: ").append(toIndentedString(tradingVolume)).append("\n");
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

