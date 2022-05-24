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
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.JSON;


/**
 * Barrier observation modality; applicable to the following barrier types: &#x60;knockIn&#x60;, &#x60;knockOut&#x60;, &#x60;lockIn&#x60;, and &#x60;lockOut&#x60;.
 */
@ApiModel(description = "Barrier observation modality; applicable to the following barrier types: `knockIn`, `knockOut`, `lockIn`, and `lockOut`.")
@JsonPropertyOrder({
  SecuritizedDerivativeNotationScreenerValueRangesGetDataObservation.JSON_PROPERTY_TYPE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SecuritizedDerivativeNotationScreenerValueRangesGetDataObservation implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Type of the barrier observation.
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

  public SecuritizedDerivativeNotationScreenerValueRangesGetDataObservation() { 
  }

  public SecuritizedDerivativeNotationScreenerValueRangesGetDataObservation type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Type of the barrier observation.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Type of the barrier observation.")
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


  /**
   * Return true if this _securitizedDerivative_notation_screener_valueRanges_get_data_observation object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecuritizedDerivativeNotationScreenerValueRangesGetDataObservation securitizedDerivativeNotationScreenerValueRangesGetDataObservation = (SecuritizedDerivativeNotationScreenerValueRangesGetDataObservation) o;
    return Objects.equals(this.type, securitizedDerivativeNotationScreenerValueRangesGetDataObservation.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecuritizedDerivativeNotationScreenerValueRangesGetDataObservation {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

