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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.QuotesAPIforDigitalPortals.JSON;


/**
 * Specific indicators for Germany.
 */
@ApiModel(description = "Specific indicators for Germany.")
@JsonPropertyOrder({
  InlineResponse20062DataTargetMarketRiskToleranceGermany.JSON_PROPERTY_LOWEST_RISK_TOLERANCE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse20062DataTargetMarketRiskToleranceGermany implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_LOWEST_RISK_TOLERANCE = "lowestRiskTolerance";
  private Boolean lowestRiskTolerance;

  public InlineResponse20062DataTargetMarketRiskToleranceGermany() { 
  }

  public InlineResponse20062DataTargetMarketRiskToleranceGermany lowestRiskTolerance(Boolean lowestRiskTolerance) {
    this.lowestRiskTolerance = lowestRiskTolerance;
    return this;
  }

   /**
   * Indicates whether the investment product is suitable for investors with the lowest risk tolerance.
   * @return lowestRiskTolerance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether the investment product is suitable for investors with the lowest risk tolerance.")
  @JsonProperty(JSON_PROPERTY_LOWEST_RISK_TOLERANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getLowestRiskTolerance() {
    return lowestRiskTolerance;
  }


  @JsonProperty(JSON_PROPERTY_LOWEST_RISK_TOLERANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLowestRiskTolerance(Boolean lowestRiskTolerance) {
    this.lowestRiskTolerance = lowestRiskTolerance;
  }


  /**
   * Return true if this inline_response_200_62_data_targetMarket_riskTolerance_germany object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20062DataTargetMarketRiskToleranceGermany inlineResponse20062DataTargetMarketRiskToleranceGermany = (InlineResponse20062DataTargetMarketRiskToleranceGermany) o;
    return Objects.equals(this.lowestRiskTolerance, inlineResponse20062DataTargetMarketRiskToleranceGermany.lowestRiskTolerance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lowestRiskTolerance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20062DataTargetMarketRiskToleranceGermany {\n");
    sb.append("    lowestRiskTolerance: ").append(toIndentedString(lowestRiskTolerance)).append("\n");
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

