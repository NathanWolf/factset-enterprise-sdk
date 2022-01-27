/*
 * FactSet Funds API
 * FactSet Mutual Funds data offers over 50 fund- and share class-specific data points for mutual funds listed in the United States. <p>FactSet Mutual Funds Reference provides fund-specific reference information as well as FactSet's proprietary classification system. It includes but is not limited to the following coverage    * Fund descriptions    * A seven-tier classification system   * Leverage information   * Fees and expenses    * Portfolio managers       FactSet Mutual Funds Time Series provides quantitative data items on a historical basis. It includes but is not limited to the following coverage    * Net asset value   * Fund flows    * Assets under management   * Total return  
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.FactSetFunds.models;

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
import com.factset.sdk.FactSetFunds.JSON;


/**
 * Aum
 */
@JsonPropertyOrder({
  Aum.JSON_PROPERTY_FSYM_ID,
  Aum.JSON_PROPERTY_FUND_LEVEL_A_U_M,
  Aum.JSON_PROPERTY_SHR_CLASS_A_U_M_RPT,
  Aum.JSON_PROPERTY_SHR_CLASS_A_U_M_ACT,
  Aum.JSON_PROPERTY_CURRENCY,
  Aum.JSON_PROPERTY_DATE,
  Aum.JSON_PROPERTY_REQUEST_ID
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Aum implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_FSYM_ID = "fsymId";
  private String fsymId;

  public static final String JSON_PROPERTY_FUND_LEVEL_A_U_M = "fundLevelAUM";
  private Double fundLevelAUM;

  public static final String JSON_PROPERTY_SHR_CLASS_A_U_M_RPT = "shrClassAUMRpt";
  private Double shrClassAUMRpt;

  public static final String JSON_PROPERTY_SHR_CLASS_A_U_M_ACT = "shrClassAUMAct";
  private Double shrClassAUMAct;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  private String currency;

  public static final String JSON_PROPERTY_DATE = "date";
  private String date;

  public static final String JSON_PROPERTY_REQUEST_ID = "requestId";
  private String requestId;


  public Aum fsymId(String fsymId) {
    this.fsymId = fsymId;
    return this;
  }

   /**
   * FactSet Security Identifier. Six alpha-numeric characters, excluding vowels, with a -S suffix (XXXXXX-S), resolved from the requestId of the Fund requested.
   * @return fsymId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "FNK7XP-S", value = "FactSet Security Identifier. Six alpha-numeric characters, excluding vowels, with a -S suffix (XXXXXX-S), resolved from the requestId of the Fund requested.")
  @JsonProperty(JSON_PROPERTY_FSYM_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFsymId() {
    return fsymId;
  }


  @JsonProperty(JSON_PROPERTY_FSYM_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFsymId(String fsymId) {
    this.fsymId = fsymId;
  }


  public Aum fundLevelAUM(Double fundLevelAUM) {
    this.fundLevelAUM = fundLevelAUM;
    return this;
  }

   /**
   * Returns fund-level Assets Under Management (AUM) data. Fund-level AUM is the sum of the market values of the positions in the fund&#39;s portfolio. This represents all share classes.
   * @return fundLevelAUM
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1908934757.1935", value = "Returns fund-level Assets Under Management (AUM) data. Fund-level AUM is the sum of the market values of the positions in the fund's portfolio. This represents all share classes.")
  @JsonProperty(JSON_PROPERTY_FUND_LEVEL_A_U_M)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getFundLevelAUM() {
    return fundLevelAUM;
  }


  @JsonProperty(JSON_PROPERTY_FUND_LEVEL_A_U_M)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFundLevelAUM(Double fundLevelAUM) {
    this.fundLevelAUM = fundLevelAUM;
  }


  public Aum shrClassAUMRpt(Double shrClassAUMRpt) {
    this.shrClassAUMRpt = shrClassAUMRpt;
    return this;
  }

   /**
   * As-Reported AUM. Calculated by using shares outstanding at previous close multiplied by NAV at previous close. This is typically the value seen on fund websites. As Reported AUM &#x3D; (Shares Outstanding t0 * NAV t0).
   * @return shrClassAUMRpt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "902354605.39548", value = "As-Reported AUM. Calculated by using shares outstanding at previous close multiplied by NAV at previous close. This is typically the value seen on fund websites. As Reported AUM = (Shares Outstanding t0 * NAV t0).")
  @JsonProperty(JSON_PROPERTY_SHR_CLASS_A_U_M_RPT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getShrClassAUMRpt() {
    return shrClassAUMRpt;
  }


  @JsonProperty(JSON_PROPERTY_SHR_CLASS_A_U_M_RPT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShrClassAUMRpt(Double shrClassAUMRpt) {
    this.shrClassAUMRpt = shrClassAUMRpt;
  }


  public Aum shrClassAUMAct(Double shrClassAUMAct) {
    this.shrClassAUMAct = shrClassAUMAct;
    return this;
  }

   /**
   * Actual AUM. Calculated by using shares outstanding at previous close multiplied by NAV of one day prior to close. This is the value used in calculating fund flows. Actual AUM &#x3D; (Shares Outstanding t0 * NAV t-1)
   * @return shrClassAUMAct
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "914573047.89582", value = "Actual AUM. Calculated by using shares outstanding at previous close multiplied by NAV of one day prior to close. This is the value used in calculating fund flows. Actual AUM = (Shares Outstanding t0 * NAV t-1)")
  @JsonProperty(JSON_PROPERTY_SHR_CLASS_A_U_M_ACT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getShrClassAUMAct() {
    return shrClassAUMAct;
  }


  @JsonProperty(JSON_PROPERTY_SHR_CLASS_A_U_M_ACT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShrClassAUMAct(Double shrClassAUMAct) {
    this.shrClassAUMAct = shrClassAUMAct;
  }


  public Aum currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * The Currency of the AUM values. By default it will be in the FUnds Currency, unless otherwise requested via the currency parameter.
   * @return currency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "USD", value = "The Currency of the AUM values. By default it will be in the FUnds Currency, unless otherwise requested via the currency parameter.")
  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCurrency() {
    return currency;
  }


  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrency(String currency) {
    this.currency = currency;
  }


  public Aum date(String date) {
    this.date = date;
    return this;
  }

   /**
   * The date of the AUM in YYYY-MM-DD format.
   * @return date
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Sun Feb 28 00:00:00 UTC 2021", value = "The date of the AUM in YYYY-MM-DD format.")
  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDate() {
    return date;
  }


  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDate(String date) {
    this.date = date;
  }


  public Aum requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

   /**
   * The requested Id sent as input.
   * @return requestId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "MABAX", value = "The requested Id sent as input.")
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


  /**
   * Return true if this aum object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Aum aum = (Aum) o;
    return Objects.equals(this.fsymId, aum.fsymId) &&
        Objects.equals(this.fundLevelAUM, aum.fundLevelAUM) &&
        Objects.equals(this.shrClassAUMRpt, aum.shrClassAUMRpt) &&
        Objects.equals(this.shrClassAUMAct, aum.shrClassAUMAct) &&
        Objects.equals(this.currency, aum.currency) &&
        Objects.equals(this.date, aum.date) &&
        Objects.equals(this.requestId, aum.requestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fsymId, fundLevelAUM, shrClassAUMRpt, shrClassAUMAct, currency, date, requestId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Aum {\n");
    sb.append("    fsymId: ").append(toIndentedString(fsymId)).append("\n");
    sb.append("    fundLevelAUM: ").append(toIndentedString(fundLevelAUM)).append("\n");
    sb.append("    shrClassAUMRpt: ").append(toIndentedString(shrClassAUMRpt)).append("\n");
    sb.append("    shrClassAUMAct: ").append(toIndentedString(shrClassAUMAct)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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

