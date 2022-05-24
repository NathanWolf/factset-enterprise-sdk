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


package com.factset.sdk.StocksAPIforDigitalPortals.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.StocksAPIforDigitalPortals.models.StockNotationScreenerSearchDataRecommendationConsensus;
import com.factset.sdk.StocksAPIforDigitalPortals.models.StockNotationScreenerSearchDataRecommendationCounts;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.StocksAPIforDigitalPortals.JSON;


/**
 * Aggregated recommendation.
 */
@ApiModel(description = "Aggregated recommendation.")
@JsonPropertyOrder({
  StockNotationScreenerSearchDataRecommendation.JSON_PROPERTY_COUNTS,
  StockNotationScreenerSearchDataRecommendation.JSON_PROPERTY_CONSENSUS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class StockNotationScreenerSearchDataRecommendation implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_COUNTS = "counts";
  private StockNotationScreenerSearchDataRecommendationCounts counts;

  public static final String JSON_PROPERTY_CONSENSUS = "consensus";
  private StockNotationScreenerSearchDataRecommendationConsensus consensus;

  public StockNotationScreenerSearchDataRecommendation() { 
  }

  public StockNotationScreenerSearchDataRecommendation counts(StockNotationScreenerSearchDataRecommendationCounts counts) {
    this.counts = counts;
    return this;
  }

   /**
   * Get counts
   * @return counts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_COUNTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StockNotationScreenerSearchDataRecommendationCounts getCounts() {
    return counts;
  }


  @JsonProperty(JSON_PROPERTY_COUNTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCounts(StockNotationScreenerSearchDataRecommendationCounts counts) {
    this.counts = counts;
  }


  public StockNotationScreenerSearchDataRecommendation consensus(StockNotationScreenerSearchDataRecommendationConsensus consensus) {
    this.consensus = consensus;
    return this;
  }

   /**
   * Get consensus
   * @return consensus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CONSENSUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StockNotationScreenerSearchDataRecommendationConsensus getConsensus() {
    return consensus;
  }


  @JsonProperty(JSON_PROPERTY_CONSENSUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConsensus(StockNotationScreenerSearchDataRecommendationConsensus consensus) {
    this.consensus = consensus;
  }


  /**
   * Return true if this _stock_notation_screener_search_data_recommendation object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StockNotationScreenerSearchDataRecommendation stockNotationScreenerSearchDataRecommendation = (StockNotationScreenerSearchDataRecommendation) o;
    return Objects.equals(this.counts, stockNotationScreenerSearchDataRecommendation.counts) &&
        Objects.equals(this.consensus, stockNotationScreenerSearchDataRecommendation.consensus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(counts, consensus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StockNotationScreenerSearchDataRecommendation {\n");
    sb.append("    counts: ").append(toIndentedString(counts)).append("\n");
    sb.append("    consensus: ").append(toIndentedString(consensus)).append("\n");
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

