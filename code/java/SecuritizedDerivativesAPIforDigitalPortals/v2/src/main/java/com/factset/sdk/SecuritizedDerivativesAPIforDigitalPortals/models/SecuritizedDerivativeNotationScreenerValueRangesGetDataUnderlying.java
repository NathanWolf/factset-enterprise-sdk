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
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models.SecuritizedDerivativeNotationRankingIntradayListDataUnderlyingInstrument;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models.SecuritizedDerivativeNotationRankingIntradayListDataUnderlyingNotation;
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
 * Underlying selection. A list of underlyings can be selected by either using their instrument identifiers, see parameter &#x60;underlying.instrument.ids&#x60; or by using their notation identifiers, see parameter &#x60;underlying.notation.ids&#x60; but not both at the same time. Only one of the provided identifiers needs to be matched in order for a securitized derivative to be returned in the result.   The list of underlyings is particularly useful to search for securitized derivatives that have very similar but not exactly the same underlyings such as futures with different maturities on a given commodity, e.g. brent crude oil. For such a list of underlyings, a barrier restriction in absolute terms, see for example parameter &#x60;singleBarriers.level.absolute&#x60; or &#x60;rangeBarriers.upper.level.absolute&#x60;, will provide a meaningful result, whereas for a list of non-similar underlyings, such as different stocks, a barrier restriction in absolute terms will not provide a meaningful result. This is due to the fact that futures on the same commodity are comparable in regards to their prices while two different stocks are not comparable.   Parameters in relative terms, see for example parameter &#x60;singleBarriers.distance.relative&#x60;, are generally comparable and will provide meaningful result for a list of similar as well as for a list of non-similar underlyings.   For the selection of the effective underling of factor certificates, use &#x60;factorCertificates.effectiveUnderlying.instrument.ids&#x60;.
 */
@ApiModel(description = "Underlying selection. A list of underlyings can be selected by either using their instrument identifiers, see parameter `underlying.instrument.ids` or by using their notation identifiers, see parameter `underlying.notation.ids` but not both at the same time. Only one of the provided identifiers needs to be matched in order for a securitized derivative to be returned in the result.   The list of underlyings is particularly useful to search for securitized derivatives that have very similar but not exactly the same underlyings such as futures with different maturities on a given commodity, e.g. brent crude oil. For such a list of underlyings, a barrier restriction in absolute terms, see for example parameter `singleBarriers.level.absolute` or `rangeBarriers.upper.level.absolute`, will provide a meaningful result, whereas for a list of non-similar underlyings, such as different stocks, a barrier restriction in absolute terms will not provide a meaningful result. This is due to the fact that futures on the same commodity are comparable in regards to their prices while two different stocks are not comparable.   Parameters in relative terms, see for example parameter `singleBarriers.distance.relative`, are generally comparable and will provide meaningful result for a list of similar as well as for a list of non-similar underlyings.   For the selection of the effective underling of factor certificates, use `factorCertificates.effectiveUnderlying.instrument.ids`.")
@JsonPropertyOrder({
  SecuritizedDerivativeNotationScreenerValueRangesGetDataUnderlying.JSON_PROPERTY_INSTRUMENT,
  SecuritizedDerivativeNotationScreenerValueRangesGetDataUnderlying.JSON_PROPERTY_NOTATION
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SecuritizedDerivativeNotationScreenerValueRangesGetDataUnderlying implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_INSTRUMENT = "instrument";
  private SecuritizedDerivativeNotationRankingIntradayListDataUnderlyingInstrument instrument;

  public static final String JSON_PROPERTY_NOTATION = "notation";
  private SecuritizedDerivativeNotationRankingIntradayListDataUnderlyingNotation notation;

  public SecuritizedDerivativeNotationScreenerValueRangesGetDataUnderlying() { 
  }

  public SecuritizedDerivativeNotationScreenerValueRangesGetDataUnderlying instrument(SecuritizedDerivativeNotationRankingIntradayListDataUnderlyingInstrument instrument) {
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

  public SecuritizedDerivativeNotationRankingIntradayListDataUnderlyingInstrument getInstrument() {
    return instrument;
  }


  @JsonProperty(JSON_PROPERTY_INSTRUMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInstrument(SecuritizedDerivativeNotationRankingIntradayListDataUnderlyingInstrument instrument) {
    this.instrument = instrument;
  }


  public SecuritizedDerivativeNotationScreenerValueRangesGetDataUnderlying notation(SecuritizedDerivativeNotationRankingIntradayListDataUnderlyingNotation notation) {
    this.notation = notation;
    return this;
  }

   /**
   * Get notation
   * @return notation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NOTATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SecuritizedDerivativeNotationRankingIntradayListDataUnderlyingNotation getNotation() {
    return notation;
  }


  @JsonProperty(JSON_PROPERTY_NOTATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNotation(SecuritizedDerivativeNotationRankingIntradayListDataUnderlyingNotation notation) {
    this.notation = notation;
  }


  /**
   * Return true if this _securitizedDerivative_notation_screener_valueRanges_get_data_underlying object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecuritizedDerivativeNotationScreenerValueRangesGetDataUnderlying securitizedDerivativeNotationScreenerValueRangesGetDataUnderlying = (SecuritizedDerivativeNotationScreenerValueRangesGetDataUnderlying) o;
    return Objects.equals(this.instrument, securitizedDerivativeNotationScreenerValueRangesGetDataUnderlying.instrument) &&
        Objects.equals(this.notation, securitizedDerivativeNotationScreenerValueRangesGetDataUnderlying.notation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instrument, notation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecuritizedDerivativeNotationScreenerValueRangesGetDataUnderlying {\n");
    sb.append("    instrument: ").append(toIndentedString(instrument)).append("\n");
    sb.append("    notation: ").append(toIndentedString(notation)).append("\n");
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

