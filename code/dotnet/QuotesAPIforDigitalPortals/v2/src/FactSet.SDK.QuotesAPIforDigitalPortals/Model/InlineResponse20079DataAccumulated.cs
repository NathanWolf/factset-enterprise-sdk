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
using OpenAPIDateConverter = FactSet.SDK.QuotesAPIforDigitalPortals.Client.OpenAPIDateConverter;

namespace FactSet.SDK.QuotesAPIforDigitalPortals.Model
{
    /// <summary>
    /// Summary data accumulated over all trades of the current trading day.
    /// </summary>
    [DataContract(Name = "inline_response_200_79_data_accumulated")]
    public partial class InlineResponse20079DataAccumulated : IEquatable<InlineResponse20079DataAccumulated>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse20079DataAccumulated" /> class.
        /// </summary>
        /// <param name="numberTrades">Number of trades..</param>
        /// <param name="tradingVolume">Number of units (e.g. shares) traded..</param>
        /// <param name="tradingValue">Monetary equivalent (cash value) of the trades. See attribute &#x60;currency&#x60; for its unit..</param>
        public InlineResponse20079DataAccumulated(decimal numberTrades = default(decimal), decimal tradingVolume = default(decimal), decimal tradingValue = default(decimal))
        {
            this.NumberTrades = numberTrades;
            this.TradingVolume = tradingVolume;
            this.TradingValue = tradingValue;
        }

        /// <summary>
        /// Number of trades.
        /// </summary>
        /// <value>Number of trades.</value>
        [DataMember(Name = "numberTrades", EmitDefaultValue = false)]
        public decimal NumberTrades { get; set; }

        /// <summary>
        /// Number of units (e.g. shares) traded.
        /// </summary>
        /// <value>Number of units (e.g. shares) traded.</value>
        [DataMember(Name = "tradingVolume", EmitDefaultValue = false)]
        public decimal TradingVolume { get; set; }

        /// <summary>
        /// Monetary equivalent (cash value) of the trades. See attribute &#x60;currency&#x60; for its unit.
        /// </summary>
        /// <value>Monetary equivalent (cash value) of the trades. See attribute &#x60;currency&#x60; for its unit.</value>
        [DataMember(Name = "tradingValue", EmitDefaultValue = false)]
        public decimal TradingValue { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class InlineResponse20079DataAccumulated {\n");
            sb.Append("  NumberTrades: ").Append(NumberTrades).Append("\n");
            sb.Append("  TradingVolume: ").Append(TradingVolume).Append("\n");
            sb.Append("  TradingValue: ").Append(TradingValue).Append("\n");
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
            return this.Equals(input as InlineResponse20079DataAccumulated);
        }

        /// <summary>
        /// Returns true if InlineResponse20079DataAccumulated instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse20079DataAccumulated to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse20079DataAccumulated input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.NumberTrades == input.NumberTrades ||
                    this.NumberTrades.Equals(input.NumberTrades)
                ) && 
                (
                    this.TradingVolume == input.TradingVolume ||
                    this.TradingVolume.Equals(input.TradingVolume)
                ) && 
                (
                    this.TradingValue == input.TradingValue ||
                    this.TradingValue.Equals(input.TradingValue)
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
                hashCode = hashCode * 59 + this.NumberTrades.GetHashCode();
                hashCode = hashCode * 59 + this.TradingVolume.GetHashCode();
                hashCode = hashCode * 59 + this.TradingValue.GetHashCode();
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
