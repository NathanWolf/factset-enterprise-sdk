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
    /// UpdateNoteDto
    /// </summary>
    [DataContract(Name = "UpdateNoteDto")]
    public partial class UpdateNoteDto : IEquatable<UpdateNoteDto>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="UpdateNoteDto" /> class.
        /// </summary>
        /// <param name="author">author.</param>
        /// <param name="title">title.</param>
        /// <param name="subjectId">subjectId.</param>
        /// <param name="noteDate">noteDate.</param>
        /// <param name="recommendationId">recommendationId.</param>
        /// <param name="sentimentId">sentimentId.</param>
        /// <param name="body">body.</param>
        /// <param name="source">source.</param>
        /// <param name="link">link.</param>
        /// <param name="relatedSymbols">relatedSymbols.</param>
        /// <param name="relatedContacts">relatedContacts.</param>
        /// <param name="relatedRecords">relatedRecords.</param>
        /// <param name="customFieldValues">customFieldValues.</param>
        /// <param name="isPersonal">isPersonal.</param>
        /// <param name="identifier">identifier.</param>
        public UpdateNoteDto(UserSerialDto author = default(UserSerialDto), string title = default(string), Guid subjectId = default(Guid), string noteDate = default(string), Guid? recommendationId = default(Guid?), Guid? sentimentId = default(Guid?), CreateBodyDto body = default(CreateBodyDto), string source = default(string), string link = default(string), List<string> relatedSymbols = default(List<string>), List<Guid> relatedContacts = default(List<Guid>), RelatedRecordsDto relatedRecords = default(RelatedRecordsDto), List<CreateCustomFieldValueDto> customFieldValues = default(List<CreateCustomFieldValueDto>), bool? isPersonal = default(bool?), string identifier = default(string))
        {
            this.Author = author;
            this.Title = title;
            this.SubjectId = subjectId;
            this.NoteDate = noteDate;
            this.RecommendationId = recommendationId;
            this.SentimentId = sentimentId;
            this.Body = body;
            this.Source = source;
            this.Link = link;
            this.RelatedSymbols = relatedSymbols;
            this.RelatedContacts = relatedContacts;
            this.RelatedRecords = relatedRecords;
            this.CustomFieldValues = customFieldValues;
            this.IsPersonal = isPersonal;
            this.Identifier = identifier;
        }

        /// <summary>
        /// Gets or Sets Author
        /// </summary>
        [DataMember(Name = "Author", EmitDefaultValue = false)]
        public UserSerialDto Author { get; set; }

        /// <summary>
        /// Gets or Sets Title
        /// </summary>
        [DataMember(Name = "Title", EmitDefaultValue = true)]
        public string Title { get; set; }

        /// <summary>
        /// Gets or Sets SubjectId
        /// </summary>
        [DataMember(Name = "SubjectId", EmitDefaultValue = false)]
        public Guid SubjectId { get; set; }

        /// <summary>
        /// Gets or Sets NoteDate
        /// </summary>
        [DataMember(Name = "NoteDate", EmitDefaultValue = true)]
        public string NoteDate { get; set; }

        /// <summary>
        /// Gets or Sets RecommendationId
        /// </summary>
        [DataMember(Name = "RecommendationId", EmitDefaultValue = true)]
        public Guid? RecommendationId { get; set; }

        /// <summary>
        /// Gets or Sets SentimentId
        /// </summary>
        [DataMember(Name = "SentimentId", EmitDefaultValue = true)]
        public Guid? SentimentId { get; set; }

        /// <summary>
        /// Gets or Sets Body
        /// </summary>
        [DataMember(Name = "Body", EmitDefaultValue = false)]
        public CreateBodyDto Body { get; set; }

        /// <summary>
        /// Gets or Sets Source
        /// </summary>
        [DataMember(Name = "Source", EmitDefaultValue = true)]
        public string Source { get; set; }

        /// <summary>
        /// Gets or Sets Link
        /// </summary>
        [DataMember(Name = "Link", EmitDefaultValue = true)]
        public string Link { get; set; }

        /// <summary>
        /// Gets or Sets RelatedSymbols
        /// </summary>
        [DataMember(Name = "RelatedSymbols", EmitDefaultValue = true)]
        public List<string> RelatedSymbols { get; set; }

        /// <summary>
        /// Gets or Sets RelatedContacts
        /// </summary>
        [DataMember(Name = "RelatedContacts", EmitDefaultValue = true)]
        public List<Guid> RelatedContacts { get; set; }

        /// <summary>
        /// Gets or Sets RelatedRecords
        /// </summary>
        [DataMember(Name = "RelatedRecords", EmitDefaultValue = false)]
        public RelatedRecordsDto RelatedRecords { get; set; }

        /// <summary>
        /// Gets or Sets CustomFieldValues
        /// </summary>
        [DataMember(Name = "CustomFieldValues", EmitDefaultValue = true)]
        public List<CreateCustomFieldValueDto> CustomFieldValues { get; set; }

        /// <summary>
        /// Gets or Sets IsPersonal
        /// </summary>
        [DataMember(Name = "IsPersonal", EmitDefaultValue = true)]
        public bool? IsPersonal { get; set; }

        /// <summary>
        /// Gets or Sets Identifier
        /// </summary>
        [DataMember(Name = "Identifier", EmitDefaultValue = true)]
        public string Identifier { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class UpdateNoteDto {\n");
            sb.Append("  Author: ").Append(Author).Append("\n");
            sb.Append("  Title: ").Append(Title).Append("\n");
            sb.Append("  SubjectId: ").Append(SubjectId).Append("\n");
            sb.Append("  NoteDate: ").Append(NoteDate).Append("\n");
            sb.Append("  RecommendationId: ").Append(RecommendationId).Append("\n");
            sb.Append("  SentimentId: ").Append(SentimentId).Append("\n");
            sb.Append("  Body: ").Append(Body).Append("\n");
            sb.Append("  Source: ").Append(Source).Append("\n");
            sb.Append("  Link: ").Append(Link).Append("\n");
            sb.Append("  RelatedSymbols: ").Append(RelatedSymbols).Append("\n");
            sb.Append("  RelatedContacts: ").Append(RelatedContacts).Append("\n");
            sb.Append("  RelatedRecords: ").Append(RelatedRecords).Append("\n");
            sb.Append("  CustomFieldValues: ").Append(CustomFieldValues).Append("\n");
            sb.Append("  IsPersonal: ").Append(IsPersonal).Append("\n");
            sb.Append("  Identifier: ").Append(Identifier).Append("\n");
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
            return this.Equals(input as UpdateNoteDto);
        }

        /// <summary>
        /// Returns true if UpdateNoteDto instances are equal
        /// </summary>
        /// <param name="input">Instance of UpdateNoteDto to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(UpdateNoteDto input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Author == input.Author ||
                    (this.Author != null &&
                    this.Author.Equals(input.Author))
                ) && 
                (
                    this.Title == input.Title ||
                    (this.Title != null &&
                    this.Title.Equals(input.Title))
                ) && 
                (
                    this.SubjectId == input.SubjectId ||
                    (this.SubjectId != null &&
                    this.SubjectId.Equals(input.SubjectId))
                ) && 
                (
                    this.NoteDate == input.NoteDate ||
                    (this.NoteDate != null &&
                    this.NoteDate.Equals(input.NoteDate))
                ) && 
                (
                    this.RecommendationId == input.RecommendationId ||
                    (this.RecommendationId != null &&
                    this.RecommendationId.Equals(input.RecommendationId))
                ) && 
                (
                    this.SentimentId == input.SentimentId ||
                    (this.SentimentId != null &&
                    this.SentimentId.Equals(input.SentimentId))
                ) && 
                (
                    this.Body == input.Body ||
                    (this.Body != null &&
                    this.Body.Equals(input.Body))
                ) && 
                (
                    this.Source == input.Source ||
                    (this.Source != null &&
                    this.Source.Equals(input.Source))
                ) && 
                (
                    this.Link == input.Link ||
                    (this.Link != null &&
                    this.Link.Equals(input.Link))
                ) && 
                (
                    this.RelatedSymbols == input.RelatedSymbols ||
                    this.RelatedSymbols != null &&
                    input.RelatedSymbols != null &&
                    this.RelatedSymbols.SequenceEqual(input.RelatedSymbols)
                ) && 
                (
                    this.RelatedContacts == input.RelatedContacts ||
                    this.RelatedContacts != null &&
                    input.RelatedContacts != null &&
                    this.RelatedContacts.SequenceEqual(input.RelatedContacts)
                ) && 
                (
                    this.RelatedRecords == input.RelatedRecords ||
                    (this.RelatedRecords != null &&
                    this.RelatedRecords.Equals(input.RelatedRecords))
                ) && 
                (
                    this.CustomFieldValues == input.CustomFieldValues ||
                    this.CustomFieldValues != null &&
                    input.CustomFieldValues != null &&
                    this.CustomFieldValues.SequenceEqual(input.CustomFieldValues)
                ) && 
                (
                    this.IsPersonal == input.IsPersonal ||
                    (this.IsPersonal != null &&
                    this.IsPersonal.Equals(input.IsPersonal))
                ) && 
                (
                    this.Identifier == input.Identifier ||
                    (this.Identifier != null &&
                    this.Identifier.Equals(input.Identifier))
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
                if (this.Author != null)
                {
                    hashCode = (hashCode * 59) + this.Author.GetHashCode();
                }
                if (this.Title != null)
                {
                    hashCode = (hashCode * 59) + this.Title.GetHashCode();
                }
                if (this.SubjectId != null)
                {
                    hashCode = (hashCode * 59) + this.SubjectId.GetHashCode();
                }
                if (this.NoteDate != null)
                {
                    hashCode = (hashCode * 59) + this.NoteDate.GetHashCode();
                }
                if (this.RecommendationId != null)
                {
                    hashCode = (hashCode * 59) + this.RecommendationId.GetHashCode();
                }
                if (this.SentimentId != null)
                {
                    hashCode = (hashCode * 59) + this.SentimentId.GetHashCode();
                }
                if (this.Body != null)
                {
                    hashCode = (hashCode * 59) + this.Body.GetHashCode();
                }
                if (this.Source != null)
                {
                    hashCode = (hashCode * 59) + this.Source.GetHashCode();
                }
                if (this.Link != null)
                {
                    hashCode = (hashCode * 59) + this.Link.GetHashCode();
                }
                if (this.RelatedSymbols != null)
                {
                    hashCode = (hashCode * 59) + this.RelatedSymbols.GetHashCode();
                }
                if (this.RelatedContacts != null)
                {
                    hashCode = (hashCode * 59) + this.RelatedContacts.GetHashCode();
                }
                if (this.RelatedRecords != null)
                {
                    hashCode = (hashCode * 59) + this.RelatedRecords.GetHashCode();
                }
                if (this.CustomFieldValues != null)
                {
                    hashCode = (hashCode * 59) + this.CustomFieldValues.GetHashCode();
                }
                if (this.IsPersonal != null)
                {
                    hashCode = (hashCode * 59) + this.IsPersonal.GetHashCode();
                }
                if (this.Identifier != null)
                {
                    hashCode = (hashCode * 59) + this.Identifier.GetHashCode();
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
            // Title (string) maxLength
            if (this.Title != null && this.Title.Length > 255)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for Title, length must be less than 255.", new [] { "Title" });
            }

            // Title (string) minLength
            if (this.Title != null && this.Title.Length < 0)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for Title, length must be greater than 0.", new [] { "Title" });
            }

            // Link (string) maxLength
            if (this.Link != null && this.Link.Length > 255)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for Link, length must be less than 255.", new [] { "Link" });
            }

            // Link (string) minLength
            if (this.Link != null && this.Link.Length < 0)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for Link, length must be greater than 0.", new [] { "Link" });
            }

            yield break;
        }
    }

}
