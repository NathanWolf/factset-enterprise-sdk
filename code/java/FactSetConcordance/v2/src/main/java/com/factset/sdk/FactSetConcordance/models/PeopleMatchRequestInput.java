/*
 * FactSet Concordance API
 *   The FactSet Concordance API enables Application Developers and Data Scientists to programmatically discover the FactSet Identifier for a specific Entity or Person based on attributes, such as name, URL, and location.FactSet Identifiers are mapped to industry-standard identifiers, as well as to a comprehensive set of reference data and unique content, to enhance the ability to quickly connect content sets.<p>     Using the submitted attributes, the FactSet Concordance API leverages FactSet’s extensive Entity Master, People, and Symbology databases to return potential candidate matches and a proposed match. The result is a concorded FactSet Identifier that can then be used as input throughout FactSet's expanding catalog of Content using our Content APIs or Standard DataFeeds.</p>    <b>There are two types of workflows supported in the API:</b>    <b>Entity & People Match:</b> The first workflow follows traditional API conventions in that a request is accepted and a response is returned synchronously enabling the concordance of up to 25 names in a single request. The response returns a list of 20 candidates as well as a proposed match.    <b>Entity & People Match - Bulk:</b> The second workflow allows you to input a large list of names within a .CSV file in a single request With this workflow, a task is created for uploading a set of queries. Once the task has completed, the client retrieves the concordance results through the /entity-decisions or /people-decisions endpoint. Note that in the Bulk workflow, only the matches for the records are returned. Candidates are not included.    Once the service has provided a list of concorded FactSet Identifiers, you can then use our Entity Mappings and People Mappings endpoints to further review the universe of mapped identifiers or modify existing records. </p>   
 *
 * The version of the OpenAPI document: 2.8.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.FactSetConcordance.models;

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
import com.factset.sdk.FactSetConcordance.JSON;


/**
 * PeopleMatchRequestInput
 */
@JsonPropertyOrder({
  PeopleMatchRequestInput.JSON_PROPERTY_PERSON_NAME,
  PeopleMatchRequestInput.JSON_PROPERTY_CLIENT_ID,
  PeopleMatchRequestInput.JSON_PROPERTY_SALUTATION,
  PeopleMatchRequestInput.JSON_PROPERTY_FIRST_NAME,
  PeopleMatchRequestInput.JSON_PROPERTY_MIDDLE_NAME,
  PeopleMatchRequestInput.JSON_PROPERTY_LAST_NAME,
  PeopleMatchRequestInput.JSON_PROPERTY_ADDITIONAL_CONTEXT,
  PeopleMatchRequestInput.JSON_PROPERTY_SUFFIX,
  PeopleMatchRequestInput.JSON_PROPERTY_ENTITY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PeopleMatchRequestInput implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_PERSON_NAME = "personName";
  private String personName;

  public static final String JSON_PROPERTY_CLIENT_ID = "clientId";
  private String clientId;

  public static final String JSON_PROPERTY_SALUTATION = "salutation";
  private String salutation;

  public static final String JSON_PROPERTY_FIRST_NAME = "firstName";
  private String firstName;

  public static final String JSON_PROPERTY_MIDDLE_NAME = "middleName";
  private String middleName;

  public static final String JSON_PROPERTY_LAST_NAME = "lastName";
  private String lastName;

  public static final String JSON_PROPERTY_ADDITIONAL_CONTEXT = "additionalContext";
  private java.util.Map<String, String> additionalContext = null;

  public static final String JSON_PROPERTY_SUFFIX = "suffix";
  private String suffix;

  public static final String JSON_PROPERTY_ENTITY = "entity";
  private String entity;

  public PeopleMatchRequestInput() { 
  }

  public PeopleMatchRequestInput personName(String personName) {
    this.personName = personName;
    return this;
  }

   /**
   * The People name to match.
   * @return personName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Bill Gates", value = "The People name to match.")
  @JsonProperty(JSON_PROPERTY_PERSON_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPersonName() {
    return personName;
  }


  @JsonProperty(JSON_PROPERTY_PERSON_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPersonName(String personName) {
    this.personName = personName;
  }


  public PeopleMatchRequestInput clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

   /**
   * A unique identifier supplied by the user. ClientId is saved to the user&#39;s Concordance universe and will be used as the identifier for that entity within the universe. 
   * @return clientId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "abc-123", value = "A unique identifier supplied by the user. ClientId is saved to the user's Concordance universe and will be used as the identifier for that entity within the universe. ")
  @JsonProperty(JSON_PROPERTY_CLIENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getClientId() {
    return clientId;
  }


  @JsonProperty(JSON_PROPERTY_CLIENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setClientId(String clientId) {
    this.clientId = clientId;
  }


  public PeopleMatchRequestInput salutation(String salutation) {
    this.salutation = salutation;
    return this;
  }

   /**
   * The salutation is same as the normal salutation we use .The salutation can be Mr, Mrs.The salutation should not be given along with personName. 
   * @return salutation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Mr", value = "The salutation is same as the normal salutation we use .The salutation can be Mr, Mrs.The salutation should not be given along with personName. ")
  @JsonProperty(JSON_PROPERTY_SALUTATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSalutation() {
    return salutation;
  }


  @JsonProperty(JSON_PROPERTY_SALUTATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSalutation(String salutation) {
    this.salutation = salutation;
  }


  public PeopleMatchRequestInput firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * The first name of the person. This field should not be given along with personName. 
   * @return firstName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Bill", value = "The first name of the person. This field should not be given along with personName. ")
  @JsonProperty(JSON_PROPERTY_FIRST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFirstName() {
    return firstName;
  }


  @JsonProperty(JSON_PROPERTY_FIRST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public PeopleMatchRequestInput middleName(String middleName) {
    this.middleName = middleName;
    return this;
  }

   /**
   * The middle name of the person. This field should not be given along with personName. 
   * @return middleName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Henry", value = "The middle name of the person. This field should not be given along with personName. ")
  @JsonProperty(JSON_PROPERTY_MIDDLE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMiddleName() {
    return middleName;
  }


  @JsonProperty(JSON_PROPERTY_MIDDLE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }


  public PeopleMatchRequestInput lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * The last name of the person. This field should not be given along with personName. 
   * @return lastName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Gates", value = "The last name of the person. This field should not be given along with personName. ")
  @JsonProperty(JSON_PROPERTY_LAST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLastName() {
    return lastName;
  }


  @JsonProperty(JSON_PROPERTY_LAST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  public PeopleMatchRequestInput additionalContext(java.util.Map<String, String> additionalContext) {
    this.additionalContext = additionalContext;
    return this;
  }

  public PeopleMatchRequestInput putAdditionalContextItem(String key, String additionalContextItem) {
    if (this.additionalContext == null) {
      this.additionalContext = new java.util.HashMap<>();
    }
    this.additionalContext.put(key, additionalContextItem);
    return this;
  }

   /**
   * Any additional context information along with other input values that need to be saved for an entity during search. To be used by Managed Service for any unmapped records.  This is applicable when saving the records with clientId and universeId specified. 
   * @return additionalContext
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"Address\":\"123 Main St\",\"Phone\":\"555-555-5555\",\"City\":\"New York\"}", value = "Any additional context information along with other input values that need to be saved for an entity during search. To be used by Managed Service for any unmapped records.  This is applicable when saving the records with clientId and universeId specified. ")
  @JsonProperty(JSON_PROPERTY_ADDITIONAL_CONTEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.Map<String, String> getAdditionalContext() {
    return additionalContext;
  }


  @JsonProperty(JSON_PROPERTY_ADDITIONAL_CONTEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdditionalContext(java.util.Map<String, String> additionalContext) {
    this.additionalContext = additionalContext;
  }


  public PeopleMatchRequestInput suffix(String suffix) {
    this.suffix = suffix;
    return this;
  }

   /**
   * The suffix of person&#39;s name. This field should not be given along with personName. 
   * @return suffix
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "III", value = "The suffix of person's name. This field should not be given along with personName. ")
  @JsonProperty(JSON_PROPERTY_SUFFIX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSuffix() {
    return suffix;
  }


  @JsonProperty(JSON_PROPERTY_SUFFIX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSuffix(String suffix) {
    this.suffix = suffix;
  }


  public PeopleMatchRequestInput entity(String entity) {
    this.entity = entity;
    return this;
  }

   /**
   * The enity of the Person. 
   * @return entity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Microsoft", value = "The enity of the Person. ")
  @JsonProperty(JSON_PROPERTY_ENTITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEntity() {
    return entity;
  }


  @JsonProperty(JSON_PROPERTY_ENTITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEntity(String entity) {
    this.entity = entity;
  }


  /**
   * Return true if this PeopleMatchRequest_input object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PeopleMatchRequestInput peopleMatchRequestInput = (PeopleMatchRequestInput) o;
    return Objects.equals(this.personName, peopleMatchRequestInput.personName) &&
        Objects.equals(this.clientId, peopleMatchRequestInput.clientId) &&
        Objects.equals(this.salutation, peopleMatchRequestInput.salutation) &&
        Objects.equals(this.firstName, peopleMatchRequestInput.firstName) &&
        Objects.equals(this.middleName, peopleMatchRequestInput.middleName) &&
        Objects.equals(this.lastName, peopleMatchRequestInput.lastName) &&
        Objects.equals(this.additionalContext, peopleMatchRequestInput.additionalContext) &&
        Objects.equals(this.suffix, peopleMatchRequestInput.suffix) &&
        Objects.equals(this.entity, peopleMatchRequestInput.entity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(personName, clientId, salutation, firstName, middleName, lastName, additionalContext, suffix, entity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PeopleMatchRequestInput {\n");
    sb.append("    personName: ").append(toIndentedString(personName)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    salutation: ").append(toIndentedString(salutation)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    additionalContext: ").append(toIndentedString(additionalContext)).append("\n");
    sb.append("    suffix: ").append(toIndentedString(suffix)).append("\n");
    sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
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

