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
import com.factset.sdk.BondsAPIforDigitalPortals.models.DebtInstrumentNotationScreenerSearchDataCompliance;
import com.factset.sdk.BondsAPIforDigitalPortals.models.DebtInstrumentNotationScreenerSearchDataCoupon;
import com.factset.sdk.BondsAPIforDigitalPortals.models.DebtInstrumentNotationScreenerSearchDataIssue;
import com.factset.sdk.BondsAPIforDigitalPortals.models.DebtInstrumentNotationScreenerSearchDataIssuer;
import com.factset.sdk.BondsAPIforDigitalPortals.models.DebtInstrumentNotationScreenerSearchDataLifeCycle;
import com.factset.sdk.BondsAPIforDigitalPortals.models.DebtInstrumentNotationScreenerSearchDataMacaulayDuration;
import com.factset.sdk.BondsAPIforDigitalPortals.models.DebtInstrumentNotationScreenerSearchDataRating;
import com.factset.sdk.BondsAPIforDigitalPortals.models.DebtInstrumentNotationScreenerSearchDataSensitivities;
import com.factset.sdk.BondsAPIforDigitalPortals.models.DebtInstrumentNotationScreenerSearchDataTradedValue;
import com.factset.sdk.BondsAPIforDigitalPortals.models.DebtInstrumentNotationScreenerSearchDataTradingVolume;
import com.factset.sdk.BondsAPIforDigitalPortals.models.DebtInstrumentNotationScreenerSearchDataValidation;
import com.factset.sdk.BondsAPIforDigitalPortals.models.DebtInstrumentNotationScreenerSearchDataYield;
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
 * The data member contains the request&#39;s primary data.
 */
@ApiModel(description = "The data member contains the request's primary data.")
@JsonPropertyOrder({
  DebtInstrumentNotationScreenerSearchData.JSON_PROPERTY_VALIDATION,
  DebtInstrumentNotationScreenerSearchData.JSON_PROPERTY_LIFE_CYCLE,
  DebtInstrumentNotationScreenerSearchData.JSON_PROPERTY_SUBORDINATED,
  DebtInstrumentNotationScreenerSearchData.JSON_PROPERTY_RATING,
  DebtInstrumentNotationScreenerSearchData.JSON_PROPERTY_ISSUER,
  DebtInstrumentNotationScreenerSearchData.JSON_PROPERTY_ISSUE,
  DebtInstrumentNotationScreenerSearchData.JSON_PROPERTY_TRADING_VOLUME,
  DebtInstrumentNotationScreenerSearchData.JSON_PROPERTY_COMPLIANCE,
  DebtInstrumentNotationScreenerSearchData.JSON_PROPERTY_COUPON,
  DebtInstrumentNotationScreenerSearchData.JSON_PROPERTY_YIELD,
  DebtInstrumentNotationScreenerSearchData.JSON_PROPERTY_MACAULAY_DURATION,
  DebtInstrumentNotationScreenerSearchData.JSON_PROPERTY_SENSITIVITIES,
  DebtInstrumentNotationScreenerSearchData.JSON_PROPERTY_TRADED_VALUE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DebtInstrumentNotationScreenerSearchData implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_VALIDATION = "validation";
  private DebtInstrumentNotationScreenerSearchDataValidation validation;

  public static final String JSON_PROPERTY_LIFE_CYCLE = "lifeCycle";
  private DebtInstrumentNotationScreenerSearchDataLifeCycle lifeCycle;

  public static final String JSON_PROPERTY_SUBORDINATED = "subordinated";
  private Boolean subordinated;

  public static final String JSON_PROPERTY_RATING = "rating";
  private DebtInstrumentNotationScreenerSearchDataRating rating;

  public static final String JSON_PROPERTY_ISSUER = "issuer";
  private DebtInstrumentNotationScreenerSearchDataIssuer issuer;

  public static final String JSON_PROPERTY_ISSUE = "issue";
  private DebtInstrumentNotationScreenerSearchDataIssue issue;

  public static final String JSON_PROPERTY_TRADING_VOLUME = "tradingVolume";
  private DebtInstrumentNotationScreenerSearchDataTradingVolume tradingVolume;

  public static final String JSON_PROPERTY_COMPLIANCE = "compliance";
  private DebtInstrumentNotationScreenerSearchDataCompliance compliance;

  public static final String JSON_PROPERTY_COUPON = "coupon";
  private DebtInstrumentNotationScreenerSearchDataCoupon coupon;

  public static final String JSON_PROPERTY_YIELD = "yield";
  private DebtInstrumentNotationScreenerSearchDataYield yield;

  public static final String JSON_PROPERTY_MACAULAY_DURATION = "macaulayDuration";
  private DebtInstrumentNotationScreenerSearchDataMacaulayDuration macaulayDuration;

  public static final String JSON_PROPERTY_SENSITIVITIES = "sensitivities";
  private DebtInstrumentNotationScreenerSearchDataSensitivities sensitivities;

  public static final String JSON_PROPERTY_TRADED_VALUE = "tradedValue";
  private DebtInstrumentNotationScreenerSearchDataTradedValue tradedValue;


  public DebtInstrumentNotationScreenerSearchData validation(DebtInstrumentNotationScreenerSearchDataValidation validation) {
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

  public DebtInstrumentNotationScreenerSearchDataValidation getValidation() {
    return validation;
  }


  @JsonProperty(JSON_PROPERTY_VALIDATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValidation(DebtInstrumentNotationScreenerSearchDataValidation validation) {
    this.validation = validation;
  }


  public DebtInstrumentNotationScreenerSearchData lifeCycle(DebtInstrumentNotationScreenerSearchDataLifeCycle lifeCycle) {
    this.lifeCycle = lifeCycle;
    return this;
  }

   /**
   * Get lifeCycle
   * @return lifeCycle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LIFE_CYCLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DebtInstrumentNotationScreenerSearchDataLifeCycle getLifeCycle() {
    return lifeCycle;
  }


  @JsonProperty(JSON_PROPERTY_LIFE_CYCLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLifeCycle(DebtInstrumentNotationScreenerSearchDataLifeCycle lifeCycle) {
    this.lifeCycle = lifeCycle;
  }


  public DebtInstrumentNotationScreenerSearchData subordinated(Boolean subordinated) {
    this.subordinated = subordinated;
    return this;
  }

   /**
   * Restricts the result to debt instruments that are subordinated (&#x60;true&#x60;) or are not subordinated (&#x60;false&#x60;). In case of default, subordinated debt instruments are redeemed with a lower priority than non-subordinated.
   * @return subordinated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Restricts the result to debt instruments that are subordinated (`true`) or are not subordinated (`false`). In case of default, subordinated debt instruments are redeemed with a lower priority than non-subordinated.")
  @JsonProperty(JSON_PROPERTY_SUBORDINATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSubordinated() {
    return subordinated;
  }


  @JsonProperty(JSON_PROPERTY_SUBORDINATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubordinated(Boolean subordinated) {
    this.subordinated = subordinated;
  }


  public DebtInstrumentNotationScreenerSearchData rating(DebtInstrumentNotationScreenerSearchDataRating rating) {
    this.rating = rating;
    return this;
  }

   /**
   * Get rating
   * @return rating
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RATING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DebtInstrumentNotationScreenerSearchDataRating getRating() {
    return rating;
  }


  @JsonProperty(JSON_PROPERTY_RATING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRating(DebtInstrumentNotationScreenerSearchDataRating rating) {
    this.rating = rating;
  }


  public DebtInstrumentNotationScreenerSearchData issuer(DebtInstrumentNotationScreenerSearchDataIssuer issuer) {
    this.issuer = issuer;
    return this;
  }

   /**
   * Get issuer
   * @return issuer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ISSUER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DebtInstrumentNotationScreenerSearchDataIssuer getIssuer() {
    return issuer;
  }


  @JsonProperty(JSON_PROPERTY_ISSUER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIssuer(DebtInstrumentNotationScreenerSearchDataIssuer issuer) {
    this.issuer = issuer;
  }


  public DebtInstrumentNotationScreenerSearchData issue(DebtInstrumentNotationScreenerSearchDataIssue issue) {
    this.issue = issue;
    return this;
  }

   /**
   * Get issue
   * @return issue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ISSUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DebtInstrumentNotationScreenerSearchDataIssue getIssue() {
    return issue;
  }


  @JsonProperty(JSON_PROPERTY_ISSUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIssue(DebtInstrumentNotationScreenerSearchDataIssue issue) {
    this.issue = issue;
  }


  public DebtInstrumentNotationScreenerSearchData tradingVolume(DebtInstrumentNotationScreenerSearchDataTradingVolume tradingVolume) {
    this.tradingVolume = tradingVolume;
    return this;
  }

   /**
   * Get tradingVolume
   * @return tradingVolume
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TRADING_VOLUME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DebtInstrumentNotationScreenerSearchDataTradingVolume getTradingVolume() {
    return tradingVolume;
  }


  @JsonProperty(JSON_PROPERTY_TRADING_VOLUME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTradingVolume(DebtInstrumentNotationScreenerSearchDataTradingVolume tradingVolume) {
    this.tradingVolume = tradingVolume;
  }


  public DebtInstrumentNotationScreenerSearchData compliance(DebtInstrumentNotationScreenerSearchDataCompliance compliance) {
    this.compliance = compliance;
    return this;
  }

   /**
   * Get compliance
   * @return compliance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_COMPLIANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DebtInstrumentNotationScreenerSearchDataCompliance getCompliance() {
    return compliance;
  }


  @JsonProperty(JSON_PROPERTY_COMPLIANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCompliance(DebtInstrumentNotationScreenerSearchDataCompliance compliance) {
    this.compliance = compliance;
  }


  public DebtInstrumentNotationScreenerSearchData coupon(DebtInstrumentNotationScreenerSearchDataCoupon coupon) {
    this.coupon = coupon;
    return this;
  }

   /**
   * Get coupon
   * @return coupon
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_COUPON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DebtInstrumentNotationScreenerSearchDataCoupon getCoupon() {
    return coupon;
  }


  @JsonProperty(JSON_PROPERTY_COUPON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCoupon(DebtInstrumentNotationScreenerSearchDataCoupon coupon) {
    this.coupon = coupon;
  }


  public DebtInstrumentNotationScreenerSearchData yield(DebtInstrumentNotationScreenerSearchDataYield yield) {
    this.yield = yield;
    return this;
  }

   /**
   * Get yield
   * @return yield
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_YIELD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DebtInstrumentNotationScreenerSearchDataYield getYield() {
    return yield;
  }


  @JsonProperty(JSON_PROPERTY_YIELD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setYield(DebtInstrumentNotationScreenerSearchDataYield yield) {
    this.yield = yield;
  }


  public DebtInstrumentNotationScreenerSearchData macaulayDuration(DebtInstrumentNotationScreenerSearchDataMacaulayDuration macaulayDuration) {
    this.macaulayDuration = macaulayDuration;
    return this;
  }

   /**
   * Get macaulayDuration
   * @return macaulayDuration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MACAULAY_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DebtInstrumentNotationScreenerSearchDataMacaulayDuration getMacaulayDuration() {
    return macaulayDuration;
  }


  @JsonProperty(JSON_PROPERTY_MACAULAY_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMacaulayDuration(DebtInstrumentNotationScreenerSearchDataMacaulayDuration macaulayDuration) {
    this.macaulayDuration = macaulayDuration;
  }


  public DebtInstrumentNotationScreenerSearchData sensitivities(DebtInstrumentNotationScreenerSearchDataSensitivities sensitivities) {
    this.sensitivities = sensitivities;
    return this;
  }

   /**
   * Get sensitivities
   * @return sensitivities
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SENSITIVITIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DebtInstrumentNotationScreenerSearchDataSensitivities getSensitivities() {
    return sensitivities;
  }


  @JsonProperty(JSON_PROPERTY_SENSITIVITIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSensitivities(DebtInstrumentNotationScreenerSearchDataSensitivities sensitivities) {
    this.sensitivities = sensitivities;
  }


  public DebtInstrumentNotationScreenerSearchData tradedValue(DebtInstrumentNotationScreenerSearchDataTradedValue tradedValue) {
    this.tradedValue = tradedValue;
    return this;
  }

   /**
   * Get tradedValue
   * @return tradedValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TRADED_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DebtInstrumentNotationScreenerSearchDataTradedValue getTradedValue() {
    return tradedValue;
  }


  @JsonProperty(JSON_PROPERTY_TRADED_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTradedValue(DebtInstrumentNotationScreenerSearchDataTradedValue tradedValue) {
    this.tradedValue = tradedValue;
  }


  /**
   * Return true if this _debtInstrument_notation_screener_search_data object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DebtInstrumentNotationScreenerSearchData debtInstrumentNotationScreenerSearchData = (DebtInstrumentNotationScreenerSearchData) o;
    return Objects.equals(this.validation, debtInstrumentNotationScreenerSearchData.validation) &&
        Objects.equals(this.lifeCycle, debtInstrumentNotationScreenerSearchData.lifeCycle) &&
        Objects.equals(this.subordinated, debtInstrumentNotationScreenerSearchData.subordinated) &&
        Objects.equals(this.rating, debtInstrumentNotationScreenerSearchData.rating) &&
        Objects.equals(this.issuer, debtInstrumentNotationScreenerSearchData.issuer) &&
        Objects.equals(this.issue, debtInstrumentNotationScreenerSearchData.issue) &&
        Objects.equals(this.tradingVolume, debtInstrumentNotationScreenerSearchData.tradingVolume) &&
        Objects.equals(this.compliance, debtInstrumentNotationScreenerSearchData.compliance) &&
        Objects.equals(this.coupon, debtInstrumentNotationScreenerSearchData.coupon) &&
        Objects.equals(this.yield, debtInstrumentNotationScreenerSearchData.yield) &&
        Objects.equals(this.macaulayDuration, debtInstrumentNotationScreenerSearchData.macaulayDuration) &&
        Objects.equals(this.sensitivities, debtInstrumentNotationScreenerSearchData.sensitivities) &&
        Objects.equals(this.tradedValue, debtInstrumentNotationScreenerSearchData.tradedValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(validation, lifeCycle, subordinated, rating, issuer, issue, tradingVolume, compliance, coupon, yield, macaulayDuration, sensitivities, tradedValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DebtInstrumentNotationScreenerSearchData {\n");
    sb.append("    validation: ").append(toIndentedString(validation)).append("\n");
    sb.append("    lifeCycle: ").append(toIndentedString(lifeCycle)).append("\n");
    sb.append("    subordinated: ").append(toIndentedString(subordinated)).append("\n");
    sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
    sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
    sb.append("    issue: ").append(toIndentedString(issue)).append("\n");
    sb.append("    tradingVolume: ").append(toIndentedString(tradingVolume)).append("\n");
    sb.append("    compliance: ").append(toIndentedString(compliance)).append("\n");
    sb.append("    coupon: ").append(toIndentedString(coupon)).append("\n");
    sb.append("    yield: ").append(toIndentedString(yield)).append("\n");
    sb.append("    macaulayDuration: ").append(toIndentedString(macaulayDuration)).append("\n");
    sb.append("    sensitivities: ").append(toIndentedString(sensitivities)).append("\n");
    sb.append("    tradedValue: ").append(toIndentedString(tradedValue)).append("\n");
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

