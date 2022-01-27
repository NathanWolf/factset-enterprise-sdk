/*
 * Vault API
 * Allow clients to fetch Vault Analytics through APIs.
 *
 * The version of the OpenAPI document: 2
 * Contact: analytics.api.support@factset.com
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
import com.factset.sdk.Vault.models.PACalculationParameters;
import com.factset.sdk.Vault.models.PubCalculationParameters;
import com.factset.sdk.Vault.models.SPARCalculationParameters;
import com.factset.sdk.Vault.models.VaultCalculationParameters;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.Vault.JSON;


/**
 * Calculation
 */
@JsonPropertyOrder({
  Calculation.JSON_PROPERTY_PA,
  Calculation.JSON_PROPERTY_SPAR,
  Calculation.JSON_PROPERTY_VAULT,
  Calculation.JSON_PROPERTY_PUB
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Calculation implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_PA = "pa";
  private java.util.Map<String, PACalculationParameters> pa = null;

  public static final String JSON_PROPERTY_SPAR = "spar";
  private java.util.Map<String, SPARCalculationParameters> spar = null;

  public static final String JSON_PROPERTY_VAULT = "vault";
  private java.util.Map<String, VaultCalculationParameters> vault = null;

  public static final String JSON_PROPERTY_PUB = "pub";
  private java.util.Map<String, PubCalculationParameters> pub = null;


  public Calculation pa(java.util.Map<String, PACalculationParameters> pa) {
    this.pa = pa;
    return this;
  }

  public Calculation putPaItem(String key, PACalculationParameters paItem) {
    if (this.pa == null) {
      this.pa = new java.util.HashMap<>();
    }
    this.pa.put(key, paItem);
    return this;
  }

   /**
   * List of PA calculation parameters.
   * @return pa
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of PA calculation parameters.")
  @JsonProperty(JSON_PROPERTY_PA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.Map<String, PACalculationParameters> getPa() {
    return pa;
  }


  @JsonProperty(JSON_PROPERTY_PA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPa(java.util.Map<String, PACalculationParameters> pa) {
    this.pa = pa;
  }


  public Calculation spar(java.util.Map<String, SPARCalculationParameters> spar) {
    this.spar = spar;
    return this;
  }

  public Calculation putSparItem(String key, SPARCalculationParameters sparItem) {
    if (this.spar == null) {
      this.spar = new java.util.HashMap<>();
    }
    this.spar.put(key, sparItem);
    return this;
  }

   /**
   * List of SPAR calculation parameters.
   * @return spar
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of SPAR calculation parameters.")
  @JsonProperty(JSON_PROPERTY_SPAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.Map<String, SPARCalculationParameters> getSpar() {
    return spar;
  }


  @JsonProperty(JSON_PROPERTY_SPAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSpar(java.util.Map<String, SPARCalculationParameters> spar) {
    this.spar = spar;
  }


  public Calculation vault(java.util.Map<String, VaultCalculationParameters> vault) {
    this.vault = vault;
    return this;
  }

  public Calculation putVaultItem(String key, VaultCalculationParameters vaultItem) {
    if (this.vault == null) {
      this.vault = new java.util.HashMap<>();
    }
    this.vault.put(key, vaultItem);
    return this;
  }

   /**
   * List of Vault calculation parameters.
   * @return vault
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of Vault calculation parameters.")
  @JsonProperty(JSON_PROPERTY_VAULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.Map<String, VaultCalculationParameters> getVault() {
    return vault;
  }


  @JsonProperty(JSON_PROPERTY_VAULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVault(java.util.Map<String, VaultCalculationParameters> vault) {
    this.vault = vault;
  }


  public Calculation pub(java.util.Map<String, PubCalculationParameters> pub) {
    this.pub = pub;
    return this;
  }

  public Calculation putPubItem(String key, PubCalculationParameters pubItem) {
    if (this.pub == null) {
      this.pub = new java.util.HashMap<>();
    }
    this.pub.put(key, pubItem);
    return this;
  }

   /**
   * List of Publisher calculation parameters.
   * @return pub
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of Publisher calculation parameters.")
  @JsonProperty(JSON_PROPERTY_PUB)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.Map<String, PubCalculationParameters> getPub() {
    return pub;
  }


  @JsonProperty(JSON_PROPERTY_PUB)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPub(java.util.Map<String, PubCalculationParameters> pub) {
    this.pub = pub;
  }


  /**
   * Return true if this Calculation object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Calculation calculation = (Calculation) o;
    return Objects.equals(this.pa, calculation.pa) &&
        Objects.equals(this.spar, calculation.spar) &&
        Objects.equals(this.vault, calculation.vault) &&
        Objects.equals(this.pub, calculation.pub);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pa, spar, vault, pub);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Calculation {\n");
    sb.append("    pa: ").append(toIndentedString(pa)).append("\n");
    sb.append("    spar: ").append(toIndentedString(spar)).append("\n");
    sb.append("    vault: ").append(toIndentedString(vault)).append("\n");
    sb.append("    pub: ").append(toIndentedString(pub)).append("\n");
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

