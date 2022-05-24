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
using OpenAPIDateConverter = FactSet.SDK.RecommendationListAPIforDigitalPortals.Client.OpenAPIDateConverter;

namespace FactSet.SDK.RecommendationListAPIforDigitalPortals.Model
{
    /// <summary>
    /// Object denoting that the endpoint response is possibly incomplete.
    /// </summary>
    [DataContract(Name = "PartialOutputObject")]
    public partial class PartialOutputObject : IEquatable<PartialOutputObject>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="PartialOutputObject" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected PartialOutputObject() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="PartialOutputObject" /> class.
        /// </summary>
        /// <param name="isPartial">Flag indicating that the response is a possibly incomplete array or an object containing a possibly incomplete array, due to hitting a processing time limit. If &#x60;true&#x60;, some matching results might be missing from the array, or elements for matching results might be incorrectly included (for example, when priority sorting would have removed the element). Depending on the use case, such a response may be unsuitable. (required).</param>
        public PartialOutputObject(bool isPartial = default(bool))
        {
            this.IsPartial = isPartial;
        }

        /// <summary>
        /// Flag indicating that the response is a possibly incomplete array or an object containing a possibly incomplete array, due to hitting a processing time limit. If &#x60;true&#x60;, some matching results might be missing from the array, or elements for matching results might be incorrectly included (for example, when priority sorting would have removed the element). Depending on the use case, such a response may be unsuitable.
        /// </summary>
        /// <value>Flag indicating that the response is a possibly incomplete array or an object containing a possibly incomplete array, due to hitting a processing time limit. If &#x60;true&#x60;, some matching results might be missing from the array, or elements for matching results might be incorrectly included (for example, when priority sorting would have removed the element). Depending on the use case, such a response may be unsuitable.</value>
        [DataMember(Name = "isPartial", IsRequired = true, EmitDefaultValue = true)]
        public bool IsPartial { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class PartialOutputObject {\n");
            sb.Append("  IsPartial: ").Append(IsPartial).Append("\n");
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
            return this.Equals(input as PartialOutputObject);
        }

        /// <summary>
        /// Returns true if PartialOutputObject instances are equal
        /// </summary>
        /// <param name="input">Instance of PartialOutputObject to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PartialOutputObject input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.IsPartial == input.IsPartial ||
                    this.IsPartial.Equals(input.IsPartial)
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
                hashCode = (hashCode * 59) + this.IsPartial.GetHashCode();
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
