/*
 * Exchange Snapshot API
 * A service that provides access to Real Time or Delayed data snapped at hourly intervals for an entire Exchange. Clients that need access to the DFSnapshot product for a custom watchlist snapped at a client specified interval should use this API
 *
 * The version of the OpenAPI document: 1.0
 * Contact: teammustang@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.ExchangeDataFeedSnapshotAPIEntireExchange.models;

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
import com.factset.sdk.ExchangeDataFeedSnapshotAPIEntireExchange.JSON;


/**
 * Array of data objects
 */
@ApiModel(description = "Array of data objects")
@JsonPropertyOrder({
  Data.JSON_PROPERTY_PRODUCT,
  Data.JSON_PROPERTY_DATE,
  Data.JSON_PROPERTY_TIME,
  Data.JSON_PROPERTY_RESPONSE_TYPE,
  Data.JSON_PROPERTY_FILE_NAME,
  Data.JSON_PROPERTY_URL
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Data implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_PRODUCT = "product";
  private Integer product;

  public static final String JSON_PROPERTY_DATE = "date";
  private String date;

  public static final String JSON_PROPERTY_TIME = "time";
  private String time;

  public static final String JSON_PROPERTY_RESPONSE_TYPE = "responseType";
  private String responseType;

  public static final String JSON_PROPERTY_FILE_NAME = "fileName";
  private String fileName;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public Data() { 
  }

  public Data product(Integer product) {
    this.product = product;
    return this;
  }

   /**
   * Product or Exchange code. Minimum value for prod code&#x3D;9001
   * @return product
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Product or Exchange code. Minimum value for prod code=9001")
  @JsonProperty(JSON_PROPERTY_PRODUCT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getProduct() {
    return product;
  }


  @JsonProperty(JSON_PROPERTY_PRODUCT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProduct(Integer product) {
    this.product = product;
  }


  public Data date(String date) {
    this.date = date;
    return this;
  }

   /**
   * Date for which data is requested
   * @return date
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date for which data is requested")
  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDate() {
    return date;
  }


  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDate(String date) {
    this.date = date;
  }


  public Data time(String time) {
    this.time = time;
    return this;
  }

   /**
   * time for which data is requested
   * @return time
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "time for which data is requested")
  @JsonProperty(JSON_PROPERTY_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTime() {
    return time;
  }


  @JsonProperty(JSON_PROPERTY_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTime(String time) {
    this.time = time;
  }


  public Data responseType(String responseType) {
    this.responseType = responseType;
    return this;
  }

   /**
   * Type of data (Delayed or Real Time)
   * @return responseType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Type of data (Delayed or Real Time)")
  @JsonProperty(JSON_PROPERTY_RESPONSE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getResponseType() {
    return responseType;
  }


  @JsonProperty(JSON_PROPERTY_RESPONSE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResponseType(String responseType) {
    this.responseType = responseType;
  }


  public Data fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

   /**
   * Name of the file(s) generated for the query requested. This is a combination of product code, date &amp; time of request
   * @return fileName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the file(s) generated for the query requested. This is a combination of product code, date & time of request")
  @JsonProperty(JSON_PROPERTY_FILE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFileName() {
    return fileName;
  }


  @JsonProperty(JSON_PROPERTY_FILE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFileName(String fileName) {
    this.fileName = fileName;
  }


  public Data url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Download link for the snapshot file with requested parameters
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Download link for the snapshot file with requested parameters")
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUrl() {
    return url;
  }


  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUrl(String url) {
    this.url = url;
  }


  /**
   * Return true if this data object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Data data = (Data) o;
    return Objects.equals(this.product, data.product) &&
        Objects.equals(this.date, data.date) &&
        Objects.equals(this.time, data.time) &&
        Objects.equals(this.responseType, data.responseType) &&
        Objects.equals(this.fileName, data.fileName) &&
        Objects.equals(this.url, data.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(product, date, time, responseType, fileName, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Data {\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    responseType: ").append(toIndentedString(responseType)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

