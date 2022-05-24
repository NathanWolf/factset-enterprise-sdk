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
import com.factset.sdk.FundsAPIforDigitalPortals.models.InlineResponse2002Notation;
import com.factset.sdk.FundsAPIforDigitalPortals.models.InlineResponse2002Status;
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
import com.factset.sdk.FundsAPIforDigitalPortals.JSON;


/**
 * InlineResponse2002Data
 */
@JsonPropertyOrder({
  InlineResponse2002Data.JSON_PROPERTY_NOTATION,
  InlineResponse2002Data.JSON_PROPERTY_OUTPERFORMANCE,
  InlineResponse2002Data.JSON_PROPERTY_TRACKING_ERROR,
  InlineResponse2002Data.JSON_PROPERTY_INFORMATION_RATIO,
  InlineResponse2002Data.JSON_PROPERTY_STATUS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse2002Data implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_NOTATION = "notation";
  private InlineResponse2002Notation notation;

  public static final String JSON_PROPERTY_OUTPERFORMANCE = "outperformance";
  private BigDecimal outperformance;

  public static final String JSON_PROPERTY_TRACKING_ERROR = "trackingError";
  private BigDecimal trackingError;

  public static final String JSON_PROPERTY_INFORMATION_RATIO = "informationRatio";
  private BigDecimal informationRatio;

  public static final String JSON_PROPERTY_STATUS = "status";
  private InlineResponse2002Status status;

  public InlineResponse2002Data() { 
  }

  public InlineResponse2002Data notation(InlineResponse2002Notation notation) {
    this.notation = notation;
    return this;
  }

   /**
   * Get notation
   * @return notation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NOTATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2002Notation getNotation() {
    return notation;
  }


  @JsonProperty(JSON_PROPERTY_NOTATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNotation(InlineResponse2002Notation notation) {
    this.notation = notation;
  }


  public InlineResponse2002Data outperformance(BigDecimal outperformance) {
    this.outperformance = outperformance;
    return this;
  }

   /**
   * Outperformance of the notation.
   * @return outperformance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Outperformance of the notation.")
  @JsonProperty(JSON_PROPERTY_OUTPERFORMANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getOutperformance() {
    return outperformance;
  }


  @JsonProperty(JSON_PROPERTY_OUTPERFORMANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOutperformance(BigDecimal outperformance) {
    this.outperformance = outperformance;
  }


  public InlineResponse2002Data trackingError(BigDecimal trackingError) {
    this.trackingError = trackingError;
    return this;
  }

   /**
   * Tracking error of the notation.
   * @return trackingError
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Tracking error of the notation.")
  @JsonProperty(JSON_PROPERTY_TRACKING_ERROR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getTrackingError() {
    return trackingError;
  }


  @JsonProperty(JSON_PROPERTY_TRACKING_ERROR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTrackingError(BigDecimal trackingError) {
    this.trackingError = trackingError;
  }


  public InlineResponse2002Data informationRatio(BigDecimal informationRatio) {
    this.informationRatio = informationRatio;
    return this;
  }

   /**
   * Information ratio of the notation.
   * @return informationRatio
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Information ratio of the notation.")
  @JsonProperty(JSON_PROPERTY_INFORMATION_RATIO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getInformationRatio() {
    return informationRatio;
  }


  @JsonProperty(JSON_PROPERTY_INFORMATION_RATIO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInformationRatio(BigDecimal informationRatio) {
    this.informationRatio = informationRatio;
  }


  public InlineResponse2002Data status(InlineResponse2002Status status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2002Status getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(InlineResponse2002Status status) {
    this.status = status;
  }


  /**
   * Return true if this inline_response_200_2_data object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2002Data inlineResponse2002Data = (InlineResponse2002Data) o;
    return Objects.equals(this.notation, inlineResponse2002Data.notation) &&
        Objects.equals(this.outperformance, inlineResponse2002Data.outperformance) &&
        Objects.equals(this.trackingError, inlineResponse2002Data.trackingError) &&
        Objects.equals(this.informationRatio, inlineResponse2002Data.informationRatio) &&
        Objects.equals(this.status, inlineResponse2002Data.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(notation, outperformance, trackingError, informationRatio, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2002Data {\n");
    sb.append("    notation: ").append(toIndentedString(notation)).append("\n");
    sb.append("    outperformance: ").append(toIndentedString(outperformance)).append("\n");
    sb.append("    trackingError: ").append(toIndentedString(trackingError)).append("\n");
    sb.append("    informationRatio: ").append(toIndentedString(informationRatio)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

