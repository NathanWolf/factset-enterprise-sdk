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
    /// InlineResponse20075Data
    /// </summary>
    [DataContract(Name = "inline_response_200_75_data")]
    public partial class InlineResponse20075Data : IEquatable<InlineResponse20075Data>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse20075Data" /> class.
        /// </summary>
        /// <param name="id">Identifier of the notation..</param>
        /// <param name="referenceDate">Reference date of the time range..</param>
        /// <param name="performance">performance.</param>
        /// <param name="high">high.</param>
        /// <param name="low">low.</param>
        /// <param name="tradingVolume">Sum of the trading volume of a notation in number of shares for the time-range between the date of the most recent end-of-day (EOD) closing price (inclusive) and the reference date (exclusive)..</param>
        /// <param name="volatility">Volatility of the daily logarithmic returns, annualized assuming 256 trading days per year..</param>
        /// <param name="status">status.</param>
        public InlineResponse20075Data(string id = default(string), DateTime referenceDate = default(DateTime), InlineResponse20072DataPerformance performance = default(InlineResponse20072DataPerformance), InlineResponse20072DataHigh high = default(InlineResponse20072DataHigh), InlineResponse20072DataLow low = default(InlineResponse20072DataLow), decimal tradingVolume = default(decimal), decimal volatility = default(decimal), InlineResponse20073Status status = default(InlineResponse20073Status))
        {
            this.Id = id;
            this.ReferenceDate = referenceDate;
            this.Performance = performance;
            this.High = high;
            this.Low = low;
            this.TradingVolume = tradingVolume;
            this.Volatility = volatility;
            this.Status = status;
        }

        /// <summary>
        /// Identifier of the notation.
        /// </summary>
        /// <value>Identifier of the notation.</value>
        [DataMember(Name = "id", EmitDefaultValue = false)]
        public string Id { get; set; }

        /// <summary>
        /// Reference date of the time range.
        /// </summary>
        /// <value>Reference date of the time range.</value>
        [DataMember(Name = "referenceDate", EmitDefaultValue = false)]
        [JsonConverter(typeof(OpenAPIDateConverter))]
        public DateTime ReferenceDate { get; set; }

        /// <summary>
        /// Gets or Sets Performance
        /// </summary>
        [DataMember(Name = "performance", EmitDefaultValue = false)]
        public InlineResponse20072DataPerformance Performance { get; set; }

        /// <summary>
        /// Gets or Sets High
        /// </summary>
        [DataMember(Name = "high", EmitDefaultValue = false)]
        public InlineResponse20072DataHigh High { get; set; }

        /// <summary>
        /// Gets or Sets Low
        /// </summary>
        [DataMember(Name = "low", EmitDefaultValue = false)]
        public InlineResponse20072DataLow Low { get; set; }

        /// <summary>
        /// Sum of the trading volume of a notation in number of shares for the time-range between the date of the most recent end-of-day (EOD) closing price (inclusive) and the reference date (exclusive).
        /// </summary>
        /// <value>Sum of the trading volume of a notation in number of shares for the time-range between the date of the most recent end-of-day (EOD) closing price (inclusive) and the reference date (exclusive).</value>
        [DataMember(Name = "tradingVolume", EmitDefaultValue = false)]
        public decimal TradingVolume { get; set; }

        /// <summary>
        /// Volatility of the daily logarithmic returns, annualized assuming 256 trading days per year.
        /// </summary>
        /// <value>Volatility of the daily logarithmic returns, annualized assuming 256 trading days per year.</value>
        [DataMember(Name = "volatility", EmitDefaultValue = false)]
        public decimal Volatility { get; set; }

        /// <summary>
        /// Gets or Sets Status
        /// </summary>
        [DataMember(Name = "status", EmitDefaultValue = false)]
        public InlineResponse20073Status Status { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class InlineResponse20075Data {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  ReferenceDate: ").Append(ReferenceDate).Append("\n");
            sb.Append("  Performance: ").Append(Performance).Append("\n");
            sb.Append("  High: ").Append(High).Append("\n");
            sb.Append("  Low: ").Append(Low).Append("\n");
            sb.Append("  TradingVolume: ").Append(TradingVolume).Append("\n");
            sb.Append("  Volatility: ").Append(Volatility).Append("\n");
            sb.Append("  Status: ").Append(Status).Append("\n");
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
            return this.Equals(input as InlineResponse20075Data);
        }

        /// <summary>
        /// Returns true if InlineResponse20075Data instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse20075Data to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse20075Data input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Id == input.Id ||
                    (this.Id != null &&
                    this.Id.Equals(input.Id))
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
                    this.TradingVolume == input.TradingVolume ||
                    this.TradingVolume.Equals(input.TradingVolume)
                ) && 
                (
                    this.Volatility == input.Volatility ||
                    this.Volatility.Equals(input.Volatility)
                ) && 
                (
                    this.Status == input.Status ||
                    (this.Status != null &&
                    this.Status.Equals(input.Status))
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
                if (this.Id != null)
                {
                    hashCode = (hashCode * 59) + this.Id.GetHashCode();
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
                hashCode = (hashCode * 59) + this.TradingVolume.GetHashCode();
                hashCode = (hashCode * 59) + this.Volatility.GetHashCode();
                if (this.Status != null)
                {
                    hashCode = (hashCode * 59) + this.Status.GetHashCode();
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
