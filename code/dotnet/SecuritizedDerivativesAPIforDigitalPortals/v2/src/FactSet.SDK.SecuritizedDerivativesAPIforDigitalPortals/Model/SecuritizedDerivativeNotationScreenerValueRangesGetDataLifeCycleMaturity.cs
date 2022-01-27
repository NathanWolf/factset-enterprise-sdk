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
    /// Parameters related to the maturity.
    /// </summary>
    [DataContract(Name = "_securitizedDerivative_notation_screener_valueRanges_get_data_lifeCycle_maturity")]
    public partial class SecuritizedDerivativeNotationScreenerValueRangesGetDataLifeCycleMaturity : IEquatable<SecuritizedDerivativeNotationScreenerValueRangesGetDataLifeCycleMaturity>, IValidatableObject
    {
        /// <summary>
        /// Defines whether or not perpetual securitized derivatives, i.e. such that do not mature, are included in the result. The value &#x60;only&#x60; can be used if both parameters &#x60;maturity.restriction.date&#x60; and &#x60;maturity.restriction.remainingTermDays&#x60; are not set.
        /// </summary>
        /// <value>Defines whether or not perpetual securitized derivatives, i.e. such that do not mature, are included in the result. The value &#x60;only&#x60; can be used if both parameters &#x60;maturity.restriction.date&#x60; and &#x60;maturity.restriction.remainingTermDays&#x60; are not set.</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum PerpetualEnum
        {
            /// <summary>
            /// Enum Only for value: only
            /// </summary>
            [EnumMember(Value = "only")]
            Only = 1,

            /// <summary>
            /// Enum Include for value: include
            /// </summary>
            [EnumMember(Value = "include")]
            Include = 2,

            /// <summary>
            /// Enum Exclude for value: exclude
            /// </summary>
            [EnumMember(Value = "exclude")]
            Exclude = 3

        }


        /// <summary>
        /// Defines whether or not perpetual securitized derivatives, i.e. such that do not mature, are included in the result. The value &#x60;only&#x60; can be used if both parameters &#x60;maturity.restriction.date&#x60; and &#x60;maturity.restriction.remainingTermDays&#x60; are not set.
        /// </summary>
        /// <value>Defines whether or not perpetual securitized derivatives, i.e. such that do not mature, are included in the result. The value &#x60;only&#x60; can be used if both parameters &#x60;maturity.restriction.date&#x60; and &#x60;maturity.restriction.remainingTermDays&#x60; are not set.</value>
        [DataMember(Name = "perpetual", EmitDefaultValue = false)]
        public PerpetualEnum? Perpetual { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="SecuritizedDerivativeNotationScreenerValueRangesGetDataLifeCycleMaturity" /> class.
        /// </summary>
        /// <param name="restriction">restriction.</param>
        /// <param name="perpetual">Defines whether or not perpetual securitized derivatives, i.e. such that do not mature, are included in the result. The value &#x60;only&#x60; can be used if both parameters &#x60;maturity.restriction.date&#x60; and &#x60;maturity.restriction.remainingTermDays&#x60; are not set..</param>
        public SecuritizedDerivativeNotationScreenerValueRangesGetDataLifeCycleMaturity(SecuritizedDerivativeNotationScreenerValueRangesGetDataLifeCycleMaturityRestriction restriction = default(SecuritizedDerivativeNotationScreenerValueRangesGetDataLifeCycleMaturityRestriction), PerpetualEnum? perpetual = default(PerpetualEnum?))
        {
            this.Restriction = restriction;
            this.Perpetual = perpetual;
        }

        /// <summary>
        /// Gets or Sets Restriction
        /// </summary>
        [DataMember(Name = "restriction", EmitDefaultValue = false)]
        public SecuritizedDerivativeNotationScreenerValueRangesGetDataLifeCycleMaturityRestriction Restriction { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class SecuritizedDerivativeNotationScreenerValueRangesGetDataLifeCycleMaturity {\n");
            sb.Append("  Restriction: ").Append(Restriction).Append("\n");
            sb.Append("  Perpetual: ").Append(Perpetual).Append("\n");
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
            return this.Equals(input as SecuritizedDerivativeNotationScreenerValueRangesGetDataLifeCycleMaturity);
        }

        /// <summary>
        /// Returns true if SecuritizedDerivativeNotationScreenerValueRangesGetDataLifeCycleMaturity instances are equal
        /// </summary>
        /// <param name="input">Instance of SecuritizedDerivativeNotationScreenerValueRangesGetDataLifeCycleMaturity to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(SecuritizedDerivativeNotationScreenerValueRangesGetDataLifeCycleMaturity input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Restriction == input.Restriction ||
                    (this.Restriction != null &&
                    this.Restriction.Equals(input.Restriction))
                ) && 
                (
                    this.Perpetual == input.Perpetual ||
                    this.Perpetual.Equals(input.Perpetual)
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
                if (this.Restriction != null)
                    hashCode = hashCode * 59 + this.Restriction.GetHashCode();
                hashCode = hashCode * 59 + this.Perpetual.GetHashCode();
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
