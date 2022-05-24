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
    /// Distance of the current underlying level to the barrier level.
    /// </summary>
    [DataContract(Name = "_securitizedDerivative_notation_screener_valueRanges_get_data_distance")]
    public partial class SecuritizedDerivativeNotationScreenerValueRangesGetDataDistance : IEquatable<SecuritizedDerivativeNotationScreenerValueRangesGetDataDistance>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="SecuritizedDerivativeNotationScreenerValueRangesGetDataDistance" /> class.
        /// </summary>
        /// <param name="absolute">absolute.</param>
        /// <param name="relative">relative.</param>
        public SecuritizedDerivativeNotationScreenerValueRangesGetDataDistance(SecuritizedDerivativeNotationScreenerValueRangesGetDataDistanceAbsolute absolute = default(SecuritizedDerivativeNotationScreenerValueRangesGetDataDistanceAbsolute), SecuritizedDerivativeNotationScreenerValueRangesGetDataDistanceRelative relative = default(SecuritizedDerivativeNotationScreenerValueRangesGetDataDistanceRelative))
        {
            this.Absolute = absolute;
            this.Relative = relative;
        }

        /// <summary>
        /// Gets or Sets Absolute
        /// </summary>
        [DataMember(Name = "absolute", EmitDefaultValue = false)]
        public SecuritizedDerivativeNotationScreenerValueRangesGetDataDistanceAbsolute Absolute { get; set; }

        /// <summary>
        /// Gets or Sets Relative
        /// </summary>
        [DataMember(Name = "relative", EmitDefaultValue = false)]
        public SecuritizedDerivativeNotationScreenerValueRangesGetDataDistanceRelative Relative { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class SecuritizedDerivativeNotationScreenerValueRangesGetDataDistance {\n");
            sb.Append("  Absolute: ").Append(Absolute).Append("\n");
            sb.Append("  Relative: ").Append(Relative).Append("\n");
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
            return this.Equals(input as SecuritizedDerivativeNotationScreenerValueRangesGetDataDistance);
        }

        /// <summary>
        /// Returns true if SecuritizedDerivativeNotationScreenerValueRangesGetDataDistance instances are equal
        /// </summary>
        /// <param name="input">Instance of SecuritizedDerivativeNotationScreenerValueRangesGetDataDistance to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(SecuritizedDerivativeNotationScreenerValueRangesGetDataDistance input)
        {
            if (input == null)
            {
                return false;
            }
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
                {
                    hashCode = (hashCode * 59) + this.Absolute.GetHashCode();
                }
                if (this.Relative != null)
                {
                    hashCode = (hashCode * 59) + this.Relative.GetHashCode();
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
