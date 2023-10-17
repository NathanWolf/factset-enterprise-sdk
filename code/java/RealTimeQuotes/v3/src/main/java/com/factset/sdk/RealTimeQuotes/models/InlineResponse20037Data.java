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
import com.factset.sdk.RealTimeQuotes.models.InlineResponse20037DataSystem;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.RealTimeQuotes.JSON;


/**
 * Details of the category level.
 */
@ApiModel(description = "Details of the category level.")
@JsonPropertyOrder({
  InlineResponse20037Data.JSON_PROPERTY_NAME,
  InlineResponse20037Data.JSON_PROPERTY_NUMBER,
  InlineResponse20037Data.JSON_PROPERTY_HAS_LEAF_CATEGORIES,
  InlineResponse20037Data.JSON_PROPERTY_SYSTEM
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse20037Data implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_NAME = "name";
  private JsonNullable<String> name = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_NUMBER = "number";
  private JsonNullable<BigDecimal> number = JsonNullable.<BigDecimal>undefined();

  public static final String JSON_PROPERTY_HAS_LEAF_CATEGORIES = "hasLeafCategories";
  private JsonNullable<Boolean> hasLeafCategories = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_SYSTEM = "system";
  private InlineResponse20037DataSystem system;

  public InlineResponse20037Data() { 
  }

  public InlineResponse20037Data name(String name) {
    this.name = JsonNullable.<String>of(name);
    return this;
  }

   /**
   * Name of the level.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the level.")
  @JsonIgnore

  public String getName() {
        return name.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getName_JsonNullable() {
    return name;
  }
  
  @JsonProperty(JSON_PROPERTY_NAME)
  public void setName_JsonNullable(JsonNullable<String> name) {
    this.name = name;
  }

  public void setName(String name) {
    this.name = JsonNullable.<String>of(name);
  }


  public InlineResponse20037Data number(BigDecimal number) {
    this.number = JsonNullable.<BigDecimal>of(number);
    return this;
  }

   /**
   * Number of the category level, starting with 1.
   * @return number
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of the category level, starting with 1.")
  @JsonIgnore

  public BigDecimal getNumber() {
        return number.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<BigDecimal> getNumber_JsonNullable() {
    return number;
  }
  
  @JsonProperty(JSON_PROPERTY_NUMBER)
  public void setNumber_JsonNullable(JsonNullable<BigDecimal> number) {
    this.number = number;
  }

  public void setNumber(BigDecimal number) {
    this.number = JsonNullable.<BigDecimal>of(number);
  }


  public InlineResponse20037Data hasLeafCategories(Boolean hasLeafCategories) {
    this.hasLeafCategories = JsonNullable.<Boolean>of(hasLeafCategories);
    return this;
  }

   /**
   * Indicates whether the category level has leaf categories.
   * @return hasLeafCategories
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether the category level has leaf categories.")
  @JsonIgnore

  public Boolean getHasLeafCategories() {
        return hasLeafCategories.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_HAS_LEAF_CATEGORIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Boolean> getHasLeafCategories_JsonNullable() {
    return hasLeafCategories;
  }
  
  @JsonProperty(JSON_PROPERTY_HAS_LEAF_CATEGORIES)
  public void setHasLeafCategories_JsonNullable(JsonNullable<Boolean> hasLeafCategories) {
    this.hasLeafCategories = hasLeafCategories;
  }

  public void setHasLeafCategories(Boolean hasLeafCategories) {
    this.hasLeafCategories = JsonNullable.<Boolean>of(hasLeafCategories);
  }


  public InlineResponse20037Data system(InlineResponse20037DataSystem system) {
    this.system = system;
    return this;
  }

   /**
   * Get system
   * @return system
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SYSTEM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse20037DataSystem getSystem() {
    return system;
  }


  @JsonProperty(JSON_PROPERTY_SYSTEM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSystem(InlineResponse20037DataSystem system) {
    this.system = system;
  }


  /**
   * Return true if this inline_response_200_37_data object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20037Data inlineResponse20037Data = (InlineResponse20037Data) o;
    return equalsNullable(this.name, inlineResponse20037Data.name) &&
        equalsNullable(this.number, inlineResponse20037Data.number) &&
        equalsNullable(this.hasLeafCategories, inlineResponse20037Data.hasLeafCategories) &&
        Objects.equals(this.system, inlineResponse20037Data.system);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(name), hashCodeNullable(number), hashCodeNullable(hasLeafCategories), system);
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
    sb.append("class InlineResponse20037Data {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    hasLeafCategories: ").append(toIndentedString(hasLeafCategories)).append("\n");
    sb.append("    system: ").append(toIndentedString(system)).append("\n");
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

