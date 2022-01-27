/*
 * TickHistory
 * TickHistory provides dynamic access to historical tick data for a specific security for specific dates or date range.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.FactSetTickHistory.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.FactSetTickHistory.models.Data;
import com.factset.sdk.FactSetTickHistory.models.Meta;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.threeten.bp.OffsetDateTime;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.FactSetTickHistory.JSON;


/**
 * GetFilesResponse
 */
@JsonPropertyOrder({
  GetFilesResponse.JSON_PROPERTY_STATUS,
  GetFilesResponse.JSON_PROPERTY_REQUEST,
  GetFilesResponse.JSON_PROPERTY_REQUEST_TIMESTAMP,
  GetFilesResponse.JSON_PROPERTY_UPDATE_TIMESTAMP,
  GetFilesResponse.JSON_PROPERTY_DATA,
  GetFilesResponse.JSON_PROPERTY_META
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GetFilesResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public static final String JSON_PROPERTY_REQUEST = "request";
  private String request;

  public static final String JSON_PROPERTY_REQUEST_TIMESTAMP = "requestTimestamp";
  private OffsetDateTime requestTimestamp;

  public static final String JSON_PROPERTY_UPDATE_TIMESTAMP = "updateTimestamp";
  private OffsetDateTime updateTimestamp;

  public static final String JSON_PROPERTY_DATA = "data";
  private java.util.List<Data> data = null;

  public static final String JSON_PROPERTY_META = "meta";
  private java.util.List<Meta> meta = null;


  public GetFilesResponse status(String status) {
    this.status = status;
    return this;
  }

   /**
   * The status of the request
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The status of the request")
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


  public GetFilesResponse request(String request) {
    this.request = request;
    return this;
  }

   /**
   * Returns the query parameters, user credentials (name &amp; serial number)
   * @return request
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Returns the query parameters, user credentials (name & serial number)")
  @JsonProperty(JSON_PROPERTY_REQUEST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRequest() {
    return request;
  }


  @JsonProperty(JSON_PROPERTY_REQUEST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRequest(String request) {
    this.request = request;
  }


  public GetFilesResponse requestTimestamp(OffsetDateTime requestTimestamp) {
    this.requestTimestamp = requestTimestamp;
    return this;
  }

   /**
   * Timestamp of when request was made
   * @return requestTimestamp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Timestamp of when request was made")
  @JsonProperty(JSON_PROPERTY_REQUEST_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getRequestTimestamp() {
    return requestTimestamp;
  }


  @JsonProperty(JSON_PROPERTY_REQUEST_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRequestTimestamp(OffsetDateTime requestTimestamp) {
    this.requestTimestamp = requestTimestamp;
  }


  public GetFilesResponse updateTimestamp(OffsetDateTime updateTimestamp) {
    this.updateTimestamp = updateTimestamp;
    return this;
  }

   /**
   * :\&quot;Timestamp when the file was last updated\&quot;
   * @return updateTimestamp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = ":\"Timestamp when the file was last updated\"")
  @JsonProperty(JSON_PROPERTY_UPDATE_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getUpdateTimestamp() {
    return updateTimestamp;
  }


  @JsonProperty(JSON_PROPERTY_UPDATE_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpdateTimestamp(OffsetDateTime updateTimestamp) {
    this.updateTimestamp = updateTimestamp;
  }


  public GetFilesResponse data(java.util.List<Data> data) {
    this.data = data;
    return this;
  }

  public GetFilesResponse addDataItem(Data dataItem) {
    if (this.data == null) {
      this.data = new java.util.ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<Data> getData() {
    return data;
  }


  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setData(java.util.List<Data> data) {
    this.data = data;
  }


  public GetFilesResponse meta(java.util.List<Meta> meta) {
    this.meta = meta;
    return this;
  }

  public GetFilesResponse addMetaItem(Meta metaItem) {
    if (this.meta == null) {
      this.meta = new java.util.ArrayList<>();
    }
    this.meta.add(metaItem);
    return this;
  }

   /**
   * Get meta
   * @return meta
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_META)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<Meta> getMeta() {
    return meta;
  }


  @JsonProperty(JSON_PROPERTY_META)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMeta(java.util.List<Meta> meta) {
    this.meta = meta;
  }


  /**
   * Return true if this Get-FilesResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetFilesResponse getFilesResponse = (GetFilesResponse) o;
    return Objects.equals(this.status, getFilesResponse.status) &&
        Objects.equals(this.request, getFilesResponse.request) &&
        Objects.equals(this.requestTimestamp, getFilesResponse.requestTimestamp) &&
        Objects.equals(this.updateTimestamp, getFilesResponse.updateTimestamp) &&
        Objects.equals(this.data, getFilesResponse.data) &&
        Objects.equals(this.meta, getFilesResponse.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, request, requestTimestamp, updateTimestamp, data, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetFilesResponse {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
    sb.append("    requestTimestamp: ").append(toIndentedString(requestTimestamp)).append("\n");
    sb.append("    updateTimestamp: ").append(toIndentedString(updateTimestamp)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
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

