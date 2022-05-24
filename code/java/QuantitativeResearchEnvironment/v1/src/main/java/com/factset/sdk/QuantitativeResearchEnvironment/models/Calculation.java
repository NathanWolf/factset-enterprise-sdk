/*
 * QRE API
 * TBD
 *
 * The version of the OpenAPI document: 0.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.QuantitativeResearchEnvironment.models;

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
import com.factset.sdk.QuantitativeResearchEnvironment.JSON;


/**
 * Calculation
 */
@JsonPropertyOrder({
  Calculation.JSON_PROPERTY_SCRIPT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Calculation implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_SCRIPT = "script";
  private String script;

  public Calculation() { 
  }

  public Calculation script(String script) {
    this.script = script;
    return this;
  }

   /**
   * The python script that will be executed
   * @return script
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The python script that will be executed")
  @JsonProperty(JSON_PROPERTY_SCRIPT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getScript() {
    return script;
  }


  @JsonProperty(JSON_PROPERTY_SCRIPT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setScript(String script) {
    this.script = script;
  }


  /**
   * Return true if this Calculation object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Calculation calculation = (Calculation) o;
    return Objects.equals(this.script, calculation.script);
  }

  @Override
  public int hashCode() {
    return Objects.hash(script);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Calculation {\n");
    sb.append("    script: ").append(toIndentedString(script)).append("\n");
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

