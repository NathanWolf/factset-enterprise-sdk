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
    /// InlineResponse2007DataBarriers
    /// </summary>
    [DataContract(Name = "inline_response_200_7_data_barriers")]
    public partial class InlineResponse2007DataBarriers : IEquatable<InlineResponse2007DataBarriers>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse2007DataBarriers" /> class.
        /// </summary>
        /// <param name="underlyingIndex">Index used to identify the underlying associated with that barrier level, in the array &#x60;underlyings&#x60;, with the first element having index 0..</param>
        /// <param name="single">single.</param>
        /// <param name="range">range.</param>
        public InlineResponse2007DataBarriers(decimal underlyingIndex = default(decimal), InlineResponse2007DataSingle single = default(InlineResponse2007DataSingle), InlineResponse2007DataRange range = default(InlineResponse2007DataRange))
        {
            this.UnderlyingIndex = underlyingIndex;
            this.Single = single;
            this.Range = range;
        }

        /// <summary>
        /// Index used to identify the underlying associated with that barrier level, in the array &#x60;underlyings&#x60;, with the first element having index 0.
        /// </summary>
        /// <value>Index used to identify the underlying associated with that barrier level, in the array &#x60;underlyings&#x60;, with the first element having index 0.</value>
        [DataMember(Name = "underlyingIndex", EmitDefaultValue = false)]
        public decimal UnderlyingIndex { get; set; }

        /// <summary>
        /// Gets or Sets Single
        /// </summary>
        [DataMember(Name = "single", EmitDefaultValue = false)]
        public InlineResponse2007DataSingle Single { get; set; }

        /// <summary>
        /// Gets or Sets Range
        /// </summary>
        [DataMember(Name = "range", EmitDefaultValue = false)]
        public InlineResponse2007DataRange Range { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class InlineResponse2007DataBarriers {\n");
            sb.Append("  UnderlyingIndex: ").Append(UnderlyingIndex).Append("\n");
            sb.Append("  Single: ").Append(Single).Append("\n");
            sb.Append("  Range: ").Append(Range).Append("\n");
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
            return this.Equals(input as InlineResponse2007DataBarriers);
        }

        /// <summary>
        /// Returns true if InlineResponse2007DataBarriers instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse2007DataBarriers to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse2007DataBarriers input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.UnderlyingIndex == input.UnderlyingIndex ||
                    this.UnderlyingIndex.Equals(input.UnderlyingIndex)
                ) && 
                (
                    this.Single == input.Single ||
                    (this.Single != null &&
                    this.Single.Equals(input.Single))
                ) && 
                (
                    this.Range == input.Range ||
                    (this.Range != null &&
                    this.Range.Equals(input.Range))
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
                hashCode = hashCode * 59 + this.UnderlyingIndex.GetHashCode();
                if (this.Single != null)
                    hashCode = hashCode * 59 + this.Single.GetHashCode();
                if (this.Range != null)
                    hashCode = hashCode * 59 + this.Range.GetHashCode();
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
