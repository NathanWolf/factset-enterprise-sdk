/*
 * PA Engine API
 * Allow clients to fetch Analytics through APIs.
 *
 * The version of the OpenAPI document: 3
 * Contact: analytics.api.support@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.PAEngine.models;

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
import com.factset.sdk.PAEngine.JSON;


/**
 * UnlinkedPATemplateCategoryAndType
 */
@JsonPropertyOrder({
  UnlinkedPATemplateCategoryAndType.JSON_PROPERTY_CATEGORY,
  UnlinkedPATemplateCategoryAndType.JSON_PROPERTY_NAME
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UnlinkedPATemplateCategoryAndType implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_CATEGORY = "category";
  private String category;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;


  public UnlinkedPATemplateCategoryAndType category(String category) {
    this.category = category;
    return this;
  }

   /**
   * Unlinked template category
   * @return category
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unlinked template category")
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


  public UnlinkedPATemplateCategoryAndType name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Unlinked template type
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unlinked template type")
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


  /**
   * Return true if this UnlinkedPATemplateCategoryAndType object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UnlinkedPATemplateCategoryAndType unlinkedPATemplateCategoryAndType = (UnlinkedPATemplateCategoryAndType) o;
    return Objects.equals(this.category, unlinkedPATemplateCategoryAndType.category) &&
        Objects.equals(this.name, unlinkedPATemplateCategoryAndType.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UnlinkedPATemplateCategoryAndType {\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

