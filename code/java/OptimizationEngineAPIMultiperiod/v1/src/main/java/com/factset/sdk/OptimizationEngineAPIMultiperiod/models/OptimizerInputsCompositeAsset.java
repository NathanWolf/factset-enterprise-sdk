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
import com.factset.sdk.OptimizationEngineAPIMultiperiod.models.OptimizerInputsCompositeConstituent;
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
 * OptimizerInputsCompositeAsset
 */
@JsonPropertyOrder({
  OptimizerInputsCompositeAsset.JSON_PROPERTY_CONSTITUENTS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class OptimizerInputsCompositeAsset implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_CONSTITUENTS = "constituents";
  private java.util.List<OptimizerInputsCompositeConstituent> constituents = null;

  public OptimizerInputsCompositeAsset() { 
  }

  public OptimizerInputsCompositeAsset constituents(java.util.List<OptimizerInputsCompositeConstituent> constituents) {
    this.constituents = constituents;
    return this;
  }

  public OptimizerInputsCompositeAsset addConstituentsItem(OptimizerInputsCompositeConstituent constituentsItem) {
    if (this.constituents == null) {
      this.constituents = new java.util.ArrayList<>();
    }
    this.constituents.add(constituentsItem);
    return this;
  }

   /**
   * Get constituents
   * @return constituents
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CONSTITUENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<OptimizerInputsCompositeConstituent> getConstituents() {
    return constituents;
  }


  @JsonProperty(JSON_PROPERTY_CONSTITUENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConstituents(java.util.List<OptimizerInputsCompositeConstituent> constituents) {
    this.constituents = constituents;
  }


  /**
   * Return true if this optimizer.inputs.CompositeAsset object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OptimizerInputsCompositeAsset optimizerInputsCompositeAsset = (OptimizerInputsCompositeAsset) o;
    return Objects.equals(this.constituents, optimizerInputsCompositeAsset.constituents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(constituents);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OptimizerInputsCompositeAsset {\n");
    sb.append("    constituents: ").append(toIndentedString(constituents)).append("\n");
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

