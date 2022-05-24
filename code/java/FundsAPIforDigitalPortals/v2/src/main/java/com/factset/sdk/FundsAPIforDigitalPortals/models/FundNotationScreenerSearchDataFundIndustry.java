/*
 * Funds API For Digital Portals
 * Search for mutual funds and ETFs using one single consolidated API, including a criteria-based screener. The API provides also base data, key figures, and holdings.  A separate endpoint returns the possible values and value range for the parameters that the endpoint /fund/notation/screener/search accepts: Application developers can request the values and value range only for a restricted set of notations that match predefined parameters. This functionality may be used to pre-fill the values and value ranges of the parameters of the /fund/notation/screener/search endpoint so that performing a search always leads to a non-empty set of notations.  This API is fully integrated with the corresponding Quotes API, allowing access to detailed price and performance information of instruments, as well as basic security identifier cross-reference. For direct access to price histories, please refer to the Time Series API for Digital Portals.  Similar criteria based screener APIs exist for equity instruments and securitized derivatives: See the Stocks API and the Securitized Derivatives API for details.
 *
 * The version of the OpenAPI document: 2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.FundsAPIforDigitalPortals.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.FundsAPIforDigitalPortals.models.FundNotationScreenerSearchDataFundHoldingTypeExclude;
import com.factset.sdk.FundsAPIforDigitalPortals.models.FundNotationScreenerSearchDataFundHoldingTypeRestrict;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.FundsAPIforDigitalPortals.JSON;


/**
 * Industry classification represented by categories from any level of the category system \&quot;Funds classification defined by FactSet Digital Solutions\&quot;. See endpoint &#x60;/category/listBySystem&#x60; with &#x60;id&#x3D;27&#x60; for valid values.
 */
@ApiModel(description = "Industry classification represented by categories from any level of the category system \"Funds classification defined by FactSet Digital Solutions\". See endpoint `/category/listBySystem` with `id=27` for valid values.")
@JsonPropertyOrder({
  FundNotationScreenerSearchDataFundIndustry.JSON_PROPERTY_RESTRICT,
  FundNotationScreenerSearchDataFundIndustry.JSON_PROPERTY_EXCLUDE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FundNotationScreenerSearchDataFundIndustry implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_RESTRICT = "restrict";
  private FundNotationScreenerSearchDataFundHoldingTypeRestrict restrict;

  public static final String JSON_PROPERTY_EXCLUDE = "exclude";
  private FundNotationScreenerSearchDataFundHoldingTypeExclude exclude;

  public FundNotationScreenerSearchDataFundIndustry() { 
  }

  public FundNotationScreenerSearchDataFundIndustry restrict(FundNotationScreenerSearchDataFundHoldingTypeRestrict restrict) {
    this.restrict = restrict;
    return this;
  }

   /**
   * Get restrict
   * @return restrict
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RESTRICT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FundNotationScreenerSearchDataFundHoldingTypeRestrict getRestrict() {
    return restrict;
  }


  @JsonProperty(JSON_PROPERTY_RESTRICT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRestrict(FundNotationScreenerSearchDataFundHoldingTypeRestrict restrict) {
    this.restrict = restrict;
  }


  public FundNotationScreenerSearchDataFundIndustry exclude(FundNotationScreenerSearchDataFundHoldingTypeExclude exclude) {
    this.exclude = exclude;
    return this;
  }

   /**
   * Get exclude
   * @return exclude
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EXCLUDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FundNotationScreenerSearchDataFundHoldingTypeExclude getExclude() {
    return exclude;
  }


  @JsonProperty(JSON_PROPERTY_EXCLUDE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExclude(FundNotationScreenerSearchDataFundHoldingTypeExclude exclude) {
    this.exclude = exclude;
  }


  /**
   * Return true if this _fund_notation_screener_search_data_fund_industry object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FundNotationScreenerSearchDataFundIndustry fundNotationScreenerSearchDataFundIndustry = (FundNotationScreenerSearchDataFundIndustry) o;
    return Objects.equals(this.restrict, fundNotationScreenerSearchDataFundIndustry.restrict) &&
        Objects.equals(this.exclude, fundNotationScreenerSearchDataFundIndustry.exclude);
  }

  @Override
  public int hashCode() {
    return Objects.hash(restrict, exclude);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FundNotationScreenerSearchDataFundIndustry {\n");
    sb.append("    restrict: ").append(toIndentedString(restrict)).append("\n");
    sb.append("    exclude: ").append(toIndentedString(exclude)).append("\n");
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

