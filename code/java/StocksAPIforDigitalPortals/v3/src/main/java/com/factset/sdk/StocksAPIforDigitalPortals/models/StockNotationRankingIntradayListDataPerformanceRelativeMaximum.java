/*
 * Stocks API For Digital Portals
 * The stocks API features a screener to search for equity instruments based on stock-specific parameters.  Parameters for up to three fiscal years might now be used in one request; data is available for the ten most recent completed fiscal years. Estimates are available for the current and two consecutive fiscal years.  A separate endpoint returns the possible values and value ranges for the parameters that the endpoint /stock/notation/screener/search accepts: Application developers can request the values and value ranges only for a restricted set of notations that match predefined parameters. This functionality may be used to pre-fill the values and value ranges of the parameters of the /stock/notation/screener/search endpoint so that performing a search always leads to a non-empty set of notations.  The endpoint /stock/notation/ranking/intraday/list ranks stocks notations using intraday figures, for example to build a gainers/losers list.   Additional endpoints include end-of-day benchmark key figures, and selected fundamentals (as of end of fiscal year and with potentially daily updates).  This API is fully integrated with the corresponding Quotes API, allowing access to detailed price and performance information of instruments, as well as basic security identifier cross-reference. For direct access to price histories, please refer to the Time Series API for Digital Portals.  Similar criteria based screener APIs exist for fixed income instruments and securitized derivatives: See the Bonds API and the Securitized Derivatives API for details.
 *
 * The version of the OpenAPI document: 2
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
 * The maximum of the range, or &#x60;null&#x60; to indicate that there is no maximum.
 */
@ApiModel(description = "The maximum of the range, or `null` to indicate that there is no maximum.")
@JsonPropertyOrder({
  StockNotationRankingIntradayListDataPerformanceRelativeMaximum.JSON_PROPERTY_VALUE,
  StockNotationRankingIntradayListDataPerformanceRelativeMaximum.JSON_PROPERTY_INCLUSIVE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class StockNotationRankingIntradayListDataPerformanceRelativeMaximum implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_VALUE = "value";
  private BigDecimal value;

  public static final String JSON_PROPERTY_INCLUSIVE = "inclusive";
  private Boolean inclusive = true;

  public StockNotationRankingIntradayListDataPerformanceRelativeMaximum() { 
  }

  @JsonCreator
  public StockNotationRankingIntradayListDataPerformanceRelativeMaximum(
    @JsonProperty(value=JSON_PROPERTY_VALUE, required=true) BigDecimal value
  ) {
    this();
    this.value = value;
  }

  public StockNotationRankingIntradayListDataPerformanceRelativeMaximum value(BigDecimal value) {
    this.value = value;
    return this;
  }

   /**
   * The maximum value.
   * @return value
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The maximum value.")
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BigDecimal getValue() {
    return value;
  }


  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setValue(BigDecimal value) {
    this.value = value;
  }


  public StockNotationRankingIntradayListDataPerformanceRelativeMaximum inclusive(Boolean inclusive) {
    this.inclusive = inclusive;
    return this;
  }

   /**
   * Indicates whether the maximum value is included in the range or not.
   * @return inclusive
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether the maximum value is included in the range or not.")
  @JsonProperty(JSON_PROPERTY_INCLUSIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getInclusive() {
    return inclusive;
  }


  @JsonProperty(JSON_PROPERTY_INCLUSIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInclusive(Boolean inclusive) {
    this.inclusive = inclusive;
  }


  /**
   * Return true if this _stock_notation_ranking_intraday_list_data_performance_relative_maximum object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StockNotationRankingIntradayListDataPerformanceRelativeMaximum stockNotationRankingIntradayListDataPerformanceRelativeMaximum = (StockNotationRankingIntradayListDataPerformanceRelativeMaximum) o;
    return Objects.equals(this.value, stockNotationRankingIntradayListDataPerformanceRelativeMaximum.value) &&
        Objects.equals(this.inclusive, stockNotationRankingIntradayListDataPerformanceRelativeMaximum.inclusive);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, inclusive);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StockNotationRankingIntradayListDataPerformanceRelativeMaximum {\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    inclusive: ").append(toIndentedString(inclusive)).append("\n");
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

