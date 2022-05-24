/*
 * Company Logo API For Digital Portals
 * Consume FactSet-collected company logos through an API that seamlessly integrates with company fundamentals and estimates data (listed equities data available via the stocks API), quotes, time series, and other Functional APIs.
 *
 * The version of the OpenAPI document: 2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.CompanyLogoAPIforDigitalPortals.models;

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
import com.factset.sdk.CompanyLogoAPIforDigitalPortals.JSON;


/**
 * Pagination attributes for the cursor-based pagination strategy; a total element count is not supported.
 */
@ApiModel(description = "Pagination attributes for the cursor-based pagination strategy; a total element count is not supported.")
@JsonPropertyOrder({
  CursorBasedPaginationOutputObjectWithoutTotal.JSON_PROPERTY_NEXT,
  CursorBasedPaginationOutputObjectWithoutTotal.JSON_PROPERTY_PREVIOUS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CursorBasedPaginationOutputObjectWithoutTotal implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_NEXT = "next";
  private String next;

  public static final String JSON_PROPERTY_PREVIOUS = "previous";
  private String previous;

  public CursorBasedPaginationOutputObjectWithoutTotal() { 
  }

  @JsonCreator
  public CursorBasedPaginationOutputObjectWithoutTotal(
    @JsonProperty(value=JSON_PROPERTY_NEXT, required=true) String next, 
    @JsonProperty(value=JSON_PROPERTY_PREVIOUS, required=true) String previous
  ) {
    this();
    this.next = next;
    this.previous = previous;
  }

  public CursorBasedPaginationOutputObjectWithoutTotal next(String next) {
    this.next = next;
    return this;
  }

   /**
   * The next cursor position to use in the parameter &#x60;pagination.cursor&#x60; for an endpoint that supports cursor-based pagination, otherwise &#x60;null&#x60;.
   * @return next
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The next cursor position to use in the parameter `pagination.cursor` for an endpoint that supports cursor-based pagination, otherwise `null`.")
  @JsonProperty(JSON_PROPERTY_NEXT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getNext() {
    return next;
  }


  @JsonProperty(JSON_PROPERTY_NEXT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setNext(String next) {
    this.next = next;
  }


  public CursorBasedPaginationOutputObjectWithoutTotal previous(String previous) {
    this.previous = previous;
    return this;
  }

   /**
   * The previous cursor position to use in the parameter &#x60;pagination.cursor&#x60; for an endpoint that supports cursor-based pagination. If a previous cursor position is not supported or available, &#x60;previous&#x60; is &#x60;null&#x60;.
   * @return previous
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The previous cursor position to use in the parameter `pagination.cursor` for an endpoint that supports cursor-based pagination. If a previous cursor position is not supported or available, `previous` is `null`.")
  @JsonProperty(JSON_PROPERTY_PREVIOUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPrevious() {
    return previous;
  }


  @JsonProperty(JSON_PROPERTY_PREVIOUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPrevious(String previous) {
    this.previous = previous;
  }


  /**
   * Return true if this CursorBasedPaginationOutputObjectWithoutTotal object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CursorBasedPaginationOutputObjectWithoutTotal cursorBasedPaginationOutputObjectWithoutTotal = (CursorBasedPaginationOutputObjectWithoutTotal) o;
    return Objects.equals(this.next, cursorBasedPaginationOutputObjectWithoutTotal.next) &&
        Objects.equals(this.previous, cursorBasedPaginationOutputObjectWithoutTotal.previous);
  }

  @Override
  public int hashCode() {
    return Objects.hash(next, previous);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CursorBasedPaginationOutputObjectWithoutTotal {\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
    sb.append("    previous: ").append(toIndentedString(previous)).append("\n");
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

