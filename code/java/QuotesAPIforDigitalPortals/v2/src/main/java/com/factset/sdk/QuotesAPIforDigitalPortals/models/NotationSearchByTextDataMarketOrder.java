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
 * Sequence of market identifiers specifying the first-order sort criterion for the resulting notation list; if the market of notation A precedes the market of notation B in this list, A precedes B in the result. Notations whose market is not in this list sort last. The second-order sorting of the result is given by the attribute &#x60;meta.sort&#x60;.       The list does not restrict the request to only those markets (use the parameter &#x60;market.selection&#x60; for that purpose) and does not specify the priority order of the markets for selecting one notation per instrument (use the parameter &#x60;market.priority&#x60; for that purpose).
 */
@ApiModel(description = "Sequence of market identifiers specifying the first-order sort criterion for the resulting notation list; if the market of notation A precedes the market of notation B in this list, A precedes B in the result. Notations whose market is not in this list sort last. The second-order sorting of the result is given by the attribute `meta.sort`.       The list does not restrict the request to only those markets (use the parameter `market.selection` for that purpose) and does not specify the priority order of the markets for selecting one notation per instrument (use the parameter `market.priority` for that purpose).")
@JsonPropertyOrder({
  NotationSearchByTextDataMarketOrder.JSON_PROPERTY_IDS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class NotationSearchByTextDataMarketOrder implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_IDS = "ids";
  private java.util.Set<BigDecimal> ids = null;


  public NotationSearchByTextDataMarketOrder ids(java.util.Set<BigDecimal> ids) {
    this.ids = ids;
    return this;
  }

  public NotationSearchByTextDataMarketOrder addIdsItem(BigDecimal idsItem) {
    if (this.ids == null) {
      this.ids = new java.util.LinkedHashSet<>();
    }
    this.ids.add(idsItem);
    return this;
  }

   /**
   * List of market identifiers. See endpoint &#x60;/basic/market/list&#x60; for valid values.
   * @return ids
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of market identifiers. See endpoint `/basic/market/list` for valid values.")
  @JsonProperty(JSON_PROPERTY_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.Set<BigDecimal> getIds() {
    return ids;
  }


  @JsonProperty(JSON_PROPERTY_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIds(java.util.Set<BigDecimal> ids) {
    this.ids = ids;
  }


  /**
   * Return true if this _notation_searchByText_data_market_order object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotationSearchByTextDataMarketOrder notationSearchByTextDataMarketOrder = (NotationSearchByTextDataMarketOrder) o;
    return Objects.equals(this.ids, notationSearchByTextDataMarketOrder.ids);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ids);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotationSearchByTextDataMarketOrder {\n");
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

