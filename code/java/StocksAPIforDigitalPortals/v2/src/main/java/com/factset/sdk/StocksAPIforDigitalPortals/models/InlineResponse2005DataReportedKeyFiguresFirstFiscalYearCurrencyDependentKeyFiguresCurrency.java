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


package com.factset.sdk.StocksAPIforDigitalPortals.models;

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
import com.factset.sdk.StocksAPIforDigitalPortals.JSON;


/**
 * Currency of the value ranges of the currency-dependent key figures. See endpoint &#x60;/basic/valueUnit/currency/main/list&#x60; for possible values.
 */
@ApiModel(description = "Currency of the value ranges of the currency-dependent key figures. See endpoint `/basic/valueUnit/currency/main/list` for possible values.")
@JsonPropertyOrder({
  InlineResponse2005DataReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFiguresCurrency.JSON_PROPERTY_ID,
  InlineResponse2005DataReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFiguresCurrency.JSON_PROPERTY_ISO_CODE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse2005DataReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFiguresCurrency implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ID = "id";
  private BigDecimal id;

  public static final String JSON_PROPERTY_ISO_CODE = "isoCode";
  private String isoCode;


  public InlineResponse2005DataReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFiguresCurrency id(BigDecimal id) {
    this.id = id;
    return this;
  }

   /**
   * Identifier of the currency.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Identifier of the currency.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(BigDecimal id) {
    this.id = id;
  }


  public InlineResponse2005DataReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFiguresCurrency isoCode(String isoCode) {
    this.isoCode = isoCode;
    return this;
  }

   /**
   * ISO 4217 code of the currency.
   * @return isoCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ISO 4217 code of the currency.")
  @JsonProperty(JSON_PROPERTY_ISO_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIsoCode() {
    return isoCode;
  }


  @JsonProperty(JSON_PROPERTY_ISO_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsoCode(String isoCode) {
    this.isoCode = isoCode;
  }


  /**
   * Return true if this inline_response_200_5_data_reportedKeyFigures_firstFiscalYear_currencyDependentKeyFigures_currency object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2005DataReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFiguresCurrency inlineResponse2005DataReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFiguresCurrency = (InlineResponse2005DataReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFiguresCurrency) o;
    return Objects.equals(this.id, inlineResponse2005DataReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFiguresCurrency.id) &&
        Objects.equals(this.isoCode, inlineResponse2005DataReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFiguresCurrency.isoCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, isoCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2005DataReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFiguresCurrency {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isoCode: ").append(toIndentedString(isoCode)).append("\n");
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

