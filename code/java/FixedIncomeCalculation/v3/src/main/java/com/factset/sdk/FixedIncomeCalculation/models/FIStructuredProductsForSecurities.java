/*
 * FI API
 * Allow clients to fetch Analytics through APIs.
 *
 * The version of the OpenAPI document: 3.9.0
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
import com.factset.sdk.FixedIncomeCalculation.models.FIBalloonExtension;
import com.factset.sdk.FixedIncomeCalculation.models.FICashflows;
import com.factset.sdk.FixedIncomeCalculation.models.FIPrepayLockout;
import com.factset.sdk.FixedIncomeCalculation.models.FIServicerAdvancesForSecurities;
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
 * FIStructuredProductsForSecurities
 */
@JsonPropertyOrder({
  FIStructuredProductsForSecurities.JSON_PROPERTY_SERVICER_ADVANCES,
  FIStructuredProductsForSecurities.JSON_PROPERTY_IGNORE_FINANCIAL_GUARANTEE,
  FIStructuredProductsForSecurities.JSON_PROPERTY_CLEAN_UP_CALL_METHOD,
  FIStructuredProductsForSecurities.JSON_PROPERTY_DO_O_P_T_REDEEM,
  FIStructuredProductsForSecurities.JSON_PROPERTY_PREPAY_LOCKOUT,
  FIStructuredProductsForSecurities.JSON_PROPERTY_CASHFLOWS,
  FIStructuredProductsForSecurities.JSON_PROPERTY_BALLOON_EXTENSION
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FIStructuredProductsForSecurities implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_SERVICER_ADVANCES = "servicerAdvances";
  private FIServicerAdvancesForSecurities servicerAdvances;

  public static final String JSON_PROPERTY_IGNORE_FINANCIAL_GUARANTEE = "ignoreFinancialGuarantee";
  private JsonNullable<String> ignoreFinancialGuarantee = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CLEAN_UP_CALL_METHOD = "cleanUpCallMethod";
  private JsonNullable<Boolean> cleanUpCallMethod = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_DO_O_P_T_REDEEM = "doOPTRedeem";
  private JsonNullable<String> doOPTRedeem = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PREPAY_LOCKOUT = "prepayLockout";
  private FIPrepayLockout prepayLockout;

  public static final String JSON_PROPERTY_CASHFLOWS = "cashflows";
  private FICashflows cashflows;

  public static final String JSON_PROPERTY_BALLOON_EXTENSION = "balloonExtension";
  private FIBalloonExtension balloonExtension;

  public FIStructuredProductsForSecurities() { 
  }

  public FIStructuredProductsForSecurities servicerAdvances(FIServicerAdvancesForSecurities servicerAdvances) {
    this.servicerAdvances = servicerAdvances;
    return this;
  }

   /**
   * Get servicerAdvances
   * @return servicerAdvances
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SERVICER_ADVANCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FIServicerAdvancesForSecurities getServicerAdvances() {
    return servicerAdvances;
  }


  @JsonProperty(JSON_PROPERTY_SERVICER_ADVANCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setServicerAdvances(FIServicerAdvancesForSecurities servicerAdvances) {
    this.servicerAdvances = servicerAdvances;
  }


  public FIStructuredProductsForSecurities ignoreFinancialGuarantee(String ignoreFinancialGuarantee) {
    this.ignoreFinancialGuarantee = JsonNullable.<String>of(ignoreFinancialGuarantee);
    return this;
  }

   /**
   * Ignore Financial Guarantee
   * @return ignoreFinancialGuarantee
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Ignore Financial Guarantee")
  @JsonIgnore

  public String getIgnoreFinancialGuarantee() {
        return ignoreFinancialGuarantee.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_IGNORE_FINANCIAL_GUARANTEE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getIgnoreFinancialGuarantee_JsonNullable() {
    return ignoreFinancialGuarantee;
  }
  
  @JsonProperty(JSON_PROPERTY_IGNORE_FINANCIAL_GUARANTEE)
  public void setIgnoreFinancialGuarantee_JsonNullable(JsonNullable<String> ignoreFinancialGuarantee) {
    this.ignoreFinancialGuarantee = ignoreFinancialGuarantee;
  }

  public void setIgnoreFinancialGuarantee(String ignoreFinancialGuarantee) {
    this.ignoreFinancialGuarantee = JsonNullable.<String>of(ignoreFinancialGuarantee);
  }


  public FIStructuredProductsForSecurities cleanUpCallMethod(Boolean cleanUpCallMethod) {
    this.cleanUpCallMethod = JsonNullable.<Boolean>of(cleanUpCallMethod);
    return this;
  }

   /**
   * Cleanup Call Method
   * @return cleanUpCallMethod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Cleanup Call Method")
  @JsonIgnore

  public Boolean getCleanUpCallMethod() {
        return cleanUpCallMethod.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CLEAN_UP_CALL_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Boolean> getCleanUpCallMethod_JsonNullable() {
    return cleanUpCallMethod;
  }
  
  @JsonProperty(JSON_PROPERTY_CLEAN_UP_CALL_METHOD)
  public void setCleanUpCallMethod_JsonNullable(JsonNullable<Boolean> cleanUpCallMethod) {
    this.cleanUpCallMethod = cleanUpCallMethod;
  }

  public void setCleanUpCallMethod(Boolean cleanUpCallMethod) {
    this.cleanUpCallMethod = JsonNullable.<Boolean>of(cleanUpCallMethod);
  }


  public FIStructuredProductsForSecurities doOPTRedeem(String doOPTRedeem) {
    this.doOPTRedeem = JsonNullable.<String>of(doOPTRedeem);
    return this;
  }

   /**
   * Do OPT Redeem
   * @return doOPTRedeem
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Do OPT Redeem")
  @JsonIgnore

  public String getDoOPTRedeem() {
        return doOPTRedeem.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DO_O_P_T_REDEEM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getDoOPTRedeem_JsonNullable() {
    return doOPTRedeem;
  }
  
  @JsonProperty(JSON_PROPERTY_DO_O_P_T_REDEEM)
  public void setDoOPTRedeem_JsonNullable(JsonNullable<String> doOPTRedeem) {
    this.doOPTRedeem = doOPTRedeem;
  }

  public void setDoOPTRedeem(String doOPTRedeem) {
    this.doOPTRedeem = JsonNullable.<String>of(doOPTRedeem);
  }


  public FIStructuredProductsForSecurities prepayLockout(FIPrepayLockout prepayLockout) {
    this.prepayLockout = prepayLockout;
    return this;
  }

   /**
   * Get prepayLockout
   * @return prepayLockout
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PREPAY_LOCKOUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FIPrepayLockout getPrepayLockout() {
    return prepayLockout;
  }


  @JsonProperty(JSON_PROPERTY_PREPAY_LOCKOUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrepayLockout(FIPrepayLockout prepayLockout) {
    this.prepayLockout = prepayLockout;
  }


  public FIStructuredProductsForSecurities cashflows(FICashflows cashflows) {
    this.cashflows = cashflows;
    return this;
  }

   /**
   * Get cashflows
   * @return cashflows
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CASHFLOWS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FICashflows getCashflows() {
    return cashflows;
  }


  @JsonProperty(JSON_PROPERTY_CASHFLOWS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCashflows(FICashflows cashflows) {
    this.cashflows = cashflows;
  }


  public FIStructuredProductsForSecurities balloonExtension(FIBalloonExtension balloonExtension) {
    this.balloonExtension = balloonExtension;
    return this;
  }

   /**
   * Get balloonExtension
   * @return balloonExtension
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BALLOON_EXTENSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FIBalloonExtension getBalloonExtension() {
    return balloonExtension;
  }


  @JsonProperty(JSON_PROPERTY_BALLOON_EXTENSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBalloonExtension(FIBalloonExtension balloonExtension) {
    this.balloonExtension = balloonExtension;
  }


  /**
   * Return true if this FIStructuredProductsForSecurities object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FIStructuredProductsForSecurities fiStructuredProductsForSecurities = (FIStructuredProductsForSecurities) o;
    return Objects.equals(this.servicerAdvances, fiStructuredProductsForSecurities.servicerAdvances) &&
        equalsNullable(this.ignoreFinancialGuarantee, fiStructuredProductsForSecurities.ignoreFinancialGuarantee) &&
        equalsNullable(this.cleanUpCallMethod, fiStructuredProductsForSecurities.cleanUpCallMethod) &&
        equalsNullable(this.doOPTRedeem, fiStructuredProductsForSecurities.doOPTRedeem) &&
        Objects.equals(this.prepayLockout, fiStructuredProductsForSecurities.prepayLockout) &&
        Objects.equals(this.cashflows, fiStructuredProductsForSecurities.cashflows) &&
        Objects.equals(this.balloonExtension, fiStructuredProductsForSecurities.balloonExtension);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(servicerAdvances, hashCodeNullable(ignoreFinancialGuarantee), hashCodeNullable(cleanUpCallMethod), hashCodeNullable(doOPTRedeem), prepayLockout, cashflows, balloonExtension);
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
    sb.append("class FIStructuredProductsForSecurities {\n");
    sb.append("    servicerAdvances: ").append(toIndentedString(servicerAdvances)).append("\n");
    sb.append("    ignoreFinancialGuarantee: ").append(toIndentedString(ignoreFinancialGuarantee)).append("\n");
    sb.append("    cleanUpCallMethod: ").append(toIndentedString(cleanUpCallMethod)).append("\n");
    sb.append("    doOPTRedeem: ").append(toIndentedString(doOPTRedeem)).append("\n");
    sb.append("    prepayLockout: ").append(toIndentedString(prepayLockout)).append("\n");
    sb.append("    cashflows: ").append(toIndentedString(cashflows)).append("\n");
    sb.append("    balloonExtension: ").append(toIndentedString(balloonExtension)).append("\n");
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

