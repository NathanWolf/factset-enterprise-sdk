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
using OpenAPIDateConverter = FactSet.SDK.StocksAPIforDigitalPortals.Client.OpenAPIDateConverter;

namespace FactSet.SDK.StocksAPIforDigitalPortals.Model
{
    /// <summary>
    /// Gross value.
    /// </summary>
    [DataContract(Name = "inline_response_200_gross")]
    public partial class InlineResponse200Gross : IEquatable<InlineResponse200Gross>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse200Gross" /> class.
        /// </summary>
        /// <param name="unadjustedValue">Value of the unadjusted dividend..</param>
        public InlineResponse200Gross(decimal unadjustedValue = default(decimal))
        {
            this.UnadjustedValue = unadjustedValue;
        }

        /// <summary>
        /// Value of the unadjusted dividend.
        /// </summary>
        /// <value>Value of the unadjusted dividend.</value>
        [DataMember(Name = "unadjustedValue", EmitDefaultValue = false)]
        public decimal UnadjustedValue { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class InlineResponse200Gross {\n");
            sb.Append("  UnadjustedValue: ").Append(UnadjustedValue).Append("\n");
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
            return this.Equals(input as InlineResponse200Gross);
        }

        /// <summary>
        /// Returns true if InlineResponse200Gross instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse200Gross to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse200Gross input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.UnadjustedValue == input.UnadjustedValue ||
                    this.UnadjustedValue.Equals(input.UnadjustedValue)
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
                hashCode = hashCode * 59 + this.UnadjustedValue.GetHashCode();
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
