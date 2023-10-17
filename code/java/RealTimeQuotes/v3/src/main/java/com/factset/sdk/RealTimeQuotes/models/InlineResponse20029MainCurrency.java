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
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.RealTimeQuotes.JSON;


/**
 * Main currency corresponding to the fractional currency.
 */
@ApiModel(description = "Main currency corresponding to the fractional currency.")
@JsonPropertyOrder({
  InlineResponse20029MainCurrency.JSON_PROPERTY_ID,
  InlineResponse20029MainCurrency.JSON_PROPERTY_CODE,
  InlineResponse20029MainCurrency.JSON_PROPERTY_ISO_CODE,
  InlineResponse20029MainCurrency.JSON_PROPERTY_NAME,
  InlineResponse20029MainCurrency.JSON_PROPERTY_ACTIVE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse20029MainCurrency implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ID = "id";
  private JsonNullable<BigDecimal> id = JsonNullable.<BigDecimal>undefined();

  public static final String JSON_PROPERTY_CODE = "code";
  private JsonNullable<String> code = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ISO_CODE = "isoCode";
  private JsonNullable<String> isoCode = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_NAME = "name";
  private JsonNullable<String> name = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ACTIVE = "active";
  private JsonNullable<Boolean> active = JsonNullable.<Boolean>undefined();

  public InlineResponse20029MainCurrency() { 
  }

  public InlineResponse20029MainCurrency id(BigDecimal id) {
    this.id = JsonNullable.<BigDecimal>of(id);
    return this;
  }

   /**
   * Identifier of the main currency of the fractional currency.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Identifier of the main currency of the fractional currency.")
  @JsonIgnore

  public BigDecimal getId() {
        return id.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<BigDecimal> getId_JsonNullable() {
    return id;
  }
  
  @JsonProperty(JSON_PROPERTY_ID)
  public void setId_JsonNullable(JsonNullable<BigDecimal> id) {
    this.id = id;
  }

  public void setId(BigDecimal id) {
    this.id = JsonNullable.<BigDecimal>of(id);
  }


  public InlineResponse20029MainCurrency code(String code) {
    this.code = JsonNullable.<String>of(code);
    return this;
  }

   /**
   * Code of the currency: If assigned, a code according to ISO 4217, otherwise a local code.
   * @return code
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Code of the currency: If assigned, a code according to ISO 4217, otherwise a local code.")
  @JsonIgnore

  public String getCode() {
        return code.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getCode_JsonNullable() {
    return code;
  }
  
  @JsonProperty(JSON_PROPERTY_CODE)
  public void setCode_JsonNullable(JsonNullable<String> code) {
    this.code = code;
  }

  public void setCode(String code) {
    this.code = JsonNullable.<String>of(code);
  }


  public InlineResponse20029MainCurrency isoCode(String isoCode) {
    this.isoCode = JsonNullable.<String>of(isoCode);
    return this;
  }

   /**
   * ISO 4217 code of the currency.
   * @return isoCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ISO 4217 code of the currency.")
  @JsonIgnore

  public String getIsoCode() {
        return isoCode.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ISO_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getIsoCode_JsonNullable() {
    return isoCode;
  }
  
  @JsonProperty(JSON_PROPERTY_ISO_CODE)
  public void setIsoCode_JsonNullable(JsonNullable<String> isoCode) {
    this.isoCode = isoCode;
  }

  public void setIsoCode(String isoCode) {
    this.isoCode = JsonNullable.<String>of(isoCode);
  }


  public InlineResponse20029MainCurrency name(String name) {
    this.name = JsonNullable.<String>of(name);
    return this;
  }

   /**
   * Name of the main currency.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the main currency.")
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


  public InlineResponse20029MainCurrency active(Boolean active) {
    this.active = JsonNullable.<Boolean>of(active);
    return this;
  }

   /**
   * Indicates whether the currency is active.
   * @return active
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether the currency is active.")
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


  /**
   * Return true if this inline_response_200_29_mainCurrency object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20029MainCurrency inlineResponse20029MainCurrency = (InlineResponse20029MainCurrency) o;
    return equalsNullable(this.id, inlineResponse20029MainCurrency.id) &&
        equalsNullable(this.code, inlineResponse20029MainCurrency.code) &&
        equalsNullable(this.isoCode, inlineResponse20029MainCurrency.isoCode) &&
        equalsNullable(this.name, inlineResponse20029MainCurrency.name) &&
        equalsNullable(this.active, inlineResponse20029MainCurrency.active);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(id), hashCodeNullable(code), hashCodeNullable(isoCode), hashCodeNullable(name), hashCodeNullable(active));
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
    sb.append("class InlineResponse20029MainCurrency {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    isoCode: ").append(toIndentedString(isoCode)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
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

