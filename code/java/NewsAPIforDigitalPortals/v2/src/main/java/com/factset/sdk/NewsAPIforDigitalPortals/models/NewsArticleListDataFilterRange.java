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
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.NewsAPIforDigitalPortals.JSON;


/**
 * Time range for matching the news article&#39;s date. At most one of the attributes &#x60;start&#x60; or &#x60;end&#x60; may be &#x60;null&#x60;.
 */
@ApiModel(description = "Time range for matching the news article's date. At most one of the attributes `start` or `end` may be `null`.")
@JsonPropertyOrder({
  NewsArticleListDataFilterRange.JSON_PROPERTY_START,
  NewsArticleListDataFilterRange.JSON_PROPERTY_END
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class NewsArticleListDataFilterRange implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_START = "start";
  private String start;

  public static final String JSON_PROPERTY_END = "end";
  private String end;

  public NewsArticleListDataFilterRange() { 
  }

  @JsonCreator
  public NewsArticleListDataFilterRange(
    @JsonProperty(value=JSON_PROPERTY_START, required=true) String start, 
    @JsonProperty(value=JSON_PROPERTY_END, required=true) String end
  ) {
    this();
    this.start = start;
    this.end = end;
  }

  public NewsArticleListDataFilterRange start(String start) {
    this.start = start;
    return this;
  }

   /**
   * The starting point of the time range (inclusive), or &#x60;null&#x60; to indicate that the time range extends indefinitely into the past.
   * @return start
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The starting point of the time range (inclusive), or `null` to indicate that the time range extends indefinitely into the past.")
  @JsonProperty(JSON_PROPERTY_START)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getStart() {
    return start;
  }


  @JsonProperty(JSON_PROPERTY_START)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStart(String start) {
    this.start = start;
  }


  public NewsArticleListDataFilterRange end(String end) {
    this.end = end;
    return this;
  }

   /**
   * The ending point of the time range (exclusive), or &#x60;null&#x60; to indicate that the time range extends indefinitely into the future.
   * @return end
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The ending point of the time range (exclusive), or `null` to indicate that the time range extends indefinitely into the future.")
  @JsonProperty(JSON_PROPERTY_END)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getEnd() {
    return end;
  }


  @JsonProperty(JSON_PROPERTY_END)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEnd(String end) {
    this.end = end;
  }


  /**
   * Return true if this _news_article_list_data_filter_range object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NewsArticleListDataFilterRange newsArticleListDataFilterRange = (NewsArticleListDataFilterRange) o;
    return Objects.equals(this.start, newsArticleListDataFilterRange.start) &&
        Objects.equals(this.end, newsArticleListDataFilterRange.end);
  }

  @Override
  public int hashCode() {
    return Objects.hash(start, end);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewsArticleListDataFilterRange {\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
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

