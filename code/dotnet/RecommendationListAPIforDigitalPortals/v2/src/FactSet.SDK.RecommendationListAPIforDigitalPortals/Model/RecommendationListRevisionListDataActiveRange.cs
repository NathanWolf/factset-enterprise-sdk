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
using OpenAPIDateConverter = FactSet.SDK.RecommendationListAPIforDigitalPortals.Client.OpenAPIDateConverter;

namespace FactSet.SDK.RecommendationListAPIforDigitalPortals.Model
{
    /// <summary>
    /// Restrict the result list to revisions which have been active during the specified time range.
    /// </summary>
    [DataContract(Name = "_recommendationList_revision_list_data_activeRange")]
    public partial class RecommendationListRevisionListDataActiveRange : IEquatable<RecommendationListRevisionListDataActiveRange>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="RecommendationListRevisionListDataActiveRange" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected RecommendationListRevisionListDataActiveRange() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="RecommendationListRevisionListDataActiveRange" /> class.
        /// </summary>
        /// <param name="start">The starting point of the time range (inclusive), or &#x60;null&#x60; to indicate that the time range extends indefinitely into the past. (required).</param>
        /// <param name="end">The ending point of the time range (exclusive), or &#x60;null&#x60; to indicate that the time range extends indefinitely into the future. (required).</param>
        public RecommendationListRevisionListDataActiveRange(string start = default(string), string end = default(string))
        {
            // to ensure "start" is required (not null)
            if (start == null) {
                throw new ArgumentNullException("start is a required property for RecommendationListRevisionListDataActiveRange and cannot be null");
            }
            this.Start = start;
            // to ensure "end" is required (not null)
            if (end == null) {
                throw new ArgumentNullException("end is a required property for RecommendationListRevisionListDataActiveRange and cannot be null");
            }
            this.End = end;
        }

        /// <summary>
        /// The starting point of the time range (inclusive), or &#x60;null&#x60; to indicate that the time range extends indefinitely into the past.
        /// </summary>
        /// <value>The starting point of the time range (inclusive), or &#x60;null&#x60; to indicate that the time range extends indefinitely into the past.</value>
        [DataMember(Name = "start", IsRequired = true, EmitDefaultValue = false)]
        public string Start { get; set; }

        /// <summary>
        /// The ending point of the time range (exclusive), or &#x60;null&#x60; to indicate that the time range extends indefinitely into the future.
        /// </summary>
        /// <value>The ending point of the time range (exclusive), or &#x60;null&#x60; to indicate that the time range extends indefinitely into the future.</value>
        [DataMember(Name = "end", IsRequired = true, EmitDefaultValue = false)]
        public string End { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class RecommendationListRevisionListDataActiveRange {\n");
            sb.Append("  Start: ").Append(Start).Append("\n");
            sb.Append("  End: ").Append(End).Append("\n");
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
            return this.Equals(input as RecommendationListRevisionListDataActiveRange);
        }

        /// <summary>
        /// Returns true if RecommendationListRevisionListDataActiveRange instances are equal
        /// </summary>
        /// <param name="input">Instance of RecommendationListRevisionListDataActiveRange to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(RecommendationListRevisionListDataActiveRange input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Start == input.Start ||
                    (this.Start != null &&
                    this.Start.Equals(input.Start))
                ) && 
                (
                    this.End == input.End ||
                    (this.End != null &&
                    this.End.Equals(input.End))
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
                if (this.Start != null)
                    hashCode = hashCode * 59 + this.Start.GetHashCode();
                if (this.End != null)
                    hashCode = hashCode * 59 + this.End.GetHashCode();
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
