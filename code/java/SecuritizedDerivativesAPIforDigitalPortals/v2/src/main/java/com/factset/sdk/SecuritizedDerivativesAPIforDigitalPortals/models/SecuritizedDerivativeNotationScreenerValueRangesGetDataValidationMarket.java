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
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models.SecuritizedDerivativeNotationScreenerValueRangesGetDataValidationMarketPriority;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models.SecuritizedDerivativeNotationScreenerValueRangesGetDataValidationMarketSelection;
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
 * Market-related notation selection. See endpoint &#x60;/basic/market/list&#x60; for valid values.
 */
@ApiModel(description = "Market-related notation selection. See endpoint `/basic/market/list` for valid values.")
@JsonPropertyOrder({
  SecuritizedDerivativeNotationScreenerValueRangesGetDataValidationMarket.JSON_PROPERTY_SELECTION,
  SecuritizedDerivativeNotationScreenerValueRangesGetDataValidationMarket.JSON_PROPERTY_PRIORITY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SecuritizedDerivativeNotationScreenerValueRangesGetDataValidationMarket implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_SELECTION = "selection";
  private SecuritizedDerivativeNotationScreenerValueRangesGetDataValidationMarketSelection selection;

  public static final String JSON_PROPERTY_PRIORITY = "priority";
  private SecuritizedDerivativeNotationScreenerValueRangesGetDataValidationMarketPriority priority;

  public SecuritizedDerivativeNotationScreenerValueRangesGetDataValidationMarket() { 
  }

  public SecuritizedDerivativeNotationScreenerValueRangesGetDataValidationMarket selection(SecuritizedDerivativeNotationScreenerValueRangesGetDataValidationMarketSelection selection) {
    this.selection = selection;
    return this;
  }

   /**
   * Get selection
   * @return selection
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SELECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SecuritizedDerivativeNotationScreenerValueRangesGetDataValidationMarketSelection getSelection() {
    return selection;
  }


  @JsonProperty(JSON_PROPERTY_SELECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSelection(SecuritizedDerivativeNotationScreenerValueRangesGetDataValidationMarketSelection selection) {
    this.selection = selection;
  }


  public SecuritizedDerivativeNotationScreenerValueRangesGetDataValidationMarket priority(SecuritizedDerivativeNotationScreenerValueRangesGetDataValidationMarketPriority priority) {
    this.priority = priority;
    return this;
  }

   /**
   * Get priority
   * @return priority
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PRIORITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SecuritizedDerivativeNotationScreenerValueRangesGetDataValidationMarketPriority getPriority() {
    return priority;
  }


  @JsonProperty(JSON_PROPERTY_PRIORITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPriority(SecuritizedDerivativeNotationScreenerValueRangesGetDataValidationMarketPriority priority) {
    this.priority = priority;
  }


  /**
   * Return true if this _securitizedDerivative_notation_screener_valueRanges_get_data_validation_market object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecuritizedDerivativeNotationScreenerValueRangesGetDataValidationMarket securitizedDerivativeNotationScreenerValueRangesGetDataValidationMarket = (SecuritizedDerivativeNotationScreenerValueRangesGetDataValidationMarket) o;
    return Objects.equals(this.selection, securitizedDerivativeNotationScreenerValueRangesGetDataValidationMarket.selection) &&
        Objects.equals(this.priority, securitizedDerivativeNotationScreenerValueRangesGetDataValidationMarket.priority);
  }

  @Override
  public int hashCode() {
    return Objects.hash(selection, priority);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecuritizedDerivativeNotationScreenerValueRangesGetDataValidationMarket {\n");
    sb.append("    selection: ").append(toIndentedString(selection)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
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

