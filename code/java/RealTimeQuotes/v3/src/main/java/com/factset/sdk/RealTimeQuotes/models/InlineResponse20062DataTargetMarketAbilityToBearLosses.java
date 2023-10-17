/*
 * Quotes API For Digital Portals
 * The Quotes API combines endpoints for retrieving security end-of-day, delayed, and realtime prices with performance key figures and basic reference data on the security and market level.  The API supports over 20 different price types for each quote and comes with basic search endpoints based on security identifiers and instrument names. Market coverage is included in the *Sample Use Cases* section below.  The Digital Portal use case is focused on high-performance applications that are  * serving millions of end-users, * accessible by client browsers via the internet, * supporting subscriptions for streamed updates out-of-the-box, * typically combining a wide variety of *for Digital Portals*-APIs into a highly use-case specific solution for customers, * integrated into complex infrastructures such as existing frontend frameworks, authentication services.  All APIs labelled *for Digital Portals* have been designed for direct use by client web applications and feature extreme low latency: The average response time across all endpoints is 30 ms whereas 99% of all requests are answered in close to under 300ms.  See the [Time Series API for Digital Portals](https://developer.factset.com/api-catalog/time-series-api-digital-portals) for direct access to price histories, and the [News API for Digital Portals](https://developer.factset.com/api-catalog/news-api-digital-portals) for searching and fetching related news. 
 *
 * The version of the OpenAPI document: 3.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.RealTimeQuotes.models;

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
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.RealTimeQuotes.JSON;


/**
 * Describes the potential loss associated with the investment product an investor shall be willing to accept.
 */
@ApiModel(description = "Describes the potential loss associated with the investment product an investor shall be willing to accept.")
@JsonPropertyOrder({
  InlineResponse20062DataTargetMarketAbilityToBearLosses.JSON_PROPERTY_NO_CAPITAL_LOSS,
  InlineResponse20062DataTargetMarketAbilityToBearLosses.JSON_PROPERTY_LIMITED_CAPITAL_LOSS,
  InlineResponse20062DataTargetMarketAbilityToBearLosses.JSON_PROPERTY_NO_CAPITAL_GUARANTEE,
  InlineResponse20062DataTargetMarketAbilityToBearLosses.JSON_PROPERTY_LOSS_BEYOND_CAPITAL,
  InlineResponse20062DataTargetMarketAbilityToBearLosses.JSON_PROPERTY_MAXIMUM_CAPITAL_LOSS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse20062DataTargetMarketAbilityToBearLosses implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Indicates whether the investment product is suitable for investors not able to bear capital loss. Minor loss e.g. due to costs is possible.
   */
  public enum NoCapitalLossEnum {
    YES("yes"),
    
    NO("no"),
    
    NEUTRAL("neutral"),
    
    FEEDBACK("feedback");

    private String value;

    NoCapitalLossEnum(String value) {
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
    public static NoCapitalLossEnum fromValue(String value) {
      for (NoCapitalLossEnum b : NoCapitalLossEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  public static final String JSON_PROPERTY_NO_CAPITAL_LOSS = "noCapitalLoss";
  private JsonNullable<NoCapitalLossEnum> noCapitalLoss = JsonNullable.<NoCapitalLossEnum>undefined();

  /**
   * Indicates whether the investment product is suitable for investors able to bear limited capital loss.
   */
  public enum LimitedCapitalLossEnum {
    YES("yes"),
    
    NO("no"),
    
    NEUTRAL("neutral"),
    
    FEEDBACK("feedback");

    private String value;

    LimitedCapitalLossEnum(String value) {
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
    public static LimitedCapitalLossEnum fromValue(String value) {
      for (LimitedCapitalLossEnum b : LimitedCapitalLossEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  public static final String JSON_PROPERTY_LIMITED_CAPITAL_LOSS = "limitedCapitalLoss";
  private JsonNullable<LimitedCapitalLossEnum> limitedCapitalLoss = JsonNullable.<LimitedCapitalLossEnum>undefined();

  /**
   * Indicates whether the investment product is suitable for investors able to bear total capital loss.
   */
  public enum NoCapitalGuaranteeEnum {
    YES("yes"),
    
    NO("no"),
    
    NEUTRAL("neutral"),
    
    FEEDBACK("feedback");

    private String value;

    NoCapitalGuaranteeEnum(String value) {
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
    public static NoCapitalGuaranteeEnum fromValue(String value) {
      for (NoCapitalGuaranteeEnum b : NoCapitalGuaranteeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  public static final String JSON_PROPERTY_NO_CAPITAL_GUARANTEE = "noCapitalGuarantee";
  private JsonNullable<NoCapitalGuaranteeEnum> noCapitalGuarantee = JsonNullable.<NoCapitalGuaranteeEnum>undefined();

  /**
   * Indicates whether the investment product is suitable for investors able to bear loss beyond the invested capital.
   */
  public enum LossBeyondCapitalEnum {
    YES("yes"),
    
    NO("no"),
    
    NEUTRAL("neutral"),
    
    FEEDBACK("feedback");

    private String value;

    LossBeyondCapitalEnum(String value) {
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
    public static LossBeyondCapitalEnum fromValue(String value) {
      for (LossBeyondCapitalEnum b : LossBeyondCapitalEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  public static final String JSON_PROPERTY_LOSS_BEYOND_CAPITAL = "lossBeyondCapital";
  private JsonNullable<LossBeyondCapitalEnum> lossBeyondCapital = JsonNullable.<LossBeyondCapitalEnum>undefined();

  public static final String JSON_PROPERTY_MAXIMUM_CAPITAL_LOSS = "maximumCapitalLoss";
  private JsonNullable<BigDecimal> maximumCapitalLoss = JsonNullable.<BigDecimal>undefined();

  public InlineResponse20062DataTargetMarketAbilityToBearLosses() { 
  }

  public InlineResponse20062DataTargetMarketAbilityToBearLosses noCapitalLoss(NoCapitalLossEnum noCapitalLoss) {
    this.noCapitalLoss = JsonNullable.<NoCapitalLossEnum>of(noCapitalLoss);
    return this;
  }

   /**
   * Indicates whether the investment product is suitable for investors not able to bear capital loss. Minor loss e.g. due to costs is possible.
   * @return noCapitalLoss
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether the investment product is suitable for investors not able to bear capital loss. Minor loss e.g. due to costs is possible.")
  @JsonIgnore

  public NoCapitalLossEnum getNoCapitalLoss() {
        return noCapitalLoss.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NO_CAPITAL_LOSS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<NoCapitalLossEnum> getNoCapitalLoss_JsonNullable() {
    return noCapitalLoss;
  }
  
  @JsonProperty(JSON_PROPERTY_NO_CAPITAL_LOSS)
  public void setNoCapitalLoss_JsonNullable(JsonNullable<NoCapitalLossEnum> noCapitalLoss) {
    this.noCapitalLoss = noCapitalLoss;
  }

  public void setNoCapitalLoss(NoCapitalLossEnum noCapitalLoss) {
    this.noCapitalLoss = JsonNullable.<NoCapitalLossEnum>of(noCapitalLoss);
  }


  public InlineResponse20062DataTargetMarketAbilityToBearLosses limitedCapitalLoss(LimitedCapitalLossEnum limitedCapitalLoss) {
    this.limitedCapitalLoss = JsonNullable.<LimitedCapitalLossEnum>of(limitedCapitalLoss);
    return this;
  }

   /**
   * Indicates whether the investment product is suitable for investors able to bear limited capital loss.
   * @return limitedCapitalLoss
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether the investment product is suitable for investors able to bear limited capital loss.")
  @JsonIgnore

  public LimitedCapitalLossEnum getLimitedCapitalLoss() {
        return limitedCapitalLoss.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LIMITED_CAPITAL_LOSS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<LimitedCapitalLossEnum> getLimitedCapitalLoss_JsonNullable() {
    return limitedCapitalLoss;
  }
  
  @JsonProperty(JSON_PROPERTY_LIMITED_CAPITAL_LOSS)
  public void setLimitedCapitalLoss_JsonNullable(JsonNullable<LimitedCapitalLossEnum> limitedCapitalLoss) {
    this.limitedCapitalLoss = limitedCapitalLoss;
  }

  public void setLimitedCapitalLoss(LimitedCapitalLossEnum limitedCapitalLoss) {
    this.limitedCapitalLoss = JsonNullable.<LimitedCapitalLossEnum>of(limitedCapitalLoss);
  }


  public InlineResponse20062DataTargetMarketAbilityToBearLosses noCapitalGuarantee(NoCapitalGuaranteeEnum noCapitalGuarantee) {
    this.noCapitalGuarantee = JsonNullable.<NoCapitalGuaranteeEnum>of(noCapitalGuarantee);
    return this;
  }

   /**
   * Indicates whether the investment product is suitable for investors able to bear total capital loss.
   * @return noCapitalGuarantee
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether the investment product is suitable for investors able to bear total capital loss.")
  @JsonIgnore

  public NoCapitalGuaranteeEnum getNoCapitalGuarantee() {
        return noCapitalGuarantee.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NO_CAPITAL_GUARANTEE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<NoCapitalGuaranteeEnum> getNoCapitalGuarantee_JsonNullable() {
    return noCapitalGuarantee;
  }
  
  @JsonProperty(JSON_PROPERTY_NO_CAPITAL_GUARANTEE)
  public void setNoCapitalGuarantee_JsonNullable(JsonNullable<NoCapitalGuaranteeEnum> noCapitalGuarantee) {
    this.noCapitalGuarantee = noCapitalGuarantee;
  }

  public void setNoCapitalGuarantee(NoCapitalGuaranteeEnum noCapitalGuarantee) {
    this.noCapitalGuarantee = JsonNullable.<NoCapitalGuaranteeEnum>of(noCapitalGuarantee);
  }


  public InlineResponse20062DataTargetMarketAbilityToBearLosses lossBeyondCapital(LossBeyondCapitalEnum lossBeyondCapital) {
    this.lossBeyondCapital = JsonNullable.<LossBeyondCapitalEnum>of(lossBeyondCapital);
    return this;
  }

   /**
   * Indicates whether the investment product is suitable for investors able to bear loss beyond the invested capital.
   * @return lossBeyondCapital
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates whether the investment product is suitable for investors able to bear loss beyond the invested capital.")
  @JsonIgnore

  public LossBeyondCapitalEnum getLossBeyondCapital() {
        return lossBeyondCapital.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LOSS_BEYOND_CAPITAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<LossBeyondCapitalEnum> getLossBeyondCapital_JsonNullable() {
    return lossBeyondCapital;
  }
  
  @JsonProperty(JSON_PROPERTY_LOSS_BEYOND_CAPITAL)
  public void setLossBeyondCapital_JsonNullable(JsonNullable<LossBeyondCapitalEnum> lossBeyondCapital) {
    this.lossBeyondCapital = lossBeyondCapital;
  }

  public void setLossBeyondCapital(LossBeyondCapitalEnum lossBeyondCapital) {
    this.lossBeyondCapital = JsonNullable.<LossBeyondCapitalEnum>of(lossBeyondCapital);
  }


  public InlineResponse20062DataTargetMarketAbilityToBearLosses maximumCapitalLoss(BigDecimal maximumCapitalLoss) {
    this.maximumCapitalLoss = JsonNullable.<BigDecimal>of(maximumCapitalLoss);
    return this;
  }

   /**
   * Maximum loss of the invested capital assumed the investment product is held until maturity.
   * @return maximumCapitalLoss
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Maximum loss of the invested capital assumed the investment product is held until maturity.")
  @JsonIgnore

  public BigDecimal getMaximumCapitalLoss() {
        return maximumCapitalLoss.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MAXIMUM_CAPITAL_LOSS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<BigDecimal> getMaximumCapitalLoss_JsonNullable() {
    return maximumCapitalLoss;
  }
  
  @JsonProperty(JSON_PROPERTY_MAXIMUM_CAPITAL_LOSS)
  public void setMaximumCapitalLoss_JsonNullable(JsonNullable<BigDecimal> maximumCapitalLoss) {
    this.maximumCapitalLoss = maximumCapitalLoss;
  }

  public void setMaximumCapitalLoss(BigDecimal maximumCapitalLoss) {
    this.maximumCapitalLoss = JsonNullable.<BigDecimal>of(maximumCapitalLoss);
  }


  /**
   * Return true if this inline_response_200_62_data_targetMarket_abilityToBearLosses object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20062DataTargetMarketAbilityToBearLosses inlineResponse20062DataTargetMarketAbilityToBearLosses = (InlineResponse20062DataTargetMarketAbilityToBearLosses) o;
    return equalsNullable(this.noCapitalLoss, inlineResponse20062DataTargetMarketAbilityToBearLosses.noCapitalLoss) &&
        equalsNullable(this.limitedCapitalLoss, inlineResponse20062DataTargetMarketAbilityToBearLosses.limitedCapitalLoss) &&
        equalsNullable(this.noCapitalGuarantee, inlineResponse20062DataTargetMarketAbilityToBearLosses.noCapitalGuarantee) &&
        equalsNullable(this.lossBeyondCapital, inlineResponse20062DataTargetMarketAbilityToBearLosses.lossBeyondCapital) &&
        equalsNullable(this.maximumCapitalLoss, inlineResponse20062DataTargetMarketAbilityToBearLosses.maximumCapitalLoss);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(noCapitalLoss), hashCodeNullable(limitedCapitalLoss), hashCodeNullable(noCapitalGuarantee), hashCodeNullable(lossBeyondCapital), hashCodeNullable(maximumCapitalLoss));
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
    sb.append("class InlineResponse20062DataTargetMarketAbilityToBearLosses {\n");
    sb.append("    noCapitalLoss: ").append(toIndentedString(noCapitalLoss)).append("\n");
    sb.append("    limitedCapitalLoss: ").append(toIndentedString(limitedCapitalLoss)).append("\n");
    sb.append("    noCapitalGuarantee: ").append(toIndentedString(noCapitalGuarantee)).append("\n");
    sb.append("    lossBeyondCapital: ").append(toIndentedString(lossBeyondCapital)).append("\n");
    sb.append("    maximumCapitalLoss: ").append(toIndentedString(maximumCapitalLoss)).append("\n");
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

