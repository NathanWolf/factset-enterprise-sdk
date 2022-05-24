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
import com.factset.sdk.FactSetFunds.models.DividendAdjust;
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
 * Returns Request Body
 */
@ApiModel(description = "Returns Request Body")
@JsonPropertyOrder({
  FundsReturnsSnapshotRequest.JSON_PROPERTY_IDS,
  FundsReturnsSnapshotRequest.JSON_PROPERTY_DATE,
  FundsReturnsSnapshotRequest.JSON_PROPERTY_DIVIDEND_ADJUST
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FundsReturnsSnapshotRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_IDS = "ids";
  private java.util.List<String> ids = new java.util.ArrayList<>();

  public static final String JSON_PROPERTY_DATE = "date";
  private String date;

  public static final String JSON_PROPERTY_DIVIDEND_ADJUST = "dividendAdjust";
  private DividendAdjust dividendAdjust = DividendAdjust.DIV;

  public FundsReturnsSnapshotRequest() { 
  }

  @JsonCreator
  public FundsReturnsSnapshotRequest(
    @JsonProperty(value=JSON_PROPERTY_IDS, required=true) java.util.List<String> ids
  ) {
    this();
    this.ids = ids;
  }

  public FundsReturnsSnapshotRequest ids(java.util.List<String> ids) {
    this.ids = ids;
    return this;
  }

  public FundsReturnsSnapshotRequest addIdsItem(String idsItem) {
    this.ids.add(idsItem);
    return this;
  }

   /**
   * The requested Fund Identifier. FactSet Identifiers, tickers, CUSIP and SEDOL are accepted input. &lt;p&gt;***ids limit** &#x3D;  1000 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;* 
   * @return ids
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "[\"MABAX\",\"FCNTX\"]", required = true, value = "The requested Fund Identifier. FactSet Identifiers, tickers, CUSIP and SEDOL are accepted input. <p>***ids limit** =  1000 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>* ")
  @JsonProperty(JSON_PROPERTY_IDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public java.util.List<String> getIds() {
    return ids;
  }


  @JsonProperty(JSON_PROPERTY_IDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIds(java.util.List<String> ids) {
    this.ids = ids;
  }


  public FundsReturnsSnapshotRequest date(String date) {
    this.date = date;
    return this;
  }

   /**
   * The date requested for a given date range in YYYY-MM-DD format. The date MUST be equal to or less than the &#x60;priceRecentDate&#x60; found within the /summary endpoint. 
   * @return date
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2019-01-01", value = "The date requested for a given date range in YYYY-MM-DD format. The date MUST be equal to or less than the `priceRecentDate` found within the /summary endpoint. ")
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


  public FundsReturnsSnapshotRequest dividendAdjust(DividendAdjust dividendAdjust) {
    this.dividendAdjust = dividendAdjust;
    return this;
  }

   /**
   * Get dividendAdjust
   * @return dividendAdjust
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DIVIDEND_ADJUST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DividendAdjust getDividendAdjust() {
    return dividendAdjust;
  }


  @JsonProperty(JSON_PROPERTY_DIVIDEND_ADJUST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDividendAdjust(DividendAdjust dividendAdjust) {
    this.dividendAdjust = dividendAdjust;
  }


  /**
   * Return true if this fundsReturnsSnapshotRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FundsReturnsSnapshotRequest fundsReturnsSnapshotRequest = (FundsReturnsSnapshotRequest) o;
    return Objects.equals(this.ids, fundsReturnsSnapshotRequest.ids) &&
        Objects.equals(this.date, fundsReturnsSnapshotRequest.date) &&
        Objects.equals(this.dividendAdjust, fundsReturnsSnapshotRequest.dividendAdjust);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ids, date, dividendAdjust);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FundsReturnsSnapshotRequest {\n");
    sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    dividendAdjust: ").append(toIndentedString(dividendAdjust)).append("\n");
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

