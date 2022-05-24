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
 * End-of-day (EOD) relative performance for different time ranges. The relative performance is the difference of a notation&#39;s most recent EOD closing price against the EOD closing price on the reference date, relative to the EOD closing price on the reference date.
 */
@ApiModel(description = "End-of-day (EOD) relative performance for different time ranges. The relative performance is the difference of a notation's most recent EOD closing price against the EOD closing price on the reference date, relative to the EOD closing price on the reference date.")
@JsonPropertyOrder({
  InlineResponse20011PerformanceEndOfDay.JSON_PROPERTY_DAY1,
  InlineResponse20011PerformanceEndOfDay.JSON_PROPERTY_WEEK1,
  InlineResponse20011PerformanceEndOfDay.JSON_PROPERTY_MONTH1,
  InlineResponse20011PerformanceEndOfDay.JSON_PROPERTY_MONTHS3,
  InlineResponse20011PerformanceEndOfDay.JSON_PROPERTY_MONTHS6,
  InlineResponse20011PerformanceEndOfDay.JSON_PROPERTY_YEAR1,
  InlineResponse20011PerformanceEndOfDay.JSON_PROPERTY_YEARS3,
  InlineResponse20011PerformanceEndOfDay.JSON_PROPERTY_YEARS5,
  InlineResponse20011PerformanceEndOfDay.JSON_PROPERTY_YEAR_TO_DATE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse20011PerformanceEndOfDay implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_DAY1 = "day1";
  private BigDecimal day1;

  public static final String JSON_PROPERTY_WEEK1 = "week1";
  private BigDecimal week1;

  public static final String JSON_PROPERTY_MONTH1 = "month1";
  private BigDecimal month1;

  public static final String JSON_PROPERTY_MONTHS3 = "months3";
  private BigDecimal months3;

  public static final String JSON_PROPERTY_MONTHS6 = "months6";
  private BigDecimal months6;

  public static final String JSON_PROPERTY_YEAR1 = "year1";
  private BigDecimal year1;

  public static final String JSON_PROPERTY_YEARS3 = "years3";
  private BigDecimal years3;

  public static final String JSON_PROPERTY_YEARS5 = "years5";
  private BigDecimal years5;

  public static final String JSON_PROPERTY_YEAR_TO_DATE = "yearToDate";
  private BigDecimal yearToDate;

  public InlineResponse20011PerformanceEndOfDay() { 
  }

  public InlineResponse20011PerformanceEndOfDay day1(BigDecimal day1) {
    this.day1 = day1;
    return this;
  }

   /**
   * One day.
   * @return day1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "One day.")
  @JsonProperty(JSON_PROPERTY_DAY1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getDay1() {
    return day1;
  }


  @JsonProperty(JSON_PROPERTY_DAY1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDay1(BigDecimal day1) {
    this.day1 = day1;
  }


  public InlineResponse20011PerformanceEndOfDay week1(BigDecimal week1) {
    this.week1 = week1;
    return this;
  }

   /**
   * One week.
   * @return week1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "One week.")
  @JsonProperty(JSON_PROPERTY_WEEK1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getWeek1() {
    return week1;
  }


  @JsonProperty(JSON_PROPERTY_WEEK1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWeek1(BigDecimal week1) {
    this.week1 = week1;
  }


  public InlineResponse20011PerformanceEndOfDay month1(BigDecimal month1) {
    this.month1 = month1;
    return this;
  }

   /**
   * One month.
   * @return month1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "One month.")
  @JsonProperty(JSON_PROPERTY_MONTH1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getMonth1() {
    return month1;
  }


  @JsonProperty(JSON_PROPERTY_MONTH1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMonth1(BigDecimal month1) {
    this.month1 = month1;
  }


  public InlineResponse20011PerformanceEndOfDay months3(BigDecimal months3) {
    this.months3 = months3;
    return this;
  }

   /**
   * Three months.
   * @return months3
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Three months.")
  @JsonProperty(JSON_PROPERTY_MONTHS3)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getMonths3() {
    return months3;
  }


  @JsonProperty(JSON_PROPERTY_MONTHS3)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMonths3(BigDecimal months3) {
    this.months3 = months3;
  }


  public InlineResponse20011PerformanceEndOfDay months6(BigDecimal months6) {
    this.months6 = months6;
    return this;
  }

   /**
   * Six months.
   * @return months6
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Six months.")
  @JsonProperty(JSON_PROPERTY_MONTHS6)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getMonths6() {
    return months6;
  }


  @JsonProperty(JSON_PROPERTY_MONTHS6)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMonths6(BigDecimal months6) {
    this.months6 = months6;
  }


  public InlineResponse20011PerformanceEndOfDay year1(BigDecimal year1) {
    this.year1 = year1;
    return this;
  }

   /**
   * One year.
   * @return year1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "One year.")
  @JsonProperty(JSON_PROPERTY_YEAR1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getYear1() {
    return year1;
  }


  @JsonProperty(JSON_PROPERTY_YEAR1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setYear1(BigDecimal year1) {
    this.year1 = year1;
  }


  public InlineResponse20011PerformanceEndOfDay years3(BigDecimal years3) {
    this.years3 = years3;
    return this;
  }

   /**
   * Three years.
   * @return years3
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Three years.")
  @JsonProperty(JSON_PROPERTY_YEARS3)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getYears3() {
    return years3;
  }


  @JsonProperty(JSON_PROPERTY_YEARS3)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setYears3(BigDecimal years3) {
    this.years3 = years3;
  }


  public InlineResponse20011PerformanceEndOfDay years5(BigDecimal years5) {
    this.years5 = years5;
    return this;
  }

   /**
   * Five years.
   * @return years5
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Five years.")
  @JsonProperty(JSON_PROPERTY_YEARS5)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getYears5() {
    return years5;
  }


  @JsonProperty(JSON_PROPERTY_YEARS5)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setYears5(BigDecimal years5) {
    this.years5 = years5;
  }


  public InlineResponse20011PerformanceEndOfDay yearToDate(BigDecimal yearToDate) {
    this.yearToDate = yearToDate;
    return this;
  }

   /**
   * Year-to-date.
   * @return yearToDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Year-to-date.")
  @JsonProperty(JSON_PROPERTY_YEAR_TO_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getYearToDate() {
    return yearToDate;
  }


  @JsonProperty(JSON_PROPERTY_YEAR_TO_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setYearToDate(BigDecimal yearToDate) {
    this.yearToDate = yearToDate;
  }


  /**
   * Return true if this inline_response_200_11_performance_endOfDay object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20011PerformanceEndOfDay inlineResponse20011PerformanceEndOfDay = (InlineResponse20011PerformanceEndOfDay) o;
    return Objects.equals(this.day1, inlineResponse20011PerformanceEndOfDay.day1) &&
        Objects.equals(this.week1, inlineResponse20011PerformanceEndOfDay.week1) &&
        Objects.equals(this.month1, inlineResponse20011PerformanceEndOfDay.month1) &&
        Objects.equals(this.months3, inlineResponse20011PerformanceEndOfDay.months3) &&
        Objects.equals(this.months6, inlineResponse20011PerformanceEndOfDay.months6) &&
        Objects.equals(this.year1, inlineResponse20011PerformanceEndOfDay.year1) &&
        Objects.equals(this.years3, inlineResponse20011PerformanceEndOfDay.years3) &&
        Objects.equals(this.years5, inlineResponse20011PerformanceEndOfDay.years5) &&
        Objects.equals(this.yearToDate, inlineResponse20011PerformanceEndOfDay.yearToDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(day1, week1, month1, months3, months6, year1, years3, years5, yearToDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20011PerformanceEndOfDay {\n");
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

