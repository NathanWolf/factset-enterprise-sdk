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
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20063Ratings;
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
 * InlineResponse20063Data
 */
@JsonPropertyOrder({
  InlineResponse20063Data.JSON_PROPERTY_ID,
  InlineResponse20063Data.JSON_PROPERTY_RATINGS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse20063Data implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_RATINGS = "ratings";
  private java.util.List<InlineResponse20063Ratings> ratings = null;

  public InlineResponse20063Data() { 
  }

  public InlineResponse20063Data id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Identifier of an instrument.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Identifier of an instrument.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }


  public InlineResponse20063Data ratings(java.util.List<InlineResponse20063Ratings> ratings) {
    this.ratings = ratings;
    return this;
  }

  public InlineResponse20063Data addRatingsItem(InlineResponse20063Ratings ratingsItem) {
    if (this.ratings == null) {
      this.ratings = new java.util.ArrayList<>();
    }
    this.ratings.add(ratingsItem);
    return this;
  }

   /**
   * Rating details. See endpoint &#x60;/rating/system/get&#x60; for details regarding a rating system, endpoint &#x60;/rating/grade/listBySystem&#x60; for all rating grades of a rating system, and endpoint &#x60;/rating/grade/get&#x60; for details regarding a rating grade.
   * @return ratings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Rating details. See endpoint `/rating/system/get` for details regarding a rating system, endpoint `/rating/grade/listBySystem` for all rating grades of a rating system, and endpoint `/rating/grade/get` for details regarding a rating grade.")
  @JsonProperty(JSON_PROPERTY_RATINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<InlineResponse20063Ratings> getRatings() {
    return ratings;
  }


  @JsonProperty(JSON_PROPERTY_RATINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRatings(java.util.List<InlineResponse20063Ratings> ratings) {
    this.ratings = ratings;
  }


  /**
   * Return true if this inline_response_200_63_data object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20063Data inlineResponse20063Data = (InlineResponse20063Data) o;
    return Objects.equals(this.id, inlineResponse20063Data.id) &&
        Objects.equals(this.ratings, inlineResponse20063Data.ratings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, ratings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20063Data {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    ratings: ").append(toIndentedString(ratings)).append("\n");
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

