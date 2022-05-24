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
    /// Average and total trading volume for the given time range.
    /// </summary>
    [DataContract(Name = "inline_response_200_72_data_tradingVolume")]
    public partial class InlineResponse20072DataTradingVolume : IEquatable<InlineResponse20072DataTradingVolume>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse20072DataTradingVolume" /> class.
        /// </summary>
        /// <param name="average">Arithmetic mean of the daily trading volumes..</param>
        /// <param name="sum">Sum of the daily trading volumes..</param>
        public InlineResponse20072DataTradingVolume(decimal average = default(decimal), decimal sum = default(decimal))
        {
            this.Average = average;
            this.Sum = sum;
        }

        /// <summary>
        /// Arithmetic mean of the daily trading volumes.
        /// </summary>
        /// <value>Arithmetic mean of the daily trading volumes.</value>
        [DataMember(Name = "average", EmitDefaultValue = false)]
        public decimal Average { get; set; }

        /// <summary>
        /// Sum of the daily trading volumes.
        /// </summary>
        /// <value>Sum of the daily trading volumes.</value>
        [DataMember(Name = "sum", EmitDefaultValue = false)]
        public decimal Sum { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class InlineResponse20072DataTradingVolume {\n");
            sb.Append("  Average: ").Append(Average).Append("\n");
            sb.Append("  Sum: ").Append(Sum).Append("\n");
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
            return this.Equals(input as InlineResponse20072DataTradingVolume);
        }

        /// <summary>
        /// Returns true if InlineResponse20072DataTradingVolume instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse20072DataTradingVolume to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse20072DataTradingVolume input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Average == input.Average ||
                    this.Average.Equals(input.Average)
                ) && 
                (
                    this.Sum == input.Sum ||
                    this.Sum.Equals(input.Sum)
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
                hashCode = (hashCode * 59) + this.Average.GetHashCode();
                hashCode = (hashCode * 59) + this.Sum.GetHashCode();
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
