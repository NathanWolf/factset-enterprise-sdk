/*
 * FactSet Terms & Conditions API
 * The FactSet Terms & Conditions API exposes Terms & Conditions data for Fixed Income Corporate, Governement & Agency securities. The FactSet Corporate Government & Agency Terms & Conditions library provides descriptive data on the issue level, such as offering details, redemption information, and coupon schedules. Issuer level data is also available. Coverage is global and includes corporate, sovereign, and agency issues. 
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.FactSetTermsandConditions.models;

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
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.FactSetTermsandConditions.JSON;


/**
 * Convertible Triggers for a Fixed Income security.
 */
@ApiModel(description = "Convertible Triggers for a Fixed Income security.")
@JsonPropertyOrder({
  ConvertibleTriggers.JSON_PROPERTY_REQUEST_ID,
  ConvertibleTriggers.JSON_PROPERTY_FSYM_ID,
  ConvertibleTriggers.JSON_PROPERTY_CONV_TRIGGER_EVENT,
  ConvertibleTriggers.JSON_PROPERTY_CONV_TRIGGER_EVENT_DESC,
  ConvertibleTriggers.JSON_PROPERTY_TRIGGER_ID
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ConvertibleTriggers implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_REQUEST_ID = "requestId";
  private String requestId;

  public static final String JSON_PROPERTY_FSYM_ID = "fsymId";
  private String fsymId;

  public static final String JSON_PROPERTY_CONV_TRIGGER_EVENT = "convTriggerEvent";
  private String convTriggerEvent;

  public static final String JSON_PROPERTY_CONV_TRIGGER_EVENT_DESC = "convTriggerEventDesc";
  private String convTriggerEventDesc;

  public static final String JSON_PROPERTY_TRIGGER_ID = "triggerId";
  private Integer triggerId;


  public ConvertibleTriggers requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

   /**
   * Security identifier used in the request.
   * @return requestId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Security identifier used in the request.")
  @JsonProperty(JSON_PROPERTY_REQUEST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRequestId() {
    return requestId;
  }


  @JsonProperty(JSON_PROPERTY_REQUEST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }


  public ConvertibleTriggers fsymId(String fsymId) {
    this.fsymId = fsymId;
    return this;
  }

   /**
   * FactSet Permanent Security Identifier.
   * @return fsymId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "FactSet Permanent Security Identifier.")
  @JsonProperty(JSON_PROPERTY_FSYM_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFsymId() {
    return fsymId;
  }


  @JsonProperty(JSON_PROPERTY_FSYM_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFsymId(String fsymId) {
    this.fsymId = fsymId;
  }


  public ConvertibleTriggers convTriggerEvent(String convTriggerEvent) {
    this.convTriggerEvent = convTriggerEvent;
    return this;
  }

   /**
   * Convertible Trigger Event
   * @return convTriggerEvent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Convertible Trigger Event")
  @JsonProperty(JSON_PROPERTY_CONV_TRIGGER_EVENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getConvTriggerEvent() {
    return convTriggerEvent;
  }


  @JsonProperty(JSON_PROPERTY_CONV_TRIGGER_EVENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConvTriggerEvent(String convTriggerEvent) {
    this.convTriggerEvent = convTriggerEvent;
  }


  public ConvertibleTriggers convTriggerEventDesc(String convTriggerEventDesc) {
    this.convTriggerEventDesc = convTriggerEventDesc;
    return this;
  }

   /**
   * Convertible Trigger Event Description
   * @return convTriggerEventDesc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Convertible Trigger Event Description")
  @JsonProperty(JSON_PROPERTY_CONV_TRIGGER_EVENT_DESC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getConvTriggerEventDesc() {
    return convTriggerEventDesc;
  }


  @JsonProperty(JSON_PROPERTY_CONV_TRIGGER_EVENT_DESC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConvTriggerEventDesc(String convTriggerEventDesc) {
    this.convTriggerEventDesc = convTriggerEventDesc;
  }


  public ConvertibleTriggers triggerId(Integer triggerId) {
    this.triggerId = triggerId;
    return this;
  }

   /**
   * Convertible Trigger Id
   * @return triggerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Convertible Trigger Id")
  @JsonProperty(JSON_PROPERTY_TRIGGER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTriggerId() {
    return triggerId;
  }


  @JsonProperty(JSON_PROPERTY_TRIGGER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTriggerId(Integer triggerId) {
    this.triggerId = triggerId;
  }


  /**
   * Return true if this convertibleTriggers object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConvertibleTriggers convertibleTriggers = (ConvertibleTriggers) o;
    return Objects.equals(this.requestId, convertibleTriggers.requestId) &&
        Objects.equals(this.fsymId, convertibleTriggers.fsymId) &&
        Objects.equals(this.convTriggerEvent, convertibleTriggers.convTriggerEvent) &&
        Objects.equals(this.convTriggerEventDesc, convertibleTriggers.convTriggerEventDesc) &&
        Objects.equals(this.triggerId, convertibleTriggers.triggerId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestId, fsymId, convTriggerEvent, convTriggerEventDesc, triggerId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConvertibleTriggers {\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    fsymId: ").append(toIndentedString(fsymId)).append("\n");
    sb.append("    convTriggerEvent: ").append(toIndentedString(convTriggerEvent)).append("\n");
    sb.append("    convTriggerEventDesc: ").append(toIndentedString(convTriggerEventDesc)).append("\n");
    sb.append("    triggerId: ").append(toIndentedString(triggerId)).append("\n");
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

