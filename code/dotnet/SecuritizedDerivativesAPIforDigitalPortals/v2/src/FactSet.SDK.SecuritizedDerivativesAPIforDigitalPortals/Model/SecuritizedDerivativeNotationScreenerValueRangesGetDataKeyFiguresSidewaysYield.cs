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
    /// Sideways yield. It represents a hypothetical payout at maturity minus the ask price of the securitized derivative, under the assumption that all payout-influencing factors remain unchanged until maturity.
    /// </summary>
    [DataContract(Name = "_securitizedDerivative_notation_screener_valueRanges_get_data_keyFigures_sidewaysYield")]
    public partial class SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresSidewaysYield : IEquatable<SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresSidewaysYield>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresSidewaysYield" /> class.
        /// </summary>
        /// <param name="absolute">absolute.</param>
        /// <param name="relative">relative.</param>
        /// <param name="annualized">annualized.</param>
        public SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresSidewaysYield(SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresSidewaysYieldAbsolute absolute = default(SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresSidewaysYieldAbsolute), SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresSidewaysYieldRelative relative = default(SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresSidewaysYieldRelative), SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresSidewaysYieldAnnualized annualized = default(SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresSidewaysYieldAnnualized))
        {
            this.Absolute = absolute;
            this.Relative = relative;
            this.Annualized = annualized;
        }

        /// <summary>
        /// Gets or Sets Absolute
        /// </summary>
        [DataMember(Name = "absolute", EmitDefaultValue = false)]
        public SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresSidewaysYieldAbsolute Absolute { get; set; }

        /// <summary>
        /// Gets or Sets Relative
        /// </summary>
        [DataMember(Name = "relative", EmitDefaultValue = false)]
        public SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresSidewaysYieldRelative Relative { get; set; }

        /// <summary>
        /// Gets or Sets Annualized
        /// </summary>
        [DataMember(Name = "annualized", EmitDefaultValue = false)]
        public SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresSidewaysYieldAnnualized Annualized { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresSidewaysYield {\n");
            sb.Append("  Absolute: ").Append(Absolute).Append("\n");
            sb.Append("  Relative: ").Append(Relative).Append("\n");
            sb.Append("  Annualized: ").Append(Annualized).Append("\n");
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
            return this.Equals(input as SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresSidewaysYield);
        }

        /// <summary>
        /// Returns true if SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresSidewaysYield instances are equal
        /// </summary>
        /// <param name="input">Instance of SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresSidewaysYield to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(SecuritizedDerivativeNotationScreenerValueRangesGetDataKeyFiguresSidewaysYield input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Absolute == input.Absolute ||
                    (this.Absolute != null &&
                    this.Absolute.Equals(input.Absolute))
                ) && 
                (
                    this.Relative == input.Relative ||
                    (this.Relative != null &&
                    this.Relative.Equals(input.Relative))
                ) && 
                (
                    this.Annualized == input.Annualized ||
                    (this.Annualized != null &&
                    this.Annualized.Equals(input.Annualized))
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
                if (this.Absolute != null)
                    hashCode = hashCode * 59 + this.Absolute.GetHashCode();
                if (this.Relative != null)
                    hashCode = hashCode * 59 + this.Relative.GetHashCode();
                if (this.Annualized != null)
                    hashCode = hashCode * 59 + this.Annualized.GetHashCode();
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
