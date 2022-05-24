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
import com.factset.sdk.FundsAPIforDigitalPortals.models.InlineResponse2004ShareClassRegistrationCountry;
import com.factset.sdk.FundsAPIforDigitalPortals.models.InlineResponse2006DataPropertiesShareClassMinimumInvestment;
import com.factset.sdk.FundsAPIforDigitalPortals.models.InlineResponse2006DataPropertiesShareClassSavingsPlan;
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
 * Share class properties.
 */
@ApiModel(description = "Share class properties.")
@JsonPropertyOrder({
  InlineResponse2006DataPropertiesShareClass.JSON_PROPERTY_IS_MASTER,
  InlineResponse2006DataPropertiesShareClass.JSON_PROPERTY_COUNTRY_REGISTRATION,
  InlineResponse2006DataPropertiesShareClass.JSON_PROPERTY_MINIMUM_INVESTMENT,
  InlineResponse2006DataPropertiesShareClass.JSON_PROPERTY_SAVINGS_PLAN
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse2006DataPropertiesShareClass implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_IS_MASTER = "isMaster";
  private Boolean isMaster;

  public static final String JSON_PROPERTY_COUNTRY_REGISTRATION = "countryRegistration";
  private java.util.List<InlineResponse2004ShareClassRegistrationCountry> countryRegistration = null;

  public static final String JSON_PROPERTY_MINIMUM_INVESTMENT = "minimumInvestment";
  private InlineResponse2006DataPropertiesShareClassMinimumInvestment minimumInvestment;

  public static final String JSON_PROPERTY_SAVINGS_PLAN = "savingsPlan";
  private java.util.List<InlineResponse2006DataPropertiesShareClassSavingsPlan> savingsPlan = null;

  public InlineResponse2006DataPropertiesShareClass() { 
  }

  public InlineResponse2006DataPropertiesShareClass isMaster(Boolean isMaster) {
    this.isMaster = isMaster;
    return this;
  }

   /**
   * If true, the share class is the master share class of the fund. That is, the one that has been created first.
   * @return isMaster
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If true, the share class is the master share class of the fund. That is, the one that has been created first.")
  @JsonProperty(JSON_PROPERTY_IS_MASTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsMaster() {
    return isMaster;
  }


  @JsonProperty(JSON_PROPERTY_IS_MASTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsMaster(Boolean isMaster) {
    this.isMaster = isMaster;
  }


  public InlineResponse2006DataPropertiesShareClass countryRegistration(java.util.List<InlineResponse2004ShareClassRegistrationCountry> countryRegistration) {
    this.countryRegistration = countryRegistration;
    return this;
  }

  public InlineResponse2006DataPropertiesShareClass addCountryRegistrationItem(InlineResponse2004ShareClassRegistrationCountry countryRegistrationItem) {
    if (this.countryRegistration == null) {
      this.countryRegistration = new java.util.ArrayList<>();
    }
    this.countryRegistration.add(countryRegistrationItem);
    return this;
  }

   /**
   * List of countries where the share class is registered for trading on a regulated market.
   * @return countryRegistration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of countries where the share class is registered for trading on a regulated market.")
  @JsonProperty(JSON_PROPERTY_COUNTRY_REGISTRATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<InlineResponse2004ShareClassRegistrationCountry> getCountryRegistration() {
    return countryRegistration;
  }


  @JsonProperty(JSON_PROPERTY_COUNTRY_REGISTRATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCountryRegistration(java.util.List<InlineResponse2004ShareClassRegistrationCountry> countryRegistration) {
    this.countryRegistration = countryRegistration;
  }


  public InlineResponse2006DataPropertiesShareClass minimumInvestment(InlineResponse2006DataPropertiesShareClassMinimumInvestment minimumInvestment) {
    this.minimumInvestment = minimumInvestment;
    return this;
  }

   /**
   * Get minimumInvestment
   * @return minimumInvestment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MINIMUM_INVESTMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2006DataPropertiesShareClassMinimumInvestment getMinimumInvestment() {
    return minimumInvestment;
  }


  @JsonProperty(JSON_PROPERTY_MINIMUM_INVESTMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMinimumInvestment(InlineResponse2006DataPropertiesShareClassMinimumInvestment minimumInvestment) {
    this.minimumInvestment = minimumInvestment;
  }


  public InlineResponse2006DataPropertiesShareClass savingsPlan(java.util.List<InlineResponse2006DataPropertiesShareClassSavingsPlan> savingsPlan) {
    this.savingsPlan = savingsPlan;
    return this;
  }

  public InlineResponse2006DataPropertiesShareClass addSavingsPlanItem(InlineResponse2006DataPropertiesShareClassSavingsPlan savingsPlanItem) {
    if (this.savingsPlan == null) {
      this.savingsPlan = new java.util.ArrayList<>();
    }
    this.savingsPlan.add(savingsPlanItem);
    return this;
  }

   /**
   * Savings plan availability and frequency per country.
   * @return savingsPlan
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Savings plan availability and frequency per country.")
  @JsonProperty(JSON_PROPERTY_SAVINGS_PLAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<InlineResponse2006DataPropertiesShareClassSavingsPlan> getSavingsPlan() {
    return savingsPlan;
  }


  @JsonProperty(JSON_PROPERTY_SAVINGS_PLAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSavingsPlan(java.util.List<InlineResponse2006DataPropertiesShareClassSavingsPlan> savingsPlan) {
    this.savingsPlan = savingsPlan;
  }


  /**
   * Return true if this inline_response_200_6_data_properties_shareClass object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2006DataPropertiesShareClass inlineResponse2006DataPropertiesShareClass = (InlineResponse2006DataPropertiesShareClass) o;
    return Objects.equals(this.isMaster, inlineResponse2006DataPropertiesShareClass.isMaster) &&
        Objects.equals(this.countryRegistration, inlineResponse2006DataPropertiesShareClass.countryRegistration) &&
        Objects.equals(this.minimumInvestment, inlineResponse2006DataPropertiesShareClass.minimumInvestment) &&
        Objects.equals(this.savingsPlan, inlineResponse2006DataPropertiesShareClass.savingsPlan);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isMaster, countryRegistration, minimumInvestment, savingsPlan);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2006DataPropertiesShareClass {\n");
    sb.append("    isMaster: ").append(toIndentedString(isMaster)).append("\n");
    sb.append("    countryRegistration: ").append(toIndentedString(countryRegistration)).append("\n");
    sb.append("    minimumInvestment: ").append(toIndentedString(minimumInvestment)).append("\n");
    sb.append("    savingsPlan: ").append(toIndentedString(savingsPlan)).append("\n");
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

