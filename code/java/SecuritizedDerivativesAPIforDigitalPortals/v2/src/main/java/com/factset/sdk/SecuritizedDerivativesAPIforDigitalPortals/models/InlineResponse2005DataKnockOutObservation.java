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
 * InlineResponse2005DataKnockOutObservation
 */
@JsonPropertyOrder({
  InlineResponse2005DataKnockOutObservation.JSON_PROPERTY_TYPE,
  InlineResponse2005DataKnockOutObservation.JSON_PROPERTY_COUNT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse2005DataKnockOutObservation implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Observation type.
   */
  public enum TypeEnum {
    CONTINUOUS("continuous"),
    
    EOD("eod");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TYPE = "type";
  private TypeEnum type;

  public static final String JSON_PROPERTY_COUNT = "count";
  private BigDecimal count;

  public InlineResponse2005DataKnockOutObservation() { 
  }

  public InlineResponse2005DataKnockOutObservation type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Observation type.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Observation type.")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TypeEnum getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(TypeEnum type) {
    this.type = type;
  }


  public InlineResponse2005DataKnockOutObservation count(BigDecimal count) {
    this.count = count;
    return this;
  }

   /**
   * Number of notations.
   * @return count
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of notations.")
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
   * Return true if this inline_response_200_5_data_knockOut_observation object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2005DataKnockOutObservation inlineResponse2005DataKnockOutObservation = (InlineResponse2005DataKnockOutObservation) o;
    return Objects.equals(this.type, inlineResponse2005DataKnockOutObservation.type) &&
        Objects.equals(this.count, inlineResponse2005DataKnockOutObservation.count);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, count);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2005DataKnockOutObservation {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

