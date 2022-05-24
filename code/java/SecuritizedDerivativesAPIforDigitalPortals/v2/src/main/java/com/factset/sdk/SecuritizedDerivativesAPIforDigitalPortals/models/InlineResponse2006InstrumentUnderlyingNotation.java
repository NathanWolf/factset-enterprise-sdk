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


package com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models.InlineResponse2006InstrumentUnderlyingNotationInstrument;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.JSON;


/**
 * Notation of the underlying. All contained attributes are null if there is no notation for the underlying.
 */
@ApiModel(description = "Notation of the underlying. All contained attributes are null if there is no notation for the underlying.")
@JsonPropertyOrder({
  InlineResponse2006InstrumentUnderlyingNotation.JSON_PROPERTY_ID,
  InlineResponse2006InstrumentUnderlyingNotation.JSON_PROPERTY_INSTRUMENT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineResponse2006InstrumentUnderlyingNotation implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_INSTRUMENT = "instrument";
  private InlineResponse2006InstrumentUnderlyingNotationInstrument instrument;

  public InlineResponse2006InstrumentUnderlyingNotation() { 
  }

  public InlineResponse2006InstrumentUnderlyingNotation id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Identifier of the notation.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Identifier of the notation.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }


  public InlineResponse2006InstrumentUnderlyingNotation instrument(InlineResponse2006InstrumentUnderlyingNotationInstrument instrument) {
    this.instrument = instrument;
    return this;
  }

   /**
   * Get instrument
   * @return instrument
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INSTRUMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InlineResponse2006InstrumentUnderlyingNotationInstrument getInstrument() {
    return instrument;
  }


  @JsonProperty(JSON_PROPERTY_INSTRUMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInstrument(InlineResponse2006InstrumentUnderlyingNotationInstrument instrument) {
    this.instrument = instrument;
  }


  /**
   * Return true if this inline_response_200_6_instrument_underlying_notation object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2006InstrumentUnderlyingNotation inlineResponse2006InstrumentUnderlyingNotation = (InlineResponse2006InstrumentUnderlyingNotation) o;
    return Objects.equals(this.id, inlineResponse2006InstrumentUnderlyingNotation.id) &&
        Objects.equals(this.instrument, inlineResponse2006InstrumentUnderlyingNotation.instrument);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, instrument);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2006InstrumentUnderlyingNotation {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    instrument: ").append(toIndentedString(instrument)).append("\n");
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

