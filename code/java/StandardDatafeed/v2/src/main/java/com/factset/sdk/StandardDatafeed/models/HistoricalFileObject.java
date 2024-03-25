/*
 * Standard DataFeed (SDF) Download API
 * [The Standard DataFeed (SDF) Download API](https://www.factset.com/marketplace/catalog/product/factset-standard-datafeed-download-api)  provides an alternative method for users to request and retrieve SDF packages (schemas & bundles).  This service is not a direct replacement and does not have 100% feature parity with the Loader Application.  This API provides an alternative for users who are unable to utilize the Loader application due to the following reasons:  * Inability to install 3rd party executables due to Corporate Security policies.  * Inability to utilize the Loader application due to limitations or restrictions with the environment used to consume Standard Datafeed.  * Clients who are utilizing existing delivery methods like FTP, who may want to use a more secure & modern solution.  This API allows users to retrieve  * Both SDF and the QFL (Quant Factor Library (Factor Family & Factor Groups)) packages they have subscriptions for, with data available since January 1, 1995.  Additional parameters are available to filter requests to get the exact files users are looking for.  QFL data is delivered through Content API & Bulk Data API (SDF API).  * Content API: Provides direct access to FactSet-hosted QFL data. Suitable for interactive, ad hoc QFL requests. Constraints on large extracts. Costs are based on consumption, i.e. more calls can result in more costs.  * Bulk Data API: Provides access to download locations of zip files for client download. Suitable for production processes within a client environment. Cost is based on the use case and fixed unless scope changes (same as other SDFs).  Please find all the content-related comprehensive documentation [here](https://my.apps.factset.com/oa/pages/15222). 
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.StandardDatafeed.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.StandardDatafeed.models.HistoricalFileObjectObject;
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
import com.factset.sdk.StandardDatafeed.JSON;


/**
 * HistoricalFileObject
 */
@JsonPropertyOrder({
  HistoricalFileObject.JSON_PROPERTY_TYPE,
  HistoricalFileObject.JSON_PROPERTY_BUNDLE,
  HistoricalFileObject.JSON_PROPERTY_SCHEMA,
  HistoricalFileObject.JSON_PROPERTY_VERSION,
  HistoricalFileObject.JSON_PROPERTY_RELATED_BUNDLES,
  HistoricalFileObject.JSON_PROPERTY_TIMESTAMP,
  HistoricalFileObject.JSON_PROPERTY_URL,
  HistoricalFileObject.JSON_PROPERTY_FILE_SIZE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class HistoricalFileObject implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_BUNDLE = "bundle";
  private String bundle;

  public static final String JSON_PROPERTY_SCHEMA = "schema";
  private String schema;

  public static final String JSON_PROPERTY_VERSION = "version";
  private String version;

  public static final String JSON_PROPERTY_RELATED_BUNDLES = "relatedBundles";
  private java.util.List<HistoricalFileObjectObject> relatedBundles = null;

  public static final String JSON_PROPERTY_TIMESTAMP = "timestamp";
  private OffsetDateTime timestamp;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public static final String JSON_PROPERTY_FILE_SIZE = "fileSize";
  private String fileSize;

  public HistoricalFileObject() { 
  }

  public HistoricalFileObject type(String type) {
    this.type = type;
    return this;
  }

   /**
   * File type: full or delta.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "File type: full or delta.")
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


  public HistoricalFileObject bundle(String bundle) {
    this.bundle = bundle;
    return this;
  }

   /**
   * Bundle name.
   * @return bundle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Bundle name.")
  @JsonProperty(JSON_PROPERTY_BUNDLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBundle() {
    return bundle;
  }


  @JsonProperty(JSON_PROPERTY_BUNDLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBundle(String bundle) {
    this.bundle = bundle;
  }


  public HistoricalFileObject schema(String schema) {
    this.schema = schema;
    return this;
  }

   /**
   * Schema name.
   * @return schema
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Schema name.")
  @JsonProperty(JSON_PROPERTY_SCHEMA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSchema() {
    return schema;
  }


  @JsonProperty(JSON_PROPERTY_SCHEMA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSchema(String schema) {
    this.schema = schema;
  }


  public HistoricalFileObject version(String version) {
    this.version = version;
    return this;
  }

   /**
   * Full or delta file version.
   * @return version
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Full or delta file version.")
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVersion() {
    return version;
  }


  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVersion(String version) {
    this.version = version;
  }


  public HistoricalFileObject relatedBundles(java.util.List<HistoricalFileObjectObject> relatedBundles) {
    this.relatedBundles = relatedBundles;
    return this;
  }

  public HistoricalFileObject addRelatedBundlesItem(HistoricalFileObjectObject relatedBundlesItem) {
    if (this.relatedBundles == null) {
      this.relatedBundles = new java.util.ArrayList<>();
    }
    this.relatedBundles.add(relatedBundlesItem);
    return this;
  }

   /**
   * Bundles related to the version number.
   * @return relatedBundles
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Bundles related to the version number.")
  @JsonProperty(JSON_PROPERTY_RELATED_BUNDLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<HistoricalFileObjectObject> getRelatedBundles() {
    return relatedBundles;
  }


  @JsonProperty(JSON_PROPERTY_RELATED_BUNDLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRelatedBundles(java.util.List<HistoricalFileObjectObject> relatedBundles) {
    this.relatedBundles = relatedBundles;
  }


  public HistoricalFileObject timestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Timestamp of when the bundle was generated.
   * @return timestamp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Timestamp of when the bundle was generated.")
  @JsonProperty(JSON_PROPERTY_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getTimestamp() {
    return timestamp;
  }


  @JsonProperty(JSON_PROPERTY_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }


  public HistoricalFileObject url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Pre-signed URL pointing to the location from where the schema details can be downloaded.
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Pre-signed URL pointing to the location from where the schema details can be downloaded.")
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


  public HistoricalFileObject fileSize(String fileSize) {
    this.fileSize = fileSize;
    return this;
  }

   /**
   * File size of the particular bundle.
   * @return fileSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "File size of the particular bundle.")
  @JsonProperty(JSON_PROPERTY_FILE_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFileSize() {
    return fileSize;
  }


  @JsonProperty(JSON_PROPERTY_FILE_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFileSize(String fileSize) {
    this.fileSize = fileSize;
  }


  /**
   * Return true if this HistoricalFileObject object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HistoricalFileObject historicalFileObject = (HistoricalFileObject) o;
    return Objects.equals(this.type, historicalFileObject.type) &&
        Objects.equals(this.bundle, historicalFileObject.bundle) &&
        Objects.equals(this.schema, historicalFileObject.schema) &&
        Objects.equals(this.version, historicalFileObject.version) &&
        Objects.equals(this.relatedBundles, historicalFileObject.relatedBundles) &&
        Objects.equals(this.timestamp, historicalFileObject.timestamp) &&
        Objects.equals(this.url, historicalFileObject.url) &&
        Objects.equals(this.fileSize, historicalFileObject.fileSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, bundle, schema, version, relatedBundles, timestamp, url, fileSize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistoricalFileObject {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    bundle: ").append(toIndentedString(bundle)).append("\n");
    sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    relatedBundles: ").append(toIndentedString(relatedBundles)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    fileSize: ").append(toIndentedString(fileSize)).append("\n");
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

