/*
 * fpo_mp_input
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.OptimizationEngineAPIMultiperiod.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.OptimizationEngineAPIMultiperiod.models.OptimizerInputsMPDiversificationConstraint;
import com.factset.sdk.OptimizationEngineAPIMultiperiod.models.OptimizerInputsMPExpectedReturnConstraint;
import com.factset.sdk.OptimizationEngineAPIMultiperiod.models.OptimizerInputsMPFactorExposureConstraint;
import com.factset.sdk.OptimizationEngineAPIMultiperiod.models.OptimizerInputsMPGeneralLinearConstraint;
import com.factset.sdk.OptimizationEngineAPIMultiperiod.models.OptimizerInputsMPHoldingsThresholdConstraint;
import com.factset.sdk.OptimizationEngineAPIMultiperiod.models.OptimizerInputsMPHoldingsWeightConstraint;
import com.factset.sdk.OptimizationEngineAPIMultiperiod.models.OptimizerInputsMPLeverageConstraint;
import com.factset.sdk.OptimizationEngineAPIMultiperiod.models.OptimizerInputsMPLimitTailRiskConstraint;
import com.factset.sdk.OptimizationEngineAPIMultiperiod.models.OptimizerInputsMPNumberOfBuysConstraint;
import com.factset.sdk.OptimizationEngineAPIMultiperiod.models.OptimizerInputsMPNumberOfSellsConstraint;
import com.factset.sdk.OptimizationEngineAPIMultiperiod.models.OptimizerInputsMPNumberofAssetsConstraint;
import com.factset.sdk.OptimizationEngineAPIMultiperiod.models.OptimizerInputsMPRiskContributionConstraint;
import com.factset.sdk.OptimizationEngineAPIMultiperiod.models.OptimizerInputsMPRiskVolatilityConstraint;
import com.factset.sdk.OptimizationEngineAPIMultiperiod.models.OptimizerInputsMPRoundlotsConstraint;
import com.factset.sdk.OptimizationEngineAPIMultiperiod.models.OptimizerInputsMPSensitivityConstraint;
import com.factset.sdk.OptimizationEngineAPIMultiperiod.models.OptimizerInputsMPTargetProbabilityConstraint;
import com.factset.sdk.OptimizationEngineAPIMultiperiod.models.OptimizerInputsMPTradeThresholdConstraint;
import com.factset.sdk.OptimizationEngineAPIMultiperiod.models.OptimizerInputsMPTurnoverConstraint;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.OptimizationEngineAPIMultiperiod.JSON;


/**
 * OptimizerInputsMultiPeriodConstraints
 */
@JsonPropertyOrder({
  OptimizerInputsMultiPeriodConstraints.JSON_PROPERTY_EXPECTED_RETURNS,
  OptimizerInputsMultiPeriodConstraints.JSON_PROPERTY_DIVERSIFICATION,
  OptimizerInputsMultiPeriodConstraints.JSON_PROPERTY_FACTOR_EXPOSURES,
  OptimizerInputsMultiPeriodConstraints.JSON_PROPERTY_GENERAL_LINEAR,
  OptimizerInputsMultiPeriodConstraints.JSON_PROPERTY_HOLDING_THRESHOLD,
  OptimizerInputsMultiPeriodConstraints.JSON_PROPERTY_LEVERAGE,
  OptimizerInputsMultiPeriodConstraints.JSON_PROPERTY_NUM_OF_ASSETS,
  OptimizerInputsMultiPeriodConstraints.JSON_PROPERTY_SENSITIVITY,
  OptimizerInputsMultiPeriodConstraints.JSON_PROPERTY_WEIGHT_CONSTRAINT,
  OptimizerInputsMultiPeriodConstraints.JSON_PROPERTY_NUMBER_OF_BUYS,
  OptimizerInputsMultiPeriodConstraints.JSON_PROPERTY_NUMBER_OF_SELLS,
  OptimizerInputsMultiPeriodConstraints.JSON_PROPERTY_ROUND_LOTS,
  OptimizerInputsMultiPeriodConstraints.JSON_PROPERTY_TRADE_THRESHOLD,
  OptimizerInputsMultiPeriodConstraints.JSON_PROPERTY_TRADING_TURNOVER,
  OptimizerInputsMultiPeriodConstraints.JSON_PROPERTY_RISK_CONTRIBUTION,
  OptimizerInputsMultiPeriodConstraints.JSON_PROPERTY_RISK_VOLATILITY,
  OptimizerInputsMultiPeriodConstraints.JSON_PROPERTY_TAIL_RISK,
  OptimizerInputsMultiPeriodConstraints.JSON_PROPERTY_TARGET_PROBABILITY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class OptimizerInputsMultiPeriodConstraints implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_EXPECTED_RETURNS = "expected_returns";
  private java.util.List<OptimizerInputsMPExpectedReturnConstraint> expectedReturns = null;

  public static final String JSON_PROPERTY_DIVERSIFICATION = "diversification";
  private java.util.List<OptimizerInputsMPDiversificationConstraint> diversification = null;

  public static final String JSON_PROPERTY_FACTOR_EXPOSURES = "factor_exposures";
  private java.util.List<OptimizerInputsMPFactorExposureConstraint> factorExposures = null;

  public static final String JSON_PROPERTY_GENERAL_LINEAR = "general_linear";
  private java.util.List<OptimizerInputsMPGeneralLinearConstraint> generalLinear = null;

  public static final String JSON_PROPERTY_HOLDING_THRESHOLD = "holding_threshold";
  private java.util.List<OptimizerInputsMPHoldingsThresholdConstraint> holdingThreshold = null;

  public static final String JSON_PROPERTY_LEVERAGE = "leverage";
  private java.util.List<OptimizerInputsMPLeverageConstraint> leverage = null;

  public static final String JSON_PROPERTY_NUM_OF_ASSETS = "num_of_assets";
  private java.util.List<OptimizerInputsMPNumberofAssetsConstraint> numOfAssets = null;

  public static final String JSON_PROPERTY_SENSITIVITY = "sensitivity";
  private java.util.List<OptimizerInputsMPSensitivityConstraint> sensitivity = null;

  public static final String JSON_PROPERTY_WEIGHT_CONSTRAINT = "weight_constraint";
  private java.util.List<OptimizerInputsMPHoldingsWeightConstraint> weightConstraint = null;

  public static final String JSON_PROPERTY_NUMBER_OF_BUYS = "number_of_buys";
  private java.util.List<OptimizerInputsMPNumberOfBuysConstraint> numberOfBuys = null;

  public static final String JSON_PROPERTY_NUMBER_OF_SELLS = "number_of_sells";
  private java.util.List<OptimizerInputsMPNumberOfSellsConstraint> numberOfSells = null;

  public static final String JSON_PROPERTY_ROUND_LOTS = "round_lots";
  private java.util.List<OptimizerInputsMPRoundlotsConstraint> roundLots = null;

  public static final String JSON_PROPERTY_TRADE_THRESHOLD = "trade_threshold";
  private java.util.List<OptimizerInputsMPTradeThresholdConstraint> tradeThreshold = null;

  public static final String JSON_PROPERTY_TRADING_TURNOVER = "trading_turnover";
  private java.util.List<OptimizerInputsMPTurnoverConstraint> tradingTurnover = null;

  public static final String JSON_PROPERTY_RISK_CONTRIBUTION = "risk_contribution";
  private java.util.List<OptimizerInputsMPRiskContributionConstraint> riskContribution = null;

  public static final String JSON_PROPERTY_RISK_VOLATILITY = "risk_volatility";
  private java.util.List<OptimizerInputsMPRiskVolatilityConstraint> riskVolatility = null;

  public static final String JSON_PROPERTY_TAIL_RISK = "tail_risk";
  private java.util.List<OptimizerInputsMPLimitTailRiskConstraint> tailRisk = null;

  public static final String JSON_PROPERTY_TARGET_PROBABILITY = "target_probability";
  private java.util.List<OptimizerInputsMPTargetProbabilityConstraint> targetProbability = null;

  public OptimizerInputsMultiPeriodConstraints() { 
  }

  public OptimizerInputsMultiPeriodConstraints expectedReturns(java.util.List<OptimizerInputsMPExpectedReturnConstraint> expectedReturns) {
    this.expectedReturns = expectedReturns;
    return this;
  }

  public OptimizerInputsMultiPeriodConstraints addExpectedReturnsItem(OptimizerInputsMPExpectedReturnConstraint expectedReturnsItem) {
    if (this.expectedReturns == null) {
      this.expectedReturns = new java.util.ArrayList<>();
    }
    this.expectedReturns.add(expectedReturnsItem);
    return this;
  }

   /**
   * Get expectedReturns
   * @return expectedReturns
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EXPECTED_RETURNS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<OptimizerInputsMPExpectedReturnConstraint> getExpectedReturns() {
    return expectedReturns;
  }


  @JsonProperty(JSON_PROPERTY_EXPECTED_RETURNS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExpectedReturns(java.util.List<OptimizerInputsMPExpectedReturnConstraint> expectedReturns) {
    this.expectedReturns = expectedReturns;
  }


  public OptimizerInputsMultiPeriodConstraints diversification(java.util.List<OptimizerInputsMPDiversificationConstraint> diversification) {
    this.diversification = diversification;
    return this;
  }

  public OptimizerInputsMultiPeriodConstraints addDiversificationItem(OptimizerInputsMPDiversificationConstraint diversificationItem) {
    if (this.diversification == null) {
      this.diversification = new java.util.ArrayList<>();
    }
    this.diversification.add(diversificationItem);
    return this;
  }

   /**
   * Get diversification
   * @return diversification
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DIVERSIFICATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<OptimizerInputsMPDiversificationConstraint> getDiversification() {
    return diversification;
  }


  @JsonProperty(JSON_PROPERTY_DIVERSIFICATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDiversification(java.util.List<OptimizerInputsMPDiversificationConstraint> diversification) {
    this.diversification = diversification;
  }


  public OptimizerInputsMultiPeriodConstraints factorExposures(java.util.List<OptimizerInputsMPFactorExposureConstraint> factorExposures) {
    this.factorExposures = factorExposures;
    return this;
  }

  public OptimizerInputsMultiPeriodConstraints addFactorExposuresItem(OptimizerInputsMPFactorExposureConstraint factorExposuresItem) {
    if (this.factorExposures == null) {
      this.factorExposures = new java.util.ArrayList<>();
    }
    this.factorExposures.add(factorExposuresItem);
    return this;
  }

   /**
   * Get factorExposures
   * @return factorExposures
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FACTOR_EXPOSURES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<OptimizerInputsMPFactorExposureConstraint> getFactorExposures() {
    return factorExposures;
  }


  @JsonProperty(JSON_PROPERTY_FACTOR_EXPOSURES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFactorExposures(java.util.List<OptimizerInputsMPFactorExposureConstraint> factorExposures) {
    this.factorExposures = factorExposures;
  }


  public OptimizerInputsMultiPeriodConstraints generalLinear(java.util.List<OptimizerInputsMPGeneralLinearConstraint> generalLinear) {
    this.generalLinear = generalLinear;
    return this;
  }

  public OptimizerInputsMultiPeriodConstraints addGeneralLinearItem(OptimizerInputsMPGeneralLinearConstraint generalLinearItem) {
    if (this.generalLinear == null) {
      this.generalLinear = new java.util.ArrayList<>();
    }
    this.generalLinear.add(generalLinearItem);
    return this;
  }

   /**
   * Get generalLinear
   * @return generalLinear
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_GENERAL_LINEAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<OptimizerInputsMPGeneralLinearConstraint> getGeneralLinear() {
    return generalLinear;
  }


  @JsonProperty(JSON_PROPERTY_GENERAL_LINEAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGeneralLinear(java.util.List<OptimizerInputsMPGeneralLinearConstraint> generalLinear) {
    this.generalLinear = generalLinear;
  }


  public OptimizerInputsMultiPeriodConstraints holdingThreshold(java.util.List<OptimizerInputsMPHoldingsThresholdConstraint> holdingThreshold) {
    this.holdingThreshold = holdingThreshold;
    return this;
  }

  public OptimizerInputsMultiPeriodConstraints addHoldingThresholdItem(OptimizerInputsMPHoldingsThresholdConstraint holdingThresholdItem) {
    if (this.holdingThreshold == null) {
      this.holdingThreshold = new java.util.ArrayList<>();
    }
    this.holdingThreshold.add(holdingThresholdItem);
    return this;
  }

   /**
   * Get holdingThreshold
   * @return holdingThreshold
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_HOLDING_THRESHOLD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<OptimizerInputsMPHoldingsThresholdConstraint> getHoldingThreshold() {
    return holdingThreshold;
  }


  @JsonProperty(JSON_PROPERTY_HOLDING_THRESHOLD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHoldingThreshold(java.util.List<OptimizerInputsMPHoldingsThresholdConstraint> holdingThreshold) {
    this.holdingThreshold = holdingThreshold;
  }


  public OptimizerInputsMultiPeriodConstraints leverage(java.util.List<OptimizerInputsMPLeverageConstraint> leverage) {
    this.leverage = leverage;
    return this;
  }

  public OptimizerInputsMultiPeriodConstraints addLeverageItem(OptimizerInputsMPLeverageConstraint leverageItem) {
    if (this.leverage == null) {
      this.leverage = new java.util.ArrayList<>();
    }
    this.leverage.add(leverageItem);
    return this;
  }

   /**
   * Get leverage
   * @return leverage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LEVERAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<OptimizerInputsMPLeverageConstraint> getLeverage() {
    return leverage;
  }


  @JsonProperty(JSON_PROPERTY_LEVERAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLeverage(java.util.List<OptimizerInputsMPLeverageConstraint> leverage) {
    this.leverage = leverage;
  }


  public OptimizerInputsMultiPeriodConstraints numOfAssets(java.util.List<OptimizerInputsMPNumberofAssetsConstraint> numOfAssets) {
    this.numOfAssets = numOfAssets;
    return this;
  }

  public OptimizerInputsMultiPeriodConstraints addNumOfAssetsItem(OptimizerInputsMPNumberofAssetsConstraint numOfAssetsItem) {
    if (this.numOfAssets == null) {
      this.numOfAssets = new java.util.ArrayList<>();
    }
    this.numOfAssets.add(numOfAssetsItem);
    return this;
  }

   /**
   * Get numOfAssets
   * @return numOfAssets
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NUM_OF_ASSETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<OptimizerInputsMPNumberofAssetsConstraint> getNumOfAssets() {
    return numOfAssets;
  }


  @JsonProperty(JSON_PROPERTY_NUM_OF_ASSETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumOfAssets(java.util.List<OptimizerInputsMPNumberofAssetsConstraint> numOfAssets) {
    this.numOfAssets = numOfAssets;
  }


  public OptimizerInputsMultiPeriodConstraints sensitivity(java.util.List<OptimizerInputsMPSensitivityConstraint> sensitivity) {
    this.sensitivity = sensitivity;
    return this;
  }

  public OptimizerInputsMultiPeriodConstraints addSensitivityItem(OptimizerInputsMPSensitivityConstraint sensitivityItem) {
    if (this.sensitivity == null) {
      this.sensitivity = new java.util.ArrayList<>();
    }
    this.sensitivity.add(sensitivityItem);
    return this;
  }

   /**
   * Get sensitivity
   * @return sensitivity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SENSITIVITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<OptimizerInputsMPSensitivityConstraint> getSensitivity() {
    return sensitivity;
  }


  @JsonProperty(JSON_PROPERTY_SENSITIVITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSensitivity(java.util.List<OptimizerInputsMPSensitivityConstraint> sensitivity) {
    this.sensitivity = sensitivity;
  }


  public OptimizerInputsMultiPeriodConstraints weightConstraint(java.util.List<OptimizerInputsMPHoldingsWeightConstraint> weightConstraint) {
    this.weightConstraint = weightConstraint;
    return this;
  }

  public OptimizerInputsMultiPeriodConstraints addWeightConstraintItem(OptimizerInputsMPHoldingsWeightConstraint weightConstraintItem) {
    if (this.weightConstraint == null) {
      this.weightConstraint = new java.util.ArrayList<>();
    }
    this.weightConstraint.add(weightConstraintItem);
    return this;
  }

   /**
   * Get weightConstraint
   * @return weightConstraint
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_WEIGHT_CONSTRAINT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<OptimizerInputsMPHoldingsWeightConstraint> getWeightConstraint() {
    return weightConstraint;
  }


  @JsonProperty(JSON_PROPERTY_WEIGHT_CONSTRAINT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWeightConstraint(java.util.List<OptimizerInputsMPHoldingsWeightConstraint> weightConstraint) {
    this.weightConstraint = weightConstraint;
  }


  public OptimizerInputsMultiPeriodConstraints numberOfBuys(java.util.List<OptimizerInputsMPNumberOfBuysConstraint> numberOfBuys) {
    this.numberOfBuys = numberOfBuys;
    return this;
  }

  public OptimizerInputsMultiPeriodConstraints addNumberOfBuysItem(OptimizerInputsMPNumberOfBuysConstraint numberOfBuysItem) {
    if (this.numberOfBuys == null) {
      this.numberOfBuys = new java.util.ArrayList<>();
    }
    this.numberOfBuys.add(numberOfBuysItem);
    return this;
  }

   /**
   * Get numberOfBuys
   * @return numberOfBuys
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NUMBER_OF_BUYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<OptimizerInputsMPNumberOfBuysConstraint> getNumberOfBuys() {
    return numberOfBuys;
  }


  @JsonProperty(JSON_PROPERTY_NUMBER_OF_BUYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumberOfBuys(java.util.List<OptimizerInputsMPNumberOfBuysConstraint> numberOfBuys) {
    this.numberOfBuys = numberOfBuys;
  }


  public OptimizerInputsMultiPeriodConstraints numberOfSells(java.util.List<OptimizerInputsMPNumberOfSellsConstraint> numberOfSells) {
    this.numberOfSells = numberOfSells;
    return this;
  }

  public OptimizerInputsMultiPeriodConstraints addNumberOfSellsItem(OptimizerInputsMPNumberOfSellsConstraint numberOfSellsItem) {
    if (this.numberOfSells == null) {
      this.numberOfSells = new java.util.ArrayList<>();
    }
    this.numberOfSells.add(numberOfSellsItem);
    return this;
  }

   /**
   * Get numberOfSells
   * @return numberOfSells
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NUMBER_OF_SELLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<OptimizerInputsMPNumberOfSellsConstraint> getNumberOfSells() {
    return numberOfSells;
  }


  @JsonProperty(JSON_PROPERTY_NUMBER_OF_SELLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumberOfSells(java.util.List<OptimizerInputsMPNumberOfSellsConstraint> numberOfSells) {
    this.numberOfSells = numberOfSells;
  }


  public OptimizerInputsMultiPeriodConstraints roundLots(java.util.List<OptimizerInputsMPRoundlotsConstraint> roundLots) {
    this.roundLots = roundLots;
    return this;
  }

  public OptimizerInputsMultiPeriodConstraints addRoundLotsItem(OptimizerInputsMPRoundlotsConstraint roundLotsItem) {
    if (this.roundLots == null) {
      this.roundLots = new java.util.ArrayList<>();
    }
    this.roundLots.add(roundLotsItem);
    return this;
  }

   /**
   * Get roundLots
   * @return roundLots
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ROUND_LOTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<OptimizerInputsMPRoundlotsConstraint> getRoundLots() {
    return roundLots;
  }


  @JsonProperty(JSON_PROPERTY_ROUND_LOTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRoundLots(java.util.List<OptimizerInputsMPRoundlotsConstraint> roundLots) {
    this.roundLots = roundLots;
  }


  public OptimizerInputsMultiPeriodConstraints tradeThreshold(java.util.List<OptimizerInputsMPTradeThresholdConstraint> tradeThreshold) {
    this.tradeThreshold = tradeThreshold;
    return this;
  }

  public OptimizerInputsMultiPeriodConstraints addTradeThresholdItem(OptimizerInputsMPTradeThresholdConstraint tradeThresholdItem) {
    if (this.tradeThreshold == null) {
      this.tradeThreshold = new java.util.ArrayList<>();
    }
    this.tradeThreshold.add(tradeThresholdItem);
    return this;
  }

   /**
   * Get tradeThreshold
   * @return tradeThreshold
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TRADE_THRESHOLD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<OptimizerInputsMPTradeThresholdConstraint> getTradeThreshold() {
    return tradeThreshold;
  }


  @JsonProperty(JSON_PROPERTY_TRADE_THRESHOLD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTradeThreshold(java.util.List<OptimizerInputsMPTradeThresholdConstraint> tradeThreshold) {
    this.tradeThreshold = tradeThreshold;
  }


  public OptimizerInputsMultiPeriodConstraints tradingTurnover(java.util.List<OptimizerInputsMPTurnoverConstraint> tradingTurnover) {
    this.tradingTurnover = tradingTurnover;
    return this;
  }

  public OptimizerInputsMultiPeriodConstraints addTradingTurnoverItem(OptimizerInputsMPTurnoverConstraint tradingTurnoverItem) {
    if (this.tradingTurnover == null) {
      this.tradingTurnover = new java.util.ArrayList<>();
    }
    this.tradingTurnover.add(tradingTurnoverItem);
    return this;
  }

   /**
   * Get tradingTurnover
   * @return tradingTurnover
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TRADING_TURNOVER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<OptimizerInputsMPTurnoverConstraint> getTradingTurnover() {
    return tradingTurnover;
  }


  @JsonProperty(JSON_PROPERTY_TRADING_TURNOVER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTradingTurnover(java.util.List<OptimizerInputsMPTurnoverConstraint> tradingTurnover) {
    this.tradingTurnover = tradingTurnover;
  }


  public OptimizerInputsMultiPeriodConstraints riskContribution(java.util.List<OptimizerInputsMPRiskContributionConstraint> riskContribution) {
    this.riskContribution = riskContribution;
    return this;
  }

  public OptimizerInputsMultiPeriodConstraints addRiskContributionItem(OptimizerInputsMPRiskContributionConstraint riskContributionItem) {
    if (this.riskContribution == null) {
      this.riskContribution = new java.util.ArrayList<>();
    }
    this.riskContribution.add(riskContributionItem);
    return this;
  }

   /**
   * Get riskContribution
   * @return riskContribution
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RISK_CONTRIBUTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<OptimizerInputsMPRiskContributionConstraint> getRiskContribution() {
    return riskContribution;
  }


  @JsonProperty(JSON_PROPERTY_RISK_CONTRIBUTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRiskContribution(java.util.List<OptimizerInputsMPRiskContributionConstraint> riskContribution) {
    this.riskContribution = riskContribution;
  }


  public OptimizerInputsMultiPeriodConstraints riskVolatility(java.util.List<OptimizerInputsMPRiskVolatilityConstraint> riskVolatility) {
    this.riskVolatility = riskVolatility;
    return this;
  }

  public OptimizerInputsMultiPeriodConstraints addRiskVolatilityItem(OptimizerInputsMPRiskVolatilityConstraint riskVolatilityItem) {
    if (this.riskVolatility == null) {
      this.riskVolatility = new java.util.ArrayList<>();
    }
    this.riskVolatility.add(riskVolatilityItem);
    return this;
  }

   /**
   * Get riskVolatility
   * @return riskVolatility
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RISK_VOLATILITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<OptimizerInputsMPRiskVolatilityConstraint> getRiskVolatility() {
    return riskVolatility;
  }


  @JsonProperty(JSON_PROPERTY_RISK_VOLATILITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRiskVolatility(java.util.List<OptimizerInputsMPRiskVolatilityConstraint> riskVolatility) {
    this.riskVolatility = riskVolatility;
  }


  public OptimizerInputsMultiPeriodConstraints tailRisk(java.util.List<OptimizerInputsMPLimitTailRiskConstraint> tailRisk) {
    this.tailRisk = tailRisk;
    return this;
  }

  public OptimizerInputsMultiPeriodConstraints addTailRiskItem(OptimizerInputsMPLimitTailRiskConstraint tailRiskItem) {
    if (this.tailRisk == null) {
      this.tailRisk = new java.util.ArrayList<>();
    }
    this.tailRisk.add(tailRiskItem);
    return this;
  }

   /**
   * MultiPeriod-Specific
   * @return tailRisk
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "MultiPeriod-Specific")
  @JsonProperty(JSON_PROPERTY_TAIL_RISK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<OptimizerInputsMPLimitTailRiskConstraint> getTailRisk() {
    return tailRisk;
  }


  @JsonProperty(JSON_PROPERTY_TAIL_RISK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTailRisk(java.util.List<OptimizerInputsMPLimitTailRiskConstraint> tailRisk) {
    this.tailRisk = tailRisk;
  }


  public OptimizerInputsMultiPeriodConstraints targetProbability(java.util.List<OptimizerInputsMPTargetProbabilityConstraint> targetProbability) {
    this.targetProbability = targetProbability;
    return this;
  }

  public OptimizerInputsMultiPeriodConstraints addTargetProbabilityItem(OptimizerInputsMPTargetProbabilityConstraint targetProbabilityItem) {
    if (this.targetProbability == null) {
      this.targetProbability = new java.util.ArrayList<>();
    }
    this.targetProbability.add(targetProbabilityItem);
    return this;
  }

   /**
   * Get targetProbability
   * @return targetProbability
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TARGET_PROBABILITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<OptimizerInputsMPTargetProbabilityConstraint> getTargetProbability() {
    return targetProbability;
  }


  @JsonProperty(JSON_PROPERTY_TARGET_PROBABILITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTargetProbability(java.util.List<OptimizerInputsMPTargetProbabilityConstraint> targetProbability) {
    this.targetProbability = targetProbability;
  }


  /**
   * Return true if this optimizer.inputs.MultiPeriodConstraints object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OptimizerInputsMultiPeriodConstraints optimizerInputsMultiPeriodConstraints = (OptimizerInputsMultiPeriodConstraints) o;
    return Objects.equals(this.expectedReturns, optimizerInputsMultiPeriodConstraints.expectedReturns) &&
        Objects.equals(this.diversification, optimizerInputsMultiPeriodConstraints.diversification) &&
        Objects.equals(this.factorExposures, optimizerInputsMultiPeriodConstraints.factorExposures) &&
        Objects.equals(this.generalLinear, optimizerInputsMultiPeriodConstraints.generalLinear) &&
        Objects.equals(this.holdingThreshold, optimizerInputsMultiPeriodConstraints.holdingThreshold) &&
        Objects.equals(this.leverage, optimizerInputsMultiPeriodConstraints.leverage) &&
        Objects.equals(this.numOfAssets, optimizerInputsMultiPeriodConstraints.numOfAssets) &&
        Objects.equals(this.sensitivity, optimizerInputsMultiPeriodConstraints.sensitivity) &&
        Objects.equals(this.weightConstraint, optimizerInputsMultiPeriodConstraints.weightConstraint) &&
        Objects.equals(this.numberOfBuys, optimizerInputsMultiPeriodConstraints.numberOfBuys) &&
        Objects.equals(this.numberOfSells, optimizerInputsMultiPeriodConstraints.numberOfSells) &&
        Objects.equals(this.roundLots, optimizerInputsMultiPeriodConstraints.roundLots) &&
        Objects.equals(this.tradeThreshold, optimizerInputsMultiPeriodConstraints.tradeThreshold) &&
        Objects.equals(this.tradingTurnover, optimizerInputsMultiPeriodConstraints.tradingTurnover) &&
        Objects.equals(this.riskContribution, optimizerInputsMultiPeriodConstraints.riskContribution) &&
        Objects.equals(this.riskVolatility, optimizerInputsMultiPeriodConstraints.riskVolatility) &&
        Objects.equals(this.tailRisk, optimizerInputsMultiPeriodConstraints.tailRisk) &&
        Objects.equals(this.targetProbability, optimizerInputsMultiPeriodConstraints.targetProbability);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expectedReturns, diversification, factorExposures, generalLinear, holdingThreshold, leverage, numOfAssets, sensitivity, weightConstraint, numberOfBuys, numberOfSells, roundLots, tradeThreshold, tradingTurnover, riskContribution, riskVolatility, tailRisk, targetProbability);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OptimizerInputsMultiPeriodConstraints {\n");
    sb.append("    expectedReturns: ").append(toIndentedString(expectedReturns)).append("\n");
    sb.append("    diversification: ").append(toIndentedString(diversification)).append("\n");
    sb.append("    factorExposures: ").append(toIndentedString(factorExposures)).append("\n");
    sb.append("    generalLinear: ").append(toIndentedString(generalLinear)).append("\n");
    sb.append("    holdingThreshold: ").append(toIndentedString(holdingThreshold)).append("\n");
    sb.append("    leverage: ").append(toIndentedString(leverage)).append("\n");
    sb.append("    numOfAssets: ").append(toIndentedString(numOfAssets)).append("\n");
    sb.append("    sensitivity: ").append(toIndentedString(sensitivity)).append("\n");
    sb.append("    weightConstraint: ").append(toIndentedString(weightConstraint)).append("\n");
    sb.append("    numberOfBuys: ").append(toIndentedString(numberOfBuys)).append("\n");
    sb.append("    numberOfSells: ").append(toIndentedString(numberOfSells)).append("\n");
    sb.append("    roundLots: ").append(toIndentedString(roundLots)).append("\n");
    sb.append("    tradeThreshold: ").append(toIndentedString(tradeThreshold)).append("\n");
    sb.append("    tradingTurnover: ").append(toIndentedString(tradingTurnover)).append("\n");
    sb.append("    riskContribution: ").append(toIndentedString(riskContribution)).append("\n");
    sb.append("    riskVolatility: ").append(toIndentedString(riskVolatility)).append("\n");
    sb.append("    tailRisk: ").append(toIndentedString(tailRisk)).append("\n");
    sb.append("    targetProbability: ").append(toIndentedString(targetProbability)).append("\n");
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

