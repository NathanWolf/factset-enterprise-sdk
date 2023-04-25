/*
 * FactSet Concordance API
 *
 *    The FactSet Concordance API enables Application Developers and Data Scientists to programmatically discover the FactSet Identifier for a specific Entity or Person based on attributes, such as name, URL, and location.FactSet Identifiers are mapped to industry-standard identifiers, as well as to a comprehensive set of reference data and unique content, to enhance the ability to quickly connect content sets.<p>     Using the submitted attributes, the FactSet Concordance API leverages FactSet’s extensive Entity Master, People, and Symbology databases to return potential candidate matches and a proposed match. The result is a concorded FactSet Identifier that can then be used as input throughout FactSet's expanding catalog of Content using our Content APIs or Standard DataFeeds.</p>    <b>There are two types of workflows supported in the API:</b>    <b>Entity & People Match:</b> The first workflow follows traditional API conventions in that a request is accepted and a response is returned synchronously enabling the concordance of up to 25 names in a single request. The response returns a list of 20 candidates as well as a proposed match.    <b>Entity & People Match - Bulk:</b> The second workflow allows you to input a large list of names within a .CSV file in a single request With this workflow, a task is created for uploading a set of queries. Once the task has completed, the client retrieves the concordance results through the /entity-decisions or /people-decisions endpoint. Note that in the Bulk workflow, only the matches for the records are returned. Candidates are not included.    Once the service has provided a list of concorded FactSet Identifiers, you can then use our Entity Mappings and People Mappings endpoints to further review the universe of mapped identifiers or modify existing records. </p> 
 *
 * The version of the OpenAPI document: 2.6.0
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
    /// PeopleMappingRequest
    /// </summary>
    [DataContract(Name = "PeopleMappingRequest")]
    public partial class PeopleMappingRequest : IEquatable<PeopleMappingRequest>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="PeopleMappingRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected PeopleMappingRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="PeopleMappingRequest" /> class.
        /// </summary>
        /// <param name="clientEntity">Used to describe the company of the person.</param>
        /// <param name="clientFirstName">Used to describe the first name of the person.</param>
        /// <param name="clientId">A unique identifier supplied by the user. ClientId is saved to the user&#39;s Concordance universe and will be used as the identifier for that entity within the universe. (required).</param>
        /// <param name="clientLastName">Used to describe the last name of the person..</param>
        /// <param name="clientMiddleName">Used to describe the middle name of the person..</param>
        /// <param name="clientPersonName">Used to describe the name of the person.</param>
        /// <param name="clientPriority">Used to indicate the priority of the person.</param>
        /// <param name="clientSalutation">Used to indicate the salutation of the person.</param>
        /// <param name="clientSuffix">Used to indicate the suffix for the person&#39;s name.</param>
        /// <param name="personId">A unique identifier used to identify a person..</param>
        /// <param name="universeId">A unique identifier supplied to a person to save the data into his/her universe. (required).</param>
        public PeopleMappingRequest(string clientId, int universeId,string clientEntity = default(string), string clientFirstName = default(string), string clientLastName = default(string), string clientMiddleName = default(string), string clientPersonName = default(string), string clientPriority = default(string), string clientSalutation = default(string), string clientSuffix = default(string), string personId = default(string))
        {
            // to ensure "clientId" is required (not null)
            if (clientId == null) {
                throw new ArgumentNullException("clientId is a required property for PeopleMappingRequest and cannot be null");
            }
            this.ClientId = clientId;
            this.UniverseId = universeId;
            this.ClientEntity = clientEntity;
            this.ClientFirstName = clientFirstName;
            this.ClientLastName = clientLastName;
            this.ClientMiddleName = clientMiddleName;
            this.ClientPersonName = clientPersonName;
            this.ClientPriority = clientPriority;
            this.ClientSalutation = clientSalutation;
            this.ClientSuffix = clientSuffix;
            this.PersonId = personId;
        }

        /// <summary>
        /// Used to describe the company of the person
        /// </summary>
        /// <value>Used to describe the company of the person</value>
        [DataMember(Name = "clientEntity", EmitDefaultValue = false)]
        public string ClientEntity { get; set; }

        /// <summary>
        /// Used to describe the first name of the person
        /// </summary>
        /// <value>Used to describe the first name of the person</value>
        [DataMember(Name = "clientFirstName", EmitDefaultValue = false)]
        public string ClientFirstName { get; set; }

        /// <summary>
        /// A unique identifier supplied by the user. ClientId is saved to the user&#39;s Concordance universe and will be used as the identifier for that entity within the universe.
        /// </summary>
        /// <value>A unique identifier supplied by the user. ClientId is saved to the user&#39;s Concordance universe and will be used as the identifier for that entity within the universe.</value>
        [DataMember(Name = "clientId", IsRequired = true, EmitDefaultValue = false)]
        public string ClientId { get; set; }

        /// <summary>
        /// Used to describe the last name of the person.
        /// </summary>
        /// <value>Used to describe the last name of the person.</value>
        [DataMember(Name = "clientLastName", EmitDefaultValue = false)]
        public string ClientLastName { get; set; }

        /// <summary>
        /// Used to describe the middle name of the person.
        /// </summary>
        /// <value>Used to describe the middle name of the person.</value>
        [DataMember(Name = "clientMiddleName", EmitDefaultValue = false)]
        public string ClientMiddleName { get; set; }

        /// <summary>
        /// Used to describe the name of the person
        /// </summary>
        /// <value>Used to describe the name of the person</value>
        [DataMember(Name = "clientPersonName", EmitDefaultValue = false)]
        public string ClientPersonName { get; set; }

        /// <summary>
        /// Used to indicate the priority of the person
        /// </summary>
        /// <value>Used to indicate the priority of the person</value>
        [DataMember(Name = "clientPriority", EmitDefaultValue = false)]
        public string ClientPriority { get; set; }

        /// <summary>
        /// Used to indicate the salutation of the person
        /// </summary>
        /// <value>Used to indicate the salutation of the person</value>
        [DataMember(Name = "clientSalutation", EmitDefaultValue = false)]
        public string ClientSalutation { get; set; }

        /// <summary>
        /// Used to indicate the suffix for the person&#39;s name
        /// </summary>
        /// <value>Used to indicate the suffix for the person&#39;s name</value>
        [DataMember(Name = "clientSuffix", EmitDefaultValue = false)]
        public string ClientSuffix { get; set; }

        /// <summary>
        /// A unique identifier used to identify a person.
        /// </summary>
        /// <value>A unique identifier used to identify a person.</value>
        [DataMember(Name = "personId", EmitDefaultValue = false)]
        public string PersonId { get; set; }

        /// <summary>
        /// A unique identifier supplied to a person to save the data into his/her universe.
        /// </summary>
        /// <value>A unique identifier supplied to a person to save the data into his/her universe.</value>
        [DataMember(Name = "universeId", IsRequired = true, EmitDefaultValue = false)]
        public int UniverseId { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class PeopleMappingRequest {\n");
            sb.Append("  ClientEntity: ").Append(ClientEntity).Append("\n");
            sb.Append("  ClientFirstName: ").Append(ClientFirstName).Append("\n");
            sb.Append("  ClientId: ").Append(ClientId).Append("\n");
            sb.Append("  ClientLastName: ").Append(ClientLastName).Append("\n");
            sb.Append("  ClientMiddleName: ").Append(ClientMiddleName).Append("\n");
            sb.Append("  ClientPersonName: ").Append(ClientPersonName).Append("\n");
            sb.Append("  ClientPriority: ").Append(ClientPriority).Append("\n");
            sb.Append("  ClientSalutation: ").Append(ClientSalutation).Append("\n");
            sb.Append("  ClientSuffix: ").Append(ClientSuffix).Append("\n");
            sb.Append("  PersonId: ").Append(PersonId).Append("\n");
            sb.Append("  UniverseId: ").Append(UniverseId).Append("\n");
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
            return this.Equals(input as PeopleMappingRequest);
        }

        /// <summary>
        /// Returns true if PeopleMappingRequest instances are equal
        /// </summary>
        /// <param name="input">Instance of PeopleMappingRequest to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PeopleMappingRequest input)
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
                    this.PersonId == input.PersonId ||
                    (this.PersonId != null &&
                    this.PersonId.Equals(input.PersonId))
                ) && 
                (
                    this.UniverseId == input.UniverseId ||
                    this.UniverseId.Equals(input.UniverseId)
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
                if (this.PersonId != null)
                {
                    hashCode = (hashCode * 59) + this.PersonId.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.UniverseId.GetHashCode();
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
