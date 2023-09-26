/*
 * OFDB API
 * OFDB API
 *
 * The version of the OpenAPI document: 2.1.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.OFDB.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.OFDB.models.BulkDeleteArrayItem;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.OFDB.JSON;


/**
 * InlineResponse2003
 */
@JsonPropertyOrder({
  InlineResponse2003.JSON_PROPERTY_DATA
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse2003 implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_DATA = "data";
  private java.util.List<BulkDeleteArrayItem> data = null;

  public InlineResponse2003() { 
  }

  public InlineResponse2003 data(java.util.List<BulkDeleteArrayItem> data) {
    this.data = data;
    return this;
  }

  public InlineResponse2003 addDataItem(BulkDeleteArrayItem dataItem) {
    if (this.data == null) {
      this.data = new java.util.ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * A list of the various backend responses needed for the bulk delete. These typically contain data points that failed to be deleted, and are in the order of: &lt;br&gt;Delete values by symbol, date, and field + delete values by symbol and field &lt;br&gt;Delete dates by field + delete dates &lt;br&gt;Delete dates by symbol &lt;br&gt;Delete fields &lt;br&gt;Delete symbols
   * @return data
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of the various backend responses needed for the bulk delete. These typically contain data points that failed to be deleted, and are in the order of: <br>Delete values by symbol, date, and field + delete values by symbol and field <br>Delete dates by field + delete dates <br>Delete dates by symbol <br>Delete fields <br>Delete symbols")
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<BulkDeleteArrayItem> getData() {
    return data;
  }


  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setData(java.util.List<BulkDeleteArrayItem> data) {
    this.data = data;
  }


  /**
   * Return true if this inline_response_200_3 object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2003 inlineResponse2003 = (InlineResponse2003) o;
    return Objects.equals(this.data, inlineResponse2003.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2003 {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

