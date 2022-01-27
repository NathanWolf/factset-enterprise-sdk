/*
 * IRN API v1
 * Allows users to create, update and configure IRN data.
 *
 * The version of the OpenAPI document: 1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.IRNContacts.models;

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
import com.factset.sdk.IRNContacts.JSON;


/**
 * RelationshipCategorySaveDto
 */
@JsonPropertyOrder({
  RelationshipCategorySaveDto.JSON_PROPERTY_CATEGORY_NAME,
  RelationshipCategorySaveDto.JSON_PROPERTY_IS_CONTACT_TO_CONTACT,
  RelationshipCategorySaveDto.JSON_PROPERTY_IS_CONTACT_TO_SYMBOL
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RelationshipCategorySaveDto implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_CATEGORY_NAME = "categoryName";
  private String categoryName;

  public static final String JSON_PROPERTY_IS_CONTACT_TO_CONTACT = "isContactToContact";
  private Boolean isContactToContact = false;

  public static final String JSON_PROPERTY_IS_CONTACT_TO_SYMBOL = "isContactToSymbol";
  private Boolean isContactToSymbol = false;


  public RelationshipCategorySaveDto categoryName(String categoryName) {
    this.categoryName = categoryName;
    return this;
  }

   /**
   * Get categoryName
   * @return categoryName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_CATEGORY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCategoryName() {
    return categoryName;
  }


  @JsonProperty(JSON_PROPERTY_CATEGORY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCategoryName(String categoryName) {
    this.categoryName = categoryName;
  }


  public RelationshipCategorySaveDto isContactToContact(Boolean isContactToContact) {
    this.isContactToContact = isContactToContact;
    return this;
  }

   /**
   * Get isContactToContact
   * @return isContactToContact
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IS_CONTACT_TO_CONTACT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsContactToContact() {
    return isContactToContact;
  }


  @JsonProperty(JSON_PROPERTY_IS_CONTACT_TO_CONTACT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsContactToContact(Boolean isContactToContact) {
    this.isContactToContact = isContactToContact;
  }


  public RelationshipCategorySaveDto isContactToSymbol(Boolean isContactToSymbol) {
    this.isContactToSymbol = isContactToSymbol;
    return this;
  }

   /**
   * Get isContactToSymbol
   * @return isContactToSymbol
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IS_CONTACT_TO_SYMBOL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsContactToSymbol() {
    return isContactToSymbol;
  }


  @JsonProperty(JSON_PROPERTY_IS_CONTACT_TO_SYMBOL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsContactToSymbol(Boolean isContactToSymbol) {
    this.isContactToSymbol = isContactToSymbol;
  }


  /**
   * Return true if this RelationshipCategorySaveDto object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RelationshipCategorySaveDto relationshipCategorySaveDto = (RelationshipCategorySaveDto) o;
    return Objects.equals(this.categoryName, relationshipCategorySaveDto.categoryName) &&
        Objects.equals(this.isContactToContact, relationshipCategorySaveDto.isContactToContact) &&
        Objects.equals(this.isContactToSymbol, relationshipCategorySaveDto.isContactToSymbol);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categoryName, isContactToContact, isContactToSymbol);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RelationshipCategorySaveDto {\n");
    sb.append("    categoryName: ").append(toIndentedString(categoryName)).append("\n");
    sb.append("    isContactToContact: ").append(toIndentedString(isContactToContact)).append("\n");
    sb.append("    isContactToSymbol: ").append(toIndentedString(isContactToSymbol)).append("\n");
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

