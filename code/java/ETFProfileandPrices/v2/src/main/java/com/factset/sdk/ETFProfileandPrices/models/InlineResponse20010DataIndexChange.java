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


package com.factset.sdk.ETFProfileandPrices.models;

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
import java.time.LocalDate;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.ETFProfileandPrices.JSON;


/**
 * Index change.
 */
@ApiModel(description = "Index change.")
@JsonPropertyOrder({
  InlineResponse20010DataIndexChange.JSON_PROPERTY_HAS_CHANGED,
  InlineResponse20010DataIndexChange.JSON_PROPERTY_DATE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse20010DataIndexChange implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_HAS_CHANGED = "hasChanged";
  private Boolean hasChanged;

  public static final String JSON_PROPERTY_DATE = "date";
  private LocalDate date;

  public InlineResponse20010DataIndexChange() { 
  }

  public InlineResponse20010DataIndexChange hasChanged(Boolean hasChanged) {
    this.hasChanged = hasChanged;
    return this;
  }

   /**
   * States whether an index change has occurred. Available for the regions: US.
   * @return hasChanged
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "States whether an index change has occurred. Available for the regions: US.")
  @JsonProperty(JSON_PROPERTY_HAS_CHANGED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getHasChanged() {
    return hasChanged;
  }


  @JsonProperty(JSON_PROPERTY_HAS_CHANGED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHasChanged(Boolean hasChanged) {
    this.hasChanged = hasChanged;
  }


  public InlineResponse20010DataIndexChange date(LocalDate date) {
    this.date = date;
    return this;
  }

   /**
   * Date of the most recent index change, if applicable. Available for the regions: US.
   * @return date
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date of the most recent index change, if applicable. Available for the regions: US.")
  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LocalDate getDate() {
    return date;
  }


  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDate(LocalDate date) {
    this.date = date;
  }


  /**
   * Return true if this inline_response_200_10_data_indexChange object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20010DataIndexChange inlineResponse20010DataIndexChange = (InlineResponse20010DataIndexChange) o;
    return Objects.equals(this.hasChanged, inlineResponse20010DataIndexChange.hasChanged) &&
        Objects.equals(this.date, inlineResponse20010DataIndexChange.date);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hasChanged, date);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20010DataIndexChange {\n");
    sb.append("    hasChanged: ").append(toIndentedString(hasChanged)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
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

