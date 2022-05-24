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


package com.factset.sdk.ETFProfileandPrices.models;

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
import com.factset.sdk.ETFProfileandPrices.JSON;


/**
 * Fund flows (i.e., the amount invested or divested from a fund) based on the creation/redemption process. The data returned may not be related to overall volume or price movement. All fund flow inputs use transaction-day values to ensure that all assets under management (AUM) and flows are fully comparable and reflective of the same, verified market conditions. This data is available for all the regions.
 */
@ApiModel(description = "Fund flows (i.e., the amount invested or divested from a fund) based on the creation/redemption process. The data returned may not be related to overall volume or price movement. All fund flow inputs use transaction-day values to ensure that all assets under management (AUM) and flows are fully comparable and reflective of the same, verified market conditions. This data is available for all the regions.")
@JsonPropertyOrder({
  InlineResponse20022Data.JSON_PROPERTY_FLOWS1_D,
  InlineResponse20022Data.JSON_PROPERTY_FLOWS1_W,
  InlineResponse20022Data.JSON_PROPERTY_FLOWS1_M,
  InlineResponse20022Data.JSON_PROPERTY_FLOWS_Y_T_D,
  InlineResponse20022Data.JSON_PROPERTY_FLOWS1_Y
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse20022Data implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_FLOWS1_D = "flows1D";
  private BigDecimal flows1D;

  public static final String JSON_PROPERTY_FLOWS1_W = "flows1W";
  private BigDecimal flows1W;

  public static final String JSON_PROPERTY_FLOWS1_M = "flows1M";
  private BigDecimal flows1M;

  public static final String JSON_PROPERTY_FLOWS_Y_T_D = "flowsYTD";
  private BigDecimal flowsYTD;

  public static final String JSON_PROPERTY_FLOWS1_Y = "flows1Y";
  private BigDecimal flows1Y;

  public InlineResponse20022Data() { 
  }

  public InlineResponse20022Data flows1D(BigDecimal flows1D) {
    this.flows1D = flows1D;
    return this;
  }

   /**
   * One-day fund flows. This data is available for all the regions.
   * @return flows1D
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "One-day fund flows. This data is available for all the regions.")
  @JsonProperty(JSON_PROPERTY_FLOWS1_D)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getFlows1D() {
    return flows1D;
  }


  @JsonProperty(JSON_PROPERTY_FLOWS1_D)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFlows1D(BigDecimal flows1D) {
    this.flows1D = flows1D;
  }


  public InlineResponse20022Data flows1W(BigDecimal flows1W) {
    this.flows1W = flows1W;
    return this;
  }

   /**
   * One-week fund flows. This data is available for all the regions.
   * @return flows1W
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "One-week fund flows. This data is available for all the regions.")
  @JsonProperty(JSON_PROPERTY_FLOWS1_W)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getFlows1W() {
    return flows1W;
  }


  @JsonProperty(JSON_PROPERTY_FLOWS1_W)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFlows1W(BigDecimal flows1W) {
    this.flows1W = flows1W;
  }


  public InlineResponse20022Data flows1M(BigDecimal flows1M) {
    this.flows1M = flows1M;
    return this;
  }

   /**
   * One-month fund flows. This data is available for all the regions.
   * @return flows1M
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "One-month fund flows. This data is available for all the regions.")
  @JsonProperty(JSON_PROPERTY_FLOWS1_M)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getFlows1M() {
    return flows1M;
  }


  @JsonProperty(JSON_PROPERTY_FLOWS1_M)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFlows1M(BigDecimal flows1M) {
    this.flows1M = flows1M;
  }


  public InlineResponse20022Data flowsYTD(BigDecimal flowsYTD) {
    this.flowsYTD = flowsYTD;
    return this;
  }

   /**
   * Year-to-date fund flows. This data is available for all the regions.
   * @return flowsYTD
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Year-to-date fund flows. This data is available for all the regions.")
  @JsonProperty(JSON_PROPERTY_FLOWS_Y_T_D)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getFlowsYTD() {
    return flowsYTD;
  }


  @JsonProperty(JSON_PROPERTY_FLOWS_Y_T_D)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFlowsYTD(BigDecimal flowsYTD) {
    this.flowsYTD = flowsYTD;
  }


  public InlineResponse20022Data flows1Y(BigDecimal flows1Y) {
    this.flows1Y = flows1Y;
    return this;
  }

   /**
   * One-year fund flows. This data is available for all the regions.
   * @return flows1Y
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "One-year fund flows. This data is available for all the regions.")
  @JsonProperty(JSON_PROPERTY_FLOWS1_Y)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getFlows1Y() {
    return flows1Y;
  }


  @JsonProperty(JSON_PROPERTY_FLOWS1_Y)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFlows1Y(BigDecimal flows1Y) {
    this.flows1Y = flows1Y;
  }


  /**
   * Return true if this inline_response_200_22_data object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20022Data inlineResponse20022Data = (InlineResponse20022Data) o;
    return Objects.equals(this.flows1D, inlineResponse20022Data.flows1D) &&
        Objects.equals(this.flows1W, inlineResponse20022Data.flows1W) &&
        Objects.equals(this.flows1M, inlineResponse20022Data.flows1M) &&
        Objects.equals(this.flowsYTD, inlineResponse20022Data.flowsYTD) &&
        Objects.equals(this.flows1Y, inlineResponse20022Data.flows1Y);
  }

  @Override
  public int hashCode() {
    return Objects.hash(flows1D, flows1W, flows1M, flowsYTD, flows1Y);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20022Data {\n");
    sb.append("    flows1D: ").append(toIndentedString(flows1D)).append("\n");
    sb.append("    flows1W: ").append(toIndentedString(flows1W)).append("\n");
    sb.append("    flows1M: ").append(toIndentedString(flows1M)).append("\n");
    sb.append("    flowsYTD: ").append(toIndentedString(flowsYTD)).append("\n");
    sb.append("    flows1Y: ").append(toIndentedString(flows1Y)).append("\n");
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

