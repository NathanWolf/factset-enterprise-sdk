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
using OpenAPIDateConverter = FactSet.SDK.SecuritizedDerivativesAPIforDigitalPortals.Client.OpenAPIDateConverter;

namespace FactSet.SDK.SecuritizedDerivativesAPIforDigitalPortals.Model
{
    /// <summary>
    /// The operating MIC of the underlying. See endpoint &#x60;/basic/mic/operating/list&#x60; for possible values.
    /// </summary>
    [DataContract(Name = "inline_response_200_7_data_operatingMIC")]
    public partial class InlineResponse2007DataOperatingMIC : IEquatable<InlineResponse2007DataOperatingMIC>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse2007DataOperatingMIC" /> class.
        /// </summary>
        /// <param name="id">Identifier of the operating MIC..</param>
        /// <param name="isoCode">ISO 10383 code of the operating MIC..</param>
        /// <param name="name">English name of the operating MIC..</param>
        public InlineResponse2007DataOperatingMIC(decimal id = default(decimal), string isoCode = default(string), string name = default(string))
        {
            this.Id = id;
            this.IsoCode = isoCode;
            this.Name = name;
        }

        /// <summary>
        /// Identifier of the operating MIC.
        /// </summary>
        /// <value>Identifier of the operating MIC.</value>
        [DataMember(Name = "id", EmitDefaultValue = false)]
        public decimal Id { get; set; }

        /// <summary>
        /// ISO 10383 code of the operating MIC.
        /// </summary>
        /// <value>ISO 10383 code of the operating MIC.</value>
        [DataMember(Name = "isoCode", EmitDefaultValue = false)]
        public string IsoCode { get; set; }

        /// <summary>
        /// English name of the operating MIC.
        /// </summary>
        /// <value>English name of the operating MIC.</value>
        [DataMember(Name = "name", EmitDefaultValue = false)]
        public string Name { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class InlineResponse2007DataOperatingMIC {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  IsoCode: ").Append(IsoCode).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
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
            return this.Equals(input as InlineResponse2007DataOperatingMIC);
        }

        /// <summary>
        /// Returns true if InlineResponse2007DataOperatingMIC instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse2007DataOperatingMIC to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse2007DataOperatingMIC input)
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
                    this.IsoCode == input.IsoCode ||
                    (this.IsoCode != null &&
                    this.IsoCode.Equals(input.IsoCode))
                ) && 
                (
                    this.Name == input.Name ||
                    (this.Name != null &&
                    this.Name.Equals(input.Name))
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
                if (this.IsoCode != null)
                {
                    hashCode = (hashCode * 59) + this.IsoCode.GetHashCode();
                }
                if (this.Name != null)
                {
                    hashCode = (hashCode * 59) + this.Name.GetHashCode();
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
