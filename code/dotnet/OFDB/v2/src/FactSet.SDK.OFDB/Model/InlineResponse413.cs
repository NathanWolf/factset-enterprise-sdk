/*
 * OFDB API
 *
 * OFDB API
 *
 * The version of the OpenAPI document: 2.1.0
 * Contact: api@factset.com
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
using OpenAPIDateConverter = FactSet.SDK.OFDB.Client.OpenAPIDateConverter;

namespace FactSet.SDK.OFDB.Model
{
    /// <summary>
    /// InlineResponse413
    /// </summary>
    [DataContract(Name = "inline_response_413")]
    public partial class InlineResponse413 : IEquatable<InlineResponse413>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse413" /> class.
        /// </summary>
        /// <param name="errors">An array containing errors.</param>
        public InlineResponse413(List<InlineResponse413Errors> errors = default(List<InlineResponse413Errors>))
        {
            this.Errors = errors;
        }

        /// <summary>
        /// An array containing errors
        /// </summary>
        /// <value>An array containing errors</value>
        [DataMember(Name = "errors", EmitDefaultValue = false)]
        public List<InlineResponse413Errors> Errors { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class InlineResponse413 {\n");
            sb.Append("  Errors: ").Append(Errors).Append("\n");
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
            return this.Equals(input as InlineResponse413);
        }

        /// <summary>
        /// Returns true if InlineResponse413 instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse413 to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse413 input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Errors == input.Errors ||
                    this.Errors != null &&
                    input.Errors != null &&
                    this.Errors.SequenceEqual(input.Errors)
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
                if (this.Errors != null)
                {
                    hashCode = (hashCode * 59) + this.Errors.GetHashCode();
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
