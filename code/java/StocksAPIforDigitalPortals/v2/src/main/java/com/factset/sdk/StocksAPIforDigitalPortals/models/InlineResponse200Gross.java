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


package com.factset.sdk.StocksAPIforDigitalPortals.models;

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
import com.factset.sdk.StocksAPIforDigitalPortals.JSON;


/**
 * Gross value.
 */
@ApiModel(description = "Gross value.")
@JsonPropertyOrder({
  InlineResponse200Gross.JSON_PROPERTY_UNADJUSTED_VALUE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse200Gross implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_UNADJUSTED_VALUE = "unadjustedValue";
  private BigDecimal unadjustedValue;


  public InlineResponse200Gross unadjustedValue(BigDecimal unadjustedValue) {
    this.unadjustedValue = unadjustedValue;
    return this;
  }

   /**
   * Value of the unadjusted dividend.
   * @return unadjustedValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Value of the unadjusted dividend.")
  @JsonProperty(JSON_PROPERTY_UNADJUSTED_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getUnadjustedValue() {
    return unadjustedValue;
  }


  @JsonProperty(JSON_PROPERTY_UNADJUSTED_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUnadjustedValue(BigDecimal unadjustedValue) {
    this.unadjustedValue = unadjustedValue;
  }


  /**
   * Return true if this inline_response_200_gross object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200Gross inlineResponse200Gross = (InlineResponse200Gross) o;
    return Objects.equals(this.unadjustedValue, inlineResponse200Gross.unadjustedValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(unadjustedValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200Gross {\n");
    sb.append("    unadjustedValue: ").append(toIndentedString(unadjustedValue)).append("\n");
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

