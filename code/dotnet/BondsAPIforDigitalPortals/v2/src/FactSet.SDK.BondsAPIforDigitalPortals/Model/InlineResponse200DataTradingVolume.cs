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
    /// Requirements regarding the trading volume in the over-the-counter (non-exchange-based) trading. For the currency of the trading volume, see attribute &#x60;issue.volume.currency&#x60;.
    /// </summary>
    [DataContract(Name = "inline_response_200_data_tradingVolume")]
    public partial class InlineResponse200DataTradingVolume : IEquatable<InlineResponse200DataTradingVolume>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse200DataTradingVolume" /> class.
        /// </summary>
        /// <param name="minimum">Minimum trading volume..</param>
        /// <param name="increment">Incremental trading volume over the minimum. The trading volume over the minimum must be an integral multiple of the increment..</param>
        public InlineResponse200DataTradingVolume(decimal minimum = default(decimal), decimal increment = default(decimal))
        {
            this.Minimum = minimum;
            this.Increment = increment;
        }

        /// <summary>
        /// Minimum trading volume.
        /// </summary>
        /// <value>Minimum trading volume.</value>
        [DataMember(Name = "minimum", EmitDefaultValue = false)]
        public decimal Minimum { get; set; }

        /// <summary>
        /// Incremental trading volume over the minimum. The trading volume over the minimum must be an integral multiple of the increment.
        /// </summary>
        /// <value>Incremental trading volume over the minimum. The trading volume over the minimum must be an integral multiple of the increment.</value>
        [DataMember(Name = "increment", EmitDefaultValue = false)]
        public decimal Increment { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class InlineResponse200DataTradingVolume {\n");
            sb.Append("  Minimum: ").Append(Minimum).Append("\n");
            sb.Append("  Increment: ").Append(Increment).Append("\n");
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
            return this.Equals(input as InlineResponse200DataTradingVolume);
        }

        /// <summary>
        /// Returns true if InlineResponse200DataTradingVolume instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse200DataTradingVolume to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse200DataTradingVolume input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Minimum == input.Minimum ||
                    this.Minimum.Equals(input.Minimum)
                ) && 
                (
                    this.Increment == input.Increment ||
                    this.Increment.Equals(input.Increment)
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
                hashCode = (hashCode * 59) + this.Minimum.GetHashCode();
                hashCode = (hashCode * 59) + this.Increment.GetHashCode();
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
