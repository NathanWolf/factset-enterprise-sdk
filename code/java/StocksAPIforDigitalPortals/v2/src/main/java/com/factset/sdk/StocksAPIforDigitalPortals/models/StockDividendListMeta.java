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
 * The meta member contains the meta information of the request.
 */
@ApiModel(description = "The meta member contains the meta information of the request.")
@JsonPropertyOrder({
  StockDividendListMeta.JSON_PROPERTY_ATTRIBUTES,
  StockDividendListMeta.JSON_PROPERTY_LANGUAGE,
  StockDividendListMeta.JSON_PROPERTY_SORT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class StockDividendListMeta implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private java.util.Set<String> attributes = null;

  public static final String JSON_PROPERTY_LANGUAGE = "language";
  private String language;

  /**
   * Gets or Sets sort
   */
  public enum SortEnum {
    DATES_ANNOUNCEMENT("dates.announcement"),
    
    _DATES_ANNOUNCEMENT("-dates.announcement"),
    
    DATES_RECORD("dates.record"),
    
    _DATES_RECORD("-dates.record"),
    
    DATES_EFFECTIVE("dates.effective"),
    
    _DATES_EFFECTIVE("-dates.effective"),
    
    DATES_PAYMENT("dates.payment"),
    
    _DATES_PAYMENT("-dates.payment");

    private String value;

    SortEnum(String value) {
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
    public static SortEnum fromValue(String value) {
      for (SortEnum b : SortEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_SORT = "sort";
  private java.util.Set<SortEnum> sort = null;

  public StockDividendListMeta() { 
  }

  public StockDividendListMeta attributes(java.util.Set<String> attributes) {
    this.attributes = attributes;
    return this;
  }

  public StockDividendListMeta addAttributesItem(String attributesItem) {
    if (this.attributes == null) {
      this.attributes = new java.util.LinkedHashSet<>();
    }
    this.attributes.add(attributesItem);
    return this;
  }

   /**
   * Limit the attributes returned in the response to the specified set.
   * @return attributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Limit the attributes returned in the response to the specified set.")
  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.Set<String> getAttributes() {
    return attributes;
  }


  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAttributes(java.util.Set<String> attributes) {
    this.attributes = attributes;
  }


  public StockDividendListMeta language(String language) {
    this.language = language;
    return this;
  }

   /**
   * ISO 639-1 code of the language.
   * @return language
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ISO 639-1 code of the language.")
  @JsonProperty(JSON_PROPERTY_LANGUAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLanguage() {
    return language;
  }


  @JsonProperty(JSON_PROPERTY_LANGUAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLanguage(String language) {
    this.language = language;
  }


  public StockDividendListMeta sort(java.util.Set<SortEnum> sort) {
    this.sort = sort;
    return this;
  }

  public StockDividendListMeta addSortItem(SortEnum sortItem) {
    if (this.sort == null) {
      this.sort = new java.util.LinkedHashSet<>();
    }
    this.sort.add(sortItem);
    return this;
  }

   /**
   * Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 4 (possibly prefixed) attribute name(s) is allowed.
   * @return sort
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 4 (possibly prefixed) attribute name(s) is allowed.")
  @JsonProperty(JSON_PROPERTY_SORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.Set<SortEnum> getSort() {
    return sort;
  }


  @JsonProperty(JSON_PROPERTY_SORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSort(java.util.Set<SortEnum> sort) {
    this.sort = sort;
  }


  /**
   * Return true if this _stock_dividend_list_meta object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StockDividendListMeta stockDividendListMeta = (StockDividendListMeta) o;
    return Objects.equals(this.attributes, stockDividendListMeta.attributes) &&
        Objects.equals(this.language, stockDividendListMeta.language) &&
        Objects.equals(this.sort, stockDividendListMeta.sort);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, language, sort);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StockDividendListMeta {\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
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

