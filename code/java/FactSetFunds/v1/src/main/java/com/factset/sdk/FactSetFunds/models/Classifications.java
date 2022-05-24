/*
 * FactSet Funds API
 * FactSet Mutual Funds data offers over 50 fund- and share class-specific data points for mutual funds listed in the United States. <p>FactSet Mutual Funds Reference provides fund-specific reference information as well as FactSet's proprietary classification system. It includes but is not limited to the following coverage    * Fund descriptions    * A seven-tier classification system   * Leverage information   * Fees and expenses    * Portfolio managers       FactSet Mutual Funds Time Series provides quantitative data items on a historical basis. It includes but is not limited to the following coverage    * Net asset value   * Fund flows    * Assets under management   * Total return  
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.FactSetFunds.models;

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
import com.factset.sdk.FactSetFunds.JSON;


/**
 * Classifications
 */
@JsonPropertyOrder({
  Classifications.JSON_PROPERTY_FSYM_ID,
  Classifications.JSON_PROPERTY_REQUEST_ID,
  Classifications.JSON_PROPERTY_ASSET_CLASS,
  Classifications.JSON_PROPERTY_CATEGORY_CLASS,
  Classifications.JSON_PROPERTY_ECONOMIC_DEVELOPMENT_CLASS,
  Classifications.JSON_PROPERTY_FOCUS_CLASS,
  Classifications.JSON_PROPERTY_GEOGRAPHIC_CLASS,
  Classifications.JSON_PROPERTY_NICHE_CLASS,
  Classifications.JSON_PROPERTY_REGION_CLASS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Classifications implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_FSYM_ID = "fsymId";
  private String fsymId;

  public static final String JSON_PROPERTY_REQUEST_ID = "requestId";
  private String requestId;

  public static final String JSON_PROPERTY_ASSET_CLASS = "assetClass";
  private String assetClass;

  public static final String JSON_PROPERTY_CATEGORY_CLASS = "categoryClass";
  private String categoryClass;

  public static final String JSON_PROPERTY_ECONOMIC_DEVELOPMENT_CLASS = "economicDevelopmentClass";
  private String economicDevelopmentClass;

  public static final String JSON_PROPERTY_FOCUS_CLASS = "focusClass";
  private String focusClass;

  public static final String JSON_PROPERTY_GEOGRAPHIC_CLASS = "geographicClass";
  private String geographicClass;

  public static final String JSON_PROPERTY_NICHE_CLASS = "nicheClass";
  private String nicheClass;

  public static final String JSON_PROPERTY_REGION_CLASS = "regionClass";
  private String regionClass;

  public Classifications() { 
  }

  public Classifications fsymId(String fsymId) {
    this.fsymId = fsymId;
    return this;
  }

   /**
   * FactSet Security Identifier. Six alpha-numeric characters, excluding vowels, with a -S suffix (XXXXXX-S), resolved from the requestId of the Fund requested.
   * @return fsymId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "FNK7XP-S", value = "FactSet Security Identifier. Six alpha-numeric characters, excluding vowels, with a -S suffix (XXXXXX-S), resolved from the requestId of the Fund requested.")
  @JsonProperty(JSON_PROPERTY_FSYM_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFsymId() {
    return fsymId;
  }


  @JsonProperty(JSON_PROPERTY_FSYM_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFsymId(String fsymId) {
    this.fsymId = fsymId;
  }


  public Classifications requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

   /**
   * The requested Id sent as input.
   * @return requestId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "MABAX", value = "The requested Id sent as input.")
  @JsonProperty(JSON_PROPERTY_REQUEST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRequestId() {
    return requestId;
  }


  @JsonProperty(JSON_PROPERTY_REQUEST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }


  public Classifications assetClass(String assetClass) {
    this.assetClass = assetClass;
    return this;
  }

   /**
   * Returns the asset class description from FactSet&#39;s fund classification system. Asset class designates the fund&#39;s underlying holding type, e.g. equity, fixed-income, etc.
   * @return assetClass
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Equity", value = "Returns the asset class description from FactSet's fund classification system. Asset class designates the fund's underlying holding type, e.g. equity, fixed-income, etc.")
  @JsonProperty(JSON_PROPERTY_ASSET_CLASS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAssetClass() {
    return assetClass;
  }


  @JsonProperty(JSON_PROPERTY_ASSET_CLASS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAssetClass(String assetClass) {
    this.assetClass = assetClass;
  }


  public Classifications categoryClass(String categoryClass) {
    this.categoryClass = categoryClass;
    return this;
  }

   /**
   * Returns the asset class category description from FactSet&#39;s fund classification system. The asset class category is the first-tier subcategory within the fund&#39;s asset class, e.g. size &amp; style, sector, precious metals, etc.
   * @return categoryClass
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Size and Style", value = "Returns the asset class category description from FactSet's fund classification system. The asset class category is the first-tier subcategory within the fund's asset class, e.g. size & style, sector, precious metals, etc.")
  @JsonProperty(JSON_PROPERTY_CATEGORY_CLASS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCategoryClass() {
    return categoryClass;
  }


  @JsonProperty(JSON_PROPERTY_CATEGORY_CLASS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCategoryClass(String categoryClass) {
    this.categoryClass = categoryClass;
  }


  public Classifications economicDevelopmentClass(String economicDevelopmentClass) {
    this.economicDevelopmentClass = economicDevelopmentClass;
    return this;
  }

   /**
   * Returns the fund&#39;s economic development description from FactSet&#39;s fund classification system. This description refers to the development level for the fund&#39;s geographic region of focus, e.g. developed, emerging, etc.
   * @return economicDevelopmentClass
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Developed Markets", value = "Returns the fund's economic development description from FactSet's fund classification system. This description refers to the development level for the fund's geographic region of focus, e.g. developed, emerging, etc.")
  @JsonProperty(JSON_PROPERTY_ECONOMIC_DEVELOPMENT_CLASS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEconomicDevelopmentClass() {
    return economicDevelopmentClass;
  }


  @JsonProperty(JSON_PROPERTY_ECONOMIC_DEVELOPMENT_CLASS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEconomicDevelopmentClass(String economicDevelopmentClass) {
    this.economicDevelopmentClass = economicDevelopmentClass;
  }


  public Classifications focusClass(String focusClass) {
    this.focusClass = focusClass;
    return this;
  }

   /**
   * Returns the fund&#39;s focus description from FactSet&#39;s fund classification system. The fund&#39;s focus is the second-tier subcategory within the fund&#39;s asset class, e.g. small cap, energy, etc.
   * @return focusClass
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Total Market", value = "Returns the fund's focus description from FactSet's fund classification system. The fund's focus is the second-tier subcategory within the fund's asset class, e.g. small cap, energy, etc.")
  @JsonProperty(JSON_PROPERTY_FOCUS_CLASS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFocusClass() {
    return focusClass;
  }


  @JsonProperty(JSON_PROPERTY_FOCUS_CLASS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFocusClass(String focusClass) {
    this.focusClass = focusClass;
  }


  public Classifications geographicClass(String geographicClass) {
    this.geographicClass = geographicClass;
    return this;
  }

   /**
   * Returns the fund&#39;s specific geography description from FactSet&#39;s fund classification system. Specific geography refers to the fund&#39;s particular geographic focus within the region, e.g. Chile, BRICs, etc.
   * @return geographicClass
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "U.S.", value = "Returns the fund's specific geography description from FactSet's fund classification system. Specific geography refers to the fund's particular geographic focus within the region, e.g. Chile, BRICs, etc.")
  @JsonProperty(JSON_PROPERTY_GEOGRAPHIC_CLASS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getGeographicClass() {
    return geographicClass;
  }


  @JsonProperty(JSON_PROPERTY_GEOGRAPHIC_CLASS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGeographicClass(String geographicClass) {
    this.geographicClass = geographicClass;
  }


  public Classifications nicheClass(String nicheClass) {
    this.nicheClass = nicheClass;
    return this;
  }

   /**
   * Returns the fund&#39;s niche description from FactSet&#39;s fund classification system. The fund&#39;s niche is the third-tier subcategory with the fund&#39;s asset class, e.g. growth, coal, etc.
   * @return nicheClass
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Value", value = "Returns the fund's niche description from FactSet's fund classification system. The fund's niche is the third-tier subcategory with the fund's asset class, e.g. growth, coal, etc.")
  @JsonProperty(JSON_PROPERTY_NICHE_CLASS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNicheClass() {
    return nicheClass;
  }


  @JsonProperty(JSON_PROPERTY_NICHE_CLASS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNicheClass(String nicheClass) {
    this.nicheClass = nicheClass;
  }


  public Classifications regionClass(String regionClass) {
    this.regionClass = regionClass;
    return this;
  }

   /**
   * Returns the fund&#39;s region description from FactSet&#39;s fund classification system. Refers to the broad regional exposure of the fund&#39;s holdings, e.g. Latin America, Asia-Pacific, etc.
   * @return regionClass
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "North America", value = "Returns the fund's region description from FactSet's fund classification system. Refers to the broad regional exposure of the fund's holdings, e.g. Latin America, Asia-Pacific, etc.")
  @JsonProperty(JSON_PROPERTY_REGION_CLASS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRegionClass() {
    return regionClass;
  }


  @JsonProperty(JSON_PROPERTY_REGION_CLASS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRegionClass(String regionClass) {
    this.regionClass = regionClass;
  }


  /**
   * Return true if this classifications object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Classifications classifications = (Classifications) o;
    return Objects.equals(this.fsymId, classifications.fsymId) &&
        Objects.equals(this.requestId, classifications.requestId) &&
        Objects.equals(this.assetClass, classifications.assetClass) &&
        Objects.equals(this.categoryClass, classifications.categoryClass) &&
        Objects.equals(this.economicDevelopmentClass, classifications.economicDevelopmentClass) &&
        Objects.equals(this.focusClass, classifications.focusClass) &&
        Objects.equals(this.geographicClass, classifications.geographicClass) &&
        Objects.equals(this.nicheClass, classifications.nicheClass) &&
        Objects.equals(this.regionClass, classifications.regionClass);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fsymId, requestId, assetClass, categoryClass, economicDevelopmentClass, focusClass, geographicClass, nicheClass, regionClass);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Classifications {\n");
    sb.append("    fsymId: ").append(toIndentedString(fsymId)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    assetClass: ").append(toIndentedString(assetClass)).append("\n");
    sb.append("    categoryClass: ").append(toIndentedString(categoryClass)).append("\n");
    sb.append("    economicDevelopmentClass: ").append(toIndentedString(economicDevelopmentClass)).append("\n");
    sb.append("    focusClass: ").append(toIndentedString(focusClass)).append("\n");
    sb.append("    geographicClass: ").append(toIndentedString(geographicClass)).append("\n");
    sb.append("    nicheClass: ").append(toIndentedString(nicheClass)).append("\n");
    sb.append("    regionClass: ").append(toIndentedString(regionClass)).append("\n");
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

