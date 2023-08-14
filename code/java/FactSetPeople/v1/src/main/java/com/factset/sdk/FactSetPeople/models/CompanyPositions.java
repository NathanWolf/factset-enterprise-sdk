/*
 * FactSet People API
 * The FactSet People API exposes FactSet data for individuals and their jobs. 
 *
 * The version of the OpenAPI document: 1.2.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.FactSetPeople.models;

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
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.FactSetPeople.JSON;


/**
 * List of executives for the specified company identifier.
 */
@ApiModel(description = "List of executives for the specified company identifier.")
@JsonPropertyOrder({
  CompanyPositions.JSON_PROPERTY_FSYM_ID,
  CompanyPositions.JSON_PROPERTY_PERSON_ID,
  CompanyPositions.JSON_PROPERTY_NAME,
  CompanyPositions.JSON_PROPERTY_TITLE,
  CompanyPositions.JSON_PROPERTY_YEARS_AT_FIRM,
  CompanyPositions.JSON_PROPERTY_AGE,
  CompanyPositions.JSON_PROPERTY_GENDER,
  CompanyPositions.JSON_PROPERTY_REQUEST_POSITION,
  CompanyPositions.JSON_PROPERTY_REQUEST_ID
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CompanyPositions implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_FSYM_ID = "fsymId";
  private JsonNullable<String> fsymId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PERSON_ID = "personId";
  private JsonNullable<String> personId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_NAME = "name";
  private JsonNullable<String> name = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_TITLE = "title";
  private JsonNullable<String> title = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_YEARS_AT_FIRM = "yearsAtFirm";
  private JsonNullable<Double> yearsAtFirm = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_AGE = "age";
  private JsonNullable<BigDecimal> age = JsonNullable.<BigDecimal>undefined();

  public static final String JSON_PROPERTY_GENDER = "gender";
  private JsonNullable<String> gender = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_REQUEST_POSITION = "requestPosition";
  private JsonNullable<String> requestPosition = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_REQUEST_ID = "requestId";
  private String requestId;

  public CompanyPositions() { 
  }

  public CompanyPositions fsymId(String fsymId) {
    this.fsymId = JsonNullable.<String>of(fsymId);
    return this;
  }

   /**
   * FactSet Identifier for the company.
   * @return fsymId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "006XY7-E", value = "FactSet Identifier for the company.")
  @JsonIgnore

  public String getFsymId() {
        return fsymId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FSYM_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getFsymId_JsonNullable() {
    return fsymId;
  }
  
  @JsonProperty(JSON_PROPERTY_FSYM_ID)
  public void setFsymId_JsonNullable(JsonNullable<String> fsymId) {
    this.fsymId = fsymId;
  }

  public void setFsymId(String fsymId) {
    this.fsymId = JsonNullable.<String>of(fsymId);
  }


  public CompanyPositions personId(String personId) {
    this.personId = JsonNullable.<String>of(personId);
    return this;
  }

   /**
   * Factset Entity Identifier for the Person
   * @return personId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "05H8B8-E", value = "Factset Entity Identifier for the Person")
  @JsonIgnore

  public String getPersonId() {
        return personId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PERSON_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getPersonId_JsonNullable() {
    return personId;
  }
  
  @JsonProperty(JSON_PROPERTY_PERSON_ID)
  public void setPersonId_JsonNullable(JsonNullable<String> personId) {
    this.personId = personId;
  }

  public void setPersonId(String personId) {
    this.personId = JsonNullable.<String>of(personId);
  }


  public CompanyPositions name(String name) {
    this.name = JsonNullable.<String>of(name);
    return this;
  }

   /**
   * FactSet Name of the person
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Elon Reeve Musk", value = "FactSet Name of the person")
  @JsonIgnore

  public String getName() {
        return name.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getName_JsonNullable() {
    return name;
  }
  
  @JsonProperty(JSON_PROPERTY_NAME)
  public void setName_JsonNullable(JsonNullable<String> name) {
    this.name = name;
  }

  public void setName(String name) {
    this.name = JsonNullable.<String>of(name);
  }


  public CompanyPositions title(String title) {
    this.title = JsonNullable.<String>of(title);
    return this;
  }

   /**
   * The requested Position Title
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Technoking of Tesla", value = "The requested Position Title")
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


  public CompanyPositions yearsAtFirm(Double yearsAtFirm) {
    this.yearsAtFirm = JsonNullable.<Double>of(yearsAtFirm);
    return this;
  }

   /**
   * The number of years individual is at firm. For founders, this is since inception.
   * @return yearsAtFirm
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "17.78", value = "The number of years individual is at firm. For founders, this is since inception.")
  @JsonIgnore

  public Double getYearsAtFirm() {
        return yearsAtFirm.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_YEARS_AT_FIRM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Double> getYearsAtFirm_JsonNullable() {
    return yearsAtFirm;
  }
  
  @JsonProperty(JSON_PROPERTY_YEARS_AT_FIRM)
  public void setYearsAtFirm_JsonNullable(JsonNullable<Double> yearsAtFirm) {
    this.yearsAtFirm = yearsAtFirm;
  }

  public void setYearsAtFirm(Double yearsAtFirm) {
    this.yearsAtFirm = JsonNullable.<Double>of(yearsAtFirm);
  }


  public CompanyPositions age(BigDecimal age) {
    this.age = JsonNullable.<BigDecimal>of(age);
    return this;
  }

   /**
   * The age of the person requested.
   * @return age
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "48", value = "The age of the person requested.")
  @JsonIgnore

  public BigDecimal getAge() {
        return age.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_AGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<BigDecimal> getAge_JsonNullable() {
    return age;
  }
  
  @JsonProperty(JSON_PROPERTY_AGE)
  public void setAge_JsonNullable(JsonNullable<BigDecimal> age) {
    this.age = age;
  }

  public void setAge(BigDecimal age) {
    this.age = JsonNullable.<BigDecimal>of(age);
  }


  public CompanyPositions gender(String gender) {
    this.gender = JsonNullable.<String>of(gender);
    return this;
  }

   /**
   * The Gender of the person requested.
   * @return gender
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Male", value = "The Gender of the person requested.")
  @JsonIgnore

  public String getGender() {
        return gender.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_GENDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getGender_JsonNullable() {
    return gender;
  }
  
  @JsonProperty(JSON_PROPERTY_GENDER)
  public void setGender_JsonNullable(JsonNullable<String> gender) {
    this.gender = gender;
  }

  public void setGender(String gender) {
    this.gender = JsonNullable.<String>of(gender);
  }


  public CompanyPositions requestPosition(String requestPosition) {
    this.requestPosition = JsonNullable.<String>of(requestPosition);
    return this;
  }

   /**
   * The requested position code.
   * @return requestPosition
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "CEO", value = "The requested position code.")
  @JsonIgnore

  public String getRequestPosition() {
        return requestPosition.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_REQUEST_POSITION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getRequestPosition_JsonNullable() {
    return requestPosition;
  }
  
  @JsonProperty(JSON_PROPERTY_REQUEST_POSITION)
  public void setRequestPosition_JsonNullable(JsonNullable<String> requestPosition) {
    this.requestPosition = requestPosition;
  }

  public void setRequestPosition(String requestPosition) {
    this.requestPosition = JsonNullable.<String>of(requestPosition);
  }


  public CompanyPositions requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

   /**
   * Original identifier used for the request.
   * @return requestId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "TSLA-US", value = "Original identifier used for the request.")
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


  /**
   * Return true if this companyPositions object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompanyPositions companyPositions = (CompanyPositions) o;
    return equalsNullable(this.fsymId, companyPositions.fsymId) &&
        equalsNullable(this.personId, companyPositions.personId) &&
        equalsNullable(this.name, companyPositions.name) &&
        equalsNullable(this.title, companyPositions.title) &&
        equalsNullable(this.yearsAtFirm, companyPositions.yearsAtFirm) &&
        equalsNullable(this.age, companyPositions.age) &&
        equalsNullable(this.gender, companyPositions.gender) &&
        equalsNullable(this.requestPosition, companyPositions.requestPosition) &&
        Objects.equals(this.requestId, companyPositions.requestId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(fsymId), hashCodeNullable(personId), hashCodeNullable(name), hashCodeNullable(title), hashCodeNullable(yearsAtFirm), hashCodeNullable(age), hashCodeNullable(gender), hashCodeNullable(requestPosition), requestId);
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
    sb.append("class CompanyPositions {\n");
    sb.append("    fsymId: ").append(toIndentedString(fsymId)).append("\n");
    sb.append("    personId: ").append(toIndentedString(personId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    yearsAtFirm: ").append(toIndentedString(yearsAtFirm)).append("\n");
    sb.append("    age: ").append(toIndentedString(age)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    requestPosition: ").append(toIndentedString(requestPosition)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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

