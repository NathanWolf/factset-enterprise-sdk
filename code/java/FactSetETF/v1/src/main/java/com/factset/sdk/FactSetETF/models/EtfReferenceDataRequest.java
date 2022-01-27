/*
 * FactSet Exchange Traded Funds API
 * FactSet ETF data feeds provide complete and accurate security, fund and reference data across the universe of exchange-traded products. Data is sourced from ETF providers across the globe and includes more than 100 unique data points, resulting in comprehensive coverage to help you evaluate and construct ETFs, analyze potential trades, and perform fund research.<p> FactSet Reference and Analytics data uses FactSet's FCS, which categorizes exchange-traded products using a rules-based system that is derived from seven core classifications. This system evaluates the asset class, economic development level, and geographical region as described in each fund's prospectus and marketing materials. ETF exposure details are presented on successively granular levels-  category, then focus, and then niche.</p> <p>Moreover, FactSet ETF Reference data captures over 100 unique data points and provides market-specific data if you wish to solely focus on U.S., Canadian, Australian, New Zealand, Singapore, Hong Kong or European exchanges. All data points are grouped in one of two levels, either as a Fund or as a Listing. However, FactSet ETF Analytics data is primarily available for U.S.-domiciled ETFs. A subset of reference data items are provided for European-domiciled funds. For a full breakout of regional availability and history, see Formula Definitions and Calculations.</p> 
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.FactSetETF.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.FactSetETF.models.Category;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.FactSetETF.JSON;


/**
 * EtfReferenceDataRequest
 */
@JsonPropertyOrder({
  EtfReferenceDataRequest.JSON_PROPERTY_IDS,
  EtfReferenceDataRequest.JSON_PROPERTY_METRICS,
  EtfReferenceDataRequest.JSON_PROPERTY_CATEGORIES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class EtfReferenceDataRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_IDS = "ids";
  private java.util.List<String> ids = new java.util.ArrayList<>();

  public static final String JSON_PROPERTY_METRICS = "metrics";
  private java.util.List<String> metrics = null;

  public static final String JSON_PROPERTY_CATEGORIES = "categories";
  private java.util.List<Category> categories = null;


  public EtfReferenceDataRequest ids(java.util.List<String> ids) {
    this.ids = ids;
    return this;
  }

  public EtfReferenceDataRequest addIdsItem(String idsItem) {
    this.ids.add(idsItem);
    return this;
  }

   /**
   * List of ETF identifiers.
   * @return ids
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "[\"EQAL-US\",\"VEUR-GB\"]", required = true, value = "List of ETF identifiers.")
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


  public EtfReferenceDataRequest metrics(java.util.List<String> metrics) {
    this.metrics = metrics;
    return this;
  }

  public EtfReferenceDataRequest addMetricsItem(String metricsItem) {
    if (this.metrics == null) {
      this.metrics = new java.util.ArrayList<>();
    }
    this.metrics.add(metricsItem);
    return this;
  }

   /**
   * List of data items for Exchange Traded Funds. To fetch a list of all available data items, use the **_/metrics** endpoint. 
   * @return metrics
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"factsetEntityId\",\"name\",\"launchDate\"]", value = "List of data items for Exchange Traded Funds. To fetch a list of all available data items, use the **_/metrics** endpoint. ")
  @JsonProperty(JSON_PROPERTY_METRICS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<String> getMetrics() {
    return metrics;
  }


  @JsonProperty(JSON_PROPERTY_METRICS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMetrics(java.util.List<String> metrics) {
    this.metrics = metrics;
  }


  public EtfReferenceDataRequest categories(java.util.List<Category> categories) {
    this.categories = categories;
    return this;
  }

  public EtfReferenceDataRequest addCategoriesItem(Category categoriesItem) {
    if (this.categories == null) {
      this.categories = new java.util.ArrayList<>();
    }
    this.categories.add(categoriesItem);
    return this;
  }

   /**
   * Selects the ETF metrics by category -   |category|description|   |---|---|   |BENCHMARK_DETAILS|Details surrounding the underlying Benchmark Id and Segment Banchmark|   |CLASSIFICATION|FactSet Fund Classification Codes and Names, across Asset Class, Broad  Geography, Fund Categories, Focus, Niche, and more.|   |COSTS_FEES|Expenses and Fees such as capital gains, expense ratio, management fees, and more.|   |COUNTERPARTY|Credit and Swap Counterparty details|   |CREATE_REDEEM|Creation and Redemption Sizes|   |DESCRIPTIVE|General Descriptive information such as name, objectives, issuer details, launch dates, website, and more.|   |DISTRIBUTIONS|Dividend Dates, Dividend Treatmetns, Min/Max Cap Gains|   |DOCUMENTATION|Details surrounding reporting information.|   |GEARING|Leverage factors, inverse flags, and more.|   |HEDGE|Hedging Information|   |RISK|CIFSC Risk Ratings|   |SERVICE_PROVIDERS|Distributors, issuers, and Advisor details|   |STATUS|Actively Managed Flags|   |STRATEGY|Segment Codes, selection criteria, strategy codes, weighting schemes, and lending details.|   |STRUCTURE|ETF Type, backing codes, synthetic types, ucits compliance, legal structures, and more.|   |TAX|Tax Types, distribution takes, K1 Flags, and more.| 
   * @return categories
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Selects the ETF metrics by category -   |category|description|   |---|---|   |BENCHMARK_DETAILS|Details surrounding the underlying Benchmark Id and Segment Banchmark|   |CLASSIFICATION|FactSet Fund Classification Codes and Names, across Asset Class, Broad  Geography, Fund Categories, Focus, Niche, and more.|   |COSTS_FEES|Expenses and Fees such as capital gains, expense ratio, management fees, and more.|   |COUNTERPARTY|Credit and Swap Counterparty details|   |CREATE_REDEEM|Creation and Redemption Sizes|   |DESCRIPTIVE|General Descriptive information such as name, objectives, issuer details, launch dates, website, and more.|   |DISTRIBUTIONS|Dividend Dates, Dividend Treatmetns, Min/Max Cap Gains|   |DOCUMENTATION|Details surrounding reporting information.|   |GEARING|Leverage factors, inverse flags, and more.|   |HEDGE|Hedging Information|   |RISK|CIFSC Risk Ratings|   |SERVICE_PROVIDERS|Distributors, issuers, and Advisor details|   |STATUS|Actively Managed Flags|   |STRATEGY|Segment Codes, selection criteria, strategy codes, weighting schemes, and lending details.|   |STRUCTURE|ETF Type, backing codes, synthetic types, ucits compliance, legal structures, and more.|   |TAX|Tax Types, distribution takes, K1 Flags, and more.| ")
  @JsonProperty(JSON_PROPERTY_CATEGORIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<Category> getCategories() {
    return categories;
  }


  @JsonProperty(JSON_PROPERTY_CATEGORIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCategories(java.util.List<Category> categories) {
    this.categories = categories;
  }


  /**
   * Return true if this EtfReferenceDataRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EtfReferenceDataRequest etfReferenceDataRequest = (EtfReferenceDataRequest) o;
    return Objects.equals(this.ids, etfReferenceDataRequest.ids) &&
        Objects.equals(this.metrics, etfReferenceDataRequest.metrics) &&
        Objects.equals(this.categories, etfReferenceDataRequest.categories);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ids, metrics, categories);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EtfReferenceDataRequest {\n");
    sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
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

