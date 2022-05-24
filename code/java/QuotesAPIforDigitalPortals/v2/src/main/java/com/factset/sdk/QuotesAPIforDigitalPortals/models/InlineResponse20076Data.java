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
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20072DataHigh;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20072DataLow;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20072DataPerformance;
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
import com.factset.sdk.QuotesAPIforDigitalPortals.JSON;


/**
 * EOD key figures.
 */
@ApiModel(description = "EOD key figures.")
@JsonPropertyOrder({
  InlineResponse20076Data.JSON_PROPERTY_REFERENCE_DATE,
  InlineResponse20076Data.JSON_PROPERTY_PERFORMANCE,
  InlineResponse20076Data.JSON_PROPERTY_HIGH,
  InlineResponse20076Data.JSON_PROPERTY_LOW,
  InlineResponse20076Data.JSON_PROPERTY_VOLATILITY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse20076Data implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_REFERENCE_DATE = "referenceDate";
  private LocalDate referenceDate;

  public static final String JSON_PROPERTY_PERFORMANCE = "performance";
  private InlineResponse20072DataPerformance performance;

  public static final String JSON_PROPERTY_HIGH = "high";
  private InlineResponse20072DataHigh high;

  public static final String JSON_PROPERTY_LOW = "low";
  private InlineResponse20072DataLow low;

  public static final String JSON_PROPERTY_VOLATILITY = "volatility";
  private BigDecimal volatility;

  public InlineResponse20076Data() { 
  }

  public InlineResponse20076Data referenceDate(LocalDate referenceDate) {
    this.referenceDate = referenceDate;
    return this;
  }

   /**
   * Reference date of the time range.
   * @return referenceDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Reference date of the time range.")
  @JsonProperty(JSON_PROPERTY_REFERENCE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LocalDate getReferenceDate() {
    return referenceDate;
  }


  @JsonProperty(JSON_PROPERTY_REFERENCE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReferenceDate(LocalDate referenceDate) {
    this.referenceDate = referenceDate;
  }


  public InlineResponse20076Data performance(InlineResponse20072DataPerformance performance) {
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

  public InlineResponse20072DataPerformance getPerformance() {
    return performance;
  }


  @JsonProperty(JSON_PROPERTY_PERFORMANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPerformance(InlineResponse20072DataPerformance performance) {
    this.performance = performance;
  }


  public InlineResponse20076Data high(InlineResponse20072DataHigh high) {
    this.high = high;
    return this;
  }

   /**
   * Get high
   * @return high
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_HIGH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse20072DataHigh getHigh() {
    return high;
  }


  @JsonProperty(JSON_PROPERTY_HIGH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHigh(InlineResponse20072DataHigh high) {
    this.high = high;
  }


  public InlineResponse20076Data low(InlineResponse20072DataLow low) {
    this.low = low;
    return this;
  }

   /**
   * Get low
   * @return low
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LOW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse20072DataLow getLow() {
    return low;
  }


  @JsonProperty(JSON_PROPERTY_LOW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLow(InlineResponse20072DataLow low) {
    this.low = low;
  }


  public InlineResponse20076Data volatility(BigDecimal volatility) {
    this.volatility = volatility;
    return this;
  }

   /**
   * Volatility of the daily logarithmic returns, annualized assuming 256 trading days per year.
   * @return volatility
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Volatility of the daily logarithmic returns, annualized assuming 256 trading days per year.")
  @JsonProperty(JSON_PROPERTY_VOLATILITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getVolatility() {
    return volatility;
  }


  @JsonProperty(JSON_PROPERTY_VOLATILITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVolatility(BigDecimal volatility) {
    this.volatility = volatility;
  }


  /**
   * Return true if this inline_response_200_76_data object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20076Data inlineResponse20076Data = (InlineResponse20076Data) o;
    return Objects.equals(this.referenceDate, inlineResponse20076Data.referenceDate) &&
        Objects.equals(this.performance, inlineResponse20076Data.performance) &&
        Objects.equals(this.high, inlineResponse20076Data.high) &&
        Objects.equals(this.low, inlineResponse20076Data.low) &&
        Objects.equals(this.volatility, inlineResponse20076Data.volatility);
  }

  @Override
  public int hashCode() {
    return Objects.hash(referenceDate, performance, high, low, volatility);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20076Data {\n");
    sb.append("    referenceDate: ").append(toIndentedString(referenceDate)).append("\n");
    sb.append("    performance: ").append(toIndentedString(performance)).append("\n");
    sb.append("    high: ").append(toIndentedString(high)).append("\n");
    sb.append("    low: ").append(toIndentedString(low)).append("\n");
    sb.append("    volatility: ").append(toIndentedString(volatility)).append("\n");
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

