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
import com.factset.sdk.OptimizationEngineAPIMultiperiod.models.GoogleProtobufListValue;
import com.factset.sdk.OptimizationEngineAPIMultiperiod.models.GoogleProtobufNullValue;
import com.factset.sdk.OptimizationEngineAPIMultiperiod.models.GoogleProtobufStruct;
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
 * GoogleProtobufValue
 */
@JsonPropertyOrder({
  GoogleProtobufValue.JSON_PROPERTY_NULL_VALUE,
  GoogleProtobufValue.JSON_PROPERTY_NUMBER_VALUE,
  GoogleProtobufValue.JSON_PROPERTY_STRING_VALUE,
  GoogleProtobufValue.JSON_PROPERTY_BOOL_VALUE,
  GoogleProtobufValue.JSON_PROPERTY_STRUCT_VALUE,
  GoogleProtobufValue.JSON_PROPERTY_LIST_VALUE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GoogleProtobufValue implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_NULL_VALUE = "nullValue";
  private GoogleProtobufNullValue nullValue;

  public static final String JSON_PROPERTY_NUMBER_VALUE = "numberValue";
  private Double numberValue;

  public static final String JSON_PROPERTY_STRING_VALUE = "stringValue";
  private String stringValue;

  public static final String JSON_PROPERTY_BOOL_VALUE = "boolValue";
  private Boolean boolValue;

  public static final String JSON_PROPERTY_STRUCT_VALUE = "structValue";
  private GoogleProtobufStruct structValue;

  public static final String JSON_PROPERTY_LIST_VALUE = "listValue";
  private GoogleProtobufListValue listValue;

  public GoogleProtobufValue() { 
  }

  public GoogleProtobufValue nullValue(GoogleProtobufNullValue nullValue) {
    this.nullValue = nullValue;
    return this;
  }

   /**
   * Get nullValue
   * @return nullValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NULL_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GoogleProtobufNullValue getNullValue() {
    return nullValue;
  }


  @JsonProperty(JSON_PROPERTY_NULL_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNullValue(GoogleProtobufNullValue nullValue) {
    this.nullValue = nullValue;
  }


  public GoogleProtobufValue numberValue(Double numberValue) {
    this.numberValue = numberValue;
    return this;
  }

   /**
   * Get numberValue
   * @return numberValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NUMBER_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getNumberValue() {
    return numberValue;
  }


  @JsonProperty(JSON_PROPERTY_NUMBER_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumberValue(Double numberValue) {
    this.numberValue = numberValue;
  }


  public GoogleProtobufValue stringValue(String stringValue) {
    this.stringValue = stringValue;
    return this;
  }

   /**
   * Get stringValue
   * @return stringValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STRING_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStringValue() {
    return stringValue;
  }


  @JsonProperty(JSON_PROPERTY_STRING_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStringValue(String stringValue) {
    this.stringValue = stringValue;
  }


  public GoogleProtobufValue boolValue(Boolean boolValue) {
    this.boolValue = boolValue;
    return this;
  }

   /**
   * Get boolValue
   * @return boolValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BOOL_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getBoolValue() {
    return boolValue;
  }


  @JsonProperty(JSON_PROPERTY_BOOL_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBoolValue(Boolean boolValue) {
    this.boolValue = boolValue;
  }


  public GoogleProtobufValue structValue(GoogleProtobufStruct structValue) {
    this.structValue = structValue;
    return this;
  }

   /**
   * Get structValue
   * @return structValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STRUCT_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GoogleProtobufStruct getStructValue() {
    return structValue;
  }


  @JsonProperty(JSON_PROPERTY_STRUCT_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStructValue(GoogleProtobufStruct structValue) {
    this.structValue = structValue;
  }


  public GoogleProtobufValue listValue(GoogleProtobufListValue listValue) {
    this.listValue = listValue;
    return this;
  }

   /**
   * Get listValue
   * @return listValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LIST_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public GoogleProtobufListValue getListValue() {
    return listValue;
  }


  @JsonProperty(JSON_PROPERTY_LIST_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setListValue(GoogleProtobufListValue listValue) {
    this.listValue = listValue;
  }


  /**
   * Return true if this google.protobuf.Value object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoogleProtobufValue googleProtobufValue = (GoogleProtobufValue) o;
    return Objects.equals(this.nullValue, googleProtobufValue.nullValue) &&
        Objects.equals(this.numberValue, googleProtobufValue.numberValue) &&
        Objects.equals(this.stringValue, googleProtobufValue.stringValue) &&
        Objects.equals(this.boolValue, googleProtobufValue.boolValue) &&
        Objects.equals(this.structValue, googleProtobufValue.structValue) &&
        Objects.equals(this.listValue, googleProtobufValue.listValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nullValue, numberValue, stringValue, boolValue, structValue, listValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoogleProtobufValue {\n");
    sb.append("    nullValue: ").append(toIndentedString(nullValue)).append("\n");
    sb.append("    numberValue: ").append(toIndentedString(numberValue)).append("\n");
    sb.append("    stringValue: ").append(toIndentedString(stringValue)).append("\n");
    sb.append("    boolValue: ").append(toIndentedString(boolValue)).append("\n");
    sb.append("    structValue: ").append(toIndentedString(structValue)).append("\n");
    sb.append("    listValue: ").append(toIndentedString(listValue)).append("\n");
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

