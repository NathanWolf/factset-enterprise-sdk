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
 * The data member contains the request&#39;s primary data.
 */
@ApiModel(description = "The data member contains the request's primary data.")
@JsonPropertyOrder({
  PostInstrumentCrossReferenceListByWKNRequestData.JSON_PROPERTY_WKNS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PostInstrumentCrossReferenceListByWKNRequestData implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_WKNS = "wkns";
  private java.util.Set<String> wkns = new java.util.LinkedHashSet<>();

  public PostInstrumentCrossReferenceListByWKNRequestData() { 
  }

  @JsonCreator
  public PostInstrumentCrossReferenceListByWKNRequestData(
    @JsonProperty(value=JSON_PROPERTY_WKNS, required=true) java.util.Set<String> wkns
  ) {
    this();
    this.wkns = wkns;
  }

  public PostInstrumentCrossReferenceListByWKNRequestData wkns(java.util.Set<String> wkns) {
    this.wkns = wkns;
    return this;
  }

  public PostInstrumentCrossReferenceListByWKNRequestData addWknsItem(String wknsItem) {
    this.wkns.add(wknsItem);
    return this;
  }

   /**
   * List of source WKNs to be translated.
   * @return wkns
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "List of source WKNs to be translated.")
  @JsonProperty(JSON_PROPERTY_WKNS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public java.util.Set<String> getWkns() {
    return wkns;
  }


  @JsonProperty(JSON_PROPERTY_WKNS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setWkns(java.util.Set<String> wkns) {
    this.wkns = wkns;
  }


  /**
   * Return true if this PostInstrumentCrossReferenceListByWKNRequest_data object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostInstrumentCrossReferenceListByWKNRequestData postInstrumentCrossReferenceListByWKNRequestData = (PostInstrumentCrossReferenceListByWKNRequestData) o;
    return Objects.equals(this.wkns, postInstrumentCrossReferenceListByWKNRequestData.wkns);
  }

  @Override
  public int hashCode() {
    return Objects.hash(wkns);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostInstrumentCrossReferenceListByWKNRequestData {\n");
    sb.append("    wkns: ").append(toIndentedString(wkns)).append("\n");
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

