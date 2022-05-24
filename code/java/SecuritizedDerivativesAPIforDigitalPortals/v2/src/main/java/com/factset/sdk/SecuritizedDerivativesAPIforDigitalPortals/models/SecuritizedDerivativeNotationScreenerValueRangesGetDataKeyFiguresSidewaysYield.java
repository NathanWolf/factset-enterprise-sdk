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
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models.SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresSidewaysYieldAbsolute;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models.SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresSidewaysYieldAnnualized;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models.SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresSidewaysYieldRelative;
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
 * Sideways yield. It represents a hypothetical payout at maturity minus the ask price of the securitized derivative, under the assumption that all payout-influencing factors remain unchanged until maturity.
 */
@ApiModel(description = "Sideways yield. It represents a hypothetical payout at maturity minus the ask price of the securitized derivative, under the assumption that all payout-influencing factors remain unchanged until maturity.")
@JsonPropertyOrder({
  SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresSidewaysYield.JSON_PROPERTY_ABSOLUTE,
  SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresSidewaysYield.JSON_PROPERTY_RELATIVE,
  SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresSidewaysYield.JSON_PROPERTY_ANNUALIZED
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresSidewaysYield implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ABSOLUTE = "absolute";
  private SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresSidewaysYieldAbsolute absolute;

  public static final String JSON_PROPERTY_RELATIVE = "relative";
  private SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresSidewaysYieldRelative relative;

  public static final String JSON_PROPERTY_ANNUALIZED = "annualized";
  private SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresSidewaysYieldAnnualized annualized;

  public SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresSidewaysYield() { 
  }

  public SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresSidewaysYield absolute(SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresSidewaysYieldAbsolute absolute) {
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

  public SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresSidewaysYieldAbsolute getAbsolute() {
    return absolute;
  }


  @JsonProperty(JSON_PROPERTY_ABSOLUTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAbsolute(SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresSidewaysYieldAbsolute absolute) {
    this.absolute = absolute;
  }


  public SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresSidewaysYield relative(SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresSidewaysYieldRelative relative) {
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

  public SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresSidewaysYieldRelative getRelative() {
    return relative;
  }


  @JsonProperty(JSON_PROPERTY_RELATIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRelative(SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresSidewaysYieldRelative relative) {
    this.relative = relative;
  }


  public SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresSidewaysYield annualized(SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresSidewaysYieldAnnualized annualized) {
    this.annualized = annualized;
    return this;
  }

   /**
   * Get annualized
   * @return annualized
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ANNUALIZED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresSidewaysYieldAnnualized getAnnualized() {
    return annualized;
  }


  @JsonProperty(JSON_PROPERTY_ANNUALIZED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAnnualized(SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresSidewaysYieldAnnualized annualized) {
    this.annualized = annualized;
  }


  /**
   * Return true if this _securitizedDerivative_notation_screener_valueRanges_get_data_keyFigures_sidewaysYield object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresSidewaysYield securitizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresSidewaysYield = (SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresSidewaysYield) o;
    return Objects.equals(this.absolute, securitizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresSidewaysYield.absolute) &&
        Objects.equals(this.relative, securitizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresSidewaysYield.relative) &&
        Objects.equals(this.annualized, securitizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresSidewaysYield.annualized);
  }

  @Override
  public int hashCode() {
    return Objects.hash(absolute, relative, annualized);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresSidewaysYield {\n");
    sb.append("    absolute: ").append(toIndentedString(absolute)).append("\n");
    sb.append("    relative: ").append(toIndentedString(relative)).append("\n");
    sb.append("    annualized: ").append(toIndentedString(annualized)).append("\n");
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

