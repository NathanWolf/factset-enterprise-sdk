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
import com.factset.sdk.RealTimeQuotes.models.InlineResponse2008DataCountry;
import com.factset.sdk.RealTimeQuotes.models.InlineResponse2008DataGroup;
import com.factset.sdk.RealTimeQuotes.models.InlineResponse2008DataTimezone;
import com.factset.sdk.RealTimeQuotes.models.InlineResponse2008DataType;
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
import com.factset.sdk.RealTimeQuotes.JSON;


/**
 * Details of a market
 */
@ApiModel(description = "Details of a market")
@JsonPropertyOrder({
  InlineResponse2008Data.JSON_PROPERTY_NAME,
  InlineResponse2008Data.JSON_PROPERTY_SHORT_NAME,
  InlineResponse2008Data.JSON_PROPERTY_ACTIVE,
  InlineResponse2008Data.JSON_PROPERTY_COUNTRY,
  InlineResponse2008Data.JSON_PROPERTY_TYPE,
  InlineResponse2008Data.JSON_PROPERTY_GROUP,
  InlineResponse2008Data.JSON_PROPERTY_TIMEZONE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse2008Data implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_NAME = "name";
  private JsonNullable<String> name = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SHORT_NAME = "shortName";
  private JsonNullable<String> shortName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ACTIVE = "active";
  private JsonNullable<Boolean> active = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_COUNTRY = "country";
  private InlineResponse2008DataCountry country;

  public static final String JSON_PROPERTY_TYPE = "type";
  private InlineResponse2008DataType type;

  public static final String JSON_PROPERTY_GROUP = "group";
  private InlineResponse2008DataGroup group;

  public static final String JSON_PROPERTY_TIMEZONE = "timezone";
  private InlineResponse2008DataTimezone timezone;

  public InlineResponse2008Data() { 
  }

  public InlineResponse2008Data name(String name) {
    this.name = JsonNullable.<String>of(name);
    return this;
  }

   /**
   * Name of the market.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the market.")
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


  public InlineResponse2008Data shortName(String shortName) {
    this.shortName = JsonNullable.<String>of(shortName);
    return this;
  }

   /**
   * Short name of the market.
   * @return shortName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Short name of the market.")
  @JsonIgnore

  public String getShortName() {
        return shortName.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SHORT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getShortName_JsonNullable() {
    return shortName;
  }
  
  @JsonProperty(JSON_PROPERTY_SHORT_NAME)
  public void setShortName_JsonNullable(JsonNullable<String> shortName) {
    this.shortName = shortName;
  }

  public void setShortName(String shortName) {
    this.shortName = JsonNullable.<String>of(shortName);
  }


  public InlineResponse2008Data active(Boolean active) {
    this.active = JsonNullable.<Boolean>of(active);
    return this;
  }

   /**
   * Indicates whether the market exists.
   * @return active
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether the market exists.")
  @JsonIgnore

  public Boolean getActive() {
        return active.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Boolean> getActive_JsonNullable() {
    return active;
  }
  
  @JsonProperty(JSON_PROPERTY_ACTIVE)
  public void setActive_JsonNullable(JsonNullable<Boolean> active) {
    this.active = active;
  }

  public void setActive(Boolean active) {
    this.active = JsonNullable.<Boolean>of(active);
  }


  public InlineResponse2008Data country(InlineResponse2008DataCountry country) {
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2008DataCountry getCountry() {
    return country;
  }


  @JsonProperty(JSON_PROPERTY_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCountry(InlineResponse2008DataCountry country) {
    this.country = country;
  }


  public InlineResponse2008Data type(InlineResponse2008DataType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2008DataType getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(InlineResponse2008DataType type) {
    this.type = type;
  }


  public InlineResponse2008Data group(InlineResponse2008DataGroup group) {
    this.group = group;
    return this;
  }

   /**
   * Get group
   * @return group
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2008DataGroup getGroup() {
    return group;
  }


  @JsonProperty(JSON_PROPERTY_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGroup(InlineResponse2008DataGroup group) {
    this.group = group;
  }


  public InlineResponse2008Data timezone(InlineResponse2008DataTimezone timezone) {
    this.timezone = timezone;
    return this;
  }

   /**
   * Get timezone
   * @return timezone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TIMEZONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2008DataTimezone getTimezone() {
    return timezone;
  }


  @JsonProperty(JSON_PROPERTY_TIMEZONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimezone(InlineResponse2008DataTimezone timezone) {
    this.timezone = timezone;
  }


  /**
   * Return true if this inline_response_200_8_data object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2008Data inlineResponse2008Data = (InlineResponse2008Data) o;
    return equalsNullable(this.name, inlineResponse2008Data.name) &&
        equalsNullable(this.shortName, inlineResponse2008Data.shortName) &&
        equalsNullable(this.active, inlineResponse2008Data.active) &&
        Objects.equals(this.country, inlineResponse2008Data.country) &&
        Objects.equals(this.type, inlineResponse2008Data.type) &&
        Objects.equals(this.group, inlineResponse2008Data.group) &&
        Objects.equals(this.timezone, inlineResponse2008Data.timezone);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(name), hashCodeNullable(shortName), hashCodeNullable(active), country, type, group, timezone);
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
    sb.append("class InlineResponse2008Data {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    shortName: ").append(toIndentedString(shortName)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
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

