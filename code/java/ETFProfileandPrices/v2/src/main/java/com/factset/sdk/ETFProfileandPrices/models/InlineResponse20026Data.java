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
import com.factset.sdk.ETFProfileandPrices.models.InlineResponse20026DataSummary;
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
import com.factset.sdk.ETFProfileandPrices.JSON;


/**
 * ETP&#39;s premium discount summary data.
 */
@ApiModel(description = "ETP's premium discount summary data.")
@JsonPropertyOrder({
  InlineResponse20026Data.JSON_PROPERTY_AS_OF_DATE,
  InlineResponse20026Data.JSON_PROPERTY_SUMMARY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse20026Data implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_AS_OF_DATE = "asOfDate";
  private LocalDate asOfDate;

  public static final String JSON_PROPERTY_SUMMARY = "summary";
  private java.util.Set<InlineResponse20026DataSummary> summary = null;

  public InlineResponse20026Data() { 
  }

  public InlineResponse20026Data asOfDate(LocalDate asOfDate) {
    this.asOfDate = asOfDate;
    return this;
  }

   /**
   * As of date of the premium discount summary data.
   * @return asOfDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "As of date of the premium discount summary data.")
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


  public InlineResponse20026Data summary(java.util.Set<InlineResponse20026DataSummary> summary) {
    this.summary = summary;
    return this;
  }

  public InlineResponse20026Data addSummaryItem(InlineResponse20026DataSummary summaryItem) {
    if (this.summary == null) {
      this.summary = new java.util.LinkedHashSet<>();
    }
    this.summary.add(summaryItem);
    return this;
  }

   /**
   * Summary of premium/discout/neutral data.
   * @return summary
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Summary of premium/discout/neutral data.")
  @JsonProperty(JSON_PROPERTY_SUMMARY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.Set<InlineResponse20026DataSummary> getSummary() {
    return summary;
  }


  @JsonProperty(JSON_PROPERTY_SUMMARY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSummary(java.util.Set<InlineResponse20026DataSummary> summary) {
    this.summary = summary;
  }


  /**
   * Return true if this inline_response_200_26_data object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20026Data inlineResponse20026Data = (InlineResponse20026Data) o;
    return Objects.equals(this.asOfDate, inlineResponse20026Data.asOfDate) &&
        Objects.equals(this.summary, inlineResponse20026Data.summary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(asOfDate, summary);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20026Data {\n");
    sb.append("    asOfDate: ").append(toIndentedString(asOfDate)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
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

