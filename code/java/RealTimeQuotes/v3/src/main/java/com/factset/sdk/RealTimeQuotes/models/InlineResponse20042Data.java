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
import com.factset.sdk.RealTimeQuotes.models.InlineResponse20042DataAssetClass;
import com.factset.sdk.RealTimeQuotes.models.InlineResponse20042DataNsin;
import com.factset.sdk.RealTimeQuotes.models.InlineResponse20042DataType;
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
 * Set of basic data for the instrument.
 */
@ApiModel(description = "Set of basic data for the instrument.")
@JsonPropertyOrder({
  InlineResponse20042Data.JSON_PROPERTY_ID_INSTRUMENT,
  InlineResponse20042Data.JSON_PROPERTY_SOURCE_IDENTIFIER,
  InlineResponse20042Data.JSON_PROPERTY_NAME,
  InlineResponse20042Data.JSON_PROPERTY_SHORT_NAME,
  InlineResponse20042Data.JSON_PROPERTY_ISIN,
  InlineResponse20042Data.JSON_PROPERTY_NSIN,
  InlineResponse20042Data.JSON_PROPERTY_FSYM,
  InlineResponse20042Data.JSON_PROPERTY_ASSET_CLASS,
  InlineResponse20042Data.JSON_PROPERTY_TYPE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse20042Data implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ID_INSTRUMENT = "idInstrument";
  private JsonNullable<String> idInstrument = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SOURCE_IDENTIFIER = "sourceIdentifier";
  private JsonNullable<String> sourceIdentifier = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_NAME = "name";
  private JsonNullable<String> name = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SHORT_NAME = "shortName";
  private JsonNullable<String> shortName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ISIN = "isin";
  private JsonNullable<String> isin = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_NSIN = "nsin";
  private InlineResponse20042DataNsin nsin;

  public static final String JSON_PROPERTY_FSYM = "fsym";
  private InlineResponse20036Fsym fsym;

  public static final String JSON_PROPERTY_ASSET_CLASS = "assetClass";
  private InlineResponse20042DataAssetClass assetClass;

  public static final String JSON_PROPERTY_TYPE = "type";
  private java.util.List<InlineResponse20042DataType> type = null;

  public InlineResponse20042Data() { 
  }

  public InlineResponse20042Data idInstrument(String idInstrument) {
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


  public InlineResponse20042Data sourceIdentifier(String sourceIdentifier) {
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


  public InlineResponse20042Data name(String name) {
    this.name = JsonNullable.<String>of(name);
    return this;
  }

   /**
   * Name of the instrument.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the instrument.")
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


  public InlineResponse20042Data shortName(String shortName) {
    this.shortName = JsonNullable.<String>of(shortName);
    return this;
  }

   /**
   * Short name of the instrument.
   * @return shortName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Short name of the instrument.")
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


  public InlineResponse20042Data isin(String isin) {
    this.isin = JsonNullable.<String>of(isin);
    return this;
  }

   /**
   * International Securities Identification Number of the instrument.
   * @return isin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "International Securities Identification Number of the instrument.")
  @JsonIgnore

  public String getIsin() {
        return isin.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ISIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getIsin_JsonNullable() {
    return isin;
  }
  
  @JsonProperty(JSON_PROPERTY_ISIN)
  public void setIsin_JsonNullable(JsonNullable<String> isin) {
    this.isin = isin;
  }

  public void setIsin(String isin) {
    this.isin = JsonNullable.<String>of(isin);
  }


  public InlineResponse20042Data nsin(InlineResponse20042DataNsin nsin) {
    this.nsin = nsin;
    return this;
  }

   /**
   * Get nsin
   * @return nsin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NSIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse20042DataNsin getNsin() {
    return nsin;
  }


  @JsonProperty(JSON_PROPERTY_NSIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNsin(InlineResponse20042DataNsin nsin) {
    this.nsin = nsin;
  }


  public InlineResponse20042Data fsym(InlineResponse20036Fsym fsym) {
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


  public InlineResponse20042Data assetClass(InlineResponse20042DataAssetClass assetClass) {
    this.assetClass = assetClass;
    return this;
  }

   /**
   * Get assetClass
   * @return assetClass
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ASSET_CLASS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse20042DataAssetClass getAssetClass() {
    return assetClass;
  }


  @JsonProperty(JSON_PROPERTY_ASSET_CLASS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAssetClass(InlineResponse20042DataAssetClass assetClass) {
    this.assetClass = assetClass;
  }


  public InlineResponse20042Data type(java.util.List<InlineResponse20042DataType> type) {
    this.type = type;
    return this;
  }

  public InlineResponse20042Data addTypeItem(InlineResponse20042DataType typeItem) {
    if (this.type == null) {
      this.type = new java.util.ArrayList<>();
    }
    this.type.add(typeItem);
    return this;
  }

   /**
   * Instrument type as defined by FactSet Digital Solutions. Instrument types are arranged in a hierarchy, with level 1 representing the most coarse granularity and further levels successively refining the granularity (see MDG category system 18).
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Instrument type as defined by FactSet Digital Solutions. Instrument types are arranged in a hierarchy, with level 1 representing the most coarse granularity and further levels successively refining the granularity (see MDG category system 18).")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<InlineResponse20042DataType> getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(java.util.List<InlineResponse20042DataType> type) {
    this.type = type;
  }


  /**
   * Return true if this inline_response_200_42_data object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20042Data inlineResponse20042Data = (InlineResponse20042Data) o;
    return equalsNullable(this.idInstrument, inlineResponse20042Data.idInstrument) &&
        equalsNullable(this.sourceIdentifier, inlineResponse20042Data.sourceIdentifier) &&
        equalsNullable(this.name, inlineResponse20042Data.name) &&
        equalsNullable(this.shortName, inlineResponse20042Data.shortName) &&
        equalsNullable(this.isin, inlineResponse20042Data.isin) &&
        Objects.equals(this.nsin, inlineResponse20042Data.nsin) &&
        Objects.equals(this.fsym, inlineResponse20042Data.fsym) &&
        Objects.equals(this.assetClass, inlineResponse20042Data.assetClass) &&
        Objects.equals(this.type, inlineResponse20042Data.type);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(idInstrument), hashCodeNullable(sourceIdentifier), hashCodeNullable(name), hashCodeNullable(shortName), hashCodeNullable(isin), nsin, fsym, assetClass, type);
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
    sb.append("class InlineResponse20042Data {\n");
    sb.append("    idInstrument: ").append(toIndentedString(idInstrument)).append("\n");
    sb.append("    sourceIdentifier: ").append(toIndentedString(sourceIdentifier)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    shortName: ").append(toIndentedString(shortName)).append("\n");
    sb.append("    isin: ").append(toIndentedString(isin)).append("\n");
    sb.append("    nsin: ").append(toIndentedString(nsin)).append("\n");
    sb.append("    fsym: ").append(toIndentedString(fsym)).append("\n");
    sb.append("    assetClass: ").append(toIndentedString(assetClass)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

