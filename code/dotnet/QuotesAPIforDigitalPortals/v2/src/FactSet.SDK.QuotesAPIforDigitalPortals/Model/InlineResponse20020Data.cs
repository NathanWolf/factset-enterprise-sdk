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
    /// Details of a country.
    /// </summary>
    [DataContract(Name = "inline_response_200_20_data")]
    public partial class InlineResponse20020Data : IEquatable<InlineResponse20020Data>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse20020Data" /> class.
        /// </summary>
        /// <param name="id">Identifier of a country..</param>
        /// <param name="name">Name of the country..</param>
        /// <param name="subdivisions">subdivisions.</param>
        public InlineResponse20020Data(decimal id = default(decimal), string name = default(string), List<InlineResponse20020DataSubdivisions> subdivisions = default(List<InlineResponse20020DataSubdivisions>))
        {
            this.Id = id;
            this.Name = name;
            this.Subdivisions = subdivisions;
        }

        /// <summary>
        /// Identifier of a country.
        /// </summary>
        /// <value>Identifier of a country.</value>
        [DataMember(Name = "id", EmitDefaultValue = false)]
        public decimal Id { get; set; }

        /// <summary>
        /// Name of the country.
        /// </summary>
        /// <value>Name of the country.</value>
        [DataMember(Name = "name", EmitDefaultValue = false)]
        public string Name { get; set; }

        /// <summary>
        /// Gets or Sets Subdivisions
        /// </summary>
        [DataMember(Name = "subdivisions", EmitDefaultValue = false)]
        public List<InlineResponse20020DataSubdivisions> Subdivisions { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class InlineResponse20020Data {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Subdivisions: ").Append(Subdivisions).Append("\n");
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
            return this.Equals(input as InlineResponse20020Data);
        }

        /// <summary>
        /// Returns true if InlineResponse20020Data instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse20020Data to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse20020Data input)
        {
            if (input == null)
            {
                return false;
            }
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
                    this.Subdivisions == input.Subdivisions ||
                    this.Subdivisions != null &&
                    input.Subdivisions != null &&
                    this.Subdivisions.SequenceEqual(input.Subdivisions)
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
                hashCode = (hashCode * 59) + this.Id.GetHashCode();
                if (this.Name != null)
                {
                    hashCode = (hashCode * 59) + this.Name.GetHashCode();
                }
                if (this.Subdivisions != null)
                {
                    hashCode = (hashCode * 59) + this.Subdivisions.GetHashCode();
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
