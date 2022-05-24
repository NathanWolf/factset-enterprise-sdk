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
import java.math.BigDecimal;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.QuotesAPIforDigitalPortals.JSON;


/**
 * Pagination attributes for the offset-based pagination strategy.
 */
@ApiModel(description = "Pagination attributes for the offset-based pagination strategy.")
@JsonPropertyOrder({
  OffsetBasedPaginationOutputObject.JSON_PROPERTY_TOTAL,
  OffsetBasedPaginationOutputObject.JSON_PROPERTY_IS_ESTIMATED_TOTAL
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class OffsetBasedPaginationOutputObject implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_TOTAL = "total";
  private BigDecimal total;

  public static final String JSON_PROPERTY_IS_ESTIMATED_TOTAL = "isEstimatedTotal";
  private Boolean isEstimatedTotal;

  public OffsetBasedPaginationOutputObject() { 
  }

  @JsonCreator
  public OffsetBasedPaginationOutputObject(
    @JsonProperty(value=JSON_PROPERTY_TOTAL, required=true) BigDecimal total, 
    @JsonProperty(value=JSON_PROPERTY_IS_ESTIMATED_TOTAL, required=true) Boolean isEstimatedTotal
  ) {
    this();
    this.total = total;
    this.isEstimatedTotal = isEstimatedTotal;
  }

  public OffsetBasedPaginationOutputObject total(BigDecimal total) {
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


  public OffsetBasedPaginationOutputObject isEstimatedTotal(Boolean isEstimatedTotal) {
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


  /**
   * Return true if this OffsetBasedPaginationOutputObject object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OffsetBasedPaginationOutputObject offsetBasedPaginationOutputObject = (OffsetBasedPaginationOutputObject) o;
    return Objects.equals(this.total, offsetBasedPaginationOutputObject.total) &&
        Objects.equals(this.isEstimatedTotal, offsetBasedPaginationOutputObject.isEstimatedTotal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(total, isEstimatedTotal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OffsetBasedPaginationOutputObject {\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    isEstimatedTotal: ").append(toIndentedString(isEstimatedTotal)).append("\n");
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

