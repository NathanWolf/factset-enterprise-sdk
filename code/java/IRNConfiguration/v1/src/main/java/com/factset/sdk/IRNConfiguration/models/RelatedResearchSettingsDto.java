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
 * RelatedResearchSettingsDto
 */
@JsonPropertyOrder({
  RelatedResearchSettingsDto.JSON_PROPERTY_IS_HIDDEN,
  RelatedResearchSettingsDto.JSON_PROPERTY_IS_MANDATORY,
  RelatedResearchSettingsDto.JSON_PROPERTY_USE_PREVIOUS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RelatedResearchSettingsDto implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_IS_HIDDEN = "isHidden";
  private Boolean isHidden;

  public static final String JSON_PROPERTY_IS_MANDATORY = "isMandatory";
  private Boolean isMandatory;

  public static final String JSON_PROPERTY_USE_PREVIOUS = "usePrevious";
  private Boolean usePrevious;

  public RelatedResearchSettingsDto() { 
  }

  public RelatedResearchSettingsDto isHidden(Boolean isHidden) {
    this.isHidden = isHidden;
    return this;
  }

   /**
   * Get isHidden
   * @return isHidden
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IS_HIDDEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsHidden() {
    return isHidden;
  }


  @JsonProperty(JSON_PROPERTY_IS_HIDDEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsHidden(Boolean isHidden) {
    this.isHidden = isHidden;
  }


  public RelatedResearchSettingsDto isMandatory(Boolean isMandatory) {
    this.isMandatory = isMandatory;
    return this;
  }

   /**
   * Get isMandatory
   * @return isMandatory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IS_MANDATORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsMandatory() {
    return isMandatory;
  }


  @JsonProperty(JSON_PROPERTY_IS_MANDATORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsMandatory(Boolean isMandatory) {
    this.isMandatory = isMandatory;
  }


  public RelatedResearchSettingsDto usePrevious(Boolean usePrevious) {
    this.usePrevious = usePrevious;
    return this;
  }

   /**
   * Get usePrevious
   * @return usePrevious
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_USE_PREVIOUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getUsePrevious() {
    return usePrevious;
  }


  @JsonProperty(JSON_PROPERTY_USE_PREVIOUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUsePrevious(Boolean usePrevious) {
    this.usePrevious = usePrevious;
  }


  /**
   * Return true if this RelatedResearchSettingsDto object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RelatedResearchSettingsDto relatedResearchSettingsDto = (RelatedResearchSettingsDto) o;
    return Objects.equals(this.isHidden, relatedResearchSettingsDto.isHidden) &&
        Objects.equals(this.isMandatory, relatedResearchSettingsDto.isMandatory) &&
        Objects.equals(this.usePrevious, relatedResearchSettingsDto.usePrevious);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isHidden, isMandatory, usePrevious);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RelatedResearchSettingsDto {\n");
    sb.append("    isHidden: ").append(toIndentedString(isHidden)).append("\n");
    sb.append("    isMandatory: ").append(toIndentedString(isMandatory)).append("\n");
    sb.append("    usePrevious: ").append(toIndentedString(usePrevious)).append("\n");
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

