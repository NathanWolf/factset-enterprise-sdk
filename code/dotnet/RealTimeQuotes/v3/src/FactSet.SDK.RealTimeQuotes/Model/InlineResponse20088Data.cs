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
    /// InlineResponse20088Data
    /// </summary>
    [DataContract(Name = "inline_response_200_88_data")]
    public partial class InlineResponse20088Data : IEquatable<InlineResponse20088Data>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse20088Data" /> class.
        /// </summary>
        /// <param name="idNotation">MDG identifier of the listing..</param>
        /// <param name="sourceIdentifier">Identifier used in the request..</param>
        /// <param name="suspended">Indicates whether the notation is currently suspended from trading. The notation is tradable if it is not suspended and the market is open, see attribute &#x60;market.isOpen&#x60;..</param>
        /// <param name="tradingStatus">Market-specific code of the trading status and/or the suspension of the notation..</param>
        /// <param name="priceDelay">Exchange-imposed delay in seconds for delayed-quality tick data..</param>
        /// <param name="tickSize">The minimum price movement of the notation. Prices can only be integral multiples of this minimum value. See endpoint &#x60;/notation/get&#x60; for the value unit of the &#x60;tickSize&#x60; for this notation..</param>
        /// <param name="lotSize">The minimum tradable volume of the notation. The number of units traded can only be integral multiples of this minimum value..</param>
        /// <param name="tradeImbalance">Trade imbalance after the previous closed auction. A positive value indicates that more buy orders have been placed for the security; a negative value indicates more sell orders..</param>
        /// <param name="market">market.</param>
        /// <param name="regional">regional.</param>
        public InlineResponse20088Data(string idNotation = default(string), string sourceIdentifier = default(string), bool? suspended = default(bool?), string tradingStatus = default(string), decimal? priceDelay = default(decimal?), decimal? tickSize = default(decimal?), decimal? lotSize = default(decimal?), decimal? tradeImbalance = default(decimal?), InlineResponse20088DataMarket market = default(InlineResponse20088DataMarket), InlineResponse20088DataRegional regional = default(InlineResponse20088DataRegional))
        {
            this.IdNotation = idNotation;
            this.SourceIdentifier = sourceIdentifier;
            this.Suspended = suspended;
            this.TradingStatus = tradingStatus;
            this.PriceDelay = priceDelay;
            this.TickSize = tickSize;
            this.LotSize = lotSize;
            this.TradeImbalance = tradeImbalance;
            this.Market = market;
            this.Regional = regional;
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
        /// Indicates whether the notation is currently suspended from trading. The notation is tradable if it is not suspended and the market is open, see attribute &#x60;market.isOpen&#x60;.
        /// </summary>
        /// <value>Indicates whether the notation is currently suspended from trading. The notation is tradable if it is not suspended and the market is open, see attribute &#x60;market.isOpen&#x60;.</value>
        [DataMember(Name = "suspended", EmitDefaultValue = true)]
        public bool? Suspended { get; set; }

        /// <summary>
        /// Market-specific code of the trading status and/or the suspension of the notation.
        /// </summary>
        /// <value>Market-specific code of the trading status and/or the suspension of the notation.</value>
        [DataMember(Name = "tradingStatus", EmitDefaultValue = true)]
        public string TradingStatus { get; set; }

        /// <summary>
        /// Exchange-imposed delay in seconds for delayed-quality tick data.
        /// </summary>
        /// <value>Exchange-imposed delay in seconds for delayed-quality tick data.</value>
        [DataMember(Name = "priceDelay", EmitDefaultValue = true)]
        public decimal? PriceDelay { get; set; }

        /// <summary>
        /// The minimum price movement of the notation. Prices can only be integral multiples of this minimum value. See endpoint &#x60;/notation/get&#x60; for the value unit of the &#x60;tickSize&#x60; for this notation.
        /// </summary>
        /// <value>The minimum price movement of the notation. Prices can only be integral multiples of this minimum value. See endpoint &#x60;/notation/get&#x60; for the value unit of the &#x60;tickSize&#x60; for this notation.</value>
        [DataMember(Name = "tickSize", EmitDefaultValue = true)]
        public decimal? TickSize { get; set; }

        /// <summary>
        /// The minimum tradable volume of the notation. The number of units traded can only be integral multiples of this minimum value.
        /// </summary>
        /// <value>The minimum tradable volume of the notation. The number of units traded can only be integral multiples of this minimum value.</value>
        [DataMember(Name = "lotSize", EmitDefaultValue = true)]
        public decimal? LotSize { get; set; }

        /// <summary>
        /// Trade imbalance after the previous closed auction. A positive value indicates that more buy orders have been placed for the security; a negative value indicates more sell orders.
        /// </summary>
        /// <value>Trade imbalance after the previous closed auction. A positive value indicates that more buy orders have been placed for the security; a negative value indicates more sell orders.</value>
        [DataMember(Name = "tradeImbalance", EmitDefaultValue = true)]
        public decimal? TradeImbalance { get; set; }

        /// <summary>
        /// Gets or Sets Market
        /// </summary>
        [DataMember(Name = "market", EmitDefaultValue = false)]
        public InlineResponse20088DataMarket Market { get; set; }

        /// <summary>
        /// Gets or Sets Regional
        /// </summary>
        [DataMember(Name = "regional", EmitDefaultValue = false)]
        public InlineResponse20088DataRegional Regional { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class InlineResponse20088Data {\n");
            sb.Append("  IdNotation: ").Append(IdNotation).Append("\n");
            sb.Append("  SourceIdentifier: ").Append(SourceIdentifier).Append("\n");
            sb.Append("  Suspended: ").Append(Suspended).Append("\n");
            sb.Append("  TradingStatus: ").Append(TradingStatus).Append("\n");
            sb.Append("  PriceDelay: ").Append(PriceDelay).Append("\n");
            sb.Append("  TickSize: ").Append(TickSize).Append("\n");
            sb.Append("  LotSize: ").Append(LotSize).Append("\n");
            sb.Append("  TradeImbalance: ").Append(TradeImbalance).Append("\n");
            sb.Append("  Market: ").Append(Market).Append("\n");
            sb.Append("  Regional: ").Append(Regional).Append("\n");
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
            return this.Equals(input as InlineResponse20088Data);
        }

        /// <summary>
        /// Returns true if InlineResponse20088Data instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse20088Data to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse20088Data input)
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
                    this.Suspended == input.Suspended ||
                    (this.Suspended != null &&
                    this.Suspended.Equals(input.Suspended))
                ) && 
                (
                    this.TradingStatus == input.TradingStatus ||
                    (this.TradingStatus != null &&
                    this.TradingStatus.Equals(input.TradingStatus))
                ) && 
                (
                    this.PriceDelay == input.PriceDelay ||
                    (this.PriceDelay != null &&
                    this.PriceDelay.Equals(input.PriceDelay))
                ) && 
                (
                    this.TickSize == input.TickSize ||
                    (this.TickSize != null &&
                    this.TickSize.Equals(input.TickSize))
                ) && 
                (
                    this.LotSize == input.LotSize ||
                    (this.LotSize != null &&
                    this.LotSize.Equals(input.LotSize))
                ) && 
                (
                    this.TradeImbalance == input.TradeImbalance ||
                    (this.TradeImbalance != null &&
                    this.TradeImbalance.Equals(input.TradeImbalance))
                ) && 
                (
                    this.Market == input.Market ||
                    (this.Market != null &&
                    this.Market.Equals(input.Market))
                ) && 
                (
                    this.Regional == input.Regional ||
                    (this.Regional != null &&
                    this.Regional.Equals(input.Regional))
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
                if (this.Suspended != null)
                {
                    hashCode = (hashCode * 59) + this.Suspended.GetHashCode();
                }
                if (this.TradingStatus != null)
                {
                    hashCode = (hashCode * 59) + this.TradingStatus.GetHashCode();
                }
                if (this.PriceDelay != null)
                {
                    hashCode = (hashCode * 59) + this.PriceDelay.GetHashCode();
                }
                if (this.TickSize != null)
                {
                    hashCode = (hashCode * 59) + this.TickSize.GetHashCode();
                }
                if (this.LotSize != null)
                {
                    hashCode = (hashCode * 59) + this.LotSize.GetHashCode();
                }
                if (this.TradeImbalance != null)
                {
                    hashCode = (hashCode * 59) + this.TradeImbalance.GetHashCode();
                }
                if (this.Market != null)
                {
                    hashCode = (hashCode * 59) + this.Market.GetHashCode();
                }
                if (this.Regional != null)
                {
                    hashCode = (hashCode * 59) + this.Regional.GetHashCode();
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
