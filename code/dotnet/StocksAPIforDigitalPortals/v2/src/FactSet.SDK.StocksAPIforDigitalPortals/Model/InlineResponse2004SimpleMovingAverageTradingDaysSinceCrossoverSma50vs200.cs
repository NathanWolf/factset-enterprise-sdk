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
    /// Number of trading days since the crossover and direction thereof of the SMA 50 (see parameter &#x60;simpleMovingAverage.days50&#x60;) and the SMA 200 (see parameter &#x60;simpleMovingAverage.days200&#x60;). Only crossovers which occurred in the most recent 300 trading days are considered, hence the attribute &#x60;sma50vs200.numberDays&#x60; cannot exceed the value 300.
    /// </summary>
    [DataContract(Name = "inline_response_200_4_simpleMovingAverage_tradingDaysSinceCrossover_sma50vs200")]
    public partial class InlineResponse2004SimpleMovingAverageTradingDaysSinceCrossoverSma50vs200 : IEquatable<InlineResponse2004SimpleMovingAverageTradingDaysSinceCrossoverSma50vs200>, IValidatableObject
    {
        /// <summary>
        /// Direction of the crossing.
        /// </summary>
        /// <value>Direction of the crossing.</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum DirectionEnum
        {
            /// <summary>
            /// Enum Up for value: up
            /// </summary>
            [EnumMember(Value = "up")]
            Up = 1,

            /// <summary>
            /// Enum Down for value: down
            /// </summary>
            [EnumMember(Value = "down")]
            Down = 2

        }


        /// <summary>
        /// Direction of the crossing.
        /// </summary>
        /// <value>Direction of the crossing.</value>
        [DataMember(Name = "direction", EmitDefaultValue = false)]
        public DirectionEnum? Direction { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse2004SimpleMovingAverageTradingDaysSinceCrossoverSma50vs200" /> class.
        /// </summary>
        /// <param name="numberDays">Number of trading days..</param>
        /// <param name="direction">Direction of the crossing..</param>
        public InlineResponse2004SimpleMovingAverageTradingDaysSinceCrossoverSma50vs200(decimal numberDays = default(decimal), DirectionEnum? direction = default(DirectionEnum?))
        {
            this.NumberDays = numberDays;
            this.Direction = direction;
        }

        /// <summary>
        /// Number of trading days.
        /// </summary>
        /// <value>Number of trading days.</value>
        [DataMember(Name = "numberDays", EmitDefaultValue = false)]
        public decimal NumberDays { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class InlineResponse2004SimpleMovingAverageTradingDaysSinceCrossoverSma50vs200 {\n");
            sb.Append("  NumberDays: ").Append(NumberDays).Append("\n");
            sb.Append("  Direction: ").Append(Direction).Append("\n");
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
            return this.Equals(input as InlineResponse2004SimpleMovingAverageTradingDaysSinceCrossoverSma50vs200);
        }

        /// <summary>
        /// Returns true if InlineResponse2004SimpleMovingAverageTradingDaysSinceCrossoverSma50vs200 instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse2004SimpleMovingAverageTradingDaysSinceCrossoverSma50vs200 to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse2004SimpleMovingAverageTradingDaysSinceCrossoverSma50vs200 input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.NumberDays == input.NumberDays ||
                    this.NumberDays.Equals(input.NumberDays)
                ) && 
                (
                    this.Direction == input.Direction ||
                    this.Direction.Equals(input.Direction)
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
                hashCode = hashCode * 59 + this.NumberDays.GetHashCode();
                hashCode = hashCode * 59 + this.Direction.GetHashCode();
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
