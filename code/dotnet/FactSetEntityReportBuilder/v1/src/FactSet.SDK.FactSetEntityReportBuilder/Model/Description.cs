/*
 * FactSet Entity Report Builder
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
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
using OpenAPIDateConverter = FactSet.SDK.FactSetEntityReportBuilder.Client.OpenAPIDateConverter;

namespace FactSet.SDK.FactSetEntityReportBuilder.Model
{
    /// <summary>
    /// Description
    /// </summary>
    [DataContract(Name = "description")]
    public partial class Description : IEquatable<Description>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="Description" /> class.
        /// </summary>
        /// <param name="description">description.</param>
        public Description(DescriptionDescription description = default(DescriptionDescription))
        {
            this._Description = description;
        }

        /// <summary>
        /// Gets or Sets _Description
        /// </summary>
        [DataMember(Name = "description", EmitDefaultValue = false)]
        public DescriptionDescription _Description { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class Description {\n");
            sb.Append("  _Description: ").Append(_Description).Append("\n");
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
            return this.Equals(input as Description);
        }

        /// <summary>
        /// Returns true if Description instances are equal
        /// </summary>
        /// <param name="input">Instance of Description to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Description input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this._Description == input._Description ||
                    (this._Description != null &&
                    this._Description.Equals(input._Description))
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
                if (this._Description != null)
                {
                    hashCode = (hashCode * 59) + this._Description.GetHashCode();
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
