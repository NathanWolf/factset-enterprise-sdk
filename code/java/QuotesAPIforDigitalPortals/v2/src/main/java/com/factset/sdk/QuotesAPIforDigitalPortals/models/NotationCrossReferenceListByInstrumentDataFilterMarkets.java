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


package com.factset.sdk.QuotesAPIforDigitalPortals.models;

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
import com.factset.sdk.QuotesAPIforDigitalPortals.JSON;


/**
 * Filter for specific markets.
 */
@ApiModel(description = "Filter for specific markets.")
@JsonPropertyOrder({
  NotationCrossReferenceListByInstrumentDataFilterMarkets.JSON_PROPERTY_IDS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class NotationCrossReferenceListByInstrumentDataFilterMarkets implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_IDS = "ids";
  private java.util.List<BigDecimal> ids = null;

  public NotationCrossReferenceListByInstrumentDataFilterMarkets() { 
  }

  public NotationCrossReferenceListByInstrumentDataFilterMarkets ids(java.util.List<BigDecimal> ids) {
    this.ids = ids;
    return this;
  }

  public NotationCrossReferenceListByInstrumentDataFilterMarkets addIdsItem(BigDecimal idsItem) {
    if (this.ids == null) {
      this.ids = new java.util.ArrayList<>();
    }
    this.ids.add(idsItem);
    return this;
  }

   /**
   * List of market ids.
   * @return ids
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of market ids.")
  @JsonProperty(JSON_PROPERTY_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<BigDecimal> getIds() {
    return ids;
  }


  @JsonProperty(JSON_PROPERTY_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIds(java.util.List<BigDecimal> ids) {
    this.ids = ids;
  }


  /**
   * Return true if this _notation_crossReference_listByInstrument_data_filter_markets object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotationCrossReferenceListByInstrumentDataFilterMarkets notationCrossReferenceListByInstrumentDataFilterMarkets = (NotationCrossReferenceListByInstrumentDataFilterMarkets) o;
    return Objects.equals(this.ids, notationCrossReferenceListByInstrumentDataFilterMarkets.ids);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ids);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotationCrossReferenceListByInstrumentDataFilterMarkets {\n");
    sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
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

