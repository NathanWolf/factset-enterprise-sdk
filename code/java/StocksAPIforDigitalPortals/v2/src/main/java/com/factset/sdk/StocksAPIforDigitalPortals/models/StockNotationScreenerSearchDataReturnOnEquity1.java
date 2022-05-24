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
import com.factset.sdk.StocksAPIforDigitalPortals.models.StockNotationScreenerSearchDataReturnOnAssets1Mean;
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
 * Return on equity (ROE), which is the ratio of the net income, divided by the total shareholders&#39; equity.
 */
@ApiModel(description = "Return on equity (ROE), which is the ratio of the net income, divided by the total shareholders' equity.")
@JsonPropertyOrder({
  StockNotationScreenerSearchDataReturnOnEquity1.JSON_PROPERTY_MEAN
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class StockNotationScreenerSearchDataReturnOnEquity1 implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_MEAN = "mean";
  private StockNotationScreenerSearchDataReturnOnAssets1Mean mean;

  public StockNotationScreenerSearchDataReturnOnEquity1() { 
  }

  public StockNotationScreenerSearchDataReturnOnEquity1 mean(StockNotationScreenerSearchDataReturnOnAssets1Mean mean) {
    this.mean = mean;
    return this;
  }

   /**
   * Get mean
   * @return mean
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MEAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StockNotationScreenerSearchDataReturnOnAssets1Mean getMean() {
    return mean;
  }


  @JsonProperty(JSON_PROPERTY_MEAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMean(StockNotationScreenerSearchDataReturnOnAssets1Mean mean) {
    this.mean = mean;
  }


  /**
   * Return true if this _stock_notation_screener_search_data_returnOnEquity_1 object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StockNotationScreenerSearchDataReturnOnEquity1 stockNotationScreenerSearchDataReturnOnEquity1 = (StockNotationScreenerSearchDataReturnOnEquity1) o;
    return Objects.equals(this.mean, stockNotationScreenerSearchDataReturnOnEquity1.mean);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mean);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StockNotationScreenerSearchDataReturnOnEquity1 {\n");
    sb.append("    mean: ").append(toIndentedString(mean)).append("\n");
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

