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
 * Trade with the lowest price of the trading day.
 */
@ApiModel(description = "Trade with the lowest price of the trading day.")
@JsonPropertyOrder({
  InlineResponse20079DataLow.JSON_PROPERTY_TIME,
  InlineResponse20079DataLow.JSON_PROPERTY_PRICE,
  InlineResponse20079DataLow.JSON_PROPERTY_TRADING_VOLUME
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse20079DataLow implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_TIME = "time";
  private String time;

  public static final String JSON_PROPERTY_PRICE = "price";
  private BigDecimal price;

  public static final String JSON_PROPERTY_TRADING_VOLUME = "tradingVolume";
  private BigDecimal tradingVolume;

  public InlineResponse20079DataLow() { 
  }

  public InlineResponse20079DataLow time(String time) {
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


  public InlineResponse20079DataLow price(BigDecimal price) {
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


  public InlineResponse20079DataLow tradingVolume(BigDecimal tradingVolume) {
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
   * Return true if this inline_response_200_79_data_low object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20079DataLow inlineResponse20079DataLow = (InlineResponse20079DataLow) o;
    return Objects.equals(this.time, inlineResponse20079DataLow.time) &&
        Objects.equals(this.price, inlineResponse20079DataLow.price) &&
        Objects.equals(this.tradingVolume, inlineResponse20079DataLow.tradingVolume);
  }

  @Override
  public int hashCode() {
    return Objects.hash(time, price, tradingVolume);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20079DataLow {\n");
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

