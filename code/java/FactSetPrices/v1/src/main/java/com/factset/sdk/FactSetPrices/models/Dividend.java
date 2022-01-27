/*
 * FactSet Prices API
 * Gain access to comprehensive global coverage for Equities & Fixed Income. Perform quick analytics by controlling the date ranges, currencies, and rolling periods, or simply request Open, High, Low, and Close prices. Easily connect pricing data with other core company data or alternative content sets using FactSet's hub and spoke symbology. <p>Equity and Fund Security types include Common Stock, ADR, GDR, Preferred, Closed-ended Fund, Exchange Traded Fund, Unit, Open-ended Fund, Exchange Traded Fund UVI, Exchange Traded Fund NAV, Preferred Equity, Non-Voting Depositary Receipt/Certificate, Alien/Foreign, Structured Product, and Temporary Instruments. Reference over 180,000+ active and inactive securities.</p><p>Fixed Income Security Types include Corporate Bonds, Treasury and Agency bonds, Government Bonds, and Municipals.</p> 
 *
 * The version of the OpenAPI document: 1.2.1
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.FactSetPrices.models;

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
import org.threeten.bp.LocalDate;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.FactSetPrices.JSON;


/**
 * Dividend
 */
@JsonPropertyOrder({
  Dividend.JSON_PROPERTY_FSYM_ID,
  Dividend.JSON_PROPERTY_DIVS_EX_DATE,
  Dividend.JSON_PROPERTY_ADJ_DATE,
  Dividend.JSON_PROPERTY_CURRENCY,
  Dividend.JSON_PROPERTY_DIVS_PAID,
  Dividend.JSON_PROPERTY_DIVS_REC_DATE,
  Dividend.JSON_PROPERTY_DIVS_PAY_DATE,
  Dividend.JSON_PROPERTY_DIVS_TYPE_C,
  Dividend.JSON_PROPERTY_DIVS_TYPE_D,
  Dividend.JSON_PROPERTY_DIVS_TAX_C,
  Dividend.JSON_PROPERTY_DIVS_TAX_D,
  Dividend.JSON_PROPERTY_DIVS_N_G_FLAG,
  Dividend.JSON_PROPERTY_DIVS_N_G_EQUIV,
  Dividend.JSON_PROPERTY_REQUEST_ID
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Dividend implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_FSYM_ID = "fsymId";
  private String fsymId;

  public static final String JSON_PROPERTY_DIVS_EX_DATE = "divsExDate";
  private LocalDate divsExDate;

  public static final String JSON_PROPERTY_ADJ_DATE = "adjDate";
  private LocalDate adjDate;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  private String currency;

  public static final String JSON_PROPERTY_DIVS_PAID = "divsPaid";
  private Double divsPaid;

  public static final String JSON_PROPERTY_DIVS_REC_DATE = "divsRecDate";
  private LocalDate divsRecDate;

  public static final String JSON_PROPERTY_DIVS_PAY_DATE = "divsPayDate";
  private LocalDate divsPayDate;

  public static final String JSON_PROPERTY_DIVS_TYPE_C = "divsTypeC";
  private Integer divsTypeC;

  public static final String JSON_PROPERTY_DIVS_TYPE_D = "divsTypeD";
  private String divsTypeD;

  public static final String JSON_PROPERTY_DIVS_TAX_C = "divsTaxC";
  private String divsTaxC;

  public static final String JSON_PROPERTY_DIVS_TAX_D = "divsTaxD";
  private String divsTaxD;

  /**
   * Net/Gross Marker Code. For details describing Net vs. Gross dividends, visit [Online Assistant Page #11512](https://oa.apps.factset.com/pages/11512).
   */
  public enum DivsNGFlagEnum {
    N("N"),
    
    G("G"),
    
    T("T"),
    
    X("X"),
    
    V("V"),
    
    _0("0");

    private String value;

    DivsNGFlagEnum(String value) {
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
    public static DivsNGFlagEnum fromValue(String value) {
      for (DivsNGFlagEnum b : DivsNGFlagEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_DIVS_N_G_FLAG = "divsNGFlag";
  private DivsNGFlagEnum divsNGFlag;

  public static final String JSON_PROPERTY_DIVS_N_G_EQUIV = "divsNGEquiv";
  private Double divsNGEquiv;

  public static final String JSON_PROPERTY_REQUEST_ID = "requestId";
  private String requestId;


  public Dividend fsymId(String fsymId) {
    this.fsymId = fsymId;
    return this;
  }

   /**
   * Factset Regional Security Identifier. Six alpha-numeric characters, excluding vowels, with an -R suffix (XXXXXX-R). Identifies the security&#39;s best regional security data series per currency. For equities, all primary listings per region and currency are allocated a regional-level permanent identifier. The regional-level permanent identifier will be available once a SEDOL representing the region/currency has been allocated and the identifiers are on FactSet.
   * @return fsymId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SJY281-R", value = "Factset Regional Security Identifier. Six alpha-numeric characters, excluding vowels, with an -R suffix (XXXXXX-R). Identifies the security's best regional security data series per currency. For equities, all primary listings per region and currency are allocated a regional-level permanent identifier. The regional-level permanent identifier will be available once a SEDOL representing the region/currency has been allocated and the identifiers are on FactSet.")
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


  public Dividend divsExDate(LocalDate divsExDate) {
    this.divsExDate = divsExDate;
    return this;
  }

   /**
   * Ex-Date of the dividend expressed in YYYY-MM-DD format.
   * @return divsExDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Thu Aug 01 00:00:00 UTC 2013", value = "Ex-Date of the dividend expressed in YYYY-MM-DD format.")
  @JsonProperty(JSON_PROPERTY_DIVS_EX_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LocalDate getDivsExDate() {
    return divsExDate;
  }


  @JsonProperty(JSON_PROPERTY_DIVS_EX_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDivsExDate(LocalDate divsExDate) {
    this.divsExDate = divsExDate;
  }


  public Dividend adjDate(LocalDate adjDate) {
    this.adjDate = adjDate;
    return this;
  }

   /**
   * Date of last split for which prices and volume have been adjusted.
   * @return adjDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Mon Feb 07 00:00:00 UTC 2005", value = "Date of last split for which prices and volume have been adjusted.")
  @JsonProperty(JSON_PROPERTY_ADJ_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LocalDate getAdjDate() {
    return adjDate;
  }


  @JsonProperty(JSON_PROPERTY_ADJ_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdjDate(LocalDate adjDate) {
    this.adjDate = adjDate;
  }


  public Dividend currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Currency ISO code. For more details, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470).
   * @return currency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "USD", value = "Currency ISO code. For more details, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470).")
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


  public Dividend divsPaid(Double divsPaid) {
    this.divsPaid = divsPaid;
    return this;
  }

   /**
   * Amount of the dividend paid.
   * @return divsPaid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5", value = "Amount of the dividend paid.")
  @JsonProperty(JSON_PROPERTY_DIVS_PAID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getDivsPaid() {
    return divsPaid;
  }


  @JsonProperty(JSON_PROPERTY_DIVS_PAID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDivsPaid(Double divsPaid) {
    this.divsPaid = divsPaid;
  }


  public Dividend divsRecDate(LocalDate divsRecDate) {
    this.divsRecDate = divsRecDate;
    return this;
  }

   /**
   * Date the dividend was recorded expressed in YYYY-MM-DD format.
   * @return divsRecDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Wed Jul 10 00:00:00 UTC 2013", value = "Date the dividend was recorded expressed in YYYY-MM-DD format.")
  @JsonProperty(JSON_PROPERTY_DIVS_REC_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LocalDate getDivsRecDate() {
    return divsRecDate;
  }


  @JsonProperty(JSON_PROPERTY_DIVS_REC_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDivsRecDate(LocalDate divsRecDate) {
    this.divsRecDate = divsRecDate;
  }


  public Dividend divsPayDate(LocalDate divsPayDate) {
    this.divsPayDate = divsPayDate;
    return this;
  }

   /**
   * Date the dividend will be paid expressed in YYYY-MM-DD format.
   * @return divsPayDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Thu Aug 08 00:00:00 UTC 2013", value = "Date the dividend will be paid expressed in YYYY-MM-DD format.")
  @JsonProperty(JSON_PROPERTY_DIVS_PAY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LocalDate getDivsPayDate() {
    return divsPayDate;
  }


  @JsonProperty(JSON_PROPERTY_DIVS_PAY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDivsPayDate(LocalDate divsPayDate) {
    this.divsPayDate = divsPayDate;
  }


  public Dividend divsTypeC(Integer divsTypeC) {
    this.divsTypeC = divsTypeC;
    return this;
  }

   /**
   * Dividend type code. For code descriptions, visit [Online Assistant Page #8764](https://oa.apps.factset.com/pages/8764).
   * @return divsTypeC
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1049", value = "Dividend type code. For code descriptions, visit [Online Assistant Page #8764](https://oa.apps.factset.com/pages/8764).")
  @JsonProperty(JSON_PROPERTY_DIVS_TYPE_C)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getDivsTypeC() {
    return divsTypeC;
  }


  @JsonProperty(JSON_PROPERTY_DIVS_TYPE_C)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDivsTypeC(Integer divsTypeC) {
    this.divsTypeC = divsTypeC;
  }


  public Dividend divsTypeD(String divsTypeD) {
    this.divsTypeD = divsTypeD;
    return this;
  }

   /**
   * Description of dividend type. For type descriptions, visit [Online Assistant Page #8764](https://oa.apps.factset.com/pages/8764).
   * @return divsTypeD
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "U.S. Currency", value = "Description of dividend type. For type descriptions, visit [Online Assistant Page #8764](https://oa.apps.factset.com/pages/8764).")
  @JsonProperty(JSON_PROPERTY_DIVS_TYPE_D)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDivsTypeD() {
    return divsTypeD;
  }


  @JsonProperty(JSON_PROPERTY_DIVS_TYPE_D)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDivsTypeD(String divsTypeD) {
    this.divsTypeD = divsTypeD;
  }


  public Dividend divsTaxC(String divsTaxC) {
    this.divsTaxC = divsTaxC;
    return this;
  }

   /**
   * Tax Marker Code. For code descriptions, visit [Online Assistant Page #15265](https://oa.apps.factset.com/pages/15265).
   * @return divsTaxC
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "FC", value = "Tax Marker Code. For code descriptions, visit [Online Assistant Page #15265](https://oa.apps.factset.com/pages/15265).")
  @JsonProperty(JSON_PROPERTY_DIVS_TAX_C)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDivsTaxC() {
    return divsTaxC;
  }


  @JsonProperty(JSON_PROPERTY_DIVS_TAX_C)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDivsTaxC(String divsTaxC) {
    this.divsTaxC = divsTaxC;
  }


  public Dividend divsTaxD(String divsTaxD) {
    this.divsTaxD = divsTaxD;
    return this;
  }

   /**
   * Description of Tax Marker. For type descriptions, visit [Online Assistant Page #15265](https://oa.apps.factset.com/pages/15265).
   * @return divsTaxD
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Free of tax", value = "Description of Tax Marker. For type descriptions, visit [Online Assistant Page #15265](https://oa.apps.factset.com/pages/15265).")
  @JsonProperty(JSON_PROPERTY_DIVS_TAX_D)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDivsTaxD() {
    return divsTaxD;
  }


  @JsonProperty(JSON_PROPERTY_DIVS_TAX_D)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDivsTaxD(String divsTaxD) {
    this.divsTaxD = divsTaxD;
  }


  public Dividend divsNGFlag(DivsNGFlagEnum divsNGFlag) {
    this.divsNGFlag = divsNGFlag;
    return this;
  }

   /**
   * Net/Gross Marker Code. For details describing Net vs. Gross dividends, visit [Online Assistant Page #11512](https://oa.apps.factset.com/pages/11512).
   * @return divsNGFlag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Net/Gross Marker Code. For details describing Net vs. Gross dividends, visit [Online Assistant Page #11512](https://oa.apps.factset.com/pages/11512).")
  @JsonProperty(JSON_PROPERTY_DIVS_N_G_FLAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DivsNGFlagEnum getDivsNGFlag() {
    return divsNGFlag;
  }


  @JsonProperty(JSON_PROPERTY_DIVS_N_G_FLAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDivsNGFlag(DivsNGFlagEnum divsNGFlag) {
    this.divsNGFlag = divsNGFlag;
  }


  public Dividend divsNGEquiv(Double divsNGEquiv) {
    this.divsNGEquiv = divsNGEquiv;
    return this;
  }

   /**
   * Net/Gross equivalent (opposite of dividend paid). For details describing Net vs. Gross dividends, visit [Online Assistant Page #11512](https://oa.apps.factset.com/pages/11512).
   * @return divsNGEquiv
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5.5", value = "Net/Gross equivalent (opposite of dividend paid). For details describing Net vs. Gross dividends, visit [Online Assistant Page #11512](https://oa.apps.factset.com/pages/11512).")
  @JsonProperty(JSON_PROPERTY_DIVS_N_G_EQUIV)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getDivsNGEquiv() {
    return divsNGEquiv;
  }


  @JsonProperty(JSON_PROPERTY_DIVS_N_G_EQUIV)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDivsNGEquiv(Double divsNGEquiv) {
    this.divsNGEquiv = divsNGEquiv;
  }


  public Dividend requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

   /**
   * Identifier that was used for the request.
   * @return requestId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "IBM-US", value = "Identifier that was used for the request.")
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
   * Return true if this dividend object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Dividend dividend = (Dividend) o;
    return Objects.equals(this.fsymId, dividend.fsymId) &&
        Objects.equals(this.divsExDate, dividend.divsExDate) &&
        Objects.equals(this.adjDate, dividend.adjDate) &&
        Objects.equals(this.currency, dividend.currency) &&
        Objects.equals(this.divsPaid, dividend.divsPaid) &&
        Objects.equals(this.divsRecDate, dividend.divsRecDate) &&
        Objects.equals(this.divsPayDate, dividend.divsPayDate) &&
        Objects.equals(this.divsTypeC, dividend.divsTypeC) &&
        Objects.equals(this.divsTypeD, dividend.divsTypeD) &&
        Objects.equals(this.divsTaxC, dividend.divsTaxC) &&
        Objects.equals(this.divsTaxD, dividend.divsTaxD) &&
        Objects.equals(this.divsNGFlag, dividend.divsNGFlag) &&
        Objects.equals(this.divsNGEquiv, dividend.divsNGEquiv) &&
        Objects.equals(this.requestId, dividend.requestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fsymId, divsExDate, adjDate, currency, divsPaid, divsRecDate, divsPayDate, divsTypeC, divsTypeD, divsTaxC, divsTaxD, divsNGFlag, divsNGEquiv, requestId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Dividend {\n");
    sb.append("    fsymId: ").append(toIndentedString(fsymId)).append("\n");
    sb.append("    divsExDate: ").append(toIndentedString(divsExDate)).append("\n");
    sb.append("    adjDate: ").append(toIndentedString(adjDate)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    divsPaid: ").append(toIndentedString(divsPaid)).append("\n");
    sb.append("    divsRecDate: ").append(toIndentedString(divsRecDate)).append("\n");
    sb.append("    divsPayDate: ").append(toIndentedString(divsPayDate)).append("\n");
    sb.append("    divsTypeC: ").append(toIndentedString(divsTypeC)).append("\n");
    sb.append("    divsTypeD: ").append(toIndentedString(divsTypeD)).append("\n");
    sb.append("    divsTaxC: ").append(toIndentedString(divsTaxC)).append("\n");
    sb.append("    divsTaxD: ").append(toIndentedString(divsTaxD)).append("\n");
    sb.append("    divsNGFlag: ").append(toIndentedString(divsNGFlag)).append("\n");
    sb.append("    divsNGEquiv: ").append(toIndentedString(divsNGEquiv)).append("\n");
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

