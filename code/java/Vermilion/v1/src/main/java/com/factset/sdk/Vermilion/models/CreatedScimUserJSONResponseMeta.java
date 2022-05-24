/*
 * VRS API documentation
 * Documentation on all available end points in the VRSAPI
 *
 * The version of the OpenAPI document: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.Vermilion.models;

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
import com.factset.sdk.Vermilion.JSON;


/**
 * CreatedScimUserJSONResponseMeta
 */
@JsonPropertyOrder({
  CreatedScimUserJSONResponseMeta.JSON_PROPERTY_RESOURCE_TYPE,
  CreatedScimUserJSONResponseMeta.JSON_PROPERTY_CREATED,
  CreatedScimUserJSONResponseMeta.JSON_PROPERTY_LAST_MODIFIED,
  CreatedScimUserJSONResponseMeta.JSON_PROPERTY_LOCATION
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreatedScimUserJSONResponseMeta implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_RESOURCE_TYPE = "resourceType";
  private String resourceType;

  public static final String JSON_PROPERTY_CREATED = "created";
  private String created;

  public static final String JSON_PROPERTY_LAST_MODIFIED = "lastModified";
  private String lastModified;

  public static final String JSON_PROPERTY_LOCATION = "location";
  private String location;

  public CreatedScimUserJSONResponseMeta() { 
  }

  public CreatedScimUserJSONResponseMeta resourceType(String resourceType) {
    this.resourceType = resourceType;
    return this;
  }

   /**
   * Get resourceType
   * @return resourceType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RESOURCE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getResourceType() {
    return resourceType;
  }


  @JsonProperty(JSON_PROPERTY_RESOURCE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResourceType(String resourceType) {
    this.resourceType = resourceType;
  }


  public CreatedScimUserJSONResponseMeta created(String created) {
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CREATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCreated() {
    return created;
  }


  @JsonProperty(JSON_PROPERTY_CREATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreated(String created) {
    this.created = created;
  }


  public CreatedScimUserJSONResponseMeta lastModified(String lastModified) {
    this.lastModified = lastModified;
    return this;
  }

   /**
   * Get lastModified
   * @return lastModified
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LAST_MODIFIED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLastModified() {
    return lastModified;
  }


  @JsonProperty(JSON_PROPERTY_LAST_MODIFIED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastModified(String lastModified) {
    this.lastModified = lastModified;
  }


  public CreatedScimUserJSONResponseMeta location(String location) {
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLocation() {
    return location;
  }


  @JsonProperty(JSON_PROPERTY_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLocation(String location) {
    this.location = location;
  }


  /**
   * Return true if this CreatedScimUserJSONResponse_meta object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreatedScimUserJSONResponseMeta createdScimUserJSONResponseMeta = (CreatedScimUserJSONResponseMeta) o;
    return Objects.equals(this.resourceType, createdScimUserJSONResponseMeta.resourceType) &&
        Objects.equals(this.created, createdScimUserJSONResponseMeta.created) &&
        Objects.equals(this.lastModified, createdScimUserJSONResponseMeta.lastModified) &&
        Objects.equals(this.location, createdScimUserJSONResponseMeta.location);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceType, created, lastModified, location);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreatedScimUserJSONResponseMeta {\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
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

