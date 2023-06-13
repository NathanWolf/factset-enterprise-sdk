/*
 * Quotes API For Digital Portals
 * The Quotes API combines endpoints for retrieving security end-of-day, delayed, and realtime prices with performance key figures and basic reference data on the security and market level.  The API supports over 20 different price types for each quote and comes with basic search endpoints based on security identifiers and instrument names. Market coverage is included in the *Sample Use Cases* section below.  The Digital Portal use case is focused on high-performance applications that are  * serving millions of end-users, * accessible by client browsers via the internet, * supporting subscriptions for streamed updates out-of-the-box, * typically combining a wide variety of *for Digital Portals*-APIs into a highly use-case specific solution for customers, * integrated into complex infrastructures such as existing frontend frameworks, authentication services.  All APIs labelled *for Digital Portals* have been designed for direct use by client web applications and feature extreme low latency: The average response time across all endpoints is 30 ms whereas 99% of all requests are answered in close to under 300ms.  See the [Time Series API for Digital Portals](https://developer.factset.com/api-catalog/time-series-api-digital-portals) for direct access to price histories, and the [News API for Digital Portals](https://developer.factset.com/api-catalog/news-api-digital-portals) for searching and fetching related news. 
 *
 * The version of the OpenAPI document: 2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.QuotesAPIforDigitalPortals.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20083DataMarket;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20083DataRegional;
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
import com.factset.sdk.QuotesAPIforDigitalPortals.JSON;


/**
 * InlineResponse20083Data
 */
@JsonPropertyOrder({
  InlineResponse20083Data.JSON_PROPERTY_ID_NOTATION,
  InlineResponse20083Data.JSON_PROPERTY_SOURCE_IDENTIFIER,
  InlineResponse20083Data.JSON_PROPERTY_SUSPENDED,
  InlineResponse20083Data.JSON_PROPERTY_TRADING_STATUS,
  InlineResponse20083Data.JSON_PROPERTY_PRICE_DELAY,
  InlineResponse20083Data.JSON_PROPERTY_TICK_SIZE,
  InlineResponse20083Data.JSON_PROPERTY_LOT_SIZE,
  InlineResponse20083Data.JSON_PROPERTY_MARKET,
  InlineResponse20083Data.JSON_PROPERTY_REGIONAL
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse20083Data implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ID_NOTATION = "idNotation";
  private JsonNullable<String> idNotation = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SOURCE_IDENTIFIER = "sourceIdentifier";
  private JsonNullable<String> sourceIdentifier = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SUSPENDED = "suspended";
  private JsonNullable<Boolean> suspended = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_TRADING_STATUS = "tradingStatus";
  private JsonNullable<String> tradingStatus = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PRICE_DELAY = "priceDelay";
  private JsonNullable<BigDecimal> priceDelay = JsonNullable.<BigDecimal>undefined();

  public static final String JSON_PROPERTY_TICK_SIZE = "tickSize";
  private JsonNullable<BigDecimal> tickSize = JsonNullable.<BigDecimal>undefined();

  public static final String JSON_PROPERTY_LOT_SIZE = "lotSize";
  private JsonNullable<BigDecimal> lotSize = JsonNullable.<BigDecimal>undefined();

  public static final String JSON_PROPERTY_MARKET = "market";
  private InlineResponse20083DataMarket market;

  public static final String JSON_PROPERTY_REGIONAL = "regional";
  private InlineResponse20083DataRegional regional;

  public InlineResponse20083Data() { 
  }

  public InlineResponse20083Data idNotation(String idNotation) {
    this.idNotation = JsonNullable.<String>of(idNotation);
    return this;
  }

   /**
   * MDG identifier of the listing.
   * @return idNotation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "MDG identifier of the listing.")
  @JsonIgnore

  public String getIdNotation() {
        return idNotation.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ID_NOTATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getIdNotation_JsonNullable() {
    return idNotation;
  }
  
  @JsonProperty(JSON_PROPERTY_ID_NOTATION)
  public void setIdNotation_JsonNullable(JsonNullable<String> idNotation) {
    this.idNotation = idNotation;
  }

  public void setIdNotation(String idNotation) {
    this.idNotation = JsonNullable.<String>of(idNotation);
  }


  public InlineResponse20083Data sourceIdentifier(String sourceIdentifier) {
    this.sourceIdentifier = JsonNullable.<String>of(sourceIdentifier);
    return this;
  }

   /**
   * Identifier used in the request.
   * @return sourceIdentifier
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Identifier used in the request.")
  @JsonIgnore

  public String getSourceIdentifier() {
        return sourceIdentifier.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SOURCE_IDENTIFIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getSourceIdentifier_JsonNullable() {
    return sourceIdentifier;
  }
  
  @JsonProperty(JSON_PROPERTY_SOURCE_IDENTIFIER)
  public void setSourceIdentifier_JsonNullable(JsonNullable<String> sourceIdentifier) {
    this.sourceIdentifier = sourceIdentifier;
  }

  public void setSourceIdentifier(String sourceIdentifier) {
    this.sourceIdentifier = JsonNullable.<String>of(sourceIdentifier);
  }


  public InlineResponse20083Data suspended(Boolean suspended) {
    this.suspended = JsonNullable.<Boolean>of(suspended);
    return this;
  }

   /**
   * Indicates whether the notation is currently suspended from trading. The notation is tradable if it is not suspended and the market is open, see attribute &#x60;market.isOpen&#x60;.
   * @return suspended
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether the notation is currently suspended from trading. The notation is tradable if it is not suspended and the market is open, see attribute `market.isOpen`.")
  @JsonIgnore

  public Boolean getSuspended() {
        return suspended.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SUSPENDED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Boolean> getSuspended_JsonNullable() {
    return suspended;
  }
  
  @JsonProperty(JSON_PROPERTY_SUSPENDED)
  public void setSuspended_JsonNullable(JsonNullable<Boolean> suspended) {
    this.suspended = suspended;
  }

  public void setSuspended(Boolean suspended) {
    this.suspended = JsonNullable.<Boolean>of(suspended);
  }


  public InlineResponse20083Data tradingStatus(String tradingStatus) {
    this.tradingStatus = JsonNullable.<String>of(tradingStatus);
    return this;
  }

   /**
   * Market-specific code of the trading status and/or the suspension of the notation.
   * @return tradingStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Market-specific code of the trading status and/or the suspension of the notation.")
  @JsonIgnore

  public String getTradingStatus() {
        return tradingStatus.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TRADING_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getTradingStatus_JsonNullable() {
    return tradingStatus;
  }
  
  @JsonProperty(JSON_PROPERTY_TRADING_STATUS)
  public void setTradingStatus_JsonNullable(JsonNullable<String> tradingStatus) {
    this.tradingStatus = tradingStatus;
  }

  public void setTradingStatus(String tradingStatus) {
    this.tradingStatus = JsonNullable.<String>of(tradingStatus);
  }


  public InlineResponse20083Data priceDelay(BigDecimal priceDelay) {
    this.priceDelay = JsonNullable.<BigDecimal>of(priceDelay);
    return this;
  }

   /**
   * Exchange-imposed delay in seconds for delayed-quality tick data.
   * @return priceDelay
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Exchange-imposed delay in seconds for delayed-quality tick data.")
  @JsonIgnore

  public BigDecimal getPriceDelay() {
        return priceDelay.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PRICE_DELAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<BigDecimal> getPriceDelay_JsonNullable() {
    return priceDelay;
  }
  
  @JsonProperty(JSON_PROPERTY_PRICE_DELAY)
  public void setPriceDelay_JsonNullable(JsonNullable<BigDecimal> priceDelay) {
    this.priceDelay = priceDelay;
  }

  public void setPriceDelay(BigDecimal priceDelay) {
    this.priceDelay = JsonNullable.<BigDecimal>of(priceDelay);
  }


  public InlineResponse20083Data tickSize(BigDecimal tickSize) {
    this.tickSize = JsonNullable.<BigDecimal>of(tickSize);
    return this;
  }

   /**
   * The minimum price movement of the notation. Prices can only be integral multiples of this minimum value. See endpoint &#x60;/notation/get&#x60; for the value unit of the &#x60;tickSize&#x60; for this notation.
   * @return tickSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The minimum price movement of the notation. Prices can only be integral multiples of this minimum value. See endpoint `/notation/get` for the value unit of the `tickSize` for this notation.")
  @JsonIgnore

  public BigDecimal getTickSize() {
        return tickSize.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TICK_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<BigDecimal> getTickSize_JsonNullable() {
    return tickSize;
  }
  
  @JsonProperty(JSON_PROPERTY_TICK_SIZE)
  public void setTickSize_JsonNullable(JsonNullable<BigDecimal> tickSize) {
    this.tickSize = tickSize;
  }

  public void setTickSize(BigDecimal tickSize) {
    this.tickSize = JsonNullable.<BigDecimal>of(tickSize);
  }


  public InlineResponse20083Data lotSize(BigDecimal lotSize) {
    this.lotSize = JsonNullable.<BigDecimal>of(lotSize);
    return this;
  }

   /**
   * he minimum tradable volume of the notation. The number of units traded can only be integral multiples of this minimum value.
   * @return lotSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "he minimum tradable volume of the notation. The number of units traded can only be integral multiples of this minimum value.")
  @JsonIgnore

  public BigDecimal getLotSize() {
        return lotSize.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LOT_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<BigDecimal> getLotSize_JsonNullable() {
    return lotSize;
  }
  
  @JsonProperty(JSON_PROPERTY_LOT_SIZE)
  public void setLotSize_JsonNullable(JsonNullable<BigDecimal> lotSize) {
    this.lotSize = lotSize;
  }

  public void setLotSize(BigDecimal lotSize) {
    this.lotSize = JsonNullable.<BigDecimal>of(lotSize);
  }


  public InlineResponse20083Data market(InlineResponse20083DataMarket market) {
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

  public InlineResponse20083DataMarket getMarket() {
    return market;
  }


  @JsonProperty(JSON_PROPERTY_MARKET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMarket(InlineResponse20083DataMarket market) {
    this.market = market;
  }


  public InlineResponse20083Data regional(InlineResponse20083DataRegional regional) {
    this.regional = regional;
    return this;
  }

   /**
   * Get regional
   * @return regional
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REGIONAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse20083DataRegional getRegional() {
    return regional;
  }


  @JsonProperty(JSON_PROPERTY_REGIONAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRegional(InlineResponse20083DataRegional regional) {
    this.regional = regional;
  }


  /**
   * Return true if this inline_response_200_83_data object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20083Data inlineResponse20083Data = (InlineResponse20083Data) o;
    return equalsNullable(this.idNotation, inlineResponse20083Data.idNotation) &&
        equalsNullable(this.sourceIdentifier, inlineResponse20083Data.sourceIdentifier) &&
        equalsNullable(this.suspended, inlineResponse20083Data.suspended) &&
        equalsNullable(this.tradingStatus, inlineResponse20083Data.tradingStatus) &&
        equalsNullable(this.priceDelay, inlineResponse20083Data.priceDelay) &&
        equalsNullable(this.tickSize, inlineResponse20083Data.tickSize) &&
        equalsNullable(this.lotSize, inlineResponse20083Data.lotSize) &&
        Objects.equals(this.market, inlineResponse20083Data.market) &&
        Objects.equals(this.regional, inlineResponse20083Data.regional);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(idNotation), hashCodeNullable(sourceIdentifier), hashCodeNullable(suspended), hashCodeNullable(tradingStatus), hashCodeNullable(priceDelay), hashCodeNullable(tickSize), hashCodeNullable(lotSize), market, regional);
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
    sb.append("class InlineResponse20083Data {\n");
    sb.append("    idNotation: ").append(toIndentedString(idNotation)).append("\n");
    sb.append("    sourceIdentifier: ").append(toIndentedString(sourceIdentifier)).append("\n");
    sb.append("    suspended: ").append(toIndentedString(suspended)).append("\n");
    sb.append("    tradingStatus: ").append(toIndentedString(tradingStatus)).append("\n");
    sb.append("    priceDelay: ").append(toIndentedString(priceDelay)).append("\n");
    sb.append("    tickSize: ").append(toIndentedString(tickSize)).append("\n");
    sb.append("    lotSize: ").append(toIndentedString(lotSize)).append("\n");
    sb.append("    market: ").append(toIndentedString(market)).append("\n");
    sb.append("    regional: ").append(toIndentedString(regional)).append("\n");
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

