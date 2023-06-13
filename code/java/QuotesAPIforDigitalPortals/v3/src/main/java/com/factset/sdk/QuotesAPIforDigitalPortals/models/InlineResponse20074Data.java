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
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20073DataRegional;
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
 * Instrument data with a list of regional-level data and assigned listing-level data.
 */
@ApiModel(description = "Instrument data with a list of regional-level data and assigned listing-level data.")
@JsonPropertyOrder({
  InlineResponse20074Data.JSON_PROPERTY_ID_INSTRUMENT,
  InlineResponse20074Data.JSON_PROPERTY_SOURCE_IDENTIFIER,
  InlineResponse20074Data.JSON_PROPERTY_PERMANENT_IDENTIFIER,
  InlineResponse20074Data.JSON_PROPERTY_REGIONAL
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse20074Data implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ID_INSTRUMENT = "idInstrument";
  private JsonNullable<String> idInstrument = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SOURCE_IDENTIFIER = "sourceIdentifier";
  private JsonNullable<String> sourceIdentifier = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PERMANENT_IDENTIFIER = "permanentIdentifier";
  private JsonNullable<String> permanentIdentifier = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_REGIONAL = "regional";
  private java.util.List<InlineResponse20073DataRegional> regional = null;

  public InlineResponse20074Data() { 
  }

  public InlineResponse20074Data idInstrument(String idInstrument) {
    this.idInstrument = JsonNullable.<String>of(idInstrument);
    return this;
  }

   /**
   * MDG identifier of the instrument.
   * @return idInstrument
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "MDG identifier of the instrument.")
  @JsonIgnore

  public String getIdInstrument() {
        return idInstrument.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ID_INSTRUMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getIdInstrument_JsonNullable() {
    return idInstrument;
  }
  
  @JsonProperty(JSON_PROPERTY_ID_INSTRUMENT)
  public void setIdInstrument_JsonNullable(JsonNullable<String> idInstrument) {
    this.idInstrument = idInstrument;
  }

  public void setIdInstrument(String idInstrument) {
    this.idInstrument = JsonNullable.<String>of(idInstrument);
  }


  public InlineResponse20074Data sourceIdentifier(String sourceIdentifier) {
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


  public InlineResponse20074Data permanentIdentifier(String permanentIdentifier) {
    this.permanentIdentifier = JsonNullable.<String>of(permanentIdentifier);
    return this;
  }

   /**
   * FactSet Permanent Identifier for an instrument. The format is six alpha numeric characters, excluding vowels, with an S suffix (XXXXXX-S).
   * @return permanentIdentifier
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "FactSet Permanent Identifier for an instrument. The format is six alpha numeric characters, excluding vowels, with an S suffix (XXXXXX-S).")
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


  public InlineResponse20074Data regional(java.util.List<InlineResponse20073DataRegional> regional) {
    this.regional = regional;
    return this;
  }

  public InlineResponse20074Data addRegionalItem(InlineResponse20073DataRegional regionalItem) {
    if (this.regional == null) {
      this.regional = new java.util.ArrayList<>();
    }
    this.regional.add(regionalItem);
    return this;
  }

   /**
   * Regional-level data with assigned listing-level data. If the set of regional identifiers contains an element for which the attribute &#x60;isPrimary &#x3D; true&#x60;, then this element is the first one in the array.
   * @return regional
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Regional-level data with assigned listing-level data. If the set of regional identifiers contains an element for which the attribute `isPrimary = true`, then this element is the first one in the array.")
  @JsonProperty(JSON_PROPERTY_REGIONAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<InlineResponse20073DataRegional> getRegional() {
    return regional;
  }


  @JsonProperty(JSON_PROPERTY_REGIONAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRegional(java.util.List<InlineResponse20073DataRegional> regional) {
    this.regional = regional;
  }


  /**
   * Return true if this inline_response_200_74_data object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20074Data inlineResponse20074Data = (InlineResponse20074Data) o;
    return equalsNullable(this.idInstrument, inlineResponse20074Data.idInstrument) &&
        equalsNullable(this.sourceIdentifier, inlineResponse20074Data.sourceIdentifier) &&
        equalsNullable(this.permanentIdentifier, inlineResponse20074Data.permanentIdentifier) &&
        Objects.equals(this.regional, inlineResponse20074Data.regional);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(idInstrument), hashCodeNullable(sourceIdentifier), hashCodeNullable(permanentIdentifier), regional);
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
    sb.append("class InlineResponse20074Data {\n");
    sb.append("    idInstrument: ").append(toIndentedString(idInstrument)).append("\n");
    sb.append("    sourceIdentifier: ").append(toIndentedString(sourceIdentifier)).append("\n");
    sb.append("    permanentIdentifier: ").append(toIndentedString(permanentIdentifier)).append("\n");
    sb.append("    regional: ").append(toIndentedString(regional)).append("\n");
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

