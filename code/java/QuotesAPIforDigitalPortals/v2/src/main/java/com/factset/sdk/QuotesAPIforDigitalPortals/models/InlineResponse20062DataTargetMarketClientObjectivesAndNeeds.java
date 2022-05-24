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


package com.factset.sdk.QuotesAPIforDigitalPortals.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20062DataTargetMarketClientObjectivesAndNeedsReturnProfile;
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
import com.factset.sdk.QuotesAPIforDigitalPortals.JSON;


/**
 * Characterizes the investment product regarding its ability to serve specific investment objectives.
 */
@ApiModel(description = "Characterizes the investment product regarding its ability to serve specific investment objectives.")
@JsonPropertyOrder({
  InlineResponse20062DataTargetMarketClientObjectivesAndNeeds.JSON_PROPERTY_RETURN_PROFILE,
  InlineResponse20062DataTargetMarketClientObjectivesAndNeeds.JSON_PROPERTY_MATURITY_DATE,
  InlineResponse20062DataTargetMarketClientObjectivesAndNeeds.JSON_PROPERTY_MAY_BE_TERMINATED_EARLY,
  InlineResponse20062DataTargetMarketClientObjectivesAndNeeds.JSON_PROPERTY_SPECIFIC_INVESTMENT_NEED
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse20062DataTargetMarketClientObjectivesAndNeeds implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_RETURN_PROFILE = "returnProfile";
  private InlineResponse20062DataTargetMarketClientObjectivesAndNeedsReturnProfile returnProfile;

  public static final String JSON_PROPERTY_MATURITY_DATE = "maturityDate";
  private LocalDate maturityDate;

  /**
   * Indicates whether the investment product is unsuitable for investors not accepting financial products with potential termination prior to maturity. (That means, a \&quot;yes\&quot; value indicates that the product may not last until maturity and thus conflicts with an investor profile rejecting premature redemption.) The termination could be initiated by the issuer (callable), by the investor (puttable) or automatically due to an event, e.g. barrier breach (auto-callable).
   */
  public enum MayBeTerminatedEarlyEnum {
    YES("yes"),
    
    NO("no"),
    
    NEUTRAL("neutral"),
    
    FEEDBACK("feedback");

    private String value;

    MayBeTerminatedEarlyEnum(String value) {
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
    public static MayBeTerminatedEarlyEnum fromValue(String value) {
      for (MayBeTerminatedEarlyEnum b : MayBeTerminatedEarlyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_MAY_BE_TERMINATED_EARLY = "mayBeTerminatedEarly";
  private MayBeTerminatedEarlyEnum mayBeTerminatedEarly;

  /**
   * Gets or Sets specificInvestmentNeed
   */
  public enum SpecificInvestmentNeedEnum {
    YES("yes"),
    
    NO("no"),
    
    GREEN("green"),
    
    ETHICAL("ethical"),
    
    ISLAMIC("islamic"),
    
    ESG("esg"),
    
    OTHER("other");

    private String value;

    SpecificInvestmentNeedEnum(String value) {
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
    public static SpecificInvestmentNeedEnum fromValue(String value) {
      for (SpecificInvestmentNeedEnum b : SpecificInvestmentNeedEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_SPECIFIC_INVESTMENT_NEED = "specificInvestmentNeed";
  private java.util.List<SpecificInvestmentNeedEnum> specificInvestmentNeed = null;

  public InlineResponse20062DataTargetMarketClientObjectivesAndNeeds() { 
  }

  public InlineResponse20062DataTargetMarketClientObjectivesAndNeeds returnProfile(InlineResponse20062DataTargetMarketClientObjectivesAndNeedsReturnProfile returnProfile) {
    this.returnProfile = returnProfile;
    return this;
  }

   /**
   * Get returnProfile
   * @return returnProfile
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RETURN_PROFILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse20062DataTargetMarketClientObjectivesAndNeedsReturnProfile getReturnProfile() {
    return returnProfile;
  }


  @JsonProperty(JSON_PROPERTY_RETURN_PROFILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReturnProfile(InlineResponse20062DataTargetMarketClientObjectivesAndNeedsReturnProfile returnProfile) {
    this.returnProfile = returnProfile;
  }


  public InlineResponse20062DataTargetMarketClientObjectivesAndNeeds maturityDate(LocalDate maturityDate) {
    this.maturityDate = maturityDate;
    return this;
  }

   /**
   * Maturity date of the investment product.
   * @return maturityDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Maturity date of the investment product.")
  @JsonProperty(JSON_PROPERTY_MATURITY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LocalDate getMaturityDate() {
    return maturityDate;
  }


  @JsonProperty(JSON_PROPERTY_MATURITY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaturityDate(LocalDate maturityDate) {
    this.maturityDate = maturityDate;
  }


  public InlineResponse20062DataTargetMarketClientObjectivesAndNeeds mayBeTerminatedEarly(MayBeTerminatedEarlyEnum mayBeTerminatedEarly) {
    this.mayBeTerminatedEarly = mayBeTerminatedEarly;
    return this;
  }

   /**
   * Indicates whether the investment product is unsuitable for investors not accepting financial products with potential termination prior to maturity. (That means, a \&quot;yes\&quot; value indicates that the product may not last until maturity and thus conflicts with an investor profile rejecting premature redemption.) The termination could be initiated by the issuer (callable), by the investor (puttable) or automatically due to an event, e.g. barrier breach (auto-callable).
   * @return mayBeTerminatedEarly
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether the investment product is unsuitable for investors not accepting financial products with potential termination prior to maturity. (That means, a \"yes\" value indicates that the product may not last until maturity and thus conflicts with an investor profile rejecting premature redemption.) The termination could be initiated by the issuer (callable), by the investor (puttable) or automatically due to an event, e.g. barrier breach (auto-callable).")
  @JsonProperty(JSON_PROPERTY_MAY_BE_TERMINATED_EARLY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MayBeTerminatedEarlyEnum getMayBeTerminatedEarly() {
    return mayBeTerminatedEarly;
  }


  @JsonProperty(JSON_PROPERTY_MAY_BE_TERMINATED_EARLY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMayBeTerminatedEarly(MayBeTerminatedEarlyEnum mayBeTerminatedEarly) {
    this.mayBeTerminatedEarly = mayBeTerminatedEarly;
  }


  public InlineResponse20062DataTargetMarketClientObjectivesAndNeeds specificInvestmentNeed(java.util.List<SpecificInvestmentNeedEnum> specificInvestmentNeed) {
    this.specificInvestmentNeed = specificInvestmentNeed;
    return this;
  }

  public InlineResponse20062DataTargetMarketClientObjectivesAndNeeds addSpecificInvestmentNeedItem(SpecificInvestmentNeedEnum specificInvestmentNeedItem) {
    if (this.specificInvestmentNeed == null) {
      this.specificInvestmentNeed = new java.util.ArrayList<>();
    }
    this.specificInvestmentNeed.add(specificInvestmentNeedItem);
    return this;
  }

   /**
   * Indicates whether the investment product is suitable for investors with a specific investment need. This attribute provides either a general statement (yes or no) or a set of needs (green investment, ethical investment, islamic banking, Environmental, social and governance (ESG), other) covered by the product.
   * @return specificInvestmentNeed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether the investment product is suitable for investors with a specific investment need. This attribute provides either a general statement (yes or no) or a set of needs (green investment, ethical investment, islamic banking, Environmental, social and governance (ESG), other) covered by the product.")
  @JsonProperty(JSON_PROPERTY_SPECIFIC_INVESTMENT_NEED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.List<SpecificInvestmentNeedEnum> getSpecificInvestmentNeed() {
    return specificInvestmentNeed;
  }


  @JsonProperty(JSON_PROPERTY_SPECIFIC_INVESTMENT_NEED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSpecificInvestmentNeed(java.util.List<SpecificInvestmentNeedEnum> specificInvestmentNeed) {
    this.specificInvestmentNeed = specificInvestmentNeed;
  }


  /**
   * Return true if this inline_response_200_62_data_targetMarket_clientObjectivesAndNeeds object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20062DataTargetMarketClientObjectivesAndNeeds inlineResponse20062DataTargetMarketClientObjectivesAndNeeds = (InlineResponse20062DataTargetMarketClientObjectivesAndNeeds) o;
    return Objects.equals(this.returnProfile, inlineResponse20062DataTargetMarketClientObjectivesAndNeeds.returnProfile) &&
        Objects.equals(this.maturityDate, inlineResponse20062DataTargetMarketClientObjectivesAndNeeds.maturityDate) &&
        Objects.equals(this.mayBeTerminatedEarly, inlineResponse20062DataTargetMarketClientObjectivesAndNeeds.mayBeTerminatedEarly) &&
        Objects.equals(this.specificInvestmentNeed, inlineResponse20062DataTargetMarketClientObjectivesAndNeeds.specificInvestmentNeed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(returnProfile, maturityDate, mayBeTerminatedEarly, specificInvestmentNeed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20062DataTargetMarketClientObjectivesAndNeeds {\n");
    sb.append("    returnProfile: ").append(toIndentedString(returnProfile)).append("\n");
    sb.append("    maturityDate: ").append(toIndentedString(maturityDate)).append("\n");
    sb.append("    mayBeTerminatedEarly: ").append(toIndentedString(mayBeTerminatedEarly)).append("\n");
    sb.append("    specificInvestmentNeed: ").append(toIndentedString(specificInvestmentNeed)).append("\n");
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

