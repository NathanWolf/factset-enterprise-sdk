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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.FixedIncomeCalculation.JSON;


/**
 * FICashflows
 */
@JsonPropertyOrder({
  FICashflows.JSON_PROPERTY_OPTIONAL_REDEMPTION_CALL_WHEN_UNITS,
  FICashflows.JSON_PROPERTY_OPTIONAL_REDEMPTION_CALL_WHEN,
  FICashflows.JSON_PROPERTY_RECOVERY_LAG
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FICashflows implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * OptionalRedemptionCallWhenUnits
   */
  public enum OptionalRedemptionCallWhenUnitsEnum {
    MANUAL("Manual"),
    
    NEVER("Never"),
    
    ASAP("ASAP"),
    
    DATE("Date"),
    
    DEAL_CLOSING("Deal Closing"),
    
    SETTLE_DATE("Settle Date");

    private String value;

    OptionalRedemptionCallWhenUnitsEnum(String value) {
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
    public static OptionalRedemptionCallWhenUnitsEnum fromValue(String value) {
      for (OptionalRedemptionCallWhenUnitsEnum b : OptionalRedemptionCallWhenUnitsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_OPTIONAL_REDEMPTION_CALL_WHEN_UNITS = "optionalRedemptionCallWhenUnits";
  private OptionalRedemptionCallWhenUnitsEnum optionalRedemptionCallWhenUnits;

  public static final String JSON_PROPERTY_OPTIONAL_REDEMPTION_CALL_WHEN = "optionalRedemptionCallWhen";
  private Integer optionalRedemptionCallWhen;

  public static final String JSON_PROPERTY_RECOVERY_LAG = "recoveryLag";
  private Integer recoveryLag;

  public FICashflows() { 
  }

  public FICashflows optionalRedemptionCallWhenUnits(OptionalRedemptionCallWhenUnitsEnum optionalRedemptionCallWhenUnits) {
    this.optionalRedemptionCallWhenUnits = optionalRedemptionCallWhenUnits;
    return this;
  }

   /**
   * OptionalRedemptionCallWhenUnits
   * @return optionalRedemptionCallWhenUnits
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "OptionalRedemptionCallWhenUnits")
  @JsonProperty(JSON_PROPERTY_OPTIONAL_REDEMPTION_CALL_WHEN_UNITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OptionalRedemptionCallWhenUnitsEnum getOptionalRedemptionCallWhenUnits() {
    return optionalRedemptionCallWhenUnits;
  }


  @JsonProperty(JSON_PROPERTY_OPTIONAL_REDEMPTION_CALL_WHEN_UNITS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOptionalRedemptionCallWhenUnits(OptionalRedemptionCallWhenUnitsEnum optionalRedemptionCallWhenUnits) {
    this.optionalRedemptionCallWhenUnits = optionalRedemptionCallWhenUnits;
  }


  public FICashflows optionalRedemptionCallWhen(Integer optionalRedemptionCallWhen) {
    this.optionalRedemptionCallWhen = optionalRedemptionCallWhen;
    return this;
  }

   /**
   * OptionalRedemptionCallWhen
   * @return optionalRedemptionCallWhen
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "OptionalRedemptionCallWhen")
  @JsonProperty(JSON_PROPERTY_OPTIONAL_REDEMPTION_CALL_WHEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getOptionalRedemptionCallWhen() {
    return optionalRedemptionCallWhen;
  }


  @JsonProperty(JSON_PROPERTY_OPTIONAL_REDEMPTION_CALL_WHEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOptionalRedemptionCallWhen(Integer optionalRedemptionCallWhen) {
    this.optionalRedemptionCallWhen = optionalRedemptionCallWhen;
  }


  public FICashflows recoveryLag(Integer recoveryLag) {
    this.recoveryLag = recoveryLag;
    return this;
  }

   /**
   * RecoveryLag
   * @return recoveryLag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "RecoveryLag")
  @JsonProperty(JSON_PROPERTY_RECOVERY_LAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getRecoveryLag() {
    return recoveryLag;
  }


  @JsonProperty(JSON_PROPERTY_RECOVERY_LAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRecoveryLag(Integer recoveryLag) {
    this.recoveryLag = recoveryLag;
  }


  /**
   * Return true if this FICashflows object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FICashflows fiCashflows = (FICashflows) o;
    return Objects.equals(this.optionalRedemptionCallWhenUnits, fiCashflows.optionalRedemptionCallWhenUnits) &&
        Objects.equals(this.optionalRedemptionCallWhen, fiCashflows.optionalRedemptionCallWhen) &&
        Objects.equals(this.recoveryLag, fiCashflows.recoveryLag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(optionalRedemptionCallWhenUnits, optionalRedemptionCallWhen, recoveryLag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FICashflows {\n");
    sb.append("    optionalRedemptionCallWhenUnits: ").append(toIndentedString(optionalRedemptionCallWhenUnits)).append("\n");
    sb.append("    optionalRedemptionCallWhen: ").append(toIndentedString(optionalRedemptionCallWhen)).append("\n");
    sb.append("    recoveryLag: ").append(toIndentedString(recoveryLag)).append("\n");
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

