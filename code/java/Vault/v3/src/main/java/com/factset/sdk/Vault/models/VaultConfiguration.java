/*
 * Vault API
 * Allow clients to fetch Analytics through APIs.
 *
 * The version of the OpenAPI document: 3.14.1
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.Vault.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.Vault.models.ConfigurationAccount;
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
import com.factset.sdk.Vault.JSON;


/**
 * VaultConfiguration
 */
@JsonPropertyOrder({
  VaultConfiguration.JSON_PROPERTY_NAME,
  VaultConfiguration.JSON_PROPERTY_ACCOUNTS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class VaultConfiguration implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_NAME = "name";
  private JsonNullable<String> name = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ACCOUNTS = "accounts";
  private JsonNullable<java.util.Map<String, ConfigurationAccount>> accounts = JsonNullable.<java.util.Map<String, ConfigurationAccount>>undefined();

  public VaultConfiguration() { 
  }

  public VaultConfiguration name(String name) {
    this.name = JsonNullable.<String>of(name);
    return this;
  }

   /**
   * Configuration name.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Configuration name.")
  @JsonIgnore

  public String getName() {
        return name.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getName_JsonNullable() {
    return name;
  }
  
  @JsonProperty(JSON_PROPERTY_NAME)
  public void setName_JsonNullable(JsonNullable<String> name) {
    this.name = name;
  }

  public void setName(String name) {
    this.name = JsonNullable.<String>of(name);
  }


  public VaultConfiguration accounts(java.util.Map<String, ConfigurationAccount> accounts) {
    this.accounts = JsonNullable.<java.util.Map<String, ConfigurationAccount>>of(accounts);
    return this;
  }

  public VaultConfiguration putAccountsItem(String key, ConfigurationAccount accountsItem) {
    if (this.accounts == null || !this.accounts.isPresent()) {
      this.accounts = JsonNullable.<java.util.Map<String, ConfigurationAccount>>of(new java.util.HashMap<>());
    }
    try {
      this.accounts.get().put(key, accountsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get accounts
   * @return accounts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public java.util.Map<String, ConfigurationAccount> getAccounts() {
        return accounts.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ACCOUNTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<java.util.Map<String, ConfigurationAccount>> getAccounts_JsonNullable() {
    return accounts;
  }
  
  @JsonProperty(JSON_PROPERTY_ACCOUNTS)
  public void setAccounts_JsonNullable(JsonNullable<java.util.Map<String, ConfigurationAccount>> accounts) {
    this.accounts = accounts;
  }

  public void setAccounts(java.util.Map<String, ConfigurationAccount> accounts) {
    this.accounts = JsonNullable.<java.util.Map<String, ConfigurationAccount>>of(accounts);
  }


  /**
   * Return true if this VaultConfiguration object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VaultConfiguration vaultConfiguration = (VaultConfiguration) o;
    return equalsNullable(this.name, vaultConfiguration.name) &&
        equalsNullable(this.accounts, vaultConfiguration.accounts);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(name), hashCodeNullable(accounts));
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
    sb.append("class VaultConfiguration {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    accounts: ").append(toIndentedString(accounts)).append("\n");
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

