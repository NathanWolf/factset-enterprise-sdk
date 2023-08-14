/*
 * PA Engine API
 *
 * Allow clients to fetch Analytics through APIs.
 *
 * The version of the OpenAPI document: 3.14.0
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
using OpenAPIDateConverter = FactSet.SDK.PAEngine.Client.OpenAPIDateConverter;

namespace FactSet.SDK.PAEngine.Model
{
    /// <summary>
    /// UnlinkedPATemplateGroupDetails
    /// </summary>
    [DataContract(Name = "UnlinkedPATemplateGroupDetails")]
    public partial class UnlinkedPATemplateGroupDetails : IEquatable<UnlinkedPATemplateGroupDetails>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="UnlinkedPATemplateGroupDetails" /> class.
        /// </summary>
        /// <param name="name">Unlinked template group name.</param>
        /// <param name="id">FactSet-defined or User-defined Group identifier..</param>
        /// <param name="frequency">Grouping frequency.</param>
        public UnlinkedPATemplateGroupDetails(string name = default(string), string id = default(string), string frequency = default(string))
        {
            this.Name = name;
            this.Id = id;
            this.Frequency = frequency;
        }

        /// <summary>
        /// Unlinked template group name
        /// </summary>
        /// <value>Unlinked template group name</value>
        [DataMember(Name = "name", EmitDefaultValue = true)]
        public string Name { get; set; }

        /// <summary>
        /// FactSet-defined or User-defined Group identifier.
        /// </summary>
        /// <value>FactSet-defined or User-defined Group identifier.</value>
        [DataMember(Name = "id", EmitDefaultValue = true)]
        public string Id { get; set; }

        /// <summary>
        /// Grouping frequency
        /// </summary>
        /// <value>Grouping frequency</value>
        [DataMember(Name = "frequency", EmitDefaultValue = true)]
        public string Frequency { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class UnlinkedPATemplateGroupDetails {\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Frequency: ").Append(Frequency).Append("\n");
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
            return this.Equals(input as UnlinkedPATemplateGroupDetails);
        }

        /// <summary>
        /// Returns true if UnlinkedPATemplateGroupDetails instances are equal
        /// </summary>
        /// <param name="input">Instance of UnlinkedPATemplateGroupDetails to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(UnlinkedPATemplateGroupDetails input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Name == input.Name ||
                    (this.Name != null &&
                    this.Name.Equals(input.Name))
                ) && 
                (
                    this.Id == input.Id ||
                    (this.Id != null &&
                    this.Id.Equals(input.Id))
                ) && 
                (
                    this.Frequency == input.Frequency ||
                    (this.Frequency != null &&
                    this.Frequency.Equals(input.Frequency))
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
                if (this.Name != null)
                {
                    hashCode = (hashCode * 59) + this.Name.GetHashCode();
                }
                if (this.Id != null)
                {
                    hashCode = (hashCode * 59) + this.Id.GetHashCode();
                }
                if (this.Frequency != null)
                {
                    hashCode = (hashCode * 59) + this.Frequency.GetHashCode();
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
