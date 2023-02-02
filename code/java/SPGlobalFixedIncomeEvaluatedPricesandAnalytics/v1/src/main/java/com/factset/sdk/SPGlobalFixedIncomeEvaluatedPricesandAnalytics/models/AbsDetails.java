/*
 * S&P Global Fixed Income Evaluated Prices & Analytics API
 * Gain access to evaluated pricing and analytics data for Corporate Bonds, Municipal Bonds and Asset Backed Securities provided by S&P Global (formerly IHS Markit) .  Data returned through multiple endpoints like prices, spread, yield, yield curve, sensitivity, coupon information, securities metadata and details specific to the Asset Backed Securities. 
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.SPGlobalFixedIncomeEvaluatedPricesandAnalytics.models;

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
import java.time.LocalDate;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.SPGlobalFixedIncomeEvaluatedPricesandAnalytics.JSON;


/**
 * AbsDetails
 */
@JsonPropertyOrder({
  AbsDetails.JSON_PROPERTY_REQUEST_ID,
  AbsDetails.JSON_PROPERTY_FSYM_ID,
  AbsDetails.JSON_PROPERTY_DATE,
  AbsDetails.JSON_PROPERTY_CDR,
  AbsDetails.JSON_PROPERTY_CPR,
  AbsDetails.JSON_PROPERTY_FACTOR,
  AbsDetails.JSON_PROPERTY_ESTIMATED_FACTOR,
  AbsDetails.JSON_PROPERTY_BID_PRICE_PRE_FACTOR,
  AbsDetails.JSON_PROPERTY_MID_PRICE_PRE_FACTOR,
  AbsDetails.JSON_PROPERTY_ASK_PRICE_PRE_FACTOR,
  AbsDetails.JSON_PROPERTY_CP_R_ESTIMATE_PRE_FACTOR,
  AbsDetails.JSON_PROPERTY_LIQUIDITY,
  AbsDetails.JSON_PROPERTY_PAY_UP,
  AbsDetails.JSON_PROPERTY_PAY_UP_DESCRIPTION,
  AbsDetails.JSON_PROPERTY_PRE_PAY_RATE,
  AbsDetails.JSON_PROPERTY_PRE_PAY_TYPE,
  AbsDetails.JSON_PROPERTY_SEVERITY,
  AbsDetails.JSON_PROPERTY_WAL,
  AbsDetails.JSON_PROPERTY_WA_L_PRINCIPAL
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AbsDetails implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_REQUEST_ID = "requestId";
  private String requestId;

  public static final String JSON_PROPERTY_FSYM_ID = "fsymId";
  private JsonNullable<String> fsymId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_DATE = "date";
  private JsonNullable<LocalDate> date = JsonNullable.<LocalDate>undefined();

  public static final String JSON_PROPERTY_CDR = "cdr";
  private JsonNullable<String> cdr = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CPR = "cpr";
  private JsonNullable<Double> cpr = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_FACTOR = "factor";
  private JsonNullable<Double> factor = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_ESTIMATED_FACTOR = "estimatedFactor";
  private JsonNullable<Double> estimatedFactor = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_BID_PRICE_PRE_FACTOR = "bidPricePreFactor";
  private JsonNullable<Double> bidPricePreFactor = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_MID_PRICE_PRE_FACTOR = "midPricePreFactor";
  private JsonNullable<Double> midPricePreFactor = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_ASK_PRICE_PRE_FACTOR = "askPricePreFactor";
  private JsonNullable<Double> askPricePreFactor = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_CP_R_ESTIMATE_PRE_FACTOR = "CPREstimatePreFactor";
  private JsonNullable<Double> cpREstimatePreFactor = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_LIQUIDITY = "liquidity";
  private JsonNullable<Double> liquidity = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_PAY_UP = "payUp";
  private JsonNullable<Double> payUp = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_PAY_UP_DESCRIPTION = "payUpDescription";
  private JsonNullable<String> payUpDescription = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PRE_PAY_RATE = "prePayRate";
  private JsonNullable<Double> prePayRate = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_PRE_PAY_TYPE = "prePayType";
  private JsonNullable<String> prePayType = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SEVERITY = "severity";
  private JsonNullable<Double> severity = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_WAL = "wal";
  private JsonNullable<Double> wal = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_WA_L_PRINCIPAL = "WALPrincipal";
  private JsonNullable<Double> waLPrincipal = JsonNullable.<Double>undefined();

  public AbsDetails() { 
  }

  public AbsDetails requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

   /**
   * Identifier that was used for the request.
   * @return requestId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "US05522RDC97", value = "Identifier that was used for the request.")
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


  public AbsDetails fsymId(String fsymId) {
    this.fsymId = JsonNullable.<String>of(fsymId);
    return this;
  }

   /**
   * FactSet Regional Security Identifier. Six alpha-numeric characters, excluding vowels, with an -R suffix (XXXXXX-R). Identifies the security&#39;s best regional security data series per currency. For equities, all primary listings per region and currency are allocated a regional-level permanent identifier. The regional-level permanent identifier will be available once a SEDOL representing the region/currency has been allocated and the identifiers are on FactSet.
   * @return fsymId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "V1D5YM-S", value = "FactSet Regional Security Identifier. Six alpha-numeric characters, excluding vowels, with an -R suffix (XXXXXX-R). Identifies the security's best regional security data series per currency. For equities, all primary listings per region and currency are allocated a regional-level permanent identifier. The regional-level permanent identifier will be available once a SEDOL representing the region/currency has been allocated and the identifiers are on FactSet.")
  @JsonIgnore

  public String getFsymId() {
        return fsymId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FSYM_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getFsymId_JsonNullable() {
    return fsymId;
  }
  
  @JsonProperty(JSON_PROPERTY_FSYM_ID)
  public void setFsymId_JsonNullable(JsonNullable<String> fsymId) {
    this.fsymId = fsymId;
  }

  public void setFsymId(String fsymId) {
    this.fsymId = JsonNullable.<String>of(fsymId);
  }


  public AbsDetails date(LocalDate date) {
    this.date = JsonNullable.<LocalDate>of(date);
    return this;
  }

   /**
   * The date on which the price is calculated.
   * @return date
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Thu Jan 26 00:00:00 UTC 2023", value = "The date on which the price is calculated.")
  @JsonIgnore

  public LocalDate getDate() {
        return date.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<LocalDate> getDate_JsonNullable() {
    return date;
  }
  
  @JsonProperty(JSON_PROPERTY_DATE)
  public void setDate_JsonNullable(JsonNullable<LocalDate> date) {
    this.date = date;
  }

  public void setDate(LocalDate date) {
    this.date = JsonNullable.<LocalDate>of(date);
  }


  public AbsDetails cdr(String cdr) {
    this.cdr = JsonNullable.<String>of(cdr);
    return this;
  }

   /**
   * A vector of conditional default rate assumption used in the evaluated price of the instrument. CDR represents the percentage of outstanding principal balances in the pool that are in default.
   * @return cdr
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "A vector of conditional default rate assumption used in the evaluated price of the instrument. CDR represents the percentage of outstanding principal balances in the pool that are in default.")
  @JsonIgnore

  public String getCdr() {
        return cdr.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CDR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getCdr_JsonNullable() {
    return cdr;
  }
  
  @JsonProperty(JSON_PROPERTY_CDR)
  public void setCdr_JsonNullable(JsonNullable<String> cdr) {
    this.cdr = cdr;
  }

  public void setCdr(String cdr) {
    this.cdr = JsonNullable.<String>of(cdr);
  }


  public AbsDetails cpr(Double cpr) {
    this.cpr = JsonNullable.<Double>of(cpr);
    return this;
  }

   /**
   * Returns the flat CPR that would equate to the same weighted average life (WAL) projection for Agency CMOs as the base case CPR vector
   * @return cpr
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Returns the flat CPR that would equate to the same weighted average life (WAL) projection for Agency CMOs as the base case CPR vector")
  @JsonIgnore

  public Double getCpr() {
        return cpr.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CPR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Double> getCpr_JsonNullable() {
    return cpr;
  }
  
  @JsonProperty(JSON_PROPERTY_CPR)
  public void setCpr_JsonNullable(JsonNullable<Double> cpr) {
    this.cpr = cpr;
  }

  public void setCpr(Double cpr) {
    this.cpr = JsonNullable.<Double>of(cpr);
  }


  public AbsDetails factor(Double factor) {
    this.factor = JsonNullable.<Double>of(factor);
    return this;
  }

   /**
   * The representation of the amount of the principal of an amortizing bond that has been paid out or written down since issuance, expressed as a percentage of the original total principal
   * @return factor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "The representation of the amount of the principal of an amortizing bond that has been paid out or written down since issuance, expressed as a percentage of the original total principal")
  @JsonIgnore

  public Double getFactor() {
        return factor.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FACTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Double> getFactor_JsonNullable() {
    return factor;
  }
  
  @JsonProperty(JSON_PROPERTY_FACTOR)
  public void setFactor_JsonNullable(JsonNullable<Double> factor) {
    this.factor = factor;
  }

  public void setFactor(Double factor) {
    this.factor = JsonNullable.<Double>of(factor);
  }


  public AbsDetails estimatedFactor(Double estimatedFactor) {
    this.estimatedFactor = JsonNullable.<Double>of(estimatedFactor);
    return this;
  }

   /**
   * The projected agency pool factor between factor date and the day the actual factor is reported to investors (only applicable for agency passthrough securities).
   * @return estimatedFactor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The projected agency pool factor between factor date and the day the actual factor is reported to investors (only applicable for agency passthrough securities).")
  @JsonIgnore

  public Double getEstimatedFactor() {
        return estimatedFactor.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ESTIMATED_FACTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Double> getEstimatedFactor_JsonNullable() {
    return estimatedFactor;
  }
  
  @JsonProperty(JSON_PROPERTY_ESTIMATED_FACTOR)
  public void setEstimatedFactor_JsonNullable(JsonNullable<Double> estimatedFactor) {
    this.estimatedFactor = estimatedFactor;
  }

  public void setEstimatedFactor(Double estimatedFactor) {
    this.estimatedFactor = JsonNullable.<Double>of(estimatedFactor);
  }


  public AbsDetails bidPricePreFactor(Double bidPricePreFactor) {
    this.bidPricePreFactor = JsonNullable.<Double>of(bidPricePreFactor);
    return this;
  }

   /**
   * Returns the agency pool bid price that is adjusted to account for prepayment expectations during the first five business days of the month before the factors are reported.
   * @return bidPricePreFactor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Returns the agency pool bid price that is adjusted to account for prepayment expectations during the first five business days of the month before the factors are reported.")
  @JsonIgnore

  public Double getBidPricePreFactor() {
        return bidPricePreFactor.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_BID_PRICE_PRE_FACTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Double> getBidPricePreFactor_JsonNullable() {
    return bidPricePreFactor;
  }
  
  @JsonProperty(JSON_PROPERTY_BID_PRICE_PRE_FACTOR)
  public void setBidPricePreFactor_JsonNullable(JsonNullable<Double> bidPricePreFactor) {
    this.bidPricePreFactor = bidPricePreFactor;
  }

  public void setBidPricePreFactor(Double bidPricePreFactor) {
    this.bidPricePreFactor = JsonNullable.<Double>of(bidPricePreFactor);
  }


  public AbsDetails midPricePreFactor(Double midPricePreFactor) {
    this.midPricePreFactor = JsonNullable.<Double>of(midPricePreFactor);
    return this;
  }

   /**
   * Returns the agency pool mid price that is adjusted to account for prepayment expectations during the first five business days of the month before the factors are reported.
   * @return midPricePreFactor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Returns the agency pool mid price that is adjusted to account for prepayment expectations during the first five business days of the month before the factors are reported.")
  @JsonIgnore

  public Double getMidPricePreFactor() {
        return midPricePreFactor.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MID_PRICE_PRE_FACTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Double> getMidPricePreFactor_JsonNullable() {
    return midPricePreFactor;
  }
  
  @JsonProperty(JSON_PROPERTY_MID_PRICE_PRE_FACTOR)
  public void setMidPricePreFactor_JsonNullable(JsonNullable<Double> midPricePreFactor) {
    this.midPricePreFactor = midPricePreFactor;
  }

  public void setMidPricePreFactor(Double midPricePreFactor) {
    this.midPricePreFactor = JsonNullable.<Double>of(midPricePreFactor);
  }


  public AbsDetails askPricePreFactor(Double askPricePreFactor) {
    this.askPricePreFactor = JsonNullable.<Double>of(askPricePreFactor);
    return this;
  }

   /**
   * Returns the agency pool ask price that is adjusted to account for prepayment expectations during the first five business days of the month before the factors are reported.
   * @return askPricePreFactor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Returns the agency pool ask price that is adjusted to account for prepayment expectations during the first five business days of the month before the factors are reported.")
  @JsonIgnore

  public Double getAskPricePreFactor() {
        return askPricePreFactor.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ASK_PRICE_PRE_FACTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Double> getAskPricePreFactor_JsonNullable() {
    return askPricePreFactor;
  }
  
  @JsonProperty(JSON_PROPERTY_ASK_PRICE_PRE_FACTOR)
  public void setAskPricePreFactor_JsonNullable(JsonNullable<Double> askPricePreFactor) {
    this.askPricePreFactor = askPricePreFactor;
  }

  public void setAskPricePreFactor(Double askPricePreFactor) {
    this.askPricePreFactor = JsonNullable.<Double>of(askPricePreFactor);
  }


  public AbsDetails cpREstimatePreFactor(Double cpREstimatePreFactor) {
    this.cpREstimatePreFactor = JsonNullable.<Double>of(cpREstimatePreFactor);
    return this;
  }

   /**
   * Returns the agency pool CPR estimate that is adjusted to account for prepayment expectations during the first five business days of the month before the factors are reported.
   * @return cpREstimatePreFactor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Returns the agency pool CPR estimate that is adjusted to account for prepayment expectations during the first five business days of the month before the factors are reported.")
  @JsonIgnore

  public Double getCpREstimatePreFactor() {
        return cpREstimatePreFactor.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CP_R_ESTIMATE_PRE_FACTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Double> getCpREstimatePreFactor_JsonNullable() {
    return cpREstimatePreFactor;
  }
  
  @JsonProperty(JSON_PROPERTY_CP_R_ESTIMATE_PRE_FACTOR)
  public void setCpREstimatePreFactor_JsonNullable(JsonNullable<Double> cpREstimatePreFactor) {
    this.cpREstimatePreFactor = cpREstimatePreFactor;
  }

  public void setCpREstimatePreFactor(Double cpREstimatePreFactor) {
    this.cpREstimatePreFactor = JsonNullable.<Double>of(cpREstimatePreFactor);
  }


  public AbsDetails liquidity(Double liquidity) {
    this.liquidity = JsonNullable.<Double>of(liquidity);
    return this;
  }

   /**
   * Returns the market liquidity score.
   * @return liquidity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "Returns the market liquidity score.")
  @JsonIgnore

  public Double getLiquidity() {
        return liquidity.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LIQUIDITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Double> getLiquidity_JsonNullable() {
    return liquidity;
  }
  
  @JsonProperty(JSON_PROPERTY_LIQUIDITY)
  public void setLiquidity_JsonNullable(JsonNullable<Double> liquidity) {
    this.liquidity = liquidity;
  }

  public void setLiquidity(Double liquidity) {
    this.liquidity = JsonNullable.<Double>of(liquidity);
  }


  public AbsDetails payUp(Double payUp) {
    this.payUp = JsonNullable.<Double>of(payUp);
    return this;
  }

   /**
   * Returns the number of ticks, in 32nds format, above the TBA price.
   * @return payUp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Returns the number of ticks, in 32nds format, above the TBA price.")
  @JsonIgnore

  public Double getPayUp() {
        return payUp.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PAY_UP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Double> getPayUp_JsonNullable() {
    return payUp;
  }
  
  @JsonProperty(JSON_PROPERTY_PAY_UP)
  public void setPayUp_JsonNullable(JsonNullable<Double> payUp) {
    this.payUp = payUp;
  }

  public void setPayUp(Double payUp) {
    this.payUp = JsonNullable.<Double>of(payUp);
  }


  public AbsDetails payUpDescription(String payUpDescription) {
    this.payUpDescription = JsonNullable.<String>of(payUpDescription);
    return this;
  }

   /**
   * Returns the specified pool characteristics being used to drive the pay-up.
   * @return payUpDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Returns the specified pool characteristics being used to drive the pay-up.")
  @JsonIgnore

  public String getPayUpDescription() {
        return payUpDescription.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PAY_UP_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getPayUpDescription_JsonNullable() {
    return payUpDescription;
  }
  
  @JsonProperty(JSON_PROPERTY_PAY_UP_DESCRIPTION)
  public void setPayUpDescription_JsonNullable(JsonNullable<String> payUpDescription) {
    this.payUpDescription = payUpDescription;
  }

  public void setPayUpDescription(String payUpDescription) {
    this.payUpDescription = JsonNullable.<String>of(payUpDescription);
  }


  public AbsDetails prePayRate(Double prePayRate) {
    this.prePayRate = JsonNullable.<Double>of(prePayRate);
    return this;
  }

   /**
   * &#39;Returns a vector of values of speed used in the evaluated price of the instrument. It is the estimated rate at which borrowers pays off the obligations that underlies an instrument.
   * @return prePayRate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20", value = "'Returns a vector of values of speed used in the evaluated price of the instrument. It is the estimated rate at which borrowers pays off the obligations that underlies an instrument.")
  @JsonIgnore

  public Double getPrePayRate() {
        return prePayRate.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PRE_PAY_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Double> getPrePayRate_JsonNullable() {
    return prePayRate;
  }
  
  @JsonProperty(JSON_PROPERTY_PRE_PAY_RATE)
  public void setPrePayRate_JsonNullable(JsonNullable<Double> prePayRate) {
    this.prePayRate = prePayRate;
  }

  public void setPrePayRate(Double prePayRate) {
    this.prePayRate = JsonNullable.<Double>of(prePayRate);
  }


  public AbsDetails prePayType(String prePayType) {
    this.prePayType = JsonNullable.<String>of(prePayType);
    return this;
  }

   /**
   * Returns the type of prepayment speed used in the evaluated price of the instrument.
   * @return prePayType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SMM", value = "Returns the type of prepayment speed used in the evaluated price of the instrument.")
  @JsonIgnore

  public String getPrePayType() {
        return prePayType.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PRE_PAY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getPrePayType_JsonNullable() {
    return prePayType;
  }
  
  @JsonProperty(JSON_PROPERTY_PRE_PAY_TYPE)
  public void setPrePayType_JsonNullable(JsonNullable<String> prePayType) {
    this.prePayType = prePayType;
  }

  public void setPrePayType(String prePayType) {
    this.prePayType = JsonNullable.<String>of(prePayType);
  }


  public AbsDetails severity(Double severity) {
    this.severity = JsonNullable.<Double>of(severity);
    return this;
  }

   /**
   * Returns a vector of Loss Severity assumption used in evaluated price of the instrument. It is the percentage of the principal applied to the defaulted loan balance.
   * @return severity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "Returns a vector of Loss Severity assumption used in evaluated price of the instrument. It is the percentage of the principal applied to the defaulted loan balance.")
  @JsonIgnore

  public Double getSeverity() {
        return severity.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SEVERITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Double> getSeverity_JsonNullable() {
    return severity;
  }
  
  @JsonProperty(JSON_PROPERTY_SEVERITY)
  public void setSeverity_JsonNullable(JsonNullable<Double> severity) {
    this.severity = severity;
  }

  public void setSeverity(Double severity) {
    this.severity = JsonNullable.<Double>of(severity);
  }


  public AbsDetails wal(Double wal) {
    this.wal = JsonNullable.<Double>of(wal);
    return this;
  }

   /**
   * Returns the Weighted Average Life of the instrument.
   * @return wal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0.886", value = "Returns the Weighted Average Life of the instrument.")
  @JsonIgnore

  public Double getWal() {
        return wal.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_WAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Double> getWal_JsonNullable() {
    return wal;
  }
  
  @JsonProperty(JSON_PROPERTY_WAL)
  public void setWal_JsonNullable(JsonNullable<Double> wal) {
    this.wal = wal;
  }

  public void setWal(Double wal) {
    this.wal = JsonNullable.<Double>of(wal);
  }


  public AbsDetails waLPrincipal(Double waLPrincipal) {
    this.waLPrincipal = JsonNullable.<Double>of(waLPrincipal);
    return this;
  }

   /**
   * Returns the Weighted Average Life of the instrument.
   * @return waLPrincipal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0.886", value = "Returns the Weighted Average Life of the instrument.")
  @JsonIgnore

  public Double getWaLPrincipal() {
        return waLPrincipal.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_WA_L_PRINCIPAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Double> getWaLPrincipal_JsonNullable() {
    return waLPrincipal;
  }
  
  @JsonProperty(JSON_PROPERTY_WA_L_PRINCIPAL)
  public void setWaLPrincipal_JsonNullable(JsonNullable<Double> waLPrincipal) {
    this.waLPrincipal = waLPrincipal;
  }

  public void setWaLPrincipal(Double waLPrincipal) {
    this.waLPrincipal = JsonNullable.<Double>of(waLPrincipal);
  }


  /**
   * Return true if this absDetails object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AbsDetails absDetails = (AbsDetails) o;
    return Objects.equals(this.requestId, absDetails.requestId) &&
        equalsNullable(this.fsymId, absDetails.fsymId) &&
        equalsNullable(this.date, absDetails.date) &&
        equalsNullable(this.cdr, absDetails.cdr) &&
        equalsNullable(this.cpr, absDetails.cpr) &&
        equalsNullable(this.factor, absDetails.factor) &&
        equalsNullable(this.estimatedFactor, absDetails.estimatedFactor) &&
        equalsNullable(this.bidPricePreFactor, absDetails.bidPricePreFactor) &&
        equalsNullable(this.midPricePreFactor, absDetails.midPricePreFactor) &&
        equalsNullable(this.askPricePreFactor, absDetails.askPricePreFactor) &&
        equalsNullable(this.cpREstimatePreFactor, absDetails.cpREstimatePreFactor) &&
        equalsNullable(this.liquidity, absDetails.liquidity) &&
        equalsNullable(this.payUp, absDetails.payUp) &&
        equalsNullable(this.payUpDescription, absDetails.payUpDescription) &&
        equalsNullable(this.prePayRate, absDetails.prePayRate) &&
        equalsNullable(this.prePayType, absDetails.prePayType) &&
        equalsNullable(this.severity, absDetails.severity) &&
        equalsNullable(this.wal, absDetails.wal) &&
        equalsNullable(this.waLPrincipal, absDetails.waLPrincipal);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestId, hashCodeNullable(fsymId), hashCodeNullable(date), hashCodeNullable(cdr), hashCodeNullable(cpr), hashCodeNullable(factor), hashCodeNullable(estimatedFactor), hashCodeNullable(bidPricePreFactor), hashCodeNullable(midPricePreFactor), hashCodeNullable(askPricePreFactor), hashCodeNullable(cpREstimatePreFactor), hashCodeNullable(liquidity), hashCodeNullable(payUp), hashCodeNullable(payUpDescription), hashCodeNullable(prePayRate), hashCodeNullable(prePayType), hashCodeNullable(severity), hashCodeNullable(wal), hashCodeNullable(waLPrincipal));
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
    sb.append("class AbsDetails {\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    fsymId: ").append(toIndentedString(fsymId)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    cdr: ").append(toIndentedString(cdr)).append("\n");
    sb.append("    cpr: ").append(toIndentedString(cpr)).append("\n");
    sb.append("    factor: ").append(toIndentedString(factor)).append("\n");
    sb.append("    estimatedFactor: ").append(toIndentedString(estimatedFactor)).append("\n");
    sb.append("    bidPricePreFactor: ").append(toIndentedString(bidPricePreFactor)).append("\n");
    sb.append("    midPricePreFactor: ").append(toIndentedString(midPricePreFactor)).append("\n");
    sb.append("    askPricePreFactor: ").append(toIndentedString(askPricePreFactor)).append("\n");
    sb.append("    cpREstimatePreFactor: ").append(toIndentedString(cpREstimatePreFactor)).append("\n");
    sb.append("    liquidity: ").append(toIndentedString(liquidity)).append("\n");
    sb.append("    payUp: ").append(toIndentedString(payUp)).append("\n");
    sb.append("    payUpDescription: ").append(toIndentedString(payUpDescription)).append("\n");
    sb.append("    prePayRate: ").append(toIndentedString(prePayRate)).append("\n");
    sb.append("    prePayType: ").append(toIndentedString(prePayType)).append("\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
    sb.append("    wal: ").append(toIndentedString(wal)).append("\n");
    sb.append("    waLPrincipal: ").append(toIndentedString(waLPrincipal)).append("\n");
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

