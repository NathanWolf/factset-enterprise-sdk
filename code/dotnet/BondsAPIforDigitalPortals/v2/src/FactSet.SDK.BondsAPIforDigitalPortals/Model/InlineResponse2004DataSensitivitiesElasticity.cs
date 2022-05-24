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
    /// Yield elasticity, which is the ratio of the percentage change of the debt instrument&#39;s price for a one percent change (relatively, not nominally) of the prevailing market interest rate.
    /// </summary>
    [DataContract(Name = "inline_response_200_4_data_sensitivities_elasticity")]
    public partial class InlineResponse2004DataSensitivitiesElasticity : IEquatable<InlineResponse2004DataSensitivitiesElasticity>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse2004DataSensitivitiesElasticity" /> class.
        /// </summary>
        /// <param name="minimum">Minimum value..</param>
        /// <param name="maximum">Maximum value..</param>
        public InlineResponse2004DataSensitivitiesElasticity(decimal minimum = default(decimal), decimal maximum = default(decimal))
        {
            this.Minimum = minimum;
            this.Maximum = maximum;
        }

        /// <summary>
        /// Minimum value.
        /// </summary>
        /// <value>Minimum value.</value>
        [DataMember(Name = "minimum", EmitDefaultValue = false)]
        public decimal Minimum { get; set; }

        /// <summary>
        /// Maximum value.
        /// </summary>
        /// <value>Maximum value.</value>
        [DataMember(Name = "maximum", EmitDefaultValue = false)]
        public decimal Maximum { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class InlineResponse2004DataSensitivitiesElasticity {\n");
            sb.Append("  Minimum: ").Append(Minimum).Append("\n");
            sb.Append("  Maximum: ").Append(Maximum).Append("\n");
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
            return this.Equals(input as InlineResponse2004DataSensitivitiesElasticity);
        }

        /// <summary>
        /// Returns true if InlineResponse2004DataSensitivitiesElasticity instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse2004DataSensitivitiesElasticity to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse2004DataSensitivitiesElasticity input)
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
                    this.Maximum == input.Maximum ||
                    this.Maximum.Equals(input.Maximum)
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
                hashCode = (hashCode * 59) + this.Maximum.GetHashCode();
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
