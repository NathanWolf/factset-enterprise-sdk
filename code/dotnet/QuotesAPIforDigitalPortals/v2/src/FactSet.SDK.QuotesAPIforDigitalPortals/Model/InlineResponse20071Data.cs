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
    /// Instrument data with a list of regional-level data and assigned listing-level data.
    /// </summary>
    [DataContract(Name = "inline_response_200_71_data")]
    public partial class InlineResponse20071Data : IEquatable<InlineResponse20071Data>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse20071Data" /> class.
        /// </summary>
        /// <param name="permanentIdentifier">FactSet Permanent Identifier for an instrument. The format is six alpha numeric characters, excluding vowels, with an S suffix (XXXXXX-S)..</param>
        /// <param name="regional">Regional-level data with assigned listing-level data. If the set of regional identifiers contains an element for which the attribute &#x60;isPrimary &#x3D; true&#x60;, then this element is the first one in the array..</param>
        public InlineResponse20071Data(string permanentIdentifier = default(string), List<InlineResponse20070DataRegional> regional = default(List<InlineResponse20070DataRegional>))
        {
            this.PermanentIdentifier = permanentIdentifier;
            this.Regional = regional;
        }

        /// <summary>
        /// FactSet Permanent Identifier for an instrument. The format is six alpha numeric characters, excluding vowels, with an S suffix (XXXXXX-S).
        /// </summary>
        /// <value>FactSet Permanent Identifier for an instrument. The format is six alpha numeric characters, excluding vowels, with an S suffix (XXXXXX-S).</value>
        [DataMember(Name = "permanentIdentifier", EmitDefaultValue = false)]
        public string PermanentIdentifier { get; set; }

        /// <summary>
        /// Regional-level data with assigned listing-level data. If the set of regional identifiers contains an element for which the attribute &#x60;isPrimary &#x3D; true&#x60;, then this element is the first one in the array.
        /// </summary>
        /// <value>Regional-level data with assigned listing-level data. If the set of regional identifiers contains an element for which the attribute &#x60;isPrimary &#x3D; true&#x60;, then this element is the first one in the array.</value>
        [DataMember(Name = "regional", EmitDefaultValue = false)]
        public List<InlineResponse20070DataRegional> Regional { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class InlineResponse20071Data {\n");
            sb.Append("  PermanentIdentifier: ").Append(PermanentIdentifier).Append("\n");
            sb.Append("  Regional: ").Append(Regional).Append("\n");
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
            return this.Equals(input as InlineResponse20071Data);
        }

        /// <summary>
        /// Returns true if InlineResponse20071Data instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse20071Data to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse20071Data input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.PermanentIdentifier == input.PermanentIdentifier ||
                    (this.PermanentIdentifier != null &&
                    this.PermanentIdentifier.Equals(input.PermanentIdentifier))
                ) && 
                (
                    this.Regional == input.Regional ||
                    this.Regional != null &&
                    input.Regional != null &&
                    this.Regional.SequenceEqual(input.Regional)
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
                if (this.PermanentIdentifier != null)
                {
                    hashCode = (hashCode * 59) + this.PermanentIdentifier.GetHashCode();
                }
                if (this.Regional != null)
                {
                    hashCode = (hashCode * 59) + this.Regional.GetHashCode();
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
