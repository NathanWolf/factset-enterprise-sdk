/*
 * Prime Developer Trial
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.NewsAPIforDigitalPortals.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.NewsAPIforDigitalPortals.models.InlineResponse200DataCategories;
import com.factset.sdk.NewsAPIforDigitalPortals.models.InlineResponse200DataDistributor;
import com.factset.sdk.NewsAPIforDigitalPortals.models.InlineResponse200DataInstruments;
import com.factset.sdk.NewsAPIforDigitalPortals.models.InlineResponse200DataLanguage;
import com.factset.sdk.NewsAPIforDigitalPortals.models.InlineResponse200DataMedia;
import com.factset.sdk.NewsAPIforDigitalPortals.models.InlineResponse200DataPublisher;
import com.factset.sdk.NewsAPIforDigitalPortals.models.InlineResponse200DataTypes;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.NewsAPIforDigitalPortals.JSON;


/**
 * Content of the news article.
 */
@ApiModel(description = "Content of the news article.")
@JsonPropertyOrder({
  InlineResponse200Data.JSON_PROPERTY_TIME,
  InlineResponse200Data.JSON_PROPERTY_HEADLINE,
  InlineResponse200Data.JSON_PROPERTY_BODY,
  InlineResponse200Data.JSON_PROPERTY_TYPES,
  InlineResponse200Data.JSON_PROPERTY_LANGUAGE,
  InlineResponse200Data.JSON_PROPERTY_DISTRIBUTOR,
  InlineResponse200Data.JSON_PROPERTY_PUBLISHER,
  InlineResponse200Data.JSON_PROPERTY_CATEGORIES,
  InlineResponse200Data.JSON_PROPERTY_INSTRUMENTS,
  InlineResponse200Data.JSON_PROPERTY_MEDIA
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse200Data implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_TIME = "time";
  private String time;

  public static final String JSON_PROPERTY_HEADLINE = "headline";
  private String headline;

  public static final String JSON_PROPERTY_BODY = "body";
  private String body;

  public static final String JSON_PROPERTY_TYPES = "types";
  private java.util.List<InlineResponse200DataTypes> types = null;

  public static final String JSON_PROPERTY_LANGUAGE = "language";
  private InlineResponse200DataLanguage language;

  public static final String JSON_PROPERTY_DISTRIBUTOR = "distributor";
  private InlineResponse200DataDistributor distributor;

  public static final String JSON_PROPERTY_PUBLISHER = "publisher";
  private InlineResponse200DataPublisher publisher;

  public static final String JSON_PROPERTY_CATEGORIES = "categories";
  private java.util.List<InlineResponse200DataCategories> categories = null;

  public static final String JSON_PROPERTY_INSTRUMENTS = "instruments";
  private java.util.List<InlineResponse200DataInstruments> instruments = null;

  public static final String JSON_PROPERTY_MEDIA = "media";
  private java.util.List<InlineResponse200DataMedia> media = null;


  public InlineResponse200Data time(String time) {
    this.time = time;
    return this;
  }

   /**
   * Date and time of the news article.
   * @return time
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date and time of the news article.")
  @JsonProperty(JSON_PROPERTY_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTime() {
    return time;
  }


  @JsonProperty(JSON_PROPERTY_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTime(String time) {
    this.time = time;
  }


  public InlineResponse200Data headline(String headline) {
    this.headline = headline;
    return this;
  }

   /**
   * Headline of the news article represented as text with HTML entity encoding but without HTML tags.
   * @return headline
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Headline of the news article represented as text with HTML entity encoding but without HTML tags.")
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


  public InlineResponse200Data body(String body) {
    this.body = body;
    return this;
  }

   /**
   * Text body of the news article.
   * @return body
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Text body of the news article.")
  @JsonProperty(JSON_PROPERTY_BODY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBody() {
    return body;
  }


  @JsonProperty(JSON_PROPERTY_BODY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBody(String body) {
    this.body = body;
  }


  public InlineResponse200Data types(java.util.List<InlineResponse200DataTypes> types) {
    this.types = types;
    return this;
  }

  public InlineResponse200Data addTypesItem(InlineResponse200DataTypes typesItem) {
    if (this.types == null) {
      this.types = new java.util.ArrayList<>();
    }
    this.types.add(typesItem);
    return this;
  }

   /**
   * Types of news article. See endpoint &#x60;/news/article/type/list&#x60; for possible values.
   * @return types
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Types of news article. See endpoint `/news/article/type/list` for possible values.")
  @JsonProperty(JSON_PROPERTY_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<InlineResponse200DataTypes> getTypes() {
    return types;
  }


  @JsonProperty(JSON_PROPERTY_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTypes(java.util.List<InlineResponse200DataTypes> types) {
    this.types = types;
  }


  public InlineResponse200Data language(InlineResponse200DataLanguage language) {
    this.language = language;
    return this;
  }

   /**
   * Get language
   * @return language
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LANGUAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse200DataLanguage getLanguage() {
    return language;
  }


  @JsonProperty(JSON_PROPERTY_LANGUAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLanguage(InlineResponse200DataLanguage language) {
    this.language = language;
  }


  public InlineResponse200Data distributor(InlineResponse200DataDistributor distributor) {
    this.distributor = distributor;
    return this;
  }

   /**
   * Get distributor
   * @return distributor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DISTRIBUTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse200DataDistributor getDistributor() {
    return distributor;
  }


  @JsonProperty(JSON_PROPERTY_DISTRIBUTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDistributor(InlineResponse200DataDistributor distributor) {
    this.distributor = distributor;
  }


  public InlineResponse200Data publisher(InlineResponse200DataPublisher publisher) {
    this.publisher = publisher;
    return this;
  }

   /**
   * Get publisher
   * @return publisher
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PUBLISHER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse200DataPublisher getPublisher() {
    return publisher;
  }


  @JsonProperty(JSON_PROPERTY_PUBLISHER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPublisher(InlineResponse200DataPublisher publisher) {
    this.publisher = publisher;
  }


  public InlineResponse200Data categories(java.util.List<InlineResponse200DataCategories> categories) {
    this.categories = categories;
    return this;
  }

  public InlineResponse200Data addCategoriesItem(InlineResponse200DataCategories categoriesItem) {
    if (this.categories == null) {
      this.categories = new java.util.ArrayList<>();
    }
    this.categories.add(categoriesItem);
    return this;
  }

   /**
   * Categories related to the news article. See endpoint &#x60;/category/list&#x60; for possible values.
   * @return categories
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Categories related to the news article. See endpoint `/category/list` for possible values.")
  @JsonProperty(JSON_PROPERTY_CATEGORIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<InlineResponse200DataCategories> getCategories() {
    return categories;
  }


  @JsonProperty(JSON_PROPERTY_CATEGORIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCategories(java.util.List<InlineResponse200DataCategories> categories) {
    this.categories = categories;
  }


  public InlineResponse200Data instruments(java.util.List<InlineResponse200DataInstruments> instruments) {
    this.instruments = instruments;
    return this;
  }

  public InlineResponse200Data addInstrumentsItem(InlineResponse200DataInstruments instrumentsItem) {
    if (this.instruments == null) {
      this.instruments = new java.util.ArrayList<>();
    }
    this.instruments.add(instrumentsItem);
    return this;
  }

   /**
   * Set of stock instruments related to the article. The set is not updated in the course of corporate actions, e.g. when the related company obtains a new instrument after a spin-off.
   * @return instruments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Set of stock instruments related to the article. The set is not updated in the course of corporate actions, e.g. when the related company obtains a new instrument after a spin-off.")
  @JsonProperty(JSON_PROPERTY_INSTRUMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<InlineResponse200DataInstruments> getInstruments() {
    return instruments;
  }


  @JsonProperty(JSON_PROPERTY_INSTRUMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInstruments(java.util.List<InlineResponse200DataInstruments> instruments) {
    this.instruments = instruments;
  }


  public InlineResponse200Data media(java.util.List<InlineResponse200DataMedia> media) {
    this.media = media;
    return this;
  }

  public InlineResponse200Data addMediaItem(InlineResponse200DataMedia mediaItem) {
    if (this.media == null) {
      this.media = new java.util.ArrayList<>();
    }
    this.media.add(mediaItem);
    return this;
  }

   /**
   * List of media elements of the news article.
   * @return media
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of media elements of the news article.")
  @JsonProperty(JSON_PROPERTY_MEDIA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<InlineResponse200DataMedia> getMedia() {
    return media;
  }


  @JsonProperty(JSON_PROPERTY_MEDIA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMedia(java.util.List<InlineResponse200DataMedia> media) {
    this.media = media;
  }


  /**
   * Return true if this inline_response_200_data object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200Data inlineResponse200Data = (InlineResponse200Data) o;
    return Objects.equals(this.time, inlineResponse200Data.time) &&
        Objects.equals(this.headline, inlineResponse200Data.headline) &&
        Objects.equals(this.body, inlineResponse200Data.body) &&
        Objects.equals(this.types, inlineResponse200Data.types) &&
        Objects.equals(this.language, inlineResponse200Data.language) &&
        Objects.equals(this.distributor, inlineResponse200Data.distributor) &&
        Objects.equals(this.publisher, inlineResponse200Data.publisher) &&
        Objects.equals(this.categories, inlineResponse200Data.categories) &&
        Objects.equals(this.instruments, inlineResponse200Data.instruments) &&
        Objects.equals(this.media, inlineResponse200Data.media);
  }

  @Override
  public int hashCode() {
    return Objects.hash(time, headline, body, types, language, distributor, publisher, categories, instruments, media);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200Data {\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    headline: ").append(toIndentedString(headline)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    types: ").append(toIndentedString(types)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    distributor: ").append(toIndentedString(distributor)).append("\n");
    sb.append("    publisher: ").append(toIndentedString(publisher)).append("\n");
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    instruments: ").append(toIndentedString(instruments)).append("\n");
    sb.append("    media: ").append(toIndentedString(media)).append("\n");
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

