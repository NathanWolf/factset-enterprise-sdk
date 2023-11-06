/*
 * Time Series API For Digital Portals
 * Time series data, end-of-day or intraday, tick-by-tick or subsampled. Additional vendor-specific endpoints provide a modified interface for seamless integration with the ChartIQ chart library.  This API is focused on high-performance applications that are  * serving millions of end-users, * accessible by client browsers via the internet, * integrated into complex infrastructures such as existing frontend frameworks or authentication services.  This API has been designed for direct use by client web applications and feature extreme low latency: The average response time across all endpoints is 30 ms whereas 99% of all requests are answered in close to under 300ms.  See the [Real-Time Quotes API for Digital Portals](https://developer.factset.com/api-catalog/real-time-quotes-api) for access to detailed price information. 
 *
 * The version of the OpenAPI document: 3.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.RealTimeTimeSeries.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.RealTimeTimeSeries.models.InlineResponse2005DataPrices;
import com.factset.sdk.RealTimeTimeSeries.models.InlineResponse200DataRange;
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
import com.factset.sdk.RealTimeTimeSeries.JSON;


/**
 * Time series data for the notation.
 */
@ApiModel(description = "Time series data for the notation.")
@JsonPropertyOrder({
  InlineResponse2005Data.JSON_PROPERTY_ID_NOTATION,
  InlineResponse2005Data.JSON_PROPERTY_SOURCE_IDENTIFIER,
  InlineResponse2005Data.JSON_PROPERTY_RANGE,
  InlineResponse2005Data.JSON_PROPERTY_QUALITY,
  InlineResponse2005Data.JSON_PROPERTY_PRICES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse2005Data implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ID_NOTATION = "idNotation";
  private JsonNullable<String> idNotation = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SOURCE_IDENTIFIER = "sourceIdentifier";
  private JsonNullable<String> sourceIdentifier = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_RANGE = "range";
  private JsonNullable<InlineResponse200DataRange> range = JsonNullable.<InlineResponse200DataRange>undefined();

  /**
   * Quality of the price.
   */
  public enum QualityEnum {
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

  public static final String JSON_PROPERTY_PRICES = "prices";
  private java.util.List<InlineResponse2005DataPrices> prices = null;

  public InlineResponse2005Data() { 
  }

  public InlineResponse2005Data idNotation(String idNotation) {
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


  public InlineResponse2005Data sourceIdentifier(String sourceIdentifier) {
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


  public InlineResponse2005Data range(InlineResponse200DataRange range) {
    this.range = JsonNullable.<InlineResponse200DataRange>of(range);
    return this;
  }

   /**
   * Get range
   * @return range
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public InlineResponse200DataRange getRange() {
        return range.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_RANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<InlineResponse200DataRange> getRange_JsonNullable() {
    return range;
  }
  
  @JsonProperty(JSON_PROPERTY_RANGE)
  public void setRange_JsonNullable(JsonNullable<InlineResponse200DataRange> range) {
    this.range = range;
  }

  public void setRange(InlineResponse200DataRange range) {
    this.range = JsonNullable.<InlineResponse200DataRange>of(range);
  }


  public InlineResponse2005Data quality(QualityEnum quality) {
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


  public InlineResponse2005Data prices(java.util.List<InlineResponse2005DataPrices> prices) {
    this.prices = prices;
    return this;
  }

  public InlineResponse2005Data addPricesItem(InlineResponse2005DataPrices pricesItem) {
    if (this.prices == null) {
      this.prices = new java.util.ArrayList<>();
    }
    this.prices.add(pricesItem);
    return this;
  }

   /**
   * Time series of prices. For the attributes first, last, low, high, see attribute &#x60;valueUnit&#x60; in endpoint &#x60;/prices/get&#x60; for their unit, except for price type yield, where the &#x60;valueUnit&#x60; is always &#x60;percent&#x60; (id&#x3D;258).
   * @return prices
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Time series of prices. For the attributes first, last, low, high, see attribute `valueUnit` in endpoint `/prices/get` for their unit, except for price type yield, where the `valueUnit` is always `percent` (id=258).")
  @JsonProperty(JSON_PROPERTY_PRICES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<InlineResponse2005DataPrices> getPrices() {
    return prices;
  }


  @JsonProperty(JSON_PROPERTY_PRICES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrices(java.util.List<InlineResponse2005DataPrices> prices) {
    this.prices = prices;
  }


  /**
   * Return true if this inline_response_200_5_data object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2005Data inlineResponse2005Data = (InlineResponse2005Data) o;
    return equalsNullable(this.idNotation, inlineResponse2005Data.idNotation) &&
        equalsNullable(this.sourceIdentifier, inlineResponse2005Data.sourceIdentifier) &&
        equalsNullable(this.range, inlineResponse2005Data.range) &&
        equalsNullable(this.quality, inlineResponse2005Data.quality) &&
        Objects.equals(this.prices, inlineResponse2005Data.prices);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(idNotation), hashCodeNullable(sourceIdentifier), hashCodeNullable(range), hashCodeNullable(quality), prices);
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
    sb.append("class InlineResponse2005Data {\n");
    sb.append("    idNotation: ").append(toIndentedString(idNotation)).append("\n");
    sb.append("    sourceIdentifier: ").append(toIndentedString(sourceIdentifier)).append("\n");
    sb.append("    range: ").append(toIndentedString(range)).append("\n");
    sb.append("    quality: ").append(toIndentedString(quality)).append("\n");
    sb.append("    prices: ").append(toIndentedString(prices)).append("\n");
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

