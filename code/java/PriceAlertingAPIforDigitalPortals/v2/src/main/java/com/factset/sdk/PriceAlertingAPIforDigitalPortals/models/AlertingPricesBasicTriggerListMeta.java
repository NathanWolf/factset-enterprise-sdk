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


package com.factset.sdk.PriceAlertingAPIforDigitalPortals.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.PriceAlertingAPIforDigitalPortals.models.AlertingPricesBasicTriggerListMetaPagination;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.PriceAlertingAPIforDigitalPortals.JSON;


/**
 * The meta member contains the meta information of the request.
 */
@ApiModel(description = "The meta member contains the meta information of the request.")
@JsonPropertyOrder({
  AlertingPricesBasicTriggerListMeta.JSON_PROPERTY_ATTRIBUTES,
  AlertingPricesBasicTriggerListMeta.JSON_PROPERTY_PAGINATION
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlertingPricesBasicTriggerListMeta implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private java.util.Set<String> attributes = null;

  public static final String JSON_PROPERTY_PAGINATION = "pagination";
  private AlertingPricesBasicTriggerListMetaPagination pagination;

  public AlertingPricesBasicTriggerListMeta() { 
  }

  public AlertingPricesBasicTriggerListMeta attributes(java.util.Set<String> attributes) {
    this.attributes = attributes;
    return this;
  }

  public AlertingPricesBasicTriggerListMeta addAttributesItem(String attributesItem) {
    if (this.attributes == null) {
      this.attributes = new java.util.LinkedHashSet<>();
    }
    this.attributes.add(attributesItem);
    return this;
  }

   /**
   * Limit the attributes returned in the response to the specified set.
   * @return attributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Limit the attributes returned in the response to the specified set.")
  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.Set<String> getAttributes() {
    return attributes;
  }


  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAttributes(java.util.Set<String> attributes) {
    this.attributes = attributes;
  }


  public AlertingPricesBasicTriggerListMeta pagination(AlertingPricesBasicTriggerListMetaPagination pagination) {
    this.pagination = pagination;
    return this;
  }

   /**
   * Get pagination
   * @return pagination
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PAGINATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AlertingPricesBasicTriggerListMetaPagination getPagination() {
    return pagination;
  }


  @JsonProperty(JSON_PROPERTY_PAGINATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPagination(AlertingPricesBasicTriggerListMetaPagination pagination) {
    this.pagination = pagination;
  }


  /**
   * Return true if this _alerting_prices_basic_trigger_list_meta object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlertingPricesBasicTriggerListMeta alertingPricesBasicTriggerListMeta = (AlertingPricesBasicTriggerListMeta) o;
    return Objects.equals(this.attributes, alertingPricesBasicTriggerListMeta.attributes) &&
        Objects.equals(this.pagination, alertingPricesBasicTriggerListMeta.pagination);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, pagination);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlertingPricesBasicTriggerListMeta {\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
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

