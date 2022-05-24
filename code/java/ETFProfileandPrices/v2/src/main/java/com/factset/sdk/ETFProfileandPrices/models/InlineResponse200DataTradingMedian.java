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


package com.factset.sdk.ETFProfileandPrices.models;

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
import com.factset.sdk.ETFProfileandPrices.JSON;


/**
 * Median.
 */
@ApiModel(description = "Median.")
@JsonPropertyOrder({
  InlineResponse200DataTradingMedian.JSON_PROPERTY_VOLUME,
  InlineResponse200DataTradingMedian.JSON_PROPERTY_VALUE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse200DataTradingMedian implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_VOLUME = "volume";
  private BigDecimal volume;

  public static final String JSON_PROPERTY_VALUE = "value";
  private BigDecimal value;

  public InlineResponse200DataTradingMedian() { 
  }

  public InlineResponse200DataTradingMedian volume(BigDecimal volume) {
    this.volume = volume;
    return this;
  }

   /**
   * Median daily number of shares traded over the past 45 trading days. This data is available for the regions.
   * @return volume
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Median daily number of shares traded over the past 45 trading days. This data is available for the regions.")
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


  public InlineResponse200DataTradingMedian value(BigDecimal value) {
    this.value = value;
    return this;
  }

   /**
   * Median daily value traded over the past 45 trading days in ETP&#39;s listing currency. This data is available for the US regions.
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Median daily value traded over the past 45 trading days in ETP's listing currency. This data is available for the US regions.")
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getValue() {
    return value;
  }


  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValue(BigDecimal value) {
    this.value = value;
  }


  /**
   * Return true if this inline_response_200_data_trading_median object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200DataTradingMedian inlineResponse200DataTradingMedian = (InlineResponse200DataTradingMedian) o;
    return Objects.equals(this.volume, inlineResponse200DataTradingMedian.volume) &&
        Objects.equals(this.value, inlineResponse200DataTradingMedian.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(volume, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200DataTradingMedian {\n");
    sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

