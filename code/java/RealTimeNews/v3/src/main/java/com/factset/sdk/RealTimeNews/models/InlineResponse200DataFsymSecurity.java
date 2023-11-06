/*
 * News API For Digital Portals
 * Consume FactSet’s StreetAccount news and 3rd party content through an API that seamlessly integrates with [quotes](https://developer.factset.com/api-catalog/quotes-api-digital-portals), [time series](https://developer.factset.com/api-catalog/time-series-api-digital-portals), [watchlists](https://developer.factset.com/api-catalog/watchlist-api-digital-portals), and other Functional APIs.  Search for news articles from various news distributors and publishers. Incorporate a multitude of search parameters such as region, category, source, article type and provider-specific meta data, to easily filter out the noise.  All search and list endpoints can be subscribed to receive streamed updates.  News providers include:  * APA * AWP  * Businesswire * Cercle Finance * Direkt News SE * Dow Jones News * dpa * dpa-AFX  * EUWAX * GlobenewsWire * Kauppalehti * MT Newswires * MoneyAM * newsaktuell * OMX * PR Newswire  * Ritzau Finans * StreetAccount News * TDN News        See the [Quotes API for Digital Portals](https://developer.factset.com/api-catalog/quotes-api-digital-portals) for access to detailed price and performance information, plus basic support for security identifier cross-reference. 
 *
 * The version of the OpenAPI document: 3.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.RealTimeNews.models;

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
import com.factset.sdk.RealTimeNews.JSON;


/**
 * Security-level identifier.
 */
@ApiModel(description = "Security-level identifier.")
@JsonPropertyOrder({
  InlineResponse200DataFsymSecurity.JSON_PROPERTY_PERMANENT_IDENTIFIER
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse200DataFsymSecurity implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_PERMANENT_IDENTIFIER = "permanentIdentifier";
  private JsonNullable<String> permanentIdentifier = JsonNullable.<String>undefined();

  public InlineResponse200DataFsymSecurity() { 
  }

  public InlineResponse200DataFsymSecurity permanentIdentifier(String permanentIdentifier) {
    this.permanentIdentifier = JsonNullable.<String>of(permanentIdentifier);
    return this;
  }

   /**
   * FactSet Permanent Identifier for an instrument. The format is six alpha numeric characters, excluding vowels, with an S suffix (XXXXXX-S).
   * @return permanentIdentifier
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "FactSet Permanent Identifier for an instrument. The format is six alpha numeric characters, excluding vowels, with an S suffix (XXXXXX-S).")
  @JsonIgnore

  public String getPermanentIdentifier() {
        return permanentIdentifier.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PERMANENT_IDENTIFIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getPermanentIdentifier_JsonNullable() {
    return permanentIdentifier;
  }
  
  @JsonProperty(JSON_PROPERTY_PERMANENT_IDENTIFIER)
  public void setPermanentIdentifier_JsonNullable(JsonNullable<String> permanentIdentifier) {
    this.permanentIdentifier = permanentIdentifier;
  }

  public void setPermanentIdentifier(String permanentIdentifier) {
    this.permanentIdentifier = JsonNullable.<String>of(permanentIdentifier);
  }


  /**
   * Return true if this inline_response_200_data_fsym_security object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200DataFsymSecurity inlineResponse200DataFsymSecurity = (InlineResponse200DataFsymSecurity) o;
    return equalsNullable(this.permanentIdentifier, inlineResponse200DataFsymSecurity.permanentIdentifier);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(permanentIdentifier));
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
    sb.append("class InlineResponse200DataFsymSecurity {\n");
    sb.append("    permanentIdentifier: ").append(toIndentedString(permanentIdentifier)).append("\n");
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

