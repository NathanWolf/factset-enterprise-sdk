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
    /// Market-related notation selection. See endpoint &#x60;/basic/market/list&#x60; for valid values.
    /// </summary>
    [DataContract(Name = "_notation_searchByText_data_validation_market")]
    public partial class NotationSearchByTextDataValidationMarket : IEquatable<NotationSearchByTextDataValidationMarket>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="NotationSearchByTextDataValidationMarket" /> class.
        /// </summary>
        /// <param name="selection">selection.</param>
        /// <param name="priority">priority.</param>
        public NotationSearchByTextDataValidationMarket(NotationSearchByTextDataValidationMarketSelection selection = default(NotationSearchByTextDataValidationMarketSelection), NotationSearchByTextDataValidationMarketPriority priority = default(NotationSearchByTextDataValidationMarketPriority))
        {
            this.Selection = selection;
            this.Priority = priority;
        }

        /// <summary>
        /// Gets or Sets Selection
        /// </summary>
        [DataMember(Name = "selection", EmitDefaultValue = false)]
        public NotationSearchByTextDataValidationMarketSelection Selection { get; set; }

        /// <summary>
        /// Gets or Sets Priority
        /// </summary>
        [DataMember(Name = "priority", EmitDefaultValue = false)]
        public NotationSearchByTextDataValidationMarketPriority Priority { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class NotationSearchByTextDataValidationMarket {\n");
            sb.Append("  Selection: ").Append(Selection).Append("\n");
            sb.Append("  Priority: ").Append(Priority).Append("\n");
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
            return this.Equals(input as NotationSearchByTextDataValidationMarket);
        }

        /// <summary>
        /// Returns true if NotationSearchByTextDataValidationMarket instances are equal
        /// </summary>
        /// <param name="input">Instance of NotationSearchByTextDataValidationMarket to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(NotationSearchByTextDataValidationMarket input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Selection == input.Selection ||
                    (this.Selection != null &&
                    this.Selection.Equals(input.Selection))
                ) && 
                (
                    this.Priority == input.Priority ||
                    (this.Priority != null &&
                    this.Priority.Equals(input.Priority))
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
                if (this.Selection != null)
                    hashCode = hashCode * 59 + this.Selection.GetHashCode();
                if (this.Priority != null)
                    hashCode = hashCode * 59 + this.Priority.GetHashCode();
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
