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
using OpenAPIDateConverter = FactSet.SDK.IRNMeetings.Client.OpenAPIDateConverter;

namespace FactSet.SDK.IRNMeetings.Model
{
    /// <summary>
    /// CommentDto
    /// </summary>
    [DataContract(Name = "CommentDto")]
    public partial class CommentDto : IEquatable<CommentDto>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CommentDto" /> class.
        /// </summary>
        /// <param name="id">id.</param>
        /// <param name="authorId">authorId.</param>
        /// <param name="parentCommentId">parentCommentId.</param>
        /// <param name="body">body.</param>
        /// <param name="createdAt">createdAt.</param>
        /// <param name="attachments">attachments.</param>
        /// <param name="subcomments">subcomments.</param>
        public CommentDto(Guid id = default(Guid), Guid authorId = default(Guid), Guid? parentCommentId = default(Guid?), string body = default(string), string createdAt = default(string), List<AttachmentSummaryDto> attachments = default(List<AttachmentSummaryDto>), List<SubcommentSummaryDto> subcomments = default(List<SubcommentSummaryDto>))
        {
            this.Id = id;
            this.AuthorId = authorId;
            this.ParentCommentId = parentCommentId;
            this.Body = body;
            this.CreatedAt = createdAt;
            this.Attachments = attachments;
            this.Subcomments = subcomments;
        }

        /// <summary>
        /// Gets or Sets Id
        /// </summary>
        [DataMember(Name = "id", EmitDefaultValue = false)]
        public Guid Id { get; set; }

        /// <summary>
        /// Gets or Sets AuthorId
        /// </summary>
        [DataMember(Name = "authorId", EmitDefaultValue = false)]
        public Guid AuthorId { get; set; }

        /// <summary>
        /// Gets or Sets ParentCommentId
        /// </summary>
        [DataMember(Name = "parentCommentId", EmitDefaultValue = true)]
        public Guid? ParentCommentId { get; set; }

        /// <summary>
        /// Gets or Sets Body
        /// </summary>
        [DataMember(Name = "body", EmitDefaultValue = true)]
        public string Body { get; set; }

        /// <summary>
        /// Gets or Sets CreatedAt
        /// </summary>
        [DataMember(Name = "createdAt", EmitDefaultValue = true)]
        public string CreatedAt { get; set; }

        /// <summary>
        /// Gets or Sets Attachments
        /// </summary>
        [DataMember(Name = "attachments", EmitDefaultValue = true)]
        public List<AttachmentSummaryDto> Attachments { get; set; }

        /// <summary>
        /// Gets or Sets Subcomments
        /// </summary>
        [DataMember(Name = "subcomments", EmitDefaultValue = true)]
        public List<SubcommentSummaryDto> Subcomments { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class CommentDto {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  AuthorId: ").Append(AuthorId).Append("\n");
            sb.Append("  ParentCommentId: ").Append(ParentCommentId).Append("\n");
            sb.Append("  Body: ").Append(Body).Append("\n");
            sb.Append("  CreatedAt: ").Append(CreatedAt).Append("\n");
            sb.Append("  Attachments: ").Append(Attachments).Append("\n");
            sb.Append("  Subcomments: ").Append(Subcomments).Append("\n");
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
            return this.Equals(input as CommentDto);
        }

        /// <summary>
        /// Returns true if CommentDto instances are equal
        /// </summary>
        /// <param name="input">Instance of CommentDto to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CommentDto input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Id == input.Id ||
                    (this.Id != null &&
                    this.Id.Equals(input.Id))
                ) && 
                (
                    this.AuthorId == input.AuthorId ||
                    (this.AuthorId != null &&
                    this.AuthorId.Equals(input.AuthorId))
                ) && 
                (
                    this.ParentCommentId == input.ParentCommentId ||
                    (this.ParentCommentId != null &&
                    this.ParentCommentId.Equals(input.ParentCommentId))
                ) && 
                (
                    this.Body == input.Body ||
                    (this.Body != null &&
                    this.Body.Equals(input.Body))
                ) && 
                (
                    this.CreatedAt == input.CreatedAt ||
                    (this.CreatedAt != null &&
                    this.CreatedAt.Equals(input.CreatedAt))
                ) && 
                (
                    this.Attachments == input.Attachments ||
                    this.Attachments != null &&
                    input.Attachments != null &&
                    this.Attachments.SequenceEqual(input.Attachments)
                ) && 
                (
                    this.Subcomments == input.Subcomments ||
                    this.Subcomments != null &&
                    input.Subcomments != null &&
                    this.Subcomments.SequenceEqual(input.Subcomments)
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
                    hashCode = hashCode * 59 + this.Id.GetHashCode();
                if (this.AuthorId != null)
                    hashCode = hashCode * 59 + this.AuthorId.GetHashCode();
                if (this.ParentCommentId != null)
                    hashCode = hashCode * 59 + this.ParentCommentId.GetHashCode();
                if (this.Body != null)
                    hashCode = hashCode * 59 + this.Body.GetHashCode();
                if (this.CreatedAt != null)
                    hashCode = hashCode * 59 + this.CreatedAt.GetHashCode();
                if (this.Attachments != null)
                    hashCode = hashCode * 59 + this.Attachments.GetHashCode();
                if (this.Subcomments != null)
                    hashCode = hashCode * 59 + this.Subcomments.GetHashCode();
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
