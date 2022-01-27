/*
 * FactSet Exchange Traded Funds API
 * FactSet ETF data feeds provide complete and accurate security, fund and reference data across the universe of exchange-traded products. Data is sourced from ETF providers across the globe and includes more than 100 unique data points, resulting in comprehensive coverage to help you evaluate and construct ETFs, analyze potential trades, and perform fund research.<p> FactSet Reference and Analytics data uses FactSet's FCS, which categorizes exchange-traded products using a rules-based system that is derived from seven core classifications. This system evaluates the asset class, economic development level, and geographical region as described in each fund's prospectus and marketing materials. ETF exposure details are presented on successively granular levels-  category, then focus, and then niche.</p> <p>Moreover, FactSet ETF Reference data captures over 100 unique data points and provides market-specific data if you wish to solely focus on U.S., Canadian, Australian, New Zealand, Singapore, Hong Kong or European exchanges. All data points are grouped in one of two levels, either as a Fund or as a Listing. However, FactSet ETF Analytics data is primarily available for U.S.-domiciled ETFs. A subset of reference data items are provided for European-domiciled funds. For a full breakout of regional availability and history, see Formula Definitions and Calculations.</p> 
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.FactSetETF.models;

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
import com.factset.sdk.FactSetETF.JSON;


/**
 * subErrors related to the error message. Null if not applicable.
 */
@ApiModel(description = "subErrors related to the error message. Null if not applicable.")
@JsonPropertyOrder({
  ErrorResponseSubErrors.JSON_PROPERTY_OBJECT,
  ErrorResponseSubErrors.JSON_PROPERTY_FIELD,
  ErrorResponseSubErrors.JSON_PROPERTY_MESSAGE,
  ErrorResponseSubErrors.JSON_PROPERTY_REJECTED_VALUE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ErrorResponseSubErrors implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_OBJECT = "object";
  private String _object;

  public static final String JSON_PROPERTY_FIELD = "field";
  private String field;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private String message;

  public static final String JSON_PROPERTY_REJECTED_VALUE = "rejectedValue";
  private java.util.List<String> rejectedValue = null;


  public ErrorResponseSubErrors _object(String _object) {
    this._object = _object;
    return this;
  }

   /**
   * the operation ID
   * @return _object
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the operation ID")
  @JsonProperty(JSON_PROPERTY_OBJECT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getObject() {
    return _object;
  }


  @JsonProperty(JSON_PROPERTY_OBJECT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setObject(String _object) {
    this._object = _object;
  }


  public ErrorResponseSubErrors field(String field) {
    this.field = field;
    return this;
  }

   /**
   * Parameter Field Name
   * @return field
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Parameter Field Name")
  @JsonProperty(JSON_PROPERTY_FIELD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getField() {
    return field;
  }


  @JsonProperty(JSON_PROPERTY_FIELD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setField(String field) {
    this.field = field;
  }


  public ErrorResponseSubErrors message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Error message
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Error message")
  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMessage() {
    return message;
  }


  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMessage(String message) {
    this.message = message;
  }


  public ErrorResponseSubErrors rejectedValue(java.util.List<String> rejectedValue) {
    this.rejectedValue = rejectedValue;
    return this;
  }

  public ErrorResponseSubErrors addRejectedValueItem(String rejectedValueItem) {
    if (this.rejectedValue == null) {
      this.rejectedValue = new java.util.ArrayList<>();
    }
    this.rejectedValue.add(rejectedValueItem);
    return this;
  }

   /**
   * Rejected Values in an Array
   * @return rejectedValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Rejected Values in an Array")
  @JsonProperty(JSON_PROPERTY_REJECTED_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<String> getRejectedValue() {
    return rejectedValue;
  }


  @JsonProperty(JSON_PROPERTY_REJECTED_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRejectedValue(java.util.List<String> rejectedValue) {
    this.rejectedValue = rejectedValue;
  }


  /**
   * Return true if this errorResponse_subErrors object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorResponseSubErrors errorResponseSubErrors = (ErrorResponseSubErrors) o;
    return Objects.equals(this._object, errorResponseSubErrors._object) &&
        Objects.equals(this.field, errorResponseSubErrors.field) &&
        Objects.equals(this.message, errorResponseSubErrors.message) &&
        Objects.equals(this.rejectedValue, errorResponseSubErrors.rejectedValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_object, field, message, rejectedValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorResponseSubErrors {\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    rejectedValue: ").append(toIndentedString(rejectedValue)).append("\n");
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

