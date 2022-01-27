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
 * Security-level identifier.
 */
@ApiModel(description = "Security-level identifier.")
@JsonPropertyOrder({
  InlineResponse20036FsymSecurity.JSON_PROPERTY_PERMANENT_IDENTIFIER
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse20036FsymSecurity implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_PERMANENT_IDENTIFIER = "permanentIdentifier";
  private String permanentIdentifier;


  public InlineResponse20036FsymSecurity permanentIdentifier(String permanentIdentifier) {
    this.permanentIdentifier = permanentIdentifier;
    return this;
  }

   /**
   * FactSet Permanent Identifier for an instrument. The format is six alpha numeric characters, excluding vowels, with an S suffix (XXXXXX-S).
   * @return permanentIdentifier
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "FactSet Permanent Identifier for an instrument. The format is six alpha numeric characters, excluding vowels, with an S suffix (XXXXXX-S).")
  @JsonProperty(JSON_PROPERTY_PERMANENT_IDENTIFIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPermanentIdentifier() {
    return permanentIdentifier;
  }


  @JsonProperty(JSON_PROPERTY_PERMANENT_IDENTIFIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPermanentIdentifier(String permanentIdentifier) {
    this.permanentIdentifier = permanentIdentifier;
  }


  /**
   * Return true if this inline_response_200_36_fsym_security object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20036FsymSecurity inlineResponse20036FsymSecurity = (InlineResponse20036FsymSecurity) o;
    return Objects.equals(this.permanentIdentifier, inlineResponse20036FsymSecurity.permanentIdentifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(permanentIdentifier);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20036FsymSecurity {\n");
    sb.append("    permanentIdentifier: ").append(toIndentedString(permanentIdentifier)).append("\n");
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

