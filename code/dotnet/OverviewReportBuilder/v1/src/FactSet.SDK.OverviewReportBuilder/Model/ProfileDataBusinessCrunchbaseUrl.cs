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
    /// ProfileDataBusinessCrunchbaseUrl
    /// </summary>
    [DataContract(Name = "ProfileData_business_crunchbaseUrl")]
    public partial class ProfileDataBusinessCrunchbaseUrl : IEquatable<ProfileDataBusinessCrunchbaseUrl>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ProfileDataBusinessCrunchbaseUrl" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ProfileDataBusinessCrunchbaseUrl() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ProfileDataBusinessCrunchbaseUrl" /> class.
        /// </summary>
        /// <param name="value">value (required).</param>
        /// <param name="note">note (required).</param>
        public ProfileDataBusinessCrunchbaseUrl(string value = default(string), string note = default(string))
        {
            // to ensure "value" is required (not null)
            if (value == null) {
                throw new ArgumentNullException("value is a required property for ProfileDataBusinessCrunchbaseUrl and cannot be null");
            }
            this.Value = value;
            // to ensure "note" is required (not null)
            if (note == null) {
                throw new ArgumentNullException("note is a required property for ProfileDataBusinessCrunchbaseUrl and cannot be null");
            }
            this.Note = note;
        }

        /// <summary>
        /// Gets or Sets Value
        /// </summary>
        [DataMember(Name = "value", IsRequired = true, EmitDefaultValue = false)]
        public string Value { get; set; }

        /// <summary>
        /// Gets or Sets Note
        /// </summary>
        [DataMember(Name = "note", IsRequired = true, EmitDefaultValue = false)]
        public string Note { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ProfileDataBusinessCrunchbaseUrl {\n");
            sb.Append("  Value: ").Append(Value).Append("\n");
            sb.Append("  Note: ").Append(Note).Append("\n");
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
            return this.Equals(input as ProfileDataBusinessCrunchbaseUrl);
        }

        /// <summary>
        /// Returns true if ProfileDataBusinessCrunchbaseUrl instances are equal
        /// </summary>
        /// <param name="input">Instance of ProfileDataBusinessCrunchbaseUrl to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ProfileDataBusinessCrunchbaseUrl input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Value == input.Value ||
                    (this.Value != null &&
                    this.Value.Equals(input.Value))
                ) && 
                (
                    this.Note == input.Note ||
                    (this.Note != null &&
                    this.Note.Equals(input.Note))
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
                if (this.Value != null)
                {
                    hashCode = (hashCode * 59) + this.Value.GetHashCode();
                }
                if (this.Note != null)
                {
                    hashCode = (hashCode * 59) + this.Note.GetHashCode();
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
