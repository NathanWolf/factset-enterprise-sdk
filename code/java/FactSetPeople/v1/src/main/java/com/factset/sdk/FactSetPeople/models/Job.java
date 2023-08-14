/*
 * FactSet People API
 * The FactSet People API exposes FactSet data for individuals and their jobs. 
 *
 * The version of the OpenAPI document: 1.2.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.FactSetPeople.models;

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
import java.time.LocalDate;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.FactSetPeople.JSON;


/**
 * Basic information about a person&#39;s &#x60;Job&#x60;.
 */
@ApiModel(description = "Basic information about a person's `Job`.")
@JsonPropertyOrder({
  Job.JSON_PROPERTY_COMPANY_CITY,
  Job.JSON_PROPERTY_COMPANY_ID,
  Job.JSON_PROPERTY_COMPANY_NAME,
  Job.JSON_PROPERTY_JOB_END_DATE,
  Job.JSON_PROPERTY_JOB_FUNCTION_CODE,
  Job.JSON_PROPERTY_JOB_FUNCTION_NAME,
  Job.JSON_PROPERTY_JOB_START_DATE,
  Job.JSON_PROPERTY_JOB_TITLE,
  Job.JSON_PROPERTY_PERSON_ID,
  Job.JSON_PROPERTY_REQUEST_ID
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Job implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_COMPANY_CITY = "companyCity";
  private JsonNullable<String> companyCity = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_COMPANY_ID = "companyId";
  private JsonNullable<String> companyId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_COMPANY_NAME = "companyName";
  private JsonNullable<String> companyName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_JOB_END_DATE = "jobEndDate";
  private JsonNullable<LocalDate> jobEndDate = JsonNullable.<LocalDate>undefined();

  public static final String JSON_PROPERTY_JOB_FUNCTION_CODE = "jobFunctionCode";
  private JsonNullable<String> jobFunctionCode = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_JOB_FUNCTION_NAME = "jobFunctionName";
  private JsonNullable<String> jobFunctionName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_JOB_START_DATE = "jobStartDate";
  private JsonNullable<LocalDate> jobStartDate = JsonNullable.<LocalDate>undefined();

  public static final String JSON_PROPERTY_JOB_TITLE = "jobTitle";
  private JsonNullable<String> jobTitle = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PERSON_ID = "personId";
  private JsonNullable<String> personId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_REQUEST_ID = "requestId";
  private String requestId;

  public Job() { 
  }

  public Job companyCity(String companyCity) {
    this.companyCity = JsonNullable.<String>of(companyCity);
    return this;
  }

   /**
   * City the job is located in.
   * @return companyCity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Norwalk", value = "City the job is located in.")
  @JsonIgnore

  public String getCompanyCity() {
        return companyCity.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_COMPANY_CITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getCompanyCity_JsonNullable() {
    return companyCity;
  }
  
  @JsonProperty(JSON_PROPERTY_COMPANY_CITY)
  public void setCompanyCity_JsonNullable(JsonNullable<String> companyCity) {
    this.companyCity = companyCity;
  }

  public void setCompanyCity(String companyCity) {
    this.companyCity = JsonNullable.<String>of(companyCity);
  }


  public Job companyId(String companyId) {
    this.companyId = JsonNullable.<String>of(companyId);
    return this;
  }

   /**
   * FactSet Identifier for the company.
   * @return companyId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0016YD-E", value = "FactSet Identifier for the company.")
  @JsonIgnore

  public String getCompanyId() {
        return companyId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_COMPANY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getCompanyId_JsonNullable() {
    return companyId;
  }
  
  @JsonProperty(JSON_PROPERTY_COMPANY_ID)
  public void setCompanyId_JsonNullable(JsonNullable<String> companyId) {
    this.companyId = companyId;
  }

  public void setCompanyId(String companyId) {
    this.companyId = JsonNullable.<String>of(companyId);
  }


  public Job companyName(String companyName) {
    this.companyName = JsonNullable.<String>of(companyName);
    return this;
  }

   /**
   * Name of the company.
   * @return companyName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "FactSet Research Systems, Inc.", value = "Name of the company.")
  @JsonIgnore

  public String getCompanyName() {
        return companyName.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_COMPANY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getCompanyName_JsonNullable() {
    return companyName;
  }
  
  @JsonProperty(JSON_PROPERTY_COMPANY_NAME)
  public void setCompanyName_JsonNullable(JsonNullable<String> companyName) {
    this.companyName = companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = JsonNullable.<String>of(companyName);
  }


  public Job jobEndDate(LocalDate jobEndDate) {
    this.jobEndDate = JsonNullable.<LocalDate>of(jobEndDate);
    return this;
  }

   /**
   * Ending date for the Job.
   * @return jobEndDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Sat Jan 01 00:00:00 UTC 1", value = "Ending date for the Job.")
  @JsonIgnore

  public LocalDate getJobEndDate() {
        return jobEndDate.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_JOB_END_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<LocalDate> getJobEndDate_JsonNullable() {
    return jobEndDate;
  }
  
  @JsonProperty(JSON_PROPERTY_JOB_END_DATE)
  public void setJobEndDate_JsonNullable(JsonNullable<LocalDate> jobEndDate) {
    this.jobEndDate = jobEndDate;
  }

  public void setJobEndDate(LocalDate jobEndDate) {
    this.jobEndDate = JsonNullable.<LocalDate>of(jobEndDate);
  }


  public Job jobFunctionCode(String jobFunctionCode) {
    this.jobFunctionCode = JsonNullable.<String>of(jobFunctionCode);
    return this;
  }

   /**
   * Job function code.
   * @return jobFunctionCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "CEO", value = "Job function code.")
  @JsonIgnore

  public String getJobFunctionCode() {
        return jobFunctionCode.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_JOB_FUNCTION_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getJobFunctionCode_JsonNullable() {
    return jobFunctionCode;
  }
  
  @JsonProperty(JSON_PROPERTY_JOB_FUNCTION_CODE)
  public void setJobFunctionCode_JsonNullable(JsonNullable<String> jobFunctionCode) {
    this.jobFunctionCode = jobFunctionCode;
  }

  public void setJobFunctionCode(String jobFunctionCode) {
    this.jobFunctionCode = JsonNullable.<String>of(jobFunctionCode);
  }


  public Job jobFunctionName(String jobFunctionName) {
    this.jobFunctionName = JsonNullable.<String>of(jobFunctionName);
    return this;
  }

   /**
   * Description of the job.
   * @return jobFunctionName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Chief Executive Officer", value = "Description of the job.")
  @JsonIgnore

  public String getJobFunctionName() {
        return jobFunctionName.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_JOB_FUNCTION_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getJobFunctionName_JsonNullable() {
    return jobFunctionName;
  }
  
  @JsonProperty(JSON_PROPERTY_JOB_FUNCTION_NAME)
  public void setJobFunctionName_JsonNullable(JsonNullable<String> jobFunctionName) {
    this.jobFunctionName = jobFunctionName;
  }

  public void setJobFunctionName(String jobFunctionName) {
    this.jobFunctionName = JsonNullable.<String>of(jobFunctionName);
  }


  public Job jobStartDate(LocalDate jobStartDate) {
    this.jobStartDate = JsonNullable.<LocalDate>of(jobStartDate);
    return this;
  }

   /**
   * Starting date for the Job.
   * @return jobStartDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Wed Jul 01 00:00:00 UTC 2015", value = "Starting date for the Job.")
  @JsonIgnore

  public LocalDate getJobStartDate() {
        return jobStartDate.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_JOB_START_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<LocalDate> getJobStartDate_JsonNullable() {
    return jobStartDate;
  }
  
  @JsonProperty(JSON_PROPERTY_JOB_START_DATE)
  public void setJobStartDate_JsonNullable(JsonNullable<LocalDate> jobStartDate) {
    this.jobStartDate = jobStartDate;
  }

  public void setJobStartDate(LocalDate jobStartDate) {
    this.jobStartDate = JsonNullable.<LocalDate>of(jobStartDate);
  }


  public Job jobTitle(String jobTitle) {
    this.jobTitle = JsonNullable.<String>of(jobTitle);
    return this;
  }

   /**
   * Job Title
   * @return jobTitle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Chief Executive Officer & Director", value = "Job Title")
  @JsonIgnore

  public String getJobTitle() {
        return jobTitle.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_JOB_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getJobTitle_JsonNullable() {
    return jobTitle;
  }
  
  @JsonProperty(JSON_PROPERTY_JOB_TITLE)
  public void setJobTitle_JsonNullable(JsonNullable<String> jobTitle) {
    this.jobTitle = jobTitle;
  }

  public void setJobTitle(String jobTitle) {
    this.jobTitle = JsonNullable.<String>of(jobTitle);
  }


  public Job personId(String personId) {
    this.personId = JsonNullable.<String>of(personId);
    return this;
  }

   /**
   * FactSet Entity Identifier for the Person.
   * @return personId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0DPHLH-E", value = "FactSet Entity Identifier for the Person.")
  @JsonIgnore

  public String getPersonId() {
        return personId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PERSON_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getPersonId_JsonNullable() {
    return personId;
  }
  
  @JsonProperty(JSON_PROPERTY_PERSON_ID)
  public void setPersonId_JsonNullable(JsonNullable<String> personId) {
    this.personId = personId;
  }

  public void setPersonId(String personId) {
    this.personId = JsonNullable.<String>of(personId);
  }


  public Job requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

   /**
   * Original identifier used for the request.
   * @return requestId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0DPHLH-E", value = "Original identifier used for the request.")
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


  /**
   * Return true if this job object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Job job = (Job) o;
    return equalsNullable(this.companyCity, job.companyCity) &&
        equalsNullable(this.companyId, job.companyId) &&
        equalsNullable(this.companyName, job.companyName) &&
        equalsNullable(this.jobEndDate, job.jobEndDate) &&
        equalsNullable(this.jobFunctionCode, job.jobFunctionCode) &&
        equalsNullable(this.jobFunctionName, job.jobFunctionName) &&
        equalsNullable(this.jobStartDate, job.jobStartDate) &&
        equalsNullable(this.jobTitle, job.jobTitle) &&
        equalsNullable(this.personId, job.personId) &&
        Objects.equals(this.requestId, job.requestId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(companyCity), hashCodeNullable(companyId), hashCodeNullable(companyName), hashCodeNullable(jobEndDate), hashCodeNullable(jobFunctionCode), hashCodeNullable(jobFunctionName), hashCodeNullable(jobStartDate), hashCodeNullable(jobTitle), hashCodeNullable(personId), requestId);
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
    sb.append("class Job {\n");
    sb.append("    companyCity: ").append(toIndentedString(companyCity)).append("\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    jobEndDate: ").append(toIndentedString(jobEndDate)).append("\n");
    sb.append("    jobFunctionCode: ").append(toIndentedString(jobFunctionCode)).append("\n");
    sb.append("    jobFunctionName: ").append(toIndentedString(jobFunctionName)).append("\n");
    sb.append("    jobStartDate: ").append(toIndentedString(jobStartDate)).append("\n");
    sb.append("    jobTitle: ").append(toIndentedString(jobTitle)).append("\n");
    sb.append("    personId: ").append(toIndentedString(personId)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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

