/*
 * Engines API
 *
 * Allow clients to fetch Engines Analytics through APIs.
 *
 * The version of the OpenAPI document: 1
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
using OpenAPIDateConverter = FactSet.SDK.FactSetPortfolioOptimizer.Client.OpenAPIDateConverter;

namespace FactSet.SDK.FactSetPortfolioOptimizer.Model
{
    /// <summary>
    /// FPOAccount
    /// </summary>
    [DataContract(Name = "FPOAccount")]
    public partial class FPOAccount : IEquatable<FPOAccount>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="FPOAccount" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected FPOAccount() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="FPOAccount" /> class.
        /// </summary>
        /// <param name="padocument">padocument (required).</param>
        /// <param name="id">Account path.</param>
        /// <param name="overrides">overrides.</param>
        public FPOAccount(PaDoc padocument = default(PaDoc), string id = default(string), OptimizerAccountOverrides overrides = default(OptimizerAccountOverrides))
        {
            // to ensure "padocument" is required (not null)
            if (padocument == null) {
                throw new ArgumentNullException("padocument is a required property for FPOAccount and cannot be null");
            }
            this.Padocument = padocument;
            this.Id = id;
            this.Overrides = overrides;
        }

        /// <summary>
        /// Gets or Sets Padocument
        /// </summary>
        [DataMember(Name = "padocument", IsRequired = true, EmitDefaultValue = false)]
        public PaDoc Padocument { get; set; }

        /// <summary>
        /// Account path
        /// </summary>
        /// <value>Account path</value>
        [DataMember(Name = "id", EmitDefaultValue = false)]
        public string Id { get; set; }

        /// <summary>
        /// Gets or Sets Overrides
        /// </summary>
        [DataMember(Name = "overrides", EmitDefaultValue = false)]
        public OptimizerAccountOverrides Overrides { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class FPOAccount {\n");
            sb.Append("  Padocument: ").Append(Padocument).Append("\n");
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
            return this.Equals(input as FPOAccount);
        }

        /// <summary>
        /// Returns true if FPOAccount instances are equal
        /// </summary>
        /// <param name="input">Instance of FPOAccount to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(FPOAccount input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Padocument == input.Padocument ||
                    (this.Padocument != null &&
                    this.Padocument.Equals(input.Padocument))
                ) && 
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
                if (this.Padocument != null)
                    hashCode = hashCode * 59 + this.Padocument.GetHashCode();
                if (this.Id != null)
                    hashCode = hashCode * 59 + this.Id.GetHashCode();
                if (this.Overrides != null)
                    hashCode = hashCode * 59 + this.Overrides.GetHashCode();
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
