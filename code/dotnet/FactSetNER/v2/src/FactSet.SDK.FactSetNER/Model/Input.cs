/*
 * FactSet NER
 *
 * Extract named entities and their FactSet entity IDs from given document text.
 *
 * The version of the OpenAPI document: 2.0.0
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
using OpenAPIDateConverter = FactSet.SDK.FactSetNER.Client.OpenAPIDateConverter;

namespace FactSet.SDK.FactSetNER.Model
{
    /// <summary>
    /// Input
    /// </summary>
    [DataContract(Name = "Input")]
    public partial class Input : IEquatable<Input>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="Input" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected Input() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="Input" /> class.
        /// </summary>
        /// <param name="text">English plain text to extract named entities from.  Maxiumum of 10,000 characters. (required).</param>
        /// <param name="filterEntities">Drop lower probability entities using machine learning filtering rules (default to true).</param>
        /// <param name="enableIdLookup">Retrieve FactSet IDs for entities (default to true).</param>
        public Input(string text = default(string), bool filterEntities = true, bool enableIdLookup = true)
        {
            // to ensure "text" is required (not null)
            if (text == null) {
                throw new ArgumentNullException("text is a required property for Input and cannot be null");
            }
            this.Text = text;
            this.FilterEntities = filterEntities;
            this.EnableIdLookup = enableIdLookup;
        }

        /// <summary>
        /// English plain text to extract named entities from.  Maxiumum of 10,000 characters.
        /// </summary>
        /// <value>English plain text to extract named entities from.  Maxiumum of 10,000 characters.</value>
        [DataMember(Name = "text", IsRequired = true, EmitDefaultValue = false)]
        public string Text { get; set; }

        /// <summary>
        /// Drop lower probability entities using machine learning filtering rules
        /// </summary>
        /// <value>Drop lower probability entities using machine learning filtering rules</value>
        [DataMember(Name = "filterEntities", EmitDefaultValue = true)]
        public bool FilterEntities { get; set; }

        /// <summary>
        /// Retrieve FactSet IDs for entities
        /// </summary>
        /// <value>Retrieve FactSet IDs for entities</value>
        [DataMember(Name = "enableIdLookup", EmitDefaultValue = true)]
        public bool EnableIdLookup { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class Input {\n");
            sb.Append("  Text: ").Append(Text).Append("\n");
            sb.Append("  FilterEntities: ").Append(FilterEntities).Append("\n");
            sb.Append("  EnableIdLookup: ").Append(EnableIdLookup).Append("\n");
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
            return this.Equals(input as Input);
        }

        /// <summary>
        /// Returns true if Input instances are equal
        /// </summary>
        /// <param name="input">Instance of Input to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Input input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Text == input.Text ||
                    (this.Text != null &&
                    this.Text.Equals(input.Text))
                ) && 
                (
                    this.FilterEntities == input.FilterEntities ||
                    this.FilterEntities.Equals(input.FilterEntities)
                ) && 
                (
                    this.EnableIdLookup == input.EnableIdLookup ||
                    this.EnableIdLookup.Equals(input.EnableIdLookup)
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
                if (this.Text != null)
                {
                    hashCode = (hashCode * 59) + this.Text.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.FilterEntities.GetHashCode();
                hashCode = (hashCode * 59) + this.EnableIdLookup.GetHashCode();
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
