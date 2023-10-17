/*
 * Quotes API For Digital Portals
 *
 * The Quotes API combines endpoints for retrieving security end-of-day, delayed, and realtime prices with performance key figures and basic reference data on the security and market level.  The API supports over 20 different price types for each quote and comes with basic search endpoints based on security identifiers and instrument names. Market coverage is included in the *Sample Use Cases* section below.  The Digital Portal use case is focused on high-performance applications that are  * serving millions of end-users, * accessible by client browsers via the internet, * supporting subscriptions for streamed updates out-of-the-box, * typically combining a wide variety of *for Digital Portals*-APIs into a highly use-case specific solution for customers, * integrated into complex infrastructures such as existing frontend frameworks, authentication services.  All APIs labelled *for Digital Portals* have been designed for direct use by client web applications and feature extreme low latency: The average response time across all endpoints is 30 ms whereas 99% of all requests are answered in close to under 300ms.  See the [Time Series API for Digital Portals](https://developer.factset.com/api-catalog/time-series-api-digital-portals) for direct access to price histories, and the [News API for Digital Portals](https://developer.factset.com/api-catalog/news-api-digital-portals) for searching and fetching related news. 
 *
 * The version of the OpenAPI document: 3.0.0
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
using OpenAPIDateConverter = FactSet.SDK.RealTimeQuotes.Client.OpenAPIDateConverter;

namespace FactSet.SDK.RealTimeQuotes.Model
{
    /// <summary>
    /// InlineResponse20064Ratings
    /// </summary>
    [DataContract(Name = "inline_response_200_64_ratings")]
    public partial class InlineResponse20064Ratings : IEquatable<InlineResponse20064Ratings>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse20064Ratings" /> class.
        /// </summary>
        /// <param name="system">system.</param>
        /// <param name="current">current.</param>
        /// <param name="previous">previous.</param>
        /// <param name="change">Rating grade change which is the difference between the rank of the current rating and the rank of the previous rating. Example: If a rating system has AAA, AA, A, B, C, D as possible ratings (from best to worst), then a change from AA to B is represented as -2 and a change from C to AAA is represented as +4..</param>
        public InlineResponse20064Ratings(InlineResponse20064System system = default(InlineResponse20064System), InlineResponse20064Current current = default(InlineResponse20064Current), InlineResponse20064Previous previous = default(InlineResponse20064Previous), decimal? change = default(decimal?))
        {
            this.System = system;
            this.Current = current;
            this.Previous = previous;
            this.Change = change;
        }

        /// <summary>
        /// Gets or Sets System
        /// </summary>
        [DataMember(Name = "system", EmitDefaultValue = false)]
        public InlineResponse20064System System { get; set; }

        /// <summary>
        /// Gets or Sets Current
        /// </summary>
        [DataMember(Name = "current", EmitDefaultValue = false)]
        public InlineResponse20064Current Current { get; set; }

        /// <summary>
        /// Gets or Sets Previous
        /// </summary>
        [DataMember(Name = "previous", EmitDefaultValue = false)]
        public InlineResponse20064Previous Previous { get; set; }

        /// <summary>
        /// Rating grade change which is the difference between the rank of the current rating and the rank of the previous rating. Example: If a rating system has AAA, AA, A, B, C, D as possible ratings (from best to worst), then a change from AA to B is represented as -2 and a change from C to AAA is represented as +4.
        /// </summary>
        /// <value>Rating grade change which is the difference between the rank of the current rating and the rank of the previous rating. Example: If a rating system has AAA, AA, A, B, C, D as possible ratings (from best to worst), then a change from AA to B is represented as -2 and a change from C to AAA is represented as +4.</value>
        [DataMember(Name = "change", EmitDefaultValue = true)]
        public decimal? Change { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class InlineResponse20064Ratings {\n");
            sb.Append("  System: ").Append(System).Append("\n");
            sb.Append("  Current: ").Append(Current).Append("\n");
            sb.Append("  Previous: ").Append(Previous).Append("\n");
            sb.Append("  Change: ").Append(Change).Append("\n");
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
            return this.Equals(input as InlineResponse20064Ratings);
        }

        /// <summary>
        /// Returns true if InlineResponse20064Ratings instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse20064Ratings to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse20064Ratings input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.System == input.System ||
                    (this.System != null &&
                    this.System.Equals(input.System))
                ) && 
                (
                    this.Current == input.Current ||
                    (this.Current != null &&
                    this.Current.Equals(input.Current))
                ) && 
                (
                    this.Previous == input.Previous ||
                    (this.Previous != null &&
                    this.Previous.Equals(input.Previous))
                ) && 
                (
                    this.Change == input.Change ||
                    (this.Change != null &&
                    this.Change.Equals(input.Change))
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
                if (this.System != null)
                {
                    hashCode = (hashCode * 59) + this.System.GetHashCode();
                }
                if (this.Current != null)
                {
                    hashCode = (hashCode * 59) + this.Current.GetHashCode();
                }
                if (this.Previous != null)
                {
                    hashCode = (hashCode * 59) + this.Previous.GetHashCode();
                }
                if (this.Change != null)
                {
                    hashCode = (hashCode * 59) + this.Change.GetHashCode();
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
