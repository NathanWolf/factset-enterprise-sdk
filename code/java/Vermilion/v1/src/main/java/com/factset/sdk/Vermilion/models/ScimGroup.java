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
import com.factset.sdk.Vermilion.models.ScimGroupMember;
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
 * ScimGroup
 */
@JsonPropertyOrder({
  ScimGroup.JSON_PROPERTY_ID,
  ScimGroup.JSON_PROPERTY_DISPLAY_NAME,
  ScimGroup.JSON_PROPERTY_MEMBERS,
  ScimGroup.JSON_PROPERTY_TENANT,
  ScimGroup.JSON_PROPERTY_DOMAIN_CODE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ScimGroup implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_DISPLAY_NAME = "displayName";
  private String displayName;

  public static final String JSON_PROPERTY_MEMBERS = "members";
  private ScimGroupMember members;

  public static final String JSON_PROPERTY_TENANT = "tenant";
  private String tenant;

  public static final String JSON_PROPERTY_DOMAIN_CODE = "domainCode";
  private String domainCode;

  public ScimGroup() { 
  }

  public ScimGroup id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
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


  public ScimGroup displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * Get displayName
   * @return displayName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDisplayName() {
    return displayName;
  }


  @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public ScimGroup members(ScimGroupMember members) {
    this.members = members;
    return this;
  }

   /**
   * Get members
   * @return members
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MEMBERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ScimGroupMember getMembers() {
    return members;
  }


  @JsonProperty(JSON_PROPERTY_MEMBERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMembers(ScimGroupMember members) {
    this.members = members;
  }


  public ScimGroup tenant(String tenant) {
    this.tenant = tenant;
    return this;
  }

   /**
   * Get tenant
   * @return tenant
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TENANT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTenant() {
    return tenant;
  }


  @JsonProperty(JSON_PROPERTY_TENANT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTenant(String tenant) {
    this.tenant = tenant;
  }


  public ScimGroup domainCode(String domainCode) {
    this.domainCode = domainCode;
    return this;
  }

   /**
   * Get domainCode
   * @return domainCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DOMAIN_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDomainCode() {
    return domainCode;
  }


  @JsonProperty(JSON_PROPERTY_DOMAIN_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDomainCode(String domainCode) {
    this.domainCode = domainCode;
  }


  /**
   * Return true if this ScimGroup object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScimGroup scimGroup = (ScimGroup) o;
    return Objects.equals(this.id, scimGroup.id) &&
        Objects.equals(this.displayName, scimGroup.displayName) &&
        Objects.equals(this.members, scimGroup.members) &&
        Objects.equals(this.tenant, scimGroup.tenant) &&
        Objects.equals(this.domainCode, scimGroup.domainCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, displayName, members, tenant, domainCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScimGroup {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    members: ").append(toIndentedString(members)).append("\n");
    sb.append("    tenant: ").append(toIndentedString(tenant)).append("\n");
    sb.append("    domainCode: ").append(toIndentedString(domainCode)).append("\n");
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

