/*
 * FactSet ESG API
 * FactSet ESG (powered by FactSet Truvalue Labs) applies machine learning to uncover risks and opportunities from companies' Environmental, Social and Governance (ESG) behavior, which are aggregated and categorized into continuously updated, material ESG scores. The service focuses on company ESG behavior from external sources and includes both positive and negative events that go beyond traditional sources of ESG risk data.<p> FactSet ESG extracts, analyzes, and generates scores from millions of documents each month collected from more than 100,000 data sources in over 13 languages. Sources include news, trade journals, NGOs, watchdog groups, trade blogs, industry reports and social media. Products deliver investable insights by revealing value and risk factors from unstructured data at the speed of current events.</p> 
 *
 * The version of the OpenAPI document: 1.1.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.FactSetESG.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.FactSetESG.models.Frequency;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.FactSetESG.JSON;


/**
 * SASB Scores Request Body
 */
@ApiModel(description = "SASB Scores Request Body")
@JsonPropertyOrder({
  SasbRanksRequest.JSON_PROPERTY_IDS,
  SasbRanksRequest.JSON_PROPERTY_CATEGORIES,
  SasbRanksRequest.JSON_PROPERTY_START_DATE,
  SasbRanksRequest.JSON_PROPERTY_END_DATE,
  SasbRanksRequest.JSON_PROPERTY_FREQUENCY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SasbRanksRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_IDS = "ids";
  private java.util.List<String> ids = new java.util.ArrayList<>();

  public static final String JSON_PROPERTY_CATEGORIES = "categories";
  private java.util.List<String> categories = null;

  public static final String JSON_PROPERTY_START_DATE = "startDate";
  private String startDate;

  public static final String JSON_PROPERTY_END_DATE = "endDate";
  private String endDate;

  public static final String JSON_PROPERTY_FREQUENCY = "frequency";
  private Frequency frequency = Frequency.D;


  public SasbRanksRequest ids(java.util.List<String> ids) {
    this.ids = ids;
    return this;
  }

  public SasbRanksRequest addIdsItem(String idsItem) {
    this.ids.add(idsItem);
    return this;
  }

   /**
   * Security or Entity identifiers. FactSet Identifiers, tickers, CUSIP and SEDOL are accepted input. &lt;p&gt;***ids limit** &#x3D;  1000 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may exceed this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;* 
   * @return ids
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "[\"AAPL-USA\"]", required = true, value = "Security or Entity identifiers. FactSet Identifiers, tickers, CUSIP and SEDOL are accepted input. <p>***ids limit** =  1000 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may exceed this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>* ")
  @JsonProperty(JSON_PROPERTY_IDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public java.util.List<String> getIds() {
    return ids;
  }


  @JsonProperty(JSON_PROPERTY_IDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIds(java.util.List<String> ids) {
    this.ids = ids;
  }


  public SasbRanksRequest categories(java.util.List<String> categories) {
    this.categories = categories;
    return this;
  }

  public SasbRanksRequest addCategoriesItem(String categoriesItem) {
    if (this.categories == null) {
      this.categories = new java.util.ArrayList<>();
    }
    this.categories.add(categoriesItem);
    return this;
  }

   /**
   * The Categories representing overall or composite rankings from all underlying 26 SASB Categories.  ### SASB Categories |**SASB Category Inputs**|**Description**| |---|---| |**ALLCATEGORIES**|**All Categories** - The company&#39;s overall SASB Rank. This value is equal to the cumulative average of all 26 SASB categories. |**MATERIALITY**|**Materiality** - The composite rank of all &#39;material&#39; SASB categories for the given entity. For more information on SASB&#39;s Materiality Map, visit [materiality.sasb.org](https://materiality.sasb.org/)|  ### Helper Input **ALL** &#x3D; Simply gives the ability to request all categories in a single request without having to explicitly list each available category.  
   * @return categories
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"ALLCATEGORIES\",\"MATERIALITY\"]", value = "The Categories representing overall or composite rankings from all underlying 26 SASB Categories.  ### SASB Categories |**SASB Category Inputs**|**Description**| |---|---| |**ALLCATEGORIES**|**All Categories** - The company's overall SASB Rank. This value is equal to the cumulative average of all 26 SASB categories. |**MATERIALITY**|**Materiality** - The composite rank of all 'material' SASB categories for the given entity. For more information on SASB's Materiality Map, visit [materiality.sasb.org](https://materiality.sasb.org/)|  ### Helper Input **ALL** = Simply gives the ability to request all categories in a single request without having to explicitly list each available category.  ")
  @JsonProperty(JSON_PROPERTY_CATEGORIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<String> getCategories() {
    return categories;
  }


  @JsonProperty(JSON_PROPERTY_CATEGORIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCategories(java.util.List<String> categories) {
    this.categories = categories;
  }


  public SasbRanksRequest startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * The start date requested for a given date range in **YYYY-MM-DD** format. Data is available on a Fiscal Annual periodicity, but updated Daily. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint. 
   * @return startDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2019-01-01", value = "The start date requested for a given date range in **YYYY-MM-DD** format. Data is available on a Fiscal Annual periodicity, but updated Daily. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint. ")
  @JsonProperty(JSON_PROPERTY_START_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStartDate() {
    return startDate;
  }


  @JsonProperty(JSON_PROPERTY_START_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }


  public SasbRanksRequest endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * The end date requested for a given date range in **YYYY-MM-DD** format. Data is available on a Fiscal Annual periodicity, but updated Daily. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint. 
   * @return endDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2019-12-31", value = "The end date requested for a given date range in **YYYY-MM-DD** format. Data is available on a Fiscal Annual periodicity, but updated Daily. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint. ")
  @JsonProperty(JSON_PROPERTY_END_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEndDate() {
    return endDate;
  }


  @JsonProperty(JSON_PROPERTY_END_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }


  public SasbRanksRequest frequency(Frequency frequency) {
    this.frequency = frequency;
    return this;
  }

   /**
   * Get frequency
   * @return frequency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FREQUENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Frequency getFrequency() {
    return frequency;
  }


  @JsonProperty(JSON_PROPERTY_FREQUENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFrequency(Frequency frequency) {
    this.frequency = frequency;
  }


  /**
   * Return true if this sasbRanksRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SasbRanksRequest sasbRanksRequest = (SasbRanksRequest) o;
    return Objects.equals(this.ids, sasbRanksRequest.ids) &&
        Objects.equals(this.categories, sasbRanksRequest.categories) &&
        Objects.equals(this.startDate, sasbRanksRequest.startDate) &&
        Objects.equals(this.endDate, sasbRanksRequest.endDate) &&
        Objects.equals(this.frequency, sasbRanksRequest.frequency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ids, categories, startDate, endDate, frequency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SasbRanksRequest {\n");
    sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
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

