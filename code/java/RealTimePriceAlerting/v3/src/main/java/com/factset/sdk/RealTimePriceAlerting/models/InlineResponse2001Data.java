/*
 * Price Alerting API For Digital Portals
 * The Price Alerting API is designed to inform the users of an application directly about important changes in the data on the platform. The endpoint group *basic price alerting* deals with generation of alerts based on current price data. For notations, users can define an upper or lower limit and choose on which price type those limit conditions apply.  Alerting uses the concepts of triggers and alerts.  A trigger is an entity that is set up by an application to watch a certain condition in the market data around a financial instrument. The standard conditions that can be applied are lower limit and upper limit for the value of the price for a given financial instrument.  When the condition of a trigger is met, an alert is created. Each alert thus represents one event where a trigger condition was met.  An application can learn about the creation of alerts in two ways: The application can actively request the list of alerts (pull approach) or it can subscribe to the list of existing alerts. If a new alert is created, that list changes and the application is notified about the new alert with an update that contains the details on the new alert (push approach).  The API supports both approaches. The push approach is realized most easily by using the subscription support that the client libraries provide.  See the [Quotes API for Digital Portals](https://developer.factset.com/api-catalog/quotes-api-digital-portals) for access to detailed price information.  Note: As part of the general trial access, endpoints to write data are excluded. For a description of the full alerting API, please work with a FactSet consultant and see https://endpointreference.factset.com. 
 *
 * The version of the OpenAPI document: 3.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.RealTimePriceAlerting.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.RealTimePriceAlerting.models.InlineResponse2001Trigger;
import com.factset.sdk.RealTimePriceAlerting.models.InlineResponse200DataNotification;
import com.factset.sdk.RealTimePriceAlerting.models.InlineResponse200DataPrice;
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
import com.factset.sdk.RealTimePriceAlerting.JSON;


/**
 * InlineResponse2001Data
 */
@JsonPropertyOrder({
  InlineResponse2001Data.JSON_PROPERTY_ID,
  InlineResponse2001Data.JSON_PROPERTY_CREATION,
  InlineResponse2001Data.JSON_PROPERTY_PRICE,
  InlineResponse2001Data.JSON_PROPERTY_NOTIFICATION,
  InlineResponse2001Data.JSON_PROPERTY_TRIGGER
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse2001Data implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ID = "id";
  private JsonNullable<String> id = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CREATION = "creation";
  private JsonNullable<String> creation = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PRICE = "price";
  private InlineResponse200DataPrice price;

  public static final String JSON_PROPERTY_NOTIFICATION = "notification";
  private InlineResponse200DataNotification notification;

  public static final String JSON_PROPERTY_TRIGGER = "trigger";
  private InlineResponse2001Trigger trigger;

  public InlineResponse2001Data() { 
  }

  public InlineResponse2001Data id(String id) {
    this.id = JsonNullable.<String>of(id);
    return this;
  }

   /**
   * Identifier of the alert.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Identifier of the alert.")
  @JsonIgnore

  public String getId() {
        return id.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getId_JsonNullable() {
    return id;
  }
  
  @JsonProperty(JSON_PROPERTY_ID)
  public void setId_JsonNullable(JsonNullable<String> id) {
    this.id = id;
  }

  public void setId(String id) {
    this.id = JsonNullable.<String>of(id);
  }


  public InlineResponse2001Data creation(String creation) {
    this.creation = JsonNullable.<String>of(creation);
    return this;
  }

   /**
   * Date and time when the alert was created.
   * @return creation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date and time when the alert was created.")
  @JsonIgnore

  public String getCreation() {
        return creation.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CREATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getCreation_JsonNullable() {
    return creation;
  }
  
  @JsonProperty(JSON_PROPERTY_CREATION)
  public void setCreation_JsonNullable(JsonNullable<String> creation) {
    this.creation = creation;
  }

  public void setCreation(String creation) {
    this.creation = JsonNullable.<String>of(creation);
  }


  public InlineResponse2001Data price(InlineResponse200DataPrice price) {
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

  public InlineResponse200DataPrice getPrice() {
    return price;
  }


  @JsonProperty(JSON_PROPERTY_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrice(InlineResponse200DataPrice price) {
    this.price = price;
  }


  public InlineResponse2001Data notification(InlineResponse200DataNotification notification) {
    this.notification = notification;
    return this;
  }

   /**
   * Get notification
   * @return notification
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NOTIFICATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse200DataNotification getNotification() {
    return notification;
  }


  @JsonProperty(JSON_PROPERTY_NOTIFICATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNotification(InlineResponse200DataNotification notification) {
    this.notification = notification;
  }


  public InlineResponse2001Data trigger(InlineResponse2001Trigger trigger) {
    this.trigger = trigger;
    return this;
  }

   /**
   * Get trigger
   * @return trigger
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TRIGGER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2001Trigger getTrigger() {
    return trigger;
  }


  @JsonProperty(JSON_PROPERTY_TRIGGER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTrigger(InlineResponse2001Trigger trigger) {
    this.trigger = trigger;
  }


  /**
   * Return true if this inline_response_200_1_data object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2001Data inlineResponse2001Data = (InlineResponse2001Data) o;
    return equalsNullable(this.id, inlineResponse2001Data.id) &&
        equalsNullable(this.creation, inlineResponse2001Data.creation) &&
        Objects.equals(this.price, inlineResponse2001Data.price) &&
        Objects.equals(this.notification, inlineResponse2001Data.notification) &&
        Objects.equals(this.trigger, inlineResponse2001Data.trigger);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(id), hashCodeNullable(creation), price, notification, trigger);
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
    sb.append("class InlineResponse2001Data {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    creation: ").append(toIndentedString(creation)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    notification: ").append(toIndentedString(notification)).append("\n");
    sb.append("    trigger: ").append(toIndentedString(trigger)).append("\n");
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

