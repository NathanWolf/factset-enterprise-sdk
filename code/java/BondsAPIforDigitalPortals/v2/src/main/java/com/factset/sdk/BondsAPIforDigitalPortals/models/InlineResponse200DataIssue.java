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
import com.factset.sdk.BondsAPIforDigitalPortals.models.InlineResponse200DataIssuePrice;
import com.factset.sdk.BondsAPIforDigitalPortals.models.InlineResponse200DataIssueVolume;
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
 * Issue data of the instrument.
 */
@ApiModel(description = "Issue data of the instrument.")
@JsonPropertyOrder({
  InlineResponse200DataIssue.JSON_PROPERTY_PRICE,
  InlineResponse200DataIssue.JSON_PROPERTY_VOLUME
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse200DataIssue implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_PRICE = "price";
  private InlineResponse200DataIssuePrice price;

  public static final String JSON_PROPERTY_VOLUME = "volume";
  private InlineResponse200DataIssueVolume volume;


  public InlineResponse200DataIssue price(InlineResponse200DataIssuePrice price) {
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse200DataIssuePrice getPrice() {
    return price;
  }


  @JsonProperty(JSON_PROPERTY_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrice(InlineResponse200DataIssuePrice price) {
    this.price = price;
  }


  public InlineResponse200DataIssue volume(InlineResponse200DataIssueVolume volume) {
    this.volume = volume;
    return this;
  }

   /**
   * Get volume
   * @return volume
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VOLUME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse200DataIssueVolume getVolume() {
    return volume;
  }


  @JsonProperty(JSON_PROPERTY_VOLUME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVolume(InlineResponse200DataIssueVolume volume) {
    this.volume = volume;
  }


  /**
   * Return true if this inline_response_200_data_issue object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200DataIssue inlineResponse200DataIssue = (InlineResponse200DataIssue) o;
    return Objects.equals(this.price, inlineResponse200DataIssue.price) &&
        Objects.equals(this.volume, inlineResponse200DataIssue.volume);
  }

  @Override
  public int hashCode() {
    return Objects.hash(price, volume);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200DataIssue {\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
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

