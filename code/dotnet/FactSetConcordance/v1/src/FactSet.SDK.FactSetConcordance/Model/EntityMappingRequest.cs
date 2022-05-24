/*
 * FactSet Concordance API
 *
 * The FactSet Concordance API provides the ability to programmatically look up several types of entities by their name and other attributes. It attempts to match attributes that you supply for the entity and returns as many match candidates as it can find. The result is a \"concorded\" FactSet Entity Permanent identifier.  The Entity Identifier can then be used as input throughout FactSet's Content soultions, such as Content APIs and Standard DataFeeds.<p> There are types of workflows supported in the API. The first workflow type follows traditional API conventions in that a request is accepted and a response is returned synchronously. The second workflow type involves a background task. With this workflow, a task is created for uploading a set of queries, and then the client polls for the task to complete. Once the task has completed, the client retrieves the concordance results throught the decisions endpoint.</p> 
 *
 * The version of the OpenAPI document: 1.1.0
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
    /// EntityMappingRequest
    /// </summary>
    [DataContract(Name = "EntityMappingRequest")]
    public partial class EntityMappingRequest : IEquatable<EntityMappingRequest>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="EntityMappingRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected EntityMappingRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="EntityMappingRequest" /> class.
        /// </summary>
        /// <param name="clientId">A unique identifier supplied by the user. ClientId is saved to the user&#39;s Concordance universe and will be used as the identifier for that entity within the universe. (required).</param>
        /// <param name="entityId">FactSet Entity Identifier mapped to the submitted entity..</param>
        /// <param name="clientName">Name of entity to match. (required).</param>
        /// <param name="clientCountry">ISO2 country code corresponding to the Entity name..</param>
        /// <param name="clientState">ISO Code of State or Province location to map Entity..</param>
        /// <param name="clientUrl">URL corresponding to the entity name..</param>
        public EntityMappingRequest(string clientId = default(string), string entityId = default(string), string clientName = default(string), string clientCountry = default(string), string clientState = default(string), string clientUrl = default(string))
        {
            // to ensure "clientId" is required (not null)
            if (clientId == null) {
                throw new ArgumentNullException("clientId is a required property for EntityMappingRequest and cannot be null");
            }
            this.ClientId = clientId;
            // to ensure "clientName" is required (not null)
            if (clientName == null) {
                throw new ArgumentNullException("clientName is a required property for EntityMappingRequest and cannot be null");
            }
            this.ClientName = clientName;
            this.EntityId = entityId;
            this.ClientCountry = clientCountry;
            this.ClientState = clientState;
            this.ClientUrl = clientUrl;
        }

        /// <summary>
        /// A unique identifier supplied by the user. ClientId is saved to the user&#39;s Concordance universe and will be used as the identifier for that entity within the universe.
        /// </summary>
        /// <value>A unique identifier supplied by the user. ClientId is saved to the user&#39;s Concordance universe and will be used as the identifier for that entity within the universe.</value>
        [DataMember(Name = "clientId", IsRequired = true, EmitDefaultValue = false)]
        public string ClientId { get; set; }

        /// <summary>
        /// FactSet Entity Identifier mapped to the submitted entity.
        /// </summary>
        /// <value>FactSet Entity Identifier mapped to the submitted entity.</value>
        [DataMember(Name = "entityId", EmitDefaultValue = false)]
        public string EntityId { get; set; }

        /// <summary>
        /// Name of entity to match.
        /// </summary>
        /// <value>Name of entity to match.</value>
        [DataMember(Name = "clientName", IsRequired = true, EmitDefaultValue = false)]
        public string ClientName { get; set; }

        /// <summary>
        /// ISO2 country code corresponding to the Entity name.
        /// </summary>
        /// <value>ISO2 country code corresponding to the Entity name.</value>
        [DataMember(Name = "clientCountry", EmitDefaultValue = false)]
        public string ClientCountry { get; set; }

        /// <summary>
        /// ISO Code of State or Province location to map Entity.
        /// </summary>
        /// <value>ISO Code of State or Province location to map Entity.</value>
        [DataMember(Name = "clientState", EmitDefaultValue = false)]
        public string ClientState { get; set; }

        /// <summary>
        /// URL corresponding to the entity name.
        /// </summary>
        /// <value>URL corresponding to the entity name.</value>
        [DataMember(Name = "clientUrl", EmitDefaultValue = false)]
        public string ClientUrl { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class EntityMappingRequest {\n");
            sb.Append("  ClientId: ").Append(ClientId).Append("\n");
            sb.Append("  EntityId: ").Append(EntityId).Append("\n");
            sb.Append("  ClientName: ").Append(ClientName).Append("\n");
            sb.Append("  ClientCountry: ").Append(ClientCountry).Append("\n");
            sb.Append("  ClientState: ").Append(ClientState).Append("\n");
            sb.Append("  ClientUrl: ").Append(ClientUrl).Append("\n");
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
            return this.Equals(input as EntityMappingRequest);
        }

        /// <summary>
        /// Returns true if EntityMappingRequest instances are equal
        /// </summary>
        /// <param name="input">Instance of EntityMappingRequest to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(EntityMappingRequest input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.ClientId == input.ClientId ||
                    (this.ClientId != null &&
                    this.ClientId.Equals(input.ClientId))
                ) && 
                (
                    this.EntityId == input.EntityId ||
                    (this.EntityId != null &&
                    this.EntityId.Equals(input.EntityId))
                ) && 
                (
                    this.ClientName == input.ClientName ||
                    (this.ClientName != null &&
                    this.ClientName.Equals(input.ClientName))
                ) && 
                (
                    this.ClientCountry == input.ClientCountry ||
                    (this.ClientCountry != null &&
                    this.ClientCountry.Equals(input.ClientCountry))
                ) && 
                (
                    this.ClientState == input.ClientState ||
                    (this.ClientState != null &&
                    this.ClientState.Equals(input.ClientState))
                ) && 
                (
                    this.ClientUrl == input.ClientUrl ||
                    (this.ClientUrl != null &&
                    this.ClientUrl.Equals(input.ClientUrl))
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
                if (this.ClientId != null)
                {
                    hashCode = (hashCode * 59) + this.ClientId.GetHashCode();
                }
                if (this.EntityId != null)
                {
                    hashCode = (hashCode * 59) + this.EntityId.GetHashCode();
                }
                if (this.ClientName != null)
                {
                    hashCode = (hashCode * 59) + this.ClientName.GetHashCode();
                }
                if (this.ClientCountry != null)
                {
                    hashCode = (hashCode * 59) + this.ClientCountry.GetHashCode();
                }
                if (this.ClientState != null)
                {
                    hashCode = (hashCode * 59) + this.ClientState.GetHashCode();
                }
                if (this.ClientUrl != null)
                {
                    hashCode = (hashCode * 59) + this.ClientUrl.GetHashCode();
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
            // ClientCountry (string) maxLength
            if (this.ClientCountry != null && this.ClientCountry.Length > 2)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for ClientCountry, length must be less than 2.", new [] { "ClientCountry" });
            }

            // ClientCountry (string) minLength
            if (this.ClientCountry != null && this.ClientCountry.Length < 2)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for ClientCountry, length must be greater than 2.", new [] { "ClientCountry" });
            }

            // ClientState (string) maxLength
            if (this.ClientState != null && this.ClientState.Length > 2)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for ClientState, length must be less than 2.", new [] { "ClientState" });
            }

            // ClientState (string) minLength
            if (this.ClientState != null && this.ClientState.Length < 2)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for ClientState, length must be greater than 2.", new [] { "ClientState" });
            }

            yield break;
        }
    }

}
