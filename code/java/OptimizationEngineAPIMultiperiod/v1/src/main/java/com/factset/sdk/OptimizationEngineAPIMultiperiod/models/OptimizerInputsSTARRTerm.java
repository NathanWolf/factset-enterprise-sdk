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
 * OptimizerInputsSTARRTerm
 */
@JsonPropertyOrder({
  OptimizerInputsSTARRTerm.JSON_PROPERTY_NAME,
  OptimizerInputsSTARRTerm.JSON_PROPERTY_MULTIPLIER,
  OptimizerInputsSTARRTerm.JSON_PROPERTY_RISK_FREE_RATE,
  OptimizerInputsSTARRTerm.JSON_PROPERTY_DIRECTION,
  OptimizerInputsSTARRTerm.JSON_PROPERTY_CONFIDENCE_LEVEL,
  OptimizerInputsSTARRTerm.JSON_PROPERTY_USE_CENTERED_ETL,
  OptimizerInputsSTARRTerm.JSON_PROPERTY_ACTIVE_RISK,
  OptimizerInputsSTARRTerm.JSON_PROPERTY_BENCHMARK_INDEX
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class OptimizerInputsSTARRTerm implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_MULTIPLIER = "multiplier";
  private OptimizerInputsValue multiplier;

  public static final String JSON_PROPERTY_RISK_FREE_RATE = "risk_free_rate";
  private OptimizerInputsValue riskFreeRate;

  public static final String JSON_PROPERTY_DIRECTION = "direction";
  private OptimizerInputsEObjectiveTermDirectionEnum direction;

  public static final String JSON_PROPERTY_CONFIDENCE_LEVEL = "confidence_level";
  private Double confidenceLevel;

  public static final String JSON_PROPERTY_USE_CENTERED_ETL = "use_centered_etl";
  private Boolean useCenteredEtl;

  public static final String JSON_PROPERTY_ACTIVE_RISK = "active_risk";
  private Boolean activeRisk;

  public static final String JSON_PROPERTY_BENCHMARK_INDEX = "benchmark_index";
  private Integer benchmarkIndex;

  public OptimizerInputsSTARRTerm() { 
  }

  public OptimizerInputsSTARRTerm name(String name) {
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


  public OptimizerInputsSTARRTerm multiplier(OptimizerInputsValue multiplier) {
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


  public OptimizerInputsSTARRTerm riskFreeRate(OptimizerInputsValue riskFreeRate) {
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


  public OptimizerInputsSTARRTerm direction(OptimizerInputsEObjectiveTermDirectionEnum direction) {
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


  public OptimizerInputsSTARRTerm confidenceLevel(Double confidenceLevel) {
    this.confidenceLevel = confidenceLevel;
    return this;
  }

   /**
   * Get confidenceLevel
   * @return confidenceLevel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CONFIDENCE_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getConfidenceLevel() {
    return confidenceLevel;
  }


  @JsonProperty(JSON_PROPERTY_CONFIDENCE_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConfidenceLevel(Double confidenceLevel) {
    this.confidenceLevel = confidenceLevel;
  }


  public OptimizerInputsSTARRTerm useCenteredEtl(Boolean useCenteredEtl) {
    this.useCenteredEtl = useCenteredEtl;
    return this;
  }

   /**
   * Get useCenteredEtl
   * @return useCenteredEtl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_USE_CENTERED_ETL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getUseCenteredEtl() {
    return useCenteredEtl;
  }


  @JsonProperty(JSON_PROPERTY_USE_CENTERED_ETL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUseCenteredEtl(Boolean useCenteredEtl) {
    this.useCenteredEtl = useCenteredEtl;
  }


  public OptimizerInputsSTARRTerm activeRisk(Boolean activeRisk) {
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


  public OptimizerInputsSTARRTerm benchmarkIndex(Integer benchmarkIndex) {
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
   * Return true if this optimizer.inputs.STARRTerm object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OptimizerInputsSTARRTerm optimizerInputsSTARRTerm = (OptimizerInputsSTARRTerm) o;
    return Objects.equals(this.name, optimizerInputsSTARRTerm.name) &&
        Objects.equals(this.multiplier, optimizerInputsSTARRTerm.multiplier) &&
        Objects.equals(this.riskFreeRate, optimizerInputsSTARRTerm.riskFreeRate) &&
        Objects.equals(this.direction, optimizerInputsSTARRTerm.direction) &&
        Objects.equals(this.confidenceLevel, optimizerInputsSTARRTerm.confidenceLevel) &&
        Objects.equals(this.useCenteredEtl, optimizerInputsSTARRTerm.useCenteredEtl) &&
        Objects.equals(this.activeRisk, optimizerInputsSTARRTerm.activeRisk) &&
        Objects.equals(this.benchmarkIndex, optimizerInputsSTARRTerm.benchmarkIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, multiplier, riskFreeRate, direction, confidenceLevel, useCenteredEtl, activeRisk, benchmarkIndex);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OptimizerInputsSTARRTerm {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    multiplier: ").append(toIndentedString(multiplier)).append("\n");
    sb.append("    riskFreeRate: ").append(toIndentedString(riskFreeRate)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    confidenceLevel: ").append(toIndentedString(confidenceLevel)).append("\n");
    sb.append("    useCenteredEtl: ").append(toIndentedString(useCenteredEtl)).append("\n");
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

