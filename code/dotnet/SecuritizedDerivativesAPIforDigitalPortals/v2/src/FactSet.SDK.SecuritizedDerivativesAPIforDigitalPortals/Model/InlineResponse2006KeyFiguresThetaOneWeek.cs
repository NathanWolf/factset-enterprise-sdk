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
    /// Weekly theta. It represents the first partial derivative of the function determining the derivative notation&#39;s theoretical price with respect to the residual term, evaluated at the current residual term and multiplied by 7 / 365. Weekly theta indicates the absolute change (decrease) of the price of a derivative for a reduction of the residual term by one week (seven calendar days), thus it represents the price sensitivity of the derivative relative to changes in the residual term. This key figure is calculated for plain vanilla warrants only.
    /// </summary>
    [DataContract(Name = "inline_response_200_6_keyFigures_thetaOneWeek")]
    public partial class InlineResponse2006KeyFiguresThetaOneWeek : IEquatable<InlineResponse2006KeyFiguresThetaOneWeek>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse2006KeyFiguresThetaOneWeek" /> class.
        /// </summary>
        /// <param name="effective">Weekly theta calculated using the actual cover ratio of the securitized derivative..</param>
        /// <param name="unadjusted">Weekly theta calculated using a (hypothetical) cover ratio of 1:1..</param>
        public InlineResponse2006KeyFiguresThetaOneWeek(decimal effective = default(decimal), decimal unadjusted = default(decimal))
        {
            this.Effective = effective;
            this.Unadjusted = unadjusted;
        }

        /// <summary>
        /// Weekly theta calculated using the actual cover ratio of the securitized derivative.
        /// </summary>
        /// <value>Weekly theta calculated using the actual cover ratio of the securitized derivative.</value>
        [DataMember(Name = "effective", EmitDefaultValue = false)]
        public decimal Effective { get; set; }

        /// <summary>
        /// Weekly theta calculated using a (hypothetical) cover ratio of 1:1.
        /// </summary>
        /// <value>Weekly theta calculated using a (hypothetical) cover ratio of 1:1.</value>
        [DataMember(Name = "unadjusted", EmitDefaultValue = false)]
        public decimal Unadjusted { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class InlineResponse2006KeyFiguresThetaOneWeek {\n");
            sb.Append("  Effective: ").Append(Effective).Append("\n");
            sb.Append("  Unadjusted: ").Append(Unadjusted).Append("\n");
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
            return this.Equals(input as InlineResponse2006KeyFiguresThetaOneWeek);
        }

        /// <summary>
        /// Returns true if InlineResponse2006KeyFiguresThetaOneWeek instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse2006KeyFiguresThetaOneWeek to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse2006KeyFiguresThetaOneWeek input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Effective == input.Effective ||
                    this.Effective.Equals(input.Effective)
                ) && 
                (
                    this.Unadjusted == input.Unadjusted ||
                    this.Unadjusted.Equals(input.Unadjusted)
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
                hashCode = (hashCode * 59) + this.Effective.GetHashCode();
                hashCode = (hashCode * 59) + this.Unadjusted.GetHashCode();
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
