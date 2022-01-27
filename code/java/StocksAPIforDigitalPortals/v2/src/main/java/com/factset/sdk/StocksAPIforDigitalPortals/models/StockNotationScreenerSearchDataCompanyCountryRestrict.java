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
import java.math.BigDecimal;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.StocksAPIforDigitalPortals.JSON;


/**
 * Restriction list. Only stocks issued by a company whose head office is located in a country in the provided list are returned.
 */
@ApiModel(description = "Restriction list. Only stocks issued by a company whose head office is located in a country in the provided list are returned.")
@JsonPropertyOrder({
  StockNotationScreenerSearchDataCompanyCountryRestrict.JSON_PROPERTY_IDS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class StockNotationScreenerSearchDataCompanyCountryRestrict implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_IDS = "ids";
  private java.util.List<BigDecimal> ids = null;


  public StockNotationScreenerSearchDataCompanyCountryRestrict ids(java.util.List<BigDecimal> ids) {
    this.ids = ids;
    return this;
  }

  public StockNotationScreenerSearchDataCompanyCountryRestrict addIdsItem(BigDecimal idsItem) {
    if (this.ids == null) {
      this.ids = new java.util.ArrayList<>();
    }
    this.ids.add(idsItem);
    return this;
  }

   /**
   * Set of country identifiers.
   * @return ids
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Set of country identifiers.")
  @JsonProperty(JSON_PROPERTY_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<BigDecimal> getIds() {
    return ids;
  }


  @JsonProperty(JSON_PROPERTY_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIds(java.util.List<BigDecimal> ids) {
    this.ids = ids;
  }


  /**
   * Return true if this _stock_notation_screener_search_data_company_country_restrict object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StockNotationScreenerSearchDataCompanyCountryRestrict stockNotationScreenerSearchDataCompanyCountryRestrict = (StockNotationScreenerSearchDataCompanyCountryRestrict) o;
    return Objects.equals(this.ids, stockNotationScreenerSearchDataCompanyCountryRestrict.ids);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ids);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StockNotationScreenerSearchDataCompanyCountryRestrict {\n");
    sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
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

