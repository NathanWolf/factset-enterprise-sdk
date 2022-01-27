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
import com.factset.sdk.QuotesAPIforDigitalPortals.models.InlineResponse20062DataTargetMarketKnowledgeAndExperienceGermany;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.QuotesAPIforDigitalPortals.JSON;


/**
 * Describes the level of knowledge and experience an investor should have in order to acquire the investment product.
 */
@ApiModel(description = "Describes the level of knowledge and experience an investor should have in order to acquire the investment product.")
@JsonPropertyOrder({
  InlineResponse20062DataTargetMarketKnowledgeAndExperience.JSON_PROPERTY_BASIC_INVESTOR,
  InlineResponse20062DataTargetMarketKnowledgeAndExperience.JSON_PROPERTY_INFORMED_INVESTOR,
  InlineResponse20062DataTargetMarketKnowledgeAndExperience.JSON_PROPERTY_ADVANCED_INVESTOR,
  InlineResponse20062DataTargetMarketKnowledgeAndExperience.JSON_PROPERTY_GERMANY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse20062DataTargetMarketKnowledgeAndExperience implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Indicates whether the investment product is suitable for investors having basic knowledge and experience. Basic knowledge and experience means that the investor can make an informed investment decision based on the regulated and authorized offering documentation or with the help of basic information provided by the point of sale or the investor has no financial industry experience, i.e. the investment product is suitable for a first-time investor
   */
  public enum BasicInvestorEnum {
    YES("yes"),
    
    NO("no"),
    
    NEUTRAL("neutral"),
    
    FEEDBACK("feedback");

    private String value;

    BasicInvestorEnum(String value) {
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
    public static BasicInvestorEnum fromValue(String value) {
      for (BasicInvestorEnum b : BasicInvestorEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_BASIC_INVESTOR = "basicInvestor";
  private BasicInvestorEnum basicInvestor;

  /**
   * Indicates whether the investment product is suitable for investors with an informed level of knowledge and experience. Informed investors have the ability to understand the particular financial instrument. Additionally, the investor must have a number of investment holdings in relevant financial instruments or must be involved in frequent trading activity in those.
   */
  public enum InformedInvestorEnum {
    YES("yes"),
    
    NO("no"),
    
    NEUTRAL("neutral"),
    
    FEEDBACK("feedback");

    private String value;

    InformedInvestorEnum(String value) {
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
    public static InformedInvestorEnum fromValue(String value) {
      for (InformedInvestorEnum b : InformedInvestorEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_INFORMED_INVESTOR = "informedInvestor";
  private InformedInvestorEnum informedInvestor;

  /**
   * Indicates whether the investment product is suitable for investors with an advanced level of knowledge and experience. An advanced investor has comprehensive understanding of relevant financial instruments. Additionally, the investor must have a large number of diverse investment holdings in relevant financial instruments; must be involved in frequent trading activity in those, must have had previous exposure to high-risk or complex investments or must have relevant financial industry experience.
   */
  public enum AdvancedInvestorEnum {
    YES("yes"),
    
    NO("no"),
    
    NEUTRAL("neutral"),
    
    FEEDBACK("feedback");

    private String value;

    AdvancedInvestorEnum(String value) {
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
    public static AdvancedInvestorEnum fromValue(String value) {
      for (AdvancedInvestorEnum b : AdvancedInvestorEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_ADVANCED_INVESTOR = "advancedInvestor";
  private AdvancedInvestorEnum advancedInvestor;

  public static final String JSON_PROPERTY_GERMANY = "germany";
  private InlineResponse20062DataTargetMarketKnowledgeAndExperienceGermany germany;


  public InlineResponse20062DataTargetMarketKnowledgeAndExperience basicInvestor(BasicInvestorEnum basicInvestor) {
    this.basicInvestor = basicInvestor;
    return this;
  }

   /**
   * Indicates whether the investment product is suitable for investors having basic knowledge and experience. Basic knowledge and experience means that the investor can make an informed investment decision based on the regulated and authorized offering documentation or with the help of basic information provided by the point of sale or the investor has no financial industry experience, i.e. the investment product is suitable for a first-time investor
   * @return basicInvestor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether the investment product is suitable for investors having basic knowledge and experience. Basic knowledge and experience means that the investor can make an informed investment decision based on the regulated and authorized offering documentation or with the help of basic information provided by the point of sale or the investor has no financial industry experience, i.e. the investment product is suitable for a first-time investor")
  @JsonProperty(JSON_PROPERTY_BASIC_INVESTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BasicInvestorEnum getBasicInvestor() {
    return basicInvestor;
  }


  @JsonProperty(JSON_PROPERTY_BASIC_INVESTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBasicInvestor(BasicInvestorEnum basicInvestor) {
    this.basicInvestor = basicInvestor;
  }


  public InlineResponse20062DataTargetMarketKnowledgeAndExperience informedInvestor(InformedInvestorEnum informedInvestor) {
    this.informedInvestor = informedInvestor;
    return this;
  }

   /**
   * Indicates whether the investment product is suitable for investors with an informed level of knowledge and experience. Informed investors have the ability to understand the particular financial instrument. Additionally, the investor must have a number of investment holdings in relevant financial instruments or must be involved in frequent trading activity in those.
   * @return informedInvestor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether the investment product is suitable for investors with an informed level of knowledge and experience. Informed investors have the ability to understand the particular financial instrument. Additionally, the investor must have a number of investment holdings in relevant financial instruments or must be involved in frequent trading activity in those.")
  @JsonProperty(JSON_PROPERTY_INFORMED_INVESTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InformedInvestorEnum getInformedInvestor() {
    return informedInvestor;
  }


  @JsonProperty(JSON_PROPERTY_INFORMED_INVESTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInformedInvestor(InformedInvestorEnum informedInvestor) {
    this.informedInvestor = informedInvestor;
  }


  public InlineResponse20062DataTargetMarketKnowledgeAndExperience advancedInvestor(AdvancedInvestorEnum advancedInvestor) {
    this.advancedInvestor = advancedInvestor;
    return this;
  }

   /**
   * Indicates whether the investment product is suitable for investors with an advanced level of knowledge and experience. An advanced investor has comprehensive understanding of relevant financial instruments. Additionally, the investor must have a large number of diverse investment holdings in relevant financial instruments; must be involved in frequent trading activity in those, must have had previous exposure to high-risk or complex investments or must have relevant financial industry experience.
   * @return advancedInvestor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether the investment product is suitable for investors with an advanced level of knowledge and experience. An advanced investor has comprehensive understanding of relevant financial instruments. Additionally, the investor must have a large number of diverse investment holdings in relevant financial instruments; must be involved in frequent trading activity in those, must have had previous exposure to high-risk or complex investments or must have relevant financial industry experience.")
  @JsonProperty(JSON_PROPERTY_ADVANCED_INVESTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AdvancedInvestorEnum getAdvancedInvestor() {
    return advancedInvestor;
  }


  @JsonProperty(JSON_PROPERTY_ADVANCED_INVESTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdvancedInvestor(AdvancedInvestorEnum advancedInvestor) {
    this.advancedInvestor = advancedInvestor;
  }


  public InlineResponse20062DataTargetMarketKnowledgeAndExperience germany(InlineResponse20062DataTargetMarketKnowledgeAndExperienceGermany germany) {
    this.germany = germany;
    return this;
  }

   /**
   * Get germany
   * @return germany
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_GERMANY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse20062DataTargetMarketKnowledgeAndExperienceGermany getGermany() {
    return germany;
  }


  @JsonProperty(JSON_PROPERTY_GERMANY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGermany(InlineResponse20062DataTargetMarketKnowledgeAndExperienceGermany germany) {
    this.germany = germany;
  }


  /**
   * Return true if this inline_response_200_62_data_targetMarket_knowledgeAndExperience object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20062DataTargetMarketKnowledgeAndExperience inlineResponse20062DataTargetMarketKnowledgeAndExperience = (InlineResponse20062DataTargetMarketKnowledgeAndExperience) o;
    return Objects.equals(this.basicInvestor, inlineResponse20062DataTargetMarketKnowledgeAndExperience.basicInvestor) &&
        Objects.equals(this.informedInvestor, inlineResponse20062DataTargetMarketKnowledgeAndExperience.informedInvestor) &&
        Objects.equals(this.advancedInvestor, inlineResponse20062DataTargetMarketKnowledgeAndExperience.advancedInvestor) &&
        Objects.equals(this.germany, inlineResponse20062DataTargetMarketKnowledgeAndExperience.germany);
  }

  @Override
  public int hashCode() {
    return Objects.hash(basicInvestor, informedInvestor, advancedInvestor, germany);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20062DataTargetMarketKnowledgeAndExperience {\n");
    sb.append("    basicInvestor: ").append(toIndentedString(basicInvestor)).append("\n");
    sb.append("    informedInvestor: ").append(toIndentedString(informedInvestor)).append("\n");
    sb.append("    advancedInvestor: ").append(toIndentedString(advancedInvestor)).append("\n");
    sb.append("    germany: ").append(toIndentedString(germany)).append("\n");
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

