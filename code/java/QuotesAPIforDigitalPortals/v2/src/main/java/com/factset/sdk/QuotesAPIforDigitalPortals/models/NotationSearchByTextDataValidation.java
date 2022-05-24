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
import com.factset.sdk.QuotesAPIforDigitalPortals.models.NotationSearchByTextDataValidationMarket;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.NotationSearchByTextDataValidationPrices;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.NotationSearchByTextDataValidationValueUnit;
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
 * Validation parameters.
 */
@ApiModel(description = "Validation parameters.")
@JsonPropertyOrder({
  NotationSearchByTextDataValidation.JSON_PROPERTY_ONLY_ACTIVE,
  NotationSearchByTextDataValidation.JSON_PROPERTY_PRICES,
  NotationSearchByTextDataValidation.JSON_PROPERTY_VALUE_UNIT,
  NotationSearchByTextDataValidation.JSON_PROPERTY_MARKET
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class NotationSearchByTextDataValidation implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ONLY_ACTIVE = "onlyActive";
  private Boolean onlyActive = true;

  public static final String JSON_PROPERTY_PRICES = "prices";
  private NotationSearchByTextDataValidationPrices prices;

  public static final String JSON_PROPERTY_VALUE_UNIT = "valueUnit";
  private NotationSearchByTextDataValidationValueUnit valueUnit;

  public static final String JSON_PROPERTY_MARKET = "market";
  private NotationSearchByTextDataValidationMarket market;

  public NotationSearchByTextDataValidation() { 
  }

  public NotationSearchByTextDataValidation onlyActive(Boolean onlyActive) {
    this.onlyActive = onlyActive;
    return this;
  }

   /**
   * If &#x60;true&#x60;, only active notations will be returned. The term \&quot;active\&quot; reflects the fact that notations and related data is not being deleted immediately after becoming irrelevant (e.g. because the source does not provide a price anymore), but remains in general retrievable for up to 6 months.
   * @return onlyActive
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If `true`, only active notations will be returned. The term \"active\" reflects the fact that notations and related data is not being deleted immediately after becoming irrelevant (e.g. because the source does not provide a price anymore), but remains in general retrievable for up to 6 months.")
  @JsonProperty(JSON_PROPERTY_ONLY_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getOnlyActive() {
    return onlyActive;
  }


  @JsonProperty(JSON_PROPERTY_ONLY_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOnlyActive(Boolean onlyActive) {
    this.onlyActive = onlyActive;
  }


  public NotationSearchByTextDataValidation prices(NotationSearchByTextDataValidationPrices prices) {
    this.prices = prices;
    return this;
  }

   /**
   * Get prices
   * @return prices
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PRICES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public NotationSearchByTextDataValidationPrices getPrices() {
    return prices;
  }


  @JsonProperty(JSON_PROPERTY_PRICES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrices(NotationSearchByTextDataValidationPrices prices) {
    this.prices = prices;
  }


  public NotationSearchByTextDataValidation valueUnit(NotationSearchByTextDataValidationValueUnit valueUnit) {
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

  public NotationSearchByTextDataValidationValueUnit getValueUnit() {
    return valueUnit;
  }


  @JsonProperty(JSON_PROPERTY_VALUE_UNIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValueUnit(NotationSearchByTextDataValidationValueUnit valueUnit) {
    this.valueUnit = valueUnit;
  }


  public NotationSearchByTextDataValidation market(NotationSearchByTextDataValidationMarket market) {
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

  public NotationSearchByTextDataValidationMarket getMarket() {
    return market;
  }


  @JsonProperty(JSON_PROPERTY_MARKET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMarket(NotationSearchByTextDataValidationMarket market) {
    this.market = market;
  }


  /**
   * Return true if this _notation_searchByText_data_validation object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotationSearchByTextDataValidation notationSearchByTextDataValidation = (NotationSearchByTextDataValidation) o;
    return Objects.equals(this.onlyActive, notationSearchByTextDataValidation.onlyActive) &&
        Objects.equals(this.prices, notationSearchByTextDataValidation.prices) &&
        Objects.equals(this.valueUnit, notationSearchByTextDataValidation.valueUnit) &&
        Objects.equals(this.market, notationSearchByTextDataValidation.market);
  }

  @Override
  public int hashCode() {
    return Objects.hash(onlyActive, prices, valueUnit, market);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotationSearchByTextDataValidation {\n");
    sb.append("    onlyActive: ").append(toIndentedString(onlyActive)).append("\n");
    sb.append("    prices: ").append(toIndentedString(prices)).append("\n");
    sb.append("    valueUnit: ").append(toIndentedString(valueUnit)).append("\n");
    sb.append("    market: ").append(toIndentedString(market)).append("\n");
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

