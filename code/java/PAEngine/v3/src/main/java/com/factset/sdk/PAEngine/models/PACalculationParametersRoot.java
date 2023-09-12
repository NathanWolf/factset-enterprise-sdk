/*
 * PA Engine API
 * Allow clients to fetch Analytics through APIs.
 *
 * The version of the OpenAPI document: 3.14.1
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.PAEngine.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.PAEngine.models.CalculationMeta;
import com.factset.sdk.PAEngine.models.PACalculationParameters;
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
import com.factset.sdk.PAEngine.JSON;


/**
 * PACalculationParametersRoot
 */
@JsonPropertyOrder({
  PACalculationParametersRoot.JSON_PROPERTY_DATA,
  PACalculationParametersRoot.JSON_PROPERTY_META
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PACalculationParametersRoot implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_DATA = "data";
  private JsonNullable<java.util.Map<String, PACalculationParameters>> data = JsonNullable.<java.util.Map<String, PACalculationParameters>>undefined();

  public static final String JSON_PROPERTY_META = "meta";
  private CalculationMeta meta;

  public PACalculationParametersRoot() { 
  }

  public PACalculationParametersRoot data(java.util.Map<String, PACalculationParameters> data) {
    this.data = JsonNullable.<java.util.Map<String, PACalculationParameters>>of(data);
    return this;
  }

  public PACalculationParametersRoot putDataItem(String key, PACalculationParameters dataItem) {
    if (this.data == null || !this.data.isPresent()) {
      this.data = JsonNullable.<java.util.Map<String, PACalculationParameters>>of(new java.util.HashMap<>());
    }
    try {
      this.data.get().put(key, dataItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * List of calculation parameters.
   * @return data
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of calculation parameters.")
  @JsonIgnore

  public java.util.Map<String, PACalculationParameters> getData() {
        return data.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<java.util.Map<String, PACalculationParameters>> getData_JsonNullable() {
    return data;
  }
  
  @JsonProperty(JSON_PROPERTY_DATA)
  public void setData_JsonNullable(JsonNullable<java.util.Map<String, PACalculationParameters>> data) {
    this.data = data;
  }

  public void setData(java.util.Map<String, PACalculationParameters> data) {
    this.data = JsonNullable.<java.util.Map<String, PACalculationParameters>>of(data);
  }


  public PACalculationParametersRoot meta(CalculationMeta meta) {
    this.meta = meta;
    return this;
  }

   /**
   * Get meta
   * @return meta
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_META)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CalculationMeta getMeta() {
    return meta;
  }


  @JsonProperty(JSON_PROPERTY_META)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMeta(CalculationMeta meta) {
    this.meta = meta;
  }


  /**
   * Return true if this PACalculationParametersRoot object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PACalculationParametersRoot paCalculationParametersRoot = (PACalculationParametersRoot) o;
    return equalsNullable(this.data, paCalculationParametersRoot.data) &&
        Objects.equals(this.meta, paCalculationParametersRoot.meta);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(data), meta);
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
    sb.append("class PACalculationParametersRoot {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
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

