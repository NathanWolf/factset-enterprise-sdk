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
    /// Set of basic data for the notation.
    /// </summary>
    [DataContract(Name = "inline_response_200_68_data")]
    public partial class InlineResponse20068Data : IEquatable<InlineResponse20068Data>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse20068Data" /> class.
        /// </summary>
        /// <param name="idNotation">MDG identifier of the listing..</param>
        /// <param name="sourceIdentifier">Identifier used in the request..</param>
        /// <param name="symbol">The symbol of the notation. It is a market-specific code to identify the notation. Which characters can be part of a symbol depends on the market. If a market does not define a proprietary symbol, but uses a different identifier (for example, the ISIN or the WKN) to identify notations, no symbol will be set for the notations of that market..</param>
        /// <param name="factSetMarketSymbol">The FactSet market symbol of the notation (i.e. TICKER_EXCHANGE)..</param>
        /// <param name="valueUnit">valueUnit.</param>
        /// <param name="market">market.</param>
        /// <param name="instrument">instrument.</param>
        public InlineResponse20068Data(string idNotation = default(string), string sourceIdentifier = default(string), string symbol = default(string), string factSetMarketSymbol = default(string), InlineResponse20068DataValueUnit valueUnit = default(InlineResponse20068DataValueUnit), InlineResponse20068DataMarket market = default(InlineResponse20068DataMarket), InlineResponse20068DataInstrument instrument = default(InlineResponse20068DataInstrument))
        {
            this.IdNotation = idNotation;
            this.SourceIdentifier = sourceIdentifier;
            this.Symbol = symbol;
            this.FactSetMarketSymbol = factSetMarketSymbol;
            this.ValueUnit = valueUnit;
            this.Market = market;
            this.Instrument = instrument;
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
        /// The symbol of the notation. It is a market-specific code to identify the notation. Which characters can be part of a symbol depends on the market. If a market does not define a proprietary symbol, but uses a different identifier (for example, the ISIN or the WKN) to identify notations, no symbol will be set for the notations of that market.
        /// </summary>
        /// <value>The symbol of the notation. It is a market-specific code to identify the notation. Which characters can be part of a symbol depends on the market. If a market does not define a proprietary symbol, but uses a different identifier (for example, the ISIN or the WKN) to identify notations, no symbol will be set for the notations of that market.</value>
        [DataMember(Name = "symbol", EmitDefaultValue = true)]
        public string Symbol { get; set; }

        /// <summary>
        /// The FactSet market symbol of the notation (i.e. TICKER_EXCHANGE).
        /// </summary>
        /// <value>The FactSet market symbol of the notation (i.e. TICKER_EXCHANGE).</value>
        [DataMember(Name = "factSetMarketSymbol", EmitDefaultValue = true)]
        public string FactSetMarketSymbol { get; set; }

        /// <summary>
        /// Gets or Sets ValueUnit
        /// </summary>
        [DataMember(Name = "valueUnit", EmitDefaultValue = false)]
        public InlineResponse20068DataValueUnit ValueUnit { get; set; }

        /// <summary>
        /// Gets or Sets Market
        /// </summary>
        [DataMember(Name = "market", EmitDefaultValue = false)]
        public InlineResponse20068DataMarket Market { get; set; }

        /// <summary>
        /// Gets or Sets Instrument
        /// </summary>
        [DataMember(Name = "instrument", EmitDefaultValue = false)]
        public InlineResponse20068DataInstrument Instrument { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class InlineResponse20068Data {\n");
            sb.Append("  IdNotation: ").Append(IdNotation).Append("\n");
            sb.Append("  SourceIdentifier: ").Append(SourceIdentifier).Append("\n");
            sb.Append("  Symbol: ").Append(Symbol).Append("\n");
            sb.Append("  FactSetMarketSymbol: ").Append(FactSetMarketSymbol).Append("\n");
            sb.Append("  ValueUnit: ").Append(ValueUnit).Append("\n");
            sb.Append("  Market: ").Append(Market).Append("\n");
            sb.Append("  Instrument: ").Append(Instrument).Append("\n");
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
            return this.Equals(input as InlineResponse20068Data);
        }

        /// <summary>
        /// Returns true if InlineResponse20068Data instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse20068Data to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse20068Data input)
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
                    this.Symbol == input.Symbol ||
                    (this.Symbol != null &&
                    this.Symbol.Equals(input.Symbol))
                ) && 
                (
                    this.FactSetMarketSymbol == input.FactSetMarketSymbol ||
                    (this.FactSetMarketSymbol != null &&
                    this.FactSetMarketSymbol.Equals(input.FactSetMarketSymbol))
                ) && 
                (
                    this.ValueUnit == input.ValueUnit ||
                    (this.ValueUnit != null &&
                    this.ValueUnit.Equals(input.ValueUnit))
                ) && 
                (
                    this.Market == input.Market ||
                    (this.Market != null &&
                    this.Market.Equals(input.Market))
                ) && 
                (
                    this.Instrument == input.Instrument ||
                    (this.Instrument != null &&
                    this.Instrument.Equals(input.Instrument))
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
                if (this.Symbol != null)
                {
                    hashCode = (hashCode * 59) + this.Symbol.GetHashCode();
                }
                if (this.FactSetMarketSymbol != null)
                {
                    hashCode = (hashCode * 59) + this.FactSetMarketSymbol.GetHashCode();
                }
                if (this.ValueUnit != null)
                {
                    hashCode = (hashCode * 59) + this.ValueUnit.GetHashCode();
                }
                if (this.Market != null)
                {
                    hashCode = (hashCode * 59) + this.Market.GetHashCode();
                }
                if (this.Instrument != null)
                {
                    hashCode = (hashCode * 59) + this.Instrument.GetHashCode();
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
