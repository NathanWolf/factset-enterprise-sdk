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


package com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models.InlineResponse2005DataExerciseRight;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models.InlineResponse2005DataExerciseStyle;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.JSON;


/**
 * Values related to the exercise.
 */
@ApiModel(description = "Values related to the exercise.")
@JsonPropertyOrder({
  InlineResponse2005DataExercise.JSON_PROPERTY_RIGHT,
  InlineResponse2005DataExercise.JSON_PROPERTY_STYLE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse2005DataExercise implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_RIGHT = "right";
  private java.util.List<InlineResponse2005DataExerciseRight> right = null;

  public static final String JSON_PROPERTY_STYLE = "style";
  private java.util.List<InlineResponse2005DataExerciseStyle> style = null;

  public InlineResponse2005DataExercise() { 
  }

  public InlineResponse2005DataExercise right(java.util.List<InlineResponse2005DataExerciseRight> right) {
    this.right = right;
    return this;
  }

  public InlineResponse2005DataExercise addRightItem(InlineResponse2005DataExerciseRight rightItem) {
    if (this.right == null) {
      this.right = new java.util.ArrayList<>();
    }
    this.right.add(rightItem);
    return this;
  }

   /**
   * Exercise right.
   * @return right
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Exercise right.")
  @JsonProperty(JSON_PROPERTY_RIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<InlineResponse2005DataExerciseRight> getRight() {
    return right;
  }


  @JsonProperty(JSON_PROPERTY_RIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRight(java.util.List<InlineResponse2005DataExerciseRight> right) {
    this.right = right;
  }


  public InlineResponse2005DataExercise style(java.util.List<InlineResponse2005DataExerciseStyle> style) {
    this.style = style;
    return this;
  }

  public InlineResponse2005DataExercise addStyleItem(InlineResponse2005DataExerciseStyle styleItem) {
    if (this.style == null) {
      this.style = new java.util.ArrayList<>();
    }
    this.style.add(styleItem);
    return this;
  }

   /**
   * Exercise style.
   * @return style
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Exercise style.")
  @JsonProperty(JSON_PROPERTY_STYLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<InlineResponse2005DataExerciseStyle> getStyle() {
    return style;
  }


  @JsonProperty(JSON_PROPERTY_STYLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStyle(java.util.List<InlineResponse2005DataExerciseStyle> style) {
    this.style = style;
  }


  /**
   * Return true if this inline_response_200_5_data_exercise object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2005DataExercise inlineResponse2005DataExercise = (InlineResponse2005DataExercise) o;
    return Objects.equals(this.right, inlineResponse2005DataExercise.right) &&
        Objects.equals(this.style, inlineResponse2005DataExercise.style);
  }

  @Override
  public int hashCode() {
    return Objects.hash(right, style);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2005DataExercise {\n");
    sb.append("    right: ").append(toIndentedString(right)).append("\n");
    sb.append("    style: ").append(toIndentedString(style)).append("\n");
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

