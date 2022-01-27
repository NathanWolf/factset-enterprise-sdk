/*
 * FactSet Entity API
 * Using an entity centric data model, FactSet's Entity API provides access to FactSet's complete security and entity level symbology, comprehensive entity reference data, and all of the necessary relationships and connections to create a foundation that tightly correlates disparate sources of information to a master entity identifier. Use this API to quickly understand the full entity structure and related securities. 
 *
 * The version of the OpenAPI document: 1.2.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.FactSetEntity.models;

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
import com.factset.sdk.FactSetEntity.JSON;


/**
 * Entity Structure Request Body
 */
@ApiModel(description = "Entity Structure Request Body")
@JsonPropertyOrder({
  EntityStructureRequest.JSON_PROPERTY_IDS,
  EntityStructureRequest.JSON_PROPERTY_LEVEL,
  EntityStructureRequest.JSON_PROPERTY_ACTIVE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class EntityStructureRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_IDS = "ids";
  private java.util.List<String> ids = new java.util.ArrayList<>();

  public static final String JSON_PROPERTY_LEVEL = "level";
  private Integer level = -1;

  public static final String JSON_PROPERTY_ACTIVE = "active";
  private Integer active = -1;


  public EntityStructureRequest ids(java.util.List<String> ids) {
    this.ids = ids;
    return this;
  }

  public EntityStructureRequest addIdsItem(String idsItem) {
    this.ids.add(idsItem);
    return this;
  }

   /**
   * Security or Entity identifiers. FactSet Identifiers, tickers, CUSIP and SEDOL are accepted input. 
   * @return ids
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "[\"FDS-US\",\"0FPWZZ-E\",\"TSLA-US\"]", required = true, value = "Security or Entity identifiers. FactSet Identifiers, tickers, CUSIP and SEDOL are accepted input. ")
  @JsonProperty(JSON_PROPERTY_IDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public java.util.List<String> getIds() {
    return ids;
  }


  @JsonProperty(JSON_PROPERTY_IDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIds(java.util.List<String> ids) {
    this.ids = ids;
  }


  public EntityStructureRequest level(Integer level) {
    this.level = level;
    return this;
  }

   /**
   * Controls the levels returned in the hierarchy. Use -1 to return all levels, or 1-n for a specific level.
   * @return level
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "-1", value = "Controls the levels returned in the hierarchy. Use -1 to return all levels, or 1-n for a specific level.")
  @JsonProperty(JSON_PROPERTY_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getLevel() {
    return level;
  }


  @JsonProperty(JSON_PROPERTY_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLevel(Integer level) {
    this.level = level;
  }


  public EntityStructureRequest active(Integer active) {
    this.active = active;
    return this;
  }

   /**
   * Controls active or inactive securities returned in the hierarchy. Enter 1 to return only active entities, 0 for inactive entities, and -1 for all active and inactive.
   * minimum: -1
   * maximum: 1
   * @return active
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "Controls active or inactive securities returned in the hierarchy. Enter 1 to return only active entities, 0 for inactive entities, and -1 for all active and inactive.")
  @JsonProperty(JSON_PROPERTY_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getActive() {
    return active;
  }


  @JsonProperty(JSON_PROPERTY_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setActive(Integer active) {
    this.active = active;
  }


  /**
   * Return true if this entityStructureRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntityStructureRequest entityStructureRequest = (EntityStructureRequest) o;
    return Objects.equals(this.ids, entityStructureRequest.ids) &&
        Objects.equals(this.level, entityStructureRequest.level) &&
        Objects.equals(this.active, entityStructureRequest.active);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ids, level, active);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityStructureRequest {\n");
    sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
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

