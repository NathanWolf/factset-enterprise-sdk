/*
 * Vault API
 *
 * Allow clients to fetch Vault Analytics through APIs.
 *
 * The version of the OpenAPI document: 2
 * Contact: analytics.api.support@factset.com
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
using OpenAPIDateConverter = FactSet.SDK.Vault.Client.OpenAPIDateConverter;

namespace FactSet.SDK.Vault.Model
{
    /// <summary>
    /// The date parameters for PA calculation.
    /// </summary>
    [DataContract(Name = "PADateParameters")]
    public partial class PADateParameters : IEquatable<PADateParameters>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="PADateParameters" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected PADateParameters() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="PADateParameters" /> class.
        /// </summary>
        /// <param name="startdate">Calculation&#39;s start date..</param>
        /// <param name="enddate">Calculation&#39;s end date. (required).</param>
        /// <param name="frequency">Calculation&#39;s frequency. (required).</param>
        public PADateParameters(string startdate = default(string), string enddate = default(string), string frequency = default(string))
        {
            // to ensure "enddate" is required (not null)
            if (enddate == null) {
                throw new ArgumentNullException("enddate is a required property for PADateParameters and cannot be null");
            }
            this.Enddate = enddate;
            // to ensure "frequency" is required (not null)
            if (frequency == null) {
                throw new ArgumentNullException("frequency is a required property for PADateParameters and cannot be null");
            }
            this.Frequency = frequency;
            this.Startdate = startdate;
        }

        /// <summary>
        /// Calculation&#39;s start date.
        /// </summary>
        /// <value>Calculation&#39;s start date.</value>
        [DataMember(Name = "startdate", EmitDefaultValue = false)]
        public string Startdate { get; set; }

        /// <summary>
        /// Calculation&#39;s end date.
        /// </summary>
        /// <value>Calculation&#39;s end date.</value>
        [DataMember(Name = "enddate", IsRequired = true, EmitDefaultValue = false)]
        public string Enddate { get; set; }

        /// <summary>
        /// Calculation&#39;s frequency.
        /// </summary>
        /// <value>Calculation&#39;s frequency.</value>
        [DataMember(Name = "frequency", IsRequired = true, EmitDefaultValue = false)]
        public string Frequency { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class PADateParameters {\n");
            sb.Append("  Startdate: ").Append(Startdate).Append("\n");
            sb.Append("  Enddate: ").Append(Enddate).Append("\n");
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
            return this.Equals(input as PADateParameters);
        }

        /// <summary>
        /// Returns true if PADateParameters instances are equal
        /// </summary>
        /// <param name="input">Instance of PADateParameters to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PADateParameters input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Startdate == input.Startdate ||
                    (this.Startdate != null &&
                    this.Startdate.Equals(input.Startdate))
                ) && 
                (
                    this.Enddate == input.Enddate ||
                    (this.Enddate != null &&
                    this.Enddate.Equals(input.Enddate))
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
                if (this.Startdate != null)
                    hashCode = hashCode * 59 + this.Startdate.GetHashCode();
                if (this.Enddate != null)
                    hashCode = hashCode * 59 + this.Enddate.GetHashCode();
                if (this.Frequency != null)
                    hashCode = hashCode * 59 + this.Frequency.GetHashCode();
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
