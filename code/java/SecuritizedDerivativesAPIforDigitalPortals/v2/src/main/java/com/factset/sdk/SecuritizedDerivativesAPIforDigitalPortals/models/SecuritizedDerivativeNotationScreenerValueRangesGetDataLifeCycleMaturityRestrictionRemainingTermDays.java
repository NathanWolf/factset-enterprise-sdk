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
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models.SecuritizedDerivativeNotationScreenerValueRangesGetDataLifeCycleMaturityRestrictionRemainingTermDaysMaximum;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models.SecuritizedDerivativeNotationScreenerValueRangesGetDataLifeCycleMaturityRestrictionRemainingTermDaysMinimum;
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
 * Value range for the remaining term to maturity expressed in days.
 */
@ApiModel(description = "Value range for the remaining term to maturity expressed in days.")
@JsonPropertyOrder({
  SecuritizedDerivativeNotationScreenerValueRangesGetDataLifeCycleMaturityRestrictionRemainingTermDays.JSON_PROPERTY_MINIMUM,
  SecuritizedDerivativeNotationScreenerValueRangesGetDataLifeCycleMaturityRestrictionRemainingTermDays.JSON_PROPERTY_MAXIMUM
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SecuritizedDerivativeNotationScreenerValueRangesGetDataLifeCycleMaturityRestrictionRemainingTermDays implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_MINIMUM = "minimum";
  private SecuritizedDerivativeNotationScreenerValueRangesGetDataLifeCycleMaturityRestrictionRemainingTermDaysMinimum minimum;

  public static final String JSON_PROPERTY_MAXIMUM = "maximum";
  private SecuritizedDerivativeNotationScreenerValueRangesGetDataLifeCycleMaturityRestrictionRemainingTermDaysMaximum maximum;


  public SecuritizedDerivativeNotationScreenerValueRangesGetDataLifeCycleMaturityRestrictionRemainingTermDays minimum(SecuritizedDerivativeNotationScreenerValueRangesGetDataLifeCycleMaturityRestrictionRemainingTermDaysMinimum minimum) {
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

  public SecuritizedDerivativeNotationScreenerValueRangesGetDataLifeCycleMaturityRestrictionRemainingTermDaysMinimum getMinimum() {
    return minimum;
  }


  @JsonProperty(JSON_PROPERTY_MINIMUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMinimum(SecuritizedDerivativeNotationScreenerValueRangesGetDataLifeCycleMaturityRestrictionRemainingTermDaysMinimum minimum) {
    this.minimum = minimum;
  }


  public SecuritizedDerivativeNotationScreenerValueRangesGetDataLifeCycleMaturityRestrictionRemainingTermDays maximum(SecuritizedDerivativeNotationScreenerValueRangesGetDataLifeCycleMaturityRestrictionRemainingTermDaysMaximum maximum) {
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

  public SecuritizedDerivativeNotationScreenerValueRangesGetDataLifeCycleMaturityRestrictionRemainingTermDaysMaximum getMaximum() {
    return maximum;
  }


  @JsonProperty(JSON_PROPERTY_MAXIMUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaximum(SecuritizedDerivativeNotationScreenerValueRangesGetDataLifeCycleMaturityRestrictionRemainingTermDaysMaximum maximum) {
    this.maximum = maximum;
  }


  /**
   * Return true if this _securitizedDerivative_notation_screener_valueRanges_get_data_lifeCycle_maturity_restriction_remainingTermDays object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecuritizedDerivativeNotationScreenerValueRangesGetDataLifeCycleMaturityRestrictionRemainingTermDays securitizedDerivativeNotationScreenerValueRangesGetDataLifeCycleMaturityRestrictionRemainingTermDays = (SecuritizedDerivativeNotationScreenerValueRangesGetDataLifeCycleMaturityRestrictionRemainingTermDays) o;
    return Objects.equals(this.minimum, securitizedDerivativeNotationScreenerValueRangesGetDataLifeCycleMaturityRestrictionRemainingTermDays.minimum) &&
        Objects.equals(this.maximum, securitizedDerivativeNotationScreenerValueRangesGetDataLifeCycleMaturityRestrictionRemainingTermDays.maximum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(minimum, maximum);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecuritizedDerivativeNotationScreenerValueRangesGetDataLifeCycleMaturityRestrictionRemainingTermDays {\n");
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

