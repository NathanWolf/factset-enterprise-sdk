/*
 * Quotes API For Digital Portals
 * The Quotes API combines endpoints for retrieving security end-of-day, delayed, and realtime prices with performance key figures and basic reference data on the security and market level.  The API supports over 20 different price types for each quote and comes with basic search endpoints based on security identifiers and instrument names. Market coverage is included in the *Sample Use Cases* section below.  The Digital Portal use case is focused on high-performance applications that are  * serving millions of end-users, * accessible by client browsers via the internet, * supporting subscriptions for streamed updates out-of-the-box, * typically combining a wide variety of *for Digital Portals*-APIs into a highly use-case specific solution for customers, * integrated into complex infrastructures such as existing frontend frameworks, authentication services.  All APIs labelled *for Digital Portals* have been designed for direct use by client web applications and feature extreme low latency: The average response time across all endpoints is 30 ms whereas 99% of all requests are answered in close to under 300ms.  See the [Time Series API for Digital Portals](https://developer.factset.com/api-catalog/time-series-api-digital-portals) for direct access to price histories, and the [News API for Digital Portals](https://developer.factset.com/api-catalog/news-api-digital-portals) for searching and fetching related news. 
 *
 * The version of the OpenAPI document: 3.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.RealTimeQuotes.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.RealTimeQuotes.models.OffsetBasedPaginationOutputObject;
import com.factset.sdk.RealTimeQuotes.models.PartialOutputObject;
import com.factset.sdk.RealTimeQuotes.models.StatusObject;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.RealTimeQuotes.JSON;


/**
 * The meta member contains the meta information of the response.
 */
@ApiModel(description = "The meta member contains the meta information of the response.")
@JsonPropertyOrder({
  InlineResponse20036Meta.JSON_PROPERTY_STATUS,
  InlineResponse20036Meta.JSON_PROPERTY_PAGINATION,
  InlineResponse20036Meta.JSON_PROPERTY_PARTIAL
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse20036Meta implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_STATUS = "status";
  private StatusObject status;

  public static final String JSON_PROPERTY_PAGINATION = "pagination";
  private OffsetBasedPaginationOutputObject pagination;

  public static final String JSON_PROPERTY_PARTIAL = "partial";
  private PartialOutputObject partial;

  public InlineResponse20036Meta() { 
  }

  public InlineResponse20036Meta status(StatusObject status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StatusObject getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(StatusObject status) {
    this.status = status;
  }


  public InlineResponse20036Meta pagination(OffsetBasedPaginationOutputObject pagination) {
    this.pagination = pagination;
    return this;
  }

   /**
   * Get pagination
   * @return pagination
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PAGINATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetBasedPaginationOutputObject getPagination() {
    return pagination;
  }


  @JsonProperty(JSON_PROPERTY_PAGINATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPagination(OffsetBasedPaginationOutputObject pagination) {
    this.pagination = pagination;
  }


  public InlineResponse20036Meta partial(PartialOutputObject partial) {
    this.partial = partial;
    return this;
  }

   /**
   * Get partial
   * @return partial
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PARTIAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PartialOutputObject getPartial() {
    return partial;
  }


  @JsonProperty(JSON_PROPERTY_PARTIAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPartial(PartialOutputObject partial) {
    this.partial = partial;
  }


  /**
   * Return true if this inline_response_200_36_meta object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20036Meta inlineResponse20036Meta = (InlineResponse20036Meta) o;
    return Objects.equals(this.status, inlineResponse20036Meta.status) &&
        Objects.equals(this.pagination, inlineResponse20036Meta.pagination) &&
        Objects.equals(this.partial, inlineResponse20036Meta.partial);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, pagination, partial);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20036Meta {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
    sb.append("    partial: ").append(toIndentedString(partial)).append("\n");
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

