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


package com.factset.sdk.QuotesAPIforDigitalPortals.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20062DataCostsAndChargesExAnteOneOffEntryCostValueUnit;
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
import com.factset.sdk.QuotesAPIforDigitalPortals.JSON;


/**
 * Maximum ex ante one-off exit cost, not acquired to a fund. This type of cost is applicable to funds only.
 */
@ApiModel(description = "Maximum ex ante one-off exit cost, not acquired to a fund. This type of cost is applicable to funds only.")
@JsonPropertyOrder({
  InlineResponse20062DataCostsAndChargesExAnteOneOffMaximumExitCost.JSON_PROPERTY_VALUE,
  InlineResponse20062DataCostsAndChargesExAnteOneOffMaximumExitCost.JSON_PROPERTY_VALUE_UNIT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse20062DataCostsAndChargesExAnteOneOffMaximumExitCost implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_VALUE = "value";
  private BigDecimal value;

  public static final String JSON_PROPERTY_VALUE_UNIT = "valueUnit";
  private InlineResponse20062DataCostsAndChargesExAnteOneOffEntryCostValueUnit valueUnit;

  public InlineResponse20062DataCostsAndChargesExAnteOneOffMaximumExitCost() { 
  }

  public InlineResponse20062DataCostsAndChargesExAnteOneOffMaximumExitCost value(BigDecimal value) {
    this.value = value;
    return this;
  }

   /**
   * Value of the attribute.
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Value of the attribute.")
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


  public InlineResponse20062DataCostsAndChargesExAnteOneOffMaximumExitCost valueUnit(InlineResponse20062DataCostsAndChargesExAnteOneOffEntryCostValueUnit valueUnit) {
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

  public InlineResponse20062DataCostsAndChargesExAnteOneOffEntryCostValueUnit getValueUnit() {
    return valueUnit;
  }


  @JsonProperty(JSON_PROPERTY_VALUE_UNIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValueUnit(InlineResponse20062DataCostsAndChargesExAnteOneOffEntryCostValueUnit valueUnit) {
    this.valueUnit = valueUnit;
  }


  /**
   * Return true if this inline_response_200_62_data_costsAndCharges_exAnte_oneOffMaximumExitCost object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20062DataCostsAndChargesExAnteOneOffMaximumExitCost inlineResponse20062DataCostsAndChargesExAnteOneOffMaximumExitCost = (InlineResponse20062DataCostsAndChargesExAnteOneOffMaximumExitCost) o;
    return Objects.equals(this.value, inlineResponse20062DataCostsAndChargesExAnteOneOffMaximumExitCost.value) &&
        Objects.equals(this.valueUnit, inlineResponse20062DataCostsAndChargesExAnteOneOffMaximumExitCost.valueUnit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, valueUnit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20062DataCostsAndChargesExAnteOneOffMaximumExitCost {\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    valueUnit: ").append(toIndentedString(valueUnit)).append("\n");
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

