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
using OpenAPIDateConverter = FactSet.SDK.CompanyLogoAPIforDigitalPortals.Client.OpenAPIDateConverter;

namespace FactSet.SDK.CompanyLogoAPIforDigitalPortals.Model
{
    /// <summary>
    /// Small logo.
    /// </summary>
    [DataContract(Name = "inline_response_200_data_small")]
    public partial class InlineResponse200DataSmall : IEquatable<InlineResponse200DataSmall>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse200DataSmall" /> class.
        /// </summary>
        /// <param name="url">URL of the logo..</param>
        /// <param name="mimeType">MIME type of the logo..</param>
        public InlineResponse200DataSmall(string url = default(string), string mimeType = default(string))
        {
            this.Url = url;
            this.MimeType = mimeType;
        }

        /// <summary>
        /// URL of the logo.
        /// </summary>
        /// <value>URL of the logo.</value>
        [DataMember(Name = "url", EmitDefaultValue = false)]
        public string Url { get; set; }

        /// <summary>
        /// MIME type of the logo.
        /// </summary>
        /// <value>MIME type of the logo.</value>
        [DataMember(Name = "mimeType", EmitDefaultValue = false)]
        public string MimeType { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class InlineResponse200DataSmall {\n");
            sb.Append("  Url: ").Append(Url).Append("\n");
            sb.Append("  MimeType: ").Append(MimeType).Append("\n");
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
            return this.Equals(input as InlineResponse200DataSmall);
        }

        /// <summary>
        /// Returns true if InlineResponse200DataSmall instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse200DataSmall to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse200DataSmall input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Url == input.Url ||
                    (this.Url != null &&
                    this.Url.Equals(input.Url))
                ) && 
                (
                    this.MimeType == input.MimeType ||
                    (this.MimeType != null &&
                    this.MimeType.Equals(input.MimeType))
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
                if (this.Url != null)
                    hashCode = hashCode * 59 + this.Url.GetHashCode();
                if (this.MimeType != null)
                    hashCode = hashCode * 59 + this.MimeType.GetHashCode();
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
