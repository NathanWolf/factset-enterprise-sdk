/*
 * S&P Global Fixed Income Evaluated Prices & Analytics API
 * Gain access to evaluated pricing and analytics data for Corporate Bonds, Municipal Bonds and Asset Backed Securities provided by S&P Global (formerly IHS Markit) .  Data returned through multiple endpoints like prices, spread, yield, yield curve, sensitivity, coupon information, securities metadata and details specific to the Asset Backed Securities. 
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.SPGlobalFixedIncomeEvaluatedPricesandAnalytics.models;

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
import java.time.LocalDate;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.SPGlobalFixedIncomeEvaluatedPricesandAnalytics.JSON;


/**
 * BondCoupon
 */
@JsonPropertyOrder({
  BondCoupon.JSON_PROPERTY_REQUEST_ID,
  BondCoupon.JSON_PROPERTY_FSYM_ID,
  BondCoupon.JSON_PROPERTY_DATE,
  BondCoupon.JSON_PROPERTY_ACCRUED_INTEREST,
  BondCoupon.JSON_PROPERTY_COUPON,
  BondCoupon.JSON_PROPERTY_COUPON_TYPE,
  BondCoupon.JSON_PROPERTY_COUPON_FREQUENCY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class BondCoupon implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_REQUEST_ID = "requestId";
  private String requestId;

  public static final String JSON_PROPERTY_FSYM_ID = "fsymId";
  private JsonNullable<String> fsymId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_DATE = "date";
  private JsonNullable<LocalDate> date = JsonNullable.<LocalDate>undefined();

  public static final String JSON_PROPERTY_ACCRUED_INTEREST = "accruedInterest";
  private JsonNullable<Double> accruedInterest = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_COUPON = "coupon";
  private JsonNullable<Double> coupon = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_COUPON_TYPE = "couponType";
  private JsonNullable<String> couponType = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_COUPON_FREQUENCY = "couponFrequency";
  private JsonNullable<String> couponFrequency = JsonNullable.<String>undefined();

  public BondCoupon() { 
  }

  public BondCoupon requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

   /**
   * Identifier that was used for the request.
   * @return requestId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "US45905URL07", value = "Identifier that was used for the request.")
  @JsonProperty(JSON_PROPERTY_REQUEST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRequestId() {
    return requestId;
  }


  @JsonProperty(JSON_PROPERTY_REQUEST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }


  public BondCoupon fsymId(String fsymId) {
    this.fsymId = JsonNullable.<String>of(fsymId);
    return this;
  }

   /**
   * FactSet Regional Security Identifier. Six alpha-numeric characters, excluding vowels, with an -R suffix (XXXXXX-R). Identifies the security&#39;s best regional security data series per currency. For equities, all primary listings per region and currency are allocated a regional-level permanent identifier. The regional-level permanent identifier will be available once a SEDOL representing the region/currency has been allocated and the identifiers are on FactSet.
   * @return fsymId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "CJQZQ0-S", value = "FactSet Regional Security Identifier. Six alpha-numeric characters, excluding vowels, with an -R suffix (XXXXXX-R). Identifies the security's best regional security data series per currency. For equities, all primary listings per region and currency are allocated a regional-level permanent identifier. The regional-level permanent identifier will be available once a SEDOL representing the region/currency has been allocated and the identifiers are on FactSet.")
  @JsonIgnore

  public String getFsymId() {
        return fsymId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FSYM_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getFsymId_JsonNullable() {
    return fsymId;
  }
  
  @JsonProperty(JSON_PROPERTY_FSYM_ID)
  public void setFsymId_JsonNullable(JsonNullable<String> fsymId) {
    this.fsymId = fsymId;
  }

  public void setFsymId(String fsymId) {
    this.fsymId = JsonNullable.<String>of(fsymId);
  }


  public BondCoupon date(LocalDate date) {
    this.date = JsonNullable.<LocalDate>of(date);
    return this;
  }

   /**
   * The date on which the price is calculated.
   * @return date
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Wed Dec 07 00:00:00 UTC 2022", value = "The date on which the price is calculated.")
  @JsonIgnore

  public LocalDate getDate() {
        return date.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<LocalDate> getDate_JsonNullable() {
    return date;
  }
  
  @JsonProperty(JSON_PROPERTY_DATE)
  public void setDate_JsonNullable(JsonNullable<LocalDate> date) {
    this.date = date;
  }

  public void setDate(LocalDate date) {
    this.date = JsonNullable.<LocalDate>of(date);
  }


  public BondCoupon accruedInterest(Double accruedInterest) {
    this.accruedInterest = JsonNullable.<Double>of(accruedInterest);
    return this;
  }

   /**
   * The interest that is owed, but not yet paid, added to the price of the bond. Available only for &#x60;corporate and municipal bonds&#x60;.
   * @return accruedInterest
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0.56667", value = "The interest that is owed, but not yet paid, added to the price of the bond. Available only for `corporate and municipal bonds`.")
  @JsonIgnore

  public Double getAccruedInterest() {
        return accruedInterest.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ACCRUED_INTEREST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Double> getAccruedInterest_JsonNullable() {
    return accruedInterest;
  }
  
  @JsonProperty(JSON_PROPERTY_ACCRUED_INTEREST)
  public void setAccruedInterest_JsonNullable(JsonNullable<Double> accruedInterest) {
    this.accruedInterest = accruedInterest;
  }

  public void setAccruedInterest(Double accruedInterest) {
    this.accruedInterest = JsonNullable.<Double>of(accruedInterest);
  }


  public BondCoupon coupon(Double coupon) {
    this.coupon = JsonNullable.<Double>of(coupon);
    return this;
  }

   /**
   * The current coupon rate of the instrument. Available only for &#x60;corporate and municipal bonds&#x60;.
   * @return coupon
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2.125", value = "The current coupon rate of the instrument. Available only for `corporate and municipal bonds`.")
  @JsonIgnore

  public Double getCoupon() {
        return coupon.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_COUPON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Double> getCoupon_JsonNullable() {
    return coupon;
  }
  
  @JsonProperty(JSON_PROPERTY_COUPON)
  public void setCoupon_JsonNullable(JsonNullable<Double> coupon) {
    this.coupon = coupon;
  }

  public void setCoupon(Double coupon) {
    this.coupon = JsonNullable.<Double>of(coupon);
  }


  public BondCoupon couponType(String couponType) {
    this.couponType = JsonNullable.<String>of(couponType);
    return this;
  }

   /**
   * The coupon type of the instrument. Available only for &#x60;corporate and municipal bonds&#x60;.
   * @return couponType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Fixed", value = "The coupon type of the instrument. Available only for `corporate and municipal bonds`.")
  @JsonIgnore

  public String getCouponType() {
        return couponType.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_COUPON_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getCouponType_JsonNullable() {
    return couponType;
  }
  
  @JsonProperty(JSON_PROPERTY_COUPON_TYPE)
  public void setCouponType_JsonNullable(JsonNullable<String> couponType) {
    this.couponType = couponType;
  }

  public void setCouponType(String couponType) {
    this.couponType = JsonNullable.<String>of(couponType);
  }


  public BondCoupon couponFrequency(String couponFrequency) {
    this.couponFrequency = JsonNullable.<String>of(couponFrequency);
    return this;
  }

   /**
   * The coupon frequency of the bond. Available only for &#x60;corporate bonds&#x60;. 
   * @return couponFrequency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "6M", value = "The coupon frequency of the bond. Available only for `corporate bonds`. ")
  @JsonIgnore

  public String getCouponFrequency() {
        return couponFrequency.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_COUPON_FREQUENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getCouponFrequency_JsonNullable() {
    return couponFrequency;
  }
  
  @JsonProperty(JSON_PROPERTY_COUPON_FREQUENCY)
  public void setCouponFrequency_JsonNullable(JsonNullable<String> couponFrequency) {
    this.couponFrequency = couponFrequency;
  }

  public void setCouponFrequency(String couponFrequency) {
    this.couponFrequency = JsonNullable.<String>of(couponFrequency);
  }


  /**
   * Return true if this bondCoupon object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BondCoupon bondCoupon = (BondCoupon) o;
    return Objects.equals(this.requestId, bondCoupon.requestId) &&
        equalsNullable(this.fsymId, bondCoupon.fsymId) &&
        equalsNullable(this.date, bondCoupon.date) &&
        equalsNullable(this.accruedInterest, bondCoupon.accruedInterest) &&
        equalsNullable(this.coupon, bondCoupon.coupon) &&
        equalsNullable(this.couponType, bondCoupon.couponType) &&
        equalsNullable(this.couponFrequency, bondCoupon.couponFrequency);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestId, hashCodeNullable(fsymId), hashCodeNullable(date), hashCodeNullable(accruedInterest), hashCodeNullable(coupon), hashCodeNullable(couponType), hashCodeNullable(couponFrequency));
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
    sb.append("class BondCoupon {\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    fsymId: ").append(toIndentedString(fsymId)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    accruedInterest: ").append(toIndentedString(accruedInterest)).append("\n");
    sb.append("    coupon: ").append(toIndentedString(coupon)).append("\n");
    sb.append("    couponType: ").append(toIndentedString(couponType)).append("\n");
    sb.append("    couponFrequency: ").append(toIndentedString(couponFrequency)).append("\n");
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

