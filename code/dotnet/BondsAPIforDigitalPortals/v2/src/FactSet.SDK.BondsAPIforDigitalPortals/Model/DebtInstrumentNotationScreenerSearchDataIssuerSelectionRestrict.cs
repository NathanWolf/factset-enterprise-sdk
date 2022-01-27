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
    /// Restriction list. Only debt instruments issued by an issuer in the provided list are returned.
    /// </summary>
    [DataContract(Name = "_debtInstrument_notation_screener_search_data_issuer_selection_restrict")]
    public partial class DebtInstrumentNotationScreenerSearchDataIssuerSelectionRestrict : IEquatable<DebtInstrumentNotationScreenerSearchDataIssuerSelectionRestrict>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="DebtInstrumentNotationScreenerSearchDataIssuerSelectionRestrict" /> class.
        /// </summary>
        /// <param name="ids">Set of identifiers of legal entities in the role of an issuer..</param>
        public DebtInstrumentNotationScreenerSearchDataIssuerSelectionRestrict(List<decimal> ids = default(List<decimal>))
        {
            this.Ids = ids;
        }

        /// <summary>
        /// Set of identifiers of legal entities in the role of an issuer.
        /// </summary>
        /// <value>Set of identifiers of legal entities in the role of an issuer.</value>
        [DataMember(Name = "ids", EmitDefaultValue = false)]
        public List<decimal> Ids { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class DebtInstrumentNotationScreenerSearchDataIssuerSelectionRestrict {\n");
            sb.Append("  Ids: ").Append(Ids).Append("\n");
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
            return this.Equals(input as DebtInstrumentNotationScreenerSearchDataIssuerSelectionRestrict);
        }

        /// <summary>
        /// Returns true if DebtInstrumentNotationScreenerSearchDataIssuerSelectionRestrict instances are equal
        /// </summary>
        /// <param name="input">Instance of DebtInstrumentNotationScreenerSearchDataIssuerSelectionRestrict to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(DebtInstrumentNotationScreenerSearchDataIssuerSelectionRestrict input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Ids == input.Ids ||
                    this.Ids != null &&
                    input.Ids != null &&
                    this.Ids.SequenceEqual(input.Ids)
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
                if (this.Ids != null)
                    hashCode = hashCode * 59 + this.Ids.GetHashCode();
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
