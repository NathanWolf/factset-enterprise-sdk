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
 * InlineResponse20016Data
 */
@JsonPropertyOrder({
  InlineResponse20016Data.JSON_PROPERTY_ID,
  InlineResponse20016Data.JSON_PROPERTY_CODE,
  InlineResponse20016Data.JSON_PROPERTY_NAME,
  InlineResponse20016Data.JSON_PROPERTY_TYPE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse20016Data implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ID = "id";
  private BigDecimal id;

  public static final String JSON_PROPERTY_CODE = "code";
  private String code;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  /**
   * Type of the region.
   */
  public enum TypeEnum {
    CONTINENT("continent"),
    
    COUNTRY("country"),
    
    SUBDIVISION("subdivision"),
    
    MISC("misc"),
    
    COMPOUND("compound");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TYPE = "type";
  private TypeEnum type;

  public InlineResponse20016Data() { 
  }

  public InlineResponse20016Data id(BigDecimal id) {
    this.id = id;
    return this;
  }

   /**
   * Identifier of a region.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Identifier of a region.")
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


  public InlineResponse20016Data code(String code) {
    this.code = code;
    return this;
  }

   /**
   * ISO 3166-1 alpha-2 code of the country. This attribute is set for each country, may be set for miscellaneous regions and is empty for regions of other types.
   * @return code
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ISO 3166-1 alpha-2 code of the country. This attribute is set for each country, may be set for miscellaneous regions and is empty for regions of other types.")
  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCode() {
    return code;
  }


  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCode(String code) {
    this.code = code;
  }


  public InlineResponse20016Data name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the region.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the region.")
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


  public InlineResponse20016Data type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Type of the region.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Type of the region.")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TypeEnum getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(TypeEnum type) {
    this.type = type;
  }


  /**
   * Return true if this inline_response_200_16_data object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20016Data inlineResponse20016Data = (InlineResponse20016Data) o;
    return Objects.equals(this.id, inlineResponse20016Data.id) &&
        Objects.equals(this.code, inlineResponse20016Data.code) &&
        Objects.equals(this.name, inlineResponse20016Data.name) &&
        Objects.equals(this.type, inlineResponse20016Data.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, code, name, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20016Data {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

