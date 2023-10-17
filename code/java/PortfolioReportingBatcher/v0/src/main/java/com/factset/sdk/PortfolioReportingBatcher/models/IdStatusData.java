/*
 * Portfolio Reporting Batcher
 * The Portfolio Reporting Batcher (PRB) API allows clients to systematically leverage functionalities of the PRB application. With the initial release, clients can - trigger existing jobs - check status of running jobs - get various details of existing jobs
 *
 * The version of the OpenAPI document: 0.3.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.PortfolioReportingBatcher.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.PortfolioReportingBatcher.models.PrbStatus;
import com.factset.sdk.PortfolioReportingBatcher.models.StartJob;
import com.factset.sdk.PortfolioReportingBatcher.models.Status;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.PortfolioReportingBatcher.JSON;


/**
 * Details about the instance of the job run specified via id
 */
@ApiModel(description = "Details about the instance of the job run specified via id")
@JsonPropertyOrder({
  IdStatusData.JSON_PROPERTY_ID,
  IdStatusData.JSON_PROPERTY_INPUTS,
  IdStatusData.JSON_PROPERTY_PRB_STATUS,
  IdStatusData.JSON_PROPERTY_STATUS,
  IdStatusData.JSON_PROPERTY_STATUS_DESCRIPTION
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class IdStatusData implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_INPUTS = "inputs";
  private StartJob inputs;

  public static final String JSON_PROPERTY_PRB_STATUS = "prbStatus";
  private PrbStatus prbStatus;

  public static final String JSON_PROPERTY_STATUS = "status";
  private Status status;

  public static final String JSON_PROPERTY_STATUS_DESCRIPTION = "statusDescription";
  private String statusDescription;

  public IdStatusData() { 
  }

  public IdStatusData id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The run ID
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The run ID")
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


  public IdStatusData inputs(StartJob inputs) {
    this.inputs = inputs;
    return this;
  }

   /**
   * Get inputs
   * @return inputs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INPUTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StartJob getInputs() {
    return inputs;
  }


  @JsonProperty(JSON_PROPERTY_INPUTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInputs(StartJob inputs) {
    this.inputs = inputs;
  }


  public IdStatusData prbStatus(PrbStatus prbStatus) {
    this.prbStatus = prbStatus;
    return this;
  }

   /**
   * Get prbStatus
   * @return prbStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PRB_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PrbStatus getPrbStatus() {
    return prbStatus;
  }


  @JsonProperty(JSON_PROPERTY_PRB_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrbStatus(PrbStatus prbStatus) {
    this.prbStatus = prbStatus;
  }


  public IdStatusData status(Status status) {
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

  public Status getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(Status status) {
    this.status = status;
  }


  public IdStatusData statusDescription(String statusDescription) {
    this.statusDescription = statusDescription;
    return this;
  }

   /**
   * Further details on the job&#39;s status
   * @return statusDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "job has completed with success", value = "Further details on the job's status")
  @JsonProperty(JSON_PROPERTY_STATUS_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStatusDescription() {
    return statusDescription;
  }


  @JsonProperty(JSON_PROPERTY_STATUS_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatusDescription(String statusDescription) {
    this.statusDescription = statusDescription;
  }


  /**
   * Return true if this idStatus_data object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdStatusData idStatusData = (IdStatusData) o;
    return Objects.equals(this.id, idStatusData.id) &&
        Objects.equals(this.inputs, idStatusData.inputs) &&
        Objects.equals(this.prbStatus, idStatusData.prbStatus) &&
        Objects.equals(this.status, idStatusData.status) &&
        Objects.equals(this.statusDescription, idStatusData.statusDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, inputs, prbStatus, status, statusDescription);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdStatusData {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
    sb.append("    prbStatus: ").append(toIndentedString(prbStatus)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusDescription: ").append(toIndentedString(statusDescription)).append("\n");
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

