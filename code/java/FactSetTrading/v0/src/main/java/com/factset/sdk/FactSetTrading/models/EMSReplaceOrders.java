/*
 * EMS API
 * Allow clients to trade orders.
 *
 * The version of the OpenAPI document: 0.2.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.FactSetTrading.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.FactSetTrading.models.EMSReplaceOrder;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.FactSetTrading.JSON;


/**
 * EMS Replace Orders
 */
@ApiModel(description = "EMS Replace Orders")
@JsonPropertyOrder({
  EMSReplaceOrders.JSON_PROPERTY_INVESTOR_ID,
  EMSReplaceOrders.JSON_PROPERTY_ORDERS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class EMSReplaceOrders implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_INVESTOR_ID = "investorId";
  private JsonNullable<String> investorId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ORDERS = "orders";
  private JsonNullable<java.util.List<EMSReplaceOrder>> orders = JsonNullable.<java.util.List<EMSReplaceOrder>>undefined();

  public EMSReplaceOrders() { 
  }

  public EMSReplaceOrders investorId(String investorId) {
    this.investorId = JsonNullable.<String>of(investorId);
    return this;
  }

   /**
   * Investor Id
   * @return investorId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "DEMO-12345", value = "Investor Id")
  @JsonIgnore

  public String getInvestorId() {
        return investorId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_INVESTOR_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getInvestorId_JsonNullable() {
    return investorId;
  }
  
  @JsonProperty(JSON_PROPERTY_INVESTOR_ID)
  public void setInvestorId_JsonNullable(JsonNullable<String> investorId) {
    this.investorId = investorId;
  }

  public void setInvestorId(String investorId) {
    this.investorId = JsonNullable.<String>of(investorId);
  }


  public EMSReplaceOrders orders(java.util.List<EMSReplaceOrder> orders) {
    this.orders = JsonNullable.<java.util.List<EMSReplaceOrder>>of(orders);
    return this;
  }

  public EMSReplaceOrders addOrdersItem(EMSReplaceOrder ordersItem) {
    if (this.orders == null || !this.orders.isPresent()) {
      this.orders = JsonNullable.<java.util.List<EMSReplaceOrder>>of(new java.util.ArrayList<>());
    }
    try {
      this.orders.get().add(ordersItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * List of orders to replace
   * @return orders
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of orders to replace")
  @JsonIgnore

  public java.util.List<EMSReplaceOrder> getOrders() {
        return orders.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ORDERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<java.util.List<EMSReplaceOrder>> getOrders_JsonNullable() {
    return orders;
  }
  
  @JsonProperty(JSON_PROPERTY_ORDERS)
  public void setOrders_JsonNullable(JsonNullable<java.util.List<EMSReplaceOrder>> orders) {
    this.orders = orders;
  }

  public void setOrders(java.util.List<EMSReplaceOrder> orders) {
    this.orders = JsonNullable.<java.util.List<EMSReplaceOrder>>of(orders);
  }


  /**
   * Return true if this EMSReplaceOrders object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EMSReplaceOrders emSReplaceOrders = (EMSReplaceOrders) o;
    return equalsNullable(this.investorId, emSReplaceOrders.investorId) &&
        equalsNullable(this.orders, emSReplaceOrders.orders);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(investorId), hashCodeNullable(orders));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EMSReplaceOrders {\n");
    sb.append("    investorId: ").append(toIndentedString(investorId)).append("\n");
    sb.append("    orders: ").append(toIndentedString(orders)).append("\n");
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

