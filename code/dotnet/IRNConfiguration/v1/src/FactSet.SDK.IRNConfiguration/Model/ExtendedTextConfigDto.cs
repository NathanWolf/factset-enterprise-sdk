/*
 * IRN API v1
 *
 * Allows users to create, update and configure IRN data.
 *
 * The version of the OpenAPI document: 1
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
using OpenAPIDateConverter = FactSet.SDK.IRNConfiguration.Client.OpenAPIDateConverter;

namespace FactSet.SDK.IRNConfiguration.Model
{
    /// <summary>
    /// ExtendedTextConfigDto
    /// </summary>
    [DataContract(Name = "ExtendedTextConfigDto")]
    public partial class ExtendedTextConfigDto : IEquatable<ExtendedTextConfigDto>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ExtendedTextConfigDto" /> class.
        /// </summary>
        /// <param name="maxChars">maxChars.</param>
        public ExtendedTextConfigDto(int maxChars = default(int))
        {
            this.MaxChars = maxChars;
        }

        /// <summary>
        /// Gets or Sets MaxChars
        /// </summary>
        [DataMember(Name = "maxChars", EmitDefaultValue = false)]
        public int MaxChars { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ExtendedTextConfigDto {\n");
            sb.Append("  MaxChars: ").Append(MaxChars).Append("\n");
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
            return this.Equals(input as ExtendedTextConfigDto);
        }

        /// <summary>
        /// Returns true if ExtendedTextConfigDto instances are equal
        /// </summary>
        /// <param name="input">Instance of ExtendedTextConfigDto to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ExtendedTextConfigDto input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.MaxChars == input.MaxChars ||
                    this.MaxChars.Equals(input.MaxChars)
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
                hashCode = hashCode * 59 + this.MaxChars.GetHashCode();
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
