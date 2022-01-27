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
 * TeamConfigDto
 */
@JsonPropertyOrder({
  TeamConfigDto.JSON_PROPERTY_ID,
  TeamConfigDto.JSON_PROPERTY_NAME,
  TeamConfigDto.JSON_PROPERTY_CODE,
  TeamConfigDto.JSON_PROPERTY_DEFAULT_SUBJECT_ID,
  TeamConfigDto.JSON_PROPERTY_USER_IDS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TeamConfigDto implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ID = "id";
  private java.util.UUID id;

  public static final String JSON_PROPERTY_NAME = "name";
  private JsonNullable<String> name = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CODE = "code";
  private JsonNullable<String> code = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_DEFAULT_SUBJECT_ID = "defaultSubjectId";
  private JsonNullable<java.util.UUID> defaultSubjectId = JsonNullable.<java.util.UUID>undefined();

  public static final String JSON_PROPERTY_USER_IDS = "userIds";
  private JsonNullable<java.util.List<java.util.UUID>> userIds = JsonNullable.<java.util.List<java.util.UUID>>undefined();


  public TeamConfigDto id(java.util.UUID id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.UUID getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(java.util.UUID id) {
    this.id = id;
  }


  public TeamConfigDto name(String name) {
    this.name = JsonNullable.<String>of(name);
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getName() {
        return name.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getName_JsonNullable() {
    return name;
  }
  
  @JsonProperty(JSON_PROPERTY_NAME)
  public void setName_JsonNullable(JsonNullable<String> name) {
    this.name = name;
  }

  public void setName(String name) {
    this.name = JsonNullable.<String>of(name);
  }


  public TeamConfigDto code(String code) {
    this.code = JsonNullable.<String>of(code);
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getCode() {
        return code.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getCode_JsonNullable() {
    return code;
  }
  
  @JsonProperty(JSON_PROPERTY_CODE)
  public void setCode_JsonNullable(JsonNullable<String> code) {
    this.code = code;
  }

  public void setCode(String code) {
    this.code = JsonNullable.<String>of(code);
  }


  public TeamConfigDto defaultSubjectId(java.util.UUID defaultSubjectId) {
    this.defaultSubjectId = JsonNullable.<java.util.UUID>of(defaultSubjectId);
    return this;
  }

   /**
   * Get defaultSubjectId
   * @return defaultSubjectId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public java.util.UUID getDefaultSubjectId() {
        return defaultSubjectId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DEFAULT_SUBJECT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<java.util.UUID> getDefaultSubjectId_JsonNullable() {
    return defaultSubjectId;
  }
  
  @JsonProperty(JSON_PROPERTY_DEFAULT_SUBJECT_ID)
  public void setDefaultSubjectId_JsonNullable(JsonNullable<java.util.UUID> defaultSubjectId) {
    this.defaultSubjectId = defaultSubjectId;
  }

  public void setDefaultSubjectId(java.util.UUID defaultSubjectId) {
    this.defaultSubjectId = JsonNullable.<java.util.UUID>of(defaultSubjectId);
  }


  public TeamConfigDto userIds(java.util.List<java.util.UUID> userIds) {
    this.userIds = JsonNullable.<java.util.List<java.util.UUID>>of(userIds);
    return this;
  }

  public TeamConfigDto addUserIdsItem(java.util.UUID userIdsItem) {
    if (this.userIds == null || !this.userIds.isPresent()) {
      this.userIds = JsonNullable.<java.util.List<java.util.UUID>>of(new java.util.ArrayList<>());
    }
    try {
      this.userIds.get().add(userIdsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get userIds
   * @return userIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public java.util.List<java.util.UUID> getUserIds() {
        return userIds.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_USER_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<java.util.List<java.util.UUID>> getUserIds_JsonNullable() {
    return userIds;
  }
  
  @JsonProperty(JSON_PROPERTY_USER_IDS)
  public void setUserIds_JsonNullable(JsonNullable<java.util.List<java.util.UUID>> userIds) {
    this.userIds = userIds;
  }

  public void setUserIds(java.util.List<java.util.UUID> userIds) {
    this.userIds = JsonNullable.<java.util.List<java.util.UUID>>of(userIds);
  }


  /**
   * Return true if this TeamConfigDto object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TeamConfigDto teamConfigDto = (TeamConfigDto) o;
    return Objects.equals(this.id, teamConfigDto.id) &&
        equalsNullable(this.name, teamConfigDto.name) &&
        equalsNullable(this.code, teamConfigDto.code) &&
        equalsNullable(this.defaultSubjectId, teamConfigDto.defaultSubjectId) &&
        equalsNullable(this.userIds, teamConfigDto.userIds);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, hashCodeNullable(name), hashCodeNullable(code), hashCodeNullable(defaultSubjectId), hashCodeNullable(userIds));
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
    sb.append("class TeamConfigDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    defaultSubjectId: ").append(toIndentedString(defaultSubjectId)).append("\n");
    sb.append("    userIds: ").append(toIndentedString(userIds)).append("\n");
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

