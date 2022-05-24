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
import com.factset.sdk.StocksAPIforDigitalPortals.models.StockNotationRankingIntradayListDataCompany;
import com.factset.sdk.StocksAPIforDigitalPortals.models.StockNotationRankingIntradayListDataCurrency;
import com.factset.sdk.StocksAPIforDigitalPortals.models.StockNotationRankingIntradayListDataIndexMembership;
import com.factset.sdk.StocksAPIforDigitalPortals.models.StockNotationRankingIntradayListDataIndustryClassification;
import com.factset.sdk.StocksAPIforDigitalPortals.models.StockNotationRankingIntradayListDataInstrumentRestrictionList;
import com.factset.sdk.StocksAPIforDigitalPortals.models.StockNotationRankingIntradayListDataMarket;
import com.factset.sdk.StocksAPIforDigitalPortals.models.StockNotationRankingIntradayListDataNotationRestrictionList;
import com.factset.sdk.StocksAPIforDigitalPortals.models.StockNotationRankingIntradayListDataPrices;
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
 * The data member contains the request&#39;s primary data.
 */
@ApiModel(description = "The data member contains the request's primary data.")
@JsonPropertyOrder({
  StockNotationRankingIntradayListData.JSON_PROPERTY_PRICES,
  StockNotationRankingIntradayListData.JSON_PROPERTY_CURRENCY,
  StockNotationRankingIntradayListData.JSON_PROPERTY_MARKET,
  StockNotationRankingIntradayListData.JSON_PROPERTY_INSTRUMENT_RESTRICTION_LIST,
  StockNotationRankingIntradayListData.JSON_PROPERTY_NOTATION_RESTRICTION_LIST,
  StockNotationRankingIntradayListData.JSON_PROPERTY_INDUSTRY_CLASSIFICATION,
  StockNotationRankingIntradayListData.JSON_PROPERTY_COMPANY,
  StockNotationRankingIntradayListData.JSON_PROPERTY_INDEX_MEMBERSHIP
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class StockNotationRankingIntradayListData implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_PRICES = "prices";
  private StockNotationRankingIntradayListDataPrices prices;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  private StockNotationRankingIntradayListDataCurrency currency;

  public static final String JSON_PROPERTY_MARKET = "market";
  private StockNotationRankingIntradayListDataMarket market;

  public static final String JSON_PROPERTY_INSTRUMENT_RESTRICTION_LIST = "instrumentRestrictionList";
  private StockNotationRankingIntradayListDataInstrumentRestrictionList instrumentRestrictionList;

  public static final String JSON_PROPERTY_NOTATION_RESTRICTION_LIST = "notationRestrictionList";
  private StockNotationRankingIntradayListDataNotationRestrictionList notationRestrictionList;

  public static final String JSON_PROPERTY_INDUSTRY_CLASSIFICATION = "industryClassification";
  private StockNotationRankingIntradayListDataIndustryClassification industryClassification;

  public static final String JSON_PROPERTY_COMPANY = "company";
  private StockNotationRankingIntradayListDataCompany company;

  public static final String JSON_PROPERTY_INDEX_MEMBERSHIP = "indexMembership";
  private StockNotationRankingIntradayListDataIndexMembership indexMembership;

  public StockNotationRankingIntradayListData() { 
  }

  public StockNotationRankingIntradayListData prices(StockNotationRankingIntradayListDataPrices prices) {
    this.prices = prices;
    return this;
  }

   /**
   * Get prices
   * @return prices
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PRICES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StockNotationRankingIntradayListDataPrices getPrices() {
    return prices;
  }


  @JsonProperty(JSON_PROPERTY_PRICES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrices(StockNotationRankingIntradayListDataPrices prices) {
    this.prices = prices;
  }


  public StockNotationRankingIntradayListData currency(StockNotationRankingIntradayListDataCurrency currency) {
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

  public StockNotationRankingIntradayListDataCurrency getCurrency() {
    return currency;
  }


  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrency(StockNotationRankingIntradayListDataCurrency currency) {
    this.currency = currency;
  }


  public StockNotationRankingIntradayListData market(StockNotationRankingIntradayListDataMarket market) {
    this.market = market;
    return this;
  }

   /**
   * Get market
   * @return market
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MARKET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StockNotationRankingIntradayListDataMarket getMarket() {
    return market;
  }


  @JsonProperty(JSON_PROPERTY_MARKET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMarket(StockNotationRankingIntradayListDataMarket market) {
    this.market = market;
  }


  public StockNotationRankingIntradayListData instrumentRestrictionList(StockNotationRankingIntradayListDataInstrumentRestrictionList instrumentRestrictionList) {
    this.instrumentRestrictionList = instrumentRestrictionList;
    return this;
  }

   /**
   * Get instrumentRestrictionList
   * @return instrumentRestrictionList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INSTRUMENT_RESTRICTION_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StockNotationRankingIntradayListDataInstrumentRestrictionList getInstrumentRestrictionList() {
    return instrumentRestrictionList;
  }


  @JsonProperty(JSON_PROPERTY_INSTRUMENT_RESTRICTION_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInstrumentRestrictionList(StockNotationRankingIntradayListDataInstrumentRestrictionList instrumentRestrictionList) {
    this.instrumentRestrictionList = instrumentRestrictionList;
  }


  public StockNotationRankingIntradayListData notationRestrictionList(StockNotationRankingIntradayListDataNotationRestrictionList notationRestrictionList) {
    this.notationRestrictionList = notationRestrictionList;
    return this;
  }

   /**
   * Get notationRestrictionList
   * @return notationRestrictionList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NOTATION_RESTRICTION_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StockNotationRankingIntradayListDataNotationRestrictionList getNotationRestrictionList() {
    return notationRestrictionList;
  }


  @JsonProperty(JSON_PROPERTY_NOTATION_RESTRICTION_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNotationRestrictionList(StockNotationRankingIntradayListDataNotationRestrictionList notationRestrictionList) {
    this.notationRestrictionList = notationRestrictionList;
  }


  public StockNotationRankingIntradayListData industryClassification(StockNotationRankingIntradayListDataIndustryClassification industryClassification) {
    this.industryClassification = industryClassification;
    return this;
  }

   /**
   * Get industryClassification
   * @return industryClassification
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INDUSTRY_CLASSIFICATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StockNotationRankingIntradayListDataIndustryClassification getIndustryClassification() {
    return industryClassification;
  }


  @JsonProperty(JSON_PROPERTY_INDUSTRY_CLASSIFICATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIndustryClassification(StockNotationRankingIntradayListDataIndustryClassification industryClassification) {
    this.industryClassification = industryClassification;
  }


  public StockNotationRankingIntradayListData company(StockNotationRankingIntradayListDataCompany company) {
    this.company = company;
    return this;
  }

   /**
   * Get company
   * @return company
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_COMPANY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StockNotationRankingIntradayListDataCompany getCompany() {
    return company;
  }


  @JsonProperty(JSON_PROPERTY_COMPANY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCompany(StockNotationRankingIntradayListDataCompany company) {
    this.company = company;
  }


  public StockNotationRankingIntradayListData indexMembership(StockNotationRankingIntradayListDataIndexMembership indexMembership) {
    this.indexMembership = indexMembership;
    return this;
  }

   /**
   * Get indexMembership
   * @return indexMembership
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INDEX_MEMBERSHIP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StockNotationRankingIntradayListDataIndexMembership getIndexMembership() {
    return indexMembership;
  }


  @JsonProperty(JSON_PROPERTY_INDEX_MEMBERSHIP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIndexMembership(StockNotationRankingIntradayListDataIndexMembership indexMembership) {
    this.indexMembership = indexMembership;
  }


  /**
   * Return true if this _stock_notation_ranking_intraday_list_data object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StockNotationRankingIntradayListData stockNotationRankingIntradayListData = (StockNotationRankingIntradayListData) o;
    return Objects.equals(this.prices, stockNotationRankingIntradayListData.prices) &&
        Objects.equals(this.currency, stockNotationRankingIntradayListData.currency) &&
        Objects.equals(this.market, stockNotationRankingIntradayListData.market) &&
        Objects.equals(this.instrumentRestrictionList, stockNotationRankingIntradayListData.instrumentRestrictionList) &&
        Objects.equals(this.notationRestrictionList, stockNotationRankingIntradayListData.notationRestrictionList) &&
        Objects.equals(this.industryClassification, stockNotationRankingIntradayListData.industryClassification) &&
        Objects.equals(this.company, stockNotationRankingIntradayListData.company) &&
        Objects.equals(this.indexMembership, stockNotationRankingIntradayListData.indexMembership);
  }

  @Override
  public int hashCode() {
    return Objects.hash(prices, currency, market, instrumentRestrictionList, notationRestrictionList, industryClassification, company, indexMembership);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StockNotationRankingIntradayListData {\n");
    sb.append("    prices: ").append(toIndentedString(prices)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    market: ").append(toIndentedString(market)).append("\n");
    sb.append("    instrumentRestrictionList: ").append(toIndentedString(instrumentRestrictionList)).append("\n");
    sb.append("    notationRestrictionList: ").append(toIndentedString(notationRestrictionList)).append("\n");
    sb.append("    industryClassification: ").append(toIndentedString(industryClassification)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    indexMembership: ").append(toIndentedString(indexMembership)).append("\n");
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

