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


package com.factset.sdk.BondsAPIforDigitalPortals.models;

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
import com.factset.sdk.BondsAPIforDigitalPortals.JSON;


/**
 * The minimum of the range, or &#x60;null&#x60; to indicate that there is no minimum.
 */
@ApiModel(description = "The minimum of the range, or `null` to indicate that there is no minimum.")
@JsonPropertyOrder({
  DebtInstrumentNotationScreenerSearchDataLifeCycleMaturityRestrictionRemainingTermYearsMinimum.JSON_PROPERTY_VALUE,
  DebtInstrumentNotationScreenerSearchDataLifeCycleMaturityRestrictionRemainingTermYearsMinimum.JSON_PROPERTY_INCLUSIVE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DebtInstrumentNotationScreenerSearchDataLifeCycleMaturityRestrictionRemainingTermYearsMinimum implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_VALUE = "value";
  private BigDecimal value;

  public static final String JSON_PROPERTY_INCLUSIVE = "inclusive";
  private Boolean inclusive = true;


  public DebtInstrumentNotationScreenerSearchDataLifeCycleMaturityRestrictionRemainingTermYearsMinimum value(BigDecimal value) {
    this.value = value;
    return this;
  }

   /**
   * The minimum value.
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The minimum value.")
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getValue() {
    return value;
  }


  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValue(BigDecimal value) {
    this.value = value;
  }


  public DebtInstrumentNotationScreenerSearchDataLifeCycleMaturityRestrictionRemainingTermYearsMinimum inclusive(Boolean inclusive) {
    this.inclusive = inclusive;
    return this;
  }

   /**
   * Indicates whether the minimum value is included in the range or not.
   * @return inclusive
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether the minimum value is included in the range or not.")
  @JsonProperty(JSON_PROPERTY_INCLUSIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getInclusive() {
    return inclusive;
  }


  @JsonProperty(JSON_PROPERTY_INCLUSIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInclusive(Boolean inclusive) {
    this.inclusive = inclusive;
  }


  /**
   * Return true if this _debtInstrument_notation_screener_search_data_lifeCycle_maturity_restriction_remainingTermYears_minimum object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DebtInstrumentNotationScreenerSearchDataLifeCycleMaturityRestrictionRemainingTermYearsMinimum debtInstrumentNotationScreenerSearchDataLifeCycleMaturityRestrictionRemainingTermYearsMinimum = (DebtInstrumentNotationScreenerSearchDataLifeCycleMaturityRestrictionRemainingTermYearsMinimum) o;
    return Objects.equals(this.value, debtInstrumentNotationScreenerSearchDataLifeCycleMaturityRestrictionRemainingTermYearsMinimum.value) &&
        Objects.equals(this.inclusive, debtInstrumentNotationScreenerSearchDataLifeCycleMaturityRestrictionRemainingTermYearsMinimum.inclusive);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, inclusive);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DebtInstrumentNotationScreenerSearchDataLifeCycleMaturityRestrictionRemainingTermYearsMinimum {\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    inclusive: ").append(toIndentedString(inclusive)).append("\n");
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

