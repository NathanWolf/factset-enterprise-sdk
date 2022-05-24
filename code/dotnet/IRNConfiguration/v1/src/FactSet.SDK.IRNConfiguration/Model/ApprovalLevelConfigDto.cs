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
    /// ApprovalLevelConfigDto
    /// </summary>
    [DataContract(Name = "ApprovalLevelConfigDto")]
    public partial class ApprovalLevelConfigDto : IEquatable<ApprovalLevelConfigDto>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ApprovalLevelConfigDto" /> class.
        /// </summary>
        /// <param name="name">name.</param>
        /// <param name="approverIds">approverIds.</param>
        public ApprovalLevelConfigDto(string name = default(string), List<Guid> approverIds = default(List<Guid>))
        {
            this.Name = name;
            this.ApproverIds = approverIds;
        }

        /// <summary>
        /// Gets or Sets Name
        /// </summary>
        [DataMember(Name = "Name", EmitDefaultValue = true)]
        public string Name { get; set; }

        /// <summary>
        /// Gets or Sets ApproverIds
        /// </summary>
        [DataMember(Name = "ApproverIds", EmitDefaultValue = true)]
        public List<Guid> ApproverIds { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ApprovalLevelConfigDto {\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  ApproverIds: ").Append(ApproverIds).Append("\n");
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
            return this.Equals(input as ApprovalLevelConfigDto);
        }

        /// <summary>
        /// Returns true if ApprovalLevelConfigDto instances are equal
        /// </summary>
        /// <param name="input">Instance of ApprovalLevelConfigDto to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ApprovalLevelConfigDto input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Name == input.Name ||
                    (this.Name != null &&
                    this.Name.Equals(input.Name))
                ) && 
                (
                    this.ApproverIds == input.ApproverIds ||
                    this.ApproverIds != null &&
                    input.ApproverIds != null &&
                    this.ApproverIds.SequenceEqual(input.ApproverIds)
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
                if (this.Name != null)
                {
                    hashCode = (hashCode * 59) + this.Name.GetHashCode();
                }
                if (this.ApproverIds != null)
                {
                    hashCode = (hashCode * 59) + this.ApproverIds.GetHashCode();
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
