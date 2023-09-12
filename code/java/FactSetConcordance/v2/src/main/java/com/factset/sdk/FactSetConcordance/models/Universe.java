/*
 * FactSet Concordance API
 *   The FactSet Concordance API enables Application Developers and Data Scientists to programmatically discover the FactSet Identifier for a specific Entity or Person based on attributes, such as name, URL, and location.FactSet Identifiers are mapped to industry-standard identifiers, as well as to a comprehensive set of reference data and unique content, to enhance the ability to quickly connect content sets.<p>     Using the submitted attributes, the FactSet Concordance API leverages FactSet’s extensive Entity Master, People, and Symbology databases to return potential candidate matches and a proposed match. The result is a concorded FactSet Identifier that can then be used as input throughout FactSet's expanding catalog of Content using our Content APIs or Standard DataFeeds.</p>    <b>There are two types of workflows supported in the API:</b>    <b>Entity & People Match:</b> The first workflow follows traditional API conventions in that a request is accepted and a response is returned synchronously enabling the concordance of up to 25 names in a single request. The response returns a list of 20 candidates as well as a proposed match.    <b>Entity & People Match - Bulk:</b> The second workflow allows you to input a large list of names within a .CSV file in a single request With this workflow, a task is created for uploading a set of queries. Once the task has completed, the client retrieves the concordance results through the /entity-decisions or /people-decisions endpoint. Note that in the Bulk workflow, only the matches for the records are returned. Candidates are not included.    Once the service has provided a list of concorded FactSet Identifiers, you can then use our Entity Mappings and People Mappings endpoints to further review the universe of mapped identifiers or modify existing records. </p> 
 *
 * The version of the OpenAPI document: 2.7.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.FactSetConcordance.models;

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
import java.time.OffsetDateTime;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.FactSetConcordance.JSON;


/**
 * Metadata about a single universe
 */
@ApiModel(description = "Metadata about a single universe")
@JsonPropertyOrder({
  Universe.JSON_PROPERTY_UNIVERSE_ID,
  Universe.JSON_PROPERTY_UNIVERSE_NAME,
  Universe.JSON_PROPERTY_UNIVERSE_DESCRIPTION,
  Universe.JSON_PROPERTY_UNIVERSE_TYPE,
  Universe.JSON_PROPERTY_SELF_MANAGED,
  Universe.JSON_PROPERTY_CREATED_BY,
  Universe.JSON_PROPERTY_CREATED_ON,
  Universe.JSON_PROPERTY_UPDATED_BY,
  Universe.JSON_PROPERTY_UPDATED_ON
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Universe implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_UNIVERSE_ID = "universeId";
  private JsonNullable<Integer> universeId = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_UNIVERSE_NAME = "universeName";
  private JsonNullable<String> universeName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_UNIVERSE_DESCRIPTION = "universeDescription";
  private JsonNullable<String> universeDescription = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_UNIVERSE_TYPE = "universeType";
  private JsonNullable<String> universeType = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SELF_MANAGED = "selfManaged";
  private JsonNullable<Boolean> selfManaged = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_CREATED_BY = "createdBy";
  private JsonNullable<String> createdBy = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CREATED_ON = "createdOn";
  private JsonNullable<OffsetDateTime> createdOn = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_UPDATED_BY = "updatedBy";
  private JsonNullable<String> updatedBy = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_UPDATED_ON = "updatedOn";
  private JsonNullable<OffsetDateTime> updatedOn = JsonNullable.<OffsetDateTime>undefined();

  public Universe() { 
  }

  public Universe universeId(Integer universeId) {
    this.universeId = JsonNullable.<Integer>of(universeId);
    return this;
  }

   /**
   * The universe identifier
   * @return universeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "The universe identifier")
  @JsonIgnore

  public Integer getUniverseId() {
        return universeId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_UNIVERSE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getUniverseId_JsonNullable() {
    return universeId;
  }
  
  @JsonProperty(JSON_PROPERTY_UNIVERSE_ID)
  public void setUniverseId_JsonNullable(JsonNullable<Integer> universeId) {
    this.universeId = universeId;
  }

  public void setUniverseId(Integer universeId) {
    this.universeId = JsonNullable.<Integer>of(universeId);
  }


  public Universe universeName(String universeName) {
    this.universeName = JsonNullable.<String>of(universeName);
    return this;
  }

   /**
   * The user specified universe name
   * @return universeName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "My Universe", value = "The user specified universe name")
  @JsonIgnore

  public String getUniverseName() {
        return universeName.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_UNIVERSE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getUniverseName_JsonNullable() {
    return universeName;
  }
  
  @JsonProperty(JSON_PROPERTY_UNIVERSE_NAME)
  public void setUniverseName_JsonNullable(JsonNullable<String> universeName) {
    this.universeName = universeName;
  }

  public void setUniverseName(String universeName) {
    this.universeName = JsonNullable.<String>of(universeName);
  }


  public Universe universeDescription(String universeDescription) {
    this.universeDescription = JsonNullable.<String>of(universeDescription);
    return this;
  }

   /**
   * The user specified universe description
   * @return universeDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "This is a universe", value = "The user specified universe description")
  @JsonIgnore

  public String getUniverseDescription() {
        return universeDescription.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_UNIVERSE_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getUniverseDescription_JsonNullable() {
    return universeDescription;
  }
  
  @JsonProperty(JSON_PROPERTY_UNIVERSE_DESCRIPTION)
  public void setUniverseDescription_JsonNullable(JsonNullable<String> universeDescription) {
    this.universeDescription = universeDescription;
  }

  public void setUniverseDescription(String universeDescription) {
    this.universeDescription = JsonNullable.<String>of(universeDescription);
  }


  public Universe universeType(String universeType) {
    this.universeType = JsonNullable.<String>of(universeType);
    return this;
  }

   /**
   * The user specified universe entity.
   * @return universeType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ENTITY", value = "The user specified universe entity.")
  @JsonIgnore

  public String getUniverseType() {
        return universeType.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_UNIVERSE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getUniverseType_JsonNullable() {
    return universeType;
  }
  
  @JsonProperty(JSON_PROPERTY_UNIVERSE_TYPE)
  public void setUniverseType_JsonNullable(JsonNullable<String> universeType) {
    this.universeType = universeType;
  }

  public void setUniverseType(String universeType) {
    this.universeType = JsonNullable.<String>of(universeType);
  }


  public Universe selfManaged(Boolean selfManaged) {
    this.selfManaged = JsonNullable.<Boolean>of(selfManaged);
    return this;
  }

   /**
   * False if the universe is managed by FactSet Managed Service, True otherwise
   * @return selfManaged
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "False if the universe is managed by FactSet Managed Service, True otherwise")
  @JsonIgnore

  public Boolean getSelfManaged() {
        return selfManaged.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SELF_MANAGED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Boolean> getSelfManaged_JsonNullable() {
    return selfManaged;
  }
  
  @JsonProperty(JSON_PROPERTY_SELF_MANAGED)
  public void setSelfManaged_JsonNullable(JsonNullable<Boolean> selfManaged) {
    this.selfManaged = selfManaged;
  }

  public void setSelfManaged(Boolean selfManaged) {
    this.selfManaged = JsonNullable.<Boolean>of(selfManaged);
  }


  public Universe createdBy(String createdBy) {
    this.createdBy = JsonNullable.<String>of(createdBy);
    return this;
  }

   /**
   * The user who created the universe
   * @return createdBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "FDSQAR_C-000000", value = "The user who created the universe")
  @JsonIgnore

  public String getCreatedBy() {
        return createdBy.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CREATED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getCreatedBy_JsonNullable() {
    return createdBy;
  }
  
  @JsonProperty(JSON_PROPERTY_CREATED_BY)
  public void setCreatedBy_JsonNullable(JsonNullable<String> createdBy) {
    this.createdBy = createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = JsonNullable.<String>of(createdBy);
  }


  public Universe createdOn(OffsetDateTime createdOn) {
    this.createdOn = JsonNullable.<OffsetDateTime>of(createdOn);
    return this;
  }

   /**
   * When the universe was created
   * @return createdOn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "When the universe was created")
  @JsonIgnore

  public OffsetDateTime getCreatedOn() {
        return createdOn.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CREATED_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<OffsetDateTime> getCreatedOn_JsonNullable() {
    return createdOn;
  }
  
  @JsonProperty(JSON_PROPERTY_CREATED_ON)
  public void setCreatedOn_JsonNullable(JsonNullable<OffsetDateTime> createdOn) {
    this.createdOn = createdOn;
  }

  public void setCreatedOn(OffsetDateTime createdOn) {
    this.createdOn = JsonNullable.<OffsetDateTime>of(createdOn);
  }


  public Universe updatedBy(String updatedBy) {
    this.updatedBy = JsonNullable.<String>of(updatedBy);
    return this;
  }

   /**
   * The user who most recently updated the universe metadata
   * @return updatedBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "FDSQAR_C-000000", value = "The user who most recently updated the universe metadata")
  @JsonIgnore

  public String getUpdatedBy() {
        return updatedBy.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_UPDATED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getUpdatedBy_JsonNullable() {
    return updatedBy;
  }
  
  @JsonProperty(JSON_PROPERTY_UPDATED_BY)
  public void setUpdatedBy_JsonNullable(JsonNullable<String> updatedBy) {
    this.updatedBy = updatedBy;
  }

  public void setUpdatedBy(String updatedBy) {
    this.updatedBy = JsonNullable.<String>of(updatedBy);
  }


  public Universe updatedOn(OffsetDateTime updatedOn) {
    this.updatedOn = JsonNullable.<OffsetDateTime>of(updatedOn);
    return this;
  }

   /**
   * When the universe metadata was most recently updated
   * @return updatedOn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "When the universe metadata was most recently updated")
  @JsonIgnore

  public OffsetDateTime getUpdatedOn() {
        return updatedOn.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_UPDATED_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<OffsetDateTime> getUpdatedOn_JsonNullable() {
    return updatedOn;
  }
  
  @JsonProperty(JSON_PROPERTY_UPDATED_ON)
  public void setUpdatedOn_JsonNullable(JsonNullable<OffsetDateTime> updatedOn) {
    this.updatedOn = updatedOn;
  }

  public void setUpdatedOn(OffsetDateTime updatedOn) {
    this.updatedOn = JsonNullable.<OffsetDateTime>of(updatedOn);
  }


  /**
   * Return true if this Universe object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Universe universe = (Universe) o;
    return equalsNullable(this.universeId, universe.universeId) &&
        equalsNullable(this.universeName, universe.universeName) &&
        equalsNullable(this.universeDescription, universe.universeDescription) &&
        equalsNullable(this.universeType, universe.universeType) &&
        equalsNullable(this.selfManaged, universe.selfManaged) &&
        equalsNullable(this.createdBy, universe.createdBy) &&
        equalsNullable(this.createdOn, universe.createdOn) &&
        equalsNullable(this.updatedBy, universe.updatedBy) &&
        equalsNullable(this.updatedOn, universe.updatedOn);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(universeId), hashCodeNullable(universeName), hashCodeNullable(universeDescription), hashCodeNullable(universeType), hashCodeNullable(selfManaged), hashCodeNullable(createdBy), hashCodeNullable(createdOn), hashCodeNullable(updatedBy), hashCodeNullable(updatedOn));
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
    sb.append("class Universe {\n");
    sb.append("    universeId: ").append(toIndentedString(universeId)).append("\n");
    sb.append("    universeName: ").append(toIndentedString(universeName)).append("\n");
    sb.append("    universeDescription: ").append(toIndentedString(universeDescription)).append("\n");
    sb.append("    universeType: ").append(toIndentedString(universeType)).append("\n");
    sb.append("    selfManaged: ").append(toIndentedString(selfManaged)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    updatedBy: ").append(toIndentedString(updatedBy)).append("\n");
    sb.append("    updatedOn: ").append(toIndentedString(updatedOn)).append("\n");
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

