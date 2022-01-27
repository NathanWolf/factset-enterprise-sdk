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
    /// Value range for the time range three years.
    /// </summary>
    [DataContract(Name = "_securitizedDerivative_notation_screener_valueRanges_get_data_performance_endOfDay_years3")]
    public partial class SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayYears3 : IEquatable<SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayYears3>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayYears3" /> class.
        /// </summary>
        /// <param name="minimum">minimum.</param>
        /// <param name="maximum">maximum.</param>
        public SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayYears3(SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMinimum minimum = default(SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMinimum), SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMaximum maximum = default(SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMaximum))
        {
            this.Minimum = minimum;
            this.Maximum = maximum;
        }

        /// <summary>
        /// Gets or Sets Minimum
        /// </summary>
        [DataMember(Name = "minimum", EmitDefaultValue = false)]
        public SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMinimum Minimum { get; set; }

        /// <summary>
        /// Gets or Sets Maximum
        /// </summary>
        [DataMember(Name = "maximum", EmitDefaultValue = false)]
        public SecuritizedDerivativeNotationScreenerValueRangesGetDataCapitalProtectionMaximum Maximum { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayYears3 {\n");
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
            return this.Equals(input as SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayYears3);
        }

        /// <summary>
        /// Returns true if SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayYears3 instances are equal
        /// </summary>
        /// <param name="input">Instance of SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayYears3 to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(SecuritizedDerivativeNotationScreenerValueRangesGetDataPerformanceEndOfDayYears3 input)
        {
            if (input == null)
                return false;

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
                    hashCode = hashCode * 59 + this.Minimum.GetHashCode();
                if (this.Maximum != null)
                    hashCode = hashCode * 59 + this.Maximum.GetHashCode();
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
