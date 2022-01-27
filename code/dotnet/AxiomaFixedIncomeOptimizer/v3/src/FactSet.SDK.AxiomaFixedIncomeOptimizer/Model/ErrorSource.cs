/*
 * AFI Optimizer API
 *
 * Allow clients to fetch Analytics through APIs.
 *
 * The version of the OpenAPI document: v3
 * Contact: analytics.api.support@factset.com
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
using OpenAPIDateConverter = FactSet.SDK.AxiomaFixedIncomeOptimizer.Client.OpenAPIDateConverter;

namespace FactSet.SDK.AxiomaFixedIncomeOptimizer.Model
{
    /// <summary>
    /// ErrorSource
    /// </summary>
    [DataContract(Name = "ErrorSource")]
    public partial class ErrorSource : IEquatable<ErrorSource>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ErrorSource" /> class.
        /// </summary>
        /// <param name="pointer">pointer.</param>
        /// <param name="_parameter">_parameter.</param>
        public ErrorSource(string pointer = default(string), string _parameter = default(string))
        {
            this.Pointer = pointer;
            this.Parameter = _parameter;
        }

        /// <summary>
        /// Gets or Sets Pointer
        /// </summary>
        [DataMember(Name = "pointer", EmitDefaultValue = false)]
        public string Pointer { get; set; }

        /// <summary>
        /// Gets or Sets Parameter
        /// </summary>
        [DataMember(Name = "parameter", EmitDefaultValue = false)]
        public string Parameter { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ErrorSource {\n");
            sb.Append("  Pointer: ").Append(Pointer).Append("\n");
            sb.Append("  Parameter: ").Append(Parameter).Append("\n");
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
            return this.Equals(input as ErrorSource);
        }

        /// <summary>
        /// Returns true if ErrorSource instances are equal
        /// </summary>
        /// <param name="input">Instance of ErrorSource to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ErrorSource input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Pointer == input.Pointer ||
                    (this.Pointer != null &&
                    this.Pointer.Equals(input.Pointer))
                ) && 
                (
                    this.Parameter == input.Parameter ||
                    (this.Parameter != null &&
                    this.Parameter.Equals(input.Parameter))
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
                if (this.Pointer != null)
                    hashCode = hashCode * 59 + this.Pointer.GetHashCode();
                if (this.Parameter != null)
                    hashCode = hashCode * 59 + this.Parameter.GetHashCode();
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
