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


package com.factset.sdk.TimeSeriesAPIforDigitalPortals.models;

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
import java.math.BigDecimal;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.TimeSeriesAPIforDigitalPortals.JSON;


/**
 * Pagination attributes for the cursor-based pagination strategy.
 */
@ApiModel(description = "Pagination attributes for the cursor-based pagination strategy.")
@JsonPropertyOrder({
  CursorBasedPaginationOutputObject.JSON_PROPERTY_TOTAL,
  CursorBasedPaginationOutputObject.JSON_PROPERTY_IS_ESTIMATED_TOTAL,
  CursorBasedPaginationOutputObject.JSON_PROPERTY_NEXT,
  CursorBasedPaginationOutputObject.JSON_PROPERTY_PREVIOUS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CursorBasedPaginationOutputObject implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_TOTAL = "total";
  private BigDecimal total;

  public static final String JSON_PROPERTY_IS_ESTIMATED_TOTAL = "isEstimatedTotal";
  private Boolean isEstimatedTotal;

  public static final String JSON_PROPERTY_NEXT = "next";
  private String next;

  public static final String JSON_PROPERTY_PREVIOUS = "previous";
  private String previous;

  public CursorBasedPaginationOutputObject() { 
  }

  @JsonCreator
  public CursorBasedPaginationOutputObject(
    @JsonProperty(value=JSON_PROPERTY_TOTAL, required=true) BigDecimal total, 
    @JsonProperty(value=JSON_PROPERTY_IS_ESTIMATED_TOTAL, required=true) Boolean isEstimatedTotal, 
    @JsonProperty(value=JSON_PROPERTY_NEXT, required=true) String next, 
    @JsonProperty(value=JSON_PROPERTY_PREVIOUS, required=true) String previous
  ) {
    this();
    this.total = total;
    this.isEstimatedTotal = isEstimatedTotal;
    this.next = next;
    this.previous = previous;
  }

  public CursorBasedPaginationOutputObject total(BigDecimal total) {
    this.total = total;
    return this;
  }

   /**
   * Total number of entries in the result set.
   * @return total
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Total number of entries in the result set.")
  @JsonProperty(JSON_PROPERTY_TOTAL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BigDecimal getTotal() {
    return total;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTotal(BigDecimal total) {
    this.total = total;
  }


  public CursorBasedPaginationOutputObject isEstimatedTotal(Boolean isEstimatedTotal) {
    this.isEstimatedTotal = isEstimatedTotal;
    return this;
  }

   /**
   * Flag indicating that the value of \&quot;total\&quot; is estimated.
   * @return isEstimatedTotal
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Flag indicating that the value of \"total\" is estimated.")
  @JsonProperty(JSON_PROPERTY_IS_ESTIMATED_TOTAL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getIsEstimatedTotal() {
    return isEstimatedTotal;
  }


  @JsonProperty(JSON_PROPERTY_IS_ESTIMATED_TOTAL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIsEstimatedTotal(Boolean isEstimatedTotal) {
    this.isEstimatedTotal = isEstimatedTotal;
  }


  public CursorBasedPaginationOutputObject next(String next) {
    this.next = next;
    return this;
  }

   /**
   * Cursor position to use in the attribute &#x60;pagination.cursor&#x60; to retrieve the next page of results, if any, otherwise null.
   * @return next
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Cursor position to use in the attribute `pagination.cursor` to retrieve the next page of results, if any, otherwise null.")
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


  public CursorBasedPaginationOutputObject previous(String previous) {
    this.previous = previous;
    return this;
  }

   /**
   * Cursor position to use in the attribute &#x60;pagination.cursor&#x60; to retrieve the previous page of results, if any, otherwise null.
   * @return previous
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Cursor position to use in the attribute `pagination.cursor` to retrieve the previous page of results, if any, otherwise null.")
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
   * Return true if this CursorBasedPaginationOutputObject object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CursorBasedPaginationOutputObject cursorBasedPaginationOutputObject = (CursorBasedPaginationOutputObject) o;
    return Objects.equals(this.total, cursorBasedPaginationOutputObject.total) &&
        Objects.equals(this.isEstimatedTotal, cursorBasedPaginationOutputObject.isEstimatedTotal) &&
        Objects.equals(this.next, cursorBasedPaginationOutputObject.next) &&
        Objects.equals(this.previous, cursorBasedPaginationOutputObject.previous);
  }

  @Override
  public int hashCode() {
    return Objects.hash(total, isEstimatedTotal, next, previous);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CursorBasedPaginationOutputObject {\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    isEstimatedTotal: ").append(toIndentedString(isEstimatedTotal)).append("\n");
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

