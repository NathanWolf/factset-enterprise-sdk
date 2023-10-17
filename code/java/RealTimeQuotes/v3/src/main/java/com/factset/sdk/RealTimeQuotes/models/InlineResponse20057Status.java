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
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.RealTimeQuotes.JSON;


/**
 * Error status for the requested identifier
 */
@ApiModel(description = "Error status for the requested identifier")
@JsonPropertyOrder({
  InlineResponse20057Status.JSON_PROPERTY_CODE,
  InlineResponse20057Status.JSON_PROPERTY_IDENTIFIER
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse20057Status implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Code of the error condition.
   */
  public enum CodeEnum {
    NONE("none"),
    
    PARAMETER("parameter"),
    
    ENTITLEMENT("entitlement");

    private String value;

    CodeEnum(String value) {
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
    public static CodeEnum fromValue(String value) {
      for (CodeEnum b : CodeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  public static final String JSON_PROPERTY_CODE = "code";
  private JsonNullable<CodeEnum> code = JsonNullable.<CodeEnum>undefined();

  public static final String JSON_PROPERTY_IDENTIFIER = "identifier";
  private JsonNullable<String> identifier = JsonNullable.<String>undefined();

  public InlineResponse20057Status() { 
  }

  public InlineResponse20057Status code(CodeEnum code) {
    this.code = JsonNullable.<CodeEnum>of(code);
    return this;
  }

   /**
   * Code of the error condition.
   * @return code
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Code of the error condition.")
  @JsonIgnore

  public CodeEnum getCode() {
        return code.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<CodeEnum> getCode_JsonNullable() {
    return code;
  }
  
  @JsonProperty(JSON_PROPERTY_CODE)
  public void setCode_JsonNullable(JsonNullable<CodeEnum> code) {
    this.code = code;
  }

  public void setCode(CodeEnum code) {
    this.code = JsonNullable.<CodeEnum>of(code);
  }


  public InlineResponse20057Status identifier(String identifier) {
    this.identifier = JsonNullable.<String>of(identifier);
    return this;
  }

   /**
   * Provided identifier.
   * @return identifier
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Provided identifier.")
  @JsonIgnore

  public String getIdentifier() {
        return identifier.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_IDENTIFIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getIdentifier_JsonNullable() {
    return identifier;
  }
  
  @JsonProperty(JSON_PROPERTY_IDENTIFIER)
  public void setIdentifier_JsonNullable(JsonNullable<String> identifier) {
    this.identifier = identifier;
  }

  public void setIdentifier(String identifier) {
    this.identifier = JsonNullable.<String>of(identifier);
  }


  /**
   * Return true if this inline_response_200_57_status object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20057Status inlineResponse20057Status = (InlineResponse20057Status) o;
    return equalsNullable(this.code, inlineResponse20057Status.code) &&
        equalsNullable(this.identifier, inlineResponse20057Status.identifier);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(code), hashCodeNullable(identifier));
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
    sb.append("class InlineResponse20057Status {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
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

