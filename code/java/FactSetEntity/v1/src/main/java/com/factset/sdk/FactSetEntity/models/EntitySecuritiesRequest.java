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
import com.factset.sdk.FactSetEntity.models.SecurityType;
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
 * Entity Securities Request Body
 */
@ApiModel(description = "Entity Securities Request Body")
@JsonPropertyOrder({
  EntitySecuritiesRequest.JSON_PROPERTY_IDS,
  EntitySecuritiesRequest.JSON_PROPERTY_SECURITY_TYPE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class EntitySecuritiesRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_IDS = "ids";
  private java.util.List<String> ids = new java.util.ArrayList<>();

  public static final String JSON_PROPERTY_SECURITY_TYPE = "securityType";
  private SecurityType securityType = SecurityType.EQ;

  public EntitySecuritiesRequest() { 
  }

  @JsonCreator
  public EntitySecuritiesRequest(
    @JsonProperty(value=JSON_PROPERTY_IDS, required=true) java.util.List<String> ids
  ) {
    this();
    this.ids = ids;
  }

  public EntitySecuritiesRequest ids(java.util.List<String> ids) {
    this.ids = ids;
    return this;
  }

  public EntitySecuritiesRequest addIdsItem(String idsItem) {
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


  public EntitySecuritiesRequest securityType(SecurityType securityType) {
    this.securityType = securityType;
    return this;
  }

   /**
   * Get securityType
   * @return securityType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SECURITY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SecurityType getSecurityType() {
    return securityType;
  }


  @JsonProperty(JSON_PROPERTY_SECURITY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSecurityType(SecurityType securityType) {
    this.securityType = securityType;
  }


  /**
   * Return true if this entitySecuritiesRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntitySecuritiesRequest entitySecuritiesRequest = (EntitySecuritiesRequest) o;
    return Objects.equals(this.ids, entitySecuritiesRequest.ids) &&
        Objects.equals(this.securityType, entitySecuritiesRequest.securityType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ids, securityType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntitySecuritiesRequest {\n");
    sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
    sb.append("    securityType: ").append(toIndentedString(securityType)).append("\n");
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

