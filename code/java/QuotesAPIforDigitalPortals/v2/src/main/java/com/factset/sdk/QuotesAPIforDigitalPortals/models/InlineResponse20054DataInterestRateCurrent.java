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
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20054DataInterestRateCurrentAccruedInterest;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20054DataInterestRateCurrentType;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.threeten.bp.LocalDate;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.QuotesAPIforDigitalPortals.JSON;


/**
 * Details of the current coupon period.
 */
@ApiModel(description = "Details of the current coupon period.")
@JsonPropertyOrder({
  InlineResponse20054DataInterestRateCurrent.JSON_PROPERTY_VALUE,
  InlineResponse20054DataInterestRateCurrent.JSON_PROPERTY_TYPE,
  InlineResponse20054DataInterestRateCurrent.JSON_PROPERTY_ACCRUED_INTEREST,
  InlineResponse20054DataInterestRateCurrent.JSON_PROPERTY_PERIOD_END
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse20054DataInterestRateCurrent implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_VALUE = "value";
  private BigDecimal value;

  public static final String JSON_PROPERTY_TYPE = "type";
  private InlineResponse20054DataInterestRateCurrentType type;

  public static final String JSON_PROPERTY_ACCRUED_INTEREST = "accruedInterest";
  private InlineResponse20054DataInterestRateCurrentAccruedInterest accruedInterest;

  public static final String JSON_PROPERTY_PERIOD_END = "periodEnd";
  private LocalDate periodEnd;


  public InlineResponse20054DataInterestRateCurrent value(BigDecimal value) {
    this.value = value;
    return this;
  }

   /**
   * Value of the interest rate.
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Value of the interest rate.")
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getValue() {
    return value;
  }


  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValue(BigDecimal value) {
    this.value = value;
  }


  public InlineResponse20054DataInterestRateCurrent type(InlineResponse20054DataInterestRateCurrentType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse20054DataInterestRateCurrentType getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(InlineResponse20054DataInterestRateCurrentType type) {
    this.type = type;
  }


  public InlineResponse20054DataInterestRateCurrent accruedInterest(InlineResponse20054DataInterestRateCurrentAccruedInterest accruedInterest) {
    this.accruedInterest = accruedInterest;
    return this;
  }

   /**
   * Get accruedInterest
   * @return accruedInterest
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ACCRUED_INTEREST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse20054DataInterestRateCurrentAccruedInterest getAccruedInterest() {
    return accruedInterest;
  }


  @JsonProperty(JSON_PROPERTY_ACCRUED_INTEREST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccruedInterest(InlineResponse20054DataInterestRateCurrentAccruedInterest accruedInterest) {
    this.accruedInterest = accruedInterest;
  }


  public InlineResponse20054DataInterestRateCurrent periodEnd(LocalDate periodEnd) {
    this.periodEnd = periodEnd;
    return this;
  }

   /**
   * Ending date (inclusive).
   * @return periodEnd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Ending date (inclusive).")
  @JsonProperty(JSON_PROPERTY_PERIOD_END)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LocalDate getPeriodEnd() {
    return periodEnd;
  }


  @JsonProperty(JSON_PROPERTY_PERIOD_END)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPeriodEnd(LocalDate periodEnd) {
    this.periodEnd = periodEnd;
  }


  /**
   * Return true if this inline_response_200_54_data_interestRate_current object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20054DataInterestRateCurrent inlineResponse20054DataInterestRateCurrent = (InlineResponse20054DataInterestRateCurrent) o;
    return Objects.equals(this.value, inlineResponse20054DataInterestRateCurrent.value) &&
        Objects.equals(this.type, inlineResponse20054DataInterestRateCurrent.type) &&
        Objects.equals(this.accruedInterest, inlineResponse20054DataInterestRateCurrent.accruedInterest) &&
        Objects.equals(this.periodEnd, inlineResponse20054DataInterestRateCurrent.periodEnd);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, type, accruedInterest, periodEnd);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20054DataInterestRateCurrent {\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    accruedInterest: ").append(toIndentedString(accruedInterest)).append("\n");
    sb.append("    periodEnd: ").append(toIndentedString(periodEnd)).append("\n");
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

