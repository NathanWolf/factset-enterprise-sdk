/*
 * FactSet Prices API
 * Gain access to comprehensive global coverage for Equities & Fixed Income. Perform quick analytics by controlling the date ranges, currencies, and rolling periods, or simply request Open, High, Low, and Close prices. Easily connect pricing data with other core company data or alternative content sets using FactSet's hub and spoke symbology. <p>Equity and Fund Security types include Common Stock, ADR, GDR, Preferred, Closed-ended Fund, Exchange Traded Fund, Unit, Open-ended Fund, Exchange Traded Fund UVI, Exchange Traded Fund NAV, Preferred Equity, Non-Voting Depositary Receipt/Certificate, Alien/Foreign, Structured Product, and Temporary Instruments. Reference over 180,000+ active and inactive securities.</p><p>Fixed Income Security Types include Corporate Bonds, Treasury and Agency bonds, Government Bonds, and Municipals.</p> 
 *
 * The version of the OpenAPI document: 1.2.1
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.FactSetPrices.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.threeten.bp.LocalDate;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.FactSetPrices.JSON;


/**
 * Price
 */
@JsonPropertyOrder({
  Price.JSON_PROPERTY_FSYM_ID,
  Price.JSON_PROPERTY_DATE,
  Price.JSON_PROPERTY_ADJ_DATE,
  Price.JSON_PROPERTY_CURRENCY,
  Price.JSON_PROPERTY_PRICE,
  Price.JSON_PROPERTY_PRICE_OPEN,
  Price.JSON_PROPERTY_PRICE_HIGH,
  Price.JSON_PROPERTY_PRICE_LOW,
  Price.JSON_PROPERTY_VOLUME,
  Price.JSON_PROPERTY_REQUEST_ID
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Price implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_FSYM_ID = "fsymId";
  private String fsymId;

  public static final String JSON_PROPERTY_DATE = "date";
  private LocalDate date;

  public static final String JSON_PROPERTY_ADJ_DATE = "adjDate";
  private LocalDate adjDate;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  private String currency;

  public static final String JSON_PROPERTY_PRICE = "price";
  private Double price;

  public static final String JSON_PROPERTY_PRICE_OPEN = "priceOpen";
  private Double priceOpen;

  public static final String JSON_PROPERTY_PRICE_HIGH = "priceHigh";
  private Double priceHigh;

  public static final String JSON_PROPERTY_PRICE_LOW = "priceLow";
  private Double priceLow;

  public static final String JSON_PROPERTY_VOLUME = "volume";
  private Double volume;

  public static final String JSON_PROPERTY_REQUEST_ID = "requestId";
  private String requestId;


  public Price fsymId(String fsymId) {
    this.fsymId = fsymId;
    return this;
  }

   /**
   * Factset Regional Security Identifier. Six alpha-numeric characters, excluding vowels, with an -R suffix (XXXXXX-R). Identifies the security&#39;s best regional security data series per currency. For equities, all primary listings per region and currency are allocated a regional-level permanent identifier. The regional-level permanent identifier will be available once a SEDOL representing the region/currency has been allocated and the identifiers are on FactSet.
   * @return fsymId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SJY281-R", value = "Factset Regional Security Identifier. Six alpha-numeric characters, excluding vowels, with an -R suffix (XXXXXX-R). Identifies the security's best regional security data series per currency. For equities, all primary listings per region and currency are allocated a regional-level permanent identifier. The regional-level permanent identifier will be available once a SEDOL representing the region/currency has been allocated and the identifiers are on FactSet.")
  @JsonProperty(JSON_PROPERTY_FSYM_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFsymId() {
    return fsymId;
  }


  @JsonProperty(JSON_PROPERTY_FSYM_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFsymId(String fsymId) {
    this.fsymId = fsymId;
  }


  public Price date(LocalDate date) {
    this.date = date;
    return this;
  }

   /**
   * Ending date for the period expressed in YYYY-MM-DD format.
   * @return date
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Thu Aug 01 00:00:00 UTC 2013", value = "Ending date for the period expressed in YYYY-MM-DD format.")
  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LocalDate getDate() {
    return date;
  }


  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDate(LocalDate date) {
    this.date = date;
  }


  public Price adjDate(LocalDate adjDate) {
    this.adjDate = adjDate;
    return this;
  }

   /**
   * Date of last split for which prices and volume have been adjusted. Use /factset-prices/v#/splits endpoint for details regarding the split.
   * @return adjDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Mon Feb 07 00:00:00 UTC 2005", value = "Date of last split for which prices and volume have been adjusted. Use /factset-prices/v#/splits endpoint for details regarding the split.")
  @JsonProperty(JSON_PROPERTY_ADJ_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LocalDate getAdjDate() {
    return adjDate;
  }


  @JsonProperty(JSON_PROPERTY_ADJ_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdjDate(LocalDate adjDate) {
    this.adjDate = adjDate;
  }


  public Price currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Currency ISO code. For more details, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470).
   * @return currency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "USD", value = "Currency ISO code. For more details, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470).")
  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCurrency() {
    return currency;
  }


  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrency(String currency) {
    this.currency = currency;
  }


  public Price price(Double price) {
    this.price = price;
    return this;
  }

   /**
   * Closing Price as of the date(s) requested. By default the price is in local trading currency, split adjusted and not spinoff adjusted. Prices updated nightly at approximately at 9pm ET.
   * @return price
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "125", value = "Closing Price as of the date(s) requested. By default the price is in local trading currency, split adjusted and not spinoff adjusted. Prices updated nightly at approximately at 9pm ET.")
  @JsonProperty(JSON_PROPERTY_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getPrice() {
    return price;
  }


  @JsonProperty(JSON_PROPERTY_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrice(Double price) {
    this.price = price;
  }


  public Price priceOpen(Double priceOpen) {
    this.priceOpen = priceOpen;
    return this;
  }

   /**
   * Open price as of the date(s) requested. By default the price is in local trading currency, split adjusted and not spinoff adjusted. Prices updated nightly at approximately at 9pm ET.
   * @return priceOpen
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123.75", value = "Open price as of the date(s) requested. By default the price is in local trading currency, split adjusted and not spinoff adjusted. Prices updated nightly at approximately at 9pm ET.")
  @JsonProperty(JSON_PROPERTY_PRICE_OPEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getPriceOpen() {
    return priceOpen;
  }


  @JsonProperty(JSON_PROPERTY_PRICE_OPEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPriceOpen(Double priceOpen) {
    this.priceOpen = priceOpen;
  }


  public Price priceHigh(Double priceHigh) {
    this.priceHigh = priceHigh;
    return this;
  }

   /**
   * High closing price as of the date(s) requested. By default the price is in local trading currency, split adjusted and not spinoff adjusted.  Prices updated nightly at approximately at 9pm ET.
   * @return priceHigh
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "126", value = "High closing price as of the date(s) requested. By default the price is in local trading currency, split adjusted and not spinoff adjusted.  Prices updated nightly at approximately at 9pm ET.")
  @JsonProperty(JSON_PROPERTY_PRICE_HIGH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getPriceHigh() {
    return priceHigh;
  }


  @JsonProperty(JSON_PROPERTY_PRICE_HIGH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPriceHigh(Double priceHigh) {
    this.priceHigh = priceHigh;
  }


  public Price priceLow(Double priceLow) {
    this.priceLow = priceLow;
    return this;
  }

   /**
   * Low closing price as of the date(s) requested. By default the price is in local trading currency, split adjusted and not spinoff adjusted.  Prices updated nightly at approximately at 9pm ET.
   * @return priceLow
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "121.25", value = "Low closing price as of the date(s) requested. By default the price is in local trading currency, split adjusted and not spinoff adjusted.  Prices updated nightly at approximately at 9pm ET.")
  @JsonProperty(JSON_PROPERTY_PRICE_LOW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getPriceLow() {
    return priceLow;
  }


  @JsonProperty(JSON_PROPERTY_PRICE_LOW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPriceLow(Double priceLow) {
    this.priceLow = priceLow;
  }


  public Price volume(Double volume) {
    this.volume = volume;
    return this;
  }

   /**
   * Returns the cumulative volume over dates requested. Data is returned in thousands.
   * @return volume
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "120341", value = "Returns the cumulative volume over dates requested. Data is returned in thousands.")
  @JsonProperty(JSON_PROPERTY_VOLUME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getVolume() {
    return volume;
  }


  @JsonProperty(JSON_PROPERTY_VOLUME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVolume(Double volume) {
    this.volume = volume;
  }


  public Price requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

   /**
   * Identifier that was used for the request.
   * @return requestId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "IBM-US", value = "Identifier that was used for the request.")
  @JsonProperty(JSON_PROPERTY_REQUEST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRequestId() {
    return requestId;
  }


  @JsonProperty(JSON_PROPERTY_REQUEST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }


  /**
   * Return true if this price object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Price price = (Price) o;
    return Objects.equals(this.fsymId, price.fsymId) &&
        Objects.equals(this.date, price.date) &&
        Objects.equals(this.adjDate, price.adjDate) &&
        Objects.equals(this.currency, price.currency) &&
        Objects.equals(this.price, price.price) &&
        Objects.equals(this.priceOpen, price.priceOpen) &&
        Objects.equals(this.priceHigh, price.priceHigh) &&
        Objects.equals(this.priceLow, price.priceLow) &&
        Objects.equals(this.volume, price.volume) &&
        Objects.equals(this.requestId, price.requestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fsymId, date, adjDate, currency, price, priceOpen, priceHigh, priceLow, volume, requestId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Price {\n");
    sb.append("    fsymId: ").append(toIndentedString(fsymId)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    adjDate: ").append(toIndentedString(adjDate)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    priceOpen: ").append(toIndentedString(priceOpen)).append("\n");
    sb.append("    priceHigh: ").append(toIndentedString(priceHigh)).append("\n");
    sb.append("    priceLow: ").append(toIndentedString(priceLow)).append("\n");
    sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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

