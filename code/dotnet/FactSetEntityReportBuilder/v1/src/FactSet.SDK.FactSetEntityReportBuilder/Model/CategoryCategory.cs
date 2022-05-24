/*
 * FactSet Entity Report Builder
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
using OpenAPIDateConverter = FactSet.SDK.FactSetEntityReportBuilder.Client.OpenAPIDateConverter;

namespace FactSet.SDK.FactSetEntityReportBuilder.Model
{
    /// <summary>
    /// Describes data based on source or kind of value - ACTUAL - Historical data collected directly from a press release or a median consensus from brokers after a report date. - ESTIMATE - Forward looking average of broker estimates within a specific time horizon. - GUIDANCE - Forward looking indication or estimate of future performance issued by the company itself. - DETAIL - Indicates data that is more granular and may be secondary in focus. - MAIN - Indicates data is of more impactful or higher importance and may want to be emphasized. - SECTION - Indicates data that is used in sectioning rows in group level STACH format. 
    /// </summary>
    [DataContract(Name = "category_category")]
    public partial class CategoryCategory : IEquatable<CategoryCategory>, IValidatableObject
    {
        /// <summary>
        /// Defines Value
        /// </summary>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum ValueEnum
        {
            /// <summary>
            /// Enum ACTUAL for value: ACTUAL
            /// </summary>
            [EnumMember(Value = "ACTUAL")]
            ACTUAL = 1,

            /// <summary>
            /// Enum ESTIMATE for value: ESTIMATE
            /// </summary>
            [EnumMember(Value = "ESTIMATE")]
            ESTIMATE = 2,

            /// <summary>
            /// Enum GUIDANCE for value: GUIDANCE
            /// </summary>
            [EnumMember(Value = "GUIDANCE")]
            GUIDANCE = 3,

            /// <summary>
            /// Enum EXCLUDED for value: EXCLUDED
            /// </summary>
            [EnumMember(Value = "EXCLUDED")]
            EXCLUDED = 4,

            /// <summary>
            /// Enum CHANGE for value: CHANGE
            /// </summary>
            [EnumMember(Value = "CHANGE")]
            CHANGE = 5,

            /// <summary>
            /// Enum DETAIL for value: DETAIL
            /// </summary>
            [EnumMember(Value = "DETAIL")]
            DETAIL = 6,

            /// <summary>
            /// Enum MAIN for value: MAIN
            /// </summary>
            [EnumMember(Value = "MAIN")]
            MAIN = 7,

            /// <summary>
            /// Enum SECTION for value: SECTION
            /// </summary>
            [EnumMember(Value = "SECTION")]
            SECTION = 8

        }


        /// <summary>
        /// Gets or Sets Value
        /// </summary>
        [DataMember(Name = "value", EmitDefaultValue = false)]
        public ValueEnum? Value { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="CategoryCategory" /> class.
        /// </summary>
        /// <param name="value">value.</param>
        public CategoryCategory(ValueEnum? value = default(ValueEnum?))
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
            sb.Append("class CategoryCategory {\n");
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
            return this.Equals(input as CategoryCategory);
        }

        /// <summary>
        /// Returns true if CategoryCategory instances are equal
        /// </summary>
        /// <param name="input">Instance of CategoryCategory to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CategoryCategory input)
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
