/*
 * FactSet Options API
 * The Option Prices database provides pricing data such as mid bid-ask price, reference data (e.g., strike price), and risk measures (e.g., Greeks and implied volatility). Visit [Options Overview OA Page # 14925](https://my.apps.factset.com/oa/pages/14925) for details on database coverage. U.S. exchange-traded option bid and ask quotes are continuously updated throughout the day even when no trades have occurred on the option (zero volume). The end-of-day closing bid and ask quotes are always in line with the underlying closing price.  **Note** * Currently in Beta only **OPRA** exchanges are supported. 
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.FactSetOptions.models;

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
import com.factset.sdk.FactSetOptions.JSON;


/**
 * Snapshot Response fields
 */
@ApiModel(description = "Snapshot Response fields")
@JsonPropertyOrder({
  Snapshot.JSON_PROPERTY_FSYM_ID,
  Snapshot.JSON_PROPERTY_DATE,
  Snapshot.JSON_PROPERTY_DELTA,
  Snapshot.JSON_PROPERTY_EXPIRATION_DATE,
  Snapshot.JSON_PROPERTY_IMPLIED_VOLATILITY,
  Snapshot.JSON_PROPERTY_NAME,
  Snapshot.JSON_PROPERTY_OPEN_INTEREST,
  Snapshot.JSON_PROPERTY_PRICE,
  Snapshot.JSON_PROPERTY_REQUEST_ID,
  Snapshot.JSON_PROPERTY_STYLE,
  Snapshot.JSON_PROPERTY_TYPE,
  Snapshot.JSON_PROPERTY_UNDERLYING_FSYM_SECURITY_ID,
  Snapshot.JSON_PROPERTY_UNDERLYING_PRICE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Snapshot implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_FSYM_ID = "fsymId";
  private String fsymId;

  public static final String JSON_PROPERTY_DATE = "date";
  private LocalDate date;

  public static final String JSON_PROPERTY_DELTA = "delta";
  private Double delta;

  public static final String JSON_PROPERTY_EXPIRATION_DATE = "expirationDate";
  private LocalDate expirationDate;

  public static final String JSON_PROPERTY_IMPLIED_VOLATILITY = "impliedVolatility";
  private Double impliedVolatility;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_OPEN_INTEREST = "openInterest";
  private Integer openInterest;

  public static final String JSON_PROPERTY_PRICE = "price";
  private Double price;

  public static final String JSON_PROPERTY_REQUEST_ID = "requestId";
  private String requestId;

  public static final String JSON_PROPERTY_STYLE = "style";
  private Integer style;

  public static final String JSON_PROPERTY_TYPE = "type";
  private Integer type;

  public static final String JSON_PROPERTY_UNDERLYING_FSYM_SECURITY_ID = "underlyingFsymSecurityId";
  private String underlyingFsymSecurityId;

  public static final String JSON_PROPERTY_UNDERLYING_PRICE = "underlyingPrice";
  private Double underlyingPrice;

  public Snapshot() { 
  }

  public Snapshot fsymId(String fsymId) {
    this.fsymId = fsymId;
    return this;
  }

   /**
   * FactSet&#39;s Option Symbol. For more detail, visit [OA 12636](https://my.apps.factset.com/oa/pages/12636#options)
   * @return fsymId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "TSLA.US#CD33M-USA", value = "FactSet's Option Symbol. For more detail, visit [OA 12636](https://my.apps.factset.com/oa/pages/12636#options)")
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


  public Snapshot date(LocalDate date) {
    this.date = date;
    return this;
  }

   /**
   * The date the data is as of in YYYY-MM-DD
   * @return date
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Tue Apr 13 00:00:00 UTC 2021", value = "The date the data is as of in YYYY-MM-DD")
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


  public Snapshot delta(Double delta) {
    this.delta = delta;
    return this;
  }

   /**
   * The ratio comparing the change in the price of the underlying asset to the corresponding change in the price of a derivative. Sometimes referred to as the \&quot;hedge ratio\&quot;. For example, with respect to call options, a delta of 0.7 means that for every $1 the underlying stock increases, the call option will increase by $0.70. Put option deltas, on the other hand, will be negative, because as the underlying security increases, the value of the option will decrease. So a put option with a delta of -0.7 will decrease by $0.70 for every $1 the underlying increases in price. As an in-the-money call option nears expiration, it will approach a delta of 1.00, and as an in-the-money put option nears expiration, it will approach a delta of -1.00. 
   * @return delta
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0.77158491", value = "The ratio comparing the change in the price of the underlying asset to the corresponding change in the price of a derivative. Sometimes referred to as the \"hedge ratio\". For example, with respect to call options, a delta of 0.7 means that for every $1 the underlying stock increases, the call option will increase by $0.70. Put option deltas, on the other hand, will be negative, because as the underlying security increases, the value of the option will decrease. So a put option with a delta of -0.7 will decrease by $0.70 for every $1 the underlying increases in price. As an in-the-money call option nears expiration, it will approach a delta of 1.00, and as an in-the-money put option nears expiration, it will approach a delta of -1.00. ")
  @JsonProperty(JSON_PROPERTY_DELTA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getDelta() {
    return delta;
  }


  @JsonProperty(JSON_PROPERTY_DELTA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDelta(Double delta) {
    this.delta = delta;
  }


  public Snapshot expirationDate(LocalDate expirationDate) {
    this.expirationDate = expirationDate;
    return this;
  }

   /**
   * The expiration date of the option contract in YYYY-MM-DD format
   * @return expirationDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Fri Dec 17 00:00:00 UTC 2021", value = "The expiration date of the option contract in YYYY-MM-DD format")
  @JsonProperty(JSON_PROPERTY_EXPIRATION_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LocalDate getExpirationDate() {
    return expirationDate;
  }


  @JsonProperty(JSON_PROPERTY_EXPIRATION_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExpirationDate(LocalDate expirationDate) {
    this.expirationDate = expirationDate;
  }


  public Snapshot impliedVolatility(Double impliedVolatility) {
    this.impliedVolatility = impliedVolatility;
    return this;
  }

   /**
   * The implied volatility for the option identifier. Visit [OA 14932](https://my.apps.factset.com/oa/pages/14932) 
   * @return impliedVolatility
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "66.226879", value = "The implied volatility for the option identifier. Visit [OA 14932](https://my.apps.factset.com/oa/pages/14932) ")
  @JsonProperty(JSON_PROPERTY_IMPLIED_VOLATILITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getImpliedVolatility() {
    return impliedVolatility;
  }


  @JsonProperty(JSON_PROPERTY_IMPLIED_VOLATILITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setImpliedVolatility(Double impliedVolatility) {
    this.impliedVolatility = impliedVolatility;
  }


  public Snapshot name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the option security.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Tesla Inc Call DEC21 590.00", value = "The name of the option security.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public Snapshot openInterest(Integer openInterest) {
    this.openInterest = openInterest;
    return this;
  }

   /**
   * The total number of options and/or futures contracts that are not closed or delivered on a particular day.
   * @return openInterest
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "92", value = "The total number of options and/or futures contracts that are not closed or delivered on a particular day.")
  @JsonProperty(JSON_PROPERTY_OPEN_INTEREST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getOpenInterest() {
    return openInterest;
  }


  @JsonProperty(JSON_PROPERTY_OPEN_INTEREST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOpenInterest(Integer openInterest) {
    this.openInterest = openInterest;
  }


  public Snapshot price(Double price) {
    this.price = price;
    return this;
  }

   /**
   * The calculated price quote, based on the calculated status. For US Options - Returns \&quot;Ask Price\&quot; if calc status&#x3D;&#x3D;20, otherwise returns \&quot;Mid Bid/Ask Price\&quot;. For International Options - Returns \&quot;Settlement Price\&quot;. 
   * @return price
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "247.425", value = "The calculated price quote, based on the calculated status. For US Options - Returns \"Ask Price\" if calc status==20, otherwise returns \"Mid Bid/Ask Price\". For International Options - Returns \"Settlement Price\". ")
  @JsonProperty(JSON_PROPERTY_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getPrice() {
    return price;
  }


  @JsonProperty(JSON_PROPERTY_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrice(Double price) {
    this.price = price;
  }


  public Snapshot requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

   /**
   * The input value for the id parameter.
   * @return requestId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "TSLA.US#CD33M-USA", value = "The input value for the id parameter.")
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


  public Snapshot style(Integer style) {
    this.style = style;
    return this;
  }

   /**
   * Returns the style of the option id requested, where -   |style|description| |---|---| |0|American| |1|European|  An American style option can be exercised anytime during its life. The majority of exchange-traded options are American.   Since investors have the freedom to exercise their American options at any point during the life of the contract, they are more valuable than European options which can only be exercised at maturity.   Consider this example- If you bought a Ford March Call option expiring in March of 2006, in March 2005 you would have the right to exercise the call option at anytime up until its expiration date. Had the Ford option been a European option, you could only exercise the option at the expiry date in March 2006. During the year, the share price could have been most optimal for exercise in December of 2005, but you would have to wait to exercise your option until March 2006, where it could be out of the money and virtually worthless. The name of this option style has nothing to do with the geographic location. 
   * @return style
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "Returns the style of the option id requested, where -   |style|description| |---|---| |0|American| |1|European|  An American style option can be exercised anytime during its life. The majority of exchange-traded options are American.   Since investors have the freedom to exercise their American options at any point during the life of the contract, they are more valuable than European options which can only be exercised at maturity.   Consider this example- If you bought a Ford March Call option expiring in March of 2006, in March 2005 you would have the right to exercise the call option at anytime up until its expiration date. Had the Ford option been a European option, you could only exercise the option at the expiry date in March 2006. During the year, the share price could have been most optimal for exercise in December of 2005, but you would have to wait to exercise your option until March 2006, where it could be out of the money and virtually worthless. The name of this option style has nothing to do with the geographic location. ")
  @JsonProperty(JSON_PROPERTY_STYLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getStyle() {
    return style;
  }


  @JsonProperty(JSON_PROPERTY_STYLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStyle(Integer style) {
    this.style = style;
  }


  public Snapshot type(Integer type) {
    this.type = type;
    return this;
  }

   /**
   * The option type code, where  |code|description| |---|---| |0|Equity Option| |2|Index Option| |99|Option on an ETF| |60|Option on a Future| |19|Option on a Spot FX Rate| 
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "The option type code, where  |code|description| |---|---| |0|Equity Option| |2|Index Option| |99|Option on an ETF| |60|Option on a Future| |19|Option on a Spot FX Rate| ")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(Integer type) {
    this.type = type;
  }


  public Snapshot underlyingFsymSecurityId(String underlyingFsymSecurityId) {
    this.underlyingFsymSecurityId = underlyingFsymSecurityId;
    return this;
  }

   /**
   * The Symbol of the security that must be delivered when a derivative contract, such as a put or call option, is exercised. This is represented in FactSet&#39;s Permanent Security Identifier format (XXXXXX-S). 
   * @return underlyingFsymSecurityId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "WWDPYB-S", value = "The Symbol of the security that must be delivered when a derivative contract, such as a put or call option, is exercised. This is represented in FactSet's Permanent Security Identifier format (XXXXXX-S). ")
  @JsonProperty(JSON_PROPERTY_UNDERLYING_FSYM_SECURITY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUnderlyingFsymSecurityId() {
    return underlyingFsymSecurityId;
  }


  @JsonProperty(JSON_PROPERTY_UNDERLYING_FSYM_SECURITY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUnderlyingFsymSecurityId(String underlyingFsymSecurityId) {
    this.underlyingFsymSecurityId = underlyingFsymSecurityId;
  }


  public Snapshot underlyingPrice(Double underlyingPrice) {
    this.underlyingPrice = underlyingPrice;
    return this;
  }

   /**
   * The price of the underyling security as of the date requested. 
   * @return underlyingPrice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "762.32", value = "The price of the underyling security as of the date requested. ")
  @JsonProperty(JSON_PROPERTY_UNDERLYING_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getUnderlyingPrice() {
    return underlyingPrice;
  }


  @JsonProperty(JSON_PROPERTY_UNDERLYING_PRICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUnderlyingPrice(Double underlyingPrice) {
    this.underlyingPrice = underlyingPrice;
  }


  /**
   * Return true if this snapshot object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Snapshot snapshot = (Snapshot) o;
    return Objects.equals(this.fsymId, snapshot.fsymId) &&
        Objects.equals(this.date, snapshot.date) &&
        Objects.equals(this.delta, snapshot.delta) &&
        Objects.equals(this.expirationDate, snapshot.expirationDate) &&
        Objects.equals(this.impliedVolatility, snapshot.impliedVolatility) &&
        Objects.equals(this.name, snapshot.name) &&
        Objects.equals(this.openInterest, snapshot.openInterest) &&
        Objects.equals(this.price, snapshot.price) &&
        Objects.equals(this.requestId, snapshot.requestId) &&
        Objects.equals(this.style, snapshot.style) &&
        Objects.equals(this.type, snapshot.type) &&
        Objects.equals(this.underlyingFsymSecurityId, snapshot.underlyingFsymSecurityId) &&
        Objects.equals(this.underlyingPrice, snapshot.underlyingPrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fsymId, date, delta, expirationDate, impliedVolatility, name, openInterest, price, requestId, style, type, underlyingFsymSecurityId, underlyingPrice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Snapshot {\n");
    sb.append("    fsymId: ").append(toIndentedString(fsymId)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    delta: ").append(toIndentedString(delta)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    impliedVolatility: ").append(toIndentedString(impliedVolatility)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    openInterest: ").append(toIndentedString(openInterest)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    style: ").append(toIndentedString(style)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    underlyingFsymSecurityId: ").append(toIndentedString(underlyingFsymSecurityId)).append("\n");
    sb.append("    underlyingPrice: ").append(toIndentedString(underlyingPrice)).append("\n");
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

