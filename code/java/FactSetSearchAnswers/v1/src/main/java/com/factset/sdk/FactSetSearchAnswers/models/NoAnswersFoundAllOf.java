/*
 * FactSet Search Answers API
 * The FactSet Search Answers API provides answers to search queries, reflecting the data shown within FactSet Search Answers, and allowing you to easily add financial data to your widgets, lookups, bots, and assistants. The API understands a fixed amount of search terms and returns structured data from FactSet’s many data sources. Possible answers include Price of a Company, Top 10 Year-to-Date Gainers, Revenue per Passenger Mile, and many more.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: FactSearch.Team@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.FactSetSearchAnswers.models;

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
import com.factset.sdk.FactSetSearchAnswers.JSON;


/**
 * NoAnswersFoundAllOf
 */
@JsonPropertyOrder({
  NoAnswersFoundAllOf.JSON_PROPERTY_MESSAGE,
  NoAnswersFoundAllOf.JSON_PROPERTY_QUERY_SUGGESTIONS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class NoAnswersFoundAllOf implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private String message;

  public static final String JSON_PROPERTY_QUERY_SUGGESTIONS = "querySuggestions";
  private java.util.List<String> querySuggestions = new java.util.ArrayList<>();

  public NoAnswersFoundAllOf() { 
  }

  @JsonCreator
  public NoAnswersFoundAllOf(
    @JsonProperty(value=JSON_PROPERTY_MESSAGE, required=true) String message, 
    @JsonProperty(value=JSON_PROPERTY_QUERY_SUGGESTIONS, required=true) java.util.List<String> querySuggestions
  ) {
    this();
    this.message = message;
    this.querySuggestions = querySuggestions;
  }

  public NoAnswersFoundAllOf message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getMessage() {
    return message;
  }


  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMessage(String message) {
    this.message = message;
  }


  public NoAnswersFoundAllOf querySuggestions(java.util.List<String> querySuggestions) {
    this.querySuggestions = querySuggestions;
    return this;
  }

  public NoAnswersFoundAllOf addQuerySuggestionsItem(String querySuggestionsItem) {
    this.querySuggestions.add(querySuggestionsItem);
    return this;
  }

   /**
   * Get querySuggestions
   * @return querySuggestions
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_QUERY_SUGGESTIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public java.util.List<String> getQuerySuggestions() {
    return querySuggestions;
  }


  @JsonProperty(JSON_PROPERTY_QUERY_SUGGESTIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setQuerySuggestions(java.util.List<String> querySuggestions) {
    this.querySuggestions = querySuggestions;
  }


  /**
   * Return true if this NoAnswersFound_allOf object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NoAnswersFoundAllOf noAnswersFoundAllOf = (NoAnswersFoundAllOf) o;
    return Objects.equals(this.message, noAnswersFoundAllOf.message) &&
        Objects.equals(this.querySuggestions, noAnswersFoundAllOf.querySuggestions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, querySuggestions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NoAnswersFoundAllOf {\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    querySuggestions: ").append(toIndentedString(querySuggestions)).append("\n");
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

