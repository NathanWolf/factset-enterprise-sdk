/*
 * EMS API
 * Allow clients to trade orders.
 *
 * The version of the OpenAPI document: 1
 * Contact: analytics.api.support@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.FactSetTrading.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.FactSetTrading.models.EMSOrdersCreateResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.FactSetTrading.JSON;


/**
 * EMSOrdersCreateResponseRoot
 */
@JsonPropertyOrder({
  EMSOrdersCreateResponseRoot.JSON_PROPERTY_DATA
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class EMSOrdersCreateResponseRoot implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_DATA = "data";
  private EMSOrdersCreateResponse data;

  public EMSOrdersCreateResponseRoot() { 
  }

  @JsonCreator
  public EMSOrdersCreateResponseRoot(
    @JsonProperty(value=JSON_PROPERTY_DATA, required=true) EMSOrdersCreateResponse data
  ) {
    this();
    this.data = data;
  }

  public EMSOrdersCreateResponseRoot data(EMSOrdersCreateResponse data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public EMSOrdersCreateResponse getData() {
    return data;
  }


  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setData(EMSOrdersCreateResponse data) {
    this.data = data;
  }


  /**
   * Return true if this EMSOrdersCreateResponseRoot object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EMSOrdersCreateResponseRoot emSOrdersCreateResponseRoot = (EMSOrdersCreateResponseRoot) o;
    return Objects.equals(this.data, emSOrdersCreateResponseRoot.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EMSOrdersCreateResponseRoot {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

