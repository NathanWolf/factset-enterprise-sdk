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
    /// The minimum of the range, or &#x60;null&#x60; to indicate that there is no minimum.
    /// </summary>
    [DataContract(Name = "_debtInstrument_notation_screener_search_data_coupon_currentInterestRate_value_minimum")]
    public partial class DebtInstrumentNotationScreenerSearchDataCouponCurrentInterestRateValueMinimum : IEquatable<DebtInstrumentNotationScreenerSearchDataCouponCurrentInterestRateValueMinimum>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="DebtInstrumentNotationScreenerSearchDataCouponCurrentInterestRateValueMinimum" /> class.
        /// </summary>
        /// <param name="value">The minimum value..</param>
        /// <param name="inclusive">Indicates whether the minimum value is included in the range or not. (default to true).</param>
        public DebtInstrumentNotationScreenerSearchDataCouponCurrentInterestRateValueMinimum(decimal value = default(decimal), bool inclusive = true)
        {
            this.Value = value;
            this.Inclusive = inclusive;
        }

        /// <summary>
        /// The minimum value.
        /// </summary>
        /// <value>The minimum value.</value>
        [DataMember(Name = "value", EmitDefaultValue = false)]
        public decimal Value { get; set; }

        /// <summary>
        /// Indicates whether the minimum value is included in the range or not.
        /// </summary>
        /// <value>Indicates whether the minimum value is included in the range or not.</value>
        [DataMember(Name = "inclusive", EmitDefaultValue = true)]
        public bool Inclusive { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class DebtInstrumentNotationScreenerSearchDataCouponCurrentInterestRateValueMinimum {\n");
            sb.Append("  Value: ").Append(Value).Append("\n");
            sb.Append("  Inclusive: ").Append(Inclusive).Append("\n");
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
            return this.Equals(input as DebtInstrumentNotationScreenerSearchDataCouponCurrentInterestRateValueMinimum);
        }

        /// <summary>
        /// Returns true if DebtInstrumentNotationScreenerSearchDataCouponCurrentInterestRateValueMinimum instances are equal
        /// </summary>
        /// <param name="input">Instance of DebtInstrumentNotationScreenerSearchDataCouponCurrentInterestRateValueMinimum to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(DebtInstrumentNotationScreenerSearchDataCouponCurrentInterestRateValueMinimum input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Value == input.Value ||
                    this.Value.Equals(input.Value)
                ) && 
                (
                    this.Inclusive == input.Inclusive ||
                    this.Inclusive.Equals(input.Inclusive)
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
                hashCode = hashCode * 59 + this.Value.GetHashCode();
                hashCode = hashCode * 59 + this.Inclusive.GetHashCode();
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
