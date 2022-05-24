/*
 * Prime Developer Trial
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1
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
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20055DataValidity;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20057Status;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.QuotesAPIforDigitalPortals.JSON;


/**
 * InlineResponse20057Data
 */
@JsonPropertyOrder({
  InlineResponse20057Data.JSON_PROPERTY_ID,
  InlineResponse20057Data.JSON_PROPERTY_VALIDITY,
  InlineResponse20057Data.JSON_PROPERTY_SOURCE_W_K_N,
  InlineResponse20057Data.JSON_PROPERTY_STATUS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse20057Data implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_VALIDITY = "validity";
  private InlineResponse20055DataValidity validity;

  public static final String JSON_PROPERTY_SOURCE_W_K_N = "sourceWKN";
  private String sourceWKN;

  public static final String JSON_PROPERTY_STATUS = "status";
  private InlineResponse20057Status status;

  public InlineResponse20057Data() { 
  }

  public InlineResponse20057Data id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Identifier of the instrument.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Identifier of the instrument.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }


  public InlineResponse20057Data validity(InlineResponse20055DataValidity validity) {
    this.validity = validity;
    return this;
  }

   /**
   * Get validity
   * @return validity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VALIDITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse20055DataValidity getValidity() {
    return validity;
  }


  @JsonProperty(JSON_PROPERTY_VALIDITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValidity(InlineResponse20055DataValidity validity) {
    this.validity = validity;
  }


  public InlineResponse20057Data sourceWKN(String sourceWKN) {
    this.sourceWKN = sourceWKN;
    return this;
  }

   /**
   * The source WKN that the instrument is translated for.
   * @return sourceWKN
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The source WKN that the instrument is translated for.")
  @JsonProperty(JSON_PROPERTY_SOURCE_W_K_N)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSourceWKN() {
    return sourceWKN;
  }


  @JsonProperty(JSON_PROPERTY_SOURCE_W_K_N)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSourceWKN(String sourceWKN) {
    this.sourceWKN = sourceWKN;
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
    return Objects.equals(this.id, inlineResponse20057Data.id) &&
        Objects.equals(this.validity, inlineResponse20057Data.validity) &&
        Objects.equals(this.sourceWKN, inlineResponse20057Data.sourceWKN) &&
        Objects.equals(this.status, inlineResponse20057Data.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, validity, sourceWKN, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20057Data {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

