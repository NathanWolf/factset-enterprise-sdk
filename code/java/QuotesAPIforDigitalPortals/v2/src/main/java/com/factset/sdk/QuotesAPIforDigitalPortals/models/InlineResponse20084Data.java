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
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20084DataAsks;
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
 * Orderbook.
 */
@ApiModel(description = "Orderbook.")
@JsonPropertyOrder({
  InlineResponse20084Data.JSON_PROPERTY_QUALITY,
  InlineResponse20084Data.JSON_PROPERTY_ASKS,
  InlineResponse20084Data.JSON_PROPERTY_BIDS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse20084Data implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Quality of the price.
   */
  public enum QualityEnum {
    RLT("RLT"),
    
    DLY("DLY");

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

  public static final String JSON_PROPERTY_ASKS = "asks";
  private java.util.List<InlineResponse20084DataAsks> asks = null;

  public static final String JSON_PROPERTY_BIDS = "bids";
  private java.util.List<InlineResponse20084DataAsks> bids = null;


  public InlineResponse20084Data quality(QualityEnum quality) {
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


  public InlineResponse20084Data asks(java.util.List<InlineResponse20084DataAsks> asks) {
    this.asks = asks;
    return this;
  }

  public InlineResponse20084Data addAsksItem(InlineResponse20084DataAsks asksItem) {
    if (this.asks == null) {
      this.asks = new java.util.ArrayList<>();
    }
    this.asks.add(asksItem);
    return this;
  }

   /**
   * Ask entries of the full orderbook.
   * @return asks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Ask entries of the full orderbook.")
  @JsonProperty(JSON_PROPERTY_ASKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<InlineResponse20084DataAsks> getAsks() {
    return asks;
  }


  @JsonProperty(JSON_PROPERTY_ASKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAsks(java.util.List<InlineResponse20084DataAsks> asks) {
    this.asks = asks;
  }


  public InlineResponse20084Data bids(java.util.List<InlineResponse20084DataAsks> bids) {
    this.bids = bids;
    return this;
  }

  public InlineResponse20084Data addBidsItem(InlineResponse20084DataAsks bidsItem) {
    if (this.bids == null) {
      this.bids = new java.util.ArrayList<>();
    }
    this.bids.add(bidsItem);
    return this;
  }

   /**
   * Bid entries of the full orderbook.
   * @return bids
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Bid entries of the full orderbook.")
  @JsonProperty(JSON_PROPERTY_BIDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<InlineResponse20084DataAsks> getBids() {
    return bids;
  }


  @JsonProperty(JSON_PROPERTY_BIDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBids(java.util.List<InlineResponse20084DataAsks> bids) {
    this.bids = bids;
  }


  /**
   * Return true if this inline_response_200_84_data object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20084Data inlineResponse20084Data = (InlineResponse20084Data) o;
    return Objects.equals(this.quality, inlineResponse20084Data.quality) &&
        Objects.equals(this.asks, inlineResponse20084Data.asks) &&
        Objects.equals(this.bids, inlineResponse20084Data.bids);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quality, asks, bids);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20084Data {\n");
    sb.append("    quality: ").append(toIndentedString(quality)).append("\n");
    sb.append("    asks: ").append(toIndentedString(asks)).append("\n");
    sb.append("    bids: ").append(toIndentedString(bids)).append("\n");
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

