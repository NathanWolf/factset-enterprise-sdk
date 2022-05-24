/*
 * Axioma Equity API
 * Allow clients to fetch Analytics through APIs.
 *
 * The version of the OpenAPI document: 3
 * Contact: analytics.api.support@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.AxiomaEquityOptimizer.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.AxiomaEquityOptimizer.models.OptimizerStrategyOverrides;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.AxiomaEquityOptimizer.JSON;


/**
 * OptimizerStrategy
 */
@JsonPropertyOrder({
  OptimizerStrategy.JSON_PROPERTY_ID,
  OptimizerStrategy.JSON_PROPERTY_OVERRIDES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class OptimizerStrategy implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_OVERRIDES = "overrides";
  private OptimizerStrategyOverrides overrides;

  public OptimizerStrategy() { 
  }

  @JsonCreator
  public OptimizerStrategy(
    @JsonProperty(value=JSON_PROPERTY_ID, required=true) String id
  ) {
    this();
    this.id = id;
  }

  public OptimizerStrategy id(String id) {
    this.id = id;
    return this;
  }

   /**
   * OptimizerStrategy document path
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "OptimizerStrategy document path")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setId(String id) {
    this.id = id;
  }


  public OptimizerStrategy overrides(OptimizerStrategyOverrides overrides) {
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

  public OptimizerStrategyOverrides getOverrides() {
    return overrides;
  }


  @JsonProperty(JSON_PROPERTY_OVERRIDES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOverrides(OptimizerStrategyOverrides overrides) {
    this.overrides = overrides;
  }


  /**
   * Return true if this OptimizerStrategy object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OptimizerStrategy optimizerStrategy = (OptimizerStrategy) o;
    return Objects.equals(this.id, optimizerStrategy.id) &&
        Objects.equals(this.overrides, optimizerStrategy.overrides);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, overrides);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OptimizerStrategy {\n");
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

