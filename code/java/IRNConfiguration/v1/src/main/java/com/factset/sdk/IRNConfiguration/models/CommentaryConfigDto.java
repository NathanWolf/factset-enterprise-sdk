/*
 * IRN API v1
 * Allows users to extract, create, update and configure IRN data.
 *
 * The version of the OpenAPI document: 1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.IRNConfiguration.models;

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
import com.factset.sdk.IRNConfiguration.JSON;


/**
 * CommentaryConfigDto
 */
@JsonPropertyOrder({
  CommentaryConfigDto.JSON_PROPERTY_SHOULD_SEND_EMAIL_ALERTS_TO_AUTHOR,
  CommentaryConfigDto.JSON_PROPERTY_SHOULD_SEND_EMAIL_ALERTS_TO_COMMENTERS,
  CommentaryConfigDto.JSON_PROPERTY_SHOULD_SEND_EMAIL_ALERTS_TO_ALL
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CommentaryConfigDto implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_SHOULD_SEND_EMAIL_ALERTS_TO_AUTHOR = "ShouldSendEmailAlertsToAuthor";
  private Boolean shouldSendEmailAlertsToAuthor;

  public static final String JSON_PROPERTY_SHOULD_SEND_EMAIL_ALERTS_TO_COMMENTERS = "ShouldSendEmailAlertsToCommenters";
  private Boolean shouldSendEmailAlertsToCommenters;

  public static final String JSON_PROPERTY_SHOULD_SEND_EMAIL_ALERTS_TO_ALL = "ShouldSendEmailAlertsToAll";
  private Boolean shouldSendEmailAlertsToAll;

  public CommentaryConfigDto() { 
  }

  public CommentaryConfigDto shouldSendEmailAlertsToAuthor(Boolean shouldSendEmailAlertsToAuthor) {
    this.shouldSendEmailAlertsToAuthor = shouldSendEmailAlertsToAuthor;
    return this;
  }

   /**
   * Get shouldSendEmailAlertsToAuthor
   * @return shouldSendEmailAlertsToAuthor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SHOULD_SEND_EMAIL_ALERTS_TO_AUTHOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getShouldSendEmailAlertsToAuthor() {
    return shouldSendEmailAlertsToAuthor;
  }


  @JsonProperty(JSON_PROPERTY_SHOULD_SEND_EMAIL_ALERTS_TO_AUTHOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShouldSendEmailAlertsToAuthor(Boolean shouldSendEmailAlertsToAuthor) {
    this.shouldSendEmailAlertsToAuthor = shouldSendEmailAlertsToAuthor;
  }


  public CommentaryConfigDto shouldSendEmailAlertsToCommenters(Boolean shouldSendEmailAlertsToCommenters) {
    this.shouldSendEmailAlertsToCommenters = shouldSendEmailAlertsToCommenters;
    return this;
  }

   /**
   * Get shouldSendEmailAlertsToCommenters
   * @return shouldSendEmailAlertsToCommenters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SHOULD_SEND_EMAIL_ALERTS_TO_COMMENTERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getShouldSendEmailAlertsToCommenters() {
    return shouldSendEmailAlertsToCommenters;
  }


  @JsonProperty(JSON_PROPERTY_SHOULD_SEND_EMAIL_ALERTS_TO_COMMENTERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShouldSendEmailAlertsToCommenters(Boolean shouldSendEmailAlertsToCommenters) {
    this.shouldSendEmailAlertsToCommenters = shouldSendEmailAlertsToCommenters;
  }


  public CommentaryConfigDto shouldSendEmailAlertsToAll(Boolean shouldSendEmailAlertsToAll) {
    this.shouldSendEmailAlertsToAll = shouldSendEmailAlertsToAll;
    return this;
  }

   /**
   * Get shouldSendEmailAlertsToAll
   * @return shouldSendEmailAlertsToAll
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SHOULD_SEND_EMAIL_ALERTS_TO_ALL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getShouldSendEmailAlertsToAll() {
    return shouldSendEmailAlertsToAll;
  }


  @JsonProperty(JSON_PROPERTY_SHOULD_SEND_EMAIL_ALERTS_TO_ALL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShouldSendEmailAlertsToAll(Boolean shouldSendEmailAlertsToAll) {
    this.shouldSendEmailAlertsToAll = shouldSendEmailAlertsToAll;
  }


  /**
   * Return true if this CommentaryConfigDto object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommentaryConfigDto commentaryConfigDto = (CommentaryConfigDto) o;
    return Objects.equals(this.shouldSendEmailAlertsToAuthor, commentaryConfigDto.shouldSendEmailAlertsToAuthor) &&
        Objects.equals(this.shouldSendEmailAlertsToCommenters, commentaryConfigDto.shouldSendEmailAlertsToCommenters) &&
        Objects.equals(this.shouldSendEmailAlertsToAll, commentaryConfigDto.shouldSendEmailAlertsToAll);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shouldSendEmailAlertsToAuthor, shouldSendEmailAlertsToCommenters, shouldSendEmailAlertsToAll);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommentaryConfigDto {\n");
    sb.append("    shouldSendEmailAlertsToAuthor: ").append(toIndentedString(shouldSendEmailAlertsToAuthor)).append("\n");
    sb.append("    shouldSendEmailAlertsToCommenters: ").append(toIndentedString(shouldSendEmailAlertsToCommenters)).append("\n");
    sb.append("    shouldSendEmailAlertsToAll: ").append(toIndentedString(shouldSendEmailAlertsToAll)).append("\n");
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

