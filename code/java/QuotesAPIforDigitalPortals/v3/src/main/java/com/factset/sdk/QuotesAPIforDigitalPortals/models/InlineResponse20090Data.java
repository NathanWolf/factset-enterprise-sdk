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
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20090DataEvents;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20090DataRange;
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
 * List of trading schedule events for a notation.
 */
@ApiModel(description = "List of trading schedule events for a notation.")
@JsonPropertyOrder({
  InlineResponse20090Data.JSON_PROPERTY_ID_NOTATION,
  InlineResponse20090Data.JSON_PROPERTY_SOURCE_IDENTIFIER,
  InlineResponse20090Data.JSON_PROPERTY_RANGE,
  InlineResponse20090Data.JSON_PROPERTY_EVENTS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse20090Data implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ID_NOTATION = "idNotation";
  private JsonNullable<String> idNotation = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SOURCE_IDENTIFIER = "sourceIdentifier";
  private JsonNullable<String> sourceIdentifier = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_RANGE = "range";
  private JsonNullable<InlineResponse20090DataRange> range = JsonNullable.<InlineResponse20090DataRange>undefined();

  public static final String JSON_PROPERTY_EVENTS = "events";
  private java.util.List<InlineResponse20090DataEvents> events = null;

  public InlineResponse20090Data() { 
  }

  public InlineResponse20090Data idNotation(String idNotation) {
    this.idNotation = JsonNullable.<String>of(idNotation);
    return this;
  }

   /**
   * MDG identifier of the listing.
   * @return idNotation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "MDG identifier of the listing.")
  @JsonIgnore

  public String getIdNotation() {
        return idNotation.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ID_NOTATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getIdNotation_JsonNullable() {
    return idNotation;
  }
  
  @JsonProperty(JSON_PROPERTY_ID_NOTATION)
  public void setIdNotation_JsonNullable(JsonNullable<String> idNotation) {
    this.idNotation = idNotation;
  }

  public void setIdNotation(String idNotation) {
    this.idNotation = JsonNullable.<String>of(idNotation);
  }


  public InlineResponse20090Data sourceIdentifier(String sourceIdentifier) {
    this.sourceIdentifier = JsonNullable.<String>of(sourceIdentifier);
    return this;
  }

   /**
   * Identifier used in the request.
   * @return sourceIdentifier
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Identifier used in the request.")
  @JsonIgnore

  public String getSourceIdentifier() {
        return sourceIdentifier.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SOURCE_IDENTIFIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getSourceIdentifier_JsonNullable() {
    return sourceIdentifier;
  }
  
  @JsonProperty(JSON_PROPERTY_SOURCE_IDENTIFIER)
  public void setSourceIdentifier_JsonNullable(JsonNullable<String> sourceIdentifier) {
    this.sourceIdentifier = sourceIdentifier;
  }

  public void setSourceIdentifier(String sourceIdentifier) {
    this.sourceIdentifier = JsonNullable.<String>of(sourceIdentifier);
  }


  public InlineResponse20090Data range(InlineResponse20090DataRange range) {
    this.range = JsonNullable.<InlineResponse20090DataRange>of(range);
    return this;
  }

   /**
   * Get range
   * @return range
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public InlineResponse20090DataRange getRange() {
        return range.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_RANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<InlineResponse20090DataRange> getRange_JsonNullable() {
    return range;
  }
  
  @JsonProperty(JSON_PROPERTY_RANGE)
  public void setRange_JsonNullable(JsonNullable<InlineResponse20090DataRange> range) {
    this.range = range;
  }

  public void setRange(InlineResponse20090DataRange range) {
    this.range = JsonNullable.<InlineResponse20090DataRange>of(range);
  }


  public InlineResponse20090Data events(java.util.List<InlineResponse20090DataEvents> events) {
    this.events = events;
    return this;
  }

  public InlineResponse20090Data addEventsItem(InlineResponse20090DataEvents eventsItem) {
    if (this.events == null) {
      this.events = new java.util.ArrayList<>();
    }
    this.events.add(eventsItem);
    return this;
  }

   /**
   * List of trading schedule events.
   * @return events
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of trading schedule events.")
  @JsonProperty(JSON_PROPERTY_EVENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<InlineResponse20090DataEvents> getEvents() {
    return events;
  }


  @JsonProperty(JSON_PROPERTY_EVENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEvents(java.util.List<InlineResponse20090DataEvents> events) {
    this.events = events;
  }


  /**
   * Return true if this inline_response_200_90_data object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20090Data inlineResponse20090Data = (InlineResponse20090Data) o;
    return equalsNullable(this.idNotation, inlineResponse20090Data.idNotation) &&
        equalsNullable(this.sourceIdentifier, inlineResponse20090Data.sourceIdentifier) &&
        equalsNullable(this.range, inlineResponse20090Data.range) &&
        Objects.equals(this.events, inlineResponse20090Data.events);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(idNotation), hashCodeNullable(sourceIdentifier), hashCodeNullable(range), events);
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
    sb.append("class InlineResponse20090Data {\n");
    sb.append("    idNotation: ").append(toIndentedString(idNotation)).append("\n");
    sb.append("    sourceIdentifier: ").append(toIndentedString(sourceIdentifier)).append("\n");
    sb.append("    range: ").append(toIndentedString(range)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
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

