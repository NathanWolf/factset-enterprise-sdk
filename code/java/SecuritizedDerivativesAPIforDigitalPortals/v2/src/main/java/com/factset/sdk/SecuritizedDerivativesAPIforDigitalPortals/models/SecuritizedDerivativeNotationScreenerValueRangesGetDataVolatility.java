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


package com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models.SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayMonth1;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models.SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayMonths3;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models.SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayMonths6;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models.SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayWeek1;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models.SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayYear1;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models.SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayYearToDate;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models.SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayYears3;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models.SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayYears5;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.JSON;


/**
 * Volatility of the daily logarithmic returns, annualized assuming 256 trading days per year for different time ranges.
 */
@ApiModel(description = "Volatility of the daily logarithmic returns, annualized assuming 256 trading days per year for different time ranges.")
@JsonPropertyOrder({
  SecuritizedDerivativeNotationScreenerValueRangesGetDataVolatility.JSON_PROPERTY_WEEK1,
  SecuritizedDerivativeNotationScreenerValueRangesGetDataVolatility.JSON_PROPERTY_MONTH1,
  SecuritizedDerivativeNotationScreenerValueRangesGetDataVolatility.JSON_PROPERTY_MONTHS3,
  SecuritizedDerivativeNotationScreenerValueRangesGetDataVolatility.JSON_PROPERTY_MONTHS6,
  SecuritizedDerivativeNotationScreenerValueRangesGetDataVolatility.JSON_PROPERTY_YEAR1,
  SecuritizedDerivativeNotationScreenerValueRangesGetDataVolatility.JSON_PROPERTY_YEARS3,
  SecuritizedDerivativeNotationScreenerValueRangesGetDataVolatility.JSON_PROPERTY_YEARS5,
  SecuritizedDerivativeNotationScreenerValueRangesGetDataVolatility.JSON_PROPERTY_YEAR_TO_DATE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SecuritizedDerivativeNotationScreenerValueRangesGetDataVolatility implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_WEEK1 = "week1";
  private SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayWeek1 week1;

  public static final String JSON_PROPERTY_MONTH1 = "month1";
  private SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayMonth1 month1;

  public static final String JSON_PROPERTY_MONTHS3 = "months3";
  private SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayMonths3 months3;

  public static final String JSON_PROPERTY_MONTHS6 = "months6";
  private SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayMonths6 months6;

  public static final String JSON_PROPERTY_YEAR1 = "year1";
  private SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayYear1 year1;

  public static final String JSON_PROPERTY_YEARS3 = "years3";
  private SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayYears3 years3;

  public static final String JSON_PROPERTY_YEARS5 = "years5";
  private SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayYears5 years5;

  public static final String JSON_PROPERTY_YEAR_TO_DATE = "yearToDate";
  private SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayYearToDate yearToDate;

  public SecuritizedDerivativeNotationScreenerValueRangesGetDataVolatility() { 
  }

  public SecuritizedDerivativeNotationScreenerValueRangesGetDataVolatility week1(SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayWeek1 week1) {
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

  public SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayWeek1 getWeek1() {
    return week1;
  }


  @JsonProperty(JSON_PROPERTY_WEEK1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWeek1(SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayWeek1 week1) {
    this.week1 = week1;
  }


  public SecuritizedDerivativeNotationScreenerValueRangesGetDataVolatility month1(SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayMonth1 month1) {
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

  public SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayMonth1 getMonth1() {
    return month1;
  }


  @JsonProperty(JSON_PROPERTY_MONTH1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMonth1(SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayMonth1 month1) {
    this.month1 = month1;
  }


  public SecuritizedDerivativeNotationScreenerValueRangesGetDataVolatility months3(SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayMonths3 months3) {
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

  public SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayMonths3 getMonths3() {
    return months3;
  }


  @JsonProperty(JSON_PROPERTY_MONTHS3)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMonths3(SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayMonths3 months3) {
    this.months3 = months3;
  }


  public SecuritizedDerivativeNotationScreenerValueRangesGetDataVolatility months6(SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayMonths6 months6) {
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

  public SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayMonths6 getMonths6() {
    return months6;
  }


  @JsonProperty(JSON_PROPERTY_MONTHS6)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMonths6(SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayMonths6 months6) {
    this.months6 = months6;
  }


  public SecuritizedDerivativeNotationScreenerValueRangesGetDataVolatility year1(SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayYear1 year1) {
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

  public SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayYear1 getYear1() {
    return year1;
  }


  @JsonProperty(JSON_PROPERTY_YEAR1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setYear1(SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayYear1 year1) {
    this.year1 = year1;
  }


  public SecuritizedDerivativeNotationScreenerValueRangesGetDataVolatility years3(SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayYears3 years3) {
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

  public SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayYears3 getYears3() {
    return years3;
  }


  @JsonProperty(JSON_PROPERTY_YEARS3)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setYears3(SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayYears3 years3) {
    this.years3 = years3;
  }


  public SecuritizedDerivativeNotationScreenerValueRangesGetDataVolatility years5(SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayYears5 years5) {
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

  public SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayYears5 getYears5() {
    return years5;
  }


  @JsonProperty(JSON_PROPERTY_YEARS5)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setYears5(SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayYears5 years5) {
    this.years5 = years5;
  }


  public SecuritizedDerivativeNotationScreenerValueRangesGetDataVolatility yearToDate(SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayYearToDate yearToDate) {
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

  public SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayYearToDate getYearToDate() {
    return yearToDate;
  }


  @JsonProperty(JSON_PROPERTY_YEAR_TO_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setYearToDate(SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayYearToDate yearToDate) {
    this.yearToDate = yearToDate;
  }


  /**
   * Return true if this _securitizedDerivative_notation_screener_valueRanges_get_data_volatility object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecuritizedDerivativeNotationScreenerValueRangesGetDataVolatility securitizedDerivativeNotationScreenerValueRangesGetDataVolatility = (SecuritizedDerivativeNotationScreenerValueRangesGetDataVolatility) o;
    return Objects.equals(this.week1, securitizedDerivativeNotationScreenerValueRangesGetDataVolatility.week1) &&
        Objects.equals(this.month1, securitizedDerivativeNotationScreenerValueRangesGetDataVolatility.month1) &&
        Objects.equals(this.months3, securitizedDerivativeNotationScreenerValueRangesGetDataVolatility.months3) &&
        Objects.equals(this.months6, securitizedDerivativeNotationScreenerValueRangesGetDataVolatility.months6) &&
        Objects.equals(this.year1, securitizedDerivativeNotationScreenerValueRangesGetDataVolatility.year1) &&
        Objects.equals(this.years3, securitizedDerivativeNotationScreenerValueRangesGetDataVolatility.years3) &&
        Objects.equals(this.years5, securitizedDerivativeNotationScreenerValueRangesGetDataVolatility.years5) &&
        Objects.equals(this.yearToDate, securitizedDerivativeNotationScreenerValueRangesGetDataVolatility.yearToDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(week1, month1, months3, months6, year1, years3, years5, yearToDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecuritizedDerivativeNotationScreenerValueRangesGetDataVolatility {\n");
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

