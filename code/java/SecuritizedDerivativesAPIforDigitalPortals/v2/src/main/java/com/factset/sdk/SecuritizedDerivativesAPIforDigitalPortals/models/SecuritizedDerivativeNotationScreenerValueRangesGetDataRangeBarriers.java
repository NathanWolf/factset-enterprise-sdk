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
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models.SecuritizedDerivativeNotationScreenerValueRangesGetDataBreach;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models.SecuritizedDerivativeNotationScreenerValueRangesGetDataCashFlow;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models.SecuritizedDerivativeNotationScreenerValueRangesGetDataLower;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models.SecuritizedDerivativeNotationScreenerValueRangesGetDataObservation1;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models.SecuritizedDerivativeNotationScreenerValueRangesGetDataUpper;
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
 * SecuritizedDerivativeNotationScreenerValueRangesGetDataRangeBarriers
 */
@JsonPropertyOrder({
  SecuritizedDerivativeNotationScreenerValueRangesGetDataRangeBarriers.JSON_PROPERTY_TYPE,
  SecuritizedDerivativeNotationScreenerValueRangesGetDataRangeBarriers.JSON_PROPERTY_OBSERVATION,
  SecuritizedDerivativeNotationScreenerValueRangesGetDataRangeBarriers.JSON_PROPERTY_UPPER,
  SecuritizedDerivativeNotationScreenerValueRangesGetDataRangeBarriers.JSON_PROPERTY_LOWER,
  SecuritizedDerivativeNotationScreenerValueRangesGetDataRangeBarriers.JSON_PROPERTY_BREACH,
  SecuritizedDerivativeNotationScreenerValueRangesGetDataRangeBarriers.JSON_PROPERTY_CASH_FLOW
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SecuritizedDerivativeNotationScreenerValueRangesGetDataRangeBarriers implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * The type of the barrier. See endpoint &#x60;/securitizedDerivative/barrier/type/list&#x60; for additional information. Note that not all barrier types listed in the mentioned endpoint can be used as a parameter.
   */
  public enum TypeEnum {
    RANGEKNOCKOUT("rangeKnockOut");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TYPE = "type";
  private TypeEnum type;

  public static final String JSON_PROPERTY_OBSERVATION = "observation";
  private SecuritizedDerivativeNotationScreenerValueRangesGetDataObservation1 observation;

  public static final String JSON_PROPERTY_UPPER = "upper";
  private SecuritizedDerivativeNotationScreenerValueRangesGetDataUpper upper;

  public static final String JSON_PROPERTY_LOWER = "lower";
  private SecuritizedDerivativeNotationScreenerValueRangesGetDataLower lower;

  public static final String JSON_PROPERTY_BREACH = "breach";
  private SecuritizedDerivativeNotationScreenerValueRangesGetDataBreach breach;

  public static final String JSON_PROPERTY_CASH_FLOW = "cashFlow";
  private SecuritizedDerivativeNotationScreenerValueRangesGetDataCashFlow cashFlow;


  public SecuritizedDerivativeNotationScreenerValueRangesGetDataRangeBarriers type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * The type of the barrier. See endpoint &#x60;/securitizedDerivative/barrier/type/list&#x60; for additional information. Note that not all barrier types listed in the mentioned endpoint can be used as a parameter.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The type of the barrier. See endpoint `/securitizedDerivative/barrier/type/list` for additional information. Note that not all barrier types listed in the mentioned endpoint can be used as a parameter.")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TypeEnum getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(TypeEnum type) {
    this.type = type;
  }


  public SecuritizedDerivativeNotationScreenerValueRangesGetDataRangeBarriers observation(SecuritizedDerivativeNotationScreenerValueRangesGetDataObservation1 observation) {
    this.observation = observation;
    return this;
  }

   /**
   * Get observation
   * @return observation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OBSERVATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SecuritizedDerivativeNotationScreenerValueRangesGetDataObservation1 getObservation() {
    return observation;
  }


  @JsonProperty(JSON_PROPERTY_OBSERVATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setObservation(SecuritizedDerivativeNotationScreenerValueRangesGetDataObservation1 observation) {
    this.observation = observation;
  }


  public SecuritizedDerivativeNotationScreenerValueRangesGetDataRangeBarriers upper(SecuritizedDerivativeNotationScreenerValueRangesGetDataUpper upper) {
    this.upper = upper;
    return this;
  }

   /**
   * Get upper
   * @return upper
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_UPPER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SecuritizedDerivativeNotationScreenerValueRangesGetDataUpper getUpper() {
    return upper;
  }


  @JsonProperty(JSON_PROPERTY_UPPER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpper(SecuritizedDerivativeNotationScreenerValueRangesGetDataUpper upper) {
    this.upper = upper;
  }


  public SecuritizedDerivativeNotationScreenerValueRangesGetDataRangeBarriers lower(SecuritizedDerivativeNotationScreenerValueRangesGetDataLower lower) {
    this.lower = lower;
    return this;
  }

   /**
   * Get lower
   * @return lower
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LOWER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SecuritizedDerivativeNotationScreenerValueRangesGetDataLower getLower() {
    return lower;
  }


  @JsonProperty(JSON_PROPERTY_LOWER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLower(SecuritizedDerivativeNotationScreenerValueRangesGetDataLower lower) {
    this.lower = lower;
  }


  public SecuritizedDerivativeNotationScreenerValueRangesGetDataRangeBarriers breach(SecuritizedDerivativeNotationScreenerValueRangesGetDataBreach breach) {
    this.breach = breach;
    return this;
  }

   /**
   * Get breach
   * @return breach
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BREACH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SecuritizedDerivativeNotationScreenerValueRangesGetDataBreach getBreach() {
    return breach;
  }


  @JsonProperty(JSON_PROPERTY_BREACH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBreach(SecuritizedDerivativeNotationScreenerValueRangesGetDataBreach breach) {
    this.breach = breach;
  }


  public SecuritizedDerivativeNotationScreenerValueRangesGetDataRangeBarriers cashFlow(SecuritizedDerivativeNotationScreenerValueRangesGetDataCashFlow cashFlow) {
    this.cashFlow = cashFlow;
    return this;
  }

   /**
   * Get cashFlow
   * @return cashFlow
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CASH_FLOW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SecuritizedDerivativeNotationScreenerValueRangesGetDataCashFlow getCashFlow() {
    return cashFlow;
  }


  @JsonProperty(JSON_PROPERTY_CASH_FLOW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCashFlow(SecuritizedDerivativeNotationScreenerValueRangesGetDataCashFlow cashFlow) {
    this.cashFlow = cashFlow;
  }


  /**
   * Return true if this _securitizedDerivative_notation_screener_valueRanges_get_data_rangeBarriers object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecuritizedDerivativeNotationScreenerValueRangesGetDataRangeBarriers securitizedDerivativeNotationScreenerValueRangesGetDataRangeBarriers = (SecuritizedDerivativeNotationScreenerValueRangesGetDataRangeBarriers) o;
    return Objects.equals(this.type, securitizedDerivativeNotationScreenerValueRangesGetDataRangeBarriers.type) &&
        Objects.equals(this.observation, securitizedDerivativeNotationScreenerValueRangesGetDataRangeBarriers.observation) &&
        Objects.equals(this.upper, securitizedDerivativeNotationScreenerValueRangesGetDataRangeBarriers.upper) &&
        Objects.equals(this.lower, securitizedDerivativeNotationScreenerValueRangesGetDataRangeBarriers.lower) &&
        Objects.equals(this.breach, securitizedDerivativeNotationScreenerValueRangesGetDataRangeBarriers.breach) &&
        Objects.equals(this.cashFlow, securitizedDerivativeNotationScreenerValueRangesGetDataRangeBarriers.cashFlow);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, observation, upper, lower, breach, cashFlow);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecuritizedDerivativeNotationScreenerValueRangesGetDataRangeBarriers {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    observation: ").append(toIndentedString(observation)).append("\n");
    sb.append("    upper: ").append(toIndentedString(upper)).append("\n");
    sb.append("    lower: ").append(toIndentedString(lower)).append("\n");
    sb.append("    breach: ").append(toIndentedString(breach)).append("\n");
    sb.append("    cashFlow: ").append(toIndentedString(cashFlow)).append("\n");
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

