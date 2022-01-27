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
 * InlineResponse2005DataUnderlyingEffectiveUnderlyingInstrument
 */
@JsonPropertyOrder({
  InlineResponse2005DataUnderlyingEffectiveUnderlyingInstrument.JSON_PROPERTY_ID,
  InlineResponse2005DataUnderlyingEffectiveUnderlyingInstrument.JSON_PROPERTY_COUNT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse2005DataUnderlyingEffectiveUnderlyingInstrument implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_COUNT = "count";
  private BigDecimal count;


  public InlineResponse2005DataUnderlyingEffectiveUnderlyingInstrument id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Identifier of an instrument
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Identifier of an instrument")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }


  public InlineResponse2005DataUnderlyingEffectiveUnderlyingInstrument count(BigDecimal count) {
    this.count = count;
    return this;
  }

   /**
   * Number of notations
   * @return count
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of notations")
  @JsonProperty(JSON_PROPERTY_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getCount() {
    return count;
  }


  @JsonProperty(JSON_PROPERTY_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCount(BigDecimal count) {
    this.count = count;
  }


  /**
   * Return true if this inline_response_200_5_data_underlying_effectiveUnderlying_instrument object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2005DataUnderlyingEffectiveUnderlyingInstrument inlineResponse2005DataUnderlyingEffectiveUnderlyingInstrument = (InlineResponse2005DataUnderlyingEffectiveUnderlyingInstrument) o;
    return Objects.equals(this.id, inlineResponse2005DataUnderlyingEffectiveUnderlyingInstrument.id) &&
        Objects.equals(this.count, inlineResponse2005DataUnderlyingEffectiveUnderlyingInstrument.count);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, count);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2005DataUnderlyingEffectiveUnderlyingInstrument {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
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

