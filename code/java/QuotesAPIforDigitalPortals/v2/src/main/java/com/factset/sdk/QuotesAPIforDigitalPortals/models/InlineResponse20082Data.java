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


package com.factset.sdk.QuotesAPIforDigitalPortals.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20065Status;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20079DataCurrency;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20079DataMarket;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20079DataValueUnit;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20082Ask;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20082Bid;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.QuotesAPIforDigitalPortals.JSON;


/**
 * InlineResponse20082Data
 */
@JsonPropertyOrder({
  InlineResponse20082Data.JSON_PROPERTY_ID,
  InlineResponse20082Data.JSON_PROPERTY_VALUE_UNIT,
  InlineResponse20082Data.JSON_PROPERTY_CURRENCY,
  InlineResponse20082Data.JSON_PROPERTY_MARKET,
  InlineResponse20082Data.JSON_PROPERTY_QUALITY,
  InlineResponse20082Data.JSON_PROPERTY_BID,
  InlineResponse20082Data.JSON_PROPERTY_ASK,
  InlineResponse20082Data.JSON_PROPERTY_STATUS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse20082Data implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_VALUE_UNIT = "valueUnit";
  private InlineResponse20079DataValueUnit valueUnit;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  private InlineResponse20079DataCurrency currency;

  public static final String JSON_PROPERTY_MARKET = "market";
  private InlineResponse20079DataMarket market;

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
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_QUALITY = "quality";
  private QualityEnum quality;

  public static final String JSON_PROPERTY_BID = "bid";
  private InlineResponse20082Bid bid;

  public static final String JSON_PROPERTY_ASK = "ask";
  private InlineResponse20082Ask ask;

  public static final String JSON_PROPERTY_STATUS = "status";
  private InlineResponse20065Status status;


  public InlineResponse20082Data id(String id) {
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


  public InlineResponse20082Data valueUnit(InlineResponse20079DataValueUnit valueUnit) {
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

  public InlineResponse20079DataValueUnit getValueUnit() {
    return valueUnit;
  }


  @JsonProperty(JSON_PROPERTY_VALUE_UNIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValueUnit(InlineResponse20079DataValueUnit valueUnit) {
    this.valueUnit = valueUnit;
  }


  public InlineResponse20082Data currency(InlineResponse20079DataCurrency currency) {
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

  public InlineResponse20079DataCurrency getCurrency() {
    return currency;
  }


  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrency(InlineResponse20079DataCurrency currency) {
    this.currency = currency;
  }


  public InlineResponse20082Data market(InlineResponse20079DataMarket market) {
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

  public InlineResponse20079DataMarket getMarket() {
    return market;
  }


  @JsonProperty(JSON_PROPERTY_MARKET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMarket(InlineResponse20079DataMarket market) {
    this.market = market;
  }


  public InlineResponse20082Data quality(QualityEnum quality) {
    this.quality = quality;
    return this;
  }

   /**
   * Quality of the price.
   * @return quality
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Quality of the price.")
  @JsonProperty(JSON_PROPERTY_QUALITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public QualityEnum getQuality() {
    return quality;
  }


  @JsonProperty(JSON_PROPERTY_QUALITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setQuality(QualityEnum quality) {
    this.quality = quality;
  }


  public InlineResponse20082Data bid(InlineResponse20082Bid bid) {
    this.bid = bid;
    return this;
  }

   /**
   * Get bid
   * @return bid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse20082Bid getBid() {
    return bid;
  }


  @JsonProperty(JSON_PROPERTY_BID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBid(InlineResponse20082Bid bid) {
    this.bid = bid;
  }


  public InlineResponse20082Data ask(InlineResponse20082Ask ask) {
    this.ask = ask;
    return this;
  }

   /**
   * Get ask
   * @return ask
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ASK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse20082Ask getAsk() {
    return ask;
  }


  @JsonProperty(JSON_PROPERTY_ASK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAsk(InlineResponse20082Ask ask) {
    this.ask = ask;
  }


  public InlineResponse20082Data status(InlineResponse20065Status status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse20065Status getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(InlineResponse20065Status status) {
    this.status = status;
  }


  /**
   * Return true if this inline_response_200_82_data object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20082Data inlineResponse20082Data = (InlineResponse20082Data) o;
    return Objects.equals(this.id, inlineResponse20082Data.id) &&
        Objects.equals(this.valueUnit, inlineResponse20082Data.valueUnit) &&
        Objects.equals(this.currency, inlineResponse20082Data.currency) &&
        Objects.equals(this.market, inlineResponse20082Data.market) &&
        Objects.equals(this.quality, inlineResponse20082Data.quality) &&
        Objects.equals(this.bid, inlineResponse20082Data.bid) &&
        Objects.equals(this.ask, inlineResponse20082Data.ask) &&
        Objects.equals(this.status, inlineResponse20082Data.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, valueUnit, currency, market, quality, bid, ask, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20082Data {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    valueUnit: ").append(toIndentedString(valueUnit)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    market: ").append(toIndentedString(market)).append("\n");
    sb.append("    quality: ").append(toIndentedString(quality)).append("\n");
    sb.append("    bid: ").append(toIndentedString(bid)).append("\n");
    sb.append("    ask: ").append(toIndentedString(ask)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

