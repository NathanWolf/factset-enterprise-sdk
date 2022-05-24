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
import com.factset.sdk.TimeSeriesAPIforDigitalPortals.models.PricesTimeSeriesEodSubsampleGetDataInterval;
import com.factset.sdk.TimeSeriesAPIforDigitalPortals.models.VendorChartIQTimeSeriesEodListDataAdjustments;
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
 * The data member contains the request&#39;s primary data.
 */
@ApiModel(description = "The data member contains the request's primary data.")
@JsonPropertyOrder({
  PricesTimeSeriesEodSubsampleGetData.JSON_PROPERTY_ID,
  PricesTimeSeriesEodSubsampleGetData.JSON_PROPERTY_TYPE,
  PricesTimeSeriesEodSubsampleGetData.JSON_PROPERTY_QUALITY,
  PricesTimeSeriesEodSubsampleGetData.JSON_PROPERTY_INTERVAL,
  PricesTimeSeriesEodSubsampleGetData.JSON_PROPERTY_ADJUSTMENTS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PricesTimeSeriesEodSubsampleGetData implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  /**
   * Type of the price as configured for the customer.
   */
  public enum TypeEnum {
    TRADE("trade"),
    
    BID("bid"),
    
    ASK("ask"),
    
    YIELD("yield"),
    
    ESTIMATE("estimate");

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
  private TypeEnum type = TypeEnum.TRADE;

  /**
   * Quality of the price.
   */
  public enum QualityEnum {
    DLY("DLY"),
    
    EOD("EOD"),
    
    BST("BST");

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
  private QualityEnum quality = QualityEnum.DLY;

  public static final String JSON_PROPERTY_INTERVAL = "interval";
  private PricesTimeSeriesEodSubsampleGetDataInterval interval;

  public static final String JSON_PROPERTY_ADJUSTMENTS = "adjustments";
  private VendorChartIQTimeSeriesEodListDataAdjustments adjustments;

  public PricesTimeSeriesEodSubsampleGetData() { 
  }

  @JsonCreator
  public PricesTimeSeriesEodSubsampleGetData(
    @JsonProperty(value=JSON_PROPERTY_ID, required=true) String id, 
    @JsonProperty(value=JSON_PROPERTY_INTERVAL, required=true) PricesTimeSeriesEodSubsampleGetDataInterval interval
  ) {
    this();
    this.id = id;
    this.interval = interval;
  }

  public PricesTimeSeriesEodSubsampleGetData id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Identifier of the notation.
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Identifier of the notation.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setId(String id) {
    this.id = id;
  }


  public PricesTimeSeriesEodSubsampleGetData type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Type of the price as configured for the customer.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Type of the price as configured for the customer.")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TypeEnum getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(TypeEnum type) {
    this.type = type;
  }


  public PricesTimeSeriesEodSubsampleGetData quality(QualityEnum quality) {
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


  public PricesTimeSeriesEodSubsampleGetData interval(PricesTimeSeriesEodSubsampleGetDataInterval interval) {
    this.interval = interval;
    return this;
  }

   /**
   * Get interval
   * @return interval
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_INTERVAL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public PricesTimeSeriesEodSubsampleGetDataInterval getInterval() {
    return interval;
  }


  @JsonProperty(JSON_PROPERTY_INTERVAL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setInterval(PricesTimeSeriesEodSubsampleGetDataInterval interval) {
    this.interval = interval;
  }


  public PricesTimeSeriesEodSubsampleGetData adjustments(VendorChartIQTimeSeriesEodListDataAdjustments adjustments) {
    this.adjustments = adjustments;
    return this;
  }

   /**
   * Get adjustments
   * @return adjustments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ADJUSTMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public VendorChartIQTimeSeriesEodListDataAdjustments getAdjustments() {
    return adjustments;
  }


  @JsonProperty(JSON_PROPERTY_ADJUSTMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdjustments(VendorChartIQTimeSeriesEodListDataAdjustments adjustments) {
    this.adjustments = adjustments;
  }


  /**
   * Return true if this _prices_timeSeries_eod_subsample_get_data object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PricesTimeSeriesEodSubsampleGetData pricesTimeSeriesEodSubsampleGetData = (PricesTimeSeriesEodSubsampleGetData) o;
    return Objects.equals(this.id, pricesTimeSeriesEodSubsampleGetData.id) &&
        Objects.equals(this.type, pricesTimeSeriesEodSubsampleGetData.type) &&
        Objects.equals(this.quality, pricesTimeSeriesEodSubsampleGetData.quality) &&
        Objects.equals(this.interval, pricesTimeSeriesEodSubsampleGetData.interval) &&
        Objects.equals(this.adjustments, pricesTimeSeriesEodSubsampleGetData.adjustments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, quality, interval, adjustments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PricesTimeSeriesEodSubsampleGetData {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    quality: ").append(toIndentedString(quality)).append("\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    adjustments: ").append(toIndentedString(adjustments)).append("\n");
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

