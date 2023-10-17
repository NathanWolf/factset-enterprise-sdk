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
import com.factset.sdk.RealTimeQuotes.models.InlineResponse20036Fsym;
import com.factset.sdk.RealTimeQuotes.models.InlineResponse20055DataValidity;
import com.factset.sdk.RealTimeQuotes.models.InlineResponse20057Status;
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
 * InlineResponse20057Data
 */
@JsonPropertyOrder({
  InlineResponse20057Data.JSON_PROPERTY_ID,
  InlineResponse20057Data.JSON_PROPERTY_FSYM,
  InlineResponse20057Data.JSON_PROPERTY_VALIDITY,
  InlineResponse20057Data.JSON_PROPERTY_SOURCE_W_K_N,
  InlineResponse20057Data.JSON_PROPERTY_STATUS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse20057Data implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ID = "id";
  private JsonNullable<String> id = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_FSYM = "fsym";
  private InlineResponse20036Fsym fsym;

  public static final String JSON_PROPERTY_VALIDITY = "validity";
  private JsonNullable<InlineResponse20055DataValidity> validity = JsonNullable.<InlineResponse20055DataValidity>undefined();

  public static final String JSON_PROPERTY_SOURCE_W_K_N = "sourceWKN";
  private JsonNullable<String> sourceWKN = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_STATUS = "status";
  private InlineResponse20057Status status;

  public InlineResponse20057Data() { 
  }

  public InlineResponse20057Data id(String id) {
    this.id = JsonNullable.<String>of(id);
    return this;
  }

   /**
   * Identifier of the instrument.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Identifier of the instrument.")
  @JsonIgnore

  public String getId() {
        return id.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getId_JsonNullable() {
    return id;
  }
  
  @JsonProperty(JSON_PROPERTY_ID)
  public void setId_JsonNullable(JsonNullable<String> id) {
    this.id = id;
  }

  public void setId(String id) {
    this.id = JsonNullable.<String>of(id);
  }


  public InlineResponse20057Data fsym(InlineResponse20036Fsym fsym) {
    this.fsym = fsym;
    return this;
  }

   /**
   * Get fsym
   * @return fsym
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FSYM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse20036Fsym getFsym() {
    return fsym;
  }


  @JsonProperty(JSON_PROPERTY_FSYM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFsym(InlineResponse20036Fsym fsym) {
    this.fsym = fsym;
  }


  public InlineResponse20057Data validity(InlineResponse20055DataValidity validity) {
    this.validity = JsonNullable.<InlineResponse20055DataValidity>of(validity);
    return this;
  }

   /**
   * Get validity
   * @return validity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public InlineResponse20055DataValidity getValidity() {
        return validity.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_VALIDITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<InlineResponse20055DataValidity> getValidity_JsonNullable() {
    return validity;
  }
  
  @JsonProperty(JSON_PROPERTY_VALIDITY)
  public void setValidity_JsonNullable(JsonNullable<InlineResponse20055DataValidity> validity) {
    this.validity = validity;
  }

  public void setValidity(InlineResponse20055DataValidity validity) {
    this.validity = JsonNullable.<InlineResponse20055DataValidity>of(validity);
  }


  public InlineResponse20057Data sourceWKN(String sourceWKN) {
    this.sourceWKN = JsonNullable.<String>of(sourceWKN);
    return this;
  }

   /**
   * The source WKN that the instrument is translated for.
   * @return sourceWKN
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The source WKN that the instrument is translated for.")
  @JsonIgnore

  public String getSourceWKN() {
        return sourceWKN.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SOURCE_W_K_N)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getSourceWKN_JsonNullable() {
    return sourceWKN;
  }
  
  @JsonProperty(JSON_PROPERTY_SOURCE_W_K_N)
  public void setSourceWKN_JsonNullable(JsonNullable<String> sourceWKN) {
    this.sourceWKN = sourceWKN;
  }

  public void setSourceWKN(String sourceWKN) {
    this.sourceWKN = JsonNullable.<String>of(sourceWKN);
  }


  public InlineResponse20057Data status(InlineResponse20057Status status) {
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

  public InlineResponse20057Status getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(InlineResponse20057Status status) {
    this.status = status;
  }


  /**
   * Return true if this inline_response_200_57_data object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20057Data inlineResponse20057Data = (InlineResponse20057Data) o;
    return equalsNullable(this.id, inlineResponse20057Data.id) &&
        Objects.equals(this.fsym, inlineResponse20057Data.fsym) &&
        equalsNullable(this.validity, inlineResponse20057Data.validity) &&
        equalsNullable(this.sourceWKN, inlineResponse20057Data.sourceWKN) &&
        Objects.equals(this.status, inlineResponse20057Data.status);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(id), fsym, hashCodeNullable(validity), hashCodeNullable(sourceWKN), status);
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
    sb.append("class InlineResponse20057Data {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    fsym: ").append(toIndentedString(fsym)).append("\n");
    sb.append("    validity: ").append(toIndentedString(validity)).append("\n");
    sb.append("    sourceWKN: ").append(toIndentedString(sourceWKN)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

