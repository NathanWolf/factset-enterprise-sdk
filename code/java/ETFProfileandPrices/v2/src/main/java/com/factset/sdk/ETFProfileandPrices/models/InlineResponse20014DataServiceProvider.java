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
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.ETFProfileandPrices.JSON;


/**
 * Service Provider.
 */
@ApiModel(description = "Service Provider.")
@JsonPropertyOrder({
  InlineResponse20014DataServiceProvider.JSON_PROPERTY_PRIMARY_ADVISOR,
  InlineResponse20014DataServiceProvider.JSON_PROPERTY_SUB_ADVISOR,
  InlineResponse20014DataServiceProvider.JSON_PROPERTY_DISTRIBUTOR,
  InlineResponse20014DataServiceProvider.JSON_PROPERTY_IS_ISSUER_AFFILIATE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse20014DataServiceProvider implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_PRIMARY_ADVISOR = "primaryAdvisor";
  private String primaryAdvisor;

  public static final String JSON_PROPERTY_SUB_ADVISOR = "subAdvisor";
  private String subAdvisor;

  public static final String JSON_PROPERTY_DISTRIBUTOR = "distributor";
  private String distributor;

  public static final String JSON_PROPERTY_IS_ISSUER_AFFILIATE = "isIssuerAffiliate";
  private Boolean isIssuerAffiliate;

  public InlineResponse20014DataServiceProvider() { 
  }

  public InlineResponse20014DataServiceProvider primaryAdvisor(String primaryAdvisor) {
    this.primaryAdvisor = primaryAdvisor;
    return this;
  }

   /**
   * The name of the primary advisor of the ETP. This data is available for the US and Canada regions.
   * @return primaryAdvisor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the primary advisor of the ETP. This data is available for the US and Canada regions.")
  @JsonProperty(JSON_PROPERTY_PRIMARY_ADVISOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPrimaryAdvisor() {
    return primaryAdvisor;
  }


  @JsonProperty(JSON_PROPERTY_PRIMARY_ADVISOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrimaryAdvisor(String primaryAdvisor) {
    this.primaryAdvisor = primaryAdvisor;
  }


  public InlineResponse20014DataServiceProvider subAdvisor(String subAdvisor) {
    this.subAdvisor = subAdvisor;
    return this;
  }

   /**
   * The name of the sub-advisor of the ETP. This data is available for the US and Canada regions.
   * @return subAdvisor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the sub-advisor of the ETP. This data is available for the US and Canada regions.")
  @JsonProperty(JSON_PROPERTY_SUB_ADVISOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSubAdvisor() {
    return subAdvisor;
  }


  @JsonProperty(JSON_PROPERTY_SUB_ADVISOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubAdvisor(String subAdvisor) {
    this.subAdvisor = subAdvisor;
  }


  public InlineResponse20014DataServiceProvider distributor(String distributor) {
    this.distributor = distributor;
    return this;
  }

   /**
   * The name of the distributor of the ETP. This data is available for the US region.
   * @return distributor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the distributor of the ETP. This data is available for the US region.")
  @JsonProperty(JSON_PROPERTY_DISTRIBUTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDistributor() {
    return distributor;
  }


  @JsonProperty(JSON_PROPERTY_DISTRIBUTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDistributor(String distributor) {
    this.distributor = distributor;
  }


  public InlineResponse20014DataServiceProvider isIssuerAffiliate(Boolean isIssuerAffiliate) {
    this.isIssuerAffiliate = isIssuerAffiliate;
    return this;
  }

   /**
   * Describes whether the swap counterparty is affiliated with the issuer. This data is available for the Europe regions.
   * @return isIssuerAffiliate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Describes whether the swap counterparty is affiliated with the issuer. This data is available for the Europe regions.")
  @JsonProperty(JSON_PROPERTY_IS_ISSUER_AFFILIATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsIssuerAffiliate() {
    return isIssuerAffiliate;
  }


  @JsonProperty(JSON_PROPERTY_IS_ISSUER_AFFILIATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsIssuerAffiliate(Boolean isIssuerAffiliate) {
    this.isIssuerAffiliate = isIssuerAffiliate;
  }


  /**
   * Return true if this inline_response_200_14_data_serviceProvider object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20014DataServiceProvider inlineResponse20014DataServiceProvider = (InlineResponse20014DataServiceProvider) o;
    return Objects.equals(this.primaryAdvisor, inlineResponse20014DataServiceProvider.primaryAdvisor) &&
        Objects.equals(this.subAdvisor, inlineResponse20014DataServiceProvider.subAdvisor) &&
        Objects.equals(this.distributor, inlineResponse20014DataServiceProvider.distributor) &&
        Objects.equals(this.isIssuerAffiliate, inlineResponse20014DataServiceProvider.isIssuerAffiliate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(primaryAdvisor, subAdvisor, distributor, isIssuerAffiliate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20014DataServiceProvider {\n");
    sb.append("    primaryAdvisor: ").append(toIndentedString(primaryAdvisor)).append("\n");
    sb.append("    subAdvisor: ").append(toIndentedString(subAdvisor)).append("\n");
    sb.append("    distributor: ").append(toIndentedString(distributor)).append("\n");
    sb.append("    isIssuerAffiliate: ").append(toIndentedString(isIssuerAffiliate)).append("\n");
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

