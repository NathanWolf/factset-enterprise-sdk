/*
 * Stocks API For Digital Portals
 * The stocks API features a screener to search for equity instruments based on stock-specific parameters.  Parameters for up to three fiscal years might now be used in one request; data is available for the ten most recent completed fiscal years. Estimates are available for the current and two consecutive fiscal years.  A separate endpoint returns the possible values and value ranges for the parameters that the endpoint /stock/notation/screener/search accepts: Application developers can request the values and value ranges only for a restricted set of notations that match predefined parameters. This functionality may be used to pre-fill the values and value ranges of the parameters of the /stock/notation/screener/search endpoint so that performing a search always leads to a non-empty set of notations.  The endpoint /stock/notation/ranking/intraday/list ranks stocks notations using intraday figures, for example to build a gainers/losers list.   Additional endpoints include end-of-day benchmark key figures, and selected fundamentals (as of end of fiscal year and with potentially daily updates).  This API is fully integrated with the corresponding Quotes API, allowing access to detailed price and performance information of instruments, as well as basic security identifier cross-reference. For direct access to price histories, please refer to the Time Series API for Digital Portals.  Similar criteria based screener APIs exist for fixed income instruments and securitized derivatives: See the Bonds API and the Securitized Derivatives API for details.
 *
 * The version of the OpenAPI document: 2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.StocksAPIforDigitalPortals.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.StocksAPIforDigitalPortals.models.StockNotationScreenerSearchDataCompany;
import com.factset.sdk.StocksAPIforDigitalPortals.models.StockNotationScreenerSearchDataCompliance;
import com.factset.sdk.StocksAPIforDigitalPortals.models.StockNotationScreenerSearchDataEstimates;
import com.factset.sdk.StocksAPIforDigitalPortals.models.StockNotationScreenerSearchDataIndexMembership;
import com.factset.sdk.StocksAPIforDigitalPortals.models.StockNotationScreenerSearchDataIndustryClassification;
import com.factset.sdk.StocksAPIforDigitalPortals.models.StockNotationScreenerSearchDataPerformance;
import com.factset.sdk.StocksAPIforDigitalPortals.models.StockNotationScreenerSearchDataRecommendation;
import com.factset.sdk.StocksAPIforDigitalPortals.models.StockNotationScreenerSearchDataReportedKeyFigures;
import com.factset.sdk.StocksAPIforDigitalPortals.models.StockNotationScreenerSearchDataRsiWilder;
import com.factset.sdk.StocksAPIforDigitalPortals.models.StockNotationScreenerSearchDataSimpleMovingAverage;
import com.factset.sdk.StocksAPIforDigitalPortals.models.StockNotationScreenerSearchDataTradingValue;
import com.factset.sdk.StocksAPIforDigitalPortals.models.StockNotationScreenerSearchDataValidation;
import com.factset.sdk.StocksAPIforDigitalPortals.models.StockNotationScreenerSearchDataVolatility;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.StocksAPIforDigitalPortals.JSON;


/**
 * The data member contains the request&#39;s primary data.
 */
@ApiModel(description = "The data member contains the request's primary data.")
@JsonPropertyOrder({
  StockNotationScreenerSearchData.JSON_PROPERTY_VALIDATION,
  StockNotationScreenerSearchData.JSON_PROPERTY_STOCK_TYPE,
  StockNotationScreenerSearchData.JSON_PROPERTY_INDUSTRY_CLASSIFICATION,
  StockNotationScreenerSearchData.JSON_PROPERTY_COMPANY,
  StockNotationScreenerSearchData.JSON_PROPERTY_INDEX_MEMBERSHIP,
  StockNotationScreenerSearchData.JSON_PROPERTY_COMPLIANCE,
  StockNotationScreenerSearchData.JSON_PROPERTY_REPORTED_KEY_FIGURES,
  StockNotationScreenerSearchData.JSON_PROPERTY_PERFORMANCE,
  StockNotationScreenerSearchData.JSON_PROPERTY_VOLATILITY,
  StockNotationScreenerSearchData.JSON_PROPERTY_TRADING_VALUE,
  StockNotationScreenerSearchData.JSON_PROPERTY_SIMPLE_MOVING_AVERAGE,
  StockNotationScreenerSearchData.JSON_PROPERTY_RSI_WILDER,
  StockNotationScreenerSearchData.JSON_PROPERTY_RECOMMENDATION,
  StockNotationScreenerSearchData.JSON_PROPERTY_ESTIMATES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class StockNotationScreenerSearchData implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_VALIDATION = "validation";
  private StockNotationScreenerSearchDataValidation validation;

  /**
   * Gets or Sets stockType
   */
  public enum StockTypeEnum {
    COMMON("common"),
    
    PREFERRED("preferred"),
    
    DEPOSITORYRECEIPT("depositoryReceipt"),
    
    OTHER("other");

    private String value;

    StockTypeEnum(String value) {
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
    public static StockTypeEnum fromValue(String value) {
      for (StockTypeEnum b : StockTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_STOCK_TYPE = "stockType";
  private java.util.Set<StockTypeEnum> stockType = null;

  public static final String JSON_PROPERTY_INDUSTRY_CLASSIFICATION = "industryClassification";
  private StockNotationScreenerSearchDataIndustryClassification industryClassification;

  public static final String JSON_PROPERTY_COMPANY = "company";
  private StockNotationScreenerSearchDataCompany company;

  public static final String JSON_PROPERTY_INDEX_MEMBERSHIP = "indexMembership";
  private StockNotationScreenerSearchDataIndexMembership indexMembership;

  public static final String JSON_PROPERTY_COMPLIANCE = "compliance";
  private StockNotationScreenerSearchDataCompliance compliance;

  public static final String JSON_PROPERTY_REPORTED_KEY_FIGURES = "reportedKeyFigures";
  private java.util.List<StockNotationScreenerSearchDataReportedKeyFigures> reportedKeyFigures = null;

  public static final String JSON_PROPERTY_PERFORMANCE = "performance";
  private StockNotationScreenerSearchDataPerformance performance;

  public static final String JSON_PROPERTY_VOLATILITY = "volatility";
  private StockNotationScreenerSearchDataVolatility volatility;

  public static final String JSON_PROPERTY_TRADING_VALUE = "tradingValue";
  private StockNotationScreenerSearchDataTradingValue tradingValue;

  public static final String JSON_PROPERTY_SIMPLE_MOVING_AVERAGE = "simpleMovingAverage";
  private StockNotationScreenerSearchDataSimpleMovingAverage simpleMovingAverage;

  public static final String JSON_PROPERTY_RSI_WILDER = "rsiWilder";
  private StockNotationScreenerSearchDataRsiWilder rsiWilder;

  public static final String JSON_PROPERTY_RECOMMENDATION = "recommendation";
  private StockNotationScreenerSearchDataRecommendation recommendation;

  public static final String JSON_PROPERTY_ESTIMATES = "estimates";
  private java.util.List<StockNotationScreenerSearchDataEstimates> estimates = null;

  public StockNotationScreenerSearchData() { 
  }

  public StockNotationScreenerSearchData validation(StockNotationScreenerSearchDataValidation validation) {
    this.validation = validation;
    return this;
  }

   /**
   * Get validation
   * @return validation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VALIDATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StockNotationScreenerSearchDataValidation getValidation() {
    return validation;
  }


  @JsonProperty(JSON_PROPERTY_VALIDATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValidation(StockNotationScreenerSearchDataValidation validation) {
    this.validation = validation;
  }


  public StockNotationScreenerSearchData stockType(java.util.Set<StockTypeEnum> stockType) {
    this.stockType = stockType;
    return this;
  }

  public StockNotationScreenerSearchData addStockTypeItem(StockTypeEnum stockTypeItem) {
    if (this.stockType == null) {
      this.stockType = new java.util.LinkedHashSet<>();
    }
    this.stockType.add(stockTypeItem);
    return this;
  }

   /**
   * Type of stock.
   * @return stockType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Type of stock.")
  @JsonProperty(JSON_PROPERTY_STOCK_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.Set<StockTypeEnum> getStockType() {
    return stockType;
  }


  @JsonProperty(JSON_PROPERTY_STOCK_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStockType(java.util.Set<StockTypeEnum> stockType) {
    this.stockType = stockType;
  }


  public StockNotationScreenerSearchData industryClassification(StockNotationScreenerSearchDataIndustryClassification industryClassification) {
    this.industryClassification = industryClassification;
    return this;
  }

   /**
   * Get industryClassification
   * @return industryClassification
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INDUSTRY_CLASSIFICATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StockNotationScreenerSearchDataIndustryClassification getIndustryClassification() {
    return industryClassification;
  }


  @JsonProperty(JSON_PROPERTY_INDUSTRY_CLASSIFICATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIndustryClassification(StockNotationScreenerSearchDataIndustryClassification industryClassification) {
    this.industryClassification = industryClassification;
  }


  public StockNotationScreenerSearchData company(StockNotationScreenerSearchDataCompany company) {
    this.company = company;
    return this;
  }

   /**
   * Get company
   * @return company
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_COMPANY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StockNotationScreenerSearchDataCompany getCompany() {
    return company;
  }


  @JsonProperty(JSON_PROPERTY_COMPANY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCompany(StockNotationScreenerSearchDataCompany company) {
    this.company = company;
  }


  public StockNotationScreenerSearchData indexMembership(StockNotationScreenerSearchDataIndexMembership indexMembership) {
    this.indexMembership = indexMembership;
    return this;
  }

   /**
   * Get indexMembership
   * @return indexMembership
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INDEX_MEMBERSHIP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StockNotationScreenerSearchDataIndexMembership getIndexMembership() {
    return indexMembership;
  }


  @JsonProperty(JSON_PROPERTY_INDEX_MEMBERSHIP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIndexMembership(StockNotationScreenerSearchDataIndexMembership indexMembership) {
    this.indexMembership = indexMembership;
  }


  public StockNotationScreenerSearchData compliance(StockNotationScreenerSearchDataCompliance compliance) {
    this.compliance = compliance;
    return this;
  }

   /**
   * Get compliance
   * @return compliance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_COMPLIANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StockNotationScreenerSearchDataCompliance getCompliance() {
    return compliance;
  }


  @JsonProperty(JSON_PROPERTY_COMPLIANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCompliance(StockNotationScreenerSearchDataCompliance compliance) {
    this.compliance = compliance;
  }


  public StockNotationScreenerSearchData reportedKeyFigures(java.util.List<StockNotationScreenerSearchDataReportedKeyFigures> reportedKeyFigures) {
    this.reportedKeyFigures = reportedKeyFigures;
    return this;
  }

  public StockNotationScreenerSearchData addReportedKeyFiguresItem(StockNotationScreenerSearchDataReportedKeyFigures reportedKeyFiguresItem) {
    if (this.reportedKeyFigures == null) {
      this.reportedKeyFigures = new java.util.ArrayList<>();
    }
    this.reportedKeyFigures.add(reportedKeyFiguresItem);
    return this;
  }

   /**
   * Parameters for stock-specific key figures as reported for a fiscal year.
   * @return reportedKeyFigures
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Parameters for stock-specific key figures as reported for a fiscal year.")
  @JsonProperty(JSON_PROPERTY_REPORTED_KEY_FIGURES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<StockNotationScreenerSearchDataReportedKeyFigures> getReportedKeyFigures() {
    return reportedKeyFigures;
  }


  @JsonProperty(JSON_PROPERTY_REPORTED_KEY_FIGURES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReportedKeyFigures(java.util.List<StockNotationScreenerSearchDataReportedKeyFigures> reportedKeyFigures) {
    this.reportedKeyFigures = reportedKeyFigures;
  }


  public StockNotationScreenerSearchData performance(StockNotationScreenerSearchDataPerformance performance) {
    this.performance = performance;
    return this;
  }

   /**
   * Get performance
   * @return performance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PERFORMANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StockNotationScreenerSearchDataPerformance getPerformance() {
    return performance;
  }


  @JsonProperty(JSON_PROPERTY_PERFORMANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPerformance(StockNotationScreenerSearchDataPerformance performance) {
    this.performance = performance;
  }


  public StockNotationScreenerSearchData volatility(StockNotationScreenerSearchDataVolatility volatility) {
    this.volatility = volatility;
    return this;
  }

   /**
   * Get volatility
   * @return volatility
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VOLATILITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StockNotationScreenerSearchDataVolatility getVolatility() {
    return volatility;
  }


  @JsonProperty(JSON_PROPERTY_VOLATILITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVolatility(StockNotationScreenerSearchDataVolatility volatility) {
    this.volatility = volatility;
  }


  public StockNotationScreenerSearchData tradingValue(StockNotationScreenerSearchDataTradingValue tradingValue) {
    this.tradingValue = tradingValue;
    return this;
  }

   /**
   * Get tradingValue
   * @return tradingValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TRADING_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StockNotationScreenerSearchDataTradingValue getTradingValue() {
    return tradingValue;
  }


  @JsonProperty(JSON_PROPERTY_TRADING_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTradingValue(StockNotationScreenerSearchDataTradingValue tradingValue) {
    this.tradingValue = tradingValue;
  }


  public StockNotationScreenerSearchData simpleMovingAverage(StockNotationScreenerSearchDataSimpleMovingAverage simpleMovingAverage) {
    this.simpleMovingAverage = simpleMovingAverage;
    return this;
  }

   /**
   * Get simpleMovingAverage
   * @return simpleMovingAverage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SIMPLE_MOVING_AVERAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StockNotationScreenerSearchDataSimpleMovingAverage getSimpleMovingAverage() {
    return simpleMovingAverage;
  }


  @JsonProperty(JSON_PROPERTY_SIMPLE_MOVING_AVERAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSimpleMovingAverage(StockNotationScreenerSearchDataSimpleMovingAverage simpleMovingAverage) {
    this.simpleMovingAverage = simpleMovingAverage;
  }


  public StockNotationScreenerSearchData rsiWilder(StockNotationScreenerSearchDataRsiWilder rsiWilder) {
    this.rsiWilder = rsiWilder;
    return this;
  }

   /**
   * Get rsiWilder
   * @return rsiWilder
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RSI_WILDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StockNotationScreenerSearchDataRsiWilder getRsiWilder() {
    return rsiWilder;
  }


  @JsonProperty(JSON_PROPERTY_RSI_WILDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRsiWilder(StockNotationScreenerSearchDataRsiWilder rsiWilder) {
    this.rsiWilder = rsiWilder;
  }


  public StockNotationScreenerSearchData recommendation(StockNotationScreenerSearchDataRecommendation recommendation) {
    this.recommendation = recommendation;
    return this;
  }

   /**
   * Get recommendation
   * @return recommendation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RECOMMENDATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StockNotationScreenerSearchDataRecommendation getRecommendation() {
    return recommendation;
  }


  @JsonProperty(JSON_PROPERTY_RECOMMENDATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRecommendation(StockNotationScreenerSearchDataRecommendation recommendation) {
    this.recommendation = recommendation;
  }


  public StockNotationScreenerSearchData estimates(java.util.List<StockNotationScreenerSearchDataEstimates> estimates) {
    this.estimates = estimates;
    return this;
  }

  public StockNotationScreenerSearchData addEstimatesItem(StockNotationScreenerSearchDataEstimates estimatesItem) {
    if (this.estimates == null) {
      this.estimates = new java.util.ArrayList<>();
    }
    this.estimates.add(estimatesItem);
    return this;
  }

   /**
   * Parameters for stock-specific consolidated estimates for a fiscal year.
   * @return estimates
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Parameters for stock-specific consolidated estimates for a fiscal year.")
  @JsonProperty(JSON_PROPERTY_ESTIMATES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<StockNotationScreenerSearchDataEstimates> getEstimates() {
    return estimates;
  }


  @JsonProperty(JSON_PROPERTY_ESTIMATES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEstimates(java.util.List<StockNotationScreenerSearchDataEstimates> estimates) {
    this.estimates = estimates;
  }


  /**
   * Return true if this _stock_notation_screener_search_data object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StockNotationScreenerSearchData stockNotationScreenerSearchData = (StockNotationScreenerSearchData) o;
    return Objects.equals(this.validation, stockNotationScreenerSearchData.validation) &&
        Objects.equals(this.stockType, stockNotationScreenerSearchData.stockType) &&
        Objects.equals(this.industryClassification, stockNotationScreenerSearchData.industryClassification) &&
        Objects.equals(this.company, stockNotationScreenerSearchData.company) &&
        Objects.equals(this.indexMembership, stockNotationScreenerSearchData.indexMembership) &&
        Objects.equals(this.compliance, stockNotationScreenerSearchData.compliance) &&
        Objects.equals(this.reportedKeyFigures, stockNotationScreenerSearchData.reportedKeyFigures) &&
        Objects.equals(this.performance, stockNotationScreenerSearchData.performance) &&
        Objects.equals(this.volatility, stockNotationScreenerSearchData.volatility) &&
        Objects.equals(this.tradingValue, stockNotationScreenerSearchData.tradingValue) &&
        Objects.equals(this.simpleMovingAverage, stockNotationScreenerSearchData.simpleMovingAverage) &&
        Objects.equals(this.rsiWilder, stockNotationScreenerSearchData.rsiWilder) &&
        Objects.equals(this.recommendation, stockNotationScreenerSearchData.recommendation) &&
        Objects.equals(this.estimates, stockNotationScreenerSearchData.estimates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(validation, stockType, industryClassification, company, indexMembership, compliance, reportedKeyFigures, performance, volatility, tradingValue, simpleMovingAverage, rsiWilder, recommendation, estimates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StockNotationScreenerSearchData {\n");
    sb.append("    validation: ").append(toIndentedString(validation)).append("\n");
    sb.append("    stockType: ").append(toIndentedString(stockType)).append("\n");
    sb.append("    industryClassification: ").append(toIndentedString(industryClassification)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    indexMembership: ").append(toIndentedString(indexMembership)).append("\n");
    sb.append("    compliance: ").append(toIndentedString(compliance)).append("\n");
    sb.append("    reportedKeyFigures: ").append(toIndentedString(reportedKeyFigures)).append("\n");
    sb.append("    performance: ").append(toIndentedString(performance)).append("\n");
    sb.append("    volatility: ").append(toIndentedString(volatility)).append("\n");
    sb.append("    tradingValue: ").append(toIndentedString(tradingValue)).append("\n");
    sb.append("    simpleMovingAverage: ").append(toIndentedString(simpleMovingAverage)).append("\n");
    sb.append("    rsiWilder: ").append(toIndentedString(rsiWilder)).append("\n");
    sb.append("    recommendation: ").append(toIndentedString(recommendation)).append("\n");
    sb.append("    estimates: ").append(toIndentedString(estimates)).append("\n");
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

