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
 * OptimizerOutputsPeriods
 */
@JsonPropertyOrder({
  OptimizerOutputsPeriods.JSON_PROPERTY_WEIGHTS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class OptimizerOutputsPeriods implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_WEIGHTS = "weights";
  private Double weights;

  public OptimizerOutputsPeriods() { 
  }

  public OptimizerOutputsPeriods weights(Double weights) {
    this.weights = weights;
    return this;
  }

   /**
   * Get weights
   * @return weights
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_WEIGHTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getWeights() {
    return weights;
  }


  @JsonProperty(JSON_PROPERTY_WEIGHTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWeights(Double weights) {
    this.weights = weights;
  }


  /**
   * Return true if this optimizer.outputs.Periods object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OptimizerOutputsPeriods optimizerOutputsPeriods = (OptimizerOutputsPeriods) o;
    return Objects.equals(this.weights, optimizerOutputsPeriods.weights);
  }

  @Override
  public int hashCode() {
    return Objects.hash(weights);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OptimizerOutputsPeriods {\n");
    sb.append("    weights: ").append(toIndentedString(weights)).append("\n");
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

