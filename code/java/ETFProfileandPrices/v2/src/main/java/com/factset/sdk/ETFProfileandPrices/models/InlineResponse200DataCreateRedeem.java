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
 * Create or redeem
 */
@ApiModel(description = "Create or redeem")
@JsonPropertyOrder({
  InlineResponse200DataCreateRedeem.JSON_PROPERTY_UNIT_COST,
  InlineResponse200DataCreateRedeem.JSON_PROPERTY_UNIT_SIZE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse200DataCreateRedeem implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_UNIT_COST = "unitCost";
  private BigDecimal unitCost;

  public static final String JSON_PROPERTY_UNIT_SIZE = "unitSize";
  private BigDecimal unitSize;

  public InlineResponse200DataCreateRedeem() { 
  }

  public InlineResponse200DataCreateRedeem unitCost(BigDecimal unitCost) {
    this.unitCost = unitCost;
    return this;
  }

   /**
   * The standard fee in the ETP currency to create or redeem one unit of an ETP. This data is available for the US regions..
   * @return unitCost
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The standard fee in the ETP currency to create or redeem one unit of an ETP. This data is available for the US regions..")
  @JsonProperty(JSON_PROPERTY_UNIT_COST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getUnitCost() {
    return unitCost;
  }


  @JsonProperty(JSON_PROPERTY_UNIT_COST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUnitCost(BigDecimal unitCost) {
    this.unitCost = unitCost;
  }


  public InlineResponse200DataCreateRedeem unitSize(BigDecimal unitSize) {
    this.unitSize = unitSize;
    return this;
  }

   /**
   * The minimum ETP share block at which issuers are willing to perform creations or redemptions per prospectus or other filing documents. This data is available for the US regions.
   * @return unitSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The minimum ETP share block at which issuers are willing to perform creations or redemptions per prospectus or other filing documents. This data is available for the US regions.")
  @JsonProperty(JSON_PROPERTY_UNIT_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getUnitSize() {
    return unitSize;
  }


  @JsonProperty(JSON_PROPERTY_UNIT_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUnitSize(BigDecimal unitSize) {
    this.unitSize = unitSize;
  }


  /**
   * Return true if this inline_response_200_data_createRedeem object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200DataCreateRedeem inlineResponse200DataCreateRedeem = (InlineResponse200DataCreateRedeem) o;
    return Objects.equals(this.unitCost, inlineResponse200DataCreateRedeem.unitCost) &&
        Objects.equals(this.unitSize, inlineResponse200DataCreateRedeem.unitSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(unitCost, unitSize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200DataCreateRedeem {\n");
    sb.append("    unitCost: ").append(toIndentedString(unitCost)).append("\n");
    sb.append("    unitSize: ").append(toIndentedString(unitSize)).append("\n");
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

