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
    /// RelationshipCategoryDto
    /// </summary>
    [DataContract(Name = "RelationshipCategoryDto")]
    public partial class RelationshipCategoryDto : IEquatable<RelationshipCategoryDto>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="RelationshipCategoryDto" /> class.
        /// </summary>
        /// <param name="id">id.</param>
        /// <param name="name">name.</param>
        /// <param name="isStandard">isStandard.</param>
        /// <param name="isContactToContact">isContactToContact.</param>
        /// <param name="isContactToSymbol">isContactToSymbol.</param>
        /// <param name="relationships">relationships.</param>
        public RelationshipCategoryDto(Guid id = default(Guid), string name = default(string), bool isStandard = default(bool), bool isContactToContact = default(bool), bool isContactToSymbol = default(bool), List<RelationshipDto> relationships = default(List<RelationshipDto>))
        {
            this.Id = id;
            this.Name = name;
            this.IsStandard = isStandard;
            this.IsContactToContact = isContactToContact;
            this.IsContactToSymbol = isContactToSymbol;
            this.Relationships = relationships;
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
        /// Gets or Sets IsStandard
        /// </summary>
        [DataMember(Name = "isStandard", EmitDefaultValue = true)]
        public bool IsStandard { get; set; }

        /// <summary>
        /// Gets or Sets IsContactToContact
        /// </summary>
        [DataMember(Name = "isContactToContact", EmitDefaultValue = true)]
        public bool IsContactToContact { get; set; }

        /// <summary>
        /// Gets or Sets IsContactToSymbol
        /// </summary>
        [DataMember(Name = "isContactToSymbol", EmitDefaultValue = true)]
        public bool IsContactToSymbol { get; set; }

        /// <summary>
        /// Gets or Sets Relationships
        /// </summary>
        [DataMember(Name = "relationships", EmitDefaultValue = true)]
        public List<RelationshipDto> Relationships { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class RelationshipCategoryDto {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  IsStandard: ").Append(IsStandard).Append("\n");
            sb.Append("  IsContactToContact: ").Append(IsContactToContact).Append("\n");
            sb.Append("  IsContactToSymbol: ").Append(IsContactToSymbol).Append("\n");
            sb.Append("  Relationships: ").Append(Relationships).Append("\n");
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
            return this.Equals(input as RelationshipCategoryDto);
        }

        /// <summary>
        /// Returns true if RelationshipCategoryDto instances are equal
        /// </summary>
        /// <param name="input">Instance of RelationshipCategoryDto to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(RelationshipCategoryDto input)
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
                    this.IsStandard == input.IsStandard ||
                    this.IsStandard.Equals(input.IsStandard)
                ) && 
                (
                    this.IsContactToContact == input.IsContactToContact ||
                    this.IsContactToContact.Equals(input.IsContactToContact)
                ) && 
                (
                    this.IsContactToSymbol == input.IsContactToSymbol ||
                    this.IsContactToSymbol.Equals(input.IsContactToSymbol)
                ) && 
                (
                    this.Relationships == input.Relationships ||
                    this.Relationships != null &&
                    input.Relationships != null &&
                    this.Relationships.SequenceEqual(input.Relationships)
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
                hashCode = (hashCode * 59) + this.IsStandard.GetHashCode();
                hashCode = (hashCode * 59) + this.IsContactToContact.GetHashCode();
                hashCode = (hashCode * 59) + this.IsContactToSymbol.GetHashCode();
                if (this.Relationships != null)
                {
                    hashCode = (hashCode * 59) + this.Relationships.GetHashCode();
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
