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
    /// Value ranges related to the delta.
    /// </summary>
    [DataContract(Name = "inline_response_200_5_data_keyFigures_delta")]
    public partial class InlineResponse2005DataKeyFiguresDelta : IEquatable<InlineResponse2005DataKeyFiguresDelta>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse2005DataKeyFiguresDelta" /> class.
        /// </summary>
        /// <param name="effective">effective.</param>
        /// <param name="unadjusted">unadjusted.</param>
        public InlineResponse2005DataKeyFiguresDelta(InlineResponse2005DataKeyFiguresDeltaEffective effective = default(InlineResponse2005DataKeyFiguresDeltaEffective), InlineResponse2005DataKeyFiguresDeltaUnadjusted unadjusted = default(InlineResponse2005DataKeyFiguresDeltaUnadjusted))
        {
            this.Effective = effective;
            this.Unadjusted = unadjusted;
        }

        /// <summary>
        /// Gets or Sets Effective
        /// </summary>
        [DataMember(Name = "effective", EmitDefaultValue = false)]
        public InlineResponse2005DataKeyFiguresDeltaEffective Effective { get; set; }

        /// <summary>
        /// Gets or Sets Unadjusted
        /// </summary>
        [DataMember(Name = "unadjusted", EmitDefaultValue = false)]
        public InlineResponse2005DataKeyFiguresDeltaUnadjusted Unadjusted { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class InlineResponse2005DataKeyFiguresDelta {\n");
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
            return this.Equals(input as InlineResponse2005DataKeyFiguresDelta);
        }

        /// <summary>
        /// Returns true if InlineResponse2005DataKeyFiguresDelta instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse2005DataKeyFiguresDelta to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse2005DataKeyFiguresDelta input)
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
