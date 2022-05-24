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


package com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models;

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
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.JSON;


/**
 * Value unit of the notations in the result. The parameter ensures the consistency and comparability of the absolute and relative performance for all securitized derivatives, and of the trading value for securitized derivatives quoted in percent. See response attributes &#x60;trade.performance.absolute&#x60; and &#x60;trade.performance.relative&#x60;, and &#x60;accumulated.tradingValue&#x60; respectively.
 */
@ApiModel(description = "Value unit of the notations in the result. The parameter ensures the consistency and comparability of the absolute and relative performance for all securitized derivatives, and of the trading value for securitized derivatives quoted in percent. See response attributes `trade.performance.absolute` and `trade.performance.relative`, and `accumulated.tradingValue` respectively.")
@JsonPropertyOrder({
  SecuritizedDerivativeNotationRankingIntradayListDataValueUnit.JSON_PROPERTY_ID
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SecuritizedDerivativeNotationRankingIntradayListDataValueUnit implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ID = "id";
  private BigDecimal id;

  public SecuritizedDerivativeNotationRankingIntradayListDataValueUnit() { 
  }

  public SecuritizedDerivativeNotationRankingIntradayListDataValueUnit id(BigDecimal id) {
    this.id = id;
    return this;
  }

   /**
   * Identifier of the value unit. See endpoint &#x60;/basic/valueUnit/list&#x60; for valid values.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Identifier of the value unit. See endpoint `/basic/valueUnit/list` for valid values.")
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


  /**
   * Return true if this _securitizedDerivative_notation_ranking_intraday_list_data_valueUnit object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecuritizedDerivativeNotationRankingIntradayListDataValueUnit securitizedDerivativeNotationRankingIntradayListDataValueUnit = (SecuritizedDerivativeNotationRankingIntradayListDataValueUnit) o;
    return Objects.equals(this.id, securitizedDerivativeNotationRankingIntradayListDataValueUnit.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecuritizedDerivativeNotationRankingIntradayListDataValueUnit {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

