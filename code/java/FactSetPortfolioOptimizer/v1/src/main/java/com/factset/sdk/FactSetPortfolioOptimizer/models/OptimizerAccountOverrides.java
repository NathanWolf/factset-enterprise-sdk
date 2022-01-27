/*
 * Engines API
 * Allow clients to fetch Engines Analytics through APIs.
 *
 * The version of the OpenAPI document: 1
 * Contact: analytics.api.support@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.FactSetPortfolioOptimizer.models;

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
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.FactSetPortfolioOptimizer.JSON;


/**
 * OptimizerAccountOverrides
 */
@JsonPropertyOrder({
  OptimizerAccountOverrides.JSON_PROPERTY_PORTFOLIO,
  OptimizerAccountOverrides.JSON_PROPERTY_BENCHMARK,
  OptimizerAccountOverrides.JSON_PROPERTY_RISKMODELID,
  OptimizerAccountOverrides.JSON_PROPERTY_CURRENCY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class OptimizerAccountOverrides implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_PORTFOLIO = "portfolio";
  private String portfolio;

  public static final String JSON_PROPERTY_BENCHMARK = "benchmark";
  private String benchmark;

  public static final String JSON_PROPERTY_RISKMODELID = "riskmodelid";
  private String riskmodelid;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  private String currency;


  public OptimizerAccountOverrides portfolio(String portfolio) {
    this.portfolio = portfolio;
    return this;
  }

   /**
   * Portfolio
   * @return portfolio
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Portfolio")
  @JsonProperty(JSON_PROPERTY_PORTFOLIO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPortfolio() {
    return portfolio;
  }


  @JsonProperty(JSON_PROPERTY_PORTFOLIO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPortfolio(String portfolio) {
    this.portfolio = portfolio;
  }


  public OptimizerAccountOverrides benchmark(String benchmark) {
    this.benchmark = benchmark;
    return this;
  }

   /**
   * Benchmark
   * @return benchmark
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Benchmark")
  @JsonProperty(JSON_PROPERTY_BENCHMARK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBenchmark() {
    return benchmark;
  }


  @JsonProperty(JSON_PROPERTY_BENCHMARK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBenchmark(String benchmark) {
    this.benchmark = benchmark;
  }


  public OptimizerAccountOverrides riskmodelid(String riskmodelid) {
    this.riskmodelid = riskmodelid;
    return this;
  }

   /**
   * Risk model
   * @return riskmodelid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Risk model")
  @JsonProperty(JSON_PROPERTY_RISKMODELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRiskmodelid() {
    return riskmodelid;
  }


  @JsonProperty(JSON_PROPERTY_RISKMODELID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRiskmodelid(String riskmodelid) {
    this.riskmodelid = riskmodelid;
  }


  public OptimizerAccountOverrides currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Currency
   * @return currency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Currency")
  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCurrency() {
    return currency;
  }


  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrency(String currency) {
    this.currency = currency;
  }


  /**
   * Return true if this OptimizerAccountOverrides object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OptimizerAccountOverrides optimizerAccountOverrides = (OptimizerAccountOverrides) o;
    return Objects.equals(this.portfolio, optimizerAccountOverrides.portfolio) &&
        Objects.equals(this.benchmark, optimizerAccountOverrides.benchmark) &&
        Objects.equals(this.riskmodelid, optimizerAccountOverrides.riskmodelid) &&
        Objects.equals(this.currency, optimizerAccountOverrides.currency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(portfolio, benchmark, riskmodelid, currency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OptimizerAccountOverrides {\n");
    sb.append("    portfolio: ").append(toIndentedString(portfolio)).append("\n");
    sb.append("    benchmark: ").append(toIndentedString(benchmark)).append("\n");
    sb.append("    riskmodelid: ").append(toIndentedString(riskmodelid)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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

