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
import com.factset.sdk.OptimizationEngineAPIMultiperiod.models.OptimizerInputsEObjectiveTermDirectionEnum;
import com.factset.sdk.OptimizationEngineAPIMultiperiod.models.OptimizerInputsValue;
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
 * OptimizerInputsSharpeRatioTerm
 */
@JsonPropertyOrder({
  OptimizerInputsSharpeRatioTerm.JSON_PROPERTY_NAME,
  OptimizerInputsSharpeRatioTerm.JSON_PROPERTY_MULTIPLIER,
  OptimizerInputsSharpeRatioTerm.JSON_PROPERTY_RISK_FREE_RATE,
  OptimizerInputsSharpeRatioTerm.JSON_PROPERTY_DIRECTION,
  OptimizerInputsSharpeRatioTerm.JSON_PROPERTY_ACTIVE_RISK,
  OptimizerInputsSharpeRatioTerm.JSON_PROPERTY_BENCHMARK_INDEX
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class OptimizerInputsSharpeRatioTerm implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_MULTIPLIER = "multiplier";
  private OptimizerInputsValue multiplier;

  public static final String JSON_PROPERTY_RISK_FREE_RATE = "risk_free_rate";
  private OptimizerInputsValue riskFreeRate;

  public static final String JSON_PROPERTY_DIRECTION = "direction";
  private OptimizerInputsEObjectiveTermDirectionEnum direction;

  public static final String JSON_PROPERTY_ACTIVE_RISK = "active_risk";
  private Boolean activeRisk;

  public static final String JSON_PROPERTY_BENCHMARK_INDEX = "benchmark_index";
  private Integer benchmarkIndex;

  public OptimizerInputsSharpeRatioTerm() { 
  }

  public OptimizerInputsSharpeRatioTerm name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
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


  public OptimizerInputsSharpeRatioTerm multiplier(OptimizerInputsValue multiplier) {
    this.multiplier = multiplier;
    return this;
  }

   /**
   * Get multiplier
   * @return multiplier
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MULTIPLIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OptimizerInputsValue getMultiplier() {
    return multiplier;
  }


  @JsonProperty(JSON_PROPERTY_MULTIPLIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMultiplier(OptimizerInputsValue multiplier) {
    this.multiplier = multiplier;
  }


  public OptimizerInputsSharpeRatioTerm riskFreeRate(OptimizerInputsValue riskFreeRate) {
    this.riskFreeRate = riskFreeRate;
    return this;
  }

   /**
   * Get riskFreeRate
   * @return riskFreeRate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RISK_FREE_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OptimizerInputsValue getRiskFreeRate() {
    return riskFreeRate;
  }


  @JsonProperty(JSON_PROPERTY_RISK_FREE_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRiskFreeRate(OptimizerInputsValue riskFreeRate) {
    this.riskFreeRate = riskFreeRate;
  }


  public OptimizerInputsSharpeRatioTerm direction(OptimizerInputsEObjectiveTermDirectionEnum direction) {
    this.direction = direction;
    return this;
  }

   /**
   * Get direction
   * @return direction
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DIRECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OptimizerInputsEObjectiveTermDirectionEnum getDirection() {
    return direction;
  }


  @JsonProperty(JSON_PROPERTY_DIRECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDirection(OptimizerInputsEObjectiveTermDirectionEnum direction) {
    this.direction = direction;
  }


  public OptimizerInputsSharpeRatioTerm activeRisk(Boolean activeRisk) {
    this.activeRisk = activeRisk;
    return this;
  }

   /**
   * Get activeRisk
   * @return activeRisk
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ACTIVE_RISK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getActiveRisk() {
    return activeRisk;
  }


  @JsonProperty(JSON_PROPERTY_ACTIVE_RISK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setActiveRisk(Boolean activeRisk) {
    this.activeRisk = activeRisk;
  }


  public OptimizerInputsSharpeRatioTerm benchmarkIndex(Integer benchmarkIndex) {
    this.benchmarkIndex = benchmarkIndex;
    return this;
  }

   /**
   * Get benchmarkIndex
   * @return benchmarkIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BENCHMARK_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getBenchmarkIndex() {
    return benchmarkIndex;
  }


  @JsonProperty(JSON_PROPERTY_BENCHMARK_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBenchmarkIndex(Integer benchmarkIndex) {
    this.benchmarkIndex = benchmarkIndex;
  }


  /**
   * Return true if this optimizer.inputs.SharpeRatioTerm object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OptimizerInputsSharpeRatioTerm optimizerInputsSharpeRatioTerm = (OptimizerInputsSharpeRatioTerm) o;
    return Objects.equals(this.name, optimizerInputsSharpeRatioTerm.name) &&
        Objects.equals(this.multiplier, optimizerInputsSharpeRatioTerm.multiplier) &&
        Objects.equals(this.riskFreeRate, optimizerInputsSharpeRatioTerm.riskFreeRate) &&
        Objects.equals(this.direction, optimizerInputsSharpeRatioTerm.direction) &&
        Objects.equals(this.activeRisk, optimizerInputsSharpeRatioTerm.activeRisk) &&
        Objects.equals(this.benchmarkIndex, optimizerInputsSharpeRatioTerm.benchmarkIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, multiplier, riskFreeRate, direction, activeRisk, benchmarkIndex);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OptimizerInputsSharpeRatioTerm {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    multiplier: ").append(toIndentedString(multiplier)).append("\n");
    sb.append("    riskFreeRate: ").append(toIndentedString(riskFreeRate)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    activeRisk: ").append(toIndentedString(activeRisk)).append("\n");
    sb.append("    benchmarkIndex: ").append(toIndentedString(benchmarkIndex)).append("\n");
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

