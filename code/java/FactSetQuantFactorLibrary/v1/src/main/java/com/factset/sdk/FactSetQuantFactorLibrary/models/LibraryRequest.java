/*
 * FactSet Quant Factor Library API
 * The FactSet FactSet Quant Factor Library (QFL) API helps to detect investment themes across global equity markets, incorporate ideas into your portfolio construction process, and transform raw data into actionable intelligence. Over 2000+ items spanning Factor Groups in-   * Classification and Reference Data - Asset Data, Country, Industry, and Size   * Market - Liquidity, Market Sensitivity, Momentum, Technical, Volatility   * Core Fundamentals - Efficiency, Growth, Management, Profitability, Quality, Solvency, Value   * Macro and Cross Asset - Commodity, FX Sensitivity, Debt, Economic   * Alternative - Analyst Sentiment, Corporate Governance, Crowding, Insider Activity. 
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.FactSetQuantFactorLibrary.models;

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
import com.factset.sdk.FactSetQuantFactorLibrary.JSON;


/**
 * Request object for requesting factors.
 */
@ApiModel(description = "Request object for requesting factors.")
@JsonPropertyOrder({
  LibraryRequest.JSON_PROPERTY_FACTORS,
  LibraryRequest.JSON_PROPERTY_FACTOR_GROUPS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class LibraryRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_FACTORS = "factors";
  private java.util.List<String> factors = null;

  public static final String JSON_PROPERTY_FACTOR_GROUPS = "factorGroups";
  private java.util.List<String> factorGroups = null;


  public LibraryRequest factors(java.util.List<String> factors) {
    this.factors = factors;
    return this;
  }

  public LibraryRequest addFactorsItem(String factorsItem) {
    if (this.factors == null) {
      this.factors = new java.util.ArrayList<>();
    }
    this.factors.add(factorsItem);
    return this;
  }

   /**
   * List of Factors. 
   * @return factors
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"rsi21D\",\"ulcer252D\"]", value = "List of Factors. ")
  @JsonProperty(JSON_PROPERTY_FACTORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<String> getFactors() {
    return factors;
  }


  @JsonProperty(JSON_PROPERTY_FACTORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFactors(java.util.List<String> factors) {
    this.factors = factors;
  }


  public LibraryRequest factorGroups(java.util.List<String> factorGroups) {
    this.factorGroups = factorGroups;
    return this;
  }

  public LibraryRequest addFactorGroupsItem(String factorGroupsItem) {
    if (this.factorGroups == null) {
      this.factorGroups = new java.util.ArrayList<>();
    }
    this.factorGroups.add(factorGroupsItem);
    return this;
  }

   /**
   * List of Factor Groupings to return all factors within the group. 
   * @return factorGroups
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"Momentum\",\"Technical\"]", value = "List of Factor Groupings to return all factors within the group. ")
  @JsonProperty(JSON_PROPERTY_FACTOR_GROUPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<String> getFactorGroups() {
    return factorGroups;
  }


  @JsonProperty(JSON_PROPERTY_FACTOR_GROUPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFactorGroups(java.util.List<String> factorGroups) {
    this.factorGroups = factorGroups;
  }


  /**
   * Return true if this libraryRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LibraryRequest libraryRequest = (LibraryRequest) o;
    return Objects.equals(this.factors, libraryRequest.factors) &&
        Objects.equals(this.factorGroups, libraryRequest.factorGroups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(factors, factorGroups);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LibraryRequest {\n");
    sb.append("    factors: ").append(toIndentedString(factors)).append("\n");
    sb.append("    factorGroups: ").append(toIndentedString(factorGroups)).append("\n");
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

