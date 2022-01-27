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
    [DataContract(Name = "_debtInstrument_notation_screener_search_data_compliance_germany")]
    public partial class DebtInstrumentNotationScreenerSearchDataComplianceGermany : IEquatable<DebtInstrumentNotationScreenerSearchDataComplianceGermany>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="DebtInstrumentNotationScreenerSearchDataComplianceGermany" /> class.
        /// </summary>
        /// <param name="trusteeEligible">Defines whether or not the debt instruments are eligible for investment by trustees according to §§1806ff of the BGB (German Civil Code). The German legislative has declared such debt instruments to be virtually free of the risk of loss, such as government and state bonds. Eligible are primarily German debt instruments..</param>
        public DebtInstrumentNotationScreenerSearchDataComplianceGermany(bool trusteeEligible = default(bool))
        {
            this.TrusteeEligible = trusteeEligible;
        }

        /// <summary>
        /// Defines whether or not the debt instruments are eligible for investment by trustees according to §§1806ff of the BGB (German Civil Code). The German legislative has declared such debt instruments to be virtually free of the risk of loss, such as government and state bonds. Eligible are primarily German debt instruments.
        /// </summary>
        /// <value>Defines whether or not the debt instruments are eligible for investment by trustees according to §§1806ff of the BGB (German Civil Code). The German legislative has declared such debt instruments to be virtually free of the risk of loss, such as government and state bonds. Eligible are primarily German debt instruments.</value>
        [DataMember(Name = "trusteeEligible", EmitDefaultValue = true)]
        public bool TrusteeEligible { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class DebtInstrumentNotationScreenerSearchDataComplianceGermany {\n");
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
            return this.Equals(input as DebtInstrumentNotationScreenerSearchDataComplianceGermany);
        }

        /// <summary>
        /// Returns true if DebtInstrumentNotationScreenerSearchDataComplianceGermany instances are equal
        /// </summary>
        /// <param name="input">Instance of DebtInstrumentNotationScreenerSearchDataComplianceGermany to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(DebtInstrumentNotationScreenerSearchDataComplianceGermany input)
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
