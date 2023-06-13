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
using OpenAPIDateConverter = FactSet.SDK.IRNNotes.Client.OpenAPIDateConverter;

namespace FactSet.SDK.IRNNotes.Model
{
    /// <summary>
    /// Set a value or values for a custom field identified by the field &#39;Code&#39;. Only one of the fields (IntegerValue / TextValue / FilePathValue etc) will be used,  depending on the data type of the custom field corresponding to the &#39;Code&#39; provided
    /// </summary>
    [DataContract(Name = "CreateCustomFieldValueDto")]
    public partial class CreateCustomFieldValueDto : IEquatable<CreateCustomFieldValueDto>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CreateCustomFieldValueDto" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CreateCustomFieldValueDto() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CreateCustomFieldValueDto" /> class.
        /// </summary>
        /// <param name="code">code (required).</param>
        /// <param name="integerValue">integerValue.</param>
        /// <param name="textValue">textValue.</param>
        /// <param name="filePathValue">filePathValue.</param>
        /// <param name="numericValue">numericValue.</param>
        /// <param name="dateValue">dateValue.</param>
        /// <param name="extendedTextValue">extendedTextValue.</param>
        /// <param name="contactLookupValues">contactLookupValues.</param>
        /// <param name="optionValue">optionValue.</param>
        /// <param name="optionValues">optionValues.</param>
        public CreateCustomFieldValueDto(string code,int? integerValue = default(int?), string textValue = default(string), string filePathValue = default(string), double? numericValue = default(double?), string dateValue = default(string), string extendedTextValue = default(string), List<Guid> contactLookupValues = default(List<Guid>), string optionValue = default(string), List<string> optionValues = default(List<string>))
        {
            // to ensure "code" is required (not null)
            if (code == null) {
                throw new ArgumentNullException("code is a required property for CreateCustomFieldValueDto and cannot be null");
            }
            this.Code = code;
            this.IntegerValue = integerValue;
            this.TextValue = textValue;
            this.FilePathValue = filePathValue;
            this.NumericValue = numericValue;
            this.DateValue = dateValue;
            this.ExtendedTextValue = extendedTextValue;
            this.ContactLookupValues = contactLookupValues;
            this.OptionValue = optionValue;
            this.OptionValues = optionValues;
        }

        /// <summary>
        /// Gets or Sets Code
        /// </summary>
        [DataMember(Name = "code", IsRequired = true, EmitDefaultValue = false)]
        public string Code { get; set; }

        /// <summary>
        /// Gets or Sets IntegerValue
        /// </summary>
        [DataMember(Name = "integerValue", EmitDefaultValue = true)]
        public int? IntegerValue { get; set; }

        /// <summary>
        /// Gets or Sets TextValue
        /// </summary>
        [DataMember(Name = "textValue", EmitDefaultValue = true)]
        public string TextValue { get; set; }

        /// <summary>
        /// Gets or Sets FilePathValue
        /// </summary>
        [DataMember(Name = "filePathValue", EmitDefaultValue = true)]
        public string FilePathValue { get; set; }

        /// <summary>
        /// Gets or Sets NumericValue
        /// </summary>
        [DataMember(Name = "numericValue", EmitDefaultValue = true)]
        public double? NumericValue { get; set; }

        /// <summary>
        /// Gets or Sets DateValue
        /// </summary>
        [DataMember(Name = "dateValue", EmitDefaultValue = true)]
        public string DateValue { get; set; }

        /// <summary>
        /// Gets or Sets ExtendedTextValue
        /// </summary>
        [DataMember(Name = "extendedTextValue", EmitDefaultValue = true)]
        public string ExtendedTextValue { get; set; }

        /// <summary>
        /// Gets or Sets ContactLookupValues
        /// </summary>
        [DataMember(Name = "contactLookupValues", EmitDefaultValue = true)]
        public List<Guid> ContactLookupValues { get; set; }

        /// <summary>
        /// Gets or Sets OptionValue
        /// </summary>
        [DataMember(Name = "optionValue", EmitDefaultValue = true)]
        public string OptionValue { get; set; }

        /// <summary>
        /// Gets or Sets OptionValues
        /// </summary>
        [DataMember(Name = "optionValues", EmitDefaultValue = true)]
        public List<string> OptionValues { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CreateCustomFieldValueDto {\n");
            sb.Append("  Code: ").Append(Code).Append("\n");
            sb.Append("  IntegerValue: ").Append(IntegerValue).Append("\n");
            sb.Append("  TextValue: ").Append(TextValue).Append("\n");
            sb.Append("  FilePathValue: ").Append(FilePathValue).Append("\n");
            sb.Append("  NumericValue: ").Append(NumericValue).Append("\n");
            sb.Append("  DateValue: ").Append(DateValue).Append("\n");
            sb.Append("  ExtendedTextValue: ").Append(ExtendedTextValue).Append("\n");
            sb.Append("  ContactLookupValues: ").Append(ContactLookupValues).Append("\n");
            sb.Append("  OptionValue: ").Append(OptionValue).Append("\n");
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
            return this.Equals(input as CreateCustomFieldValueDto);
        }

        /// <summary>
        /// Returns true if CreateCustomFieldValueDto instances are equal
        /// </summary>
        /// <param name="input">Instance of CreateCustomFieldValueDto to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CreateCustomFieldValueDto input)
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
                    this.IntegerValue == input.IntegerValue ||
                    (this.IntegerValue != null &&
                    this.IntegerValue.Equals(input.IntegerValue))
                ) && 
                (
                    this.TextValue == input.TextValue ||
                    (this.TextValue != null &&
                    this.TextValue.Equals(input.TextValue))
                ) && 
                (
                    this.FilePathValue == input.FilePathValue ||
                    (this.FilePathValue != null &&
                    this.FilePathValue.Equals(input.FilePathValue))
                ) && 
                (
                    this.NumericValue == input.NumericValue ||
                    (this.NumericValue != null &&
                    this.NumericValue.Equals(input.NumericValue))
                ) && 
                (
                    this.DateValue == input.DateValue ||
                    (this.DateValue != null &&
                    this.DateValue.Equals(input.DateValue))
                ) && 
                (
                    this.ExtendedTextValue == input.ExtendedTextValue ||
                    (this.ExtendedTextValue != null &&
                    this.ExtendedTextValue.Equals(input.ExtendedTextValue))
                ) && 
                (
                    this.ContactLookupValues == input.ContactLookupValues ||
                    this.ContactLookupValues != null &&
                    input.ContactLookupValues != null &&
                    this.ContactLookupValues.SequenceEqual(input.ContactLookupValues)
                ) && 
                (
                    this.OptionValue == input.OptionValue ||
                    (this.OptionValue != null &&
                    this.OptionValue.Equals(input.OptionValue))
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
                if (this.Code != null)
                {
                    hashCode = (hashCode * 59) + this.Code.GetHashCode();
                }
                if (this.IntegerValue != null)
                {
                    hashCode = (hashCode * 59) + this.IntegerValue.GetHashCode();
                }
                if (this.TextValue != null)
                {
                    hashCode = (hashCode * 59) + this.TextValue.GetHashCode();
                }
                if (this.FilePathValue != null)
                {
                    hashCode = (hashCode * 59) + this.FilePathValue.GetHashCode();
                }
                if (this.NumericValue != null)
                {
                    hashCode = (hashCode * 59) + this.NumericValue.GetHashCode();
                }
                if (this.DateValue != null)
                {
                    hashCode = (hashCode * 59) + this.DateValue.GetHashCode();
                }
                if (this.ExtendedTextValue != null)
                {
                    hashCode = (hashCode * 59) + this.ExtendedTextValue.GetHashCode();
                }
                if (this.ContactLookupValues != null)
                {
                    hashCode = (hashCode * 59) + this.ContactLookupValues.GetHashCode();
                }
                if (this.OptionValue != null)
                {
                    hashCode = (hashCode * 59) + this.OptionValue.GetHashCode();
                }
                if (this.OptionValues != null)
                {
                    hashCode = (hashCode * 59) + this.OptionValues.GetHashCode();
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
