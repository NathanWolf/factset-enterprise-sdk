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
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models.SecuritizedDerivativeNotationScreenerSearchMetaPagination;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.JSON;


/**
 * The meta member contains the meta information of the request.
 */
@ApiModel(description = "The meta member contains the meta information of the request.")
@JsonPropertyOrder({
  SecuritizedDerivativeNotationScreenerSearchMeta.JSON_PROPERTY_ATTRIBUTES,
  SecuritizedDerivativeNotationScreenerSearchMeta.JSON_PROPERTY_LANGUAGE,
  SecuritizedDerivativeNotationScreenerSearchMeta.JSON_PROPERTY_SORT,
  SecuritizedDerivativeNotationScreenerSearchMeta.JSON_PROPERTY_PAGINATION
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SecuritizedDerivativeNotationScreenerSearchMeta implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private java.util.Set<String> attributes = null;

  public static final String JSON_PROPERTY_LANGUAGE = "language";
  private String language;

  /**
   * Gets or Sets sort
   */
  public enum SortEnum {
    SYMBOL("symbol"),
    
    _SYMBOL("-symbol"),
    
    MARKET_NAME("market.name"),
    
    _MARKET_NAME("-market.name"),
    
    INSTRUMENT_NAME("instrument.name"),
    
    _INSTRUMENT_NAME("-instrument.name"),
    
    INSTRUMENT_SHORTNAME("instrument.shortName"),
    
    _INSTRUMENT_SHORTNAME("-instrument.shortName"),
    
    INSTRUMENT_CATEGORIZATION_DDV_LEVEL1_NAME("instrument.categorization.ddv.level1.name"),
    
    _INSTRUMENT_CATEGORIZATION_DDV_LEVEL1_NAME("-instrument.categorization.ddv.level1.name"),
    
    INSTRUMENT_CATEGORIZATION_DDV_LEVEL2_NAME("instrument.categorization.ddv.level2.name"),
    
    _INSTRUMENT_CATEGORIZATION_DDV_LEVEL2_NAME("-instrument.categorization.ddv.level2.name"),
    
    INSTRUMENT_CATEGORIZATION_DDV_LEVEL3_NAME("instrument.categorization.ddv.level3.name"),
    
    _INSTRUMENT_CATEGORIZATION_DDV_LEVEL3_NAME("-instrument.categorization.ddv.level3.name"),
    
    INSTRUMENT_CATEGORIZATION_EUSIPA_LEVEL1_NAME("instrument.categorization.eusipa.level1.name"),
    
    _INSTRUMENT_CATEGORIZATION_EUSIPA_LEVEL1_NAME("-instrument.categorization.eusipa.level1.name"),
    
    INSTRUMENT_CATEGORIZATION_EUSIPA_LEVEL2_NAME("instrument.categorization.eusipa.level2.name"),
    
    _INSTRUMENT_CATEGORIZATION_EUSIPA_LEVEL2_NAME("-instrument.categorization.eusipa.level2.name"),
    
    INSTRUMENT_CATEGORIZATION_EUSIPA_LEVEL3_NAME("instrument.categorization.eusipa.level3.name"),
    
    _INSTRUMENT_CATEGORIZATION_EUSIPA_LEVEL3_NAME("-instrument.categorization.eusipa.level3.name"),
    
    INSTRUMENT_LIFECYCLE_MATURITY_DATE("instrument.lifeCycle.maturity.date"),
    
    _INSTRUMENT_LIFECYCLE_MATURITY_DATE("-instrument.lifeCycle.maturity.date"),
    
    INSTRUMENT_LIFECYCLE_MATURITY_REMAININGTERMDAYS("instrument.lifeCycle.maturity.remainingTermDays"),
    
    _INSTRUMENT_LIFECYCLE_MATURITY_REMAININGTERMDAYS("-instrument.lifeCycle.maturity.remainingTermDays"),
    
    INSTRUMENT_LIFECYCLE_MATURITY_PERPETUAL("instrument.lifeCycle.maturity.perpetual"),
    
    _INSTRUMENT_LIFECYCLE_MATURITY_PERPETUAL("-instrument.lifeCycle.maturity.perpetual"),
    
    INSTRUMENT_LIFECYCLE_CALLABLE("instrument.lifeCycle.callable"),
    
    _INSTRUMENT_LIFECYCLE_CALLABLE("-instrument.lifeCycle.callable"),
    
    INSTRUMENT_LIFECYCLE_VALUATION("instrument.lifeCycle.valuation"),
    
    _INSTRUMENT_LIFECYCLE_VALUATION("-instrument.lifeCycle.valuation"),
    
    INSTRUMENT_LIFECYCLE_REPAYMENT("instrument.lifeCycle.repayment"),
    
    _INSTRUMENT_LIFECYCLE_REPAYMENT("-instrument.lifeCycle.repayment"),
    
    INSTRUMENT_ISSUER_NAME("instrument.issuer.name"),
    
    _INSTRUMENT_ISSUER_NAME("-instrument.issuer.name"),
    
    INSTRUMENT_ISSUER_GROUP_NAME("instrument.issuer.group.name"),
    
    _INSTRUMENT_ISSUER_GROUP_NAME("-instrument.issuer.group.name"),
    
    INSTRUMENT_EXERCISE_RIGHT("instrument.exercise.right"),
    
    _INSTRUMENT_EXERCISE_RIGHT("-instrument.exercise.right"),
    
    INSTRUMENT_EXERCISE_STYLE("instrument.exercise.style"),
    
    _INSTRUMENT_EXERCISE_STYLE("-instrument.exercise.style"),
    
    INSTRUMENT_SETTLEMENT("instrument.settlement"),
    
    _INSTRUMENT_SETTLEMENT("-instrument.settlement"),
    
    INSTRUMENT_QUANTO("instrument.quanto"),
    
    _INSTRUMENT_QUANTO("-instrument.quanto"),
    
    INSTRUMENT_CAPITALPROTECTION("instrument.capitalProtection"),
    
    _INSTRUMENT_CAPITALPROTECTION("-instrument.capitalProtection"),
    
    INSTRUMENT_UNDERLYING_NAME("instrument.underlying.name"),
    
    _INSTRUMENT_UNDERLYING_NAME("-instrument.underlying.name"),
    
    INSTRUMENT_UNDERLYING_VALUEUNIT_CODE("instrument.underlying.valueUnit.code"),
    
    _INSTRUMENT_UNDERLYING_VALUEUNIT_CODE("-instrument.underlying.valueUnit.code"),
    
    INSTRUMENT_UNDERLYING_NOTATION_INSTRUMENT_TYPECOMPOSITE("instrument.underlying.notation.instrument.typeComposite"),
    
    _INSTRUMENT_UNDERLYING_NOTATION_INSTRUMENT_TYPECOMPOSITE("-instrument.underlying.notation.instrument.typeComposite"),
    
    INSTRUMENT_STRIKE_VALUE("instrument.strike.value"),
    
    _INSTRUMENT_STRIKE_VALUE("-instrument.strike.value"),
    
    INSTRUMENT_STRIKE_DISTANCE_ABSOLUTE("instrument.strike.distance.absolute"),
    
    _INSTRUMENT_STRIKE_DISTANCE_ABSOLUTE("-instrument.strike.distance.absolute"),
    
    INSTRUMENT_STRIKE_DISTANCE_RELATIVE("instrument.strike.distance.relative"),
    
    _INSTRUMENT_STRIKE_DISTANCE_RELATIVE("-instrument.strike.distance.relative"),
    
    INSTRUMENT_BONUSLEVEL_VALUE("instrument.bonusLevel.value"),
    
    _INSTRUMENT_BONUSLEVEL_VALUE("-instrument.bonusLevel.value"),
    
    INSTRUMENT_BONUSLEVEL_DISTANCE_ABSOLUTE("instrument.bonusLevel.distance.absolute"),
    
    _INSTRUMENT_BONUSLEVEL_DISTANCE_ABSOLUTE("-instrument.bonusLevel.distance.absolute"),
    
    INSTRUMENT_BONUSLEVEL_DISTANCE_RELATIVE("instrument.bonusLevel.distance.relative"),
    
    _INSTRUMENT_BONUSLEVEL_DISTANCE_RELATIVE("-instrument.bonusLevel.distance.relative"),
    
    INSTRUMENT_CAP_VALUE("instrument.cap.value"),
    
    _INSTRUMENT_CAP_VALUE("-instrument.cap.value"),
    
    INSTRUMENT_CAP_DISTANCE_ABSOLUTE("instrument.cap.distance.absolute"),
    
    _INSTRUMENT_CAP_DISTANCE_ABSOLUTE("-instrument.cap.distance.absolute"),
    
    INSTRUMENT_CAP_DISTANCE_RELATIVE("instrument.cap.distance.relative"),
    
    _INSTRUMENT_CAP_DISTANCE_RELATIVE("-instrument.cap.distance.relative"),
    
    INSTRUMENT_CAP_CASHFLOW("instrument.cap.cashFlow"),
    
    _INSTRUMENT_CAP_CASHFLOW("-instrument.cap.cashFlow"),
    
    INSTRUMENT_KNOCKOUT_OBSERVATION_TYPE("instrument.knockOut.observation.type"),
    
    _INSTRUMENT_KNOCKOUT_OBSERVATION_TYPE("-instrument.knockOut.observation.type"),
    
    INSTRUMENT_KNOCKOUT_VALUE("instrument.knockOut.value"),
    
    _INSTRUMENT_KNOCKOUT_VALUE("-instrument.knockOut.value"),
    
    INSTRUMENT_KNOCKOUT_DISTANCE_ABSOLUTE("instrument.knockOut.distance.absolute"),
    
    _INSTRUMENT_KNOCKOUT_DISTANCE_ABSOLUTE("-instrument.knockOut.distance.absolute"),
    
    INSTRUMENT_KNOCKOUT_DISTANCE_RELATIVE("instrument.knockOut.distance.relative"),
    
    _INSTRUMENT_KNOCKOUT_DISTANCE_RELATIVE("-instrument.knockOut.distance.relative"),
    
    INSTRUMENT_KNOCKOUT_BREACH_BREACHED("instrument.knockOut.breach.breached"),
    
    _INSTRUMENT_KNOCKOUT_BREACH_BREACHED("-instrument.knockOut.breach.breached"),
    
    INSTRUMENT_KNOCKOUT_BREACH_DATETIME("instrument.knockOut.breach.datetime"),
    
    _INSTRUMENT_KNOCKOUT_BREACH_DATETIME("-instrument.knockOut.breach.datetime"),
    
    INSTRUMENT_KNOCKIN_OBSERVATION_TYPE("instrument.knockIn.observation.type"),
    
    _INSTRUMENT_KNOCKIN_OBSERVATION_TYPE("-instrument.knockIn.observation.type"),
    
    INSTRUMENT_KNOCKIN_VALUE("instrument.knockIn.value"),
    
    _INSTRUMENT_KNOCKIN_VALUE("-instrument.knockIn.value"),
    
    INSTRUMENT_KNOCKIN_DISTANCE_ABSOLUTE("instrument.knockIn.distance.absolute"),
    
    _INSTRUMENT_KNOCKIN_DISTANCE_ABSOLUTE("-instrument.knockIn.distance.absolute"),
    
    INSTRUMENT_KNOCKIN_DISTANCE_RELATIVE("instrument.knockIn.distance.relative"),
    
    _INSTRUMENT_KNOCKIN_DISTANCE_RELATIVE("-instrument.knockIn.distance.relative"),
    
    INSTRUMENT_KNOCKIN_BREACH_BREACHED("instrument.knockIn.breach.breached"),
    
    _INSTRUMENT_KNOCKIN_BREACH_BREACHED("-instrument.knockIn.breach.breached"),
    
    INSTRUMENT_KNOCKIN_BREACH_DATETIME("instrument.knockIn.breach.datetime"),
    
    _INSTRUMENT_KNOCKIN_BREACH_DATETIME("-instrument.knockIn.breach.datetime"),
    
    INSTRUMENT_LOCKOUT_OBSERVATION_TYPE("instrument.lockOut.observation.type"),
    
    _INSTRUMENT_LOCKOUT_OBSERVATION_TYPE("-instrument.lockOut.observation.type"),
    
    INSTRUMENT_LOCKOUT_VALUE("instrument.lockOut.value"),
    
    _INSTRUMENT_LOCKOUT_VALUE("-instrument.lockOut.value"),
    
    INSTRUMENT_LOCKOUT_DISTANCE_ABSOLUTE("instrument.lockOut.distance.absolute"),
    
    _INSTRUMENT_LOCKOUT_DISTANCE_ABSOLUTE("-instrument.lockOut.distance.absolute"),
    
    INSTRUMENT_LOCKOUT_DISTANCE_RELATIVE("instrument.lockOut.distance.relative"),
    
    _INSTRUMENT_LOCKOUT_DISTANCE_RELATIVE("-instrument.lockOut.distance.relative"),
    
    INSTRUMENT_LOCKOUT_CASHFLOW("instrument.lockOut.cashFlow"),
    
    _INSTRUMENT_LOCKOUT_CASHFLOW("-instrument.lockOut.cashFlow"),
    
    INSTRUMENT_LOCKIN_OBSERVATION_TYPE("instrument.lockIn.observation.type"),
    
    _INSTRUMENT_LOCKIN_OBSERVATION_TYPE("-instrument.lockIn.observation.type"),
    
    INSTRUMENT_LOCKIN_VALUE("instrument.lockIn.value"),
    
    _INSTRUMENT_LOCKIN_VALUE("-instrument.lockIn.value"),
    
    INSTRUMENT_LOCKIN_DISTANCE_ABSOLUTE("instrument.lockIn.distance.absolute"),
    
    _INSTRUMENT_LOCKIN_DISTANCE_ABSOLUTE("-instrument.lockIn.distance.absolute"),
    
    INSTRUMENT_LOCKIN_DISTANCE_RELATIVE("instrument.lockIn.distance.relative"),
    
    _INSTRUMENT_LOCKIN_DISTANCE_RELATIVE("-instrument.lockIn.distance.relative"),
    
    INSTRUMENT_LOCKIN_CASHFLOW("instrument.lockIn.cashFlow"),
    
    _INSTRUMENT_LOCKIN_CASHFLOW("-instrument.lockIn.cashFlow"),
    
    INSTRUMENT_CAPITALGUARANTEE_VALUE("instrument.capitalGuarantee.value"),
    
    _INSTRUMENT_CAPITALGUARANTEE_VALUE("-instrument.capitalGuarantee.value"),
    
    INSTRUMENT_CAPITALGUARANTEE_DISTANCE_ABSOLUTE("instrument.capitalGuarantee.distance.absolute"),
    
    _INSTRUMENT_CAPITALGUARANTEE_DISTANCE_ABSOLUTE("-instrument.capitalGuarantee.distance.absolute"),
    
    INSTRUMENT_CAPITALGUARANTEE_DISTANCE_RELATIVE("instrument.capitalGuarantee.distance.relative"),
    
    _INSTRUMENT_CAPITALGUARANTEE_DISTANCE_RELATIVE("-instrument.capitalGuarantee.distance.relative"),
    
    INSTRUMENT_CAPITALGUARANTEE_CASHFLOW("instrument.capitalGuarantee.cashFlow"),
    
    _INSTRUMENT_CAPITALGUARANTEE_CASHFLOW("-instrument.capitalGuarantee.cashFlow"),
    
    INSTRUMENT_COUPONTRIGGERLEVEL_VALUE("instrument.couponTriggerLevel.value"),
    
    _INSTRUMENT_COUPONTRIGGERLEVEL_VALUE("-instrument.couponTriggerLevel.value"),
    
    INSTRUMENT_COUPONTRIGGERLEVEL_DISTANCE_ABSOLUTE("instrument.couponTriggerLevel.distance.absolute"),
    
    _INSTRUMENT_COUPONTRIGGERLEVEL_DISTANCE_ABSOLUTE("-instrument.couponTriggerLevel.distance.absolute"),
    
    INSTRUMENT_COUPONTRIGGERLEVEL_DISTANCE_RELATIVE("instrument.couponTriggerLevel.distance.relative"),
    
    _INSTRUMENT_COUPONTRIGGERLEVEL_DISTANCE_RELATIVE("-instrument.couponTriggerLevel.distance.relative"),
    
    INSTRUMENT_COUPONTRIGGERLEVEL_CASHFLOW("instrument.couponTriggerLevel.cashFlow"),
    
    _INSTRUMENT_COUPONTRIGGERLEVEL_CASHFLOW("-instrument.couponTriggerLevel.cashFlow"),
    
    INSTRUMENT_RANGEKNOCKOUT_OBSERVATION_TYPE("instrument.rangeKnockOut.observation.type"),
    
    _INSTRUMENT_RANGEKNOCKOUT_OBSERVATION_TYPE("-instrument.rangeKnockOut.observation.type"),
    
    INSTRUMENT_RANGEKNOCKOUT_UPPER_VALUE("instrument.rangeKnockOut.upper.value"),
    
    _INSTRUMENT_RANGEKNOCKOUT_UPPER_VALUE("-instrument.rangeKnockOut.upper.value"),
    
    INSTRUMENT_RANGEKNOCKOUT_LOWER_VALUE("instrument.rangeKnockOut.lower.value"),
    
    _INSTRUMENT_RANGEKNOCKOUT_LOWER_VALUE("-instrument.rangeKnockOut.lower.value"),
    
    INSTRUMENT_RANGEKNOCKOUT_BREACH_BREACHED("instrument.rangeKnockOut.breach.breached"),
    
    _INSTRUMENT_RANGEKNOCKOUT_BREACH_BREACHED("-instrument.rangeKnockOut.breach.breached"),
    
    INSTRUMENT_RANGEKNOCKOUT_BREACH_DATETIME("instrument.rangeKnockOut.breach.datetime"),
    
    _INSTRUMENT_RANGEKNOCKOUT_BREACH_DATETIME("-instrument.rangeKnockOut.breach.datetime"),
    
    INSTRUMENT_RANGEKNOCKOUT_CASHFLOW("instrument.rangeKnockOut.cashFlow"),
    
    _INSTRUMENT_RANGEKNOCKOUT_CASHFLOW("-instrument.rangeKnockOut.cashFlow"),
    
    INSTRUMENT_PARTICIPATION("instrument.participation"),
    
    _INSTRUMENT_PARTICIPATION("-instrument.participation"),
    
    INSTRUMENT_CONSTANTLEVERAGE("instrument.constantLeverage"),
    
    _INSTRUMENT_CONSTANTLEVERAGE("-instrument.constantLeverage"),
    
    INSTRUMENT_NOMINALCURRENCY_ISOCODE("instrument.nominalCurrency.isoCode"),
    
    _INSTRUMENT_NOMINALCURRENCY_ISOCODE("-instrument.nominalCurrency.isoCode"),
    
    INSTRUMENT_CURRENTINTERESTRATE_TYPE("instrument.currentInterestRate.type"),
    
    _INSTRUMENT_CURRENTINTERESTRATE_TYPE("-instrument.currentInterestRate.type"),
    
    INSTRUMENT_CURRENTINTERESTRATE_VALUE("instrument.currentInterestRate.value"),
    
    _INSTRUMENT_CURRENTINTERESTRATE_VALUE("-instrument.currentInterestRate.value"),
    
    KEYFIGURES_BONUSYIELD_ABSOLUTE("keyFigures.bonusYield.absolute"),
    
    _KEYFIGURES_BONUSYIELD_ABSOLUTE("-keyFigures.bonusYield.absolute"),
    
    KEYFIGURES_BONUSYIELD_RELATIVE("keyFigures.bonusYield.relative"),
    
    _KEYFIGURES_BONUSYIELD_RELATIVE("-keyFigures.bonusYield.relative"),
    
    KEYFIGURES_BONUSYIELD_ANNUALIZED("keyFigures.bonusYield.annualized"),
    
    _KEYFIGURES_BONUSYIELD_ANNUALIZED("-keyFigures.bonusYield.annualized"),
    
    KEYFIGURES_SIDEWAYSYIELD_ABSOLUTE("keyFigures.sidewaysYield.absolute"),
    
    _KEYFIGURES_SIDEWAYSYIELD_ABSOLUTE("-keyFigures.sidewaysYield.absolute"),
    
    KEYFIGURES_SIDEWAYSYIELD_RELATIVE("keyFigures.sidewaysYield.relative"),
    
    _KEYFIGURES_SIDEWAYSYIELD_RELATIVE("-keyFigures.sidewaysYield.relative"),
    
    KEYFIGURES_SIDEWAYSYIELD_ANNUALIZED("keyFigures.sidewaysYield.annualized"),
    
    _KEYFIGURES_SIDEWAYSYIELD_ANNUALIZED("-keyFigures.sidewaysYield.annualized"),
    
    KEYFIGURES_MAXIMUMYIELD_ABSOLUTE("keyFigures.maximumYield.absolute"),
    
    _KEYFIGURES_MAXIMUMYIELD_ABSOLUTE("-keyFigures.maximumYield.absolute"),
    
    KEYFIGURES_MAXIMUMYIELD_RELATIVE("keyFigures.maximumYield.relative"),
    
    _KEYFIGURES_MAXIMUMYIELD_RELATIVE("-keyFigures.maximumYield.relative"),
    
    KEYFIGURES_MAXIMUMYIELD_ANNUALIZED("keyFigures.maximumYield.annualized"),
    
    _KEYFIGURES_MAXIMUMYIELD_ANNUALIZED("-keyFigures.maximumYield.annualized"),
    
    KEYFIGURES_AGIO_ABSOLUTE("keyFigures.agio.absolute"),
    
    _KEYFIGURES_AGIO_ABSOLUTE("-keyFigures.agio.absolute"),
    
    KEYFIGURES_AGIO_RELATIVE("keyFigures.agio.relative"),
    
    _KEYFIGURES_AGIO_RELATIVE("-keyFigures.agio.relative"),
    
    KEYFIGURES_AGIO_ANNUALIZED("keyFigures.agio.annualized"),
    
    _KEYFIGURES_AGIO_ANNUALIZED("-keyFigures.agio.annualized"),
    
    KEYFIGURES_DISCOUNT_ABSOLUTE("keyFigures.discount.absolute"),
    
    _KEYFIGURES_DISCOUNT_ABSOLUTE("-keyFigures.discount.absolute"),
    
    KEYFIGURES_DISCOUNT_RELATIVE("keyFigures.discount.relative"),
    
    _KEYFIGURES_DISCOUNT_RELATIVE("-keyFigures.discount.relative"),
    
    KEYFIGURES_BREAKEVEN_BREAKEVENPOINT("keyFigures.breakEven.breakEvenPoint"),
    
    _KEYFIGURES_BREAKEVEN_BREAKEVENPOINT("-keyFigures.breakEven.breakEvenPoint"),
    
    KEYFIGURES_SPREAD_HARMONIZED("keyFigures.spread.harmonized"),
    
    _KEYFIGURES_SPREAD_HARMONIZED("-keyFigures.spread.harmonized"),
    
    KEYFIGURES_SPREAD_RELATIVE("keyFigures.spread.relative"),
    
    _KEYFIGURES_SPREAD_RELATIVE("-keyFigures.spread.relative"),
    
    KEYFIGURES_DELTA_EFFECTIVE("keyFigures.delta.effective"),
    
    _KEYFIGURES_DELTA_EFFECTIVE("-keyFigures.delta.effective"),
    
    KEYFIGURES_DELTA_UNADJUSTED("keyFigures.delta.unadjusted"),
    
    _KEYFIGURES_DELTA_UNADJUSTED("-keyFigures.delta.unadjusted"),
    
    KEYFIGURES_THETAONEWEEK_EFFECTIVE("keyFigures.thetaOneWeek.effective"),
    
    _KEYFIGURES_THETAONEWEEK_EFFECTIVE("-keyFigures.thetaOneWeek.effective"),
    
    KEYFIGURES_THETAONEWEEK_UNADJUSTED("keyFigures.thetaOneWeek.unadjusted"),
    
    _KEYFIGURES_THETAONEWEEK_UNADJUSTED("-keyFigures.thetaOneWeek.unadjusted"),
    
    KEYFIGURES_VEGA_EFFECTIVE("keyFigures.vega.effective"),
    
    _KEYFIGURES_VEGA_EFFECTIVE("-keyFigures.vega.effective"),
    
    KEYFIGURES_VEGA_UNADJUSTED("keyFigures.vega.unadjusted"),
    
    _KEYFIGURES_VEGA_UNADJUSTED("-keyFigures.vega.unadjusted"),
    
    KEYFIGURES_LEVERAGE("keyFigures.leverage"),
    
    _KEYFIGURES_LEVERAGE("-keyFigures.leverage"),
    
    KEYFIGURES_OMEGA("keyFigures.omega"),
    
    _KEYFIGURES_OMEGA("-keyFigures.omega"),
    
    KEYFIGURES_IMPLIEDVOLATILITY("keyFigures.impliedVolatility"),
    
    _KEYFIGURES_IMPLIEDVOLATILITY("-keyFigures.impliedVolatility"),
    
    KEYFIGURES_INTRINSICVALUE("keyFigures.intrinsicValue"),
    
    _KEYFIGURES_INTRINSICVALUE("-keyFigures.intrinsicValue"),
    
    KEYFIGURES_TIMEVALUE("keyFigures.timeValue"),
    
    _KEYFIGURES_TIMEVALUE("-keyFigures.timeValue"),
    
    KEYFIGURES_OUTPERFORMANCEPOINT("keyFigures.outperformancePoint"),
    
    _KEYFIGURES_OUTPERFORMANCEPOINT("-keyFigures.outperformancePoint"),
    
    KEYFIGURES_PARITY("keyFigures.parity"),
    
    _KEYFIGURES_PARITY("-keyFigures.parity"),
    
    PERFORMANCE_INTRADAY("performance.intraday"),
    
    _PERFORMANCE_INTRADAY("-performance.intraday"),
    
    PERFORMANCE_SINCEISSUE_ASK("performance.sinceIssue.ask"),
    
    _PERFORMANCE_SINCEISSUE_ASK("-performance.sinceIssue.ask"),
    
    PERFORMANCE_SINCEISSUE_BID("performance.sinceIssue.bid"),
    
    _PERFORMANCE_SINCEISSUE_BID("-performance.sinceIssue.bid"),
    
    PERFORMANCE_ENDOFDAY_DAY1("performance.endOfDay.day1"),
    
    _PERFORMANCE_ENDOFDAY_DAY1("-performance.endOfDay.day1"),
    
    PERFORMANCE_ENDOFDAY_WEEK1("performance.endOfDay.week1"),
    
    _PERFORMANCE_ENDOFDAY_WEEK1("-performance.endOfDay.week1"),
    
    PERFORMANCE_ENDOFDAY_MONTH1("performance.endOfDay.month1"),
    
    _PERFORMANCE_ENDOFDAY_MONTH1("-performance.endOfDay.month1"),
    
    PERFORMANCE_ENDOFDAY_MONTHS3("performance.endOfDay.months3"),
    
    _PERFORMANCE_ENDOFDAY_MONTHS3("-performance.endOfDay.months3"),
    
    PERFORMANCE_ENDOFDAY_MONTHS6("performance.endOfDay.months6"),
    
    _PERFORMANCE_ENDOFDAY_MONTHS6("-performance.endOfDay.months6"),
    
    PERFORMANCE_ENDOFDAY_YEAR1("performance.endOfDay.year1"),
    
    _PERFORMANCE_ENDOFDAY_YEAR1("-performance.endOfDay.year1"),
    
    PERFORMANCE_ENDOFDAY_YEARS3("performance.endOfDay.years3"),
    
    _PERFORMANCE_ENDOFDAY_YEARS3("-performance.endOfDay.years3"),
    
    PERFORMANCE_ENDOFDAY_YEARS5("performance.endOfDay.years5"),
    
    _PERFORMANCE_ENDOFDAY_YEARS5("-performance.endOfDay.years5"),
    
    PERFORMANCE_ENDOFDAY_YEARTODATE("performance.endOfDay.yearToDate"),
    
    _PERFORMANCE_ENDOFDAY_YEARTODATE("-performance.endOfDay.yearToDate"),
    
    VOLATILITY_WEEK1("volatility.week1"),
    
    _VOLATILITY_WEEK1("-volatility.week1"),
    
    VOLATILITY_MONTH1("volatility.month1"),
    
    _VOLATILITY_MONTH1("-volatility.month1"),
    
    VOLATILITY_MONTHS3("volatility.months3"),
    
    _VOLATILITY_MONTHS3("-volatility.months3"),
    
    VOLATILITY_MONTHS6("volatility.months6"),
    
    _VOLATILITY_MONTHS6("-volatility.months6"),
    
    VOLATILITY_YEAR1("volatility.year1"),
    
    _VOLATILITY_YEAR1("-volatility.year1"),
    
    VOLATILITY_YEARS3("volatility.years3"),
    
    _VOLATILITY_YEARS3("-volatility.years3"),
    
    VOLATILITY_YEARS5("volatility.years5"),
    
    _VOLATILITY_YEARS5("-volatility.years5"),
    
    VOLATILITY_YEARTODATE("volatility.yearToDate"),
    
    _VOLATILITY_YEARTODATE("-volatility.yearToDate");

    private String value;

    SortEnum(String value) {
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
    public static SortEnum fromValue(String value) {
      for (SortEnum b : SortEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_SORT = "sort";
  private java.util.Set<SortEnum> sort = null;

  public static final String JSON_PROPERTY_PAGINATION = "pagination";
  private SecuritizedDerivativeNotationScreenerSearchMetaPagination pagination;

  public SecuritizedDerivativeNotationScreenerSearchMeta() { 
  }

  public SecuritizedDerivativeNotationScreenerSearchMeta attributes(java.util.Set<String> attributes) {
    this.attributes = attributes;
    return this;
  }

  public SecuritizedDerivativeNotationScreenerSearchMeta addAttributesItem(String attributesItem) {
    if (this.attributes == null) {
      this.attributes = new java.util.LinkedHashSet<>();
    }
    this.attributes.add(attributesItem);
    return this;
  }

   /**
   * Limit the attributes returned in the response to the specified set.
   * @return attributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Limit the attributes returned in the response to the specified set.")
  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.Set<String> getAttributes() {
    return attributes;
  }


  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAttributes(java.util.Set<String> attributes) {
    this.attributes = attributes;
  }


  public SecuritizedDerivativeNotationScreenerSearchMeta language(String language) {
    this.language = language;
    return this;
  }

   /**
   * ISO 639-1 code of the language.
   * @return language
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ISO 639-1 code of the language.")
  @JsonProperty(JSON_PROPERTY_LANGUAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLanguage() {
    return language;
  }


  @JsonProperty(JSON_PROPERTY_LANGUAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLanguage(String language) {
    this.language = language;
  }


  public SecuritizedDerivativeNotationScreenerSearchMeta sort(java.util.Set<SortEnum> sort) {
    this.sort = sort;
    return this;
  }

  public SecuritizedDerivativeNotationScreenerSearchMeta addSortItem(SortEnum sortItem) {
    if (this.sort == null) {
      this.sort = new java.util.LinkedHashSet<>();
    }
    this.sort.add(sortItem);
    return this;
  }

   /**
   * Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 10 (possibly prefixed) attribute name(s) is allowed.
   * @return sort
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 10 (possibly prefixed) attribute name(s) is allowed.")
  @JsonProperty(JSON_PROPERTY_SORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.Set<SortEnum> getSort() {
    return sort;
  }


  @JsonProperty(JSON_PROPERTY_SORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSort(java.util.Set<SortEnum> sort) {
    this.sort = sort;
  }


  public SecuritizedDerivativeNotationScreenerSearchMeta pagination(SecuritizedDerivativeNotationScreenerSearchMetaPagination pagination) {
    this.pagination = pagination;
    return this;
  }

   /**
   * Get pagination
   * @return pagination
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PAGINATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SecuritizedDerivativeNotationScreenerSearchMetaPagination getPagination() {
    return pagination;
  }


  @JsonProperty(JSON_PROPERTY_PAGINATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPagination(SecuritizedDerivativeNotationScreenerSearchMetaPagination pagination) {
    this.pagination = pagination;
  }


  /**
   * Return true if this _securitizedDerivative_notation_screener_search_meta object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecuritizedDerivativeNotationScreenerSearchMeta securitizedDerivativeNotationScreenerSearchMeta = (SecuritizedDerivativeNotationScreenerSearchMeta) o;
    return Objects.equals(this.attributes, securitizedDerivativeNotationScreenerSearchMeta.attributes) &&
        Objects.equals(this.language, securitizedDerivativeNotationScreenerSearchMeta.language) &&
        Objects.equals(this.sort, securitizedDerivativeNotationScreenerSearchMeta.sort) &&
        Objects.equals(this.pagination, securitizedDerivativeNotationScreenerSearchMeta.pagination);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, language, sort, pagination);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecuritizedDerivativeNotationScreenerSearchMeta {\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
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

