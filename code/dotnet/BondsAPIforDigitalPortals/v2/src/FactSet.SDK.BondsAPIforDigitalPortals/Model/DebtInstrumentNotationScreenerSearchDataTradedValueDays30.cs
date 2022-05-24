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
    /// Cash flow for the time range 30 trading days.
    /// </summary>
    [DataContract(Name = "_debtInstrument_notation_screener_search_data_tradedValue_days30")]
    public partial class DebtInstrumentNotationScreenerSearchDataTradedValueDays30 : IEquatable<DebtInstrumentNotationScreenerSearchDataTradedValueDays30>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="DebtInstrumentNotationScreenerSearchDataTradedValueDays30" /> class.
        /// </summary>
        /// <param name="sum">sum.</param>
        /// <param name="average">average.</param>
        public DebtInstrumentNotationScreenerSearchDataTradedValueDays30(DebtInstrumentNotationScreenerSearchDataTradedValueDays30Sum sum = default(DebtInstrumentNotationScreenerSearchDataTradedValueDays30Sum), DebtInstrumentNotationScreenerSearchDataTradedValueDays30Average average = default(DebtInstrumentNotationScreenerSearchDataTradedValueDays30Average))
        {
            this.Sum = sum;
            this.Average = average;
        }

        /// <summary>
        /// Gets or Sets Sum
        /// </summary>
        [DataMember(Name = "sum", EmitDefaultValue = false)]
        public DebtInstrumentNotationScreenerSearchDataTradedValueDays30Sum Sum { get; set; }

        /// <summary>
        /// Gets or Sets Average
        /// </summary>
        [DataMember(Name = "average", EmitDefaultValue = false)]
        public DebtInstrumentNotationScreenerSearchDataTradedValueDays30Average Average { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class DebtInstrumentNotationScreenerSearchDataTradedValueDays30 {\n");
            sb.Append("  Sum: ").Append(Sum).Append("\n");
            sb.Append("  Average: ").Append(Average).Append("\n");
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
            return this.Equals(input as DebtInstrumentNotationScreenerSearchDataTradedValueDays30);
        }

        /// <summary>
        /// Returns true if DebtInstrumentNotationScreenerSearchDataTradedValueDays30 instances are equal
        /// </summary>
        /// <param name="input">Instance of DebtInstrumentNotationScreenerSearchDataTradedValueDays30 to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(DebtInstrumentNotationScreenerSearchDataTradedValueDays30 input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Sum == input.Sum ||
                    (this.Sum != null &&
                    this.Sum.Equals(input.Sum))
                ) && 
                (
                    this.Average == input.Average ||
                    (this.Average != null &&
                    this.Average.Equals(input.Average))
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
                if (this.Sum != null)
                {
                    hashCode = (hashCode * 59) + this.Sum.GetHashCode();
                }
                if (this.Average != null)
                {
                    hashCode = (hashCode * 59) + this.Average.GetHashCode();
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
