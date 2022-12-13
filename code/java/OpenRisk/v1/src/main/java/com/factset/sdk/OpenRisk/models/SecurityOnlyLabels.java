/*
 * Open:Risk API
 * Service to calculate parametric linear risk statistics and generate risk model asset identifier mappings.
 *
 * The version of the OpenAPI document: 1.22.0
 * Contact: ParametricRiskAnalyticsDevelopment@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.OpenRisk.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.OpenRisk.models.SecurityOnlyLabelsSecurity;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.OpenRisk.JSON;


/**
 * Labeling and index information to be able to reconstruct the calculated data results to the provided inputs from the request. Only contains items relevant to results.
 */
@ApiModel(description = "Labeling and index information to be able to reconstruct the calculated data results to the provided inputs from the request. Only contains items relevant to results.")
@JsonPropertyOrder({
  SecurityOnlyLabels.JSON_PROPERTY_SECURITY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SecurityOnlyLabels implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_SECURITY = "security";
  private SecurityOnlyLabelsSecurity security;

  public SecurityOnlyLabels() { 
  }

  @JsonCreator
  public SecurityOnlyLabels(
    @JsonProperty(value=JSON_PROPERTY_SECURITY, required=true) SecurityOnlyLabelsSecurity security
  ) {
    this();
    this.security = security;
  }

  public SecurityOnlyLabels security(SecurityOnlyLabelsSecurity security) {
    this.security = security;
    return this;
  }

   /**
   * Get security
   * @return security
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_SECURITY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public SecurityOnlyLabelsSecurity getSecurity() {
    return security;
  }


  @JsonProperty(JSON_PROPERTY_SECURITY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSecurity(SecurityOnlyLabelsSecurity security) {
    this.security = security;
  }


  /**
   * Return true if this SecurityOnlyLabels object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityOnlyLabels securityOnlyLabels = (SecurityOnlyLabels) o;
    return Objects.equals(this.security, securityOnlyLabels.security);
  }

  @Override
  public int hashCode() {
    return Objects.hash(security);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityOnlyLabels {\n");
    sb.append("    security: ").append(toIndentedString(security)).append("\n");
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

