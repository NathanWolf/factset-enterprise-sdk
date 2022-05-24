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
    /// MiFID distribution channel provides information on the different services a firm might employ in order to deliver an investment product to its customers and on the client type the particular service is appropriate for.
    /// </summary>
    [DataContract(Name = "inline_response_200_62_data_distributionChannel")]
    public partial class InlineResponse20062DataDistributionChannel : IEquatable<InlineResponse20062DataDistributionChannel>, IValidatableObject
    {
        /// <summary>
        /// Indicates the client type(s) for which the investment product is suitable through the distribution channel \&quot;execution only / reception and transmission of orders (RTO) without appropriateness assessment\&quot;.
        /// </summary>
        /// <value>Indicates the client type(s) for which the investment product is suitable through the distribution channel \&quot;execution only / reception and transmission of orders (RTO) without appropriateness assessment\&quot;.</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum ExecutionOnlyEnum
        {
            /// <summary>
            /// Enum Retail for value: retail
            /// </summary>
            [EnumMember(Value = "retail")]
            Retail = 1,

            /// <summary>
            /// Enum Professional for value: professional
            /// </summary>
            [EnumMember(Value = "professional")]
            Professional = 2,

            /// <summary>
            /// Enum Both for value: both
            /// </summary>
            [EnumMember(Value = "both")]
            Both = 3,

            /// <summary>
            /// Enum None for value: none
            /// </summary>
            [EnumMember(Value = "none")]
            None = 4

        }


        /// <summary>
        /// Indicates the client type(s) for which the investment product is suitable through the distribution channel \&quot;execution only / reception and transmission of orders (RTO) without appropriateness assessment\&quot;.
        /// </summary>
        /// <value>Indicates the client type(s) for which the investment product is suitable through the distribution channel \&quot;execution only / reception and transmission of orders (RTO) without appropriateness assessment\&quot;.</value>
        [DataMember(Name = "executionOnly", EmitDefaultValue = false)]
        public ExecutionOnlyEnum? ExecutionOnly { get; set; }
        /// <summary>
        /// Indicates the client type(s) for which the investment product is suitable through the distribution channel \&quot;execution only / reception and transmission of orders (RTO) with appropriateness assessment\&quot;.
        /// </summary>
        /// <value>Indicates the client type(s) for which the investment product is suitable through the distribution channel \&quot;execution only / reception and transmission of orders (RTO) with appropriateness assessment\&quot;.</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum ExecutionAppropriatenessEnum
        {
            /// <summary>
            /// Enum Retail for value: retail
            /// </summary>
            [EnumMember(Value = "retail")]
            Retail = 1,

            /// <summary>
            /// Enum Professional for value: professional
            /// </summary>
            [EnumMember(Value = "professional")]
            Professional = 2,

            /// <summary>
            /// Enum Both for value: both
            /// </summary>
            [EnumMember(Value = "both")]
            Both = 3,

            /// <summary>
            /// Enum None for value: none
            /// </summary>
            [EnumMember(Value = "none")]
            None = 4

        }


        /// <summary>
        /// Indicates the client type(s) for which the investment product is suitable through the distribution channel \&quot;execution only / reception and transmission of orders (RTO) with appropriateness assessment\&quot;.
        /// </summary>
        /// <value>Indicates the client type(s) for which the investment product is suitable through the distribution channel \&quot;execution only / reception and transmission of orders (RTO) with appropriateness assessment\&quot;.</value>
        [DataMember(Name = "executionAppropriateness", EmitDefaultValue = false)]
        public ExecutionAppropriatenessEnum? ExecutionAppropriateness { get; set; }
        /// <summary>
        /// Indicates the client type(s) for which the investment product is suitable through the distribution channel \&quot;investment advice with suitability assessment\&quot;.
        /// </summary>
        /// <value>Indicates the client type(s) for which the investment product is suitable through the distribution channel \&quot;investment advice with suitability assessment\&quot;.</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum InvestmentAdviceEnum
        {
            /// <summary>
            /// Enum Retail for value: retail
            /// </summary>
            [EnumMember(Value = "retail")]
            Retail = 1,

            /// <summary>
            /// Enum Professional for value: professional
            /// </summary>
            [EnumMember(Value = "professional")]
            Professional = 2,

            /// <summary>
            /// Enum Both for value: both
            /// </summary>
            [EnumMember(Value = "both")]
            Both = 3,

            /// <summary>
            /// Enum None for value: none
            /// </summary>
            [EnumMember(Value = "none")]
            None = 4

        }


        /// <summary>
        /// Indicates the client type(s) for which the investment product is suitable through the distribution channel \&quot;investment advice with suitability assessment\&quot;.
        /// </summary>
        /// <value>Indicates the client type(s) for which the investment product is suitable through the distribution channel \&quot;investment advice with suitability assessment\&quot;.</value>
        [DataMember(Name = "investmentAdvice", EmitDefaultValue = false)]
        public InvestmentAdviceEnum? InvestmentAdvice { get; set; }
        /// <summary>
        /// Indicates the client type for which the investment product is suitable through the distribution channel \&quot;discretionary/portfolio management with suitability assessment\&quot;.
        /// </summary>
        /// <value>Indicates the client type for which the investment product is suitable through the distribution channel \&quot;discretionary/portfolio management with suitability assessment\&quot;.</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum PortfolioManagementEnum
        {
            /// <summary>
            /// Enum Retail for value: retail
            /// </summary>
            [EnumMember(Value = "retail")]
            Retail = 1,

            /// <summary>
            /// Enum Professional for value: professional
            /// </summary>
            [EnumMember(Value = "professional")]
            Professional = 2,

            /// <summary>
            /// Enum Both for value: both
            /// </summary>
            [EnumMember(Value = "both")]
            Both = 3,

            /// <summary>
            /// Enum None for value: none
            /// </summary>
            [EnumMember(Value = "none")]
            None = 4

        }


        /// <summary>
        /// Indicates the client type for which the investment product is suitable through the distribution channel \&quot;discretionary/portfolio management with suitability assessment\&quot;.
        /// </summary>
        /// <value>Indicates the client type for which the investment product is suitable through the distribution channel \&quot;discretionary/portfolio management with suitability assessment\&quot;.</value>
        [DataMember(Name = "portfolioManagement", EmitDefaultValue = false)]
        public PortfolioManagementEnum? PortfolioManagement { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse20062DataDistributionChannel" /> class.
        /// </summary>
        /// <param name="executionOnly">Indicates the client type(s) for which the investment product is suitable through the distribution channel \&quot;execution only / reception and transmission of orders (RTO) without appropriateness assessment\&quot;..</param>
        /// <param name="executionAppropriateness">Indicates the client type(s) for which the investment product is suitable through the distribution channel \&quot;execution only / reception and transmission of orders (RTO) with appropriateness assessment\&quot;..</param>
        /// <param name="investmentAdvice">Indicates the client type(s) for which the investment product is suitable through the distribution channel \&quot;investment advice with suitability assessment\&quot;..</param>
        /// <param name="portfolioManagement">Indicates the client type for which the investment product is suitable through the distribution channel \&quot;discretionary/portfolio management with suitability assessment\&quot;..</param>
        public InlineResponse20062DataDistributionChannel(ExecutionOnlyEnum? executionOnly = default(ExecutionOnlyEnum?), ExecutionAppropriatenessEnum? executionAppropriateness = default(ExecutionAppropriatenessEnum?), InvestmentAdviceEnum? investmentAdvice = default(InvestmentAdviceEnum?), PortfolioManagementEnum? portfolioManagement = default(PortfolioManagementEnum?))
        {
            this.ExecutionOnly = executionOnly;
            this.ExecutionAppropriateness = executionAppropriateness;
            this.InvestmentAdvice = investmentAdvice;
            this.PortfolioManagement = portfolioManagement;
        }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class InlineResponse20062DataDistributionChannel {\n");
            sb.Append("  ExecutionOnly: ").Append(ExecutionOnly).Append("\n");
            sb.Append("  ExecutionAppropriateness: ").Append(ExecutionAppropriateness).Append("\n");
            sb.Append("  InvestmentAdvice: ").Append(InvestmentAdvice).Append("\n");
            sb.Append("  PortfolioManagement: ").Append(PortfolioManagement).Append("\n");
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
            return this.Equals(input as InlineResponse20062DataDistributionChannel);
        }

        /// <summary>
        /// Returns true if InlineResponse20062DataDistributionChannel instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse20062DataDistributionChannel to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse20062DataDistributionChannel input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.ExecutionOnly == input.ExecutionOnly ||
                    this.ExecutionOnly.Equals(input.ExecutionOnly)
                ) && 
                (
                    this.ExecutionAppropriateness == input.ExecutionAppropriateness ||
                    this.ExecutionAppropriateness.Equals(input.ExecutionAppropriateness)
                ) && 
                (
                    this.InvestmentAdvice == input.InvestmentAdvice ||
                    this.InvestmentAdvice.Equals(input.InvestmentAdvice)
                ) && 
                (
                    this.PortfolioManagement == input.PortfolioManagement ||
                    this.PortfolioManagement.Equals(input.PortfolioManagement)
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
                hashCode = (hashCode * 59) + this.ExecutionOnly.GetHashCode();
                hashCode = (hashCode * 59) + this.ExecutionAppropriateness.GetHashCode();
                hashCode = (hashCode * 59) + this.InvestmentAdvice.GetHashCode();
                hashCode = (hashCode * 59) + this.PortfolioManagement.GetHashCode();
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
