/*
 * FactSet Fundamentals API
 * Gain access to current, comprehensive, and comparative information on securities in worldwide developed and emerging markets. Composed of annual and interim/quarterly data, detailed historical financial statement content, per-share data, and calculated ratios, FactSet Fundamentals provides you with the information you need for a global investment perspective. 
 *
 * The version of the OpenAPI document: 2.1.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.FactSetFundamentals.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.FactSetFundamentals.models.Batch;
import com.factset.sdk.FactSetFundamentals.models.FiscalPeriod;
import com.factset.sdk.FactSetFundamentals.models.Periodicity;
import com.factset.sdk.FactSetFundamentals.models.UpdateType;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.FactSetFundamentals.JSON;


/**
 * Fundamentals request body elements
 */
@ApiModel(description = "Fundamentals request body elements")
@JsonPropertyOrder({
  FundamentalRequestBody.JSON_PROPERTY_IDS,
  FundamentalRequestBody.JSON_PROPERTY_PERIODICITY,
  FundamentalRequestBody.JSON_PROPERTY_FISCAL_PERIOD,
  FundamentalRequestBody.JSON_PROPERTY_METRICS,
  FundamentalRequestBody.JSON_PROPERTY_CURRENCY,
  FundamentalRequestBody.JSON_PROPERTY_UPDATE_TYPE,
  FundamentalRequestBody.JSON_PROPERTY_BATCH
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FundamentalRequestBody implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_IDS = "ids";
  private java.util.List<String> ids = new java.util.ArrayList<>();

  public static final String JSON_PROPERTY_PERIODICITY = "periodicity";
  private Periodicity periodicity = Periodicity.ANN;

  public static final String JSON_PROPERTY_FISCAL_PERIOD = "fiscalPeriod";
  private FiscalPeriod fiscalPeriod;

  public static final String JSON_PROPERTY_METRICS = "metrics";
  private java.util.List<String> metrics = new java.util.ArrayList<>();

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  private String currency = "LOCAL";

  public static final String JSON_PROPERTY_UPDATE_TYPE = "updateType";
  private UpdateType updateType = UpdateType.RP;

  public static final String JSON_PROPERTY_BATCH = "batch";
  private Batch batch = Batch.N;

  public FundamentalRequestBody() { 
  }

  @JsonCreator
  public FundamentalRequestBody(
    @JsonProperty(value=JSON_PROPERTY_IDS, required=true) java.util.List<String> ids, 
    @JsonProperty(value=JSON_PROPERTY_METRICS, required=true) java.util.List<String> metrics
  ) {
    this();
    this.ids = ids;
    this.metrics = metrics;
  }

  public FundamentalRequestBody ids(java.util.List<String> ids) {
    this.ids = ids;
    return this;
  }

  public FundamentalRequestBody addIdsItem(String idsItem) {
    this.ids.add(idsItem);
    return this;
  }

   /**
   * The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids.  &lt;p&gt;ids limit &#x3D;  1000 per non-batch request / 30000 per batch request&lt;/p&gt; 
   * @return ids
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "[\"FDS-US\"]", required = true, value = "The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids.  <p>ids limit =  1000 per non-batch request / 30000 per batch request</p> ")
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


  public FundamentalRequestBody periodicity(Periodicity periodicity) {
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


  public FundamentalRequestBody fiscalPeriod(FiscalPeriod fiscalPeriod) {
    this.fiscalPeriod = fiscalPeriod;
    return this;
  }

   /**
   * Get fiscalPeriod
   * @return fiscalPeriod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FISCAL_PERIOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FiscalPeriod getFiscalPeriod() {
    return fiscalPeriod;
  }


  @JsonProperty(JSON_PROPERTY_FISCAL_PERIOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFiscalPeriod(FiscalPeriod fiscalPeriod) {
    this.fiscalPeriod = fiscalPeriod;
  }


  public FundamentalRequestBody metrics(java.util.List<String> metrics) {
    this.metrics = metrics;
    return this;
  }

  public FundamentalRequestBody addMetricsItem(String metricsItem) {
    this.metrics.add(metricsItem);
    return this;
  }

   /**
   * Requested List of Financial Statement Items or Ratios. Use /metrics endpoint for a complete list of available FF_* metric items. 
   * @return metrics
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "[\"FF_SALES\"]", required = true, value = "Requested List of Financial Statement Items or Ratios. Use /metrics endpoint for a complete list of available FF_* metric items. ")
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


  public FundamentalRequestBody currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Currency code for currency values. For a list of currency ISO codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470). 
   * @return currency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "USD", value = "Currency code for currency values. For a list of currency ISO codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470). ")
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


  public FundamentalRequestBody updateType(UpdateType updateType) {
    this.updateType = updateType;
    return this;
  }

   /**
   * Get updateType
   * @return updateType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_UPDATE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UpdateType getUpdateType() {
    return updateType;
  }


  @JsonProperty(JSON_PROPERTY_UPDATE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpdateType(UpdateType updateType) {
    this.updateType = updateType;
  }


  public FundamentalRequestBody batch(Batch batch) {
    this.batch = batch;
    return this;
  }

   /**
   * Get batch
   * @return batch
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BATCH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Batch getBatch() {
    return batch;
  }


  @JsonProperty(JSON_PROPERTY_BATCH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBatch(Batch batch) {
    this.batch = batch;
  }


  /**
   * Return true if this fundamentalRequestBody object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FundamentalRequestBody fundamentalRequestBody = (FundamentalRequestBody) o;
    return Objects.equals(this.ids, fundamentalRequestBody.ids) &&
        Objects.equals(this.periodicity, fundamentalRequestBody.periodicity) &&
        Objects.equals(this.fiscalPeriod, fundamentalRequestBody.fiscalPeriod) &&
        Objects.equals(this.metrics, fundamentalRequestBody.metrics) &&
        Objects.equals(this.currency, fundamentalRequestBody.currency) &&
        Objects.equals(this.updateType, fundamentalRequestBody.updateType) &&
        Objects.equals(this.batch, fundamentalRequestBody.batch);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ids, periodicity, fiscalPeriod, metrics, currency, updateType, batch);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FundamentalRequestBody {\n");
    sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
    sb.append("    periodicity: ").append(toIndentedString(periodicity)).append("\n");
    sb.append("    fiscalPeriod: ").append(toIndentedString(fiscalPeriod)).append("\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    updateType: ").append(toIndentedString(updateType)).append("\n");
    sb.append("    batch: ").append(toIndentedString(batch)).append("\n");
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

