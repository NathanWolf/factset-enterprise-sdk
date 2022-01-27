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
import com.factset.sdk.StocksAPIforDigitalPortals.models.StockNotationScreenerSearchDataEbitMarginMaximum;
import com.factset.sdk.StocksAPIforDigitalPortals.models.StockNotationScreenerSearchDataEbitMarginMinimum;
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
 * Value range for the time range one year.
 */
@ApiModel(description = "Value range for the time range one year.")
@JsonPropertyOrder({
  StockNotationScreenerSearchDataPerformanceEndOfDayYear1.JSON_PROPERTY_MINIMUM,
  StockNotationScreenerSearchDataPerformanceEndOfDayYear1.JSON_PROPERTY_MAXIMUM
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class StockNotationScreenerSearchDataPerformanceEndOfDayYear1 implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_MINIMUM = "minimum";
  private StockNotationScreenerSearchDataEbitMarginMinimum minimum;

  public static final String JSON_PROPERTY_MAXIMUM = "maximum";
  private StockNotationScreenerSearchDataEbitMarginMaximum maximum;


  public StockNotationScreenerSearchDataPerformanceEndOfDayYear1 minimum(StockNotationScreenerSearchDataEbitMarginMinimum minimum) {
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

  public StockNotationScreenerSearchDataEbitMarginMinimum getMinimum() {
    return minimum;
  }


  @JsonProperty(JSON_PROPERTY_MINIMUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMinimum(StockNotationScreenerSearchDataEbitMarginMinimum minimum) {
    this.minimum = minimum;
  }


  public StockNotationScreenerSearchDataPerformanceEndOfDayYear1 maximum(StockNotationScreenerSearchDataEbitMarginMaximum maximum) {
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

  public StockNotationScreenerSearchDataEbitMarginMaximum getMaximum() {
    return maximum;
  }


  @JsonProperty(JSON_PROPERTY_MAXIMUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaximum(StockNotationScreenerSearchDataEbitMarginMaximum maximum) {
    this.maximum = maximum;
  }


  /**
   * Return true if this _stock_notation_screener_search_data_performance_endOfDay_year1 object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StockNotationScreenerSearchDataPerformanceEndOfDayYear1 stockNotationScreenerSearchDataPerformanceEndOfDayYear1 = (StockNotationScreenerSearchDataPerformanceEndOfDayYear1) o;
    return Objects.equals(this.minimum, stockNotationScreenerSearchDataPerformanceEndOfDayYear1.minimum) &&
        Objects.equals(this.maximum, stockNotationScreenerSearchDataPerformanceEndOfDayYear1.maximum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(minimum, maximum);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StockNotationScreenerSearchDataPerformanceEndOfDayYear1 {\n");
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

