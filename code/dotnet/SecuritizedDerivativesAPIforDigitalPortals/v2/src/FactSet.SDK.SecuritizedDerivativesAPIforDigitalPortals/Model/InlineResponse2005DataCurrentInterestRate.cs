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
using OpenAPIDateConverter = FactSet.SDK.SecuritizedDerivativesAPIforDigitalPortals.Client.OpenAPIDateConverter;

namespace FactSet.SDK.SecuritizedDerivativesAPIforDigitalPortals.Model
{
    /// <summary>
    /// Values and value ranges related to the current interest rate.
    /// </summary>
    [DataContract(Name = "inline_response_200_5_data_currentInterestRate")]
    public partial class InlineResponse2005DataCurrentInterestRate : IEquatable<InlineResponse2005DataCurrentInterestRate>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse2005DataCurrentInterestRate" /> class.
        /// </summary>
        /// <param name="types">Values of the type of the interest rate..</param>
        /// <param name="value">value.</param>
        public InlineResponse2005DataCurrentInterestRate(List<InlineResponse2005DataCurrentInterestRateTypes> types = default(List<InlineResponse2005DataCurrentInterestRateTypes>), InlineResponse2005DataCurrentInterestRateValue value = default(InlineResponse2005DataCurrentInterestRateValue))
        {
            this.Types = types;
            this.Value = value;
        }

        /// <summary>
        /// Values of the type of the interest rate.
        /// </summary>
        /// <value>Values of the type of the interest rate.</value>
        [DataMember(Name = "types", EmitDefaultValue = false)]
        public List<InlineResponse2005DataCurrentInterestRateTypes> Types { get; set; }

        /// <summary>
        /// Gets or Sets Value
        /// </summary>
        [DataMember(Name = "value", EmitDefaultValue = false)]
        public InlineResponse2005DataCurrentInterestRateValue Value { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class InlineResponse2005DataCurrentInterestRate {\n");
            sb.Append("  Types: ").Append(Types).Append("\n");
            sb.Append("  Value: ").Append(Value).Append("\n");
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
            return this.Equals(input as InlineResponse2005DataCurrentInterestRate);
        }

        /// <summary>
        /// Returns true if InlineResponse2005DataCurrentInterestRate instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse2005DataCurrentInterestRate to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse2005DataCurrentInterestRate input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Types == input.Types ||
                    this.Types != null &&
                    input.Types != null &&
                    this.Types.SequenceEqual(input.Types)
                ) && 
                (
                    this.Value == input.Value ||
                    (this.Value != null &&
                    this.Value.Equals(input.Value))
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
                if (this.Types != null)
                {
                    hashCode = (hashCode * 59) + this.Types.GetHashCode();
                }
                if (this.Value != null)
                {
                    hashCode = (hashCode * 59) + this.Value.GetHashCode();
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
