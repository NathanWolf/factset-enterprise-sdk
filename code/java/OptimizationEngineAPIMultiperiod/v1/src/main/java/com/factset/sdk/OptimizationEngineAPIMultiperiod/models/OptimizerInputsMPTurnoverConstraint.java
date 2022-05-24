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
import com.factset.sdk.OptimizationEngineAPIMultiperiod.models.OptimizerInputsAcrossPeriods;
import com.factset.sdk.OptimizationEngineAPIMultiperiod.models.OptimizerInputsOnPeriods;
import com.factset.sdk.OptimizationEngineAPIMultiperiod.models.OptimizerInputsTurnoverConstraint;
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
 * OptimizerInputsMPTurnoverConstraint
 */
@JsonPropertyOrder({
  OptimizerInputsMPTurnoverConstraint.JSON_PROPERTY_CONSTRAINT,
  OptimizerInputsMPTurnoverConstraint.JSON_PROPERTY_ON_PERIODS,
  OptimizerInputsMPTurnoverConstraint.JSON_PROPERTY_ACROSS_PERIODS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class OptimizerInputsMPTurnoverConstraint implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_CONSTRAINT = "constraint";
  private OptimizerInputsTurnoverConstraint constraint;

  public static final String JSON_PROPERTY_ON_PERIODS = "on_periods";
  private OptimizerInputsOnPeriods onPeriods;

  public static final String JSON_PROPERTY_ACROSS_PERIODS = "across_periods";
  private OptimizerInputsAcrossPeriods acrossPeriods;

  public OptimizerInputsMPTurnoverConstraint() { 
  }

  public OptimizerInputsMPTurnoverConstraint constraint(OptimizerInputsTurnoverConstraint constraint) {
    this.constraint = constraint;
    return this;
  }

   /**
   * Get constraint
   * @return constraint
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CONSTRAINT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OptimizerInputsTurnoverConstraint getConstraint() {
    return constraint;
  }


  @JsonProperty(JSON_PROPERTY_CONSTRAINT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConstraint(OptimizerInputsTurnoverConstraint constraint) {
    this.constraint = constraint;
  }


  public OptimizerInputsMPTurnoverConstraint onPeriods(OptimizerInputsOnPeriods onPeriods) {
    this.onPeriods = onPeriods;
    return this;
  }

   /**
   * Get onPeriods
   * @return onPeriods
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ON_PERIODS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OptimizerInputsOnPeriods getOnPeriods() {
    return onPeriods;
  }


  @JsonProperty(JSON_PROPERTY_ON_PERIODS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOnPeriods(OptimizerInputsOnPeriods onPeriods) {
    this.onPeriods = onPeriods;
  }


  public OptimizerInputsMPTurnoverConstraint acrossPeriods(OptimizerInputsAcrossPeriods acrossPeriods) {
    this.acrossPeriods = acrossPeriods;
    return this;
  }

   /**
   * Get acrossPeriods
   * @return acrossPeriods
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ACROSS_PERIODS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OptimizerInputsAcrossPeriods getAcrossPeriods() {
    return acrossPeriods;
  }


  @JsonProperty(JSON_PROPERTY_ACROSS_PERIODS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAcrossPeriods(OptimizerInputsAcrossPeriods acrossPeriods) {
    this.acrossPeriods = acrossPeriods;
  }


  /**
   * Return true if this optimizer.inputs.MPTurnoverConstraint object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OptimizerInputsMPTurnoverConstraint optimizerInputsMPTurnoverConstraint = (OptimizerInputsMPTurnoverConstraint) o;
    return Objects.equals(this.constraint, optimizerInputsMPTurnoverConstraint.constraint) &&
        Objects.equals(this.onPeriods, optimizerInputsMPTurnoverConstraint.onPeriods) &&
        Objects.equals(this.acrossPeriods, optimizerInputsMPTurnoverConstraint.acrossPeriods);
  }

  @Override
  public int hashCode() {
    return Objects.hash(constraint, onPeriods, acrossPeriods);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OptimizerInputsMPTurnoverConstraint {\n");
    sb.append("    constraint: ").append(toIndentedString(constraint)).append("\n");
    sb.append("    onPeriods: ").append(toIndentedString(onPeriods)).append("\n");
    sb.append("    acrossPeriods: ").append(toIndentedString(acrossPeriods)).append("\n");
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

