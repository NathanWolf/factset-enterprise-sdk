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
using OpenAPIDateConverter = FactSet.SDK.BondsAPIforDigitalPortals.Client.OpenAPIDateConverter;

namespace FactSet.SDK.BondsAPIforDigitalPortals.Model
{
    /// <summary>
    /// Issuer of the instrument. See endpoint &#x60;/legalEntity/list&#x60; for possible values.
    /// </summary>
    [DataContract(Name = "inline_response_200_data_issuer")]
    public partial class InlineResponse200DataIssuer : IEquatable<InlineResponse200DataIssuer>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse200DataIssuer" /> class.
        /// </summary>
        /// <param name="id">Identifier of the issuer..</param>
        /// <param name="name">Name of the issuer..</param>
        /// <param name="lei">Legal Entity Identifier of the issuer..</param>
        public InlineResponse200DataIssuer(string id = default(string), string name = default(string), string lei = default(string))
        {
            this.Id = id;
            this.Name = name;
            this.Lei = lei;
        }

        /// <summary>
        /// Identifier of the issuer.
        /// </summary>
        /// <value>Identifier of the issuer.</value>
        [DataMember(Name = "id", EmitDefaultValue = false)]
        public string Id { get; set; }

        /// <summary>
        /// Name of the issuer.
        /// </summary>
        /// <value>Name of the issuer.</value>
        [DataMember(Name = "name", EmitDefaultValue = false)]
        public string Name { get; set; }

        /// <summary>
        /// Legal Entity Identifier of the issuer.
        /// </summary>
        /// <value>Legal Entity Identifier of the issuer.</value>
        [DataMember(Name = "lei", EmitDefaultValue = false)]
        public string Lei { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class InlineResponse200DataIssuer {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Lei: ").Append(Lei).Append("\n");
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
            return this.Equals(input as InlineResponse200DataIssuer);
        }

        /// <summary>
        /// Returns true if InlineResponse200DataIssuer instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse200DataIssuer to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse200DataIssuer input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Id == input.Id ||
                    (this.Id != null &&
                    this.Id.Equals(input.Id))
                ) && 
                (
                    this.Name == input.Name ||
                    (this.Name != null &&
                    this.Name.Equals(input.Name))
                ) && 
                (
                    this.Lei == input.Lei ||
                    (this.Lei != null &&
                    this.Lei.Equals(input.Lei))
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
                if (this.Id != null)
                    hashCode = hashCode * 59 + this.Id.GetHashCode();
                if (this.Name != null)
                    hashCode = hashCode * 59 + this.Name.GetHashCode();
                if (this.Lei != null)
                    hashCode = hashCode * 59 + this.Lei.GetHashCode();
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
