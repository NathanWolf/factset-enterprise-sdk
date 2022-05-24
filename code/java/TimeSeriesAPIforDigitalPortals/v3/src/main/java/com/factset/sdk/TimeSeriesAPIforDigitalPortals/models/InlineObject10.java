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
import com.factset.sdk.TimeSeriesAPIforDigitalPortals.models.VendorChartIQTimeSeriesEodListMeta;
import com.factset.sdk.TimeSeriesAPIforDigitalPortals.models.VendorChartIQTimeSeriesIntradaySubsampleListData;
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
 * InlineObject10
 */
@JsonPropertyOrder({
  InlineObject10.JSON_PROPERTY_DATA,
  InlineObject10.JSON_PROPERTY_META
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineObject10 implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_DATA = "data";
  private VendorChartIQTimeSeriesIntradaySubsampleListData data;

  public static final String JSON_PROPERTY_META = "meta";
  private VendorChartIQTimeSeriesEodListMeta meta;

  public InlineObject10() { 
  }

  @JsonCreator
  public InlineObject10(
    @JsonProperty(value=JSON_PROPERTY_DATA, required=true) VendorChartIQTimeSeriesIntradaySubsampleListData data
  ) {
    this();
    this.data = data;
  }

  public InlineObject10 data(VendorChartIQTimeSeriesIntradaySubsampleListData data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public VendorChartIQTimeSeriesIntradaySubsampleListData getData() {
    return data;
  }


  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setData(VendorChartIQTimeSeriesIntradaySubsampleListData data) {
    this.data = data;
  }


  public InlineObject10 meta(VendorChartIQTimeSeriesEodListMeta meta) {
    this.meta = meta;
    return this;
  }

   /**
   * Get meta
   * @return meta
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_META)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public VendorChartIQTimeSeriesEodListMeta getMeta() {
    return meta;
  }


  @JsonProperty(JSON_PROPERTY_META)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMeta(VendorChartIQTimeSeriesEodListMeta meta) {
    this.meta = meta;
  }


  /**
   * Return true if this inline_object_10 object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineObject10 inlineObject10 = (InlineObject10) o;
    return Objects.equals(this.data, inlineObject10.data) &&
        Objects.equals(this.meta, inlineObject10.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineObject10 {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
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

