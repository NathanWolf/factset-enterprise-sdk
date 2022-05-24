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
    /// Sum of the cash flow for all transactions of a notation over a certain time range. The cash flow of a transaction is its volume multiplied by its trade price. See attribute &#x60;valueUnit&#x60; for its unit.        The result list may contain notations with different value units, making sorting by trading value non-sensical; see parameter &#x60;valueUnit.selection&#x60;.
    /// </summary>
    [DataContract(Name = "inline_response_200_89_tradingValue")]
    public partial class InlineResponse20089TradingValue : IEquatable<InlineResponse20089TradingValue>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse20089TradingValue" /> class.
        /// </summary>
        /// <param name="average">average.</param>
        public InlineResponse20089TradingValue(InlineResponse20089TradingValueAverage average = default(InlineResponse20089TradingValueAverage))
        {
            this.Average = average;
        }

        /// <summary>
        /// Gets or Sets Average
        /// </summary>
        [DataMember(Name = "average", EmitDefaultValue = false)]
        public InlineResponse20089TradingValueAverage Average { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class InlineResponse20089TradingValue {\n");
            sb.Append("  Average: ").Append(Average).Append("\n");
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
            return this.Equals(input as InlineResponse20089TradingValue);
        }

        /// <summary>
        /// Returns true if InlineResponse20089TradingValue instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse20089TradingValue to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse20089TradingValue input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Average == input.Average ||
                    (this.Average != null &&
                    this.Average.Equals(input.Average))
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
                if (this.Average != null)
                {
                    hashCode = (hashCode * 59) + this.Average.GetHashCode();
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
