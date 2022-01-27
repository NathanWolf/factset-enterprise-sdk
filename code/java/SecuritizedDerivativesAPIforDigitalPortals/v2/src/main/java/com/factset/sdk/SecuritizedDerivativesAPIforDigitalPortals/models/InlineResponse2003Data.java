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
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models.InlineResponse2003DataAgio;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models.InlineResponse2003DataBonusYield;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models.InlineResponse2003DataBreakEven;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models.InlineResponse2003DataCurrency;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models.InlineResponse2003DataDelta;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models.InlineResponse2003DataDiscount;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models.InlineResponse2003DataMaximumYield;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models.InlineResponse2003DataPerformanceIssue;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models.InlineResponse2003DataPrices;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models.InlineResponse2003DataSidewaysYield;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models.InlineResponse2003DataSpread;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models.InlineResponse2003DataThetaOneWeek;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models.InlineResponse2003DataUnderlyings;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models.InlineResponse2003DataVega;
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
 * Notation-based key figures of the securitized derivative.
 */
@ApiModel(description = "Notation-based key figures of the securitized derivative.")
@JsonPropertyOrder({
  InlineResponse2003Data.JSON_PROPERTY_PRICES,
  InlineResponse2003Data.JSON_PROPERTY_UNDERLYINGS,
  InlineResponse2003Data.JSON_PROPERTY_CURRENCY,
  InlineResponse2003Data.JSON_PROPERTY_PERFORMANCE_ISSUE,
  InlineResponse2003Data.JSON_PROPERTY_BONUS_YIELD,
  InlineResponse2003Data.JSON_PROPERTY_SIDEWAYS_YIELD,
  InlineResponse2003Data.JSON_PROPERTY_MAXIMUM_YIELD,
  InlineResponse2003Data.JSON_PROPERTY_AGIO,
  InlineResponse2003Data.JSON_PROPERTY_DISCOUNT,
  InlineResponse2003Data.JSON_PROPERTY_BREAK_EVEN,
  InlineResponse2003Data.JSON_PROPERTY_SPREAD,
  InlineResponse2003Data.JSON_PROPERTY_DELTA,
  InlineResponse2003Data.JSON_PROPERTY_THETA_ONE_WEEK,
  InlineResponse2003Data.JSON_PROPERTY_VEGA,
  InlineResponse2003Data.JSON_PROPERTY_LEVERAGE,
  InlineResponse2003Data.JSON_PROPERTY_OMEGA,
  InlineResponse2003Data.JSON_PROPERTY_IMPLIED_VOLATILITY,
  InlineResponse2003Data.JSON_PROPERTY_INTRINSIC_VALUE,
  InlineResponse2003Data.JSON_PROPERTY_TIME_VALUE,
  InlineResponse2003Data.JSON_PROPERTY_OUTPERFORMANCE_POINT,
  InlineResponse2003Data.JSON_PROPERTY_PARITY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse2003Data implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_PRICES = "prices";
  private InlineResponse2003DataPrices prices;

  public static final String JSON_PROPERTY_UNDERLYINGS = "underlyings";
  private java.util.List<InlineResponse2003DataUnderlyings> underlyings = null;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  private InlineResponse2003DataCurrency currency;

  public static final String JSON_PROPERTY_PERFORMANCE_ISSUE = "performanceIssue";
  private InlineResponse2003DataPerformanceIssue performanceIssue;

  public static final String JSON_PROPERTY_BONUS_YIELD = "bonusYield";
  private InlineResponse2003DataBonusYield bonusYield;

  public static final String JSON_PROPERTY_SIDEWAYS_YIELD = "sidewaysYield";
  private InlineResponse2003DataSidewaysYield sidewaysYield;

  public static final String JSON_PROPERTY_MAXIMUM_YIELD = "maximumYield";
  private InlineResponse2003DataMaximumYield maximumYield;

  public static final String JSON_PROPERTY_AGIO = "agio";
  private InlineResponse2003DataAgio agio;

  public static final String JSON_PROPERTY_DISCOUNT = "discount";
  private InlineResponse2003DataDiscount discount;

  public static final String JSON_PROPERTY_BREAK_EVEN = "breakEven";
  private InlineResponse2003DataBreakEven breakEven;

  public static final String JSON_PROPERTY_SPREAD = "spread";
  private InlineResponse2003DataSpread spread;

  public static final String JSON_PROPERTY_DELTA = "delta";
  private InlineResponse2003DataDelta delta;

  public static final String JSON_PROPERTY_THETA_ONE_WEEK = "thetaOneWeek";
  private InlineResponse2003DataThetaOneWeek thetaOneWeek;

  public static final String JSON_PROPERTY_VEGA = "vega";
  private InlineResponse2003DataVega vega;

  public static final String JSON_PROPERTY_LEVERAGE = "leverage";
  private BigDecimal leverage;

  public static final String JSON_PROPERTY_OMEGA = "omega";
  private BigDecimal omega;

  public static final String JSON_PROPERTY_IMPLIED_VOLATILITY = "impliedVolatility";
  private BigDecimal impliedVolatility;

  public static final String JSON_PROPERTY_INTRINSIC_VALUE = "intrinsicValue";
  private BigDecimal intrinsicValue;

  public static final String JSON_PROPERTY_TIME_VALUE = "timeValue";
  private BigDecimal timeValue;

  public static final String JSON_PROPERTY_OUTPERFORMANCE_POINT = "outperformancePoint";
  private BigDecimal outperformancePoint;

  public static final String JSON_PROPERTY_PARITY = "parity";
  private BigDecimal parity;


  public InlineResponse2003Data prices(InlineResponse2003DataPrices prices) {
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

  public InlineResponse2003DataPrices getPrices() {
    return prices;
  }


  @JsonProperty(JSON_PROPERTY_PRICES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrices(InlineResponse2003DataPrices prices) {
    this.prices = prices;
  }


  public InlineResponse2003Data underlyings(java.util.List<InlineResponse2003DataUnderlyings> underlyings) {
    this.underlyings = underlyings;
    return this;
  }

  public InlineResponse2003Data addUnderlyingsItem(InlineResponse2003DataUnderlyings underlyingsItem) {
    if (this.underlyings == null) {
      this.underlyings = new java.util.ArrayList<>();
    }
    this.underlyings.add(underlyingsItem);
    return this;
  }

   /**
   * Details of the underlyings.
   * @return underlyings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Details of the underlyings.")
  @JsonProperty(JSON_PROPERTY_UNDERLYINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<InlineResponse2003DataUnderlyings> getUnderlyings() {
    return underlyings;
  }


  @JsonProperty(JSON_PROPERTY_UNDERLYINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUnderlyings(java.util.List<InlineResponse2003DataUnderlyings> underlyings) {
    this.underlyings = underlyings;
  }


  public InlineResponse2003Data currency(InlineResponse2003DataCurrency currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2003DataCurrency getCurrency() {
    return currency;
  }


  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrency(InlineResponse2003DataCurrency currency) {
    this.currency = currency;
  }


  public InlineResponse2003Data performanceIssue(InlineResponse2003DataPerformanceIssue performanceIssue) {
    this.performanceIssue = performanceIssue;
    return this;
  }

   /**
   * Get performanceIssue
   * @return performanceIssue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PERFORMANCE_ISSUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2003DataPerformanceIssue getPerformanceIssue() {
    return performanceIssue;
  }


  @JsonProperty(JSON_PROPERTY_PERFORMANCE_ISSUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPerformanceIssue(InlineResponse2003DataPerformanceIssue performanceIssue) {
    this.performanceIssue = performanceIssue;
  }


  public InlineResponse2003Data bonusYield(InlineResponse2003DataBonusYield bonusYield) {
    this.bonusYield = bonusYield;
    return this;
  }

   /**
   * Get bonusYield
   * @return bonusYield
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BONUS_YIELD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2003DataBonusYield getBonusYield() {
    return bonusYield;
  }


  @JsonProperty(JSON_PROPERTY_BONUS_YIELD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBonusYield(InlineResponse2003DataBonusYield bonusYield) {
    this.bonusYield = bonusYield;
  }


  public InlineResponse2003Data sidewaysYield(InlineResponse2003DataSidewaysYield sidewaysYield) {
    this.sidewaysYield = sidewaysYield;
    return this;
  }

   /**
   * Get sidewaysYield
   * @return sidewaysYield
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SIDEWAYS_YIELD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2003DataSidewaysYield getSidewaysYield() {
    return sidewaysYield;
  }


  @JsonProperty(JSON_PROPERTY_SIDEWAYS_YIELD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSidewaysYield(InlineResponse2003DataSidewaysYield sidewaysYield) {
    this.sidewaysYield = sidewaysYield;
  }


  public InlineResponse2003Data maximumYield(InlineResponse2003DataMaximumYield maximumYield) {
    this.maximumYield = maximumYield;
    return this;
  }

   /**
   * Get maximumYield
   * @return maximumYield
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MAXIMUM_YIELD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2003DataMaximumYield getMaximumYield() {
    return maximumYield;
  }


  @JsonProperty(JSON_PROPERTY_MAXIMUM_YIELD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaximumYield(InlineResponse2003DataMaximumYield maximumYield) {
    this.maximumYield = maximumYield;
  }


  public InlineResponse2003Data agio(InlineResponse2003DataAgio agio) {
    this.agio = agio;
    return this;
  }

   /**
   * Get agio
   * @return agio
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AGIO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2003DataAgio getAgio() {
    return agio;
  }


  @JsonProperty(JSON_PROPERTY_AGIO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAgio(InlineResponse2003DataAgio agio) {
    this.agio = agio;
  }


  public InlineResponse2003Data discount(InlineResponse2003DataDiscount discount) {
    this.discount = discount;
    return this;
  }

   /**
   * Get discount
   * @return discount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DISCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2003DataDiscount getDiscount() {
    return discount;
  }


  @JsonProperty(JSON_PROPERTY_DISCOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDiscount(InlineResponse2003DataDiscount discount) {
    this.discount = discount;
  }


  public InlineResponse2003Data breakEven(InlineResponse2003DataBreakEven breakEven) {
    this.breakEven = breakEven;
    return this;
  }

   /**
   * Get breakEven
   * @return breakEven
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BREAK_EVEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2003DataBreakEven getBreakEven() {
    return breakEven;
  }


  @JsonProperty(JSON_PROPERTY_BREAK_EVEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBreakEven(InlineResponse2003DataBreakEven breakEven) {
    this.breakEven = breakEven;
  }


  public InlineResponse2003Data spread(InlineResponse2003DataSpread spread) {
    this.spread = spread;
    return this;
  }

   /**
   * Get spread
   * @return spread
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SPREAD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2003DataSpread getSpread() {
    return spread;
  }


  @JsonProperty(JSON_PROPERTY_SPREAD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSpread(InlineResponse2003DataSpread spread) {
    this.spread = spread;
  }


  public InlineResponse2003Data delta(InlineResponse2003DataDelta delta) {
    this.delta = delta;
    return this;
  }

   /**
   * Get delta
   * @return delta
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DELTA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2003DataDelta getDelta() {
    return delta;
  }


  @JsonProperty(JSON_PROPERTY_DELTA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDelta(InlineResponse2003DataDelta delta) {
    this.delta = delta;
  }


  public InlineResponse2003Data thetaOneWeek(InlineResponse2003DataThetaOneWeek thetaOneWeek) {
    this.thetaOneWeek = thetaOneWeek;
    return this;
  }

   /**
   * Get thetaOneWeek
   * @return thetaOneWeek
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_THETA_ONE_WEEK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2003DataThetaOneWeek getThetaOneWeek() {
    return thetaOneWeek;
  }


  @JsonProperty(JSON_PROPERTY_THETA_ONE_WEEK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setThetaOneWeek(InlineResponse2003DataThetaOneWeek thetaOneWeek) {
    this.thetaOneWeek = thetaOneWeek;
  }


  public InlineResponse2003Data vega(InlineResponse2003DataVega vega) {
    this.vega = vega;
    return this;
  }

   /**
   * Get vega
   * @return vega
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VEGA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2003DataVega getVega() {
    return vega;
  }


  @JsonProperty(JSON_PROPERTY_VEGA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVega(InlineResponse2003DataVega vega) {
    this.vega = vega;
  }


  public InlineResponse2003Data leverage(BigDecimal leverage) {
    this.leverage = leverage;
    return this;
  }

   /**
   * Ask-based leverage. It represents the ratio of the underlying level to the ask price of the securitized derivative, adjusted for the cover ratio and the currency cross rate. This key figure is calculated only for leveraged derivatives (e.g. warrants, knock-out certificates).
   * @return leverage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Ask-based leverage. It represents the ratio of the underlying level to the ask price of the securitized derivative, adjusted for the cover ratio and the currency cross rate. This key figure is calculated only for leveraged derivatives (e.g. warrants, knock-out certificates).")
  @JsonProperty(JSON_PROPERTY_LEVERAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getLeverage() {
    return leverage;
  }


  @JsonProperty(JSON_PROPERTY_LEVERAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLeverage(BigDecimal leverage) {
    this.leverage = leverage;
  }


  public InlineResponse2003Data omega(BigDecimal omega) {
    this.omega = omega;
    return this;
  }

   /**
   * Ask-based omega. It represents unadjusted delta (see attribute &#x60;delta.unadjusted&#x60;) multiplied with the leverage (see attribute &#x60;leverage&#x60;), both calculated based on the ask price of the derivative. Omega indicates the elasticity of the securitized derivative&#39;s price regarding the underlying level. This key figure is calculated for plain vanilla warrants only.
   * @return omega
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Ask-based omega. It represents unadjusted delta (see attribute `delta.unadjusted`) multiplied with the leverage (see attribute `leverage`), both calculated based on the ask price of the derivative. Omega indicates the elasticity of the securitized derivative's price regarding the underlying level. This key figure is calculated for plain vanilla warrants only.")
  @JsonProperty(JSON_PROPERTY_OMEGA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getOmega() {
    return omega;
  }


  @JsonProperty(JSON_PROPERTY_OMEGA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOmega(BigDecimal omega) {
    this.omega = omega;
  }


  public InlineResponse2003Data impliedVolatility(BigDecimal impliedVolatility) {
    this.impliedVolatility = impliedVolatility;
    return this;
  }

   /**
   * Ask-based implied volatility. It represents the volatility of the underlying that justifies the ask price of the derivative, when used as a parameter in the derivative&#39;s pricing model (such as Black-Scholes). Its value is a result of the pricing process, thus it represents the annual volatility of the underlying expected by the market participants until maturity of the derivative. This key figure is calculated for plain vanilla warrants only.
   * @return impliedVolatility
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Ask-based implied volatility. It represents the volatility of the underlying that justifies the ask price of the derivative, when used as a parameter in the derivative's pricing model (such as Black-Scholes). Its value is a result of the pricing process, thus it represents the annual volatility of the underlying expected by the market participants until maturity of the derivative. This key figure is calculated for plain vanilla warrants only.")
  @JsonProperty(JSON_PROPERTY_IMPLIED_VOLATILITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getImpliedVolatility() {
    return impliedVolatility;
  }


  @JsonProperty(JSON_PROPERTY_IMPLIED_VOLATILITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setImpliedVolatility(BigDecimal impliedVolatility) {
    this.impliedVolatility = impliedVolatility;
  }


  public InlineResponse2003Data intrinsicValue(BigDecimal intrinsicValue) {
    this.intrinsicValue = intrinsicValue;
    return this;
  }

   /**
   * Intrinsic value. It represents the difference between the underlying level and the strike of the securitized derivative, adjusted for the cover ratio and the currency cross rate. If the difference is negative, the intrinsic value is given as 0. The intrinsic value represents the theoretical profit from an immediate exercise of the derivative. This key figure is calculated for plain vanilla warrants only.
   * @return intrinsicValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Intrinsic value. It represents the difference between the underlying level and the strike of the securitized derivative, adjusted for the cover ratio and the currency cross rate. If the difference is negative, the intrinsic value is given as 0. The intrinsic value represents the theoretical profit from an immediate exercise of the derivative. This key figure is calculated for plain vanilla warrants only.")
  @JsonProperty(JSON_PROPERTY_INTRINSIC_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getIntrinsicValue() {
    return intrinsicValue;
  }


  @JsonProperty(JSON_PROPERTY_INTRINSIC_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIntrinsicValue(BigDecimal intrinsicValue) {
    this.intrinsicValue = intrinsicValue;
  }


  public InlineResponse2003Data timeValue(BigDecimal timeValue) {
    this.timeValue = timeValue;
    return this;
  }

   /**
   * Ask-based time value. It represents the difference between the ask price of the securitized derivative and its intrinsic value (see attribute &#x60;intrinsicValue&#x60;). This key figure is calculated for plain vanilla warrants only.
   * @return timeValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Ask-based time value. It represents the difference between the ask price of the securitized derivative and its intrinsic value (see attribute `intrinsicValue`). This key figure is calculated for plain vanilla warrants only.")
  @JsonProperty(JSON_PROPERTY_TIME_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getTimeValue() {
    return timeValue;
  }


  @JsonProperty(JSON_PROPERTY_TIME_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimeValue(BigDecimal timeValue) {
    this.timeValue = timeValue;
  }


  public InlineResponse2003Data outperformancePoint(BigDecimal outperformancePoint) {
    this.outperformancePoint = outperformancePoint;
    return this;
  }

   /**
   * Ask-based outperformance point. It represents the underlying level from which the underlying starts to outperform the securitized derivative, thus the investor would be better off investing directly in the underlying. It is calculated only for securitized derivatives with a limited payout (e.g. capped products). This key figure is not calculated for securitized derivatives with multiple underlyings. For the value unit, see attribute &#x60;underlyings.valueUnit&#x60;.
   * @return outperformancePoint
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Ask-based outperformance point. It represents the underlying level from which the underlying starts to outperform the securitized derivative, thus the investor would be better off investing directly in the underlying. It is calculated only for securitized derivatives with a limited payout (e.g. capped products). This key figure is not calculated for securitized derivatives with multiple underlyings. For the value unit, see attribute `underlyings.valueUnit`.")
  @JsonProperty(JSON_PROPERTY_OUTPERFORMANCE_POINT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getOutperformancePoint() {
    return outperformancePoint;
  }


  @JsonProperty(JSON_PROPERTY_OUTPERFORMANCE_POINT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOutperformancePoint(BigDecimal outperformancePoint) {
    this.outperformancePoint = outperformancePoint;
  }


  public InlineResponse2003Data parity(BigDecimal parity) {
    this.parity = parity;
    return this;
  }

   /**
   * Parity. It represents the difference between the underlying level and the strike of the derivative, adjusted for the cover ratio and the currency cross rate. Negative values are possible. It is the gain or loss that would result from the immediate exercise of an already present warrant and a simultaneously executed compensation transaction on the spot markets. This key figure is calculated for plain vanilla warrants only.
   * @return parity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Parity. It represents the difference between the underlying level and the strike of the derivative, adjusted for the cover ratio and the currency cross rate. Negative values are possible. It is the gain or loss that would result from the immediate exercise of an already present warrant and a simultaneously executed compensation transaction on the spot markets. This key figure is calculated for plain vanilla warrants only.")
  @JsonProperty(JSON_PROPERTY_PARITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getParity() {
    return parity;
  }


  @JsonProperty(JSON_PROPERTY_PARITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setParity(BigDecimal parity) {
    this.parity = parity;
  }


  /**
   * Return true if this inline_response_200_3_data object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2003Data inlineResponse2003Data = (InlineResponse2003Data) o;
    return Objects.equals(this.prices, inlineResponse2003Data.prices) &&
        Objects.equals(this.underlyings, inlineResponse2003Data.underlyings) &&
        Objects.equals(this.currency, inlineResponse2003Data.currency) &&
        Objects.equals(this.performanceIssue, inlineResponse2003Data.performanceIssue) &&
        Objects.equals(this.bonusYield, inlineResponse2003Data.bonusYield) &&
        Objects.equals(this.sidewaysYield, inlineResponse2003Data.sidewaysYield) &&
        Objects.equals(this.maximumYield, inlineResponse2003Data.maximumYield) &&
        Objects.equals(this.agio, inlineResponse2003Data.agio) &&
        Objects.equals(this.discount, inlineResponse2003Data.discount) &&
        Objects.equals(this.breakEven, inlineResponse2003Data.breakEven) &&
        Objects.equals(this.spread, inlineResponse2003Data.spread) &&
        Objects.equals(this.delta, inlineResponse2003Data.delta) &&
        Objects.equals(this.thetaOneWeek, inlineResponse2003Data.thetaOneWeek) &&
        Objects.equals(this.vega, inlineResponse2003Data.vega) &&
        Objects.equals(this.leverage, inlineResponse2003Data.leverage) &&
        Objects.equals(this.omega, inlineResponse2003Data.omega) &&
        Objects.equals(this.impliedVolatility, inlineResponse2003Data.impliedVolatility) &&
        Objects.equals(this.intrinsicValue, inlineResponse2003Data.intrinsicValue) &&
        Objects.equals(this.timeValue, inlineResponse2003Data.timeValue) &&
        Objects.equals(this.outperformancePoint, inlineResponse2003Data.outperformancePoint) &&
        Objects.equals(this.parity, inlineResponse2003Data.parity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(prices, underlyings, currency, performanceIssue, bonusYield, sidewaysYield, maximumYield, agio, discount, breakEven, spread, delta, thetaOneWeek, vega, leverage, omega, impliedVolatility, intrinsicValue, timeValue, outperformancePoint, parity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2003Data {\n");
    sb.append("    prices: ").append(toIndentedString(prices)).append("\n");
    sb.append("    underlyings: ").append(toIndentedString(underlyings)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    performanceIssue: ").append(toIndentedString(performanceIssue)).append("\n");
    sb.append("    bonusYield: ").append(toIndentedString(bonusYield)).append("\n");
    sb.append("    sidewaysYield: ").append(toIndentedString(sidewaysYield)).append("\n");
    sb.append("    maximumYield: ").append(toIndentedString(maximumYield)).append("\n");
    sb.append("    agio: ").append(toIndentedString(agio)).append("\n");
    sb.append("    discount: ").append(toIndentedString(discount)).append("\n");
    sb.append("    breakEven: ").append(toIndentedString(breakEven)).append("\n");
    sb.append("    spread: ").append(toIndentedString(spread)).append("\n");
    sb.append("    delta: ").append(toIndentedString(delta)).append("\n");
    sb.append("    thetaOneWeek: ").append(toIndentedString(thetaOneWeek)).append("\n");
    sb.append("    vega: ").append(toIndentedString(vega)).append("\n");
    sb.append("    leverage: ").append(toIndentedString(leverage)).append("\n");
    sb.append("    omega: ").append(toIndentedString(omega)).append("\n");
    sb.append("    impliedVolatility: ").append(toIndentedString(impliedVolatility)).append("\n");
    sb.append("    intrinsicValue: ").append(toIndentedString(intrinsicValue)).append("\n");
    sb.append("    timeValue: ").append(toIndentedString(timeValue)).append("\n");
    sb.append("    outperformancePoint: ").append(toIndentedString(outperformancePoint)).append("\n");
    sb.append("    parity: ").append(toIndentedString(parity)).append("\n");
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

