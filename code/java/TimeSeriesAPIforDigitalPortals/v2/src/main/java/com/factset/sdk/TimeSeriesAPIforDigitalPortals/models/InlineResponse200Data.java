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
import com.factset.sdk.TimeSeriesAPIforDigitalPortals.models.InlineResponse200DataRange;
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
 * Time series data for the notation.
 */
@ApiModel(description = "Time series data for the notation.")
@JsonPropertyOrder({
  InlineResponse200Data.JSON_PROPERTY_RANGE,
  InlineResponse200Data.JSON_PROPERTY_QUALITY,
  InlineResponse200Data.JSON_PROPERTY_PRICES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse200Data implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_RANGE = "range";
  private InlineResponse200DataRange range;

  /**
   * Quality of the price.
   */
  public enum QualityEnum {
    DLY("DLY"),
    
    EOD("EOD");

    private String value;

    QualityEnum(String value) {
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
    public static QualityEnum fromValue(String value) {
      for (QualityEnum b : QualityEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_QUALITY = "quality";
  private QualityEnum quality;

  public static final String JSON_PROPERTY_PRICES = "prices";
  private java.util.List<java.util.List<BigDecimal>> prices = null;

  public InlineResponse200Data() { 
  }

  public InlineResponse200Data range(InlineResponse200DataRange range) {
    this.range = range;
    return this;
  }

   /**
   * Get range
   * @return range
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse200DataRange getRange() {
    return range;
  }


  @JsonProperty(JSON_PROPERTY_RANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRange(InlineResponse200DataRange range) {
    this.range = range;
  }


  public InlineResponse200Data quality(QualityEnum quality) {
    this.quality = quality;
    return this;
  }

   /**
   * Quality of the price.
   * @return quality
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Quality of the price.")
  @JsonProperty(JSON_PROPERTY_QUALITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public QualityEnum getQuality() {
    return quality;
  }


  @JsonProperty(JSON_PROPERTY_QUALITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setQuality(QualityEnum quality) {
    this.quality = quality;
  }


  public InlineResponse200Data prices(java.util.List<java.util.List<BigDecimal>> prices) {
    this.prices = prices;
    return this;
  }

  public InlineResponse200Data addPricesItem(java.util.List<BigDecimal> pricesItem) {
    if (this.prices == null) {
      this.prices = new java.util.ArrayList<>();
    }
    this.prices.add(pricesItem);
    return this;
  }

   /**
   * Time series of prices as an array of arrays. One record is represented as an array and consists of a timestamp, four price values, and the trading volume. For the unit of the price values, see attribute &#x60;valueUnit&#x60; in endpoint &#x60;/prices/get&#x60;, except for price type yield, where the &#x60;valueUnit&#x60; is always &#x60;percent&#x60; (id&#x3D;258). The order is as follows: timestamp seconds since epoch in UTC; first price; highest price; lowest price; last price; number of units (e.g. shares) traded (price type trade and estimate), offered (price type ask), solicited (price type bid), or empty (price type yield).
   * @return prices
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Time series of prices as an array of arrays. One record is represented as an array and consists of a timestamp, four price values, and the trading volume. For the unit of the price values, see attribute `valueUnit` in endpoint `/prices/get`, except for price type yield, where the `valueUnit` is always `percent` (id=258). The order is as follows: timestamp seconds since epoch in UTC; first price; highest price; lowest price; last price; number of units (e.g. shares) traded (price type trade and estimate), offered (price type ask), solicited (price type bid), or empty (price type yield).")
  @JsonProperty(JSON_PROPERTY_PRICES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<java.util.List<BigDecimal>> getPrices() {
    return prices;
  }


  @JsonProperty(JSON_PROPERTY_PRICES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrices(java.util.List<java.util.List<BigDecimal>> prices) {
    this.prices = prices;
  }


  /**
   * Return true if this inline_response_200_data object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200Data inlineResponse200Data = (InlineResponse200Data) o;
    return Objects.equals(this.range, inlineResponse200Data.range) &&
        Objects.equals(this.quality, inlineResponse200Data.quality) &&
        Objects.equals(this.prices, inlineResponse200Data.prices);
  }

  @Override
  public int hashCode() {
    return Objects.hash(range, quality, prices);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200Data {\n");
    sb.append("    range: ").append(toIndentedString(range)).append("\n");
    sb.append("    quality: ").append(toIndentedString(quality)).append("\n");
    sb.append("    prices: ").append(toIndentedString(prices)).append("\n");
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

