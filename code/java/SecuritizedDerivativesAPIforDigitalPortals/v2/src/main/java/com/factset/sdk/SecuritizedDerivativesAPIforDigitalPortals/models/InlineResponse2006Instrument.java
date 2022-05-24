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


package com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models.InlineResponse2004InstrumentFsym;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models.InlineResponse2006InstrumentBonusLevel;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models.InlineResponse2006InstrumentCap;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models.InlineResponse2006InstrumentCapitalGuarantee;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models.InlineResponse2006InstrumentCategorization;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models.InlineResponse2006InstrumentCouponTriggerLevel;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models.InlineResponse2006InstrumentCurrentInterestRate;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models.InlineResponse2006InstrumentExercise;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models.InlineResponse2006InstrumentIssuer;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models.InlineResponse2006InstrumentKnockIn;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models.InlineResponse2006InstrumentKnockOut;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models.InlineResponse2006InstrumentLifeCycle;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models.InlineResponse2006InstrumentLockIn;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models.InlineResponse2006InstrumentLockOut;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models.InlineResponse2006InstrumentNominalCurrency;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models.InlineResponse2006InstrumentRangeKnockOut;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models.InlineResponse2006InstrumentStrike;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models.InlineResponse2006InstrumentUnderlying;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models.InlineResponse200DataNsin;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.JSON;


/**
 * Instrument data of the notation.
 */
@ApiModel(description = "Instrument data of the notation.")
@JsonPropertyOrder({
  InlineResponse2006Instrument.JSON_PROPERTY_ID,
  InlineResponse2006Instrument.JSON_PROPERTY_NAME,
  InlineResponse2006Instrument.JSON_PROPERTY_SHORT_NAME,
  InlineResponse2006Instrument.JSON_PROPERTY_ISIN,
  InlineResponse2006Instrument.JSON_PROPERTY_NSIN,
  InlineResponse2006Instrument.JSON_PROPERTY_FSYM,
  InlineResponse2006Instrument.JSON_PROPERTY_CATEGORIZATION,
  InlineResponse2006Instrument.JSON_PROPERTY_LIFE_CYCLE,
  InlineResponse2006Instrument.JSON_PROPERTY_ISSUER,
  InlineResponse2006Instrument.JSON_PROPERTY_EXERCISE,
  InlineResponse2006Instrument.JSON_PROPERTY_SETTLEMENT,
  InlineResponse2006Instrument.JSON_PROPERTY_COLLATERALIZED,
  InlineResponse2006Instrument.JSON_PROPERTY_QUANTO,
  InlineResponse2006Instrument.JSON_PROPERTY_CAPITAL_PROTECTION,
  InlineResponse2006Instrument.JSON_PROPERTY_UNDERLYING,
  InlineResponse2006Instrument.JSON_PROPERTY_STRIKE,
  InlineResponse2006Instrument.JSON_PROPERTY_BONUS_LEVEL,
  InlineResponse2006Instrument.JSON_PROPERTY_CAP,
  InlineResponse2006Instrument.JSON_PROPERTY_KNOCK_OUT,
  InlineResponse2006Instrument.JSON_PROPERTY_KNOCK_IN,
  InlineResponse2006Instrument.JSON_PROPERTY_LOCK_OUT,
  InlineResponse2006Instrument.JSON_PROPERTY_LOCK_IN,
  InlineResponse2006Instrument.JSON_PROPERTY_CAPITAL_GUARANTEE,
  InlineResponse2006Instrument.JSON_PROPERTY_COUPON_TRIGGER_LEVEL,
  InlineResponse2006Instrument.JSON_PROPERTY_RANGE_KNOCK_OUT,
  InlineResponse2006Instrument.JSON_PROPERTY_PARTICIPATION,
  InlineResponse2006Instrument.JSON_PROPERTY_CONSTANT_LEVERAGE,
  InlineResponse2006Instrument.JSON_PROPERTY_NOMINAL_CURRENCY,
  InlineResponse2006Instrument.JSON_PROPERTY_CURRENT_INTEREST_RATE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse2006Instrument implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SHORT_NAME = "shortName";
  private String shortName;

  public static final String JSON_PROPERTY_ISIN = "isin";
  private String isin;

  public static final String JSON_PROPERTY_NSIN = "nsin";
  private InlineResponse200DataNsin nsin;

  public static final String JSON_PROPERTY_FSYM = "fsym";
  private InlineResponse2004InstrumentFsym fsym;

  public static final String JSON_PROPERTY_CATEGORIZATION = "categorization";
  private InlineResponse2006InstrumentCategorization categorization;

  public static final String JSON_PROPERTY_LIFE_CYCLE = "lifeCycle";
  private InlineResponse2006InstrumentLifeCycle lifeCycle;

  public static final String JSON_PROPERTY_ISSUER = "issuer";
  private InlineResponse2006InstrumentIssuer issuer;

  public static final String JSON_PROPERTY_EXERCISE = "exercise";
  private InlineResponse2006InstrumentExercise exercise;

  /**
   * Settlement of the securitized derivative. It concerns the fulfillment of the issuer&#39;s contractual obligations arising from the securitized derivative. Depending on the terms, the underlying asset may be delivered physically or its equivalent monetary value may be payed out.
   */
  public enum SettlementEnum {
    CASH("cash"),
    
    PHYSICAL("physical"),
    
    EITHER("either");

    private String value;

    SettlementEnum(String value) {
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
    public static SettlementEnum fromValue(String value) {
      for (SettlementEnum b : SettlementEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_SETTLEMENT = "settlement";
  private SettlementEnum settlement;

  public static final String JSON_PROPERTY_COLLATERALIZED = "collateralized";
  private Boolean collateralized;

  public static final String JSON_PROPERTY_QUANTO = "quanto";
  private Boolean quanto;

  public static final String JSON_PROPERTY_CAPITAL_PROTECTION = "capitalProtection";
  private BigDecimal capitalProtection;

  public static final String JSON_PROPERTY_UNDERLYING = "underlying";
  private InlineResponse2006InstrumentUnderlying underlying;

  public static final String JSON_PROPERTY_STRIKE = "strike";
  private InlineResponse2006InstrumentStrike strike;

  public static final String JSON_PROPERTY_BONUS_LEVEL = "bonusLevel";
  private InlineResponse2006InstrumentBonusLevel bonusLevel;

  public static final String JSON_PROPERTY_CAP = "cap";
  private InlineResponse2006InstrumentCap cap;

  public static final String JSON_PROPERTY_KNOCK_OUT = "knockOut";
  private InlineResponse2006InstrumentKnockOut knockOut;

  public static final String JSON_PROPERTY_KNOCK_IN = "knockIn";
  private InlineResponse2006InstrumentKnockIn knockIn;

  public static final String JSON_PROPERTY_LOCK_OUT = "lockOut";
  private InlineResponse2006InstrumentLockOut lockOut;

  public static final String JSON_PROPERTY_LOCK_IN = "lockIn";
  private InlineResponse2006InstrumentLockIn lockIn;

  public static final String JSON_PROPERTY_CAPITAL_GUARANTEE = "capitalGuarantee";
  private InlineResponse2006InstrumentCapitalGuarantee capitalGuarantee;

  public static final String JSON_PROPERTY_COUPON_TRIGGER_LEVEL = "couponTriggerLevel";
  private InlineResponse2006InstrumentCouponTriggerLevel couponTriggerLevel;

  public static final String JSON_PROPERTY_RANGE_KNOCK_OUT = "rangeKnockOut";
  private InlineResponse2006InstrumentRangeKnockOut rangeKnockOut;

  /**
   * Participation direction of a factor certificate at the level movement of its effective underlying.
   */
  public enum ParticipationEnum {
    LONG("long"),
    
    SHORT("short");

    private String value;

    ParticipationEnum(String value) {
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
    public static ParticipationEnum fromValue(String value) {
      for (ParticipationEnum b : ParticipationEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_PARTICIPATION = "participation";
  private ParticipationEnum participation;

  public static final String JSON_PROPERTY_CONSTANT_LEVERAGE = "constantLeverage";
  private BigDecimal constantLeverage;

  public static final String JSON_PROPERTY_NOMINAL_CURRENCY = "nominalCurrency";
  private InlineResponse2006InstrumentNominalCurrency nominalCurrency;

  public static final String JSON_PROPERTY_CURRENT_INTEREST_RATE = "currentInterestRate";
  private InlineResponse2006InstrumentCurrentInterestRate currentInterestRate;

  public InlineResponse2006Instrument() { 
  }

  public InlineResponse2006Instrument id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Identifier of the instrument.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Identifier of the instrument.")
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


  public InlineResponse2006Instrument name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the instrument.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the instrument.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public InlineResponse2006Instrument shortName(String shortName) {
    this.shortName = shortName;
    return this;
  }

   /**
   * Short name of the instrument.
   * @return shortName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Short name of the instrument.")
  @JsonProperty(JSON_PROPERTY_SHORT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getShortName() {
    return shortName;
  }


  @JsonProperty(JSON_PROPERTY_SHORT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShortName(String shortName) {
    this.shortName = shortName;
  }


  public InlineResponse2006Instrument isin(String isin) {
    this.isin = isin;
    return this;
  }

   /**
   * The International Securities Identification Number (ISIN) of the instrument.The ISIN is a 12-character code of digits and upper-case letters that uniquely identifiesan instrument.
   * @return isin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The International Securities Identification Number (ISIN) of the instrument.The ISIN is a 12-character code of digits and upper-case letters that uniquely identifiesan instrument.")
  @JsonProperty(JSON_PROPERTY_ISIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIsin() {
    return isin;
  }


  @JsonProperty(JSON_PROPERTY_ISIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsin(String isin) {
    this.isin = isin;
  }


  public InlineResponse2006Instrument nsin(InlineResponse200DataNsin nsin) {
    this.nsin = nsin;
    return this;
  }

   /**
   * Get nsin
   * @return nsin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NSIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse200DataNsin getNsin() {
    return nsin;
  }


  @JsonProperty(JSON_PROPERTY_NSIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNsin(InlineResponse200DataNsin nsin) {
    this.nsin = nsin;
  }


  public InlineResponse2006Instrument fsym(InlineResponse2004InstrumentFsym fsym) {
    this.fsym = fsym;
    return this;
  }

   /**
   * Get fsym
   * @return fsym
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FSYM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2004InstrumentFsym getFsym() {
    return fsym;
  }


  @JsonProperty(JSON_PROPERTY_FSYM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFsym(InlineResponse2004InstrumentFsym fsym) {
    this.fsym = fsym;
  }


  public InlineResponse2006Instrument categorization(InlineResponse2006InstrumentCategorization categorization) {
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

  public InlineResponse2006InstrumentCategorization getCategorization() {
    return categorization;
  }


  @JsonProperty(JSON_PROPERTY_CATEGORIZATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCategorization(InlineResponse2006InstrumentCategorization categorization) {
    this.categorization = categorization;
  }


  public InlineResponse2006Instrument lifeCycle(InlineResponse2006InstrumentLifeCycle lifeCycle) {
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

  public InlineResponse2006InstrumentLifeCycle getLifeCycle() {
    return lifeCycle;
  }


  @JsonProperty(JSON_PROPERTY_LIFE_CYCLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLifeCycle(InlineResponse2006InstrumentLifeCycle lifeCycle) {
    this.lifeCycle = lifeCycle;
  }


  public InlineResponse2006Instrument issuer(InlineResponse2006InstrumentIssuer issuer) {
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

  public InlineResponse2006InstrumentIssuer getIssuer() {
    return issuer;
  }


  @JsonProperty(JSON_PROPERTY_ISSUER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIssuer(InlineResponse2006InstrumentIssuer issuer) {
    this.issuer = issuer;
  }


  public InlineResponse2006Instrument exercise(InlineResponse2006InstrumentExercise exercise) {
    this.exercise = exercise;
    return this;
  }

   /**
   * Get exercise
   * @return exercise
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EXERCISE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2006InstrumentExercise getExercise() {
    return exercise;
  }


  @JsonProperty(JSON_PROPERTY_EXERCISE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExercise(InlineResponse2006InstrumentExercise exercise) {
    this.exercise = exercise;
  }


  public InlineResponse2006Instrument settlement(SettlementEnum settlement) {
    this.settlement = settlement;
    return this;
  }

   /**
   * Settlement of the securitized derivative. It concerns the fulfillment of the issuer&#39;s contractual obligations arising from the securitized derivative. Depending on the terms, the underlying asset may be delivered physically or its equivalent monetary value may be payed out.
   * @return settlement
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Settlement of the securitized derivative. It concerns the fulfillment of the issuer's contractual obligations arising from the securitized derivative. Depending on the terms, the underlying asset may be delivered physically or its equivalent monetary value may be payed out.")
  @JsonProperty(JSON_PROPERTY_SETTLEMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SettlementEnum getSettlement() {
    return settlement;
  }


  @JsonProperty(JSON_PROPERTY_SETTLEMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSettlement(SettlementEnum settlement) {
    this.settlement = settlement;
  }


  public InlineResponse2006Instrument collateralized(Boolean collateralized) {
    this.collateralized = collateralized;
    return this;
  }

   /**
   * If &#x60;true&#x60;, this instrument is protected against an issuer default by collateral (e.g. COSI collateralization by SIX Swiss Exchange).
   * @return collateralized
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If `true`, this instrument is protected against an issuer default by collateral (e.g. COSI collateralization by SIX Swiss Exchange).")
  @JsonProperty(JSON_PROPERTY_COLLATERALIZED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getCollateralized() {
    return collateralized;
  }


  @JsonProperty(JSON_PROPERTY_COLLATERALIZED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCollateralized(Boolean collateralized) {
    this.collateralized = collateralized;
  }


  public InlineResponse2006Instrument quanto(Boolean quanto) {
    this.quanto = quanto;
    return this;
  }

   /**
   * If &#x60;true&#x60;, the risk of exchange rate fluctuations between the value unit of the underlying and the value unit of the cash flows is hedged.
   * @return quanto
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If `true`, the risk of exchange rate fluctuations between the value unit of the underlying and the value unit of the cash flows is hedged.")
  @JsonProperty(JSON_PROPERTY_QUANTO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getQuanto() {
    return quanto;
  }


  @JsonProperty(JSON_PROPERTY_QUANTO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setQuanto(Boolean quanto) {
    this.quanto = quanto;
  }


  public InlineResponse2006Instrument capitalProtection(BigDecimal capitalProtection) {
    this.capitalProtection = capitalProtection;
    return this;
  }

   /**
   * Proportion of the nominal amount protected against loss.
   * @return capitalProtection
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Proportion of the nominal amount protected against loss.")
  @JsonProperty(JSON_PROPERTY_CAPITAL_PROTECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getCapitalProtection() {
    return capitalProtection;
  }


  @JsonProperty(JSON_PROPERTY_CAPITAL_PROTECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCapitalProtection(BigDecimal capitalProtection) {
    this.capitalProtection = capitalProtection;
  }


  public InlineResponse2006Instrument underlying(InlineResponse2006InstrumentUnderlying underlying) {
    this.underlying = underlying;
    return this;
  }

   /**
   * Get underlying
   * @return underlying
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_UNDERLYING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2006InstrumentUnderlying getUnderlying() {
    return underlying;
  }


  @JsonProperty(JSON_PROPERTY_UNDERLYING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUnderlying(InlineResponse2006InstrumentUnderlying underlying) {
    this.underlying = underlying;
  }


  public InlineResponse2006Instrument strike(InlineResponse2006InstrumentStrike strike) {
    this.strike = strike;
    return this;
  }

   /**
   * Get strike
   * @return strike
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STRIKE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2006InstrumentStrike getStrike() {
    return strike;
  }


  @JsonProperty(JSON_PROPERTY_STRIKE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStrike(InlineResponse2006InstrumentStrike strike) {
    this.strike = strike;
  }


  public InlineResponse2006Instrument bonusLevel(InlineResponse2006InstrumentBonusLevel bonusLevel) {
    this.bonusLevel = bonusLevel;
    return this;
  }

   /**
   * Get bonusLevel
   * @return bonusLevel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BONUS_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2006InstrumentBonusLevel getBonusLevel() {
    return bonusLevel;
  }


  @JsonProperty(JSON_PROPERTY_BONUS_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBonusLevel(InlineResponse2006InstrumentBonusLevel bonusLevel) {
    this.bonusLevel = bonusLevel;
  }


  public InlineResponse2006Instrument cap(InlineResponse2006InstrumentCap cap) {
    this.cap = cap;
    return this;
  }

   /**
   * Get cap
   * @return cap
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CAP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2006InstrumentCap getCap() {
    return cap;
  }


  @JsonProperty(JSON_PROPERTY_CAP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCap(InlineResponse2006InstrumentCap cap) {
    this.cap = cap;
  }


  public InlineResponse2006Instrument knockOut(InlineResponse2006InstrumentKnockOut knockOut) {
    this.knockOut = knockOut;
    return this;
  }

   /**
   * Get knockOut
   * @return knockOut
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_KNOCK_OUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2006InstrumentKnockOut getKnockOut() {
    return knockOut;
  }


  @JsonProperty(JSON_PROPERTY_KNOCK_OUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKnockOut(InlineResponse2006InstrumentKnockOut knockOut) {
    this.knockOut = knockOut;
  }


  public InlineResponse2006Instrument knockIn(InlineResponse2006InstrumentKnockIn knockIn) {
    this.knockIn = knockIn;
    return this;
  }

   /**
   * Get knockIn
   * @return knockIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_KNOCK_IN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2006InstrumentKnockIn getKnockIn() {
    return knockIn;
  }


  @JsonProperty(JSON_PROPERTY_KNOCK_IN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKnockIn(InlineResponse2006InstrumentKnockIn knockIn) {
    this.knockIn = knockIn;
  }


  public InlineResponse2006Instrument lockOut(InlineResponse2006InstrumentLockOut lockOut) {
    this.lockOut = lockOut;
    return this;
  }

   /**
   * Get lockOut
   * @return lockOut
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LOCK_OUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2006InstrumentLockOut getLockOut() {
    return lockOut;
  }


  @JsonProperty(JSON_PROPERTY_LOCK_OUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLockOut(InlineResponse2006InstrumentLockOut lockOut) {
    this.lockOut = lockOut;
  }


  public InlineResponse2006Instrument lockIn(InlineResponse2006InstrumentLockIn lockIn) {
    this.lockIn = lockIn;
    return this;
  }

   /**
   * Get lockIn
   * @return lockIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LOCK_IN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2006InstrumentLockIn getLockIn() {
    return lockIn;
  }


  @JsonProperty(JSON_PROPERTY_LOCK_IN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLockIn(InlineResponse2006InstrumentLockIn lockIn) {
    this.lockIn = lockIn;
  }


  public InlineResponse2006Instrument capitalGuarantee(InlineResponse2006InstrumentCapitalGuarantee capitalGuarantee) {
    this.capitalGuarantee = capitalGuarantee;
    return this;
  }

   /**
   * Get capitalGuarantee
   * @return capitalGuarantee
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CAPITAL_GUARANTEE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2006InstrumentCapitalGuarantee getCapitalGuarantee() {
    return capitalGuarantee;
  }


  @JsonProperty(JSON_PROPERTY_CAPITAL_GUARANTEE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCapitalGuarantee(InlineResponse2006InstrumentCapitalGuarantee capitalGuarantee) {
    this.capitalGuarantee = capitalGuarantee;
  }


  public InlineResponse2006Instrument couponTriggerLevel(InlineResponse2006InstrumentCouponTriggerLevel couponTriggerLevel) {
    this.couponTriggerLevel = couponTriggerLevel;
    return this;
  }

   /**
   * Get couponTriggerLevel
   * @return couponTriggerLevel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_COUPON_TRIGGER_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2006InstrumentCouponTriggerLevel getCouponTriggerLevel() {
    return couponTriggerLevel;
  }


  @JsonProperty(JSON_PROPERTY_COUPON_TRIGGER_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCouponTriggerLevel(InlineResponse2006InstrumentCouponTriggerLevel couponTriggerLevel) {
    this.couponTriggerLevel = couponTriggerLevel;
  }


  public InlineResponse2006Instrument rangeKnockOut(InlineResponse2006InstrumentRangeKnockOut rangeKnockOut) {
    this.rangeKnockOut = rangeKnockOut;
    return this;
  }

   /**
   * Get rangeKnockOut
   * @return rangeKnockOut
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RANGE_KNOCK_OUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2006InstrumentRangeKnockOut getRangeKnockOut() {
    return rangeKnockOut;
  }


  @JsonProperty(JSON_PROPERTY_RANGE_KNOCK_OUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRangeKnockOut(InlineResponse2006InstrumentRangeKnockOut rangeKnockOut) {
    this.rangeKnockOut = rangeKnockOut;
  }


  public InlineResponse2006Instrument participation(ParticipationEnum participation) {
    this.participation = participation;
    return this;
  }

   /**
   * Participation direction of a factor certificate at the level movement of its effective underlying.
   * @return participation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Participation direction of a factor certificate at the level movement of its effective underlying.")
  @JsonProperty(JSON_PROPERTY_PARTICIPATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ParticipationEnum getParticipation() {
    return participation;
  }


  @JsonProperty(JSON_PROPERTY_PARTICIPATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setParticipation(ParticipationEnum participation) {
    this.participation = participation;
  }


  public InlineResponse2006Instrument constantLeverage(BigDecimal constantLeverage) {
    this.constantLeverage = constantLeverage;
    return this;
  }

   /**
   * Constant leverage of a factor certificate.
   * @return constantLeverage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Constant leverage of a factor certificate.")
  @JsonProperty(JSON_PROPERTY_CONSTANT_LEVERAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getConstantLeverage() {
    return constantLeverage;
  }


  @JsonProperty(JSON_PROPERTY_CONSTANT_LEVERAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConstantLeverage(BigDecimal constantLeverage) {
    this.constantLeverage = constantLeverage;
  }


  public InlineResponse2006Instrument nominalCurrency(InlineResponse2006InstrumentNominalCurrency nominalCurrency) {
    this.nominalCurrency = nominalCurrency;
    return this;
  }

   /**
   * Get nominalCurrency
   * @return nominalCurrency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NOMINAL_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2006InstrumentNominalCurrency getNominalCurrency() {
    return nominalCurrency;
  }


  @JsonProperty(JSON_PROPERTY_NOMINAL_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNominalCurrency(InlineResponse2006InstrumentNominalCurrency nominalCurrency) {
    this.nominalCurrency = nominalCurrency;
  }


  public InlineResponse2006Instrument currentInterestRate(InlineResponse2006InstrumentCurrentInterestRate currentInterestRate) {
    this.currentInterestRate = currentInterestRate;
    return this;
  }

   /**
   * Get currentInterestRate
   * @return currentInterestRate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CURRENT_INTEREST_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2006InstrumentCurrentInterestRate getCurrentInterestRate() {
    return currentInterestRate;
  }


  @JsonProperty(JSON_PROPERTY_CURRENT_INTEREST_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrentInterestRate(InlineResponse2006InstrumentCurrentInterestRate currentInterestRate) {
    this.currentInterestRate = currentInterestRate;
  }


  /**
   * Return true if this inline_response_200_6_instrument object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2006Instrument inlineResponse2006Instrument = (InlineResponse2006Instrument) o;
    return Objects.equals(this.id, inlineResponse2006Instrument.id) &&
        Objects.equals(this.name, inlineResponse2006Instrument.name) &&
        Objects.equals(this.shortName, inlineResponse2006Instrument.shortName) &&
        Objects.equals(this.isin, inlineResponse2006Instrument.isin) &&
        Objects.equals(this.nsin, inlineResponse2006Instrument.nsin) &&
        Objects.equals(this.fsym, inlineResponse2006Instrument.fsym) &&
        Objects.equals(this.categorization, inlineResponse2006Instrument.categorization) &&
        Objects.equals(this.lifeCycle, inlineResponse2006Instrument.lifeCycle) &&
        Objects.equals(this.issuer, inlineResponse2006Instrument.issuer) &&
        Objects.equals(this.exercise, inlineResponse2006Instrument.exercise) &&
        Objects.equals(this.settlement, inlineResponse2006Instrument.settlement) &&
        Objects.equals(this.collateralized, inlineResponse2006Instrument.collateralized) &&
        Objects.equals(this.quanto, inlineResponse2006Instrument.quanto) &&
        Objects.equals(this.capitalProtection, inlineResponse2006Instrument.capitalProtection) &&
        Objects.equals(this.underlying, inlineResponse2006Instrument.underlying) &&
        Objects.equals(this.strike, inlineResponse2006Instrument.strike) &&
        Objects.equals(this.bonusLevel, inlineResponse2006Instrument.bonusLevel) &&
        Objects.equals(this.cap, inlineResponse2006Instrument.cap) &&
        Objects.equals(this.knockOut, inlineResponse2006Instrument.knockOut) &&
        Objects.equals(this.knockIn, inlineResponse2006Instrument.knockIn) &&
        Objects.equals(this.lockOut, inlineResponse2006Instrument.lockOut) &&
        Objects.equals(this.lockIn, inlineResponse2006Instrument.lockIn) &&
        Objects.equals(this.capitalGuarantee, inlineResponse2006Instrument.capitalGuarantee) &&
        Objects.equals(this.couponTriggerLevel, inlineResponse2006Instrument.couponTriggerLevel) &&
        Objects.equals(this.rangeKnockOut, inlineResponse2006Instrument.rangeKnockOut) &&
        Objects.equals(this.participation, inlineResponse2006Instrument.participation) &&
        Objects.equals(this.constantLeverage, inlineResponse2006Instrument.constantLeverage) &&
        Objects.equals(this.nominalCurrency, inlineResponse2006Instrument.nominalCurrency) &&
        Objects.equals(this.currentInterestRate, inlineResponse2006Instrument.currentInterestRate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, shortName, isin, nsin, fsym, categorization, lifeCycle, issuer, exercise, settlement, collateralized, quanto, capitalProtection, underlying, strike, bonusLevel, cap, knockOut, knockIn, lockOut, lockIn, capitalGuarantee, couponTriggerLevel, rangeKnockOut, participation, constantLeverage, nominalCurrency, currentInterestRate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2006Instrument {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    shortName: ").append(toIndentedString(shortName)).append("\n");
    sb.append("    isin: ").append(toIndentedString(isin)).append("\n");
    sb.append("    nsin: ").append(toIndentedString(nsin)).append("\n");
    sb.append("    fsym: ").append(toIndentedString(fsym)).append("\n");
    sb.append("    categorization: ").append(toIndentedString(categorization)).append("\n");
    sb.append("    lifeCycle: ").append(toIndentedString(lifeCycle)).append("\n");
    sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
    sb.append("    exercise: ").append(toIndentedString(exercise)).append("\n");
    sb.append("    settlement: ").append(toIndentedString(settlement)).append("\n");
    sb.append("    collateralized: ").append(toIndentedString(collateralized)).append("\n");
    sb.append("    quanto: ").append(toIndentedString(quanto)).append("\n");
    sb.append("    capitalProtection: ").append(toIndentedString(capitalProtection)).append("\n");
    sb.append("    underlying: ").append(toIndentedString(underlying)).append("\n");
    sb.append("    strike: ").append(toIndentedString(strike)).append("\n");
    sb.append("    bonusLevel: ").append(toIndentedString(bonusLevel)).append("\n");
    sb.append("    cap: ").append(toIndentedString(cap)).append("\n");
    sb.append("    knockOut: ").append(toIndentedString(knockOut)).append("\n");
    sb.append("    knockIn: ").append(toIndentedString(knockIn)).append("\n");
    sb.append("    lockOut: ").append(toIndentedString(lockOut)).append("\n");
    sb.append("    lockIn: ").append(toIndentedString(lockIn)).append("\n");
    sb.append("    capitalGuarantee: ").append(toIndentedString(capitalGuarantee)).append("\n");
    sb.append("    couponTriggerLevel: ").append(toIndentedString(couponTriggerLevel)).append("\n");
    sb.append("    rangeKnockOut: ").append(toIndentedString(rangeKnockOut)).append("\n");
    sb.append("    participation: ").append(toIndentedString(participation)).append("\n");
    sb.append("    constantLeverage: ").append(toIndentedString(constantLeverage)).append("\n");
    sb.append("    nominalCurrency: ").append(toIndentedString(nominalCurrency)).append("\n");
    sb.append("    currentInterestRate: ").append(toIndentedString(currentInterestRate)).append("\n");
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

