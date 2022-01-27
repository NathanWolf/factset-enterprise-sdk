/*
 * IRN API v1
 *
 * Allows users to create, update and configure IRN data.
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
    /// ContactRelationshipTwoSidedSaveDto
    /// </summary>
    [DataContract(Name = "ContactRelationshipTwoSidedSaveDto")]
    public partial class ContactRelationshipTwoSidedSaveDto : IEquatable<ContactRelationshipTwoSidedSaveDto>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ContactRelationshipTwoSidedSaveDto" /> class.
        /// </summary>
        /// <param name="relationshipId">relationshipId.</param>
        /// <param name="leftContactId">leftContactId.</param>
        /// <param name="rightContactId">rightContactId.</param>
        /// <param name="start">start.</param>
        /// <param name="end">end.</param>
        /// <param name="comment">comment.</param>
        /// <param name="isCurrent">isCurrent.</param>
        /// <param name="symbolId">symbolId.</param>
        /// <param name="symbol">symbol.</param>
        /// <param name="title">title.</param>
        public ContactRelationshipTwoSidedSaveDto(Guid relationshipId = default(Guid), Guid leftContactId = default(Guid), Guid? rightContactId = default(Guid?), DateTime? start = default(DateTime?), DateTime? end = default(DateTime?), string comment = default(string), bool isCurrent = default(bool), Guid? symbolId = default(Guid?), string symbol = default(string), string title = default(string))
        {
            this.RelationshipId = relationshipId;
            this.LeftContactId = leftContactId;
            this.RightContactId = rightContactId;
            this.Start = start;
            this.End = end;
            this.Comment = comment;
            this.IsCurrent = isCurrent;
            this.SymbolId = symbolId;
            this.Symbol = symbol;
            this.Title = title;
        }

        /// <summary>
        /// Gets or Sets RelationshipId
        /// </summary>
        [DataMember(Name = "relationshipId", EmitDefaultValue = false)]
        public Guid RelationshipId { get; set; }

        /// <summary>
        /// Gets or Sets LeftContactId
        /// </summary>
        [DataMember(Name = "leftContactId", EmitDefaultValue = false)]
        public Guid LeftContactId { get; set; }

        /// <summary>
        /// Gets or Sets RightContactId
        /// </summary>
        [DataMember(Name = "rightContactId", EmitDefaultValue = true)]
        public Guid? RightContactId { get; set; }

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
        /// Gets or Sets Comment
        /// </summary>
        [DataMember(Name = "comment", EmitDefaultValue = true)]
        public string Comment { get; set; }

        /// <summary>
        /// Gets or Sets IsCurrent
        /// </summary>
        [DataMember(Name = "isCurrent", EmitDefaultValue = true)]
        public bool IsCurrent { get; set; }

        /// <summary>
        /// Gets or Sets SymbolId
        /// </summary>
        [DataMember(Name = "symbolId", EmitDefaultValue = true)]
        public Guid? SymbolId { get; set; }

        /// <summary>
        /// Gets or Sets Symbol
        /// </summary>
        [DataMember(Name = "symbol", EmitDefaultValue = true)]
        public string Symbol { get; set; }

        /// <summary>
        /// Gets or Sets Title
        /// </summary>
        [DataMember(Name = "title", EmitDefaultValue = true)]
        public string Title { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ContactRelationshipTwoSidedSaveDto {\n");
            sb.Append("  RelationshipId: ").Append(RelationshipId).Append("\n");
            sb.Append("  LeftContactId: ").Append(LeftContactId).Append("\n");
            sb.Append("  RightContactId: ").Append(RightContactId).Append("\n");
            sb.Append("  Start: ").Append(Start).Append("\n");
            sb.Append("  End: ").Append(End).Append("\n");
            sb.Append("  Comment: ").Append(Comment).Append("\n");
            sb.Append("  IsCurrent: ").Append(IsCurrent).Append("\n");
            sb.Append("  SymbolId: ").Append(SymbolId).Append("\n");
            sb.Append("  Symbol: ").Append(Symbol).Append("\n");
            sb.Append("  Title: ").Append(Title).Append("\n");
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
            return this.Equals(input as ContactRelationshipTwoSidedSaveDto);
        }

        /// <summary>
        /// Returns true if ContactRelationshipTwoSidedSaveDto instances are equal
        /// </summary>
        /// <param name="input">Instance of ContactRelationshipTwoSidedSaveDto to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ContactRelationshipTwoSidedSaveDto input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.RelationshipId == input.RelationshipId ||
                    (this.RelationshipId != null &&
                    this.RelationshipId.Equals(input.RelationshipId))
                ) && 
                (
                    this.LeftContactId == input.LeftContactId ||
                    (this.LeftContactId != null &&
                    this.LeftContactId.Equals(input.LeftContactId))
                ) && 
                (
                    this.RightContactId == input.RightContactId ||
                    (this.RightContactId != null &&
                    this.RightContactId.Equals(input.RightContactId))
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
                    this.Comment == input.Comment ||
                    (this.Comment != null &&
                    this.Comment.Equals(input.Comment))
                ) && 
                (
                    this.IsCurrent == input.IsCurrent ||
                    this.IsCurrent.Equals(input.IsCurrent)
                ) && 
                (
                    this.SymbolId == input.SymbolId ||
                    (this.SymbolId != null &&
                    this.SymbolId.Equals(input.SymbolId))
                ) && 
                (
                    this.Symbol == input.Symbol ||
                    (this.Symbol != null &&
                    this.Symbol.Equals(input.Symbol))
                ) && 
                (
                    this.Title == input.Title ||
                    (this.Title != null &&
                    this.Title.Equals(input.Title))
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
                if (this.RelationshipId != null)
                    hashCode = hashCode * 59 + this.RelationshipId.GetHashCode();
                if (this.LeftContactId != null)
                    hashCode = hashCode * 59 + this.LeftContactId.GetHashCode();
                if (this.RightContactId != null)
                    hashCode = hashCode * 59 + this.RightContactId.GetHashCode();
                if (this.Start != null)
                    hashCode = hashCode * 59 + this.Start.GetHashCode();
                if (this.End != null)
                    hashCode = hashCode * 59 + this.End.GetHashCode();
                if (this.Comment != null)
                    hashCode = hashCode * 59 + this.Comment.GetHashCode();
                hashCode = hashCode * 59 + this.IsCurrent.GetHashCode();
                if (this.SymbolId != null)
                    hashCode = hashCode * 59 + this.SymbolId.GetHashCode();
                if (this.Symbol != null)
                    hashCode = hashCode * 59 + this.Symbol.GetHashCode();
                if (this.Title != null)
                    hashCode = hashCode * 59 + this.Title.GetHashCode();
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
