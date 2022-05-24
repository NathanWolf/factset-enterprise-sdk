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
    /// Value range of the distance in relative terms.
    /// </summary>
    [DataContract(Name = "_securitizedDerivative_notation_screener_valueRanges_get_data_distance_relative")]
    public partial class SecuritizedDerivativeNotationScreenerValueRangesGetDataDistanceRelative : IEquatable<SecuritizedDerivativeNotationScreenerValueRangesGetDataDistanceRelative>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="SecuritizedDerivativeNotationScreenerValueRangesGetDataDistanceRelative" /> class.
        /// </summary>
        /// <param name="minimum">minimum.</param>
        /// <param name="maximum">maximum.</param>
        public SecuritizedDerivativeNotationScreenerValueRangesGetDataDistanceRelative(SecuritizedDerivativeNotationRankingIntradayListDataPerformanceRelativeMinimum minimum = default(SecuritizedDerivativeNotationRankingIntradayListDataPerformanceRelativeMinimum), SecuritizedDerivativeNotationRankingIntradayListDataPerformanceRelativeMaximum maximum = default(SecuritizedDerivativeNotationRankingIntradayListDataPerformanceRelativeMaximum))
        {
            this.Minimum = minimum;
            this.Maximum = maximum;
        }

        /// <summary>
        /// Gets or Sets Minimum
        /// </summary>
        [DataMember(Name = "minimum", EmitDefaultValue = false)]
        public SecuritizedDerivativeNotationRankingIntradayListDataPerformanceRelativeMinimum Minimum { get; set; }

        /// <summary>
        /// Gets or Sets Maximum
        /// </summary>
        [DataMember(Name = "maximum", EmitDefaultValue = false)]
        public SecuritizedDerivativeNotationRankingIntradayListDataPerformanceRelativeMaximum Maximum { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class SecuritizedDerivativeNotationScreenerValueRangesGetDataDistanceRelative {\n");
            sb.Append("  Minimum: ").Append(Minimum).Append("\n");
            sb.Append("  Maximum: ").Append(Maximum).Append("\n");
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
            return this.Equals(input as SecuritizedDerivativeNotationScreenerValueRangesGetDataDistanceRelative);
        }

        /// <summary>
        /// Returns true if SecuritizedDerivativeNotationScreenerValueRangesGetDataDistanceRelative instances are equal
        /// </summary>
        /// <param name="input">Instance of SecuritizedDerivativeNotationScreenerValueRangesGetDataDistanceRelative to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(SecuritizedDerivativeNotationScreenerValueRangesGetDataDistanceRelative input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Minimum == input.Minimum ||
                    (this.Minimum != null &&
                    this.Minimum.Equals(input.Minimum))
                ) && 
                (
                    this.Maximum == input.Maximum ||
                    (this.Maximum != null &&
                    this.Maximum.Equals(input.Maximum))
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
                if (this.Minimum != null)
                {
                    hashCode = (hashCode * 59) + this.Minimum.GetHashCode();
                }
                if (this.Maximum != null)
                {
                    hashCode = (hashCode * 59) + this.Maximum.GetHashCode();
                }
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
