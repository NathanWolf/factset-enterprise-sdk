/*
 * FactSet Entity API
 *
 * Using an entity centric data model, FactSet's Entity API provides access to FactSet's complete security and entity level symbology, comprehensive entity reference data, and all of the necessary relationships and connections to create a foundation that tightly correlates disparate sources of information to a master entity identifier. Use this API to quickly understand the full entity structure and related securities. 
 *
 * The version of the OpenAPI document: 1.4.0
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
    /// EntityReferenceChi
    /// </summary>
    [DataContract(Name = "entityReferenceChi")]
    public partial class EntityReferenceChi : IEquatable<EntityReferenceChi>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="EntityReferenceChi" /> class.
        /// </summary>
        /// <param name="fsymId">Unique FactSet-generated identifier representing an entity for the current entity identifier (-E).</param>
        /// <param name="fsymEntityId">Unique FactSet-generated identifier representing an entity.</param>
        /// <param name="simplifiedChineseName">The entity name in Simplified Chinese..</param>
        /// <param name="traditionalChineseName">The entity name in Traditional Chinese..</param>
        /// <param name="entityProperName">Name that the entity is commonly referred to as, normalized and in proper case..</param>
        /// <param name="simplifiedChineseDescription">Extended business description for the requested entity in Simplified Chinese..</param>
        /// <param name="traditionalChineseDescription">Extended business description for the requested entity in Traditional Chinese..</param>
        /// <param name="requestId">Identifier used in \&quot;ids\&quot; parameter. When list of identifiers used, they will be parsed and resolved individually..</param>
        public EntityReferenceChi(string fsymId = default(string), string fsymEntityId = default(string), string simplifiedChineseName = default(string), string traditionalChineseName = default(string), string entityProperName = default(string), string simplifiedChineseDescription = default(string), string traditionalChineseDescription = default(string), string requestId = default(string))
        {
            this.FsymId = fsymId;
            this.FsymEntityId = fsymEntityId;
            this.SimplifiedChineseName = simplifiedChineseName;
            this.TraditionalChineseName = traditionalChineseName;
            this.EntityProperName = entityProperName;
            this.SimplifiedChineseDescription = simplifiedChineseDescription;
            this.TraditionalChineseDescription = traditionalChineseDescription;
            this.RequestId = requestId;
        }

        /// <summary>
        /// Unique FactSet-generated identifier representing an entity for the current entity identifier (-E)
        /// </summary>
        /// <value>Unique FactSet-generated identifier representing an entity for the current entity identifier (-E)</value>
        [DataMember(Name = "fsymId", EmitDefaultValue = true)]
        public string FsymId { get; set; }

        /// <summary>
        /// Unique FactSet-generated identifier representing an entity
        /// </summary>
        /// <value>Unique FactSet-generated identifier representing an entity</value>
        [DataMember(Name = "fsymEntityId", EmitDefaultValue = true)]
        public string FsymEntityId { get; set; }

        /// <summary>
        /// The entity name in Simplified Chinese.
        /// </summary>
        /// <value>The entity name in Simplified Chinese.</value>
        [DataMember(Name = "simplifiedChineseName", EmitDefaultValue = true)]
        public string SimplifiedChineseName { get; set; }

        /// <summary>
        /// The entity name in Traditional Chinese.
        /// </summary>
        /// <value>The entity name in Traditional Chinese.</value>
        [DataMember(Name = "traditionalChineseName", EmitDefaultValue = true)]
        public string TraditionalChineseName { get; set; }

        /// <summary>
        /// Name that the entity is commonly referred to as, normalized and in proper case.
        /// </summary>
        /// <value>Name that the entity is commonly referred to as, normalized and in proper case.</value>
        [DataMember(Name = "entityProperName", EmitDefaultValue = true)]
        public string EntityProperName { get; set; }

        /// <summary>
        /// Extended business description for the requested entity in Simplified Chinese.
        /// </summary>
        /// <value>Extended business description for the requested entity in Simplified Chinese.</value>
        [DataMember(Name = "simplifiedChineseDescription", EmitDefaultValue = true)]
        public string SimplifiedChineseDescription { get; set; }

        /// <summary>
        /// Extended business description for the requested entity in Traditional Chinese.
        /// </summary>
        /// <value>Extended business description for the requested entity in Traditional Chinese.</value>
        [DataMember(Name = "traditionalChineseDescription", EmitDefaultValue = true)]
        public string TraditionalChineseDescription { get; set; }

        /// <summary>
        /// Identifier used in \&quot;ids\&quot; parameter. When list of identifiers used, they will be parsed and resolved individually.
        /// </summary>
        /// <value>Identifier used in \&quot;ids\&quot; parameter. When list of identifiers used, they will be parsed and resolved individually.</value>
        [DataMember(Name = "requestId", EmitDefaultValue = false)]
        public string RequestId { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class EntityReferenceChi {\n");
            sb.Append("  FsymId: ").Append(FsymId).Append("\n");
            sb.Append("  FsymEntityId: ").Append(FsymEntityId).Append("\n");
            sb.Append("  SimplifiedChineseName: ").Append(SimplifiedChineseName).Append("\n");
            sb.Append("  TraditionalChineseName: ").Append(TraditionalChineseName).Append("\n");
            sb.Append("  EntityProperName: ").Append(EntityProperName).Append("\n");
            sb.Append("  SimplifiedChineseDescription: ").Append(SimplifiedChineseDescription).Append("\n");
            sb.Append("  TraditionalChineseDescription: ").Append(TraditionalChineseDescription).Append("\n");
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
            return this.Equals(input as EntityReferenceChi);
        }

        /// <summary>
        /// Returns true if EntityReferenceChi instances are equal
        /// </summary>
        /// <param name="input">Instance of EntityReferenceChi to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(EntityReferenceChi input)
        {
            if (input == null)
            {
                return false;
            }
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
                    this.SimplifiedChineseName == input.SimplifiedChineseName ||
                    (this.SimplifiedChineseName != null &&
                    this.SimplifiedChineseName.Equals(input.SimplifiedChineseName))
                ) && 
                (
                    this.TraditionalChineseName == input.TraditionalChineseName ||
                    (this.TraditionalChineseName != null &&
                    this.TraditionalChineseName.Equals(input.TraditionalChineseName))
                ) && 
                (
                    this.EntityProperName == input.EntityProperName ||
                    (this.EntityProperName != null &&
                    this.EntityProperName.Equals(input.EntityProperName))
                ) && 
                (
                    this.SimplifiedChineseDescription == input.SimplifiedChineseDescription ||
                    (this.SimplifiedChineseDescription != null &&
                    this.SimplifiedChineseDescription.Equals(input.SimplifiedChineseDescription))
                ) && 
                (
                    this.TraditionalChineseDescription == input.TraditionalChineseDescription ||
                    (this.TraditionalChineseDescription != null &&
                    this.TraditionalChineseDescription.Equals(input.TraditionalChineseDescription))
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
                {
                    hashCode = (hashCode * 59) + this.FsymId.GetHashCode();
                }
                if (this.FsymEntityId != null)
                {
                    hashCode = (hashCode * 59) + this.FsymEntityId.GetHashCode();
                }
                if (this.SimplifiedChineseName != null)
                {
                    hashCode = (hashCode * 59) + this.SimplifiedChineseName.GetHashCode();
                }
                if (this.TraditionalChineseName != null)
                {
                    hashCode = (hashCode * 59) + this.TraditionalChineseName.GetHashCode();
                }
                if (this.EntityProperName != null)
                {
                    hashCode = (hashCode * 59) + this.EntityProperName.GetHashCode();
                }
                if (this.SimplifiedChineseDescription != null)
                {
                    hashCode = (hashCode * 59) + this.SimplifiedChineseDescription.GetHashCode();
                }
                if (this.TraditionalChineseDescription != null)
                {
                    hashCode = (hashCode * 59) + this.TraditionalChineseDescription.GetHashCode();
                }
                if (this.RequestId != null)
                {
                    hashCode = (hashCode * 59) + this.RequestId.GetHashCode();
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
