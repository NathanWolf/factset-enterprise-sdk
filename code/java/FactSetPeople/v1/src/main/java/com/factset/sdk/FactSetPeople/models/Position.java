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
 * Controls the position details returned for the requested company. By default, the service returns the CEO name, title, and ID for the requested company ids.   |position|description|   |---|---|   |CHAIR|Chairman|   |CEO|Chief Executive Officer|   |PRES|President|   |COO|Chief Operating Officer|   |CFO|Chief Financial Officer|   |CTO|Chief Technology Officer|   |CIO|Chief Investment Officer|   |FOU|Founder(s)|   |CMP|Compliance Officer|   |ADM|Admin|   |IND|Independent Director|   |BRD|Directors/Board Members|   |IR|Investor Relations|   |LEG|Legal Counsel|   |TREAS|Treasurer|   |MKT|Sales and Marketing Managers|   |HR|Human Resources| 
 */
public enum Position {
  
  CHAIR("CHAIR"),
  
  CEO("CEO"),
  
  PRES("PRES"),
  
  COO("COO"),
  
  CFO("CFO"),
  
  CTO("CTO"),
  
  CIO("CIO"),
  
  FOU("FOU"),
  
  CMP("CMP"),
  
  ADM("ADM"),
  
  IND("IND"),
  
  BRD("BRD"),
  
  IR("IR"),
  
  LEG("LEG"),
  
  TREAS("TREAS"),
  
  MKT("MKT"),
  
  HR("HR");

  private String value;

  Position(String value) {
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
  public static Position fromValue(String value) {
    for (Position b : Position.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

