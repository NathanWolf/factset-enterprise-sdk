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
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models.InlineResponse2007DataRangeUpperBreach;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models.InlineResponse2007DataRangeUpperDistance;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models.InlineResponse2007DataRangeUpperLevel;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models.InlineResponse2007DataRangeUpperParticipationFactor;
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
 * Upper bound.
 */
@ApiModel(description = "Upper bound.")
@JsonPropertyOrder({
  InlineResponse2007DataRangeUpper.JSON_PROPERTY_LEVEL,
  InlineResponse2007DataRangeUpper.JSON_PROPERTY_BREACH,
  InlineResponse2007DataRangeUpper.JSON_PROPERTY_DISTANCE,
  InlineResponse2007DataRangeUpper.JSON_PROPERTY_PARTICIPATION_FACTOR
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse2007DataRangeUpper implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_LEVEL = "level";
  private InlineResponse2007DataRangeUpperLevel level;

  public static final String JSON_PROPERTY_BREACH = "breach";
  private InlineResponse2007DataRangeUpperBreach breach;

  public static final String JSON_PROPERTY_DISTANCE = "distance";
  private InlineResponse2007DataRangeUpperDistance distance;

  public static final String JSON_PROPERTY_PARTICIPATION_FACTOR = "participationFactor";
  private InlineResponse2007DataRangeUpperParticipationFactor participationFactor;


  public InlineResponse2007DataRangeUpper level(InlineResponse2007DataRangeUpperLevel level) {
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

  public InlineResponse2007DataRangeUpperLevel getLevel() {
    return level;
  }


  @JsonProperty(JSON_PROPERTY_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLevel(InlineResponse2007DataRangeUpperLevel level) {
    this.level = level;
  }


  public InlineResponse2007DataRangeUpper breach(InlineResponse2007DataRangeUpperBreach breach) {
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

  public InlineResponse2007DataRangeUpperBreach getBreach() {
    return breach;
  }


  @JsonProperty(JSON_PROPERTY_BREACH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBreach(InlineResponse2007DataRangeUpperBreach breach) {
    this.breach = breach;
  }


  public InlineResponse2007DataRangeUpper distance(InlineResponse2007DataRangeUpperDistance distance) {
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

  public InlineResponse2007DataRangeUpperDistance getDistance() {
    return distance;
  }


  @JsonProperty(JSON_PROPERTY_DISTANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDistance(InlineResponse2007DataRangeUpperDistance distance) {
    this.distance = distance;
  }


  public InlineResponse2007DataRangeUpper participationFactor(InlineResponse2007DataRangeUpperParticipationFactor participationFactor) {
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

  public InlineResponse2007DataRangeUpperParticipationFactor getParticipationFactor() {
    return participationFactor;
  }


  @JsonProperty(JSON_PROPERTY_PARTICIPATION_FACTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setParticipationFactor(InlineResponse2007DataRangeUpperParticipationFactor participationFactor) {
    this.participationFactor = participationFactor;
  }


  /**
   * Return true if this inline_response_200_7_data_range_upper object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2007DataRangeUpper inlineResponse2007DataRangeUpper = (InlineResponse2007DataRangeUpper) o;
    return Objects.equals(this.level, inlineResponse2007DataRangeUpper.level) &&
        Objects.equals(this.breach, inlineResponse2007DataRangeUpper.breach) &&
        Objects.equals(this.distance, inlineResponse2007DataRangeUpper.distance) &&
        Objects.equals(this.participationFactor, inlineResponse2007DataRangeUpper.participationFactor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(level, breach, distance, participationFactor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2007DataRangeUpper {\n");
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

