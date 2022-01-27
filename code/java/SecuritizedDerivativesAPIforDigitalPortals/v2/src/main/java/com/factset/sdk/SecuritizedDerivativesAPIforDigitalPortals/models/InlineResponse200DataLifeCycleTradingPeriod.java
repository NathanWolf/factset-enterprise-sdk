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


package com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models;

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
import org.threeten.bp.LocalDate;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.JSON;


/**
 * Trading period defined by the issuer.
 */
@ApiModel(description = "Trading period defined by the issuer.")
@JsonPropertyOrder({
  InlineResponse200DataLifeCycleTradingPeriod.JSON_PROPERTY_START,
  InlineResponse200DataLifeCycleTradingPeriod.JSON_PROPERTY_END
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse200DataLifeCycleTradingPeriod implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_START = "start";
  private LocalDate start;

  public static final String JSON_PROPERTY_END = "end";
  private LocalDate end;


  public InlineResponse200DataLifeCycleTradingPeriod start(LocalDate start) {
    this.start = start;
    return this;
  }

   /**
   * Date of the instrument&#39;s first trading day defined by the issuer.
   * @return start
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Date of the instrument's first trading day defined by the issuer.")
  @JsonProperty(JSON_PROPERTY_START)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public LocalDate getStart() {
    return start;
  }


  @JsonProperty(JSON_PROPERTY_START)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStart(LocalDate start) {
    this.start = start;
  }


  public InlineResponse200DataLifeCycleTradingPeriod end(LocalDate end) {
    this.end = end;
    return this;
  }

   /**
   * Date of the instrument&#39;s last trading day defined by the issuer.
   * @return end
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Date of the instrument's last trading day defined by the issuer.")
  @JsonProperty(JSON_PROPERTY_END)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public LocalDate getEnd() {
    return end;
  }


  @JsonProperty(JSON_PROPERTY_END)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEnd(LocalDate end) {
    this.end = end;
  }


  /**
   * Return true if this inline_response_200_data_lifeCycle_tradingPeriod object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200DataLifeCycleTradingPeriod inlineResponse200DataLifeCycleTradingPeriod = (InlineResponse200DataLifeCycleTradingPeriod) o;
    return Objects.equals(this.start, inlineResponse200DataLifeCycleTradingPeriod.start) &&
        Objects.equals(this.end, inlineResponse200DataLifeCycleTradingPeriod.end);
  }

  @Override
  public int hashCode() {
    return Objects.hash(start, end);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200DataLifeCycleTradingPeriod {\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
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

