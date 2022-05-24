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
    /// Underlying data, barrier conditions, and related cash flows.
    /// </summary>
    [DataContract(Name = "inline_response_200_7_data")]
    public partial class InlineResponse2007Data : IEquatable<InlineResponse2007Data>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse2007Data" /> class.
        /// </summary>
        /// <param name="underlyings">Information regarding the underlying(s) of the securitized derivative..</param>
        /// <param name="barrierTypeConditions">Set of conditions associated with a particular type of barrier. A condition is defined by the related type and level of the barrier, its observation period, and the resulting cash flow, if any..</param>
        public InlineResponse2007Data(List<InlineResponse2007DataUnderlyings> underlyings = default(List<InlineResponse2007DataUnderlyings>), List<InlineResponse2007DataBarrierTypeConditions> barrierTypeConditions = default(List<InlineResponse2007DataBarrierTypeConditions>))
        {
            this.Underlyings = underlyings;
            this.BarrierTypeConditions = barrierTypeConditions;
        }

        /// <summary>
        /// Information regarding the underlying(s) of the securitized derivative.
        /// </summary>
        /// <value>Information regarding the underlying(s) of the securitized derivative.</value>
        [DataMember(Name = "underlyings", EmitDefaultValue = false)]
        public List<InlineResponse2007DataUnderlyings> Underlyings { get; set; }

        /// <summary>
        /// Set of conditions associated with a particular type of barrier. A condition is defined by the related type and level of the barrier, its observation period, and the resulting cash flow, if any.
        /// </summary>
        /// <value>Set of conditions associated with a particular type of barrier. A condition is defined by the related type and level of the barrier, its observation period, and the resulting cash flow, if any.</value>
        [DataMember(Name = "barrierTypeConditions", EmitDefaultValue = false)]
        public List<InlineResponse2007DataBarrierTypeConditions> BarrierTypeConditions { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class InlineResponse2007Data {\n");
            sb.Append("  Underlyings: ").Append(Underlyings).Append("\n");
            sb.Append("  BarrierTypeConditions: ").Append(BarrierTypeConditions).Append("\n");
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
            return this.Equals(input as InlineResponse2007Data);
        }

        /// <summary>
        /// Returns true if InlineResponse2007Data instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse2007Data to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse2007Data input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Underlyings == input.Underlyings ||
                    this.Underlyings != null &&
                    input.Underlyings != null &&
                    this.Underlyings.SequenceEqual(input.Underlyings)
                ) && 
                (
                    this.BarrierTypeConditions == input.BarrierTypeConditions ||
                    this.BarrierTypeConditions != null &&
                    input.BarrierTypeConditions != null &&
                    this.BarrierTypeConditions.SequenceEqual(input.BarrierTypeConditions)
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
                if (this.Underlyings != null)
                {
                    hashCode = (hashCode * 59) + this.Underlyings.GetHashCode();
                }
                if (this.BarrierTypeConditions != null)
                {
                    hashCode = (hashCode * 59) + this.BarrierTypeConditions.GetHashCode();
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
