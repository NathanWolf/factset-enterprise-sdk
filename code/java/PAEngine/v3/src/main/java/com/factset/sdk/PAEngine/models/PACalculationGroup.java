/*
 * PA Engine API
 * Allow clients to fetch Analytics through APIs.
 *
 * The version of the OpenAPI document: 3.14.0
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
 * PACalculationGroup
 */
@JsonPropertyOrder({
  PACalculationGroup.JSON_PROPERTY_ID,
  PACalculationGroup.JSON_PROPERTY_FREQUENCY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PACalculationGroup implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ID = "id";
  private JsonNullable<String> id = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_FREQUENCY = "frequency";
  private JsonNullable<String> frequency = JsonNullable.<String>undefined();

  public PACalculationGroup() { 
  }

  public PACalculationGroup id(String id) {
    this.id = JsonNullable.<String>of(id);
    return this;
  }

   /**
   * FactSet-defined or User-defined Group identifier.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "FactSet-defined or User-defined Group identifier.")
  @JsonIgnore

  public String getId() {
        return id.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getId_JsonNullable() {
    return id;
  }
  
  @JsonProperty(JSON_PROPERTY_ID)
  public void setId_JsonNullable(JsonNullable<String> id) {
    this.id = id;
  }

  public void setId(String id) {
    this.id = JsonNullable.<String>of(id);
  }


  public PACalculationGroup frequency(String frequency) {
    this.frequency = JsonNullable.<String>of(frequency);
    return this;
  }

   /**
   * Grouping frequency
   * @return frequency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Grouping frequency")
  @JsonIgnore

  public String getFrequency() {
        return frequency.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FREQUENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getFrequency_JsonNullable() {
    return frequency;
  }
  
  @JsonProperty(JSON_PROPERTY_FREQUENCY)
  public void setFrequency_JsonNullable(JsonNullable<String> frequency) {
    this.frequency = frequency;
  }

  public void setFrequency(String frequency) {
    this.frequency = JsonNullable.<String>of(frequency);
  }


  /**
   * Return true if this PACalculationGroup object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PACalculationGroup paCalculationGroup = (PACalculationGroup) o;
    return equalsNullable(this.id, paCalculationGroup.id) &&
        equalsNullable(this.frequency, paCalculationGroup.frequency);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(id), hashCodeNullable(frequency));
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
    sb.append("class PACalculationGroup {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
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

