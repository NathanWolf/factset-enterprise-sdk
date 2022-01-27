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
 * Value range of the omega. It represents unadjusted delta (see attribute &#x60;delta.unadjusted&#x60;) multiplied with the leverage (see attribute &#x60;leverage&#x60;), both calculated based on the ask price of the derivative. Omega indicates the elasticity of the securitized derivative&#39;s price regarding the underlying level. This key figure is calculated for plain vanilla warrants only.
 */
@ApiModel(description = "Value range of the omega. It represents unadjusted delta (see attribute `delta.unadjusted`) multiplied with the leverage (see attribute `leverage`), both calculated based on the ask price of the derivative. Omega indicates the elasticity of the securitized derivative's price regarding the underlying level. This key figure is calculated for plain vanilla warrants only.")
@JsonPropertyOrder({
  SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresOmega.JSON_PROPERTY_MINIMUM,
  SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresOmega.JSON_PROPERTY_MAXIMUM
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresOmega implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_MINIMUM = "minimum";
  private SecuritizedDerivativeNotationScreenerValueRangesGetDataLevelAbsoluteMinimum minimum;

  public static final String JSON_PROPERTY_MAXIMUM = "maximum";
  private SecuritizedDerivativeNotationScreenerValueRangesGetDataLevelAbsoluteMaximum maximum;


  public SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresOmega minimum(SecuritizedDerivativeNotationScreenerValueRangesGetDataLevelAbsoluteMinimum minimum) {
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


  public SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresOmega maximum(SecuritizedDerivativeNotationScreenerValueRangesGetDataLevelAbsoluteMaximum maximum) {
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
   * Return true if this _securitizedDerivative_notation_screener_valueRanges_get_data_keyFigures_omega object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresOmega securitizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresOmega = (SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresOmega) o;
    return Objects.equals(this.minimum, securitizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresOmega.minimum) &&
        Objects.equals(this.maximum, securitizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresOmega.maximum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(minimum, maximum);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresOmega {\n");
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

