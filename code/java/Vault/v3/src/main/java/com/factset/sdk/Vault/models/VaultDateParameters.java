/*
 * Vault API
 * Allow clients to fetch Analytics through APIs.
 *
 * The version of the OpenAPI document: 3.14.1
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.Vault.models;

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
import com.factset.sdk.Vault.JSON;


/**
 * The date parameters for Vault calculation
 */
@ApiModel(description = "The date parameters for Vault calculation")
@JsonPropertyOrder({
  VaultDateParameters.JSON_PROPERTY_STARTDATE,
  VaultDateParameters.JSON_PROPERTY_ENDDATE,
  VaultDateParameters.JSON_PROPERTY_FREQUENCY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class VaultDateParameters implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_STARTDATE = "startdate";
  private JsonNullable<String> startdate = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ENDDATE = "enddate";
  private String enddate;

  public static final String JSON_PROPERTY_FREQUENCY = "frequency";
  private String frequency;

  public VaultDateParameters() { 
  }

  @JsonCreator
  public VaultDateParameters(
    @JsonProperty(value=JSON_PROPERTY_ENDDATE, required=true) String enddate, 
    @JsonProperty(value=JSON_PROPERTY_FREQUENCY, required=true) String frequency
  ) {
    this();
    this.enddate = enddate;
    this.frequency = frequency;
  }

  public VaultDateParameters startdate(String startdate) {
    this.startdate = JsonNullable.<String>of(startdate);
    return this;
  }

   /**
   * Calculation&#39;s start date.
   * @return startdate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Calculation's start date.")
  @JsonIgnore

  public String getStartdate() {
        return startdate.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_STARTDATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getStartdate_JsonNullable() {
    return startdate;
  }
  
  @JsonProperty(JSON_PROPERTY_STARTDATE)
  public void setStartdate_JsonNullable(JsonNullable<String> startdate) {
    this.startdate = startdate;
  }

  public void setStartdate(String startdate) {
    this.startdate = JsonNullable.<String>of(startdate);
  }


  public VaultDateParameters enddate(String enddate) {
    this.enddate = enddate;
    return this;
  }

   /**
   * Calculation&#39;s end date.
   * @return enddate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Calculation's end date.")
  @JsonProperty(JSON_PROPERTY_ENDDATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getEnddate() {
    return enddate;
  }


  @JsonProperty(JSON_PROPERTY_ENDDATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEnddate(String enddate) {
    this.enddate = enddate;
  }


  public VaultDateParameters frequency(String frequency) {
    this.frequency = frequency;
    return this;
  }

   /**
   * Calculation&#39;s frequency.
   * @return frequency
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Calculation's frequency.")
  @JsonProperty(JSON_PROPERTY_FREQUENCY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getFrequency() {
    return frequency;
  }


  @JsonProperty(JSON_PROPERTY_FREQUENCY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFrequency(String frequency) {
    this.frequency = frequency;
  }


  /**
   * Return true if this VaultDateParameters object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VaultDateParameters vaultDateParameters = (VaultDateParameters) o;
    return equalsNullable(this.startdate, vaultDateParameters.startdate) &&
        Objects.equals(this.enddate, vaultDateParameters.enddate) &&
        Objects.equals(this.frequency, vaultDateParameters.frequency);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(startdate), enddate, frequency);
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
    sb.append("class VaultDateParameters {\n");
    sb.append("    startdate: ").append(toIndentedString(startdate)).append("\n");
    sb.append("    enddate: ").append(toIndentedString(enddate)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
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

