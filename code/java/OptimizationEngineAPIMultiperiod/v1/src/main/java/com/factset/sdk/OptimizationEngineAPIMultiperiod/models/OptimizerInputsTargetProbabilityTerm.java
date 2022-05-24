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
 * OptimizerInputsTargetProbabilityTerm
 */
@JsonPropertyOrder({
  OptimizerInputsTargetProbabilityTerm.JSON_PROPERTY_NAME,
  OptimizerInputsTargetProbabilityTerm.JSON_PROPERTY_MULTIPLIER,
  OptimizerInputsTargetProbabilityTerm.JSON_PROPERTY_DIRECTION,
  OptimizerInputsTargetProbabilityTerm.JSON_PROPERTY_THRESHOLD_MIN,
  OptimizerInputsTargetProbabilityTerm.JSON_PROPERTY_THRESHOLD_MAX
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class OptimizerInputsTargetProbabilityTerm implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_MULTIPLIER = "multiplier";
  private OptimizerInputsValue multiplier;

  public static final String JSON_PROPERTY_DIRECTION = "direction";
  private OptimizerInputsEObjectiveTermDirectionEnum direction;

  public static final String JSON_PROPERTY_THRESHOLD_MIN = "threshold_min";
  private OptimizerInputsValue thresholdMin;

  public static final String JSON_PROPERTY_THRESHOLD_MAX = "threshold_max";
  private OptimizerInputsValue thresholdMax;

  public OptimizerInputsTargetProbabilityTerm() { 
  }

  public OptimizerInputsTargetProbabilityTerm name(String name) {
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


  public OptimizerInputsTargetProbabilityTerm multiplier(OptimizerInputsValue multiplier) {
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


  public OptimizerInputsTargetProbabilityTerm direction(OptimizerInputsEObjectiveTermDirectionEnum direction) {
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


  public OptimizerInputsTargetProbabilityTerm thresholdMin(OptimizerInputsValue thresholdMin) {
    this.thresholdMin = thresholdMin;
    return this;
  }

   /**
   * Get thresholdMin
   * @return thresholdMin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_THRESHOLD_MIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OptimizerInputsValue getThresholdMin() {
    return thresholdMin;
  }


  @JsonProperty(JSON_PROPERTY_THRESHOLD_MIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setThresholdMin(OptimizerInputsValue thresholdMin) {
    this.thresholdMin = thresholdMin;
  }


  public OptimizerInputsTargetProbabilityTerm thresholdMax(OptimizerInputsValue thresholdMax) {
    this.thresholdMax = thresholdMax;
    return this;
  }

   /**
   * Get thresholdMax
   * @return thresholdMax
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_THRESHOLD_MAX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OptimizerInputsValue getThresholdMax() {
    return thresholdMax;
  }


  @JsonProperty(JSON_PROPERTY_THRESHOLD_MAX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setThresholdMax(OptimizerInputsValue thresholdMax) {
    this.thresholdMax = thresholdMax;
  }


  /**
   * Return true if this optimizer.inputs.TargetProbabilityTerm object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OptimizerInputsTargetProbabilityTerm optimizerInputsTargetProbabilityTerm = (OptimizerInputsTargetProbabilityTerm) o;
    return Objects.equals(this.name, optimizerInputsTargetProbabilityTerm.name) &&
        Objects.equals(this.multiplier, optimizerInputsTargetProbabilityTerm.multiplier) &&
        Objects.equals(this.direction, optimizerInputsTargetProbabilityTerm.direction) &&
        Objects.equals(this.thresholdMin, optimizerInputsTargetProbabilityTerm.thresholdMin) &&
        Objects.equals(this.thresholdMax, optimizerInputsTargetProbabilityTerm.thresholdMax);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, multiplier, direction, thresholdMin, thresholdMax);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OptimizerInputsTargetProbabilityTerm {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    multiplier: ").append(toIndentedString(multiplier)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    thresholdMin: ").append(toIndentedString(thresholdMin)).append("\n");
    sb.append("    thresholdMax: ").append(toIndentedString(thresholdMax)).append("\n");
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

