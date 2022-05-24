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
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20051DataInterestRateAnnualized;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20051DataInterestRatePeriodic;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20051DataInterestRateType;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.QuotesAPIforDigitalPortals.JSON;


/**
 * Interest rate for the coupon period.
 */
@ApiModel(description = "Interest rate for the coupon period.")
@JsonPropertyOrder({
  InlineResponse20051DataInterestRate.JSON_PROPERTY_TYPE,
  InlineResponse20051DataInterestRate.JSON_PROPERTY_ANNUALIZED,
  InlineResponse20051DataInterestRate.JSON_PROPERTY_PERIODIC
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse20051DataInterestRate implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_TYPE = "type";
  private InlineResponse20051DataInterestRateType type;

  public static final String JSON_PROPERTY_ANNUALIZED = "annualized";
  private InlineResponse20051DataInterestRateAnnualized annualized;

  public static final String JSON_PROPERTY_PERIODIC = "periodic";
  private InlineResponse20051DataInterestRatePeriodic periodic;

  public InlineResponse20051DataInterestRate() { 
  }

  public InlineResponse20051DataInterestRate type(InlineResponse20051DataInterestRateType type) {
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

  public InlineResponse20051DataInterestRateType getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(InlineResponse20051DataInterestRateType type) {
    this.type = type;
  }


  public InlineResponse20051DataInterestRate annualized(InlineResponse20051DataInterestRateAnnualized annualized) {
    this.annualized = annualized;
    return this;
  }

   /**
   * Get annualized
   * @return annualized
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ANNUALIZED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse20051DataInterestRateAnnualized getAnnualized() {
    return annualized;
  }


  @JsonProperty(JSON_PROPERTY_ANNUALIZED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAnnualized(InlineResponse20051DataInterestRateAnnualized annualized) {
    this.annualized = annualized;
  }


  public InlineResponse20051DataInterestRate periodic(InlineResponse20051DataInterestRatePeriodic periodic) {
    this.periodic = periodic;
    return this;
  }

   /**
   * Get periodic
   * @return periodic
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PERIODIC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse20051DataInterestRatePeriodic getPeriodic() {
    return periodic;
  }


  @JsonProperty(JSON_PROPERTY_PERIODIC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPeriodic(InlineResponse20051DataInterestRatePeriodic periodic) {
    this.periodic = periodic;
  }


  /**
   * Return true if this inline_response_200_51_data_interestRate object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20051DataInterestRate inlineResponse20051DataInterestRate = (InlineResponse20051DataInterestRate) o;
    return Objects.equals(this.type, inlineResponse20051DataInterestRate.type) &&
        Objects.equals(this.annualized, inlineResponse20051DataInterestRate.annualized) &&
        Objects.equals(this.periodic, inlineResponse20051DataInterestRate.periodic);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, annualized, periodic);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20051DataInterestRate {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    annualized: ").append(toIndentedString(annualized)).append("\n");
    sb.append("    periodic: ").append(toIndentedString(periodic)).append("\n");
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

