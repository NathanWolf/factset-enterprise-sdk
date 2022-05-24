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


package com.factset.sdk.ETFProfileandPrices.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.ETFProfileandPrices.models.InlineResponse20010DataIndexChange;
import com.factset.sdk.ETFProfileandPrices.models.InlineResponse20010DataRisk;
import com.factset.sdk.ETFProfileandPrices.models.InlineResponse20010DataSecurityLending;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.ETFProfileandPrices.JSON;


/**
 * Profile analytics.
 */
@ApiModel(description = "Profile analytics.")
@JsonPropertyOrder({
  InlineResponse20010Data.JSON_PROPERTY_AS_OF_DATE,
  InlineResponse20010Data.JSON_PROPERTY_SECURITY_LENDING,
  InlineResponse20010Data.JSON_PROPERTY_RISK,
  InlineResponse20010Data.JSON_PROPERTY_BENCHMARK_NAME,
  InlineResponse20010Data.JSON_PROPERTY_INDEX_CHANGE,
  InlineResponse20010Data.JSON_PROPERTY_MEDIAN_BID_ASK_SPREAD
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse20010Data implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_AS_OF_DATE = "asOfDate";
  private LocalDate asOfDate;

  public static final String JSON_PROPERTY_SECURITY_LENDING = "securityLending";
  private InlineResponse20010DataSecurityLending securityLending;

  public static final String JSON_PROPERTY_RISK = "risk";
  private InlineResponse20010DataRisk risk;

  public static final String JSON_PROPERTY_BENCHMARK_NAME = "benchmarkName";
  private String benchmarkName;

  public static final String JSON_PROPERTY_INDEX_CHANGE = "indexChange";
  private InlineResponse20010DataIndexChange indexChange;

  public static final String JSON_PROPERTY_MEDIAN_BID_ASK_SPREAD = "medianBidAskSpread";
  private BigDecimal medianBidAskSpread;

  public InlineResponse20010Data() { 
  }

  public InlineResponse20010Data asOfDate(LocalDate asOfDate) {
    this.asOfDate = asOfDate;
    return this;
  }

   /**
   * Date the analytics data was published. Available for the regions: US, Europe, and Canada.
   * @return asOfDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date the analytics data was published. Available for the regions: US, Europe, and Canada.")
  @JsonProperty(JSON_PROPERTY_AS_OF_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LocalDate getAsOfDate() {
    return asOfDate;
  }


  @JsonProperty(JSON_PROPERTY_AS_OF_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAsOfDate(LocalDate asOfDate) {
    this.asOfDate = asOfDate;
  }


  public InlineResponse20010Data securityLending(InlineResponse20010DataSecurityLending securityLending) {
    this.securityLending = securityLending;
    return this;
  }

   /**
   * Get securityLending
   * @return securityLending
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SECURITY_LENDING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse20010DataSecurityLending getSecurityLending() {
    return securityLending;
  }


  @JsonProperty(JSON_PROPERTY_SECURITY_LENDING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSecurityLending(InlineResponse20010DataSecurityLending securityLending) {
    this.securityLending = securityLending;
  }


  public InlineResponse20010Data risk(InlineResponse20010DataRisk risk) {
    this.risk = risk;
    return this;
  }

   /**
   * Get risk
   * @return risk
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RISK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse20010DataRisk getRisk() {
    return risk;
  }


  @JsonProperty(JSON_PROPERTY_RISK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRisk(InlineResponse20010DataRisk risk) {
    this.risk = risk;
  }


  public InlineResponse20010Data benchmarkName(String benchmarkName) {
    this.benchmarkName = benchmarkName;
    return this;
  }

   /**
   * FactSet provides a neutral, broad market index that best represents an ETP segment, giving investors a measuring stick against which to compare a specific ETP. The fund&#39;s performance (for example, R2, beta, and standard deviation) and holdings are measured against it. Available for the regions: US and Europe.
   * @return benchmarkName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "FactSet provides a neutral, broad market index that best represents an ETP segment, giving investors a measuring stick against which to compare a specific ETP. The fund's performance (for example, R2, beta, and standard deviation) and holdings are measured against it. Available for the regions: US and Europe.")
  @JsonProperty(JSON_PROPERTY_BENCHMARK_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBenchmarkName() {
    return benchmarkName;
  }


  @JsonProperty(JSON_PROPERTY_BENCHMARK_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBenchmarkName(String benchmarkName) {
    this.benchmarkName = benchmarkName;
  }


  public InlineResponse20010Data indexChange(InlineResponse20010DataIndexChange indexChange) {
    this.indexChange = indexChange;
    return this;
  }

   /**
   * Get indexChange
   * @return indexChange
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INDEX_CHANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse20010DataIndexChange getIndexChange() {
    return indexChange;
  }


  @JsonProperty(JSON_PROPERTY_INDEX_CHANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIndexChange(InlineResponse20010DataIndexChange indexChange) {
    this.indexChange = indexChange;
  }


  public InlineResponse20010Data medianBidAskSpread(BigDecimal medianBidAskSpread) {
    this.medianBidAskSpread = medianBidAskSpread;
    return this;
  }

   /**
   * The exchange-traded fund’s median bid-ask spread, expressed as a percentage rounded to the nearest hundredth, computed by: (A) Identifying the exchange-traded fund’s national best bid and national best offer as of the end of each 10 second interval during each trading day of the last 30 calendar days; (B) Dividing the ifference between each such bid and offer by the midpoint of the national best bid and national best offer; and (C) Identifying the median of those values. Available for the regions: US.
   * @return medianBidAskSpread
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The exchange-traded fund’s median bid-ask spread, expressed as a percentage rounded to the nearest hundredth, computed by: (A) Identifying the exchange-traded fund’s national best bid and national best offer as of the end of each 10 second interval during each trading day of the last 30 calendar days; (B) Dividing the ifference between each such bid and offer by the midpoint of the national best bid and national best offer; and (C) Identifying the median of those values. Available for the regions: US.")
  @JsonProperty(JSON_PROPERTY_MEDIAN_BID_ASK_SPREAD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getMedianBidAskSpread() {
    return medianBidAskSpread;
  }


  @JsonProperty(JSON_PROPERTY_MEDIAN_BID_ASK_SPREAD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMedianBidAskSpread(BigDecimal medianBidAskSpread) {
    this.medianBidAskSpread = medianBidAskSpread;
  }


  /**
   * Return true if this inline_response_200_10_data object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20010Data inlineResponse20010Data = (InlineResponse20010Data) o;
    return Objects.equals(this.asOfDate, inlineResponse20010Data.asOfDate) &&
        Objects.equals(this.securityLending, inlineResponse20010Data.securityLending) &&
        Objects.equals(this.risk, inlineResponse20010Data.risk) &&
        Objects.equals(this.benchmarkName, inlineResponse20010Data.benchmarkName) &&
        Objects.equals(this.indexChange, inlineResponse20010Data.indexChange) &&
        Objects.equals(this.medianBidAskSpread, inlineResponse20010Data.medianBidAskSpread);
  }

  @Override
  public int hashCode() {
    return Objects.hash(asOfDate, securityLending, risk, benchmarkName, indexChange, medianBidAskSpread);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20010Data {\n");
    sb.append("    asOfDate: ").append(toIndentedString(asOfDate)).append("\n");
    sb.append("    securityLending: ").append(toIndentedString(securityLending)).append("\n");
    sb.append("    risk: ").append(toIndentedString(risk)).append("\n");
    sb.append("    benchmarkName: ").append(toIndentedString(benchmarkName)).append("\n");
    sb.append("    indexChange: ").append(toIndentedString(indexChange)).append("\n");
    sb.append("    medianBidAskSpread: ").append(toIndentedString(medianBidAskSpread)).append("\n");
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

