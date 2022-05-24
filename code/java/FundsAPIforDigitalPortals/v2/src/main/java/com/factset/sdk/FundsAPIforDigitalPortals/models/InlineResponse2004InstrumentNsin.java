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
 * NSIN data of the instrument.
 */
@ApiModel(description = "NSIN data of the instrument.")
@JsonPropertyOrder({
  InlineResponse2004InstrumentNsin.JSON_PROPERTY_WKN,
  InlineResponse2004InstrumentNsin.JSON_PROPERTY_VALOR,
  InlineResponse2004InstrumentNsin.JSON_PROPERTY_CUSIP
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse2004InstrumentNsin implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_WKN = "wkn";
  private String wkn;

  public static final String JSON_PROPERTY_VALOR = "valor";
  private String valor;

  public static final String JSON_PROPERTY_CUSIP = "cusip";
  private String cusip;

  public InlineResponse2004InstrumentNsin() { 
  }

  public InlineResponse2004InstrumentNsin wkn(String wkn) {
    this.wkn = wkn;
    return this;
  }

   /**
   * The WKN (Wertpapierkennnummer, German for Securities Identification Number) of the instrument. The WKN is a 6-character code of digits and upper-case letters that uniquely identifies an instrument.
   * @return wkn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The WKN (Wertpapierkennnummer, German for Securities Identification Number) of the instrument. The WKN is a 6-character code of digits and upper-case letters that uniquely identifies an instrument.")
  @JsonProperty(JSON_PROPERTY_WKN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getWkn() {
    return wkn;
  }


  @JsonProperty(JSON_PROPERTY_WKN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWkn(String wkn) {
    this.wkn = wkn;
  }


  public InlineResponse2004InstrumentNsin valor(String valor) {
    this.valor = valor;
    return this;
  }

   /**
   * The Valor number (German: Valorennummer) of the instrument. The Valor number is an integer number that uniquely identifies an instrument.
   * @return valor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Valor number (German: Valorennummer) of the instrument. The Valor number is an integer number that uniquely identifies an instrument.")
  @JsonProperty(JSON_PROPERTY_VALOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getValor() {
    return valor;
  }


  @JsonProperty(JSON_PROPERTY_VALOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValor(String valor) {
    this.valor = valor;
  }


  public InlineResponse2004InstrumentNsin cusip(String cusip) {
    this.cusip = cusip;
    return this;
  }

   /**
   * The CUSIP (Committee on Uniform Security Identification Procedures) or CINS (CUSIP International Numbering System) identifier of the instrument. These numbers are 9-character codes of digits and upper-case letters that uniquely identify an instrument.
   * @return cusip
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The CUSIP (Committee on Uniform Security Identification Procedures) or CINS (CUSIP International Numbering System) identifier of the instrument. These numbers are 9-character codes of digits and upper-case letters that uniquely identify an instrument.")
  @JsonProperty(JSON_PROPERTY_CUSIP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCusip() {
    return cusip;
  }


  @JsonProperty(JSON_PROPERTY_CUSIP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCusip(String cusip) {
    this.cusip = cusip;
  }


  /**
   * Return true if this inline_response_200_4_instrument_nsin object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2004InstrumentNsin inlineResponse2004InstrumentNsin = (InlineResponse2004InstrumentNsin) o;
    return Objects.equals(this.wkn, inlineResponse2004InstrumentNsin.wkn) &&
        Objects.equals(this.valor, inlineResponse2004InstrumentNsin.valor) &&
        Objects.equals(this.cusip, inlineResponse2004InstrumentNsin.cusip);
  }

  @Override
  public int hashCode() {
    return Objects.hash(wkn, valor, cusip);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2004InstrumentNsin {\n");
    sb.append("    wkn: ").append(toIndentedString(wkn)).append("\n");
    sb.append("    valor: ").append(toIndentedString(valor)).append("\n");
    sb.append("    cusip: ").append(toIndentedString(cusip)).append("\n");
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

