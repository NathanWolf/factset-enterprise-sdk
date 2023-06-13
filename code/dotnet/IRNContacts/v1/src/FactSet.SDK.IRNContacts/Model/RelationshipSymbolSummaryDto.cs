/*
 * IRN API v1
 *
 * Allows users to extract, create, update and configure IRN data.
 *
 * The version of the OpenAPI document: 1
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
using OpenAPIDateConverter = FactSet.SDK.IRNContacts.Client.OpenAPIDateConverter;

namespace FactSet.SDK.IRNContacts.Model
{
    /// <summary>
    /// RelationshipSymbolSummaryDto
    /// </summary>
    [DataContract(Name = "RelationshipSymbolSummaryDto")]
    public partial class RelationshipSymbolSummaryDto : IEquatable<RelationshipSymbolSummaryDto>, IValidatableObject
    {

        /// <summary>
        /// Gets or Sets Type
        /// </summary>
        [DataMember(Name = "type", EmitDefaultValue = false)]
        public SymbolType? Type { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="RelationshipSymbolSummaryDto" /> class.
        /// </summary>
        /// <param name="tdentifier">tdentifier.</param>
        /// <param name="name">name.</param>
        /// <param name="type">type.</param>
        public RelationshipSymbolSummaryDto(string tdentifier = default(string), string name = default(string), SymbolType type = default(SymbolType))
        {
            this.Tdentifier = tdentifier;
            this.Name = name;
            this.Type = type;
        }

        /// <summary>
        /// Gets or Sets Tdentifier
        /// </summary>
        [DataMember(Name = "tdentifier", EmitDefaultValue = true)]
        public string Tdentifier { get; set; }

        /// <summary>
        /// Gets or Sets Name
        /// </summary>
        [DataMember(Name = "name", EmitDefaultValue = true)]
        public string Name { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class RelationshipSymbolSummaryDto {\n");
            sb.Append("  Tdentifier: ").Append(Tdentifier).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
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
            return this.Equals(input as RelationshipSymbolSummaryDto);
        }

        /// <summary>
        /// Returns true if RelationshipSymbolSummaryDto instances are equal
        /// </summary>
        /// <param name="input">Instance of RelationshipSymbolSummaryDto to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(RelationshipSymbolSummaryDto input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Tdentifier == input.Tdentifier ||
                    (this.Tdentifier != null &&
                    this.Tdentifier.Equals(input.Tdentifier))
                ) && 
                (
                    this.Name == input.Name ||
                    (this.Name != null &&
                    this.Name.Equals(input.Name))
                ) && 
                (
                    this.Type == input.Type ||
                    this.Type.Equals(input.Type)
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
                if (this.Tdentifier != null)
                {
                    hashCode = (hashCode * 59) + this.Tdentifier.GetHashCode();
                }
                if (this.Name != null)
                {
                    hashCode = (hashCode * 59) + this.Name.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.Type.GetHashCode();
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
