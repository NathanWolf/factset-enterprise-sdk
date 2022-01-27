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


package com.factset.sdk.BondsAPIforDigitalPortals.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.BondsAPIforDigitalPortals.models.InlineResponse2003Fsym;
import com.factset.sdk.BondsAPIforDigitalPortals.models.InlineResponse2003Instrument;
import com.factset.sdk.BondsAPIforDigitalPortals.models.InlineResponse2003Market;
import com.factset.sdk.BondsAPIforDigitalPortals.models.InlineResponse2003Nsin;
import com.factset.sdk.BondsAPIforDigitalPortals.models.InlineResponse2003Sensitivities;
import com.factset.sdk.BondsAPIforDigitalPortals.models.InlineResponse2003TradedValue;
import com.factset.sdk.BondsAPIforDigitalPortals.models.InlineResponse2003ValueUnit;
import com.factset.sdk.BondsAPIforDigitalPortals.models.InlineResponse2003Yield;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.BondsAPIforDigitalPortals.JSON;


/**
 * InlineResponse2003Data
 */
@JsonPropertyOrder({
  InlineResponse2003Data.JSON_PROPERTY_ID,
  InlineResponse2003Data.JSON_PROPERTY_VALUE_UNIT,
  InlineResponse2003Data.JSON_PROPERTY_MARKET,
  InlineResponse2003Data.JSON_PROPERTY_SYMBOL,
  InlineResponse2003Data.JSON_PROPERTY_NSIN,
  InlineResponse2003Data.JSON_PROPERTY_FSYM,
  InlineResponse2003Data.JSON_PROPERTY_INSTRUMENT,
  InlineResponse2003Data.JSON_PROPERTY_YIELD,
  InlineResponse2003Data.JSON_PROPERTY_MACAULAY_DURATION,
  InlineResponse2003Data.JSON_PROPERTY_SENSITIVITIES,
  InlineResponse2003Data.JSON_PROPERTY_TRADED_VALUE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse2003Data implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_VALUE_UNIT = "valueUnit";
  private InlineResponse2003ValueUnit valueUnit;

  public static final String JSON_PROPERTY_MARKET = "market";
  private InlineResponse2003Market market;

  public static final String JSON_PROPERTY_SYMBOL = "symbol";
  private String symbol;

  public static final String JSON_PROPERTY_NSIN = "nsin";
  private InlineResponse2003Nsin nsin;

  public static final String JSON_PROPERTY_FSYM = "fsym";
  private InlineResponse2003Fsym fsym;

  public static final String JSON_PROPERTY_INSTRUMENT = "instrument";
  private InlineResponse2003Instrument instrument;

  public static final String JSON_PROPERTY_YIELD = "yield";
  private InlineResponse2003Yield yield;

  public static final String JSON_PROPERTY_MACAULAY_DURATION = "macaulayDuration";
  private BigDecimal macaulayDuration;

  public static final String JSON_PROPERTY_SENSITIVITIES = "sensitivities";
  private InlineResponse2003Sensitivities sensitivities;

  public static final String JSON_PROPERTY_TRADED_VALUE = "tradedValue";
  private InlineResponse2003TradedValue tradedValue;


  public InlineResponse2003Data id(String id) {
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


  public InlineResponse2003Data valueUnit(InlineResponse2003ValueUnit valueUnit) {
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

  public InlineResponse2003ValueUnit getValueUnit() {
    return valueUnit;
  }


  @JsonProperty(JSON_PROPERTY_VALUE_UNIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValueUnit(InlineResponse2003ValueUnit valueUnit) {
    this.valueUnit = valueUnit;
  }


  public InlineResponse2003Data market(InlineResponse2003Market market) {
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

  public InlineResponse2003Market getMarket() {
    return market;
  }


  @JsonProperty(JSON_PROPERTY_MARKET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMarket(InlineResponse2003Market market) {
    this.market = market;
  }


  public InlineResponse2003Data symbol(String symbol) {
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


  public InlineResponse2003Data nsin(InlineResponse2003Nsin nsin) {
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

  public InlineResponse2003Nsin getNsin() {
    return nsin;
  }


  @JsonProperty(JSON_PROPERTY_NSIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNsin(InlineResponse2003Nsin nsin) {
    this.nsin = nsin;
  }


  public InlineResponse2003Data fsym(InlineResponse2003Fsym fsym) {
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


  public InlineResponse2003Data instrument(InlineResponse2003Instrument instrument) {
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

  public InlineResponse2003Instrument getInstrument() {
    return instrument;
  }


  @JsonProperty(JSON_PROPERTY_INSTRUMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInstrument(InlineResponse2003Instrument instrument) {
    this.instrument = instrument;
  }


  public InlineResponse2003Data yield(InlineResponse2003Yield yield) {
    this.yield = yield;
    return this;
  }

   /**
   * Get yield
   * @return yield
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_YIELD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2003Yield getYield() {
    return yield;
  }


  @JsonProperty(JSON_PROPERTY_YIELD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setYield(InlineResponse2003Yield yield) {
    this.yield = yield;
  }


  public InlineResponse2003Data macaulayDuration(BigDecimal macaulayDuration) {
    this.macaulayDuration = macaulayDuration;
    return this;
  }

   /**
   * Macaulay duration, which is the average period (in years) of capital commitment.
   * @return macaulayDuration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Macaulay duration, which is the average period (in years) of capital commitment.")
  @JsonProperty(JSON_PROPERTY_MACAULAY_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getMacaulayDuration() {
    return macaulayDuration;
  }


  @JsonProperty(JSON_PROPERTY_MACAULAY_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMacaulayDuration(BigDecimal macaulayDuration) {
    this.macaulayDuration = macaulayDuration;
  }


  public InlineResponse2003Data sensitivities(InlineResponse2003Sensitivities sensitivities) {
    this.sensitivities = sensitivities;
    return this;
  }

   /**
   * Get sensitivities
   * @return sensitivities
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SENSITIVITIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2003Sensitivities getSensitivities() {
    return sensitivities;
  }


  @JsonProperty(JSON_PROPERTY_SENSITIVITIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSensitivities(InlineResponse2003Sensitivities sensitivities) {
    this.sensitivities = sensitivities;
  }


  public InlineResponse2003Data tradedValue(InlineResponse2003TradedValue tradedValue) {
    this.tradedValue = tradedValue;
    return this;
  }

   /**
   * Get tradedValue
   * @return tradedValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TRADED_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2003TradedValue getTradedValue() {
    return tradedValue;
  }


  @JsonProperty(JSON_PROPERTY_TRADED_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTradedValue(InlineResponse2003TradedValue tradedValue) {
    this.tradedValue = tradedValue;
  }


  /**
   * Return true if this inline_response_200_3_data object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2003Data inlineResponse2003Data = (InlineResponse2003Data) o;
    return Objects.equals(this.id, inlineResponse2003Data.id) &&
        Objects.equals(this.valueUnit, inlineResponse2003Data.valueUnit) &&
        Objects.equals(this.market, inlineResponse2003Data.market) &&
        Objects.equals(this.symbol, inlineResponse2003Data.symbol) &&
        Objects.equals(this.nsin, inlineResponse2003Data.nsin) &&
        Objects.equals(this.fsym, inlineResponse2003Data.fsym) &&
        Objects.equals(this.instrument, inlineResponse2003Data.instrument) &&
        Objects.equals(this.yield, inlineResponse2003Data.yield) &&
        Objects.equals(this.macaulayDuration, inlineResponse2003Data.macaulayDuration) &&
        Objects.equals(this.sensitivities, inlineResponse2003Data.sensitivities) &&
        Objects.equals(this.tradedValue, inlineResponse2003Data.tradedValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, valueUnit, market, symbol, nsin, fsym, instrument, yield, macaulayDuration, sensitivities, tradedValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2003Data {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    valueUnit: ").append(toIndentedString(valueUnit)).append("\n");
    sb.append("    market: ").append(toIndentedString(market)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    nsin: ").append(toIndentedString(nsin)).append("\n");
    sb.append("    fsym: ").append(toIndentedString(fsym)).append("\n");
    sb.append("    instrument: ").append(toIndentedString(instrument)).append("\n");
    sb.append("    yield: ").append(toIndentedString(yield)).append("\n");
    sb.append("    macaulayDuration: ").append(toIndentedString(macaulayDuration)).append("\n");
    sb.append("    sensitivities: ").append(toIndentedString(sensitivities)).append("\n");
    sb.append("    tradedValue: ").append(toIndentedString(tradedValue)).append("\n");
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

