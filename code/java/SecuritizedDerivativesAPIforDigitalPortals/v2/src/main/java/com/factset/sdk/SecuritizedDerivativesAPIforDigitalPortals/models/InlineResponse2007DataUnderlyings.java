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
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models.InlineResponse2003DataValueUnit;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models.InlineResponse2007DataCalculationLevel;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models.InlineResponse2007DataNotation;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models.InlineResponse2007DataOperatingMIC;
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
 * InlineResponse2007DataUnderlyings
 */
@JsonPropertyOrder({
  InlineResponse2007DataUnderlyings.JSON_PROPERTY_NAME,
  InlineResponse2007DataUnderlyings.JSON_PROPERTY_VALUE_UNIT,
  InlineResponse2007DataUnderlyings.JSON_PROPERTY_OPERATING_M_I_C,
  InlineResponse2007DataUnderlyings.JSON_PROPERTY_NOTATION,
  InlineResponse2007DataUnderlyings.JSON_PROPERTY_COVER_RATIO,
  InlineResponse2007DataUnderlyings.JSON_PROPERTY_REFERENCE_LEVEL,
  InlineResponse2007DataUnderlyings.JSON_PROPERTY_CONSTANT_LEVERAGE,
  InlineResponse2007DataUnderlyings.JSON_PROPERTY_CALCULATION_LEVEL
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse2007DataUnderlyings implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_VALUE_UNIT = "valueUnit";
  private InlineResponse2003DataValueUnit valueUnit;

  public static final String JSON_PROPERTY_OPERATING_M_I_C = "operatingMIC";
  private InlineResponse2007DataOperatingMIC operatingMIC;

  public static final String JSON_PROPERTY_NOTATION = "notation";
  private InlineResponse2007DataNotation notation;

  public static final String JSON_PROPERTY_COVER_RATIO = "coverRatio";
  private BigDecimal coverRatio;

  public static final String JSON_PROPERTY_REFERENCE_LEVEL = "referenceLevel";
  private BigDecimal referenceLevel;

  public static final String JSON_PROPERTY_CONSTANT_LEVERAGE = "constantLeverage";
  private BigDecimal constantLeverage;

  public static final String JSON_PROPERTY_CALCULATION_LEVEL = "calculationLevel";
  private InlineResponse2007DataCalculationLevel calculationLevel;

  public InlineResponse2007DataUnderlyings() { 
  }

  public InlineResponse2007DataUnderlyings name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the underlying, provided also if there is no notation for the underlying.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the underlying, provided also if there is no notation for the underlying.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public InlineResponse2007DataUnderlyings valueUnit(InlineResponse2003DataValueUnit valueUnit) {
    this.valueUnit = valueUnit;
    return this;
  }

   /**
   * Get valueUnit
   * @return valueUnit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VALUE_UNIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2003DataValueUnit getValueUnit() {
    return valueUnit;
  }


  @JsonProperty(JSON_PROPERTY_VALUE_UNIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValueUnit(InlineResponse2003DataValueUnit valueUnit) {
    this.valueUnit = valueUnit;
  }


  public InlineResponse2007DataUnderlyings operatingMIC(InlineResponse2007DataOperatingMIC operatingMIC) {
    this.operatingMIC = operatingMIC;
    return this;
  }

   /**
   * Get operatingMIC
   * @return operatingMIC
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OPERATING_M_I_C)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2007DataOperatingMIC getOperatingMIC() {
    return operatingMIC;
  }


  @JsonProperty(JSON_PROPERTY_OPERATING_M_I_C)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOperatingMIC(InlineResponse2007DataOperatingMIC operatingMIC) {
    this.operatingMIC = operatingMIC;
  }


  public InlineResponse2007DataUnderlyings notation(InlineResponse2007DataNotation notation) {
    this.notation = notation;
    return this;
  }

   /**
   * Get notation
   * @return notation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NOTATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2007DataNotation getNotation() {
    return notation;
  }


  @JsonProperty(JSON_PROPERTY_NOTATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNotation(InlineResponse2007DataNotation notation) {
    this.notation = notation;
  }


  public InlineResponse2007DataUnderlyings coverRatio(BigDecimal coverRatio) {
    this.coverRatio = coverRatio;
    return this;
  }

   /**
   * Cover ratio. It indicates the number of units of the underlying to which the securitized derivative refers. If the underlying is a bond the cover ratio represents the value of one percentage point. 
   * @return coverRatio
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Cover ratio. It indicates the number of units of the underlying to which the securitized derivative refers. If the underlying is a bond the cover ratio represents the value of one percentage point. ")
  @JsonProperty(JSON_PROPERTY_COVER_RATIO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getCoverRatio() {
    return coverRatio;
  }


  @JsonProperty(JSON_PROPERTY_COVER_RATIO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCoverRatio(BigDecimal coverRatio) {
    this.coverRatio = coverRatio;
  }


  public InlineResponse2007DataUnderlyings referenceLevel(BigDecimal referenceLevel) {
    this.referenceLevel = referenceLevel;
    return this;
  }

   /**
   * Level of the underlying on the issue date of the securitized derivative.
   * @return referenceLevel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Level of the underlying on the issue date of the securitized derivative.")
  @JsonProperty(JSON_PROPERTY_REFERENCE_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getReferenceLevel() {
    return referenceLevel;
  }


  @JsonProperty(JSON_PROPERTY_REFERENCE_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReferenceLevel(BigDecimal referenceLevel) {
    this.referenceLevel = referenceLevel;
  }


  public InlineResponse2007DataUnderlyings constantLeverage(BigDecimal constantLeverage) {
    this.constantLeverage = constantLeverage;
    return this;
  }

   /**
   * Constant leverage of the underlying for securitized derivatives with constant leverage that do not have a factor index as underlying (i.e. the attribute &#x60;typeComposite&#x60; of the underlying instrument is not set or is different from 4).
   * @return constantLeverage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Constant leverage of the underlying for securitized derivatives with constant leverage that do not have a factor index as underlying (i.e. the attribute `typeComposite` of the underlying instrument is not set or is different from 4).")
  @JsonProperty(JSON_PROPERTY_CONSTANT_LEVERAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getConstantLeverage() {
    return constantLeverage;
  }


  @JsonProperty(JSON_PROPERTY_CONSTANT_LEVERAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConstantLeverage(BigDecimal constantLeverage) {
    this.constantLeverage = constantLeverage;
  }


  public InlineResponse2007DataUnderlyings calculationLevel(InlineResponse2007DataCalculationLevel calculationLevel) {
    this.calculationLevel = calculationLevel;
    return this;
  }

   /**
   * Get calculationLevel
   * @return calculationLevel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CALCULATION_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2007DataCalculationLevel getCalculationLevel() {
    return calculationLevel;
  }


  @JsonProperty(JSON_PROPERTY_CALCULATION_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCalculationLevel(InlineResponse2007DataCalculationLevel calculationLevel) {
    this.calculationLevel = calculationLevel;
  }


  /**
   * Return true if this inline_response_200_7_data_underlyings object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2007DataUnderlyings inlineResponse2007DataUnderlyings = (InlineResponse2007DataUnderlyings) o;
    return Objects.equals(this.name, inlineResponse2007DataUnderlyings.name) &&
        Objects.equals(this.valueUnit, inlineResponse2007DataUnderlyings.valueUnit) &&
        Objects.equals(this.operatingMIC, inlineResponse2007DataUnderlyings.operatingMIC) &&
        Objects.equals(this.notation, inlineResponse2007DataUnderlyings.notation) &&
        Objects.equals(this.coverRatio, inlineResponse2007DataUnderlyings.coverRatio) &&
        Objects.equals(this.referenceLevel, inlineResponse2007DataUnderlyings.referenceLevel) &&
        Objects.equals(this.constantLeverage, inlineResponse2007DataUnderlyings.constantLeverage) &&
        Objects.equals(this.calculationLevel, inlineResponse2007DataUnderlyings.calculationLevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, valueUnit, operatingMIC, notation, coverRatio, referenceLevel, constantLeverage, calculationLevel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2007DataUnderlyings {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    valueUnit: ").append(toIndentedString(valueUnit)).append("\n");
    sb.append("    operatingMIC: ").append(toIndentedString(operatingMIC)).append("\n");
    sb.append("    notation: ").append(toIndentedString(notation)).append("\n");
    sb.append("    coverRatio: ").append(toIndentedString(coverRatio)).append("\n");
    sb.append("    referenceLevel: ").append(toIndentedString(referenceLevel)).append("\n");
    sb.append("    constantLeverage: ").append(toIndentedString(constantLeverage)).append("\n");
    sb.append("    calculationLevel: ").append(toIndentedString(calculationLevel)).append("\n");
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

