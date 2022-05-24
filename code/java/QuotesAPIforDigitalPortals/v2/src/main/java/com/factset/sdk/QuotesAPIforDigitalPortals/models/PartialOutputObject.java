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


package com.factset.sdk.QuotesAPIforDigitalPortals.models;

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
import com.factset.sdk.QuotesAPIforDigitalPortals.JSON;


/**
 * Object denoting that the endpoint response is possibly incomplete.
 */
@ApiModel(description = "Object denoting that the endpoint response is possibly incomplete.")
@JsonPropertyOrder({
  PartialOutputObject.JSON_PROPERTY_IS_PARTIAL
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PartialOutputObject implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_IS_PARTIAL = "isPartial";
  private Boolean isPartial;

  public PartialOutputObject() { 
  }

  @JsonCreator
  public PartialOutputObject(
    @JsonProperty(value=JSON_PROPERTY_IS_PARTIAL, required=true) Boolean isPartial
  ) {
    this();
    this.isPartial = isPartial;
  }

  public PartialOutputObject isPartial(Boolean isPartial) {
    this.isPartial = isPartial;
    return this;
  }

   /**
   * Flag indicating that the response is a possibly incomplete array or an object containing a possibly incomplete array, due to hitting a processing time limit. If &#x60;true&#x60;, some matching results might be missing from the array, or elements for matching results might be incorrectly included (for example, when priority sorting would have removed the element). Depending on the use case, such a response may be unsuitable.
   * @return isPartial
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Flag indicating that the response is a possibly incomplete array or an object containing a possibly incomplete array, due to hitting a processing time limit. If `true`, some matching results might be missing from the array, or elements for matching results might be incorrectly included (for example, when priority sorting would have removed the element). Depending on the use case, such a response may be unsuitable.")
  @JsonProperty(JSON_PROPERTY_IS_PARTIAL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getIsPartial() {
    return isPartial;
  }


  @JsonProperty(JSON_PROPERTY_IS_PARTIAL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIsPartial(Boolean isPartial) {
    this.isPartial = isPartial;
  }


  /**
   * Return true if this PartialOutputObject object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PartialOutputObject partialOutputObject = (PartialOutputObject) o;
    return Objects.equals(this.isPartial, partialOutputObject.isPartial);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isPartial);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartialOutputObject {\n");
    sb.append("    isPartial: ").append(toIndentedString(isPartial)).append("\n");
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

