/*
 * Prime Developer Trial
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1
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
    /// InlineResponse2004Data
    /// </summary>
    [DataContract(Name = "inline_response_200_4_data")]
    public partial class InlineResponse2004Data : IEquatable<InlineResponse2004Data>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse2004Data" /> class.
        /// </summary>
        /// <param name="id">Identifier of the notation..</param>
        /// <param name="valueUnit">valueUnit.</param>
        /// <param name="market">market.</param>
        /// <param name="symbol">The symbol of the notation. It is a market-specific code to identify the notation. Which characters can be part of a symbol depends on the market. If a market does not define a proprietary symbol, but uses a different identifier (for example, the ISIN or the WKN) to identify instruments, no symbol will be set for the notations of that market..</param>
        /// <param name="nsin">nsin.</param>
        /// <param name="fsym">fsym.</param>
        /// <param name="instrument">instrument.</param>
        /// <param name="compliance">compliance.</param>
        /// <param name="reportedKeyFigures">reportedKeyFigures.</param>
        /// <param name="performance">performance.</param>
        /// <param name="volatility">volatility.</param>
        /// <param name="tradingValue">tradingValue.</param>
        /// <param name="simpleMovingAverage">simpleMovingAverage.</param>
        /// <param name="rsiWilder">rsiWilder.</param>
        /// <param name="recommendation">recommendation.</param>
        /// <param name="estimates">estimates.</param>
        public InlineResponse2004Data(string id = default(string), InlineResponse2004ValueUnit valueUnit = default(InlineResponse2004ValueUnit), InlineResponse2004Market market = default(InlineResponse2004Market), string symbol = default(string), InlineResponse2004Nsin nsin = default(InlineResponse2004Nsin), InlineResponse2003Fsym fsym = default(InlineResponse2003Fsym), InlineResponse2004Instrument instrument = default(InlineResponse2004Instrument), InlineResponse2004Compliance compliance = default(InlineResponse2004Compliance), InlineResponse2004ReportedKeyFigures reportedKeyFigures = default(InlineResponse2004ReportedKeyFigures), InlineResponse2004Performance performance = default(InlineResponse2004Performance), InlineResponse2004Volatility volatility = default(InlineResponse2004Volatility), InlineResponse2004TradingValue tradingValue = default(InlineResponse2004TradingValue), InlineResponse2004SimpleMovingAverage simpleMovingAverage = default(InlineResponse2004SimpleMovingAverage), InlineResponse2004RsiWilder rsiWilder = default(InlineResponse2004RsiWilder), InlineResponse2004Recommendation recommendation = default(InlineResponse2004Recommendation), InlineResponse2004Estimates estimates = default(InlineResponse2004Estimates))
        {
            this.Id = id;
            this.ValueUnit = valueUnit;
            this.Market = market;
            this.Symbol = symbol;
            this.Nsin = nsin;
            this.Fsym = fsym;
            this.Instrument = instrument;
            this.Compliance = compliance;
            this.ReportedKeyFigures = reportedKeyFigures;
            this.Performance = performance;
            this.Volatility = volatility;
            this.TradingValue = tradingValue;
            this.SimpleMovingAverage = simpleMovingAverage;
            this.RsiWilder = rsiWilder;
            this.Recommendation = recommendation;
            this.Estimates = estimates;
        }

        /// <summary>
        /// Identifier of the notation.
        /// </summary>
        /// <value>Identifier of the notation.</value>
        [DataMember(Name = "id", EmitDefaultValue = false)]
        public string Id { get; set; }

        /// <summary>
        /// Gets or Sets ValueUnit
        /// </summary>
        [DataMember(Name = "valueUnit", EmitDefaultValue = false)]
        public InlineResponse2004ValueUnit ValueUnit { get; set; }

        /// <summary>
        /// Gets or Sets Market
        /// </summary>
        [DataMember(Name = "market", EmitDefaultValue = false)]
        public InlineResponse2004Market Market { get; set; }

        /// <summary>
        /// The symbol of the notation. It is a market-specific code to identify the notation. Which characters can be part of a symbol depends on the market. If a market does not define a proprietary symbol, but uses a different identifier (for example, the ISIN or the WKN) to identify instruments, no symbol will be set for the notations of that market.
        /// </summary>
        /// <value>The symbol of the notation. It is a market-specific code to identify the notation. Which characters can be part of a symbol depends on the market. If a market does not define a proprietary symbol, but uses a different identifier (for example, the ISIN or the WKN) to identify instruments, no symbol will be set for the notations of that market.</value>
        [DataMember(Name = "symbol", EmitDefaultValue = false)]
        public string Symbol { get; set; }

        /// <summary>
        /// Gets or Sets Nsin
        /// </summary>
        [DataMember(Name = "nsin", EmitDefaultValue = false)]
        public InlineResponse2004Nsin Nsin { get; set; }

        /// <summary>
        /// Gets or Sets Fsym
        /// </summary>
        [DataMember(Name = "fsym", EmitDefaultValue = false)]
        public InlineResponse2003Fsym Fsym { get; set; }

        /// <summary>
        /// Gets or Sets Instrument
        /// </summary>
        [DataMember(Name = "instrument", EmitDefaultValue = false)]
        public InlineResponse2004Instrument Instrument { get; set; }

        /// <summary>
        /// Gets or Sets Compliance
        /// </summary>
        [DataMember(Name = "compliance", EmitDefaultValue = false)]
        public InlineResponse2004Compliance Compliance { get; set; }

        /// <summary>
        /// Gets or Sets ReportedKeyFigures
        /// </summary>
        [DataMember(Name = "reportedKeyFigures", EmitDefaultValue = false)]
        public InlineResponse2004ReportedKeyFigures ReportedKeyFigures { get; set; }

        /// <summary>
        /// Gets or Sets Performance
        /// </summary>
        [DataMember(Name = "performance", EmitDefaultValue = false)]
        public InlineResponse2004Performance Performance { get; set; }

        /// <summary>
        /// Gets or Sets Volatility
        /// </summary>
        [DataMember(Name = "volatility", EmitDefaultValue = false)]
        public InlineResponse2004Volatility Volatility { get; set; }

        /// <summary>
        /// Gets or Sets TradingValue
        /// </summary>
        [DataMember(Name = "tradingValue", EmitDefaultValue = false)]
        public InlineResponse2004TradingValue TradingValue { get; set; }

        /// <summary>
        /// Gets or Sets SimpleMovingAverage
        /// </summary>
        [DataMember(Name = "simpleMovingAverage", EmitDefaultValue = false)]
        public InlineResponse2004SimpleMovingAverage SimpleMovingAverage { get; set; }

        /// <summary>
        /// Gets or Sets RsiWilder
        /// </summary>
        [DataMember(Name = "rsiWilder", EmitDefaultValue = false)]
        public InlineResponse2004RsiWilder RsiWilder { get; set; }

        /// <summary>
        /// Gets or Sets Recommendation
        /// </summary>
        [DataMember(Name = "recommendation", EmitDefaultValue = false)]
        public InlineResponse2004Recommendation Recommendation { get; set; }

        /// <summary>
        /// Gets or Sets Estimates
        /// </summary>
        [DataMember(Name = "estimates", EmitDefaultValue = false)]
        public InlineResponse2004Estimates Estimates { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class InlineResponse2004Data {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  ValueUnit: ").Append(ValueUnit).Append("\n");
            sb.Append("  Market: ").Append(Market).Append("\n");
            sb.Append("  Symbol: ").Append(Symbol).Append("\n");
            sb.Append("  Nsin: ").Append(Nsin).Append("\n");
            sb.Append("  Fsym: ").Append(Fsym).Append("\n");
            sb.Append("  Instrument: ").Append(Instrument).Append("\n");
            sb.Append("  Compliance: ").Append(Compliance).Append("\n");
            sb.Append("  ReportedKeyFigures: ").Append(ReportedKeyFigures).Append("\n");
            sb.Append("  Performance: ").Append(Performance).Append("\n");
            sb.Append("  Volatility: ").Append(Volatility).Append("\n");
            sb.Append("  TradingValue: ").Append(TradingValue).Append("\n");
            sb.Append("  SimpleMovingAverage: ").Append(SimpleMovingAverage).Append("\n");
            sb.Append("  RsiWilder: ").Append(RsiWilder).Append("\n");
            sb.Append("  Recommendation: ").Append(Recommendation).Append("\n");
            sb.Append("  Estimates: ").Append(Estimates).Append("\n");
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
            return this.Equals(input as InlineResponse2004Data);
        }

        /// <summary>
        /// Returns true if InlineResponse2004Data instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse2004Data to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse2004Data input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Id == input.Id ||
                    (this.Id != null &&
                    this.Id.Equals(input.Id))
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
                    this.Symbol == input.Symbol ||
                    (this.Symbol != null &&
                    this.Symbol.Equals(input.Symbol))
                ) && 
                (
                    this.Nsin == input.Nsin ||
                    (this.Nsin != null &&
                    this.Nsin.Equals(input.Nsin))
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
                ) && 
                (
                    this.Compliance == input.Compliance ||
                    (this.Compliance != null &&
                    this.Compliance.Equals(input.Compliance))
                ) && 
                (
                    this.ReportedKeyFigures == input.ReportedKeyFigures ||
                    (this.ReportedKeyFigures != null &&
                    this.ReportedKeyFigures.Equals(input.ReportedKeyFigures))
                ) && 
                (
                    this.Performance == input.Performance ||
                    (this.Performance != null &&
                    this.Performance.Equals(input.Performance))
                ) && 
                (
                    this.Volatility == input.Volatility ||
                    (this.Volatility != null &&
                    this.Volatility.Equals(input.Volatility))
                ) && 
                (
                    this.TradingValue == input.TradingValue ||
                    (this.TradingValue != null &&
                    this.TradingValue.Equals(input.TradingValue))
                ) && 
                (
                    this.SimpleMovingAverage == input.SimpleMovingAverage ||
                    (this.SimpleMovingAverage != null &&
                    this.SimpleMovingAverage.Equals(input.SimpleMovingAverage))
                ) && 
                (
                    this.RsiWilder == input.RsiWilder ||
                    (this.RsiWilder != null &&
                    this.RsiWilder.Equals(input.RsiWilder))
                ) && 
                (
                    this.Recommendation == input.Recommendation ||
                    (this.Recommendation != null &&
                    this.Recommendation.Equals(input.Recommendation))
                ) && 
                (
                    this.Estimates == input.Estimates ||
                    (this.Estimates != null &&
                    this.Estimates.Equals(input.Estimates))
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
                    hashCode = hashCode * 59 + this.Id.GetHashCode();
                if (this.ValueUnit != null)
                    hashCode = hashCode * 59 + this.ValueUnit.GetHashCode();
                if (this.Market != null)
                    hashCode = hashCode * 59 + this.Market.GetHashCode();
                if (this.Symbol != null)
                    hashCode = hashCode * 59 + this.Symbol.GetHashCode();
                if (this.Nsin != null)
                    hashCode = hashCode * 59 + this.Nsin.GetHashCode();
                if (this.Fsym != null)
                    hashCode = hashCode * 59 + this.Fsym.GetHashCode();
                if (this.Instrument != null)
                    hashCode = hashCode * 59 + this.Instrument.GetHashCode();
                if (this.Compliance != null)
                    hashCode = hashCode * 59 + this.Compliance.GetHashCode();
                if (this.ReportedKeyFigures != null)
                    hashCode = hashCode * 59 + this.ReportedKeyFigures.GetHashCode();
                if (this.Performance != null)
                    hashCode = hashCode * 59 + this.Performance.GetHashCode();
                if (this.Volatility != null)
                    hashCode = hashCode * 59 + this.Volatility.GetHashCode();
                if (this.TradingValue != null)
                    hashCode = hashCode * 59 + this.TradingValue.GetHashCode();
                if (this.SimpleMovingAverage != null)
                    hashCode = hashCode * 59 + this.SimpleMovingAverage.GetHashCode();
                if (this.RsiWilder != null)
                    hashCode = hashCode * 59 + this.RsiWilder.GetHashCode();
                if (this.Recommendation != null)
                    hashCode = hashCode * 59 + this.Recommendation.GetHashCode();
                if (this.Estimates != null)
                    hashCode = hashCode * 59 + this.Estimates.GetHashCode();
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
