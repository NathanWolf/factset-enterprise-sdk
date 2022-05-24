/*
 * Documents Distributor - Documents API
 * Documents APIs that provide filings such as Global Filings and XML files such as StreetAccount    Global Filings API provides the capability to search and download filings documents from various exchanges around the world. This API will provide access to the full history and the ability to search by date and dataset(source). It does not provide real-time updates to the filings documents. Filings providers currently include EDGAR       Note: The real-time updates to the filing documents will be available within week to ten days and per request able to query up to 8 days of data               StreetAccount XML API provides access to historical StreetAccount (SA) news. SA provides a summary for various corporate and market news written by journalist with background in financial markets.    The API delivers SA stories in XML format based on user-specified date input parameters. When the API request is completed, output files will be made available back to the users through a secure URL. This API has three endpoints (1) Request Files (2) Check Status (3) Get Files.      This API only supports adhoc requests to retrieve historical files and does not support real-time files and if require real-time push should consider the other three methods (pushed via SFTP, to QNT account, or users Azure Storage)   Both historical and real-time Street Account news is also delivered via SFTP, to users QNT account, or users Azure Storage.  Files delivered contain both metadata and content body in each file. This eliminates the need to make multiple requests through multiple services to get all the information.  
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.DocumentsDistributorDocuments.models;

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
import com.factset.sdk.DocumentsDistributorDocuments.JSON;


/**
 * RequestfilesResponse
 */
@JsonPropertyOrder({
  RequestfilesResponse.JSON_PROPERTY_JOB_I_D,
  RequestfilesResponse.JSON_PROPERTY_STATUS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RequestfilesResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_JOB_I_D = "jobID";
  private String jobID;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public RequestfilesResponse() { 
  }

  public RequestfilesResponse jobID(String jobID) {
    this.jobID = jobID;
    return this;
  }

   /**
   * Unique id to get the xml files for the requested date
   * @return jobID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unique id to get the xml files for the requested date")
  @JsonProperty(JSON_PROPERTY_JOB_I_D)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getJobID() {
    return jobID;
  }


  @JsonProperty(JSON_PROPERTY_JOB_I_D)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setJobID(String jobID) {
    this.jobID = jobID;
  }


  public RequestfilesResponse status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Returns the value as submitted. Tells the request has been submitted
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Returns the value as submitted. Tells the request has been submitted")
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


  /**
   * Return true if this requestfilesResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestfilesResponse requestfilesResponse = (RequestfilesResponse) o;
    return Objects.equals(this.jobID, requestfilesResponse.jobID) &&
        Objects.equals(this.status, requestfilesResponse.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobID, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestfilesResponse {\n");
    sb.append("    jobID: ").append(toIndentedString(jobID)).append("\n");
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

