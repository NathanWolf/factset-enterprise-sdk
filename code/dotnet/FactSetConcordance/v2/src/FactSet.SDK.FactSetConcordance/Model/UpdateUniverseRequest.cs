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
    /// UpdateUniverseRequest
    /// </summary>
    [DataContract(Name = "UpdateUniverseRequest")]
    public partial class UpdateUniverseRequest : IEquatable<UpdateUniverseRequest>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="UpdateUniverseRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected UpdateUniverseRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="UpdateUniverseRequest" /> class.
        /// </summary>
        /// <param name="universeName">Universe name.</param>
        /// <param name="universeDescription">Universe description.</param>
        /// <param name="universeId">Universe identifier (required).</param>
        public UpdateUniverseRequest(string universeName = default(string), string universeDescription = default(string), int universeId = default(int))
        {
            this.UniverseId = universeId;
            this.UniverseName = universeName;
            this.UniverseDescription = universeDescription;
        }

        /// <summary>
        /// Universe name
        /// </summary>
        /// <value>Universe name</value>
        [DataMember(Name = "universeName", EmitDefaultValue = false)]
        public string UniverseName { get; set; }

        /// <summary>
        /// Universe description
        /// </summary>
        /// <value>Universe description</value>
        [DataMember(Name = "universeDescription", EmitDefaultValue = false)]
        public string UniverseDescription { get; set; }

        /// <summary>
        /// Universe identifier
        /// </summary>
        /// <value>Universe identifier</value>
        [DataMember(Name = "universeId", IsRequired = true, EmitDefaultValue = false)]
        public int UniverseId { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class UpdateUniverseRequest {\n");
            sb.Append("  UniverseName: ").Append(UniverseName).Append("\n");
            sb.Append("  UniverseDescription: ").Append(UniverseDescription).Append("\n");
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
            return this.Equals(input as UpdateUniverseRequest);
        }

        /// <summary>
        /// Returns true if UpdateUniverseRequest instances are equal
        /// </summary>
        /// <param name="input">Instance of UpdateUniverseRequest to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(UpdateUniverseRequest input)
        {
            if (input == null)
                return false;

            return 
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
                if (this.UniverseName != null)
                    hashCode = hashCode * 59 + this.UniverseName.GetHashCode();
                if (this.UniverseDescription != null)
                    hashCode = hashCode * 59 + this.UniverseDescription.GetHashCode();
                hashCode = hashCode * 59 + this.UniverseId.GetHashCode();
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
