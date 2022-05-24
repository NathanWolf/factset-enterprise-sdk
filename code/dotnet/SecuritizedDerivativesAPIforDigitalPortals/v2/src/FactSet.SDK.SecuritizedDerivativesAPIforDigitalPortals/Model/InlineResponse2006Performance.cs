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
    /// Relative performance for different time ranges.
    /// </summary>
    [DataContract(Name = "inline_response_200_6_performance")]
    public partial class InlineResponse2006Performance : IEquatable<InlineResponse2006Performance>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse2006Performance" /> class.
        /// </summary>
        /// <param name="intraday">Intraday relative performance. That is the difference of a notation&#39;s most recent price from the current trading day against the most recent EOD closing price..</param>
        /// <param name="sinceIssue">sinceIssue.</param>
        /// <param name="endOfDay">endOfDay.</param>
        public InlineResponse2006Performance(decimal intraday = default(decimal), InlineResponse2006PerformanceSinceIssue sinceIssue = default(InlineResponse2006PerformanceSinceIssue), InlineResponse2006PerformanceEndOfDay endOfDay = default(InlineResponse2006PerformanceEndOfDay))
        {
            this.Intraday = intraday;
            this.SinceIssue = sinceIssue;
            this.EndOfDay = endOfDay;
        }

        /// <summary>
        /// Intraday relative performance. That is the difference of a notation&#39;s most recent price from the current trading day against the most recent EOD closing price.
        /// </summary>
        /// <value>Intraday relative performance. That is the difference of a notation&#39;s most recent price from the current trading day against the most recent EOD closing price.</value>
        [DataMember(Name = "intraday", EmitDefaultValue = false)]
        public decimal Intraday { get; set; }

        /// <summary>
        /// Gets or Sets SinceIssue
        /// </summary>
        [DataMember(Name = "sinceIssue", EmitDefaultValue = false)]
        public InlineResponse2006PerformanceSinceIssue SinceIssue { get; set; }

        /// <summary>
        /// Gets or Sets EndOfDay
        /// </summary>
        [DataMember(Name = "endOfDay", EmitDefaultValue = false)]
        public InlineResponse2006PerformanceEndOfDay EndOfDay { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class InlineResponse2006Performance {\n");
            sb.Append("  Intraday: ").Append(Intraday).Append("\n");
            sb.Append("  SinceIssue: ").Append(SinceIssue).Append("\n");
            sb.Append("  EndOfDay: ").Append(EndOfDay).Append("\n");
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
            return this.Equals(input as InlineResponse2006Performance);
        }

        /// <summary>
        /// Returns true if InlineResponse2006Performance instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse2006Performance to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse2006Performance input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Intraday == input.Intraday ||
                    this.Intraday.Equals(input.Intraday)
                ) && 
                (
                    this.SinceIssue == input.SinceIssue ||
                    (this.SinceIssue != null &&
                    this.SinceIssue.Equals(input.SinceIssue))
                ) && 
                (
                    this.EndOfDay == input.EndOfDay ||
                    (this.EndOfDay != null &&
                    this.EndOfDay.Equals(input.EndOfDay))
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
                hashCode = (hashCode * 59) + this.Intraday.GetHashCode();
                if (this.SinceIssue != null)
                {
                    hashCode = (hashCode * 59) + this.SinceIssue.GetHashCode();
                }
                if (this.EndOfDay != null)
                {
                    hashCode = (hashCode * 59) + this.EndOfDay.GetHashCode();
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
