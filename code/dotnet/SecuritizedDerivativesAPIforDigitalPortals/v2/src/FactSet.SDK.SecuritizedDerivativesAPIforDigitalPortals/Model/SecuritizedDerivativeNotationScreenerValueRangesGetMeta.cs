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
    /// The meta member contains the meta information of the request.
    /// </summary>
    [DataContract(Name = "_securitizedDerivative_notation_screener_valueRanges_get_meta")]
    public partial class SecuritizedDerivativeNotationScreenerValueRangesGetMeta : IEquatable<SecuritizedDerivativeNotationScreenerValueRangesGetMeta>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="SecuritizedDerivativeNotationScreenerValueRangesGetMeta" /> class.
        /// </summary>
        /// <param name="attributes">Limit the attributes returned in the response to the specified set..</param>
        /// <param name="language">ISO 639-1 code of the language..</param>
        public SecuritizedDerivativeNotationScreenerValueRangesGetMeta(List<string> attributes = default(List<string>), string language = default(string))
        {
            this.Attributes = attributes;
            this.Language = language;
        }

        /// <summary>
        /// Limit the attributes returned in the response to the specified set.
        /// </summary>
        /// <value>Limit the attributes returned in the response to the specified set.</value>
        [DataMember(Name = "attributes", EmitDefaultValue = false)]
        public List<string> Attributes { get; set; }

        /// <summary>
        /// ISO 639-1 code of the language.
        /// </summary>
        /// <value>ISO 639-1 code of the language.</value>
        [DataMember(Name = "language", EmitDefaultValue = false)]
        public string Language { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class SecuritizedDerivativeNotationScreenerValueRangesGetMeta {\n");
            sb.Append("  Attributes: ").Append(Attributes).Append("\n");
            sb.Append("  Language: ").Append(Language).Append("\n");
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
            return this.Equals(input as SecuritizedDerivativeNotationScreenerValueRangesGetMeta);
        }

        /// <summary>
        /// Returns true if SecuritizedDerivativeNotationScreenerValueRangesGetMeta instances are equal
        /// </summary>
        /// <param name="input">Instance of SecuritizedDerivativeNotationScreenerValueRangesGetMeta to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(SecuritizedDerivativeNotationScreenerValueRangesGetMeta input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Attributes == input.Attributes ||
                    this.Attributes != null &&
                    input.Attributes != null &&
                    this.Attributes.SequenceEqual(input.Attributes)
                ) && 
                (
                    this.Language == input.Language ||
                    (this.Language != null &&
                    this.Language.Equals(input.Language))
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
                if (this.Attributes != null)
                {
                    hashCode = (hashCode * 59) + this.Attributes.GetHashCode();
                }
                if (this.Language != null)
                {
                    hashCode = (hashCode * 59) + this.Language.GetHashCode();
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
            // Language (string) maxLength
            if (this.Language != null && this.Language.Length > 2)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for Language, length must be less than 2.", new [] { "Language" });
            }

            // Language (string) minLength
            if (this.Language != null && this.Language.Length < 2)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for Language, length must be greater than 2.", new [] { "Language" });
            }

            yield break;
        }
    }

}
