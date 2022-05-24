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


package com.factset.sdk.BondsAPIforDigitalPortals.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.BondsAPIforDigitalPortals.models.InlineResponse2003InstrumentLifeCycleMaturity;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.BondsAPIforDigitalPortals.JSON;


/**
 * Important dates of the debt instrument.
 */
@ApiModel(description = "Important dates of the debt instrument.")
@JsonPropertyOrder({
  InlineResponse2003InstrumentLifeCycle.JSON_PROPERTY_ISSUE,
  InlineResponse2003InstrumentLifeCycle.JSON_PROPERTY_MATURITY,
  InlineResponse2003InstrumentLifeCycle.JSON_PROPERTY_CALLABLE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse2003InstrumentLifeCycle implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ISSUE = "issue";
  private LocalDate issue;

  public static final String JSON_PROPERTY_MATURITY = "maturity";
  private InlineResponse2003InstrumentLifeCycleMaturity maturity;

  public static final String JSON_PROPERTY_CALLABLE = "callable";
  private Boolean callable;

  public InlineResponse2003InstrumentLifeCycle() { 
  }

  public InlineResponse2003InstrumentLifeCycle issue(LocalDate issue) {
    this.issue = issue;
    return this;
  }

   /**
   * Date of the issue.
   * @return issue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date of the issue.")
  @JsonProperty(JSON_PROPERTY_ISSUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LocalDate getIssue() {
    return issue;
  }


  @JsonProperty(JSON_PROPERTY_ISSUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIssue(LocalDate issue) {
    this.issue = issue;
  }


  public InlineResponse2003InstrumentLifeCycle maturity(InlineResponse2003InstrumentLifeCycleMaturity maturity) {
    this.maturity = maturity;
    return this;
  }

   /**
   * Get maturity
   * @return maturity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MATURITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2003InstrumentLifeCycleMaturity getMaturity() {
    return maturity;
  }


  @JsonProperty(JSON_PROPERTY_MATURITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaturity(InlineResponse2003InstrumentLifeCycleMaturity maturity) {
    this.maturity = maturity;
  }


  public InlineResponse2003InstrumentLifeCycle callable(Boolean callable) {
    this.callable = callable;
    return this;
  }

   /**
   * If &#x60;true&#x60;, the issuer may redeem the instrument prior to maturity.
   * @return callable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If `true`, the issuer may redeem the instrument prior to maturity.")
  @JsonProperty(JSON_PROPERTY_CALLABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getCallable() {
    return callable;
  }


  @JsonProperty(JSON_PROPERTY_CALLABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCallable(Boolean callable) {
    this.callable = callable;
  }


  /**
   * Return true if this inline_response_200_3_instrument_lifeCycle object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2003InstrumentLifeCycle inlineResponse2003InstrumentLifeCycle = (InlineResponse2003InstrumentLifeCycle) o;
    return Objects.equals(this.issue, inlineResponse2003InstrumentLifeCycle.issue) &&
        Objects.equals(this.maturity, inlineResponse2003InstrumentLifeCycle.maturity) &&
        Objects.equals(this.callable, inlineResponse2003InstrumentLifeCycle.callable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issue, maturity, callable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2003InstrumentLifeCycle {\n");
    sb.append("    issue: ").append(toIndentedString(issue)).append("\n");
    sb.append("    maturity: ").append(toIndentedString(maturity)).append("\n");
    sb.append("    callable: ").append(toIndentedString(callable)).append("\n");
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

