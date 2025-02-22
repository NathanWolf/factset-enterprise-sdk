/*
 * FactSet ESG API
 * FactSet ESG (powered by FactSet Truvalue Labs) applies machine learning to uncover risks and opportunities from companies' Environmental, Social and Governance (ESG) behavior, which are aggregated and categorized into continuously updated, material ESG scores. The service focuses on company ESG behavior from external sources and includes both positive and negative events that go beyond traditional sources of ESG risk data.<p> FactSet ESG extracts, analyzes, and generates scores from millions of documents each month collected from more than 100,000 data sources in over 30 languages. Sources include news, trade journals, NGOs, watchdog groups, trade blogs, industry reports and social media. Products deliver investable insights by revealing value and risk factors from unstructured data at the speed of current events.</p> 
 *
 * The version of the OpenAPI document: 1.6.0
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
import com.factset.sdk.FactSetESG.models.Calendar;
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
 * SASB Scores All Request Body
 */
@ApiModel(description = "SASB Scores All Request Body")
@JsonPropertyOrder({
  SasbScoresAllRequest.JSON_PROPERTY_IDS,
  SasbScoresAllRequest.JSON_PROPERTY_SCORE_TYPES,
  SasbScoresAllRequest.JSON_PROPERTY_START_DATE,
  SasbScoresAllRequest.JSON_PROPERTY_END_DATE,
  SasbScoresAllRequest.JSON_PROPERTY_FREQUENCY,
  SasbScoresAllRequest.JSON_PROPERTY_CALENDAR
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class SasbScoresAllRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_IDS = "ids";
  private java.util.List<String> ids = new java.util.ArrayList<>();

  public static final String JSON_PROPERTY_SCORE_TYPES = "scoreTypes";
  private java.util.List<String> scoreTypes = null;

  public static final String JSON_PROPERTY_START_DATE = "startDate";
  private String startDate;

  public static final String JSON_PROPERTY_END_DATE = "endDate";
  private String endDate;

  public static final String JSON_PROPERTY_FREQUENCY = "frequency";
  private Frequency frequency = Frequency.D;

  public static final String JSON_PROPERTY_CALENDAR = "calendar";
  private Calendar calendar = Calendar.SEVENDAY;

  public SasbScoresAllRequest() { 
  }

  @JsonCreator
  public SasbScoresAllRequest(
    @JsonProperty(value=JSON_PROPERTY_IDS, required=true) java.util.List<String> ids
  ) {
    this();
    this.ids = ids;
  }

  public SasbScoresAllRequest ids(java.util.List<String> ids) {
    this.ids = ids;
    return this;
  }

  public SasbScoresAllRequest addIdsItem(String idsItem) {
    this.ids.add(idsItem);
    return this;
  }

   /**
   * Security or Entity identifiers. FactSet Identifiers, tickers, CUSIP and SEDOL are accepted input. &lt;p&gt;***ids limit** &#x3D;  1000 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may exceed this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;* 
   * @return ids
  **/
  @jakarta.annotation.Nonnull
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


  public SasbScoresAllRequest scoreTypes(java.util.List<String> scoreTypes) {
    this.scoreTypes = scoreTypes;
    return this;
  }

  public SasbScoresAllRequest addScoreTypesItem(String scoreTypesItem) {
    if (this.scoreTypes == null) {
      this.scoreTypes = new java.util.ArrayList<>();
    }
    this.scoreTypes.add(scoreTypesItem);
    return this;
  }

   /**
   * The FactSet Truvalue Score types being requested. Score Types include the Pulse, Insight, Momentum, Article Volume, Category Volume, Dynamic Materiality Score, Adjusted Insight, and Industry Percentile. When left blank all score types will be returned for the requested Id. To specify select scores returned in the response, provide a comma-separated list of the scores using the description below. &lt;p&gt;These scores use the same underlying data and 100-point scale, except for ranks and percentiles. The cognitive computing system behind FactSet&#39;s Truvalue Platform uses natural language processing to interpret semantic content and generate analytics. It does so by applying criteria that are consistent with established sustainability and ESG frameworks, scoring data points on performance using a 0 to 100 scale. A score of 50 represents a neutral impact. Scores above 50 indicate positive performance, and scores below reflect negative performance.&lt;/p&gt;  ### ESG Score Types  |**SASB Category Input**|**Description**| |---|---| |**PULSE**|*Pulse Score*, is a measure of near-term performance changes that highlights opportunities and controversies, enabling real-time monitoring of companies. It focuses on events of the day and provides a responsive signal to alert investors to dynamic moves.| |**INSIGHT**|*Insight Score*, a measure of a company&#39;s longer-term ESG track record, similar to a ratings system. Scores are less sensitive to daily events and reflect the enduring performance record of a company over time. Scores are derived using an exponentially-weighted moving average of the Pulse, defined below, and the half-life of an event&#39;s influence on the overall score is 6 months.| |**MOMENTUM**|*Momentum Score*, measures the trend of a company&#39;s Insight score. It is a unique ESG metric in the industry that gives investors a high-precision view of the trajectory of a company&#39;s ESG performance, relative to peers. It does so by precisely articulating upward or downward movement, relative to that of all others in the universe, making it a measure that enhances quantitative workflows.| |**ART_VOL_TTM**|*Article Volume Score*, measures the information flow or number of articles about a company over the past 12 months.| |**CAT_VOL_TTM**|*Category Volume Score*, returns the total number of times any of the 26 categories received a score over a trailing twelve-month (TTM) period of time.| |**DYNAMIC_MAT**|*Dynamic Materiality Score*, shows the percentage value of data flow by category compared with the total data flow for the organization **(NOT VALID for &#x60;ALLCATEGORIES&#x60; and &#x60;MATERIALITY&#x60; category types).**| |**ADJ_INSIGHT**|*Adjusted Insight*, Measures company ESG performance, generating scores for lower-volume and zero-volume firms by blending company scores with industry medians. **(ONLY Vaild for &#x60;ALLCATEGORIES&#x60; and &#x60;MATERIALITY&#x60; categories). &lt;p&gt;**Adjusted Insight Score &#x3D; (# of articles / 5) x Company Insight Score + ((5 - # of articles) / 5) x Industry (or Sector) Median Insight Score.&lt;/p&gt;| |**IND_PCTL**|*Industry Percentile*, offers context on company Adjusted Insight scores relative to peers in the same SICS Industry. This value is used to establish the textual ESG Rank. **(ONLY Vaild for &#x60;ALLCATEGORIES&#x60; and &#x60;MATERIALITY&#x60; categories).**|  ### Helper Input **ALL**&#x3D; *Ability to fetch all of the \&quot;scoreTypes\&quot; listed above in a simplified query.* This is used by default and removes the need to explitly request each scoreType in the list. 
   * @return scoreTypes
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "[\"PULSE\",\"INSIGHT\",\"MOMENTUM\"]", value = "The FactSet Truvalue Score types being requested. Score Types include the Pulse, Insight, Momentum, Article Volume, Category Volume, Dynamic Materiality Score, Adjusted Insight, and Industry Percentile. When left blank all score types will be returned for the requested Id. To specify select scores returned in the response, provide a comma-separated list of the scores using the description below. <p>These scores use the same underlying data and 100-point scale, except for ranks and percentiles. The cognitive computing system behind FactSet's Truvalue Platform uses natural language processing to interpret semantic content and generate analytics. It does so by applying criteria that are consistent with established sustainability and ESG frameworks, scoring data points on performance using a 0 to 100 scale. A score of 50 represents a neutral impact. Scores above 50 indicate positive performance, and scores below reflect negative performance.</p>  ### ESG Score Types  |**SASB Category Input**|**Description**| |---|---| |**PULSE**|*Pulse Score*, is a measure of near-term performance changes that highlights opportunities and controversies, enabling real-time monitoring of companies. It focuses on events of the day and provides a responsive signal to alert investors to dynamic moves.| |**INSIGHT**|*Insight Score*, a measure of a company's longer-term ESG track record, similar to a ratings system. Scores are less sensitive to daily events and reflect the enduring performance record of a company over time. Scores are derived using an exponentially-weighted moving average of the Pulse, defined below, and the half-life of an event's influence on the overall score is 6 months.| |**MOMENTUM**|*Momentum Score*, measures the trend of a company's Insight score. It is a unique ESG metric in the industry that gives investors a high-precision view of the trajectory of a company's ESG performance, relative to peers. It does so by precisely articulating upward or downward movement, relative to that of all others in the universe, making it a measure that enhances quantitative workflows.| |**ART_VOL_TTM**|*Article Volume Score*, measures the information flow or number of articles about a company over the past 12 months.| |**CAT_VOL_TTM**|*Category Volume Score*, returns the total number of times any of the 26 categories received a score over a trailing twelve-month (TTM) period of time.| |**DYNAMIC_MAT**|*Dynamic Materiality Score*, shows the percentage value of data flow by category compared with the total data flow for the organization **(NOT VALID for `ALLCATEGORIES` and `MATERIALITY` category types).**| |**ADJ_INSIGHT**|*Adjusted Insight*, Measures company ESG performance, generating scores for lower-volume and zero-volume firms by blending company scores with industry medians. **(ONLY Vaild for `ALLCATEGORIES` and `MATERIALITY` categories). <p>**Adjusted Insight Score = (# of articles / 5) x Company Insight Score + ((5 - # of articles) / 5) x Industry (or Sector) Median Insight Score.</p>| |**IND_PCTL**|*Industry Percentile*, offers context on company Adjusted Insight scores relative to peers in the same SICS Industry. This value is used to establish the textual ESG Rank. **(ONLY Vaild for `ALLCATEGORIES` and `MATERIALITY` categories).**|  ### Helper Input **ALL**= *Ability to fetch all of the \"scoreTypes\" listed above in a simplified query.* This is used by default and removes the need to explitly request each scoreType in the list. ")
  @JsonProperty(JSON_PROPERTY_SCORE_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<String> getScoreTypes() {
    return scoreTypes;
  }


  @JsonProperty(JSON_PROPERTY_SCORE_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setScoreTypes(java.util.List<String> scoreTypes) {
    this.scoreTypes = scoreTypes;
  }


  public SasbScoresAllRequest startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * The start date requested for a given date range in **YYYY-MM-DD** format. Data is available on a Fiscal Annual periodicity, but updated Daily. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint. 
   * @return startDate
  **/
  @jakarta.annotation.Nullable
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


  public SasbScoresAllRequest endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * The end date requested for a given date range in **YYYY-MM-DD** format. Data is available on a Fiscal Annual periodicity, but updated Daily. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint. 
   * @return endDate
  **/
  @jakarta.annotation.Nullable
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


  public SasbScoresAllRequest frequency(Frequency frequency) {
    this.frequency = frequency;
    return this;
  }

   /**
   * Get frequency
   * @return frequency
  **/
  @jakarta.annotation.Nullable
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


  public SasbScoresAllRequest calendar(Calendar calendar) {
    this.calendar = calendar;
    return this;
  }

   /**
   * Get calendar
   * @return calendar
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CALENDAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Calendar getCalendar() {
    return calendar;
  }


  @JsonProperty(JSON_PROPERTY_CALENDAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCalendar(Calendar calendar) {
    this.calendar = calendar;
  }


  /**
   * Return true if this sasbScoresAllRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SasbScoresAllRequest sasbScoresAllRequest = (SasbScoresAllRequest) o;
    return Objects.equals(this.ids, sasbScoresAllRequest.ids) &&
        Objects.equals(this.scoreTypes, sasbScoresAllRequest.scoreTypes) &&
        Objects.equals(this.startDate, sasbScoresAllRequest.startDate) &&
        Objects.equals(this.endDate, sasbScoresAllRequest.endDate) &&
        Objects.equals(this.frequency, sasbScoresAllRequest.frequency) &&
        Objects.equals(this.calendar, sasbScoresAllRequest.calendar);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ids, scoreTypes, startDate, endDate, frequency, calendar);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SasbScoresAllRequest {\n");
    sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
    sb.append("    scoreTypes: ").append(toIndentedString(scoreTypes)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    calendar: ").append(toIndentedString(calendar)).append("\n");
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

