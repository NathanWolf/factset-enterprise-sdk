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


package com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models;

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
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.JSON;


/**
 * Ask-based performance.
 */
@ApiModel(description = "Ask-based performance.")
@JsonPropertyOrder({
  InlineResponse2003DataPerformanceIssueAsk.JSON_PROPERTY_ABSOLUTE,
  InlineResponse2003DataPerformanceIssueAsk.JSON_PROPERTY_RELATIVE,
  InlineResponse2003DataPerformanceIssueAsk.JSON_PROPERTY_ANNUALIZED
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse2003DataPerformanceIssueAsk implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ABSOLUTE = "absolute";
  private BigDecimal absolute;

  public static final String JSON_PROPERTY_RELATIVE = "relative";
  private BigDecimal relative;

  public static final String JSON_PROPERTY_ANNUALIZED = "annualized";
  private BigDecimal annualized;

  public InlineResponse2003DataPerformanceIssueAsk() { 
  }

  public InlineResponse2003DataPerformanceIssueAsk absolute(BigDecimal absolute) {
    this.absolute = absolute;
    return this;
  }

   /**
   * Performance in absolute terms.
   * @return absolute
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Performance in absolute terms.")
  @JsonProperty(JSON_PROPERTY_ABSOLUTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getAbsolute() {
    return absolute;
  }


  @JsonProperty(JSON_PROPERTY_ABSOLUTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAbsolute(BigDecimal absolute) {
    this.absolute = absolute;
  }


  public InlineResponse2003DataPerformanceIssueAsk relative(BigDecimal relative) {
    this.relative = relative;
    return this;
  }

   /**
   * Performance relative to the issue price.
   * @return relative
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Performance relative to the issue price.")
  @JsonProperty(JSON_PROPERTY_RELATIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getRelative() {
    return relative;
  }


  @JsonProperty(JSON_PROPERTY_RELATIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRelative(BigDecimal relative) {
    this.relative = relative;
  }


  public InlineResponse2003DataPerformanceIssueAsk annualized(BigDecimal annualized) {
    this.annualized = annualized;
    return this;
  }

   /**
   * Annualized performance relative to the issue price.
   * @return annualized
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Annualized performance relative to the issue price.")
  @JsonProperty(JSON_PROPERTY_ANNUALIZED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getAnnualized() {
    return annualized;
  }


  @JsonProperty(JSON_PROPERTY_ANNUALIZED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAnnualized(BigDecimal annualized) {
    this.annualized = annualized;
  }


  /**
   * Return true if this inline_response_200_3_data_performanceIssue_ask object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2003DataPerformanceIssueAsk inlineResponse2003DataPerformanceIssueAsk = (InlineResponse2003DataPerformanceIssueAsk) o;
    return Objects.equals(this.absolute, inlineResponse2003DataPerformanceIssueAsk.absolute) &&
        Objects.equals(this.relative, inlineResponse2003DataPerformanceIssueAsk.relative) &&
        Objects.equals(this.annualized, inlineResponse2003DataPerformanceIssueAsk.annualized);
  }

  @Override
  public int hashCode() {
    return Objects.hash(absolute, relative, annualized);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2003DataPerformanceIssueAsk {\n");
    sb.append("    absolute: ").append(toIndentedString(absolute)).append("\n");
    sb.append("    relative: ").append(toIndentedString(relative)).append("\n");
    sb.append("    annualized: ").append(toIndentedString(annualized)).append("\n");
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

