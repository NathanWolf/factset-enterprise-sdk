/*
 * Quotes API For Digital Portals
 * The Quotes API combines endpoints for retrieving security end-of-day, delayed, and realtime prices with performance key figures and basic reference data on the security and market level.  The API supports over 20 different price types for each quote and comes with basic search endpoints based on security identifiers and instrument names. Market coverage is included in the *Sample Use Cases* section below.  The Digital Portal use case is focused on high-performance applications that are  * serving millions of end-users, * accessible by client browsers via the internet, * supporting subscriptions for streamed updates out-of-the-box, * typically combining a wide variety of *for Digital Portals*-APIs into a highly use-case specific solution for customers, * integrated into complex infrastructures such as existing frontend frameworks, authentication services.  All APIs labelled *for Digital Portals* have been designed for direct use by client web applications and feature extreme low latency: The average response time across all endpoints is 30 ms whereas 99% of all requests are answered in close to under 300ms.  See the [Time Series API for Digital Portals](https://developer.factset.com/api-catalog/time-series-api-digital-portals) for direct access to price histories, and the [News API for Digital Portals](https://developer.factset.com/api-catalog/news-api-digital-portals) for searching and fetching related news. 
 *
 * The version of the OpenAPI document: 3.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.RealTimeQuotes.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.RealTimeQuotes.models.PostNotationMarketListRequestDataFilterAssetClass;
import com.factset.sdk.RealTimeQuotes.models.PostNotationMarketListRequestDataFilterCountry;
import com.factset.sdk.RealTimeQuotes.models.PostNotationMarketListRequestDataFilterGroup;
import com.factset.sdk.RealTimeQuotes.models.PostNotationMarketListRequestDataFilterType;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.RealTimeQuotes.JSON;


/**
 * Criteria that filter the items in the response list; only items that match all of the criteria are returned.
 */
@ApiModel(description = "Criteria that filter the items in the response list; only items that match all of the criteria are returned.")
@JsonPropertyOrder({
  PostNotationMarketListRequestDataFilter.JSON_PROPERTY_ASSET_CLASS,
  PostNotationMarketListRequestDataFilter.JSON_PROPERTY_COUNTRY,
  PostNotationMarketListRequestDataFilter.JSON_PROPERTY_GROUP,
  PostNotationMarketListRequestDataFilter.JSON_PROPERTY_TYPE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PostNotationMarketListRequestDataFilter implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ASSET_CLASS = "assetClass";
  private PostNotationMarketListRequestDataFilterAssetClass assetClass;

  public static final String JSON_PROPERTY_COUNTRY = "country";
  private PostNotationMarketListRequestDataFilterCountry country;

  public static final String JSON_PROPERTY_GROUP = "group";
  private PostNotationMarketListRequestDataFilterGroup group;

  public static final String JSON_PROPERTY_TYPE = "type";
  private PostNotationMarketListRequestDataFilterType type;

  public PostNotationMarketListRequestDataFilter() { 
  }

  public PostNotationMarketListRequestDataFilter assetClass(PostNotationMarketListRequestDataFilterAssetClass assetClass) {
    this.assetClass = assetClass;
    return this;
  }

   /**
   * Get assetClass
   * @return assetClass
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ASSET_CLASS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PostNotationMarketListRequestDataFilterAssetClass getAssetClass() {
    return assetClass;
  }


  @JsonProperty(JSON_PROPERTY_ASSET_CLASS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAssetClass(PostNotationMarketListRequestDataFilterAssetClass assetClass) {
    this.assetClass = assetClass;
  }


  public PostNotationMarketListRequestDataFilter country(PostNotationMarketListRequestDataFilterCountry country) {
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PostNotationMarketListRequestDataFilterCountry getCountry() {
    return country;
  }


  @JsonProperty(JSON_PROPERTY_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCountry(PostNotationMarketListRequestDataFilterCountry country) {
    this.country = country;
  }


  public PostNotationMarketListRequestDataFilter group(PostNotationMarketListRequestDataFilterGroup group) {
    this.group = group;
    return this;
  }

   /**
   * Get group
   * @return group
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PostNotationMarketListRequestDataFilterGroup getGroup() {
    return group;
  }


  @JsonProperty(JSON_PROPERTY_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGroup(PostNotationMarketListRequestDataFilterGroup group) {
    this.group = group;
  }


  public PostNotationMarketListRequestDataFilter type(PostNotationMarketListRequestDataFilterType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PostNotationMarketListRequestDataFilterType getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(PostNotationMarketListRequestDataFilterType type) {
    this.type = type;
  }


  /**
   * Return true if this PostNotationMarketListRequest_data_filter object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostNotationMarketListRequestDataFilter postNotationMarketListRequestDataFilter = (PostNotationMarketListRequestDataFilter) o;
    return Objects.equals(this.assetClass, postNotationMarketListRequestDataFilter.assetClass) &&
        Objects.equals(this.country, postNotationMarketListRequestDataFilter.country) &&
        Objects.equals(this.group, postNotationMarketListRequestDataFilter.group) &&
        Objects.equals(this.type, postNotationMarketListRequestDataFilter.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetClass, country, group, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostNotationMarketListRequestDataFilter {\n");
    sb.append("    assetClass: ").append(toIndentedString(assetClass)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

