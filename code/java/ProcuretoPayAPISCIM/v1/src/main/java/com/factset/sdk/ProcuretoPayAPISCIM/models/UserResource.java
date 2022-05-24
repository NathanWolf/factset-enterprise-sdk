/*
 * FactSet SCIM API
 * FactSet's SCIM API implementation.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.ProcuretoPayAPISCIM.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.ProcuretoPayAPISCIM.models.UserResourceGroups;
import com.factset.sdk.ProcuretoPayAPISCIM.models.UserResourceMeta;
import com.factset.sdk.ProcuretoPayAPISCIM.models.UserResourceName;
import com.factset.sdk.ProcuretoPayAPISCIM.models.UserResourcePhoneNumbers;
import com.factset.sdk.ProcuretoPayAPISCIM.models.UserResourceUrnScimSchemasExtensionCoreFactset10;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.ProcuretoPayAPISCIM.JSON;


/**
 * UserResource
 */
@JsonPropertyOrder({
  UserResource.JSON_PROPERTY_SCHEMAS,
  UserResource.JSON_PROPERTY_ID,
  UserResource.JSON_PROPERTY_EXTERNAL_ID,
  UserResource.JSON_PROPERTY_USER_NAME,
  UserResource.JSON_PROPERTY_NAME,
  UserResource.JSON_PROPERTY_EMAIL,
  UserResource.JSON_PROPERTY_PHONE_NUMBERS,
  UserResource.JSON_PROPERTY_GROUPS,
  UserResource.JSON_PROPERTY_URN_COLON_SCIM_COLON_SCHEMAS_COLON_EXTENSION_COLON_CORE_FACTSET_COLON10,
  UserResource.JSON_PROPERTY_META
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UserResource implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_SCHEMAS = "schemas";
  private java.util.List<String> schemas = null;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_EXTERNAL_ID = "externalId";
  private String externalId;

  public static final String JSON_PROPERTY_USER_NAME = "userName";
  private String userName;

  public static final String JSON_PROPERTY_NAME = "name";
  private UserResourceName name;

  public static final String JSON_PROPERTY_EMAIL = "email";
  private String email;

  public static final String JSON_PROPERTY_PHONE_NUMBERS = "phoneNumbers";
  private java.util.List<UserResourcePhoneNumbers> phoneNumbers = null;

  public static final String JSON_PROPERTY_GROUPS = "groups";
  private java.util.List<UserResourceGroups> groups = null;

  public static final String JSON_PROPERTY_URN_COLON_SCIM_COLON_SCHEMAS_COLON_EXTENSION_COLON_CORE_FACTSET_COLON10 = "urn:scim:schemas:extension:CoreFactset:1.0";
  private UserResourceUrnScimSchemasExtensionCoreFactset10 urnColonScimColonSchemasColonExtensionColonCoreFactsetColon10;

  public static final String JSON_PROPERTY_META = "meta";
  private UserResourceMeta meta;

  public UserResource() { 
  }

  @JsonCreator
  public UserResource(
    @JsonProperty(JSON_PROPERTY_ID) String id, 
    @JsonProperty(JSON_PROPERTY_USER_NAME) String userName, 
    @JsonProperty(JSON_PROPERTY_PHONE_NUMBERS) java.util.List<UserResourcePhoneNumbers> phoneNumbers, 
    @JsonProperty(JSON_PROPERTY_GROUPS) java.util.List<UserResourceGroups> groups
  ) {
    this();
    this.id = id;
    this.userName = userName;
    this.phoneNumbers = phoneNumbers;
    this.groups = groups;
  }

  public UserResource schemas(java.util.List<String> schemas) {
    this.schemas = schemas;
    return this;
  }

  public UserResource addSchemasItem(String schemasItem) {
    if (this.schemas == null) {
      this.schemas = new java.util.ArrayList<>();
    }
    this.schemas.add(schemasItem);
    return this;
  }

   /**
   * Get schemas
   * @return schemas
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"urn:ietf:params:scim:schemas:core:2.0:User\",\"urn:scim:schemas:extension:FactSet:Core:1.0:User\"]", value = "")
  @JsonProperty(JSON_PROPERTY_SCHEMAS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<String> getSchemas() {
    return schemas;
  }


  @JsonProperty(JSON_PROPERTY_SCHEMAS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSchemas(java.util.List<String> schemas) {
    this.schemas = schemas;
  }


   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "FIN_WEALTH-123456", value = "")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }




  public UserResource externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

   /**
   * Get externalId
   * @return externalId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "C3574707-FFF9-433C-A17F-DFF806C72A7F", value = "")
  @JsonProperty(JSON_PROPERTY_EXTERNAL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExternalId() {
    return externalId;
  }


  @JsonProperty(JSON_PROPERTY_EXTERNAL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }


   /**
   * Unique identifier for the User, typically used by the user to directly authenticate to the service provider. Each User MUST include a non-empty userName value.  This identifier MUST be unique across the service provider&#39;s entire set of Users.
   * @return userName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "FIN_WEALTH-123456", required = true, value = "Unique identifier for the User, typically used by the user to directly authenticate to the service provider. Each User MUST include a non-empty userName value.  This identifier MUST be unique across the service provider's entire set of Users.")
  @JsonProperty(JSON_PROPERTY_USER_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getUserName() {
    return userName;
  }




  public UserResource name(UserResourceName name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public UserResourceName getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(UserResourceName name) {
    this.name = name;
  }


  public UserResource email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Email addresses for the user.  The value SHOULD be canonicalized by the service provider, e.g., &#39;bjensen@example.com&#39; instead of &#39;bjensen@EXAMPLE.COM&#39;.
   * @return email
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "jdoe@factset.com", required = true, value = "Email addresses for the user.  The value SHOULD be canonicalized by the service provider, e.g., 'bjensen@example.com' instead of 'bjensen@EXAMPLE.COM'.")
  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getEmail() {
    return email;
  }


  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEmail(String email) {
    this.email = email;
  }


   /**
   * Phone numbers for the User.  The value SHOULD be canonicalized by the service provider according to the format specified in RFC 3966, e.g., &#39;tel:+1-201-555-0123&#39;. Canonical type values of &#39;main&#39;, &#39;work&#39;, &#39;mobile&#39;, and &#39;home&#39;.
   * @return phoneNumbers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Phone numbers for the User.  The value SHOULD be canonicalized by the service provider according to the format specified in RFC 3966, e.g., 'tel:+1-201-555-0123'. Canonical type values of 'main', 'work', 'mobile', and 'home'.")
  @JsonProperty(JSON_PROPERTY_PHONE_NUMBERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<UserResourcePhoneNumbers> getPhoneNumbers() {
    return phoneNumbers;
  }




   /**
   * A list of groups to which the user belongs, either through direct membership, through nested groups, or dynamically calculated.
   * @return groups
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of groups to which the user belongs, either through direct membership, through nested groups, or dynamically calculated.")
  @JsonProperty(JSON_PROPERTY_GROUPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<UserResourceGroups> getGroups() {
    return groups;
  }




  public UserResource urnColonScimColonSchemasColonExtensionColonCoreFactsetColon10(UserResourceUrnScimSchemasExtensionCoreFactset10 urnColonScimColonSchemasColonExtensionColonCoreFactsetColon10) {
    this.urnColonScimColonSchemasColonExtensionColonCoreFactsetColon10 = urnColonScimColonSchemasColonExtensionColonCoreFactsetColon10;
    return this;
  }

   /**
   * Get urnColonScimColonSchemasColonExtensionColonCoreFactsetColon10
   * @return urnColonScimColonSchemasColonExtensionColonCoreFactsetColon10
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_URN_COLON_SCIM_COLON_SCHEMAS_COLON_EXTENSION_COLON_CORE_FACTSET_COLON10)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UserResourceUrnScimSchemasExtensionCoreFactset10 getUrnColonScimColonSchemasColonExtensionColonCoreFactsetColon10() {
    return urnColonScimColonSchemasColonExtensionColonCoreFactsetColon10;
  }


  @JsonProperty(JSON_PROPERTY_URN_COLON_SCIM_COLON_SCHEMAS_COLON_EXTENSION_COLON_CORE_FACTSET_COLON10)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUrnColonScimColonSchemasColonExtensionColonCoreFactsetColon10(UserResourceUrnScimSchemasExtensionCoreFactset10 urnColonScimColonSchemasColonExtensionColonCoreFactsetColon10) {
    this.urnColonScimColonSchemasColonExtensionColonCoreFactsetColon10 = urnColonScimColonSchemasColonExtensionColonCoreFactsetColon10;
  }


  public UserResource meta(UserResourceMeta meta) {
    this.meta = meta;
    return this;
  }

   /**
   * Get meta
   * @return meta
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_META)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UserResourceMeta getMeta() {
    return meta;
  }


  @JsonProperty(JSON_PROPERTY_META)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMeta(UserResourceMeta meta) {
    this.meta = meta;
  }


  /**
   * Return true if this UserResource object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserResource userResource = (UserResource) o;
    return Objects.equals(this.schemas, userResource.schemas) &&
        Objects.equals(this.id, userResource.id) &&
        Objects.equals(this.externalId, userResource.externalId) &&
        Objects.equals(this.userName, userResource.userName) &&
        Objects.equals(this.name, userResource.name) &&
        Objects.equals(this.email, userResource.email) &&
        Objects.equals(this.phoneNumbers, userResource.phoneNumbers) &&
        Objects.equals(this.groups, userResource.groups) &&
        Objects.equals(this.urnColonScimColonSchemasColonExtensionColonCoreFactsetColon10, userResource.urnColonScimColonSchemasColonExtensionColonCoreFactsetColon10) &&
        Objects.equals(this.meta, userResource.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schemas, id, externalId, userName, name, email, phoneNumbers, groups, urnColonScimColonSchemasColonExtensionColonCoreFactsetColon10, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserResource {\n");
    sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    phoneNumbers: ").append(toIndentedString(phoneNumbers)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    urnColonScimColonSchemasColonExtensionColonCoreFactsetColon10: ").append(toIndentedString(urnColonScimColonSchemasColonExtensionColonCoreFactsetColon10)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
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

