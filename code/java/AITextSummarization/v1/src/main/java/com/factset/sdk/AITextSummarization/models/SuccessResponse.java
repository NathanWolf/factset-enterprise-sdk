/*
 * AI Text Summarization
 * AI Text Summarization
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.AITextSummarization.models;

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
import com.factset.sdk.AITextSummarization.JSON;


/**
 * SuccessResponse
 */
@JsonPropertyOrder({
  SuccessResponse.JSON_PROPERTY_HEADLINE,
  SuccessResponse.JSON_PROPERTY_SUMMARY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SuccessResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_HEADLINE = "headline";
  private String headline;

  public static final String JSON_PROPERTY_SUMMARY = "summary";
  private String summary;

  public SuccessResponse() { 
  }

  public SuccessResponse headline(String headline) {
    this.headline = headline;
    return this;
  }

   /**
   * A short headline generated for the input text.
   * @return headline
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Advanced Energy unveils new lighting and power control system for indoor, vertical and greenhouse farming.", value = "A short headline generated for the input text.")
  @JsonProperty(JSON_PROPERTY_HEADLINE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getHeadline() {
    return headline;
  }


  @JsonProperty(JSON_PROPERTY_HEADLINE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHeadline(String headline) {
    this.headline = headline;
  }


  public SuccessResponse summary(String summary) {
    this.summary = summary;
    return this;
  }

   /**
   * The generated summary for the input text.
   * @return summary
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Advanced Energy unveiled its newest lighting and power control system for indoor, vertical and greenhouse farming. The new system consists of the patented Artesyn iTS (intelligent Transfer Switch) and iHPS power supply. Alongside Artesyn's compact new 12 kW 300 VDC module, AE delivers a cost-effective platform for the most advanced indoor farming applications. The system is estimated to produce a 38 percent savings to lighting power and control installation cost, while eliminating substantial amounts of wasted energy.", value = "The generated summary for the input text.")
  @JsonProperty(JSON_PROPERTY_SUMMARY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSummary() {
    return summary;
  }


  @JsonProperty(JSON_PROPERTY_SUMMARY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSummary(String summary) {
    this.summary = summary;
  }


  /**
   * Return true if this SuccessResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SuccessResponse successResponse = (SuccessResponse) o;
    return Objects.equals(this.headline, successResponse.headline) &&
        Objects.equals(this.summary, successResponse.summary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(headline, summary);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SuccessResponse {\n");
    sb.append("    headline: ").append(toIndentedString(headline)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
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

