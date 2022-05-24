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
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models.InlineResponse2005DataKeyFiguresSidewaysYieldAbsolute;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models.InlineResponse2005DataKeyFiguresSidewaysYieldAnnualized;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models.InlineResponse2005DataKeyFiguresSidewaysYieldRelative;
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
 * Value ranges related to the sideways yield.
 */
@ApiModel(description = "Value ranges related to the sideways yield.")
@JsonPropertyOrder({
  InlineResponse2005DataKeyFiguresSidewaysYield.JSON_PROPERTY_ABSOLUTE,
  InlineResponse2005DataKeyFiguresSidewaysYield.JSON_PROPERTY_RELATIVE,
  InlineResponse2005DataKeyFiguresSidewaysYield.JSON_PROPERTY_ANNUALIZED
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse2005DataKeyFiguresSidewaysYield implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ABSOLUTE = "absolute";
  private InlineResponse2005DataKeyFiguresSidewaysYieldAbsolute absolute;

  public static final String JSON_PROPERTY_RELATIVE = "relative";
  private InlineResponse2005DataKeyFiguresSidewaysYieldRelative relative;

  public static final String JSON_PROPERTY_ANNUALIZED = "annualized";
  private InlineResponse2005DataKeyFiguresSidewaysYieldAnnualized annualized;

  public InlineResponse2005DataKeyFiguresSidewaysYield() { 
  }

  public InlineResponse2005DataKeyFiguresSidewaysYield absolute(InlineResponse2005DataKeyFiguresSidewaysYieldAbsolute absolute) {
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

  public InlineResponse2005DataKeyFiguresSidewaysYieldAbsolute getAbsolute() {
    return absolute;
  }


  @JsonProperty(JSON_PROPERTY_ABSOLUTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAbsolute(InlineResponse2005DataKeyFiguresSidewaysYieldAbsolute absolute) {
    this.absolute = absolute;
  }


  public InlineResponse2005DataKeyFiguresSidewaysYield relative(InlineResponse2005DataKeyFiguresSidewaysYieldRelative relative) {
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

  public InlineResponse2005DataKeyFiguresSidewaysYieldRelative getRelative() {
    return relative;
  }


  @JsonProperty(JSON_PROPERTY_RELATIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRelative(InlineResponse2005DataKeyFiguresSidewaysYieldRelative relative) {
    this.relative = relative;
  }


  public InlineResponse2005DataKeyFiguresSidewaysYield annualized(InlineResponse2005DataKeyFiguresSidewaysYieldAnnualized annualized) {
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

  public InlineResponse2005DataKeyFiguresSidewaysYieldAnnualized getAnnualized() {
    return annualized;
  }


  @JsonProperty(JSON_PROPERTY_ANNUALIZED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAnnualized(InlineResponse2005DataKeyFiguresSidewaysYieldAnnualized annualized) {
    this.annualized = annualized;
  }


  /**
   * Return true if this inline_response_200_5_data_keyFigures_sidewaysYield object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2005DataKeyFiguresSidewaysYield inlineResponse2005DataKeyFiguresSidewaysYield = (InlineResponse2005DataKeyFiguresSidewaysYield) o;
    return Objects.equals(this.absolute, inlineResponse2005DataKeyFiguresSidewaysYield.absolute) &&
        Objects.equals(this.relative, inlineResponse2005DataKeyFiguresSidewaysYield.relative) &&
        Objects.equals(this.annualized, inlineResponse2005DataKeyFiguresSidewaysYield.annualized);
  }

  @Override
  public int hashCode() {
    return Objects.hash(absolute, relative, annualized);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2005DataKeyFiguresSidewaysYield {\n");
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

