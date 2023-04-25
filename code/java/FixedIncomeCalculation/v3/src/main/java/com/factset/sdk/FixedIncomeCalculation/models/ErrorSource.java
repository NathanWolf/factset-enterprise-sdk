/*
 * FI API
 * Allow clients to fetch Analytics through APIs.
 *
 * The version of the OpenAPI document: 3.9.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.FixedIncomeCalculation.models;

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
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.FixedIncomeCalculation.JSON;


/**
 * ErrorSource
 */
@JsonPropertyOrder({
  ErrorSource.JSON_PROPERTY_POINTER,
  ErrorSource.JSON_PROPERTY_PARAMETER
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ErrorSource implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_POINTER = "pointer";
  private JsonNullable<String> pointer = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PARAMETER = "parameter";
  private JsonNullable<String> parameter = JsonNullable.<String>undefined();

  public ErrorSource() { 
  }

  public ErrorSource pointer(String pointer) {
    this.pointer = JsonNullable.<String>of(pointer);
    return this;
  }

   /**
   * Get pointer
   * @return pointer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getPointer() {
        return pointer.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_POINTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getPointer_JsonNullable() {
    return pointer;
  }
  
  @JsonProperty(JSON_PROPERTY_POINTER)
  public void setPointer_JsonNullable(JsonNullable<String> pointer) {
    this.pointer = pointer;
  }

  public void setPointer(String pointer) {
    this.pointer = JsonNullable.<String>of(pointer);
  }


  public ErrorSource parameter(String parameter) {
    this.parameter = JsonNullable.<String>of(parameter);
    return this;
  }

   /**
   * Get parameter
   * @return parameter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getParameter() {
        return parameter.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PARAMETER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getParameter_JsonNullable() {
    return parameter;
  }
  
  @JsonProperty(JSON_PROPERTY_PARAMETER)
  public void setParameter_JsonNullable(JsonNullable<String> parameter) {
    this.parameter = parameter;
  }

  public void setParameter(String parameter) {
    this.parameter = JsonNullable.<String>of(parameter);
  }


  /**
   * Return true if this ErrorSource object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorSource errorSource = (ErrorSource) o;
    return equalsNullable(this.pointer, errorSource.pointer) &&
        equalsNullable(this.parameter, errorSource.parameter);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(pointer), hashCodeNullable(parameter));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorSource {\n");
    sb.append("    pointer: ").append(toIndentedString(pointer)).append("\n");
    sb.append("    parameter: ").append(toIndentedString(parameter)).append("\n");
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

