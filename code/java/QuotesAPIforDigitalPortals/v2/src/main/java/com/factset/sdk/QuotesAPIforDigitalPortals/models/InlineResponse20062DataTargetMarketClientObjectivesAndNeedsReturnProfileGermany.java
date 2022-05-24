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
 * Specific indicators for Germany.
 */
@ApiModel(description = "Specific indicators for Germany.")
@JsonPropertyOrder({
  InlineResponse20062DataTargetMarketClientObjectivesAndNeedsReturnProfileGermany.JSON_PROPERTY_PENSION_SCHEME
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse20062DataTargetMarketClientObjectivesAndNeedsReturnProfileGermany implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Indicates whether the investment product is suitable for investors with the return profile \&quot;pension scheme\&quot;. This regulatory requirement is available only in Germany (\&quot;Riester Rente\&quot;).
   */
  public enum PensionSchemeEnum {
    YES("yes"),
    
    NO("no"),
    
    NEUTRAL("neutral"),
    
    FEEDBACK("feedback");

    private String value;

    PensionSchemeEnum(String value) {
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
    public static PensionSchemeEnum fromValue(String value) {
      for (PensionSchemeEnum b : PensionSchemeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_PENSION_SCHEME = "pensionScheme";
  private PensionSchemeEnum pensionScheme;

  public InlineResponse20062DataTargetMarketClientObjectivesAndNeedsReturnProfileGermany() { 
  }

  public InlineResponse20062DataTargetMarketClientObjectivesAndNeedsReturnProfileGermany pensionScheme(PensionSchemeEnum pensionScheme) {
    this.pensionScheme = pensionScheme;
    return this;
  }

   /**
   * Indicates whether the investment product is suitable for investors with the return profile \&quot;pension scheme\&quot;. This regulatory requirement is available only in Germany (\&quot;Riester Rente\&quot;).
   * @return pensionScheme
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether the investment product is suitable for investors with the return profile \"pension scheme\". This regulatory requirement is available only in Germany (\"Riester Rente\").")
  @JsonProperty(JSON_PROPERTY_PENSION_SCHEME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PensionSchemeEnum getPensionScheme() {
    return pensionScheme;
  }


  @JsonProperty(JSON_PROPERTY_PENSION_SCHEME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPensionScheme(PensionSchemeEnum pensionScheme) {
    this.pensionScheme = pensionScheme;
  }


  /**
   * Return true if this inline_response_200_62_data_targetMarket_clientObjectivesAndNeeds_returnProfile_germany object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20062DataTargetMarketClientObjectivesAndNeedsReturnProfileGermany inlineResponse20062DataTargetMarketClientObjectivesAndNeedsReturnProfileGermany = (InlineResponse20062DataTargetMarketClientObjectivesAndNeedsReturnProfileGermany) o;
    return Objects.equals(this.pensionScheme, inlineResponse20062DataTargetMarketClientObjectivesAndNeedsReturnProfileGermany.pensionScheme);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pensionScheme);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20062DataTargetMarketClientObjectivesAndNeedsReturnProfileGermany {\n");
    sb.append("    pensionScheme: ").append(toIndentedString(pensionScheme)).append("\n");
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

