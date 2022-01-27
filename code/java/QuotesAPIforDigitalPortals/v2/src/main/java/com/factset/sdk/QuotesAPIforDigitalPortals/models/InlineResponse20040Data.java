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
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20039DataType;
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
 * InlineResponse20040Data
 */
@JsonPropertyOrder({
  InlineResponse20040Data.JSON_PROPERTY_ID,
  InlineResponse20040Data.JSON_PROPERTY_NAME,
  InlineResponse20040Data.JSON_PROPERTY_TYPE,
  InlineResponse20040Data.JSON_PROPERTY_NUMBER_OF_LEVELS,
  InlineResponse20040Data.JSON_PROPERTY_FIRST_LEVEL_WITH_LEAF_CATEGORIES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse20040Data implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ID = "id";
  private BigDecimal id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_TYPE = "type";
  private InlineResponse20039DataType type;

  public static final String JSON_PROPERTY_NUMBER_OF_LEVELS = "numberOfLevels";
  private BigDecimal numberOfLevels;

  public static final String JSON_PROPERTY_FIRST_LEVEL_WITH_LEAF_CATEGORIES = "firstLevelWithLeafCategories";
  private BigDecimal firstLevelWithLeafCategories;


  public InlineResponse20040Data id(BigDecimal id) {
    this.id = id;
    return this;
  }

   /**
   * Identifier of the category system.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Identifier of the category system.")
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


  public InlineResponse20040Data name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the category system.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the category system.")
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


  public InlineResponse20040Data type(InlineResponse20039DataType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse20039DataType getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(InlineResponse20039DataType type) {
    this.type = type;
  }


  public InlineResponse20040Data numberOfLevels(BigDecimal numberOfLevels) {
    this.numberOfLevels = numberOfLevels;
    return this;
  }

   /**
   * Number of levels of the category system.
   * @return numberOfLevels
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of levels of the category system.")
  @JsonProperty(JSON_PROPERTY_NUMBER_OF_LEVELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getNumberOfLevels() {
    return numberOfLevels;
  }


  @JsonProperty(JSON_PROPERTY_NUMBER_OF_LEVELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumberOfLevels(BigDecimal numberOfLevels) {
    this.numberOfLevels = numberOfLevels;
  }


  public InlineResponse20040Data firstLevelWithLeafCategories(BigDecimal firstLevelWithLeafCategories) {
    this.firstLevelWithLeafCategories = firstLevelWithLeafCategories;
    return this;
  }

   /**
   * Number of the least detailed level of the category system that has leaf categories.
   * @return firstLevelWithLeafCategories
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of the least detailed level of the category system that has leaf categories.")
  @JsonProperty(JSON_PROPERTY_FIRST_LEVEL_WITH_LEAF_CATEGORIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getFirstLevelWithLeafCategories() {
    return firstLevelWithLeafCategories;
  }


  @JsonProperty(JSON_PROPERTY_FIRST_LEVEL_WITH_LEAF_CATEGORIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFirstLevelWithLeafCategories(BigDecimal firstLevelWithLeafCategories) {
    this.firstLevelWithLeafCategories = firstLevelWithLeafCategories;
  }


  /**
   * Return true if this inline_response_200_40_data object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20040Data inlineResponse20040Data = (InlineResponse20040Data) o;
    return Objects.equals(this.id, inlineResponse20040Data.id) &&
        Objects.equals(this.name, inlineResponse20040Data.name) &&
        Objects.equals(this.type, inlineResponse20040Data.type) &&
        Objects.equals(this.numberOfLevels, inlineResponse20040Data.numberOfLevels) &&
        Objects.equals(this.firstLevelWithLeafCategories, inlineResponse20040Data.firstLevelWithLeafCategories);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, type, numberOfLevels, firstLevelWithLeafCategories);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20040Data {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    numberOfLevels: ").append(toIndentedString(numberOfLevels)).append("\n");
    sb.append("    firstLevelWithLeafCategories: ").append(toIndentedString(firstLevelWithLeafCategories)).append("\n");
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

