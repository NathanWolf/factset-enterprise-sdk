/*
 * Time Series API For Digital Portals
 * Time series data, end-of-day or intraday, tick-by-tick or subsampled. Additional vendor-specific endpoints provide a modified interface for seamless integration with the ChartIQ chart library.
 *
 * The version of the OpenAPI document: 2
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
import java.time.LocalDate;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.TimeSeriesAPIforDigitalPortals.JSON;


/**
 * Date range for the time series. A valid date range is between 1900-01-01 and the day after the current day.
 */
@ApiModel(description = "Date range for the time series. A valid date range is between 1900-01-01 and the day after the current day.")
@JsonPropertyOrder({
  VendorChartIQTimeSeriesEodListDataRange.JSON_PROPERTY_START,
  VendorChartIQTimeSeriesEodListDataRange.JSON_PROPERTY_END
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class VendorChartIQTimeSeriesEodListDataRange implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_START = "start";
  private LocalDate start;

  public static final String JSON_PROPERTY_END = "end";
  private LocalDate end;

  public VendorChartIQTimeSeriesEodListDataRange() { 
  }

  @JsonCreator
  public VendorChartIQTimeSeriesEodListDataRange(
    @JsonProperty(value=JSON_PROPERTY_START, required=true) LocalDate start, 
    @JsonProperty(value=JSON_PROPERTY_END, required=true) LocalDate end
  ) {
    this();
    this.start = start;
    this.end = end;
  }

  public VendorChartIQTimeSeriesEodListDataRange start(LocalDate start) {
    this.start = start;
    return this;
  }

   /**
   * The starting point of the date range (inclusive).
   * @return start
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The starting point of the date range (inclusive).")
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


  public VendorChartIQTimeSeriesEodListDataRange end(LocalDate end) {
    this.end = end;
    return this;
  }

   /**
   * The ending point of the date range (exclusive).
   * @return end
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The ending point of the date range (exclusive).")
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
   * Return true if this _vendor_chartIQ_timeSeries_eod_list_data_range object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VendorChartIQTimeSeriesEodListDataRange vendorChartIQTimeSeriesEodListDataRange = (VendorChartIQTimeSeriesEodListDataRange) o;
    return Objects.equals(this.start, vendorChartIQTimeSeriesEodListDataRange.start) &&
        Objects.equals(this.end, vendorChartIQTimeSeriesEodListDataRange.end);
  }

  @Override
  public int hashCode() {
    return Objects.hash(start, end);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VendorChartIQTimeSeriesEodListDataRange {\n");
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

