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
import io.swagger.annotations.ApiModel;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.FactSetPeople.JSON;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Search based on the management and board types. The types include -  |type|description| |---|---| |MB|Management &amp; Board| |MGMT|Management| |BRD|Board| 
 */
public enum MbType {
  
  MB("MB"),
  
  MGMT("MGMT"),
  
  BRD("BRD");

  private String value;

  MbType(String value) {
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
  public static MbType fromValue(String value) {
    for (MbType b : MbType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

