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


package com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.models.InlineResponse2001DataCurrency;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.models.InlineResponse2001DataProfitLoss;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.models.InlineResponse2001DataRiskKeyFigures;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.models.InlineResponse2001DataSummary;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.JSON;


/**
 * Details of the portfolio.
 */
@ApiModel(description = "Details of the portfolio.")
@JsonPropertyOrder({
  InlineResponse2001Data.JSON_PROPERTY_ID,
  InlineResponse2001Data.JSON_PROPERTY_NAME,
  InlineResponse2001Data.JSON_PROPERTY_CURRENCY,
  InlineResponse2001Data.JSON_PROPERTY_SUMMARY,
  InlineResponse2001Data.JSON_PROPERTY_PROFIT_LOSS,
  InlineResponse2001Data.JSON_PROPERTY_RISK_KEY_FIGURES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse2001Data implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  private InlineResponse2001DataCurrency currency;

  public static final String JSON_PROPERTY_SUMMARY = "summary";
  private InlineResponse2001DataSummary summary;

  public static final String JSON_PROPERTY_PROFIT_LOSS = "profitLoss";
  private InlineResponse2001DataProfitLoss profitLoss;

  public static final String JSON_PROPERTY_RISK_KEY_FIGURES = "riskKeyFigures";
  private InlineResponse2001DataRiskKeyFigures riskKeyFigures;

  public InlineResponse2001Data() { 
  }

  public InlineResponse2001Data id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Identifier of the portfolio.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Identifier of the portfolio.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }


  public InlineResponse2001Data name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the portfolio.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the portfolio.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public InlineResponse2001Data currency(InlineResponse2001DataCurrency currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2001DataCurrency getCurrency() {
    return currency;
  }


  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrency(InlineResponse2001DataCurrency currency) {
    this.currency = currency;
  }


  public InlineResponse2001Data summary(InlineResponse2001DataSummary summary) {
    this.summary = summary;
    return this;
  }

   /**
   * Get summary
   * @return summary
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SUMMARY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2001DataSummary getSummary() {
    return summary;
  }


  @JsonProperty(JSON_PROPERTY_SUMMARY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSummary(InlineResponse2001DataSummary summary) {
    this.summary = summary;
  }


  public InlineResponse2001Data profitLoss(InlineResponse2001DataProfitLoss profitLoss) {
    this.profitLoss = profitLoss;
    return this;
  }

   /**
   * Get profitLoss
   * @return profitLoss
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PROFIT_LOSS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2001DataProfitLoss getProfitLoss() {
    return profitLoss;
  }


  @JsonProperty(JSON_PROPERTY_PROFIT_LOSS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProfitLoss(InlineResponse2001DataProfitLoss profitLoss) {
    this.profitLoss = profitLoss;
  }


  public InlineResponse2001Data riskKeyFigures(InlineResponse2001DataRiskKeyFigures riskKeyFigures) {
    this.riskKeyFigures = riskKeyFigures;
    return this;
  }

   /**
   * Get riskKeyFigures
   * @return riskKeyFigures
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RISK_KEY_FIGURES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2001DataRiskKeyFigures getRiskKeyFigures() {
    return riskKeyFigures;
  }


  @JsonProperty(JSON_PROPERTY_RISK_KEY_FIGURES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRiskKeyFigures(InlineResponse2001DataRiskKeyFigures riskKeyFigures) {
    this.riskKeyFigures = riskKeyFigures;
  }


  /**
   * Return true if this inline_response_200_1_data object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2001Data inlineResponse2001Data = (InlineResponse2001Data) o;
    return Objects.equals(this.id, inlineResponse2001Data.id) &&
        Objects.equals(this.name, inlineResponse2001Data.name) &&
        Objects.equals(this.currency, inlineResponse2001Data.currency) &&
        Objects.equals(this.summary, inlineResponse2001Data.summary) &&
        Objects.equals(this.profitLoss, inlineResponse2001Data.profitLoss) &&
        Objects.equals(this.riskKeyFigures, inlineResponse2001Data.riskKeyFigures);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, currency, summary, profitLoss, riskKeyFigures);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2001Data {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    profitLoss: ").append(toIndentedString(profitLoss)).append("\n");
    sb.append("    riskKeyFigures: ").append(toIndentedString(riskKeyFigures)).append("\n");
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

