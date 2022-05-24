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


package com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models;

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
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.JSON;


/**
 * Maximum yield based on the ask price.  It represents a hypothetical maximum payout at maturity minus the ask price of the derivative. This key figure represents a theoretically possible best-case scenario, disregarding the probability of occurrence. It is calculated only for securitized derivatives with a limited payout (e.g. capped products).
 */
@ApiModel(description = "Maximum yield based on the ask price.  It represents a hypothetical maximum payout at maturity minus the ask price of the derivative. This key figure represents a theoretically possible best-case scenario, disregarding the probability of occurrence. It is calculated only for securitized derivatives with a limited payout (e.g. capped products).")
@JsonPropertyOrder({
  InlineResponse2003DataMaximumYield.JSON_PROPERTY_ABSOLUTE,
  InlineResponse2003DataMaximumYield.JSON_PROPERTY_RELATIVE,
  InlineResponse2003DataMaximumYield.JSON_PROPERTY_ANNUALIZED
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse2003DataMaximumYield implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ABSOLUTE = "absolute";
  private BigDecimal absolute;

  public static final String JSON_PROPERTY_RELATIVE = "relative";
  private BigDecimal relative;

  public static final String JSON_PROPERTY_ANNUALIZED = "annualized";
  private BigDecimal annualized;

  public InlineResponse2003DataMaximumYield() { 
  }

  public InlineResponse2003DataMaximumYield absolute(BigDecimal absolute) {
    this.absolute = absolute;
    return this;
  }

   /**
   * Maximum yield in absolute terms.
   * @return absolute
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Maximum yield in absolute terms.")
  @JsonProperty(JSON_PROPERTY_ABSOLUTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getAbsolute() {
    return absolute;
  }


  @JsonProperty(JSON_PROPERTY_ABSOLUTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAbsolute(BigDecimal absolute) {
    this.absolute = absolute;
  }


  public InlineResponse2003DataMaximumYield relative(BigDecimal relative) {
    this.relative = relative;
    return this;
  }

   /**
   * Maximum yield relative to the ask price.
   * @return relative
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Maximum yield relative to the ask price.")
  @JsonProperty(JSON_PROPERTY_RELATIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getRelative() {
    return relative;
  }


  @JsonProperty(JSON_PROPERTY_RELATIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRelative(BigDecimal relative) {
    this.relative = relative;
  }


  public InlineResponse2003DataMaximumYield annualized(BigDecimal annualized) {
    this.annualized = annualized;
    return this;
  }

   /**
   * Annualized maximum yield relative to the ask price.
   * @return annualized
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Annualized maximum yield relative to the ask price.")
  @JsonProperty(JSON_PROPERTY_ANNUALIZED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getAnnualized() {
    return annualized;
  }


  @JsonProperty(JSON_PROPERTY_ANNUALIZED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAnnualized(BigDecimal annualized) {
    this.annualized = annualized;
  }


  /**
   * Return true if this inline_response_200_3_data_maximumYield object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2003DataMaximumYield inlineResponse2003DataMaximumYield = (InlineResponse2003DataMaximumYield) o;
    return Objects.equals(this.absolute, inlineResponse2003DataMaximumYield.absolute) &&
        Objects.equals(this.relative, inlineResponse2003DataMaximumYield.relative) &&
        Objects.equals(this.annualized, inlineResponse2003DataMaximumYield.annualized);
  }

  @Override
  public int hashCode() {
    return Objects.hash(absolute, relative, annualized);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2003DataMaximumYield {\n");
    sb.append("    absolute: ").append(toIndentedString(absolute)).append("\n");
    sb.append("    relative: ").append(toIndentedString(relative)).append("\n");
    sb.append("    annualized: ").append(toIndentedString(annualized)).append("\n");
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

