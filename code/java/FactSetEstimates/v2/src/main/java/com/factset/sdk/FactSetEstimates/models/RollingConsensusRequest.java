/*
 * FactSet Estimates
 * Gain access to 20+ years of comprehensive estimates and statistics of over 250+ estimated metrics, including financial statement items, product segments, geosegments, and industry metrics. FactSet's consensus estimates are aggregated from a wide base of over 800+ contributors and cover over 19,000 active companies across 90+ countries. Data returned can be accessed on the data frequencies based on quarterly, fiscal years, and calendar years. FactSet Estimates updates on a real time basis intraday (every 5 minutes). Updating times vary based on earning season vs. non-earning season but the goal is to have the data available to the client within a few hours that FactSet receives updated information. Often times updates times can be much faster as FactSet has always been known as one of the fastest estimate providers in the market. 
 *
 * The version of the OpenAPI document: 2.3.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.FactSetEstimates.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.FactSetEstimates.models.Frequency;
import com.factset.sdk.FactSetEstimates.models.Periodicity;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.FactSetEstimates.JSON;


/**
 * Request object for requesting rolling consensus estimates.
 */
@ApiModel(description = "Request object for requesting rolling consensus estimates.")
@JsonPropertyOrder({
  RollingConsensusRequest.JSON_PROPERTY_IDS,
  RollingConsensusRequest.JSON_PROPERTY_METRICS,
  RollingConsensusRequest.JSON_PROPERTY_START_DATE,
  RollingConsensusRequest.JSON_PROPERTY_END_DATE,
  RollingConsensusRequest.JSON_PROPERTY_FREQUENCY,
  RollingConsensusRequest.JSON_PROPERTY_RELATIVE_FISCAL_START,
  RollingConsensusRequest.JSON_PROPERTY_RELATIVE_FISCAL_END,
  RollingConsensusRequest.JSON_PROPERTY_PERIODICITY,
  RollingConsensusRequest.JSON_PROPERTY_CURRENCY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RollingConsensusRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_IDS = "ids";
  private java.util.List<String> ids = new java.util.ArrayList<>();

  public static final String JSON_PROPERTY_METRICS = "metrics";
  private java.util.List<String> metrics = new java.util.ArrayList<>();

  public static final String JSON_PROPERTY_START_DATE = "startDate";
  private String startDate;

  public static final String JSON_PROPERTY_END_DATE = "endDate";
  private String endDate;

  public static final String JSON_PROPERTY_FREQUENCY = "frequency";
  private Frequency frequency = Frequency.D;

  public static final String JSON_PROPERTY_RELATIVE_FISCAL_START = "relativeFiscalStart";
  private Integer relativeFiscalStart;

  public static final String JSON_PROPERTY_RELATIVE_FISCAL_END = "relativeFiscalEnd";
  private Integer relativeFiscalEnd;

  public static final String JSON_PROPERTY_PERIODICITY = "periodicity";
  private Periodicity periodicity = Periodicity.ANN;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  private String currency;


  public RollingConsensusRequest ids(java.util.List<String> ids) {
    this.ids = ids;
    return this;
  }

  public RollingConsensusRequest addIdsItem(String idsItem) {
    this.ids.add(idsItem);
    return this;
  }

   /**
   * The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids. * Make Note - id limit of 3000 for defaults, otherwise the service is limited to a 30 second duration. This can be reached when increasing total number of metrics requested and depth of history. * 
   * @return ids
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "[\"FDS-US\"]", required = true, value = "The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids. * Make Note - id limit of 3000 for defaults, otherwise the service is limited to a 30 second duration. This can be reached when increasing total number of metrics requested and depth of history. * ")
  @JsonProperty(JSON_PROPERTY_IDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public java.util.List<String> getIds() {
    return ids;
  }


  @JsonProperty(JSON_PROPERTY_IDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIds(java.util.List<String> ids) {
    this.ids = ids;
  }


  public RollingConsensusRequest metrics(java.util.List<String> metrics) {
    this.metrics = metrics;
    return this;
  }

  public RollingConsensusRequest addMetricsItem(String metricsItem) {
    this.metrics.add(metricsItem);
    return this;
  }

   /**
   * Requested metrics. Use the metrics endpoint for a list of estimate items. Note, the number of metrics you are allowed to supply is limited to 1 for now. For more details, visit [Online Assistant Page #15034](https://oa.apps.factset.com/pages/15034).
   * @return metrics
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "[\"SALES\"]", required = true, value = "Requested metrics. Use the metrics endpoint for a list of estimate items. Note, the number of metrics you are allowed to supply is limited to 1 for now. For more details, visit [Online Assistant Page #15034](https://oa.apps.factset.com/pages/15034).")
  @JsonProperty(JSON_PROPERTY_METRICS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public java.util.List<String> getMetrics() {
    return metrics;
  }


  @JsonProperty(JSON_PROPERTY_METRICS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMetrics(java.util.List<String> metrics) {
    this.metrics = metrics;
  }


  public RollingConsensusRequest startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * The start date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this #endpoint. 
   * @return startDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2019-01-01", value = "The start date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this #endpoint. ")
  @JsonProperty(JSON_PROPERTY_START_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStartDate() {
    return startDate;
  }


  @JsonProperty(JSON_PROPERTY_START_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }


  public RollingConsensusRequest endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * The end date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint. 
   * @return endDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2019-12-31", value = "The end date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint. ")
  @JsonProperty(JSON_PROPERTY_END_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEndDate() {
    return endDate;
  }


  @JsonProperty(JSON_PROPERTY_END_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }


  public RollingConsensusRequest frequency(Frequency frequency) {
    this.frequency = frequency;
    return this;
  }

   /**
   * Get frequency
   * @return frequency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FREQUENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Frequency getFrequency() {
    return frequency;
  }


  @JsonProperty(JSON_PROPERTY_FREQUENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFrequency(Frequency frequency) {
    this.frequency = frequency;
  }


  public RollingConsensusRequest relativeFiscalStart(Integer relativeFiscalStart) {
    this.relativeFiscalStart = relativeFiscalStart;
    return this;
  }

   /**
   * Relative fiscal period, expressed as an integer, used to filter results.
   * @return relativeFiscalStart
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "Relative fiscal period, expressed as an integer, used to filter results.")
  @JsonProperty(JSON_PROPERTY_RELATIVE_FISCAL_START)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getRelativeFiscalStart() {
    return relativeFiscalStart;
  }


  @JsonProperty(JSON_PROPERTY_RELATIVE_FISCAL_START)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRelativeFiscalStart(Integer relativeFiscalStart) {
    this.relativeFiscalStart = relativeFiscalStart;
  }


  public RollingConsensusRequest relativeFiscalEnd(Integer relativeFiscalEnd) {
    this.relativeFiscalEnd = relativeFiscalEnd;
    return this;
  }

   /**
   * Relative fiscal period, expressed as an integer, used to filter results.
   * @return relativeFiscalEnd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3", value = "Relative fiscal period, expressed as an integer, used to filter results.")
  @JsonProperty(JSON_PROPERTY_RELATIVE_FISCAL_END)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getRelativeFiscalEnd() {
    return relativeFiscalEnd;
  }


  @JsonProperty(JSON_PROPERTY_RELATIVE_FISCAL_END)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRelativeFiscalEnd(Integer relativeFiscalEnd) {
    this.relativeFiscalEnd = relativeFiscalEnd;
  }


  public RollingConsensusRequest periodicity(Periodicity periodicity) {
    this.periodicity = periodicity;
    return this;
  }

   /**
   * Get periodicity
   * @return periodicity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PERIODICITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Periodicity getPeriodicity() {
    return periodicity;
  }


  @JsonProperty(JSON_PROPERTY_PERIODICITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPeriodicity(Periodicity periodicity) {
    this.periodicity = periodicity;
  }


  public RollingConsensusRequest currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Currency code for adjusting the data. For a list of currency ISO codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470).
   * @return currency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "USD", value = "Currency code for adjusting the data. For a list of currency ISO codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470).")
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
   * Return true if this rollingConsensusRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RollingConsensusRequest rollingConsensusRequest = (RollingConsensusRequest) o;
    return Objects.equals(this.ids, rollingConsensusRequest.ids) &&
        Objects.equals(this.metrics, rollingConsensusRequest.metrics) &&
        Objects.equals(this.startDate, rollingConsensusRequest.startDate) &&
        Objects.equals(this.endDate, rollingConsensusRequest.endDate) &&
        Objects.equals(this.frequency, rollingConsensusRequest.frequency) &&
        Objects.equals(this.relativeFiscalStart, rollingConsensusRequest.relativeFiscalStart) &&
        Objects.equals(this.relativeFiscalEnd, rollingConsensusRequest.relativeFiscalEnd) &&
        Objects.equals(this.periodicity, rollingConsensusRequest.periodicity) &&
        Objects.equals(this.currency, rollingConsensusRequest.currency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ids, metrics, startDate, endDate, frequency, relativeFiscalStart, relativeFiscalEnd, periodicity, currency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RollingConsensusRequest {\n");
    sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    relativeFiscalStart: ").append(toIndentedString(relativeFiscalStart)).append("\n");
    sb.append("    relativeFiscalEnd: ").append(toIndentedString(relativeFiscalEnd)).append("\n");
    sb.append("    periodicity: ").append(toIndentedString(periodicity)).append("\n");
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

