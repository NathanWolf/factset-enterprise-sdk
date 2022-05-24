/*
 * Funds API For Digital Portals
 * Search for mutual funds and ETFs using one single consolidated API, including a criteria-based screener. The API provides also base data, key figures, and holdings.  A separate endpoint returns the possible values and value range for the parameters that the endpoint /fund/notation/screener/search accepts: Application developers can request the values and value range only for a restricted set of notations that match predefined parameters. This functionality may be used to pre-fill the values and value ranges of the parameters of the /fund/notation/screener/search endpoint so that performing a search always leads to a non-empty set of notations.  This API is fully integrated with the corresponding Quotes API, allowing access to detailed price and performance information of instruments, as well as basic security identifier cross-reference. For direct access to price histories, please refer to the Time Series API for Digital Portals.  Similar criteria based screener APIs exist for equity instruments and securitized derivatives: See the Stocks API and the Securitized Derivatives API for details.
 *
 * The version of the OpenAPI document: 2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.FundsAPIforDigitalPortals.models;

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
import com.factset.sdk.FundsAPIforDigitalPortals.JSON;


/**
 * Regional-level identifiers.
 */
@ApiModel(description = "Regional-level identifiers.")
@JsonPropertyOrder({
  InlineResponse2004FsymRegional.JSON_PROPERTY_PERMANENT_IDENTIFIER,
  InlineResponse2004FsymRegional.JSON_PROPERTY_TICKER_REGION,
  InlineResponse2004FsymRegional.JSON_PROPERTY_IS_PRIMARY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse2004FsymRegional implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_PERMANENT_IDENTIFIER = "permanentIdentifier";
  private String permanentIdentifier;

  public static final String JSON_PROPERTY_TICKER_REGION = "tickerRegion";
  private String tickerRegion;

  public static final String JSON_PROPERTY_IS_PRIMARY = "isPrimary";
  private Boolean isPrimary;

  public InlineResponse2004FsymRegional() { 
  }

  public InlineResponse2004FsymRegional permanentIdentifier(String permanentIdentifier) {
    this.permanentIdentifier = permanentIdentifier;
    return this;
  }

   /**
   * FactSet Permanent Identifier for a set of one or more notations of the same region with the same value unit. The format is six alpha numeric characters, excluding vowels, with an R suffix (XXXXXX-R).
   * @return permanentIdentifier
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "FactSet Permanent Identifier for a set of one or more notations of the same region with the same value unit. The format is six alpha numeric characters, excluding vowels, with an R suffix (XXXXXX-R).")
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


  public InlineResponse2004FsymRegional tickerRegion(String tickerRegion) {
    this.tickerRegion = tickerRegion;
    return this;
  }

   /**
   * FactSet regional symbol of the notation, consisting of the ticker and the two-character code of the country or region where the listing is traded (example: DAI-DE).
   * @return tickerRegion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "FactSet regional symbol of the notation, consisting of the ticker and the two-character code of the country or region where the listing is traded (example: DAI-DE).")
  @JsonProperty(JSON_PROPERTY_TICKER_REGION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTickerRegion() {
    return tickerRegion;
  }


  @JsonProperty(JSON_PROPERTY_TICKER_REGION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTickerRegion(String tickerRegion) {
    this.tickerRegion = tickerRegion;
  }


  public InlineResponse2004FsymRegional isPrimary(Boolean isPrimary) {
    this.isPrimary = isPrimary;
    return this;
  }

   /**
   * Indicates whether the notation is in the primary region of the security (&#x60;true&#x60;) or not (&#x60;false&#x60;).
   * @return isPrimary
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether the notation is in the primary region of the security (`true`) or not (`false`).")
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


  /**
   * Return true if this inline_response_200_4_fsym_regional object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2004FsymRegional inlineResponse2004FsymRegional = (InlineResponse2004FsymRegional) o;
    return Objects.equals(this.permanentIdentifier, inlineResponse2004FsymRegional.permanentIdentifier) &&
        Objects.equals(this.tickerRegion, inlineResponse2004FsymRegional.tickerRegion) &&
        Objects.equals(this.isPrimary, inlineResponse2004FsymRegional.isPrimary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(permanentIdentifier, tickerRegion, isPrimary);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2004FsymRegional {\n");
    sb.append("    permanentIdentifier: ").append(toIndentedString(permanentIdentifier)).append("\n");
    sb.append("    tickerRegion: ").append(toIndentedString(tickerRegion)).append("\n");
    sb.append("    isPrimary: ").append(toIndentedString(isPrimary)).append("\n");
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

