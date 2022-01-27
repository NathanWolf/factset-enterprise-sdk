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


package com.factset.sdk.StocksAPIforDigitalPortals.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse2005DataCategories;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse2005DataLevel;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.StocksAPIforDigitalPortals.JSON;


/**
 * InlineResponse2005DataIndustryClassification
 */
@JsonPropertyOrder({
  InlineResponse2005DataIndustryClassification.JSON_PROPERTY_LEVEL,
  InlineResponse2005DataIndustryClassification.JSON_PROPERTY_CATEGORIES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse2005DataIndustryClassification implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_LEVEL = "level";
  private InlineResponse2005DataLevel level;

  public static final String JSON_PROPERTY_CATEGORIES = "categories";
  private java.util.List<InlineResponse2005DataCategories> categories = null;


  public InlineResponse2005DataIndustryClassification level(InlineResponse2005DataLevel level) {
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

  public InlineResponse2005DataLevel getLevel() {
    return level;
  }


  @JsonProperty(JSON_PROPERTY_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLevel(InlineResponse2005DataLevel level) {
    this.level = level;
  }


  public InlineResponse2005DataIndustryClassification categories(java.util.List<InlineResponse2005DataCategories> categories) {
    this.categories = categories;
    return this;
  }

  public InlineResponse2005DataIndustryClassification addCategoriesItem(InlineResponse2005DataCategories categoriesItem) {
    if (this.categories == null) {
      this.categories = new java.util.ArrayList<>();
    }
    this.categories.add(categoriesItem);
    return this;
  }

   /**
   * List of categories for the given level of the industry classification.
   * @return categories
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of categories for the given level of the industry classification.")
  @JsonProperty(JSON_PROPERTY_CATEGORIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<InlineResponse2005DataCategories> getCategories() {
    return categories;
  }


  @JsonProperty(JSON_PROPERTY_CATEGORIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCategories(java.util.List<InlineResponse2005DataCategories> categories) {
    this.categories = categories;
  }


  /**
   * Return true if this inline_response_200_5_data_industryClassification object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2005DataIndustryClassification inlineResponse2005DataIndustryClassification = (InlineResponse2005DataIndustryClassification) o;
    return Objects.equals(this.level, inlineResponse2005DataIndustryClassification.level) &&
        Objects.equals(this.categories, inlineResponse2005DataIndustryClassification.categories);
  }

  @Override
  public int hashCode() {
    return Objects.hash(level, categories);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2005DataIndustryClassification {\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
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

