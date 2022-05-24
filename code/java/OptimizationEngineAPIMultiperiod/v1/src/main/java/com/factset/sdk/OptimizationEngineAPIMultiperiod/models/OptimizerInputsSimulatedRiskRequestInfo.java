/*
 * fpo_mp_input
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.OptimizationEngineAPIMultiperiod.models;

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
import com.factset.sdk.OptimizationEngineAPIMultiperiod.JSON;


/**
 * OptimizerInputsSimulatedRiskRequestInfo
 */
@JsonPropertyOrder({
  OptimizerInputsSimulatedRiskRequestInfo.JSON_PROPERTY_URL,
  OptimizerInputsSimulatedRiskRequestInfo.JSON_PROPERTY_LIMA_HEADER
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class OptimizerInputsSimulatedRiskRequestInfo implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public static final String JSON_PROPERTY_LIMA_HEADER = "lima_header";
  private String limaHeader;

  public OptimizerInputsSimulatedRiskRequestInfo() { 
  }

  public OptimizerInputsSimulatedRiskRequestInfo url(String url) {
    this.url = url;
    return this;
  }

   /**
   * GET
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "GET")
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUrl() {
    return url;
  }


  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUrl(String url) {
    this.url = url;
  }


  public OptimizerInputsSimulatedRiskRequestInfo limaHeader(String limaHeader) {
    this.limaHeader = limaHeader;
    return this;
  }

   /**
   * Get limaHeader
   * @return limaHeader
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LIMA_HEADER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLimaHeader() {
    return limaHeader;
  }


  @JsonProperty(JSON_PROPERTY_LIMA_HEADER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLimaHeader(String limaHeader) {
    this.limaHeader = limaHeader;
  }


  /**
   * Return true if this optimizer.inputs.SimulatedRiskRequestInfo object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OptimizerInputsSimulatedRiskRequestInfo optimizerInputsSimulatedRiskRequestInfo = (OptimizerInputsSimulatedRiskRequestInfo) o;
    return Objects.equals(this.url, optimizerInputsSimulatedRiskRequestInfo.url) &&
        Objects.equals(this.limaHeader, optimizerInputsSimulatedRiskRequestInfo.limaHeader);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, limaHeader);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OptimizerInputsSimulatedRiskRequestInfo {\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    limaHeader: ").append(toIndentedString(limaHeader)).append("\n");
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

