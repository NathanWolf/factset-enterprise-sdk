/*
 * FactSet Entity API
 * Using an entity centric data model, FactSet's Entity API provides access to FactSet's complete security and entity level symbology, comprehensive entity reference data, and all of the necessary relationships and connections to create a foundation that tightly correlates disparate sources of information to a master entity identifier. Use this API to quickly understand the full entity structure and related securities. 
 *
 * The version of the OpenAPI document: 1.4.0
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
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.FactSetEntity.JSON;


/**
 * UtlimateEntityStructure
 */
@JsonPropertyOrder({
  UtlimateEntityStructure.JSON_PROPERTY_FSYM_ID,
  UtlimateEntityStructure.JSON_PROPERTY_FSYM_ENTITY_ID,
  UtlimateEntityStructure.JSON_PROPERTY_ULTIMATE_PARENT_ID,
  UtlimateEntityStructure.JSON_PROPERTY_PARENT_ENTITY_ID,
  UtlimateEntityStructure.JSON_PROPERTY_LEVEL,
  UtlimateEntityStructure.JSON_PROPERTY_INACTIVE,
  UtlimateEntityStructure.JSON_PROPERTY_DESCRIPTION,
  UtlimateEntityStructure.JSON_PROPERTY_REQUEST_ID
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UtlimateEntityStructure implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_FSYM_ID = "fsymId";
  private JsonNullable<String> fsymId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_FSYM_ENTITY_ID = "fsymEntityId";
  private JsonNullable<String> fsymEntityId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ULTIMATE_PARENT_ID = "ultimateParentId";
  private JsonNullable<String> ultimateParentId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PARENT_ENTITY_ID = "parentEntityId";
  private JsonNullable<String> parentEntityId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_LEVEL = "level";
  private JsonNullable<Integer> level = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_INACTIVE = "inactive";
  private JsonNullable<Integer> inactive = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private JsonNullable<String> description = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_REQUEST_ID = "requestId";
  private String requestId;

  public UtlimateEntityStructure() { 
  }

  public UtlimateEntityStructure fsymId(String fsymId) {
    this.fsymId = JsonNullable.<String>of(fsymId);
    return this;
  }

   /**
   * Unique FactSet-generated identifier representing an entity for the current entity identifier (-E)
   * @return fsymId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "001MF1-E", value = "Unique FactSet-generated identifier representing an entity for the current entity identifier (-E)")
  @JsonIgnore

  public String getFsymId() {
        return fsymId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FSYM_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getFsymId_JsonNullable() {
    return fsymId;
  }
  
  @JsonProperty(JSON_PROPERTY_FSYM_ID)
  public void setFsymId_JsonNullable(JsonNullable<String> fsymId) {
    this.fsymId = fsymId;
  }

  public void setFsymId(String fsymId) {
    this.fsymId = JsonNullable.<String>of(fsymId);
  }


  public UtlimateEntityStructure fsymEntityId(String fsymEntityId) {
    this.fsymEntityId = JsonNullable.<String>of(fsymEntityId);
    return this;
  }

   /**
   * Unique FactSet-generated identifier representing an entity
   * @return fsymEntityId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "001MF1-E", value = "Unique FactSet-generated identifier representing an entity")
  @JsonIgnore

  public String getFsymEntityId() {
        return fsymEntityId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FSYM_ENTITY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getFsymEntityId_JsonNullable() {
    return fsymEntityId;
  }
  
  @JsonProperty(JSON_PROPERTY_FSYM_ENTITY_ID)
  public void setFsymEntityId_JsonNullable(JsonNullable<String> fsymEntityId) {
    this.fsymEntityId = fsymEntityId;
  }

  public void setFsymEntityId(String fsymEntityId) {
    this.fsymEntityId = JsonNullable.<String>of(fsymEntityId);
  }


  public UtlimateEntityStructure ultimateParentId(String ultimateParentId) {
    this.ultimateParentId = JsonNullable.<String>of(ultimateParentId);
    return this;
  }

   /**
   * The ultimate parent id of the entity.
   * @return ultimateParentId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "001MF1-E", value = "The ultimate parent id of the entity.")
  @JsonIgnore

  public String getUltimateParentId() {
        return ultimateParentId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ULTIMATE_PARENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getUltimateParentId_JsonNullable() {
    return ultimateParentId;
  }
  
  @JsonProperty(JSON_PROPERTY_ULTIMATE_PARENT_ID)
  public void setUltimateParentId_JsonNullable(JsonNullable<String> ultimateParentId) {
    this.ultimateParentId = ultimateParentId;
  }

  public void setUltimateParentId(String ultimateParentId) {
    this.ultimateParentId = JsonNullable.<String>of(ultimateParentId);
  }


  public UtlimateEntityStructure parentEntityId(String parentEntityId) {
    this.parentEntityId = JsonNullable.<String>of(parentEntityId);
    return this;
  }

   /**
   * Within the hierarchy, this id represents the immediate parent entity id for the level directly above. Ultimate parent id will return a blank string.
   * @return parentEntityId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "001MF1-E", value = "Within the hierarchy, this id represents the immediate parent entity id for the level directly above. Ultimate parent id will return a blank string.")
  @JsonIgnore

  public String getParentEntityId() {
        return parentEntityId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PARENT_ENTITY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getParentEntityId_JsonNullable() {
    return parentEntityId;
  }
  
  @JsonProperty(JSON_PROPERTY_PARENT_ENTITY_ID)
  public void setParentEntityId_JsonNullable(JsonNullable<String> parentEntityId) {
    this.parentEntityId = parentEntityId;
  }

  public void setParentEntityId(String parentEntityId) {
    this.parentEntityId = JsonNullable.<String>of(parentEntityId);
  }


  public UtlimateEntityStructure level(Integer level) {
    this.level = JsonNullable.<Integer>of(level);
    return this;
  }

   /**
   * Level within the ultimate entity structure. This is taken from the perspective of the ultimate parent id and the full entity hierarchy.
   * @return level
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3", value = "Level within the ultimate entity structure. This is taken from the perspective of the ultimate parent id and the full entity hierarchy.")
  @JsonIgnore

  public Integer getLevel() {
        return level.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getLevel_JsonNullable() {
    return level;
  }
  
  @JsonProperty(JSON_PROPERTY_LEVEL)
  public void setLevel_JsonNullable(JsonNullable<Integer> level) {
    this.level = level;
  }

  public void setLevel(Integer level) {
    this.level = JsonNullable.<Integer>of(level);
  }


  public UtlimateEntityStructure inactive(Integer inactive) {
    this.inactive = JsonNullable.<Integer>of(inactive);
    return this;
  }

   /**
   * A flag for inactive securities; whereby 1 &#x3D; inactive and 0 &#x3D; active.
   * @return inactive
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "A flag for inactive securities; whereby 1 = inactive and 0 = active.")
  @JsonIgnore

  public Integer getInactive() {
        return inactive.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_INACTIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getInactive_JsonNullable() {
    return inactive;
  }
  
  @JsonProperty(JSON_PROPERTY_INACTIVE)
  public void setInactive_JsonNullable(JsonNullable<Integer> inactive) {
    this.inactive = inactive;
  }

  public void setInactive(Integer inactive) {
    this.inactive = JsonNullable.<Integer>of(inactive);
  }


  public UtlimateEntityStructure description(String description) {
    this.description = JsonNullable.<String>of(description);
    return this;
  }

   /**
   * The proper name and entity type for the entity.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Whole Foods Market, Inc. (Subsidiary)", value = "The proper name and entity type for the entity.")
  @JsonIgnore

  public String getDescription() {
        return description.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getDescription_JsonNullable() {
    return description;
  }
  
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  public void setDescription_JsonNullable(JsonNullable<String> description) {
    this.description = description;
  }

  public void setDescription(String description) {
    this.description = JsonNullable.<String>of(description);
  }


  public UtlimateEntityStructure requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

   /**
   * Identifier used in &#x60;ids&#x60;.
   * @return requestId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "AMZN-US", value = "Identifier used in `ids`.")
  @JsonProperty(JSON_PROPERTY_REQUEST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRequestId() {
    return requestId;
  }


  @JsonProperty(JSON_PROPERTY_REQUEST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }


  /**
   * Return true if this utlimateEntityStructure object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UtlimateEntityStructure utlimateEntityStructure = (UtlimateEntityStructure) o;
    return equalsNullable(this.fsymId, utlimateEntityStructure.fsymId) &&
        equalsNullable(this.fsymEntityId, utlimateEntityStructure.fsymEntityId) &&
        equalsNullable(this.ultimateParentId, utlimateEntityStructure.ultimateParentId) &&
        equalsNullable(this.parentEntityId, utlimateEntityStructure.parentEntityId) &&
        equalsNullable(this.level, utlimateEntityStructure.level) &&
        equalsNullable(this.inactive, utlimateEntityStructure.inactive) &&
        equalsNullable(this.description, utlimateEntityStructure.description) &&
        Objects.equals(this.requestId, utlimateEntityStructure.requestId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(fsymId), hashCodeNullable(fsymEntityId), hashCodeNullable(ultimateParentId), hashCodeNullable(parentEntityId), hashCodeNullable(level), hashCodeNullable(inactive), hashCodeNullable(description), requestId);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UtlimateEntityStructure {\n");
    sb.append("    fsymId: ").append(toIndentedString(fsymId)).append("\n");
    sb.append("    fsymEntityId: ").append(toIndentedString(fsymEntityId)).append("\n");
    sb.append("    ultimateParentId: ").append(toIndentedString(ultimateParentId)).append("\n");
    sb.append("    parentEntityId: ").append(toIndentedString(parentEntityId)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    inactive: ").append(toIndentedString(inactive)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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

