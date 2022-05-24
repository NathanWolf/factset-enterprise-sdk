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


package com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.models;

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
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.JSON;


/**
 * Summary of all non-cash transactions.
 */
@ApiModel(description = "Summary of all non-cash transactions.")
@JsonPropertyOrder({
  InlineResponse2001DataSummaryTransactionsTotal.JSON_PROPERTY_NUMBER,
  InlineResponse2001DataSummaryTransactionsTotal.JSON_PROPERTY_TURNOVER
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse2001DataSummaryTransactionsTotal implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_NUMBER = "number";
  private BigDecimal number;

  public static final String JSON_PROPERTY_TURNOVER = "turnover";
  private BigDecimal turnover;

  public InlineResponse2001DataSummaryTransactionsTotal() { 
  }

  public InlineResponse2001DataSummaryTransactionsTotal number(BigDecimal number) {
    this.number = number;
    return this;
  }

   /**
   * Total number of transactions in the portfolio.
   * @return number
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Total number of transactions in the portfolio.")
  @JsonProperty(JSON_PROPERTY_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getNumber() {
    return number;
  }


  @JsonProperty(JSON_PROPERTY_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumber(BigDecimal number) {
    this.number = number;
  }


  public InlineResponse2001DataSummaryTransactionsTotal turnover(BigDecimal turnover) {
    this.turnover = turnover;
    return this;
  }

   /**
   * Total turnover generated by all transactions.
   * @return turnover
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Total turnover generated by all transactions.")
  @JsonProperty(JSON_PROPERTY_TURNOVER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getTurnover() {
    return turnover;
  }


  @JsonProperty(JSON_PROPERTY_TURNOVER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTurnover(BigDecimal turnover) {
    this.turnover = turnover;
  }


  /**
   * Return true if this inline_response_200_1_data_summary_transactions_total object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2001DataSummaryTransactionsTotal inlineResponse2001DataSummaryTransactionsTotal = (InlineResponse2001DataSummaryTransactionsTotal) o;
    return Objects.equals(this.number, inlineResponse2001DataSummaryTransactionsTotal.number) &&
        Objects.equals(this.turnover, inlineResponse2001DataSummaryTransactionsTotal.turnover);
  }

  @Override
  public int hashCode() {
    return Objects.hash(number, turnover);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2001DataSummaryTransactionsTotal {\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    turnover: ").append(toIndentedString(turnover)).append("\n");
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

