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
 * Restriction lists. If present, the result contains only notations belonging to stock instruments that are a member of any of the provided lists.
 */
@ApiModel(description = "Restriction lists. If present, the result contains only notations belonging to stock instruments that are a member of any of the provided lists.")
@JsonPropertyOrder({
  StockNotationScreenerSearchDataValidationInstrumentSelectionListRestrict.JSON_PROPERTY_IDS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class StockNotationScreenerSearchDataValidationInstrumentSelectionListRestrict implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_IDS = "ids";
  private java.util.Set<BigDecimal> ids = null;

  public StockNotationScreenerSearchDataValidationInstrumentSelectionListRestrict() { 
  }

  public StockNotationScreenerSearchDataValidationInstrumentSelectionListRestrict ids(java.util.Set<BigDecimal> ids) {
    this.ids = ids;
    return this;
  }

  public StockNotationScreenerSearchDataValidationInstrumentSelectionListRestrict addIdsItem(BigDecimal idsItem) {
    if (this.ids == null) {
      this.ids = new java.util.LinkedHashSet<>();
    }
    this.ids.add(idsItem);
    return this;
  }

   /**
   * Set of identifiers of restriction lists.
   * @return ids
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Set of identifiers of restriction lists.")
  @JsonProperty(JSON_PROPERTY_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.Set<BigDecimal> getIds() {
    return ids;
  }


  @JsonProperty(JSON_PROPERTY_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIds(java.util.Set<BigDecimal> ids) {
    this.ids = ids;
  }


  /**
   * Return true if this _stock_notation_screener_search_data_validation_instrumentSelectionList_restrict object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StockNotationScreenerSearchDataValidationInstrumentSelectionListRestrict stockNotationScreenerSearchDataValidationInstrumentSelectionListRestrict = (StockNotationScreenerSearchDataValidationInstrumentSelectionListRestrict) o;
    return Objects.equals(this.ids, stockNotationScreenerSearchDataValidationInstrumentSelectionListRestrict.ids);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ids);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StockNotationScreenerSearchDataValidationInstrumentSelectionListRestrict {\n");
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

