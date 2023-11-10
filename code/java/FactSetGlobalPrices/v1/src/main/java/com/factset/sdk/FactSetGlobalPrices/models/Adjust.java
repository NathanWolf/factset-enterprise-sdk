/*
 * FactSet Global Prices API
 * The FactSet Global Prices API provides end of day market pricing content using cloud and microservices technology, encompassing both pricing as well as corporate actions and events data.</p> 
 *
 * The version of the OpenAPI document: 1.6.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.FactSetGlobalPrices.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import io.swagger.annotations.ApiModel;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.FactSetGlobalPrices.JSON;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Controls the split and spinoff adjustments for the prices.   * **SPLIT** &#x3D; Split ONLY Adjusted. This is used by default.   * **SPLIT_SPINOFF** &#x3D; Splits &amp; Spinoff Adjusted.   * **UNSPLIT** &#x3D; No Adjustments. 
 */
public enum Adjust {
  
  SPLIT("SPLIT"),
  
  SPLIT_SPINOFF("SPLIT_SPINOFF"),
  
  UNSPLIT("UNSPLIT");

  private String value;

  Adjust(String value) {
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
  public static Adjust fromValue(String value) {
    for (Adjust b : Adjust.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

