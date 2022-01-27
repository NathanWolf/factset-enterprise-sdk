/*
 * Barra Portfolio Optimizer API
 * Allow clients to fetch Analytics through APIs.
 *
 * The version of the OpenAPI document: 3
 * Contact: analytics.api.support@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.BarraPortfolioOptimizer.models;

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
import com.factset.sdk.BarraPortfolioOptimizer.JSON;


/**
 * OptimalPortfolio
 */
@JsonPropertyOrder({
  OptimalPortfolio.JSON_PROPERTY_ACCT_NAME,
  OptimalPortfolio.JSON_PROPERTY_EXCLUDE_ZERO,
  OptimalPortfolio.JSON_PROPERTY_ARCHIVE_DATE,
  OptimalPortfolio.JSON_PROPERTY_IF_ACCT_EXISTS,
  OptimalPortfolio.JSON_PROPERTY_IF_OFDB_DATE_EXISTS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class OptimalPortfolio implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ACCT_NAME = "acctName";
  private String acctName;

  public static final String JSON_PROPERTY_EXCLUDE_ZERO = "excludeZero";
  private Boolean excludeZero;

  public static final String JSON_PROPERTY_ARCHIVE_DATE = "archiveDate";
  private String archiveDate;

  /**
   * Archive action if account exists
   */
  public enum IfAcctExistsEnum {
    ABORT("abort"),
    
    OVERWRITE("overwrite"),
    
    APPENDDATE("appendDate");

    private String value;

    IfAcctExistsEnum(String value) {
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
    public static IfAcctExistsEnum fromValue(String value) {
      for (IfAcctExistsEnum b : IfAcctExistsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_IF_ACCT_EXISTS = "ifAcctExists";
  private IfAcctExistsEnum ifAcctExists;

  /**
   * Action if ofdb date exists
   */
  public enum IfOfdbDateExistsEnum {
    ABORT("abort"),
    
    REPLACEDATE("replaceDate"),
    
    APPENDSECURITIES("appendSecurities");

    private String value;

    IfOfdbDateExistsEnum(String value) {
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
    public static IfOfdbDateExistsEnum fromValue(String value) {
      for (IfOfdbDateExistsEnum b : IfOfdbDateExistsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_IF_OFDB_DATE_EXISTS = "ifOfdbDateExists";
  private IfOfdbDateExistsEnum ifOfdbDateExists;


  public OptimalPortfolio acctName(String acctName) {
    this.acctName = acctName;
    return this;
  }

   /**
   * Account path
   * @return acctName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Account path")
  @JsonProperty(JSON_PROPERTY_ACCT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAcctName() {
    return acctName;
  }


  @JsonProperty(JSON_PROPERTY_ACCT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAcctName(String acctName) {
    this.acctName = acctName;
  }


  public OptimalPortfolio excludeZero(Boolean excludeZero) {
    this.excludeZero = excludeZero;
    return this;
  }

   /**
   * Exclude zero
   * @return excludeZero
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Exclude zero")
  @JsonProperty(JSON_PROPERTY_EXCLUDE_ZERO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getExcludeZero() {
    return excludeZero;
  }


  @JsonProperty(JSON_PROPERTY_EXCLUDE_ZERO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExcludeZero(Boolean excludeZero) {
    this.excludeZero = excludeZero;
  }


  public OptimalPortfolio archiveDate(String archiveDate) {
    this.archiveDate = archiveDate;
    return this;
  }

   /**
   * Archive date
   * @return archiveDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Archive date")
  @JsonProperty(JSON_PROPERTY_ARCHIVE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getArchiveDate() {
    return archiveDate;
  }


  @JsonProperty(JSON_PROPERTY_ARCHIVE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setArchiveDate(String archiveDate) {
    this.archiveDate = archiveDate;
  }


  public OptimalPortfolio ifAcctExists(IfAcctExistsEnum ifAcctExists) {
    this.ifAcctExists = ifAcctExists;
    return this;
  }

   /**
   * Archive action if account exists
   * @return ifAcctExists
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Archive action if account exists")
  @JsonProperty(JSON_PROPERTY_IF_ACCT_EXISTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public IfAcctExistsEnum getIfAcctExists() {
    return ifAcctExists;
  }


  @JsonProperty(JSON_PROPERTY_IF_ACCT_EXISTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIfAcctExists(IfAcctExistsEnum ifAcctExists) {
    this.ifAcctExists = ifAcctExists;
  }


  public OptimalPortfolio ifOfdbDateExists(IfOfdbDateExistsEnum ifOfdbDateExists) {
    this.ifOfdbDateExists = ifOfdbDateExists;
    return this;
  }

   /**
   * Action if ofdb date exists
   * @return ifOfdbDateExists
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Action if ofdb date exists")
  @JsonProperty(JSON_PROPERTY_IF_OFDB_DATE_EXISTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public IfOfdbDateExistsEnum getIfOfdbDateExists() {
    return ifOfdbDateExists;
  }


  @JsonProperty(JSON_PROPERTY_IF_OFDB_DATE_EXISTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIfOfdbDateExists(IfOfdbDateExistsEnum ifOfdbDateExists) {
    this.ifOfdbDateExists = ifOfdbDateExists;
  }


  /**
   * Return true if this OptimalPortfolio object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OptimalPortfolio optimalPortfolio = (OptimalPortfolio) o;
    return Objects.equals(this.acctName, optimalPortfolio.acctName) &&
        Objects.equals(this.excludeZero, optimalPortfolio.excludeZero) &&
        Objects.equals(this.archiveDate, optimalPortfolio.archiveDate) &&
        Objects.equals(this.ifAcctExists, optimalPortfolio.ifAcctExists) &&
        Objects.equals(this.ifOfdbDateExists, optimalPortfolio.ifOfdbDateExists);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acctName, excludeZero, archiveDate, ifAcctExists, ifOfdbDateExists);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OptimalPortfolio {\n");
    sb.append("    acctName: ").append(toIndentedString(acctName)).append("\n");
    sb.append("    excludeZero: ").append(toIndentedString(excludeZero)).append("\n");
    sb.append("    archiveDate: ").append(toIndentedString(archiveDate)).append("\n");
    sb.append("    ifAcctExists: ").append(toIndentedString(ifAcctExists)).append("\n");
    sb.append("    ifOfdbDateExists: ").append(toIndentedString(ifOfdbDateExists)).append("\n");
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

