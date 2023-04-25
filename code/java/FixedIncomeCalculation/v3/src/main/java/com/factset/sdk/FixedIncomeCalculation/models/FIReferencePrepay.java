/*
 * FI API
 * Allow clients to fetch Analytics through APIs.
 *
 * The version of the OpenAPI document: 3.9.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.FixedIncomeCalculation.models;

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
import com.factset.sdk.FixedIncomeCalculation.JSON;


/**
 * FIReferencePrepay
 */
@JsonPropertyOrder({
  FIReferencePrepay.JSON_PROPERTY_PREPAY_NAME
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FIReferencePrepay implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_PREPAY_NAME = "prepayName";
  private JsonNullable<String> prepayName = JsonNullable.<String>undefined();

  public FIReferencePrepay() { 
  }

  public FIReferencePrepay prepayName(String prepayName) {
    this.prepayName = JsonNullable.<String>of(prepayName);
    return this;
  }

   /**
   * Reference Prepay Name
   * @return prepayName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Reference Prepay Name")
  @JsonIgnore

  public String getPrepayName() {
        return prepayName.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PREPAY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getPrepayName_JsonNullable() {
    return prepayName;
  }
  
  @JsonProperty(JSON_PROPERTY_PREPAY_NAME)
  public void setPrepayName_JsonNullable(JsonNullable<String> prepayName) {
    this.prepayName = prepayName;
  }

  public void setPrepayName(String prepayName) {
    this.prepayName = JsonNullable.<String>of(prepayName);
  }


  /**
   * Return true if this FIReferencePrepay object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FIReferencePrepay fiReferencePrepay = (FIReferencePrepay) o;
    return equalsNullable(this.prepayName, fiReferencePrepay.prepayName);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(prepayName));
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
    sb.append("class FIReferencePrepay {\n");
    sb.append("    prepayName: ").append(toIndentedString(prepayName)).append("\n");
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

