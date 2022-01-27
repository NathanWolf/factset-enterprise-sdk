/*
 * Vault API
 * Allow clients to fetch Analytics through APIs.
 *
 * The version of the OpenAPI document: v3
 * Contact: analytics.api.support@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.Vault.models;

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
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.Vault.JSON;


/**
 * ComponentSummary
 */
@JsonPropertyOrder({
  ComponentSummary.JSON_PROPERTY_NAME,
  ComponentSummary.JSON_PROPERTY_CATEGORY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ComponentSummary implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_CATEGORY = "category";
  private String category;


  public ComponentSummary name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Component name.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Component name.")
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


  public ComponentSummary category(String category) {
    this.category = category;
    return this;
  }

   /**
   * Component category.
   * @return category
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Component category.")
  @JsonProperty(JSON_PROPERTY_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCategory() {
    return category;
  }


  @JsonProperty(JSON_PROPERTY_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCategory(String category) {
    this.category = category;
  }


  /**
   * Return true if this ComponentSummary object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComponentSummary componentSummary = (ComponentSummary) o;
    return Objects.equals(this.name, componentSummary.name) &&
        Objects.equals(this.category, componentSummary.category);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, category);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComponentSummary {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
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

