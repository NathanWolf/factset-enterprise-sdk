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
    /// ContactRelationshipTwoSidedDto
    /// </summary>
    [DataContract(Name = "ContactRelationshipTwoSidedDto")]
    public partial class ContactRelationshipTwoSidedDto : IEquatable<ContactRelationshipTwoSidedDto>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ContactRelationshipTwoSidedDto" /> class.
        /// </summary>
        /// <param name="id">id.</param>
        /// <param name="relationshipCategory">relationshipCategory.</param>
        /// <param name="relationship">relationship.</param>
        /// <param name="leftContact">leftContact.</param>
        /// <param name="rightContact">rightContact.</param>
        /// <param name="symbol">symbol.</param>
        /// <param name="isCurrent">isCurrent.</param>
        /// <param name="start">start.</param>
        /// <param name="end">end.</param>
        /// <param name="title">title.</param>
        /// <param name="comment">comment.</param>
        public ContactRelationshipTwoSidedDto(Guid id = default(Guid), RelationshipCategoryIdNameDto relationshipCategory = default(RelationshipCategoryIdNameDto), RelationshipIdNameDto relationship = default(RelationshipIdNameDto), ContactIdNameDto leftContact = default(ContactIdNameDto), ContactIdNameDto rightContact = default(ContactIdNameDto), RelationshipSymbolSummaryDto symbol = default(RelationshipSymbolSummaryDto), bool isCurrent = default(bool), DateTime? start = default(DateTime?), DateTime? end = default(DateTime?), string title = default(string), string comment = default(string))
        {
            this.Id = id;
            this.RelationshipCategory = relationshipCategory;
            this.Relationship = relationship;
            this.LeftContact = leftContact;
            this.RightContact = rightContact;
            this.Symbol = symbol;
            this.IsCurrent = isCurrent;
            this.Start = start;
            this.End = end;
            this.Title = title;
            this.Comment = comment;
        }

        /// <summary>
        /// Gets or Sets Id
        /// </summary>
        [DataMember(Name = "id", EmitDefaultValue = false)]
        public Guid Id { get; set; }

        /// <summary>
        /// Gets or Sets RelationshipCategory
        /// </summary>
        [DataMember(Name = "relationshipCategory", EmitDefaultValue = false)]
        public RelationshipCategoryIdNameDto RelationshipCategory { get; set; }

        /// <summary>
        /// Gets or Sets Relationship
        /// </summary>
        [DataMember(Name = "relationship", EmitDefaultValue = false)]
        public RelationshipIdNameDto Relationship { get; set; }

        /// <summary>
        /// Gets or Sets LeftContact
        /// </summary>
        [DataMember(Name = "leftContact", EmitDefaultValue = false)]
        public ContactIdNameDto LeftContact { get; set; }

        /// <summary>
        /// Gets or Sets RightContact
        /// </summary>
        [DataMember(Name = "rightContact", EmitDefaultValue = false)]
        public ContactIdNameDto RightContact { get; set; }

        /// <summary>
        /// Gets or Sets Symbol
        /// </summary>
        [DataMember(Name = "symbol", EmitDefaultValue = false)]
        public RelationshipSymbolSummaryDto Symbol { get; set; }

        /// <summary>
        /// Gets or Sets IsCurrent
        /// </summary>
        [DataMember(Name = "isCurrent", EmitDefaultValue = true)]
        public bool IsCurrent { get; set; }

        /// <summary>
        /// Gets or Sets Start
        /// </summary>
        [DataMember(Name = "start", EmitDefaultValue = true)]
        public DateTime? Start { get; set; }

        /// <summary>
        /// Gets or Sets End
        /// </summary>
        [DataMember(Name = "end", EmitDefaultValue = true)]
        public DateTime? End { get; set; }

        /// <summary>
        /// Gets or Sets Title
        /// </summary>
        [DataMember(Name = "title", EmitDefaultValue = true)]
        public string Title { get; set; }

        /// <summary>
        /// Gets or Sets Comment
        /// </summary>
        [DataMember(Name = "comment", EmitDefaultValue = true)]
        public string Comment { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ContactRelationshipTwoSidedDto {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  RelationshipCategory: ").Append(RelationshipCategory).Append("\n");
            sb.Append("  Relationship: ").Append(Relationship).Append("\n");
            sb.Append("  LeftContact: ").Append(LeftContact).Append("\n");
            sb.Append("  RightContact: ").Append(RightContact).Append("\n");
            sb.Append("  Symbol: ").Append(Symbol).Append("\n");
            sb.Append("  IsCurrent: ").Append(IsCurrent).Append("\n");
            sb.Append("  Start: ").Append(Start).Append("\n");
            sb.Append("  End: ").Append(End).Append("\n");
            sb.Append("  Title: ").Append(Title).Append("\n");
            sb.Append("  Comment: ").Append(Comment).Append("\n");
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
            return this.Equals(input as ContactRelationshipTwoSidedDto);
        }

        /// <summary>
        /// Returns true if ContactRelationshipTwoSidedDto instances are equal
        /// </summary>
        /// <param name="input">Instance of ContactRelationshipTwoSidedDto to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ContactRelationshipTwoSidedDto input)
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
                    this.RelationshipCategory == input.RelationshipCategory ||
                    (this.RelationshipCategory != null &&
                    this.RelationshipCategory.Equals(input.RelationshipCategory))
                ) && 
                (
                    this.Relationship == input.Relationship ||
                    (this.Relationship != null &&
                    this.Relationship.Equals(input.Relationship))
                ) && 
                (
                    this.LeftContact == input.LeftContact ||
                    (this.LeftContact != null &&
                    this.LeftContact.Equals(input.LeftContact))
                ) && 
                (
                    this.RightContact == input.RightContact ||
                    (this.RightContact != null &&
                    this.RightContact.Equals(input.RightContact))
                ) && 
                (
                    this.Symbol == input.Symbol ||
                    (this.Symbol != null &&
                    this.Symbol.Equals(input.Symbol))
                ) && 
                (
                    this.IsCurrent == input.IsCurrent ||
                    this.IsCurrent.Equals(input.IsCurrent)
                ) && 
                (
                    this.Start == input.Start ||
                    (this.Start != null &&
                    this.Start.Equals(input.Start))
                ) && 
                (
                    this.End == input.End ||
                    (this.End != null &&
                    this.End.Equals(input.End))
                ) && 
                (
                    this.Title == input.Title ||
                    (this.Title != null &&
                    this.Title.Equals(input.Title))
                ) && 
                (
                    this.Comment == input.Comment ||
                    (this.Comment != null &&
                    this.Comment.Equals(input.Comment))
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
                if (this.RelationshipCategory != null)
                {
                    hashCode = (hashCode * 59) + this.RelationshipCategory.GetHashCode();
                }
                if (this.Relationship != null)
                {
                    hashCode = (hashCode * 59) + this.Relationship.GetHashCode();
                }
                if (this.LeftContact != null)
                {
                    hashCode = (hashCode * 59) + this.LeftContact.GetHashCode();
                }
                if (this.RightContact != null)
                {
                    hashCode = (hashCode * 59) + this.RightContact.GetHashCode();
                }
                if (this.Symbol != null)
                {
                    hashCode = (hashCode * 59) + this.Symbol.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.IsCurrent.GetHashCode();
                if (this.Start != null)
                {
                    hashCode = (hashCode * 59) + this.Start.GetHashCode();
                }
                if (this.End != null)
                {
                    hashCode = (hashCode * 59) + this.End.GetHashCode();
                }
                if (this.Title != null)
                {
                    hashCode = (hashCode * 59) + this.Title.GetHashCode();
                }
                if (this.Comment != null)
                {
                    hashCode = (hashCode * 59) + this.Comment.GetHashCode();
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
