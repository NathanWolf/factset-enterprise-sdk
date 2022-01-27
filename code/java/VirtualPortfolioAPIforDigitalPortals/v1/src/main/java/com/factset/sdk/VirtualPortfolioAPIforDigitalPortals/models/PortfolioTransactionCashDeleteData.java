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
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.models.PortfolioTransactionDeleteDataTransaction;
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
 * The data member contains the request&#39;s primary data.
 */
@ApiModel(description = "The data member contains the request's primary data.")
@JsonPropertyOrder({
  PortfolioTransactionCashDeleteData.JSON_PROPERTY_ID,
  PortfolioTransactionCashDeleteData.JSON_PROPERTY_TRANSACTION
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PortfolioTransactionCashDeleteData implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_TRANSACTION = "transaction";
  private PortfolioTransactionDeleteDataTransaction transaction;


  public PortfolioTransactionCashDeleteData id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Identifier of the portfolio.
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Identifier of the portfolio.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setId(String id) {
    this.id = id;
  }


  public PortfolioTransactionCashDeleteData transaction(PortfolioTransactionDeleteDataTransaction transaction) {
    this.transaction = transaction;
    return this;
  }

   /**
   * Get transaction
   * @return transaction
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TRANSACTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public PortfolioTransactionDeleteDataTransaction getTransaction() {
    return transaction;
  }


  @JsonProperty(JSON_PROPERTY_TRANSACTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTransaction(PortfolioTransactionDeleteDataTransaction transaction) {
    this.transaction = transaction;
  }


  /**
   * Return true if this _portfolio_transaction_cash_delete_data object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PortfolioTransactionCashDeleteData portfolioTransactionCashDeleteData = (PortfolioTransactionCashDeleteData) o;
    return Objects.equals(this.id, portfolioTransactionCashDeleteData.id) &&
        Objects.equals(this.transaction, portfolioTransactionCashDeleteData.transaction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, transaction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PortfolioTransactionCashDeleteData {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    transaction: ").append(toIndentedString(transaction)).append("\n");
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

