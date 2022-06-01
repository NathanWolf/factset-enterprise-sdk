/*
 * EMS API
 * Allow clients to trade orders.
 *
 * The version of the OpenAPI document: 1
 * Contact: analytics.api.support@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.FactSetTrading.models;

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
import com.factset.sdk.FactSetTrading.JSON;


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
  private String pointer;

  public static final String JSON_PROPERTY_PARAMETER = "parameter";
  private String parameter;

  public ErrorSource() { 
  }

  public ErrorSource pointer(String pointer) {
    this.pointer = pointer;
    return this;
  }

   /**
   * Pointer to the associated entity in the request body
   * @return pointer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Pointer to the associated entity in the request body")
  @JsonProperty(JSON_PROPERTY_POINTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPointer() {
    return pointer;
  }


  @JsonProperty(JSON_PROPERTY_POINTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPointer(String pointer) {
    this.pointer = pointer;
  }


  public ErrorSource parameter(String parameter) {
    this.parameter = parameter;
    return this;
  }

   /**
   * Indicates which path or URI query parameter caused the error
   * @return parameter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates which path or URI query parameter caused the error")
  @JsonProperty(JSON_PROPERTY_PARAMETER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getParameter() {
    return parameter;
  }


  @JsonProperty(JSON_PROPERTY_PARAMETER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setParameter(String parameter) {
    this.parameter = parameter;
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
    return Objects.equals(this.pointer, errorSource.pointer) &&
        Objects.equals(this.parameter, errorSource.parameter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pointer, parameter);
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

