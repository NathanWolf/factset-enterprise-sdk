/*
 * Time Series API For Digital Portals
 * Time series data, end-of-day or intraday, tick-by-tick or subsampled. Additional vendor-specific endpoints provide a modified interface for seamless integration with the ChartIQ chart library.  This API is focused on high-performance applications that are  * serving millions of end-users, * accessible by client browsers via the internet, * integrated into complex infrastructures such as existing frontend frameworks or authentication services.  This API has been designed for direct use by client web applications and feature extreme low latency: The average response time across all endpoints is 30 ms whereas 99% of all requests are answered in close to under 300ms.  See the [Real-Time Quotes API for Digital Portals](https://developer.factset.com/api-catalog/real-time-quotes-api) for access to detailed price information. 
 *
 * The version of the OpenAPI document: 3.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.RealTimeTimeSeries.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.RealTimeTimeSeries.models.PostPricesTimeSeriesIntradayListRequestData;
import com.factset.sdk.RealTimeTimeSeries.models.PostPricesTimeSeriesIntradayListRequestMeta;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.RealTimeTimeSeries.JSON;


/**
 * Request Body
 */
@ApiModel(description = "Request Body")
@JsonPropertyOrder({
  PostPricesTimeSeriesIntradayListRequest.JSON_PROPERTY_DATA,
  PostPricesTimeSeriesIntradayListRequest.JSON_PROPERTY_META
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PostPricesTimeSeriesIntradayListRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_DATA = "data";
  private PostPricesTimeSeriesIntradayListRequestData data;

  public static final String JSON_PROPERTY_META = "meta";
  private PostPricesTimeSeriesIntradayListRequestMeta meta;

  public PostPricesTimeSeriesIntradayListRequest() { 
  }

  @JsonCreator
  public PostPricesTimeSeriesIntradayListRequest(
    @JsonProperty(value=JSON_PROPERTY_DATA, required=true) PostPricesTimeSeriesIntradayListRequestData data
  ) {
    this();
    this.data = data;
  }

  public PostPricesTimeSeriesIntradayListRequest data(PostPricesTimeSeriesIntradayListRequestData data) {
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

  public PostPricesTimeSeriesIntradayListRequestData getData() {
    return data;
  }


  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setData(PostPricesTimeSeriesIntradayListRequestData data) {
    this.data = data;
  }


  public PostPricesTimeSeriesIntradayListRequest meta(PostPricesTimeSeriesIntradayListRequestMeta meta) {
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

  public PostPricesTimeSeriesIntradayListRequestMeta getMeta() {
    return meta;
  }


  @JsonProperty(JSON_PROPERTY_META)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMeta(PostPricesTimeSeriesIntradayListRequestMeta meta) {
    this.meta = meta;
  }


  /**
   * Return true if this PostPricesTimeSeriesIntradayListRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostPricesTimeSeriesIntradayListRequest postPricesTimeSeriesIntradayListRequest = (PostPricesTimeSeriesIntradayListRequest) o;
    return Objects.equals(this.data, postPricesTimeSeriesIntradayListRequest.data) &&
        Objects.equals(this.meta, postPricesTimeSeriesIntradayListRequest.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostPricesTimeSeriesIntradayListRequest {\n");
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

