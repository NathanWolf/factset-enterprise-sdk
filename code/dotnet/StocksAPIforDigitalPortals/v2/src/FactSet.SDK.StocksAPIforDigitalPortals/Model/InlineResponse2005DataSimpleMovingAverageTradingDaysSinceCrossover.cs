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
    /// Value ranges of the number of trading days since a simple moving average crossed another one. All SMAs are calculated with EOD prices, thus the value 0 for the number of days means the crossover occurred on the most recent trading day for which such prices are available.
    /// </summary>
    [DataContract(Name = "inline_response_200_5_data_simpleMovingAverage_tradingDaysSinceCrossover")]
    public partial class InlineResponse2005DataSimpleMovingAverageTradingDaysSinceCrossover : IEquatable<InlineResponse2005DataSimpleMovingAverageTradingDaysSinceCrossover>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse2005DataSimpleMovingAverageTradingDaysSinceCrossover" /> class.
        /// </summary>
        /// <param name="sma20vs50">sma20vs50.</param>
        /// <param name="sma50vs200">sma50vs200.</param>
        public InlineResponse2005DataSimpleMovingAverageTradingDaysSinceCrossover(InlineResponse2005DataSimpleMovingAverageTradingDaysSinceCrossoverSma20vs50 sma20vs50 = default(InlineResponse2005DataSimpleMovingAverageTradingDaysSinceCrossoverSma20vs50), InlineResponse2005DataSimpleMovingAverageTradingDaysSinceCrossoverSma50vs200 sma50vs200 = default(InlineResponse2005DataSimpleMovingAverageTradingDaysSinceCrossoverSma50vs200))
        {
            this.Sma20vs50 = sma20vs50;
            this.Sma50vs200 = sma50vs200;
        }

        /// <summary>
        /// Gets or Sets Sma20vs50
        /// </summary>
        [DataMember(Name = "sma20vs50", EmitDefaultValue = false)]
        public InlineResponse2005DataSimpleMovingAverageTradingDaysSinceCrossoverSma20vs50 Sma20vs50 { get; set; }

        /// <summary>
        /// Gets or Sets Sma50vs200
        /// </summary>
        [DataMember(Name = "sma50vs200", EmitDefaultValue = false)]
        public InlineResponse2005DataSimpleMovingAverageTradingDaysSinceCrossoverSma50vs200 Sma50vs200 { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class InlineResponse2005DataSimpleMovingAverageTradingDaysSinceCrossover {\n");
            sb.Append("  Sma20vs50: ").Append(Sma20vs50).Append("\n");
            sb.Append("  Sma50vs200: ").Append(Sma50vs200).Append("\n");
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
            return this.Equals(input as InlineResponse2005DataSimpleMovingAverageTradingDaysSinceCrossover);
        }

        /// <summary>
        /// Returns true if InlineResponse2005DataSimpleMovingAverageTradingDaysSinceCrossover instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse2005DataSimpleMovingAverageTradingDaysSinceCrossover to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse2005DataSimpleMovingAverageTradingDaysSinceCrossover input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Sma20vs50 == input.Sma20vs50 ||
                    (this.Sma20vs50 != null &&
                    this.Sma20vs50.Equals(input.Sma20vs50))
                ) && 
                (
                    this.Sma50vs200 == input.Sma50vs200 ||
                    (this.Sma50vs200 != null &&
                    this.Sma50vs200.Equals(input.Sma50vs200))
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
                if (this.Sma20vs50 != null)
                {
                    hashCode = (hashCode * 59) + this.Sma20vs50.GetHashCode();
                }
                if (this.Sma50vs200 != null)
                {
                    hashCode = (hashCode * 59) + this.Sma50vs200.GetHashCode();
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
