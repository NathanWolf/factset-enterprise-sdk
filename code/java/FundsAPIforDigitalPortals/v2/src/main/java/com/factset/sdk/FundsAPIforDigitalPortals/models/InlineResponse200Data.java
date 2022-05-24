/*
 * Funds API For Digital Portals
 * Search for mutual funds and ETFs using one single consolidated API, including a criteria-based screener. The API provides also base data, key figures, and holdings.  A separate endpoint returns the possible values and value range for the parameters that the endpoint /fund/notation/screener/search accepts: Application developers can request the values and value range only for a restricted set of notations that match predefined parameters. This functionality may be used to pre-fill the values and value ranges of the parameters of the /fund/notation/screener/search endpoint so that performing a search always leads to a non-empty set of notations.  This API is fully integrated with the corresponding Quotes API, allowing access to detailed price and performance information of instruments, as well as basic security identifier cross-reference. For direct access to price histories, please refer to the Time Series API for Digital Portals.  Similar criteria based screener APIs exist for equity instruments and securitized derivatives: See the Stocks API and the Securitized Derivatives API for details.
 *
 * The version of the OpenAPI document: 2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.FundsAPIforDigitalPortals.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.FundsAPIforDigitalPortals.models.InlineResponse200DataHoldings;
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
import com.factset.sdk.FundsAPIforDigitalPortals.JSON;


/**
 * Holdings of a fund.
 */
@ApiModel(description = "Holdings of a fund.")
@JsonPropertyOrder({
  InlineResponse200Data.JSON_PROPERTY_DATE,
  InlineResponse200Data.JSON_PROPERTY_HOLDINGS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse200Data implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_DATE = "date";
  private LocalDate date;

  public static final String JSON_PROPERTY_HOLDINGS = "holdings";
  private java.util.List<InlineResponse200DataHoldings> holdings = null;

  public InlineResponse200Data() { 
  }

  public InlineResponse200Data date(LocalDate date) {
    this.date = date;
    return this;
  }

   /**
   * Date of assessment of the holdings.
   * @return date
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date of assessment of the holdings.")
  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LocalDate getDate() {
    return date;
  }


  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDate(LocalDate date) {
    this.date = date;
  }


  public InlineResponse200Data holdings(java.util.List<InlineResponse200DataHoldings> holdings) {
    this.holdings = holdings;
    return this;
  }

  public InlineResponse200Data addHoldingsItem(InlineResponse200DataHoldings holdingsItem) {
    if (this.holdings == null) {
      this.holdings = new java.util.ArrayList<>();
    }
    this.holdings.add(holdingsItem);
    return this;
  }

   /**
   * List of holdings.
   * @return holdings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of holdings.")
  @JsonProperty(JSON_PROPERTY_HOLDINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<InlineResponse200DataHoldings> getHoldings() {
    return holdings;
  }


  @JsonProperty(JSON_PROPERTY_HOLDINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHoldings(java.util.List<InlineResponse200DataHoldings> holdings) {
    this.holdings = holdings;
  }


  /**
   * Return true if this inline_response_200_data object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200Data inlineResponse200Data = (InlineResponse200Data) o;
    return Objects.equals(this.date, inlineResponse200Data.date) &&
        Objects.equals(this.holdings, inlineResponse200Data.holdings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, holdings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200Data {\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    holdings: ").append(toIndentedString(holdings)).append("\n");
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

