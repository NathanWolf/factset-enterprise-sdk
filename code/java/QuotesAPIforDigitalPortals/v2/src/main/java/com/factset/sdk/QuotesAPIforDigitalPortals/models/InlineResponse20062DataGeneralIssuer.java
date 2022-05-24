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
 * Issuer of the investment product.
 */
@ApiModel(description = "Issuer of the investment product.")
@JsonPropertyOrder({
  InlineResponse20062DataGeneralIssuer.JSON_PROPERTY_ID,
  InlineResponse20062DataGeneralIssuer.JSON_PROPERTY_NAME,
  InlineResponse20062DataGeneralIssuer.JSON_PROPERTY_LEI
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse20062DataGeneralIssuer implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ID = "id";
  private BigDecimal id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_LEI = "lei";
  private String lei;

  public InlineResponse20062DataGeneralIssuer() { 
  }

  public InlineResponse20062DataGeneralIssuer id(BigDecimal id) {
    this.id = id;
    return this;
  }

   /**
   * Identifier of the issuer.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Identifier of the issuer.")
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


  public InlineResponse20062DataGeneralIssuer name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the issuer.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the issuer.")
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


  public InlineResponse20062DataGeneralIssuer lei(String lei) {
    this.lei = lei;
    return this;
  }

   /**
   * Legal entity identifier (LEI) of the issuer.
   * @return lei
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Legal entity identifier (LEI) of the issuer.")
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
   * Return true if this inline_response_200_62_data_general_issuer object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20062DataGeneralIssuer inlineResponse20062DataGeneralIssuer = (InlineResponse20062DataGeneralIssuer) o;
    return Objects.equals(this.id, inlineResponse20062DataGeneralIssuer.id) &&
        Objects.equals(this.name, inlineResponse20062DataGeneralIssuer.name) &&
        Objects.equals(this.lei, inlineResponse20062DataGeneralIssuer.lei);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, lei);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20062DataGeneralIssuer {\n");
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

