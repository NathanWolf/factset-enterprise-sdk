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
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models.InlineResponse2005DataStrikeDistanceAbsolute;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models.InlineResponse2005DataStrikeDistanceRelative;
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
 * Distance of the current underlying level to the coupon trigger level.
 */
@ApiModel(description = "Distance of the current underlying level to the coupon trigger level.")
@JsonPropertyOrder({
  InlineResponse2005DataCouponTriggerLevelDistance.JSON_PROPERTY_ABSOLUTE,
  InlineResponse2005DataCouponTriggerLevelDistance.JSON_PROPERTY_RELATIVE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse2005DataCouponTriggerLevelDistance implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ABSOLUTE = "absolute";
  private InlineResponse2005DataStrikeDistanceAbsolute absolute;

  public static final String JSON_PROPERTY_RELATIVE = "relative";
  private InlineResponse2005DataStrikeDistanceRelative relative;


  public InlineResponse2005DataCouponTriggerLevelDistance absolute(InlineResponse2005DataStrikeDistanceAbsolute absolute) {
    this.absolute = absolute;
    return this;
  }

   /**
   * Get absolute
   * @return absolute
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ABSOLUTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2005DataStrikeDistanceAbsolute getAbsolute() {
    return absolute;
  }


  @JsonProperty(JSON_PROPERTY_ABSOLUTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAbsolute(InlineResponse2005DataStrikeDistanceAbsolute absolute) {
    this.absolute = absolute;
  }


  public InlineResponse2005DataCouponTriggerLevelDistance relative(InlineResponse2005DataStrikeDistanceRelative relative) {
    this.relative = relative;
    return this;
  }

   /**
   * Get relative
   * @return relative
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RELATIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2005DataStrikeDistanceRelative getRelative() {
    return relative;
  }


  @JsonProperty(JSON_PROPERTY_RELATIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRelative(InlineResponse2005DataStrikeDistanceRelative relative) {
    this.relative = relative;
  }


  /**
   * Return true if this inline_response_200_5_data_couponTriggerLevel_distance object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2005DataCouponTriggerLevelDistance inlineResponse2005DataCouponTriggerLevelDistance = (InlineResponse2005DataCouponTriggerLevelDistance) o;
    return Objects.equals(this.absolute, inlineResponse2005DataCouponTriggerLevelDistance.absolute) &&
        Objects.equals(this.relative, inlineResponse2005DataCouponTriggerLevelDistance.relative);
  }

  @Override
  public int hashCode() {
    return Objects.hash(absolute, relative);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2005DataCouponTriggerLevelDistance {\n");
    sb.append("    absolute: ").append(toIndentedString(absolute)).append("\n");
    sb.append("    relative: ").append(toIndentedString(relative)).append("\n");
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

