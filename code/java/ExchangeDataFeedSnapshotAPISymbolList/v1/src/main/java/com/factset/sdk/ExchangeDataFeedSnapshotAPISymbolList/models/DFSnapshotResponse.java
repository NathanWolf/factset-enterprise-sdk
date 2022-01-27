/*
 * Exchange DataFeed Snapshot
 * FactSet’s Exchange DataFeed Snapshot API provides cost-effective access to real-time and delayed global exchange data. Proprietary technology normalizes over 200 global exchanges and 150+ data fields. Asset types integrated include equities, futures, options, warrants, fixed income, mutual funds, ETFs, indices, commodities, and FX rates. <p>Cutting-edge technology ensures reliability and provides scalability that allow applications to request multiple items at a time. To simplify client-side development an entire response can be placed in a matrix or table for effortless integration into internal and external applications. Using specified output formats (CSV, XML, JSON) receive all standard fields by default or customize the list based on specific needs.</p></p>Below are the current hosts:</p><p>Production: api.factset.com<p>Sandbox: api-sandbox.factset.com</p>
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.ExchangeDataFeedSnapshotAPISymbolList.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.ExchangeDataFeedSnapshotAPISymbolList.models.Fields;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.ExchangeDataFeedSnapshotAPISymbolList.JSON;


/**
 * sample response
 */
@ApiModel(description = "sample response")
@JsonPropertyOrder({
  DFSnapshotResponse.JSON_PROPERTY_ERROR,
  DFSnapshotResponse.JSON_PROPERTY_SYMBOL1,
  DFSnapshotResponse.JSON_PROPERTY_HOST,
  DFSnapshotResponse.JSON_PROPERTY_SYMBOL2
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DFSnapshotResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ERROR = "Error";
  private Integer error;

  public static final String JSON_PROPERTY_SYMBOL1 = "symbol1";
  private java.util.List<Fields> symbol1 = null;

  public static final String JSON_PROPERTY_HOST = "Host";
  private String host;

  public static final String JSON_PROPERTY_SYMBOL2 = "symbol2";
  private String symbol2;


  public DFSnapshotResponse error(Integer error) {
    this.error = error;
    return this;
  }

   /**
   * error value
   * @return error
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "error value")
  @JsonProperty(JSON_PROPERTY_ERROR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getError() {
    return error;
  }


  @JsonProperty(JSON_PROPERTY_ERROR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setError(Integer error) {
    this.error = error;
  }


  public DFSnapshotResponse symbol1(java.util.List<Fields> symbol1) {
    this.symbol1 = symbol1;
    return this;
  }

  public DFSnapshotResponse addSymbol1Item(Fields symbol1Item) {
    if (this.symbol1 == null) {
      this.symbol1 = new java.util.ArrayList<>();
    }
    this.symbol1.add(symbol1Item);
    return this;
  }

   /**
   * first symbol from &#x60;ids&#x60; or &#x60;chain&#x60;
   * @return symbol1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "first symbol from `ids` or `chain`")
  @JsonProperty(JSON_PROPERTY_SYMBOL1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<Fields> getSymbol1() {
    return symbol1;
  }


  @JsonProperty(JSON_PROPERTY_SYMBOL1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSymbol1(java.util.List<Fields> symbol1) {
    this.symbol1 = symbol1;
  }


  public DFSnapshotResponse host(String host) {
    this.host = host;
    return this;
  }

   /**
   * host name
   * @return host
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "FactSet", value = "host name")
  @JsonProperty(JSON_PROPERTY_HOST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getHost() {
    return host;
  }


  @JsonProperty(JSON_PROPERTY_HOST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHost(String host) {
    this.host = host;
  }


  public DFSnapshotResponse symbol2(String symbol2) {
    this.symbol2 = symbol2;
    return this;
  }

   /**
   * second symbol from &#x60;ids&#x60; or &#x60;chain&#x60; list
   * @return symbol2
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "second symbol from `ids` or `chain` list")
  @JsonProperty(JSON_PROPERTY_SYMBOL2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSymbol2() {
    return symbol2;
  }


  @JsonProperty(JSON_PROPERTY_SYMBOL2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSymbol2(String symbol2) {
    this.symbol2 = symbol2;
  }


  /**
   * Return true if this DFSnapshot_Response object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DFSnapshotResponse dfSnapshotResponse = (DFSnapshotResponse) o;
    return Objects.equals(this.error, dfSnapshotResponse.error) &&
        Objects.equals(this.symbol1, dfSnapshotResponse.symbol1) &&
        Objects.equals(this.host, dfSnapshotResponse.host) &&
        Objects.equals(this.symbol2, dfSnapshotResponse.symbol2);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error, symbol1, host, symbol2);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DFSnapshotResponse {\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    symbol1: ").append(toIndentedString(symbol1)).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    symbol2: ").append(toIndentedString(symbol2)).append("\n");
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

