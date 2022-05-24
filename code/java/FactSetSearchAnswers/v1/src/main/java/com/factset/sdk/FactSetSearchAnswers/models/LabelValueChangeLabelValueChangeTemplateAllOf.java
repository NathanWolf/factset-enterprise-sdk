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
import com.factset.sdk.FactSetSearchAnswers.models.ValueChange;
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
 * LabelValueChangeLabelValueChangeTemplateAllOf
 */
@JsonPropertyOrder({
  LabelValueChangeLabelValueChangeTemplateAllOf.JSON_PROPERTY_VALUE,
  LabelValueChangeLabelValueChangeTemplateAllOf.JSON_PROPERTY_LABEL,
  LabelValueChangeLabelValueChangeTemplateAllOf.JSON_PROPERTY_VALUE_CHANGE,
  LabelValueChangeLabelValueChangeTemplateAllOf.JSON_PROPERTY_VALUE2,
  LabelValueChangeLabelValueChangeTemplateAllOf.JSON_PROPERTY_LABEL2
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class LabelValueChangeLabelValueChangeTemplateAllOf implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_VALUE = "value";
  private String value;

  public static final String JSON_PROPERTY_LABEL = "label";
  private String label;

  public static final String JSON_PROPERTY_VALUE_CHANGE = "valueChange";
  private ValueChange valueChange;

  public static final String JSON_PROPERTY_VALUE2 = "value2";
  private String value2;

  public static final String JSON_PROPERTY_LABEL2 = "label2";
  private String label2;

  public LabelValueChangeLabelValueChangeTemplateAllOf() { 
  }

  public LabelValueChangeLabelValueChangeTemplateAllOf value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getValue() {
    return value;
  }


  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValue(String value) {
    this.value = value;
  }


  public LabelValueChangeLabelValueChangeTemplateAllOf label(String label) {
    this.label = label;
    return this;
  }

   /**
   * Get label
   * @return label
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LABEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLabel() {
    return label;
  }


  @JsonProperty(JSON_PROPERTY_LABEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLabel(String label) {
    this.label = label;
  }


  public LabelValueChangeLabelValueChangeTemplateAllOf valueChange(ValueChange valueChange) {
    this.valueChange = valueChange;
    return this;
  }

   /**
   * Get valueChange
   * @return valueChange
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VALUE_CHANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ValueChange getValueChange() {
    return valueChange;
  }


  @JsonProperty(JSON_PROPERTY_VALUE_CHANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValueChange(ValueChange valueChange) {
    this.valueChange = valueChange;
  }


  public LabelValueChangeLabelValueChangeTemplateAllOf value2(String value2) {
    this.value2 = value2;
    return this;
  }

   /**
   * Get value2
   * @return value2
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VALUE2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getValue2() {
    return value2;
  }


  @JsonProperty(JSON_PROPERTY_VALUE2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValue2(String value2) {
    this.value2 = value2;
  }


  public LabelValueChangeLabelValueChangeTemplateAllOf label2(String label2) {
    this.label2 = label2;
    return this;
  }

   /**
   * Get label2
   * @return label2
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LABEL2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLabel2() {
    return label2;
  }


  @JsonProperty(JSON_PROPERTY_LABEL2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLabel2(String label2) {
    this.label2 = label2;
  }


  /**
   * Return true if this LabelValueChangeLabelValueChangeTemplate_allOf object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LabelValueChangeLabelValueChangeTemplateAllOf labelValueChangeLabelValueChangeTemplateAllOf = (LabelValueChangeLabelValueChangeTemplateAllOf) o;
    return Objects.equals(this.value, labelValueChangeLabelValueChangeTemplateAllOf.value) &&
        Objects.equals(this.label, labelValueChangeLabelValueChangeTemplateAllOf.label) &&
        Objects.equals(this.valueChange, labelValueChangeLabelValueChangeTemplateAllOf.valueChange) &&
        Objects.equals(this.value2, labelValueChangeLabelValueChangeTemplateAllOf.value2) &&
        Objects.equals(this.label2, labelValueChangeLabelValueChangeTemplateAllOf.label2);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, label, valueChange, value2, label2);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LabelValueChangeLabelValueChangeTemplateAllOf {\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    valueChange: ").append(toIndentedString(valueChange)).append("\n");
    sb.append("    value2: ").append(toIndentedString(value2)).append("\n");
    sb.append("    label2: ").append(toIndentedString(label2)).append("\n");
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

