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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.QuotesAPIforDigitalPortals.JSON;


/**
 * Details of the final coupon period.
 */
@ApiModel(description = "Details of the final coupon period.")
@JsonPropertyOrder({
  InlineResponse20054DataInterestRateFinal.JSON_PROPERTY_PERIOD_END
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse20054DataInterestRateFinal implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_PERIOD_END = "periodEnd";
  private LocalDate periodEnd;

  public InlineResponse20054DataInterestRateFinal() { 
  }

  public InlineResponse20054DataInterestRateFinal periodEnd(LocalDate periodEnd) {
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
   * Return true if this inline_response_200_54_data_interestRate_final object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20054DataInterestRateFinal inlineResponse20054DataInterestRateFinal = (InlineResponse20054DataInterestRateFinal) o;
    return Objects.equals(this.periodEnd, inlineResponse20054DataInterestRateFinal.periodEnd);
  }

  @Override
  public int hashCode() {
    return Objects.hash(periodEnd);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20054DataInterestRateFinal {\n");
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

