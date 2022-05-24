/*
 * PA Engine API
 *
 * Allow clients to fetch PA Engine Analytics through APIs.
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
using OpenAPIDateConverter = FactSet.SDK.PAEngine.Client.OpenAPIDateConverter;

namespace FactSet.SDK.PAEngine.Model
{
    /// <summary>
    /// The account/benchmark parameter for SPAR calculation.
    /// </summary>
    [DataContract(Name = "SPARIdentifier")]
    public partial class SPARIdentifier : IEquatable<SPARIdentifier>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="SPARIdentifier" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected SPARIdentifier() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="SPARIdentifier" /> class.
        /// </summary>
        /// <param name="id">User&#39;s FactSet account OR benchmark id. (required).</param>
        /// <param name="returntype">Benchmark return type..</param>
        /// <param name="prefix">Benchmark prefix..</param>
        public SPARIdentifier(string id = default(string), string returntype = default(string), string prefix = default(string))
        {
            // to ensure "id" is required (not null)
            if (id == null) {
                throw new ArgumentNullException("id is a required property for SPARIdentifier and cannot be null");
            }
            this.Id = id;
            this.Returntype = returntype;
            this.Prefix = prefix;
        }

        /// <summary>
        /// User&#39;s FactSet account OR benchmark id.
        /// </summary>
        /// <value>User&#39;s FactSet account OR benchmark id.</value>
        [DataMember(Name = "id", IsRequired = true, EmitDefaultValue = false)]
        public string Id { get; set; }

        /// <summary>
        /// Benchmark return type.
        /// </summary>
        /// <value>Benchmark return type.</value>
        [DataMember(Name = "returntype", EmitDefaultValue = false)]
        public string Returntype { get; set; }

        /// <summary>
        /// Benchmark prefix.
        /// </summary>
        /// <value>Benchmark prefix.</value>
        [DataMember(Name = "prefix", EmitDefaultValue = false)]
        public string Prefix { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class SPARIdentifier {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Returntype: ").Append(Returntype).Append("\n");
            sb.Append("  Prefix: ").Append(Prefix).Append("\n");
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
            return this.Equals(input as SPARIdentifier);
        }

        /// <summary>
        /// Returns true if SPARIdentifier instances are equal
        /// </summary>
        /// <param name="input">Instance of SPARIdentifier to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(SPARIdentifier input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Id == input.Id ||
                    (this.Id != null &&
                    this.Id.Equals(input.Id))
                ) && 
                (
                    this.Returntype == input.Returntype ||
                    (this.Returntype != null &&
                    this.Returntype.Equals(input.Returntype))
                ) && 
                (
                    this.Prefix == input.Prefix ||
                    (this.Prefix != null &&
                    this.Prefix.Equals(input.Prefix))
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
                {
                    hashCode = (hashCode * 59) + this.Id.GetHashCode();
                }
                if (this.Returntype != null)
                {
                    hashCode = (hashCode * 59) + this.Returntype.GetHashCode();
                }
                if (this.Prefix != null)
                {
                    hashCode = (hashCode * 59) + this.Prefix.GetHashCode();
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
