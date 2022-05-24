/*
 * FactSet SCIM API
 *
 * FactSet's SCIM API implementation.
 *
 * The version of the OpenAPI document: 1.0.0
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
using OpenAPIDateConverter = FactSet.SDK.ProcuretoPaySCIM.Client.OpenAPIDateConverter;

namespace FactSet.SDK.ProcuretoPaySCIM.Model
{
    /// <summary>
    /// GroupResourceMeta
    /// </summary>
    [DataContract(Name = "GroupResource_meta")]
    public partial class GroupResourceMeta : IEquatable<GroupResourceMeta>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="GroupResourceMeta" /> class.
        /// </summary>
        /// <param name="resourceType">resourceType.</param>
        /// <param name="created">created.</param>
        /// <param name="lastModified">lastModified.</param>
        /// <param name="location">location.</param>
        public GroupResourceMeta(string resourceType = default(string), string created = default(string), string lastModified = default(string), string location = default(string))
        {
            this.ResourceType = resourceType;
            this.Created = created;
            this.LastModified = lastModified;
            this.Location = location;
        }

        /// <summary>
        /// Gets or Sets ResourceType
        /// </summary>
        [DataMember(Name = "resourceType", EmitDefaultValue = false)]
        public string ResourceType { get; set; }

        /// <summary>
        /// Gets or Sets Created
        /// </summary>
        [DataMember(Name = "created", EmitDefaultValue = false)]
        public string Created { get; set; }

        /// <summary>
        /// Gets or Sets LastModified
        /// </summary>
        [DataMember(Name = "lastModified", EmitDefaultValue = false)]
        public string LastModified { get; set; }

        /// <summary>
        /// Gets or Sets Location
        /// </summary>
        [DataMember(Name = "location", EmitDefaultValue = false)]
        public string Location { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class GroupResourceMeta {\n");
            sb.Append("  ResourceType: ").Append(ResourceType).Append("\n");
            sb.Append("  Created: ").Append(Created).Append("\n");
            sb.Append("  LastModified: ").Append(LastModified).Append("\n");
            sb.Append("  Location: ").Append(Location).Append("\n");
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
            return this.Equals(input as GroupResourceMeta);
        }

        /// <summary>
        /// Returns true if GroupResourceMeta instances are equal
        /// </summary>
        /// <param name="input">Instance of GroupResourceMeta to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(GroupResourceMeta input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.ResourceType == input.ResourceType ||
                    (this.ResourceType != null &&
                    this.ResourceType.Equals(input.ResourceType))
                ) && 
                (
                    this.Created == input.Created ||
                    (this.Created != null &&
                    this.Created.Equals(input.Created))
                ) && 
                (
                    this.LastModified == input.LastModified ||
                    (this.LastModified != null &&
                    this.LastModified.Equals(input.LastModified))
                ) && 
                (
                    this.Location == input.Location ||
                    (this.Location != null &&
                    this.Location.Equals(input.Location))
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
                if (this.ResourceType != null)
                {
                    hashCode = (hashCode * 59) + this.ResourceType.GetHashCode();
                }
                if (this.Created != null)
                {
                    hashCode = (hashCode * 59) + this.Created.GetHashCode();
                }
                if (this.LastModified != null)
                {
                    hashCode = (hashCode * 59) + this.LastModified.GetHashCode();
                }
                if (this.Location != null)
                {
                    hashCode = (hashCode * 59) + this.Location.GetHashCode();
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
