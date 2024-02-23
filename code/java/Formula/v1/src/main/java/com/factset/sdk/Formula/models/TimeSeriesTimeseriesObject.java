/*
 * FactSet Formula API
 *  **FactSet Formula API**  FactSet’s Formula API is a modern, flexible, formula-based API that enables users to access FactSet’s wide range of financial data and content. The API offers two endpoints, one optimized for time-series analysis and one designed for cross-sectional analysis, providing users a simplified interface into FactSet’s expansive offering. By providing two endpoints, it allows for the optimization of user workflows, while reducing complexity.  Leverage the power and flexibility of the Formula API to -   * Pull data from across most content sets that a user has access to in a single request   * Include business logic and mathematical operations in request   * Submit a dynamic universe in both endpoints   * Return the fsymId to easily combine with other FactSet content / products   * Set the trading calendar   * Define custom display names  **Formula API Request Builder**  The Formula API Request Builder provides users everything they need to form a Formula API request. In the Request Builder, you can select identifiers, build a universe expression, select FQL or Screening formulas, easily apply business logic and mathematical functions to the FQL or Screening formulas, specify optional parameters, and construct a GET or POST request. The Request Builder eliminates the need to have previous FQL and Screening knowledge and allows you to quickly find your desired data items and form the request.  The Formula API Request Builder can be accessed by navigating to [https://developer.factset.com/formula-api-request-builder](https://developer.factset.com/formula-api-request-builder) and logging in using your FactSet.net ID. When using the Request Builder to construct requests for the one of the Formula API's endpoints, be sure to toggle to the correct endpoint at the top of the page.  **How to Check the Health and Availability of the Formula API**  Please use the below endpoint to check the health and availability of the Formula API. You must be authorized for this API to use the Health endpoint.  [https://api.factset.com/formula-api/health](https://api.factset.com/formula-api/health)  **How to Programmatically Download API Specification File**  You can download the FactSet Formula API Specification File in .yaml. using the \"Download Spec\" button to the right of the version number. This specification can then be used for Codegen to create your own SDKs. 
 *
 * The version of the OpenAPI document: 1.7.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.Formula.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.Formula.models.TimeSeriesScalarValue;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.Formula.JSON;


/**
 * The &#x60;result&#x60; attribute in the Time-Series Non-Flattened Response Object will be a TIMESERIES object. A TIMESERIES object has a values attribute and a dates attribute that contain arrays of equal length so that the values and dates can be align to form a time series.
 */
@ApiModel(description = "The `result` attribute in the Time-Series Non-Flattened Response Object will be a TIMESERIES object. A TIMESERIES object has a values attribute and a dates attribute that contain arrays of equal length so that the values and dates can be align to form a time series.")
@JsonPropertyOrder({
  TimeSeriesTimeseriesObject.JSON_PROPERTY_VALUES,
  TimeSeriesTimeseriesObject.JSON_PROPERTY_DATES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TimeSeriesTimeseriesObject implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_VALUES = "values";
  private java.util.List<TimeSeriesScalarValue> values = null;

  public static final String JSON_PROPERTY_DATES = "dates";
  private java.util.List<LocalDate> dates = null;

  public TimeSeriesTimeseriesObject() { 
  }

  public TimeSeriesTimeseriesObject values(java.util.List<TimeSeriesScalarValue> values) {
    this.values = values;
    return this;
  }

  public TimeSeriesTimeseriesObject addValuesItem(TimeSeriesScalarValue valuesItem) {
    if (this.values == null) {
      this.values = new java.util.ArrayList<>();
    }
    this.values.add(valuesItem);
    return this;
  }

   /**
   * Representing the data returned from the requested FQL formula for the requestId
   * @return values
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[124.92,124.22,122.44]", value = "Representing the data returned from the requested FQL formula for the requestId")
  @JsonProperty(JSON_PROPERTY_VALUES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<TimeSeriesScalarValue> getValues() {
    return values;
  }


  @JsonProperty(JSON_PROPERTY_VALUES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValues(java.util.List<TimeSeriesScalarValue> values) {
    this.values = values;
  }


  public TimeSeriesTimeseriesObject dates(java.util.List<LocalDate> dates) {
    this.dates = dates;
    return this;
  }

  public TimeSeriesTimeseriesObject addDatesItem(LocalDate datesItem) {
    if (this.dates == null) {
      this.dates = new java.util.ArrayList<>();
    }
    this.dates.add(datesItem);
    return this;
  }

   /**
   * Representing the dates corresponding the requested FQL formula for the requestId
   * @return dates
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"2020-09-17\",\"2020-09-16\",\"2020-09-15\"]", value = "Representing the dates corresponding the requested FQL formula for the requestId")
  @JsonProperty(JSON_PROPERTY_DATES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<LocalDate> getDates() {
    return dates;
  }


  @JsonProperty(JSON_PROPERTY_DATES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDates(java.util.List<LocalDate> dates) {
    this.dates = dates;
  }


  /**
   * Return true if this time_series_timeseries_object object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeSeriesTimeseriesObject timeSeriesTimeseriesObject = (TimeSeriesTimeseriesObject) o;
    return Objects.equals(this.values, timeSeriesTimeseriesObject.values) &&
        Objects.equals(this.dates, timeSeriesTimeseriesObject.dates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(values, dates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeSeriesTimeseriesObject {\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
    sb.append("    dates: ").append(toIndentedString(dates)).append("\n");
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

