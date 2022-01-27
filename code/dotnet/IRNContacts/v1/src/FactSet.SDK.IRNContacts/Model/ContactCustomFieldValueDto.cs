/*
 * IRN API v1
 *
 * Allows users to create, update and configure IRN data.
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
using OpenAPIDateConverter = FactSet.SDK.IRNContacts.Client.OpenAPIDateConverter;

namespace FactSet.SDK.IRNContacts.Model
{
    /// <summary>
    /// ContactCustomFieldValueDto
    /// </summary>
    [DataContract(Name = "ContactCustomFieldValueDto")]
    public partial class ContactCustomFieldValueDto : IEquatable<ContactCustomFieldValueDto>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ContactCustomFieldValueDto" /> class.
        /// </summary>
        /// <param name="fieldCode">fieldCode.</param>
        /// <param name="value">value.</param>
        /// <param name="optionValues">optionValues.</param>
        public ContactCustomFieldValueDto(string fieldCode = default(string), string value = default(string), List<ContactCustomFieldOptionValueDto> optionValues = default(List<ContactCustomFieldOptionValueDto>))
        {
            this.FieldCode = fieldCode;
            this.Value = value;
            this.OptionValues = optionValues;
        }

        /// <summary>
        /// Gets or Sets FieldCode
        /// </summary>
        [DataMember(Name = "fieldCode", EmitDefaultValue = true)]
        public string FieldCode { get; set; }

        /// <summary>
        /// Gets or Sets Value
        /// </summary>
        [DataMember(Name = "value", EmitDefaultValue = true)]
        public string Value { get; set; }

        /// <summary>
        /// Gets or Sets OptionValues
        /// </summary>
        [DataMember(Name = "optionValues", EmitDefaultValue = true)]
        public List<ContactCustomFieldOptionValueDto> OptionValues { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ContactCustomFieldValueDto {\n");
            sb.Append("  FieldCode: ").Append(FieldCode).Append("\n");
            sb.Append("  Value: ").Append(Value).Append("\n");
            sb.Append("  OptionValues: ").Append(OptionValues).Append("\n");
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
            return this.Equals(input as ContactCustomFieldValueDto);
        }

        /// <summary>
        /// Returns true if ContactCustomFieldValueDto instances are equal
        /// </summary>
        /// <param name="input">Instance of ContactCustomFieldValueDto to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ContactCustomFieldValueDto input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.FieldCode == input.FieldCode ||
                    (this.FieldCode != null &&
                    this.FieldCode.Equals(input.FieldCode))
                ) && 
                (
                    this.Value == input.Value ||
                    (this.Value != null &&
                    this.Value.Equals(input.Value))
                ) && 
                (
                    this.OptionValues == input.OptionValues ||
                    this.OptionValues != null &&
                    input.OptionValues != null &&
                    this.OptionValues.SequenceEqual(input.OptionValues)
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
                if (this.FieldCode != null)
                    hashCode = hashCode * 59 + this.FieldCode.GetHashCode();
                if (this.Value != null)
                    hashCode = hashCode * 59 + this.Value.GetHashCode();
                if (this.OptionValues != null)
                    hashCode = hashCode * 59 + this.OptionValues.GetHashCode();
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
