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
import com.factset.sdk.RealTimeQuotes.models.InlineResponse20089DataAccumulated;
import com.factset.sdk.RealTimeQuotes.models.InlineResponse20089DataCurrency;
import com.factset.sdk.RealTimeQuotes.models.InlineResponse20089DataFirst;
import com.factset.sdk.RealTimeQuotes.models.InlineResponse20089DataHigh;
import com.factset.sdk.RealTimeQuotes.models.InlineResponse20089DataLatest;
import com.factset.sdk.RealTimeQuotes.models.InlineResponse20089DataLow;
import com.factset.sdk.RealTimeQuotes.models.InlineResponse20089DataMarket;
import com.factset.sdk.RealTimeQuotes.models.InlineResponse20089DataPreviousClose;
import com.factset.sdk.RealTimeQuotes.models.InlineResponse20089DataValueUnit;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.RealTimeQuotes.JSON;


/**
 * Set of price related data for the notation.
 */
@ApiModel(description = "Set of price related data for the notation.")
@JsonPropertyOrder({
  InlineResponse20089Data.JSON_PROPERTY_ID_NOTATION,
  InlineResponse20089Data.JSON_PROPERTY_SOURCE_IDENTIFIER,
  InlineResponse20089Data.JSON_PROPERTY_VALUE_UNIT,
  InlineResponse20089Data.JSON_PROPERTY_CURRENCY,
  InlineResponse20089Data.JSON_PROPERTY_MARKET,
  InlineResponse20089Data.JSON_PROPERTY_QUALITY,
  InlineResponse20089Data.JSON_PROPERTY_LATEST,
  InlineResponse20089Data.JSON_PROPERTY_FIRST,
  InlineResponse20089Data.JSON_PROPERTY_LOW,
  InlineResponse20089Data.JSON_PROPERTY_HIGH,
  InlineResponse20089Data.JSON_PROPERTY_PREVIOUS_CLOSE,
  InlineResponse20089Data.JSON_PROPERTY_ACCUMULATED
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse20089Data implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ID_NOTATION = "idNotation";
  private JsonNullable<String> idNotation = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SOURCE_IDENTIFIER = "sourceIdentifier";
  private JsonNullable<String> sourceIdentifier = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_VALUE_UNIT = "valueUnit";
  private InlineResponse20089DataValueUnit valueUnit;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  private InlineResponse20089DataCurrency currency;

  public static final String JSON_PROPERTY_MARKET = "market";
  private InlineResponse20089DataMarket market;

  /**
   * Quality of the price.
   */
  public enum QualityEnum {
    RLT("RLT"),
    
    DLY("DLY"),
    
    EOD("EOD");

    private String value;

    QualityEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static QualityEnum fromValue(String value) {
      for (QualityEnum b : QualityEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  public static final String JSON_PROPERTY_QUALITY = "quality";
  private JsonNullable<QualityEnum> quality = JsonNullable.<QualityEnum>undefined();

  public static final String JSON_PROPERTY_LATEST = "latest";
  private InlineResponse20089DataLatest latest;

  public static final String JSON_PROPERTY_FIRST = "first";
  private InlineResponse20089DataFirst first;

  public static final String JSON_PROPERTY_LOW = "low";
  private InlineResponse20089DataLow low;

  public static final String JSON_PROPERTY_HIGH = "high";
  private InlineResponse20089DataHigh high;

  public static final String JSON_PROPERTY_PREVIOUS_CLOSE = "previousClose";
  private InlineResponse20089DataPreviousClose previousClose;

  public static final String JSON_PROPERTY_ACCUMULATED = "accumulated";
  private InlineResponse20089DataAccumulated accumulated;

  public InlineResponse20089Data() { 
  }

  public InlineResponse20089Data idNotation(String idNotation) {
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


  public InlineResponse20089Data sourceIdentifier(String sourceIdentifier) {
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


  public InlineResponse20089Data valueUnit(InlineResponse20089DataValueUnit valueUnit) {
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

  public InlineResponse20089DataValueUnit getValueUnit() {
    return valueUnit;
  }


  @JsonProperty(JSON_PROPERTY_VALUE_UNIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValueUnit(InlineResponse20089DataValueUnit valueUnit) {
    this.valueUnit = valueUnit;
  }


  public InlineResponse20089Data currency(InlineResponse20089DataCurrency currency) {
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

  public InlineResponse20089DataCurrency getCurrency() {
    return currency;
  }


  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrency(InlineResponse20089DataCurrency currency) {
    this.currency = currency;
  }


  public InlineResponse20089Data market(InlineResponse20089DataMarket market) {
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

  public InlineResponse20089DataMarket getMarket() {
    return market;
  }


  @JsonProperty(JSON_PROPERTY_MARKET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMarket(InlineResponse20089DataMarket market) {
    this.market = market;
  }


  public InlineResponse20089Data quality(QualityEnum quality) {
    this.quality = JsonNullable.<QualityEnum>of(quality);
    return this;
  }

   /**
   * Quality of the price.
   * @return quality
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Quality of the price.")
  @JsonIgnore

  public QualityEnum getQuality() {
        return quality.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_QUALITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<QualityEnum> getQuality_JsonNullable() {
    return quality;
  }
  
  @JsonProperty(JSON_PROPERTY_QUALITY)
  public void setQuality_JsonNullable(JsonNullable<QualityEnum> quality) {
    this.quality = quality;
  }

  public void setQuality(QualityEnum quality) {
    this.quality = JsonNullable.<QualityEnum>of(quality);
  }


  public InlineResponse20089Data latest(InlineResponse20089DataLatest latest) {
    this.latest = latest;
    return this;
  }

   /**
   * Get latest
   * @return latest
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LATEST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse20089DataLatest getLatest() {
    return latest;
  }


  @JsonProperty(JSON_PROPERTY_LATEST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLatest(InlineResponse20089DataLatest latest) {
    this.latest = latest;
  }


  public InlineResponse20089Data first(InlineResponse20089DataFirst first) {
    this.first = first;
    return this;
  }

   /**
   * Get first
   * @return first
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FIRST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse20089DataFirst getFirst() {
    return first;
  }


  @JsonProperty(JSON_PROPERTY_FIRST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFirst(InlineResponse20089DataFirst first) {
    this.first = first;
  }


  public InlineResponse20089Data low(InlineResponse20089DataLow low) {
    this.low = low;
    return this;
  }

   /**
   * Get low
   * @return low
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LOW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse20089DataLow getLow() {
    return low;
  }


  @JsonProperty(JSON_PROPERTY_LOW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLow(InlineResponse20089DataLow low) {
    this.low = low;
  }


  public InlineResponse20089Data high(InlineResponse20089DataHigh high) {
    this.high = high;
    return this;
  }

   /**
   * Get high
   * @return high
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_HIGH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse20089DataHigh getHigh() {
    return high;
  }


  @JsonProperty(JSON_PROPERTY_HIGH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHigh(InlineResponse20089DataHigh high) {
    this.high = high;
  }


  public InlineResponse20089Data previousClose(InlineResponse20089DataPreviousClose previousClose) {
    this.previousClose = previousClose;
    return this;
  }

   /**
   * Get previousClose
   * @return previousClose
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PREVIOUS_CLOSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse20089DataPreviousClose getPreviousClose() {
    return previousClose;
  }


  @JsonProperty(JSON_PROPERTY_PREVIOUS_CLOSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPreviousClose(InlineResponse20089DataPreviousClose previousClose) {
    this.previousClose = previousClose;
  }


  public InlineResponse20089Data accumulated(InlineResponse20089DataAccumulated accumulated) {
    this.accumulated = accumulated;
    return this;
  }

   /**
   * Get accumulated
   * @return accumulated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ACCUMULATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse20089DataAccumulated getAccumulated() {
    return accumulated;
  }


  @JsonProperty(JSON_PROPERTY_ACCUMULATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccumulated(InlineResponse20089DataAccumulated accumulated) {
    this.accumulated = accumulated;
  }


  /**
   * Return true if this inline_response_200_89_data object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20089Data inlineResponse20089Data = (InlineResponse20089Data) o;
    return equalsNullable(this.idNotation, inlineResponse20089Data.idNotation) &&
        equalsNullable(this.sourceIdentifier, inlineResponse20089Data.sourceIdentifier) &&
        Objects.equals(this.valueUnit, inlineResponse20089Data.valueUnit) &&
        Objects.equals(this.currency, inlineResponse20089Data.currency) &&
        Objects.equals(this.market, inlineResponse20089Data.market) &&
        equalsNullable(this.quality, inlineResponse20089Data.quality) &&
        Objects.equals(this.latest, inlineResponse20089Data.latest) &&
        Objects.equals(this.first, inlineResponse20089Data.first) &&
        Objects.equals(this.low, inlineResponse20089Data.low) &&
        Objects.equals(this.high, inlineResponse20089Data.high) &&
        Objects.equals(this.previousClose, inlineResponse20089Data.previousClose) &&
        Objects.equals(this.accumulated, inlineResponse20089Data.accumulated);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(idNotation), hashCodeNullable(sourceIdentifier), valueUnit, currency, market, hashCodeNullable(quality), latest, first, low, high, previousClose, accumulated);
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
    sb.append("class InlineResponse20089Data {\n");
    sb.append("    idNotation: ").append(toIndentedString(idNotation)).append("\n");
    sb.append("    sourceIdentifier: ").append(toIndentedString(sourceIdentifier)).append("\n");
    sb.append("    valueUnit: ").append(toIndentedString(valueUnit)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    market: ").append(toIndentedString(market)).append("\n");
    sb.append("    quality: ").append(toIndentedString(quality)).append("\n");
    sb.append("    latest: ").append(toIndentedString(latest)).append("\n");
    sb.append("    first: ").append(toIndentedString(first)).append("\n");
    sb.append("    low: ").append(toIndentedString(low)).append("\n");
    sb.append("    high: ").append(toIndentedString(high)).append("\n");
    sb.append("    previousClose: ").append(toIndentedString(previousClose)).append("\n");
    sb.append("    accumulated: ").append(toIndentedString(accumulated)).append("\n");
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

