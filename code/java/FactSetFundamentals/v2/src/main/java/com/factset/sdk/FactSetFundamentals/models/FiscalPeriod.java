/*
 * FactSet Fundamentals API
 * Gain access to current, comprehensive, and comparative information on securities in worldwide developed and emerging markets. Composed of annual and interim/quarterly data, detailed historical financial statement content, per-share data, and calculated ratios, FactSet Fundamentals provides you with the information you need for a global investment perspective. 
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.FactSetFundamentals.models;

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
import com.factset.sdk.FactSetFundamentals.JSON;


/**
 * FiscalPeriod
 */
@JsonPropertyOrder({
  FiscalPeriod.JSON_PROPERTY_START,
  FiscalPeriod.JSON_PROPERTY_END
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FiscalPeriod implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_START = "start";
  private String start;

  public static final String JSON_PROPERTY_END = "end";
  private String end;

  public FiscalPeriod() { 
  }

  public FiscalPeriod start(String start) {
    this.start = start;
    return this;
  }

   /**
   * The fiscal period start expressed as YYYY-MM-DD.  Calendar date that will fall back to the most recently completed period during resolution. 
   * @return start
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2012-01-01", value = "The fiscal period start expressed as YYYY-MM-DD.  Calendar date that will fall back to the most recently completed period during resolution. ")
  @JsonProperty(JSON_PROPERTY_START)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStart() {
    return start;
  }


  @JsonProperty(JSON_PROPERTY_START)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStart(String start) {
    this.start = start;
  }


  public FiscalPeriod end(String end) {
    this.end = end;
    return this;
  }

   /**
   * The fiscal period end expressed YYYY-MM-DD.  Calendar date that will fall back to the most recent completed period during resolution. 
   * @return end
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2014-01-01", value = "The fiscal period end expressed YYYY-MM-DD.  Calendar date that will fall back to the most recent completed period during resolution. ")
  @JsonProperty(JSON_PROPERTY_END)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEnd() {
    return end;
  }


  @JsonProperty(JSON_PROPERTY_END)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnd(String end) {
    this.end = end;
  }


  /**
   * Return true if this fiscalPeriod object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FiscalPeriod fiscalPeriod = (FiscalPeriod) o;
    return Objects.equals(this.start, fiscalPeriod.start) &&
        Objects.equals(this.end, fiscalPeriod.end);
  }

  @Override
  public int hashCode() {
    return Objects.hash(start, end);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FiscalPeriod {\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
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

