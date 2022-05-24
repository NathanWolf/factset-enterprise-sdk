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
    /// Minimum rating grade requirements for the issuers or their debt instruments. In either case, only one identifier per rating system is allowed. See endpoint &#x60;/rating/grade/listBySystem&#x60; for valid values.
    /// </summary>
    [DataContract(Name = "_debtInstrument_issuer_search_data_minimumRatingGrade")]
    public partial class DebtInstrumentIssuerSearchDataMinimumRatingGrade : IEquatable<DebtInstrumentIssuerSearchDataMinimumRatingGrade>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="DebtInstrumentIssuerSearchDataMinimumRatingGrade" /> class.
        /// </summary>
        /// <param name="debtInstrument">debtInstrument.</param>
        public DebtInstrumentIssuerSearchDataMinimumRatingGrade(DebtInstrumentIssuerSearchDataMinimumRatingGradeDebtInstrument debtInstrument = default(DebtInstrumentIssuerSearchDataMinimumRatingGradeDebtInstrument))
        {
            this.DebtInstrument = debtInstrument;
        }

        /// <summary>
        /// Gets or Sets DebtInstrument
        /// </summary>
        [DataMember(Name = "debtInstrument", EmitDefaultValue = false)]
        public DebtInstrumentIssuerSearchDataMinimumRatingGradeDebtInstrument DebtInstrument { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class DebtInstrumentIssuerSearchDataMinimumRatingGrade {\n");
            sb.Append("  DebtInstrument: ").Append(DebtInstrument).Append("\n");
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
            return this.Equals(input as DebtInstrumentIssuerSearchDataMinimumRatingGrade);
        }

        /// <summary>
        /// Returns true if DebtInstrumentIssuerSearchDataMinimumRatingGrade instances are equal
        /// </summary>
        /// <param name="input">Instance of DebtInstrumentIssuerSearchDataMinimumRatingGrade to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(DebtInstrumentIssuerSearchDataMinimumRatingGrade input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.DebtInstrument == input.DebtInstrument ||
                    (this.DebtInstrument != null &&
                    this.DebtInstrument.Equals(input.DebtInstrument))
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
                if (this.DebtInstrument != null)
                {
                    hashCode = (hashCode * 59) + this.DebtInstrument.GetHashCode();
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
