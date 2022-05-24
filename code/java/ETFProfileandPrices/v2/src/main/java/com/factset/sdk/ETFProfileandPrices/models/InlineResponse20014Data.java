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
import com.factset.sdk.ETFProfileandPrices.models.InlineResponse20014DataCounterParty;
import com.factset.sdk.ETFProfileandPrices.models.InlineResponse20014DataGearing;
import com.factset.sdk.ETFProfileandPrices.models.InlineResponse20014DataHedge;
import com.factset.sdk.ETFProfileandPrices.models.InlineResponse20014DataServiceProvider;
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
 * Characteristics.
 */
@ApiModel(description = "Characteristics.")
@JsonPropertyOrder({
  InlineResponse20014Data.JSON_PROPERTY_GEARING,
  InlineResponse20014Data.JSON_PROPERTY_HEDGE,
  InlineResponse20014Data.JSON_PROPERTY_COUNTER_PARTY,
  InlineResponse20014Data.JSON_PROPERTY_SERVICE_PROVIDER
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse20014Data implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_GEARING = "gearing";
  private InlineResponse20014DataGearing gearing;

  public static final String JSON_PROPERTY_HEDGE = "hedge";
  private InlineResponse20014DataHedge hedge;

  public static final String JSON_PROPERTY_COUNTER_PARTY = "counterParty";
  private InlineResponse20014DataCounterParty counterParty;

  public static final String JSON_PROPERTY_SERVICE_PROVIDER = "serviceProvider";
  private InlineResponse20014DataServiceProvider serviceProvider;

  public InlineResponse20014Data() { 
  }

  public InlineResponse20014Data gearing(InlineResponse20014DataGearing gearing) {
    this.gearing = gearing;
    return this;
  }

   /**
   * Get gearing
   * @return gearing
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_GEARING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse20014DataGearing getGearing() {
    return gearing;
  }


  @JsonProperty(JSON_PROPERTY_GEARING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGearing(InlineResponse20014DataGearing gearing) {
    this.gearing = gearing;
  }


  public InlineResponse20014Data hedge(InlineResponse20014DataHedge hedge) {
    this.hedge = hedge;
    return this;
  }

   /**
   * Get hedge
   * @return hedge
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_HEDGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse20014DataHedge getHedge() {
    return hedge;
  }


  @JsonProperty(JSON_PROPERTY_HEDGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHedge(InlineResponse20014DataHedge hedge) {
    this.hedge = hedge;
  }


  public InlineResponse20014Data counterParty(InlineResponse20014DataCounterParty counterParty) {
    this.counterParty = counterParty;
    return this;
  }

   /**
   * Get counterParty
   * @return counterParty
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_COUNTER_PARTY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse20014DataCounterParty getCounterParty() {
    return counterParty;
  }


  @JsonProperty(JSON_PROPERTY_COUNTER_PARTY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCounterParty(InlineResponse20014DataCounterParty counterParty) {
    this.counterParty = counterParty;
  }


  public InlineResponse20014Data serviceProvider(InlineResponse20014DataServiceProvider serviceProvider) {
    this.serviceProvider = serviceProvider;
    return this;
  }

   /**
   * Get serviceProvider
   * @return serviceProvider
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SERVICE_PROVIDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse20014DataServiceProvider getServiceProvider() {
    return serviceProvider;
  }


  @JsonProperty(JSON_PROPERTY_SERVICE_PROVIDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setServiceProvider(InlineResponse20014DataServiceProvider serviceProvider) {
    this.serviceProvider = serviceProvider;
  }


  /**
   * Return true if this inline_response_200_14_data object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20014Data inlineResponse20014Data = (InlineResponse20014Data) o;
    return Objects.equals(this.gearing, inlineResponse20014Data.gearing) &&
        Objects.equals(this.hedge, inlineResponse20014Data.hedge) &&
        Objects.equals(this.counterParty, inlineResponse20014Data.counterParty) &&
        Objects.equals(this.serviceProvider, inlineResponse20014Data.serviceProvider);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gearing, hedge, counterParty, serviceProvider);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20014Data {\n");
    sb.append("    gearing: ").append(toIndentedString(gearing)).append("\n");
    sb.append("    hedge: ").append(toIndentedString(hedge)).append("\n");
    sb.append("    counterParty: ").append(toIndentedString(counterParty)).append("\n");
    sb.append("    serviceProvider: ").append(toIndentedString(serviceProvider)).append("\n");
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

