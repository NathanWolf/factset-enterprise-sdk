/*
 * Quotes API For Digital Portals
 * The quotes API combines endpoints for retrieving security end-of-day, delayed, and realtime prices with performance key figures and basic reference data on the security and market level.  The API supports over 20 different price types for each quote and comes with basic search endpoints based on security identifiers and instrument names. Market coverage is included in the *Sample Use Cases* section below.  The Digital Portal use case is focused on high-performance applications that are  * serving millions of end-users, * accessible by client browsers via the internet, * supporting subscriptions for streamed updates out-of-the-box, * typically combining a wide variety of *for Digital Portals*-APIs into a highly use-case specific solution for customers, * integrated into complex infrastructures such as existing frontend frameworks, authentication services.  All APIs labelled *for Digital Portals* have been designed for direct use by client web applications and feature extreme low latency: The average response time across all endpoints is 30 ms whereas 99% of all requests are answered in close to under 300ms.  See the Time Series API for Digital Portals for direct access to price histories, and the News API for Digital Portals for searching and fetching related news.
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
import com.factset.sdk.QuotesAPIforDigitalPortals.models.NotationCrossReferenceListByInstrumentDataFilter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.QuotesAPIforDigitalPortals.JSON;


/**
 * The data member contains the request&#39;s primary data.
 */
@ApiModel(description = "The data member contains the request's primary data.")
@JsonPropertyOrder({
  NotationCrossReferenceListByISINData.JSON_PROPERTY_ISIN,
  NotationCrossReferenceListByISINData.JSON_PROPERTY_FILTER
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class NotationCrossReferenceListByISINData implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ISIN = "isin";
  private String isin;

  public static final String JSON_PROPERTY_FILTER = "filter";
  private NotationCrossReferenceListByInstrumentDataFilter filter;

  public NotationCrossReferenceListByISINData() { 
  }

  @JsonCreator
  public NotationCrossReferenceListByISINData(
    @JsonProperty(value=JSON_PROPERTY_ISIN, required=true) String isin
  ) {
    this();
    this.isin = isin;
  }

  public NotationCrossReferenceListByISINData isin(String isin) {
    this.isin = isin;
    return this;
  }

   /**
   * International Securities Identification Number.
   * @return isin
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "International Securities Identification Number.")
  @JsonProperty(JSON_PROPERTY_ISIN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getIsin() {
    return isin;
  }


  @JsonProperty(JSON_PROPERTY_ISIN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIsin(String isin) {
    this.isin = isin;
  }


  public NotationCrossReferenceListByISINData filter(NotationCrossReferenceListByInstrumentDataFilter filter) {
    this.filter = filter;
    return this;
  }

   /**
   * Get filter
   * @return filter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FILTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public NotationCrossReferenceListByInstrumentDataFilter getFilter() {
    return filter;
  }


  @JsonProperty(JSON_PROPERTY_FILTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFilter(NotationCrossReferenceListByInstrumentDataFilter filter) {
    this.filter = filter;
  }


  /**
   * Return true if this _notation_crossReference_listByISIN_data object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotationCrossReferenceListByISINData notationCrossReferenceListByISINData = (NotationCrossReferenceListByISINData) o;
    return Objects.equals(this.isin, notationCrossReferenceListByISINData.isin) &&
        Objects.equals(this.filter, notationCrossReferenceListByISINData.filter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isin, filter);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotationCrossReferenceListByISINData {\n");
    sb.append("    isin: ").append(toIndentedString(isin)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
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

