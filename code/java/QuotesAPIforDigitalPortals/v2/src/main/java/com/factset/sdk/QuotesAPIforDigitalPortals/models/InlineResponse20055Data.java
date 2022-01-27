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
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20055DataValidity;
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
 * Instrument response.
 */
@ApiModel(description = "Instrument response.")
@JsonPropertyOrder({
  InlineResponse20055Data.JSON_PROPERTY_ID,
  InlineResponse20055Data.JSON_PROPERTY_VALIDITY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse20055Data implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_VALIDITY = "validity";
  private InlineResponse20055DataValidity validity;


  public InlineResponse20055Data id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Identifier of the instrument.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Identifier of the instrument.")
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


  public InlineResponse20055Data validity(InlineResponse20055DataValidity validity) {
    this.validity = validity;
    return this;
  }

   /**
   * Get validity
   * @return validity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VALIDITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse20055DataValidity getValidity() {
    return validity;
  }


  @JsonProperty(JSON_PROPERTY_VALIDITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValidity(InlineResponse20055DataValidity validity) {
    this.validity = validity;
  }


  /**
   * Return true if this inline_response_200_55_data object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20055Data inlineResponse20055Data = (InlineResponse20055Data) o;
    return Objects.equals(this.id, inlineResponse20055Data.id) &&
        Objects.equals(this.validity, inlineResponse20055Data.validity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, validity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20055Data {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    validity: ").append(toIndentedString(validity)).append("\n");
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

