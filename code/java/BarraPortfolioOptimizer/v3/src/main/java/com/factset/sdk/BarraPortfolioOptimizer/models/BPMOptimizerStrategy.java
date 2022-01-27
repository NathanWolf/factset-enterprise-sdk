/*
 * Barra Portfolio Optimizer API
 * Allow clients to fetch Analytics through APIs.
 *
 * The version of the OpenAPI document: 3
 * Contact: analytics.api.support@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.BarraPortfolioOptimizer.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.BarraPortfolioOptimizer.models.BPMOptimizerStrategyOverrides;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.BarraPortfolioOptimizer.JSON;


/**
 * BPMOptimizerStrategy
 */
@JsonPropertyOrder({
  BPMOptimizerStrategy.JSON_PROPERTY_OVERRIDES,
  BPMOptimizerStrategy.JSON_PROPERTY_ID
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class BPMOptimizerStrategy implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_OVERRIDES = "overrides";
  private BPMOptimizerStrategyOverrides overrides;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;


  public BPMOptimizerStrategy overrides(BPMOptimizerStrategyOverrides overrides) {
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

  public BPMOptimizerStrategyOverrides getOverrides() {
    return overrides;
  }


  @JsonProperty(JSON_PROPERTY_OVERRIDES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOverrides(BPMOptimizerStrategyOverrides overrides) {
    this.overrides = overrides;
  }


  public BPMOptimizerStrategy id(String id) {
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


  /**
   * Return true if this BPMOptimizerStrategy object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BPMOptimizerStrategy bpMOptimizerStrategy = (BPMOptimizerStrategy) o;
    return Objects.equals(this.overrides, bpMOptimizerStrategy.overrides) &&
        Objects.equals(this.id, bpMOptimizerStrategy.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(overrides, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BPMOptimizerStrategy {\n");
    sb.append("    overrides: ").append(toIndentedString(overrides)).append("\n");
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

