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
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20020DataSubdivisions;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.QuotesAPIforDigitalPortals.JSON;


/**
 * Details of a country.
 */
@ApiModel(description = "Details of a country.")
@JsonPropertyOrder({
  InlineResponse20020Data.JSON_PROPERTY_ID,
  InlineResponse20020Data.JSON_PROPERTY_NAME,
  InlineResponse20020Data.JSON_PROPERTY_SUBDIVISIONS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse20020Data implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ID = "id";
  private BigDecimal id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SUBDIVISIONS = "subdivisions";
  private java.util.List<InlineResponse20020DataSubdivisions> subdivisions = null;

  public InlineResponse20020Data() { 
  }

  public InlineResponse20020Data id(BigDecimal id) {
    this.id = id;
    return this;
  }

   /**
   * Identifier of a country.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Identifier of a country.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(BigDecimal id) {
    this.id = id;
  }


  public InlineResponse20020Data name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the country.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the country.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public InlineResponse20020Data subdivisions(java.util.List<InlineResponse20020DataSubdivisions> subdivisions) {
    this.subdivisions = subdivisions;
    return this;
  }

  public InlineResponse20020Data addSubdivisionsItem(InlineResponse20020DataSubdivisions subdivisionsItem) {
    if (this.subdivisions == null) {
      this.subdivisions = new java.util.ArrayList<>();
    }
    this.subdivisions.add(subdivisionsItem);
    return this;
  }

   /**
   * Get subdivisions
   * @return subdivisions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SUBDIVISIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<InlineResponse20020DataSubdivisions> getSubdivisions() {
    return subdivisions;
  }


  @JsonProperty(JSON_PROPERTY_SUBDIVISIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubdivisions(java.util.List<InlineResponse20020DataSubdivisions> subdivisions) {
    this.subdivisions = subdivisions;
  }


  /**
   * Return true if this inline_response_200_20_data object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20020Data inlineResponse20020Data = (InlineResponse20020Data) o;
    return Objects.equals(this.id, inlineResponse20020Data.id) &&
        Objects.equals(this.name, inlineResponse20020Data.name) &&
        Objects.equals(this.subdivisions, inlineResponse20020Data.subdivisions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, subdivisions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20020Data {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    subdivisions: ").append(toIndentedString(subdivisions)).append("\n");
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

