/*
 * SDF_API
 * The Standard Datafeed (SDF) API provides an alternative method for users to request and retrieve SDF packages (schemas & bundles). This service is not a direct replacement and does not have 100% feature parity with the Loader. This API provides an alternative for users who are unable to utilize the Loader due to:  Unable to install 3rd party executables due to Corporate Security policies Unable to utilize the Loader due to limitations or restrictions with the environment used to consume Standard Datafeed Clients who are utilizing existing delivery method like FTP, who may want to use a more secured & modern solution This API allows users to retrieve SDF packages they have subscriptions for, going back to August 31, 2021. Additional parameters are available to filter requests to get the exact files users are looking for. 
 *
 * The version of the OpenAPI document: 1.0
 * Contact: teammustang@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.StandardDatafeed.models;

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
import com.factset.sdk.StandardDatafeed.JSON;


/**
 * List of pagination objects
 */
@ApiModel(description = "List of pagination objects")
@JsonPropertyOrder({
  Pagination.JSON_PROPERTY_TOTAL,
  Pagination.JSON_PROPERTY_IS_ESTIMATED_TOTAL,
  Pagination.JSON_PROPERTY_LIMIT,
  Pagination.JSON_PROPERTY_OFFSET
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Pagination implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_TOTAL = "total";
  private Integer total;

  public static final String JSON_PROPERTY_IS_ESTIMATED_TOTAL = "is EstimatedTotal";
  private Boolean isEstimatedTotal;

  public static final String JSON_PROPERTY_LIMIT = "limit";
  private Integer limit;

  public static final String JSON_PROPERTY_OFFSET = "offset";
  private Integer offset;

  public Pagination() { 
  }

  public Pagination total(Integer total) {
    this.total = total;
    return this;
  }

   /**
   * Total number of files the API returns for a particular query
   * @return total
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Total number of files the API returns for a particular query")
  @JsonProperty(JSON_PROPERTY_TOTAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTotal() {
    return total;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotal(Integer total) {
    this.total = total;
  }


  public Pagination isEstimatedTotal(Boolean isEstimatedTotal) {
    this.isEstimatedTotal = isEstimatedTotal;
    return this;
  }

   /**
   * Boolean value that represents whether the total count of files returned is exact or an estimate. This is defaulted to  “False” as the API should always return the exact count
   * @return isEstimatedTotal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Boolean value that represents whether the total count of files returned is exact or an estimate. This is defaulted to  “False” as the API should always return the exact count")
  @JsonProperty(JSON_PROPERTY_IS_ESTIMATED_TOTAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsEstimatedTotal() {
    return isEstimatedTotal;
  }


  @JsonProperty(JSON_PROPERTY_IS_ESTIMATED_TOTAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsEstimatedTotal(Boolean isEstimatedTotal) {
    this.isEstimatedTotal = isEstimatedTotal;
  }


  public Pagination limit(Integer limit) {
    this.limit = limit;
    return this;
  }

   /**
   * Number of results returned per page
   * @return limit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of results returned per page")
  @JsonProperty(JSON_PROPERTY_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getLimit() {
    return limit;
  }


  @JsonProperty(JSON_PROPERTY_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLimit(Integer limit) {
    this.limit = limit;
  }


  public Pagination offset(Integer offset) {
    this.offset = offset;
    return this;
  }

   /**
   * The flag indicating the position in the results array if additional results are available beyond the default value or the value in paginationLimit parameter (if used). This value is passed in the _paginationOffset parameter to retreieve subsequent results
   * @return offset
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The flag indicating the position in the results array if additional results are available beyond the default value or the value in paginationLimit parameter (if used). This value is passed in the _paginationOffset parameter to retreieve subsequent results")
  @JsonProperty(JSON_PROPERTY_OFFSET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getOffset() {
    return offset;
  }


  @JsonProperty(JSON_PROPERTY_OFFSET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOffset(Integer offset) {
    this.offset = offset;
  }


  /**
   * Return true if this pagination object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Pagination pagination = (Pagination) o;
    return Objects.equals(this.total, pagination.total) &&
        Objects.equals(this.isEstimatedTotal, pagination.isEstimatedTotal) &&
        Objects.equals(this.limit, pagination.limit) &&
        Objects.equals(this.offset, pagination.offset);
  }

  @Override
  public int hashCode() {
    return Objects.hash(total, isEstimatedTotal, limit, offset);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Pagination {\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    isEstimatedTotal: ").append(toIndentedString(isEstimatedTotal)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
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

