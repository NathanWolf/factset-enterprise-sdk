/*
 * Quotes API For Digital Portals
 * The quotes API combines endpoints for retrieving security end-of-day, delayed, and realtime prices with performance key figures and basic reference data on the security and market level.  The API supports over 20 different price types for each quote and comes with basic search endpoints based on security identifiers and instrument names. Market coverage is included in the *Sample Use Cases* section below.  The Digital Portal use case is focused on high-performance applications that are  * serving millions of end-users, * accessible by client browsers via the internet, * supporting subscriptions for streamed updates out-of-the-box, * typically combining a wide variety of *for Digital Portals*-APIs into a highly use-case specific solution for customers, * integrated into complex infrastructures such as existing frontend frameworks, authentication services.  All APIs labelled *for Digital Portals* have been designed for direct use by client web applications and feature extreme low latency: The average response time across all endpoints is 30 ms whereas 99% of all requests are answered in close to under 300ms.  See the Time Series API for Digital Portals for direct access to price histories, and the News API for Digital Portals for searching and fetching related news.
 *
 * The version of the OpenAPI document: 2
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
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20062DataCostsAndChargesExAnteOneOffEntryCostValueUnit;
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
import com.factset.sdk.QuotesAPIforDigitalPortals.JSON;


/**
 * Annualized ex post distribution fee of the investment product. This fee is included in the total ex post ongoing cost.
 */
@ApiModel(description = "Annualized ex post distribution fee of the investment product. This fee is included in the total ex post ongoing cost.")
@JsonPropertyOrder({
  InlineResponse20062DataCostsAndChargesExPostDistributionFee.JSON_PROPERTY_VALUE,
  InlineResponse20062DataCostsAndChargesExPostDistributionFee.JSON_PROPERTY_VALUE_UNIT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse20062DataCostsAndChargesExPostDistributionFee implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_VALUE = "value";
  private BigDecimal value;

  public static final String JSON_PROPERTY_VALUE_UNIT = "valueUnit";
  private InlineResponse20062DataCostsAndChargesExAnteOneOffEntryCostValueUnit valueUnit;

  public InlineResponse20062DataCostsAndChargesExPostDistributionFee() { 
  }

  public InlineResponse20062DataCostsAndChargesExPostDistributionFee value(BigDecimal value) {
    this.value = value;
    return this;
  }

   /**
   * Value of the attribute.
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Value of the attribute.")
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


  public InlineResponse20062DataCostsAndChargesExPostDistributionFee valueUnit(InlineResponse20062DataCostsAndChargesExAnteOneOffEntryCostValueUnit valueUnit) {
    this.valueUnit = valueUnit;
    return this;
  }

   /**
   * Get valueUnit
   * @return valueUnit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VALUE_UNIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse20062DataCostsAndChargesExAnteOneOffEntryCostValueUnit getValueUnit() {
    return valueUnit;
  }


  @JsonProperty(JSON_PROPERTY_VALUE_UNIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValueUnit(InlineResponse20062DataCostsAndChargesExAnteOneOffEntryCostValueUnit valueUnit) {
    this.valueUnit = valueUnit;
  }


  /**
   * Return true if this inline_response_200_62_data_costsAndCharges_exPost_distributionFee object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20062DataCostsAndChargesExPostDistributionFee inlineResponse20062DataCostsAndChargesExPostDistributionFee = (InlineResponse20062DataCostsAndChargesExPostDistributionFee) o;
    return Objects.equals(this.value, inlineResponse20062DataCostsAndChargesExPostDistributionFee.value) &&
        Objects.equals(this.valueUnit, inlineResponse20062DataCostsAndChargesExPostDistributionFee.valueUnit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, valueUnit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20062DataCostsAndChargesExPostDistributionFee {\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    valueUnit: ").append(toIndentedString(valueUnit)).append("\n");
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

