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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.IRNNotes.JSON;


/**
 * EventSnippetDto
 */
@JsonPropertyOrder({
  EventSnippetDto.JSON_PROPERTY_ID,
  EventSnippetDto.JSON_PROPERTY_TYPE,
  EventSnippetDto.JSON_PROPERTY_NOTE_ID,
  EventSnippetDto.JSON_PROPERTY_MEETING_ID,
  EventSnippetDto.JSON_PROPERTY_CREATED_AT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class EventSnippetDto implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ID = "id";
  private java.util.UUID id;

  public static final String JSON_PROPERTY_TYPE = "type";
  private JsonNullable<String> type = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_NOTE_ID = "noteId";
  private JsonNullable<java.util.UUID> noteId = JsonNullable.<java.util.UUID>undefined();

  public static final String JSON_PROPERTY_MEETING_ID = "meetingId";
  private JsonNullable<java.util.UUID> meetingId = JsonNullable.<java.util.UUID>undefined();

  public static final String JSON_PROPERTY_CREATED_AT = "createdAt";
  private OffsetDateTime createdAt;

  public EventSnippetDto() { 
  }

  public EventSnippetDto id(java.util.UUID id) {
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


  public EventSnippetDto type(String type) {
    this.type = JsonNullable.<String>of(type);
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getType() {
        return type.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getType_JsonNullable() {
    return type;
  }
  
  @JsonProperty(JSON_PROPERTY_TYPE)
  public void setType_JsonNullable(JsonNullable<String> type) {
    this.type = type;
  }

  public void setType(String type) {
    this.type = JsonNullable.<String>of(type);
  }


  public EventSnippetDto noteId(java.util.UUID noteId) {
    this.noteId = JsonNullable.<java.util.UUID>of(noteId);
    return this;
  }

   /**
   * Get noteId
   * @return noteId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public java.util.UUID getNoteId() {
        return noteId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NOTE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<java.util.UUID> getNoteId_JsonNullable() {
    return noteId;
  }
  
  @JsonProperty(JSON_PROPERTY_NOTE_ID)
  public void setNoteId_JsonNullable(JsonNullable<java.util.UUID> noteId) {
    this.noteId = noteId;
  }

  public void setNoteId(java.util.UUID noteId) {
    this.noteId = JsonNullable.<java.util.UUID>of(noteId);
  }


  public EventSnippetDto meetingId(java.util.UUID meetingId) {
    this.meetingId = JsonNullable.<java.util.UUID>of(meetingId);
    return this;
  }

   /**
   * Get meetingId
   * @return meetingId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public java.util.UUID getMeetingId() {
        return meetingId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MEETING_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<java.util.UUID> getMeetingId_JsonNullable() {
    return meetingId;
  }
  
  @JsonProperty(JSON_PROPERTY_MEETING_ID)
  public void setMeetingId_JsonNullable(JsonNullable<java.util.UUID> meetingId) {
    this.meetingId = meetingId;
  }

  public void setMeetingId(java.util.UUID meetingId) {
    this.meetingId = JsonNullable.<java.util.UUID>of(meetingId);
  }


  public EventSnippetDto createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  /**
   * Return true if this EventSnippetDto object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventSnippetDto eventSnippetDto = (EventSnippetDto) o;
    return Objects.equals(this.id, eventSnippetDto.id) &&
        equalsNullable(this.type, eventSnippetDto.type) &&
        equalsNullable(this.noteId, eventSnippetDto.noteId) &&
        equalsNullable(this.meetingId, eventSnippetDto.meetingId) &&
        Objects.equals(this.createdAt, eventSnippetDto.createdAt);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, hashCodeNullable(type), hashCodeNullable(noteId), hashCodeNullable(meetingId), createdAt);
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
    sb.append("class EventSnippetDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    noteId: ").append(toIndentedString(noteId)).append("\n");
    sb.append("    meetingId: ").append(toIndentedString(meetingId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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

