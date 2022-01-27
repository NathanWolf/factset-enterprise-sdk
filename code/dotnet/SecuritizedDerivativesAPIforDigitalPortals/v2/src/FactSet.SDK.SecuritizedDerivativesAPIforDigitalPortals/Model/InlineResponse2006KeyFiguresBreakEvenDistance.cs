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
    /// Distance from the underlying level to the break even point.
    /// </summary>
    [DataContract(Name = "inline_response_200_6_keyFigures_breakEven_distance")]
    public partial class InlineResponse2006KeyFiguresBreakEvenDistance : IEquatable<InlineResponse2006KeyFiguresBreakEvenDistance>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse2006KeyFiguresBreakEvenDistance" /> class.
        /// </summary>
        /// <param name="absolute">Distance in absolute terms. For the value unit, see attribute &#x60;instrument.underlying.valueUnit&#x60;..</param>
        /// <param name="relative">Distance relative to the underlying level..</param>
        public InlineResponse2006KeyFiguresBreakEvenDistance(decimal absolute = default(decimal), decimal relative = default(decimal))
        {
            this.Absolute = absolute;
            this.Relative = relative;
        }

        /// <summary>
        /// Distance in absolute terms. For the value unit, see attribute &#x60;instrument.underlying.valueUnit&#x60;.
        /// </summary>
        /// <value>Distance in absolute terms. For the value unit, see attribute &#x60;instrument.underlying.valueUnit&#x60;.</value>
        [DataMember(Name = "absolute", EmitDefaultValue = false)]
        public decimal Absolute { get; set; }

        /// <summary>
        /// Distance relative to the underlying level.
        /// </summary>
        /// <value>Distance relative to the underlying level.</value>
        [DataMember(Name = "relative", EmitDefaultValue = false)]
        public decimal Relative { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class InlineResponse2006KeyFiguresBreakEvenDistance {\n");
            sb.Append("  Absolute: ").Append(Absolute).Append("\n");
            sb.Append("  Relative: ").Append(Relative).Append("\n");
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
            return this.Equals(input as InlineResponse2006KeyFiguresBreakEvenDistance);
        }

        /// <summary>
        /// Returns true if InlineResponse2006KeyFiguresBreakEvenDistance instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse2006KeyFiguresBreakEvenDistance to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse2006KeyFiguresBreakEvenDistance input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Absolute == input.Absolute ||
                    this.Absolute.Equals(input.Absolute)
                ) && 
                (
                    this.Relative == input.Relative ||
                    this.Relative.Equals(input.Relative)
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
                hashCode = hashCode * 59 + this.Absolute.GetHashCode();
                hashCode = hashCode * 59 + this.Relative.GetHashCode();
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
