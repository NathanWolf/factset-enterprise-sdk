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
    /// Concordance People Mapping object. Shows the mapping detail related to user&#39;s universe. 
    /// </summary>
    [DataContract(Name = "PeopleMapping")]
    public partial class PeopleMapping : IEquatable<PeopleMapping>, IValidatableObject
    {
        /// <summary>
        /// Current status of the people mapping.
        /// </summary>
        /// <value>Current status of the people mapping.</value>
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
        /// Current status of the people mapping.
        /// </summary>
        /// <value>Current status of the people mapping.</value>
        [DataMember(Name = "mapStatus", EmitDefaultValue = true)]
        public MapStatusEnum? MapStatus { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="PeopleMapping" /> class.
        /// </summary>
        /// <param name="clientEntity">It describes the name of the company.</param>
        /// <param name="clientFirstName">It indicates the full name of the client..</param>
        /// <param name="clientId">User-defined unique identifier provided by the user in the request.</param>
        /// <param name="clientLastName">It indicates last name of the client..</param>
        /// <param name="clientMiddleName">It indicates middle name of the client..</param>
        /// <param name="clientPersonName">It indiactes the name of the client.</param>
        /// <param name="clientPriority">It indiactes the priority value of the client..</param>
        /// <param name="clientSalutation">It indicates the client&#39;s salutation..</param>
        /// <param name="clientSuffix">It indicates the suffix for the client..</param>
        /// <param name="createdTime">It indicates the time of the creation.</param>
        /// <param name="mapStatus">Current status of the people mapping..</param>
        /// <param name="personId">Helps to identify a person by using an unique indiactor .</param>
        /// <param name="personName">It indiactes the full name of the client.</param>
        /// <param name="universeId">The universe this mapping belongs to. Only set in v2 endpoints .</param>
        /// <param name="updatedTime">It indicates the time of the updation.</param>
        public PeopleMapping(string clientEntity = default(string), string clientFirstName = default(string), string clientId = default(string), string clientLastName = default(string), string clientMiddleName = default(string), string clientPersonName = default(string), string clientPriority = default(string), string clientSalutation = default(string), string clientSuffix = default(string), DateTime? createdTime = default(DateTime?), MapStatusEnum? mapStatus = default(MapStatusEnum?), string personId = default(string), string personName = default(string), int? universeId = default(int?), DateTime? updatedTime = default(DateTime?))
        {
            this.ClientEntity = clientEntity;
            this.ClientFirstName = clientFirstName;
            this.ClientId = clientId;
            this.ClientLastName = clientLastName;
            this.ClientMiddleName = clientMiddleName;
            this.ClientPersonName = clientPersonName;
            this.ClientPriority = clientPriority;
            this.ClientSalutation = clientSalutation;
            this.ClientSuffix = clientSuffix;
            this.CreatedTime = createdTime;
            this.MapStatus = mapStatus;
            this.PersonId = personId;
            this.PersonName = personName;
            this.UniverseId = universeId;
            this.UpdatedTime = updatedTime;
        }

        /// <summary>
        /// It describes the name of the company
        /// </summary>
        /// <value>It describes the name of the company</value>
        [DataMember(Name = "clientEntity", EmitDefaultValue = true)]
        public string ClientEntity { get; set; }

        /// <summary>
        /// It indicates the full name of the client.
        /// </summary>
        /// <value>It indicates the full name of the client.</value>
        [DataMember(Name = "clientFirstName", EmitDefaultValue = true)]
        public string ClientFirstName { get; set; }

        /// <summary>
        /// User-defined unique identifier provided by the user in the request
        /// </summary>
        /// <value>User-defined unique identifier provided by the user in the request</value>
        [DataMember(Name = "clientId", EmitDefaultValue = true)]
        public string ClientId { get; set; }

        /// <summary>
        /// It indicates last name of the client.
        /// </summary>
        /// <value>It indicates last name of the client.</value>
        [DataMember(Name = "clientLastName", EmitDefaultValue = true)]
        public string ClientLastName { get; set; }

        /// <summary>
        /// It indicates middle name of the client.
        /// </summary>
        /// <value>It indicates middle name of the client.</value>
        [DataMember(Name = "clientMiddleName", EmitDefaultValue = true)]
        public string ClientMiddleName { get; set; }

        /// <summary>
        /// It indiactes the name of the client
        /// </summary>
        /// <value>It indiactes the name of the client</value>
        [DataMember(Name = "clientPersonName", EmitDefaultValue = true)]
        public string ClientPersonName { get; set; }

        /// <summary>
        /// It indiactes the priority value of the client.
        /// </summary>
        /// <value>It indiactes the priority value of the client.</value>
        [DataMember(Name = "clientPriority", EmitDefaultValue = true)]
        public string ClientPriority { get; set; }

        /// <summary>
        /// It indicates the client&#39;s salutation.
        /// </summary>
        /// <value>It indicates the client&#39;s salutation.</value>
        [DataMember(Name = "clientSalutation", EmitDefaultValue = true)]
        public string ClientSalutation { get; set; }

        /// <summary>
        /// It indicates the suffix for the client.
        /// </summary>
        /// <value>It indicates the suffix for the client.</value>
        [DataMember(Name = "clientSuffix", EmitDefaultValue = true)]
        public string ClientSuffix { get; set; }

        /// <summary>
        /// It indicates the time of the creation
        /// </summary>
        /// <value>It indicates the time of the creation</value>
        [DataMember(Name = "createdTime", EmitDefaultValue = true)]
        public DateTime? CreatedTime { get; set; }

        /// <summary>
        /// Helps to identify a person by using an unique indiactor 
        /// </summary>
        /// <value>Helps to identify a person by using an unique indiactor </value>
        [DataMember(Name = "personId", EmitDefaultValue = true)]
        public string PersonId { get; set; }

        /// <summary>
        /// It indiactes the full name of the client
        /// </summary>
        /// <value>It indiactes the full name of the client</value>
        [DataMember(Name = "personName", EmitDefaultValue = true)]
        public string PersonName { get; set; }

        /// <summary>
        /// The universe this mapping belongs to. Only set in v2 endpoints 
        /// </summary>
        /// <value>The universe this mapping belongs to. Only set in v2 endpoints </value>
        [DataMember(Name = "universeId", EmitDefaultValue = true)]
        public int? UniverseId { get; set; }

        /// <summary>
        /// It indicates the time of the updation
        /// </summary>
        /// <value>It indicates the time of the updation</value>
        [DataMember(Name = "updatedTime", EmitDefaultValue = true)]
        public DateTime? UpdatedTime { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class PeopleMapping {\n");
            sb.Append("  ClientEntity: ").Append(ClientEntity).Append("\n");
            sb.Append("  ClientFirstName: ").Append(ClientFirstName).Append("\n");
            sb.Append("  ClientId: ").Append(ClientId).Append("\n");
            sb.Append("  ClientLastName: ").Append(ClientLastName).Append("\n");
            sb.Append("  ClientMiddleName: ").Append(ClientMiddleName).Append("\n");
            sb.Append("  ClientPersonName: ").Append(ClientPersonName).Append("\n");
            sb.Append("  ClientPriority: ").Append(ClientPriority).Append("\n");
            sb.Append("  ClientSalutation: ").Append(ClientSalutation).Append("\n");
            sb.Append("  ClientSuffix: ").Append(ClientSuffix).Append("\n");
            sb.Append("  CreatedTime: ").Append(CreatedTime).Append("\n");
            sb.Append("  MapStatus: ").Append(MapStatus).Append("\n");
            sb.Append("  PersonId: ").Append(PersonId).Append("\n");
            sb.Append("  PersonName: ").Append(PersonName).Append("\n");
            sb.Append("  UniverseId: ").Append(UniverseId).Append("\n");
            sb.Append("  UpdatedTime: ").Append(UpdatedTime).Append("\n");
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
            return this.Equals(input as PeopleMapping);
        }

        /// <summary>
        /// Returns true if PeopleMapping instances are equal
        /// </summary>
        /// <param name="input">Instance of PeopleMapping to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PeopleMapping input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.ClientEntity == input.ClientEntity ||
                    (this.ClientEntity != null &&
                    this.ClientEntity.Equals(input.ClientEntity))
                ) && 
                (
                    this.ClientFirstName == input.ClientFirstName ||
                    (this.ClientFirstName != null &&
                    this.ClientFirstName.Equals(input.ClientFirstName))
                ) && 
                (
                    this.ClientId == input.ClientId ||
                    (this.ClientId != null &&
                    this.ClientId.Equals(input.ClientId))
                ) && 
                (
                    this.ClientLastName == input.ClientLastName ||
                    (this.ClientLastName != null &&
                    this.ClientLastName.Equals(input.ClientLastName))
                ) && 
                (
                    this.ClientMiddleName == input.ClientMiddleName ||
                    (this.ClientMiddleName != null &&
                    this.ClientMiddleName.Equals(input.ClientMiddleName))
                ) && 
                (
                    this.ClientPersonName == input.ClientPersonName ||
                    (this.ClientPersonName != null &&
                    this.ClientPersonName.Equals(input.ClientPersonName))
                ) && 
                (
                    this.ClientPriority == input.ClientPriority ||
                    (this.ClientPriority != null &&
                    this.ClientPriority.Equals(input.ClientPriority))
                ) && 
                (
                    this.ClientSalutation == input.ClientSalutation ||
                    (this.ClientSalutation != null &&
                    this.ClientSalutation.Equals(input.ClientSalutation))
                ) && 
                (
                    this.ClientSuffix == input.ClientSuffix ||
                    (this.ClientSuffix != null &&
                    this.ClientSuffix.Equals(input.ClientSuffix))
                ) && 
                (
                    this.CreatedTime == input.CreatedTime ||
                    (this.CreatedTime != null &&
                    this.CreatedTime.Equals(input.CreatedTime))
                ) && 
                (
                    this.MapStatus == input.MapStatus ||
                    this.MapStatus.Equals(input.MapStatus)
                ) && 
                (
                    this.PersonId == input.PersonId ||
                    (this.PersonId != null &&
                    this.PersonId.Equals(input.PersonId))
                ) && 
                (
                    this.PersonName == input.PersonName ||
                    (this.PersonName != null &&
                    this.PersonName.Equals(input.PersonName))
                ) && 
                (
                    this.UniverseId == input.UniverseId ||
                    (this.UniverseId != null &&
                    this.UniverseId.Equals(input.UniverseId))
                ) && 
                (
                    this.UpdatedTime == input.UpdatedTime ||
                    (this.UpdatedTime != null &&
                    this.UpdatedTime.Equals(input.UpdatedTime))
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
                if (this.ClientEntity != null)
                {
                    hashCode = (hashCode * 59) + this.ClientEntity.GetHashCode();
                }
                if (this.ClientFirstName != null)
                {
                    hashCode = (hashCode * 59) + this.ClientFirstName.GetHashCode();
                }
                if (this.ClientId != null)
                {
                    hashCode = (hashCode * 59) + this.ClientId.GetHashCode();
                }
                if (this.ClientLastName != null)
                {
                    hashCode = (hashCode * 59) + this.ClientLastName.GetHashCode();
                }
                if (this.ClientMiddleName != null)
                {
                    hashCode = (hashCode * 59) + this.ClientMiddleName.GetHashCode();
                }
                if (this.ClientPersonName != null)
                {
                    hashCode = (hashCode * 59) + this.ClientPersonName.GetHashCode();
                }
                if (this.ClientPriority != null)
                {
                    hashCode = (hashCode * 59) + this.ClientPriority.GetHashCode();
                }
                if (this.ClientSalutation != null)
                {
                    hashCode = (hashCode * 59) + this.ClientSalutation.GetHashCode();
                }
                if (this.ClientSuffix != null)
                {
                    hashCode = (hashCode * 59) + this.ClientSuffix.GetHashCode();
                }
                if (this.CreatedTime != null)
                {
                    hashCode = (hashCode * 59) + this.CreatedTime.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.MapStatus.GetHashCode();
                if (this.PersonId != null)
                {
                    hashCode = (hashCode * 59) + this.PersonId.GetHashCode();
                }
                if (this.PersonName != null)
                {
                    hashCode = (hashCode * 59) + this.PersonName.GetHashCode();
                }
                if (this.UniverseId != null)
                {
                    hashCode = (hashCode * 59) + this.UniverseId.GetHashCode();
                }
                if (this.UpdatedTime != null)
                {
                    hashCode = (hashCode * 59) + this.UpdatedTime.GetHashCode();
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
