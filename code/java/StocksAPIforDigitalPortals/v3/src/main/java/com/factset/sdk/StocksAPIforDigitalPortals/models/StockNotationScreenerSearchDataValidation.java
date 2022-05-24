/*
 * Stocks API For Digital Portals
 * The stocks API features a screener to search for equity instruments based on stock-specific parameters.  Parameters for up to three fiscal years might now be used in one request; data is available for the ten most recent completed fiscal years. Estimates are available for the current and two consecutive fiscal years.  A separate endpoint returns the possible values and value ranges for the parameters that the endpoint /stock/notation/screener/search accepts: Application developers can request the values and value ranges only for a restricted set of notations that match predefined parameters. This functionality may be used to pre-fill the values and value ranges of the parameters of the /stock/notation/screener/search endpoint so that performing a search always leads to a non-empty set of notations.  The endpoint /stock/notation/ranking/intraday/list ranks stocks notations using intraday figures, for example to build a gainers/losers list.   Additional endpoints include end-of-day benchmark key figures, and selected fundamentals (as of end of fiscal year and with potentially daily updates).  This API is fully integrated with the corresponding Quotes API, allowing access to detailed price and performance information of instruments, as well as basic security identifier cross-reference. For direct access to price histories, please refer to the Time Series API for Digital Portals.  Similar criteria based screener APIs exist for fixed income instruments and securitized derivatives: See the Bonds API and the Securitized Derivatives API for details.
 *
 * The version of the OpenAPI document: 2
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
import com.factset.sdk.StocksAPIforDigitalPortals.models.StockNotationScreenerSearchDataValidationInstrumentSelectionList;
import com.factset.sdk.StocksAPIforDigitalPortals.models.StockNotationScreenerSearchDataValidationMarket;
import com.factset.sdk.StocksAPIforDigitalPortals.models.StockNotationScreenerSearchDataValidationNotationSelectionList;
import com.factset.sdk.StocksAPIforDigitalPortals.models.StockNotationScreenerSearchDataValidationPrices;
import com.factset.sdk.StocksAPIforDigitalPortals.models.StockNotationScreenerSearchDataValidationValueUnit;
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
 * Validation parameters.
 */
@ApiModel(description = "Validation parameters.")
@JsonPropertyOrder({
  StockNotationScreenerSearchDataValidation.JSON_PROPERTY_ONLY_ACTIVE,
  StockNotationScreenerSearchDataValidation.JSON_PROPERTY_ONLY_NOT_SUSPENDED,
  StockNotationScreenerSearchDataValidation.JSON_PROPERTY_PRICES,
  StockNotationScreenerSearchDataValidation.JSON_PROPERTY_VALUE_UNIT,
  StockNotationScreenerSearchDataValidation.JSON_PROPERTY_MARKET,
  StockNotationScreenerSearchDataValidation.JSON_PROPERTY_INSTRUMENT_SELECTION_LIST,
  StockNotationScreenerSearchDataValidation.JSON_PROPERTY_NOTATION_SELECTION_LIST
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class StockNotationScreenerSearchDataValidation implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ONLY_ACTIVE = "onlyActive";
  private Boolean onlyActive = true;

  public static final String JSON_PROPERTY_ONLY_NOT_SUSPENDED = "onlyNotSuspended";
  private Boolean onlyNotSuspended = false;

  public static final String JSON_PROPERTY_PRICES = "prices";
  private StockNotationScreenerSearchDataValidationPrices prices;

  public static final String JSON_PROPERTY_VALUE_UNIT = "valueUnit";
  private StockNotationScreenerSearchDataValidationValueUnit valueUnit;

  public static final String JSON_PROPERTY_MARKET = "market";
  private StockNotationScreenerSearchDataValidationMarket market;

  public static final String JSON_PROPERTY_INSTRUMENT_SELECTION_LIST = "instrumentSelectionList";
  private StockNotationScreenerSearchDataValidationInstrumentSelectionList instrumentSelectionList;

  public static final String JSON_PROPERTY_NOTATION_SELECTION_LIST = "notationSelectionList";
  private StockNotationScreenerSearchDataValidationNotationSelectionList notationSelectionList;

  public StockNotationScreenerSearchDataValidation() { 
  }

  public StockNotationScreenerSearchDataValidation onlyActive(Boolean onlyActive) {
    this.onlyActive = onlyActive;
    return this;
  }

   /**
   * If &#x60;true&#x60;, only active notations will be returned. The term \&quot;active\&quot; reflects the fact that notations and related data are not being deleted immediately after becoming irrelevant (e.g. because the source does not provide a price anymore), but remains in general retrievable for up to 6 months.
   * @return onlyActive
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If `true`, only active notations will be returned. The term \"active\" reflects the fact that notations and related data are not being deleted immediately after becoming irrelevant (e.g. because the source does not provide a price anymore), but remains in general retrievable for up to 6 months.")
  @JsonProperty(JSON_PROPERTY_ONLY_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getOnlyActive() {
    return onlyActive;
  }


  @JsonProperty(JSON_PROPERTY_ONLY_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOnlyActive(Boolean onlyActive) {
    this.onlyActive = onlyActive;
  }


  public StockNotationScreenerSearchDataValidation onlyNotSuspended(Boolean onlyNotSuspended) {
    this.onlyNotSuspended = onlyNotSuspended;
    return this;
  }

   /**
   * If &#x60;true&#x60;, only notations not suspended from trading will be returned.
   * @return onlyNotSuspended
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If `true`, only notations not suspended from trading will be returned.")
  @JsonProperty(JSON_PROPERTY_ONLY_NOT_SUSPENDED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getOnlyNotSuspended() {
    return onlyNotSuspended;
  }


  @JsonProperty(JSON_PROPERTY_ONLY_NOT_SUSPENDED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOnlyNotSuspended(Boolean onlyNotSuspended) {
    this.onlyNotSuspended = onlyNotSuspended;
  }


  public StockNotationScreenerSearchDataValidation prices(StockNotationScreenerSearchDataValidationPrices prices) {
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

  public StockNotationScreenerSearchDataValidationPrices getPrices() {
    return prices;
  }


  @JsonProperty(JSON_PROPERTY_PRICES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrices(StockNotationScreenerSearchDataValidationPrices prices) {
    this.prices = prices;
  }


  public StockNotationScreenerSearchDataValidation valueUnit(StockNotationScreenerSearchDataValidationValueUnit valueUnit) {
    this.valueUnit = valueUnit;
    return this;
  }

   /**
   * Get valueUnit
   * @return valueUnit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VALUE_UNIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StockNotationScreenerSearchDataValidationValueUnit getValueUnit() {
    return valueUnit;
  }


  @JsonProperty(JSON_PROPERTY_VALUE_UNIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValueUnit(StockNotationScreenerSearchDataValidationValueUnit valueUnit) {
    this.valueUnit = valueUnit;
  }


  public StockNotationScreenerSearchDataValidation market(StockNotationScreenerSearchDataValidationMarket market) {
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

  public StockNotationScreenerSearchDataValidationMarket getMarket() {
    return market;
  }


  @JsonProperty(JSON_PROPERTY_MARKET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMarket(StockNotationScreenerSearchDataValidationMarket market) {
    this.market = market;
  }


  public StockNotationScreenerSearchDataValidation instrumentSelectionList(StockNotationScreenerSearchDataValidationInstrumentSelectionList instrumentSelectionList) {
    this.instrumentSelectionList = instrumentSelectionList;
    return this;
  }

   /**
   * Get instrumentSelectionList
   * @return instrumentSelectionList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INSTRUMENT_SELECTION_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StockNotationScreenerSearchDataValidationInstrumentSelectionList getInstrumentSelectionList() {
    return instrumentSelectionList;
  }


  @JsonProperty(JSON_PROPERTY_INSTRUMENT_SELECTION_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInstrumentSelectionList(StockNotationScreenerSearchDataValidationInstrumentSelectionList instrumentSelectionList) {
    this.instrumentSelectionList = instrumentSelectionList;
  }


  public StockNotationScreenerSearchDataValidation notationSelectionList(StockNotationScreenerSearchDataValidationNotationSelectionList notationSelectionList) {
    this.notationSelectionList = notationSelectionList;
    return this;
  }

   /**
   * Get notationSelectionList
   * @return notationSelectionList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NOTATION_SELECTION_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StockNotationScreenerSearchDataValidationNotationSelectionList getNotationSelectionList() {
    return notationSelectionList;
  }


  @JsonProperty(JSON_PROPERTY_NOTATION_SELECTION_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNotationSelectionList(StockNotationScreenerSearchDataValidationNotationSelectionList notationSelectionList) {
    this.notationSelectionList = notationSelectionList;
  }


  /**
   * Return true if this _stock_notation_screener_search_data_validation object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StockNotationScreenerSearchDataValidation stockNotationScreenerSearchDataValidation = (StockNotationScreenerSearchDataValidation) o;
    return Objects.equals(this.onlyActive, stockNotationScreenerSearchDataValidation.onlyActive) &&
        Objects.equals(this.onlyNotSuspended, stockNotationScreenerSearchDataValidation.onlyNotSuspended) &&
        Objects.equals(this.prices, stockNotationScreenerSearchDataValidation.prices) &&
        Objects.equals(this.valueUnit, stockNotationScreenerSearchDataValidation.valueUnit) &&
        Objects.equals(this.market, stockNotationScreenerSearchDataValidation.market) &&
        Objects.equals(this.instrumentSelectionList, stockNotationScreenerSearchDataValidation.instrumentSelectionList) &&
        Objects.equals(this.notationSelectionList, stockNotationScreenerSearchDataValidation.notationSelectionList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(onlyActive, onlyNotSuspended, prices, valueUnit, market, instrumentSelectionList, notationSelectionList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StockNotationScreenerSearchDataValidation {\n");
    sb.append("    onlyActive: ").append(toIndentedString(onlyActive)).append("\n");
    sb.append("    onlyNotSuspended: ").append(toIndentedString(onlyNotSuspended)).append("\n");
    sb.append("    prices: ").append(toIndentedString(prices)).append("\n");
    sb.append("    valueUnit: ").append(toIndentedString(valueUnit)).append("\n");
    sb.append("    market: ").append(toIndentedString(market)).append("\n");
    sb.append("    instrumentSelectionList: ").append(toIndentedString(instrumentSelectionList)).append("\n");
    sb.append("    notationSelectionList: ").append(toIndentedString(notationSelectionList)).append("\n");
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

