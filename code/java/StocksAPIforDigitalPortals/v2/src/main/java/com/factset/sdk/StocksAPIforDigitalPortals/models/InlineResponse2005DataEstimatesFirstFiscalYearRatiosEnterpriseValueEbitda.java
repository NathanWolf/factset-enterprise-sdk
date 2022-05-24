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
import com.factset.sdk.StocksAPIforDigitalPortals.models.InlineResponse2005DataEstimatesFirstFiscalYearCurrencyDependentEstimatesEbitMean;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.StocksAPIforDigitalPortals.JSON;


/**
 * Ratio of the enterprise value, divided by the EBITDA.
 */
@ApiModel(description = "Ratio of the enterprise value, divided by the EBITDA.")
@JsonPropertyOrder({
  InlineResponse2005DataEstimatesFirstFiscalYearRatiosEnterpriseValueEbitda.JSON_PROPERTY_MEAN
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse2005DataEstimatesFirstFiscalYearRatiosEnterpriseValueEbitda implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_MEAN = "mean";
  private InlineResponse2005DataEstimatesFirstFiscalYearCurrencyDependentEstimatesEbitMean mean;

  public InlineResponse2005DataEstimatesFirstFiscalYearRatiosEnterpriseValueEbitda() { 
  }

  public InlineResponse2005DataEstimatesFirstFiscalYearRatiosEnterpriseValueEbitda mean(InlineResponse2005DataEstimatesFirstFiscalYearCurrencyDependentEstimatesEbitMean mean) {
    this.mean = mean;
    return this;
  }

   /**
   * Get mean
   * @return mean
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MEAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2005DataEstimatesFirstFiscalYearCurrencyDependentEstimatesEbitMean getMean() {
    return mean;
  }


  @JsonProperty(JSON_PROPERTY_MEAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMean(InlineResponse2005DataEstimatesFirstFiscalYearCurrencyDependentEstimatesEbitMean mean) {
    this.mean = mean;
  }


  /**
   * Return true if this inline_response_200_5_data_estimates_firstFiscalYear_ratios_enterpriseValueEbitda object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2005DataEstimatesFirstFiscalYearRatiosEnterpriseValueEbitda inlineResponse2005DataEstimatesFirstFiscalYearRatiosEnterpriseValueEbitda = (InlineResponse2005DataEstimatesFirstFiscalYearRatiosEnterpriseValueEbitda) o;
    return Objects.equals(this.mean, inlineResponse2005DataEstimatesFirstFiscalYearRatiosEnterpriseValueEbitda.mean);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mean);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2005DataEstimatesFirstFiscalYearRatiosEnterpriseValueEbitda {\n");
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

