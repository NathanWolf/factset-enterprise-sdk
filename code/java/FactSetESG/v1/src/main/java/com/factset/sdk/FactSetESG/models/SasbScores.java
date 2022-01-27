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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.threeten.bp.LocalDate;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.FactSetESG.JSON;


/**
 * SasbScores
 */
@JsonPropertyOrder({
  SasbScores.JSON_PROPERTY_DATE,
  SasbScores.JSON_PROPERTY_FSYM_ID,
  SasbScores.JSON_PROPERTY_REQUEST_ID,
  SasbScores.JSON_PROPERTY_SASB_CATEGORY,
  SasbScores.JSON_PROPERTY_SASB_SCORE,
  SasbScores.JSON_PROPERTY_SCORE_TYPE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SasbScores implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_DATE = "date";
  private LocalDate date;

  public static final String JSON_PROPERTY_FSYM_ID = "fsymId";
  private String fsymId;

  public static final String JSON_PROPERTY_REQUEST_ID = "requestId";
  private String requestId;

  public static final String JSON_PROPERTY_SASB_CATEGORY = "sasbCategory";
  private String sasbCategory;

  public static final String JSON_PROPERTY_SASB_SCORE = "sasbScore";
  private Object sasbScore;

  public static final String JSON_PROPERTY_SCORE_TYPE = "scoreType";
  private String scoreType;


  public SasbScores date(LocalDate date) {
    this.date = date;
    return this;
  }

   /**
   * Date for the period requested expressed in YYYY-MM-DD format.
   * @return date
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Wed Sep 30 00:00:00 UTC 2020", value = "Date for the period requested expressed in YYYY-MM-DD format.")
  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LocalDate getDate() {
    return date;
  }


  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDate(LocalDate date) {
    this.date = date;
  }


  public SasbScores fsymId(String fsymId) {
    this.fsymId = fsymId;
    return this;
  }

   /**
   * FactSet Entity Identifier. Six alpha-numeric characters, excluding vowels, with a -E suffix (XXXXXX-E).
   * @return fsymId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "000BJT-E", value = "FactSet Entity Identifier. Six alpha-numeric characters, excluding vowels, with a -E suffix (XXXXXX-E).")
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


  public SasbScores requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

   /**
   * Identifier that was used for the request.
   * @return requestId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ADBE-US", value = "Identifier that was used for the request.")
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


  public SasbScores sasbCategory(String sasbCategory) {
    this.sasbCategory = sasbCategory;
    return this;
  }

   /**
   * The specific SASB &#39;category&#39; the score is referring to.
   * @return sasbCategory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "AIRQUALITY", value = "The specific SASB 'category' the score is referring to.")
  @JsonProperty(JSON_PROPERTY_SASB_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSasbCategory() {
    return sasbCategory;
  }


  @JsonProperty(JSON_PROPERTY_SASB_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSasbCategory(String sasbCategory) {
    this.sasbCategory = sasbCategory;
  }


  public SasbScores sasbScore(Object sasbScore) {
    this.sasbScore = sasbScore;
    return this;
  }

   /**
   * The SASB Score value for the given &#39;scoreType&#39; and &#39;category&#39;. When scoreType &#x3D; ESG_RANK, the data type will be string, otherwise data type will be a number with double format.
   * @return sasbScore
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "41.61229277", value = "The SASB Score value for the given 'scoreType' and 'category'. When scoreType = ESG_RANK, the data type will be string, otherwise data type will be a number with double format.")
  @JsonProperty(JSON_PROPERTY_SASB_SCORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getSasbScore() {
    return sasbScore;
  }


  @JsonProperty(JSON_PROPERTY_SASB_SCORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSasbScore(Object sasbScore) {
    this.sasbScore = sasbScore;
  }


  public SasbScores scoreType(String scoreType) {
    this.scoreType = scoreType;
    return this;
  }

   /**
   * The name of the specific SASB Score type being shown in the response. This will be represented by the scoreTypes input: PULSE, INSIGHT, MOMENTUM, ART_VOL_TTM, CAT_VOL_TTM, or DYNAMIC_MAT.
   * @return scoreType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "PULSE", value = "The name of the specific SASB Score type being shown in the response. This will be represented by the scoreTypes input: PULSE, INSIGHT, MOMENTUM, ART_VOL_TTM, CAT_VOL_TTM, or DYNAMIC_MAT.")
  @JsonProperty(JSON_PROPERTY_SCORE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getScoreType() {
    return scoreType;
  }


  @JsonProperty(JSON_PROPERTY_SCORE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setScoreType(String scoreType) {
    this.scoreType = scoreType;
  }


  /**
   * Return true if this sasbScores object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SasbScores sasbScores = (SasbScores) o;
    return Objects.equals(this.date, sasbScores.date) &&
        Objects.equals(this.fsymId, sasbScores.fsymId) &&
        Objects.equals(this.requestId, sasbScores.requestId) &&
        Objects.equals(this.sasbCategory, sasbScores.sasbCategory) &&
        Objects.equals(this.sasbScore, sasbScores.sasbScore) &&
        Objects.equals(this.scoreType, sasbScores.scoreType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, fsymId, requestId, sasbCategory, sasbScore, scoreType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SasbScores {\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    fsymId: ").append(toIndentedString(fsymId)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    sasbCategory: ").append(toIndentedString(sasbCategory)).append("\n");
    sb.append("    sasbScore: ").append(toIndentedString(sasbScore)).append("\n");
    sb.append("    scoreType: ").append(toIndentedString(scoreType)).append("\n");
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

