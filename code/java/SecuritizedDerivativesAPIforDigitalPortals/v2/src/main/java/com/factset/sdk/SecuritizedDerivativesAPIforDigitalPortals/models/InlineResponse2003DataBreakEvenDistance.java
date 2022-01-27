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
 * Distance from the underlying level to the  break even point.
 */
@ApiModel(description = "Distance from the underlying level to the  break even point.")
@JsonPropertyOrder({
  InlineResponse2003DataBreakEvenDistance.JSON_PROPERTY_ABSOLUTE,
  InlineResponse2003DataBreakEvenDistance.JSON_PROPERTY_RELATIVE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse2003DataBreakEvenDistance implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ABSOLUTE = "absolute";
  private BigDecimal absolute;

  public static final String JSON_PROPERTY_RELATIVE = "relative";
  private BigDecimal relative;


  public InlineResponse2003DataBreakEvenDistance absolute(BigDecimal absolute) {
    this.absolute = absolute;
    return this;
  }

   /**
   * Distance in absolute terms. For the value unit, see attribute &#x60;underlyings.valueUnit&#x60;.
   * @return absolute
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Distance in absolute terms. For the value unit, see attribute `underlyings.valueUnit`.")
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


  public InlineResponse2003DataBreakEvenDistance relative(BigDecimal relative) {
    this.relative = relative;
    return this;
  }

   /**
   * Distance relative to the underlying level. 
   * @return relative
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Distance relative to the underlying level. ")
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


  /**
   * Return true if this inline_response_200_3_data_breakEven_distance object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2003DataBreakEvenDistance inlineResponse2003DataBreakEvenDistance = (InlineResponse2003DataBreakEvenDistance) o;
    return Objects.equals(this.absolute, inlineResponse2003DataBreakEvenDistance.absolute) &&
        Objects.equals(this.relative, inlineResponse2003DataBreakEvenDistance.relative);
  }

  @Override
  public int hashCode() {
    return Objects.hash(absolute, relative);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2003DataBreakEvenDistance {\n");
    sb.append("    absolute: ").append(toIndentedString(absolute)).append("\n");
    sb.append("    relative: ").append(toIndentedString(relative)).append("\n");
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

