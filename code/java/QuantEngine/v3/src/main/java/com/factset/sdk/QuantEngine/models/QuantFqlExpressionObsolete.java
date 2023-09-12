/*
 * Quant API
 * Allow clients to fetch Analytics through APIs.
 *
 * The version of the OpenAPI document: 3.11.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.QuantEngine.models;

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
import com.factset.sdk.QuantEngine.JSON;


/**
 * QuantFqlExpressionObsolete
 */
@JsonPropertyOrder({
  QuantFqlExpressionObsolete.JSON_PROPERTY_EXPR,
  QuantFqlExpressionObsolete.JSON_PROPERTY_NAME,
  QuantFqlExpressionObsolete.JSON_PROPERTY_DATE_OFFSET,
  QuantFqlExpressionObsolete.JSON_PROPERTY_IS_ARRAY_RETURN_TYPE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class QuantFqlExpressionObsolete implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_EXPR = "expr";
  private String expr;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_DATE_OFFSET = "dateOffset";
  private JsonNullable<String> dateOffset = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_IS_ARRAY_RETURN_TYPE = "isArrayReturnType";
  private JsonNullable<Boolean> isArrayReturnType = JsonNullable.<Boolean>undefined();

  public QuantFqlExpressionObsolete() { 
  }

  @JsonCreator
  public QuantFqlExpressionObsolete(
    @JsonProperty(value=JSON_PROPERTY_EXPR, required=true) String expr, 
    @JsonProperty(value=JSON_PROPERTY_NAME, required=true) String name
  ) {
    this();
    this.expr = expr;
    this.name = name;
  }

  public QuantFqlExpressionObsolete expr(String expr) {
    this.expr = expr;
    return this;
  }

   /**
   * Get expr
   * @return expr
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_EXPR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getExpr() {
    return expr;
  }


  @JsonProperty(JSON_PROPERTY_EXPR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setExpr(String expr) {
    this.expr = expr;
  }


  public QuantFqlExpressionObsolete name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(String name) {
    this.name = name;
  }


  public QuantFqlExpressionObsolete dateOffset(String dateOffset) {
    this.dateOffset = JsonNullable.<String>of(dateOffset);
    return this;
  }

   /**
   * Get dateOffset
   * @return dateOffset
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getDateOffset() {
        return dateOffset.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DATE_OFFSET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getDateOffset_JsonNullable() {
    return dateOffset;
  }
  
  @JsonProperty(JSON_PROPERTY_DATE_OFFSET)
  public void setDateOffset_JsonNullable(JsonNullable<String> dateOffset) {
    this.dateOffset = dateOffset;
  }

  public void setDateOffset(String dateOffset) {
    this.dateOffset = JsonNullable.<String>of(dateOffset);
  }


  public QuantFqlExpressionObsolete isArrayReturnType(Boolean isArrayReturnType) {
    this.isArrayReturnType = JsonNullable.<Boolean>of(isArrayReturnType);
    return this;
  }

   /**
   * Get isArrayReturnType
   * @return isArrayReturnType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public Boolean getIsArrayReturnType() {
        return isArrayReturnType.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_IS_ARRAY_RETURN_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Boolean> getIsArrayReturnType_JsonNullable() {
    return isArrayReturnType;
  }
  
  @JsonProperty(JSON_PROPERTY_IS_ARRAY_RETURN_TYPE)
  public void setIsArrayReturnType_JsonNullable(JsonNullable<Boolean> isArrayReturnType) {
    this.isArrayReturnType = isArrayReturnType;
  }

  public void setIsArrayReturnType(Boolean isArrayReturnType) {
    this.isArrayReturnType = JsonNullable.<Boolean>of(isArrayReturnType);
  }


  /**
   * Return true if this QuantFqlExpressionObsolete object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuantFqlExpressionObsolete quantFqlExpressionObsolete = (QuantFqlExpressionObsolete) o;
    return Objects.equals(this.expr, quantFqlExpressionObsolete.expr) &&
        Objects.equals(this.name, quantFqlExpressionObsolete.name) &&
        equalsNullable(this.dateOffset, quantFqlExpressionObsolete.dateOffset) &&
        equalsNullable(this.isArrayReturnType, quantFqlExpressionObsolete.isArrayReturnType);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(expr, name, hashCodeNullable(dateOffset), hashCodeNullable(isArrayReturnType));
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
    sb.append("class QuantFqlExpressionObsolete {\n");
    sb.append("    expr: ").append(toIndentedString(expr)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    dateOffset: ").append(toIndentedString(dateOffset)).append("\n");
    sb.append("    isArrayReturnType: ").append(toIndentedString(isArrayReturnType)).append("\n");
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

