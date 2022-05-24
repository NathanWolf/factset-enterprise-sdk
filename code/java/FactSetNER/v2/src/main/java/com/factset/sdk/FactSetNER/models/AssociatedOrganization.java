/*
 * FactSet NER
 * Extract named entities and their FactSet entity IDs from given document text.
 *
 * The version of the OpenAPI document: 2.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.FactSetNER.models;

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
import com.factset.sdk.FactSetNER.JSON;


/**
 * AssociatedOrganization
 */
@JsonPropertyOrder({
  AssociatedOrganization.JSON_PROPERTY_NAME,
  AssociatedOrganization.JSON_PROPERTY_ENTITY_ID,
  AssociatedOrganization.JSON_PROPERTY_LOOKUP_URL
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AssociatedOrganization implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_ENTITY_ID = "entityId";
  private String entityId;

  public static final String JSON_PROPERTY_LOOKUP_URL = "lookupUrl";
  private String lookupUrl;

  public AssociatedOrganization() { 
  }

  public AssociatedOrganization name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the entity
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the entity")
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


  public AssociatedOrganization entityId(String entityId) {
    this.entityId = entityId;
    return this;
  }

   /**
   * FactSet Entity ID for the entity
   * @return entityId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "FactSet Entity ID for the entity")
  @JsonProperty(JSON_PROPERTY_ENTITY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEntityId() {
    return entityId;
  }


  @JsonProperty(JSON_PROPERTY_ENTITY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEntityId(String entityId) {
    this.entityId = entityId;
  }


  public AssociatedOrganization lookupUrl(String lookupUrl) {
    this.lookupUrl = lookupUrl;
    return this;
  }

   /**
   * FactSet description of the entity
   * @return lookupUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "FactSet description of the entity")
  @JsonProperty(JSON_PROPERTY_LOOKUP_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLookupUrl() {
    return lookupUrl;
  }


  @JsonProperty(JSON_PROPERTY_LOOKUP_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLookupUrl(String lookupUrl) {
    this.lookupUrl = lookupUrl;
  }


  /**
   * Return true if this Associated_Organization object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssociatedOrganization associatedOrganization = (AssociatedOrganization) o;
    return Objects.equals(this.name, associatedOrganization.name) &&
        Objects.equals(this.entityId, associatedOrganization.entityId) &&
        Objects.equals(this.lookupUrl, associatedOrganization.lookupUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, entityId, lookupUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssociatedOrganization {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    lookupUrl: ").append(toIndentedString(lookupUrl)).append("\n");
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

