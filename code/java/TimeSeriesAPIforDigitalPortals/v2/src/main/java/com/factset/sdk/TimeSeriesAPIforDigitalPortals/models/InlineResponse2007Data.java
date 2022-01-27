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


package com.factset.sdk.TimeSeriesAPIforDigitalPortals.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.TimeSeriesAPIforDigitalPortals.models.InlineResponse2007DataSubsamples;
import com.factset.sdk.TimeSeriesAPIforDigitalPortals.models.InlineResponse200DataRange;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.TimeSeriesAPIforDigitalPortals.JSON;


/**
 * Subsampled time series data for the notation.
 */
@ApiModel(description = "Subsampled time series data for the notation.")
@JsonPropertyOrder({
  InlineResponse2007Data.JSON_PROPERTY_RANGE,
  InlineResponse2007Data.JSON_PROPERTY_QUALITY,
  InlineResponse2007Data.JSON_PROPERTY_SUBSAMPLES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse2007Data implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_RANGE = "range";
  private InlineResponse200DataRange range;

  /**
   * Quality of the price.
   */
  public enum QualityEnum {
    DLY("DLY"),
    
    EOD("EOD");

    private String value;

    QualityEnum(String value) {
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
    public static QualityEnum fromValue(String value) {
      for (QualityEnum b : QualityEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_QUALITY = "quality";
  private QualityEnum quality;

  public static final String JSON_PROPERTY_SUBSAMPLES = "subsamples";
  private java.util.List<InlineResponse2007DataSubsamples> subsamples = null;


  public InlineResponse2007Data range(InlineResponse200DataRange range) {
    this.range = range;
    return this;
  }

   /**
   * Get range
   * @return range
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse200DataRange getRange() {
    return range;
  }


  @JsonProperty(JSON_PROPERTY_RANGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRange(InlineResponse200DataRange range) {
    this.range = range;
  }


  public InlineResponse2007Data quality(QualityEnum quality) {
    this.quality = quality;
    return this;
  }

   /**
   * Quality of the price.
   * @return quality
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Quality of the price.")
  @JsonProperty(JSON_PROPERTY_QUALITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public QualityEnum getQuality() {
    return quality;
  }


  @JsonProperty(JSON_PROPERTY_QUALITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setQuality(QualityEnum quality) {
    this.quality = quality;
  }


  public InlineResponse2007Data subsamples(java.util.List<InlineResponse2007DataSubsamples> subsamples) {
    this.subsamples = subsamples;
    return this;
  }

  public InlineResponse2007Data addSubsamplesItem(InlineResponse2007DataSubsamples subsamplesItem) {
    if (this.subsamples == null) {
      this.subsamples = new java.util.ArrayList<>();
    }
    this.subsamples.add(subsamplesItem);
    return this;
  }

   /**
   * List of summary records. For the attributes first, last, low, high, see attribute &#x60;valueUnit&#x60; in endpoint &#x60;/prices/get&#x60; for their unit, except for price type yield, where the &#x60;valueUnit&#x60; is always &#x60;percent&#x60; (id&#x3D;258).
   * @return subsamples
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of summary records. For the attributes first, last, low, high, see attribute `valueUnit` in endpoint `/prices/get` for their unit, except for price type yield, where the `valueUnit` is always `percent` (id=258).")
  @JsonProperty(JSON_PROPERTY_SUBSAMPLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<InlineResponse2007DataSubsamples> getSubsamples() {
    return subsamples;
  }


  @JsonProperty(JSON_PROPERTY_SUBSAMPLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubsamples(java.util.List<InlineResponse2007DataSubsamples> subsamples) {
    this.subsamples = subsamples;
  }


  /**
   * Return true if this inline_response_200_7_data object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2007Data inlineResponse2007Data = (InlineResponse2007Data) o;
    return Objects.equals(this.range, inlineResponse2007Data.range) &&
        Objects.equals(this.quality, inlineResponse2007Data.quality) &&
        Objects.equals(this.subsamples, inlineResponse2007Data.subsamples);
  }

  @Override
  public int hashCode() {
    return Objects.hash(range, quality, subsamples);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2007Data {\n");
    sb.append("    range: ").append(toIndentedString(range)).append("\n");
    sb.append("    quality: ").append(toIndentedString(quality)).append("\n");
    sb.append("    subsamples: ").append(toIndentedString(subsamples)).append("\n");
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

