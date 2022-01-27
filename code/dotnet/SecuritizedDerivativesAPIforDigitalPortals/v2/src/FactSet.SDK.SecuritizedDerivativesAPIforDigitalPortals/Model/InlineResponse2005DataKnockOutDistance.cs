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
    /// Value range of the distance of the current underlying level to the knock-out.
    /// </summary>
    [DataContract(Name = "inline_response_200_5_data_knockOut_distance")]
    public partial class InlineResponse2005DataKnockOutDistance : IEquatable<InlineResponse2005DataKnockOutDistance>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse2005DataKnockOutDistance" /> class.
        /// </summary>
        /// <param name="absolute">absolute.</param>
        /// <param name="relative">relative.</param>
        public InlineResponse2005DataKnockOutDistance(InlineResponse2005DataStrikeDistanceAbsolute absolute = default(InlineResponse2005DataStrikeDistanceAbsolute), InlineResponse2005DataStrikeDistanceRelative relative = default(InlineResponse2005DataStrikeDistanceRelative))
        {
            this.Absolute = absolute;
            this.Relative = relative;
        }

        /// <summary>
        /// Gets or Sets Absolute
        /// </summary>
        [DataMember(Name = "absolute", EmitDefaultValue = false)]
        public InlineResponse2005DataStrikeDistanceAbsolute Absolute { get; set; }

        /// <summary>
        /// Gets or Sets Relative
        /// </summary>
        [DataMember(Name = "relative", EmitDefaultValue = false)]
        public InlineResponse2005DataStrikeDistanceRelative Relative { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class InlineResponse2005DataKnockOutDistance {\n");
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
            return this.Equals(input as InlineResponse2005DataKnockOutDistance);
        }

        /// <summary>
        /// Returns true if InlineResponse2005DataKnockOutDistance instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse2005DataKnockOutDistance to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse2005DataKnockOutDistance input)
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
