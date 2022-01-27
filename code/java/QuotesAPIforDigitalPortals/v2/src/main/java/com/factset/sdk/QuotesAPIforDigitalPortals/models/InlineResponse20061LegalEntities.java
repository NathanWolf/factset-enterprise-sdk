/*
 * Prime Developer Trial
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.QuotesAPIforDigitalPortals.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20048Data;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.QuotesAPIforDigitalPortals.JSON;


/**
 * InlineResponse20061LegalEntities
 */
@JsonPropertyOrder({
  InlineResponse20061LegalEntities.JSON_PROPERTY_ID,
  InlineResponse20061LegalEntities.JSON_PROPERTY_NAME,
  InlineResponse20061LegalEntities.JSON_PROPERTY_COMPLIANCE_PROPERTIES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse20061LegalEntities implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ID = "id";
  private BigDecimal id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_COMPLIANCE_PROPERTIES = "complianceProperties";
  private java.util.List<InlineResponse20048Data> complianceProperties = null;


  public InlineResponse20061LegalEntities id(BigDecimal id) {
    this.id = id;
    return this;
  }

   /**
   * Identifier of a legal entity.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Identifier of a legal entity.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(BigDecimal id) {
    this.id = id;
  }


  public InlineResponse20061LegalEntities name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the legal entity.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the legal entity.")
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


  public InlineResponse20061LegalEntities complianceProperties(java.util.List<InlineResponse20048Data> complianceProperties) {
    this.complianceProperties = complianceProperties;
    return this;
  }

  public InlineResponse20061LegalEntities addCompliancePropertiesItem(InlineResponse20048Data compliancePropertiesItem) {
    if (this.complianceProperties == null) {
      this.complianceProperties = new java.util.ArrayList<>();
    }
    this.complianceProperties.add(compliancePropertiesItem);
    return this;
  }

   /**
   * List of compliance properties.
   * @return complianceProperties
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of compliance properties.")
  @JsonProperty(JSON_PROPERTY_COMPLIANCE_PROPERTIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<InlineResponse20048Data> getComplianceProperties() {
    return complianceProperties;
  }


  @JsonProperty(JSON_PROPERTY_COMPLIANCE_PROPERTIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setComplianceProperties(java.util.List<InlineResponse20048Data> complianceProperties) {
    this.complianceProperties = complianceProperties;
  }


  /**
   * Return true if this inline_response_200_61_legalEntities object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20061LegalEntities inlineResponse20061LegalEntities = (InlineResponse20061LegalEntities) o;
    return Objects.equals(this.id, inlineResponse20061LegalEntities.id) &&
        Objects.equals(this.name, inlineResponse20061LegalEntities.name) &&
        Objects.equals(this.complianceProperties, inlineResponse20061LegalEntities.complianceProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, complianceProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20061LegalEntities {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    complianceProperties: ").append(toIndentedString(complianceProperties)).append("\n");
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

