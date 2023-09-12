/*
 * DSOTM API
 * Allow clients to send transactions data to FactSet.
 *
 * The version of the OpenAPI document: 1.3.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.DirectStreamingofTransactionMessages.models;

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
import com.factset.sdk.DirectStreamingofTransactionMessages.JSON;


/**
 * PlacementParameters
 */
@JsonPropertyOrder({
  PlacementParameters.JSON_PROPERTY_SETTLEMENTCURRENCYISO,
  PlacementParameters.JSON_PROPERTY_PARENTID,
  PlacementParameters.JSON_PROPERTY_ORDERID,
  PlacementParameters.JSON_PROPERTY_PORTFOLIO,
  PlacementParameters.JSON_PROPERTY_TRANSACTIONID,
  PlacementParameters.JSON_PROPERTY_SYMBOL,
  PlacementParameters.JSON_PROPERTY_DESCRIPTION,
  PlacementParameters.JSON_PROPERTY_TRADETYPE,
  PlacementParameters.JSON_PROPERTY_STATUS,
  PlacementParameters.JSON_PROPERTY_TRADEDATE,
  PlacementParameters.JSON_PROPERTY_TRANSACTIONLEAVES,
  PlacementParameters.JSON_PROPERTY_AMOUNT,
  PlacementParameters.JSON_PROPERTY_CURRENCYISO,
  PlacementParameters.JSON_PROPERTY_FOREIGNEXCHANGERATE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PlacementParameters implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_SETTLEMENTCURRENCYISO = "settlementcurrencyiso";
  private String settlementcurrencyiso;

  public static final String JSON_PROPERTY_PARENTID = "parentid";
  private JsonNullable<String> parentid = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ORDERID = "orderid";
  private JsonNullable<String> orderid = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PORTFOLIO = "portfolio";
  private String portfolio;

  public static final String JSON_PROPERTY_TRANSACTIONID = "transactionid";
  private String transactionid;

  public static final String JSON_PROPERTY_SYMBOL = "symbol";
  private String symbol;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_TRADETYPE = "tradetype";
  private String tradetype;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public static final String JSON_PROPERTY_TRADEDATE = "tradedate";
  private String tradedate;

  public static final String JSON_PROPERTY_TRANSACTIONLEAVES = "transactionleaves";
  private Double transactionleaves;

  public static final String JSON_PROPERTY_AMOUNT = "amount";
  private Double amount;

  public static final String JSON_PROPERTY_CURRENCYISO = "currencyiso";
  private String currencyiso;

  public static final String JSON_PROPERTY_FOREIGNEXCHANGERATE = "foreignexchangerate";
  private Float foreignexchangerate;

  public PlacementParameters() { 
  }

  @JsonCreator
  public PlacementParameters(
    @JsonProperty(value=JSON_PROPERTY_SETTLEMENTCURRENCYISO, required=true) String settlementcurrencyiso, 
    @JsonProperty(value=JSON_PROPERTY_PORTFOLIO, required=true) String portfolio, 
    @JsonProperty(value=JSON_PROPERTY_TRANSACTIONID, required=true) String transactionid, 
    @JsonProperty(value=JSON_PROPERTY_SYMBOL, required=true) String symbol, 
    @JsonProperty(value=JSON_PROPERTY_DESCRIPTION, required=true) String description, 
    @JsonProperty(value=JSON_PROPERTY_TRADETYPE, required=true) String tradetype, 
    @JsonProperty(value=JSON_PROPERTY_STATUS, required=true) String status, 
    @JsonProperty(value=JSON_PROPERTY_TRADEDATE, required=true) String tradedate, 
    @JsonProperty(value=JSON_PROPERTY_AMOUNT, required=true) Double amount, 
    @JsonProperty(value=JSON_PROPERTY_CURRENCYISO, required=true) String currencyiso
  ) {
    this();
    this.settlementcurrencyiso = settlementcurrencyiso;
    this.portfolio = portfolio;
    this.transactionid = transactionid;
    this.symbol = symbol;
    this.description = description;
    this.tradetype = tradetype;
    this.status = status;
    this.tradedate = tradedate;
    this.amount = amount;
    this.currencyiso = currencyiso;
  }

  public PlacementParameters settlementcurrencyiso(String settlementcurrencyiso) {
    this.settlementcurrencyiso = settlementcurrencyiso;
    return this;
  }

   /**
   * Currency code for Settlement Value
   * @return settlementcurrencyiso
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Currency code for Settlement Value")
  @JsonProperty(JSON_PROPERTY_SETTLEMENTCURRENCYISO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSettlementcurrencyiso() {
    return settlementcurrencyiso;
  }


  @JsonProperty(JSON_PROPERTY_SETTLEMENTCURRENCYISO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSettlementcurrencyiso(String settlementcurrencyiso) {
    this.settlementcurrencyiso = settlementcurrencyiso;
  }


  public PlacementParameters parentid(String parentid) {
    this.parentid = JsonNullable.<String>of(parentid);
    return this;
  }

   /**
   * Unique ID of the order which spawned this placement
   * @return parentid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unique ID of the order which spawned this placement")
  @JsonIgnore

  public String getParentid() {
        return parentid.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PARENTID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getParentid_JsonNullable() {
    return parentid;
  }
  
  @JsonProperty(JSON_PROPERTY_PARENTID)
  public void setParentid_JsonNullable(JsonNullable<String> parentid) {
    this.parentid = parentid;
  }

  public void setParentid(String parentid) {
    this.parentid = JsonNullable.<String>of(parentid);
  }


  public PlacementParameters orderid(String orderid) {
    this.orderid = JsonNullable.<String>of(orderid);
    return this;
  }

   /**
   * Unique ID of the order which originated the record
   * @return orderid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unique ID of the order which originated the record")
  @JsonIgnore

  public String getOrderid() {
        return orderid.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ORDERID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getOrderid_JsonNullable() {
    return orderid;
  }
  
  @JsonProperty(JSON_PROPERTY_ORDERID)
  public void setOrderid_JsonNullable(JsonNullable<String> orderid) {
    this.orderid = orderid;
  }

  public void setOrderid(String orderid) {
    this.orderid = JsonNullable.<String>of(orderid);
  }


  public PlacementParameters portfolio(String portfolio) {
    this.portfolio = portfolio;
    return this;
  }

   /**
   * Path of the portfolio (Ex: Client:/folder1/testing.ofdb)
   * @return portfolio
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Path of the portfolio (Ex: Client:/folder1/testing.ofdb)")
  @JsonProperty(JSON_PROPERTY_PORTFOLIO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPortfolio() {
    return portfolio;
  }


  @JsonProperty(JSON_PROPERTY_PORTFOLIO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPortfolio(String portfolio) {
    this.portfolio = portfolio;
  }


  public PlacementParameters transactionid(String transactionid) {
    this.transactionid = transactionid;
    return this;
  }

   /**
   * Unique id for the transaction
   * @return transactionid
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Unique id for the transaction")
  @JsonProperty(JSON_PROPERTY_TRANSACTIONID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTransactionid() {
    return transactionid;
  }


  @JsonProperty(JSON_PROPERTY_TRANSACTIONID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTransactionid(String transactionid) {
    this.transactionid = transactionid;
  }


  public PlacementParameters symbol(String symbol) {
    this.symbol = symbol;
    return this;
  }

   /**
   * Symbol corresponding to the traded instrument.
   * @return symbol
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Symbol corresponding to the traded instrument.")
  @JsonProperty(JSON_PROPERTY_SYMBOL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSymbol() {
    return symbol;
  }


  @JsonProperty(JSON_PROPERTY_SYMBOL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }


  public PlacementParameters description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description
   * @return description
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Description")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDescription(String description) {
    this.description = description;
  }


  public PlacementParameters tradetype(String tradetype) {
    this.tradetype = tradetype;
    return this;
  }

   /**
   * Trade type could be any of the following values BL, BC, SL, SS.  which stands for Buy Long, Buy to cover, Sell Long and Sell Short respectively.
   * @return tradetype
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Trade type could be any of the following values BL, BC, SL, SS.  which stands for Buy Long, Buy to cover, Sell Long and Sell Short respectively.")
  @JsonProperty(JSON_PROPERTY_TRADETYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTradetype() {
    return tradetype;
  }


  @JsonProperty(JSON_PROPERTY_TRADETYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTradetype(String tradetype) {
    this.tradetype = tradetype;
  }


  public PlacementParameters status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Status could be any of the following value: ACCT or CNCL.  which stands for Accounted and Cancelled respectively.
   * @return status
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Status could be any of the following value: ACCT or CNCL.  which stands for Accounted and Cancelled respectively.")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStatus(String status) {
    this.status = status;
  }


  public PlacementParameters tradedate(String tradedate) {
    this.tradedate = tradedate;
    return this;
  }

   /**
   * Transaction date which is in the format YYYYMMDD
   * @return tradedate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Transaction date which is in the format YYYYMMDD")
  @JsonProperty(JSON_PROPERTY_TRADEDATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTradedate() {
    return tradedate;
  }


  @JsonProperty(JSON_PROPERTY_TRADEDATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTradedate(String tradedate) {
    this.tradedate = tradedate;
  }


  public PlacementParameters transactionleaves(Double transactionleaves) {
    this.transactionleaves = transactionleaves;
    return this;
  }

   /**
   * Shares that have been ordered and not executed
   * @return transactionleaves
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Shares that have been ordered and not executed")
  @JsonProperty(JSON_PROPERTY_TRANSACTIONLEAVES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getTransactionleaves() {
    return transactionleaves;
  }


  @JsonProperty(JSON_PROPERTY_TRANSACTIONLEAVES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTransactionleaves(Double transactionleaves) {
    this.transactionleaves = transactionleaves;
  }


  public PlacementParameters amount(Double amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Quantity of the instrument traded.
   * @return amount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Quantity of the instrument traded.")
  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Double getAmount() {
    return amount;
  }


  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAmount(Double amount) {
    this.amount = amount;
  }


  public PlacementParameters currencyiso(String currencyiso) {
    this.currencyiso = currencyiso;
    return this;
  }

   /**
   * The currency code of cash valued fields, Net Amount and Gross Amount.
   * @return currencyiso
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The currency code of cash valued fields, Net Amount and Gross Amount.")
  @JsonProperty(JSON_PROPERTY_CURRENCYISO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCurrencyiso() {
    return currencyiso;
  }


  @JsonProperty(JSON_PROPERTY_CURRENCYISO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCurrencyiso(String currencyiso) {
    this.currencyiso = currencyiso;
  }


  public PlacementParameters foreignexchangerate(Float foreignexchangerate) {
    this.foreignexchangerate = foreignexchangerate;
    return this;
  }

   /**
   * FX rate that can be picked up by PA, multiplied with the cash valued fields, Net, Gross, to allow PA to show transactions in reporting currency.
   * @return foreignexchangerate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "FX rate that can be picked up by PA, multiplied with the cash valued fields, Net, Gross, to allow PA to show transactions in reporting currency.")
  @JsonProperty(JSON_PROPERTY_FOREIGNEXCHANGERATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Float getForeignexchangerate() {
    return foreignexchangerate;
  }


  @JsonProperty(JSON_PROPERTY_FOREIGNEXCHANGERATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setForeignexchangerate(Float foreignexchangerate) {
    this.foreignexchangerate = foreignexchangerate;
  }


  /**
   * Return true if this PlacementParameters object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlacementParameters placementParameters = (PlacementParameters) o;
    return Objects.equals(this.settlementcurrencyiso, placementParameters.settlementcurrencyiso) &&
        equalsNullable(this.parentid, placementParameters.parentid) &&
        equalsNullable(this.orderid, placementParameters.orderid) &&
        Objects.equals(this.portfolio, placementParameters.portfolio) &&
        Objects.equals(this.transactionid, placementParameters.transactionid) &&
        Objects.equals(this.symbol, placementParameters.symbol) &&
        Objects.equals(this.description, placementParameters.description) &&
        Objects.equals(this.tradetype, placementParameters.tradetype) &&
        Objects.equals(this.status, placementParameters.status) &&
        Objects.equals(this.tradedate, placementParameters.tradedate) &&
        Objects.equals(this.transactionleaves, placementParameters.transactionleaves) &&
        Objects.equals(this.amount, placementParameters.amount) &&
        Objects.equals(this.currencyiso, placementParameters.currencyiso) &&
        Objects.equals(this.foreignexchangerate, placementParameters.foreignexchangerate);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(settlementcurrencyiso, hashCodeNullable(parentid), hashCodeNullable(orderid), portfolio, transactionid, symbol, description, tradetype, status, tradedate, transactionleaves, amount, currencyiso, foreignexchangerate);
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
    sb.append("class PlacementParameters {\n");
    sb.append("    settlementcurrencyiso: ").append(toIndentedString(settlementcurrencyiso)).append("\n");
    sb.append("    parentid: ").append(toIndentedString(parentid)).append("\n");
    sb.append("    orderid: ").append(toIndentedString(orderid)).append("\n");
    sb.append("    portfolio: ").append(toIndentedString(portfolio)).append("\n");
    sb.append("    transactionid: ").append(toIndentedString(transactionid)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    tradetype: ").append(toIndentedString(tradetype)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    tradedate: ").append(toIndentedString(tradedate)).append("\n");
    sb.append("    transactionleaves: ").append(toIndentedString(transactionleaves)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currencyiso: ").append(toIndentedString(currencyiso)).append("\n");
    sb.append("    foreignexchangerate: ").append(toIndentedString(foreignexchangerate)).append("\n");
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

