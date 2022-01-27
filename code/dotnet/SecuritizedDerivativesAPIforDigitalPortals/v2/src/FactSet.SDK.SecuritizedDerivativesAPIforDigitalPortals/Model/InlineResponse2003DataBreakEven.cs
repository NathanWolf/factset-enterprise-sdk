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
    /// Break even point based on the ask price. It represents the underlying level that has to be reached at maturity, such that no loss or profit occurs for the holder of the securitized derivative. This key figure is not calculated for securitized derivatives with multiple underlyings. For the value unit, see attribute &#x60;underlyings.valueUnit&#x60;.
    /// </summary>
    [DataContract(Name = "inline_response_200_3_data_breakEven")]
    public partial class InlineResponse2003DataBreakEven : IEquatable<InlineResponse2003DataBreakEven>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse2003DataBreakEven" /> class.
        /// </summary>
        /// <param name="breakEvenPoint">Break even point..</param>
        /// <param name="distance">distance.</param>
        public InlineResponse2003DataBreakEven(decimal breakEvenPoint = default(decimal), InlineResponse2003DataBreakEvenDistance distance = default(InlineResponse2003DataBreakEvenDistance))
        {
            this.BreakEvenPoint = breakEvenPoint;
            this.Distance = distance;
        }

        /// <summary>
        /// Break even point.
        /// </summary>
        /// <value>Break even point.</value>
        [DataMember(Name = "breakEvenPoint", EmitDefaultValue = false)]
        public decimal BreakEvenPoint { get; set; }

        /// <summary>
        /// Gets or Sets Distance
        /// </summary>
        [DataMember(Name = "distance", EmitDefaultValue = false)]
        public InlineResponse2003DataBreakEvenDistance Distance { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class InlineResponse2003DataBreakEven {\n");
            sb.Append("  BreakEvenPoint: ").Append(BreakEvenPoint).Append("\n");
            sb.Append("  Distance: ").Append(Distance).Append("\n");
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
            return this.Equals(input as InlineResponse2003DataBreakEven);
        }

        /// <summary>
        /// Returns true if InlineResponse2003DataBreakEven instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse2003DataBreakEven to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse2003DataBreakEven input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.BreakEvenPoint == input.BreakEvenPoint ||
                    this.BreakEvenPoint.Equals(input.BreakEvenPoint)
                ) && 
                (
                    this.Distance == input.Distance ||
                    (this.Distance != null &&
                    this.Distance.Equals(input.Distance))
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
                hashCode = hashCode * 59 + this.BreakEvenPoint.GetHashCode();
                if (this.Distance != null)
                    hashCode = hashCode * 59 + this.Distance.GetHashCode();
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
