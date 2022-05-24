/*
 * Axioma Equity API
 *
 * Allow clients to fetch Analytics through APIs.
 *
 * The version of the OpenAPI document: 3
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
using OpenAPIDateConverter = FactSet.SDK.AxiomaEquityOptimizer.Client.OpenAPIDateConverter;

namespace FactSet.SDK.AxiomaEquityOptimizer.Model
{
    /// <summary>
    /// OptimizerStrategy
    /// </summary>
    [DataContract(Name = "OptimizerStrategy")]
    public partial class OptimizerStrategy : IEquatable<OptimizerStrategy>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="OptimizerStrategy" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected OptimizerStrategy() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="OptimizerStrategy" /> class.
        /// </summary>
        /// <param name="id">OptimizerStrategy document path (required).</param>
        /// <param name="overrides">overrides.</param>
        public OptimizerStrategy(string id = default(string), OptimizerStrategyOverrides overrides = default(OptimizerStrategyOverrides))
        {
            // to ensure "id" is required (not null)
            if (id == null) {
                throw new ArgumentNullException("id is a required property for OptimizerStrategy and cannot be null");
            }
            this.Id = id;
            this.Overrides = overrides;
        }

        /// <summary>
        /// OptimizerStrategy document path
        /// </summary>
        /// <value>OptimizerStrategy document path</value>
        [DataMember(Name = "id", IsRequired = true, EmitDefaultValue = false)]
        public string Id { get; set; }

        /// <summary>
        /// Gets or Sets Overrides
        /// </summary>
        [DataMember(Name = "overrides", EmitDefaultValue = false)]
        public OptimizerStrategyOverrides Overrides { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class OptimizerStrategy {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Overrides: ").Append(Overrides).Append("\n");
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
            return this.Equals(input as OptimizerStrategy);
        }

        /// <summary>
        /// Returns true if OptimizerStrategy instances are equal
        /// </summary>
        /// <param name="input">Instance of OptimizerStrategy to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(OptimizerStrategy input)
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
                    this.Overrides == input.Overrides ||
                    (this.Overrides != null &&
                    this.Overrides.Equals(input.Overrides))
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
                if (this.Overrides != null)
                {
                    hashCode = (hashCode * 59) + this.Overrides.GetHashCode();
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
