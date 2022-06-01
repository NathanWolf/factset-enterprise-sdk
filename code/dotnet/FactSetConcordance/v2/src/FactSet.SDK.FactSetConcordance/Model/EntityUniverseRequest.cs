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
    /// EntityUniverseRequest
    /// </summary>
    [DataContract(Name = "EntityUniverseRequest")]
    public partial class EntityUniverseRequest : IEquatable<EntityUniverseRequest>, IValidatableObject
    {
        /// <summary>
        /// Defines MapStatus
        /// </summary>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum MapStatusEnum
        {
            /// <summary>
            /// Enum MAPPED for value: MAPPED
            /// </summary>
            [EnumMember(Value = "MAPPED")]
            MAPPED = 1,

            /// <summary>
            /// Enum UNMAPPED for value: UNMAPPED
            /// </summary>
            [EnumMember(Value = "UNMAPPED")]
            UNMAPPED = 2,

            /// <summary>
            /// Enum INDETERMINATE for value: INDETERMINATE
            /// </summary>
            [EnumMember(Value = "INDETERMINATE")]
            INDETERMINATE = 3

        }



        /// <summary>
        /// Filter by the EPeople Decisions that have the specified mapStatus, where -       * MAPPED - The requested Entity Name is successfully mapped to a FactSet Entity Id (-E)       * UNMAPPED - The requested Entity Name is unmapped by FactSet.       * INDETERMINATE - The requested Entity Name was unable to make a mapping. 
        /// </summary>
        /// <value>Filter by the EPeople Decisions that have the specified mapStatus, where -       * MAPPED - The requested Entity Name is successfully mapped to a FactSet Entity Id (-E)       * UNMAPPED - The requested Entity Name is unmapped by FactSet.       * INDETERMINATE - The requested Entity Name was unable to make a mapping. </value>
        [DataMember(Name = "mapStatus", EmitDefaultValue = false)]
        public List<MapStatusEnum> MapStatus { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="EntityUniverseRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected EntityUniverseRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="EntityUniverseRequest" /> class.
        /// </summary>
        /// <param name="universeId">the id of the universe that entities come from (required).</param>
        /// <param name="offset">starting row of the universe.</param>
        /// <param name="limit">Limits the number of records in the response..</param>
        /// <param name="mapStatus">Filter by the EPeople Decisions that have the specified mapStatus, where -       * MAPPED - The requested Entity Name is successfully mapped to a FactSet Entity Id (-E)       * UNMAPPED - The requested Entity Name is unmapped by FactSet.       * INDETERMINATE - The requested Entity Name was unable to make a mapping. .</param>
        /// <param name="clientId">fetch only the mappings that has client id included in the specified list..</param>
        public EntityUniverseRequest(int universeId = default(int), int offset = default(int), int limit = default(int), List<MapStatusEnum> mapStatus = default(List<MapStatusEnum>), List<string> clientId = default(List<string>))
        {
            this.UniverseId = universeId;
            this.Offset = offset;
            this.Limit = limit;
            this.MapStatus = mapStatus;
            this.ClientId = clientId;
        }

        /// <summary>
        /// the id of the universe that entities come from
        /// </summary>
        /// <value>the id of the universe that entities come from</value>
        [DataMember(Name = "universeId", IsRequired = true, EmitDefaultValue = false)]
        public int UniverseId { get; set; }

        /// <summary>
        /// starting row of the universe
        /// </summary>
        /// <value>starting row of the universe</value>
        [DataMember(Name = "offset", EmitDefaultValue = false)]
        public int Offset { get; set; }

        /// <summary>
        /// Limits the number of records in the response.
        /// </summary>
        /// <value>Limits the number of records in the response.</value>
        [DataMember(Name = "limit", EmitDefaultValue = false)]
        public int Limit { get; set; }

        /// <summary>
        /// fetch only the mappings that has client id included in the specified list.
        /// </summary>
        /// <value>fetch only the mappings that has client id included in the specified list.</value>
        [DataMember(Name = "clientId", EmitDefaultValue = false)]
        public List<string> ClientId { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class EntityUniverseRequest {\n");
            sb.Append("  UniverseId: ").Append(UniverseId).Append("\n");
            sb.Append("  Offset: ").Append(Offset).Append("\n");
            sb.Append("  Limit: ").Append(Limit).Append("\n");
            sb.Append("  MapStatus: ").Append(MapStatus).Append("\n");
            sb.Append("  ClientId: ").Append(ClientId).Append("\n");
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
            return this.Equals(input as EntityUniverseRequest);
        }

        /// <summary>
        /// Returns true if EntityUniverseRequest instances are equal
        /// </summary>
        /// <param name="input">Instance of EntityUniverseRequest to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(EntityUniverseRequest input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.UniverseId == input.UniverseId ||
                    this.UniverseId.Equals(input.UniverseId)
                ) && 
                (
                    this.Offset == input.Offset ||
                    this.Offset.Equals(input.Offset)
                ) && 
                (
                    this.Limit == input.Limit ||
                    this.Limit.Equals(input.Limit)
                ) && 
                (
                    this.MapStatus == input.MapStatus ||
                    this.MapStatus.SequenceEqual(input.MapStatus)
                ) && 
                (
                    this.ClientId == input.ClientId ||
                    this.ClientId != null &&
                    input.ClientId != null &&
                    this.ClientId.SequenceEqual(input.ClientId)
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
                hashCode = (hashCode * 59) + this.UniverseId.GetHashCode();
                hashCode = (hashCode * 59) + this.Offset.GetHashCode();
                hashCode = (hashCode * 59) + this.Limit.GetHashCode();
                hashCode = (hashCode * 59) + this.MapStatus.GetHashCode();
                if (this.ClientId != null)
                {
                    hashCode = (hashCode * 59) + this.ClientId.GetHashCode();
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
