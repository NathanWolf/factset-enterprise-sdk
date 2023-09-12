/*
 * FactSet Concordance API
 *
 *   The FactSet Concordance API enables Application Developers and Data Scientists to programmatically discover the FactSet Identifier for a specific Entity or Person based on attributes, such as name, URL, and location.FactSet Identifiers are mapped to industry-standard identifiers, as well as to a comprehensive set of reference data and unique content, to enhance the ability to quickly connect content sets.<p>     Using the submitted attributes, the FactSet Concordance API leverages FactSet’s extensive Entity Master, People, and Symbology databases to return potential candidate matches and a proposed match. The result is a concorded FactSet Identifier that can then be used as input throughout FactSet's expanding catalog of Content using our Content APIs or Standard DataFeeds.</p>    <b>There are two types of workflows supported in the API:</b>    <b>Entity & People Match:</b> The first workflow follows traditional API conventions in that a request is accepted and a response is returned synchronously enabling the concordance of up to 25 names in a single request. The response returns a list of 20 candidates as well as a proposed match.    <b>Entity & People Match - Bulk:</b> The second workflow allows you to input a large list of names within a .CSV file in a single request With this workflow, a task is created for uploading a set of queries. Once the task has completed, the client retrieves the concordance results through the /entity-decisions or /people-decisions endpoint. Note that in the Bulk workflow, only the matches for the records are returned. Candidates are not included.    Once the service has provided a list of concorded FactSet Identifiers, you can then use our Entity Mappings and People Mappings endpoints to further review the universe of mapped identifiers or modify existing records. </p> 
 *
 * The version of the OpenAPI document: 2.7.0
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
    /// PeopleMatchRequestInput
    /// </summary>
    [DataContract(Name = "PeopleMatchRequest_input")]
    public partial class PeopleMatchRequestInput : IEquatable<PeopleMatchRequestInput>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="PeopleMatchRequestInput" /> class.
        /// </summary>
        /// <param name="personName">The People name to match..</param>
        /// <param name="clientId">A unique identifier supplied by the user. ClientId is saved to the user&#39;s Concordance universe and will be used as the identifier for that entity within the universe. .</param>
        /// <param name="salutation">The salutation is same as the normal salutation we use .The salutation can be Mr, Mrs.The salutation should not be given along with personName. .</param>
        /// <param name="firstName">The first name of the person. This field should not be given along with personName. .</param>
        /// <param name="middleName">The middle name of the person. This field should not be given along with personName. .</param>
        /// <param name="lastName">The last name of the person. This field should not be given along with personName. .</param>
        /// <param name="suffix">The suffix of person&#39;s name. This field should not be given along with personName. .</param>
        /// <param name="entity">The enity of the Person. .</param>
        public PeopleMatchRequestInput(string personName = default(string), string clientId = default(string), string salutation = default(string), string firstName = default(string), string middleName = default(string), string lastName = default(string), string suffix = default(string), string entity = default(string))
        {
            this.PersonName = personName;
            this.ClientId = clientId;
            this.Salutation = salutation;
            this.FirstName = firstName;
            this.MiddleName = middleName;
            this.LastName = lastName;
            this.Suffix = suffix;
            this.Entity = entity;
        }

        /// <summary>
        /// The People name to match.
        /// </summary>
        /// <value>The People name to match.</value>
        [DataMember(Name = "personName", EmitDefaultValue = false)]
        public string PersonName { get; set; }

        /// <summary>
        /// A unique identifier supplied by the user. ClientId is saved to the user&#39;s Concordance universe and will be used as the identifier for that entity within the universe. 
        /// </summary>
        /// <value>A unique identifier supplied by the user. ClientId is saved to the user&#39;s Concordance universe and will be used as the identifier for that entity within the universe. </value>
        [DataMember(Name = "clientId", EmitDefaultValue = false)]
        public string ClientId { get; set; }

        /// <summary>
        /// The salutation is same as the normal salutation we use .The salutation can be Mr, Mrs.The salutation should not be given along with personName. 
        /// </summary>
        /// <value>The salutation is same as the normal salutation we use .The salutation can be Mr, Mrs.The salutation should not be given along with personName. </value>
        [DataMember(Name = "salutation", EmitDefaultValue = false)]
        public string Salutation { get; set; }

        /// <summary>
        /// The first name of the person. This field should not be given along with personName. 
        /// </summary>
        /// <value>The first name of the person. This field should not be given along with personName. </value>
        [DataMember(Name = "firstName", EmitDefaultValue = false)]
        public string FirstName { get; set; }

        /// <summary>
        /// The middle name of the person. This field should not be given along with personName. 
        /// </summary>
        /// <value>The middle name of the person. This field should not be given along with personName. </value>
        [DataMember(Name = "middleName", EmitDefaultValue = false)]
        public string MiddleName { get; set; }

        /// <summary>
        /// The last name of the person. This field should not be given along with personName. 
        /// </summary>
        /// <value>The last name of the person. This field should not be given along with personName. </value>
        [DataMember(Name = "lastName", EmitDefaultValue = false)]
        public string LastName { get; set; }

        /// <summary>
        /// The suffix of person&#39;s name. This field should not be given along with personName. 
        /// </summary>
        /// <value>The suffix of person&#39;s name. This field should not be given along with personName. </value>
        [DataMember(Name = "suffix", EmitDefaultValue = false)]
        public string Suffix { get; set; }

        /// <summary>
        /// The enity of the Person. 
        /// </summary>
        /// <value>The enity of the Person. </value>
        [DataMember(Name = "entity", EmitDefaultValue = false)]
        public string Entity { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class PeopleMatchRequestInput {\n");
            sb.Append("  PersonName: ").Append(PersonName).Append("\n");
            sb.Append("  ClientId: ").Append(ClientId).Append("\n");
            sb.Append("  Salutation: ").Append(Salutation).Append("\n");
            sb.Append("  FirstName: ").Append(FirstName).Append("\n");
            sb.Append("  MiddleName: ").Append(MiddleName).Append("\n");
            sb.Append("  LastName: ").Append(LastName).Append("\n");
            sb.Append("  Suffix: ").Append(Suffix).Append("\n");
            sb.Append("  Entity: ").Append(Entity).Append("\n");
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
            return this.Equals(input as PeopleMatchRequestInput);
        }

        /// <summary>
        /// Returns true if PeopleMatchRequestInput instances are equal
        /// </summary>
        /// <param name="input">Instance of PeopleMatchRequestInput to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PeopleMatchRequestInput input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.PersonName == input.PersonName ||
                    (this.PersonName != null &&
                    this.PersonName.Equals(input.PersonName))
                ) && 
                (
                    this.ClientId == input.ClientId ||
                    (this.ClientId != null &&
                    this.ClientId.Equals(input.ClientId))
                ) && 
                (
                    this.Salutation == input.Salutation ||
                    (this.Salutation != null &&
                    this.Salutation.Equals(input.Salutation))
                ) && 
                (
                    this.FirstName == input.FirstName ||
                    (this.FirstName != null &&
                    this.FirstName.Equals(input.FirstName))
                ) && 
                (
                    this.MiddleName == input.MiddleName ||
                    (this.MiddleName != null &&
                    this.MiddleName.Equals(input.MiddleName))
                ) && 
                (
                    this.LastName == input.LastName ||
                    (this.LastName != null &&
                    this.LastName.Equals(input.LastName))
                ) && 
                (
                    this.Suffix == input.Suffix ||
                    (this.Suffix != null &&
                    this.Suffix.Equals(input.Suffix))
                ) && 
                (
                    this.Entity == input.Entity ||
                    (this.Entity != null &&
                    this.Entity.Equals(input.Entity))
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
                if (this.PersonName != null)
                {
                    hashCode = (hashCode * 59) + this.PersonName.GetHashCode();
                }
                if (this.ClientId != null)
                {
                    hashCode = (hashCode * 59) + this.ClientId.GetHashCode();
                }
                if (this.Salutation != null)
                {
                    hashCode = (hashCode * 59) + this.Salutation.GetHashCode();
                }
                if (this.FirstName != null)
                {
                    hashCode = (hashCode * 59) + this.FirstName.GetHashCode();
                }
                if (this.MiddleName != null)
                {
                    hashCode = (hashCode * 59) + this.MiddleName.GetHashCode();
                }
                if (this.LastName != null)
                {
                    hashCode = (hashCode * 59) + this.LastName.GetHashCode();
                }
                if (this.Suffix != null)
                {
                    hashCode = (hashCode * 59) + this.Suffix.GetHashCode();
                }
                if (this.Entity != null)
                {
                    hashCode = (hashCode * 59) + this.Entity.GetHashCode();
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
