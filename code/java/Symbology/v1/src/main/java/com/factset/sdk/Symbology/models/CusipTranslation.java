/*
 * FactSet Symbology API
 * The FactSet Symbology API provides symbol resolution services, allowing clients to translate market identifiers into various symbology types. various market symbology types such as, FactSet Permanent Identifiers, CUSIP, ISIN,  SEDOL, Tickers, and Bloomberg FIGIs.   Factset's Symbology API sits at the center of its hub-and-spoke data model, enabling you to quickly  harmonize the expanding catalog of Content APIs. Translate market IDs into CUSIP, SEDOL, ISIN, Tickers as a point in time or for the entire history of the requested id allowing Data Management workflows to normalize ids over time. Additionally, the Symbology API provides  translation of market ids into Bloomberg FIGI. 
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.Symbology.models;

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
import java.time.LocalDate;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.Symbology.JSON;


/**
 * CUISP Translation data object.
 */
@ApiModel(description = "CUISP Translation data object.")
@JsonPropertyOrder({
  CusipTranslation.JSON_PROPERTY_FSYM_ID,
  CusipTranslation.JSON_PROPERTY_NAME,
  CusipTranslation.JSON_PROPERTY_CUSIP,
  CusipTranslation.JSON_PROPERTY_CUSIP_EFFECTIVE_START_DATE,
  CusipTranslation.JSON_PROPERTY_CUSIP_EFFECTIVE_END_DATE,
  CusipTranslation.JSON_PROPERTY_AS_OF_DATE,
  CusipTranslation.JSON_PROPERTY_REQUEST_ID
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CusipTranslation implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_FSYM_ID = "fsymId";
  private String fsymId;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_CUSIP = "cusip";
  private String cusip;

  public static final String JSON_PROPERTY_CUSIP_EFFECTIVE_START_DATE = "cusipEffectiveStartDate";
  private String cusipEffectiveStartDate;

  public static final String JSON_PROPERTY_CUSIP_EFFECTIVE_END_DATE = "cusipEffectiveEndDate";
  private String cusipEffectiveEndDate;

  public static final String JSON_PROPERTY_AS_OF_DATE = "asOfDate";
  private LocalDate asOfDate;

  public static final String JSON_PROPERTY_REQUEST_ID = "requestId";
  private String requestId;

  public CusipTranslation() { 
  }

  public CusipTranslation fsymId(String fsymId) {
    this.fsymId = fsymId;
    return this;
  }

   /**
   * FactSet Default Permanent Identifier. Regional and Composite (-USA) request &#x60;ids&#x60; will use a Regional ID &#39;-R&#39;, Listing specific ids &#39;-NYS&#39; will use Listing ids &#39;-L&#39;, Entities will use &#39;-E&#39;, and FI will use security &#39;-S&#39; ids. [FactSet Permanent Security Identifier](https://oa.apps.factset.com/cms/oaAttachment/64c3213a-f415-4c27-a336-92c73a72deed/24881)
   * @return fsymId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "HTM0LK-R", value = "FactSet Default Permanent Identifier. Regional and Composite (-USA) request `ids` will use a Regional ID '-R', Listing specific ids '-NYS' will use Listing ids '-L', Entities will use '-E', and FI will use security '-S' ids. [FactSet Permanent Security Identifier](https://oa.apps.factset.com/cms/oaAttachment/64c3213a-f415-4c27-a336-92c73a72deed/24881)")
  @JsonProperty(JSON_PROPERTY_FSYM_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFsymId() {
    return fsymId;
  }


  @JsonProperty(JSON_PROPERTY_FSYM_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFsymId(String fsymId) {
    this.fsymId = fsymId;
  }


  public CusipTranslation name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Proper Name of company or issuer.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Alphabet Inc. Class A", value = "Proper Name of company or issuer.")
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


  public CusipTranslation cusip(String cusip) {
    this.cusip = cusip;
    return this;
  }

   /**
   * CUSIP with Check Digit
   * @return cusip
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "38259P508", value = "CUSIP with Check Digit")
  @JsonProperty(JSON_PROPERTY_CUSIP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCusip() {
    return cusip;
  }


  @JsonProperty(JSON_PROPERTY_CUSIP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCusip(String cusip) {
    this.cusip = cusip;
  }


  public CusipTranslation cusipEffectiveStartDate(String cusipEffectiveStartDate) {
    this.cusipEffectiveStartDate = cusipEffectiveStartDate;
    return this;
  }

   /**
   * The effective start date in which the CUSIP was valid for the security.
   * @return cusipEffectiveStartDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2004-08-19", value = "The effective start date in which the CUSIP was valid for the security.")
  @JsonProperty(JSON_PROPERTY_CUSIP_EFFECTIVE_START_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCusipEffectiveStartDate() {
    return cusipEffectiveStartDate;
  }


  @JsonProperty(JSON_PROPERTY_CUSIP_EFFECTIVE_START_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCusipEffectiveStartDate(String cusipEffectiveStartDate) {
    this.cusipEffectiveStartDate = cusipEffectiveStartDate;
  }


  public CusipTranslation cusipEffectiveEndDate(String cusipEffectiveEndDate) {
    this.cusipEffectiveEndDate = cusipEffectiveEndDate;
    return this;
  }

   /**
   * The effective end date in which the CUSIP was valid. If null, the CUSIP is still active for the security and date requested.
   * @return cusipEffectiveEndDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2015-10-05", value = "The effective end date in which the CUSIP was valid. If null, the CUSIP is still active for the security and date requested.")
  @JsonProperty(JSON_PROPERTY_CUSIP_EFFECTIVE_END_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCusipEffectiveEndDate() {
    return cusipEffectiveEndDate;
  }


  @JsonProperty(JSON_PROPERTY_CUSIP_EFFECTIVE_END_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCusipEffectiveEndDate(String cusipEffectiveEndDate) {
    this.cusipEffectiveEndDate = cusipEffectiveEndDate;
  }


  public CusipTranslation asOfDate(LocalDate asOfDate) {
    this.asOfDate = asOfDate;
    return this;
  }

   /**
   * The effective end date in which the CUSIP was valid. If null, the CUSIP is still active for the security and date requested.
   * @return asOfDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Fri Jan 01 00:00:00 UTC 2010", value = "The effective end date in which the CUSIP was valid. If null, the CUSIP is still active for the security and date requested.")
  @JsonProperty(JSON_PROPERTY_AS_OF_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LocalDate getAsOfDate() {
    return asOfDate;
  }


  @JsonProperty(JSON_PROPERTY_AS_OF_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAsOfDate(LocalDate asOfDate) {
    this.asOfDate = asOfDate;
  }


  public CusipTranslation requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

   /**
   * Identifier specified in the request
   * @return requestId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "GOOGL", value = "Identifier specified in the request")
  @JsonProperty(JSON_PROPERTY_REQUEST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRequestId() {
    return requestId;
  }


  @JsonProperty(JSON_PROPERTY_REQUEST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }


  /**
   * Return true if this cusipTranslation object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CusipTranslation cusipTranslation = (CusipTranslation) o;
    return Objects.equals(this.fsymId, cusipTranslation.fsymId) &&
        Objects.equals(this.name, cusipTranslation.name) &&
        Objects.equals(this.cusip, cusipTranslation.cusip) &&
        Objects.equals(this.cusipEffectiveStartDate, cusipTranslation.cusipEffectiveStartDate) &&
        Objects.equals(this.cusipEffectiveEndDate, cusipTranslation.cusipEffectiveEndDate) &&
        Objects.equals(this.asOfDate, cusipTranslation.asOfDate) &&
        Objects.equals(this.requestId, cusipTranslation.requestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fsymId, name, cusip, cusipEffectiveStartDate, cusipEffectiveEndDate, asOfDate, requestId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CusipTranslation {\n");
    sb.append("    fsymId: ").append(toIndentedString(fsymId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    cusip: ").append(toIndentedString(cusip)).append("\n");
    sb.append("    cusipEffectiveStartDate: ").append(toIndentedString(cusipEffectiveStartDate)).append("\n");
    sb.append("    cusipEffectiveEndDate: ").append(toIndentedString(cusipEffectiveEndDate)).append("\n");
    sb.append("    asOfDate: ").append(toIndentedString(asOfDate)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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

