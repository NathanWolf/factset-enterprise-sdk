/*
 * Quotes API For Digital Portals
 *
 * The quotes API combines endpoints for retrieving security end-of-day, delayed, and realtime prices with performance key figures and basic reference data on the security and market level.  The API supports over 20 different price types for each quote and comes with basic search endpoints based on security identifiers and instrument names. Market coverage is included in the *Sample Use Cases* section below.  The Digital Portal use case is focused on high-performance applications that are  * serving millions of end-users, * accessible by client browsers via the internet, * supporting subscriptions for streamed updates out-of-the-box, * typically combining a wide variety of *for Digital Portals*-APIs into a highly use-case specific solution for customers, * integrated into complex infrastructures such as existing frontend frameworks, authentication services.  All APIs labelled *for Digital Portals* have been designed for direct use by client web applications and feature extreme low latency: The average response time across all endpoints is 30 ms whereas 99% of all requests are answered in close to under 300ms.  See the Time Series API for Digital Portals for direct access to price histories, and the News API for Digital Portals for searching and fetching related news.
 *
 * The version of the OpenAPI document: 2
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
    /// Time range that this translation is valid for.
    /// </summary>
    [DataContract(Name = "inline_response_200_55_data_validity")]
    public partial class InlineResponse20055DataValidity : IEquatable<InlineResponse20055DataValidity>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse20055DataValidity" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected InlineResponse20055DataValidity() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse20055DataValidity" /> class.
        /// </summary>
        /// <param name="start">The starting point of the time range (inclusive). (required).</param>
        /// <param name="end">The ending point of the time range (exclusive), or &#x60;null&#x60; to indicate that the time range extends indefinitely into the future. (required).</param>
        public InlineResponse20055DataValidity(string start = default(string), string end = default(string))
        {
            // to ensure "start" is required (not null)
            if (start == null) {
                throw new ArgumentNullException("start is a required property for InlineResponse20055DataValidity and cannot be null");
            }
            this.Start = start;
            // to ensure "end" is required (not null)
            if (end == null) {
                throw new ArgumentNullException("end is a required property for InlineResponse20055DataValidity and cannot be null");
            }
            this.End = end;
        }

        /// <summary>
        /// The starting point of the time range (inclusive).
        /// </summary>
        /// <value>The starting point of the time range (inclusive).</value>
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
            StringBuilder sb = new StringBuilder();
            sb.Append("class InlineResponse20055DataValidity {\n");
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
            return this.Equals(input as InlineResponse20055DataValidity);
        }

        /// <summary>
        /// Returns true if InlineResponse20055DataValidity instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse20055DataValidity to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse20055DataValidity input)
        {
            if (input == null)
            {
                return false;
            }
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
                {
                    hashCode = (hashCode * 59) + this.Start.GetHashCode();
                }
                if (this.End != null)
                {
                    hashCode = (hashCode * 59) + this.End.GetHashCode();
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
