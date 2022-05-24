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
import com.factset.sdk.OptimizationEngineAPIMultiperiod.models.OptimizerInputsConstraintGroup;
import com.factset.sdk.OptimizationEngineAPIMultiperiod.models.OptimizerInputsEConstraintLevelEnum;
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
 * 7
 */
@ApiModel(description = "7")
@JsonPropertyOrder({
  OptimizerInputsNumberofAssetsConstraint.JSON_PROPERTY_NAME,
  OptimizerInputsNumberofAssetsConstraint.JSON_PROPERTY_MIN,
  OptimizerInputsNumberofAssetsConstraint.JSON_PROPERTY_MAX,
  OptimizerInputsNumberofAssetsConstraint.JSON_PROPERTY_GROUPS,
  OptimizerInputsNumberofAssetsConstraint.JSON_PROPERTY_LEVEL,
  OptimizerInputsNumberofAssetsConstraint.JSON_PROPERTY_HIERARCHY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class OptimizerInputsNumberofAssetsConstraint implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_MIN = "min";
  private OptimizerInputsValue min;

  public static final String JSON_PROPERTY_MAX = "max";
  private OptimizerInputsValue max;

  public static final String JSON_PROPERTY_GROUPS = "groups";
  private java.util.List<OptimizerInputsConstraintGroup> groups = null;

  public static final String JSON_PROPERTY_LEVEL = "level";
  private OptimizerInputsEConstraintLevelEnum level;

  public static final String JSON_PROPERTY_HIERARCHY = "hierarchy";
  private Integer hierarchy;

  public OptimizerInputsNumberofAssetsConstraint() { 
  }

  public OptimizerInputsNumberofAssetsConstraint name(String name) {
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


  public OptimizerInputsNumberofAssetsConstraint min(OptimizerInputsValue min) {
    this.min = min;
    return this;
  }

   /**
   * Get min
   * @return min
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OptimizerInputsValue getMin() {
    return min;
  }


  @JsonProperty(JSON_PROPERTY_MIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMin(OptimizerInputsValue min) {
    this.min = min;
  }


  public OptimizerInputsNumberofAssetsConstraint max(OptimizerInputsValue max) {
    this.max = max;
    return this;
  }

   /**
   * Get max
   * @return max
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MAX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OptimizerInputsValue getMax() {
    return max;
  }


  @JsonProperty(JSON_PROPERTY_MAX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMax(OptimizerInputsValue max) {
    this.max = max;
  }


  public OptimizerInputsNumberofAssetsConstraint groups(java.util.List<OptimizerInputsConstraintGroup> groups) {
    this.groups = groups;
    return this;
  }

  public OptimizerInputsNumberofAssetsConstraint addGroupsItem(OptimizerInputsConstraintGroup groupsItem) {
    if (this.groups == null) {
      this.groups = new java.util.ArrayList<>();
    }
    this.groups.add(groupsItem);
    return this;
  }

   /**
   * Get groups
   * @return groups
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_GROUPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<OptimizerInputsConstraintGroup> getGroups() {
    return groups;
  }


  @JsonProperty(JSON_PROPERTY_GROUPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGroups(java.util.List<OptimizerInputsConstraintGroup> groups) {
    this.groups = groups;
  }


  public OptimizerInputsNumberofAssetsConstraint level(OptimizerInputsEConstraintLevelEnum level) {
    this.level = level;
    return this;
  }

   /**
   * Get level
   * @return level
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OptimizerInputsEConstraintLevelEnum getLevel() {
    return level;
  }


  @JsonProperty(JSON_PROPERTY_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLevel(OptimizerInputsEConstraintLevelEnum level) {
    this.level = level;
  }


  public OptimizerInputsNumberofAssetsConstraint hierarchy(Integer hierarchy) {
    this.hierarchy = hierarchy;
    return this;
  }

   /**
   * Get hierarchy
   * @return hierarchy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_HIERARCHY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getHierarchy() {
    return hierarchy;
  }


  @JsonProperty(JSON_PROPERTY_HIERARCHY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHierarchy(Integer hierarchy) {
    this.hierarchy = hierarchy;
  }


  /**
   * Return true if this optimizer.inputs.NumberofAssetsConstraint object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OptimizerInputsNumberofAssetsConstraint optimizerInputsNumberofAssetsConstraint = (OptimizerInputsNumberofAssetsConstraint) o;
    return Objects.equals(this.name, optimizerInputsNumberofAssetsConstraint.name) &&
        Objects.equals(this.min, optimizerInputsNumberofAssetsConstraint.min) &&
        Objects.equals(this.max, optimizerInputsNumberofAssetsConstraint.max) &&
        Objects.equals(this.groups, optimizerInputsNumberofAssetsConstraint.groups) &&
        Objects.equals(this.level, optimizerInputsNumberofAssetsConstraint.level) &&
        Objects.equals(this.hierarchy, optimizerInputsNumberofAssetsConstraint.hierarchy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, min, max, groups, level, hierarchy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OptimizerInputsNumberofAssetsConstraint {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    min: ").append(toIndentedString(min)).append("\n");
    sb.append("    max: ").append(toIndentedString(max)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    hierarchy: ").append(toIndentedString(hierarchy)).append("\n");
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

