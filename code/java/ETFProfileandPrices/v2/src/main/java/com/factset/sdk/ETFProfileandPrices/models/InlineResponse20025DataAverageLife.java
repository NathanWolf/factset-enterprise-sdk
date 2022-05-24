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


package com.factset.sdk.ETFProfileandPrices.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.ETFProfileandPrices.JSON;


/**
 * Average life
 */
@ApiModel(description = "Average life")
@JsonPropertyOrder({
  InlineResponse20025DataAverageLife.JSON_PROPERTY_SPAN,
  InlineResponse20025DataAverageLife.JSON_PROPERTY_SPAN0_TO1,
  InlineResponse20025DataAverageLife.JSON_PROPERTY_SPAN1_TO2,
  InlineResponse20025DataAverageLife.JSON_PROPERTY_SPAN2_TO3,
  InlineResponse20025DataAverageLife.JSON_PROPERTY_SPAN3_TO5,
  InlineResponse20025DataAverageLife.JSON_PROPERTY_SPAN5_TO7,
  InlineResponse20025DataAverageLife.JSON_PROPERTY_SPAN7_TO10,
  InlineResponse20025DataAverageLife.JSON_PROPERTY_SPAN10_TO15,
  InlineResponse20025DataAverageLife.JSON_PROPERTY_SPAN15_TO20,
  InlineResponse20025DataAverageLife.JSON_PROPERTY_SPAN20_PLUS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse20025DataAverageLife implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_SPAN = "span";
  private BigDecimal span;

  public static final String JSON_PROPERTY_SPAN0_TO1 = "span0To1";
  private BigDecimal span0To1;

  public static final String JSON_PROPERTY_SPAN1_TO2 = "span1To2";
  private BigDecimal span1To2;

  public static final String JSON_PROPERTY_SPAN2_TO3 = "span2To3";
  private BigDecimal span2To3;

  public static final String JSON_PROPERTY_SPAN3_TO5 = "span3To5";
  private BigDecimal span3To5;

  public static final String JSON_PROPERTY_SPAN5_TO7 = "span5To7";
  private BigDecimal span5To7;

  public static final String JSON_PROPERTY_SPAN7_TO10 = "span7To10";
  private BigDecimal span7To10;

  public static final String JSON_PROPERTY_SPAN10_TO15 = "span10To15";
  private BigDecimal span10To15;

  public static final String JSON_PROPERTY_SPAN15_TO20 = "span15To20";
  private BigDecimal span15To20;

  public static final String JSON_PROPERTY_SPAN20_PLUS = "span20Plus";
  private BigDecimal span20Plus;

  public InlineResponse20025DataAverageLife() { 
  }

  public InlineResponse20025DataAverageLife span(BigDecimal span) {
    this.span = span;
    return this;
  }

   /**
   * Average life value of the ETP.
   * @return span
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Average life value of the ETP.")
  @JsonProperty(JSON_PROPERTY_SPAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getSpan() {
    return span;
  }


  @JsonProperty(JSON_PROPERTY_SPAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSpan(BigDecimal span) {
    this.span = span;
  }


  public InlineResponse20025DataAverageLife span0To1(BigDecimal span0To1) {
    this.span0To1 = span0To1;
    return this;
  }

   /**
   * Average life value of the ETP ranges between 0 and 1 years.
   * @return span0To1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Average life value of the ETP ranges between 0 and 1 years.")
  @JsonProperty(JSON_PROPERTY_SPAN0_TO1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getSpan0To1() {
    return span0To1;
  }


  @JsonProperty(JSON_PROPERTY_SPAN0_TO1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSpan0To1(BigDecimal span0To1) {
    this.span0To1 = span0To1;
  }


  public InlineResponse20025DataAverageLife span1To2(BigDecimal span1To2) {
    this.span1To2 = span1To2;
    return this;
  }

   /**
   * Average life value of the ETP ranges between 1 and 2 years.
   * @return span1To2
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Average life value of the ETP ranges between 1 and 2 years.")
  @JsonProperty(JSON_PROPERTY_SPAN1_TO2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getSpan1To2() {
    return span1To2;
  }


  @JsonProperty(JSON_PROPERTY_SPAN1_TO2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSpan1To2(BigDecimal span1To2) {
    this.span1To2 = span1To2;
  }


  public InlineResponse20025DataAverageLife span2To3(BigDecimal span2To3) {
    this.span2To3 = span2To3;
    return this;
  }

   /**
   * Average life value of the ETP ranges between 2 and 3 years.
   * @return span2To3
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Average life value of the ETP ranges between 2 and 3 years.")
  @JsonProperty(JSON_PROPERTY_SPAN2_TO3)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getSpan2To3() {
    return span2To3;
  }


  @JsonProperty(JSON_PROPERTY_SPAN2_TO3)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSpan2To3(BigDecimal span2To3) {
    this.span2To3 = span2To3;
  }


  public InlineResponse20025DataAverageLife span3To5(BigDecimal span3To5) {
    this.span3To5 = span3To5;
    return this;
  }

   /**
   * Average life value of the ETP ranges between 3 and 5 years.
   * @return span3To5
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Average life value of the ETP ranges between 3 and 5 years.")
  @JsonProperty(JSON_PROPERTY_SPAN3_TO5)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getSpan3To5() {
    return span3To5;
  }


  @JsonProperty(JSON_PROPERTY_SPAN3_TO5)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSpan3To5(BigDecimal span3To5) {
    this.span3To5 = span3To5;
  }


  public InlineResponse20025DataAverageLife span5To7(BigDecimal span5To7) {
    this.span5To7 = span5To7;
    return this;
  }

   /**
   * Average life value of the ETP ranges between 5 and 7 years.
   * @return span5To7
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Average life value of the ETP ranges between 5 and 7 years.")
  @JsonProperty(JSON_PROPERTY_SPAN5_TO7)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getSpan5To7() {
    return span5To7;
  }


  @JsonProperty(JSON_PROPERTY_SPAN5_TO7)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSpan5To7(BigDecimal span5To7) {
    this.span5To7 = span5To7;
  }


  public InlineResponse20025DataAverageLife span7To10(BigDecimal span7To10) {
    this.span7To10 = span7To10;
    return this;
  }

   /**
   * Average life value of the ETP ranges between 7 and 10 years.
   * @return span7To10
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Average life value of the ETP ranges between 7 and 10 years.")
  @JsonProperty(JSON_PROPERTY_SPAN7_TO10)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getSpan7To10() {
    return span7To10;
  }


  @JsonProperty(JSON_PROPERTY_SPAN7_TO10)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSpan7To10(BigDecimal span7To10) {
    this.span7To10 = span7To10;
  }


  public InlineResponse20025DataAverageLife span10To15(BigDecimal span10To15) {
    this.span10To15 = span10To15;
    return this;
  }

   /**
   * Average life value of the ETP ranges between 10 and 15 years.
   * @return span10To15
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Average life value of the ETP ranges between 10 and 15 years.")
  @JsonProperty(JSON_PROPERTY_SPAN10_TO15)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getSpan10To15() {
    return span10To15;
  }


  @JsonProperty(JSON_PROPERTY_SPAN10_TO15)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSpan10To15(BigDecimal span10To15) {
    this.span10To15 = span10To15;
  }


  public InlineResponse20025DataAverageLife span15To20(BigDecimal span15To20) {
    this.span15To20 = span15To20;
    return this;
  }

   /**
   * Average life value of the ETP ranges between 15 and 20 years.
   * @return span15To20
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Average life value of the ETP ranges between 15 and 20 years.")
  @JsonProperty(JSON_PROPERTY_SPAN15_TO20)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getSpan15To20() {
    return span15To20;
  }


  @JsonProperty(JSON_PROPERTY_SPAN15_TO20)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSpan15To20(BigDecimal span15To20) {
    this.span15To20 = span15To20;
  }


  public InlineResponse20025DataAverageLife span20Plus(BigDecimal span20Plus) {
    this.span20Plus = span20Plus;
    return this;
  }

   /**
   * Average life value of the ETP ranges above 20 years.
   * @return span20Plus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Average life value of the ETP ranges above 20 years.")
  @JsonProperty(JSON_PROPERTY_SPAN20_PLUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getSpan20Plus() {
    return span20Plus;
  }


  @JsonProperty(JSON_PROPERTY_SPAN20_PLUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSpan20Plus(BigDecimal span20Plus) {
    this.span20Plus = span20Plus;
  }


  /**
   * Return true if this inline_response_200_25_data_averageLife object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20025DataAverageLife inlineResponse20025DataAverageLife = (InlineResponse20025DataAverageLife) o;
    return Objects.equals(this.span, inlineResponse20025DataAverageLife.span) &&
        Objects.equals(this.span0To1, inlineResponse20025DataAverageLife.span0To1) &&
        Objects.equals(this.span1To2, inlineResponse20025DataAverageLife.span1To2) &&
        Objects.equals(this.span2To3, inlineResponse20025DataAverageLife.span2To3) &&
        Objects.equals(this.span3To5, inlineResponse20025DataAverageLife.span3To5) &&
        Objects.equals(this.span5To7, inlineResponse20025DataAverageLife.span5To7) &&
        Objects.equals(this.span7To10, inlineResponse20025DataAverageLife.span7To10) &&
        Objects.equals(this.span10To15, inlineResponse20025DataAverageLife.span10To15) &&
        Objects.equals(this.span15To20, inlineResponse20025DataAverageLife.span15To20) &&
        Objects.equals(this.span20Plus, inlineResponse20025DataAverageLife.span20Plus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(span, span0To1, span1To2, span2To3, span3To5, span5To7, span7To10, span10To15, span15To20, span20Plus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20025DataAverageLife {\n");
    sb.append("    span: ").append(toIndentedString(span)).append("\n");
    sb.append("    span0To1: ").append(toIndentedString(span0To1)).append("\n");
    sb.append("    span1To2: ").append(toIndentedString(span1To2)).append("\n");
    sb.append("    span2To3: ").append(toIndentedString(span2To3)).append("\n");
    sb.append("    span3To5: ").append(toIndentedString(span3To5)).append("\n");
    sb.append("    span5To7: ").append(toIndentedString(span5To7)).append("\n");
    sb.append("    span7To10: ").append(toIndentedString(span7To10)).append("\n");
    sb.append("    span10To15: ").append(toIndentedString(span10To15)).append("\n");
    sb.append("    span15To20: ").append(toIndentedString(span15To20)).append("\n");
    sb.append("    span20Plus: ").append(toIndentedString(span20Plus)).append("\n");
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

