/*
 * Prime Developer Trial
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1
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
using OpenAPIDateConverter = FactSet.SDK.QuotesAPIforDigitalPortals.Client.OpenAPIDateConverter;

namespace FactSet.SDK.QuotesAPIforDigitalPortals.Model
{
    /// <summary>
    /// InlineResponse20061Data
    /// </summary>
    [DataContract(Name = "inline_response_200_61_data")]
    public partial class InlineResponse20061Data : IEquatable<InlineResponse20061Data>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse20061Data" /> class.
        /// </summary>
        /// <param name="id">Identifier of a role..</param>
        /// <param name="name">Name of the role..</param>
        /// <param name="legalEntities">Legal entities and their respective compliance properties with regard to the role..</param>
        public InlineResponse20061Data(decimal id = default(decimal), string name = default(string), List<InlineResponse20061LegalEntities> legalEntities = default(List<InlineResponse20061LegalEntities>))
        {
            this.Id = id;
            this.Name = name;
            this.LegalEntities = legalEntities;
        }

        /// <summary>
        /// Identifier of a role.
        /// </summary>
        /// <value>Identifier of a role.</value>
        [DataMember(Name = "id", EmitDefaultValue = false)]
        public decimal Id { get; set; }

        /// <summary>
        /// Name of the role.
        /// </summary>
        /// <value>Name of the role.</value>
        [DataMember(Name = "name", EmitDefaultValue = false)]
        public string Name { get; set; }

        /// <summary>
        /// Legal entities and their respective compliance properties with regard to the role.
        /// </summary>
        /// <value>Legal entities and their respective compliance properties with regard to the role.</value>
        [DataMember(Name = "legalEntities", EmitDefaultValue = false)]
        public List<InlineResponse20061LegalEntities> LegalEntities { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class InlineResponse20061Data {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  LegalEntities: ").Append(LegalEntities).Append("\n");
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
            return this.Equals(input as InlineResponse20061Data);
        }

        /// <summary>
        /// Returns true if InlineResponse20061Data instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse20061Data to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse20061Data input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Id == input.Id ||
                    this.Id.Equals(input.Id)
                ) && 
                (
                    this.Name == input.Name ||
                    (this.Name != null &&
                    this.Name.Equals(input.Name))
                ) && 
                (
                    this.LegalEntities == input.LegalEntities ||
                    this.LegalEntities != null &&
                    input.LegalEntities != null &&
                    this.LegalEntities.SequenceEqual(input.LegalEntities)
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
                hashCode = hashCode * 59 + this.Id.GetHashCode();
                if (this.Name != null)
                    hashCode = hashCode * 59 + this.Name.GetHashCode();
                if (this.LegalEntities != null)
                    hashCode = hashCode * 59 + this.LegalEntities.GetHashCode();
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
