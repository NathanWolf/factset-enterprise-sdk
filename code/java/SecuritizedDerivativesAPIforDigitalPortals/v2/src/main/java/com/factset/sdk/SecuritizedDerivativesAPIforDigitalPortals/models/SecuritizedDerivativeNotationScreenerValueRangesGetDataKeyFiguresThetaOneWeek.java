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
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models.SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresThetaOneWeekEffective;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models.SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresThetaOneWeekUnadjusted;
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
 * Weekly theta. It represents the first partial derivative of the function determining the derivative notation&#39;s theoretical price with respect to the residual term, evaluated at the current residual term and multiplied by 7/365. Weekly theta indicates the absolute change (decrease) of the price of a derivative for a reduction of the residual term by one week (seven calendar days), thus it represents the price sensitivity of the derivative relative to changes in the residual term. This key figure is calculated for plain vanilla warrants only.
 */
@ApiModel(description = "Weekly theta. It represents the first partial derivative of the function determining the derivative notation's theoretical price with respect to the residual term, evaluated at the current residual term and multiplied by 7/365. Weekly theta indicates the absolute change (decrease) of the price of a derivative for a reduction of the residual term by one week (seven calendar days), thus it represents the price sensitivity of the derivative relative to changes in the residual term. This key figure is calculated for plain vanilla warrants only.")
@JsonPropertyOrder({
  SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresThetaOneWeek.JSON_PROPERTY_EFFECTIVE,
  SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresThetaOneWeek.JSON_PROPERTY_UNADJUSTED
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresThetaOneWeek implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_EFFECTIVE = "effective";
  private SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresThetaOneWeekEffective effective;

  public static final String JSON_PROPERTY_UNADJUSTED = "unadjusted";
  private SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresThetaOneWeekUnadjusted unadjusted;

  public SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresThetaOneWeek() { 
  }

  public SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresThetaOneWeek effective(SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresThetaOneWeekEffective effective) {
    this.effective = effective;
    return this;
  }

   /**
   * Get effective
   * @return effective
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EFFECTIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresThetaOneWeekEffective getEffective() {
    return effective;
  }


  @JsonProperty(JSON_PROPERTY_EFFECTIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEffective(SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresThetaOneWeekEffective effective) {
    this.effective = effective;
  }


  public SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresThetaOneWeek unadjusted(SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresThetaOneWeekUnadjusted unadjusted) {
    this.unadjusted = unadjusted;
    return this;
  }

   /**
   * Get unadjusted
   * @return unadjusted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_UNADJUSTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresThetaOneWeekUnadjusted getUnadjusted() {
    return unadjusted;
  }


  @JsonProperty(JSON_PROPERTY_UNADJUSTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUnadjusted(SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresThetaOneWeekUnadjusted unadjusted) {
    this.unadjusted = unadjusted;
  }


  /**
   * Return true if this _securitizedDerivative_notation_screener_valueRanges_get_data_keyFigures_thetaOneWeek object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresThetaOneWeek securitizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresThetaOneWeek = (SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresThetaOneWeek) o;
    return Objects.equals(this.effective, securitizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresThetaOneWeek.effective) &&
        Objects.equals(this.unadjusted, securitizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresThetaOneWeek.unadjusted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(effective, unadjusted);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresThetaOneWeek {\n");
    sb.append("    effective: ").append(toIndentedString(effective)).append("\n");
    sb.append("    unadjusted: ").append(toIndentedString(unadjusted)).append("\n");
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

