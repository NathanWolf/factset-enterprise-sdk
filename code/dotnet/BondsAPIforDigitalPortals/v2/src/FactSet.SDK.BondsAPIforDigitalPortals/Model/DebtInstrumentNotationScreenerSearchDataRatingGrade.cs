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
    /// Rating grade.
    /// </summary>
    [DataContract(Name = "_debtInstrument_notation_screener_search_data_rating_grade")]
    public partial class DebtInstrumentNotationScreenerSearchDataRatingGrade : IEquatable<DebtInstrumentNotationScreenerSearchDataRatingGrade>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="DebtInstrumentNotationScreenerSearchDataRatingGrade" /> class.
        /// </summary>
        /// <param name="minimum">minimum.</param>
        public DebtInstrumentNotationScreenerSearchDataRatingGrade(DebtInstrumentNotationScreenerSearchDataRatingGradeMinimum minimum = default(DebtInstrumentNotationScreenerSearchDataRatingGradeMinimum))
        {
            this.Minimum = minimum;
        }

        /// <summary>
        /// Gets or Sets Minimum
        /// </summary>
        [DataMember(Name = "minimum", EmitDefaultValue = false)]
        public DebtInstrumentNotationScreenerSearchDataRatingGradeMinimum Minimum { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class DebtInstrumentNotationScreenerSearchDataRatingGrade {\n");
            sb.Append("  Minimum: ").Append(Minimum).Append("\n");
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
            return this.Equals(input as DebtInstrumentNotationScreenerSearchDataRatingGrade);
        }

        /// <summary>
        /// Returns true if DebtInstrumentNotationScreenerSearchDataRatingGrade instances are equal
        /// </summary>
        /// <param name="input">Instance of DebtInstrumentNotationScreenerSearchDataRatingGrade to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(DebtInstrumentNotationScreenerSearchDataRatingGrade input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Minimum == input.Minimum ||
                    (this.Minimum != null &&
                    this.Minimum.Equals(input.Minimum))
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
                if (this.Minimum != null)
                    hashCode = hashCode * 59 + this.Minimum.GetHashCode();
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
