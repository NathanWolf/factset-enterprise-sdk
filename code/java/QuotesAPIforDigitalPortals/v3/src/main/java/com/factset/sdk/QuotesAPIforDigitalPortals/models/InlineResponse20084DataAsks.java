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
 * InlineResponse20084DataAsks
 */
@JsonPropertyOrder({
  InlineResponse20084DataAsks.JSON_PROPERTY_ID,
  InlineResponse20084DataAsks.JSON_PROPERTY_TIME,
  InlineResponse20084DataAsks.JSON_PROPERTY_TYPE,
  InlineResponse20084DataAsks.JSON_PROPERTY_PRICE,
  InlineResponse20084DataAsks.JSON_PROPERTY_QUOTE_CONDITION,
  InlineResponse20084DataAsks.JSON_PROPERTY_VOLUME,
  InlineResponse20084DataAsks.JSON_PROPERTY_MARKET_MAKER
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse20084DataAsks implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_TIME = "time";
  private String time;

  public static final String JSON_PROPERTY_TYPE = "type";
  private BigDecimal type;

  public static final String JSON_PROPERTY_PRICE = "price";
  private BigDecimal price;

  public static final String JSON_PROPERTY_QUOTE_CONDITION = "quoteCondition";
  private String quoteCondition;

  public static final String JSON_PROPERTY_VOLUME = "volume";
  private BigDecimal volume;

  public static final String JSON_PROPERTY_MARKET_MAKER = "marketMaker";
  private String marketMaker;

  public InlineResponse20084DataAsks() { 
  }

  public InlineResponse20084DataAsks id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Unique identifier of the order. Possible values depend on the values delivered by the supplier of the price information.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unique identifier of the order. Possible values depend on the values delivered by the supplier of the price information.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }


  public InlineResponse20084DataAsks time(String time) {
    this.time = time;
    return this;
  }

   /**
   * Date and time of the latest change.
   * @return time
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date and time of the latest change.")
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


  public InlineResponse20084DataAsks type(BigDecimal type) {
    this.type = type;
    return this;
  }

   /**
   * Order type.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Order type.")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(BigDecimal type) {
    this.type = type;
  }


  public InlineResponse20084DataAsks price(BigDecimal price) {
    this.price = price;
    return this;
  }

   /**
   * Price value. The value is 0 if the attribute &#x60;type&#x60; is 1 (market order). See attribute &#x60;valueUnit&#x60; in endpoint &#x60;/prices/get&#x60; for the unit of the price value\&quot;.
   * @return price
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Price value. The value is 0 if the attribute `type` is 1 (market order). See attribute `valueUnit` in endpoint `/prices/get` for the unit of the price value\".")
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


  public InlineResponse20084DataAsks quoteCondition(String quoteCondition) {
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


  public InlineResponse20084DataAsks volume(BigDecimal volume) {
    this.volume = volume;
    return this;
  }

   /**
   * Volume of the order.
   * @return volume
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Volume of the order.")
  @JsonProperty(JSON_PROPERTY_VOLUME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getVolume() {
    return volume;
  }


  @JsonProperty(JSON_PROPERTY_VOLUME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVolume(BigDecimal volume) {
    this.volume = volume;
  }


  public InlineResponse20084DataAsks marketMaker(String marketMaker) {
    this.marketMaker = marketMaker;
    return this;
  }

   /**
   * Code of the market maker.
   * @return marketMaker
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Code of the market maker.")
  @JsonProperty(JSON_PROPERTY_MARKET_MAKER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMarketMaker() {
    return marketMaker;
  }


  @JsonProperty(JSON_PROPERTY_MARKET_MAKER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMarketMaker(String marketMaker) {
    this.marketMaker = marketMaker;
  }


  /**
   * Return true if this inline_response_200_84_data_asks object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20084DataAsks inlineResponse20084DataAsks = (InlineResponse20084DataAsks) o;
    return Objects.equals(this.id, inlineResponse20084DataAsks.id) &&
        Objects.equals(this.time, inlineResponse20084DataAsks.time) &&
        Objects.equals(this.type, inlineResponse20084DataAsks.type) &&
        Objects.equals(this.price, inlineResponse20084DataAsks.price) &&
        Objects.equals(this.quoteCondition, inlineResponse20084DataAsks.quoteCondition) &&
        Objects.equals(this.volume, inlineResponse20084DataAsks.volume) &&
        Objects.equals(this.marketMaker, inlineResponse20084DataAsks.marketMaker);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, time, type, price, quoteCondition, volume, marketMaker);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20084DataAsks {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    quoteCondition: ").append(toIndentedString(quoteCondition)).append("\n");
    sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
    sb.append("    marketMaker: ").append(toIndentedString(marketMaker)).append("\n");
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

