/*
 * FactSet Fundamentals Report Builder
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
using OpenAPIDateConverter = FactSet.SDK.FactSetFundamentalsReportBuilder.Client.OpenAPIDateConverter;

namespace FactSet.SDK.FactSetFundamentalsReportBuilder.Model
{
    /// <summary>
    /// Describes how to interpret numbers
    /// </summary>
    [DataContract(Name = "valueType_valueType")]
    public partial class ValueTypeValueType : IEquatable<ValueTypeValueType>, IValidatableObject
    {
        /// <summary>
        /// Defines Value
        /// </summary>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum ValueEnum
        {
            /// <summary>
            /// Enum PERCENTAGE for value: PERCENTAGE
            /// </summary>
            [EnumMember(Value = "PERCENTAGE")]
            PERCENTAGE = 1,

            /// <summary>
            /// Enum RATIO for value: RATIO
            /// </summary>
            [EnumMember(Value = "RATIO")]
            RATIO = 2,

            /// <summary>
            /// Enum TREND for value: TREND
            /// </summary>
            [EnumMember(Value = "TREND")]
            TREND = 3,

            /// <summary>
            /// Enum RANGE for value: RANGE
            /// </summary>
            [EnumMember(Value = "RANGE")]
            RANGE = 4

        }


        /// <summary>
        /// Gets or Sets Value
        /// </summary>
        [DataMember(Name = "value", EmitDefaultValue = false)]
        public ValueEnum? Value { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="ValueTypeValueType" /> class.
        /// </summary>
        /// <param name="value">value.</param>
        public ValueTypeValueType(ValueEnum? value = default(ValueEnum?))
        {
            this.Value = value;
        }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ValueTypeValueType {\n");
            sb.Append("  Value: ").Append(Value).Append("\n");
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
            return this.Equals(input as ValueTypeValueType);
        }

        /// <summary>
        /// Returns true if ValueTypeValueType instances are equal
        /// </summary>
        /// <param name="input">Instance of ValueTypeValueType to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ValueTypeValueType input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Value == input.Value ||
                    this.Value.Equals(input.Value)
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
                hashCode = (hashCode * 59) + this.Value.GetHashCode();
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
