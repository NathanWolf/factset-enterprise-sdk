/*
 * Quotes API For Digital Portals
 * The Quotes API combines endpoints for retrieving security end-of-day, delayed, and realtime prices with performance key figures and basic reference data on the security and market level.  The API supports over 20 different price types for each quote and comes with basic search endpoints based on security identifiers and instrument names. Market coverage is included in the *Sample Use Cases* section below.  The Digital Portal use case is focused on high-performance applications that are  * serving millions of end-users, * accessible by client browsers via the internet, * supporting subscriptions for streamed updates out-of-the-box, * typically combining a wide variety of *for Digital Portals*-APIs into a highly use-case specific solution for customers, * integrated into complex infrastructures such as existing frontend frameworks, authentication services.  All APIs labelled *for Digital Portals* have been designed for direct use by client web applications and feature extreme low latency: The average response time across all endpoints is 30 ms whereas 99% of all requests are answered in close to under 300ms.  See the [Time Series API for Digital Portals](https://developer.factset.com/api-catalog/time-series-api-digital-portals) for direct access to price histories, and the [News API for Digital Portals](https://developer.factset.com/api-catalog/news-api-digital-portals) for searching and fetching related news. 
 *
 * The version of the OpenAPI document: 3.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.RealTimeQuotes.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.RealTimeQuotes.models.InlineResponse20031DataSystem;
import com.factset.sdk.RealTimeQuotes.models.InlineResponse20033DataCategories;
import com.factset.sdk.RealTimeQuotes.models.InlineResponse20033DataParent;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.RealTimeQuotes.JSON;


/**
 * List of the categories.
 */
@ApiModel(description = "List of the categories.")
@JsonPropertyOrder({
  InlineResponse20033Data.JSON_PROPERTY_SYSTEM,
  InlineResponse20033Data.JSON_PROPERTY_PARENT,
  InlineResponse20033Data.JSON_PROPERTY_CATEGORIES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse20033Data implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_SYSTEM = "system";
  private InlineResponse20031DataSystem system;

  public static final String JSON_PROPERTY_PARENT = "parent";
  private InlineResponse20033DataParent parent;

  public static final String JSON_PROPERTY_CATEGORIES = "categories";
  private java.util.List<InlineResponse20033DataCategories> categories = null;

  public InlineResponse20033Data() { 
  }

  public InlineResponse20033Data system(InlineResponse20031DataSystem system) {
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


  public InlineResponse20033Data parent(InlineResponse20033DataParent parent) {
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

  public InlineResponse20033DataParent getParent() {
    return parent;
  }


  @JsonProperty(JSON_PROPERTY_PARENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setParent(InlineResponse20033DataParent parent) {
    this.parent = parent;
  }


  public InlineResponse20033Data categories(java.util.List<InlineResponse20033DataCategories> categories) {
    this.categories = categories;
    return this;
  }

  public InlineResponse20033Data addCategoriesItem(InlineResponse20033DataCategories categoriesItem) {
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

  public java.util.List<InlineResponse20033DataCategories> getCategories() {
    return categories;
  }


  @JsonProperty(JSON_PROPERTY_CATEGORIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCategories(java.util.List<InlineResponse20033DataCategories> categories) {
    this.categories = categories;
  }


  /**
   * Return true if this inline_response_200_33_data object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20033Data inlineResponse20033Data = (InlineResponse20033Data) o;
    return Objects.equals(this.system, inlineResponse20033Data.system) &&
        Objects.equals(this.parent, inlineResponse20033Data.parent) &&
        Objects.equals(this.categories, inlineResponse20033Data.categories);
  }

  @Override
  public int hashCode() {
    return Objects.hash(system, parent, categories);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20033Data {\n");
    sb.append("    system: ").append(toIndentedString(system)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
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

