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
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.models.InlineResponse2001DataSummaryTransactionsBuy;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.models.InlineResponse2001DataSummaryTransactionsSell;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.models.InlineResponse2001DataSummaryTransactionsTotal;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.JSON;


/**
 * Summary of all non-cash transactions.
 */
@ApiModel(description = "Summary of all non-cash transactions.")
@JsonPropertyOrder({
  InlineResponse2001DataSummaryTransactions.JSON_PROPERTY_TOTAL,
  InlineResponse2001DataSummaryTransactions.JSON_PROPERTY_BUY,
  InlineResponse2001DataSummaryTransactions.JSON_PROPERTY_SELL
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse2001DataSummaryTransactions implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_TOTAL = "total";
  private InlineResponse2001DataSummaryTransactionsTotal total;

  public static final String JSON_PROPERTY_BUY = "buy";
  private InlineResponse2001DataSummaryTransactionsBuy buy;

  public static final String JSON_PROPERTY_SELL = "sell";
  private InlineResponse2001DataSummaryTransactionsSell sell;

  public InlineResponse2001DataSummaryTransactions() { 
  }

  public InlineResponse2001DataSummaryTransactions total(InlineResponse2001DataSummaryTransactionsTotal total) {
    this.total = total;
    return this;
  }

   /**
   * Get total
   * @return total
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TOTAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2001DataSummaryTransactionsTotal getTotal() {
    return total;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotal(InlineResponse2001DataSummaryTransactionsTotal total) {
    this.total = total;
  }


  public InlineResponse2001DataSummaryTransactions buy(InlineResponse2001DataSummaryTransactionsBuy buy) {
    this.buy = buy;
    return this;
  }

   /**
   * Get buy
   * @return buy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BUY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2001DataSummaryTransactionsBuy getBuy() {
    return buy;
  }


  @JsonProperty(JSON_PROPERTY_BUY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBuy(InlineResponse2001DataSummaryTransactionsBuy buy) {
    this.buy = buy;
  }


  public InlineResponse2001DataSummaryTransactions sell(InlineResponse2001DataSummaryTransactionsSell sell) {
    this.sell = sell;
    return this;
  }

   /**
   * Get sell
   * @return sell
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SELL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2001DataSummaryTransactionsSell getSell() {
    return sell;
  }


  @JsonProperty(JSON_PROPERTY_SELL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSell(InlineResponse2001DataSummaryTransactionsSell sell) {
    this.sell = sell;
  }


  /**
   * Return true if this inline_response_200_1_data_summary_transactions object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2001DataSummaryTransactions inlineResponse2001DataSummaryTransactions = (InlineResponse2001DataSummaryTransactions) o;
    return Objects.equals(this.total, inlineResponse2001DataSummaryTransactions.total) &&
        Objects.equals(this.buy, inlineResponse2001DataSummaryTransactions.buy) &&
        Objects.equals(this.sell, inlineResponse2001DataSummaryTransactions.sell);
  }

  @Override
  public int hashCode() {
    return Objects.hash(total, buy, sell);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2001DataSummaryTransactions {\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    buy: ").append(toIndentedString(buy)).append("\n");
    sb.append("    sell: ").append(toIndentedString(sell)).append("\n");
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

