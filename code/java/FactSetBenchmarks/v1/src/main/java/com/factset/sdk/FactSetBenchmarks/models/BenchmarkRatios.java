/*
 * FactSet Benchmarks API
 * FactSet Benchmarks API gives access to Index Constituents, Prices, Returns, and Ratios. For a sample list of identifiers, use the /metrics endpoint. Equity Only - Fixed Income Benchmark support coming soon. 
 *
 * The version of the OpenAPI document: 1.7.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.FactSetBenchmarks.models;

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
import java.time.LocalDate;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.FactSetBenchmarks.JSON;


/**
 * BenchmarkRatios
 */
@JsonPropertyOrder({
  BenchmarkRatios.JSON_PROPERTY_FSYM_ID,
  BenchmarkRatios.JSON_PROPERTY_DATE,
  BenchmarkRatios.JSON_PROPERTY_NAME,
  BenchmarkRatios.JSON_PROPERTY_REQUEST_ID,
  BenchmarkRatios.JSON_PROPERTY_METRIC,
  BenchmarkRatios.JSON_PROPERTY_PERIODICITY,
  BenchmarkRatios.JSON_PROPERTY_CURRENCY,
  BenchmarkRatios.JSON_PROPERTY_VALUE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class BenchmarkRatios implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_FSYM_ID = "fsymId";
  private JsonNullable<String> fsymId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_DATE = "date";
  private JsonNullable<LocalDate> date = JsonNullable.<LocalDate>undefined();

  public static final String JSON_PROPERTY_NAME = "name";
  private JsonNullable<String> name = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_REQUEST_ID = "requestId";
  private String requestId;

  public static final String JSON_PROPERTY_METRIC = "metric";
  private JsonNullable<String> metric = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PERIODICITY = "periodicity";
  private JsonNullable<String> periodicity = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  private JsonNullable<String> currency = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_VALUE = "value";
  private JsonNullable<Double> value = JsonNullable.<Double>undefined();

  public BenchmarkRatios() { 
  }

  public BenchmarkRatios fsymId(String fsymId) {
    this.fsymId = JsonNullable.<String>of(fsymId);
    return this;
  }

   /**
   * Requested Identifier. Must be a valid Benchmark Identifier recognized by FactSet.
   * @return fsymId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SP50", value = "Requested Identifier. Must be a valid Benchmark Identifier recognized by FactSet.")
  @JsonIgnore

  public String getFsymId() {
        return fsymId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FSYM_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getFsymId_JsonNullable() {
    return fsymId;
  }
  
  @JsonProperty(JSON_PROPERTY_FSYM_ID)
  public void setFsymId_JsonNullable(JsonNullable<String> fsymId) {
    this.fsymId = fsymId;
  }

  public void setFsymId(String fsymId) {
    this.fsymId = JsonNullable.<String>of(fsymId);
  }


  public BenchmarkRatios date(LocalDate date) {
    this.date = JsonNullable.<LocalDate>of(date);
    return this;
  }

   /**
   * The respective date for values as of the date requested in YYYY-MM-DD format.
   * @return date
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Thu Dec 31 00:00:00 UTC 2020", value = "The respective date for values as of the date requested in YYYY-MM-DD format.")
  @JsonIgnore

  public LocalDate getDate() {
        return date.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<LocalDate> getDate_JsonNullable() {
    return date;
  }
  
  @JsonProperty(JSON_PROPERTY_DATE)
  public void setDate_JsonNullable(JsonNullable<LocalDate> date) {
    this.date = date;
  }

  public void setDate(LocalDate date) {
    this.date = JsonNullable.<LocalDate>of(date);
  }


  public BenchmarkRatios name(String name) {
    this.name = JsonNullable.<String>of(name);
    return this;
  }

   /**
   * Proper Name of Index.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "S&P 500", value = "Proper Name of Index.")
  @JsonIgnore

  public String getName() {
        return name.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getName_JsonNullable() {
    return name;
  }
  
  @JsonProperty(JSON_PROPERTY_NAME)
  public void setName_JsonNullable(JsonNullable<String> name) {
    this.name = name;
  }

  public void setName(String name) {
    this.name = JsonNullable.<String>of(name);
  }


  public BenchmarkRatios requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

   /**
   * Benchmark Identifier specified in the request.
   * @return requestId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SP50", value = "Benchmark Identifier specified in the request.")
  @JsonProperty(JSON_PROPERTY_REQUEST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRequestId() {
    return requestId;
  }


  @JsonProperty(JSON_PROPERTY_REQUEST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }


  public BenchmarkRatios metric(String metric) {
    this.metric = JsonNullable.<String>of(metric);
    return this;
  }

   /**
   * Metric requested
   * @return metric
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "GROSS_MARGIN", value = "Metric requested")
  @JsonIgnore

  public String getMetric() {
        return metric.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_METRIC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getMetric_JsonNullable() {
    return metric;
  }
  
  @JsonProperty(JSON_PROPERTY_METRIC)
  public void setMetric_JsonNullable(JsonNullable<String> metric) {
    this.metric = metric;
  }

  public void setMetric(String metric) {
    this.metric = JsonNullable.<String>of(metric);
  }


  public BenchmarkRatios periodicity(String periodicity) {
    this.periodicity = JsonNullable.<String>of(periodicity);
    return this;
  }

   /**
   * The periodicity submitted in the request.
   * @return periodicity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "LTM", value = "The periodicity submitted in the request.")
  @JsonIgnore

  public String getPeriodicity() {
        return periodicity.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PERIODICITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getPeriodicity_JsonNullable() {
    return periodicity;
  }
  
  @JsonProperty(JSON_PROPERTY_PERIODICITY)
  public void setPeriodicity_JsonNullable(JsonNullable<String> periodicity) {
    this.periodicity = periodicity;
  }

  public void setPeriodicity(String periodicity) {
    this.periodicity = JsonNullable.<String>of(periodicity);
  }


  public BenchmarkRatios currency(String currency) {
    this.currency = JsonNullable.<String>of(currency);
    return this;
  }

   /**
   * The currency submitted in the request.
   * @return currency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "USD", value = "The currency submitted in the request.")
  @JsonIgnore

  public String getCurrency() {
        return currency.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getCurrency_JsonNullable() {
    return currency;
  }
  
  @JsonProperty(JSON_PROPERTY_CURRENCY)
  public void setCurrency_JsonNullable(JsonNullable<String> currency) {
    this.currency = currency;
  }

  public void setCurrency(String currency) {
    this.currency = JsonNullable.<String>of(currency);
  }


  public BenchmarkRatios value(Double value) {
    this.value = JsonNullable.<Double>of(value);
    return this;
  }

   /**
   * Ratio value based on the metric requested.
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "35.4094680290153", value = "Ratio value based on the metric requested.")
  @JsonIgnore

  public Double getValue() {
        return value.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Double> getValue_JsonNullable() {
    return value;
  }
  
  @JsonProperty(JSON_PROPERTY_VALUE)
  public void setValue_JsonNullable(JsonNullable<Double> value) {
    this.value = value;
  }

  public void setValue(Double value) {
    this.value = JsonNullable.<Double>of(value);
  }


  /**
   * Return true if this benchmarkRatios object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BenchmarkRatios benchmarkRatios = (BenchmarkRatios) o;
    return equalsNullable(this.fsymId, benchmarkRatios.fsymId) &&
        equalsNullable(this.date, benchmarkRatios.date) &&
        equalsNullable(this.name, benchmarkRatios.name) &&
        Objects.equals(this.requestId, benchmarkRatios.requestId) &&
        equalsNullable(this.metric, benchmarkRatios.metric) &&
        equalsNullable(this.periodicity, benchmarkRatios.periodicity) &&
        equalsNullable(this.currency, benchmarkRatios.currency) &&
        equalsNullable(this.value, benchmarkRatios.value);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(fsymId), hashCodeNullable(date), hashCodeNullable(name), requestId, hashCodeNullable(metric), hashCodeNullable(periodicity), hashCodeNullable(currency), hashCodeNullable(value));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BenchmarkRatios {\n");
    sb.append("    fsymId: ").append(toIndentedString(fsymId)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
    sb.append("    periodicity: ").append(toIndentedString(periodicity)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

