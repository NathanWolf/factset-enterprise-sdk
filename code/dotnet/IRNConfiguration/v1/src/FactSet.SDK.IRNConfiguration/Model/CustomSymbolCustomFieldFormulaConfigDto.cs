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
    /// CustomSymbolCustomFieldFormulaConfigDto
    /// </summary>
    [DataContract(Name = "CustomSymbolCustomFieldFormulaConfigDto")]
    public partial class CustomSymbolCustomFieldFormulaConfigDto : IEquatable<CustomSymbolCustomFieldFormulaConfigDto>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CustomSymbolCustomFieldFormulaConfigDto" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CustomSymbolCustomFieldFormulaConfigDto() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CustomSymbolCustomFieldFormulaConfigDto" /> class.
        /// </summary>
        /// <param name="formula">formula (required).</param>
        /// <param name="formulaType">formulaType (required).</param>
        public CustomSymbolCustomFieldFormulaConfigDto(string formula, string formulaType)
        {
            // to ensure "formula" is required (not null)
            if (formula == null) {
                throw new ArgumentNullException("formula is a required property for CustomSymbolCustomFieldFormulaConfigDto and cannot be null");
            }
            this.Formula = formula;
            // to ensure "formulaType" is required (not null)
            if (formulaType == null) {
                throw new ArgumentNullException("formulaType is a required property for CustomSymbolCustomFieldFormulaConfigDto and cannot be null");
            }
            this.FormulaType = formulaType;
        }

        /// <summary>
        /// Gets or Sets Formula
        /// </summary>
        [DataMember(Name = "formula", IsRequired = true, EmitDefaultValue = false)]
        public string Formula { get; set; }

        /// <summary>
        /// Gets or Sets FormulaType
        /// </summary>
        [DataMember(Name = "formulaType", IsRequired = true, EmitDefaultValue = false)]
        public string FormulaType { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CustomSymbolCustomFieldFormulaConfigDto {\n");
            sb.Append("  Formula: ").Append(Formula).Append("\n");
            sb.Append("  FormulaType: ").Append(FormulaType).Append("\n");
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
            return this.Equals(input as CustomSymbolCustomFieldFormulaConfigDto);
        }

        /// <summary>
        /// Returns true if CustomSymbolCustomFieldFormulaConfigDto instances are equal
        /// </summary>
        /// <param name="input">Instance of CustomSymbolCustomFieldFormulaConfigDto to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CustomSymbolCustomFieldFormulaConfigDto input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Formula == input.Formula ||
                    (this.Formula != null &&
                    this.Formula.Equals(input.Formula))
                ) && 
                (
                    this.FormulaType == input.FormulaType ||
                    (this.FormulaType != null &&
                    this.FormulaType.Equals(input.FormulaType))
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
                if (this.Formula != null)
                {
                    hashCode = (hashCode * 59) + this.Formula.GetHashCode();
                }
                if (this.FormulaType != null)
                {
                    hashCode = (hashCode * 59) + this.FormulaType.GetHashCode();
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
            // Formula (string) maxLength
            if (this.Formula != null && this.Formula.Length > 2040)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for Formula, length must be less than 2040.", new [] { "Formula" });
            }

            yield break;
        }
    }

}
