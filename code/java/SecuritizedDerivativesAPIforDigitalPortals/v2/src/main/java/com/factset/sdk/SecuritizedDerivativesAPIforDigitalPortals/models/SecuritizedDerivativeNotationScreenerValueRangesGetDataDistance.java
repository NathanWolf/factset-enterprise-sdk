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
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models.SecuritizedDerivativeNotationScreenerValueRangesGetDataDistanceAbsolute;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models.SecuritizedDerivativeNotationScreenerValueRangesGetDataDistanceRelative;
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
 * Distance of the current underlying level to the barrier level.
 */
@ApiModel(description = "Distance of the current underlying level to the barrier level.")
@JsonPropertyOrder({
  SecuritizedDerivativeNotationScreenerValueRangesGetDataDistance.JSON_PROPERTY_ABSOLUTE,
  SecuritizedDerivativeNotationScreenerValueRangesGetDataDistance.JSON_PROPERTY_RELATIVE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SecuritizedDerivativeNotationScreenerValueRangesGetDataDistance implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ABSOLUTE = "absolute";
  private SecuritizedDerivativeNotationScreenerValueRangesGetDataDistanceAbsolute absolute;

  public static final String JSON_PROPERTY_RELATIVE = "relative";
  private SecuritizedDerivativeNotationScreenerValueRangesGetDataDistanceRelative relative;


  public SecuritizedDerivativeNotationScreenerValueRangesGetDataDistance absolute(SecuritizedDerivativeNotationScreenerValueRangesGetDataDistanceAbsolute absolute) {
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

  public SecuritizedDerivativeNotationScreenerValueRangesGetDataDistanceAbsolute getAbsolute() {
    return absolute;
  }


  @JsonProperty(JSON_PROPERTY_ABSOLUTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAbsolute(SecuritizedDerivativeNotationScreenerValueRangesGetDataDistanceAbsolute absolute) {
    this.absolute = absolute;
  }


  public SecuritizedDerivativeNotationScreenerValueRangesGetDataDistance relative(SecuritizedDerivativeNotationScreenerValueRangesGetDataDistanceRelative relative) {
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

  public SecuritizedDerivativeNotationScreenerValueRangesGetDataDistanceRelative getRelative() {
    return relative;
  }


  @JsonProperty(JSON_PROPERTY_RELATIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRelative(SecuritizedDerivativeNotationScreenerValueRangesGetDataDistanceRelative relative) {
    this.relative = relative;
  }


  /**
   * Return true if this _securitizedDerivative_notation_screener_valueRanges_get_data_distance object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecuritizedDerivativeNotationScreenerValueRangesGetDataDistance securitizedDerivativeNotationScreenerValueRangesGetDataDistance = (SecuritizedDerivativeNotationScreenerValueRangesGetDataDistance) o;
    return Objects.equals(this.absolute, securitizedDerivativeNotationScreenerValueRangesGetDataDistance.absolute) &&
        Objects.equals(this.relative, securitizedDerivativeNotationScreenerValueRangesGetDataDistance.relative);
  }

  @Override
  public int hashCode() {
    return Objects.hash(absolute, relative);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecuritizedDerivativeNotationScreenerValueRangesGetDataDistance {\n");
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

