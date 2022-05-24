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


package com.factset.sdk.StocksAPIforDigitalPortals.models;

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
import java.math.BigDecimal;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.StocksAPIforDigitalPortals.JSON;


/**
 * Cash flow per share, which is the ratio of the net operating cash flow, divided by the shares outstanding.
 */
@ApiModel(description = "Cash flow per share, which is the ratio of the net operating cash flow, divided by the shares outstanding.")
@JsonPropertyOrder({
  InlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimatesPerShareCashFlow.JSON_PROPERTY_MEAN
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimatesPerShareCashFlow implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_MEAN = "mean";
  private BigDecimal mean;

  public InlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimatesPerShareCashFlow() { 
  }

  public InlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimatesPerShareCashFlow mean(BigDecimal mean) {
    this.mean = mean;
    return this;
  }

   /**
   * Mean value.
   * @return mean
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Mean value.")
  @JsonProperty(JSON_PROPERTY_MEAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getMean() {
    return mean;
  }


  @JsonProperty(JSON_PROPERTY_MEAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMean(BigDecimal mean) {
    this.mean = mean;
  }


  /**
   * Return true if this inline_response_200_4_estimates_firstFiscalYear_currencyDependentEstimates_perShare_cashFlow object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimatesPerShareCashFlow inlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimatesPerShareCashFlow = (InlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimatesPerShareCashFlow) o;
    return Objects.equals(this.mean, inlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimatesPerShareCashFlow.mean);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mean);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimatesPerShareCashFlow {\n");
    sb.append("    mean: ").append(toIndentedString(mean)).append("\n");
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

