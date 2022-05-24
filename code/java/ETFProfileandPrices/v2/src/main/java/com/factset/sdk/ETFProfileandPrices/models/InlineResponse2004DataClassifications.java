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


package com.factset.sdk.ETFProfileandPrices.models;

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
import com.factset.sdk.ETFProfileandPrices.JSON;


/**
 * InlineResponse2004DataClassifications
 */
@JsonPropertyOrder({
  InlineResponse2004DataClassifications.JSON_PROPERTY_NAME,
  InlineResponse2004DataClassifications.JSON_PROPERTY_WEIGHT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse2004DataClassifications implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_WEIGHT = "weight";
  private BigDecimal weight;

  public InlineResponse2004DataClassifications() { 
  }

  public InlineResponse2004DataClassifications name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the classification. Possible values: \&quot;Developed Market\&quot;, \&quot;Frontier Market\&quot;, \&quot;Emerging Market\&quot;, \&quot;Rest of World Market\&quot;
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the classification. Possible values: \"Developed Market\", \"Frontier Market\", \"Emerging Market\", \"Rest of World Market\"")
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


  public InlineResponse2004DataClassifications weight(BigDecimal weight) {
    this.weight = weight;
    return this;
  }

   /**
   * Weight (net) of the classification.
   * @return weight
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Weight (net) of the classification.")
  @JsonProperty(JSON_PROPERTY_WEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getWeight() {
    return weight;
  }


  @JsonProperty(JSON_PROPERTY_WEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWeight(BigDecimal weight) {
    this.weight = weight;
  }


  /**
   * Return true if this inline_response_200_4_data_classifications object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2004DataClassifications inlineResponse2004DataClassifications = (InlineResponse2004DataClassifications) o;
    return Objects.equals(this.name, inlineResponse2004DataClassifications.name) &&
        Objects.equals(this.weight, inlineResponse2004DataClassifications.weight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, weight);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2004DataClassifications {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
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

