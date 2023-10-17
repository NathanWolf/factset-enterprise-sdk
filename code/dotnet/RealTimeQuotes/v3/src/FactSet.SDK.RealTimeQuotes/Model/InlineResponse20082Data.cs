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
    /// EOD key figures.
    /// </summary>
    [DataContract(Name = "inline_response_200_82_data")]
    public partial class InlineResponse20082Data : IEquatable<InlineResponse20082Data>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse20082Data" /> class.
        /// </summary>
        /// <param name="idNotation">MDG identifier of the listing..</param>
        /// <param name="sourceIdentifier">Identifier used in the request..</param>
        /// <param name="referenceDate">Reference date of the time range..</param>
        /// <param name="performance">performance.</param>
        /// <param name="high">high.</param>
        /// <param name="low">low.</param>
        /// <param name="volatility">Volatility of the daily logarithmic returns, annualized assuming 256 trading days per year..</param>
        public InlineResponse20082Data(string idNotation = default(string), string sourceIdentifier = default(string), DateTime? referenceDate = default(DateTime?), InlineResponse20078DataPerformance performance = default(InlineResponse20078DataPerformance), InlineResponse20078DataHigh high = default(InlineResponse20078DataHigh), InlineResponse20078DataLow low = default(InlineResponse20078DataLow), decimal? volatility = default(decimal?))
        {
            this.IdNotation = idNotation;
            this.SourceIdentifier = sourceIdentifier;
            this.ReferenceDate = referenceDate;
            this.Performance = performance;
            this.High = high;
            this.Low = low;
            this.Volatility = volatility;
        }

        /// <summary>
        /// MDG identifier of the listing.
        /// </summary>
        /// <value>MDG identifier of the listing.</value>
        [DataMember(Name = "idNotation", EmitDefaultValue = true)]
        public string IdNotation { get; set; }

        /// <summary>
        /// Identifier used in the request.
        /// </summary>
        /// <value>Identifier used in the request.</value>
        [DataMember(Name = "sourceIdentifier", EmitDefaultValue = true)]
        public string SourceIdentifier { get; set; }

        /// <summary>
        /// Reference date of the time range.
        /// </summary>
        /// <value>Reference date of the time range.</value>
        [DataMember(Name = "referenceDate", EmitDefaultValue = true)]
        [JsonConverter(typeof(OpenAPIDateConverter))]
        public DateTime? ReferenceDate { get; set; }

        /// <summary>
        /// Gets or Sets Performance
        /// </summary>
        [DataMember(Name = "performance", EmitDefaultValue = false)]
        public InlineResponse20078DataPerformance Performance { get; set; }

        /// <summary>
        /// Gets or Sets High
        /// </summary>
        [DataMember(Name = "high", EmitDefaultValue = false)]
        public InlineResponse20078DataHigh High { get; set; }

        /// <summary>
        /// Gets or Sets Low
        /// </summary>
        [DataMember(Name = "low", EmitDefaultValue = false)]
        public InlineResponse20078DataLow Low { get; set; }

        /// <summary>
        /// Volatility of the daily logarithmic returns, annualized assuming 256 trading days per year.
        /// </summary>
        /// <value>Volatility of the daily logarithmic returns, annualized assuming 256 trading days per year.</value>
        [DataMember(Name = "volatility", EmitDefaultValue = true)]
        public decimal? Volatility { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class InlineResponse20082Data {\n");
            sb.Append("  IdNotation: ").Append(IdNotation).Append("\n");
            sb.Append("  SourceIdentifier: ").Append(SourceIdentifier).Append("\n");
            sb.Append("  ReferenceDate: ").Append(ReferenceDate).Append("\n");
            sb.Append("  Performance: ").Append(Performance).Append("\n");
            sb.Append("  High: ").Append(High).Append("\n");
            sb.Append("  Low: ").Append(Low).Append("\n");
            sb.Append("  Volatility: ").Append(Volatility).Append("\n");
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
            return this.Equals(input as InlineResponse20082Data);
        }

        /// <summary>
        /// Returns true if InlineResponse20082Data instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse20082Data to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse20082Data input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.IdNotation == input.IdNotation ||
                    (this.IdNotation != null &&
                    this.IdNotation.Equals(input.IdNotation))
                ) && 
                (
                    this.SourceIdentifier == input.SourceIdentifier ||
                    (this.SourceIdentifier != null &&
                    this.SourceIdentifier.Equals(input.SourceIdentifier))
                ) && 
                (
                    this.ReferenceDate == input.ReferenceDate ||
                    (this.ReferenceDate != null &&
                    this.ReferenceDate.Equals(input.ReferenceDate))
                ) && 
                (
                    this.Performance == input.Performance ||
                    (this.Performance != null &&
                    this.Performance.Equals(input.Performance))
                ) && 
                (
                    this.High == input.High ||
                    (this.High != null &&
                    this.High.Equals(input.High))
                ) && 
                (
                    this.Low == input.Low ||
                    (this.Low != null &&
                    this.Low.Equals(input.Low))
                ) && 
                (
                    this.Volatility == input.Volatility ||
                    (this.Volatility != null &&
                    this.Volatility.Equals(input.Volatility))
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
                if (this.IdNotation != null)
                {
                    hashCode = (hashCode * 59) + this.IdNotation.GetHashCode();
                }
                if (this.SourceIdentifier != null)
                {
                    hashCode = (hashCode * 59) + this.SourceIdentifier.GetHashCode();
                }
                if (this.ReferenceDate != null)
                {
                    hashCode = (hashCode * 59) + this.ReferenceDate.GetHashCode();
                }
                if (this.Performance != null)
                {
                    hashCode = (hashCode * 59) + this.Performance.GetHashCode();
                }
                if (this.High != null)
                {
                    hashCode = (hashCode * 59) + this.High.GetHashCode();
                }
                if (this.Low != null)
                {
                    hashCode = (hashCode * 59) + this.Low.GetHashCode();
                }
                if (this.Volatility != null)
                {
                    hashCode = (hashCode * 59) + this.Volatility.GetHashCode();
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
