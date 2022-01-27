/*
 * Prime Developer Trial
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.QuotesAPIforDigitalPortals.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20031DataLevel;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20031DataParent;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.QuotesAPIforDigitalPortals.JSON;


/**
 * InlineResponse20032DataCategories
 */
@JsonPropertyOrder({
  InlineResponse20032DataCategories.JSON_PROPERTY_ID,
  InlineResponse20032DataCategories.JSON_PROPERTY_CODE,
  InlineResponse20032DataCategories.JSON_PROPERTY_NAME,
  InlineResponse20032DataCategories.JSON_PROPERTY_DESCRIPTION,
  InlineResponse20032DataCategories.JSON_PROPERTY_ACTIVE,
  InlineResponse20032DataCategories.JSON_PROPERTY_LEVEL,
  InlineResponse20032DataCategories.JSON_PROPERTY_PARENT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse20032DataCategories implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ID = "id";
  private BigDecimal id;

  public static final String JSON_PROPERTY_CODE = "code";
  private String code;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_ACTIVE = "active";
  private Boolean active;

  public static final String JSON_PROPERTY_LEVEL = "level";
  private InlineResponse20031DataLevel level;

  public static final String JSON_PROPERTY_PARENT = "parent";
  private InlineResponse20031DataParent parent;


  public InlineResponse20032DataCategories id(BigDecimal id) {
    this.id = id;
    return this;
  }

   /**
   * Identifier of the category.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Identifier of the category.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(BigDecimal id) {
    this.id = id;
  }


  public InlineResponse20032DataCategories code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Code commonly used for this category.
   * @return code
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Code commonly used for this category.")
  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCode() {
    return code;
  }


  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCode(String code) {
    this.code = code;
  }


  public InlineResponse20032DataCategories name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the category.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the category.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public InlineResponse20032DataCategories description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description of the category.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Description of the category.")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


  public InlineResponse20032DataCategories active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Indicates whether this category is active.
   * @return active
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether this category is active.")
  @JsonProperty(JSON_PROPERTY_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getActive() {
    return active;
  }


  @JsonProperty(JSON_PROPERTY_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setActive(Boolean active) {
    this.active = active;
  }


  public InlineResponse20032DataCategories level(InlineResponse20031DataLevel level) {
    this.level = level;
    return this;
  }

   /**
   * Get level
   * @return level
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse20031DataLevel getLevel() {
    return level;
  }


  @JsonProperty(JSON_PROPERTY_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLevel(InlineResponse20031DataLevel level) {
    this.level = level;
  }


  public InlineResponse20032DataCategories parent(InlineResponse20031DataParent parent) {
    this.parent = parent;
    return this;
  }

   /**
   * Get parent
   * @return parent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PARENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse20031DataParent getParent() {
    return parent;
  }


  @JsonProperty(JSON_PROPERTY_PARENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setParent(InlineResponse20031DataParent parent) {
    this.parent = parent;
  }


  /**
   * Return true if this inline_response_200_32_data_categories object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20032DataCategories inlineResponse20032DataCategories = (InlineResponse20032DataCategories) o;
    return Objects.equals(this.id, inlineResponse20032DataCategories.id) &&
        Objects.equals(this.code, inlineResponse20032DataCategories.code) &&
        Objects.equals(this.name, inlineResponse20032DataCategories.name) &&
        Objects.equals(this.description, inlineResponse20032DataCategories.description) &&
        Objects.equals(this.active, inlineResponse20032DataCategories.active) &&
        Objects.equals(this.level, inlineResponse20032DataCategories.level) &&
        Objects.equals(this.parent, inlineResponse20032DataCategories.parent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, code, name, description, active, level, parent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20032DataCategories {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
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

