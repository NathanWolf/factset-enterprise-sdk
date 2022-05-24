/*
 * Stocks API For Digital Portals
 *
 * The stocks API features a screener to search for equity instruments based on stock-specific parameters.  Parameters for up to three fiscal years might now be used in one request; data is available for the ten most recent completed fiscal years. Estimates are available for the current and two consecutive fiscal years.  A separate endpoint returns the possible values and value ranges for the parameters that the endpoint /stock/notation/screener/search accepts: Application developers can request the values and value ranges only for a restricted set of notations that match predefined parameters. This functionality may be used to pre-fill the values and value ranges of the parameters of the /stock/notation/screener/search endpoint so that performing a search always leads to a non-empty set of notations.  The endpoint /stock/notation/ranking/intraday/list ranks stocks notations using intraday figures, for example to build a gainers/losers list.   Additional endpoints include end-of-day benchmark key figures, and selected fundamentals (as of end of fiscal year and with potentially daily updates).  This API is fully integrated with the corresponding Quotes API, allowing access to detailed price and performance information of instruments, as well as basic security identifier cross-reference. For direct access to price histories, please refer to the Time Series API for Digital Portals.  Similar criteria based screener APIs exist for fixed income instruments and securitized derivatives: See the Bonds API and the Securitized Derivatives API for details.
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
using OpenAPIDateConverter = FactSet.SDK.StocksAPIforDigitalPortals.Client.OpenAPIDateConverter;

namespace FactSet.SDK.StocksAPIforDigitalPortals.Model
{
    /// <summary>
    /// InlineResponse20010Data
    /// </summary>
    [DataContract(Name = "inline_response_200_10_data")]
    public partial class InlineResponse20010Data : IEquatable<InlineResponse20010Data>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse20010Data" /> class.
        /// </summary>
        /// <param name="id">Identifier of a notation..</param>
        /// <param name="symbol">The symbol of the notation. It is a market-specific code to identify the notation. Which characters can be part of a symbol depends on the market. If a market does not define a proprietary symbol, but uses a different identifier (for example, the ISIN or the WKN) to identify instruments, no symbol will be set for the notations of that market..</param>
        /// <param name="market">market.</param>
        /// <param name="currency">currency.</param>
        /// <param name="isAlternative">Indicates whether the notation is an alternative one, i.e. not the original notation of the index constituent..</param>
        /// <param name="trade">trade.</param>
        /// <param name="quality">Quality of the trade-related attributes, see attributes &#x60;trade&#x60; and &#x60;accumulated&#x60;..</param>
        /// <param name="accumulated">accumulated.</param>
        /// <param name="fsym">fsym.</param>
        /// <param name="instrument">instrument.</param>
        public InlineResponse20010Data(string id = default(string), string symbol = default(string), InlineResponse20010Market market = default(InlineResponse20010Market), InlineResponse20010Currency currency = default(InlineResponse20010Currency), bool isAlternative = default(bool), InlineResponse20010Trade trade = default(InlineResponse20010Trade), string quality = default(string), InlineResponse20010Accumulated accumulated = default(InlineResponse20010Accumulated), InlineResponse20010Fsym fsym = default(InlineResponse20010Fsym), InlineResponse20010Instrument instrument = default(InlineResponse20010Instrument))
        {
            this.Id = id;
            this.Symbol = symbol;
            this.Market = market;
            this.Currency = currency;
            this.IsAlternative = isAlternative;
            this.Trade = trade;
            this.Quality = quality;
            this.Accumulated = accumulated;
            this.Fsym = fsym;
            this.Instrument = instrument;
        }

        /// <summary>
        /// Identifier of a notation.
        /// </summary>
        /// <value>Identifier of a notation.</value>
        [DataMember(Name = "id", EmitDefaultValue = false)]
        public string Id { get; set; }

        /// <summary>
        /// The symbol of the notation. It is a market-specific code to identify the notation. Which characters can be part of a symbol depends on the market. If a market does not define a proprietary symbol, but uses a different identifier (for example, the ISIN or the WKN) to identify instruments, no symbol will be set for the notations of that market.
        /// </summary>
        /// <value>The symbol of the notation. It is a market-specific code to identify the notation. Which characters can be part of a symbol depends on the market. If a market does not define a proprietary symbol, but uses a different identifier (for example, the ISIN or the WKN) to identify instruments, no symbol will be set for the notations of that market.</value>
        [DataMember(Name = "symbol", EmitDefaultValue = false)]
        public string Symbol { get; set; }

        /// <summary>
        /// Gets or Sets Market
        /// </summary>
        [DataMember(Name = "market", EmitDefaultValue = false)]
        public InlineResponse20010Market Market { get; set; }

        /// <summary>
        /// Gets or Sets Currency
        /// </summary>
        [DataMember(Name = "currency", EmitDefaultValue = false)]
        public InlineResponse20010Currency Currency { get; set; }

        /// <summary>
        /// Indicates whether the notation is an alternative one, i.e. not the original notation of the index constituent.
        /// </summary>
        /// <value>Indicates whether the notation is an alternative one, i.e. not the original notation of the index constituent.</value>
        [DataMember(Name = "isAlternative", EmitDefaultValue = true)]
        public bool IsAlternative { get; set; }

        /// <summary>
        /// Gets or Sets Trade
        /// </summary>
        [DataMember(Name = "trade", EmitDefaultValue = false)]
        public InlineResponse20010Trade Trade { get; set; }

        /// <summary>
        /// Quality of the trade-related attributes, see attributes &#x60;trade&#x60; and &#x60;accumulated&#x60;.
        /// </summary>
        /// <value>Quality of the trade-related attributes, see attributes &#x60;trade&#x60; and &#x60;accumulated&#x60;.</value>
        [DataMember(Name = "quality", EmitDefaultValue = false)]
        public string Quality { get; set; }

        /// <summary>
        /// Gets or Sets Accumulated
        /// </summary>
        [DataMember(Name = "accumulated", EmitDefaultValue = false)]
        public InlineResponse20010Accumulated Accumulated { get; set; }

        /// <summary>
        /// Gets or Sets Fsym
        /// </summary>
        [DataMember(Name = "fsym", EmitDefaultValue = false)]
        public InlineResponse20010Fsym Fsym { get; set; }

        /// <summary>
        /// Gets or Sets Instrument
        /// </summary>
        [DataMember(Name = "instrument", EmitDefaultValue = false)]
        public InlineResponse20010Instrument Instrument { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class InlineResponse20010Data {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Symbol: ").Append(Symbol).Append("\n");
            sb.Append("  Market: ").Append(Market).Append("\n");
            sb.Append("  Currency: ").Append(Currency).Append("\n");
            sb.Append("  IsAlternative: ").Append(IsAlternative).Append("\n");
            sb.Append("  Trade: ").Append(Trade).Append("\n");
            sb.Append("  Quality: ").Append(Quality).Append("\n");
            sb.Append("  Accumulated: ").Append(Accumulated).Append("\n");
            sb.Append("  Fsym: ").Append(Fsym).Append("\n");
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
            return this.Equals(input as InlineResponse20010Data);
        }

        /// <summary>
        /// Returns true if InlineResponse20010Data instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse20010Data to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse20010Data input)
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
                    this.Symbol == input.Symbol ||
                    (this.Symbol != null &&
                    this.Symbol.Equals(input.Symbol))
                ) && 
                (
                    this.Market == input.Market ||
                    (this.Market != null &&
                    this.Market.Equals(input.Market))
                ) && 
                (
                    this.Currency == input.Currency ||
                    (this.Currency != null &&
                    this.Currency.Equals(input.Currency))
                ) && 
                (
                    this.IsAlternative == input.IsAlternative ||
                    this.IsAlternative.Equals(input.IsAlternative)
                ) && 
                (
                    this.Trade == input.Trade ||
                    (this.Trade != null &&
                    this.Trade.Equals(input.Trade))
                ) && 
                (
                    this.Quality == input.Quality ||
                    (this.Quality != null &&
                    this.Quality.Equals(input.Quality))
                ) && 
                (
                    this.Accumulated == input.Accumulated ||
                    (this.Accumulated != null &&
                    this.Accumulated.Equals(input.Accumulated))
                ) && 
                (
                    this.Fsym == input.Fsym ||
                    (this.Fsym != null &&
                    this.Fsym.Equals(input.Fsym))
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
                if (this.Id != null)
                {
                    hashCode = (hashCode * 59) + this.Id.GetHashCode();
                }
                if (this.Symbol != null)
                {
                    hashCode = (hashCode * 59) + this.Symbol.GetHashCode();
                }
                if (this.Market != null)
                {
                    hashCode = (hashCode * 59) + this.Market.GetHashCode();
                }
                if (this.Currency != null)
                {
                    hashCode = (hashCode * 59) + this.Currency.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.IsAlternative.GetHashCode();
                if (this.Trade != null)
                {
                    hashCode = (hashCode * 59) + this.Trade.GetHashCode();
                }
                if (this.Quality != null)
                {
                    hashCode = (hashCode * 59) + this.Quality.GetHashCode();
                }
                if (this.Accumulated != null)
                {
                    hashCode = (hashCode * 59) + this.Accumulated.GetHashCode();
                }
                if (this.Fsym != null)
                {
                    hashCode = (hashCode * 59) + this.Fsym.GetHashCode();
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
