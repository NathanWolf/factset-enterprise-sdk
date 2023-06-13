/*
 * Quotes API For Digital Portals
 * The Quotes API combines endpoints for retrieving security end-of-day, delayed, and realtime prices with performance key figures and basic reference data on the security and market level.  The API supports over 20 different price types for each quote and comes with basic search endpoints based on security identifiers and instrument names. Market coverage is included in the *Sample Use Cases* section below.  The Digital Portal use case is focused on high-performance applications that are  * serving millions of end-users, * accessible by client browsers via the internet, * supporting subscriptions for streamed updates out-of-the-box, * typically combining a wide variety of *for Digital Portals*-APIs into a highly use-case specific solution for customers, * integrated into complex infrastructures such as existing frontend frameworks, authentication services.  All APIs labelled *for Digital Portals* have been designed for direct use by client web applications and feature extreme low latency: The average response time across all endpoints is 30 ms whereas 99% of all requests are answered in close to under 300ms.  See the [Time Series API for Digital Portals](https://developer.factset.com/api-catalog/time-series-api-digital-portals) for direct access to price histories, and the [News API for Digital Portals](https://developer.factset.com/api-catalog/news-api-digital-portals) for searching and fetching related news. 
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
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20072DataRegionalListing;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.QuotesAPIforDigitalPortals.JSON;


/**
 * Regional-level data with assigned listing-level data. If the set of regional identifiers contains an element for which the attribute &#x60;isPrimary &#x3D; true&#x60;, then this element is the first one in the array.
 */
@ApiModel(description = "Regional-level data with assigned listing-level data. If the set of regional identifiers contains an element for which the attribute `isPrimary = true`, then this element is the first one in the array.")
@JsonPropertyOrder({
  InlineResponse20072DataRegional.JSON_PROPERTY_IS_PRIMARY,
  InlineResponse20072DataRegional.JSON_PROPERTY_PERMANENT_IDENTIFIER,
  InlineResponse20072DataRegional.JSON_PROPERTY_TICKER_REGION,
  InlineResponse20072DataRegional.JSON_PROPERTY_LISTING
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse20072DataRegional implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_IS_PRIMARY = "isPrimary";
  private JsonNullable<Boolean> isPrimary = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_PERMANENT_IDENTIFIER = "permanentIdentifier";
  private JsonNullable<String> permanentIdentifier = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_TICKER_REGION = "tickerRegion";
  private JsonNullable<String> tickerRegion = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_LISTING = "listing";
  private InlineResponse20072DataRegionalListing listing;

  public InlineResponse20072DataRegional() { 
  }

  public InlineResponse20072DataRegional isPrimary(Boolean isPrimary) {
    this.isPrimary = JsonNullable.<Boolean>of(isPrimary);
    return this;
  }

   /**
   * Indicates whether the regional identifier is the primary regional identifier of the security (&#x60;true&#x60;) or not (&#x60;false&#x60;).
   * @return isPrimary
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether the regional identifier is the primary regional identifier of the security (`true`) or not (`false`).")
  @JsonIgnore

  public Boolean getIsPrimary() {
        return isPrimary.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_IS_PRIMARY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Boolean> getIsPrimary_JsonNullable() {
    return isPrimary;
  }
  
  @JsonProperty(JSON_PROPERTY_IS_PRIMARY)
  public void setIsPrimary_JsonNullable(JsonNullable<Boolean> isPrimary) {
    this.isPrimary = isPrimary;
  }

  public void setIsPrimary(Boolean isPrimary) {
    this.isPrimary = JsonNullable.<Boolean>of(isPrimary);
  }


  public InlineResponse20072DataRegional permanentIdentifier(String permanentIdentifier) {
    this.permanentIdentifier = JsonNullable.<String>of(permanentIdentifier);
    return this;
  }

   /**
   * FactSet Permanent Identifier for a set of one or more notations of the same region with the same value unit. The format is six alpha numeric characters, excluding vowels, with an R suffix (XXXXXX-R).
   * @return permanentIdentifier
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "FactSet Permanent Identifier for a set of one or more notations of the same region with the same value unit. The format is six alpha numeric characters, excluding vowels, with an R suffix (XXXXXX-R).")
  @JsonIgnore

  public String getPermanentIdentifier() {
        return permanentIdentifier.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PERMANENT_IDENTIFIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getPermanentIdentifier_JsonNullable() {
    return permanentIdentifier;
  }
  
  @JsonProperty(JSON_PROPERTY_PERMANENT_IDENTIFIER)
  public void setPermanentIdentifier_JsonNullable(JsonNullable<String> permanentIdentifier) {
    this.permanentIdentifier = permanentIdentifier;
  }

  public void setPermanentIdentifier(String permanentIdentifier) {
    this.permanentIdentifier = JsonNullable.<String>of(permanentIdentifier);
  }


  public InlineResponse20072DataRegional tickerRegion(String tickerRegion) {
    this.tickerRegion = JsonNullable.<String>of(tickerRegion);
    return this;
  }

   /**
   * FactSet regional symbol of the notation, consisting of the ticker and the two-character code of the country or region where the listing is traded (example: FDS-US).
   * @return tickerRegion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "FactSet regional symbol of the notation, consisting of the ticker and the two-character code of the country or region where the listing is traded (example: FDS-US).")
  @JsonIgnore

  public String getTickerRegion() {
        return tickerRegion.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TICKER_REGION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getTickerRegion_JsonNullable() {
    return tickerRegion;
  }
  
  @JsonProperty(JSON_PROPERTY_TICKER_REGION)
  public void setTickerRegion_JsonNullable(JsonNullable<String> tickerRegion) {
    this.tickerRegion = tickerRegion;
  }

  public void setTickerRegion(String tickerRegion) {
    this.tickerRegion = JsonNullable.<String>of(tickerRegion);
  }


  public InlineResponse20072DataRegional listing(InlineResponse20072DataRegionalListing listing) {
    this.listing = listing;
    return this;
  }

   /**
   * Get listing
   * @return listing
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LISTING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse20072DataRegionalListing getListing() {
    return listing;
  }


  @JsonProperty(JSON_PROPERTY_LISTING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setListing(InlineResponse20072DataRegionalListing listing) {
    this.listing = listing;
  }


  /**
   * Return true if this inline_response_200_72_data_regional object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20072DataRegional inlineResponse20072DataRegional = (InlineResponse20072DataRegional) o;
    return equalsNullable(this.isPrimary, inlineResponse20072DataRegional.isPrimary) &&
        equalsNullable(this.permanentIdentifier, inlineResponse20072DataRegional.permanentIdentifier) &&
        equalsNullable(this.tickerRegion, inlineResponse20072DataRegional.tickerRegion) &&
        Objects.equals(this.listing, inlineResponse20072DataRegional.listing);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(isPrimary), hashCodeNullable(permanentIdentifier), hashCodeNullable(tickerRegion), listing);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20072DataRegional {\n");
    sb.append("    isPrimary: ").append(toIndentedString(isPrimary)).append("\n");
    sb.append("    permanentIdentifier: ").append(toIndentedString(permanentIdentifier)).append("\n");
    sb.append("    tickerRegion: ").append(toIndentedString(tickerRegion)).append("\n");
    sb.append("    listing: ").append(toIndentedString(listing)).append("\n");
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

