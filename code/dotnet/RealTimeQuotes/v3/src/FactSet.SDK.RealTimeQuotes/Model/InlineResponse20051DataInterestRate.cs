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
    /// Interest rate for the coupon period.
    /// </summary>
    [DataContract(Name = "inline_response_200_51_data_interestRate")]
    public partial class InlineResponse20051DataInterestRate : IEquatable<InlineResponse20051DataInterestRate>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse20051DataInterestRate" /> class.
        /// </summary>
        /// <param name="type">type.</param>
        /// <param name="annualized">annualized.</param>
        /// <param name="periodic">periodic.</param>
        public InlineResponse20051DataInterestRate(InlineResponse20051DataInterestRateType type = default(InlineResponse20051DataInterestRateType), InlineResponse20051DataInterestRateAnnualized annualized = default(InlineResponse20051DataInterestRateAnnualized), InlineResponse20051DataInterestRatePeriodic periodic = default(InlineResponse20051DataInterestRatePeriodic))
        {
            this.Type = type;
            this.Annualized = annualized;
            this.Periodic = periodic;
        }

        /// <summary>
        /// Gets or Sets Type
        /// </summary>
        [DataMember(Name = "type", EmitDefaultValue = false)]
        public InlineResponse20051DataInterestRateType Type { get; set; }

        /// <summary>
        /// Gets or Sets Annualized
        /// </summary>
        [DataMember(Name = "annualized", EmitDefaultValue = false)]
        public InlineResponse20051DataInterestRateAnnualized Annualized { get; set; }

        /// <summary>
        /// Gets or Sets Periodic
        /// </summary>
        [DataMember(Name = "periodic", EmitDefaultValue = false)]
        public InlineResponse20051DataInterestRatePeriodic Periodic { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class InlineResponse20051DataInterestRate {\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
            sb.Append("  Annualized: ").Append(Annualized).Append("\n");
            sb.Append("  Periodic: ").Append(Periodic).Append("\n");
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
            return this.Equals(input as InlineResponse20051DataInterestRate);
        }

        /// <summary>
        /// Returns true if InlineResponse20051DataInterestRate instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse20051DataInterestRate to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse20051DataInterestRate input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Type == input.Type ||
                    (this.Type != null &&
                    this.Type.Equals(input.Type))
                ) && 
                (
                    this.Annualized == input.Annualized ||
                    (this.Annualized != null &&
                    this.Annualized.Equals(input.Annualized))
                ) && 
                (
                    this.Periodic == input.Periodic ||
                    (this.Periodic != null &&
                    this.Periodic.Equals(input.Periodic))
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
                if (this.Type != null)
                {
                    hashCode = (hashCode * 59) + this.Type.GetHashCode();
                }
                if (this.Annualized != null)
                {
                    hashCode = (hashCode * 59) + this.Annualized.GetHashCode();
                }
                if (this.Periodic != null)
                {
                    hashCode = (hashCode * 59) + this.Periodic.GetHashCode();
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
