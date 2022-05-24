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
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse2003Fsym;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse2004Compliance;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse2004Estimates;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse2004Instrument;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse2004Market;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse2004Nsin;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse2004Performance;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse2004Recommendation;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse2004ReportedKeyFigures;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse2004RsiWilder;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse2004SimpleMovingAverage;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse2004TradingValue;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse2004ValueUnit;
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse2004Volatility;
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
 * InlineResponse2004Data
 */
@JsonPropertyOrder({
  InlineResponse2004Data.JSON_PROPERTY_ID,
  InlineResponse2004Data.JSON_PROPERTY_VALUE_UNIT,
  InlineResponse2004Data.JSON_PROPERTY_MARKET,
  InlineResponse2004Data.JSON_PROPERTY_SYMBOL,
  InlineResponse2004Data.JSON_PROPERTY_NSIN,
  InlineResponse2004Data.JSON_PROPERTY_FSYM,
  InlineResponse2004Data.JSON_PROPERTY_INSTRUMENT,
  InlineResponse2004Data.JSON_PROPERTY_COMPLIANCE,
  InlineResponse2004Data.JSON_PROPERTY_REPORTED_KEY_FIGURES,
  InlineResponse2004Data.JSON_PROPERTY_PERFORMANCE,
  InlineResponse2004Data.JSON_PROPERTY_VOLATILITY,
  InlineResponse2004Data.JSON_PROPERTY_TRADING_VALUE,
  InlineResponse2004Data.JSON_PROPERTY_SIMPLE_MOVING_AVERAGE,
  InlineResponse2004Data.JSON_PROPERTY_RSI_WILDER,
  InlineResponse2004Data.JSON_PROPERTY_RECOMMENDATION,
  InlineResponse2004Data.JSON_PROPERTY_ESTIMATES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse2004Data implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_VALUE_UNIT = "valueUnit";
  private InlineResponse2004ValueUnit valueUnit;

  public static final String JSON_PROPERTY_MARKET = "market";
  private InlineResponse2004Market market;

  public static final String JSON_PROPERTY_SYMBOL = "symbol";
  private String symbol;

  public static final String JSON_PROPERTY_NSIN = "nsin";
  private InlineResponse2004Nsin nsin;

  public static final String JSON_PROPERTY_FSYM = "fsym";
  private InlineResponse2003Fsym fsym;

  public static final String JSON_PROPERTY_INSTRUMENT = "instrument";
  private InlineResponse2004Instrument instrument;

  public static final String JSON_PROPERTY_COMPLIANCE = "compliance";
  private InlineResponse2004Compliance compliance;

  public static final String JSON_PROPERTY_REPORTED_KEY_FIGURES = "reportedKeyFigures";
  private InlineResponse2004ReportedKeyFigures reportedKeyFigures;

  public static final String JSON_PROPERTY_PERFORMANCE = "performance";
  private InlineResponse2004Performance performance;

  public static final String JSON_PROPERTY_VOLATILITY = "volatility";
  private InlineResponse2004Volatility volatility;

  public static final String JSON_PROPERTY_TRADING_VALUE = "tradingValue";
  private InlineResponse2004TradingValue tradingValue;

  public static final String JSON_PROPERTY_SIMPLE_MOVING_AVERAGE = "simpleMovingAverage";
  private InlineResponse2004SimpleMovingAverage simpleMovingAverage;

  public static final String JSON_PROPERTY_RSI_WILDER = "rsiWilder";
  private InlineResponse2004RsiWilder rsiWilder;

  public static final String JSON_PROPERTY_RECOMMENDATION = "recommendation";
  private InlineResponse2004Recommendation recommendation;

  public static final String JSON_PROPERTY_ESTIMATES = "estimates";
  private InlineResponse2004Estimates estimates;

  public InlineResponse2004Data() { 
  }

  public InlineResponse2004Data id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Identifier of the notation.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Identifier of the notation.")
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


  public InlineResponse2004Data valueUnit(InlineResponse2004ValueUnit valueUnit) {
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

  public InlineResponse2004ValueUnit getValueUnit() {
    return valueUnit;
  }


  @JsonProperty(JSON_PROPERTY_VALUE_UNIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValueUnit(InlineResponse2004ValueUnit valueUnit) {
    this.valueUnit = valueUnit;
  }


  public InlineResponse2004Data market(InlineResponse2004Market market) {
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

  public InlineResponse2004Market getMarket() {
    return market;
  }


  @JsonProperty(JSON_PROPERTY_MARKET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMarket(InlineResponse2004Market market) {
    this.market = market;
  }


  public InlineResponse2004Data symbol(String symbol) {
    this.symbol = symbol;
    return this;
  }

   /**
   * The symbol of the notation. It is a market-specific code to identify the notation. Which characters can be part of a symbol depends on the market. If a market does not define a proprietary symbol, but uses a different identifier (for example, the ISIN or the WKN) to identify instruments, no symbol will be set for the notations of that market.
   * @return symbol
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The symbol of the notation. It is a market-specific code to identify the notation. Which characters can be part of a symbol depends on the market. If a market does not define a proprietary symbol, but uses a different identifier (for example, the ISIN or the WKN) to identify instruments, no symbol will be set for the notations of that market.")
  @JsonProperty(JSON_PROPERTY_SYMBOL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSymbol() {
    return symbol;
  }


  @JsonProperty(JSON_PROPERTY_SYMBOL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }


  public InlineResponse2004Data nsin(InlineResponse2004Nsin nsin) {
    this.nsin = nsin;
    return this;
  }

   /**
   * Get nsin
   * @return nsin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NSIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2004Nsin getNsin() {
    return nsin;
  }


  @JsonProperty(JSON_PROPERTY_NSIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNsin(InlineResponse2004Nsin nsin) {
    this.nsin = nsin;
  }


  public InlineResponse2004Data fsym(InlineResponse2003Fsym fsym) {
    this.fsym = fsym;
    return this;
  }

   /**
   * Get fsym
   * @return fsym
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FSYM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2003Fsym getFsym() {
    return fsym;
  }


  @JsonProperty(JSON_PROPERTY_FSYM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFsym(InlineResponse2003Fsym fsym) {
    this.fsym = fsym;
  }


  public InlineResponse2004Data instrument(InlineResponse2004Instrument instrument) {
    this.instrument = instrument;
    return this;
  }

   /**
   * Get instrument
   * @return instrument
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INSTRUMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2004Instrument getInstrument() {
    return instrument;
  }


  @JsonProperty(JSON_PROPERTY_INSTRUMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInstrument(InlineResponse2004Instrument instrument) {
    this.instrument = instrument;
  }


  public InlineResponse2004Data compliance(InlineResponse2004Compliance compliance) {
    this.compliance = compliance;
    return this;
  }

   /**
   * Get compliance
   * @return compliance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_COMPLIANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2004Compliance getCompliance() {
    return compliance;
  }


  @JsonProperty(JSON_PROPERTY_COMPLIANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCompliance(InlineResponse2004Compliance compliance) {
    this.compliance = compliance;
  }


  public InlineResponse2004Data reportedKeyFigures(InlineResponse2004ReportedKeyFigures reportedKeyFigures) {
    this.reportedKeyFigures = reportedKeyFigures;
    return this;
  }

   /**
   * Get reportedKeyFigures
   * @return reportedKeyFigures
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REPORTED_KEY_FIGURES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2004ReportedKeyFigures getReportedKeyFigures() {
    return reportedKeyFigures;
  }


  @JsonProperty(JSON_PROPERTY_REPORTED_KEY_FIGURES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReportedKeyFigures(InlineResponse2004ReportedKeyFigures reportedKeyFigures) {
    this.reportedKeyFigures = reportedKeyFigures;
  }


  public InlineResponse2004Data performance(InlineResponse2004Performance performance) {
    this.performance = performance;
    return this;
  }

   /**
   * Get performance
   * @return performance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PERFORMANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2004Performance getPerformance() {
    return performance;
  }


  @JsonProperty(JSON_PROPERTY_PERFORMANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPerformance(InlineResponse2004Performance performance) {
    this.performance = performance;
  }


  public InlineResponse2004Data volatility(InlineResponse2004Volatility volatility) {
    this.volatility = volatility;
    return this;
  }

   /**
   * Get volatility
   * @return volatility
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VOLATILITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2004Volatility getVolatility() {
    return volatility;
  }


  @JsonProperty(JSON_PROPERTY_VOLATILITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVolatility(InlineResponse2004Volatility volatility) {
    this.volatility = volatility;
  }


  public InlineResponse2004Data tradingValue(InlineResponse2004TradingValue tradingValue) {
    this.tradingValue = tradingValue;
    return this;
  }

   /**
   * Get tradingValue
   * @return tradingValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TRADING_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2004TradingValue getTradingValue() {
    return tradingValue;
  }


  @JsonProperty(JSON_PROPERTY_TRADING_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTradingValue(InlineResponse2004TradingValue tradingValue) {
    this.tradingValue = tradingValue;
  }


  public InlineResponse2004Data simpleMovingAverage(InlineResponse2004SimpleMovingAverage simpleMovingAverage) {
    this.simpleMovingAverage = simpleMovingAverage;
    return this;
  }

   /**
   * Get simpleMovingAverage
   * @return simpleMovingAverage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SIMPLE_MOVING_AVERAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2004SimpleMovingAverage getSimpleMovingAverage() {
    return simpleMovingAverage;
  }


  @JsonProperty(JSON_PROPERTY_SIMPLE_MOVING_AVERAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSimpleMovingAverage(InlineResponse2004SimpleMovingAverage simpleMovingAverage) {
    this.simpleMovingAverage = simpleMovingAverage;
  }


  public InlineResponse2004Data rsiWilder(InlineResponse2004RsiWilder rsiWilder) {
    this.rsiWilder = rsiWilder;
    return this;
  }

   /**
   * Get rsiWilder
   * @return rsiWilder
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RSI_WILDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2004RsiWilder getRsiWilder() {
    return rsiWilder;
  }


  @JsonProperty(JSON_PROPERTY_RSI_WILDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRsiWilder(InlineResponse2004RsiWilder rsiWilder) {
    this.rsiWilder = rsiWilder;
  }


  public InlineResponse2004Data recommendation(InlineResponse2004Recommendation recommendation) {
    this.recommendation = recommendation;
    return this;
  }

   /**
   * Get recommendation
   * @return recommendation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RECOMMENDATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2004Recommendation getRecommendation() {
    return recommendation;
  }


  @JsonProperty(JSON_PROPERTY_RECOMMENDATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRecommendation(InlineResponse2004Recommendation recommendation) {
    this.recommendation = recommendation;
  }


  public InlineResponse2004Data estimates(InlineResponse2004Estimates estimates) {
    this.estimates = estimates;
    return this;
  }

   /**
   * Get estimates
   * @return estimates
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ESTIMATES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2004Estimates getEstimates() {
    return estimates;
  }


  @JsonProperty(JSON_PROPERTY_ESTIMATES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEstimates(InlineResponse2004Estimates estimates) {
    this.estimates = estimates;
  }


  /**
   * Return true if this inline_response_200_4_data object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2004Data inlineResponse2004Data = (InlineResponse2004Data) o;
    return Objects.equals(this.id, inlineResponse2004Data.id) &&
        Objects.equals(this.valueUnit, inlineResponse2004Data.valueUnit) &&
        Objects.equals(this.market, inlineResponse2004Data.market) &&
        Objects.equals(this.symbol, inlineResponse2004Data.symbol) &&
        Objects.equals(this.nsin, inlineResponse2004Data.nsin) &&
        Objects.equals(this.fsym, inlineResponse2004Data.fsym) &&
        Objects.equals(this.instrument, inlineResponse2004Data.instrument) &&
        Objects.equals(this.compliance, inlineResponse2004Data.compliance) &&
        Objects.equals(this.reportedKeyFigures, inlineResponse2004Data.reportedKeyFigures) &&
        Objects.equals(this.performance, inlineResponse2004Data.performance) &&
        Objects.equals(this.volatility, inlineResponse2004Data.volatility) &&
        Objects.equals(this.tradingValue, inlineResponse2004Data.tradingValue) &&
        Objects.equals(this.simpleMovingAverage, inlineResponse2004Data.simpleMovingAverage) &&
        Objects.equals(this.rsiWilder, inlineResponse2004Data.rsiWilder) &&
        Objects.equals(this.recommendation, inlineResponse2004Data.recommendation) &&
        Objects.equals(this.estimates, inlineResponse2004Data.estimates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, valueUnit, market, symbol, nsin, fsym, instrument, compliance, reportedKeyFigures, performance, volatility, tradingValue, simpleMovingAverage, rsiWilder, recommendation, estimates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2004Data {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    valueUnit: ").append(toIndentedString(valueUnit)).append("\n");
    sb.append("    market: ").append(toIndentedString(market)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    nsin: ").append(toIndentedString(nsin)).append("\n");
    sb.append("    fsym: ").append(toIndentedString(fsym)).append("\n");
    sb.append("    instrument: ").append(toIndentedString(instrument)).append("\n");
    sb.append("    compliance: ").append(toIndentedString(compliance)).append("\n");
    sb.append("    reportedKeyFigures: ").append(toIndentedString(reportedKeyFigures)).append("\n");
    sb.append("    performance: ").append(toIndentedString(performance)).append("\n");
    sb.append("    volatility: ").append(toIndentedString(volatility)).append("\n");
    sb.append("    tradingValue: ").append(toIndentedString(tradingValue)).append("\n");
    sb.append("    simpleMovingAverage: ").append(toIndentedString(simpleMovingAverage)).append("\n");
    sb.append("    rsiWilder: ").append(toIndentedString(rsiWilder)).append("\n");
    sb.append("    recommendation: ").append(toIndentedString(recommendation)).append("\n");
    sb.append("    estimates: ").append(toIndentedString(estimates)).append("\n");
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

