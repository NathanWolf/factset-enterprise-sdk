/*
 * FactSet Entity API
 *
 * Using an entity centric data model, FactSet's Entity API provides access to FactSet's complete security and entity level symbology, comprehensive entity reference data, and all of the necessary relationships and connections to create a foundation that tightly correlates disparate sources of information to a master entity identifier. Use this API to quickly understand the full entity structure and related securities. 
 *
 * The version of the OpenAPI document: 1.2.0
 * Contact: api@factset.com
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
using OpenAPIDateConverter = FactSet.SDK.FactSetEntity.Client.OpenAPIDateConverter;

namespace FactSet.SDK.FactSetEntity.Model
{
    /// <summary>
    /// UtlimateEntityStructure
    /// </summary>
    [DataContract(Name = "utlimateEntityStructure")]
    public partial class UtlimateEntityStructure : IEquatable<UtlimateEntityStructure>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="UtlimateEntityStructure" /> class.
        /// </summary>
        /// <param name="fsymId">Unique FactSet-generated identifier representing an entity for the current entity identifier (-E).</param>
        /// <param name="fsymEntityId">Unique FactSet-generated identifier representing an entity.</param>
        /// <param name="ultimateParentId">The ultimate parent id of the entity..</param>
        /// <param name="parentEntityId">Within the hierarchy, this id represents the immediate parent entity id for the level directly above. Ultimate parent id will return a blank string..</param>
        /// <param name="level">Level within the ultimate entity structure. This is taken from the perspective of the ultimate parent id and the full entity hierarchy..</param>
        /// <param name="inactive">A flag for inactive securities; whereby 1 &#x3D; inactive and 0 &#x3D; active..</param>
        /// <param name="description">The proper name and entity type for the entity..</param>
        /// <param name="requestId">Identifier used in &#x60;ids&#x60;..</param>
        public UtlimateEntityStructure(string fsymId = default(string), string fsymEntityId = default(string), string ultimateParentId = default(string), string parentEntityId = default(string), int level = default(int), int inactive = default(int), string description = default(string), string requestId = default(string))
        {
            this.FsymId = fsymId;
            this.FsymEntityId = fsymEntityId;
            this.UltimateParentId = ultimateParentId;
            this.ParentEntityId = parentEntityId;
            this.Level = level;
            this.Inactive = inactive;
            this.Description = description;
            this.RequestId = requestId;
        }

        /// <summary>
        /// Unique FactSet-generated identifier representing an entity for the current entity identifier (-E)
        /// </summary>
        /// <value>Unique FactSet-generated identifier representing an entity for the current entity identifier (-E)</value>
        [DataMember(Name = "fsymId", EmitDefaultValue = false)]
        public string FsymId { get; set; }

        /// <summary>
        /// Unique FactSet-generated identifier representing an entity
        /// </summary>
        /// <value>Unique FactSet-generated identifier representing an entity</value>
        [DataMember(Name = "fsymEntityId", EmitDefaultValue = false)]
        public string FsymEntityId { get; set; }

        /// <summary>
        /// The ultimate parent id of the entity.
        /// </summary>
        /// <value>The ultimate parent id of the entity.</value>
        [DataMember(Name = "ultimateParentId", EmitDefaultValue = false)]
        public string UltimateParentId { get; set; }

        /// <summary>
        /// Within the hierarchy, this id represents the immediate parent entity id for the level directly above. Ultimate parent id will return a blank string.
        /// </summary>
        /// <value>Within the hierarchy, this id represents the immediate parent entity id for the level directly above. Ultimate parent id will return a blank string.</value>
        [DataMember(Name = "parentEntityId", EmitDefaultValue = false)]
        public string ParentEntityId { get; set; }

        /// <summary>
        /// Level within the ultimate entity structure. This is taken from the perspective of the ultimate parent id and the full entity hierarchy.
        /// </summary>
        /// <value>Level within the ultimate entity structure. This is taken from the perspective of the ultimate parent id and the full entity hierarchy.</value>
        [DataMember(Name = "level", EmitDefaultValue = false)]
        public int Level { get; set; }

        /// <summary>
        /// A flag for inactive securities; whereby 1 &#x3D; inactive and 0 &#x3D; active.
        /// </summary>
        /// <value>A flag for inactive securities; whereby 1 &#x3D; inactive and 0 &#x3D; active.</value>
        [DataMember(Name = "inactive", EmitDefaultValue = false)]
        public int Inactive { get; set; }

        /// <summary>
        /// The proper name and entity type for the entity.
        /// </summary>
        /// <value>The proper name and entity type for the entity.</value>
        [DataMember(Name = "description", EmitDefaultValue = false)]
        public string Description { get; set; }

        /// <summary>
        /// Identifier used in &#x60;ids&#x60;.
        /// </summary>
        /// <value>Identifier used in &#x60;ids&#x60;.</value>
        [DataMember(Name = "requestId", EmitDefaultValue = false)]
        public string RequestId { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class UtlimateEntityStructure {\n");
            sb.Append("  FsymId: ").Append(FsymId).Append("\n");
            sb.Append("  FsymEntityId: ").Append(FsymEntityId).Append("\n");
            sb.Append("  UltimateParentId: ").Append(UltimateParentId).Append("\n");
            sb.Append("  ParentEntityId: ").Append(ParentEntityId).Append("\n");
            sb.Append("  Level: ").Append(Level).Append("\n");
            sb.Append("  Inactive: ").Append(Inactive).Append("\n");
            sb.Append("  Description: ").Append(Description).Append("\n");
            sb.Append("  RequestId: ").Append(RequestId).Append("\n");
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
            return this.Equals(input as UtlimateEntityStructure);
        }

        /// <summary>
        /// Returns true if UtlimateEntityStructure instances are equal
        /// </summary>
        /// <param name="input">Instance of UtlimateEntityStructure to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(UtlimateEntityStructure input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.FsymId == input.FsymId ||
                    (this.FsymId != null &&
                    this.FsymId.Equals(input.FsymId))
                ) && 
                (
                    this.FsymEntityId == input.FsymEntityId ||
                    (this.FsymEntityId != null &&
                    this.FsymEntityId.Equals(input.FsymEntityId))
                ) && 
                (
                    this.UltimateParentId == input.UltimateParentId ||
                    (this.UltimateParentId != null &&
                    this.UltimateParentId.Equals(input.UltimateParentId))
                ) && 
                (
                    this.ParentEntityId == input.ParentEntityId ||
                    (this.ParentEntityId != null &&
                    this.ParentEntityId.Equals(input.ParentEntityId))
                ) && 
                (
                    this.Level == input.Level ||
                    this.Level.Equals(input.Level)
                ) && 
                (
                    this.Inactive == input.Inactive ||
                    this.Inactive.Equals(input.Inactive)
                ) && 
                (
                    this.Description == input.Description ||
                    (this.Description != null &&
                    this.Description.Equals(input.Description))
                ) && 
                (
                    this.RequestId == input.RequestId ||
                    (this.RequestId != null &&
                    this.RequestId.Equals(input.RequestId))
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
                if (this.FsymId != null)
                    hashCode = hashCode * 59 + this.FsymId.GetHashCode();
                if (this.FsymEntityId != null)
                    hashCode = hashCode * 59 + this.FsymEntityId.GetHashCode();
                if (this.UltimateParentId != null)
                    hashCode = hashCode * 59 + this.UltimateParentId.GetHashCode();
                if (this.ParentEntityId != null)
                    hashCode = hashCode * 59 + this.ParentEntityId.GetHashCode();
                hashCode = hashCode * 59 + this.Level.GetHashCode();
                hashCode = hashCode * 59 + this.Inactive.GetHashCode();
                if (this.Description != null)
                    hashCode = hashCode * 59 + this.Description.GetHashCode();
                if (this.RequestId != null)
                    hashCode = hashCode * 59 + this.RequestId.GetHashCode();
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
