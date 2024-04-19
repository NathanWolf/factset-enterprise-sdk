/*
 * StreetAccount News API
 * The StreetAccount News API provides access to FactSet's proprietary news provider, StreetAccount. StreetAccount, is a premium real-time market intelligence news service that delivers comprehensive U.S., Canadian, and European coverage (and expanding Asia coverage). All possible sources for corporate news are scanned and key story facts are highlighted and presented in an easy-to-read format.  **StreetAccount Filters, Headlines, and Views:**  These endpoints allow for the retrieval of news headlines using filters such as Watchlists/Indices/Tickers, Categories (the equivalent of 'Subjects' within the Workstation), Market Topics, Regions, and Sectors.  Headlines can also be retrieved based on saved views within the Workstation.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.StreetAccountNews.models;

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
import java.time.OffsetDateTime;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.StreetAccountNews.JSON;


/**
 * SearchResponseArrayObject
 */
@JsonPropertyOrder({
  SearchResponseArrayObject.JSON_PROPERTY_STORY_TIME,
  SearchResponseArrayObject.JSON_PROPERTY_HEADLINES,
  SearchResponseArrayObject.JSON_PROPERTY_ID,
  SearchResponseArrayObject.JSON_PROPERTY_PRIMARY_SYMBOLS,
  SearchResponseArrayObject.JSON_PROPERTY_SYMBOLS,
  SearchResponseArrayObject.JSON_PROPERTY_SUBJECTS,
  SearchResponseArrayObject.JSON_PROPERTY_STORY_BODY,
  SearchResponseArrayObject.JSON_PROPERTY_REFERENCE_URIS,
  SearchResponseArrayObject.JSON_PROPERTY_URL
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class SearchResponseArrayObject implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_STORY_TIME = "storyTime";
  private OffsetDateTime storyTime;

  public static final String JSON_PROPERTY_HEADLINES = "headlines";
  private String headlines;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_PRIMARY_SYMBOLS = "primarySymbols";
  private java.util.List<String> primarySymbols = null;

  public static final String JSON_PROPERTY_SYMBOLS = "symbols";
  private java.util.List<String> symbols = null;

  public static final String JSON_PROPERTY_SUBJECTS = "subjects";
  private java.util.List<String> subjects = null;

  public static final String JSON_PROPERTY_STORY_BODY = "storyBody";
  private String storyBody;

  public static final String JSON_PROPERTY_REFERENCE_URIS = "referenceUris";
  private String referenceUris;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public SearchResponseArrayObject() { 
  }

  public SearchResponseArrayObject storyTime(OffsetDateTime storyTime) {
    this.storyTime = storyTime;
    return this;
  }

   /**
   * The timestamp when the story was published.
   * @return storyTime
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "2022-09-15T06:48:19Z", value = "The timestamp when the story was published.")
  @JsonProperty(JSON_PROPERTY_STORY_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getStoryTime() {
    return storyTime;
  }


  @JsonProperty(JSON_PROPERTY_STORY_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStoryTime(OffsetDateTime storyTime) {
    this.storyTime = storyTime;
  }


  public SearchResponseArrayObject headlines(String headlines) {
    this.headlines = headlines;
    return this;
  }

   /**
   * The headline of the story.
   * @return headlines
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "Sample Headline", value = "The headline of the story.")
  @JsonProperty(JSON_PROPERTY_HEADLINES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getHeadlines() {
    return headlines;
  }


  @JsonProperty(JSON_PROPERTY_HEADLINES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHeadlines(String headlines) {
    this.headlines = headlines;
  }


  public SearchResponseArrayObject id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The unique identifier for the story.
   * @return id
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "sa_story_3393235", value = "The unique identifier for the story.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }


  public SearchResponseArrayObject primarySymbols(java.util.List<String> primarySymbols) {
    this.primarySymbols = primarySymbols;
    return this;
  }

  public SearchResponseArrayObject addPrimarySymbolsItem(String primarySymbolsItem) {
    if (this.primarySymbols == null) {
      this.primarySymbols = new java.util.ArrayList<>();
    }
    this.primarySymbols.add(primarySymbolsItem);
    return this;
  }

   /**
   * Get primarySymbols
   * @return primarySymbols
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PRIMARY_SYMBOLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<String> getPrimarySymbols() {
    return primarySymbols;
  }


  @JsonProperty(JSON_PROPERTY_PRIMARY_SYMBOLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrimarySymbols(java.util.List<String> primarySymbols) {
    this.primarySymbols = primarySymbols;
  }


  public SearchResponseArrayObject symbols(java.util.List<String> symbols) {
    this.symbols = symbols;
    return this;
  }

  public SearchResponseArrayObject addSymbolsItem(String symbolsItem) {
    if (this.symbols == null) {
      this.symbols = new java.util.ArrayList<>();
    }
    this.symbols.add(symbolsItem);
    return this;
  }

   /**
   * Get symbols
   * @return symbols
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SYMBOLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<String> getSymbols() {
    return symbols;
  }


  @JsonProperty(JSON_PROPERTY_SYMBOLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSymbols(java.util.List<String> symbols) {
    this.symbols = symbols;
  }


  public SearchResponseArrayObject subjects(java.util.List<String> subjects) {
    this.subjects = subjects;
    return this;
  }

  public SearchResponseArrayObject addSubjectsItem(String subjectsItem) {
    if (this.subjects == null) {
      this.subjects = new java.util.ArrayList<>();
    }
    this.subjects.add(subjectsItem);
    return this;
  }

   /**
   * Get subjects
   * @return subjects
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SUBJECTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<String> getSubjects() {
    return subjects;
  }


  @JsonProperty(JSON_PROPERTY_SUBJECTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubjects(java.util.List<String> subjects) {
    this.subjects = subjects;
  }


  public SearchResponseArrayObject storyBody(String storyBody) {
    this.storyBody = storyBody;
    return this;
  }

   /**
   * The sample body of the story.
   * @return storyBody
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "Sample Body", value = "The sample body of the story.")
  @JsonProperty(JSON_PROPERTY_STORY_BODY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStoryBody() {
    return storyBody;
  }


  @JsonProperty(JSON_PROPERTY_STORY_BODY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStoryBody(String storyBody) {
    this.storyBody = storyBody;
  }


  public SearchResponseArrayObject referenceUris(String referenceUris) {
    this.referenceUris = referenceUris;
    return this;
  }

   /**
   * The reference URIs associated with the story.
   * @return referenceUris
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "https://www1.hkexnews.hk/listedco/listconews/sehk/2024/0315/000.pdf", value = "The reference URIs associated with the story.")
  @JsonProperty(JSON_PROPERTY_REFERENCE_URIS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReferenceUris() {
    return referenceUris;
  }


  @JsonProperty(JSON_PROPERTY_REFERENCE_URIS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReferenceUris(String referenceUris) {
    this.referenceUris = referenceUris;
  }


  public SearchResponseArrayObject url(String url) {
    this.url = url;
    return this;
  }

   /**
   * The URL of the story.
   * @return url
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "https://my.apps.factset.com/viewer-fusion/?_doc_id=sa_story_3819300&_doc_date=2000&_doc_product=SA", value = "The URL of the story.")
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUrl() {
    return url;
  }


  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUrl(String url) {
    this.url = url;
  }


  /**
   * Return true if this searchResponseArrayObject object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchResponseArrayObject searchResponseArrayObject = (SearchResponseArrayObject) o;
    return Objects.equals(this.storyTime, searchResponseArrayObject.storyTime) &&
        Objects.equals(this.headlines, searchResponseArrayObject.headlines) &&
        Objects.equals(this.id, searchResponseArrayObject.id) &&
        Objects.equals(this.primarySymbols, searchResponseArrayObject.primarySymbols) &&
        Objects.equals(this.symbols, searchResponseArrayObject.symbols) &&
        Objects.equals(this.subjects, searchResponseArrayObject.subjects) &&
        Objects.equals(this.storyBody, searchResponseArrayObject.storyBody) &&
        Objects.equals(this.referenceUris, searchResponseArrayObject.referenceUris) &&
        Objects.equals(this.url, searchResponseArrayObject.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(storyTime, headlines, id, primarySymbols, symbols, subjects, storyBody, referenceUris, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchResponseArrayObject {\n");
    sb.append("    storyTime: ").append(toIndentedString(storyTime)).append("\n");
    sb.append("    headlines: ").append(toIndentedString(headlines)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    primarySymbols: ").append(toIndentedString(primarySymbols)).append("\n");
    sb.append("    symbols: ").append(toIndentedString(symbols)).append("\n");
    sb.append("    subjects: ").append(toIndentedString(subjects)).append("\n");
    sb.append("    storyBody: ").append(toIndentedString(storyBody)).append("\n");
    sb.append("    referenceUris: ").append(toIndentedString(referenceUris)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

