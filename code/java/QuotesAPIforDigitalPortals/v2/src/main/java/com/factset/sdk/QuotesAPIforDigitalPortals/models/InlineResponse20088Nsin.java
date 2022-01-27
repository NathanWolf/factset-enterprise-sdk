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


package com.factset.sdk.QuotesAPIforDigitalPortals.models;

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
import com.factset.sdk.QuotesAPIforDigitalPortals.JSON;


/**
 * NSIN data of the notation.
 */
@ApiModel(description = "NSIN data of the notation.")
@JsonPropertyOrder({
  InlineResponse20088Nsin.JSON_PROPERTY_SEDOL
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse20088Nsin implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_SEDOL = "sedol";
  private String sedol;


  public InlineResponse20088Nsin sedol(String sedol) {
    this.sedol = sedol;
    return this;
  }

   /**
   * The SEDOL or IDII for the notation.
   * @return sedol
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The SEDOL or IDII for the notation.")
  @JsonProperty(JSON_PROPERTY_SEDOL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSedol() {
    return sedol;
  }


  @JsonProperty(JSON_PROPERTY_SEDOL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSedol(String sedol) {
    this.sedol = sedol;
  }


  /**
   * Return true if this inline_response_200_88_nsin object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20088Nsin inlineResponse20088Nsin = (InlineResponse20088Nsin) o;
    return Objects.equals(this.sedol, inlineResponse20088Nsin.sedol);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sedol);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20088Nsin {\n");
    sb.append("    sedol: ").append(toIndentedString(sedol)).append("\n");
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

