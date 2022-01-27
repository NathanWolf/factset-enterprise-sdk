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
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models.InlineResponse2007DataRange;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models.InlineResponse2007DataSingle;
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
 * InlineResponse2007DataBarriers
 */
@JsonPropertyOrder({
  InlineResponse2007DataBarriers.JSON_PROPERTY_UNDERLYING_INDEX,
  InlineResponse2007DataBarriers.JSON_PROPERTY_SINGLE,
  InlineResponse2007DataBarriers.JSON_PROPERTY_RANGE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse2007DataBarriers implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_UNDERLYING_INDEX = "underlyingIndex";
  private BigDecimal underlyingIndex;

  public static final String JSON_PROPERTY_SINGLE = "single";
  private InlineResponse2007DataSingle single;

  public static final String JSON_PROPERTY_RANGE = "range";
  private InlineResponse2007DataRange range;


  public InlineResponse2007DataBarriers underlyingIndex(BigDecimal underlyingIndex) {
    this.underlyingIndex = underlyingIndex;
    return this;
  }

   /**
   * Index used to identify the underlying associated with that barrier level, in the array &#x60;underlyings&#x60;, with the first element having index 0.
   * @return underlyingIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Index used to identify the underlying associated with that barrier level, in the array `underlyings`, with the first element having index 0.")
  @JsonProperty(JSON_PROPERTY_UNDERLYING_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getUnderlyingIndex() {
    return underlyingIndex;
  }


  @JsonProperty(JSON_PROPERTY_UNDERLYING_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUnderlyingIndex(BigDecimal underlyingIndex) {
    this.underlyingIndex = underlyingIndex;
  }


  public InlineResponse2007DataBarriers single(InlineResponse2007DataSingle single) {
    this.single = single;
    return this;
  }

   /**
   * Get single
   * @return single
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SINGLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2007DataSingle getSingle() {
    return single;
  }


  @JsonProperty(JSON_PROPERTY_SINGLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSingle(InlineResponse2007DataSingle single) {
    this.single = single;
  }


  public InlineResponse2007DataBarriers range(InlineResponse2007DataRange range) {
    this.range = range;
    return this;
  }

   /**
   * Get range
   * @return range
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2007DataRange getRange() {
    return range;
  }


  @JsonProperty(JSON_PROPERTY_RANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRange(InlineResponse2007DataRange range) {
    this.range = range;
  }


  /**
   * Return true if this inline_response_200_7_data_barriers object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2007DataBarriers inlineResponse2007DataBarriers = (InlineResponse2007DataBarriers) o;
    return Objects.equals(this.underlyingIndex, inlineResponse2007DataBarriers.underlyingIndex) &&
        Objects.equals(this.single, inlineResponse2007DataBarriers.single) &&
        Objects.equals(this.range, inlineResponse2007DataBarriers.range);
  }

  @Override
  public int hashCode() {
    return Objects.hash(underlyingIndex, single, range);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2007DataBarriers {\n");
    sb.append("    underlyingIndex: ").append(toIndentedString(underlyingIndex)).append("\n");
    sb.append("    single: ").append(toIndentedString(single)).append("\n");
    sb.append("    range: ").append(toIndentedString(range)).append("\n");
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

