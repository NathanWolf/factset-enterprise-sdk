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
import com.factset.sdk.PriceAlertingAPIforDigitalPortals.models.InlineResponse2001TriggerPrice;
import com.factset.sdk.PriceAlertingAPIforDigitalPortals.models.InlineResponse2001TriggerStatus;
import com.factset.sdk.PriceAlertingAPIforDigitalPortals.models.InlineResponse200DataTriggerNotation;
import com.factset.sdk.PriceAlertingAPIforDigitalPortals.models.InlineResponse200DataTriggerRange;
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
 * Trigger data at the time of alert creation.
 */
@ApiModel(description = "Trigger data at the time of alert creation.")
@JsonPropertyOrder({
  InlineResponse2001Trigger.JSON_PROPERTY_ID,
  InlineResponse2001Trigger.JSON_PROPERTY_CREATION,
  InlineResponse2001Trigger.JSON_PROPERTY_NOTATION,
  InlineResponse2001Trigger.JSON_PROPERTY_PRICE,
  InlineResponse2001Trigger.JSON_PROPERTY_RANGE,
  InlineResponse2001Trigger.JSON_PROPERTY_COMMENT,
  InlineResponse2001Trigger.JSON_PROPERTY_STATUS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse2001Trigger implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_CREATION = "creation";
  private String creation;

  public static final String JSON_PROPERTY_NOTATION = "notation";
  private InlineResponse200DataTriggerNotation notation;

  public static final String JSON_PROPERTY_PRICE = "price";
  private InlineResponse2001TriggerPrice price;

  public static final String JSON_PROPERTY_RANGE = "range";
  private InlineResponse200DataTriggerRange range;

  public static final String JSON_PROPERTY_COMMENT = "comment";
  private String comment;

  public static final String JSON_PROPERTY_STATUS = "status";
  private InlineResponse2001TriggerStatus status;

  public InlineResponse2001Trigger() { 
  }

  public InlineResponse2001Trigger id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Identifier of the trigger.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Identifier of the trigger.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }


  public InlineResponse2001Trigger creation(String creation) {
    this.creation = creation;
    return this;
  }

   /**
   * Date and time when the trigger was created.
   * @return creation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date and time when the trigger was created.")
  @JsonProperty(JSON_PROPERTY_CREATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCreation() {
    return creation;
  }


  @JsonProperty(JSON_PROPERTY_CREATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreation(String creation) {
    this.creation = creation;
  }


  public InlineResponse2001Trigger notation(InlineResponse200DataTriggerNotation notation) {
    this.notation = notation;
    return this;
  }

   /**
   * Get notation
   * @return notation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NOTATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse200DataTriggerNotation getNotation() {
    return notation;
  }


  @JsonProperty(JSON_PROPERTY_NOTATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNotation(InlineResponse200DataTriggerNotation notation) {
    this.notation = notation;
  }


  public InlineResponse2001Trigger price(InlineResponse2001TriggerPrice price) {
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2001TriggerPrice getPrice() {
    return price;
  }


  @JsonProperty(JSON_PROPERTY_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrice(InlineResponse2001TriggerPrice price) {
    this.price = price;
  }


  public InlineResponse2001Trigger range(InlineResponse200DataTriggerRange range) {
    this.range = range;
    return this;
  }

   /**
   * Get range
   * @return range
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse200DataTriggerRange getRange() {
    return range;
  }


  @JsonProperty(JSON_PROPERTY_RANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRange(InlineResponse200DataTriggerRange range) {
    this.range = range;
  }


  public InlineResponse2001Trigger comment(String comment) {
    this.comment = comment;
    return this;
  }

   /**
   * Comment of the trigger.
   * @return comment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Comment of the trigger.")
  @JsonProperty(JSON_PROPERTY_COMMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getComment() {
    return comment;
  }


  @JsonProperty(JSON_PROPERTY_COMMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setComment(String comment) {
    this.comment = comment;
  }


  public InlineResponse2001Trigger status(InlineResponse2001TriggerStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2001TriggerStatus getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(InlineResponse2001TriggerStatus status) {
    this.status = status;
  }


  /**
   * Return true if this inline_response_200_1_trigger object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2001Trigger inlineResponse2001Trigger = (InlineResponse2001Trigger) o;
    return Objects.equals(this.id, inlineResponse2001Trigger.id) &&
        Objects.equals(this.creation, inlineResponse2001Trigger.creation) &&
        Objects.equals(this.notation, inlineResponse2001Trigger.notation) &&
        Objects.equals(this.price, inlineResponse2001Trigger.price) &&
        Objects.equals(this.range, inlineResponse2001Trigger.range) &&
        Objects.equals(this.comment, inlineResponse2001Trigger.comment) &&
        Objects.equals(this.status, inlineResponse2001Trigger.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, creation, notation, price, range, comment, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2001Trigger {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    creation: ").append(toIndentedString(creation)).append("\n");
    sb.append("    notation: ").append(toIndentedString(notation)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    range: ").append(toIndentedString(range)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

