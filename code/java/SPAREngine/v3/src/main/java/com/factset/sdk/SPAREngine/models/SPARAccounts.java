/*
 * SPAR Engine API
 * Allow clients to fetch Analytics through APIs.
 *
 * The version of the OpenAPI document: 3.13.4
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.SPAREngine.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.SPAREngine.models.ReturnType;
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
import com.factset.sdk.SPAREngine.JSON;


/**
 * SPARAccounts
 */
@JsonPropertyOrder({
  SPARAccounts.JSON_PROPERTY_RETURNS_TYPE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SPARAccounts implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_RETURNS_TYPE = "returnsType";
  private JsonNullable<java.util.List<ReturnType>> returnsType = JsonNullable.<java.util.List<ReturnType>>undefined();

  public SPARAccounts() { 
  }

  public SPARAccounts returnsType(java.util.List<ReturnType> returnsType) {
    this.returnsType = JsonNullable.<java.util.List<ReturnType>>of(returnsType);
    return this;
  }

  public SPARAccounts addReturnsTypeItem(ReturnType returnsTypeItem) {
    if (this.returnsType == null || !this.returnsType.isPresent()) {
      this.returnsType = JsonNullable.<java.util.List<ReturnType>>of(new java.util.ArrayList<>());
    }
    try {
      this.returnsType.get().add(returnsTypeItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * List of SPAR returnsType
   * @return returnsType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of SPAR returnsType")
  @JsonIgnore

  public java.util.List<ReturnType> getReturnsType() {
        return returnsType.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_RETURNS_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<java.util.List<ReturnType>> getReturnsType_JsonNullable() {
    return returnsType;
  }
  
  @JsonProperty(JSON_PROPERTY_RETURNS_TYPE)
  public void setReturnsType_JsonNullable(JsonNullable<java.util.List<ReturnType>> returnsType) {
    this.returnsType = returnsType;
  }

  public void setReturnsType(java.util.List<ReturnType> returnsType) {
    this.returnsType = JsonNullable.<java.util.List<ReturnType>>of(returnsType);
  }


  /**
   * Return true if this SPARAccounts object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SPARAccounts spARAccounts = (SPARAccounts) o;
    return equalsNullable(this.returnsType, spARAccounts.returnsType);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(returnsType));
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
    sb.append("class SPARAccounts {\n");
    sb.append("    returnsType: ").append(toIndentedString(returnsType)).append("\n");
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

