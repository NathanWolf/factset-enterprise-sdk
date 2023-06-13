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
    /// CustomSymbolTypeDto
    /// </summary>
    [DataContract(Name = "CustomSymbolTypeDto")]
    public partial class CustomSymbolTypeDto : IEquatable<CustomSymbolTypeDto>, IValidatableObject
    {

        /// <summary>
        /// Gets or Sets DueDiligenceSymbolEntityType
        /// </summary>
        [DataMember(Name = "dueDiligenceSymbolEntityType", EmitDefaultValue = false)]
        public EntityType? DueDiligenceSymbolEntityType { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="CustomSymbolTypeDto" /> class.
        /// </summary>
        /// <param name="id">id.</param>
        /// <param name="name">name.</param>
        /// <param name="hideAddressField">hideAddressField.</param>
        /// <param name="hideSymbolSubType">hideSymbolSubType.</param>
        /// <param name="isDefault">isDefault.</param>
        /// <param name="order">order.</param>
        /// <param name="dueDiligenceSymbolEntityType">dueDiligenceSymbolEntityType.</param>
        public CustomSymbolTypeDto(Guid id = default(Guid), string name = default(string), bool hideAddressField = default(bool), bool hideSymbolSubType = default(bool), bool isDefault = default(bool), int order = default(int), EntityType dueDiligenceSymbolEntityType = default(EntityType))
        {
            this.Id = id;
            this.Name = name;
            this.HideAddressField = hideAddressField;
            this.HideSymbolSubType = hideSymbolSubType;
            this.IsDefault = isDefault;
            this.Order = order;
            this.DueDiligenceSymbolEntityType = dueDiligenceSymbolEntityType;
        }

        /// <summary>
        /// Gets or Sets Id
        /// </summary>
        [DataMember(Name = "id", EmitDefaultValue = false)]
        public Guid Id { get; set; }

        /// <summary>
        /// Gets or Sets Name
        /// </summary>
        [DataMember(Name = "name", EmitDefaultValue = true)]
        public string Name { get; set; }

        /// <summary>
        /// Gets or Sets HideAddressField
        /// </summary>
        [DataMember(Name = "hideAddressField", EmitDefaultValue = true)]
        public bool HideAddressField { get; set; }

        /// <summary>
        /// Gets or Sets HideSymbolSubType
        /// </summary>
        [DataMember(Name = "hideSymbolSubType", EmitDefaultValue = true)]
        public bool HideSymbolSubType { get; set; }

        /// <summary>
        /// Gets or Sets IsDefault
        /// </summary>
        [DataMember(Name = "isDefault", EmitDefaultValue = true)]
        public bool IsDefault { get; set; }

        /// <summary>
        /// Gets or Sets Order
        /// </summary>
        [DataMember(Name = "order", EmitDefaultValue = false)]
        public int Order { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CustomSymbolTypeDto {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  HideAddressField: ").Append(HideAddressField).Append("\n");
            sb.Append("  HideSymbolSubType: ").Append(HideSymbolSubType).Append("\n");
            sb.Append("  IsDefault: ").Append(IsDefault).Append("\n");
            sb.Append("  Order: ").Append(Order).Append("\n");
            sb.Append("  DueDiligenceSymbolEntityType: ").Append(DueDiligenceSymbolEntityType).Append("\n");
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
            return this.Equals(input as CustomSymbolTypeDto);
        }

        /// <summary>
        /// Returns true if CustomSymbolTypeDto instances are equal
        /// </summary>
        /// <param name="input">Instance of CustomSymbolTypeDto to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CustomSymbolTypeDto input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Id == input.Id ||
                    (this.Id != null &&
                    this.Id.Equals(input.Id))
                ) && 
                (
                    this.Name == input.Name ||
                    (this.Name != null &&
                    this.Name.Equals(input.Name))
                ) && 
                (
                    this.HideAddressField == input.HideAddressField ||
                    this.HideAddressField.Equals(input.HideAddressField)
                ) && 
                (
                    this.HideSymbolSubType == input.HideSymbolSubType ||
                    this.HideSymbolSubType.Equals(input.HideSymbolSubType)
                ) && 
                (
                    this.IsDefault == input.IsDefault ||
                    this.IsDefault.Equals(input.IsDefault)
                ) && 
                (
                    this.Order == input.Order ||
                    this.Order.Equals(input.Order)
                ) && 
                (
                    this.DueDiligenceSymbolEntityType == input.DueDiligenceSymbolEntityType ||
                    this.DueDiligenceSymbolEntityType.Equals(input.DueDiligenceSymbolEntityType)
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
                if (this.Id != null)
                {
                    hashCode = (hashCode * 59) + this.Id.GetHashCode();
                }
                if (this.Name != null)
                {
                    hashCode = (hashCode * 59) + this.Name.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.HideAddressField.GetHashCode();
                hashCode = (hashCode * 59) + this.HideSymbolSubType.GetHashCode();
                hashCode = (hashCode * 59) + this.IsDefault.GetHashCode();
                hashCode = (hashCode * 59) + this.Order.GetHashCode();
                hashCode = (hashCode * 59) + this.DueDiligenceSymbolEntityType.GetHashCode();
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
