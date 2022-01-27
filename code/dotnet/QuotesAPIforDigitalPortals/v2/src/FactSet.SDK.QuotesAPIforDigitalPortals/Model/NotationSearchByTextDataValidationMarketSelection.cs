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
using OpenAPIDateConverter = FactSet.SDK.QuotesAPIforDigitalPortals.Client.OpenAPIDateConverter;

namespace FactSet.SDK.QuotesAPIforDigitalPortals.Model
{
    /// <summary>
    /// Market selection.
    /// </summary>
    [DataContract(Name = "_notation_searchByText_data_validation_market_selection")]
    public partial class NotationSearchByTextDataValidationMarketSelection : IEquatable<NotationSearchByTextDataValidationMarketSelection>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="NotationSearchByTextDataValidationMarketSelection" /> class.
        /// </summary>
        /// <param name="restrict">restrict.</param>
        /// <param name="exclude">exclude.</param>
        public NotationSearchByTextDataValidationMarketSelection(NotationSearchByTextDataValidationMarketSelectionRestrict restrict = default(NotationSearchByTextDataValidationMarketSelectionRestrict), NotationSearchByTextDataValidationMarketSelectionExclude exclude = default(NotationSearchByTextDataValidationMarketSelectionExclude))
        {
            this.Restrict = restrict;
            this.Exclude = exclude;
        }

        /// <summary>
        /// Gets or Sets Restrict
        /// </summary>
        [DataMember(Name = "restrict", EmitDefaultValue = false)]
        public NotationSearchByTextDataValidationMarketSelectionRestrict Restrict { get; set; }

        /// <summary>
        /// Gets or Sets Exclude
        /// </summary>
        [DataMember(Name = "exclude", EmitDefaultValue = false)]
        public NotationSearchByTextDataValidationMarketSelectionExclude Exclude { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class NotationSearchByTextDataValidationMarketSelection {\n");
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
            return this.Equals(input as NotationSearchByTextDataValidationMarketSelection);
        }

        /// <summary>
        /// Returns true if NotationSearchByTextDataValidationMarketSelection instances are equal
        /// </summary>
        /// <param name="input">Instance of NotationSearchByTextDataValidationMarketSelection to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(NotationSearchByTextDataValidationMarketSelection input)
        {
            if (input == null)
                return false;

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
                    hashCode = hashCode * 59 + this.Restrict.GetHashCode();
                if (this.Exclude != null)
                    hashCode = hashCode * 59 + this.Exclude.GetHashCode();
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
