/*
 * Market Intelligence
 * Through the Market Intelligence API, stay up to date on the companies and sectors you care most about with ease. Request the templates you have made in Market Intelligence to receive news and data on your portfolio.
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.MarketIntelligence.models;

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
import com.factset.sdk.MarketIntelligence.JSON;


/**
 * lowest level of data for table return
 */
@ApiModel(description = "lowest level of data for table return")
@JsonPropertyOrder({
  ReportContent.JSON_PROPERTY_SUBJECT_MATCHED_ORDER,
  ReportContent.JSON_PROPERTY_HEADLINE,
  ReportContent.JSON_PROPERTY_STORY_DT,
  ReportContent.JSON_PROPERTY_DOC_DISP_CONTENT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ReportContent implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_SUBJECT_MATCHED_ORDER = "subject_matched_order";
  private String subjectMatchedOrder;

  public static final String JSON_PROPERTY_HEADLINE = "headline";
  private String headline;

  public static final String JSON_PROPERTY_STORY_DT = "story_dt";
  private String storyDt;

  public static final String JSON_PROPERTY_DOC_DISP_CONTENT = "doc_disp_content";
  private String docDispContent;

  public ReportContent() { 
  }

  public ReportContent subjectMatchedOrder(String subjectMatchedOrder) {
    this.subjectMatchedOrder = subjectMatchedOrder;
    return this;
  }

   /**
   * Get subjectMatchedOrder
   * @return subjectMatchedOrder
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")
  @JsonProperty(JSON_PROPERTY_SUBJECT_MATCHED_ORDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSubjectMatchedOrder() {
    return subjectMatchedOrder;
  }


  @JsonProperty(JSON_PROPERTY_SUBJECT_MATCHED_ORDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubjectMatchedOrder(String subjectMatchedOrder) {
    this.subjectMatchedOrder = subjectMatchedOrder;
  }


  public ReportContent headline(String headline) {
    this.headline = headline;
    return this;
  }

   /**
   * Get headline
   * @return headline
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "S&P futures higher", value = "")
  @JsonProperty(JSON_PROPERTY_HEADLINE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getHeadline() {
    return headline;
  }


  @JsonProperty(JSON_PROPERTY_HEADLINE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHeadline(String headline) {
    this.headline = headline;
  }


  public ReportContent storyDt(String storyDt) {
    this.storyDt = storyDt;
    return this;
  }

   /**
   * Content publishing date
   * @return storyDt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2/9/22 5:59:00 AM", value = "Content publishing date")
  @JsonProperty(JSON_PROPERTY_STORY_DT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStoryDt() {
    return storyDt;
  }


  @JsonProperty(JSON_PROPERTY_STORY_DT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStoryDt(String storyDt) {
    this.storyDt = storyDt;
  }


  public ReportContent docDispContent(String docDispContent) {
    this.docDispContent = docDispContent;
    return this;
  }

   /**
   * MI Content
   * @return docDispContent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "<ul> <li> <b>S&amp;P futures</b> up 0.8% in Wednesday morning trading after US equities finished higher on Tuesday with three of the four major indexes up over 1%. Reopening plays extended their recent outperformance while energy was the notable laggard. <b>Asian markets</b> higher overnight with Hong Kong the standout, up over 2%, while Japan gained more than 1%. European markets catching a big rally. <b>Treasuries </b>firmer across the curve with European bonds also finding some reprieve. <b>Dollar</b> weaker on the major crosses. <b>Gold</b> little changed. <b>Bitcoin futures</b> down 1.3%. <b>WTI crude</b> off 0.3% despite a surprise decline in API inventories. </li> <li> Once again, nothing specific behind firmer tone in equities. <b>Rate stabilization</b> in both US and Europe may be helping. <b>ECB's Villeroy pushed back against rate hike</b> <b>expectations</b> and FT article rehashed concerns about an ECB policy mistake. Comments from BoJ official also highlighted a high bar for a policy shift. In addition, there has been some <b>speculation that Thursday's January CPI print may come in less hot than expected</b>, while sell-side and price has started to highlight some easing of vehicle prices. <b>Improving Covid trends</b> and move to scrap some related restrictions another recently highlighted tailwind. Fauci said \"full blown\" pandemic phase nearly over in US. <b>Slight easing of geopolitical tensions</b> also in focus and has helped to dampen the surge in energy prices.  </li> <li> Only a few higher-profile earnings releases after the close on Tuesday and nothing to change the broader narrative. ~<b>CMG-US~</b> boosted by increase in long-term unit growth for NA. However, <b>~YUMC-US~ </b>hit by China's zero-Covid policy. <b>~LYFT-US~</b> disappointed on guidance, flagging Omicron headwinds, though did flag continued improvement in driver supply. <b>~PAYC-US~</b> results and guidance ahead with Street positive on record annual revenue retention and initial guidance implying \"Rule of 65\". <b>~NEWR-US~</b> beat underwhelmed and guidance only largely in line. <b>~NCR-US~</b> boosted by plan to evaluate strategic alternatives. <b>~MNDT-US~</b> billings growth accelerated after stock rallied on ~MSFT-US~ acquisition speculation. <b>~XPO-US~</b> results and guidance ahead with some positive commentary around pricing. </li> </ul>", value = "MI Content")
  @JsonProperty(JSON_PROPERTY_DOC_DISP_CONTENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDocDispContent() {
    return docDispContent;
  }


  @JsonProperty(JSON_PROPERTY_DOC_DISP_CONTENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDocDispContent(String docDispContent) {
    this.docDispContent = docDispContent;
  }


  /**
   * Return true if this Report_Content object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportContent reportContent = (ReportContent) o;
    return Objects.equals(this.subjectMatchedOrder, reportContent.subjectMatchedOrder) &&
        Objects.equals(this.headline, reportContent.headline) &&
        Objects.equals(this.storyDt, reportContent.storyDt) &&
        Objects.equals(this.docDispContent, reportContent.docDispContent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subjectMatchedOrder, headline, storyDt, docDispContent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportContent {\n");
    sb.append("    subjectMatchedOrder: ").append(toIndentedString(subjectMatchedOrder)).append("\n");
    sb.append("    headline: ").append(toIndentedString(headline)).append("\n");
    sb.append("    storyDt: ").append(toIndentedString(storyDt)).append("\n");
    sb.append("    docDispContent: ").append(toIndentedString(docDispContent)).append("\n");
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

