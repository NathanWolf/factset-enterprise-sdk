/*
 * Quotes API For Digital Portals
 * The Quotes API combines endpoints for retrieving security end-of-day, delayed, and realtime prices with performance key figures and basic reference data on the security and market level.  The API supports over 20 different price types for each quote and comes with basic search endpoints based on security identifiers and instrument names. Market coverage is included in the *Sample Use Cases* section below.  The Digital Portal use case is focused on high-performance applications that are  * serving millions of end-users, * accessible by client browsers via the internet, * supporting subscriptions for streamed updates out-of-the-box, * typically combining a wide variety of *for Digital Portals*-APIs into a highly use-case specific solution for customers, * integrated into complex infrastructures such as existing frontend frameworks, authentication services.  All APIs labelled *for Digital Portals* have been designed for direct use by client web applications and feature extreme low latency: The average response time across all endpoints is 30 ms whereas 99% of all requests are answered in close to under 300ms.  See the [Time Series API for Digital Portals](https://developer.factset.com/api-catalog/time-series-api-digital-portals) for direct access to price histories, and the [News API for Digital Portals](https://developer.factset.com/api-catalog/news-api-digital-portals) for searching and fetching related news. 
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
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.QuotesAPIforDigitalPortals.JSON;


/**
 * Average trading value. See attribute &#x60;valueUnit&#x60; in endpoint &#x60;/notation/get&#x60; for its unit.
 */
@ApiModel(description = "Average trading value. See attribute `valueUnit` in endpoint `/notation/get` for its unit.")
@JsonPropertyOrder({
  InlineResponse20081DataValue.JSON_PROPERTY_DAYS5,
  InlineResponse20081DataValue.JSON_PROPERTY_DAYS30,
  InlineResponse20081DataValue.JSON_PROPERTY_DAYS100,
  InlineResponse20081DataValue.JSON_PROPERTY_DAYS250
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse20081DataValue implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_DAYS5 = "days5";
  private JsonNullable<BigDecimal> days5 = JsonNullable.<BigDecimal>undefined();

  public static final String JSON_PROPERTY_DAYS30 = "days30";
  private JsonNullable<BigDecimal> days30 = JsonNullable.<BigDecimal>undefined();

  public static final String JSON_PROPERTY_DAYS100 = "days100";
  private JsonNullable<BigDecimal> days100 = JsonNullable.<BigDecimal>undefined();

  public static final String JSON_PROPERTY_DAYS250 = "days250";
  private JsonNullable<BigDecimal> days250 = JsonNullable.<BigDecimal>undefined();

  public InlineResponse20081DataValue() { 
  }

  public InlineResponse20081DataValue days5(BigDecimal days5) {
    this.days5 = JsonNullable.<BigDecimal>of(days5);
    return this;
  }

   /**
   * Five trading days.
   * @return days5
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Five trading days.")
  @JsonIgnore

  public BigDecimal getDays5() {
        return days5.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DAYS5)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<BigDecimal> getDays5_JsonNullable() {
    return days5;
  }
  
  @JsonProperty(JSON_PROPERTY_DAYS5)
  public void setDays5_JsonNullable(JsonNullable<BigDecimal> days5) {
    this.days5 = days5;
  }

  public void setDays5(BigDecimal days5) {
    this.days5 = JsonNullable.<BigDecimal>of(days5);
  }


  public InlineResponse20081DataValue days30(BigDecimal days30) {
    this.days30 = JsonNullable.<BigDecimal>of(days30);
    return this;
  }

   /**
   * 30 trading days.
   * @return days30
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "30 trading days.")
  @JsonIgnore

  public BigDecimal getDays30() {
        return days30.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DAYS30)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<BigDecimal> getDays30_JsonNullable() {
    return days30;
  }
  
  @JsonProperty(JSON_PROPERTY_DAYS30)
  public void setDays30_JsonNullable(JsonNullable<BigDecimal> days30) {
    this.days30 = days30;
  }

  public void setDays30(BigDecimal days30) {
    this.days30 = JsonNullable.<BigDecimal>of(days30);
  }


  public InlineResponse20081DataValue days100(BigDecimal days100) {
    this.days100 = JsonNullable.<BigDecimal>of(days100);
    return this;
  }

   /**
   * 100 trading days.
   * @return days100
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "100 trading days.")
  @JsonIgnore

  public BigDecimal getDays100() {
        return days100.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DAYS100)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<BigDecimal> getDays100_JsonNullable() {
    return days100;
  }
  
  @JsonProperty(JSON_PROPERTY_DAYS100)
  public void setDays100_JsonNullable(JsonNullable<BigDecimal> days100) {
    this.days100 = days100;
  }

  public void setDays100(BigDecimal days100) {
    this.days100 = JsonNullable.<BigDecimal>of(days100);
  }


  public InlineResponse20081DataValue days250(BigDecimal days250) {
    this.days250 = JsonNullable.<BigDecimal>of(days250);
    return this;
  }

   /**
   * 250 trading days.
   * @return days250
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "250 trading days.")
  @JsonIgnore

  public BigDecimal getDays250() {
        return days250.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DAYS250)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<BigDecimal> getDays250_JsonNullable() {
    return days250;
  }
  
  @JsonProperty(JSON_PROPERTY_DAYS250)
  public void setDays250_JsonNullable(JsonNullable<BigDecimal> days250) {
    this.days250 = days250;
  }

  public void setDays250(BigDecimal days250) {
    this.days250 = JsonNullable.<BigDecimal>of(days250);
  }


  /**
   * Return true if this inline_response_200_81_data_value object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20081DataValue inlineResponse20081DataValue = (InlineResponse20081DataValue) o;
    return equalsNullable(this.days5, inlineResponse20081DataValue.days5) &&
        equalsNullable(this.days30, inlineResponse20081DataValue.days30) &&
        equalsNullable(this.days100, inlineResponse20081DataValue.days100) &&
        equalsNullable(this.days250, inlineResponse20081DataValue.days250);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(days5), hashCodeNullable(days30), hashCodeNullable(days100), hashCodeNullable(days250));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20081DataValue {\n");
    sb.append("    days5: ").append(toIndentedString(days5)).append("\n");
    sb.append("    days30: ").append(toIndentedString(days30)).append("\n");
    sb.append("    days100: ").append(toIndentedString(days100)).append("\n");
    sb.append("    days250: ").append(toIndentedString(days250)).append("\n");
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

