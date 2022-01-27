/*
 * IRN API v1
 * Allows users to create, update and configure IRN data.
 *
 * The version of the OpenAPI document: 1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.IRNConfiguration.models;

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
import com.factset.sdk.IRNConfiguration.JSON;


/**
 * SentimentSettingsDto
 */
@JsonPropertyOrder({
  SentimentSettingsDto.JSON_PROPERTY_DEFAULT_ID
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SentimentSettingsDto implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_DEFAULT_ID = "defaultId";
  private JsonNullable<java.util.UUID> defaultId = JsonNullable.<java.util.UUID>undefined();


  public SentimentSettingsDto defaultId(java.util.UUID defaultId) {
    this.defaultId = JsonNullable.<java.util.UUID>of(defaultId);
    return this;
  }

   /**
   * Get defaultId
   * @return defaultId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public java.util.UUID getDefaultId() {
        return defaultId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DEFAULT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<java.util.UUID> getDefaultId_JsonNullable() {
    return defaultId;
  }
  
  @JsonProperty(JSON_PROPERTY_DEFAULT_ID)
  public void setDefaultId_JsonNullable(JsonNullable<java.util.UUID> defaultId) {
    this.defaultId = defaultId;
  }

  public void setDefaultId(java.util.UUID defaultId) {
    this.defaultId = JsonNullable.<java.util.UUID>of(defaultId);
  }


  /**
   * Return true if this SentimentSettingsDto object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SentimentSettingsDto sentimentSettingsDto = (SentimentSettingsDto) o;
    return equalsNullable(this.defaultId, sentimentSettingsDto.defaultId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(defaultId));
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
    sb.append("class SentimentSettingsDto {\n");
    sb.append("    defaultId: ").append(toIndentedString(defaultId)).append("\n");
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

