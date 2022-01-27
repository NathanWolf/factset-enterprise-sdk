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
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models.SecuritizedDerivativeNotationScreenerValueRangesGetDataLevelAbsoluteMaximum;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models.SecuritizedDerivativeNotationScreenerValueRangesGetDataLevelAbsoluteMinimum;
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
 * Value range of the delta calculated using the actual cover ratio of the securitized derivative.
 */
@ApiModel(description = "Value range of the delta calculated using the actual cover ratio of the securitized derivative.")
@JsonPropertyOrder({
  SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresDeltaEffective.JSON_PROPERTY_MINIMUM,
  SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresDeltaEffective.JSON_PROPERTY_MAXIMUM
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresDeltaEffective implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_MINIMUM = "minimum";
  private SecuritizedDerivativeNotationScreenerValueRangesGetDataLevelAbsoluteMinimum minimum;

  public static final String JSON_PROPERTY_MAXIMUM = "maximum";
  private SecuritizedDerivativeNotationScreenerValueRangesGetDataLevelAbsoluteMaximum maximum;


  public SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresDeltaEffective minimum(SecuritizedDerivativeNotationScreenerValueRangesGetDataLevelAbsoluteMinimum minimum) {
    this.minimum = minimum;
    return this;
  }

   /**
   * Get minimum
   * @return minimum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MINIMUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SecuritizedDerivativeNotationScreenerValueRangesGetDataLevelAbsoluteMinimum getMinimum() {
    return minimum;
  }


  @JsonProperty(JSON_PROPERTY_MINIMUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMinimum(SecuritizedDerivativeNotationScreenerValueRangesGetDataLevelAbsoluteMinimum minimum) {
    this.minimum = minimum;
  }


  public SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresDeltaEffective maximum(SecuritizedDerivativeNotationScreenerValueRangesGetDataLevelAbsoluteMaximum maximum) {
    this.maximum = maximum;
    return this;
  }

   /**
   * Get maximum
   * @return maximum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MAXIMUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SecuritizedDerivativeNotationScreenerValueRangesGetDataLevelAbsoluteMaximum getMaximum() {
    return maximum;
  }


  @JsonProperty(JSON_PROPERTY_MAXIMUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaximum(SecuritizedDerivativeNotationScreenerValueRangesGetDataLevelAbsoluteMaximum maximum) {
    this.maximum = maximum;
  }


  /**
   * Return true if this _securitizedDerivative_notation_screener_valueRanges_get_data_keyFigures_delta_effective object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresDeltaEffective securitizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresDeltaEffective = (SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresDeltaEffective) o;
    return Objects.equals(this.minimum, securitizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresDeltaEffective.minimum) &&
        Objects.equals(this.maximum, securitizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresDeltaEffective.maximum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(minimum, maximum);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresDeltaEffective {\n");
    sb.append("    minimum: ").append(toIndentedString(minimum)).append("\n");
    sb.append("    maximum: ").append(toIndentedString(maximum)).append("\n");
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

