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
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.models.SecuritizedDerivativeIssuerSearchDataFactorCertificatesEffectiveUnderlyingInstrument;
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
 * Selection of the effective underlying. The underlying of a factor certificate is usually a factor index which is an artificial index used to calculate the leveraged daily performance of another financial instrument called its effective underlying. Only issuers that have issued at least one factor certificate on an effective underlying in the provided list are returned.
 */
@ApiModel(description = "Selection of the effective underlying. The underlying of a factor certificate is usually a factor index which is an artificial index used to calculate the leveraged daily performance of another financial instrument called its effective underlying. Only issuers that have issued at least one factor certificate on an effective underlying in the provided list are returned.")
@JsonPropertyOrder({
  SecuritizedDerivativeIssuerSearchDataFactorCertificatesEffectiveUnderlying.JSON_PROPERTY_INSTRUMENT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SecuritizedDerivativeIssuerSearchDataFactorCertificatesEffectiveUnderlying implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String JSON_PROPERTY_INSTRUMENT = "instrument";
  private SecuritizedDerivativeIssuerSearchDataFactorCertificatesEffectiveUnderlyingInstrument instrument;


  public SecuritizedDerivativeIssuerSearchDataFactorCertificatesEffectiveUnderlying instrument(SecuritizedDerivativeIssuerSearchDataFactorCertificatesEffectiveUnderlyingInstrument instrument) {
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

  public SecuritizedDerivativeIssuerSearchDataFactorCertificatesEffectiveUnderlyingInstrument getInstrument() {
    return instrument;
  }


  @JsonProperty(JSON_PROPERTY_INSTRUMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInstrument(SecuritizedDerivativeIssuerSearchDataFactorCertificatesEffectiveUnderlyingInstrument instrument) {
    this.instrument = instrument;
  }


  /**
   * Return true if this _securitizedDerivative_issuer_search_data_factorCertificates_effectiveUnderlying object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecuritizedDerivativeIssuerSearchDataFactorCertificatesEffectiveUnderlying securitizedDerivativeIssuerSearchDataFactorCertificatesEffectiveUnderlying = (SecuritizedDerivativeIssuerSearchDataFactorCertificatesEffectiveUnderlying) o;
    return Objects.equals(this.instrument, securitizedDerivativeIssuerSearchDataFactorCertificatesEffectiveUnderlying.instrument);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instrument);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecuritizedDerivativeIssuerSearchDataFactorCertificatesEffectiveUnderlying {\n");
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

