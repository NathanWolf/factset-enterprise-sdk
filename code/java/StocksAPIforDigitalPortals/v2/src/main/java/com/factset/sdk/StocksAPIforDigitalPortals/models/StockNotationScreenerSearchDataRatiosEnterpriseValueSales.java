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
import com.factset.sdk.StocksAPIforDigitalPortals.models.StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMaximum;
import com.factset.sdk.StocksAPIforDigitalPortals.models.StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMinimum;
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
 * Value range for the ratio of the enterprise value, divided by the total amount of sales revenue.
 */
@ApiModel(description = "Value range for the ratio of the enterprise value, divided by the total amount of sales revenue.")
@JsonPropertyOrder({
  StockNotationScreenerSearchDataRatiosEnterpriseValueSales.JSON_PROPERTY_MINIMUM,
  StockNotationScreenerSearchDataRatiosEnterpriseValueSales.JSON_PROPERTY_MAXIMUM
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class StockNotationScreenerSearchDataRatiosEnterpriseValueSales implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_MINIMUM = "minimum";
  private StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMinimum minimum;

  public static final String JSON_PROPERTY_MAXIMUM = "maximum";
  private StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMaximum maximum;


  public StockNotationScreenerSearchDataRatiosEnterpriseValueSales minimum(StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMinimum minimum) {
    this.minimum = minimum;
    return this;
  }

   /**
   * Get minimum
   * @return minimum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MINIMUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMinimum getMinimum() {
    return minimum;
  }


  @JsonProperty(JSON_PROPERTY_MINIMUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMinimum(StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMinimum minimum) {
    this.minimum = minimum;
  }


  public StockNotationScreenerSearchDataRatiosEnterpriseValueSales maximum(StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMaximum maximum) {
    this.maximum = maximum;
    return this;
  }

   /**
   * Get maximum
   * @return maximum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MAXIMUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMaximum getMaximum() {
    return maximum;
  }


  @JsonProperty(JSON_PROPERTY_MAXIMUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaximum(StockNotationScreenerSearchDataCurrencyDependentKeyFiguresMarketCapitalizationMaximum maximum) {
    this.maximum = maximum;
  }


  /**
   * Return true if this _stock_notation_screener_search_data_ratios_enterpriseValueSales object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StockNotationScreenerSearchDataRatiosEnterpriseValueSales stockNotationScreenerSearchDataRatiosEnterpriseValueSales = (StockNotationScreenerSearchDataRatiosEnterpriseValueSales) o;
    return Objects.equals(this.minimum, stockNotationScreenerSearchDataRatiosEnterpriseValueSales.minimum) &&
        Objects.equals(this.maximum, stockNotationScreenerSearchDataRatiosEnterpriseValueSales.maximum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(minimum, maximum);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StockNotationScreenerSearchDataRatiosEnterpriseValueSales {\n");
    sb.append("    minimum: ").append(toIndentedString(minimum)).append("\n");
    sb.append("    maximum: ").append(toIndentedString(maximum)).append("\n");
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

