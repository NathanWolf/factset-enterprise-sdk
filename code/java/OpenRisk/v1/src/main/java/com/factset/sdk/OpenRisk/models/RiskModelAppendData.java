/*
 * Open:Risk API
 * Service to calculate parametric linear risk statistics and generate risk model asset identifier mappings.
 *
 * The version of the OpenAPI document: 1.22.0
 * Contact: ParametricRiskAnalyticsDevelopment@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.OpenRisk.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.OpenRisk.models.RiskModelAppendDataValue;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.OpenRisk.JSON;


/**
 * **(since 1.17.0)** Inline append data. This field can be used mainly for two purpose: 1) to supplement the risk model coverage when assets are not natively covered by a model, and 2) to intentionally override asset exposures and/or specific risk whenever there is misaligned view of an asset&#39;s risk profile between a model and a user.
 */
@ApiModel(description = "**(since 1.17.0)** Inline append data. This field can be used mainly for two purpose: 1) to supplement the risk model coverage when assets are not natively covered by a model, and 2) to intentionally override asset exposures and/or specific risk whenever there is misaligned view of an asset's risk profile between a model and a user.")
@JsonPropertyOrder({
  RiskModelAppendData.JSON_PROPERTY_DATA,
  RiskModelAppendData.JSON_PROPERTY_FIELDS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RiskModelAppendData implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_DATA = "data";
  private java.util.List<java.util.Map<String, RiskModelAppendDataValue>> data = new java.util.ArrayList<>();

  public static final String JSON_PROPERTY_FIELDS = "fields";
  private java.util.Set<String> fields = new java.util.LinkedHashSet<>();

  public RiskModelAppendData() { 
  }

  @JsonCreator
  public RiskModelAppendData(
    @JsonProperty(value=JSON_PROPERTY_DATA, required=true) java.util.List<java.util.Map<String, RiskModelAppendDataValue>> data, 
    @JsonProperty(value=JSON_PROPERTY_FIELDS, required=true) java.util.Set<String> fields
  ) {
    this();
    this.data = data;
    this.fields = fields;
  }

  public RiskModelAppendData data(java.util.List<java.util.Map<String, RiskModelAppendDataValue>> data) {
    this.data = data;
    return this;
  }

  public RiskModelAppendData addDataItem(java.util.Map<String, RiskModelAppendDataValue> dataItem) {
    this.data.add(dataItem);
    return this;
  }

   /**
   * List of all rows of the append data.
   * @return data
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "[{\"0\":2.5,\"1\":\"SYMBOL_1\",\"2\":23.1},{\"1\":\"SYMBOL_2\",\"2\":7.2}]", required = true, value = "List of all rows of the append data.")
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public java.util.List<java.util.Map<String, RiskModelAppendDataValue>> getData() {
    return data;
  }


  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setData(java.util.List<java.util.Map<String, RiskModelAppendDataValue>> data) {
    this.data = data;
  }


  public RiskModelAppendData fields(java.util.Set<String> fields) {
    this.fields = fields;
    return this;
  }

  public RiskModelAppendData addFieldsItem(String fieldsItem) {
    this.fields.add(fieldsItem);
    return this;
  }

   /**
   * List of fields in append data. Must contain &#39;SYMBOL&#39;. Index location will be used in &#39;data&#39; elements as keys. The entire set of factor IDs and specific risk are not required. If any inputs of exposures or specific risk are missing, 0 will be inserted for those field.
   * @return fields
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "[\"FACTOR_1\",\"SYMBOL\",\"STDERR\"]", required = true, value = "List of fields in append data. Must contain 'SYMBOL'. Index location will be used in 'data' elements as keys. The entire set of factor IDs and specific risk are not required. If any inputs of exposures or specific risk are missing, 0 will be inserted for those field.")
  @JsonProperty(JSON_PROPERTY_FIELDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public java.util.Set<String> getFields() {
    return fields;
  }


  @JsonProperty(JSON_PROPERTY_FIELDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFields(java.util.Set<String> fields) {
    this.fields = fields;
  }


  /**
   * Return true if this RiskModelAppendData object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RiskModelAppendData riskModelAppendData = (RiskModelAppendData) o;
    return Objects.equals(this.data, riskModelAppendData.data) &&
        Objects.equals(this.fields, riskModelAppendData.fields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, fields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RiskModelAppendData {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
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

