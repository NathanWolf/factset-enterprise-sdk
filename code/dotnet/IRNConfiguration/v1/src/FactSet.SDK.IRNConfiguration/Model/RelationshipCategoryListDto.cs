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
    /// RelationshipCategoryListDto
    /// </summary>
    [DataContract(Name = "RelationshipCategoryListDto")]
    public partial class RelationshipCategoryListDto : IEquatable<RelationshipCategoryListDto>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="RelationshipCategoryListDto" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected RelationshipCategoryListDto() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="RelationshipCategoryListDto" /> class.
        /// </summary>
        /// <param name="ids">ids (required).</param>
        public RelationshipCategoryListDto(List<Guid> ids)
        {
            // to ensure "ids" is required (not null)
            if (ids == null) {
                throw new ArgumentNullException("ids is a required property for RelationshipCategoryListDto and cannot be null");
            }
            this.Ids = ids;
        }

        /// <summary>
        /// Gets or Sets Ids
        /// </summary>
        [DataMember(Name = "ids", IsRequired = true, EmitDefaultValue = false)]
        public List<Guid> Ids { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class RelationshipCategoryListDto {\n");
            sb.Append("  Ids: ").Append(Ids).Append("\n");
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
            return this.Equals(input as RelationshipCategoryListDto);
        }

        /// <summary>
        /// Returns true if RelationshipCategoryListDto instances are equal
        /// </summary>
        /// <param name="input">Instance of RelationshipCategoryListDto to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(RelationshipCategoryListDto input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Ids == input.Ids ||
                    this.Ids != null &&
                    input.Ids != null &&
                    this.Ids.SequenceEqual(input.Ids)
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
                if (this.Ids != null)
                {
                    hashCode = (hashCode * 59) + this.Ids.GetHashCode();
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
