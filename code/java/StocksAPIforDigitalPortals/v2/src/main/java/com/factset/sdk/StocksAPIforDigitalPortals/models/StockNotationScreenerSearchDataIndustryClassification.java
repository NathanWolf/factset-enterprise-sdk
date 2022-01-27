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
import com.factset.sdk.StocksAPIforDigitalPortals.models.StockNotationScreenerSearchDataIndustryClassificationExclude;
import com.factset.sdk.StocksAPIforDigitalPortals.models.StockNotationScreenerSearchDataIndustryClassificationRestrict;
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
 * Industry classification. Here, an industry is a category from any level of category system FactSet Revere Business Industry Classification System (RBICS), see endpoint &#x60;/category/listBySystem&#x60; with &#x60;id&#x3D;48&#x60; for valid values.
 */
@ApiModel(description = "Industry classification. Here, an industry is a category from any level of category system FactSet Revere Business Industry Classification System (RBICS), see endpoint `/category/listBySystem` with `id=48` for valid values.")
@JsonPropertyOrder({
  StockNotationScreenerSearchDataIndustryClassification.JSON_PROPERTY_RESTRICT,
  StockNotationScreenerSearchDataIndustryClassification.JSON_PROPERTY_EXCLUDE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class StockNotationScreenerSearchDataIndustryClassification implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_RESTRICT = "restrict";
  private StockNotationScreenerSearchDataIndustryClassificationRestrict restrict;

  public static final String JSON_PROPERTY_EXCLUDE = "exclude";
  private StockNotationScreenerSearchDataIndustryClassificationExclude exclude;


  public StockNotationScreenerSearchDataIndustryClassification restrict(StockNotationScreenerSearchDataIndustryClassificationRestrict restrict) {
    this.restrict = restrict;
    return this;
  }

   /**
   * Get restrict
   * @return restrict
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RESTRICT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StockNotationScreenerSearchDataIndustryClassificationRestrict getRestrict() {
    return restrict;
  }


  @JsonProperty(JSON_PROPERTY_RESTRICT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRestrict(StockNotationScreenerSearchDataIndustryClassificationRestrict restrict) {
    this.restrict = restrict;
  }


  public StockNotationScreenerSearchDataIndustryClassification exclude(StockNotationScreenerSearchDataIndustryClassificationExclude exclude) {
    this.exclude = exclude;
    return this;
  }

   /**
   * Get exclude
   * @return exclude
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EXCLUDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StockNotationScreenerSearchDataIndustryClassificationExclude getExclude() {
    return exclude;
  }


  @JsonProperty(JSON_PROPERTY_EXCLUDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExclude(StockNotationScreenerSearchDataIndustryClassificationExclude exclude) {
    this.exclude = exclude;
  }


  /**
   * Return true if this _stock_notation_screener_search_data_industryClassification object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StockNotationScreenerSearchDataIndustryClassification stockNotationScreenerSearchDataIndustryClassification = (StockNotationScreenerSearchDataIndustryClassification) o;
    return Objects.equals(this.restrict, stockNotationScreenerSearchDataIndustryClassification.restrict) &&
        Objects.equals(this.exclude, stockNotationScreenerSearchDataIndustryClassification.exclude);
  }

  @Override
  public int hashCode() {
    return Objects.hash(restrict, exclude);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StockNotationScreenerSearchDataIndustryClassification {\n");
    sb.append("    restrict: ").append(toIndentedString(restrict)).append("\n");
    sb.append("    exclude: ").append(toIndentedString(exclude)).append("\n");
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

