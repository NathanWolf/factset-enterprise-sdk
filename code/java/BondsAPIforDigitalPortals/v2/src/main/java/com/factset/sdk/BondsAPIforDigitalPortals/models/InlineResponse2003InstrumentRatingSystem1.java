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
import com.factset.sdk.BondsAPIforDigitalPortals.models.InlineResponse2003InstrumentRatingSystem1Rating;
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
 * Rating of the debt instrument according to the rating system of the first identifier in the list provided in the parameter &#x60;rating.grade.minimum.ids&#x60;.
 */
@ApiModel(description = "Rating of the debt instrument according to the rating system of the first identifier in the list provided in the parameter `rating.grade.minimum.ids`.")
@JsonPropertyOrder({
  InlineResponse2003InstrumentRatingSystem1.JSON_PROPERTY_RATING
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse2003InstrumentRatingSystem1 implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_RATING = "rating";
  private InlineResponse2003InstrumentRatingSystem1Rating rating;


  public InlineResponse2003InstrumentRatingSystem1 rating(InlineResponse2003InstrumentRatingSystem1Rating rating) {
    this.rating = rating;
    return this;
  }

   /**
   * Get rating
   * @return rating
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RATING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2003InstrumentRatingSystem1Rating getRating() {
    return rating;
  }


  @JsonProperty(JSON_PROPERTY_RATING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRating(InlineResponse2003InstrumentRatingSystem1Rating rating) {
    this.rating = rating;
  }


  /**
   * Return true if this inline_response_200_3_instrument_ratingSystem1 object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2003InstrumentRatingSystem1 inlineResponse2003InstrumentRatingSystem1 = (InlineResponse2003InstrumentRatingSystem1) o;
    return Objects.equals(this.rating, inlineResponse2003InstrumentRatingSystem1.rating);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rating);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2003InstrumentRatingSystem1 {\n");
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

