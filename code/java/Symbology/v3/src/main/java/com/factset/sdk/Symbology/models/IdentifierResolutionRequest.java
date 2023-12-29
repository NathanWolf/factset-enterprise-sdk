/*
 * FactSet Symbology API
 * The FactSet Symbology API provides symbol resolution services, allowing clients to translate market identifiers into various symbology types such as, FactSet Permanent Identifiers, CUSIP, ISIN, SEDOL, Tickers, and LEIs. <p>Factset's Symbology API sits at the center of its hub-and-spoke data model, enabling you to quickly harmonize the expanding catalog of Content APIs.</p> 
 *
 * The version of the OpenAPI document: 3.3.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.Symbology.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.Symbology.models.GetInputSymbolType;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.Symbology.JSON;


/**
 * Request object for Identifier Resolution endpoint.
 */
@ApiModel(description = "Request object for Identifier Resolution endpoint.")
@JsonPropertyOrder({
  IdentifierResolutionRequest.JSON_PROPERTY_IDS,
  IdentifierResolutionRequest.JSON_PROPERTY_INPUT_SYMBOL_TYPE,
  IdentifierResolutionRequest.JSON_PROPERTY_OUTPUT_SYMBOL_TYPES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class IdentifierResolutionRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_IDS = "ids";
  private java.util.List<String> ids = new java.util.ArrayList<>();

  public static final String JSON_PROPERTY_INPUT_SYMBOL_TYPE = "inputSymbolType";
  private GetInputSymbolType inputSymbolType = GetInputSymbolType.TICKERREGION;

  /**
   * Gets or Sets outputSymbolTypes
   */
  public enum OutputSymbolTypesEnum {
    BIC("BIC"),
    
    CIK("CIK"),
    
    CRD("CRD"),
    
    EIN("EIN"),
    
    FITCH("FITCH"),
    
    LEI("LEI"),
    
    MD("MD"),
    
    SPR("SPR"),
    
    WKN("WKN"),
    
    UKCH("UKCH"),
    
    RSSD("RSSD"),
    
    SEDOL("SEDOL"),
    
    CUSIP("CUSIP"),
    
    FSYMENTITYID("fsymEntityId"),
    
    FSYMSECURITYID("fsymSecurityId"),
    
    FSYMREGIONALID("fsymRegionalId"),
    
    FSYMLISTINGID("fsymListingId"),
    
    ISIN("ISIN"),
    
    TICKEREXCHANGE("tickerExchange"),
    
    TICKERREGION("tickerRegion"),
    
    JCN("JCN"),
    
    BLOOMBERGLISTINGTICKER("bloombergListingTicker"),
    
    BLOOMBERGREGIONALTICKER("bloombergRegionalTicker"),
    
    BLOOMBERGFIGILISTING("bloombergFigiListing"),
    
    BLOOMBERGFIGIREGIONAL("bloombergFigiRegional"),
    
    BLOOMBERGFIGISECURITY("bloombergFigiSecurity");

    private String value;

    OutputSymbolTypesEnum(String value) {
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
    public static OutputSymbolTypesEnum fromValue(String value) {
      for (OutputSymbolTypesEnum b : OutputSymbolTypesEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_OUTPUT_SYMBOL_TYPES = "outputSymbolTypes";
  private java.util.List<OutputSymbolTypesEnum> outputSymbolTypes = new java.util.ArrayList<>();

  public IdentifierResolutionRequest() { 
  }

  @JsonCreator
  public IdentifierResolutionRequest(
    @JsonProperty(value=JSON_PROPERTY_IDS, required=true) java.util.List<String> ids, 
    @JsonProperty(value=JSON_PROPERTY_INPUT_SYMBOL_TYPE, required=true) GetInputSymbolType inputSymbolType, 
    @JsonProperty(value=JSON_PROPERTY_OUTPUT_SYMBOL_TYPES, required=true) java.util.List<OutputSymbolTypesEnum> outputSymbolTypes
  ) {
    this();
    this.ids = ids;
    this.inputSymbolType = inputSymbolType;
    this.outputSymbolTypes = outputSymbolTypes;
  }

  public IdentifierResolutionRequest ids(java.util.List<String> ids) {
    this.ids = ids;
    return this;
  }

  public IdentifierResolutionRequest addIdsItem(String idsItem) {
    this.ids.add(idsItem);
    return this;
  }

   /**
   * Requested market securities or entities. All requested identifiers must be of the same type. Accepted identifiers include all FactSet Permanent Identifiers types, CUSIP, SEDOL, ISIN, and Tickers. This request value is sent back in the response as, &#x60;requestId&#39;.
   * @return ids
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "[\"GOOGL-US\"]", required = true, value = "Requested market securities or entities. All requested identifiers must be of the same type. Accepted identifiers include all FactSet Permanent Identifiers types, CUSIP, SEDOL, ISIN, and Tickers. This request value is sent back in the response as, `requestId'.")
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


  public IdentifierResolutionRequest inputSymbolType(GetInputSymbolType inputSymbolType) {
    this.inputSymbolType = inputSymbolType;
    return this;
  }

   /**
   * Get inputSymbolType
   * @return inputSymbolType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_INPUT_SYMBOL_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public GetInputSymbolType getInputSymbolType() {
    return inputSymbolType;
  }


  @JsonProperty(JSON_PROPERTY_INPUT_SYMBOL_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setInputSymbolType(GetInputSymbolType inputSymbolType) {
    this.inputSymbolType = inputSymbolType;
  }


  public IdentifierResolutionRequest outputSymbolTypes(java.util.List<OutputSymbolTypesEnum> outputSymbolTypes) {
    this.outputSymbolTypes = outputSymbolTypes;
    return this;
  }

  public IdentifierResolutionRequest addOutputSymbolTypesItem(OutputSymbolTypesEnum outputSymbolTypesItem) {
    this.outputSymbolTypes.add(outputSymbolTypesItem);
    return this;
  }

   /**
   * Requested identifiers to be returned. Multiple identifier types can be requested with each request.
   * @return outputSymbolTypes
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "[\"CUSIP\",\"SEDOL\"]", required = true, value = "Requested identifiers to be returned. Multiple identifier types can be requested with each request.")
  @JsonProperty(JSON_PROPERTY_OUTPUT_SYMBOL_TYPES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public java.util.List<OutputSymbolTypesEnum> getOutputSymbolTypes() {
    return outputSymbolTypes;
  }


  @JsonProperty(JSON_PROPERTY_OUTPUT_SYMBOL_TYPES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOutputSymbolTypes(java.util.List<OutputSymbolTypesEnum> outputSymbolTypes) {
    this.outputSymbolTypes = outputSymbolTypes;
  }


  /**
   * Return true if this identifierResolutionRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdentifierResolutionRequest identifierResolutionRequest = (IdentifierResolutionRequest) o;
    return Objects.equals(this.ids, identifierResolutionRequest.ids) &&
        Objects.equals(this.inputSymbolType, identifierResolutionRequest.inputSymbolType) &&
        Objects.equals(this.outputSymbolTypes, identifierResolutionRequest.outputSymbolTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ids, inputSymbolType, outputSymbolTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdentifierResolutionRequest {\n");
    sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
    sb.append("    inputSymbolType: ").append(toIndentedString(inputSymbolType)).append("\n");
    sb.append("    outputSymbolTypes: ").append(toIndentedString(outputSymbolTypes)).append("\n");
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

