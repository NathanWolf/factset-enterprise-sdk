/*
 * FactSet Benchmarks API
 * FactSet Benchmarks API gives access to Index Constituents, Prices, Returns, and Ratios. For a sample list of identifiers, use the /metrics endpoint. Equity Only - Fixed Income Benchmark support coming soon. 
 *
 * The version of the OpenAPI document: 1.7.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.FactSetBenchmarks.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.FactSetBenchmarks.models.BenchmarkConstituent;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.FactSetBenchmarks.JSON;


/**
 * BenchmarkConstituentsResponse
 */
@JsonPropertyOrder({
  BenchmarkConstituentsResponse.JSON_PROPERTY_DATA
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class BenchmarkConstituentsResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_DATA = "data";
  private java.util.List<BenchmarkConstituent> data = null;

  public BenchmarkConstituentsResponse() { 
  }

  public BenchmarkConstituentsResponse data(java.util.List<BenchmarkConstituent> data) {
    this.data = data;
    return this;
  }

  public BenchmarkConstituentsResponse addDataItem(BenchmarkConstituent dataItem) {
    if (this.data == null) {
      this.data = new java.util.ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Array of metric objects representing the metrics that can be requested from the estimates APIs. 
   * @return data
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Array of metric objects representing the metrics that can be requested from the estimates APIs. ")
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<BenchmarkConstituent> getData() {
    return data;
  }


  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setData(java.util.List<BenchmarkConstituent> data) {
    this.data = data;
  }


  /**
   * Return true if this benchmarkConstituentsResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BenchmarkConstituentsResponse benchmarkConstituentsResponse = (BenchmarkConstituentsResponse) o;
    return Objects.equals(this.data, benchmarkConstituentsResponse.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BenchmarkConstituentsResponse {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

