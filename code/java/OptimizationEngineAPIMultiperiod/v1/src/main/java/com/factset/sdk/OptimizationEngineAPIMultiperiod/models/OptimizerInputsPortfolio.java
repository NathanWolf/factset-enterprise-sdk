/*
 * fpo_mp_input
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.OptimizationEngineAPIMultiperiod.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.OptimizationEngineAPIMultiperiod.models.OptimizerInputsPortfolioItem;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.OptimizationEngineAPIMultiperiod.JSON;


/**
 * OptimizerInputsPortfolio
 */
@JsonPropertyOrder({
  OptimizerInputsPortfolio.JSON_PROPERTY_HOLDINGS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class OptimizerInputsPortfolio implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_HOLDINGS = "holdings";
  private java.util.List<OptimizerInputsPortfolioItem> holdings = null;

  public OptimizerInputsPortfolio() { 
  }

  public OptimizerInputsPortfolio holdings(java.util.List<OptimizerInputsPortfolioItem> holdings) {
    this.holdings = holdings;
    return this;
  }

  public OptimizerInputsPortfolio addHoldingsItem(OptimizerInputsPortfolioItem holdingsItem) {
    if (this.holdings == null) {
      this.holdings = new java.util.ArrayList<>();
    }
    this.holdings.add(holdingsItem);
    return this;
  }

   /**
   * Get holdings
   * @return holdings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_HOLDINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<OptimizerInputsPortfolioItem> getHoldings() {
    return holdings;
  }


  @JsonProperty(JSON_PROPERTY_HOLDINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHoldings(java.util.List<OptimizerInputsPortfolioItem> holdings) {
    this.holdings = holdings;
  }


  /**
   * Return true if this optimizer.inputs.Portfolio object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OptimizerInputsPortfolio optimizerInputsPortfolio = (OptimizerInputsPortfolio) o;
    return Objects.equals(this.holdings, optimizerInputsPortfolio.holdings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(holdings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OptimizerInputsPortfolio {\n");
    sb.append("    holdings: ").append(toIndentedString(holdings)).append("\n");
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

