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
import java.time.LocalDate;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.ETFProfileandPrices.JSON;


/**
 * Last.
 */
@ApiModel(description = "Last.")
@JsonPropertyOrder({
  InlineResponse20027DataNavLast.JSON_PROPERTY_VALUE,
  InlineResponse20027DataNavLast.JSON_PROPERTY_DATE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse20027DataNavLast implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_VALUE = "value";
  private BigDecimal value;

  public static final String JSON_PROPERTY_DATE = "date";
  private LocalDate date;

  public InlineResponse20027DataNavLast() { 
  }

  public InlineResponse20027DataNavLast value(BigDecimal value) {
    this.value = value;
    return this;
  }

   /**
   * Last available NAV value, in case of the daily NAV value is missing. This data is available for all the regions.
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Last available NAV value, in case of the daily NAV value is missing. This data is available for all the regions.")
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getValue() {
    return value;
  }


  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValue(BigDecimal value) {
    this.value = value;
  }


  public InlineResponse20027DataNavLast date(LocalDate date) {
    this.date = date;
    return this;
  }

   /**
   * Date of last available NAV. This data is available for all the regions.
   * @return date
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date of last available NAV. This data is available for all the regions.")
  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LocalDate getDate() {
    return date;
  }


  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDate(LocalDate date) {
    this.date = date;
  }


  /**
   * Return true if this inline_response_200_27_data_nav_last object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20027DataNavLast inlineResponse20027DataNavLast = (InlineResponse20027DataNavLast) o;
    return Objects.equals(this.value, inlineResponse20027DataNavLast.value) &&
        Objects.equals(this.date, inlineResponse20027DataNavLast.date);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, date);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20027DataNavLast {\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
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

