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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.JSON;


/**
 * Vega. It represents the first partial derivative of the function determining the derivative notation&#39;s theoretical price with respect to the implied volatility, evaluated at the current implied volatility. Vega indicates the ratio of the absolute change of the price of a derivative for an absolute change of the implied volatility, thus it represents the price sensitivity of the derivative relative to changes in the implied volatility. This key figure is calculated for plain vanilla warrants only.
 */
@ApiModel(description = "Vega. It represents the first partial derivative of the function determining the derivative notation's theoretical price with respect to the implied volatility, evaluated at the current implied volatility. Vega indicates the ratio of the absolute change of the price of a derivative for an absolute change of the implied volatility, thus it represents the price sensitivity of the derivative relative to changes in the implied volatility. This key figure is calculated for plain vanilla warrants only.")
@JsonPropertyOrder({
  InlineResponse2006KeyFiguresVega.JSON_PROPERTY_EFFECTIVE,
  InlineResponse2006KeyFiguresVega.JSON_PROPERTY_UNADJUSTED
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse2006KeyFiguresVega implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_EFFECTIVE = "effective";
  private BigDecimal effective;

  public static final String JSON_PROPERTY_UNADJUSTED = "unadjusted";
  private BigDecimal unadjusted;


  public InlineResponse2006KeyFiguresVega effective(BigDecimal effective) {
    this.effective = effective;
    return this;
  }

   /**
   * Vega calculated using the actual cover ratio of the securitized derivative.
   * @return effective
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Vega calculated using the actual cover ratio of the securitized derivative.")
  @JsonProperty(JSON_PROPERTY_EFFECTIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getEffective() {
    return effective;
  }


  @JsonProperty(JSON_PROPERTY_EFFECTIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEffective(BigDecimal effective) {
    this.effective = effective;
  }


  public InlineResponse2006KeyFiguresVega unadjusted(BigDecimal unadjusted) {
    this.unadjusted = unadjusted;
    return this;
  }

   /**
   * Vega calculated using a (hypothetical) cover ratio of 1:1.
   * @return unadjusted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Vega calculated using a (hypothetical) cover ratio of 1:1.")
  @JsonProperty(JSON_PROPERTY_UNADJUSTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getUnadjusted() {
    return unadjusted;
  }


  @JsonProperty(JSON_PROPERTY_UNADJUSTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUnadjusted(BigDecimal unadjusted) {
    this.unadjusted = unadjusted;
  }


  /**
   * Return true if this inline_response_200_6_keyFigures_vega object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2006KeyFiguresVega inlineResponse2006KeyFiguresVega = (InlineResponse2006KeyFiguresVega) o;
    return Objects.equals(this.effective, inlineResponse2006KeyFiguresVega.effective) &&
        Objects.equals(this.unadjusted, inlineResponse2006KeyFiguresVega.unadjusted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(effective, unadjusted);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2006KeyFiguresVega {\n");
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

