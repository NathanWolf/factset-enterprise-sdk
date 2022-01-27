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
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models.InlineResponse2005DataKeyFiguresVegaEffective;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models.InlineResponse2005DataKeyFiguresVegaUnadjusted;
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
 * Value ranges related to the vega.
 */
@ApiModel(description = "Value ranges related to the vega.")
@JsonPropertyOrder({
  InlineResponse2005DataKeyFiguresVega.JSON_PROPERTY_EFFECTIVE,
  InlineResponse2005DataKeyFiguresVega.JSON_PROPERTY_UNADJUSTED
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse2005DataKeyFiguresVega implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_EFFECTIVE = "effective";
  private InlineResponse2005DataKeyFiguresVegaEffective effective;

  public static final String JSON_PROPERTY_UNADJUSTED = "unadjusted";
  private InlineResponse2005DataKeyFiguresVegaUnadjusted unadjusted;


  public InlineResponse2005DataKeyFiguresVega effective(InlineResponse2005DataKeyFiguresVegaEffective effective) {
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

  public InlineResponse2005DataKeyFiguresVegaEffective getEffective() {
    return effective;
  }


  @JsonProperty(JSON_PROPERTY_EFFECTIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEffective(InlineResponse2005DataKeyFiguresVegaEffective effective) {
    this.effective = effective;
  }


  public InlineResponse2005DataKeyFiguresVega unadjusted(InlineResponse2005DataKeyFiguresVegaUnadjusted unadjusted) {
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

  public InlineResponse2005DataKeyFiguresVegaUnadjusted getUnadjusted() {
    return unadjusted;
  }


  @JsonProperty(JSON_PROPERTY_UNADJUSTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUnadjusted(InlineResponse2005DataKeyFiguresVegaUnadjusted unadjusted) {
    this.unadjusted = unadjusted;
  }


  /**
   * Return true if this inline_response_200_5_data_keyFigures_vega object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2005DataKeyFiguresVega inlineResponse2005DataKeyFiguresVega = (InlineResponse2005DataKeyFiguresVega) o;
    return Objects.equals(this.effective, inlineResponse2005DataKeyFiguresVega.effective) &&
        Objects.equals(this.unadjusted, inlineResponse2005DataKeyFiguresVega.unadjusted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(effective, unadjusted);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2005DataKeyFiguresVega {\n");
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

