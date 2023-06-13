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
    /// CreateCommentDto
    /// </summary>
    [DataContract(Name = "CreateCommentDto")]
    public partial class CreateCommentDto : IEquatable<CreateCommentDto>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CreateCommentDto" /> class.
        /// </summary>
        /// <param name="authorId">authorId.</param>
        /// <param name="parentCommentId">parentCommentId.</param>
        /// <param name="body">body.</param>
        public CreateCommentDto(Guid authorId = default(Guid), Guid? parentCommentId = default(Guid?), string body = default(string))
        {
            this.AuthorId = authorId;
            this.ParentCommentId = parentCommentId;
            this.Body = body;
        }

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
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CreateCommentDto {\n");
            sb.Append("  AuthorId: ").Append(AuthorId).Append("\n");
            sb.Append("  ParentCommentId: ").Append(ParentCommentId).Append("\n");
            sb.Append("  Body: ").Append(Body).Append("\n");
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
            return this.Equals(input as CreateCommentDto);
        }

        /// <summary>
        /// Returns true if CreateCommentDto instances are equal
        /// </summary>
        /// <param name="input">Instance of CreateCommentDto to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CreateCommentDto input)
        {
            if (input == null)
            {
                return false;
            }
            return 
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
                if (this.AuthorId != null)
                {
                    hashCode = (hashCode * 59) + this.AuthorId.GetHashCode();
                }
                if (this.ParentCommentId != null)
                {
                    hashCode = (hashCode * 59) + this.ParentCommentId.GetHashCode();
                }
                if (this.Body != null)
                {
                    hashCode = (hashCode * 59) + this.Body.GetHashCode();
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
