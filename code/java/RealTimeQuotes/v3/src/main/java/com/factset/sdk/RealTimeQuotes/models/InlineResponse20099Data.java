/*
 * Quotes API For Digital Portals
 * The Quotes API combines endpoints for retrieving security end-of-day, delayed, and realtime prices with performance key figures and basic reference data on the security and market level.  The API supports over 20 different price types for each quote and comes with basic search endpoints based on security identifiers and instrument names. Market coverage is included in the *Sample Use Cases* section below.  The Digital Portal use case is focused on high-performance applications that are  * serving millions of end-users, * accessible by client browsers via the internet, * supporting subscriptions for streamed updates out-of-the-box, * typically combining a wide variety of *for Digital Portals*-APIs into a highly use-case specific solution for customers, * integrated into complex infrastructures such as existing frontend frameworks, authentication services.  All APIs labelled *for Digital Portals* have been designed for direct use by client web applications and feature extreme low latency: The average response time across all endpoints is 30 ms whereas 99% of all requests are answered in close to under 300ms.  See the [Time Series API for Digital Portals](https://developer.factset.com/api-catalog/time-series-api-digital-portals) for direct access to price histories, and the [News API for Digital Portals](https://developer.factset.com/api-catalog/news-api-digital-portals) for searching and fetching related news. 
 *
 * The version of the OpenAPI document: 3.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.RealTimeQuotes.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.RealTimeQuotes.models.InlineResponse20046DataNotationFsym;
import com.factset.sdk.RealTimeQuotes.models.InlineResponse20071DataMarket;
import com.factset.sdk.RealTimeQuotes.models.InlineResponse20098Nsin;
import com.factset.sdk.RealTimeQuotes.models.InlineResponse20099Instrument;
import com.factset.sdk.RealTimeQuotes.models.InlineResponse20099Match;
import com.factset.sdk.RealTimeQuotes.models.InlineResponse20099ValueUnit;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.RealTimeQuotes.JSON;


/**
 * InlineResponse20099Data
 */
@JsonPropertyOrder({
  InlineResponse20099Data.JSON_PROPERTY_ID,
  InlineResponse20099Data.JSON_PROPERTY_VALUE_UNIT,
  InlineResponse20099Data.JSON_PROPERTY_MARKET,
  InlineResponse20099Data.JSON_PROPERTY_SYMBOL,
  InlineResponse20099Data.JSON_PROPERTY_NSIN,
  InlineResponse20099Data.JSON_PROPERTY_FSYM,
  InlineResponse20099Data.JSON_PROPERTY_INSTRUMENT,
  InlineResponse20099Data.JSON_PROPERTY_MATCH,
  InlineResponse20099Data.JSON_PROPERTY_AVERAGE_INDICATIVE_TRADING_VALUE30_T_D
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse20099Data implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ID = "id";
  private JsonNullable<String> id = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_VALUE_UNIT = "valueUnit";
  private InlineResponse20099ValueUnit valueUnit;

  public static final String JSON_PROPERTY_MARKET = "market";
  private InlineResponse20071DataMarket market;

  public static final String JSON_PROPERTY_SYMBOL = "symbol";
  private JsonNullable<String> symbol = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_NSIN = "nsin";
  private InlineResponse20098Nsin nsin;

  public static final String JSON_PROPERTY_FSYM = "fsym";
  private InlineResponse20046DataNotationFsym fsym;

  public static final String JSON_PROPERTY_INSTRUMENT = "instrument";
  private InlineResponse20099Instrument instrument;

  public static final String JSON_PROPERTY_MATCH = "match";
  private InlineResponse20099Match match;

  public static final String JSON_PROPERTY_AVERAGE_INDICATIVE_TRADING_VALUE30_T_D = "averageIndicativeTradingValue30TD";
  private JsonNullable<BigDecimal> averageIndicativeTradingValue30TD = JsonNullable.<BigDecimal>undefined();

  public InlineResponse20099Data() { 
  }

  public InlineResponse20099Data id(String id) {
    this.id = JsonNullable.<String>of(id);
    return this;
  }

   /**
   * Identifier of a notation.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Identifier of a notation.")
  @JsonIgnore

  public String getId() {
        return id.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getId_JsonNullable() {
    return id;
  }
  
  @JsonProperty(JSON_PROPERTY_ID)
  public void setId_JsonNullable(JsonNullable<String> id) {
    this.id = id;
  }

  public void setId(String id) {
    this.id = JsonNullable.<String>of(id);
  }


  public InlineResponse20099Data valueUnit(InlineResponse20099ValueUnit valueUnit) {
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

  public InlineResponse20099ValueUnit getValueUnit() {
    return valueUnit;
  }


  @JsonProperty(JSON_PROPERTY_VALUE_UNIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValueUnit(InlineResponse20099ValueUnit valueUnit) {
    this.valueUnit = valueUnit;
  }


  public InlineResponse20099Data market(InlineResponse20071DataMarket market) {
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

  public InlineResponse20071DataMarket getMarket() {
    return market;
  }


  @JsonProperty(JSON_PROPERTY_MARKET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMarket(InlineResponse20071DataMarket market) {
    this.market = market;
  }


  public InlineResponse20099Data symbol(String symbol) {
    this.symbol = JsonNullable.<String>of(symbol);
    return this;
  }

   /**
   * The symbol of the notation. It is a market-specific code to identify the notation. Which characters can be part of a symbol depends on the market. If a market does not define a proprietary symbol, but uses a different identifier (for example, the ISIN or the WKN) to identify instruments, no symbol will be set for the notations of that market.
   * @return symbol
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The symbol of the notation. It is a market-specific code to identify the notation. Which characters can be part of a symbol depends on the market. If a market does not define a proprietary symbol, but uses a different identifier (for example, the ISIN or the WKN) to identify instruments, no symbol will be set for the notations of that market.")
  @JsonIgnore

  public String getSymbol() {
        return symbol.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SYMBOL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getSymbol_JsonNullable() {
    return symbol;
  }
  
  @JsonProperty(JSON_PROPERTY_SYMBOL)
  public void setSymbol_JsonNullable(JsonNullable<String> symbol) {
    this.symbol = symbol;
  }

  public void setSymbol(String symbol) {
    this.symbol = JsonNullable.<String>of(symbol);
  }


  public InlineResponse20099Data nsin(InlineResponse20098Nsin nsin) {
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

  public InlineResponse20098Nsin getNsin() {
    return nsin;
  }


  @JsonProperty(JSON_PROPERTY_NSIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNsin(InlineResponse20098Nsin nsin) {
    this.nsin = nsin;
  }


  public InlineResponse20099Data fsym(InlineResponse20046DataNotationFsym fsym) {
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

  public InlineResponse20046DataNotationFsym getFsym() {
    return fsym;
  }


  @JsonProperty(JSON_PROPERTY_FSYM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFsym(InlineResponse20046DataNotationFsym fsym) {
    this.fsym = fsym;
  }


  public InlineResponse20099Data instrument(InlineResponse20099Instrument instrument) {
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

  public InlineResponse20099Instrument getInstrument() {
    return instrument;
  }


  @JsonProperty(JSON_PROPERTY_INSTRUMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInstrument(InlineResponse20099Instrument instrument) {
    this.instrument = instrument;
  }


  public InlineResponse20099Data match(InlineResponse20099Match match) {
    this.match = match;
    return this;
  }

   /**
   * Get match
   * @return match
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MATCH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse20099Match getMatch() {
    return match;
  }


  @JsonProperty(JSON_PROPERTY_MATCH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMatch(InlineResponse20099Match match) {
    this.match = match;
  }


  public InlineResponse20099Data averageIndicativeTradingValue30TD(BigDecimal averageIndicativeTradingValue30TD) {
    this.averageIndicativeTradingValue30TD = JsonNullable.<BigDecimal>of(averageIndicativeTradingValue30TD);
    return this;
  }

   /**
   * Indicative daily average trading value in US dollars for the past 30 trading days. The average cash flow is converted from the notation&#39;s trading currency to US dollars using a single exchange rate determined at the end of the period.
   * @return averageIndicativeTradingValue30TD
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicative daily average trading value in US dollars for the past 30 trading days. The average cash flow is converted from the notation's trading currency to US dollars using a single exchange rate determined at the end of the period.")
  @JsonIgnore

  public BigDecimal getAverageIndicativeTradingValue30TD() {
        return averageIndicativeTradingValue30TD.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_AVERAGE_INDICATIVE_TRADING_VALUE30_T_D)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<BigDecimal> getAverageIndicativeTradingValue30TD_JsonNullable() {
    return averageIndicativeTradingValue30TD;
  }
  
  @JsonProperty(JSON_PROPERTY_AVERAGE_INDICATIVE_TRADING_VALUE30_T_D)
  public void setAverageIndicativeTradingValue30TD_JsonNullable(JsonNullable<BigDecimal> averageIndicativeTradingValue30TD) {
    this.averageIndicativeTradingValue30TD = averageIndicativeTradingValue30TD;
  }

  public void setAverageIndicativeTradingValue30TD(BigDecimal averageIndicativeTradingValue30TD) {
    this.averageIndicativeTradingValue30TD = JsonNullable.<BigDecimal>of(averageIndicativeTradingValue30TD);
  }


  /**
   * Return true if this inline_response_200_99_data object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20099Data inlineResponse20099Data = (InlineResponse20099Data) o;
    return equalsNullable(this.id, inlineResponse20099Data.id) &&
        Objects.equals(this.valueUnit, inlineResponse20099Data.valueUnit) &&
        Objects.equals(this.market, inlineResponse20099Data.market) &&
        equalsNullable(this.symbol, inlineResponse20099Data.symbol) &&
        Objects.equals(this.nsin, inlineResponse20099Data.nsin) &&
        Objects.equals(this.fsym, inlineResponse20099Data.fsym) &&
        Objects.equals(this.instrument, inlineResponse20099Data.instrument) &&
        Objects.equals(this.match, inlineResponse20099Data.match) &&
        equalsNullable(this.averageIndicativeTradingValue30TD, inlineResponse20099Data.averageIndicativeTradingValue30TD);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(id), valueUnit, market, hashCodeNullable(symbol), nsin, fsym, instrument, match, hashCodeNullable(averageIndicativeTradingValue30TD));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20099Data {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    valueUnit: ").append(toIndentedString(valueUnit)).append("\n");
    sb.append("    market: ").append(toIndentedString(market)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    nsin: ").append(toIndentedString(nsin)).append("\n");
    sb.append("    fsym: ").append(toIndentedString(fsym)).append("\n");
    sb.append("    instrument: ").append(toIndentedString(instrument)).append("\n");
    sb.append("    match: ").append(toIndentedString(match)).append("\n");
    sb.append("    averageIndicativeTradingValue30TD: ").append(toIndentedString(averageIndicativeTradingValue30TD)).append("\n");
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

