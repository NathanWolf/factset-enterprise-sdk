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
 * Represents a sparse matrix in the CSR format
 */
@ApiModel(description = "Represents a sparse matrix in the CSR format")
@JsonPropertyOrder({
  OptimizerInputsSparseMatrix.JSON_PROPERTY_ROWS,
  OptimizerInputsSparseMatrix.JSON_PROPERTY_COLUMNS,
  OptimizerInputsSparseMatrix.JSON_PROPERTY_INDEX_POINTER,
  OptimizerInputsSparseMatrix.JSON_PROPERTY_INDICES,
  OptimizerInputsSparseMatrix.JSON_PROPERTY_VALUE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class OptimizerInputsSparseMatrix implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ROWS = "rows";
  private Integer rows;

  public static final String JSON_PROPERTY_COLUMNS = "columns";
  private Integer columns;

  public static final String JSON_PROPERTY_INDEX_POINTER = "indexPointer";
  private java.util.List<Integer> indexPointer = null;

  public static final String JSON_PROPERTY_INDICES = "indices";
  private java.util.List<Integer> indices = null;

  public static final String JSON_PROPERTY_VALUE = "value";
  private java.util.List<Double> value = null;

  public OptimizerInputsSparseMatrix() { 
  }

  public OptimizerInputsSparseMatrix rows(Integer rows) {
    this.rows = rows;
    return this;
  }

   /**
   * Get rows
   * @return rows
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ROWS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getRows() {
    return rows;
  }


  @JsonProperty(JSON_PROPERTY_ROWS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRows(Integer rows) {
    this.rows = rows;
  }


  public OptimizerInputsSparseMatrix columns(Integer columns) {
    this.columns = columns;
    return this;
  }

   /**
   * Get columns
   * @return columns
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_COLUMNS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getColumns() {
    return columns;
  }


  @JsonProperty(JSON_PROPERTY_COLUMNS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setColumns(Integer columns) {
    this.columns = columns;
  }


  public OptimizerInputsSparseMatrix indexPointer(java.util.List<Integer> indexPointer) {
    this.indexPointer = indexPointer;
    return this;
  }

  public OptimizerInputsSparseMatrix addIndexPointerItem(Integer indexPointerItem) {
    if (this.indexPointer == null) {
      this.indexPointer = new java.util.ArrayList<>();
    }
    this.indexPointer.add(indexPointerItem);
    return this;
  }

   /**
   * Get indexPointer
   * @return indexPointer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INDEX_POINTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<Integer> getIndexPointer() {
    return indexPointer;
  }


  @JsonProperty(JSON_PROPERTY_INDEX_POINTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIndexPointer(java.util.List<Integer> indexPointer) {
    this.indexPointer = indexPointer;
  }


  public OptimizerInputsSparseMatrix indices(java.util.List<Integer> indices) {
    this.indices = indices;
    return this;
  }

  public OptimizerInputsSparseMatrix addIndicesItem(Integer indicesItem) {
    if (this.indices == null) {
      this.indices = new java.util.ArrayList<>();
    }
    this.indices.add(indicesItem);
    return this;
  }

   /**
   * Get indices
   * @return indices
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INDICES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<Integer> getIndices() {
    return indices;
  }


  @JsonProperty(JSON_PROPERTY_INDICES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIndices(java.util.List<Integer> indices) {
    this.indices = indices;
  }


  public OptimizerInputsSparseMatrix value(java.util.List<Double> value) {
    this.value = value;
    return this;
  }

  public OptimizerInputsSparseMatrix addValueItem(Double valueItem) {
    if (this.value == null) {
      this.value = new java.util.ArrayList<>();
    }
    this.value.add(valueItem);
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<Double> getValue() {
    return value;
  }


  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValue(java.util.List<Double> value) {
    this.value = value;
  }


  /**
   * Return true if this optimizer.inputs.SparseMatrix object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OptimizerInputsSparseMatrix optimizerInputsSparseMatrix = (OptimizerInputsSparseMatrix) o;
    return Objects.equals(this.rows, optimizerInputsSparseMatrix.rows) &&
        Objects.equals(this.columns, optimizerInputsSparseMatrix.columns) &&
        Objects.equals(this.indexPointer, optimizerInputsSparseMatrix.indexPointer) &&
        Objects.equals(this.indices, optimizerInputsSparseMatrix.indices) &&
        Objects.equals(this.value, optimizerInputsSparseMatrix.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rows, columns, indexPointer, indices, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OptimizerInputsSparseMatrix {\n");
    sb.append("    rows: ").append(toIndentedString(rows)).append("\n");
    sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
    sb.append("    indexPointer: ").append(toIndentedString(indexPointer)).append("\n");
    sb.append("    indices: ").append(toIndentedString(indices)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

