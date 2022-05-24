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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.TimeSeriesAPIforDigitalPortals.JSON;


/**
 * Date and time range for the time series. The &#x60;start&#x60; and &#x60;end&#x60; boundaries must be aligned to &#x60;granularity&#x60;. That is, the numerical value is an integral multiple of the time span value represented by &#x60;granularity&#x60;.
 */
@ApiModel(description = "Date and time range for the time series. The `start` and `end` boundaries must be aligned to `granularity`. That is, the numerical value is an integral multiple of the time span value represented by `granularity`.")
@JsonPropertyOrder({
  VendorChartIQTimeSeriesIntradaySubsampleListDataRange.JSON_PROPERTY_START,
  VendorChartIQTimeSeriesIntradaySubsampleListDataRange.JSON_PROPERTY_END
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class VendorChartIQTimeSeriesIntradaySubsampleListDataRange implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_START = "start";
  private String start;

  public static final String JSON_PROPERTY_END = "end";
  private String end;

  public VendorChartIQTimeSeriesIntradaySubsampleListDataRange() { 
  }

  @JsonCreator
  public VendorChartIQTimeSeriesIntradaySubsampleListDataRange(
    @JsonProperty(value=JSON_PROPERTY_START, required=true) String start, 
    @JsonProperty(value=JSON_PROPERTY_END, required=true) String end
  ) {
    this();
    this.start = start;
    this.end = end;
  }

  public VendorChartIQTimeSeriesIntradaySubsampleListDataRange start(String start) {
    this.start = start;
    return this;
  }

   /**
   * The starting point of the time range (inclusive). The data accessible in the past is limited to a few weeks at most.
   * @return start
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The starting point of the time range (inclusive). The data accessible in the past is limited to a few weeks at most.")
  @JsonProperty(JSON_PROPERTY_START)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getStart() {
    return start;
  }


  @JsonProperty(JSON_PROPERTY_START)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStart(String start) {
    this.start = start;
  }


  public VendorChartIQTimeSeriesIntradaySubsampleListDataRange end(String end) {
    this.end = end;
    return this;
  }

   /**
   * The ending point of the time range (exclusive). Dates in the future are not allowed.
   * @return end
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The ending point of the time range (exclusive). Dates in the future are not allowed.")
  @JsonProperty(JSON_PROPERTY_END)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getEnd() {
    return end;
  }


  @JsonProperty(JSON_PROPERTY_END)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEnd(String end) {
    this.end = end;
  }


  /**
   * Return true if this _vendor_chartIQ_timeSeries_intraday_subsample_list_data_range object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VendorChartIQTimeSeriesIntradaySubsampleListDataRange vendorChartIQTimeSeriesIntradaySubsampleListDataRange = (VendorChartIQTimeSeriesIntradaySubsampleListDataRange) o;
    return Objects.equals(this.start, vendorChartIQTimeSeriesIntradaySubsampleListDataRange.start) &&
        Objects.equals(this.end, vendorChartIQTimeSeriesIntradaySubsampleListDataRange.end);
  }

  @Override
  public int hashCode() {
    return Objects.hash(start, end);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VendorChartIQTimeSeriesIntradaySubsampleListDataRange {\n");
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

