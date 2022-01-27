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
import org.threeten.bp.LocalDate;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.JSON;


/**
 * Date range of the valuation date.
 */
@ApiModel(description = "Date range of the valuation date.")
@JsonPropertyOrder({
  InlineResponse2005DataLifeCycleValuation.JSON_PROPERTY_MINIMUM,
  InlineResponse2005DataLifeCycleValuation.JSON_PROPERTY_MAXIMUM
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse2005DataLifeCycleValuation implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_MINIMUM = "minimum";
  private LocalDate minimum;

  public static final String JSON_PROPERTY_MAXIMUM = "maximum";
  private LocalDate maximum;


  public InlineResponse2005DataLifeCycleValuation minimum(LocalDate minimum) {
    this.minimum = minimum;
    return this;
  }

   /**
   * Minimum date.
   * @return minimum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Minimum date.")
  @JsonProperty(JSON_PROPERTY_MINIMUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LocalDate getMinimum() {
    return minimum;
  }


  @JsonProperty(JSON_PROPERTY_MINIMUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMinimum(LocalDate minimum) {
    this.minimum = minimum;
  }


  public InlineResponse2005DataLifeCycleValuation maximum(LocalDate maximum) {
    this.maximum = maximum;
    return this;
  }

   /**
   * Maximum date.
   * @return maximum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Maximum date.")
  @JsonProperty(JSON_PROPERTY_MAXIMUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LocalDate getMaximum() {
    return maximum;
  }


  @JsonProperty(JSON_PROPERTY_MAXIMUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaximum(LocalDate maximum) {
    this.maximum = maximum;
  }


  /**
   * Return true if this inline_response_200_5_data_lifeCycle_valuation object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2005DataLifeCycleValuation inlineResponse2005DataLifeCycleValuation = (InlineResponse2005DataLifeCycleValuation) o;
    return Objects.equals(this.minimum, inlineResponse2005DataLifeCycleValuation.minimum) &&
        Objects.equals(this.maximum, inlineResponse2005DataLifeCycleValuation.maximum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(minimum, maximum);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2005DataLifeCycleValuation {\n");
    sb.append("    minimum: ").append(toIndentedString(minimum)).append("\n");
    sb.append("    maximum: ").append(toIndentedString(maximum)).append("\n");
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

