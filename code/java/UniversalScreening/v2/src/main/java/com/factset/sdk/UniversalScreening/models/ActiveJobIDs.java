/*
 * Universal Screening API
 * Through the Universal Screening API, you can access the power of FactSet's Universal Screening Application. Calculate and return the results of your saved Universal Screens.
 *
 * The version of the OpenAPI document: 1.0.2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.UniversalScreening.models;

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
import com.factset.sdk.UniversalScreening.JSON;


/**
 * Array of active jobs ids associated with the account
 */
@ApiModel(description = "Array of active jobs ids associated with the account")
@JsonPropertyOrder({
  ActiveJobIDs.JSON_PROPERTY_ID
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ActiveJobIDs implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ID = "id";
  private java.util.List<String> id = null;

  public ActiveJobIDs() { 
  }

  public ActiveJobIDs id(java.util.List<String> id) {
    this.id = id;
    return this;
  }

  public ActiveJobIDs addIdItem(String idItem) {
    if (this.id == null) {
      this.id = new java.util.ArrayList<>();
    }
    this.id.add(idItem);
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

  public java.util.List<String> getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(java.util.List<String> id) {
    this.id = id;
  }


  /**
   * Return true if this ActiveJobIDs object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActiveJobIDs activeJobIDs = (ActiveJobIDs) o;
    return Objects.equals(this.id, activeJobIDs.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActiveJobIDs {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

