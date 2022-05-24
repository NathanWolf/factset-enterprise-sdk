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
 * Participation factor of the securitized derivative in the performance of the underlying.
 */
@ApiModel(description = "Participation factor of the securitized derivative in the performance of the underlying.")
@JsonPropertyOrder({
  InlineResponse2007DataRangeLowerParticipationFactor.JSON_PROPERTY_POSITIVE,
  InlineResponse2007DataRangeLowerParticipationFactor.JSON_PROPERTY_NEGATIVE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse2007DataRangeLowerParticipationFactor implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_POSITIVE = "positive";
  private BigDecimal positive;

  public static final String JSON_PROPERTY_NEGATIVE = "negative";
  private BigDecimal negative;

  public InlineResponse2007DataRangeLowerParticipationFactor() { 
  }

  public InlineResponse2007DataRangeLowerParticipationFactor positive(BigDecimal positive) {
    this.positive = positive;
    return this;
  }

   /**
   * Participation factor above the lower bound.
   * @return positive
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Participation factor above the lower bound.")
  @JsonProperty(JSON_PROPERTY_POSITIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getPositive() {
    return positive;
  }


  @JsonProperty(JSON_PROPERTY_POSITIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPositive(BigDecimal positive) {
    this.positive = positive;
  }


  public InlineResponse2007DataRangeLowerParticipationFactor negative(BigDecimal negative) {
    this.negative = negative;
    return this;
  }

   /**
   * Participation factor below the lower bound.
   * @return negative
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Participation factor below the lower bound.")
  @JsonProperty(JSON_PROPERTY_NEGATIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getNegative() {
    return negative;
  }


  @JsonProperty(JSON_PROPERTY_NEGATIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNegative(BigDecimal negative) {
    this.negative = negative;
  }


  /**
   * Return true if this inline_response_200_7_data_range_lower_participationFactor object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2007DataRangeLowerParticipationFactor inlineResponse2007DataRangeLowerParticipationFactor = (InlineResponse2007DataRangeLowerParticipationFactor) o;
    return Objects.equals(this.positive, inlineResponse2007DataRangeLowerParticipationFactor.positive) &&
        Objects.equals(this.negative, inlineResponse2007DataRangeLowerParticipationFactor.negative);
  }

  @Override
  public int hashCode() {
    return Objects.hash(positive, negative);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2007DataRangeLowerParticipationFactor {\n");
    sb.append("    positive: ").append(toIndentedString(positive)).append("\n");
    sb.append("    negative: ").append(toIndentedString(negative)).append("\n");
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

