/*
 * Prime Developer Trial
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.CompanyLogoAPIforDigitalPortals.models;

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
import com.factset.sdk.CompanyLogoAPIforDigitalPortals.JSON;


/**
 * Small logo.
 */
@ApiModel(description = "Small logo.")
@JsonPropertyOrder({
  InlineResponse200DataSmall.JSON_PROPERTY_URL,
  InlineResponse200DataSmall.JSON_PROPERTY_MIME_TYPE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse200DataSmall implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public static final String JSON_PROPERTY_MIME_TYPE = "mimeType";
  private String mimeType;

  public InlineResponse200DataSmall() { 
  }

  public InlineResponse200DataSmall url(String url) {
    this.url = url;
    return this;
  }

   /**
   * URL of the logo.
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "URL of the logo.")
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


  public InlineResponse200DataSmall mimeType(String mimeType) {
    this.mimeType = mimeType;
    return this;
  }

   /**
   * MIME type of the logo.
   * @return mimeType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "MIME type of the logo.")
  @JsonProperty(JSON_PROPERTY_MIME_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMimeType() {
    return mimeType;
  }


  @JsonProperty(JSON_PROPERTY_MIME_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMimeType(String mimeType) {
    this.mimeType = mimeType;
  }


  /**
   * Return true if this inline_response_200_data_small object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200DataSmall inlineResponse200DataSmall = (InlineResponse200DataSmall) o;
    return Objects.equals(this.url, inlineResponse200DataSmall.url) &&
        Objects.equals(this.mimeType, inlineResponse200DataSmall.mimeType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, mimeType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200DataSmall {\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    mimeType: ").append(toIndentedString(mimeType)).append("\n");
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

