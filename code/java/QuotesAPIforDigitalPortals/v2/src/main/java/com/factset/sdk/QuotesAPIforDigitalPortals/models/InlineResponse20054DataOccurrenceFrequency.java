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
 * Frequency of the coupon payments. Information about the frequency is available only if the attribute occurrence.type is set to \&quot;repeated\&quot;. See endpoint &#x60;/basic/frequency/type/list&#x60; for possible values of the frequency.
 */
@ApiModel(description = "Frequency of the coupon payments. Information about the frequency is available only if the attribute occurrence.type is set to \"repeated\". See endpoint `/basic/frequency/type/list` for possible values of the frequency.")
@JsonPropertyOrder({
  InlineResponse20054DataOccurrenceFrequency.JSON_PROPERTY_ID,
  InlineResponse20054DataOccurrenceFrequency.JSON_PROPERTY_NAME
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse20054DataOccurrenceFrequency implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ID = "id";
  private BigDecimal id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;


  public InlineResponse20054DataOccurrenceFrequency id(BigDecimal id) {
    this.id = id;
    return this;
  }

   /**
   * Identifier of the frequency.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Identifier of the frequency.")
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


  public InlineResponse20054DataOccurrenceFrequency name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the frequency.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the frequency.")
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


  /**
   * Return true if this inline_response_200_54_data_occurrence_frequency object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20054DataOccurrenceFrequency inlineResponse20054DataOccurrenceFrequency = (InlineResponse20054DataOccurrenceFrequency) o;
    return Objects.equals(this.id, inlineResponse20054DataOccurrenceFrequency.id) &&
        Objects.equals(this.name, inlineResponse20054DataOccurrenceFrequency.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20054DataOccurrenceFrequency {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

