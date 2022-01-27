/*
 * Engines API
 * Allow clients to fetch Engines Analytics through APIs.
 *
 * The version of the OpenAPI document: 1
 * Contact: analytics.api.support@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.FactSetPortfolioOptimizer.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.FactSetPortfolioOptimizer.models.OptimizerAccountOverrides;
import com.factset.sdk.FactSetPortfolioOptimizer.models.PaDoc;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.FactSetPortfolioOptimizer.JSON;


/**
 * FPOAccount
 */
@JsonPropertyOrder({
  FPOAccount.JSON_PROPERTY_PADOCUMENT,
  FPOAccount.JSON_PROPERTY_ID,
  FPOAccount.JSON_PROPERTY_OVERRIDES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FPOAccount implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_PADOCUMENT = "padocument";
  private PaDoc padocument;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_OVERRIDES = "overrides";
  private OptimizerAccountOverrides overrides;


  public FPOAccount padocument(PaDoc padocument) {
    this.padocument = padocument;
    return this;
  }

   /**
   * Get padocument
   * @return padocument
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_PADOCUMENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public PaDoc getPadocument() {
    return padocument;
  }


  @JsonProperty(JSON_PROPERTY_PADOCUMENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPadocument(PaDoc padocument) {
    this.padocument = padocument;
  }


  public FPOAccount id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Account path
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Account path")
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


  public FPOAccount overrides(OptimizerAccountOverrides overrides) {
    this.overrides = overrides;
    return this;
  }

   /**
   * Get overrides
   * @return overrides
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OVERRIDES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OptimizerAccountOverrides getOverrides() {
    return overrides;
  }


  @JsonProperty(JSON_PROPERTY_OVERRIDES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOverrides(OptimizerAccountOverrides overrides) {
    this.overrides = overrides;
  }


  /**
   * Return true if this FPOAccount object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FPOAccount fpOAccount = (FPOAccount) o;
    return Objects.equals(this.padocument, fpOAccount.padocument) &&
        Objects.equals(this.id, fpOAccount.id) &&
        Objects.equals(this.overrides, fpOAccount.overrides);
  }

  @Override
  public int hashCode() {
    return Objects.hash(padocument, id, overrides);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FPOAccount {\n");
    sb.append("    padocument: ").append(toIndentedString(padocument)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    overrides: ").append(toIndentedString(overrides)).append("\n");
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

