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
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.IRNNotes.JSON;


/**
 * AttachmentSummaryDto
 */
@JsonPropertyOrder({
  AttachmentSummaryDto.JSON_PROPERTY_ID,
  AttachmentSummaryDto.JSON_PROPERTY_FILE_NAME,
  AttachmentSummaryDto.JSON_PROPERTY_MIME_TYPE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AttachmentSummaryDto implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ID = "id";
  private java.util.UUID id;

  public static final String JSON_PROPERTY_FILE_NAME = "fileName";
  private JsonNullable<String> fileName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_MIME_TYPE = "mimeType";
  private JsonNullable<String> mimeType = JsonNullable.<String>undefined();


  public AttachmentSummaryDto id(java.util.UUID id) {
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


  public AttachmentSummaryDto fileName(String fileName) {
    this.fileName = JsonNullable.<String>of(fileName);
    return this;
  }

   /**
   * Get fileName
   * @return fileName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getFileName() {
        return fileName.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FILE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getFileName_JsonNullable() {
    return fileName;
  }
  
  @JsonProperty(JSON_PROPERTY_FILE_NAME)
  public void setFileName_JsonNullable(JsonNullable<String> fileName) {
    this.fileName = fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = JsonNullable.<String>of(fileName);
  }


  public AttachmentSummaryDto mimeType(String mimeType) {
    this.mimeType = JsonNullable.<String>of(mimeType);
    return this;
  }

   /**
   * Get mimeType
   * @return mimeType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getMimeType() {
        return mimeType.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MIME_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getMimeType_JsonNullable() {
    return mimeType;
  }
  
  @JsonProperty(JSON_PROPERTY_MIME_TYPE)
  public void setMimeType_JsonNullable(JsonNullable<String> mimeType) {
    this.mimeType = mimeType;
  }

  public void setMimeType(String mimeType) {
    this.mimeType = JsonNullable.<String>of(mimeType);
  }


  /**
   * Return true if this AttachmentSummaryDto object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AttachmentSummaryDto attachmentSummaryDto = (AttachmentSummaryDto) o;
    return Objects.equals(this.id, attachmentSummaryDto.id) &&
        equalsNullable(this.fileName, attachmentSummaryDto.fileName) &&
        equalsNullable(this.mimeType, attachmentSummaryDto.mimeType);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, hashCodeNullable(fileName), hashCodeNullable(mimeType));
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
    sb.append("class AttachmentSummaryDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    mimeType: ").append(toIndentedString(mimeType)).append("\n");
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

