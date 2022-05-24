/*
 * AI Text Summarization
 * AI Text Summarization
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.AITextSummarization.models;

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
import com.factset.sdk.AITextSummarization.JSON;


/**
 * InternalServerErrorResponse
 */
@JsonPropertyOrder({
  InternalServerErrorResponse.JSON_PROPERTY_TYPE,
  InternalServerErrorResponse.JSON_PROPERTY_STATUS,
  InternalServerErrorResponse.JSON_PROPERTY_MESSAGE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InternalServerErrorResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private String message;

  public InternalServerErrorResponse() { 
  }

  public InternalServerErrorResponse type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Type of exception that occured.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Type of exception that occured.")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(String type) {
    this.type = type;
  }


  public InternalServerErrorResponse status(String status) {
    this.status = status;
    return this;
  }

   /**
   * The route for which the exception occured.
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The route for which the exception occured.")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(String status) {
    this.status = status;
  }


  public InternalServerErrorResponse message(String message) {
    this.message = message;
    return this;
  }

   /**
   * The verbose message for the exception.
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The verbose message for the exception.")
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


  /**
   * Return true if this InternalServerErrorResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InternalServerErrorResponse internalServerErrorResponse = (InternalServerErrorResponse) o;
    return Objects.equals(this.type, internalServerErrorResponse.type) &&
        Objects.equals(this.status, internalServerErrorResponse.status) &&
        Objects.equals(this.message, internalServerErrorResponse.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, status, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InternalServerErrorResponse {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

