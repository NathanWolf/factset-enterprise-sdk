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
 * OptimizerInputsConstraintGroup
 */
@JsonPropertyOrder({
  OptimizerInputsConstraintGroup.JSON_PROPERTY_MIN,
  OptimizerInputsConstraintGroup.JSON_PROPERTY_MAX,
  OptimizerInputsConstraintGroup.JSON_PROPERTY_ID,
  OptimizerInputsConstraintGroup.JSON_PROPERTY_NESTED_GROUPS,
  OptimizerInputsConstraintGroup.JSON_PROPERTY_GROUP_LOOKUP_INDEX
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class OptimizerInputsConstraintGroup implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_MIN = "min";
  private OptimizerInputsValue min;

  public static final String JSON_PROPERTY_MAX = "max";
  private OptimizerInputsValue max;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_NESTED_GROUPS = "nested_groups";
  private java.util.List<OptimizerInputsConstraintGroup> nestedGroups = null;

  public static final String JSON_PROPERTY_GROUP_LOOKUP_INDEX = "group_lookup_index";
  private Integer groupLookupIndex;

  public OptimizerInputsConstraintGroup() { 
  }

  public OptimizerInputsConstraintGroup min(OptimizerInputsValue min) {
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


  public OptimizerInputsConstraintGroup max(OptimizerInputsValue max) {
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


  public OptimizerInputsConstraintGroup id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }


  public OptimizerInputsConstraintGroup nestedGroups(java.util.List<OptimizerInputsConstraintGroup> nestedGroups) {
    this.nestedGroups = nestedGroups;
    return this;
  }

  public OptimizerInputsConstraintGroup addNestedGroupsItem(OptimizerInputsConstraintGroup nestedGroupsItem) {
    if (this.nestedGroups == null) {
      this.nestedGroups = new java.util.ArrayList<>();
    }
    this.nestedGroups.add(nestedGroupsItem);
    return this;
  }

   /**
   * Get nestedGroups
   * @return nestedGroups
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NESTED_GROUPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<OptimizerInputsConstraintGroup> getNestedGroups() {
    return nestedGroups;
  }


  @JsonProperty(JSON_PROPERTY_NESTED_GROUPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNestedGroups(java.util.List<OptimizerInputsConstraintGroup> nestedGroups) {
    this.nestedGroups = nestedGroups;
  }


  public OptimizerInputsConstraintGroup groupLookupIndex(Integer groupLookupIndex) {
    this.groupLookupIndex = groupLookupIndex;
    return this;
  }

   /**
   * Get groupLookupIndex
   * @return groupLookupIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_GROUP_LOOKUP_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getGroupLookupIndex() {
    return groupLookupIndex;
  }


  @JsonProperty(JSON_PROPERTY_GROUP_LOOKUP_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGroupLookupIndex(Integer groupLookupIndex) {
    this.groupLookupIndex = groupLookupIndex;
  }


  /**
   * Return true if this optimizer.inputs.ConstraintGroup object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OptimizerInputsConstraintGroup optimizerInputsConstraintGroup = (OptimizerInputsConstraintGroup) o;
    return Objects.equals(this.min, optimizerInputsConstraintGroup.min) &&
        Objects.equals(this.max, optimizerInputsConstraintGroup.max) &&
        Objects.equals(this.id, optimizerInputsConstraintGroup.id) &&
        Objects.equals(this.nestedGroups, optimizerInputsConstraintGroup.nestedGroups) &&
        Objects.equals(this.groupLookupIndex, optimizerInputsConstraintGroup.groupLookupIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(min, max, id, nestedGroups, groupLookupIndex);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OptimizerInputsConstraintGroup {\n");
    sb.append("    min: ").append(toIndentedString(min)).append("\n");
    sb.append("    max: ").append(toIndentedString(max)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nestedGroups: ").append(toIndentedString(nestedGroups)).append("\n");
    sb.append("    groupLookupIndex: ").append(toIndentedString(groupLookupIndex)).append("\n");
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

