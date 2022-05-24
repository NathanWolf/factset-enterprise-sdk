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
import java.math.BigDecimal;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.FundsAPIforDigitalPortals.JSON;


/**
 * Management fee. It is paid from the assets of the fund to the fund company for running and administration including expenses for advisor and/or manager.
 */
@ApiModel(description = "Management fee. It is paid from the assets of the fund to the fund company for running and administration including expenses for advisor and/or manager.")
@JsonPropertyOrder({
  InlineResponse2006DataFeesManagement.JSON_PROPERTY_EX_ANTE,
  InlineResponse2006DataFeesManagement.JSON_PROPERTY_EX_POST
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse2006DataFeesManagement implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_EX_ANTE = "exAnte";
  private BigDecimal exAnte;

  public static final String JSON_PROPERTY_EX_POST = "exPost";
  private BigDecimal exPost;

  public InlineResponse2006DataFeesManagement() { 
  }

  public InlineResponse2006DataFeesManagement exAnte(BigDecimal exAnte) {
    this.exAnte = exAnte;
    return this;
  }

   /**
   * Ex ante (prospective) value of the management fee.
   * @return exAnte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Ex ante (prospective) value of the management fee.")
  @JsonProperty(JSON_PROPERTY_EX_ANTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getExAnte() {
    return exAnte;
  }


  @JsonProperty(JSON_PROPERTY_EX_ANTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExAnte(BigDecimal exAnte) {
    this.exAnte = exAnte;
  }


  public InlineResponse2006DataFeesManagement exPost(BigDecimal exPost) {
    this.exPost = exPost;
    return this;
  }

   /**
   * Ex post (retrospective) value of the management fee.
   * @return exPost
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Ex post (retrospective) value of the management fee.")
  @JsonProperty(JSON_PROPERTY_EX_POST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getExPost() {
    return exPost;
  }


  @JsonProperty(JSON_PROPERTY_EX_POST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExPost(BigDecimal exPost) {
    this.exPost = exPost;
  }


  /**
   * Return true if this inline_response_200_6_data_fees_management object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2006DataFeesManagement inlineResponse2006DataFeesManagement = (InlineResponse2006DataFeesManagement) o;
    return Objects.equals(this.exAnte, inlineResponse2006DataFeesManagement.exAnte) &&
        Objects.equals(this.exPost, inlineResponse2006DataFeesManagement.exPost);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exAnte, exPost);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2006DataFeesManagement {\n");
    sb.append("    exAnte: ").append(toIndentedString(exAnte)).append("\n");
    sb.append("    exPost: ").append(toIndentedString(exPost)).append("\n");
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

