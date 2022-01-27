/*
 * FactSet People API
 * The FactSet People API exposes FactSet data for individuals and their jobs. 
 *
 * The version of the OpenAPI document: 1.0.0
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
import io.swagger.annotations.ApiModel;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.FactSetPeople.JSON;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Controls the types of people returned based on high-level job functions. Filter by -    |function|description|   |---|---|   |PEOPLE|Retrieve **ALL** Executives of a requested company|   |OFFICER|Retrieve only the Officers of a requested company|   |DIRECTOR|Retrieve only the Directors of a requested company| 
 */
public enum Function {
  
  PEOPLE("PEOPLE"),
  
  OFFICER("OFFICER"),
  
  DIRECTOR("DIRECTOR");

  private String value;

  Function(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static Function fromValue(String value) {
    for (Function b : Function.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

