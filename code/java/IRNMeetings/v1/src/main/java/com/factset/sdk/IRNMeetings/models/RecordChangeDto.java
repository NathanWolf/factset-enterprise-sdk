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


package com.factset.sdk.IRNMeetings.models;

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
import com.factset.sdk.IRNMeetings.JSON;


/**
 * RecordChangeDto
 */
@JsonPropertyOrder({
  RecordChangeDto.JSON_PROPERTY_FIELD,
  RecordChangeDto.JSON_PROPERTY_OPERATION,
  RecordChangeDto.JSON_PROPERTY_OLD_VALUE,
  RecordChangeDto.JSON_PROPERTY_NEW_VALUE,
  RecordChangeDto.JSON_PROPERTY_OLD_LIST,
  RecordChangeDto.JSON_PROPERTY_NEW_LIST
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RecordChangeDto implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_FIELD = "field";
  private JsonNullable<String> field = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_OPERATION = "operation";
  private JsonNullable<String> operation = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_OLD_VALUE = "oldValue";
  private JsonNullable<String> oldValue = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_NEW_VALUE = "newValue";
  private JsonNullable<String> newValue = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_OLD_LIST = "oldList";
  private JsonNullable<java.util.List<String>> oldList = JsonNullable.<java.util.List<String>>undefined();

  public static final String JSON_PROPERTY_NEW_LIST = "newList";
  private JsonNullable<java.util.List<String>> newList = JsonNullable.<java.util.List<String>>undefined();


  public RecordChangeDto field(String field) {
    this.field = JsonNullable.<String>of(field);
    return this;
  }

   /**
   * Get field
   * @return field
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getField() {
        return field.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FIELD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getField_JsonNullable() {
    return field;
  }
  
  @JsonProperty(JSON_PROPERTY_FIELD)
  public void setField_JsonNullable(JsonNullable<String> field) {
    this.field = field;
  }

  public void setField(String field) {
    this.field = JsonNullable.<String>of(field);
  }


  public RecordChangeDto operation(String operation) {
    this.operation = JsonNullable.<String>of(operation);
    return this;
  }

   /**
   * Get operation
   * @return operation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getOperation() {
        return operation.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_OPERATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getOperation_JsonNullable() {
    return operation;
  }
  
  @JsonProperty(JSON_PROPERTY_OPERATION)
  public void setOperation_JsonNullable(JsonNullable<String> operation) {
    this.operation = operation;
  }

  public void setOperation(String operation) {
    this.operation = JsonNullable.<String>of(operation);
  }


  public RecordChangeDto oldValue(String oldValue) {
    this.oldValue = JsonNullable.<String>of(oldValue);
    return this;
  }

   /**
   * Get oldValue
   * @return oldValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getOldValue() {
        return oldValue.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_OLD_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getOldValue_JsonNullable() {
    return oldValue;
  }
  
  @JsonProperty(JSON_PROPERTY_OLD_VALUE)
  public void setOldValue_JsonNullable(JsonNullable<String> oldValue) {
    this.oldValue = oldValue;
  }

  public void setOldValue(String oldValue) {
    this.oldValue = JsonNullable.<String>of(oldValue);
  }


  public RecordChangeDto newValue(String newValue) {
    this.newValue = JsonNullable.<String>of(newValue);
    return this;
  }

   /**
   * Get newValue
   * @return newValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public String getNewValue() {
        return newValue.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NEW_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getNewValue_JsonNullable() {
    return newValue;
  }
  
  @JsonProperty(JSON_PROPERTY_NEW_VALUE)
  public void setNewValue_JsonNullable(JsonNullable<String> newValue) {
    this.newValue = newValue;
  }

  public void setNewValue(String newValue) {
    this.newValue = JsonNullable.<String>of(newValue);
  }


  public RecordChangeDto oldList(java.util.List<String> oldList) {
    this.oldList = JsonNullable.<java.util.List<String>>of(oldList);
    return this;
  }

  public RecordChangeDto addOldListItem(String oldListItem) {
    if (this.oldList == null || !this.oldList.isPresent()) {
      this.oldList = JsonNullable.<java.util.List<String>>of(new java.util.ArrayList<>());
    }
    try {
      this.oldList.get().add(oldListItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get oldList
   * @return oldList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public java.util.List<String> getOldList() {
        return oldList.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_OLD_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<java.util.List<String>> getOldList_JsonNullable() {
    return oldList;
  }
  
  @JsonProperty(JSON_PROPERTY_OLD_LIST)
  public void setOldList_JsonNullable(JsonNullable<java.util.List<String>> oldList) {
    this.oldList = oldList;
  }

  public void setOldList(java.util.List<String> oldList) {
    this.oldList = JsonNullable.<java.util.List<String>>of(oldList);
  }


  public RecordChangeDto newList(java.util.List<String> newList) {
    this.newList = JsonNullable.<java.util.List<String>>of(newList);
    return this;
  }

  public RecordChangeDto addNewListItem(String newListItem) {
    if (this.newList == null || !this.newList.isPresent()) {
      this.newList = JsonNullable.<java.util.List<String>>of(new java.util.ArrayList<>());
    }
    try {
      this.newList.get().add(newListItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Get newList
   * @return newList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public java.util.List<String> getNewList() {
        return newList.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NEW_LIST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<java.util.List<String>> getNewList_JsonNullable() {
    return newList;
  }
  
  @JsonProperty(JSON_PROPERTY_NEW_LIST)
  public void setNewList_JsonNullable(JsonNullable<java.util.List<String>> newList) {
    this.newList = newList;
  }

  public void setNewList(java.util.List<String> newList) {
    this.newList = JsonNullable.<java.util.List<String>>of(newList);
  }


  /**
   * Return true if this RecordChangeDto object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecordChangeDto recordChangeDto = (RecordChangeDto) o;
    return equalsNullable(this.field, recordChangeDto.field) &&
        equalsNullable(this.operation, recordChangeDto.operation) &&
        equalsNullable(this.oldValue, recordChangeDto.oldValue) &&
        equalsNullable(this.newValue, recordChangeDto.newValue) &&
        equalsNullable(this.oldList, recordChangeDto.oldList) &&
        equalsNullable(this.newList, recordChangeDto.newList);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(field), hashCodeNullable(operation), hashCodeNullable(oldValue), hashCodeNullable(newValue), hashCodeNullable(oldList), hashCodeNullable(newList));
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
    sb.append("class RecordChangeDto {\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    oldValue: ").append(toIndentedString(oldValue)).append("\n");
    sb.append("    newValue: ").append(toIndentedString(newValue)).append("\n");
    sb.append("    oldList: ").append(toIndentedString(oldList)).append("\n");
    sb.append("    newList: ").append(toIndentedString(newList)).append("\n");
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

