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
import com.factset.sdk.StocksAPIforDigitalPortals.models.StockNotationScreenerSearchDataComplianceFrance;
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
 * Compliance properties. See endpoint &#x60;/instrument/complianceProperty/list&#x60; for the full list of compliance properties associated with instruments (across all asset classes).
 */
@ApiModel(description = "Compliance properties. See endpoint `/instrument/complianceProperty/list` for the full list of compliance properties associated with instruments (across all asset classes).")
@JsonPropertyOrder({
  StockNotationScreenerSearchDataCompliance.JSON_PROPERTY_FRANCE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class StockNotationScreenerSearchDataCompliance implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_FRANCE = "france";
  private StockNotationScreenerSearchDataComplianceFrance france;


  public StockNotationScreenerSearchDataCompliance france(StockNotationScreenerSearchDataComplianceFrance france) {
    this.france = france;
    return this;
  }

   /**
   * Get france
   * @return france
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FRANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StockNotationScreenerSearchDataComplianceFrance getFrance() {
    return france;
  }


  @JsonProperty(JSON_PROPERTY_FRANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFrance(StockNotationScreenerSearchDataComplianceFrance france) {
    this.france = france;
  }


  /**
   * Return true if this _stock_notation_screener_search_data_compliance object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StockNotationScreenerSearchDataCompliance stockNotationScreenerSearchDataCompliance = (StockNotationScreenerSearchDataCompliance) o;
    return Objects.equals(this.france, stockNotationScreenerSearchDataCompliance.france);
  }

  @Override
  public int hashCode() {
    return Objects.hash(france);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StockNotationScreenerSearchDataCompliance {\n");
    sb.append("    france: ").append(toIndentedString(france)).append("\n");
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

