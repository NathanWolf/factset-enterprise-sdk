/*
 * EMS API
 * Allow clients to trade orders.
 *
 * The version of the OpenAPI document: 0.3.0
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
import com.factset.sdk.FactSetTrading.models.EMSCancelChildOrder;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.FactSetTrading.JSON;


/**
 * EMS Cancel Child Orders
 */
@ApiModel(description = "EMS Cancel Child Orders")
@JsonPropertyOrder({
  EMSCancelChildOrders.JSON_PROPERTY_CHILD_ORDERS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class EMSCancelChildOrders implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_CHILD_ORDERS = "childOrders";
  private java.util.List<EMSCancelChildOrder> childOrders = new java.util.ArrayList<>();

  public EMSCancelChildOrders() { 
  }

  @JsonCreator
  public EMSCancelChildOrders(
    @JsonProperty(value=JSON_PROPERTY_CHILD_ORDERS, required=true) java.util.List<EMSCancelChildOrder> childOrders
  ) {
    this();
    this.childOrders = childOrders;
  }

  public EMSCancelChildOrders childOrders(java.util.List<EMSCancelChildOrder> childOrders) {
    this.childOrders = childOrders;
    return this;
  }

  public EMSCancelChildOrders addChildOrdersItem(EMSCancelChildOrder childOrdersItem) {
    this.childOrders.add(childOrdersItem);
    return this;
  }

   /**
   * Get childOrders
   * @return childOrders
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_CHILD_ORDERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public java.util.List<EMSCancelChildOrder> getChildOrders() {
    return childOrders;
  }


  @JsonProperty(JSON_PROPERTY_CHILD_ORDERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setChildOrders(java.util.List<EMSCancelChildOrder> childOrders) {
    this.childOrders = childOrders;
  }


  /**
   * Return true if this EMSCancelChildOrders object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EMSCancelChildOrders emSCancelChildOrders = (EMSCancelChildOrders) o;
    return Objects.equals(this.childOrders, emSCancelChildOrders.childOrders);
  }

  @Override
  public int hashCode() {
    return Objects.hash(childOrders);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EMSCancelChildOrders {\n");
    sb.append("    childOrders: ").append(toIndentedString(childOrders)).append("\n");
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

