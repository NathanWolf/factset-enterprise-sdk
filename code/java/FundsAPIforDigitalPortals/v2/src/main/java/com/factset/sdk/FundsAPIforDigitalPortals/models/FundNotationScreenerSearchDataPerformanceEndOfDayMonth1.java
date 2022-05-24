/*
 * Funds API For Digital Portals
 * Search for mutual funds and ETFs using one single consolidated API, including a criteria-based screener. The API provides also base data, key figures, and holdings.  A separate endpoint returns the possible values and value range for the parameters that the endpoint /fund/notation/screener/search accepts: Application developers can request the values and value range only for a restricted set of notations that match predefined parameters. This functionality may be used to pre-fill the values and value ranges of the parameters of the /fund/notation/screener/search endpoint so that performing a search always leads to a non-empty set of notations.  This API is fully integrated with the corresponding Quotes API, allowing access to detailed price and performance information of instruments, as well as basic security identifier cross-reference. For direct access to price histories, please refer to the Time Series API for Digital Portals.  Similar criteria based screener APIs exist for equity instruments and securitized derivatives: See the Stocks API and the Securitized Derivatives API for details.
 *
 * The version of the OpenAPI document: 2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.FundsAPIforDigitalPortals.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.FundsAPIforDigitalPortals.models.FundNotationScreenerSearchDataShareClassFeeOngoingCurrentMaximum;
import com.factset.sdk.FundsAPIforDigitalPortals.models.FundNotationScreenerSearchDataShareClassFeeOngoingCurrentMinimum;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.FundsAPIforDigitalPortals.JSON;


/**
 * Value range for the time range one month.
 */
@ApiModel(description = "Value range for the time range one month.")
@JsonPropertyOrder({
  FundNotationScreenerSearchDataPerformanceEndOfDayMonth1.JSON_PROPERTY_MINIMUM,
  FundNotationScreenerSearchDataPerformanceEndOfDayMonth1.JSON_PROPERTY_MAXIMUM
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FundNotationScreenerSearchDataPerformanceEndOfDayMonth1 implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_MINIMUM = "minimum";
  private FundNotationScreenerSearchDataShareClassFeeOngoingCurrentMinimum minimum;

  public static final String JSON_PROPERTY_MAXIMUM = "maximum";
  private FundNotationScreenerSearchDataShareClassFeeOngoingCurrentMaximum maximum;

  public FundNotationScreenerSearchDataPerformanceEndOfDayMonth1() { 
  }

  public FundNotationScreenerSearchDataPerformanceEndOfDayMonth1 minimum(FundNotationScreenerSearchDataShareClassFeeOngoingCurrentMinimum minimum) {
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

  public FundNotationScreenerSearchDataShareClassFeeOngoingCurrentMinimum getMinimum() {
    return minimum;
  }


  @JsonProperty(JSON_PROPERTY_MINIMUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMinimum(FundNotationScreenerSearchDataShareClassFeeOngoingCurrentMinimum minimum) {
    this.minimum = minimum;
  }


  public FundNotationScreenerSearchDataPerformanceEndOfDayMonth1 maximum(FundNotationScreenerSearchDataShareClassFeeOngoingCurrentMaximum maximum) {
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

  public FundNotationScreenerSearchDataShareClassFeeOngoingCurrentMaximum getMaximum() {
    return maximum;
  }


  @JsonProperty(JSON_PROPERTY_MAXIMUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaximum(FundNotationScreenerSearchDataShareClassFeeOngoingCurrentMaximum maximum) {
    this.maximum = maximum;
  }


  /**
   * Return true if this _fund_notation_screener_search_data_performance_endOfDay_month1 object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FundNotationScreenerSearchDataPerformanceEndOfDayMonth1 fundNotationScreenerSearchDataPerformanceEndOfDayMonth1 = (FundNotationScreenerSearchDataPerformanceEndOfDayMonth1) o;
    return Objects.equals(this.minimum, fundNotationScreenerSearchDataPerformanceEndOfDayMonth1.minimum) &&
        Objects.equals(this.maximum, fundNotationScreenerSearchDataPerformanceEndOfDayMonth1.maximum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(minimum, maximum);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FundNotationScreenerSearchDataPerformanceEndOfDayMonth1 {\n");
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

