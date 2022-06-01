/*
 * FactSet Concordance API
 *
 * The FactSet Concordance API provides the ability to programmatically look up several types of entities by their name and other attributes. It attempts to match attributes that you supply for the entity and returns as many match candidates as it can find. The result is a \"concorded\" FactSet Entity Permanent identifier.  The Entity Identifier can then be used as input throughout FactSet's Content soultions, such as Content APIs and Standard DataFeeds.<p> There are two types of workflows supported in the API. The first workflow type follows traditional API conventions in that a request is accepted and a response is returned synchronously. The second workflow type involves a background task. With this workflow, a task is created for uploading a set of queries, and then the client polls for the task to complete. Once the task has completed, the client retrieves the concordance results throught the decisions endpoint.</p> 
 *
 * The version of the OpenAPI document: 2.0.0
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
using OpenAPIDateConverter = FactSet.SDK.FactSetConcordance.Client.OpenAPIDateConverter;

namespace FactSet.SDK.FactSetConcordance.Model
{
    /// <summary>
    /// Metadata about a single universe
    /// </summary>
    [DataContract(Name = "Universe")]
    public partial class Universe : IEquatable<Universe>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="Universe" /> class.
        /// </summary>
        /// <param name="universeId">The universe identifier.</param>
        /// <param name="universeName">The user specified universe name.</param>
        /// <param name="universeDescription">The user specified universe description.</param>
        /// <param name="universeType">The user specified universe entity..</param>
        /// <param name="selfManaged">False if the universe is managed by FactSet Managed Service, True otherwise.</param>
        /// <param name="createdBy">The user who created the universe.</param>
        /// <param name="createdOn">When the universe was created.</param>
        /// <param name="updatedBy">The user who most recently updated the universe metadata.</param>
        /// <param name="updatedOn">When the universe metadata was most recently updated.</param>
        public Universe(int? universeId = default(int?), string universeName = default(string), string universeDescription = default(string), string universeType = default(string), bool? selfManaged = default(bool?), string createdBy = default(string), DateTime? createdOn = default(DateTime?), string updatedBy = default(string), DateTime? updatedOn = default(DateTime?))
        {
            this.UniverseId = universeId;
            this.UniverseName = universeName;
            this.UniverseDescription = universeDescription;
            this.UniverseType = universeType;
            this.SelfManaged = selfManaged;
            this.CreatedBy = createdBy;
            this.CreatedOn = createdOn;
            this.UpdatedBy = updatedBy;
            this.UpdatedOn = updatedOn;
        }

        /// <summary>
        /// The universe identifier
        /// </summary>
        /// <value>The universe identifier</value>
        [DataMember(Name = "universeId", EmitDefaultValue = true)]
        public int? UniverseId { get; set; }

        /// <summary>
        /// The user specified universe name
        /// </summary>
        /// <value>The user specified universe name</value>
        [DataMember(Name = "universeName", EmitDefaultValue = true)]
        public string UniverseName { get; set; }

        /// <summary>
        /// The user specified universe description
        /// </summary>
        /// <value>The user specified universe description</value>
        [DataMember(Name = "universeDescription", EmitDefaultValue = true)]
        public string UniverseDescription { get; set; }

        /// <summary>
        /// The user specified universe entity.
        /// </summary>
        /// <value>The user specified universe entity.</value>
        [DataMember(Name = "universeType", EmitDefaultValue = true)]
        public string UniverseType { get; set; }

        /// <summary>
        /// False if the universe is managed by FactSet Managed Service, True otherwise
        /// </summary>
        /// <value>False if the universe is managed by FactSet Managed Service, True otherwise</value>
        [DataMember(Name = "selfManaged", EmitDefaultValue = true)]
        public bool? SelfManaged { get; set; }

        /// <summary>
        /// The user who created the universe
        /// </summary>
        /// <value>The user who created the universe</value>
        [DataMember(Name = "createdBy", EmitDefaultValue = true)]
        public string CreatedBy { get; set; }

        /// <summary>
        /// When the universe was created
        /// </summary>
        /// <value>When the universe was created</value>
        [DataMember(Name = "createdOn", EmitDefaultValue = true)]
        public DateTime? CreatedOn { get; set; }

        /// <summary>
        /// The user who most recently updated the universe metadata
        /// </summary>
        /// <value>The user who most recently updated the universe metadata</value>
        [DataMember(Name = "updatedBy", EmitDefaultValue = true)]
        public string UpdatedBy { get; set; }

        /// <summary>
        /// When the universe metadata was most recently updated
        /// </summary>
        /// <value>When the universe metadata was most recently updated</value>
        [DataMember(Name = "updatedOn", EmitDefaultValue = true)]
        public DateTime? UpdatedOn { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class Universe {\n");
            sb.Append("  UniverseId: ").Append(UniverseId).Append("\n");
            sb.Append("  UniverseName: ").Append(UniverseName).Append("\n");
            sb.Append("  UniverseDescription: ").Append(UniverseDescription).Append("\n");
            sb.Append("  UniverseType: ").Append(UniverseType).Append("\n");
            sb.Append("  SelfManaged: ").Append(SelfManaged).Append("\n");
            sb.Append("  CreatedBy: ").Append(CreatedBy).Append("\n");
            sb.Append("  CreatedOn: ").Append(CreatedOn).Append("\n");
            sb.Append("  UpdatedBy: ").Append(UpdatedBy).Append("\n");
            sb.Append("  UpdatedOn: ").Append(UpdatedOn).Append("\n");
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
            return this.Equals(input as Universe);
        }

        /// <summary>
        /// Returns true if Universe instances are equal
        /// </summary>
        /// <param name="input">Instance of Universe to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Universe input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.UniverseId == input.UniverseId ||
                    (this.UniverseId != null &&
                    this.UniverseId.Equals(input.UniverseId))
                ) && 
                (
                    this.UniverseName == input.UniverseName ||
                    (this.UniverseName != null &&
                    this.UniverseName.Equals(input.UniverseName))
                ) && 
                (
                    this.UniverseDescription == input.UniverseDescription ||
                    (this.UniverseDescription != null &&
                    this.UniverseDescription.Equals(input.UniverseDescription))
                ) && 
                (
                    this.UniverseType == input.UniverseType ||
                    (this.UniverseType != null &&
                    this.UniverseType.Equals(input.UniverseType))
                ) && 
                (
                    this.SelfManaged == input.SelfManaged ||
                    (this.SelfManaged != null &&
                    this.SelfManaged.Equals(input.SelfManaged))
                ) && 
                (
                    this.CreatedBy == input.CreatedBy ||
                    (this.CreatedBy != null &&
                    this.CreatedBy.Equals(input.CreatedBy))
                ) && 
                (
                    this.CreatedOn == input.CreatedOn ||
                    (this.CreatedOn != null &&
                    this.CreatedOn.Equals(input.CreatedOn))
                ) && 
                (
                    this.UpdatedBy == input.UpdatedBy ||
                    (this.UpdatedBy != null &&
                    this.UpdatedBy.Equals(input.UpdatedBy))
                ) && 
                (
                    this.UpdatedOn == input.UpdatedOn ||
                    (this.UpdatedOn != null &&
                    this.UpdatedOn.Equals(input.UpdatedOn))
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
                if (this.UniverseId != null)
                {
                    hashCode = (hashCode * 59) + this.UniverseId.GetHashCode();
                }
                if (this.UniverseName != null)
                {
                    hashCode = (hashCode * 59) + this.UniverseName.GetHashCode();
                }
                if (this.UniverseDescription != null)
                {
                    hashCode = (hashCode * 59) + this.UniverseDescription.GetHashCode();
                }
                if (this.UniverseType != null)
                {
                    hashCode = (hashCode * 59) + this.UniverseType.GetHashCode();
                }
                if (this.SelfManaged != null)
                {
                    hashCode = (hashCode * 59) + this.SelfManaged.GetHashCode();
                }
                if (this.CreatedBy != null)
                {
                    hashCode = (hashCode * 59) + this.CreatedBy.GetHashCode();
                }
                if (this.CreatedOn != null)
                {
                    hashCode = (hashCode * 59) + this.CreatedOn.GetHashCode();
                }
                if (this.UpdatedBy != null)
                {
                    hashCode = (hashCode * 59) + this.UpdatedBy.GetHashCode();
                }
                if (this.UpdatedOn != null)
                {
                    hashCode = (hashCode * 59) + this.UpdatedOn.GetHashCode();
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
