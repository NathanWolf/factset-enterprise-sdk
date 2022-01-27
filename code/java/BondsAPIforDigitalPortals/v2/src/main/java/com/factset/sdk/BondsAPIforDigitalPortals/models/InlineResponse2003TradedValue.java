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
import com.factset.sdk.BondsAPIforDigitalPortals.models.InlineResponse2003TradedValueDays30;
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
 * Cash flow for all transactions over a certain time range. The currency is the currency of denomination (see attribute &#x60;issue.volume.currency&#x60;), thus the values are not comparable if debt instruments with different currencies of denomination are among the results.
 */
@ApiModel(description = "Cash flow for all transactions over a certain time range. The currency is the currency of denomination (see attribute `issue.volume.currency`), thus the values are not comparable if debt instruments with different currencies of denomination are among the results.")
@JsonPropertyOrder({
  InlineResponse2003TradedValue.JSON_PROPERTY_DAYS30
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse2003TradedValue implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_DAYS30 = "days30";
  private InlineResponse2003TradedValueDays30 days30;


  public InlineResponse2003TradedValue days30(InlineResponse2003TradedValueDays30 days30) {
    this.days30 = days30;
    return this;
  }

   /**
   * Get days30
   * @return days30
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DAYS30)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2003TradedValueDays30 getDays30() {
    return days30;
  }


  @JsonProperty(JSON_PROPERTY_DAYS30)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDays30(InlineResponse2003TradedValueDays30 days30) {
    this.days30 = days30;
  }


  /**
   * Return true if this inline_response_200_3_tradedValue object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2003TradedValue inlineResponse2003TradedValue = (InlineResponse2003TradedValue) o;
    return Objects.equals(this.days30, inlineResponse2003TradedValue.days30);
  }

  @Override
  public int hashCode() {
    return Objects.hash(days30);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2003TradedValue {\n");
    sb.append("    days30: ").append(toIndentedString(days30)).append("\n");
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

