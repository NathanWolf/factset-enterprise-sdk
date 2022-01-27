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
import com.factset.sdk.BondsAPIforDigitalPortals.models.DebtInstrumentNotationScreenerSearchDataCouponCurrentInterestRateValueMaximum;
import com.factset.sdk.BondsAPIforDigitalPortals.models.DebtInstrumentNotationScreenerSearchDataCouponCurrentInterestRateValueMinimum;
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
 * Value range for the yield to maturity, which is the annual rate of return, assuming the instrument is held until maturity.
 */
@ApiModel(description = "Value range for the yield to maturity, which is the annual rate of return, assuming the instrument is held until maturity.")
@JsonPropertyOrder({
  DebtInstrumentNotationScreenerSearchDataYieldToMaturity.JSON_PROPERTY_MINIMUM,
  DebtInstrumentNotationScreenerSearchDataYieldToMaturity.JSON_PROPERTY_MAXIMUM
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DebtInstrumentNotationScreenerSearchDataYieldToMaturity implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_MINIMUM = "minimum";
  private DebtInstrumentNotationScreenerSearchDataCouponCurrentInterestRateValueMinimum minimum;

  public static final String JSON_PROPERTY_MAXIMUM = "maximum";
  private DebtInstrumentNotationScreenerSearchDataCouponCurrentInterestRateValueMaximum maximum;


  public DebtInstrumentNotationScreenerSearchDataYieldToMaturity minimum(DebtInstrumentNotationScreenerSearchDataCouponCurrentInterestRateValueMinimum minimum) {
    this.minimum = minimum;
    return this;
  }

   /**
   * Get minimum
   * @return minimum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MINIMUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DebtInstrumentNotationScreenerSearchDataCouponCurrentInterestRateValueMinimum getMinimum() {
    return minimum;
  }


  @JsonProperty(JSON_PROPERTY_MINIMUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMinimum(DebtInstrumentNotationScreenerSearchDataCouponCurrentInterestRateValueMinimum minimum) {
    this.minimum = minimum;
  }


  public DebtInstrumentNotationScreenerSearchDataYieldToMaturity maximum(DebtInstrumentNotationScreenerSearchDataCouponCurrentInterestRateValueMaximum maximum) {
    this.maximum = maximum;
    return this;
  }

   /**
   * Get maximum
   * @return maximum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MAXIMUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DebtInstrumentNotationScreenerSearchDataCouponCurrentInterestRateValueMaximum getMaximum() {
    return maximum;
  }


  @JsonProperty(JSON_PROPERTY_MAXIMUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaximum(DebtInstrumentNotationScreenerSearchDataCouponCurrentInterestRateValueMaximum maximum) {
    this.maximum = maximum;
  }


  /**
   * Return true if this _debtInstrument_notation_screener_search_data_yield_toMaturity object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DebtInstrumentNotationScreenerSearchDataYieldToMaturity debtInstrumentNotationScreenerSearchDataYieldToMaturity = (DebtInstrumentNotationScreenerSearchDataYieldToMaturity) o;
    return Objects.equals(this.minimum, debtInstrumentNotationScreenerSearchDataYieldToMaturity.minimum) &&
        Objects.equals(this.maximum, debtInstrumentNotationScreenerSearchDataYieldToMaturity.maximum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(minimum, maximum);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DebtInstrumentNotationScreenerSearchDataYieldToMaturity {\n");
    sb.append("    minimum: ").append(toIndentedString(minimum)).append("\n");
    sb.append("    maximum: ").append(toIndentedString(maximum)).append("\n");
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

