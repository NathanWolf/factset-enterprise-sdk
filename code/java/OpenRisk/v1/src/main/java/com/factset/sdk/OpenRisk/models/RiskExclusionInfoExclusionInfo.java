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
 * RiskExclusionInfoExclusionInfo
 */
@JsonPropertyOrder({
  RiskExclusionInfoExclusionInfo.JSON_PROPERTY_CODE,
  RiskExclusionInfoExclusionInfo.JSON_PROPERTY_DETAILS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RiskExclusionInfoExclusionInfo implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Exclusion reason
   */
  public enum CodeEnum {
    NORISKMODELCOVERAGE("NoRiskModelCoverage"),
    
    NORISKMODELACCESS("NoRiskModelAccess"),
    
    CYCLICIDENTIFIERRESOLUTION("CyclicIdentifierResolution"),
    
    NOVALIDCOMPOSITEASSETCONSTITUENTS("NoValidCompositeAssetConstituents"),
    
    INVALIDCOMPOSITEASSETDEFINITION("InvalidCompositeAssetDefinition"),
    
    INTERNALERROR("InternalError"),
    
    UNKNOWN("Unknown");

    private String value;

    CodeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CodeEnum fromValue(String value) {
      for (CodeEnum b : CodeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_CODE = "code";
  private CodeEnum code;

  public static final String JSON_PROPERTY_DETAILS = "details";
  private String details;

  public RiskExclusionInfoExclusionInfo() { 
  }

  @JsonCreator
  public RiskExclusionInfoExclusionInfo(
    @JsonProperty(value=JSON_PROPERTY_CODE, required=true) CodeEnum code, 
    @JsonProperty(value=JSON_PROPERTY_DETAILS, required=true) String details
  ) {
    this();
    this.code = code;
    this.details = details;
  }

  public RiskExclusionInfoExclusionInfo code(CodeEnum code) {
    this.code = code;
    return this;
  }

   /**
   * Exclusion reason
   * @return code
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Exclusion reason")
  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public CodeEnum getCode() {
    return code;
  }


  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCode(CodeEnum code) {
    this.code = code;
  }


  public RiskExclusionInfoExclusionInfo details(String details) {
    this.details = details;
    return this;
  }

   /**
   * Exclusion reason details if available
   * @return details
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Exclusion reason details if available")
  @JsonProperty(JSON_PROPERTY_DETAILS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDetails() {
    return details;
  }


  @JsonProperty(JSON_PROPERTY_DETAILS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDetails(String details) {
    this.details = details;
  }


  /**
   * Return true if this RiskExclusionInfo_exclusionInfo object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RiskExclusionInfoExclusionInfo riskExclusionInfoExclusionInfo = (RiskExclusionInfoExclusionInfo) o;
    return Objects.equals(this.code, riskExclusionInfoExclusionInfo.code) &&
        Objects.equals(this.details, riskExclusionInfoExclusionInfo.details);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, details);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RiskExclusionInfoExclusionInfo {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
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

