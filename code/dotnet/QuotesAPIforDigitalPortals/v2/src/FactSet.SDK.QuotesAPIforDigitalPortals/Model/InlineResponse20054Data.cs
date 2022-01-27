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
using OpenAPIDateConverter = FactSet.SDK.QuotesAPIforDigitalPortals.Client.OpenAPIDateConverter;

namespace FactSet.SDK.QuotesAPIforDigitalPortals.Model
{
    /// <summary>
    /// Key dates and details.
    /// </summary>
    [DataContract(Name = "inline_response_200_54_data")]
    public partial class InlineResponse20054Data : IEquatable<InlineResponse20054Data>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse20054Data" /> class.
        /// </summary>
        /// <param name="occurrence">occurrence.</param>
        /// <param name="interestRate">interestRate.</param>
        /// <param name="dayCountConvention">dayCountConvention.</param>
        public InlineResponse20054Data(InlineResponse20054DataOccurrence occurrence = default(InlineResponse20054DataOccurrence), InlineResponse20054DataInterestRate interestRate = default(InlineResponse20054DataInterestRate), InlineResponse20054DataDayCountConvention dayCountConvention = default(InlineResponse20054DataDayCountConvention))
        {
            this.Occurrence = occurrence;
            this.InterestRate = interestRate;
            this.DayCountConvention = dayCountConvention;
        }

        /// <summary>
        /// Gets or Sets Occurrence
        /// </summary>
        [DataMember(Name = "occurrence", EmitDefaultValue = false)]
        public InlineResponse20054DataOccurrence Occurrence { get; set; }

        /// <summary>
        /// Gets or Sets InterestRate
        /// </summary>
        [DataMember(Name = "interestRate", EmitDefaultValue = false)]
        public InlineResponse20054DataInterestRate InterestRate { get; set; }

        /// <summary>
        /// Gets or Sets DayCountConvention
        /// </summary>
        [DataMember(Name = "dayCountConvention", EmitDefaultValue = false)]
        public InlineResponse20054DataDayCountConvention DayCountConvention { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class InlineResponse20054Data {\n");
            sb.Append("  Occurrence: ").Append(Occurrence).Append("\n");
            sb.Append("  InterestRate: ").Append(InterestRate).Append("\n");
            sb.Append("  DayCountConvention: ").Append(DayCountConvention).Append("\n");
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
            return this.Equals(input as InlineResponse20054Data);
        }

        /// <summary>
        /// Returns true if InlineResponse20054Data instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse20054Data to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse20054Data input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Occurrence == input.Occurrence ||
                    (this.Occurrence != null &&
                    this.Occurrence.Equals(input.Occurrence))
                ) && 
                (
                    this.InterestRate == input.InterestRate ||
                    (this.InterestRate != null &&
                    this.InterestRate.Equals(input.InterestRate))
                ) && 
                (
                    this.DayCountConvention == input.DayCountConvention ||
                    (this.DayCountConvention != null &&
                    this.DayCountConvention.Equals(input.DayCountConvention))
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
                if (this.Occurrence != null)
                    hashCode = hashCode * 59 + this.Occurrence.GetHashCode();
                if (this.InterestRate != null)
                    hashCode = hashCode * 59 + this.InterestRate.GetHashCode();
                if (this.DayCountConvention != null)
                    hashCode = hashCode * 59 + this.DayCountConvention.GetHashCode();
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
