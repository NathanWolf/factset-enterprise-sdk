/*
 * FI API
 * Allow clients to fetch Analytics through APIs.
 *
 * The version of the OpenAPI document: 3.11.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.FixedIncomeCalculation.models;

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
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.FixedIncomeCalculation.JSON;


/**
 * FIAttributionForSecurities
 */
@JsonPropertyOrder({
  FIAttributionForSecurities.JSON_PROPERTY_START_PRICE,
  FIAttributionForSecurities.JSON_PROPERTY_END_PRICE,
  FIAttributionForSecurities.JSON_PROPERTY_START_SPREAD,
  FIAttributionForSecurities.JSON_PROPERTY_END_SPREAD,
  FIAttributionForSecurities.JSON_PROPERTY_PRICING_METHOD
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")

public class FIAttributionForSecurities implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_START_PRICE = "startPrice";
  private JsonNullable<Double> startPrice = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_END_PRICE = "endPrice";
  private JsonNullable<Double> endPrice = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_START_SPREAD = "startSpread";
  private JsonNullable<Double> startSpread = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_END_SPREAD = "endSpread";
  private JsonNullable<Double> endSpread = JsonNullable.<Double>undefined();

  /**
   * Pricing Method
   */
  public enum PricingMethodEnum {
    INPUTTED_PRICE("Inputted Price"),
    
    PRICING_MATRIX("Pricing Matrix"),
    
    ACTUAL_SPREAD("Actual Spread"),
    
    OAS("OAS");

    private String value;

    PricingMethodEnum(String value) {
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
    public static PricingMethodEnum fromValue(String value) {
      for (PricingMethodEnum b : PricingMethodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  public static final String JSON_PROPERTY_PRICING_METHOD = "pricingMethod";
  private JsonNullable<PricingMethodEnum> pricingMethod = JsonNullable.<PricingMethodEnum>undefined();

  public FIAttributionForSecurities() { 
  }

  public FIAttributionForSecurities startPrice(Double startPrice) {
    this.startPrice = JsonNullable.<Double>of(startPrice);
    return this;
  }

   /**
   * Start Price
   * @return startPrice
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Start Price")
  @JsonIgnore

  public Double getStartPrice() {
        return startPrice.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_START_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Double> getStartPrice_JsonNullable() {
    return startPrice;
  }
  
  @JsonProperty(JSON_PROPERTY_START_PRICE)
  public void setStartPrice_JsonNullable(JsonNullable<Double> startPrice) {
    this.startPrice = startPrice;
  }

  public void setStartPrice(Double startPrice) {
    this.startPrice = JsonNullable.<Double>of(startPrice);
  }


  public FIAttributionForSecurities endPrice(Double endPrice) {
    this.endPrice = JsonNullable.<Double>of(endPrice);
    return this;
  }

   /**
   * End Price
   * @return endPrice
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "End Price")
  @JsonIgnore

  public Double getEndPrice() {
        return endPrice.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_END_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Double> getEndPrice_JsonNullable() {
    return endPrice;
  }
  
  @JsonProperty(JSON_PROPERTY_END_PRICE)
  public void setEndPrice_JsonNullable(JsonNullable<Double> endPrice) {
    this.endPrice = endPrice;
  }

  public void setEndPrice(Double endPrice) {
    this.endPrice = JsonNullable.<Double>of(endPrice);
  }


  public FIAttributionForSecurities startSpread(Double startSpread) {
    this.startSpread = JsonNullable.<Double>of(startSpread);
    return this;
  }

   /**
   * Start Spread
   * @return startSpread
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Start Spread")
  @JsonIgnore

  public Double getStartSpread() {
        return startSpread.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_START_SPREAD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Double> getStartSpread_JsonNullable() {
    return startSpread;
  }
  
  @JsonProperty(JSON_PROPERTY_START_SPREAD)
  public void setStartSpread_JsonNullable(JsonNullable<Double> startSpread) {
    this.startSpread = startSpread;
  }

  public void setStartSpread(Double startSpread) {
    this.startSpread = JsonNullable.<Double>of(startSpread);
  }


  public FIAttributionForSecurities endSpread(Double endSpread) {
    this.endSpread = JsonNullable.<Double>of(endSpread);
    return this;
  }

   /**
   * End Spread
   * @return endSpread
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "End Spread")
  @JsonIgnore

  public Double getEndSpread() {
        return endSpread.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_END_SPREAD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Double> getEndSpread_JsonNullable() {
    return endSpread;
  }
  
  @JsonProperty(JSON_PROPERTY_END_SPREAD)
  public void setEndSpread_JsonNullable(JsonNullable<Double> endSpread) {
    this.endSpread = endSpread;
  }

  public void setEndSpread(Double endSpread) {
    this.endSpread = JsonNullable.<Double>of(endSpread);
  }


  public FIAttributionForSecurities pricingMethod(PricingMethodEnum pricingMethod) {
    this.pricingMethod = JsonNullable.<PricingMethodEnum>of(pricingMethod);
    return this;
  }

   /**
   * Pricing Method
   * @return pricingMethod
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Pricing Method")
  @JsonIgnore

  public PricingMethodEnum getPricingMethod() {
        return pricingMethod.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PRICING_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<PricingMethodEnum> getPricingMethod_JsonNullable() {
    return pricingMethod;
  }
  
  @JsonProperty(JSON_PROPERTY_PRICING_METHOD)
  public void setPricingMethod_JsonNullable(JsonNullable<PricingMethodEnum> pricingMethod) {
    this.pricingMethod = pricingMethod;
  }

  public void setPricingMethod(PricingMethodEnum pricingMethod) {
    this.pricingMethod = JsonNullable.<PricingMethodEnum>of(pricingMethod);
  }


  /**
   * Return true if this FIAttributionForSecurities object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FIAttributionForSecurities fiAttributionForSecurities = (FIAttributionForSecurities) o;
    return equalsNullable(this.startPrice, fiAttributionForSecurities.startPrice) &&
        equalsNullable(this.endPrice, fiAttributionForSecurities.endPrice) &&
        equalsNullable(this.startSpread, fiAttributionForSecurities.startSpread) &&
        equalsNullable(this.endSpread, fiAttributionForSecurities.endSpread) &&
        equalsNullable(this.pricingMethod, fiAttributionForSecurities.pricingMethod);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(startPrice), hashCodeNullable(endPrice), hashCodeNullable(startSpread), hashCodeNullable(endSpread), hashCodeNullable(pricingMethod));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FIAttributionForSecurities {\n");
    sb.append("    startPrice: ").append(toIndentedString(startPrice)).append("\n");
    sb.append("    endPrice: ").append(toIndentedString(endPrice)).append("\n");
    sb.append("    startSpread: ").append(toIndentedString(startSpread)).append("\n");
    sb.append("    endSpread: ").append(toIndentedString(endSpread)).append("\n");
    sb.append("    pricingMethod: ").append(toIndentedString(pricingMethod)).append("\n");
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

