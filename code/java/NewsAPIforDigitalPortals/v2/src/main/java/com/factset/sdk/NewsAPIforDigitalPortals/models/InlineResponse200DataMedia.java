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


package com.factset.sdk.NewsAPIforDigitalPortals.models;

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
import java.math.BigDecimal;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.NewsAPIforDigitalPortals.JSON;


/**
 * InlineResponse200DataMedia
 */
@JsonPropertyOrder({
  InlineResponse200DataMedia.JSON_PROPERTY_URL,
  InlineResponse200DataMedia.JSON_PROPERTY_MIME_TYPE,
  InlineResponse200DataMedia.JSON_PROPERTY_CAPTION,
  InlineResponse200DataMedia.JSON_PROPERTY_ALTERNATIVE_TEXT,
  InlineResponse200DataMedia.JSON_PROPERTY_WIDTH,
  InlineResponse200DataMedia.JSON_PROPERTY_HEIGHT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse200DataMedia implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public static final String JSON_PROPERTY_MIME_TYPE = "mimeType";
  private String mimeType;

  public static final String JSON_PROPERTY_CAPTION = "caption";
  private String caption;

  public static final String JSON_PROPERTY_ALTERNATIVE_TEXT = "alternativeText";
  private String alternativeText;

  public static final String JSON_PROPERTY_WIDTH = "width";
  private BigDecimal width;

  public static final String JSON_PROPERTY_HEIGHT = "height";
  private BigDecimal height;


  public InlineResponse200DataMedia url(String url) {
    this.url = url;
    return this;
  }

   /**
   * URL of the media element. The URL is publicly available and hosted by either the publisher, the distributor, or FactSet.
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "URL of the media element. The URL is publicly available and hosted by either the publisher, the distributor, or FactSet.")
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


  public InlineResponse200DataMedia mimeType(String mimeType) {
    this.mimeType = mimeType;
    return this;
  }

   /**
   * MIME type of the data of the media element.
   * @return mimeType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "MIME type of the data of the media element.")
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


  public InlineResponse200DataMedia caption(String caption) {
    this.caption = caption;
    return this;
  }

   /**
   * Caption text that can be displayed with the media element. Empty if no caption is available for this media element.
   * @return caption
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Caption text that can be displayed with the media element. Empty if no caption is available for this media element.")
  @JsonProperty(JSON_PROPERTY_CAPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCaption() {
    return caption;
  }


  @JsonProperty(JSON_PROPERTY_CAPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCaption(String caption) {
    this.caption = caption;
  }


  public InlineResponse200DataMedia alternativeText(String alternativeText) {
    this.alternativeText = alternativeText;
    return this;
  }

   /**
   * A short description of the media element that can be shown instead of the media element itself.
   * @return alternativeText
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A short description of the media element that can be shown instead of the media element itself.")
  @JsonProperty(JSON_PROPERTY_ALTERNATIVE_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAlternativeText() {
    return alternativeText;
  }


  @JsonProperty(JSON_PROPERTY_ALTERNATIVE_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAlternativeText(String alternativeText) {
    this.alternativeText = alternativeText;
  }


  public InlineResponse200DataMedia width(BigDecimal width) {
    this.width = width;
    return this;
  }

   /**
   * Width of the media element in pixels if applicable.
   * @return width
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Width of the media element in pixels if applicable.")
  @JsonProperty(JSON_PROPERTY_WIDTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getWidth() {
    return width;
  }


  @JsonProperty(JSON_PROPERTY_WIDTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWidth(BigDecimal width) {
    this.width = width;
  }


  public InlineResponse200DataMedia height(BigDecimal height) {
    this.height = height;
    return this;
  }

   /**
   * Height of the media element in pixels if applicable.
   * @return height
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Height of the media element in pixels if applicable.")
  @JsonProperty(JSON_PROPERTY_HEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getHeight() {
    return height;
  }


  @JsonProperty(JSON_PROPERTY_HEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHeight(BigDecimal height) {
    this.height = height;
  }


  /**
   * Return true if this inline_response_200_data_media object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200DataMedia inlineResponse200DataMedia = (InlineResponse200DataMedia) o;
    return Objects.equals(this.url, inlineResponse200DataMedia.url) &&
        Objects.equals(this.mimeType, inlineResponse200DataMedia.mimeType) &&
        Objects.equals(this.caption, inlineResponse200DataMedia.caption) &&
        Objects.equals(this.alternativeText, inlineResponse200DataMedia.alternativeText) &&
        Objects.equals(this.width, inlineResponse200DataMedia.width) &&
        Objects.equals(this.height, inlineResponse200DataMedia.height);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, mimeType, caption, alternativeText, width, height);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200DataMedia {\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    mimeType: ").append(toIndentedString(mimeType)).append("\n");
    sb.append("    caption: ").append(toIndentedString(caption)).append("\n");
    sb.append("    alternativeText: ").append(toIndentedString(alternativeText)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
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

