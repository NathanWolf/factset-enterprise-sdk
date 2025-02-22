/*
 * Portfolio Reporting Batcher
 * The Portfolio Reporting Batcher (PRB) API allows clients to systematically leverage functionalities of the PRB application. With the initial release, clients can - trigger existing jobs - check status of running jobs - get various details of existing jobs
 *
 * The version of the OpenAPI document: 0.4.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.PortfolioReportingBatcher.models;

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
import java.time.LocalDate;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.PortfolioReportingBatcher.JSON;


/**
 * Used only for jobs where type is ADF. If using dates override, please provide both start date and end date.
 */
@ApiModel(description = "Used only for jobs where type is ADF. If using dates override, please provide both start date and end date.")
@JsonPropertyOrder({
  JobOverridesDates.JSON_PROPERTY_END,
  JobOverridesDates.JSON_PROPERTY_START
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class JobOverridesDates implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_END = "end";
  private LocalDate end;

  public static final String JSON_PROPERTY_START = "start";
  private LocalDate start;

  public JobOverridesDates() { 
  }

  public JobOverridesDates end(LocalDate end) {
    this.end = end;
    return this;
  }

   /**
   * The end date in format YYYY-MM-DD
   * @return end
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The end date in format YYYY-MM-DD")
  @JsonProperty(JSON_PROPERTY_END)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LocalDate getEnd() {
    return end;
  }


  @JsonProperty(JSON_PROPERTY_END)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnd(LocalDate end) {
    this.end = end;
  }


  public JobOverridesDates start(LocalDate start) {
    this.start = start;
    return this;
  }

   /**
   * The start date in format YYYY-MM-DD
   * @return start
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The start date in format YYYY-MM-DD")
  @JsonProperty(JSON_PROPERTY_START)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LocalDate getStart() {
    return start;
  }


  @JsonProperty(JSON_PROPERTY_START)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStart(LocalDate start) {
    this.start = start;
  }


  /**
   * Return true if this jobOverrides_dates object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobOverridesDates jobOverridesDates = (JobOverridesDates) o;
    return Objects.equals(this.end, jobOverridesDates.end) &&
        Objects.equals(this.start, jobOverridesDates.start);
  }

  @Override
  public int hashCode() {
    return Objects.hash(end, start);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobOverridesDates {\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
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

