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
    /// CreateCustomSymbolCustomFieldDto
    /// </summary>
    [DataContract(Name = "CreateCustomSymbolCustomFieldDto")]
    public partial class CreateCustomSymbolCustomFieldDto : IEquatable<CreateCustomSymbolCustomFieldDto>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CreateCustomSymbolCustomFieldDto" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CreateCustomSymbolCustomFieldDto() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CreateCustomSymbolCustomFieldDto" /> class.
        /// </summary>
        /// <param name="code">code (required).</param>
        /// <param name="name">name (required).</param>
        /// <param name="type">Type can be one of Text, SingleOption, MultiOptions, Numeric, Date, ExtendedText, ContactLookup (required).</param>
        /// <param name="isHidden">isHidden (required) (default to false).</param>
        /// <param name="isMandatory">isMandatory (required) (default to false).</param>
        /// <param name="isShownInInfobox">isShownInInfobox (required) (default to true).</param>
        /// <param name="formulaConfig">formulaConfig.</param>
        /// <param name="optionsConfig">optionsConfig.</param>
        /// <param name="customSymbolTypes">customSymbolTypes (required).</param>
        public CreateCustomSymbolCustomFieldDto(string code, string name, string type, bool isHidden, bool isMandatory, bool isShownInInfobox, List<Guid> customSymbolTypes,CustomSymbolCustomFieldFormulaConfigDto formulaConfig = default(CustomSymbolCustomFieldFormulaConfigDto), List<string> optionsConfig = default(List<string>))
        {
            // to ensure "code" is required (not null)
            if (code == null) {
                throw new ArgumentNullException("code is a required property for CreateCustomSymbolCustomFieldDto and cannot be null");
            }
            this.Code = code;
            // to ensure "name" is required (not null)
            if (name == null) {
                throw new ArgumentNullException("name is a required property for CreateCustomSymbolCustomFieldDto and cannot be null");
            }
            this.Name = name;
            // to ensure "type" is required (not null)
            if (type == null) {
                throw new ArgumentNullException("type is a required property for CreateCustomSymbolCustomFieldDto and cannot be null");
            }
            this.Type = type;
            this.IsHidden = isHidden;
            this.IsMandatory = isMandatory;
            this.IsShownInInfobox = isShownInInfobox;
            // to ensure "customSymbolTypes" is required (not null)
            if (customSymbolTypes == null) {
                throw new ArgumentNullException("customSymbolTypes is a required property for CreateCustomSymbolCustomFieldDto and cannot be null");
            }
            this.CustomSymbolTypes = customSymbolTypes;
            this.FormulaConfig = formulaConfig;
            this.OptionsConfig = optionsConfig;
        }

        /// <summary>
        /// Gets or Sets Code
        /// </summary>
        [DataMember(Name = "code", IsRequired = true, EmitDefaultValue = false)]
        public string Code { get; set; }

        /// <summary>
        /// Gets or Sets Name
        /// </summary>
        [DataMember(Name = "name", IsRequired = true, EmitDefaultValue = false)]
        public string Name { get; set; }

        /// <summary>
        /// Type can be one of Text, SingleOption, MultiOptions, Numeric, Date, ExtendedText, ContactLookup
        /// </summary>
        /// <value>Type can be one of Text, SingleOption, MultiOptions, Numeric, Date, ExtendedText, ContactLookup</value>
        [DataMember(Name = "type", IsRequired = true, EmitDefaultValue = false)]
        public string Type { get; set; }

        /// <summary>
        /// Gets or Sets IsHidden
        /// </summary>
        [DataMember(Name = "isHidden", IsRequired = true, EmitDefaultValue = true)]
        public bool IsHidden { get; set; }

        /// <summary>
        /// Gets or Sets IsMandatory
        /// </summary>
        [DataMember(Name = "isMandatory", IsRequired = true, EmitDefaultValue = true)]
        public bool IsMandatory { get; set; }

        /// <summary>
        /// Gets or Sets IsShownInInfobox
        /// </summary>
        [DataMember(Name = "isShownInInfobox", IsRequired = true, EmitDefaultValue = true)]
        public bool IsShownInInfobox { get; set; }

        /// <summary>
        /// Gets or Sets FormulaConfig
        /// </summary>
        [DataMember(Name = "formulaConfig", EmitDefaultValue = false)]
        public CustomSymbolCustomFieldFormulaConfigDto FormulaConfig { get; set; }

        /// <summary>
        /// Gets or Sets OptionsConfig
        /// </summary>
        [DataMember(Name = "optionsConfig", EmitDefaultValue = true)]
        public List<string> OptionsConfig { get; set; }

        /// <summary>
        /// Gets or Sets CustomSymbolTypes
        /// </summary>
        [DataMember(Name = "customSymbolTypes", IsRequired = true, EmitDefaultValue = false)]
        public List<Guid> CustomSymbolTypes { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CreateCustomSymbolCustomFieldDto {\n");
            sb.Append("  Code: ").Append(Code).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
            sb.Append("  IsHidden: ").Append(IsHidden).Append("\n");
            sb.Append("  IsMandatory: ").Append(IsMandatory).Append("\n");
            sb.Append("  IsShownInInfobox: ").Append(IsShownInInfobox).Append("\n");
            sb.Append("  FormulaConfig: ").Append(FormulaConfig).Append("\n");
            sb.Append("  OptionsConfig: ").Append(OptionsConfig).Append("\n");
            sb.Append("  CustomSymbolTypes: ").Append(CustomSymbolTypes).Append("\n");
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
            return this.Equals(input as CreateCustomSymbolCustomFieldDto);
        }

        /// <summary>
        /// Returns true if CreateCustomSymbolCustomFieldDto instances are equal
        /// </summary>
        /// <param name="input">Instance of CreateCustomSymbolCustomFieldDto to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CreateCustomSymbolCustomFieldDto input)
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
                    this.Name == input.Name ||
                    (this.Name != null &&
                    this.Name.Equals(input.Name))
                ) && 
                (
                    this.Type == input.Type ||
                    (this.Type != null &&
                    this.Type.Equals(input.Type))
                ) && 
                (
                    this.IsHidden == input.IsHidden ||
                    this.IsHidden.Equals(input.IsHidden)
                ) && 
                (
                    this.IsMandatory == input.IsMandatory ||
                    this.IsMandatory.Equals(input.IsMandatory)
                ) && 
                (
                    this.IsShownInInfobox == input.IsShownInInfobox ||
                    this.IsShownInInfobox.Equals(input.IsShownInInfobox)
                ) && 
                (
                    this.FormulaConfig == input.FormulaConfig ||
                    (this.FormulaConfig != null &&
                    this.FormulaConfig.Equals(input.FormulaConfig))
                ) && 
                (
                    this.OptionsConfig == input.OptionsConfig ||
                    this.OptionsConfig != null &&
                    input.OptionsConfig != null &&
                    this.OptionsConfig.SequenceEqual(input.OptionsConfig)
                ) && 
                (
                    this.CustomSymbolTypes == input.CustomSymbolTypes ||
                    this.CustomSymbolTypes != null &&
                    input.CustomSymbolTypes != null &&
                    this.CustomSymbolTypes.SequenceEqual(input.CustomSymbolTypes)
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
                if (this.Name != null)
                {
                    hashCode = (hashCode * 59) + this.Name.GetHashCode();
                }
                if (this.Type != null)
                {
                    hashCode = (hashCode * 59) + this.Type.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.IsHidden.GetHashCode();
                hashCode = (hashCode * 59) + this.IsMandatory.GetHashCode();
                hashCode = (hashCode * 59) + this.IsShownInInfobox.GetHashCode();
                if (this.FormulaConfig != null)
                {
                    hashCode = (hashCode * 59) + this.FormulaConfig.GetHashCode();
                }
                if (this.OptionsConfig != null)
                {
                    hashCode = (hashCode * 59) + this.OptionsConfig.GetHashCode();
                }
                if (this.CustomSymbolTypes != null)
                {
                    hashCode = (hashCode * 59) + this.CustomSymbolTypes.GetHashCode();
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
            // Code (string) maxLength
            if (this.Code != null && this.Code.Length > 32)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for Code, length must be less than 32.", new [] { "Code" });
            }

            // Name (string) maxLength
            if (this.Name != null && this.Name.Length > 100)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for Name, length must be less than 100.", new [] { "Name" });
            }

            yield break;
        }
    }

}
