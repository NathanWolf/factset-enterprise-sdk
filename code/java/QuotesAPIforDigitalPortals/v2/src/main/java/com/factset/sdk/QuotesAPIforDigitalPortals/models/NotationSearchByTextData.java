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
import com.factset.sdk.QuotesAPIforDigitalPortals.models.NotationSearchByTextDataAssetClasses;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.NotationSearchByTextDataMarket;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.NotationSearchByTextDataText;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.NotationSearchByTextDataTradingValue;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.NotationSearchByTextDataValidation;
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
 * The data member contains the request&#39;s primary data.
 */
@ApiModel(description = "The data member contains the request's primary data.")
@JsonPropertyOrder({
  NotationSearchByTextData.JSON_PROPERTY_TEXT,
  NotationSearchByTextData.JSON_PROPERTY_VALIDATION,
  NotationSearchByTextData.JSON_PROPERTY_ASSET_CLASSES,
  NotationSearchByTextData.JSON_PROPERTY_MARKET,
  NotationSearchByTextData.JSON_PROPERTY_TRADING_VALUE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class NotationSearchByTextData implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_TEXT = "text";
  private NotationSearchByTextDataText text;

  public static final String JSON_PROPERTY_VALIDATION = "validation";
  private NotationSearchByTextDataValidation validation;

  public static final String JSON_PROPERTY_ASSET_CLASSES = "assetClasses";
  private NotationSearchByTextDataAssetClasses assetClasses;

  public static final String JSON_PROPERTY_MARKET = "market";
  private NotationSearchByTextDataMarket market;

  public static final String JSON_PROPERTY_TRADING_VALUE = "tradingValue";
  private NotationSearchByTextDataTradingValue tradingValue;


  public NotationSearchByTextData text(NotationSearchByTextDataText text) {
    this.text = text;
    return this;
  }

   /**
   * Get text
   * @return text
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public NotationSearchByTextDataText getText() {
    return text;
  }


  @JsonProperty(JSON_PROPERTY_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setText(NotationSearchByTextDataText text) {
    this.text = text;
  }


  public NotationSearchByTextData validation(NotationSearchByTextDataValidation validation) {
    this.validation = validation;
    return this;
  }

   /**
   * Get validation
   * @return validation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VALIDATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public NotationSearchByTextDataValidation getValidation() {
    return validation;
  }


  @JsonProperty(JSON_PROPERTY_VALIDATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValidation(NotationSearchByTextDataValidation validation) {
    this.validation = validation;
  }


  public NotationSearchByTextData assetClasses(NotationSearchByTextDataAssetClasses assetClasses) {
    this.assetClasses = assetClasses;
    return this;
  }

   /**
   * Get assetClasses
   * @return assetClasses
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ASSET_CLASSES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public NotationSearchByTextDataAssetClasses getAssetClasses() {
    return assetClasses;
  }


  @JsonProperty(JSON_PROPERTY_ASSET_CLASSES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAssetClasses(NotationSearchByTextDataAssetClasses assetClasses) {
    this.assetClasses = assetClasses;
  }


  public NotationSearchByTextData market(NotationSearchByTextDataMarket market) {
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

  public NotationSearchByTextDataMarket getMarket() {
    return market;
  }


  @JsonProperty(JSON_PROPERTY_MARKET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMarket(NotationSearchByTextDataMarket market) {
    this.market = market;
  }


  public NotationSearchByTextData tradingValue(NotationSearchByTextDataTradingValue tradingValue) {
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

  public NotationSearchByTextDataTradingValue getTradingValue() {
    return tradingValue;
  }


  @JsonProperty(JSON_PROPERTY_TRADING_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTradingValue(NotationSearchByTextDataTradingValue tradingValue) {
    this.tradingValue = tradingValue;
  }


  /**
   * Return true if this _notation_searchByText_data object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotationSearchByTextData notationSearchByTextData = (NotationSearchByTextData) o;
    return Objects.equals(this.text, notationSearchByTextData.text) &&
        Objects.equals(this.validation, notationSearchByTextData.validation) &&
        Objects.equals(this.assetClasses, notationSearchByTextData.assetClasses) &&
        Objects.equals(this.market, notationSearchByTextData.market) &&
        Objects.equals(this.tradingValue, notationSearchByTextData.tradingValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, validation, assetClasses, market, tradingValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotationSearchByTextData {\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    validation: ").append(toIndentedString(validation)).append("\n");
    sb.append("    assetClasses: ").append(toIndentedString(assetClasses)).append("\n");
    sb.append("    market: ").append(toIndentedString(market)).append("\n");
    sb.append("    tradingValue: ").append(toIndentedString(tradingValue)).append("\n");
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

