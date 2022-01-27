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
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.StocksAPIforDigitalPortals.JSON;


/**
 * Currency in which the currency-dependent estimates are expressed.
 */
@ApiModel(description = "Currency in which the currency-dependent estimates are expressed.")
@JsonPropertyOrder({
  StockNotationScreenerSearchDataCurrencyDependentEstimatesCurrency.JSON_PROPERTY_ISO_CODE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class StockNotationScreenerSearchDataCurrencyDependentEstimatesCurrency implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * ISO 4217 code of the currency.
   */
  public enum IsoCodeEnum {
    EUR("EUR"),
    
    USD("USD"),
    
    GBP("GBP"),
    
    CHF("CHF");

    private String value;

    IsoCodeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static IsoCodeEnum fromValue(String value) {
      for (IsoCodeEnum b : IsoCodeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_ISO_CODE = "isoCode";
  private IsoCodeEnum isoCode;


  public StockNotationScreenerSearchDataCurrencyDependentEstimatesCurrency isoCode(IsoCodeEnum isoCode) {
    this.isoCode = isoCode;
    return this;
  }

   /**
   * ISO 4217 code of the currency.
   * @return isoCode
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "ISO 4217 code of the currency.")
  @JsonProperty(JSON_PROPERTY_ISO_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public IsoCodeEnum getIsoCode() {
    return isoCode;
  }


  @JsonProperty(JSON_PROPERTY_ISO_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIsoCode(IsoCodeEnum isoCode) {
    this.isoCode = isoCode;
  }


  /**
   * Return true if this _stock_notation_screener_search_data_currencyDependentEstimates_currency object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StockNotationScreenerSearchDataCurrencyDependentEstimatesCurrency stockNotationScreenerSearchDataCurrencyDependentEstimatesCurrency = (StockNotationScreenerSearchDataCurrencyDependentEstimatesCurrency) o;
    return Objects.equals(this.isoCode, stockNotationScreenerSearchDataCurrencyDependentEstimatesCurrency.isoCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isoCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StockNotationScreenerSearchDataCurrencyDependentEstimatesCurrency {\n");
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

