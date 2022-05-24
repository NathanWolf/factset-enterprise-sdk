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
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models.SecuritizedDerivativeNotationScreenerValueRangesGetDataValidationMarketSelectionExclude;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models.SecuritizedDerivativeNotationScreenerValueRangesGetDataValidationMarketSelectionRestrict;
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
 * Market selection.
 */
@ApiModel(description = "Market selection.")
@JsonPropertyOrder({
  SecuritizedDerivativeNotationScreenerValueRangesGetDataValidationMarketSelection.JSON_PROPERTY_RESTRICT,
  SecuritizedDerivativeNotationScreenerValueRangesGetDataValidationMarketSelection.JSON_PROPERTY_EXCLUDE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SecuritizedDerivativeNotationScreenerValueRangesGetDataValidationMarketSelection implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_RESTRICT = "restrict";
  private SecuritizedDerivativeNotationScreenerValueRangesGetDataValidationMarketSelectionRestrict restrict;

  public static final String JSON_PROPERTY_EXCLUDE = "exclude";
  private SecuritizedDerivativeNotationScreenerValueRangesGetDataValidationMarketSelectionExclude exclude;

  public SecuritizedDerivativeNotationScreenerValueRangesGetDataValidationMarketSelection() { 
  }

  public SecuritizedDerivativeNotationScreenerValueRangesGetDataValidationMarketSelection restrict(SecuritizedDerivativeNotationScreenerValueRangesGetDataValidationMarketSelectionRestrict restrict) {
    this.restrict = restrict;
    return this;
  }

   /**
   * Get restrict
   * @return restrict
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RESTRICT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SecuritizedDerivativeNotationScreenerValueRangesGetDataValidationMarketSelectionRestrict getRestrict() {
    return restrict;
  }


  @JsonProperty(JSON_PROPERTY_RESTRICT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRestrict(SecuritizedDerivativeNotationScreenerValueRangesGetDataValidationMarketSelectionRestrict restrict) {
    this.restrict = restrict;
  }


  public SecuritizedDerivativeNotationScreenerValueRangesGetDataValidationMarketSelection exclude(SecuritizedDerivativeNotationScreenerValueRangesGetDataValidationMarketSelectionExclude exclude) {
    this.exclude = exclude;
    return this;
  }

   /**
   * Get exclude
   * @return exclude
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EXCLUDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SecuritizedDerivativeNotationScreenerValueRangesGetDataValidationMarketSelectionExclude getExclude() {
    return exclude;
  }


  @JsonProperty(JSON_PROPERTY_EXCLUDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExclude(SecuritizedDerivativeNotationScreenerValueRangesGetDataValidationMarketSelectionExclude exclude) {
    this.exclude = exclude;
  }


  /**
   * Return true if this _securitizedDerivative_notation_screener_valueRanges_get_data_validation_market_selection object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecuritizedDerivativeNotationScreenerValueRangesGetDataValidationMarketSelection securitizedDerivativeNotationScreenerValueRangesGetDataValidationMarketSelection = (SecuritizedDerivativeNotationScreenerValueRangesGetDataValidationMarketSelection) o;
    return Objects.equals(this.restrict, securitizedDerivativeNotationScreenerValueRangesGetDataValidationMarketSelection.restrict) &&
        Objects.equals(this.exclude, securitizedDerivativeNotationScreenerValueRangesGetDataValidationMarketSelection.exclude);
  }

  @Override
  public int hashCode() {
    return Objects.hash(restrict, exclude);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecuritizedDerivativeNotationScreenerValueRangesGetDataValidationMarketSelection {\n");
    sb.append("    restrict: ").append(toIndentedString(restrict)).append("\n");
    sb.append("    exclude: ").append(toIndentedString(exclude)).append("\n");
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

