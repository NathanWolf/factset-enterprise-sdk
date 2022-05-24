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


package com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models.InlineResponse2007DataSingleBreach;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models.InlineResponse2007DataSingleDistance;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models.InlineResponse2007DataSingleLevel;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models.InlineResponse2007DataSingleParticipationFactor;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.JSON;


/**
 * Barrier with a single limit.
 */
@ApiModel(description = "Barrier with a single limit.")
@JsonPropertyOrder({
  InlineResponse2007DataSingle.JSON_PROPERTY_LEVEL,
  InlineResponse2007DataSingle.JSON_PROPERTY_BREACH,
  InlineResponse2007DataSingle.JSON_PROPERTY_DISTANCE,
  InlineResponse2007DataSingle.JSON_PROPERTY_PARTICIPATION_FACTOR
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse2007DataSingle implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_LEVEL = "level";
  private InlineResponse2007DataSingleLevel level;

  public static final String JSON_PROPERTY_BREACH = "breach";
  private InlineResponse2007DataSingleBreach breach;

  public static final String JSON_PROPERTY_DISTANCE = "distance";
  private InlineResponse2007DataSingleDistance distance;

  public static final String JSON_PROPERTY_PARTICIPATION_FACTOR = "participationFactor";
  private InlineResponse2007DataSingleParticipationFactor participationFactor;

  public InlineResponse2007DataSingle() { 
  }

  public InlineResponse2007DataSingle level(InlineResponse2007DataSingleLevel level) {
    this.level = level;
    return this;
  }

   /**
   * Get level
   * @return level
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2007DataSingleLevel getLevel() {
    return level;
  }


  @JsonProperty(JSON_PROPERTY_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLevel(InlineResponse2007DataSingleLevel level) {
    this.level = level;
  }


  public InlineResponse2007DataSingle breach(InlineResponse2007DataSingleBreach breach) {
    this.breach = breach;
    return this;
  }

   /**
   * Get breach
   * @return breach
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BREACH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2007DataSingleBreach getBreach() {
    return breach;
  }


  @JsonProperty(JSON_PROPERTY_BREACH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBreach(InlineResponse2007DataSingleBreach breach) {
    this.breach = breach;
  }


  public InlineResponse2007DataSingle distance(InlineResponse2007DataSingleDistance distance) {
    this.distance = distance;
    return this;
  }

   /**
   * Get distance
   * @return distance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DISTANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2007DataSingleDistance getDistance() {
    return distance;
  }


  @JsonProperty(JSON_PROPERTY_DISTANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDistance(InlineResponse2007DataSingleDistance distance) {
    this.distance = distance;
  }


  public InlineResponse2007DataSingle participationFactor(InlineResponse2007DataSingleParticipationFactor participationFactor) {
    this.participationFactor = participationFactor;
    return this;
  }

   /**
   * Get participationFactor
   * @return participationFactor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PARTICIPATION_FACTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2007DataSingleParticipationFactor getParticipationFactor() {
    return participationFactor;
  }


  @JsonProperty(JSON_PROPERTY_PARTICIPATION_FACTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setParticipationFactor(InlineResponse2007DataSingleParticipationFactor participationFactor) {
    this.participationFactor = participationFactor;
  }


  /**
   * Return true if this inline_response_200_7_data_single object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2007DataSingle inlineResponse2007DataSingle = (InlineResponse2007DataSingle) o;
    return Objects.equals(this.level, inlineResponse2007DataSingle.level) &&
        Objects.equals(this.breach, inlineResponse2007DataSingle.breach) &&
        Objects.equals(this.distance, inlineResponse2007DataSingle.distance) &&
        Objects.equals(this.participationFactor, inlineResponse2007DataSingle.participationFactor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(level, breach, distance, participationFactor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2007DataSingle {\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    breach: ").append(toIndentedString(breach)).append("\n");
    sb.append("    distance: ").append(toIndentedString(distance)).append("\n");
    sb.append("    participationFactor: ").append(toIndentedString(participationFactor)).append("\n");
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

