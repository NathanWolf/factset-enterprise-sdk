/*
 * Time Series API For Digital Portals
 * Time series data, end-of-day or intraday, tick-by-tick or subsampled. Additional vendor-specific endpoints provide a modified interface for seamless integration with the ChartIQ chart library.
 *
 * The version of the OpenAPI document: 2
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
import com.factset.sdk.TimeSeriesAPIforDigitalPortals.models.VendorChartIQTimeSeriesEodListDataAdjustments;
import com.factset.sdk.TimeSeriesAPIforDigitalPortals.models.VendorChartIQTimeSeriesEodListDataRange;
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
  VendorChartIQTimeSeriesEodListData.JSON_PROPERTY_ID,
  VendorChartIQTimeSeriesEodListData.JSON_PROPERTY_TYPE,
  VendorChartIQTimeSeriesEodListData.JSON_PROPERTY_QUALITY,
  VendorChartIQTimeSeriesEodListData.JSON_PROPERTY_RANGE,
  VendorChartIQTimeSeriesEodListData.JSON_PROPERTY_ADJUSTMENTS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class VendorChartIQTimeSeriesEodListData implements Serializable {
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

  public static final String JSON_PROPERTY_RANGE = "range";
  private VendorChartIQTimeSeriesEodListDataRange range;

  public static final String JSON_PROPERTY_ADJUSTMENTS = "adjustments";
  private VendorChartIQTimeSeriesEodListDataAdjustments adjustments;

  public VendorChartIQTimeSeriesEodListData() { 
  }

  @JsonCreator
  public VendorChartIQTimeSeriesEodListData(
    @JsonProperty(value=JSON_PROPERTY_ID, required=true) String id, 
    @JsonProperty(value=JSON_PROPERTY_RANGE, required=true) VendorChartIQTimeSeriesEodListDataRange range
  ) {
    this();
    this.id = id;
    this.range = range;
  }

  public VendorChartIQTimeSeriesEodListData id(String id) {
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


  public VendorChartIQTimeSeriesEodListData type(TypeEnum type) {
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


  public VendorChartIQTimeSeriesEodListData quality(QualityEnum quality) {
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


  public VendorChartIQTimeSeriesEodListData range(VendorChartIQTimeSeriesEodListDataRange range) {
    this.range = range;
    return this;
  }

   /**
   * Get range
   * @return range
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_RANGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public VendorChartIQTimeSeriesEodListDataRange getRange() {
    return range;
  }


  @JsonProperty(JSON_PROPERTY_RANGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRange(VendorChartIQTimeSeriesEodListDataRange range) {
    this.range = range;
  }


  public VendorChartIQTimeSeriesEodListData adjustments(VendorChartIQTimeSeriesEodListDataAdjustments adjustments) {
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
   * Return true if this _vendor_chartIQ_timeSeries_eod_list_data object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VendorChartIQTimeSeriesEodListData vendorChartIQTimeSeriesEodListData = (VendorChartIQTimeSeriesEodListData) o;
    return Objects.equals(this.id, vendorChartIQTimeSeriesEodListData.id) &&
        Objects.equals(this.type, vendorChartIQTimeSeriesEodListData.type) &&
        Objects.equals(this.quality, vendorChartIQTimeSeriesEodListData.quality) &&
        Objects.equals(this.range, vendorChartIQTimeSeriesEodListData.range) &&
        Objects.equals(this.adjustments, vendorChartIQTimeSeriesEodListData.adjustments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, quality, range, adjustments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VendorChartIQTimeSeriesEodListData {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    quality: ").append(toIndentedString(quality)).append("\n");
    sb.append("    range: ").append(toIndentedString(range)).append("\n");
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

