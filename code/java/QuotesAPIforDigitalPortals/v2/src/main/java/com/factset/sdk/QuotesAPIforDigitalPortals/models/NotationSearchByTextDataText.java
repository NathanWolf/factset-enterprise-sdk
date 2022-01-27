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
 * Text-related parameters.
 */
@ApiModel(description = "Text-related parameters.")
@JsonPropertyOrder({
  NotationSearchByTextDataText.JSON_PROPERTY_ATTRIBUTES,
  NotationSearchByTextDataText.JSON_PROPERTY_VALUE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class NotationSearchByTextDataText implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Gets or Sets attributes
   */
  public enum AttributesEnum {
    ALLENTITLED("allEntitled"),
    
    ISIN("isin"),
    
    WKN("wkn"),
    
    VALOR("valor"),
    
    SEDOL("sedol"),
    
    CUSIP("cusip"),
    
    SYMBOL("symbol"),
    
    LONGNAME("longName"),
    
    SHORTNAME("shortName");

    private String value;

    AttributesEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static AttributesEnum fromValue(String value) {
      for (AttributesEnum b : AttributesEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private java.util.Set<AttributesEnum> attributes = null;

  public static final String JSON_PROPERTY_VALUE = "value";
  private String value;


  public NotationSearchByTextDataText attributes(java.util.Set<AttributesEnum> attributes) {
    this.attributes = attributes;
    return this;
  }

  public NotationSearchByTextDataText addAttributesItem(AttributesEnum attributesItem) {
    if (this.attributes == null) {
      this.attributes = new java.util.LinkedHashSet<>();
    }
    this.attributes.add(attributesItem);
    return this;
  }

   /**
   * List of attributes to be searched in. The value &#x60;allEntitled&#x60; cannot appear with any other value.
   * @return attributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of attributes to be searched in. The value `allEntitled` cannot appear with any other value.")
  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.Set<AttributesEnum> getAttributes() {
    return attributes;
  }


  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAttributes(java.util.Set<AttributesEnum> attributes) {
    this.attributes = attributes;
  }


  public NotationSearchByTextDataText value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Full-text search string. It may be enclosed in double quotes (\&quot;). No escaping is provided, therefore it is impossible to specify a search string containing double quotes. Relevance of word starts is indicated by a phrase starting with a space character, such as \&quot; daimler\&quot;. If only two characters are submitted, the search is executed as an exact search.
   * @return value
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Full-text search string. It may be enclosed in double quotes (\"). No escaping is provided, therefore it is impossible to specify a search string containing double quotes. Relevance of word starts is indicated by a phrase starting with a space character, such as \" daimler\". If only two characters are submitted, the search is executed as an exact search.")
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getValue() {
    return value;
  }


  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setValue(String value) {
    this.value = value;
  }


  /**
   * Return true if this _notation_searchByText_data_text object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotationSearchByTextDataText notationSearchByTextDataText = (NotationSearchByTextDataText) o;
    return Objects.equals(this.attributes, notationSearchByTextDataText.attributes) &&
        Objects.equals(this.value, notationSearchByTextDataText.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotationSearchByTextDataText {\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

