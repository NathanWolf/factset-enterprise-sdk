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
    /// Instrument-level restriction or exclusion.
    /// </summary>
    [DataContract(Name = "_debtInstrument_notation_screener_search_data_validation_instrumentSelectionList")]
    public partial class DebtInstrumentNotationScreenerSearchDataValidationInstrumentSelectionList : IEquatable<DebtInstrumentNotationScreenerSearchDataValidationInstrumentSelectionList>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="DebtInstrumentNotationScreenerSearchDataValidationInstrumentSelectionList" /> class.
        /// </summary>
        /// <param name="restrict">restrict.</param>
        /// <param name="exclude">exclude.</param>
        public DebtInstrumentNotationScreenerSearchDataValidationInstrumentSelectionList(DebtInstrumentNotationScreenerSearchDataValidationInstrumentSelectionListRestrict restrict = default(DebtInstrumentNotationScreenerSearchDataValidationInstrumentSelectionListRestrict), DebtInstrumentNotationScreenerSearchDataValidationInstrumentSelectionListExclude exclude = default(DebtInstrumentNotationScreenerSearchDataValidationInstrumentSelectionListExclude))
        {
            this.Restrict = restrict;
            this.Exclude = exclude;
        }

        /// <summary>
        /// Gets or Sets Restrict
        /// </summary>
        [DataMember(Name = "restrict", EmitDefaultValue = false)]
        public DebtInstrumentNotationScreenerSearchDataValidationInstrumentSelectionListRestrict Restrict { get; set; }

        /// <summary>
        /// Gets or Sets Exclude
        /// </summary>
        [DataMember(Name = "exclude", EmitDefaultValue = false)]
        public DebtInstrumentNotationScreenerSearchDataValidationInstrumentSelectionListExclude Exclude { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class DebtInstrumentNotationScreenerSearchDataValidationInstrumentSelectionList {\n");
            sb.Append("  Restrict: ").Append(Restrict).Append("\n");
            sb.Append("  Exclude: ").Append(Exclude).Append("\n");
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
            return this.Equals(input as DebtInstrumentNotationScreenerSearchDataValidationInstrumentSelectionList);
        }

        /// <summary>
        /// Returns true if DebtInstrumentNotationScreenerSearchDataValidationInstrumentSelectionList instances are equal
        /// </summary>
        /// <param name="input">Instance of DebtInstrumentNotationScreenerSearchDataValidationInstrumentSelectionList to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(DebtInstrumentNotationScreenerSearchDataValidationInstrumentSelectionList input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Restrict == input.Restrict ||
                    (this.Restrict != null &&
                    this.Restrict.Equals(input.Restrict))
                ) && 
                (
                    this.Exclude == input.Exclude ||
                    (this.Exclude != null &&
                    this.Exclude.Equals(input.Exclude))
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
                if (this.Restrict != null)
                {
                    hashCode = (hashCode * 59) + this.Restrict.GetHashCode();
                }
                if (this.Exclude != null)
                {
                    hashCode = (hashCode * 59) + this.Exclude.GetHashCode();
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
