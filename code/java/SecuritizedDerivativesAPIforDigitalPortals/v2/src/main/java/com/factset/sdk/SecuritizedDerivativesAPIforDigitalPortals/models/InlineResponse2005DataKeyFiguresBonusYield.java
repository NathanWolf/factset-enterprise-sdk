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
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models.InlineResponse2005DataKeyFiguresBonusYieldAbsolute;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models.InlineResponse2005DataKeyFiguresBonusYieldAnnualized;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models.InlineResponse2005DataKeyFiguresBonusYieldRelative;
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
 * Value ranges related to the bonus yield.
 */
@ApiModel(description = "Value ranges related to the bonus yield.")
@JsonPropertyOrder({
  InlineResponse2005DataKeyFiguresBonusYield.JSON_PROPERTY_ABSOLUTE,
  InlineResponse2005DataKeyFiguresBonusYield.JSON_PROPERTY_RELATIVE,
  InlineResponse2005DataKeyFiguresBonusYield.JSON_PROPERTY_ANNUALIZED
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse2005DataKeyFiguresBonusYield implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ABSOLUTE = "absolute";
  private InlineResponse2005DataKeyFiguresBonusYieldAbsolute absolute;

  public static final String JSON_PROPERTY_RELATIVE = "relative";
  private InlineResponse2005DataKeyFiguresBonusYieldRelative relative;

  public static final String JSON_PROPERTY_ANNUALIZED = "annualized";
  private InlineResponse2005DataKeyFiguresBonusYieldAnnualized annualized;

  public InlineResponse2005DataKeyFiguresBonusYield() { 
  }

  public InlineResponse2005DataKeyFiguresBonusYield absolute(InlineResponse2005DataKeyFiguresBonusYieldAbsolute absolute) {
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

  public InlineResponse2005DataKeyFiguresBonusYieldAbsolute getAbsolute() {
    return absolute;
  }


  @JsonProperty(JSON_PROPERTY_ABSOLUTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAbsolute(InlineResponse2005DataKeyFiguresBonusYieldAbsolute absolute) {
    this.absolute = absolute;
  }


  public InlineResponse2005DataKeyFiguresBonusYield relative(InlineResponse2005DataKeyFiguresBonusYieldRelative relative) {
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

  public InlineResponse2005DataKeyFiguresBonusYieldRelative getRelative() {
    return relative;
  }


  @JsonProperty(JSON_PROPERTY_RELATIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRelative(InlineResponse2005DataKeyFiguresBonusYieldRelative relative) {
    this.relative = relative;
  }


  public InlineResponse2005DataKeyFiguresBonusYield annualized(InlineResponse2005DataKeyFiguresBonusYieldAnnualized annualized) {
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

  public InlineResponse2005DataKeyFiguresBonusYieldAnnualized getAnnualized() {
    return annualized;
  }


  @JsonProperty(JSON_PROPERTY_ANNUALIZED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAnnualized(InlineResponse2005DataKeyFiguresBonusYieldAnnualized annualized) {
    this.annualized = annualized;
  }


  /**
   * Return true if this inline_response_200_5_data_keyFigures_bonusYield object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2005DataKeyFiguresBonusYield inlineResponse2005DataKeyFiguresBonusYield = (InlineResponse2005DataKeyFiguresBonusYield) o;
    return Objects.equals(this.absolute, inlineResponse2005DataKeyFiguresBonusYield.absolute) &&
        Objects.equals(this.relative, inlineResponse2005DataKeyFiguresBonusYield.relative) &&
        Objects.equals(this.annualized, inlineResponse2005DataKeyFiguresBonusYield.annualized);
  }

  @Override
  public int hashCode() {
    return Objects.hash(absolute, relative, annualized);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2005DataKeyFiguresBonusYield {\n");
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

