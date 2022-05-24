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
import com.factset.sdk.StocksAPIforDigitalPortals.models.StockNotationScreenerSearchDataComplianceFranceOr;
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
 * Compliance properties in accordance with the French law.
 */
@ApiModel(description = "Compliance properties in accordance with the French law.")
@JsonPropertyOrder({
  StockNotationScreenerSearchDataComplianceFrance.JSON_PROPERTY_OR
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class StockNotationScreenerSearchDataComplianceFrance implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_OR = "or";
  private java.util.Set<StockNotationScreenerSearchDataComplianceFranceOr> or = null;

  public StockNotationScreenerSearchDataComplianceFrance() { 
  }

  public StockNotationScreenerSearchDataComplianceFrance or(java.util.Set<StockNotationScreenerSearchDataComplianceFranceOr> or) {
    this.or = or;
    return this;
  }

  public StockNotationScreenerSearchDataComplianceFrance addOrItem(StockNotationScreenerSearchDataComplianceFranceOr orItem) {
    if (this.or == null) {
      this.or = new java.util.LinkedHashSet<>();
    }
    this.or.add(orItem);
    return this;
  }

   /**
   * List of conditions representing a combination of compliance properties joined by a logical OR operator.
   * @return or
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of conditions representing a combination of compliance properties joined by a logical OR operator.")
  @JsonProperty(JSON_PROPERTY_OR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.Set<StockNotationScreenerSearchDataComplianceFranceOr> getOr() {
    return or;
  }


  @JsonProperty(JSON_PROPERTY_OR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOr(java.util.Set<StockNotationScreenerSearchDataComplianceFranceOr> or) {
    this.or = or;
  }


  /**
   * Return true if this _stock_notation_screener_search_data_compliance_france object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StockNotationScreenerSearchDataComplianceFrance stockNotationScreenerSearchDataComplianceFrance = (StockNotationScreenerSearchDataComplianceFrance) o;
    return Objects.equals(this.or, stockNotationScreenerSearchDataComplianceFrance.or);
  }

  @Override
  public int hashCode() {
    return Objects.hash(or);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StockNotationScreenerSearchDataComplianceFrance {\n");
    sb.append("    or: ").append(toIndentedString(or)).append("\n");
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

