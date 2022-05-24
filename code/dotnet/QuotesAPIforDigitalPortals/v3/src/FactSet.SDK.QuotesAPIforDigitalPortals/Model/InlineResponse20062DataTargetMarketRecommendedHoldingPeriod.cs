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
    /// States the recommended holding period of the product.
    /// </summary>
    [DataContract(Name = "inline_response_200_62_data_targetMarket_recommendedHoldingPeriod")]
    public partial class InlineResponse20062DataTargetMarketRecommendedHoldingPeriod : IEquatable<InlineResponse20062DataTargetMarketRecommendedHoldingPeriod>, IValidatableObject
    {
        /// <summary>
        /// Defines HoldingPeriod
        /// </summary>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum HoldingPeriodEnum
        {
            /// <summary>
            /// Enum VeryShort for value: veryShort
            /// </summary>
            [EnumMember(Value = "veryShort")]
            VeryShort = 1,

            /// <summary>
            /// Enum Short for value: short
            /// </summary>
            [EnumMember(Value = "short")]
            Short = 2,

            /// <summary>
            /// Enum Medium for value: medium
            /// </summary>
            [EnumMember(Value = "medium")]
            Medium = 3,

            /// <summary>
            /// Enum Long for value: long
            /// </summary>
            [EnumMember(Value = "long")]
            Long = 4,

            /// <summary>
            /// Enum Neutral for value: neutral
            /// </summary>
            [EnumMember(Value = "neutral")]
            Neutral = 5

        }



        /// <summary>
        /// Indicates the recommended holding period (RHP) of the investment product whereby more than one RHP per product may exist.
        /// </summary>
        /// <value>Indicates the recommended holding period (RHP) of the investment product whereby more than one RHP per product may exist.</value>
        [DataMember(Name = "holdingPeriod", EmitDefaultValue = false)]
        public List<HoldingPeriodEnum> HoldingPeriod { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse20062DataTargetMarketRecommendedHoldingPeriod" /> class.
        /// </summary>
        /// <param name="holdingPeriod">Indicates the recommended holding period (RHP) of the investment product whereby more than one RHP per product may exist..</param>
        /// <param name="holdingPeriodYears">Indicates the length of the recommended holding period (RHP) of the investment product in years, not available if the attribute &#x60;holdingPeriod&#x60; is set..</param>
        public InlineResponse20062DataTargetMarketRecommendedHoldingPeriod(List<HoldingPeriodEnum> holdingPeriod = default(List<HoldingPeriodEnum>), decimal holdingPeriodYears = default(decimal))
        {
            this.HoldingPeriod = holdingPeriod;
            this.HoldingPeriodYears = holdingPeriodYears;
        }

        /// <summary>
        /// Indicates the length of the recommended holding period (RHP) of the investment product in years, not available if the attribute &#x60;holdingPeriod&#x60; is set.
        /// </summary>
        /// <value>Indicates the length of the recommended holding period (RHP) of the investment product in years, not available if the attribute &#x60;holdingPeriod&#x60; is set.</value>
        [DataMember(Name = "holdingPeriodYears", EmitDefaultValue = false)]
        public decimal HoldingPeriodYears { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class InlineResponse20062DataTargetMarketRecommendedHoldingPeriod {\n");
            sb.Append("  HoldingPeriod: ").Append(HoldingPeriod).Append("\n");
            sb.Append("  HoldingPeriodYears: ").Append(HoldingPeriodYears).Append("\n");
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
            return this.Equals(input as InlineResponse20062DataTargetMarketRecommendedHoldingPeriod);
        }

        /// <summary>
        /// Returns true if InlineResponse20062DataTargetMarketRecommendedHoldingPeriod instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse20062DataTargetMarketRecommendedHoldingPeriod to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse20062DataTargetMarketRecommendedHoldingPeriod input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.HoldingPeriod == input.HoldingPeriod ||
                    this.HoldingPeriod.SequenceEqual(input.HoldingPeriod)
                ) && 
                (
                    this.HoldingPeriodYears == input.HoldingPeriodYears ||
                    this.HoldingPeriodYears.Equals(input.HoldingPeriodYears)
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
                hashCode = (hashCode * 59) + this.HoldingPeriod.GetHashCode();
                hashCode = (hashCode * 59) + this.HoldingPeriodYears.GetHashCode();
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
