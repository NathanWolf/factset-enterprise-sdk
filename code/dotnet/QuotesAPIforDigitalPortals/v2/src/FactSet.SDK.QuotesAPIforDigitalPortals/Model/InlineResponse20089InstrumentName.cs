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
using OpenAPIDateConverter = FactSet.SDK.QuotesAPIforDigitalPortals.Client.OpenAPIDateConverter;

namespace FactSet.SDK.QuotesAPIforDigitalPortals.Model
{
    /// <summary>
    /// Instrument names.
    /// </summary>
    [DataContract(Name = "inline_response_200_89_instrument_name")]
    public partial class InlineResponse20089InstrumentName : IEquatable<InlineResponse20089InstrumentName>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse20089InstrumentName" /> class.
        /// </summary>
        /// <param name="_default">_default.</param>
        public InlineResponse20089InstrumentName(InlineResponse20089InstrumentNameDefault _default = default(InlineResponse20089InstrumentNameDefault))
        {
            this.Default = _default;
        }

        /// <summary>
        /// Gets or Sets Default
        /// </summary>
        [DataMember(Name = "default", EmitDefaultValue = false)]
        public InlineResponse20089InstrumentNameDefault Default { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class InlineResponse20089InstrumentName {\n");
            sb.Append("  Default: ").Append(Default).Append("\n");
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
            return this.Equals(input as InlineResponse20089InstrumentName);
        }

        /// <summary>
        /// Returns true if InlineResponse20089InstrumentName instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse20089InstrumentName to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse20089InstrumentName input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Default == input.Default ||
                    (this.Default != null &&
                    this.Default.Equals(input.Default))
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
                if (this.Default != null)
                {
                    hashCode = (hashCode * 59) + this.Default.GetHashCode();
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
