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
    /// Important dates of the debt instrument.
    /// </summary>
    [DataContract(Name = "inline_response_200_3_instrument_lifeCycle")]
    public partial class InlineResponse2003InstrumentLifeCycle : IEquatable<InlineResponse2003InstrumentLifeCycle>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse2003InstrumentLifeCycle" /> class.
        /// </summary>
        /// <param name="issue">Date of the issue..</param>
        /// <param name="maturity">maturity.</param>
        /// <param name="callable">If &#x60;true&#x60;, the issuer may redeem the instrument prior to maturity..</param>
        public InlineResponse2003InstrumentLifeCycle(DateTime issue = default(DateTime), InlineResponse2003InstrumentLifeCycleMaturity maturity = default(InlineResponse2003InstrumentLifeCycleMaturity), bool callable = default(bool))
        {
            this.Issue = issue;
            this.Maturity = maturity;
            this.Callable = callable;
        }

        /// <summary>
        /// Date of the issue.
        /// </summary>
        /// <value>Date of the issue.</value>
        [DataMember(Name = "issue", EmitDefaultValue = false)]
        [JsonConverter(typeof(OpenAPIDateConverter))]
        public DateTime Issue { get; set; }

        /// <summary>
        /// Gets or Sets Maturity
        /// </summary>
        [DataMember(Name = "maturity", EmitDefaultValue = false)]
        public InlineResponse2003InstrumentLifeCycleMaturity Maturity { get; set; }

        /// <summary>
        /// If &#x60;true&#x60;, the issuer may redeem the instrument prior to maturity.
        /// </summary>
        /// <value>If &#x60;true&#x60;, the issuer may redeem the instrument prior to maturity.</value>
        [DataMember(Name = "callable", EmitDefaultValue = true)]
        public bool Callable { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class InlineResponse2003InstrumentLifeCycle {\n");
            sb.Append("  Issue: ").Append(Issue).Append("\n");
            sb.Append("  Maturity: ").Append(Maturity).Append("\n");
            sb.Append("  Callable: ").Append(Callable).Append("\n");
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
            return this.Equals(input as InlineResponse2003InstrumentLifeCycle);
        }

        /// <summary>
        /// Returns true if InlineResponse2003InstrumentLifeCycle instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse2003InstrumentLifeCycle to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse2003InstrumentLifeCycle input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Issue == input.Issue ||
                    (this.Issue != null &&
                    this.Issue.Equals(input.Issue))
                ) && 
                (
                    this.Maturity == input.Maturity ||
                    (this.Maturity != null &&
                    this.Maturity.Equals(input.Maturity))
                ) && 
                (
                    this.Callable == input.Callable ||
                    this.Callable.Equals(input.Callable)
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
                if (this.Issue != null)
                    hashCode = hashCode * 59 + this.Issue.GetHashCode();
                if (this.Maturity != null)
                    hashCode = hashCode * 59 + this.Maturity.GetHashCode();
                hashCode = hashCode * 59 + this.Callable.GetHashCode();
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
