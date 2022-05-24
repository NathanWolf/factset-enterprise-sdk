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
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models.InlineResponse2005DataKeyFiguresThetaOneWeekEffective;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models.InlineResponse2005DataKeyFiguresThetaOneWeekUnadjusted;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.JSON;


/**
 * Value ranges related to the weekly theta.
 */
@ApiModel(description = "Value ranges related to the weekly theta.")
@JsonPropertyOrder({
  InlineResponse2005DataKeyFiguresThetaOneWeek.JSON_PROPERTY_EFFECTIVE,
  InlineResponse2005DataKeyFiguresThetaOneWeek.JSON_PROPERTY_UNADJUSTED
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse2005DataKeyFiguresThetaOneWeek implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_EFFECTIVE = "effective";
  private InlineResponse2005DataKeyFiguresThetaOneWeekEffective effective;

  public static final String JSON_PROPERTY_UNADJUSTED = "unadjusted";
  private InlineResponse2005DataKeyFiguresThetaOneWeekUnadjusted unadjusted;

  public InlineResponse2005DataKeyFiguresThetaOneWeek() { 
  }

  public InlineResponse2005DataKeyFiguresThetaOneWeek effective(InlineResponse2005DataKeyFiguresThetaOneWeekEffective effective) {
    this.effective = effective;
    return this;
  }

   /**
   * Get effective
   * @return effective
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EFFECTIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2005DataKeyFiguresThetaOneWeekEffective getEffective() {
    return effective;
  }


  @JsonProperty(JSON_PROPERTY_EFFECTIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEffective(InlineResponse2005DataKeyFiguresThetaOneWeekEffective effective) {
    this.effective = effective;
  }


  public InlineResponse2005DataKeyFiguresThetaOneWeek unadjusted(InlineResponse2005DataKeyFiguresThetaOneWeekUnadjusted unadjusted) {
    this.unadjusted = unadjusted;
    return this;
  }

   /**
   * Get unadjusted
   * @return unadjusted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_UNADJUSTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2005DataKeyFiguresThetaOneWeekUnadjusted getUnadjusted() {
    return unadjusted;
  }


  @JsonProperty(JSON_PROPERTY_UNADJUSTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUnadjusted(InlineResponse2005DataKeyFiguresThetaOneWeekUnadjusted unadjusted) {
    this.unadjusted = unadjusted;
  }


  /**
   * Return true if this inline_response_200_5_data_keyFigures_thetaOneWeek object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2005DataKeyFiguresThetaOneWeek inlineResponse2005DataKeyFiguresThetaOneWeek = (InlineResponse2005DataKeyFiguresThetaOneWeek) o;
    return Objects.equals(this.effective, inlineResponse2005DataKeyFiguresThetaOneWeek.effective) &&
        Objects.equals(this.unadjusted, inlineResponse2005DataKeyFiguresThetaOneWeek.unadjusted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(effective, unadjusted);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2005DataKeyFiguresThetaOneWeek {\n");
    sb.append("    effective: ").append(toIndentedString(effective)).append("\n");
    sb.append("    unadjusted: ").append(toIndentedString(unadjusted)).append("\n");
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

