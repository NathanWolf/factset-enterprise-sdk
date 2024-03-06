/*
 * Portfolio Reporting Batcher
 *
 * The Portfolio Reporting Batcher (PRB) API allows clients to systematically leverage functionalities of the PRB application. With the initial release, clients can - trigger existing jobs - check status of running jobs - get various details of existing jobs
 *
 * The version of the OpenAPI document: 0.4.0
 * Contact: api@factset.com
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
using OpenAPIDateConverter = FactSet.SDK.PortfolioReportingBatcher.Client.OpenAPIDateConverter;

namespace FactSet.SDK.PortfolioReportingBatcher.Model
{
    /// <summary>
    /// Used only for jobs where type is ADF. If using dates override, please provide both start date and end date.
    /// </summary>
    [DataContract(Name = "jobOverrides_dates")]
    public partial class JobOverridesDates : IEquatable<JobOverridesDates>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="JobOverridesDates" /> class.
        /// </summary>
        /// <param name="end">The end date in format YYYY-MM-DD.</param>
        /// <param name="start">The start date in format YYYY-MM-DD.</param>
        public JobOverridesDates(DateTime end = default(DateTime), DateTime start = default(DateTime))
        {
            this.End = end;
            this.Start = start;
        }

        /// <summary>
        /// The end date in format YYYY-MM-DD
        /// </summary>
        /// <value>The end date in format YYYY-MM-DD</value>
        [DataMember(Name = "end", EmitDefaultValue = false)]
        [JsonConverter(typeof(OpenAPIDateConverter))]
        public DateTime End { get; set; }

        /// <summary>
        /// The start date in format YYYY-MM-DD
        /// </summary>
        /// <value>The start date in format YYYY-MM-DD</value>
        [DataMember(Name = "start", EmitDefaultValue = false)]
        [JsonConverter(typeof(OpenAPIDateConverter))]
        public DateTime Start { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class JobOverridesDates {\n");
            sb.Append("  End: ").Append(End).Append("\n");
            sb.Append("  Start: ").Append(Start).Append("\n");
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
            return this.Equals(input as JobOverridesDates);
        }

        /// <summary>
        /// Returns true if JobOverridesDates instances are equal
        /// </summary>
        /// <param name="input">Instance of JobOverridesDates to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(JobOverridesDates input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.End == input.End ||
                    (this.End != null &&
                    this.End.Equals(input.End))
                ) && 
                (
                    this.Start == input.Start ||
                    (this.Start != null &&
                    this.Start.Equals(input.Start))
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
                if (this.End != null)
                {
                    hashCode = (hashCode * 59) + this.End.GetHashCode();
                }
                if (this.Start != null)
                {
                    hashCode = (hashCode * 59) + this.Start.GetHashCode();
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
