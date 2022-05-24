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
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20062DataTargetMarketRiskToleranceGermany;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20062DataTargetMarketRiskToleranceInternalRiskRating;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20062DataTargetMarketRiskToleranceSpain;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20062DataTargetMarketRiskToleranceSri;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20062DataTargetMarketRiskToleranceSrri;
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
 * Quantifies the risk associated with the product by assigning a rating using an appropriate risk rating system.
 */
@ApiModel(description = "Quantifies the risk associated with the product by assigning a rating using an appropriate risk rating system.")
@JsonPropertyOrder({
  InlineResponse20062DataTargetMarketRiskTolerance.JSON_PROPERTY_SRI,
  InlineResponse20062DataTargetMarketRiskTolerance.JSON_PROPERTY_SRRI,
  InlineResponse20062DataTargetMarketRiskTolerance.JSON_PROPERTY_INTERNAL_RISK_RATING,
  InlineResponse20062DataTargetMarketRiskTolerance.JSON_PROPERTY_SPAIN,
  InlineResponse20062DataTargetMarketRiskTolerance.JSON_PROPERTY_GERMANY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse20062DataTargetMarketRiskTolerance implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_SRI = "sri";
  private InlineResponse20062DataTargetMarketRiskToleranceSri sri;

  public static final String JSON_PROPERTY_SRRI = "srri";
  private InlineResponse20062DataTargetMarketRiskToleranceSrri srri;

  public static final String JSON_PROPERTY_INTERNAL_RISK_RATING = "internalRiskRating";
  private InlineResponse20062DataTargetMarketRiskToleranceInternalRiskRating internalRiskRating;

  public static final String JSON_PROPERTY_SPAIN = "spain";
  private InlineResponse20062DataTargetMarketRiskToleranceSpain spain;

  public static final String JSON_PROPERTY_GERMANY = "germany";
  private InlineResponse20062DataTargetMarketRiskToleranceGermany germany;

  public InlineResponse20062DataTargetMarketRiskTolerance() { 
  }

  public InlineResponse20062DataTargetMarketRiskTolerance sri(InlineResponse20062DataTargetMarketRiskToleranceSri sri) {
    this.sri = sri;
    return this;
  }

   /**
   * Get sri
   * @return sri
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SRI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse20062DataTargetMarketRiskToleranceSri getSri() {
    return sri;
  }


  @JsonProperty(JSON_PROPERTY_SRI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSri(InlineResponse20062DataTargetMarketRiskToleranceSri sri) {
    this.sri = sri;
  }


  public InlineResponse20062DataTargetMarketRiskTolerance srri(InlineResponse20062DataTargetMarketRiskToleranceSrri srri) {
    this.srri = srri;
    return this;
  }

   /**
   * Get srri
   * @return srri
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SRRI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse20062DataTargetMarketRiskToleranceSrri getSrri() {
    return srri;
  }


  @JsonProperty(JSON_PROPERTY_SRRI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSrri(InlineResponse20062DataTargetMarketRiskToleranceSrri srri) {
    this.srri = srri;
  }


  public InlineResponse20062DataTargetMarketRiskTolerance internalRiskRating(InlineResponse20062DataTargetMarketRiskToleranceInternalRiskRating internalRiskRating) {
    this.internalRiskRating = internalRiskRating;
    return this;
  }

   /**
   * Get internalRiskRating
   * @return internalRiskRating
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INTERNAL_RISK_RATING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse20062DataTargetMarketRiskToleranceInternalRiskRating getInternalRiskRating() {
    return internalRiskRating;
  }


  @JsonProperty(JSON_PROPERTY_INTERNAL_RISK_RATING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInternalRiskRating(InlineResponse20062DataTargetMarketRiskToleranceInternalRiskRating internalRiskRating) {
    this.internalRiskRating = internalRiskRating;
  }


  public InlineResponse20062DataTargetMarketRiskTolerance spain(InlineResponse20062DataTargetMarketRiskToleranceSpain spain) {
    this.spain = spain;
    return this;
  }

   /**
   * Get spain
   * @return spain
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SPAIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse20062DataTargetMarketRiskToleranceSpain getSpain() {
    return spain;
  }


  @JsonProperty(JSON_PROPERTY_SPAIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSpain(InlineResponse20062DataTargetMarketRiskToleranceSpain spain) {
    this.spain = spain;
  }


  public InlineResponse20062DataTargetMarketRiskTolerance germany(InlineResponse20062DataTargetMarketRiskToleranceGermany germany) {
    this.germany = germany;
    return this;
  }

   /**
   * Get germany
   * @return germany
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_GERMANY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse20062DataTargetMarketRiskToleranceGermany getGermany() {
    return germany;
  }


  @JsonProperty(JSON_PROPERTY_GERMANY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGermany(InlineResponse20062DataTargetMarketRiskToleranceGermany germany) {
    this.germany = germany;
  }


  /**
   * Return true if this inline_response_200_62_data_targetMarket_riskTolerance object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20062DataTargetMarketRiskTolerance inlineResponse20062DataTargetMarketRiskTolerance = (InlineResponse20062DataTargetMarketRiskTolerance) o;
    return Objects.equals(this.sri, inlineResponse20062DataTargetMarketRiskTolerance.sri) &&
        Objects.equals(this.srri, inlineResponse20062DataTargetMarketRiskTolerance.srri) &&
        Objects.equals(this.internalRiskRating, inlineResponse20062DataTargetMarketRiskTolerance.internalRiskRating) &&
        Objects.equals(this.spain, inlineResponse20062DataTargetMarketRiskTolerance.spain) &&
        Objects.equals(this.germany, inlineResponse20062DataTargetMarketRiskTolerance.germany);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sri, srri, internalRiskRating, spain, germany);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20062DataTargetMarketRiskTolerance {\n");
    sb.append("    sri: ").append(toIndentedString(sri)).append("\n");
    sb.append("    srri: ").append(toIndentedString(srri)).append("\n");
    sb.append("    internalRiskRating: ").append(toIndentedString(internalRiskRating)).append("\n");
    sb.append("    spain: ").append(toIndentedString(spain)).append("\n");
    sb.append("    germany: ").append(toIndentedString(germany)).append("\n");
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

