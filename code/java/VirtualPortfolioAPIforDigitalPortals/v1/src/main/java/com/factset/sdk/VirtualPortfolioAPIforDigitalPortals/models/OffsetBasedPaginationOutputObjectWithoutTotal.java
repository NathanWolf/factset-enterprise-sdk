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


package com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.models;

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
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.JSON;


/**
 * Pagination attributes for the offset-based pagination strategy; a total element count is not supported.
 */
@ApiModel(description = "Pagination attributes for the offset-based pagination strategy; a total element count is not supported.")
@JsonPropertyOrder({
  OffsetBasedPaginationOutputObjectWithoutTotal.JSON_PROPERTY_HAS_NEXT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class OffsetBasedPaginationOutputObjectWithoutTotal implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_HAS_NEXT = "hasNext";
  private Boolean hasNext;

  public OffsetBasedPaginationOutputObjectWithoutTotal() { 
  }

  @JsonCreator
  public OffsetBasedPaginationOutputObjectWithoutTotal(
    @JsonProperty(value=JSON_PROPERTY_HAS_NEXT, required=true) Boolean hasNext
  ) {
    this();
    this.hasNext = hasNext;
  }

  public OffsetBasedPaginationOutputObjectWithoutTotal hasNext(Boolean hasNext) {
    this.hasNext = hasNext;
    return this;
  }

   /**
   * Flag indicating that a subsequent request with the same parameters, except that the parameter &#x60;pagination.offset&#x60; is incremented by &#x60;pagination.limit&#x60;, would yield additional results.
   * @return hasNext
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Flag indicating that a subsequent request with the same parameters, except that the parameter `pagination.offset` is incremented by `pagination.limit`, would yield additional results.")
  @JsonProperty(JSON_PROPERTY_HAS_NEXT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getHasNext() {
    return hasNext;
  }


  @JsonProperty(JSON_PROPERTY_HAS_NEXT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setHasNext(Boolean hasNext) {
    this.hasNext = hasNext;
  }


  /**
   * Return true if this OffsetBasedPaginationOutputObjectWithoutTotal object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OffsetBasedPaginationOutputObjectWithoutTotal offsetBasedPaginationOutputObjectWithoutTotal = (OffsetBasedPaginationOutputObjectWithoutTotal) o;
    return Objects.equals(this.hasNext, offsetBasedPaginationOutputObjectWithoutTotal.hasNext);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hasNext);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OffsetBasedPaginationOutputObjectWithoutTotal {\n");
    sb.append("    hasNext: ").append(toIndentedString(hasNext)).append("\n");
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

