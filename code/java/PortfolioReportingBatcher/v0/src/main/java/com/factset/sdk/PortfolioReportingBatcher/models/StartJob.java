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
import com.factset.sdk.PortfolioReportingBatcher.models.JobOverrides;
import com.factset.sdk.PortfolioReportingBatcher.models.JobTypes;
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
 * Details required to start a job
 */
@ApiModel(description = "Details required to start a job")
@JsonPropertyOrder({
  StartJob.JSON_PROPERTY_JOB_NAME,
  StartJob.JSON_PROPERTY_OVERRIDES,
  StartJob.JSON_PROPERTY_JOB_TYPE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class StartJob implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_JOB_NAME = "jobName";
  private String jobName;

  public static final String JSON_PROPERTY_OVERRIDES = "overrides";
  private JobOverrides overrides;

  public static final String JSON_PROPERTY_JOB_TYPE = "jobType";
  private JobTypes jobType;

  public StartJob() { 
  }

  @JsonCreator
  public StartJob(
    @JsonProperty(value=JSON_PROPERTY_JOB_NAME, required=true) String jobName, 
    @JsonProperty(value=JSON_PROPERTY_JOB_TYPE, required=true) JobTypes jobType
  ) {
    this();
    this.jobName = jobName;
    this.jobType = jobType;
  }

  public StartJob jobName(String jobName) {
    this.jobName = jobName;
    return this;
  }

   /**
   * The name of the PRB job
   * @return jobName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The name of the PRB job")
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


  public StartJob overrides(JobOverrides overrides) {
    this.overrides = overrides;
    return this;
  }

   /**
   * Get overrides
   * @return overrides
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OVERRIDES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JobOverrides getOverrides() {
    return overrides;
  }


  @JsonProperty(JSON_PROPERTY_OVERRIDES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOverrides(JobOverrides overrides) {
    this.overrides = overrides;
  }


  public StartJob jobType(JobTypes jobType) {
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
   * Return true if this startJob object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StartJob startJob = (StartJob) o;
    return Objects.equals(this.jobName, startJob.jobName) &&
        Objects.equals(this.overrides, startJob.overrides) &&
        Objects.equals(this.jobType, startJob.jobType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobName, overrides, jobType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StartJob {\n");
    sb.append("    jobName: ").append(toIndentedString(jobName)).append("\n");
    sb.append("    overrides: ").append(toIndentedString(overrides)).append("\n");
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

