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
    /// RelationshipSaveDto
    /// </summary>
    [DataContract(Name = "RelationshipSaveDto")]
    public partial class RelationshipSaveDto : IEquatable<RelationshipSaveDto>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="RelationshipSaveDto" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected RelationshipSaveDto() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="RelationshipSaveDto" /> class.
        /// </summary>
        /// <param name="relationshipCategoryId">relationshipCategoryId (required).</param>
        /// <param name="relationshipCode">relationshipCode.</param>
        /// <param name="bidirectionalName">bidirectionalName.</param>
        /// <param name="leftToRightName">leftToRightName.</param>
        /// <param name="rightToLeftName">rightToLeftName.</param>
        /// <param name="hideDates">hideDates (required) (default to false).</param>
        /// <param name="hideComment">hideComment (required) (default to false).</param>
        /// <param name="hideCompany">hideCompany (required) (default to false).</param>
        public RelationshipSaveDto(Guid relationshipCategoryId, bool hideDates, bool hideComment, bool hideCompany,string relationshipCode = default(string), string bidirectionalName = default(string), string leftToRightName = default(string), string rightToLeftName = default(string))
        {
            this.RelationshipCategoryId = relationshipCategoryId;
            this.HideDates = hideDates;
            this.HideComment = hideComment;
            this.HideCompany = hideCompany;
            this.RelationshipCode = relationshipCode;
            this.BidirectionalName = bidirectionalName;
            this.LeftToRightName = leftToRightName;
            this.RightToLeftName = rightToLeftName;
        }

        /// <summary>
        /// Gets or Sets RelationshipCategoryId
        /// </summary>
        [DataMember(Name = "relationshipCategoryId", IsRequired = true, EmitDefaultValue = false)]
        public Guid RelationshipCategoryId { get; set; }

        /// <summary>
        /// Gets or Sets RelationshipCode
        /// </summary>
        [DataMember(Name = "relationshipCode", EmitDefaultValue = true)]
        public string RelationshipCode { get; set; }

        /// <summary>
        /// Gets or Sets BidirectionalName
        /// </summary>
        [DataMember(Name = "bidirectionalName", EmitDefaultValue = true)]
        public string BidirectionalName { get; set; }

        /// <summary>
        /// Gets or Sets LeftToRightName
        /// </summary>
        [DataMember(Name = "leftToRightName", EmitDefaultValue = true)]
        public string LeftToRightName { get; set; }

        /// <summary>
        /// Gets or Sets RightToLeftName
        /// </summary>
        [DataMember(Name = "rightToLeftName", EmitDefaultValue = true)]
        public string RightToLeftName { get; set; }

        /// <summary>
        /// Gets or Sets HideDates
        /// </summary>
        [DataMember(Name = "hideDates", IsRequired = true, EmitDefaultValue = true)]
        public bool HideDates { get; set; }

        /// <summary>
        /// Gets or Sets HideComment
        /// </summary>
        [DataMember(Name = "hideComment", IsRequired = true, EmitDefaultValue = true)]
        public bool HideComment { get; set; }

        /// <summary>
        /// Gets or Sets HideCompany
        /// </summary>
        [DataMember(Name = "hideCompany", IsRequired = true, EmitDefaultValue = true)]
        public bool HideCompany { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class RelationshipSaveDto {\n");
            sb.Append("  RelationshipCategoryId: ").Append(RelationshipCategoryId).Append("\n");
            sb.Append("  RelationshipCode: ").Append(RelationshipCode).Append("\n");
            sb.Append("  BidirectionalName: ").Append(BidirectionalName).Append("\n");
            sb.Append("  LeftToRightName: ").Append(LeftToRightName).Append("\n");
            sb.Append("  RightToLeftName: ").Append(RightToLeftName).Append("\n");
            sb.Append("  HideDates: ").Append(HideDates).Append("\n");
            sb.Append("  HideComment: ").Append(HideComment).Append("\n");
            sb.Append("  HideCompany: ").Append(HideCompany).Append("\n");
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
            return this.Equals(input as RelationshipSaveDto);
        }

        /// <summary>
        /// Returns true if RelationshipSaveDto instances are equal
        /// </summary>
        /// <param name="input">Instance of RelationshipSaveDto to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(RelationshipSaveDto input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.RelationshipCategoryId == input.RelationshipCategoryId ||
                    (this.RelationshipCategoryId != null &&
                    this.RelationshipCategoryId.Equals(input.RelationshipCategoryId))
                ) && 
                (
                    this.RelationshipCode == input.RelationshipCode ||
                    (this.RelationshipCode != null &&
                    this.RelationshipCode.Equals(input.RelationshipCode))
                ) && 
                (
                    this.BidirectionalName == input.BidirectionalName ||
                    (this.BidirectionalName != null &&
                    this.BidirectionalName.Equals(input.BidirectionalName))
                ) && 
                (
                    this.LeftToRightName == input.LeftToRightName ||
                    (this.LeftToRightName != null &&
                    this.LeftToRightName.Equals(input.LeftToRightName))
                ) && 
                (
                    this.RightToLeftName == input.RightToLeftName ||
                    (this.RightToLeftName != null &&
                    this.RightToLeftName.Equals(input.RightToLeftName))
                ) && 
                (
                    this.HideDates == input.HideDates ||
                    this.HideDates.Equals(input.HideDates)
                ) && 
                (
                    this.HideComment == input.HideComment ||
                    this.HideComment.Equals(input.HideComment)
                ) && 
                (
                    this.HideCompany == input.HideCompany ||
                    this.HideCompany.Equals(input.HideCompany)
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
                if (this.RelationshipCategoryId != null)
                {
                    hashCode = (hashCode * 59) + this.RelationshipCategoryId.GetHashCode();
                }
                if (this.RelationshipCode != null)
                {
                    hashCode = (hashCode * 59) + this.RelationshipCode.GetHashCode();
                }
                if (this.BidirectionalName != null)
                {
                    hashCode = (hashCode * 59) + this.BidirectionalName.GetHashCode();
                }
                if (this.LeftToRightName != null)
                {
                    hashCode = (hashCode * 59) + this.LeftToRightName.GetHashCode();
                }
                if (this.RightToLeftName != null)
                {
                    hashCode = (hashCode * 59) + this.RightToLeftName.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.HideDates.GetHashCode();
                hashCode = (hashCode * 59) + this.HideComment.GetHashCode();
                hashCode = (hashCode * 59) + this.HideCompany.GetHashCode();
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
            // RelationshipCode (string) maxLength
            if (this.RelationshipCode != null && this.RelationshipCode.Length > 5)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for RelationshipCode, length must be less than 5.", new [] { "RelationshipCode" });
            }

            // RelationshipCode (string) minLength
            if (this.RelationshipCode != null && this.RelationshipCode.Length < 0)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for RelationshipCode, length must be greater than 0.", new [] { "RelationshipCode" });
            }

            // BidirectionalName (string) maxLength
            if (this.BidirectionalName != null && this.BidirectionalName.Length > 50)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for BidirectionalName, length must be less than 50.", new [] { "BidirectionalName" });
            }

            // BidirectionalName (string) minLength
            if (this.BidirectionalName != null && this.BidirectionalName.Length < 0)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for BidirectionalName, length must be greater than 0.", new [] { "BidirectionalName" });
            }

            // LeftToRightName (string) maxLength
            if (this.LeftToRightName != null && this.LeftToRightName.Length > 50)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for LeftToRightName, length must be less than 50.", new [] { "LeftToRightName" });
            }

            // LeftToRightName (string) minLength
            if (this.LeftToRightName != null && this.LeftToRightName.Length < 0)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for LeftToRightName, length must be greater than 0.", new [] { "LeftToRightName" });
            }

            // RightToLeftName (string) maxLength
            if (this.RightToLeftName != null && this.RightToLeftName.Length > 50)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for RightToLeftName, length must be less than 50.", new [] { "RightToLeftName" });
            }

            // RightToLeftName (string) minLength
            if (this.RightToLeftName != null && this.RightToLeftName.Length < 0)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for RightToLeftName, length must be greater than 0.", new [] { "RightToLeftName" });
            }

            yield break;
        }
    }

}
