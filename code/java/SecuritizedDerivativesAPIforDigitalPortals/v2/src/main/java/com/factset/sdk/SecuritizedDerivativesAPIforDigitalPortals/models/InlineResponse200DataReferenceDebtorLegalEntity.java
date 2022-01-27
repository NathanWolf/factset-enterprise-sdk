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


package com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models;

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
import java.math.BigDecimal;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.JSON;


/**
 * Legal entity data of the reference debtor that is monitored for credit events. See endpoint &#x60;/legalEntity/list&#x60; for possible values.
 */
@ApiModel(description = "Legal entity data of the reference debtor that is monitored for credit events. See endpoint `/legalEntity/list` for possible values.")
@JsonPropertyOrder({
  InlineResponse200DataReferenceDebtorLegalEntity.JSON_PROPERTY_ID,
  InlineResponse200DataReferenceDebtorLegalEntity.JSON_PROPERTY_NAME,
  InlineResponse200DataReferenceDebtorLegalEntity.JSON_PROPERTY_LEI
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse200DataReferenceDebtorLegalEntity implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ID = "id";
  private BigDecimal id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_LEI = "lei";
  private String lei;


  public InlineResponse200DataReferenceDebtorLegalEntity id(BigDecimal id) {
    this.id = id;
    return this;
  }

   /**
   * Identifier of the reference debtor.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Identifier of the reference debtor.")
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


  public InlineResponse200DataReferenceDebtorLegalEntity name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the reference debtor.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the reference debtor.")
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


  public InlineResponse200DataReferenceDebtorLegalEntity lei(String lei) {
    this.lei = lei;
    return this;
  }

   /**
   * Legal Entity Identifier of the reference debtor.
   * @return lei
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Legal Entity Identifier of the reference debtor.")
  @JsonProperty(JSON_PROPERTY_LEI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLei() {
    return lei;
  }


  @JsonProperty(JSON_PROPERTY_LEI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLei(String lei) {
    this.lei = lei;
  }


  /**
   * Return true if this inline_response_200_data_referenceDebtor_legalEntity object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200DataReferenceDebtorLegalEntity inlineResponse200DataReferenceDebtorLegalEntity = (InlineResponse200DataReferenceDebtorLegalEntity) o;
    return Objects.equals(this.id, inlineResponse200DataReferenceDebtorLegalEntity.id) &&
        Objects.equals(this.name, inlineResponse200DataReferenceDebtorLegalEntity.name) &&
        Objects.equals(this.lei, inlineResponse200DataReferenceDebtorLegalEntity.lei);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, lei);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200DataReferenceDebtorLegalEntity {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    lei: ").append(toIndentedString(lei)).append("\n");
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

