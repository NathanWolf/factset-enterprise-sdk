/*
 * IRN API v1
 *
 * Allows users to extract, create, update and configure IRN data.
 *
 * The version of the OpenAPI document: 1
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
using OpenAPIDateConverter = FactSet.SDK.IRNConfiguration.Client.OpenAPIDateConverter;

namespace FactSet.SDK.IRNConfiguration.Model
{
    /// <summary>
    /// IdentifierSettingsDto
    /// </summary>
    [DataContract(Name = "IdentifierSettingsDto")]
    public partial class IdentifierSettingsDto : IEquatable<IdentifierSettingsDto>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="IdentifierSettingsDto" /> class.
        /// </summary>
        /// <param name="allowEdit">allowEdit.</param>
        public IdentifierSettingsDto(bool allowEdit = default(bool))
        {
            this.AllowEdit = allowEdit;
        }

        /// <summary>
        /// Gets or Sets AllowEdit
        /// </summary>
        [DataMember(Name = "allowEdit", EmitDefaultValue = true)]
        public bool AllowEdit { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class IdentifierSettingsDto {\n");
            sb.Append("  AllowEdit: ").Append(AllowEdit).Append("\n");
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
            return this.Equals(input as IdentifierSettingsDto);
        }

        /// <summary>
        /// Returns true if IdentifierSettingsDto instances are equal
        /// </summary>
        /// <param name="input">Instance of IdentifierSettingsDto to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(IdentifierSettingsDto input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.AllowEdit == input.AllowEdit ||
                    this.AllowEdit.Equals(input.AllowEdit)
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
                hashCode = (hashCode * 59) + this.AllowEdit.GetHashCode();
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
