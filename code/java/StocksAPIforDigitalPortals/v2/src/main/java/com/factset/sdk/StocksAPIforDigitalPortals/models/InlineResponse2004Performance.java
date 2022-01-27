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


package com.factset.sdk.StocksAPIforDigitalPortals.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse2004PerformanceEndOfDay;
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
import com.factset.sdk.StocksAPIforDigitalPortals.JSON;


/**
 * Relative performance for different time ranges.
 */
@ApiModel(description = "Relative performance for different time ranges.")
@JsonPropertyOrder({
  InlineResponse2004Performance.JSON_PROPERTY_INTRADAY,
  InlineResponse2004Performance.JSON_PROPERTY_END_OF_DAY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse2004Performance implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_INTRADAY = "intraday";
  private BigDecimal intraday;

  public static final String JSON_PROPERTY_END_OF_DAY = "endOfDay";
  private InlineResponse2004PerformanceEndOfDay endOfDay;


  public InlineResponse2004Performance intraday(BigDecimal intraday) {
    this.intraday = intraday;
    return this;
  }

   /**
   * Intraday relative performance. That is the difference of a notation&#39;s most recent price from the current trading day against the most recent EOD closing price.
   * @return intraday
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Intraday relative performance. That is the difference of a notation's most recent price from the current trading day against the most recent EOD closing price.")
  @JsonProperty(JSON_PROPERTY_INTRADAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getIntraday() {
    return intraday;
  }


  @JsonProperty(JSON_PROPERTY_INTRADAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIntraday(BigDecimal intraday) {
    this.intraday = intraday;
  }


  public InlineResponse2004Performance endOfDay(InlineResponse2004PerformanceEndOfDay endOfDay) {
    this.endOfDay = endOfDay;
    return this;
  }

   /**
   * Get endOfDay
   * @return endOfDay
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_END_OF_DAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2004PerformanceEndOfDay getEndOfDay() {
    return endOfDay;
  }


  @JsonProperty(JSON_PROPERTY_END_OF_DAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndOfDay(InlineResponse2004PerformanceEndOfDay endOfDay) {
    this.endOfDay = endOfDay;
  }


  /**
   * Return true if this inline_response_200_4_performance object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2004Performance inlineResponse2004Performance = (InlineResponse2004Performance) o;
    return Objects.equals(this.intraday, inlineResponse2004Performance.intraday) &&
        Objects.equals(this.endOfDay, inlineResponse2004Performance.endOfDay);
  }

  @Override
  public int hashCode() {
    return Objects.hash(intraday, endOfDay);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2004Performance {\n");
    sb.append("    intraday: ").append(toIndentedString(intraday)).append("\n");
    sb.append("    endOfDay: ").append(toIndentedString(endOfDay)).append("\n");
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

