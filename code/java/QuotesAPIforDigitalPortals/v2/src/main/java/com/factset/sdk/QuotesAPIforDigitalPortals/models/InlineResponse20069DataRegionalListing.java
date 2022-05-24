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


package com.factset.sdk.QuotesAPIforDigitalPortals.models;

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
import com.factset.sdk.QuotesAPIforDigitalPortals.JSON;


/**
 * Listing-level data with a list of notations. If the set of listing identifiers contains an element for which the attribute &#x60;isPrimary &#x3D; true&#x60;, then this element is the first one in the array.
 */
@ApiModel(description = "Listing-level data with a list of notations. If the set of listing identifiers contains an element for which the attribute `isPrimary = true`, then this element is the first one in the array.")
@JsonPropertyOrder({
  InlineResponse20069DataRegionalListing.JSON_PROPERTY_IS_PRIMARY,
  InlineResponse20069DataRegionalListing.JSON_PROPERTY_PERMANENT_IDENTIFIER,
  InlineResponse20069DataRegionalListing.JSON_PROPERTY_TICKER_EXCHANGE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse20069DataRegionalListing implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_IS_PRIMARY = "isPrimary";
  private Boolean isPrimary;

  public static final String JSON_PROPERTY_PERMANENT_IDENTIFIER = "permanentIdentifier";
  private String permanentIdentifier;

  public static final String JSON_PROPERTY_TICKER_EXCHANGE = "tickerExchange";
  private String tickerExchange;

  public InlineResponse20069DataRegionalListing() { 
  }

  public InlineResponse20069DataRegionalListing isPrimary(Boolean isPrimary) {
    this.isPrimary = isPrimary;
    return this;
  }

   /**
   * Indicates whether the listing identifier is the one for the primary listing among all listings with the same regional identifier (&#x60;true&#x60;) or not (&#x60;false&#x60;).
   * @return isPrimary
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether the listing identifier is the one for the primary listing among all listings with the same regional identifier (`true`) or not (`false`).")
  @JsonProperty(JSON_PROPERTY_IS_PRIMARY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsPrimary() {
    return isPrimary;
  }


  @JsonProperty(JSON_PROPERTY_IS_PRIMARY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsPrimary(Boolean isPrimary) {
    this.isPrimary = isPrimary;
  }


  public InlineResponse20069DataRegionalListing permanentIdentifier(String permanentIdentifier) {
    this.permanentIdentifier = permanentIdentifier;
    return this;
  }

   /**
   * FactSet Permanent Identifier for a notation. The format is six alpha numeric characters, excluding vowels, with an L suffix (XXXXXX-L).
   * @return permanentIdentifier
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "FactSet Permanent Identifier for a notation. The format is six alpha numeric characters, excluding vowels, with an L suffix (XXXXXX-L).")
  @JsonProperty(JSON_PROPERTY_PERMANENT_IDENTIFIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPermanentIdentifier() {
    return permanentIdentifier;
  }


  @JsonProperty(JSON_PROPERTY_PERMANENT_IDENTIFIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPermanentIdentifier(String permanentIdentifier) {
    this.permanentIdentifier = permanentIdentifier;
  }


  public InlineResponse20069DataRegionalListing tickerExchange(String tickerExchange) {
    this.tickerExchange = tickerExchange;
    return this;
  }

   /**
   * FactSet market symbol of the notation, usually consisting of the ticker (e.g. \&quot;FDS\&quot; for FactSet Research Systems Inc.) and the three-character code of the exchange on which the listing is traded (example: FDS-NYS).
   * @return tickerExchange
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "FactSet market symbol of the notation, usually consisting of the ticker (e.g. \"FDS\" for FactSet Research Systems Inc.) and the three-character code of the exchange on which the listing is traded (example: FDS-NYS).")
  @JsonProperty(JSON_PROPERTY_TICKER_EXCHANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTickerExchange() {
    return tickerExchange;
  }


  @JsonProperty(JSON_PROPERTY_TICKER_EXCHANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTickerExchange(String tickerExchange) {
    this.tickerExchange = tickerExchange;
  }


  /**
   * Return true if this inline_response_200_69_data_regional_listing object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20069DataRegionalListing inlineResponse20069DataRegionalListing = (InlineResponse20069DataRegionalListing) o;
    return Objects.equals(this.isPrimary, inlineResponse20069DataRegionalListing.isPrimary) &&
        Objects.equals(this.permanentIdentifier, inlineResponse20069DataRegionalListing.permanentIdentifier) &&
        Objects.equals(this.tickerExchange, inlineResponse20069DataRegionalListing.tickerExchange);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isPrimary, permanentIdentifier, tickerExchange);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20069DataRegionalListing {\n");
    sb.append("    isPrimary: ").append(toIndentedString(isPrimary)).append("\n");
    sb.append("    permanentIdentifier: ").append(toIndentedString(permanentIdentifier)).append("\n");
    sb.append("    tickerExchange: ").append(toIndentedString(tickerExchange)).append("\n");
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

