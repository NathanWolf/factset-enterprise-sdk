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
import com.factset.sdk.FundsAPIforDigitalPortals.models.FundNotationScreenerSearchDataPerformanceEndOfDayDay1;
import com.factset.sdk.FundsAPIforDigitalPortals.models.FundNotationScreenerSearchDataPerformanceEndOfDayMonth1;
import com.factset.sdk.FundsAPIforDigitalPortals.models.FundNotationScreenerSearchDataPerformanceEndOfDayMonths3;
import com.factset.sdk.FundsAPIforDigitalPortals.models.FundNotationScreenerSearchDataPerformanceEndOfDayMonths6;
import com.factset.sdk.FundsAPIforDigitalPortals.models.FundNotationScreenerSearchDataPerformanceEndOfDayYear1;
import com.factset.sdk.FundsAPIforDigitalPortals.models.FundNotationScreenerSearchDataPerformanceEndOfDayYearToDate;
import com.factset.sdk.FundsAPIforDigitalPortals.models.FundNotationScreenerSearchDataPerformanceEndOfDayYears3;
import com.factset.sdk.FundsAPIforDigitalPortals.models.FundNotationScreenerSearchDataPerformanceEndOfDayYears5;
import com.factset.sdk.FundsAPIforDigitalPortals.models.FundNotationScreenerValueRangesGetDataPerformanceEndOfDayWeek1;
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
 * End-of-day (EOD) relative performance for different time ranges. The relative performance is the difference of a notation&#39;s most recent EOD closing price against the EOD closing price on the reference date, relative to the EOD closing price on the reference date.
 */
@ApiModel(description = "End-of-day (EOD) relative performance for different time ranges. The relative performance is the difference of a notation's most recent EOD closing price against the EOD closing price on the reference date, relative to the EOD closing price on the reference date.")
@JsonPropertyOrder({
  FundNotationScreenerValueRangesGetDataPerformanceEndOfDay.JSON_PROPERTY_DAY1,
  FundNotationScreenerValueRangesGetDataPerformanceEndOfDay.JSON_PROPERTY_WEEK1,
  FundNotationScreenerValueRangesGetDataPerformanceEndOfDay.JSON_PROPERTY_MONTH1,
  FundNotationScreenerValueRangesGetDataPerformanceEndOfDay.JSON_PROPERTY_MONTHS3,
  FundNotationScreenerValueRangesGetDataPerformanceEndOfDay.JSON_PROPERTY_MONTHS6,
  FundNotationScreenerValueRangesGetDataPerformanceEndOfDay.JSON_PROPERTY_YEAR1,
  FundNotationScreenerValueRangesGetDataPerformanceEndOfDay.JSON_PROPERTY_YEARS3,
  FundNotationScreenerValueRangesGetDataPerformanceEndOfDay.JSON_PROPERTY_YEARS5,
  FundNotationScreenerValueRangesGetDataPerformanceEndOfDay.JSON_PROPERTY_YEAR_TO_DATE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FundNotationScreenerValueRangesGetDataPerformanceEndOfDay implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_DAY1 = "day1";
  private FundNotationScreenerSearchDataPerformanceEndOfDayDay1 day1;

  public static final String JSON_PROPERTY_WEEK1 = "week1";
  private FundNotationScreenerValueRangesGetDataPerformanceEndOfDayWeek1 week1;

  public static final String JSON_PROPERTY_MONTH1 = "month1";
  private FundNotationScreenerSearchDataPerformanceEndOfDayMonth1 month1;

  public static final String JSON_PROPERTY_MONTHS3 = "months3";
  private FundNotationScreenerSearchDataPerformanceEndOfDayMonths3 months3;

  public static final String JSON_PROPERTY_MONTHS6 = "months6";
  private FundNotationScreenerSearchDataPerformanceEndOfDayMonths6 months6;

  public static final String JSON_PROPERTY_YEAR1 = "year1";
  private FundNotationScreenerSearchDataPerformanceEndOfDayYear1 year1;

  public static final String JSON_PROPERTY_YEARS3 = "years3";
  private FundNotationScreenerSearchDataPerformanceEndOfDayYears3 years3;

  public static final String JSON_PROPERTY_YEARS5 = "years5";
  private FundNotationScreenerSearchDataPerformanceEndOfDayYears5 years5;

  public static final String JSON_PROPERTY_YEAR_TO_DATE = "yearToDate";
  private FundNotationScreenerSearchDataPerformanceEndOfDayYearToDate yearToDate;

  public FundNotationScreenerValueRangesGetDataPerformanceEndOfDay() { 
  }

  public FundNotationScreenerValueRangesGetDataPerformanceEndOfDay day1(FundNotationScreenerSearchDataPerformanceEndOfDayDay1 day1) {
    this.day1 = day1;
    return this;
  }

   /**
   * Get day1
   * @return day1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DAY1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FundNotationScreenerSearchDataPerformanceEndOfDayDay1 getDay1() {
    return day1;
  }


  @JsonProperty(JSON_PROPERTY_DAY1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDay1(FundNotationScreenerSearchDataPerformanceEndOfDayDay1 day1) {
    this.day1 = day1;
  }


  public FundNotationScreenerValueRangesGetDataPerformanceEndOfDay week1(FundNotationScreenerValueRangesGetDataPerformanceEndOfDayWeek1 week1) {
    this.week1 = week1;
    return this;
  }

   /**
   * Get week1
   * @return week1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_WEEK1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FundNotationScreenerValueRangesGetDataPerformanceEndOfDayWeek1 getWeek1() {
    return week1;
  }


  @JsonProperty(JSON_PROPERTY_WEEK1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWeek1(FundNotationScreenerValueRangesGetDataPerformanceEndOfDayWeek1 week1) {
    this.week1 = week1;
  }


  public FundNotationScreenerValueRangesGetDataPerformanceEndOfDay month1(FundNotationScreenerSearchDataPerformanceEndOfDayMonth1 month1) {
    this.month1 = month1;
    return this;
  }

   /**
   * Get month1
   * @return month1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MONTH1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FundNotationScreenerSearchDataPerformanceEndOfDayMonth1 getMonth1() {
    return month1;
  }


  @JsonProperty(JSON_PROPERTY_MONTH1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMonth1(FundNotationScreenerSearchDataPerformanceEndOfDayMonth1 month1) {
    this.month1 = month1;
  }


  public FundNotationScreenerValueRangesGetDataPerformanceEndOfDay months3(FundNotationScreenerSearchDataPerformanceEndOfDayMonths3 months3) {
    this.months3 = months3;
    return this;
  }

   /**
   * Get months3
   * @return months3
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MONTHS3)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FundNotationScreenerSearchDataPerformanceEndOfDayMonths3 getMonths3() {
    return months3;
  }


  @JsonProperty(JSON_PROPERTY_MONTHS3)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMonths3(FundNotationScreenerSearchDataPerformanceEndOfDayMonths3 months3) {
    this.months3 = months3;
  }


  public FundNotationScreenerValueRangesGetDataPerformanceEndOfDay months6(FundNotationScreenerSearchDataPerformanceEndOfDayMonths6 months6) {
    this.months6 = months6;
    return this;
  }

   /**
   * Get months6
   * @return months6
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MONTHS6)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FundNotationScreenerSearchDataPerformanceEndOfDayMonths6 getMonths6() {
    return months6;
  }


  @JsonProperty(JSON_PROPERTY_MONTHS6)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMonths6(FundNotationScreenerSearchDataPerformanceEndOfDayMonths6 months6) {
    this.months6 = months6;
  }


  public FundNotationScreenerValueRangesGetDataPerformanceEndOfDay year1(FundNotationScreenerSearchDataPerformanceEndOfDayYear1 year1) {
    this.year1 = year1;
    return this;
  }

   /**
   * Get year1
   * @return year1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_YEAR1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FundNotationScreenerSearchDataPerformanceEndOfDayYear1 getYear1() {
    return year1;
  }


  @JsonProperty(JSON_PROPERTY_YEAR1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setYear1(FundNotationScreenerSearchDataPerformanceEndOfDayYear1 year1) {
    this.year1 = year1;
  }


  public FundNotationScreenerValueRangesGetDataPerformanceEndOfDay years3(FundNotationScreenerSearchDataPerformanceEndOfDayYears3 years3) {
    this.years3 = years3;
    return this;
  }

   /**
   * Get years3
   * @return years3
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_YEARS3)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FundNotationScreenerSearchDataPerformanceEndOfDayYears3 getYears3() {
    return years3;
  }


  @JsonProperty(JSON_PROPERTY_YEARS3)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setYears3(FundNotationScreenerSearchDataPerformanceEndOfDayYears3 years3) {
    this.years3 = years3;
  }


  public FundNotationScreenerValueRangesGetDataPerformanceEndOfDay years5(FundNotationScreenerSearchDataPerformanceEndOfDayYears5 years5) {
    this.years5 = years5;
    return this;
  }

   /**
   * Get years5
   * @return years5
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_YEARS5)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FundNotationScreenerSearchDataPerformanceEndOfDayYears5 getYears5() {
    return years5;
  }


  @JsonProperty(JSON_PROPERTY_YEARS5)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setYears5(FundNotationScreenerSearchDataPerformanceEndOfDayYears5 years5) {
    this.years5 = years5;
  }


  public FundNotationScreenerValueRangesGetDataPerformanceEndOfDay yearToDate(FundNotationScreenerSearchDataPerformanceEndOfDayYearToDate yearToDate) {
    this.yearToDate = yearToDate;
    return this;
  }

   /**
   * Get yearToDate
   * @return yearToDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_YEAR_TO_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FundNotationScreenerSearchDataPerformanceEndOfDayYearToDate getYearToDate() {
    return yearToDate;
  }


  @JsonProperty(JSON_PROPERTY_YEAR_TO_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setYearToDate(FundNotationScreenerSearchDataPerformanceEndOfDayYearToDate yearToDate) {
    this.yearToDate = yearToDate;
  }


  /**
   * Return true if this _fund_notation_screener_valueRanges_get_data_performance_endOfDay object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FundNotationScreenerValueRangesGetDataPerformanceEndOfDay fundNotationScreenerValueRangesGetDataPerformanceEndOfDay = (FundNotationScreenerValueRangesGetDataPerformanceEndOfDay) o;
    return Objects.equals(this.day1, fundNotationScreenerValueRangesGetDataPerformanceEndOfDay.day1) &&
        Objects.equals(this.week1, fundNotationScreenerValueRangesGetDataPerformanceEndOfDay.week1) &&
        Objects.equals(this.month1, fundNotationScreenerValueRangesGetDataPerformanceEndOfDay.month1) &&
        Objects.equals(this.months3, fundNotationScreenerValueRangesGetDataPerformanceEndOfDay.months3) &&
        Objects.equals(this.months6, fundNotationScreenerValueRangesGetDataPerformanceEndOfDay.months6) &&
        Objects.equals(this.year1, fundNotationScreenerValueRangesGetDataPerformanceEndOfDay.year1) &&
        Objects.equals(this.years3, fundNotationScreenerValueRangesGetDataPerformanceEndOfDay.years3) &&
        Objects.equals(this.years5, fundNotationScreenerValueRangesGetDataPerformanceEndOfDay.years5) &&
        Objects.equals(this.yearToDate, fundNotationScreenerValueRangesGetDataPerformanceEndOfDay.yearToDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(day1, week1, month1, months3, months6, year1, years3, years5, yearToDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FundNotationScreenerValueRangesGetDataPerformanceEndOfDay {\n");
    sb.append("    day1: ").append(toIndentedString(day1)).append("\n");
    sb.append("    week1: ").append(toIndentedString(week1)).append("\n");
    sb.append("    month1: ").append(toIndentedString(month1)).append("\n");
    sb.append("    months3: ").append(toIndentedString(months3)).append("\n");
    sb.append("    months6: ").append(toIndentedString(months6)).append("\n");
    sb.append("    year1: ").append(toIndentedString(year1)).append("\n");
    sb.append("    years3: ").append(toIndentedString(years3)).append("\n");
    sb.append("    years5: ").append(toIndentedString(years5)).append("\n");
    sb.append("    yearToDate: ").append(toIndentedString(yearToDate)).append("\n");
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

