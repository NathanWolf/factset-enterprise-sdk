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
using OpenAPIDateConverter = FactSet.SDK.WatchlistAPIforDigitalPortals.Client.OpenAPIDateConverter;

namespace FactSet.SDK.WatchlistAPIforDigitalPortals.Model
{
    /// <summary>
    /// InlineResponse2004Data
    /// </summary>
    [DataContract(Name = "inline_response_200_4_data")]
    public partial class InlineResponse2004Data : IEquatable<InlineResponse2004Data>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse2004Data" /> class.
        /// </summary>
        /// <param name="id">Position id..</param>
        /// <param name="notation">Identifier of the notation..</param>
        /// <param name="additionalData">Additional data to the watched position..</param>
        public InlineResponse2004Data(decimal id = default(decimal), string notation = default(string), string additionalData = default(string))
        {
            this.Id = id;
            this.Notation = notation;
            this.AdditionalData = additionalData;
        }

        /// <summary>
        /// Position id.
        /// </summary>
        /// <value>Position id.</value>
        [DataMember(Name = "id", EmitDefaultValue = false)]
        public decimal Id { get; set; }

        /// <summary>
        /// Identifier of the notation.
        /// </summary>
        /// <value>Identifier of the notation.</value>
        [DataMember(Name = "notation", EmitDefaultValue = false)]
        public string Notation { get; set; }

        /// <summary>
        /// Additional data to the watched position.
        /// </summary>
        /// <value>Additional data to the watched position.</value>
        [DataMember(Name = "additionalData", EmitDefaultValue = false)]
        public string AdditionalData { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class InlineResponse2004Data {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Notation: ").Append(Notation).Append("\n");
            sb.Append("  AdditionalData: ").Append(AdditionalData).Append("\n");
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
            return this.Equals(input as InlineResponse2004Data);
        }

        /// <summary>
        /// Returns true if InlineResponse2004Data instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse2004Data to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse2004Data input)
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
                    this.Notation == input.Notation ||
                    (this.Notation != null &&
                    this.Notation.Equals(input.Notation))
                ) && 
                (
                    this.AdditionalData == input.AdditionalData ||
                    (this.AdditionalData != null &&
                    this.AdditionalData.Equals(input.AdditionalData))
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
                if (this.Notation != null)
                {
                    hashCode = (hashCode * 59) + this.Notation.GetHashCode();
                }
                if (this.AdditionalData != null)
                {
                    hashCode = (hashCode * 59) + this.AdditionalData.GetHashCode();
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
