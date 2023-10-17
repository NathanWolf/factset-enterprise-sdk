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
    /// Indicates whether the investment product is suitable for investors with specific return profiles.
    /// </summary>
    [DataContract(Name = "inline_response_200_62_data_targetMarket_clientObjectivesAndNeeds_returnProfile")]
    public partial class InlineResponse20062DataTargetMarketClientObjectivesAndNeedsReturnProfile : IEquatable<InlineResponse20062DataTargetMarketClientObjectivesAndNeedsReturnProfile>, IValidatableObject
    {
        /// <summary>
        /// Indicates whether the investment product is suitable for investors with the return profile \&quot;preservation\&quot;.
        /// </summary>
        /// <value>Indicates whether the investment product is suitable for investors with the return profile \&quot;preservation\&quot;.</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum PreservationEnum
        {
            /// <summary>
            /// Enum Yes for value: yes
            /// </summary>
            [EnumMember(Value = "yes")]
            Yes = 1,

            /// <summary>
            /// Enum No for value: no
            /// </summary>
            [EnumMember(Value = "no")]
            No = 2,

            /// <summary>
            /// Enum Neutral for value: neutral
            /// </summary>
            [EnumMember(Value = "neutral")]
            Neutral = 3,

            /// <summary>
            /// Enum Feedback for value: feedback
            /// </summary>
            [EnumMember(Value = "feedback")]
            Feedback = 4

        }


        /// <summary>
        /// Indicates whether the investment product is suitable for investors with the return profile \&quot;preservation\&quot;.
        /// </summary>
        /// <value>Indicates whether the investment product is suitable for investors with the return profile \&quot;preservation\&quot;.</value>
        [DataMember(Name = "preservation", EmitDefaultValue = true)]
        public PreservationEnum? Preservation { get; set; }
        /// <summary>
        /// Indicates whether the investment product is suitable for investors with the return profile \&quot;growth\&quot;.
        /// </summary>
        /// <value>Indicates whether the investment product is suitable for investors with the return profile \&quot;growth\&quot;.</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum GrowthEnum
        {
            /// <summary>
            /// Enum Yes for value: yes
            /// </summary>
            [EnumMember(Value = "yes")]
            Yes = 1,

            /// <summary>
            /// Enum No for value: no
            /// </summary>
            [EnumMember(Value = "no")]
            No = 2,

            /// <summary>
            /// Enum Neutral for value: neutral
            /// </summary>
            [EnumMember(Value = "neutral")]
            Neutral = 3,

            /// <summary>
            /// Enum Feedback for value: feedback
            /// </summary>
            [EnumMember(Value = "feedback")]
            Feedback = 4

        }


        /// <summary>
        /// Indicates whether the investment product is suitable for investors with the return profile \&quot;growth\&quot;.
        /// </summary>
        /// <value>Indicates whether the investment product is suitable for investors with the return profile \&quot;growth\&quot;.</value>
        [DataMember(Name = "growth", EmitDefaultValue = true)]
        public GrowthEnum? Growth { get; set; }
        /// <summary>
        /// Indicates whether the investment product is suitable for investors with the return profile \&quot;income\&quot;.
        /// </summary>
        /// <value>Indicates whether the investment product is suitable for investors with the return profile \&quot;income\&quot;.</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum IncomeEnum
        {
            /// <summary>
            /// Enum Yes for value: yes
            /// </summary>
            [EnumMember(Value = "yes")]
            Yes = 1,

            /// <summary>
            /// Enum No for value: no
            /// </summary>
            [EnumMember(Value = "no")]
            No = 2,

            /// <summary>
            /// Enum Neutral for value: neutral
            /// </summary>
            [EnumMember(Value = "neutral")]
            Neutral = 3,

            /// <summary>
            /// Enum Feedback for value: feedback
            /// </summary>
            [EnumMember(Value = "feedback")]
            Feedback = 4

        }


        /// <summary>
        /// Indicates whether the investment product is suitable for investors with the return profile \&quot;income\&quot;.
        /// </summary>
        /// <value>Indicates whether the investment product is suitable for investors with the return profile \&quot;income\&quot;.</value>
        [DataMember(Name = "income", EmitDefaultValue = true)]
        public IncomeEnum? Income { get; set; }
        /// <summary>
        /// Indicates whether the investment product is suitable for investors with the return profile \&quot;financing\&quot;.
        /// </summary>
        /// <value>Indicates whether the investment product is suitable for investors with the return profile \&quot;financing\&quot;.</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum FinancingEnum
        {
            /// <summary>
            /// Enum Yes for value: yes
            /// </summary>
            [EnumMember(Value = "yes")]
            Yes = 1,

            /// <summary>
            /// Enum No for value: no
            /// </summary>
            [EnumMember(Value = "no")]
            No = 2,

            /// <summary>
            /// Enum Neutral for value: neutral
            /// </summary>
            [EnumMember(Value = "neutral")]
            Neutral = 3,

            /// <summary>
            /// Enum Feedback for value: feedback
            /// </summary>
            [EnumMember(Value = "feedback")]
            Feedback = 4

        }


        /// <summary>
        /// Indicates whether the investment product is suitable for investors with the return profile \&quot;financing\&quot;.
        /// </summary>
        /// <value>Indicates whether the investment product is suitable for investors with the return profile \&quot;financing\&quot;.</value>
        [DataMember(Name = "financing", EmitDefaultValue = true)]
        public FinancingEnum? Financing { get; set; }
        /// <summary>
        /// Indicates whether the investment product is suitable for investors with the return profile \&quot;hedging\&quot;.
        /// </summary>
        /// <value>Indicates whether the investment product is suitable for investors with the return profile \&quot;hedging\&quot;.</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum HedgingEnum
        {
            /// <summary>
            /// Enum Yes for value: yes
            /// </summary>
            [EnumMember(Value = "yes")]
            Yes = 1,

            /// <summary>
            /// Enum No for value: no
            /// </summary>
            [EnumMember(Value = "no")]
            No = 2,

            /// <summary>
            /// Enum Neutral for value: neutral
            /// </summary>
            [EnumMember(Value = "neutral")]
            Neutral = 3,

            /// <summary>
            /// Enum Feedback for value: feedback
            /// </summary>
            [EnumMember(Value = "feedback")]
            Feedback = 4

        }


        /// <summary>
        /// Indicates whether the investment product is suitable for investors with the return profile \&quot;hedging\&quot;.
        /// </summary>
        /// <value>Indicates whether the investment product is suitable for investors with the return profile \&quot;hedging\&quot;.</value>
        [DataMember(Name = "hedging", EmitDefaultValue = true)]
        public HedgingEnum? Hedging { get; set; }
        /// <summary>
        /// Indicates whether the investment product is suitable for investors with the return profile \&quot;leverage\&quot;.
        /// </summary>
        /// <value>Indicates whether the investment product is suitable for investors with the return profile \&quot;leverage\&quot;.</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum OptionOrLeveragedEnum
        {
            /// <summary>
            /// Enum Yes for value: yes
            /// </summary>
            [EnumMember(Value = "yes")]
            Yes = 1,

            /// <summary>
            /// Enum No for value: no
            /// </summary>
            [EnumMember(Value = "no")]
            No = 2,

            /// <summary>
            /// Enum Neutral for value: neutral
            /// </summary>
            [EnumMember(Value = "neutral")]
            Neutral = 3,

            /// <summary>
            /// Enum Feedback for value: feedback
            /// </summary>
            [EnumMember(Value = "feedback")]
            Feedback = 4

        }


        /// <summary>
        /// Indicates whether the investment product is suitable for investors with the return profile \&quot;leverage\&quot;.
        /// </summary>
        /// <value>Indicates whether the investment product is suitable for investors with the return profile \&quot;leverage\&quot;.</value>
        [DataMember(Name = "optionOrLeveraged", EmitDefaultValue = true)]
        public OptionOrLeveragedEnum? OptionOrLeveraged { get; set; }
        /// <summary>
        /// Indicates whether the investment product is suitable for investors with the return profile \&quot;other\&quot;.
        /// </summary>
        /// <value>Indicates whether the investment product is suitable for investors with the return profile \&quot;other\&quot;.</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum OtherEnum
        {
            /// <summary>
            /// Enum Yes for value: yes
            /// </summary>
            [EnumMember(Value = "yes")]
            Yes = 1,

            /// <summary>
            /// Enum No for value: no
            /// </summary>
            [EnumMember(Value = "no")]
            No = 2,

            /// <summary>
            /// Enum Neutral for value: neutral
            /// </summary>
            [EnumMember(Value = "neutral")]
            Neutral = 3,

            /// <summary>
            /// Enum Feedback for value: feedback
            /// </summary>
            [EnumMember(Value = "feedback")]
            Feedback = 4

        }


        /// <summary>
        /// Indicates whether the investment product is suitable for investors with the return profile \&quot;other\&quot;.
        /// </summary>
        /// <value>Indicates whether the investment product is suitable for investors with the return profile \&quot;other\&quot;.</value>
        [DataMember(Name = "other", EmitDefaultValue = true)]
        public OtherEnum? Other { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse20062DataTargetMarketClientObjectivesAndNeedsReturnProfile" /> class.
        /// </summary>
        /// <param name="preservation">Indicates whether the investment product is suitable for investors with the return profile \&quot;preservation\&quot;..</param>
        /// <param name="growth">Indicates whether the investment product is suitable for investors with the return profile \&quot;growth\&quot;..</param>
        /// <param name="income">Indicates whether the investment product is suitable for investors with the return profile \&quot;income\&quot;..</param>
        /// <param name="financing">Indicates whether the investment product is suitable for investors with the return profile \&quot;financing\&quot;..</param>
        /// <param name="hedging">Indicates whether the investment product is suitable for investors with the return profile \&quot;hedging\&quot;..</param>
        /// <param name="optionOrLeveraged">Indicates whether the investment product is suitable for investors with the return profile \&quot;leverage\&quot;..</param>
        /// <param name="other">Indicates whether the investment product is suitable for investors with the return profile \&quot;other\&quot;..</param>
        /// <param name="germany">germany.</param>
        public InlineResponse20062DataTargetMarketClientObjectivesAndNeedsReturnProfile(PreservationEnum? preservation = default(PreservationEnum?), GrowthEnum? growth = default(GrowthEnum?), IncomeEnum? income = default(IncomeEnum?), FinancingEnum? financing = default(FinancingEnum?), HedgingEnum? hedging = default(HedgingEnum?), OptionOrLeveragedEnum? optionOrLeveraged = default(OptionOrLeveragedEnum?), OtherEnum? other = default(OtherEnum?), InlineResponse20062DataTargetMarketClientObjectivesAndNeedsReturnProfileGermany germany = default(InlineResponse20062DataTargetMarketClientObjectivesAndNeedsReturnProfileGermany))
        {
            this.Preservation = preservation;
            this.Growth = growth;
            this.Income = income;
            this.Financing = financing;
            this.Hedging = hedging;
            this.OptionOrLeveraged = optionOrLeveraged;
            this.Other = other;
            this.Germany = germany;
        }

        /// <summary>
        /// Gets or Sets Germany
        /// </summary>
        [DataMember(Name = "germany", EmitDefaultValue = false)]
        public InlineResponse20062DataTargetMarketClientObjectivesAndNeedsReturnProfileGermany Germany { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class InlineResponse20062DataTargetMarketClientObjectivesAndNeedsReturnProfile {\n");
            sb.Append("  Preservation: ").Append(Preservation).Append("\n");
            sb.Append("  Growth: ").Append(Growth).Append("\n");
            sb.Append("  Income: ").Append(Income).Append("\n");
            sb.Append("  Financing: ").Append(Financing).Append("\n");
            sb.Append("  Hedging: ").Append(Hedging).Append("\n");
            sb.Append("  OptionOrLeveraged: ").Append(OptionOrLeveraged).Append("\n");
            sb.Append("  Other: ").Append(Other).Append("\n");
            sb.Append("  Germany: ").Append(Germany).Append("\n");
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
            return this.Equals(input as InlineResponse20062DataTargetMarketClientObjectivesAndNeedsReturnProfile);
        }

        /// <summary>
        /// Returns true if InlineResponse20062DataTargetMarketClientObjectivesAndNeedsReturnProfile instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse20062DataTargetMarketClientObjectivesAndNeedsReturnProfile to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse20062DataTargetMarketClientObjectivesAndNeedsReturnProfile input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Preservation == input.Preservation ||
                    this.Preservation.Equals(input.Preservation)
                ) && 
                (
                    this.Growth == input.Growth ||
                    this.Growth.Equals(input.Growth)
                ) && 
                (
                    this.Income == input.Income ||
                    this.Income.Equals(input.Income)
                ) && 
                (
                    this.Financing == input.Financing ||
                    this.Financing.Equals(input.Financing)
                ) && 
                (
                    this.Hedging == input.Hedging ||
                    this.Hedging.Equals(input.Hedging)
                ) && 
                (
                    this.OptionOrLeveraged == input.OptionOrLeveraged ||
                    this.OptionOrLeveraged.Equals(input.OptionOrLeveraged)
                ) && 
                (
                    this.Other == input.Other ||
                    this.Other.Equals(input.Other)
                ) && 
                (
                    this.Germany == input.Germany ||
                    (this.Germany != null &&
                    this.Germany.Equals(input.Germany))
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
                hashCode = (hashCode * 59) + this.Preservation.GetHashCode();
                hashCode = (hashCode * 59) + this.Growth.GetHashCode();
                hashCode = (hashCode * 59) + this.Income.GetHashCode();
                hashCode = (hashCode * 59) + this.Financing.GetHashCode();
                hashCode = (hashCode * 59) + this.Hedging.GetHashCode();
                hashCode = (hashCode * 59) + this.OptionOrLeveraged.GetHashCode();
                hashCode = (hashCode * 59) + this.Other.GetHashCode();
                if (this.Germany != null)
                {
                    hashCode = (hashCode * 59) + this.Germany.GetHashCode();
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
