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
    /// Most recent trade or price of the trading day.
    /// </summary>
    [DataContract(Name = "inline_response_200_80_latest")]
    public partial class InlineResponse20080Latest : IEquatable<InlineResponse20080Latest>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse20080Latest" /> class.
        /// </summary>
        /// <param name="time">Date and time..</param>
        /// <param name="price">Price value. See attribute &#x60;valueUnit&#x60; for its unit..</param>
        /// <param name="quoteCondition">Quote condition. Possible values depend on the values delivered by the supplier of the price information..</param>
        /// <param name="tradingVolume">Number of units (e.g. shares) traded..</param>
        /// <param name="tradingValue">Monetary equivalent (cash value) of the trade. See attribute &#x60;currency&#x60; for its unit..</param>
        /// <param name="performance">performance.</param>
        public InlineResponse20080Latest(string time = default(string), decimal price = default(decimal), string quoteCondition = default(string), decimal tradingVolume = default(decimal), decimal tradingValue = default(decimal), InlineResponse20080LatestPerformance performance = default(InlineResponse20080LatestPerformance))
        {
            this.Time = time;
            this.Price = price;
            this.QuoteCondition = quoteCondition;
            this.TradingVolume = tradingVolume;
            this.TradingValue = tradingValue;
            this.Performance = performance;
        }

        /// <summary>
        /// Date and time.
        /// </summary>
        /// <value>Date and time.</value>
        [DataMember(Name = "time", EmitDefaultValue = false)]
        public string Time { get; set; }

        /// <summary>
        /// Price value. See attribute &#x60;valueUnit&#x60; for its unit.
        /// </summary>
        /// <value>Price value. See attribute &#x60;valueUnit&#x60; for its unit.</value>
        [DataMember(Name = "price", EmitDefaultValue = false)]
        public decimal Price { get; set; }

        /// <summary>
        /// Quote condition. Possible values depend on the values delivered by the supplier of the price information.
        /// </summary>
        /// <value>Quote condition. Possible values depend on the values delivered by the supplier of the price information.</value>
        [DataMember(Name = "quoteCondition", EmitDefaultValue = false)]
        public string QuoteCondition { get; set; }

        /// <summary>
        /// Number of units (e.g. shares) traded.
        /// </summary>
        /// <value>Number of units (e.g. shares) traded.</value>
        [DataMember(Name = "tradingVolume", EmitDefaultValue = false)]
        public decimal TradingVolume { get; set; }

        /// <summary>
        /// Monetary equivalent (cash value) of the trade. See attribute &#x60;currency&#x60; for its unit.
        /// </summary>
        /// <value>Monetary equivalent (cash value) of the trade. See attribute &#x60;currency&#x60; for its unit.</value>
        [DataMember(Name = "tradingValue", EmitDefaultValue = false)]
        public decimal TradingValue { get; set; }

        /// <summary>
        /// Gets or Sets Performance
        /// </summary>
        [DataMember(Name = "performance", EmitDefaultValue = false)]
        public InlineResponse20080LatestPerformance Performance { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class InlineResponse20080Latest {\n");
            sb.Append("  Time: ").Append(Time).Append("\n");
            sb.Append("  Price: ").Append(Price).Append("\n");
            sb.Append("  QuoteCondition: ").Append(QuoteCondition).Append("\n");
            sb.Append("  TradingVolume: ").Append(TradingVolume).Append("\n");
            sb.Append("  TradingValue: ").Append(TradingValue).Append("\n");
            sb.Append("  Performance: ").Append(Performance).Append("\n");
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
            return this.Equals(input as InlineResponse20080Latest);
        }

        /// <summary>
        /// Returns true if InlineResponse20080Latest instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse20080Latest to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse20080Latest input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Time == input.Time ||
                    (this.Time != null &&
                    this.Time.Equals(input.Time))
                ) && 
                (
                    this.Price == input.Price ||
                    this.Price.Equals(input.Price)
                ) && 
                (
                    this.QuoteCondition == input.QuoteCondition ||
                    (this.QuoteCondition != null &&
                    this.QuoteCondition.Equals(input.QuoteCondition))
                ) && 
                (
                    this.TradingVolume == input.TradingVolume ||
                    this.TradingVolume.Equals(input.TradingVolume)
                ) && 
                (
                    this.TradingValue == input.TradingValue ||
                    this.TradingValue.Equals(input.TradingValue)
                ) && 
                (
                    this.Performance == input.Performance ||
                    (this.Performance != null &&
                    this.Performance.Equals(input.Performance))
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
                if (this.Time != null)
                {
                    hashCode = (hashCode * 59) + this.Time.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.Price.GetHashCode();
                if (this.QuoteCondition != null)
                {
                    hashCode = (hashCode * 59) + this.QuoteCondition.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.TradingVolume.GetHashCode();
                hashCode = (hashCode * 59) + this.TradingValue.GetHashCode();
                if (this.Performance != null)
                {
                    hashCode = (hashCode * 59) + this.Performance.GetHashCode();
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
