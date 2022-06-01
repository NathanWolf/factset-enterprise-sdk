/*
 * FactSet Options API
 * The Option Prices database provides pricing data such as mid bid-ask price, reference data (e.g., strike price), and risk measures (e.g., Greeks and implied volatility). Visit [Options Overview OA Page # 14925](https://my.apps.factset.com/oa/pages/14925) for details on database coverage. U.S. exchange-traded option bid and ask quotes are continuously updated throughout the day even when no trades have occurred on the option (zero volume). The end-of-day closing bid and ask quotes are always in line with the underlying closing price.  **Note** * Currently in Beta only **OPRA** exchanges are supported. 
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.FactSetOptions.models;

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
import java.math.BigDecimal;
import java.time.LocalDate;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.FactSetOptions.JSON;


/**
 * Options Volume Response Object
 */
@ApiModel(description = "Options Volume Response Object")
@JsonPropertyOrder({
  OptionsVolume.JSON_PROPERTY_FSYM_ID,
  OptionsVolume.JSON_PROPERTY_DATE,
  OptionsVolume.JSON_PROPERTY_EXCHANGE,
  OptionsVolume.JSON_PROPERTY_OPEN_INTEREST,
  OptionsVolume.JSON_PROPERTY_VOLUME,
  OptionsVolume.JSON_PROPERTY_REQUEST_ID
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class OptionsVolume implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_FSYM_ID = "fsymId";
  private String fsymId;

  public static final String JSON_PROPERTY_DATE = "date";
  private LocalDate date;

  public static final String JSON_PROPERTY_EXCHANGE = "exchange";
  private String exchange;

  public static final String JSON_PROPERTY_OPEN_INTEREST = "openInterest";
  private BigDecimal openInterest;

  public static final String JSON_PROPERTY_VOLUME = "volume";
  private Double volume;

  public static final String JSON_PROPERTY_REQUEST_ID = "requestId";
  private String requestId;

  public OptionsVolume() { 
  }

  public OptionsVolume fsymId(String fsymId) {
    this.fsymId = fsymId;
    return this;
  }

   /**
   * FactSet&#39;s Option Symbol. For more detail, visit [OA 12636](https://my.apps.factset.com/oa/pages/12636#options)
   * @return fsymId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "TSLA.US#PYG8L", value = "FactSet's Option Symbol. For more detail, visit [OA 12636](https://my.apps.factset.com/oa/pages/12636#options)")
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


  public OptionsVolume date(LocalDate date) {
    this.date = date;
    return this;
  }

   /**
   * The date of the data in YYYY-MM-DD format
   * @return date
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Thu May 06 00:00:00 UTC 2021", value = "The date of the data in YYYY-MM-DD format")
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


  public OptionsVolume exchange(String exchange) {
    this.exchange = exchange;
    return this;
  }

   /**
   * Option Exchange ISO. Visit [OA 14925](https://my.apps.factset.com/oa/pages/14925) for a list of Exchange ISOs.
   * @return exchange
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "USA", value = "Option Exchange ISO. Visit [OA 14925](https://my.apps.factset.com/oa/pages/14925) for a list of Exchange ISOs.")
  @JsonProperty(JSON_PROPERTY_EXCHANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExchange() {
    return exchange;
  }


  @JsonProperty(JSON_PROPERTY_EXCHANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExchange(String exchange) {
    this.exchange = exchange;
  }


  public OptionsVolume openInterest(BigDecimal openInterest) {
    this.openInterest = openInterest;
    return this;
  }

   /**
   * The total number of options and/or futures contracts that are not closed or delivered on a particular day.
   * @return openInterest
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "92", value = "The total number of options and/or futures contracts that are not closed or delivered on a particular day.")
  @JsonProperty(JSON_PROPERTY_OPEN_INTEREST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getOpenInterest() {
    return openInterest;
  }


  @JsonProperty(JSON_PROPERTY_OPEN_INTEREST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOpenInterest(BigDecimal openInterest) {
    this.openInterest = openInterest;
  }


  public OptionsVolume volume(Double volume) {
    this.volume = volume;
    return this;
  }

   /**
   * Volume of the option
   * @return volume
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3017", value = "Volume of the option")
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


  public OptionsVolume requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

   /**
   * The requested identifier submitted in the query.
   * @return requestId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "TSLA.US#PYG8L-USA", value = "The requested identifier submitted in the query.")
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
   * Return true if this optionsVolume object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OptionsVolume optionsVolume = (OptionsVolume) o;
    return Objects.equals(this.fsymId, optionsVolume.fsymId) &&
        Objects.equals(this.date, optionsVolume.date) &&
        Objects.equals(this.exchange, optionsVolume.exchange) &&
        Objects.equals(this.openInterest, optionsVolume.openInterest) &&
        Objects.equals(this.volume, optionsVolume.volume) &&
        Objects.equals(this.requestId, optionsVolume.requestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fsymId, date, exchange, openInterest, volume, requestId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OptionsVolume {\n");
    sb.append("    fsymId: ").append(toIndentedString(fsymId)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    exchange: ").append(toIndentedString(exchange)).append("\n");
    sb.append("    openInterest: ").append(toIndentedString(openInterest)).append("\n");
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

