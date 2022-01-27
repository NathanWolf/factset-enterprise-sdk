/*
 * Publisher API
 *
 * Allow clients to fetch Publisher Analytics through APIs.
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
using OpenAPIDateConverter = FactSet.SDK.Publisher.Client.OpenAPIDateConverter;

namespace FactSet.SDK.Publisher.Model
{
    /// <summary>
    /// Calculation
    /// </summary>
    [DataContract(Name = "Calculation")]
    public partial class Calculation : IEquatable<Calculation>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="Calculation" /> class.
        /// </summary>
        /// <param name="pa">List of PA calculation parameters..</param>
        /// <param name="spar">List of SPAR calculation parameters..</param>
        /// <param name="vault">List of Vault calculation parameters..</param>
        /// <param name="pub">List of Publisher calculation parameters..</param>
        public Calculation(Dictionary<string, PACalculationParameters> pa = default(Dictionary<string, PACalculationParameters>), Dictionary<string, SPARCalculationParameters> spar = default(Dictionary<string, SPARCalculationParameters>), Dictionary<string, VaultCalculationParameters> vault = default(Dictionary<string, VaultCalculationParameters>), Dictionary<string, PubCalculationParameters> pub = default(Dictionary<string, PubCalculationParameters>))
        {
            this.Pa = pa;
            this.Spar = spar;
            this.Vault = vault;
            this.Pub = pub;
        }

        /// <summary>
        /// List of PA calculation parameters.
        /// </summary>
        /// <value>List of PA calculation parameters.</value>
        [DataMember(Name = "pa", EmitDefaultValue = false)]
        public Dictionary<string, PACalculationParameters> Pa { get; set; }

        /// <summary>
        /// List of SPAR calculation parameters.
        /// </summary>
        /// <value>List of SPAR calculation parameters.</value>
        [DataMember(Name = "spar", EmitDefaultValue = false)]
        public Dictionary<string, SPARCalculationParameters> Spar { get; set; }

        /// <summary>
        /// List of Vault calculation parameters.
        /// </summary>
        /// <value>List of Vault calculation parameters.</value>
        [DataMember(Name = "vault", EmitDefaultValue = false)]
        public Dictionary<string, VaultCalculationParameters> Vault { get; set; }

        /// <summary>
        /// List of Publisher calculation parameters.
        /// </summary>
        /// <value>List of Publisher calculation parameters.</value>
        [DataMember(Name = "pub", EmitDefaultValue = false)]
        public Dictionary<string, PubCalculationParameters> Pub { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class Calculation {\n");
            sb.Append("  Pa: ").Append(Pa).Append("\n");
            sb.Append("  Spar: ").Append(Spar).Append("\n");
            sb.Append("  Vault: ").Append(Vault).Append("\n");
            sb.Append("  Pub: ").Append(Pub).Append("\n");
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
            return this.Equals(input as Calculation);
        }

        /// <summary>
        /// Returns true if Calculation instances are equal
        /// </summary>
        /// <param name="input">Instance of Calculation to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Calculation input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Pa == input.Pa ||
                    this.Pa != null &&
                    input.Pa != null &&
                    this.Pa.SequenceEqual(input.Pa)
                ) && 
                (
                    this.Spar == input.Spar ||
                    this.Spar != null &&
                    input.Spar != null &&
                    this.Spar.SequenceEqual(input.Spar)
                ) && 
                (
                    this.Vault == input.Vault ||
                    this.Vault != null &&
                    input.Vault != null &&
                    this.Vault.SequenceEqual(input.Vault)
                ) && 
                (
                    this.Pub == input.Pub ||
                    this.Pub != null &&
                    input.Pub != null &&
                    this.Pub.SequenceEqual(input.Pub)
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
                if (this.Pa != null)
                    hashCode = hashCode * 59 + this.Pa.GetHashCode();
                if (this.Spar != null)
                    hashCode = hashCode * 59 + this.Spar.GetHashCode();
                if (this.Vault != null)
                    hashCode = hashCode * 59 + this.Vault.GetHashCode();
                if (this.Pub != null)
                    hashCode = hashCode * 59 + this.Pub.GetHashCode();
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
