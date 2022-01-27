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
import java.math.BigDecimal;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.ETFProfileandPrices.JSON;


/**
 * Max capital gains rate.
 */
@ApiModel(description = "Max capital gains rate.")
@JsonPropertyOrder({
  InlineResponse20021DataMaxCapitalGainsRate.JSON_PROPERTY_LONG_TERM,
  InlineResponse20021DataMaxCapitalGainsRate.JSON_PROPERTY_SHORT_TERM
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse20021DataMaxCapitalGainsRate implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_LONG_TERM = "longTerm";
  private BigDecimal longTerm;

  public static final String JSON_PROPERTY_SHORT_TERM = "shortTerm";
  private BigDecimal shortTerm;


  public InlineResponse20021DataMaxCapitalGainsRate longTerm(BigDecimal longTerm) {
    this.longTerm = longTerm;
    return this;
  }

   /**
   * The maximum US federal personal income tax rate that applies to long-term capital gains associated with the ETP. This data is available for the US regions.
   * @return longTerm
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The maximum US federal personal income tax rate that applies to long-term capital gains associated with the ETP. This data is available for the US regions.")
  @JsonProperty(JSON_PROPERTY_LONG_TERM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getLongTerm() {
    return longTerm;
  }


  @JsonProperty(JSON_PROPERTY_LONG_TERM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLongTerm(BigDecimal longTerm) {
    this.longTerm = longTerm;
  }


  public InlineResponse20021DataMaxCapitalGainsRate shortTerm(BigDecimal shortTerm) {
    this.shortTerm = shortTerm;
    return this;
  }

   /**
   * The maximum US federal personal income tax rate that applies to short-term capital gains associated with the ETP. This data is available for the US regions.
   * @return shortTerm
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The maximum US federal personal income tax rate that applies to short-term capital gains associated with the ETP. This data is available for the US regions.")
  @JsonProperty(JSON_PROPERTY_SHORT_TERM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getShortTerm() {
    return shortTerm;
  }


  @JsonProperty(JSON_PROPERTY_SHORT_TERM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShortTerm(BigDecimal shortTerm) {
    this.shortTerm = shortTerm;
  }


  /**
   * Return true if this inline_response_200_21_data_maxCapitalGainsRate object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20021DataMaxCapitalGainsRate inlineResponse20021DataMaxCapitalGainsRate = (InlineResponse20021DataMaxCapitalGainsRate) o;
    return Objects.equals(this.longTerm, inlineResponse20021DataMaxCapitalGainsRate.longTerm) &&
        Objects.equals(this.shortTerm, inlineResponse20021DataMaxCapitalGainsRate.shortTerm);
  }

  @Override
  public int hashCode() {
    return Objects.hash(longTerm, shortTerm);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20021DataMaxCapitalGainsRate {\n");
    sb.append("    longTerm: ").append(toIndentedString(longTerm)).append("\n");
    sb.append("    shortTerm: ").append(toIndentedString(shortTerm)).append("\n");
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

