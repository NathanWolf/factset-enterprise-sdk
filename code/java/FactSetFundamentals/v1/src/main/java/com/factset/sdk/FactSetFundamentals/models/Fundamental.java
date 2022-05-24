/*
 * FactSet Fundamentals API
 * Gain access to current, comprehensive, and comparative information on securities in worldwide developed and emerging markets. Composed of annual and interim/quarterly data, detailed historical financial statement content, per share data, and calculated ratios, FactSet Fundamentals provides you with the information you need for a global investment perspective. 
 *
 * The version of the OpenAPI document: 1.0.2
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
import java.time.LocalDate;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.FactSetFundamentals.JSON;


/**
 * Fundamental
 */
@JsonPropertyOrder({
  Fundamental.JSON_PROPERTY_REQUEST_ID,
  Fundamental.JSON_PROPERTY_FSYM_ID,
  Fundamental.JSON_PROPERTY_METRIC,
  Fundamental.JSON_PROPERTY_PERIODICITY,
  Fundamental.JSON_PROPERTY_FISCAL_PERIOD,
  Fundamental.JSON_PROPERTY_FISCAL_YEAR,
  Fundamental.JSON_PROPERTY_FISCAL_PERIOD_LENGTH,
  Fundamental.JSON_PROPERTY_FISCAL_END_DATE,
  Fundamental.JSON_PROPERTY_REPORT_DATE,
  Fundamental.JSON_PROPERTY_EPS_REPORT_DATE,
  Fundamental.JSON_PROPERTY_UPDATE_TYPE,
  Fundamental.JSON_PROPERTY_UPDATE_STATUS,
  Fundamental.JSON_PROPERTY_CURRENCY,
  Fundamental.JSON_PROPERTY_VALUE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Fundamental implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_REQUEST_ID = "requestId";
  private String requestId;

  public static final String JSON_PROPERTY_FSYM_ID = "fsymId";
  private String fsymId;

  public static final String JSON_PROPERTY_METRIC = "metric";
  private String metric;

  /**
   * Periodicity or frequency of the fiscal periods, where ANN &#x3D; Annual Original, ANN_R &#x3D; Annual Latest, QTR &#x3D; Quarterly Original, QTR_R &#x3D; Quarterly Latest, SEMI &#x3D; Semi-Annual, LTM &#x3D; Last Twelve Months, LTMSG &#x3D; Last Twelve Months Global [OA17959](https://my.apps.factset.com/oa/pages/17959) and YTD &#x3D; Year-to-date.
   */
  public enum PeriodicityEnum {
    ANN("ANN"),
    
    ANN_R("ANN_R"),
    
    QTR("QTR"),
    
    QTR_R("QTR_R"),
    
    SEMI("SEMI"),
    
    CAL("CAL"),
    
    LTM("LTM"),
    
    LTMSG("LTMSG"),
    
    YTD("YTD");

    private String value;

    PeriodicityEnum(String value) {
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
    public static PeriodicityEnum fromValue(String value) {
      for (PeriodicityEnum b : PeriodicityEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_PERIODICITY = "periodicity";
  private PeriodicityEnum periodicity;

  public static final String JSON_PROPERTY_FISCAL_PERIOD = "fiscalPeriod";
  private Integer fiscalPeriod;

  public static final String JSON_PROPERTY_FISCAL_YEAR = "fiscalYear";
  private Integer fiscalYear;

  public static final String JSON_PROPERTY_FISCAL_PERIOD_LENGTH = "fiscalPeriodLength";
  private Integer fiscalPeriodLength;

  public static final String JSON_PROPERTY_FISCAL_END_DATE = "fiscalEndDate";
  private LocalDate fiscalEndDate;

  public static final String JSON_PROPERTY_REPORT_DATE = "reportDate";
  private LocalDate reportDate;

  public static final String JSON_PROPERTY_EPS_REPORT_DATE = "epsReportDate";
  private LocalDate epsReportDate;

  public static final String JSON_PROPERTY_UPDATE_TYPE = "updateType";
  private Integer updateType;

  public static final String JSON_PROPERTY_UPDATE_STATUS = "updateStatus";
  private String updateStatus;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  private String currency;

  public static final String JSON_PROPERTY_VALUE = "value";
  private Object value;

  public Fundamental() { 
  }

  public Fundamental requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

   /**
   * Identifier that was used for the request.
   * @return requestId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "IBM-US", value = "Identifier that was used for the request.")
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


  public Fundamental fsymId(String fsymId) {
    this.fsymId = fsymId;
    return this;
  }

   /**
   * FactSet Regional Security Identifier. Six alpha-numeric characters, excluding vowels, with an -R suffix (XXXXXX-R). Identifies the security&#39;s best regional security data series per currency. For equities, all primary listings per region and currency are allocated a regional-level permanent identifier. The regional-level permanent identifier will be available once a SEDOL representing the region/currency has been allocated and the identifiers are on FactSet.
   * @return fsymId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SJY281-R", value = "FactSet Regional Security Identifier. Six alpha-numeric characters, excluding vowels, with an -R suffix (XXXXXX-R). Identifies the security's best regional security data series per currency. For equities, all primary listings per region and currency are allocated a regional-level permanent identifier. The regional-level permanent identifier will be available once a SEDOL representing the region/currency has been allocated and the identifiers are on FactSet.")
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


  public Fundamental metric(String metric) {
    this.metric = metric;
    return this;
  }

   /**
   * The requested &#x60;metric&#x60; input, representing the Fundamental Data Item. For a definition of the item please use the /fundamentals/v#/metrics endpoint.
   * @return metric
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "FF_SALES", value = "The requested `metric` input, representing the Fundamental Data Item. For a definition of the item please use the /fundamentals/v#/metrics endpoint.")
  @JsonProperty(JSON_PROPERTY_METRIC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMetric() {
    return metric;
  }


  @JsonProperty(JSON_PROPERTY_METRIC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMetric(String metric) {
    this.metric = metric;
  }


  public Fundamental periodicity(PeriodicityEnum periodicity) {
    this.periodicity = periodicity;
    return this;
  }

   /**
   * Periodicity or frequency of the fiscal periods, where ANN &#x3D; Annual Original, ANN_R &#x3D; Annual Latest, QTR &#x3D; Quarterly Original, QTR_R &#x3D; Quarterly Latest, SEMI &#x3D; Semi-Annual, LTM &#x3D; Last Twelve Months, LTMSG &#x3D; Last Twelve Months Global [OA17959](https://my.apps.factset.com/oa/pages/17959) and YTD &#x3D; Year-to-date.
   * @return periodicity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "QTR", value = "Periodicity or frequency of the fiscal periods, where ANN = Annual Original, ANN_R = Annual Latest, QTR = Quarterly Original, QTR_R = Quarterly Latest, SEMI = Semi-Annual, LTM = Last Twelve Months, LTMSG = Last Twelve Months Global [OA17959](https://my.apps.factset.com/oa/pages/17959) and YTD = Year-to-date.")
  @JsonProperty(JSON_PROPERTY_PERIODICITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PeriodicityEnum getPeriodicity() {
    return periodicity;
  }


  @JsonProperty(JSON_PROPERTY_PERIODICITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPeriodicity(PeriodicityEnum periodicity) {
    this.periodicity = periodicity;
  }


  public Fundamental fiscalPeriod(Integer fiscalPeriod) {
    this.fiscalPeriod = fiscalPeriod;
    return this;
  }

   /**
   * Fiscal Period indicator. Returns an integer representing the fiscal period for the requested item and periodicity. QUARTERLY CODE: 1-Fist Quarter; 2-Second Quarter; 3-Third Quarter; 4-Fourth Quarter. SEMI-CODE: 1-First Semi-annual Period; 2-Second Semi-annual Period.
   * @return fiscalPeriod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "4", value = "Fiscal Period indicator. Returns an integer representing the fiscal period for the requested item and periodicity. QUARTERLY CODE: 1-Fist Quarter; 2-Second Quarter; 3-Third Quarter; 4-Fourth Quarter. SEMI-CODE: 1-First Semi-annual Period; 2-Second Semi-annual Period.")
  @JsonProperty(JSON_PROPERTY_FISCAL_PERIOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getFiscalPeriod() {
    return fiscalPeriod;
  }


  @JsonProperty(JSON_PROPERTY_FISCAL_PERIOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFiscalPeriod(Integer fiscalPeriod) {
    this.fiscalPeriod = fiscalPeriod;
  }


  public Fundamental fiscalYear(Integer fiscalYear) {
    this.fiscalYear = fiscalYear;
    return this;
  }

   /**
   * Fiscal year of the reported period in YYYY format.
   * @return fiscalYear
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2018", value = "Fiscal year of the reported period in YYYY format.")
  @JsonProperty(JSON_PROPERTY_FISCAL_YEAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getFiscalYear() {
    return fiscalYear;
  }


  @JsonProperty(JSON_PROPERTY_FISCAL_YEAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFiscalYear(Integer fiscalYear) {
    this.fiscalYear = fiscalYear;
  }


  public Fundamental fiscalPeriodLength(Integer fiscalPeriodLength) {
    this.fiscalPeriodLength = fiscalPeriodLength;
    return this;
  }

   /**
   * Length of fiscal period in days.
   * @return fiscalPeriodLength
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "91", value = "Length of fiscal period in days.")
  @JsonProperty(JSON_PROPERTY_FISCAL_PERIOD_LENGTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getFiscalPeriodLength() {
    return fiscalPeriodLength;
  }


  @JsonProperty(JSON_PROPERTY_FISCAL_PERIOD_LENGTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFiscalPeriodLength(Integer fiscalPeriodLength) {
    this.fiscalPeriodLength = fiscalPeriodLength;
  }


  public Fundamental fiscalEndDate(LocalDate fiscalEndDate) {
    this.fiscalEndDate = fiscalEndDate;
    return this;
  }

   /**
   * The normalized data the fiscal period ended.
   * @return fiscalEndDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Sun Dec 31 00:00:00 UTC 2017", value = "The normalized data the fiscal period ended.")
  @JsonProperty(JSON_PROPERTY_FISCAL_END_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LocalDate getFiscalEndDate() {
    return fiscalEndDate;
  }


  @JsonProperty(JSON_PROPERTY_FISCAL_END_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFiscalEndDate(LocalDate fiscalEndDate) {
    this.fiscalEndDate = fiscalEndDate;
  }


  public Fundamental reportDate(LocalDate reportDate) {
    this.reportDate = reportDate;
    return this;
  }

   /**
   * The date the reported fiscal period actually ended.
   * @return reportDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Sat Dec 30 00:00:00 UTC 2017", value = "The date the reported fiscal period actually ended.")
  @JsonProperty(JSON_PROPERTY_REPORT_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LocalDate getReportDate() {
    return reportDate;
  }


  @JsonProperty(JSON_PROPERTY_REPORT_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReportDate(LocalDate reportDate) {
    this.reportDate = reportDate;
  }


  public Fundamental epsReportDate(LocalDate epsReportDate) {
    this.epsReportDate = epsReportDate;
    return this;
  }

   /**
   * The date the EPS was reported for the requested periodicity. In YYYY-MM-DD format. Unavailable data returned as 0001-01-01.
   * @return epsReportDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Sat Feb 24 00:00:00 UTC 2018", value = "The date the EPS was reported for the requested periodicity. In YYYY-MM-DD format. Unavailable data returned as 0001-01-01.")
  @JsonProperty(JSON_PROPERTY_EPS_REPORT_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LocalDate getEpsReportDate() {
    return epsReportDate;
  }


  @JsonProperty(JSON_PROPERTY_EPS_REPORT_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEpsReportDate(LocalDate epsReportDate) {
    this.epsReportDate = epsReportDate;
  }


  public Fundamental updateType(Integer updateType) {
    this.updateType = updateType;
    return this;
  }

   /**
   * The update type, where: 1 &#x3D; Preliminary; 2 &#x3D; FAST; 3 &#x3D; Final. For more details, visit [Online Assistant Page #D13094](https://oa.apps.factset.com/pages/D13094).
   * @return updateType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "The update type, where: 1 = Preliminary; 2 = FAST; 3 = Final. For more details, visit [Online Assistant Page #D13094](https://oa.apps.factset.com/pages/D13094).")
  @JsonProperty(JSON_PROPERTY_UPDATE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getUpdateType() {
    return updateType;
  }


  @JsonProperty(JSON_PROPERTY_UPDATE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpdateType(Integer updateType) {
    this.updateType = updateType;
  }


  public Fundamental updateStatus(String updateStatus) {
    this.updateStatus = updateStatus;
    return this;
  }

   /**
   * Update Status Flag: P &#x3D; Preliminary - The period is updated from a report that usually contains limited or only key information., F &#x3D; Final - The period is updated from a report where detailed information are available in financial statements including the notes to the line items.
   * @return updateStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "P", value = "Update Status Flag: P = Preliminary - The period is updated from a report that usually contains limited or only key information., F = Final - The period is updated from a report where detailed information are available in financial statements including the notes to the line items.")
  @JsonProperty(JSON_PROPERTY_UPDATE_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUpdateStatus() {
    return updateStatus;
  }


  @JsonProperty(JSON_PROPERTY_UPDATE_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpdateStatus(String updateStatus) {
    this.updateStatus = updateStatus;
  }


  public Fundamental currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Currency code for the data. For a list of currency ISO codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470).
   * @return currency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "USD", value = "Currency code for the data. For a list of currency ISO codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470).")
  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCurrency() {
    return currency;
  }


  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrency(String currency) {
    this.currency = currency;
  }


  public Fundamental value(Object value) {
    this.value = value;
    return this;
  }

   /**
   * Value of the data metric requested. Note that the type of value is &#39;object&#39;, and depending on the data metric requested, the value could be an object representation of a string or double. 
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "12375", value = "Value of the data metric requested. Note that the type of value is 'object', and depending on the data metric requested, the value could be an object representation of a string or double. ")
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getValue() {
    return value;
  }


  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValue(Object value) {
    this.value = value;
  }


  /**
   * Return true if this fundamental object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Fundamental fundamental = (Fundamental) o;
    return Objects.equals(this.requestId, fundamental.requestId) &&
        Objects.equals(this.fsymId, fundamental.fsymId) &&
        Objects.equals(this.metric, fundamental.metric) &&
        Objects.equals(this.periodicity, fundamental.periodicity) &&
        Objects.equals(this.fiscalPeriod, fundamental.fiscalPeriod) &&
        Objects.equals(this.fiscalYear, fundamental.fiscalYear) &&
        Objects.equals(this.fiscalPeriodLength, fundamental.fiscalPeriodLength) &&
        Objects.equals(this.fiscalEndDate, fundamental.fiscalEndDate) &&
        Objects.equals(this.reportDate, fundamental.reportDate) &&
        Objects.equals(this.epsReportDate, fundamental.epsReportDate) &&
        Objects.equals(this.updateType, fundamental.updateType) &&
        Objects.equals(this.updateStatus, fundamental.updateStatus) &&
        Objects.equals(this.currency, fundamental.currency) &&
        Objects.equals(this.value, fundamental.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestId, fsymId, metric, periodicity, fiscalPeriod, fiscalYear, fiscalPeriodLength, fiscalEndDate, reportDate, epsReportDate, updateType, updateStatus, currency, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Fundamental {\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    fsymId: ").append(toIndentedString(fsymId)).append("\n");
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
    sb.append("    periodicity: ").append(toIndentedString(periodicity)).append("\n");
    sb.append("    fiscalPeriod: ").append(toIndentedString(fiscalPeriod)).append("\n");
    sb.append("    fiscalYear: ").append(toIndentedString(fiscalYear)).append("\n");
    sb.append("    fiscalPeriodLength: ").append(toIndentedString(fiscalPeriodLength)).append("\n");
    sb.append("    fiscalEndDate: ").append(toIndentedString(fiscalEndDate)).append("\n");
    sb.append("    reportDate: ").append(toIndentedString(reportDate)).append("\n");
    sb.append("    epsReportDate: ").append(toIndentedString(epsReportDate)).append("\n");
    sb.append("    updateType: ").append(toIndentedString(updateType)).append("\n");
    sb.append("    updateStatus: ").append(toIndentedString(updateStatus)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

