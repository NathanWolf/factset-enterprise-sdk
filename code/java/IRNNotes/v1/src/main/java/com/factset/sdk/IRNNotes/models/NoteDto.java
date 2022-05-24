/*
 * IRN API v1
 * Allows users to extract, create, update and configure IRN data.
 *
 * The version of the OpenAPI document: 1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.IRNNotes.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.IRNNotes.models.CustomFieldValueDto;
import com.factset.sdk.IRNNotes.models.RelatedRecordsDto;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.IRNNotes.JSON;


/**
 * NoteDto
 */
@JsonPropertyOrder({
  NoteDto.JSON_PROPERTY_ID,
  NoteDto.JSON_PROPERTY_DATE,
  NoteDto.JSON_PROPERTY_CREATED_AT,
  NoteDto.JSON_PROPERTY_AUTHOR_ID,
  NoteDto.JSON_PROPERTY_CONTRIBUTOR_ID,
  NoteDto.JSON_PROPERTY_TITLE,
  NoteDto.JSON_PROPERTY_IDENTIFIER,
  NoteDto.JSON_PROPERTY_RELATED_SYMBOLS,
  NoteDto.JSON_PROPERTY_SUBJECT_ID,
  NoteDto.JSON_PROPERTY_RECOMMENDATION_ID,
  NoteDto.JSON_PROPERTY_SENTIMENT_ID,
  NoteDto.JSON_PROPERTY_SOURCE,
  NoteDto.JSON_PROPERTY_LINK,
  NoteDto.JSON_PROPERTY_BODY,
  NoteDto.JSON_PROPERTY_IS_PERSONAL,
  NoteDto.JSON_PROPERTY_STATE,
  NoteDto.JSON_PROPERTY_APPROVAL_STATUS,
  NoteDto.JSON_PROPERTY_AVERAGE_RATING,
  NoteDto.JSON_PROPERTY_RELATED_RECORDS,
  NoteDto.JSON_PROPERTY_RELATED_CONTACTS,
  NoteDto.JSON_PROPERTY_CUSTOM_FIELDS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class NoteDto implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ID = "Id";
  private java.util.UUID id;

  public static final String JSON_PROPERTY_DATE = "Date";
  private JsonNullable<String> date = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CREATED_AT = "CreatedAt";
  private JsonNullable<String> createdAt = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_AUTHOR_ID = "AuthorId";
  private java.util.UUID authorId;

  public static final String JSON_PROPERTY_CONTRIBUTOR_ID = "ContributorId";
  private java.util.UUID contributorId;

  public static final String JSON_PROPERTY_TITLE = "Title";
  private JsonNullable<String> title = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_IDENTIFIER = "Identifier";
  private JsonNullable<String> identifier = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_RELATED_SYMBOLS = "RelatedSymbols";
  private JsonNullable<java.util.List<String>> relatedSymbols = JsonNullable.<java.util.List<String>>undefined();

  public static final String JSON_PROPERTY_SUBJECT_ID = "SubjectId";
  private java.util.UUID subjectId;

  public static final String JSON_PROPERTY_RECOMMENDATION_ID = "RecommendationId";
  private JsonNullable<java.util.UUID> recommendationId = JsonNullable.<java.util.UUID>undefined();

  public static final String JSON_PROPERTY_SENTIMENT_ID = "SentimentId";
  private JsonNullable<java.util.UUID> sentimentId = JsonNullable.<java.util.UUID>undefined();

  public static final String JSON_PROPERTY_SOURCE = "Source";
  private JsonNullable<String> source = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_LINK = "Link";
  private JsonNullable<String> link = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_BODY = "Body";
  private JsonNullable<String> body = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_IS_PERSONAL = "IsPersonal";
  private Boolean isPersonal;

  public static final String JSON_PROPERTY_STATE = "State";
  private JsonNullable<String> state = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_APPROVAL_STATUS = "ApprovalStatus";
  private JsonNullable<String> approvalStatus = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_AVERAGE_RATING = "AverageRating";
  private JsonNullable<Integer> averageRating = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_RELATED_RECORDS = "RelatedRecords";
  private RelatedRecordsDto relatedRecords;

  public static final String JSON_PROPERTY_RELATED_CONTACTS = "RelatedContacts";
  private JsonNullable<java.util.List<java.util.UUID>> relatedContacts = JsonNullable.<java.util.List<java.util.UUID>>undefined();

  public static final String JSON_PROPERTY_CUSTOM_FIELDS = "CustomFields";
  private JsonNullable<java.util.List<CustomFieldValueDto>> customFields = JsonNullable.<java.util.List<CustomFieldValueDto>>undefined();

  public NoteDto() { 
  }

  public NoteDto id(java.util.UUID id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.UUID getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(java.util.UUID id) {
    this.id = id;
  }


  public NoteDto date(String date) {
    this.date = JsonNullable.<String>of(date);
    return this;
  }

   /**
   * Get date
   * @return date
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getDate() {
        return date.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getDate_JsonNullable() {
    return date;
  }
  
  @JsonProperty(JSON_PROPERTY_DATE)
  public void setDate_JsonNullable(JsonNullable<String> date) {
    this.date = date;
  }

  public void setDate(String date) {
    this.date = JsonNullable.<String>of(date);
  }


  public NoteDto createdAt(String createdAt) {
    this.createdAt = JsonNullable.<String>of(createdAt);
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getCreatedAt() {
        return createdAt.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getCreatedAt_JsonNullable() {
    return createdAt;
  }
  
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  public void setCreatedAt_JsonNullable(JsonNullable<String> createdAt) {
    this.createdAt = createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = JsonNullable.<String>of(createdAt);
  }


  public NoteDto authorId(java.util.UUID authorId) {
    this.authorId = authorId;
    return this;
  }

   /**
   * Get authorId
   * @return authorId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AUTHOR_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.UUID getAuthorId() {
    return authorId;
  }


  @JsonProperty(JSON_PROPERTY_AUTHOR_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAuthorId(java.util.UUID authorId) {
    this.authorId = authorId;
  }


  public NoteDto contributorId(java.util.UUID contributorId) {
    this.contributorId = contributorId;
    return this;
  }

   /**
   * Get contributorId
   * @return contributorId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CONTRIBUTOR_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.UUID getContributorId() {
    return contributorId;
  }


  @JsonProperty(JSON_PROPERTY_CONTRIBUTOR_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContributorId(java.util.UUID contributorId) {
    this.contributorId = contributorId;
  }


  public NoteDto title(String title) {
    this.title = JsonNullable.<String>of(title);
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getTitle() {
        return title.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getTitle_JsonNullable() {
    return title;
  }
  
  @JsonProperty(JSON_PROPERTY_TITLE)
  public void setTitle_JsonNullable(JsonNullable<String> title) {
    this.title = title;
  }

  public void setTitle(String title) {
    this.title = JsonNullable.<String>of(title);
  }


  public NoteDto identifier(String identifier) {
    this.identifier = JsonNullable.<String>of(identifier);
    return this;
  }

   /**
   * Get identifier
   * @return identifier
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getIdentifier() {
        return identifier.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_IDENTIFIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getIdentifier_JsonNullable() {
    return identifier;
  }
  
  @JsonProperty(JSON_PROPERTY_IDENTIFIER)
  public void setIdentifier_JsonNullable(JsonNullable<String> identifier) {
    this.identifier = identifier;
  }

  public void setIdentifier(String identifier) {
    this.identifier = JsonNullable.<String>of(identifier);
  }


  public NoteDto relatedSymbols(java.util.List<String> relatedSymbols) {
    this.relatedSymbols = JsonNullable.<java.util.List<String>>of(relatedSymbols);
    return this;
  }

  public NoteDto addRelatedSymbolsItem(String relatedSymbolsItem) {
    if (this.relatedSymbols == null || !this.relatedSymbols.isPresent()) {
      this.relatedSymbols = JsonNullable.<java.util.List<String>>of(new java.util.ArrayList<>());
    }
    try {
      this.relatedSymbols.get().add(relatedSymbolsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get relatedSymbols
   * @return relatedSymbols
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public java.util.List<String> getRelatedSymbols() {
        return relatedSymbols.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_RELATED_SYMBOLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<java.util.List<String>> getRelatedSymbols_JsonNullable() {
    return relatedSymbols;
  }
  
  @JsonProperty(JSON_PROPERTY_RELATED_SYMBOLS)
  public void setRelatedSymbols_JsonNullable(JsonNullable<java.util.List<String>> relatedSymbols) {
    this.relatedSymbols = relatedSymbols;
  }

  public void setRelatedSymbols(java.util.List<String> relatedSymbols) {
    this.relatedSymbols = JsonNullable.<java.util.List<String>>of(relatedSymbols);
  }


  public NoteDto subjectId(java.util.UUID subjectId) {
    this.subjectId = subjectId;
    return this;
  }

   /**
   * Get subjectId
   * @return subjectId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SUBJECT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.UUID getSubjectId() {
    return subjectId;
  }


  @JsonProperty(JSON_PROPERTY_SUBJECT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubjectId(java.util.UUID subjectId) {
    this.subjectId = subjectId;
  }


  public NoteDto recommendationId(java.util.UUID recommendationId) {
    this.recommendationId = JsonNullable.<java.util.UUID>of(recommendationId);
    return this;
  }

   /**
   * Get recommendationId
   * @return recommendationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public java.util.UUID getRecommendationId() {
        return recommendationId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_RECOMMENDATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<java.util.UUID> getRecommendationId_JsonNullable() {
    return recommendationId;
  }
  
  @JsonProperty(JSON_PROPERTY_RECOMMENDATION_ID)
  public void setRecommendationId_JsonNullable(JsonNullable<java.util.UUID> recommendationId) {
    this.recommendationId = recommendationId;
  }

  public void setRecommendationId(java.util.UUID recommendationId) {
    this.recommendationId = JsonNullable.<java.util.UUID>of(recommendationId);
  }


  public NoteDto sentimentId(java.util.UUID sentimentId) {
    this.sentimentId = JsonNullable.<java.util.UUID>of(sentimentId);
    return this;
  }

   /**
   * Get sentimentId
   * @return sentimentId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public java.util.UUID getSentimentId() {
        return sentimentId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SENTIMENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<java.util.UUID> getSentimentId_JsonNullable() {
    return sentimentId;
  }
  
  @JsonProperty(JSON_PROPERTY_SENTIMENT_ID)
  public void setSentimentId_JsonNullable(JsonNullable<java.util.UUID> sentimentId) {
    this.sentimentId = sentimentId;
  }

  public void setSentimentId(java.util.UUID sentimentId) {
    this.sentimentId = JsonNullable.<java.util.UUID>of(sentimentId);
  }


  public NoteDto source(String source) {
    this.source = JsonNullable.<String>of(source);
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getSource() {
        return source.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getSource_JsonNullable() {
    return source;
  }
  
  @JsonProperty(JSON_PROPERTY_SOURCE)
  public void setSource_JsonNullable(JsonNullable<String> source) {
    this.source = source;
  }

  public void setSource(String source) {
    this.source = JsonNullable.<String>of(source);
  }


  public NoteDto link(String link) {
    this.link = JsonNullable.<String>of(link);
    return this;
  }

   /**
   * Get link
   * @return link
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getLink() {
        return link.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LINK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getLink_JsonNullable() {
    return link;
  }
  
  @JsonProperty(JSON_PROPERTY_LINK)
  public void setLink_JsonNullable(JsonNullable<String> link) {
    this.link = link;
  }

  public void setLink(String link) {
    this.link = JsonNullable.<String>of(link);
  }


  public NoteDto body(String body) {
    this.body = JsonNullable.<String>of(body);
    return this;
  }

   /**
   * Get body
   * @return body
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getBody() {
        return body.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_BODY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getBody_JsonNullable() {
    return body;
  }
  
  @JsonProperty(JSON_PROPERTY_BODY)
  public void setBody_JsonNullable(JsonNullable<String> body) {
    this.body = body;
  }

  public void setBody(String body) {
    this.body = JsonNullable.<String>of(body);
  }


  public NoteDto isPersonal(Boolean isPersonal) {
    this.isPersonal = isPersonal;
    return this;
  }

   /**
   * Get isPersonal
   * @return isPersonal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IS_PERSONAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsPersonal() {
    return isPersonal;
  }


  @JsonProperty(JSON_PROPERTY_IS_PERSONAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsPersonal(Boolean isPersonal) {
    this.isPersonal = isPersonal;
  }


  public NoteDto state(String state) {
    this.state = JsonNullable.<String>of(state);
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getState() {
        return state.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getState_JsonNullable() {
    return state;
  }
  
  @JsonProperty(JSON_PROPERTY_STATE)
  public void setState_JsonNullable(JsonNullable<String> state) {
    this.state = state;
  }

  public void setState(String state) {
    this.state = JsonNullable.<String>of(state);
  }


  public NoteDto approvalStatus(String approvalStatus) {
    this.approvalStatus = JsonNullable.<String>of(approvalStatus);
    return this;
  }

   /**
   * Get approvalStatus
   * @return approvalStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getApprovalStatus() {
        return approvalStatus.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_APPROVAL_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getApprovalStatus_JsonNullable() {
    return approvalStatus;
  }
  
  @JsonProperty(JSON_PROPERTY_APPROVAL_STATUS)
  public void setApprovalStatus_JsonNullable(JsonNullable<String> approvalStatus) {
    this.approvalStatus = approvalStatus;
  }

  public void setApprovalStatus(String approvalStatus) {
    this.approvalStatus = JsonNullable.<String>of(approvalStatus);
  }


  public NoteDto averageRating(Integer averageRating) {
    this.averageRating = JsonNullable.<Integer>of(averageRating);
    return this;
  }

   /**
   * Get averageRating
   * @return averageRating
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public Integer getAverageRating() {
        return averageRating.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_AVERAGE_RATING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getAverageRating_JsonNullable() {
    return averageRating;
  }
  
  @JsonProperty(JSON_PROPERTY_AVERAGE_RATING)
  public void setAverageRating_JsonNullable(JsonNullable<Integer> averageRating) {
    this.averageRating = averageRating;
  }

  public void setAverageRating(Integer averageRating) {
    this.averageRating = JsonNullable.<Integer>of(averageRating);
  }


  public NoteDto relatedRecords(RelatedRecordsDto relatedRecords) {
    this.relatedRecords = relatedRecords;
    return this;
  }

   /**
   * Get relatedRecords
   * @return relatedRecords
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RELATED_RECORDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RelatedRecordsDto getRelatedRecords() {
    return relatedRecords;
  }


  @JsonProperty(JSON_PROPERTY_RELATED_RECORDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRelatedRecords(RelatedRecordsDto relatedRecords) {
    this.relatedRecords = relatedRecords;
  }


  public NoteDto relatedContacts(java.util.List<java.util.UUID> relatedContacts) {
    this.relatedContacts = JsonNullable.<java.util.List<java.util.UUID>>of(relatedContacts);
    return this;
  }

  public NoteDto addRelatedContactsItem(java.util.UUID relatedContactsItem) {
    if (this.relatedContacts == null || !this.relatedContacts.isPresent()) {
      this.relatedContacts = JsonNullable.<java.util.List<java.util.UUID>>of(new java.util.ArrayList<>());
    }
    try {
      this.relatedContacts.get().add(relatedContactsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get relatedContacts
   * @return relatedContacts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public java.util.List<java.util.UUID> getRelatedContacts() {
        return relatedContacts.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_RELATED_CONTACTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<java.util.List<java.util.UUID>> getRelatedContacts_JsonNullable() {
    return relatedContacts;
  }
  
  @JsonProperty(JSON_PROPERTY_RELATED_CONTACTS)
  public void setRelatedContacts_JsonNullable(JsonNullable<java.util.List<java.util.UUID>> relatedContacts) {
    this.relatedContacts = relatedContacts;
  }

  public void setRelatedContacts(java.util.List<java.util.UUID> relatedContacts) {
    this.relatedContacts = JsonNullable.<java.util.List<java.util.UUID>>of(relatedContacts);
  }


  public NoteDto customFields(java.util.List<CustomFieldValueDto> customFields) {
    this.customFields = JsonNullable.<java.util.List<CustomFieldValueDto>>of(customFields);
    return this;
  }

  public NoteDto addCustomFieldsItem(CustomFieldValueDto customFieldsItem) {
    if (this.customFields == null || !this.customFields.isPresent()) {
      this.customFields = JsonNullable.<java.util.List<CustomFieldValueDto>>of(new java.util.ArrayList<>());
    }
    try {
      this.customFields.get().add(customFieldsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get customFields
   * @return customFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public java.util.List<CustomFieldValueDto> getCustomFields() {
        return customFields.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CUSTOM_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<java.util.List<CustomFieldValueDto>> getCustomFields_JsonNullable() {
    return customFields;
  }
  
  @JsonProperty(JSON_PROPERTY_CUSTOM_FIELDS)
  public void setCustomFields_JsonNullable(JsonNullable<java.util.List<CustomFieldValueDto>> customFields) {
    this.customFields = customFields;
  }

  public void setCustomFields(java.util.List<CustomFieldValueDto> customFields) {
    this.customFields = JsonNullable.<java.util.List<CustomFieldValueDto>>of(customFields);
  }


  /**
   * Return true if this NoteDto object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NoteDto noteDto = (NoteDto) o;
    return Objects.equals(this.id, noteDto.id) &&
        equalsNullable(this.date, noteDto.date) &&
        equalsNullable(this.createdAt, noteDto.createdAt) &&
        Objects.equals(this.authorId, noteDto.authorId) &&
        Objects.equals(this.contributorId, noteDto.contributorId) &&
        equalsNullable(this.title, noteDto.title) &&
        equalsNullable(this.identifier, noteDto.identifier) &&
        equalsNullable(this.relatedSymbols, noteDto.relatedSymbols) &&
        Objects.equals(this.subjectId, noteDto.subjectId) &&
        equalsNullable(this.recommendationId, noteDto.recommendationId) &&
        equalsNullable(this.sentimentId, noteDto.sentimentId) &&
        equalsNullable(this.source, noteDto.source) &&
        equalsNullable(this.link, noteDto.link) &&
        equalsNullable(this.body, noteDto.body) &&
        Objects.equals(this.isPersonal, noteDto.isPersonal) &&
        equalsNullable(this.state, noteDto.state) &&
        equalsNullable(this.approvalStatus, noteDto.approvalStatus) &&
        equalsNullable(this.averageRating, noteDto.averageRating) &&
        Objects.equals(this.relatedRecords, noteDto.relatedRecords) &&
        equalsNullable(this.relatedContacts, noteDto.relatedContacts) &&
        equalsNullable(this.customFields, noteDto.customFields);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, hashCodeNullable(date), hashCodeNullable(createdAt), authorId, contributorId, hashCodeNullable(title), hashCodeNullable(identifier), hashCodeNullable(relatedSymbols), subjectId, hashCodeNullable(recommendationId), hashCodeNullable(sentimentId), hashCodeNullable(source), hashCodeNullable(link), hashCodeNullable(body), isPersonal, hashCodeNullable(state), hashCodeNullable(approvalStatus), hashCodeNullable(averageRating), relatedRecords, hashCodeNullable(relatedContacts), hashCodeNullable(customFields));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NoteDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    authorId: ").append(toIndentedString(authorId)).append("\n");
    sb.append("    contributorId: ").append(toIndentedString(contributorId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    relatedSymbols: ").append(toIndentedString(relatedSymbols)).append("\n");
    sb.append("    subjectId: ").append(toIndentedString(subjectId)).append("\n");
    sb.append("    recommendationId: ").append(toIndentedString(recommendationId)).append("\n");
    sb.append("    sentimentId: ").append(toIndentedString(sentimentId)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    isPersonal: ").append(toIndentedString(isPersonal)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    approvalStatus: ").append(toIndentedString(approvalStatus)).append("\n");
    sb.append("    averageRating: ").append(toIndentedString(averageRating)).append("\n");
    sb.append("    relatedRecords: ").append(toIndentedString(relatedRecords)).append("\n");
    sb.append("    relatedContacts: ").append(toIndentedString(relatedContacts)).append("\n");
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
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

