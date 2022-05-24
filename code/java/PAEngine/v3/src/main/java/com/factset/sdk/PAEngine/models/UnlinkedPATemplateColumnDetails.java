/*
 * PA Engine API
 * Allow clients to fetch Analytics through APIs.
 *
 * The version of the OpenAPI document: 3
 * Contact: analytics.api.support@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.PAEngine.models;

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
import com.factset.sdk.PAEngine.JSON;


/**
 * UnlinkedPATemplateColumnDetails
 */
@JsonPropertyOrder({
  UnlinkedPATemplateColumnDetails.JSON_PROPERTY_NAME,
  UnlinkedPATemplateColumnDetails.JSON_PROPERTY_ID,
  UnlinkedPATemplateColumnDetails.JSON_PROPERTY_STATISTICS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UnlinkedPATemplateColumnDetails implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_STATISTICS = "statistics";
  private java.util.List<String> statistics = null;

  public UnlinkedPATemplateColumnDetails() { 
  }

  public UnlinkedPATemplateColumnDetails name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Unlinked template column name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unlinked template column name")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public UnlinkedPATemplateColumnDetails id(String id) {
    this.id = id;
    return this;
  }

   /**
   * FactSet-defined or User-defined Column identifier.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "FactSet-defined or User-defined Column identifier.")
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


  public UnlinkedPATemplateColumnDetails statistics(java.util.List<String> statistics) {
    this.statistics = statistics;
    return this;
  }

  public UnlinkedPATemplateColumnDetails addStatisticsItem(String statisticsItem) {
    if (this.statistics == null) {
      this.statistics = new java.util.ArrayList<>();
    }
    this.statistics.add(statisticsItem);
    return this;
  }

   /**
   * Column Statistic identifier
   * @return statistics
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Column Statistic identifier")
  @JsonProperty(JSON_PROPERTY_STATISTICS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<String> getStatistics() {
    return statistics;
  }


  @JsonProperty(JSON_PROPERTY_STATISTICS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatistics(java.util.List<String> statistics) {
    this.statistics = statistics;
  }


  /**
   * Return true if this UnlinkedPATemplateColumnDetails object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UnlinkedPATemplateColumnDetails unlinkedPATemplateColumnDetails = (UnlinkedPATemplateColumnDetails) o;
    return Objects.equals(this.name, unlinkedPATemplateColumnDetails.name) &&
        Objects.equals(this.id, unlinkedPATemplateColumnDetails.id) &&
        Objects.equals(this.statistics, unlinkedPATemplateColumnDetails.statistics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, id, statistics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UnlinkedPATemplateColumnDetails {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    statistics: ").append(toIndentedString(statistics)).append("\n");
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

