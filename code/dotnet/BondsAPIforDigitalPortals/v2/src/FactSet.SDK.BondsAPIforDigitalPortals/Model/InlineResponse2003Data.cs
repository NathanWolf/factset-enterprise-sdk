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
using OpenAPIDateConverter = FactSet.SDK.BondsAPIforDigitalPortals.Client.OpenAPIDateConverter;

namespace FactSet.SDK.BondsAPIforDigitalPortals.Model
{
    /// <summary>
    /// InlineResponse2003Data
    /// </summary>
    [DataContract(Name = "inline_response_200_3_data")]
    public partial class InlineResponse2003Data : IEquatable<InlineResponse2003Data>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse2003Data" /> class.
        /// </summary>
        /// <param name="id">Identifier of the notation..</param>
        /// <param name="valueUnit">valueUnit.</param>
        /// <param name="market">market.</param>
        /// <param name="symbol">The symbol of the notation. It is a market-specific code to identify the notation. Which characters can be part of a symbol depends on the market. If a market does not define a proprietary symbol, but uses a different identifier (for example, the ISIN or the WKN) to identify instruments, no symbol will be set for the notations of that market..</param>
        /// <param name="nsin">nsin.</param>
        /// <param name="fsym">fsym.</param>
        /// <param name="instrument">instrument.</param>
        /// <param name="yield">yield.</param>
        /// <param name="macaulayDuration">Macaulay duration, which is the average period (in years) of capital commitment..</param>
        /// <param name="sensitivities">sensitivities.</param>
        /// <param name="tradedValue">tradedValue.</param>
        public InlineResponse2003Data(string id = default(string), InlineResponse2003ValueUnit valueUnit = default(InlineResponse2003ValueUnit), InlineResponse2003Market market = default(InlineResponse2003Market), string symbol = default(string), InlineResponse2003Nsin nsin = default(InlineResponse2003Nsin), InlineResponse2003Fsym fsym = default(InlineResponse2003Fsym), InlineResponse2003Instrument instrument = default(InlineResponse2003Instrument), InlineResponse2003Yield yield = default(InlineResponse2003Yield), decimal macaulayDuration = default(decimal), InlineResponse2003Sensitivities sensitivities = default(InlineResponse2003Sensitivities), InlineResponse2003TradedValue tradedValue = default(InlineResponse2003TradedValue))
        {
            this.Id = id;
            this.ValueUnit = valueUnit;
            this.Market = market;
            this.Symbol = symbol;
            this.Nsin = nsin;
            this.Fsym = fsym;
            this.Instrument = instrument;
            this.Yield = yield;
            this.MacaulayDuration = macaulayDuration;
            this.Sensitivities = sensitivities;
            this.TradedValue = tradedValue;
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
        public InlineResponse2003ValueUnit ValueUnit { get; set; }

        /// <summary>
        /// Gets or Sets Market
        /// </summary>
        [DataMember(Name = "market", EmitDefaultValue = false)]
        public InlineResponse2003Market Market { get; set; }

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
        public InlineResponse2003Nsin Nsin { get; set; }

        /// <summary>
        /// Gets or Sets Fsym
        /// </summary>
        [DataMember(Name = "fsym", EmitDefaultValue = false)]
        public InlineResponse2003Fsym Fsym { get; set; }

        /// <summary>
        /// Gets or Sets Instrument
        /// </summary>
        [DataMember(Name = "instrument", EmitDefaultValue = false)]
        public InlineResponse2003Instrument Instrument { get; set; }

        /// <summary>
        /// Gets or Sets Yield
        /// </summary>
        [DataMember(Name = "yield", EmitDefaultValue = false)]
        public InlineResponse2003Yield Yield { get; set; }

        /// <summary>
        /// Macaulay duration, which is the average period (in years) of capital commitment.
        /// </summary>
        /// <value>Macaulay duration, which is the average period (in years) of capital commitment.</value>
        [DataMember(Name = "macaulayDuration", EmitDefaultValue = false)]
        public decimal MacaulayDuration { get; set; }

        /// <summary>
        /// Gets or Sets Sensitivities
        /// </summary>
        [DataMember(Name = "sensitivities", EmitDefaultValue = false)]
        public InlineResponse2003Sensitivities Sensitivities { get; set; }

        /// <summary>
        /// Gets or Sets TradedValue
        /// </summary>
        [DataMember(Name = "tradedValue", EmitDefaultValue = false)]
        public InlineResponse2003TradedValue TradedValue { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class InlineResponse2003Data {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  ValueUnit: ").Append(ValueUnit).Append("\n");
            sb.Append("  Market: ").Append(Market).Append("\n");
            sb.Append("  Symbol: ").Append(Symbol).Append("\n");
            sb.Append("  Nsin: ").Append(Nsin).Append("\n");
            sb.Append("  Fsym: ").Append(Fsym).Append("\n");
            sb.Append("  Instrument: ").Append(Instrument).Append("\n");
            sb.Append("  Yield: ").Append(Yield).Append("\n");
            sb.Append("  MacaulayDuration: ").Append(MacaulayDuration).Append("\n");
            sb.Append("  Sensitivities: ").Append(Sensitivities).Append("\n");
            sb.Append("  TradedValue: ").Append(TradedValue).Append("\n");
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
            return this.Equals(input as InlineResponse2003Data);
        }

        /// <summary>
        /// Returns true if InlineResponse2003Data instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse2003Data to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse2003Data input)
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
                    this.Yield == input.Yield ||
                    (this.Yield != null &&
                    this.Yield.Equals(input.Yield))
                ) && 
                (
                    this.MacaulayDuration == input.MacaulayDuration ||
                    this.MacaulayDuration.Equals(input.MacaulayDuration)
                ) && 
                (
                    this.Sensitivities == input.Sensitivities ||
                    (this.Sensitivities != null &&
                    this.Sensitivities.Equals(input.Sensitivities))
                ) && 
                (
                    this.TradedValue == input.TradedValue ||
                    (this.TradedValue != null &&
                    this.TradedValue.Equals(input.TradedValue))
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
                if (this.Yield != null)
                    hashCode = hashCode * 59 + this.Yield.GetHashCode();
                hashCode = hashCode * 59 + this.MacaulayDuration.GetHashCode();
                if (this.Sensitivities != null)
                    hashCode = hashCode * 59 + this.Sensitivities.GetHashCode();
                if (this.TradedValue != null)
                    hashCode = hashCode * 59 + this.TradedValue.GetHashCode();
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
