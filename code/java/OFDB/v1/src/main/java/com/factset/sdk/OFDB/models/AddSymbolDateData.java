/*
 * OFDB API
 * OFDB api
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: client.portfolio.data.engineering@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.OFDB.models;

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
import com.factset.sdk.OFDB.JSON;


/**
 * AddSymbolDateData
 */
@JsonPropertyOrder({
  AddSymbolDateData.JSON_PROPERTY_FIELD1,
  AddSymbolDateData.JSON_PROPERTY_FIELD2
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AddSymbolDateData implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_FIELD1 = "field_1";
  private String field1;

  public static final String JSON_PROPERTY_FIELD2 = "field_2";
  private Integer field2;

  public AddSymbolDateData() { 
  }

  public AddSymbolDateData field1(String field1) {
    this.field1 = field1;
    return this;
  }

   /**
   * Get field1
   * @return field1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FIELD1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getField1() {
    return field1;
  }


  @JsonProperty(JSON_PROPERTY_FIELD1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setField1(String field1) {
    this.field1 = field1;
  }


  public AddSymbolDateData field2(Integer field2) {
    this.field2 = field2;
    return this;
  }

   /**
   * Get field2
   * @return field2
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FIELD2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getField2() {
    return field2;
  }


  @JsonProperty(JSON_PROPERTY_FIELD2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setField2(Integer field2) {
    this.field2 = field2;
  }


  /**
   * Return true if this AddSymbolDate_data object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddSymbolDateData addSymbolDateData = (AddSymbolDateData) o;
    return Objects.equals(this.field1, addSymbolDateData.field1) &&
        Objects.equals(this.field2, addSymbolDateData.field2);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field1, field2);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddSymbolDateData {\n");
    sb.append("    field1: ").append(toIndentedString(field1)).append("\n");
    sb.append("    field2: ").append(toIndentedString(field2)).append("\n");
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

