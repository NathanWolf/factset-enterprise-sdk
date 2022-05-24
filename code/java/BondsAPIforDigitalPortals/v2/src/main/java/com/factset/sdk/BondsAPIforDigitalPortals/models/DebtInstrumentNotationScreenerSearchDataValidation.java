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


package com.factset.sdk.BondsAPIforDigitalPortals.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.BondsAPIforDigitalPortals.models.DebtInstrumentNotationScreenerSearchDataValidationCategorization;
import com.factset.sdk.BondsAPIforDigitalPortals.models.DebtInstrumentNotationScreenerSearchDataValidationInstrumentSelectionList;
import com.factset.sdk.BondsAPIforDigitalPortals.models.DebtInstrumentNotationScreenerSearchDataValidationMarket;
import com.factset.sdk.BondsAPIforDigitalPortals.models.DebtInstrumentNotationScreenerSearchDataValidationNotationSelectionList;
import com.factset.sdk.BondsAPIforDigitalPortals.models.DebtInstrumentNotationScreenerSearchDataValidationPrices;
import com.factset.sdk.BondsAPIforDigitalPortals.models.DebtInstrumentNotationScreenerSearchDataValidationValueUnit;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.BondsAPIforDigitalPortals.JSON;


/**
 * Validation parameters.
 */
@ApiModel(description = "Validation parameters.")
@JsonPropertyOrder({
  DebtInstrumentNotationScreenerSearchDataValidation.JSON_PROPERTY_ONLY_ACTIVE,
  DebtInstrumentNotationScreenerSearchDataValidation.JSON_PROPERTY_ONLY_NOT_SUSPENDED,
  DebtInstrumentNotationScreenerSearchDataValidation.JSON_PROPERTY_PRICES,
  DebtInstrumentNotationScreenerSearchDataValidation.JSON_PROPERTY_VALUE_UNIT,
  DebtInstrumentNotationScreenerSearchDataValidation.JSON_PROPERTY_MARKET,
  DebtInstrumentNotationScreenerSearchDataValidation.JSON_PROPERTY_INSTRUMENT_SELECTION_LIST,
  DebtInstrumentNotationScreenerSearchDataValidation.JSON_PROPERTY_NOTATION_SELECTION_LIST,
  DebtInstrumentNotationScreenerSearchDataValidation.JSON_PROPERTY_CATEGORIZATION
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DebtInstrumentNotationScreenerSearchDataValidation implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ONLY_ACTIVE = "onlyActive";
  private Boolean onlyActive = true;

  public static final String JSON_PROPERTY_ONLY_NOT_SUSPENDED = "onlyNotSuspended";
  private Boolean onlyNotSuspended = false;

  public static final String JSON_PROPERTY_PRICES = "prices";
  private DebtInstrumentNotationScreenerSearchDataValidationPrices prices;

  public static final String JSON_PROPERTY_VALUE_UNIT = "valueUnit";
  private DebtInstrumentNotationScreenerSearchDataValidationValueUnit valueUnit;

  public static final String JSON_PROPERTY_MARKET = "market";
  private DebtInstrumentNotationScreenerSearchDataValidationMarket market;

  public static final String JSON_PROPERTY_INSTRUMENT_SELECTION_LIST = "instrumentSelectionList";
  private DebtInstrumentNotationScreenerSearchDataValidationInstrumentSelectionList instrumentSelectionList;

  public static final String JSON_PROPERTY_NOTATION_SELECTION_LIST = "notationSelectionList";
  private DebtInstrumentNotationScreenerSearchDataValidationNotationSelectionList notationSelectionList;

  public static final String JSON_PROPERTY_CATEGORIZATION = "categorization";
  private DebtInstrumentNotationScreenerSearchDataValidationCategorization categorization;

  public DebtInstrumentNotationScreenerSearchDataValidation() { 
  }

  public DebtInstrumentNotationScreenerSearchDataValidation onlyActive(Boolean onlyActive) {
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


  public DebtInstrumentNotationScreenerSearchDataValidation onlyNotSuspended(Boolean onlyNotSuspended) {
    this.onlyNotSuspended = onlyNotSuspended;
    return this;
  }

   /**
   * If &#x60;true&#x60;, only notations not suspended from trading will be returned.
   * @return onlyNotSuspended
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If `true`, only notations not suspended from trading will be returned.")
  @JsonProperty(JSON_PROPERTY_ONLY_NOT_SUSPENDED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getOnlyNotSuspended() {
    return onlyNotSuspended;
  }


  @JsonProperty(JSON_PROPERTY_ONLY_NOT_SUSPENDED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOnlyNotSuspended(Boolean onlyNotSuspended) {
    this.onlyNotSuspended = onlyNotSuspended;
  }


  public DebtInstrumentNotationScreenerSearchDataValidation prices(DebtInstrumentNotationScreenerSearchDataValidationPrices prices) {
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

  public DebtInstrumentNotationScreenerSearchDataValidationPrices getPrices() {
    return prices;
  }


  @JsonProperty(JSON_PROPERTY_PRICES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrices(DebtInstrumentNotationScreenerSearchDataValidationPrices prices) {
    this.prices = prices;
  }


  public DebtInstrumentNotationScreenerSearchDataValidation valueUnit(DebtInstrumentNotationScreenerSearchDataValidationValueUnit valueUnit) {
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

  public DebtInstrumentNotationScreenerSearchDataValidationValueUnit getValueUnit() {
    return valueUnit;
  }


  @JsonProperty(JSON_PROPERTY_VALUE_UNIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValueUnit(DebtInstrumentNotationScreenerSearchDataValidationValueUnit valueUnit) {
    this.valueUnit = valueUnit;
  }


  public DebtInstrumentNotationScreenerSearchDataValidation market(DebtInstrumentNotationScreenerSearchDataValidationMarket market) {
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

  public DebtInstrumentNotationScreenerSearchDataValidationMarket getMarket() {
    return market;
  }


  @JsonProperty(JSON_PROPERTY_MARKET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMarket(DebtInstrumentNotationScreenerSearchDataValidationMarket market) {
    this.market = market;
  }


  public DebtInstrumentNotationScreenerSearchDataValidation instrumentSelectionList(DebtInstrumentNotationScreenerSearchDataValidationInstrumentSelectionList instrumentSelectionList) {
    this.instrumentSelectionList = instrumentSelectionList;
    return this;
  }

   /**
   * Get instrumentSelectionList
   * @return instrumentSelectionList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INSTRUMENT_SELECTION_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DebtInstrumentNotationScreenerSearchDataValidationInstrumentSelectionList getInstrumentSelectionList() {
    return instrumentSelectionList;
  }


  @JsonProperty(JSON_PROPERTY_INSTRUMENT_SELECTION_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInstrumentSelectionList(DebtInstrumentNotationScreenerSearchDataValidationInstrumentSelectionList instrumentSelectionList) {
    this.instrumentSelectionList = instrumentSelectionList;
  }


  public DebtInstrumentNotationScreenerSearchDataValidation notationSelectionList(DebtInstrumentNotationScreenerSearchDataValidationNotationSelectionList notationSelectionList) {
    this.notationSelectionList = notationSelectionList;
    return this;
  }

   /**
   * Get notationSelectionList
   * @return notationSelectionList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NOTATION_SELECTION_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DebtInstrumentNotationScreenerSearchDataValidationNotationSelectionList getNotationSelectionList() {
    return notationSelectionList;
  }


  @JsonProperty(JSON_PROPERTY_NOTATION_SELECTION_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNotationSelectionList(DebtInstrumentNotationScreenerSearchDataValidationNotationSelectionList notationSelectionList) {
    this.notationSelectionList = notationSelectionList;
  }


  public DebtInstrumentNotationScreenerSearchDataValidation categorization(DebtInstrumentNotationScreenerSearchDataValidationCategorization categorization) {
    this.categorization = categorization;
    return this;
  }

   /**
   * Get categorization
   * @return categorization
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CATEGORIZATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DebtInstrumentNotationScreenerSearchDataValidationCategorization getCategorization() {
    return categorization;
  }


  @JsonProperty(JSON_PROPERTY_CATEGORIZATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCategorization(DebtInstrumentNotationScreenerSearchDataValidationCategorization categorization) {
    this.categorization = categorization;
  }


  /**
   * Return true if this _debtInstrument_notation_screener_search_data_validation object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DebtInstrumentNotationScreenerSearchDataValidation debtInstrumentNotationScreenerSearchDataValidation = (DebtInstrumentNotationScreenerSearchDataValidation) o;
    return Objects.equals(this.onlyActive, debtInstrumentNotationScreenerSearchDataValidation.onlyActive) &&
        Objects.equals(this.onlyNotSuspended, debtInstrumentNotationScreenerSearchDataValidation.onlyNotSuspended) &&
        Objects.equals(this.prices, debtInstrumentNotationScreenerSearchDataValidation.prices) &&
        Objects.equals(this.valueUnit, debtInstrumentNotationScreenerSearchDataValidation.valueUnit) &&
        Objects.equals(this.market, debtInstrumentNotationScreenerSearchDataValidation.market) &&
        Objects.equals(this.instrumentSelectionList, debtInstrumentNotationScreenerSearchDataValidation.instrumentSelectionList) &&
        Objects.equals(this.notationSelectionList, debtInstrumentNotationScreenerSearchDataValidation.notationSelectionList) &&
        Objects.equals(this.categorization, debtInstrumentNotationScreenerSearchDataValidation.categorization);
  }

  @Override
  public int hashCode() {
    return Objects.hash(onlyActive, onlyNotSuspended, prices, valueUnit, market, instrumentSelectionList, notationSelectionList, categorization);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DebtInstrumentNotationScreenerSearchDataValidation {\n");
    sb.append("    onlyActive: ").append(toIndentedString(onlyActive)).append("\n");
    sb.append("    onlyNotSuspended: ").append(toIndentedString(onlyNotSuspended)).append("\n");
    sb.append("    prices: ").append(toIndentedString(prices)).append("\n");
    sb.append("    valueUnit: ").append(toIndentedString(valueUnit)).append("\n");
    sb.append("    market: ").append(toIndentedString(market)).append("\n");
    sb.append("    instrumentSelectionList: ").append(toIndentedString(instrumentSelectionList)).append("\n");
    sb.append("    notationSelectionList: ").append(toIndentedString(notationSelectionList)).append("\n");
    sb.append("    categorization: ").append(toIndentedString(categorization)).append("\n");
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

