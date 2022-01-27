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
    /// Compliance properties in accordance with the German law.
    /// </summary>
    [DataContract(Name = "inline_response_200_3_instrument_compliance_germany")]
    public partial class InlineResponse2003InstrumentComplianceGermany : IEquatable<InlineResponse2003InstrumentComplianceGermany>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse2003InstrumentComplianceGermany" /> class.
        /// </summary>
        /// <param name="trusteeEligible">If &#x60;true&#x60;, the debt instrument is eligible for investments by trustees according to §§1806ff of the BGB (German Civil Code). The German legislative has declared it to be virtually free of the risk of loss, such as government and state bonds. Eligible are primarily German debt instruments..</param>
        public InlineResponse2003InstrumentComplianceGermany(bool trusteeEligible = default(bool))
        {
            this.TrusteeEligible = trusteeEligible;
        }

        /// <summary>
        /// If &#x60;true&#x60;, the debt instrument is eligible for investments by trustees according to §§1806ff of the BGB (German Civil Code). The German legislative has declared it to be virtually free of the risk of loss, such as government and state bonds. Eligible are primarily German debt instruments.
        /// </summary>
        /// <value>If &#x60;true&#x60;, the debt instrument is eligible for investments by trustees according to §§1806ff of the BGB (German Civil Code). The German legislative has declared it to be virtually free of the risk of loss, such as government and state bonds. Eligible are primarily German debt instruments.</value>
        [DataMember(Name = "trusteeEligible", EmitDefaultValue = true)]
        public bool TrusteeEligible { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class InlineResponse2003InstrumentComplianceGermany {\n");
            sb.Append("  TrusteeEligible: ").Append(TrusteeEligible).Append("\n");
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
            return this.Equals(input as InlineResponse2003InstrumentComplianceGermany);
        }

        /// <summary>
        /// Returns true if InlineResponse2003InstrumentComplianceGermany instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse2003InstrumentComplianceGermany to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse2003InstrumentComplianceGermany input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.TrusteeEligible == input.TrusteeEligible ||
                    this.TrusteeEligible.Equals(input.TrusteeEligible)
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
                hashCode = hashCode * 59 + this.TrusteeEligible.GetHashCode();
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
