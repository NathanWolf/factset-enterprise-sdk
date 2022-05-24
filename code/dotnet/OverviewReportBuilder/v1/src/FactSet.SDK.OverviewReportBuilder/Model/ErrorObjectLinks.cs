/*
 * FactSet Overview Report Builder API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
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
using OpenAPIDateConverter = FactSet.SDK.OverviewReportBuilder.Client.OpenAPIDateConverter;

namespace FactSet.SDK.OverviewReportBuilder.Model
{
    /// <summary>
    /// ErrorObjectLinks
    /// </summary>
    [DataContract(Name = "ErrorObject_links")]
    public partial class ErrorObjectLinks : IEquatable<ErrorObjectLinks>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ErrorObjectLinks" /> class.
        /// </summary>
        /// <param name="about">about.</param>
        public ErrorObjectLinks(string about = default(string))
        {
            this.About = about;
        }

        /// <summary>
        /// Gets or Sets About
        /// </summary>
        [DataMember(Name = "about", EmitDefaultValue = false)]
        public string About { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ErrorObjectLinks {\n");
            sb.Append("  About: ").Append(About).Append("\n");
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
            return this.Equals(input as ErrorObjectLinks);
        }

        /// <summary>
        /// Returns true if ErrorObjectLinks instances are equal
        /// </summary>
        /// <param name="input">Instance of ErrorObjectLinks to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ErrorObjectLinks input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.About == input.About ||
                    (this.About != null &&
                    this.About.Equals(input.About))
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
                if (this.About != null)
                {
                    hashCode = (hashCode * 59) + this.About.GetHashCode();
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
