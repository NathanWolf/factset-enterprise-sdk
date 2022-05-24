/*
 * PA Engine API
 * Allow clients to fetch PA Engine Analytics through APIs.
 *
 * The version of the OpenAPI document: 2
 * Contact: analytics.api.support@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.PAEngine.models;

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
import com.factset.sdk.PAEngine.JSON;


/**
 * ComponentAccount
 */
@JsonPropertyOrder({
  ComponentAccount.JSON_PROPERTY_ID,
  ComponentAccount.JSON_PROPERTY_NAME,
  ComponentAccount.JSON_PROPERTY_HOLDINGSMODE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ComponentAccount implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_HOLDINGSMODE = "holdingsmode";
  private String holdingsmode;

  public ComponentAccount() { 
  }

  public ComponentAccount id(String id) {
    this.id = id;
    return this;
  }

   /**
   * User&#39;s FactSet account path OR a benchmark id.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "User's FactSet account path OR a benchmark id.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }


  public ComponentAccount name(String name) {
    this.name = name;
    return this;
  }

   /**
   * User&#39;s FactSet account path OR a benchmark name.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "User's FactSet account path OR a benchmark name.")
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


  public ComponentAccount holdingsmode(String holdingsmode) {
    this.holdingsmode = holdingsmode;
    return this;
  }

   /**
   * Holdings Mode.
   * @return holdingsmode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Holdings Mode.")
  @JsonProperty(JSON_PROPERTY_HOLDINGSMODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getHoldingsmode() {
    return holdingsmode;
  }


  @JsonProperty(JSON_PROPERTY_HOLDINGSMODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHoldingsmode(String holdingsmode) {
    this.holdingsmode = holdingsmode;
  }


  /**
   * Return true if this ComponentAccount object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComponentAccount componentAccount = (ComponentAccount) o;
    return Objects.equals(this.id, componentAccount.id) &&
        Objects.equals(this.name, componentAccount.name) &&
        Objects.equals(this.holdingsmode, componentAccount.holdingsmode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, holdingsmode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComponentAccount {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    holdingsmode: ").append(toIndentedString(holdingsmode)).append("\n");
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

