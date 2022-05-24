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
    /// Value ranges related to the break-even point.
    /// </summary>
    [DataContract(Name = "inline_response_200_5_data_keyFigures_breakEven")]
    public partial class InlineResponse2005DataKeyFiguresBreakEven : IEquatable<InlineResponse2005DataKeyFiguresBreakEven>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse2005DataKeyFiguresBreakEven" /> class.
        /// </summary>
        /// <param name="breakEvenPoint">breakEvenPoint.</param>
        /// <param name="distance">distance.</param>
        public InlineResponse2005DataKeyFiguresBreakEven(InlineResponse2005DataKeyFiguresBreakEvenBreakEvenPoint breakEvenPoint = default(InlineResponse2005DataKeyFiguresBreakEvenBreakEvenPoint), InlineResponse2005DataKeyFiguresBreakEvenDistance distance = default(InlineResponse2005DataKeyFiguresBreakEvenDistance))
        {
            this.BreakEvenPoint = breakEvenPoint;
            this.Distance = distance;
        }

        /// <summary>
        /// Gets or Sets BreakEvenPoint
        /// </summary>
        [DataMember(Name = "breakEvenPoint", EmitDefaultValue = false)]
        public InlineResponse2005DataKeyFiguresBreakEvenBreakEvenPoint BreakEvenPoint { get; set; }

        /// <summary>
        /// Gets or Sets Distance
        /// </summary>
        [DataMember(Name = "distance", EmitDefaultValue = false)]
        public InlineResponse2005DataKeyFiguresBreakEvenDistance Distance { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class InlineResponse2005DataKeyFiguresBreakEven {\n");
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
            return this.Equals(input as InlineResponse2005DataKeyFiguresBreakEven);
        }

        /// <summary>
        /// Returns true if InlineResponse2005DataKeyFiguresBreakEven instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse2005DataKeyFiguresBreakEven to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse2005DataKeyFiguresBreakEven input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.BreakEvenPoint == input.BreakEvenPoint ||
                    (this.BreakEvenPoint != null &&
                    this.BreakEvenPoint.Equals(input.BreakEvenPoint))
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
                if (this.BreakEvenPoint != null)
                {
                    hashCode = (hashCode * 59) + this.BreakEvenPoint.GetHashCode();
                }
                if (this.Distance != null)
                {
                    hashCode = (hashCode * 59) + this.Distance.GetHashCode();
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
