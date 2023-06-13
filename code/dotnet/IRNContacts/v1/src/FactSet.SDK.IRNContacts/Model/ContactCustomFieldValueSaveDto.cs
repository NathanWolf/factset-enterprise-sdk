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
using OpenAPIDateConverter = FactSet.SDK.IRNContacts.Client.OpenAPIDateConverter;

namespace FactSet.SDK.IRNContacts.Model
{
    /// <summary>
    /// ContactCustomFieldValueSaveDto
    /// </summary>
    [DataContract(Name = "ContactCustomFieldValueSaveDto")]
    public partial class ContactCustomFieldValueSaveDto : IEquatable<ContactCustomFieldValueSaveDto>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ContactCustomFieldValueSaveDto" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ContactCustomFieldValueSaveDto() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ContactCustomFieldValueSaveDto" /> class.
        /// </summary>
        /// <param name="code">code (required).</param>
        /// <param name="value">value.</param>
        /// <param name="optionValues">optionValues.</param>
        /// <param name="evaluateFormula">evaluateFormula (default to false).</param>
        public ContactCustomFieldValueSaveDto(string code,string value = default(string), List<Guid> optionValues = default(List<Guid>), bool evaluateFormula = false)
        {
            // to ensure "code" is required (not null)
            if (code == null) {
                throw new ArgumentNullException("code is a required property for ContactCustomFieldValueSaveDto and cannot be null");
            }
            this.Code = code;
            this.Value = value;
            this.OptionValues = optionValues;
            this.EvaluateFormula = evaluateFormula;
        }

        /// <summary>
        /// Gets or Sets Code
        /// </summary>
        [DataMember(Name = "code", IsRequired = true, EmitDefaultValue = false)]
        public string Code { get; set; }

        /// <summary>
        /// Gets or Sets Value
        /// </summary>
        [DataMember(Name = "value", EmitDefaultValue = true)]
        public string Value { get; set; }

        /// <summary>
        /// Gets or Sets OptionValues
        /// </summary>
        [DataMember(Name = "optionValues", EmitDefaultValue = true)]
        public List<Guid> OptionValues { get; set; }

        /// <summary>
        /// Gets or Sets EvaluateFormula
        /// </summary>
        [DataMember(Name = "evaluateFormula", EmitDefaultValue = true)]
        public bool EvaluateFormula { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ContactCustomFieldValueSaveDto {\n");
            sb.Append("  Code: ").Append(Code).Append("\n");
            sb.Append("  Value: ").Append(Value).Append("\n");
            sb.Append("  OptionValues: ").Append(OptionValues).Append("\n");
            sb.Append("  EvaluateFormula: ").Append(EvaluateFormula).Append("\n");
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
            return this.Equals(input as ContactCustomFieldValueSaveDto);
        }

        /// <summary>
        /// Returns true if ContactCustomFieldValueSaveDto instances are equal
        /// </summary>
        /// <param name="input">Instance of ContactCustomFieldValueSaveDto to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ContactCustomFieldValueSaveDto input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Code == input.Code ||
                    (this.Code != null &&
                    this.Code.Equals(input.Code))
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
                ) && 
                (
                    this.EvaluateFormula == input.EvaluateFormula ||
                    this.EvaluateFormula.Equals(input.EvaluateFormula)
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
                if (this.Code != null)
                {
                    hashCode = (hashCode * 59) + this.Code.GetHashCode();
                }
                if (this.Value != null)
                {
                    hashCode = (hashCode * 59) + this.Value.GetHashCode();
                }
                if (this.OptionValues != null)
                {
                    hashCode = (hashCode * 59) + this.OptionValues.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.EvaluateFormula.GetHashCode();
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
