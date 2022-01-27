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
    /// Simple moving average (SMA), that is the arithmetic mean of a notation’s EOD closing price, for different time ranges.
    /// </summary>
    [DataContract(Name = "inline_response_200_4_simpleMovingAverage")]
    public partial class InlineResponse2004SimpleMovingAverage : IEquatable<InlineResponse2004SimpleMovingAverage>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse2004SimpleMovingAverage" /> class.
        /// </summary>
        /// <param name="days20">20 trading days..</param>
        /// <param name="days50">50 trading days..</param>
        /// <param name="days200">200 trading days..</param>
        /// <param name="tradingDaysSinceCrossover">tradingDaysSinceCrossover.</param>
        public InlineResponse2004SimpleMovingAverage(decimal days20 = default(decimal), decimal days50 = default(decimal), decimal days200 = default(decimal), InlineResponse2004SimpleMovingAverageTradingDaysSinceCrossover tradingDaysSinceCrossover = default(InlineResponse2004SimpleMovingAverageTradingDaysSinceCrossover))
        {
            this.Days20 = days20;
            this.Days50 = days50;
            this.Days200 = days200;
            this.TradingDaysSinceCrossover = tradingDaysSinceCrossover;
        }

        /// <summary>
        /// 20 trading days.
        /// </summary>
        /// <value>20 trading days.</value>
        [DataMember(Name = "days20", EmitDefaultValue = false)]
        public decimal Days20 { get; set; }

        /// <summary>
        /// 50 trading days.
        /// </summary>
        /// <value>50 trading days.</value>
        [DataMember(Name = "days50", EmitDefaultValue = false)]
        public decimal Days50 { get; set; }

        /// <summary>
        /// 200 trading days.
        /// </summary>
        /// <value>200 trading days.</value>
        [DataMember(Name = "days200", EmitDefaultValue = false)]
        public decimal Days200 { get; set; }

        /// <summary>
        /// Gets or Sets TradingDaysSinceCrossover
        /// </summary>
        [DataMember(Name = "tradingDaysSinceCrossover", EmitDefaultValue = false)]
        public InlineResponse2004SimpleMovingAverageTradingDaysSinceCrossover TradingDaysSinceCrossover { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class InlineResponse2004SimpleMovingAverage {\n");
            sb.Append("  Days20: ").Append(Days20).Append("\n");
            sb.Append("  Days50: ").Append(Days50).Append("\n");
            sb.Append("  Days200: ").Append(Days200).Append("\n");
            sb.Append("  TradingDaysSinceCrossover: ").Append(TradingDaysSinceCrossover).Append("\n");
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
            return this.Equals(input as InlineResponse2004SimpleMovingAverage);
        }

        /// <summary>
        /// Returns true if InlineResponse2004SimpleMovingAverage instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse2004SimpleMovingAverage to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse2004SimpleMovingAverage input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Days20 == input.Days20 ||
                    this.Days20.Equals(input.Days20)
                ) && 
                (
                    this.Days50 == input.Days50 ||
                    this.Days50.Equals(input.Days50)
                ) && 
                (
                    this.Days200 == input.Days200 ||
                    this.Days200.Equals(input.Days200)
                ) && 
                (
                    this.TradingDaysSinceCrossover == input.TradingDaysSinceCrossover ||
                    (this.TradingDaysSinceCrossover != null &&
                    this.TradingDaysSinceCrossover.Equals(input.TradingDaysSinceCrossover))
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
                hashCode = hashCode * 59 + this.Days20.GetHashCode();
                hashCode = hashCode * 59 + this.Days50.GetHashCode();
                hashCode = hashCode * 59 + this.Days200.GetHashCode();
                if (this.TradingDaysSinceCrossover != null)
                    hashCode = hashCode * 59 + this.TradingDaysSinceCrossover.GetHashCode();
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
