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
    /// Bid-based performance.
    /// </summary>
    [DataContract(Name = "inline_response_200_3_data_performanceIssue_bid")]
    public partial class InlineResponse2003DataPerformanceIssueBid : IEquatable<InlineResponse2003DataPerformanceIssueBid>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse2003DataPerformanceIssueBid" /> class.
        /// </summary>
        /// <param name="absolute">Performance in absolute terms..</param>
        /// <param name="relative">Performance relative to the issue price..</param>
        /// <param name="annualized">Annualized performance relative to the issue price..</param>
        public InlineResponse2003DataPerformanceIssueBid(decimal absolute = default(decimal), decimal relative = default(decimal), decimal annualized = default(decimal))
        {
            this.Absolute = absolute;
            this.Relative = relative;
            this.Annualized = annualized;
        }

        /// <summary>
        /// Performance in absolute terms.
        /// </summary>
        /// <value>Performance in absolute terms.</value>
        [DataMember(Name = "absolute", EmitDefaultValue = false)]
        public decimal Absolute { get; set; }

        /// <summary>
        /// Performance relative to the issue price.
        /// </summary>
        /// <value>Performance relative to the issue price.</value>
        [DataMember(Name = "relative", EmitDefaultValue = false)]
        public decimal Relative { get; set; }

        /// <summary>
        /// Annualized performance relative to the issue price.
        /// </summary>
        /// <value>Annualized performance relative to the issue price.</value>
        [DataMember(Name = "annualized", EmitDefaultValue = false)]
        public decimal Annualized { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class InlineResponse2003DataPerformanceIssueBid {\n");
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
            return this.Equals(input as InlineResponse2003DataPerformanceIssueBid);
        }

        /// <summary>
        /// Returns true if InlineResponse2003DataPerformanceIssueBid instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse2003DataPerformanceIssueBid to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse2003DataPerformanceIssueBid input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Absolute == input.Absolute ||
                    this.Absolute.Equals(input.Absolute)
                ) && 
                (
                    this.Relative == input.Relative ||
                    this.Relative.Equals(input.Relative)
                ) && 
                (
                    this.Annualized == input.Annualized ||
                    this.Annualized.Equals(input.Annualized)
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
                hashCode = hashCode * 59 + this.Absolute.GetHashCode();
                hashCode = hashCode * 59 + this.Relative.GetHashCode();
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
