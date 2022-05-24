/*
 * IRN API v1
 * Allows users to extract, create, update and configure IRN data.
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
import com.factset.sdk.IRNConfiguration.models.CustomSymbolSubTypeDto;
import com.factset.sdk.IRNConfiguration.models.EntityType;
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
 * CustomSymbolTypeDetailDto
 */
@JsonPropertyOrder({
  CustomSymbolTypeDetailDto.JSON_PROPERTY_ID,
  CustomSymbolTypeDetailDto.JSON_PROPERTY_NAME,
  CustomSymbolTypeDetailDto.JSON_PROPERTY_HIDE_ADDRESS_FIELD,
  CustomSymbolTypeDetailDto.JSON_PROPERTY_HIDE_SYMBOL_SUB_TYPE,
  CustomSymbolTypeDetailDto.JSON_PROPERTY_IS_DEFAULT,
  CustomSymbolTypeDetailDto.JSON_PROPERTY_DUE_DILIGENCE_SYMBOL_ENTITY_TYPE,
  CustomSymbolTypeDetailDto.JSON_PROPERTY_SUB_TYPES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CustomSymbolTypeDetailDto implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ID = "Id";
  private java.util.UUID id;

  public static final String JSON_PROPERTY_NAME = "Name";
  private JsonNullable<String> name = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_HIDE_ADDRESS_FIELD = "HideAddressField";
  private Boolean hideAddressField;

  public static final String JSON_PROPERTY_HIDE_SYMBOL_SUB_TYPE = "HideSymbolSubType";
  private Boolean hideSymbolSubType;

  public static final String JSON_PROPERTY_IS_DEFAULT = "IsDefault";
  private Boolean isDefault;

  public static final String JSON_PROPERTY_DUE_DILIGENCE_SYMBOL_ENTITY_TYPE = "DueDiligenceSymbolEntityType";
  private EntityType dueDiligenceSymbolEntityType;

  public static final String JSON_PROPERTY_SUB_TYPES = "SubTypes";
  private JsonNullable<java.util.List<CustomSymbolSubTypeDto>> subTypes = JsonNullable.<java.util.List<CustomSymbolSubTypeDto>>undefined();

  public CustomSymbolTypeDetailDto() { 
  }

  public CustomSymbolTypeDetailDto id(java.util.UUID id) {
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


  public CustomSymbolTypeDetailDto name(String name) {
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


  public CustomSymbolTypeDetailDto hideAddressField(Boolean hideAddressField) {
    this.hideAddressField = hideAddressField;
    return this;
  }

   /**
   * Get hideAddressField
   * @return hideAddressField
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_HIDE_ADDRESS_FIELD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getHideAddressField() {
    return hideAddressField;
  }


  @JsonProperty(JSON_PROPERTY_HIDE_ADDRESS_FIELD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHideAddressField(Boolean hideAddressField) {
    this.hideAddressField = hideAddressField;
  }


  public CustomSymbolTypeDetailDto hideSymbolSubType(Boolean hideSymbolSubType) {
    this.hideSymbolSubType = hideSymbolSubType;
    return this;
  }

   /**
   * Get hideSymbolSubType
   * @return hideSymbolSubType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_HIDE_SYMBOL_SUB_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getHideSymbolSubType() {
    return hideSymbolSubType;
  }


  @JsonProperty(JSON_PROPERTY_HIDE_SYMBOL_SUB_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHideSymbolSubType(Boolean hideSymbolSubType) {
    this.hideSymbolSubType = hideSymbolSubType;
  }


  public CustomSymbolTypeDetailDto isDefault(Boolean isDefault) {
    this.isDefault = isDefault;
    return this;
  }

   /**
   * Get isDefault
   * @return isDefault
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IS_DEFAULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsDefault() {
    return isDefault;
  }


  @JsonProperty(JSON_PROPERTY_IS_DEFAULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }


  public CustomSymbolTypeDetailDto dueDiligenceSymbolEntityType(EntityType dueDiligenceSymbolEntityType) {
    this.dueDiligenceSymbolEntityType = dueDiligenceSymbolEntityType;
    return this;
  }

   /**
   * Get dueDiligenceSymbolEntityType
   * @return dueDiligenceSymbolEntityType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DUE_DILIGENCE_SYMBOL_ENTITY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EntityType getDueDiligenceSymbolEntityType() {
    return dueDiligenceSymbolEntityType;
  }


  @JsonProperty(JSON_PROPERTY_DUE_DILIGENCE_SYMBOL_ENTITY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDueDiligenceSymbolEntityType(EntityType dueDiligenceSymbolEntityType) {
    this.dueDiligenceSymbolEntityType = dueDiligenceSymbolEntityType;
  }


  public CustomSymbolTypeDetailDto subTypes(java.util.List<CustomSymbolSubTypeDto> subTypes) {
    this.subTypes = JsonNullable.<java.util.List<CustomSymbolSubTypeDto>>of(subTypes);
    return this;
  }

  public CustomSymbolTypeDetailDto addSubTypesItem(CustomSymbolSubTypeDto subTypesItem) {
    if (this.subTypes == null || !this.subTypes.isPresent()) {
      this.subTypes = JsonNullable.<java.util.List<CustomSymbolSubTypeDto>>of(new java.util.ArrayList<>());
    }
    try {
      this.subTypes.get().add(subTypesItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get subTypes
   * @return subTypes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public java.util.List<CustomSymbolSubTypeDto> getSubTypes() {
        return subTypes.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SUB_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<java.util.List<CustomSymbolSubTypeDto>> getSubTypes_JsonNullable() {
    return subTypes;
  }
  
  @JsonProperty(JSON_PROPERTY_SUB_TYPES)
  public void setSubTypes_JsonNullable(JsonNullable<java.util.List<CustomSymbolSubTypeDto>> subTypes) {
    this.subTypes = subTypes;
  }

  public void setSubTypes(java.util.List<CustomSymbolSubTypeDto> subTypes) {
    this.subTypes = JsonNullable.<java.util.List<CustomSymbolSubTypeDto>>of(subTypes);
  }


  /**
   * Return true if this CustomSymbolTypeDetailDto object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomSymbolTypeDetailDto customSymbolTypeDetailDto = (CustomSymbolTypeDetailDto) o;
    return Objects.equals(this.id, customSymbolTypeDetailDto.id) &&
        equalsNullable(this.name, customSymbolTypeDetailDto.name) &&
        Objects.equals(this.hideAddressField, customSymbolTypeDetailDto.hideAddressField) &&
        Objects.equals(this.hideSymbolSubType, customSymbolTypeDetailDto.hideSymbolSubType) &&
        Objects.equals(this.isDefault, customSymbolTypeDetailDto.isDefault) &&
        Objects.equals(this.dueDiligenceSymbolEntityType, customSymbolTypeDetailDto.dueDiligenceSymbolEntityType) &&
        equalsNullable(this.subTypes, customSymbolTypeDetailDto.subTypes);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, hashCodeNullable(name), hideAddressField, hideSymbolSubType, isDefault, dueDiligenceSymbolEntityType, hashCodeNullable(subTypes));
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
    sb.append("class CustomSymbolTypeDetailDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    hideAddressField: ").append(toIndentedString(hideAddressField)).append("\n");
    sb.append("    hideSymbolSubType: ").append(toIndentedString(hideSymbolSubType)).append("\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
    sb.append("    dueDiligenceSymbolEntityType: ").append(toIndentedString(dueDiligenceSymbolEntityType)).append("\n");
    sb.append("    subTypes: ").append(toIndentedString(subTypes)).append("\n");
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

