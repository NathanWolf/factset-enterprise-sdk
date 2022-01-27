/*
 * Prime Developer Trial
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = FactSet.SDK.SecuritizedDerivativesAPIforDigitalPortals.Client.OpenAPIDateConverter;

namespace FactSet.SDK.SecuritizedDerivativesAPIforDigitalPortals.Model
{
    /// <summary>
    /// Delta. It represents the first partial derivative of the function determining the derivative notation&#39;s theoretical price with respect to the underlying level, evaluated at the underlying level. Delta indicates the ratio of the absolute change of the price of a derivative for an indefinitely small absolute change in the underlying level, thus it represents the price sensitivity of the derivative relative to changes in the underlying level. This key figure is calculated for plain vanilla warrants only.
    /// </summary>
    [DataContract(Name = "_securitizedDerivative_notation_screener_valueRanges_get_data_keyFigures_delta")]
    public partial class SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresDelta : IEquatable<SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresDelta>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresDelta" /> class.
        /// </summary>
        /// <param name="effective">effective.</param>
        /// <param name="unadjusted">unadjusted.</param>
        public SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresDelta(SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresDeltaEffective effective = default(SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresDeltaEffective), SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresDeltaUnadjusted unadjusted = default(SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresDeltaUnadjusted))
        {
            this.Effective = effective;
            this.Unadjusted = unadjusted;
        }

        /// <summary>
        /// Gets or Sets Effective
        /// </summary>
        [DataMember(Name = "effective", EmitDefaultValue = false)]
        public SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresDeltaEffective Effective { get; set; }

        /// <summary>
        /// Gets or Sets Unadjusted
        /// </summary>
        [DataMember(Name = "unadjusted", EmitDefaultValue = false)]
        public SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresDeltaUnadjusted Unadjusted { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresDelta {\n");
            sb.Append("  Effective: ").Append(Effective).Append("\n");
            sb.Append("  Unadjusted: ").Append(Unadjusted).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresDelta);
        }

        /// <summary>
        /// Returns true if SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresDelta instances are equal
        /// </summary>
        /// <param name="input">Instance of SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresDelta to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresDelta input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Effective == input.Effective ||
                    (this.Effective != null &&
                    this.Effective.Equals(input.Effective))
                ) && 
                (
                    this.Unadjusted == input.Unadjusted ||
                    (this.Unadjusted != null &&
                    this.Unadjusted.Equals(input.Unadjusted))
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this.Effective != null)
                    hashCode = hashCode * 59 + this.Effective.GetHashCode();
                if (this.Unadjusted != null)
                    hashCode = hashCode * 59 + this.Unadjusted.GetHashCode();
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        public IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
