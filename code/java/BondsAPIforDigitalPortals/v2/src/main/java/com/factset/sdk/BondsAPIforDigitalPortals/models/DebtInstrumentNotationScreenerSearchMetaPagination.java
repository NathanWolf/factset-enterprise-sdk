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


package com.factset.sdk.BondsAPIforDigitalPortals.models;

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
import com.factset.sdk.BondsAPIforDigitalPortals.JSON;


/**
 * Pagination attributes for the offset-based pagination strategy.
 */
@ApiModel(description = "Pagination attributes for the offset-based pagination strategy.")
@JsonPropertyOrder({
  DebtInstrumentNotationScreenerSearchMetaPagination.JSON_PROPERTY_OFFSET,
  DebtInstrumentNotationScreenerSearchMetaPagination.JSON_PROPERTY_LIMIT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DebtInstrumentNotationScreenerSearchMetaPagination implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_OFFSET = "offset";
  private BigDecimal offset;

  public static final String JSON_PROPERTY_LIMIT = "limit";
  private BigDecimal limit;

  public DebtInstrumentNotationScreenerSearchMetaPagination() { 
  }

  public DebtInstrumentNotationScreenerSearchMetaPagination offset(BigDecimal offset) {
    this.offset = offset;
    return this;
  }

   /**
   * Non-negative number of entries to skip, or 0 (default).
   * minimum: 0
   * @return offset
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Non-negative number of entries to skip, or 0 (default).")
  @JsonProperty(JSON_PROPERTY_OFFSET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getOffset() {
    return offset;
  }


  @JsonProperty(JSON_PROPERTY_OFFSET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOffset(BigDecimal offset) {
    this.offset = offset;
  }


  public DebtInstrumentNotationScreenerSearchMetaPagination limit(BigDecimal limit) {
    this.limit = limit;
    return this;
  }

   /**
   * Non-negative maximum number of entries to return.
   * minimum: 0
   * maximum: 5E+2
   * @return limit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Non-negative maximum number of entries to return.")
  @JsonProperty(JSON_PROPERTY_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getLimit() {
    return limit;
  }


  @JsonProperty(JSON_PROPERTY_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLimit(BigDecimal limit) {
    this.limit = limit;
  }


  /**
   * Return true if this _debtInstrument_notation_screener_search_meta_pagination object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DebtInstrumentNotationScreenerSearchMetaPagination debtInstrumentNotationScreenerSearchMetaPagination = (DebtInstrumentNotationScreenerSearchMetaPagination) o;
    return Objects.equals(this.offset, debtInstrumentNotationScreenerSearchMetaPagination.offset) &&
        Objects.equals(this.limit, debtInstrumentNotationScreenerSearchMetaPagination.limit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offset, limit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DebtInstrumentNotationScreenerSearchMetaPagination {\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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

