/*
 * fpo_mp_input
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.OptimizationEngineAPIMultiperiod.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import io.swagger.annotations.ApiModel;
import java.math.BigDecimal;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.OptimizationEngineAPIMultiperiod.JSON;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * 0 - eTotal  1 - eBuy  2 - eSell 
 */
public enum OptimizerInputsEConstraintTurnoverTypeEnum {
  
  NUMBER_0(new BigDecimal("0")),
  
  NUMBER_1(new BigDecimal("1")),
  
  NUMBER_2(new BigDecimal("2"));

  private BigDecimal value;

  OptimizerInputsEConstraintTurnoverTypeEnum(BigDecimal value) {
    this.value = value;
  }

  @JsonValue
  public BigDecimal getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OptimizerInputsEConstraintTurnoverTypeEnum fromValue(BigDecimal value) {
    for (OptimizerInputsEConstraintTurnoverTypeEnum b : OptimizerInputsEConstraintTurnoverTypeEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

