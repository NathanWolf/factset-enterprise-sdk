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


package com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.models;

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
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.JSON;


/**
 * Price of the notation.
 */
@ApiModel(description = "Price of the notation.")
@JsonPropertyOrder({
  InlineResponse2006DataNotationPrice.JSON_PROPERTY_TIME,
  InlineResponse2006DataNotationPrice.JSON_PROPERTY_VALUE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse2006DataNotationPrice implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_TIME = "time";
  private String time;

  public static final String JSON_PROPERTY_VALUE = "value";
  private BigDecimal value;

  public InlineResponse2006DataNotationPrice() { 
  }

  public InlineResponse2006DataNotationPrice time(String time) {
    this.time = time;
    return this;
  }

   /**
   * Date and time of the trade price
   * @return time
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date and time of the trade price")
  @JsonProperty(JSON_PROPERTY_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTime() {
    return time;
  }


  @JsonProperty(JSON_PROPERTY_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTime(String time) {
    this.time = time;
  }


  public InlineResponse2006DataNotationPrice value(BigDecimal value) {
    this.value = value;
    return this;
  }

   /**
   * Trade price.
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Trade price.")
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


  /**
   * Return true if this inline_response_200_6_data_notation_price object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2006DataNotationPrice inlineResponse2006DataNotationPrice = (InlineResponse2006DataNotationPrice) o;
    return Objects.equals(this.time, inlineResponse2006DataNotationPrice.time) &&
        Objects.equals(this.value, inlineResponse2006DataNotationPrice.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(time, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2006DataNotationPrice {\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

