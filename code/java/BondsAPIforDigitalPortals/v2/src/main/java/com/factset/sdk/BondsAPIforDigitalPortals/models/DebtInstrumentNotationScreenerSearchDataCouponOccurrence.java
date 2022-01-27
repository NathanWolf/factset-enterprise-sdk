/*
 * Prime Developer Trial
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.BondsAPIforDigitalPortals.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.BondsAPIforDigitalPortals.models.DebtInstrumentNotationScreenerSearchDataCouponOccurrenceFrequency;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.BondsAPIforDigitalPortals.JSON;


/**
 * Parameters regarding the occurrence and frequency of the coupon payments.
 */
@ApiModel(description = "Parameters regarding the occurrence and frequency of the coupon payments.")
@JsonPropertyOrder({
  DebtInstrumentNotationScreenerSearchDataCouponOccurrence.JSON_PROPERTY_TYPE,
  DebtInstrumentNotationScreenerSearchDataCouponOccurrence.JSON_PROPERTY_FREQUENCY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DebtInstrumentNotationScreenerSearchDataCouponOccurrence implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    NEVER("never"),
    
    ONCE("once"),
    
    REPEATED("repeated");

    private String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TYPE = "type";
  private java.util.Set<TypeEnum> type = null;

  public static final String JSON_PROPERTY_FREQUENCY = "frequency";
  private DebtInstrumentNotationScreenerSearchDataCouponOccurrenceFrequency frequency;


  public DebtInstrumentNotationScreenerSearchDataCouponOccurrence type(java.util.Set<TypeEnum> type) {
    this.type = type;
    return this;
  }

  public DebtInstrumentNotationScreenerSearchDataCouponOccurrence addTypeItem(TypeEnum typeItem) {
    if (this.type == null) {
      this.type = new java.util.LinkedHashSet<>();
    }
    this.type.add(typeItem);
    return this;
  }

   /**
   * Occurrence type of the coupon payments.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Occurrence type of the coupon payments.")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.Set<TypeEnum> getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(java.util.Set<TypeEnum> type) {
    this.type = type;
  }


  public DebtInstrumentNotationScreenerSearchDataCouponOccurrence frequency(DebtInstrumentNotationScreenerSearchDataCouponOccurrenceFrequency frequency) {
    this.frequency = frequency;
    return this;
  }

   /**
   * Get frequency
   * @return frequency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FREQUENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DebtInstrumentNotationScreenerSearchDataCouponOccurrenceFrequency getFrequency() {
    return frequency;
  }


  @JsonProperty(JSON_PROPERTY_FREQUENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFrequency(DebtInstrumentNotationScreenerSearchDataCouponOccurrenceFrequency frequency) {
    this.frequency = frequency;
  }


  /**
   * Return true if this _debtInstrument_notation_screener_search_data_coupon_occurrence object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DebtInstrumentNotationScreenerSearchDataCouponOccurrence debtInstrumentNotationScreenerSearchDataCouponOccurrence = (DebtInstrumentNotationScreenerSearchDataCouponOccurrence) o;
    return Objects.equals(this.type, debtInstrumentNotationScreenerSearchDataCouponOccurrence.type) &&
        Objects.equals(this.frequency, debtInstrumentNotationScreenerSearchDataCouponOccurrence.frequency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, frequency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DebtInstrumentNotationScreenerSearchDataCouponOccurrence {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
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

