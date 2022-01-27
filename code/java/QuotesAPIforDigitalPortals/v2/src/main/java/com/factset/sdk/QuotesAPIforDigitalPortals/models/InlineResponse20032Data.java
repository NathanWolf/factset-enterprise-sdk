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
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20031DataSystem;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20032DataCategories;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.QuotesAPIforDigitalPortals.JSON;


/**
 * List of categories.
 */
@ApiModel(description = "List of categories.")
@JsonPropertyOrder({
  InlineResponse20032Data.JSON_PROPERTY_SYSTEM,
  InlineResponse20032Data.JSON_PROPERTY_CATEGORIES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse20032Data implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_SYSTEM = "system";
  private InlineResponse20031DataSystem system;

  public static final String JSON_PROPERTY_CATEGORIES = "categories";
  private java.util.List<InlineResponse20032DataCategories> categories = null;


  public InlineResponse20032Data system(InlineResponse20031DataSystem system) {
    this.system = system;
    return this;
  }

   /**
   * Get system
   * @return system
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SYSTEM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse20031DataSystem getSystem() {
    return system;
  }


  @JsonProperty(JSON_PROPERTY_SYSTEM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSystem(InlineResponse20031DataSystem system) {
    this.system = system;
  }


  public InlineResponse20032Data categories(java.util.List<InlineResponse20032DataCategories> categories) {
    this.categories = categories;
    return this;
  }

  public InlineResponse20032Data addCategoriesItem(InlineResponse20032DataCategories categoriesItem) {
    if (this.categories == null) {
      this.categories = new java.util.ArrayList<>();
    }
    this.categories.add(categoriesItem);
    return this;
  }

   /**
   * List of categories.
   * @return categories
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of categories.")
  @JsonProperty(JSON_PROPERTY_CATEGORIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<InlineResponse20032DataCategories> getCategories() {
    return categories;
  }


  @JsonProperty(JSON_PROPERTY_CATEGORIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCategories(java.util.List<InlineResponse20032DataCategories> categories) {
    this.categories = categories;
  }


  /**
   * Return true if this inline_response_200_32_data object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20032Data inlineResponse20032Data = (InlineResponse20032Data) o;
    return Objects.equals(this.system, inlineResponse20032Data.system) &&
        Objects.equals(this.categories, inlineResponse20032Data.categories);
  }

  @Override
  public int hashCode() {
    return Objects.hash(system, categories);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20032Data {\n");
    sb.append("    system: ").append(toIndentedString(system)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
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

