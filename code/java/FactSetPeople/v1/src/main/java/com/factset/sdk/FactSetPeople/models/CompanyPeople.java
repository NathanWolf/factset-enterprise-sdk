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
  CompanyPeople.JSON_PROPERTY_FSYM_ID,
  CompanyPeople.JSON_PROPERTY_EMAIL,
  CompanyPeople.JSON_PROPERTY_NAME,
  CompanyPeople.JSON_PROPERTY_JOB_FUNCTION1,
  CompanyPeople.JSON_PROPERTY_JOB_FUNCTION2,
  CompanyPeople.JSON_PROPERTY_JOB_FUNCTION3,
  CompanyPeople.JSON_PROPERTY_JOB_FUNCTION4,
  CompanyPeople.JSON_PROPERTY_MAIN_PHONE,
  CompanyPeople.JSON_PROPERTY_PERSON_ID,
  CompanyPeople.JSON_PROPERTY_PHONE,
  CompanyPeople.JSON_PROPERTY_REQUEST_ID,
  CompanyPeople.JSON_PROPERTY_TITLE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CompanyPeople implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_FSYM_ID = "fsymId";
  private JsonNullable<String> fsymId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_EMAIL = "email";
  private JsonNullable<String> email = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_NAME = "name";
  private JsonNullable<String> name = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_JOB_FUNCTION1 = "jobFunction1";
  private JsonNullable<String> jobFunction1 = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_JOB_FUNCTION2 = "jobFunction2";
  private JsonNullable<String> jobFunction2 = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_JOB_FUNCTION3 = "jobFunction3";
  private JsonNullable<String> jobFunction3 = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_JOB_FUNCTION4 = "jobFunction4";
  private JsonNullable<String> jobFunction4 = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_MAIN_PHONE = "mainPhone";
  private JsonNullable<String> mainPhone = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PERSON_ID = "personId";
  private JsonNullable<String> personId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PHONE = "phone";
  private JsonNullable<String> phone = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_REQUEST_ID = "requestId";
  private String requestId;

  public static final String JSON_PROPERTY_TITLE = "title";
  private JsonNullable<String> title = JsonNullable.<String>undefined();

  public CompanyPeople() { 
  }

  public CompanyPeople fsymId(String fsymId) {
    this.fsymId = JsonNullable.<String>of(fsymId);
    return this;
  }

   /**
   * FactSet Identifier for the company requested.
   * @return fsymId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "000C7F-E", value = "FactSet Identifier for the company requested.")
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


  public CompanyPeople email(String email) {
    this.email = JsonNullable.<String>of(email);
    return this;
  }

   /**
   * Email of the person
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Email of the person")
  @JsonIgnore

  public String getEmail() {
        return email.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getEmail_JsonNullable() {
    return email;
  }
  
  @JsonProperty(JSON_PROPERTY_EMAIL)
  public void setEmail_JsonNullable(JsonNullable<String> email) {
    this.email = email;
  }

  public void setEmail(String email) {
    this.email = JsonNullable.<String>of(email);
  }


  public CompanyPeople name(String name) {
    this.name = JsonNullable.<String>of(name);
    return this;
  }

   /**
   * FactSet Name of the person
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Tim Cook", value = "FactSet Name of the person")
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


  public CompanyPeople jobFunction1(String jobFunction1) {
    this.jobFunction1 = JsonNullable.<String>of(jobFunction1);
    return this;
  }

   /**
   * Job Function1
   * @return jobFunction1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Chief Executive Officer", value = "Job Function1")
  @JsonIgnore

  public String getJobFunction1() {
        return jobFunction1.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_JOB_FUNCTION1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getJobFunction1_JsonNullable() {
    return jobFunction1;
  }
  
  @JsonProperty(JSON_PROPERTY_JOB_FUNCTION1)
  public void setJobFunction1_JsonNullable(JsonNullable<String> jobFunction1) {
    this.jobFunction1 = jobFunction1;
  }

  public void setJobFunction1(String jobFunction1) {
    this.jobFunction1 = JsonNullable.<String>of(jobFunction1);
  }


  public CompanyPeople jobFunction2(String jobFunction2) {
    this.jobFunction2 = JsonNullable.<String>of(jobFunction2);
    return this;
  }

   /**
   * Job Function2
   * @return jobFunction2
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Director/Board Member", value = "Job Function2")
  @JsonIgnore

  public String getJobFunction2() {
        return jobFunction2.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_JOB_FUNCTION2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getJobFunction2_JsonNullable() {
    return jobFunction2;
  }
  
  @JsonProperty(JSON_PROPERTY_JOB_FUNCTION2)
  public void setJobFunction2_JsonNullable(JsonNullable<String> jobFunction2) {
    this.jobFunction2 = jobFunction2;
  }

  public void setJobFunction2(String jobFunction2) {
    this.jobFunction2 = JsonNullable.<String>of(jobFunction2);
  }


  public CompanyPeople jobFunction3(String jobFunction3) {
    this.jobFunction3 = JsonNullable.<String>of(jobFunction3);
    return this;
  }

   /**
   * Job Function3
   * @return jobFunction3
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Job Function3")
  @JsonIgnore

  public String getJobFunction3() {
        return jobFunction3.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_JOB_FUNCTION3)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getJobFunction3_JsonNullable() {
    return jobFunction3;
  }
  
  @JsonProperty(JSON_PROPERTY_JOB_FUNCTION3)
  public void setJobFunction3_JsonNullable(JsonNullable<String> jobFunction3) {
    this.jobFunction3 = jobFunction3;
  }

  public void setJobFunction3(String jobFunction3) {
    this.jobFunction3 = JsonNullable.<String>of(jobFunction3);
  }


  public CompanyPeople jobFunction4(String jobFunction4) {
    this.jobFunction4 = JsonNullable.<String>of(jobFunction4);
    return this;
  }

   /**
   * Job Function4
   * @return jobFunction4
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Job Function4")
  @JsonIgnore

  public String getJobFunction4() {
        return jobFunction4.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_JOB_FUNCTION4)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getJobFunction4_JsonNullable() {
    return jobFunction4;
  }
  
  @JsonProperty(JSON_PROPERTY_JOB_FUNCTION4)
  public void setJobFunction4_JsonNullable(JsonNullable<String> jobFunction4) {
    this.jobFunction4 = jobFunction4;
  }

  public void setJobFunction4(String jobFunction4) {
    this.jobFunction4 = JsonNullable.<String>of(jobFunction4);
  }


  public CompanyPeople mainPhone(String mainPhone) {
    this.mainPhone = JsonNullable.<String>of(mainPhone);
    return this;
  }

   /**
   * Main Phone Numbers of the executives.
   * @return mainPhone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1.408.996.1010", value = "Main Phone Numbers of the executives.")
  @JsonIgnore

  public String getMainPhone() {
        return mainPhone.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MAIN_PHONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getMainPhone_JsonNullable() {
    return mainPhone;
  }
  
  @JsonProperty(JSON_PROPERTY_MAIN_PHONE)
  public void setMainPhone_JsonNullable(JsonNullable<String> mainPhone) {
    this.mainPhone = mainPhone;
  }

  public void setMainPhone(String mainPhone) {
    this.mainPhone = JsonNullable.<String>of(mainPhone);
  }


  public CompanyPeople personId(String personId) {
    this.personId = JsonNullable.<String>of(personId);
    return this;
  }

   /**
   * FactSet Entity Identifier for the Person.
   * @return personId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "05F520-E", value = "FactSet Entity Identifier for the Person.")
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


  public CompanyPeople phone(String phone) {
    this.phone = JsonNullable.<String>of(phone);
    return this;
  }

   /**
   * Phone number of the executives.
   * @return phone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Phone number of the executives.")
  @JsonIgnore

  public String getPhone() {
        return phone.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PHONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getPhone_JsonNullable() {
    return phone;
  }
  
  @JsonProperty(JSON_PROPERTY_PHONE)
  public void setPhone_JsonNullable(JsonNullable<String> phone) {
    this.phone = phone;
  }

  public void setPhone(String phone) {
    this.phone = JsonNullable.<String>of(phone);
  }


  public CompanyPeople requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

   /**
   * Original identifier used for the request.
   * @return requestId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "AAPL-US", value = "Original identifier used for the request.")
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


  public CompanyPeople title(String title) {
    this.title = JsonNullable.<String>of(title);
    return this;
  }

   /**
   * Executive titles for a specified company.
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Chief Executive officer & Director", value = "Executive titles for a specified company.")
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


  /**
   * Return true if this companyPeople object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompanyPeople companyPeople = (CompanyPeople) o;
    return equalsNullable(this.fsymId, companyPeople.fsymId) &&
        equalsNullable(this.email, companyPeople.email) &&
        equalsNullable(this.name, companyPeople.name) &&
        equalsNullable(this.jobFunction1, companyPeople.jobFunction1) &&
        equalsNullable(this.jobFunction2, companyPeople.jobFunction2) &&
        equalsNullable(this.jobFunction3, companyPeople.jobFunction3) &&
        equalsNullable(this.jobFunction4, companyPeople.jobFunction4) &&
        equalsNullable(this.mainPhone, companyPeople.mainPhone) &&
        equalsNullable(this.personId, companyPeople.personId) &&
        equalsNullable(this.phone, companyPeople.phone) &&
        Objects.equals(this.requestId, companyPeople.requestId) &&
        equalsNullable(this.title, companyPeople.title);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(fsymId), hashCodeNullable(email), hashCodeNullable(name), hashCodeNullable(jobFunction1), hashCodeNullable(jobFunction2), hashCodeNullable(jobFunction3), hashCodeNullable(jobFunction4), hashCodeNullable(mainPhone), hashCodeNullable(personId), hashCodeNullable(phone), requestId, hashCodeNullable(title));
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
    sb.append("class CompanyPeople {\n");
    sb.append("    fsymId: ").append(toIndentedString(fsymId)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    jobFunction1: ").append(toIndentedString(jobFunction1)).append("\n");
    sb.append("    jobFunction2: ").append(toIndentedString(jobFunction2)).append("\n");
    sb.append("    jobFunction3: ").append(toIndentedString(jobFunction3)).append("\n");
    sb.append("    jobFunction4: ").append(toIndentedString(jobFunction4)).append("\n");
    sb.append("    mainPhone: ").append(toIndentedString(mainPhone)).append("\n");
    sb.append("    personId: ").append(toIndentedString(personId)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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

