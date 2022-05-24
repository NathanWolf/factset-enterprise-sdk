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
    /// Parameters related to the yield.
    /// </summary>
    [DataContract(Name = "_debtInstrument_notation_screener_search_data_yield")]
    public partial class DebtInstrumentNotationScreenerSearchDataYield : IEquatable<DebtInstrumentNotationScreenerSearchDataYield>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="DebtInstrumentNotationScreenerSearchDataYield" /> class.
        /// </summary>
        /// <param name="current">current.</param>
        /// <param name="toMaturity">toMaturity.</param>
        /// <param name="spread">spread.</param>
        public DebtInstrumentNotationScreenerSearchDataYield(DebtInstrumentNotationScreenerSearchDataYieldCurrent current = default(DebtInstrumentNotationScreenerSearchDataYieldCurrent), DebtInstrumentNotationScreenerSearchDataYieldToMaturity toMaturity = default(DebtInstrumentNotationScreenerSearchDataYieldToMaturity), DebtInstrumentNotationScreenerSearchDataYieldSpread spread = default(DebtInstrumentNotationScreenerSearchDataYieldSpread))
        {
            this.Current = current;
            this.ToMaturity = toMaturity;
            this.Spread = spread;
        }

        /// <summary>
        /// Gets or Sets Current
        /// </summary>
        [DataMember(Name = "current", EmitDefaultValue = false)]
        public DebtInstrumentNotationScreenerSearchDataYieldCurrent Current { get; set; }

        /// <summary>
        /// Gets or Sets ToMaturity
        /// </summary>
        [DataMember(Name = "toMaturity", EmitDefaultValue = false)]
        public DebtInstrumentNotationScreenerSearchDataYieldToMaturity ToMaturity { get; set; }

        /// <summary>
        /// Gets or Sets Spread
        /// </summary>
        [DataMember(Name = "spread", EmitDefaultValue = false)]
        public DebtInstrumentNotationScreenerSearchDataYieldSpread Spread { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class DebtInstrumentNotationScreenerSearchDataYield {\n");
            sb.Append("  Current: ").Append(Current).Append("\n");
            sb.Append("  ToMaturity: ").Append(ToMaturity).Append("\n");
            sb.Append("  Spread: ").Append(Spread).Append("\n");
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
            return this.Equals(input as DebtInstrumentNotationScreenerSearchDataYield);
        }

        /// <summary>
        /// Returns true if DebtInstrumentNotationScreenerSearchDataYield instances are equal
        /// </summary>
        /// <param name="input">Instance of DebtInstrumentNotationScreenerSearchDataYield to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(DebtInstrumentNotationScreenerSearchDataYield input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Current == input.Current ||
                    (this.Current != null &&
                    this.Current.Equals(input.Current))
                ) && 
                (
                    this.ToMaturity == input.ToMaturity ||
                    (this.ToMaturity != null &&
                    this.ToMaturity.Equals(input.ToMaturity))
                ) && 
                (
                    this.Spread == input.Spread ||
                    (this.Spread != null &&
                    this.Spread.Equals(input.Spread))
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
                if (this.Current != null)
                {
                    hashCode = (hashCode * 59) + this.Current.GetHashCode();
                }
                if (this.ToMaturity != null)
                {
                    hashCode = (hashCode * 59) + this.ToMaturity.GetHashCode();
                }
                if (this.Spread != null)
                {
                    hashCode = (hashCode * 59) + this.Spread.GetHashCode();
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
