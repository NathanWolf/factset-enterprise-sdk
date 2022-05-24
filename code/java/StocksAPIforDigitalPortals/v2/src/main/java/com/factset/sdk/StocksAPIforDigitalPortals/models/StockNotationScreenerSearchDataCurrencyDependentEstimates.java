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
import com.factset.sdk.StocksAPIforDigitalPortals.models.StockNotationScreenerSearchDataCurrencyDependentEstimatesCurrency;
import com.factset.sdk.StocksAPIforDigitalPortals.models.StockNotationScreenerSearchDataCurrencyDependentEstimatesEbit;
import com.factset.sdk.StocksAPIforDigitalPortals.models.StockNotationScreenerSearchDataCurrencyDependentEstimatesEbitda;
import com.factset.sdk.StocksAPIforDigitalPortals.models.StockNotationScreenerSearchDataCurrencyDependentEstimatesPerShare;
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
 * Currency-dependent estimates. Selection of a currency is required to use these parameters.
 */
@ApiModel(description = "Currency-dependent estimates. Selection of a currency is required to use these parameters.")
@JsonPropertyOrder({
  StockNotationScreenerSearchDataCurrencyDependentEstimates.JSON_PROPERTY_CURRENCY,
  StockNotationScreenerSearchDataCurrencyDependentEstimates.JSON_PROPERTY_EBIT,
  StockNotationScreenerSearchDataCurrencyDependentEstimates.JSON_PROPERTY_EBITDA,
  StockNotationScreenerSearchDataCurrencyDependentEstimates.JSON_PROPERTY_PER_SHARE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class StockNotationScreenerSearchDataCurrencyDependentEstimates implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  private StockNotationScreenerSearchDataCurrencyDependentEstimatesCurrency currency;

  public static final String JSON_PROPERTY_EBIT = "ebit";
  private StockNotationScreenerSearchDataCurrencyDependentEstimatesEbit ebit;

  public static final String JSON_PROPERTY_EBITDA = "ebitda";
  private StockNotationScreenerSearchDataCurrencyDependentEstimatesEbitda ebitda;

  public static final String JSON_PROPERTY_PER_SHARE = "perShare";
  private StockNotationScreenerSearchDataCurrencyDependentEstimatesPerShare perShare;

  public StockNotationScreenerSearchDataCurrencyDependentEstimates() { 
  }

  @JsonCreator
  public StockNotationScreenerSearchDataCurrencyDependentEstimates(
    @JsonProperty(value=JSON_PROPERTY_CURRENCY, required=true) StockNotationScreenerSearchDataCurrencyDependentEstimatesCurrency currency
  ) {
    this();
    this.currency = currency;
  }

  public StockNotationScreenerSearchDataCurrencyDependentEstimates currency(StockNotationScreenerSearchDataCurrencyDependentEstimatesCurrency currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public StockNotationScreenerSearchDataCurrencyDependentEstimatesCurrency getCurrency() {
    return currency;
  }


  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCurrency(StockNotationScreenerSearchDataCurrencyDependentEstimatesCurrency currency) {
    this.currency = currency;
  }


  public StockNotationScreenerSearchDataCurrencyDependentEstimates ebit(StockNotationScreenerSearchDataCurrencyDependentEstimatesEbit ebit) {
    this.ebit = ebit;
    return this;
  }

   /**
   * Get ebit
   * @return ebit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EBIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StockNotationScreenerSearchDataCurrencyDependentEstimatesEbit getEbit() {
    return ebit;
  }


  @JsonProperty(JSON_PROPERTY_EBIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEbit(StockNotationScreenerSearchDataCurrencyDependentEstimatesEbit ebit) {
    this.ebit = ebit;
  }


  public StockNotationScreenerSearchDataCurrencyDependentEstimates ebitda(StockNotationScreenerSearchDataCurrencyDependentEstimatesEbitda ebitda) {
    this.ebitda = ebitda;
    return this;
  }

   /**
   * Get ebitda
   * @return ebitda
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EBITDA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StockNotationScreenerSearchDataCurrencyDependentEstimatesEbitda getEbitda() {
    return ebitda;
  }


  @JsonProperty(JSON_PROPERTY_EBITDA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEbitda(StockNotationScreenerSearchDataCurrencyDependentEstimatesEbitda ebitda) {
    this.ebitda = ebitda;
  }


  public StockNotationScreenerSearchDataCurrencyDependentEstimates perShare(StockNotationScreenerSearchDataCurrencyDependentEstimatesPerShare perShare) {
    this.perShare = perShare;
    return this;
  }

   /**
   * Get perShare
   * @return perShare
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PER_SHARE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StockNotationScreenerSearchDataCurrencyDependentEstimatesPerShare getPerShare() {
    return perShare;
  }


  @JsonProperty(JSON_PROPERTY_PER_SHARE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPerShare(StockNotationScreenerSearchDataCurrencyDependentEstimatesPerShare perShare) {
    this.perShare = perShare;
  }


  /**
   * Return true if this _stock_notation_screener_search_data_currencyDependentEstimates object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StockNotationScreenerSearchDataCurrencyDependentEstimates stockNotationScreenerSearchDataCurrencyDependentEstimates = (StockNotationScreenerSearchDataCurrencyDependentEstimates) o;
    return Objects.equals(this.currency, stockNotationScreenerSearchDataCurrencyDependentEstimates.currency) &&
        Objects.equals(this.ebit, stockNotationScreenerSearchDataCurrencyDependentEstimates.ebit) &&
        Objects.equals(this.ebitda, stockNotationScreenerSearchDataCurrencyDependentEstimates.ebitda) &&
        Objects.equals(this.perShare, stockNotationScreenerSearchDataCurrencyDependentEstimates.perShare);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currency, ebit, ebitda, perShare);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StockNotationScreenerSearchDataCurrencyDependentEstimates {\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    ebit: ").append(toIndentedString(ebit)).append("\n");
    sb.append("    ebitda: ").append(toIndentedString(ebitda)).append("\n");
    sb.append("    perShare: ").append(toIndentedString(perShare)).append("\n");
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

