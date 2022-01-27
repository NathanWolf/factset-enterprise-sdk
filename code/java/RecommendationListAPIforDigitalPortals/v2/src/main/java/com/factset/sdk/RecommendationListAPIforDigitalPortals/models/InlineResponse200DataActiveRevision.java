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


package com.factset.sdk.RecommendationListAPIforDigitalPortals.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.RecommendationListAPIforDigitalPortals.models.InlineResponse200DataActiveRevisionActiveRange;
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
import com.factset.sdk.RecommendationListAPIforDigitalPortals.JSON;


/**
 * Information on the active revision of this recommendation list, or null.
 */
@ApiModel(description = "Information on the active revision of this recommendation list, or null.")
@JsonPropertyOrder({
  InlineResponse200DataActiveRevision.JSON_PROPERTY_ID,
  InlineResponse200DataActiveRevision.JSON_PROPERTY_TITLE,
  InlineResponse200DataActiveRevision.JSON_PROPERTY_ACTIVE_RANGE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse200DataActiveRevision implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ID = "id";
  private BigDecimal id;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_ACTIVE_RANGE = "activeRange";
  private InlineResponse200DataActiveRevisionActiveRange activeRange;


  public InlineResponse200DataActiveRevision id(BigDecimal id) {
    this.id = id;
    return this;
  }

   /**
   * Identifier of the currently active revision.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Identifier of the currently active revision.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(BigDecimal id) {
    this.id = id;
  }


  public InlineResponse200DataActiveRevision title(String title) {
    this.title = title;
    return this;
  }

   /**
   * The language specific name assigned to the recommendation list as of the given revision.
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The language specific name assigned to the recommendation list as of the given revision.")
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTitle() {
    return title;
  }


  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTitle(String title) {
    this.title = title;
  }


  public InlineResponse200DataActiveRevision activeRange(InlineResponse200DataActiveRevisionActiveRange activeRange) {
    this.activeRange = activeRange;
    return this;
  }

   /**
   * Get activeRange
   * @return activeRange
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ACTIVE_RANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse200DataActiveRevisionActiveRange getActiveRange() {
    return activeRange;
  }


  @JsonProperty(JSON_PROPERTY_ACTIVE_RANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setActiveRange(InlineResponse200DataActiveRevisionActiveRange activeRange) {
    this.activeRange = activeRange;
  }


  /**
   * Return true if this inline_response_200_data_activeRevision object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200DataActiveRevision inlineResponse200DataActiveRevision = (InlineResponse200DataActiveRevision) o;
    return Objects.equals(this.id, inlineResponse200DataActiveRevision.id) &&
        Objects.equals(this.title, inlineResponse200DataActiveRevision.title) &&
        Objects.equals(this.activeRange, inlineResponse200DataActiveRevision.activeRange);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, activeRange);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200DataActiveRevision {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    activeRange: ").append(toIndentedString(activeRange)).append("\n");
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

