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
    /// RecordChangeDto
    /// </summary>
    [DataContract(Name = "RecordChangeDto")]
    public partial class RecordChangeDto : IEquatable<RecordChangeDto>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="RecordChangeDto" /> class.
        /// </summary>
        /// <param name="field">field.</param>
        /// <param name="operation">operation.</param>
        /// <param name="oldValue">oldValue.</param>
        /// <param name="newValue">newValue.</param>
        /// <param name="oldList">oldList.</param>
        /// <param name="newList">newList.</param>
        public RecordChangeDto(string field = default(string), string operation = default(string), string oldValue = default(string), string newValue = default(string), List<string> oldList = default(List<string>), List<string> newList = default(List<string>))
        {
            this.Field = field;
            this.Operation = operation;
            this.OldValue = oldValue;
            this.NewValue = newValue;
            this.OldList = oldList;
            this.NewList = newList;
        }

        /// <summary>
        /// Gets or Sets Field
        /// </summary>
        [DataMember(Name = "field", EmitDefaultValue = true)]
        public string Field { get; set; }

        /// <summary>
        /// Gets or Sets Operation
        /// </summary>
        [DataMember(Name = "operation", EmitDefaultValue = true)]
        public string Operation { get; set; }

        /// <summary>
        /// Gets or Sets OldValue
        /// </summary>
        [DataMember(Name = "oldValue", EmitDefaultValue = true)]
        public string OldValue { get; set; }

        /// <summary>
        /// Gets or Sets NewValue
        /// </summary>
        [DataMember(Name = "newValue", EmitDefaultValue = true)]
        public string NewValue { get; set; }

        /// <summary>
        /// Gets or Sets OldList
        /// </summary>
        [DataMember(Name = "oldList", EmitDefaultValue = true)]
        public List<string> OldList { get; set; }

        /// <summary>
        /// Gets or Sets NewList
        /// </summary>
        [DataMember(Name = "newList", EmitDefaultValue = true)]
        public List<string> NewList { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class RecordChangeDto {\n");
            sb.Append("  Field: ").Append(Field).Append("\n");
            sb.Append("  Operation: ").Append(Operation).Append("\n");
            sb.Append("  OldValue: ").Append(OldValue).Append("\n");
            sb.Append("  NewValue: ").Append(NewValue).Append("\n");
            sb.Append("  OldList: ").Append(OldList).Append("\n");
            sb.Append("  NewList: ").Append(NewList).Append("\n");
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
            return this.Equals(input as RecordChangeDto);
        }

        /// <summary>
        /// Returns true if RecordChangeDto instances are equal
        /// </summary>
        /// <param name="input">Instance of RecordChangeDto to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(RecordChangeDto input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Field == input.Field ||
                    (this.Field != null &&
                    this.Field.Equals(input.Field))
                ) && 
                (
                    this.Operation == input.Operation ||
                    (this.Operation != null &&
                    this.Operation.Equals(input.Operation))
                ) && 
                (
                    this.OldValue == input.OldValue ||
                    (this.OldValue != null &&
                    this.OldValue.Equals(input.OldValue))
                ) && 
                (
                    this.NewValue == input.NewValue ||
                    (this.NewValue != null &&
                    this.NewValue.Equals(input.NewValue))
                ) && 
                (
                    this.OldList == input.OldList ||
                    this.OldList != null &&
                    input.OldList != null &&
                    this.OldList.SequenceEqual(input.OldList)
                ) && 
                (
                    this.NewList == input.NewList ||
                    this.NewList != null &&
                    input.NewList != null &&
                    this.NewList.SequenceEqual(input.NewList)
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
                if (this.Field != null)
                {
                    hashCode = (hashCode * 59) + this.Field.GetHashCode();
                }
                if (this.Operation != null)
                {
                    hashCode = (hashCode * 59) + this.Operation.GetHashCode();
                }
                if (this.OldValue != null)
                {
                    hashCode = (hashCode * 59) + this.OldValue.GetHashCode();
                }
                if (this.NewValue != null)
                {
                    hashCode = (hashCode * 59) + this.NewValue.GetHashCode();
                }
                if (this.OldList != null)
                {
                    hashCode = (hashCode * 59) + this.OldList.GetHashCode();
                }
                if (this.NewList != null)
                {
                    hashCode = (hashCode * 59) + this.NewList.GetHashCode();
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
