/*
 * Engines API
 * Allow clients to fetch Engines Analytics through APIs.
 *
 * The version of the OpenAPI document: 1
 * Contact: analytics.api.support@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.FactSetPortfolioOptimizer.models;

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
import com.factset.sdk.FactSetPortfolioOptimizer.JSON;


/**
 * OptimizerTradesList
 */
@JsonPropertyOrder({
  OptimizerTradesList.JSON_PROPERTY_IDENTIFIERTYPE,
  OptimizerTradesList.JSON_PROPERTY_INCLUDECASH
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class OptimizerTradesList implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Identifier type
   */
  public enum IdentifiertypeEnum {
    ASSET("Asset"),
    
    CUSIP("Cusip"),
    
    ISIN("Isin"),
    
    RISKMODEL("RiskModel"),
    
    SEDOLCHK("SedolChk"),
    
    SEDOL("Sedol"),
    
    SYMBOLOGYCUSIP("SymbologyCusip"),
    
    TICKER("Ticker"),
    
    TICKERREGION("TickerRegion"),
    
    USER("User");

    private String value;

    IdentifiertypeEnum(String value) {
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
    public static IdentifiertypeEnum fromValue(String value) {
      for (IdentifiertypeEnum b : IdentifiertypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_IDENTIFIERTYPE = "identifiertype";
  private IdentifiertypeEnum identifiertype;

  public static final String JSON_PROPERTY_INCLUDECASH = "includecash";
  private Boolean includecash;


  public OptimizerTradesList identifiertype(IdentifiertypeEnum identifiertype) {
    this.identifiertype = identifiertype;
    return this;
  }

   /**
   * Identifier type
   * @return identifiertype
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Identifier type")
  @JsonProperty(JSON_PROPERTY_IDENTIFIERTYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public IdentifiertypeEnum getIdentifiertype() {
    return identifiertype;
  }


  @JsonProperty(JSON_PROPERTY_IDENTIFIERTYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIdentifiertype(IdentifiertypeEnum identifiertype) {
    this.identifiertype = identifiertype;
  }


  public OptimizerTradesList includecash(Boolean includecash) {
    this.includecash = includecash;
    return this;
  }

   /**
   * Include cash
   * @return includecash
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Include cash")
  @JsonProperty(JSON_PROPERTY_INCLUDECASH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIncludecash() {
    return includecash;
  }


  @JsonProperty(JSON_PROPERTY_INCLUDECASH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIncludecash(Boolean includecash) {
    this.includecash = includecash;
  }


  /**
   * Return true if this OptimizerTradesList object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OptimizerTradesList optimizerTradesList = (OptimizerTradesList) o;
    return Objects.equals(this.identifiertype, optimizerTradesList.identifiertype) &&
        Objects.equals(this.includecash, optimizerTradesList.includecash);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identifiertype, includecash);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OptimizerTradesList {\n");
    sb.append("    identifiertype: ").append(toIndentedString(identifiertype)).append("\n");
    sb.append("    includecash: ").append(toIndentedString(includecash)).append("\n");
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

