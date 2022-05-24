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
import com.factset.sdk.BondsAPIforDigitalPortals.models.InlineResponse2004DataRatingSystem1Rating;
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
 * Ratings of the debt instruments according to the rating system specified by either the second identifier provided in the parameter &#x60;rating.system.ids&#x60;, or of the rating system implied by the second identifier provided in the parameter &#x60;rating.minimum.grade.ids&#x60;. Not available, if a rating system has not been specified via the mentioned parameters.
 */
@ApiModel(description = "Ratings of the debt instruments according to the rating system specified by either the second identifier provided in the parameter `rating.system.ids`, or of the rating system implied by the second identifier provided in the parameter `rating.minimum.grade.ids`. Not available, if a rating system has not been specified via the mentioned parameters.")
@JsonPropertyOrder({
  InlineResponse2004DataRatingSystem2.JSON_PROPERTY_RATING
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse2004DataRatingSystem2 implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_RATING = "rating";
  private java.util.List<InlineResponse2004DataRatingSystem1Rating> rating = null;

  public InlineResponse2004DataRatingSystem2() { 
  }

  public InlineResponse2004DataRatingSystem2 rating(java.util.List<InlineResponse2004DataRatingSystem1Rating> rating) {
    this.rating = rating;
    return this;
  }

  public InlineResponse2004DataRatingSystem2 addRatingItem(InlineResponse2004DataRatingSystem1Rating ratingItem) {
    if (this.rating == null) {
      this.rating = new java.util.ArrayList<>();
    }
    this.rating.add(ratingItem);
    return this;
  }

   /**
   * List of rating grades.
   * @return rating
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of rating grades.")
  @JsonProperty(JSON_PROPERTY_RATING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<InlineResponse2004DataRatingSystem1Rating> getRating() {
    return rating;
  }


  @JsonProperty(JSON_PROPERTY_RATING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRating(java.util.List<InlineResponse2004DataRatingSystem1Rating> rating) {
    this.rating = rating;
  }


  /**
   * Return true if this inline_response_200_4_data_ratingSystem2 object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2004DataRatingSystem2 inlineResponse2004DataRatingSystem2 = (InlineResponse2004DataRatingSystem2) o;
    return Objects.equals(this.rating, inlineResponse2004DataRatingSystem2.rating);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rating);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2004DataRatingSystem2 {\n");
    sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
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

