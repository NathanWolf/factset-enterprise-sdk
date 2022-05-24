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
import com.factset.sdk.FundsAPIforDigitalPortals.models.FundNotationScreenerSearchDataFund;
import com.factset.sdk.FundsAPIforDigitalPortals.models.FundNotationScreenerSearchDataShareClass;
import com.factset.sdk.FundsAPIforDigitalPortals.models.FundNotationScreenerSearchDataValidation;
import com.factset.sdk.FundsAPIforDigitalPortals.models.FundNotationScreenerValueRangesGetDataPerformance;
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
 * The data member contains the request&#39;s primary data.
 */
@ApiModel(description = "The data member contains the request's primary data.")
@JsonPropertyOrder({
  FundNotationScreenerValueRangesGetData.JSON_PROPERTY_VALIDATION,
  FundNotationScreenerValueRangesGetData.JSON_PROPERTY_FUND,
  FundNotationScreenerValueRangesGetData.JSON_PROPERTY_SHARE_CLASS,
  FundNotationScreenerValueRangesGetData.JSON_PROPERTY_PERFORMANCE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FundNotationScreenerValueRangesGetData implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_VALIDATION = "validation";
  private FundNotationScreenerSearchDataValidation validation;

  public static final String JSON_PROPERTY_FUND = "fund";
  private FundNotationScreenerSearchDataFund fund;

  public static final String JSON_PROPERTY_SHARE_CLASS = "shareClass";
  private FundNotationScreenerSearchDataShareClass shareClass;

  public static final String JSON_PROPERTY_PERFORMANCE = "performance";
  private FundNotationScreenerValueRangesGetDataPerformance performance;

  public FundNotationScreenerValueRangesGetData() { 
  }

  public FundNotationScreenerValueRangesGetData validation(FundNotationScreenerSearchDataValidation validation) {
    this.validation = validation;
    return this;
  }

   /**
   * Get validation
   * @return validation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VALIDATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FundNotationScreenerSearchDataValidation getValidation() {
    return validation;
  }


  @JsonProperty(JSON_PROPERTY_VALIDATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValidation(FundNotationScreenerSearchDataValidation validation) {
    this.validation = validation;
  }


  public FundNotationScreenerValueRangesGetData fund(FundNotationScreenerSearchDataFund fund) {
    this.fund = fund;
    return this;
  }

   /**
   * Get fund
   * @return fund
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FUND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FundNotationScreenerSearchDataFund getFund() {
    return fund;
  }


  @JsonProperty(JSON_PROPERTY_FUND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFund(FundNotationScreenerSearchDataFund fund) {
    this.fund = fund;
  }


  public FundNotationScreenerValueRangesGetData shareClass(FundNotationScreenerSearchDataShareClass shareClass) {
    this.shareClass = shareClass;
    return this;
  }

   /**
   * Get shareClass
   * @return shareClass
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SHARE_CLASS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FundNotationScreenerSearchDataShareClass getShareClass() {
    return shareClass;
  }


  @JsonProperty(JSON_PROPERTY_SHARE_CLASS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShareClass(FundNotationScreenerSearchDataShareClass shareClass) {
    this.shareClass = shareClass;
  }


  public FundNotationScreenerValueRangesGetData performance(FundNotationScreenerValueRangesGetDataPerformance performance) {
    this.performance = performance;
    return this;
  }

   /**
   * Get performance
   * @return performance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PERFORMANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FundNotationScreenerValueRangesGetDataPerformance getPerformance() {
    return performance;
  }


  @JsonProperty(JSON_PROPERTY_PERFORMANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPerformance(FundNotationScreenerValueRangesGetDataPerformance performance) {
    this.performance = performance;
  }


  /**
   * Return true if this _fund_notation_screener_valueRanges_get_data object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FundNotationScreenerValueRangesGetData fundNotationScreenerValueRangesGetData = (FundNotationScreenerValueRangesGetData) o;
    return Objects.equals(this.validation, fundNotationScreenerValueRangesGetData.validation) &&
        Objects.equals(this.fund, fundNotationScreenerValueRangesGetData.fund) &&
        Objects.equals(this.shareClass, fundNotationScreenerValueRangesGetData.shareClass) &&
        Objects.equals(this.performance, fundNotationScreenerValueRangesGetData.performance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(validation, fund, shareClass, performance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FundNotationScreenerValueRangesGetData {\n");
    sb.append("    validation: ").append(toIndentedString(validation)).append("\n");
    sb.append("    fund: ").append(toIndentedString(fund)).append("\n");
    sb.append("    shareClass: ").append(toIndentedString(shareClass)).append("\n");
    sb.append("    performance: ").append(toIndentedString(performance)).append("\n");
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

