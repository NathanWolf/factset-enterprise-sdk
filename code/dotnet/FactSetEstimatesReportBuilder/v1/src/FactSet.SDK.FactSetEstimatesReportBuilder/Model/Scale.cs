/*
 * FactSet Estimates Report Builder
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
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
using OpenAPIDateConverter = FactSet.SDK.FactSetEstimatesReportBuilder.Client.OpenAPIDateConverter;

namespace FactSet.SDK.FactSetEstimatesReportBuilder.Model
{
    /// <summary>
    /// Scale
    /// </summary>
    [DataContract(Name = "scale")]
    public partial class Scale : IEquatable<Scale>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="Scale" /> class.
        /// </summary>
        /// <param name="scale">scale.</param>
        public Scale(ScaleScale scale = default(ScaleScale))
        {
            this._Scale = scale;
        }

        /// <summary>
        /// Gets or Sets _Scale
        /// </summary>
        [DataMember(Name = "scale", EmitDefaultValue = false)]
        public ScaleScale _Scale { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class Scale {\n");
            sb.Append("  _Scale: ").Append(_Scale).Append("\n");
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
            return this.Equals(input as Scale);
        }

        /// <summary>
        /// Returns true if Scale instances are equal
        /// </summary>
        /// <param name="input">Instance of Scale to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Scale input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this._Scale == input._Scale ||
                    (this._Scale != null &&
                    this._Scale.Equals(input._Scale))
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
                if (this._Scale != null)
                {
                    hashCode = (hashCode * 59) + this._Scale.GetHashCode();
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
