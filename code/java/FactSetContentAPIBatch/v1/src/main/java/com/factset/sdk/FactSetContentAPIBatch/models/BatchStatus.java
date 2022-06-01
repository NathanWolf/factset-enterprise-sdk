/*
 * FactSet Batch API Service
 * FactSet Content APIs - Batching Endpoint
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.FactSetContentAPIBatch.models;

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
import java.time.OffsetDateTime;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.FactSetContentAPIBatch.JSON;


/**
 * BatchStatus
 */
@JsonPropertyOrder({
  BatchStatus.JSON_PROPERTY_ID,
  BatchStatus.JSON_PROPERTY_START_TIME,
  BatchStatus.JSON_PROPERTY_END_TIME,
  BatchStatus.JSON_PROPERTY_STATUS,
  BatchStatus.JSON_PROPERTY_ERROR
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class BatchStatus implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ID = "id";
  private java.util.UUID id;

  public static final String JSON_PROPERTY_START_TIME = "startTime";
  private OffsetDateTime startTime;

  public static final String JSON_PROPERTY_END_TIME = "endTime";
  private OffsetDateTime endTime;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    QUEUED("QUEUED"),
    
    EXECUTING("EXECUTING"),
    
    DONE("DONE"),
    
    FAILED("FAILED");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_STATUS = "status";
  private StatusEnum status;

  public static final String JSON_PROPERTY_ERROR = "error";
  private String error;

  public BatchStatus() { 
  }

  public BatchStatus id(java.util.UUID id) {
    this.id = id;
    return this;
  }

   /**
   * the id of batch request.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "the id of batch request.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.UUID getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(java.util.UUID id) {
    this.id = id;
  }


  public BatchStatus startTime(OffsetDateTime startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * Time when the batch request is started. This is in Eastern Time Zone. The date-time format is expressed as [YYYY-MM-DD]T[HH:MM:SSS], following ISO 8601.
   * @return startTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Time when the batch request is started. This is in Eastern Time Zone. The date-time format is expressed as [YYYY-MM-DD]T[HH:MM:SSS], following ISO 8601.")
  @JsonProperty(JSON_PROPERTY_START_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getStartTime() {
    return startTime;
  }


  @JsonProperty(JSON_PROPERTY_START_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartTime(OffsetDateTime startTime) {
    this.startTime = startTime;
  }


  public BatchStatus endTime(OffsetDateTime endTime) {
    this.endTime = endTime;
    return this;
  }

   /**
   * Time when the batch request is ended. This is in Eastern Time Zone. The date-time format is expressed as [YYYY-MM-DD]T[HH:MM:SSS], following ISO 8601.
   * @return endTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Time when the batch request is ended. This is in Eastern Time Zone. The date-time format is expressed as [YYYY-MM-DD]T[HH:MM:SSS], following ISO 8601.")
  @JsonProperty(JSON_PROPERTY_END_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getEndTime() {
    return endTime;
  }


  @JsonProperty(JSON_PROPERTY_END_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndTime(OffsetDateTime endTime) {
    this.endTime = endTime;
  }


  public BatchStatus status(StatusEnum status) {
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

  public StatusEnum getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public BatchStatus error(String error) {
    this.error = error;
    return this;
  }

   /**
   * Error message.
   * @return error
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Invalid Parameter (s)- curr. Please modify your request to use parameters outlined in the specification for this endpoint.", value = "Error message.")
  @JsonProperty(JSON_PROPERTY_ERROR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getError() {
    return error;
  }


  @JsonProperty(JSON_PROPERTY_ERROR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setError(String error) {
    this.error = error;
  }


  /**
   * Return true if this BatchStatus object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatchStatus batchStatus = (BatchStatus) o;
    return Objects.equals(this.id, batchStatus.id) &&
        Objects.equals(this.startTime, batchStatus.startTime) &&
        Objects.equals(this.endTime, batchStatus.endTime) &&
        Objects.equals(this.status, batchStatus.status) &&
        Objects.equals(this.error, batchStatus.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, startTime, endTime, status, error);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchStatus {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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

