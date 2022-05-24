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


package com.factset.sdk.BondsAPIforDigitalPortals.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.BondsAPIforDigitalPortals.models.DebtInstrumentNotationScreenerSearchDataIssuerCountry;
import com.factset.sdk.BondsAPIforDigitalPortals.models.DebtInstrumentNotationScreenerSearchDataIssuerSelection;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.BondsAPIforDigitalPortals.JSON;


/**
 * Parameters related to the issuer.
 */
@ApiModel(description = "Parameters related to the issuer.")
@JsonPropertyOrder({
  DebtInstrumentNotationScreenerSearchDataIssuer.JSON_PROPERTY_SELECTION,
  DebtInstrumentNotationScreenerSearchDataIssuer.JSON_PROPERTY_COUNTRY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DebtInstrumentNotationScreenerSearchDataIssuer implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_SELECTION = "selection";
  private DebtInstrumentNotationScreenerSearchDataIssuerSelection selection;

  public static final String JSON_PROPERTY_COUNTRY = "country";
  private DebtInstrumentNotationScreenerSearchDataIssuerCountry country;

  public DebtInstrumentNotationScreenerSearchDataIssuer() { 
  }

  public DebtInstrumentNotationScreenerSearchDataIssuer selection(DebtInstrumentNotationScreenerSearchDataIssuerSelection selection) {
    this.selection = selection;
    return this;
  }

   /**
   * Get selection
   * @return selection
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SELECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DebtInstrumentNotationScreenerSearchDataIssuerSelection getSelection() {
    return selection;
  }


  @JsonProperty(JSON_PROPERTY_SELECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSelection(DebtInstrumentNotationScreenerSearchDataIssuerSelection selection) {
    this.selection = selection;
  }


  public DebtInstrumentNotationScreenerSearchDataIssuer country(DebtInstrumentNotationScreenerSearchDataIssuerCountry country) {
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DebtInstrumentNotationScreenerSearchDataIssuerCountry getCountry() {
    return country;
  }


  @JsonProperty(JSON_PROPERTY_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCountry(DebtInstrumentNotationScreenerSearchDataIssuerCountry country) {
    this.country = country;
  }


  /**
   * Return true if this _debtInstrument_notation_screener_search_data_issuer object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DebtInstrumentNotationScreenerSearchDataIssuer debtInstrumentNotationScreenerSearchDataIssuer = (DebtInstrumentNotationScreenerSearchDataIssuer) o;
    return Objects.equals(this.selection, debtInstrumentNotationScreenerSearchDataIssuer.selection) &&
        Objects.equals(this.country, debtInstrumentNotationScreenerSearchDataIssuer.country);
  }

  @Override
  public int hashCode() {
    return Objects.hash(selection, country);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DebtInstrumentNotationScreenerSearchDataIssuer {\n");
    sb.append("    selection: ").append(toIndentedString(selection)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
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

