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
    /// Values related to the exercise.
    /// </summary>
    [DataContract(Name = "inline_response_200_5_data_exercise")]
    public partial class InlineResponse2005DataExercise : IEquatable<InlineResponse2005DataExercise>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse2005DataExercise" /> class.
        /// </summary>
        /// <param name="right">Exercise right..</param>
        /// <param name="style">Exercise style..</param>
        public InlineResponse2005DataExercise(List<InlineResponse2005DataExerciseRight> right = default(List<InlineResponse2005DataExerciseRight>), List<InlineResponse2005DataExerciseStyle> style = default(List<InlineResponse2005DataExerciseStyle>))
        {
            this.Right = right;
            this.Style = style;
        }

        /// <summary>
        /// Exercise right.
        /// </summary>
        /// <value>Exercise right.</value>
        [DataMember(Name = "right", EmitDefaultValue = false)]
        public List<InlineResponse2005DataExerciseRight> Right { get; set; }

        /// <summary>
        /// Exercise style.
        /// </summary>
        /// <value>Exercise style.</value>
        [DataMember(Name = "style", EmitDefaultValue = false)]
        public List<InlineResponse2005DataExerciseStyle> Style { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class InlineResponse2005DataExercise {\n");
            sb.Append("  Right: ").Append(Right).Append("\n");
            sb.Append("  Style: ").Append(Style).Append("\n");
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
            return this.Equals(input as InlineResponse2005DataExercise);
        }

        /// <summary>
        /// Returns true if InlineResponse2005DataExercise instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse2005DataExercise to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse2005DataExercise input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Right == input.Right ||
                    this.Right != null &&
                    input.Right != null &&
                    this.Right.SequenceEqual(input.Right)
                ) && 
                (
                    this.Style == input.Style ||
                    this.Style != null &&
                    input.Style != null &&
                    this.Style.SequenceEqual(input.Style)
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
                if (this.Right != null)
                    hashCode = hashCode * 59 + this.Right.GetHashCode();
                if (this.Style != null)
                    hashCode = hashCode * 59 + this.Style.GetHashCode();
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
