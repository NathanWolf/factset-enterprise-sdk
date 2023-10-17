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
import com.factset.sdk.PortfolioReportingBatcher.models.JobTypes;
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
 * The main object within the startJobRunResponse schema
 */
@ApiModel(description = "The main object within the startJobRunResponse schema")
@JsonPropertyOrder({
  StartJobRunResponseData.JSON_PROPERTY_ID,
  StartJobRunResponseData.JSON_PROPERTY_JOB_NAME,
  StartJobRunResponseData.JSON_PROPERTY_STATUS,
  StartJobRunResponseData.JSON_PROPERTY_JOB_TYPE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class StartJobRunResponseData implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_JOB_NAME = "jobName";
  private String jobName;

  public static final String JSON_PROPERTY_STATUS = "status";
  private Status status;

  public static final String JSON_PROPERTY_JOB_TYPE = "jobType";
  private JobTypes jobType;

  public StartJobRunResponseData() { 
  }

  @JsonCreator
  public StartJobRunResponseData(
    @JsonProperty(value=JSON_PROPERTY_ID, required=true) String id, 
    @JsonProperty(value=JSON_PROPERTY_JOB_NAME, required=true) String jobName, 
    @JsonProperty(value=JSON_PROPERTY_STATUS, required=true) Status status, 
    @JsonProperty(value=JSON_PROPERTY_JOB_TYPE, required=true) JobTypes jobType
  ) {
    this();
    this.id = id;
    this.jobName = jobName;
    this.status = status;
    this.jobType = jobType;
  }

  public StartJobRunResponseData id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The run ID for the job that has been triggered which is used in the /runs/{id}/status endpoint
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The run ID for the job that has been triggered which is used in the /runs/{id}/status endpoint")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setId(String id) {
    this.id = id;
  }


  public StartJobRunResponseData jobName(String jobName) {
    this.jobName = jobName;
    return this;
  }

   /**
   * Name of the job
   * @return jobName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Name of the job")
  @JsonProperty(JSON_PROPERTY_JOB_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getJobName() {
    return jobName;
  }


  @JsonProperty(JSON_PROPERTY_JOB_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setJobName(String jobName) {
    this.jobName = jobName;
  }


  public StartJobRunResponseData status(Status status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Status getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStatus(Status status) {
    this.status = status;
  }


  public StartJobRunResponseData jobType(JobTypes jobType) {
    this.jobType = jobType;
    return this;
  }

   /**
   * Get jobType
   * @return jobType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_JOB_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public JobTypes getJobType() {
    return jobType;
  }


  @JsonProperty(JSON_PROPERTY_JOB_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setJobType(JobTypes jobType) {
    this.jobType = jobType;
  }


  /**
   * Return true if this startJobRunResponse_data object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StartJobRunResponseData startJobRunResponseData = (StartJobRunResponseData) o;
    return Objects.equals(this.id, startJobRunResponseData.id) &&
        Objects.equals(this.jobName, startJobRunResponseData.jobName) &&
        Objects.equals(this.status, startJobRunResponseData.status) &&
        Objects.equals(this.jobType, startJobRunResponseData.jobType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, jobName, status, jobType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StartJobRunResponseData {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    jobName: ").append(toIndentedString(jobName)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    jobType: ").append(toIndentedString(jobType)).append("\n");
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

