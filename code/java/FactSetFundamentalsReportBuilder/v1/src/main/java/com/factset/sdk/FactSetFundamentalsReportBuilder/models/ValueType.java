/*
 * FactSet Fundamentals Report Builder
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.FactSetFundamentalsReportBuilder.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.FactSetFundamentalsReportBuilder.models.ValueTypeValueType;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.FactSetFundamentalsReportBuilder.JSON;


/**
 * ValueType
 */
@JsonPropertyOrder({
  ValueType.JSON_PROPERTY_VALUE_TYPE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ValueType implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_VALUE_TYPE = "valueType";
  private ValueTypeValueType valueType;


  public ValueType valueType(ValueTypeValueType valueType) {
    this.valueType = valueType;
    return this;
  }

   /**
   * Get valueType
   * @return valueType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VALUE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ValueTypeValueType getValueType() {
    return valueType;
  }


  @JsonProperty(JSON_PROPERTY_VALUE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValueType(ValueTypeValueType valueType) {
    this.valueType = valueType;
  }


  /**
   * Return true if this valueType object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValueType valueType = (ValueType) o;
    return Objects.equals(this.valueType, valueType.valueType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valueType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValueType {\n");
    sb.append("    valueType: ").append(toIndentedString(valueType)).append("\n");
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

