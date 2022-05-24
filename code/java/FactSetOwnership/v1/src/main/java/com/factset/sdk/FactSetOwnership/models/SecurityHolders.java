/*
 * FactSet Ownership API
 * FactSet’s Fund Ownership API gives access to both **Holdings** and **Holders** data.<p> Factset's Holdings endpoints gives access to all the underlying securities and their position detils held within a given fund. Fund Types supported include Open-End Mutual Funds, Closed-end Mutual Funds, and Exchange Traded Funds. Security Holders information retrieves all \"holder types\" and their positions across institutions, funds, insiders, and stakeholders.</p><p>The FactSet Ownership and Mutual Funds database collects global equity ownership data for approximately 50,000 institutions, 60,000 unique Mutual Fund portfolios, and 400,000 Insider/Stake holders from around 110 countries.  For more details review our [Data Collection](https://my.apps.factset.com/oa/cms/oaAttachment/87e162be-f2d1-4f40-a85b-bfb1b020d270/20079) methodology. </p> 
 *
 * The version of the OpenAPI document: 1.1.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.FactSetOwnership.models;

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
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.FactSetOwnership.JSON;


/**
 * Security Holders response object
 */
@ApiModel(description = "Security Holders response object")
@JsonPropertyOrder({
  SecurityHolders.JSON_PROPERTY_HOLDER_ID,
  SecurityHolders.JSON_PROPERTY_FSYM_ID,
  SecurityHolders.JSON_PROPERTY_HOLDER_ENTITY_ID,
  SecurityHolders.JSON_PROPERTY_HOLDER_NAME,
  SecurityHolders.JSON_PROPERTY_DATE,
  SecurityHolders.JSON_PROPERTY_CURRENCY,
  SecurityHolders.JSON_PROPERTY_INVESTOR_TYPE,
  SecurityHolders.JSON_PROPERTY_HOLDER_TYPE,
  SecurityHolders.JSON_PROPERTY_ADJ_HOLDING,
  SecurityHolders.JSON_PROPERTY_ADJ_MARKET_VALUE,
  SecurityHolders.JSON_PROPERTY_WEIGHT_CLOSE,
  SecurityHolders.JSON_PROPERTY_PERCENT_OUTSTANDING,
  SecurityHolders.JSON_PROPERTY_SOURCE,
  SecurityHolders.JSON_PROPERTY_REQUEST_ID
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SecurityHolders implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_HOLDER_ID = "holderId";
  private String holderId;

  public static final String JSON_PROPERTY_FSYM_ID = "fsymId";
  private String fsymId;

  public static final String JSON_PROPERTY_HOLDER_ENTITY_ID = "holderEntityId";
  private String holderEntityId;

  public static final String JSON_PROPERTY_HOLDER_NAME = "holderName";
  private String holderName;

  public static final String JSON_PROPERTY_DATE = "date";
  private LocalDate date;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  private String currency;

  public static final String JSON_PROPERTY_INVESTOR_TYPE = "investorType";
  private String investorType;

  public static final String JSON_PROPERTY_HOLDER_TYPE = "holderType";
  private String holderType;

  public static final String JSON_PROPERTY_ADJ_HOLDING = "adjHolding";
  private Double adjHolding;

  public static final String JSON_PROPERTY_ADJ_MARKET_VALUE = "adjMarketValue";
  private Double adjMarketValue;

  public static final String JSON_PROPERTY_WEIGHT_CLOSE = "weightClose";
  private Double weightClose;

  public static final String JSON_PROPERTY_PERCENT_OUTSTANDING = "percentOutstanding";
  private Double percentOutstanding;

  public static final String JSON_PROPERTY_SOURCE = "source";
  private String source;

  public static final String JSON_PROPERTY_REQUEST_ID = "requestId";
  private String requestId;

  public SecurityHolders() { 
  }

  public SecurityHolders holderId(String holderId) {
    this.holderId = holderId;
    return this;
  }

   /**
   * FactSet Ownership Holders ID that corresponds to the requested security holder.
   * @return holderId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "M4004630", value = "FactSet Ownership Holders ID that corresponds to the requested security holder.")
  @JsonProperty(JSON_PROPERTY_HOLDER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getHolderId() {
    return holderId;
  }


  @JsonProperty(JSON_PROPERTY_HOLDER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHolderId(String holderId) {
    this.holderId = holderId;
  }


  public SecurityHolders fsymId(String fsymId) {
    this.fsymId = fsymId;
    return this;
  }

   /**
   * FactSet Security Identifier of security requested. This does not represent the FactSet permanent identifier for the holder, but rather the requested id. Six alpha-numeric characters, excluding vowels, with an -S suffix (XXXXXX-S). All equity and fixed income securities that exist on FactSet are allocated a security-level permanent identifier.
   * @return fsymId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SQFMK3-R", value = "FactSet Security Identifier of security requested. This does not represent the FactSet permanent identifier for the holder, but rather the requested id. Six alpha-numeric characters, excluding vowels, with an -S suffix (XXXXXX-S). All equity and fixed income securities that exist on FactSet are allocated a security-level permanent identifier.")
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


  public SecurityHolders holderEntityId(String holderEntityId) {
    this.holderEntityId = holderEntityId;
    return this;
  }

   /**
   * FactSet Entity ID that corresponds to the specified holder ID.
   * @return holderEntityId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "07JGQN-E", value = "FactSet Entity ID that corresponds to the specified holder ID.")
  @JsonProperty(JSON_PROPERTY_HOLDER_ENTITY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getHolderEntityId() {
    return holderEntityId;
  }


  @JsonProperty(JSON_PROPERTY_HOLDER_ENTITY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHolderEntityId(String holderEntityId) {
    this.holderEntityId = holderEntityId;
  }


  public SecurityHolders holderName(String holderName) {
    this.holderName = holderName;
    return this;
  }

   /**
   * Name of the holder for the requested security identifier.
   * @return holderName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Vanguard Total Stock Market Index Fund", value = "Name of the holder for the requested security identifier.")
  @JsonProperty(JSON_PROPERTY_HOLDER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getHolderName() {
    return holderName;
  }


  @JsonProperty(JSON_PROPERTY_HOLDER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHolderName(String holderName) {
    this.holderName = holderName;
  }


  public SecurityHolders date(LocalDate date) {
    this.date = date;
    return this;
  }

   /**
   * Date of the reported holding in YYYY-MM-DD format. For more details regarding date resolution, visit [Online Assistant Page #11262](https://oa.apps.factset.com/pages/11262).
   * @return date
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Tue Jun 30 00:00:00 UTC 2020", value = "Date of the reported holding in YYYY-MM-DD format. For more details regarding date resolution, visit [Online Assistant Page #11262](https://oa.apps.factset.com/pages/11262).")
  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LocalDate getDate() {
    return date;
  }


  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDate(LocalDate date) {
    this.date = date;
  }


  public SecurityHolders currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Currency code. The service will default to the local currency if the currency is not requested. For a list of currency ISO codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470).
   * @return currency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "USD", value = "Currency code. The service will default to the local currency if the currency is not requested. For a list of currency ISO codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470).")
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


  public SecurityHolders investorType(String investorType) {
    this.investorType = investorType;
    return this;
  }

   /**
   * FactSet Ownership Institution, Mutual Fund, and Insider/Stakeholder investor types. To learn more about the different investor types, visit [Online Assistant Page #11656](https://my.apps.factset.com/oa/pages/11656).
   * @return investorType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Open-End Fund", value = "FactSet Ownership Institution, Mutual Fund, and Insider/Stakeholder investor types. To learn more about the different investor types, visit [Online Assistant Page #11656](https://my.apps.factset.com/oa/pages/11656).")
  @JsonProperty(JSON_PROPERTY_INVESTOR_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getInvestorType() {
    return investorType;
  }


  @JsonProperty(JSON_PROPERTY_INVESTOR_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInvestorType(String investorType) {
    this.investorType = investorType;
  }


  public SecurityHolders holderType(String holderType) {
    this.holderType = holderType;
    return this;
  }

   /**
   * Holder Type name of the respective holder object. The name will align to the holderType requested. 
   * @return holderType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Mutual Fund", value = "Holder Type name of the respective holder object. The name will align to the holderType requested. ")
  @JsonProperty(JSON_PROPERTY_HOLDER_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getHolderType() {
    return holderType;
  }


  @JsonProperty(JSON_PROPERTY_HOLDER_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHolderType(String holderType) {
    this.holderType = holderType;
  }


  public SecurityHolders adjHolding(Double adjHolding) {
    this.adjHolding = adjHolding;
    return this;
  }

   /**
   * Adjusted number of shares held. All positions and prices are adjusted for splits and name changes, but they are not adjusted for spinoffs or mergers. If a given company announces a split today, FactSet&#39;s Ownership data will reflect that split either tomorrow or the day after, depending upon the time in which the FactSet Symbology team makes record of the change. For more details, visit [Online Assistant Page #11262](https://oa.apps.factset.com/pages/11262).
   * @return adjHolding
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1066876", value = "Adjusted number of shares held. All positions and prices are adjusted for splits and name changes, but they are not adjusted for spinoffs or mergers. If a given company announces a split today, FactSet's Ownership data will reflect that split either tomorrow or the day after, depending upon the time in which the FactSet Symbology team makes record of the change. For more details, visit [Online Assistant Page #11262](https://oa.apps.factset.com/pages/11262).")
  @JsonProperty(JSON_PROPERTY_ADJ_HOLDING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getAdjHolding() {
    return adjHolding;
  }


  @JsonProperty(JSON_PROPERTY_ADJ_HOLDING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdjHolding(Double adjHolding) {
    this.adjHolding = adjHolding;
  }


  public SecurityHolders adjMarketValue(Double adjMarketValue) {
    this.adjMarketValue = adjMarketValue;
    return this;
  }

   /**
   * Adjusted market values of shares held. Market Value. All positions and prices are adjusted for splits and name changes, but they are not adjusted for spinoffs or mergers. If a given company announces a split today, FactSet&#39;s Ownership data will reflect that split either tomorrow or the day after, depending upon the time in which the FactSet Symbology team makes record of the change. For more details, visit [Online Assistant Page #11262](https://oa.apps.factset.com/pages/11262).
   * @return adjMarketValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "373833350.4", value = "Adjusted market values of shares held. Market Value. All positions and prices are adjusted for splits and name changes, but they are not adjusted for spinoffs or mergers. If a given company announces a split today, FactSet's Ownership data will reflect that split either tomorrow or the day after, depending upon the time in which the FactSet Symbology team makes record of the change. For more details, visit [Online Assistant Page #11262](https://oa.apps.factset.com/pages/11262).")
  @JsonProperty(JSON_PROPERTY_ADJ_MARKET_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getAdjMarketValue() {
    return adjMarketValue;
  }


  @JsonProperty(JSON_PROPERTY_ADJ_MARKET_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdjMarketValue(Double adjMarketValue) {
    this.adjMarketValue = adjMarketValue;
  }


  public SecurityHolders weightClose(Double weightClose) {
    this.weightClose = weightClose;
    return this;
  }

   /**
   * \&quot;Closing weight of the security for the holders of the requested security (percent). To learn more about how ownership weight is calculated please visit [Online Assistant Page #11247](https://my.apps.factset.com/oa/pages/11247).\&quot; 
   * @return weightClose
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0.0356", value = "\"Closing weight of the security for the holders of the requested security (percent). To learn more about how ownership weight is calculated please visit [Online Assistant Page #11247](https://my.apps.factset.com/oa/pages/11247).\" ")
  @JsonProperty(JSON_PROPERTY_WEIGHT_CLOSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getWeightClose() {
    return weightClose;
  }


  @JsonProperty(JSON_PROPERTY_WEIGHT_CLOSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWeightClose(Double weightClose) {
    this.weightClose = weightClose;
  }


  public SecurityHolders percentOutstanding(Double percentOutstanding) {
    this.percentOutstanding = percentOutstanding;
    return this;
  }

   /**
   * The percent of the outstanding common shares held by a particular filing institution. To learn more, visit [Online Assistant Page #11041](https://my.apps.factset.com/oa/pages/11041).
   * @return percentOutstanding
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2.808", value = "The percent of the outstanding common shares held by a particular filing institution. To learn more, visit [Online Assistant Page #11041](https://my.apps.factset.com/oa/pages/11041).")
  @JsonProperty(JSON_PROPERTY_PERCENT_OUTSTANDING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getPercentOutstanding() {
    return percentOutstanding;
  }


  @JsonProperty(JSON_PROPERTY_PERCENT_OUTSTANDING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPercentOutstanding(Double percentOutstanding) {
    this.percentOutstanding = percentOutstanding;
  }


  public SecurityHolders source(String source) {
    this.source = source;
    return this;
  }

   /**
   * Either the 13F Form or ND-30D report filed where the security holdings data was sourced from. To learn more about source, please visit https://my.apps.factset.com/oa/pages/11260
   * @return source
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "US Fund (N-30D)", value = "Either the 13F Form or ND-30D report filed where the security holdings data was sourced from. To learn more about source, please visit https://my.apps.factset.com/oa/pages/11260")
  @JsonProperty(JSON_PROPERTY_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSource() {
    return source;
  }


  @JsonProperty(JSON_PROPERTY_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSource(String source) {
    this.source = source;
  }


  public SecurityHolders requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

   /**
   * Security Identifier that was used in the request. 
   * @return requestId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "FDS-US", value = "Security Identifier that was used in the request. ")
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
   * Return true if this securityHolders object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityHolders securityHolders = (SecurityHolders) o;
    return Objects.equals(this.holderId, securityHolders.holderId) &&
        Objects.equals(this.fsymId, securityHolders.fsymId) &&
        Objects.equals(this.holderEntityId, securityHolders.holderEntityId) &&
        Objects.equals(this.holderName, securityHolders.holderName) &&
        Objects.equals(this.date, securityHolders.date) &&
        Objects.equals(this.currency, securityHolders.currency) &&
        Objects.equals(this.investorType, securityHolders.investorType) &&
        Objects.equals(this.holderType, securityHolders.holderType) &&
        Objects.equals(this.adjHolding, securityHolders.adjHolding) &&
        Objects.equals(this.adjMarketValue, securityHolders.adjMarketValue) &&
        Objects.equals(this.weightClose, securityHolders.weightClose) &&
        Objects.equals(this.percentOutstanding, securityHolders.percentOutstanding) &&
        Objects.equals(this.source, securityHolders.source) &&
        Objects.equals(this.requestId, securityHolders.requestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(holderId, fsymId, holderEntityId, holderName, date, currency, investorType, holderType, adjHolding, adjMarketValue, weightClose, percentOutstanding, source, requestId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityHolders {\n");
    sb.append("    holderId: ").append(toIndentedString(holderId)).append("\n");
    sb.append("    fsymId: ").append(toIndentedString(fsymId)).append("\n");
    sb.append("    holderEntityId: ").append(toIndentedString(holderEntityId)).append("\n");
    sb.append("    holderName: ").append(toIndentedString(holderName)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    investorType: ").append(toIndentedString(investorType)).append("\n");
    sb.append("    holderType: ").append(toIndentedString(holderType)).append("\n");
    sb.append("    adjHolding: ").append(toIndentedString(adjHolding)).append("\n");
    sb.append("    adjMarketValue: ").append(toIndentedString(adjMarketValue)).append("\n");
    sb.append("    weightClose: ").append(toIndentedString(weightClose)).append("\n");
    sb.append("    percentOutstanding: ").append(toIndentedString(percentOutstanding)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
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

