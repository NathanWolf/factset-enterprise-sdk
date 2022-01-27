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
    /// Parameters related to the presence and age of the most recent trade price.
    /// </summary>
    [DataContract(Name = "_notation_searchByText_data_validation_prices_latest")]
    public partial class NotationSearchByTextDataValidationPricesLatest : IEquatable<NotationSearchByTextDataValidationPricesLatest>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="NotationSearchByTextDataValidationPricesLatest" /> class.
        /// </summary>
        /// <param name="availableOnly">If &#x60;true&#x60;, only notations for which a trade price (even an outdated one) is available will be returned..</param>
        /// <param name="minimumDate">Earliest admissible date of the most recent trade price..</param>
        public NotationSearchByTextDataValidationPricesLatest(bool availableOnly = default(bool), DateTime minimumDate = default(DateTime))
        {
            this.AvailableOnly = availableOnly;
            this.MinimumDate = minimumDate;
        }

        /// <summary>
        /// If &#x60;true&#x60;, only notations for which a trade price (even an outdated one) is available will be returned.
        /// </summary>
        /// <value>If &#x60;true&#x60;, only notations for which a trade price (even an outdated one) is available will be returned.</value>
        [DataMember(Name = "availableOnly", EmitDefaultValue = true)]
        public bool AvailableOnly { get; set; }

        /// <summary>
        /// Earliest admissible date of the most recent trade price.
        /// </summary>
        /// <value>Earliest admissible date of the most recent trade price.</value>
        [DataMember(Name = "minimumDate", EmitDefaultValue = false)]
        [JsonConverter(typeof(OpenAPIDateConverter))]
        public DateTime MinimumDate { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class NotationSearchByTextDataValidationPricesLatest {\n");
            sb.Append("  AvailableOnly: ").Append(AvailableOnly).Append("\n");
            sb.Append("  MinimumDate: ").Append(MinimumDate).Append("\n");
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
            return this.Equals(input as NotationSearchByTextDataValidationPricesLatest);
        }

        /// <summary>
        /// Returns true if NotationSearchByTextDataValidationPricesLatest instances are equal
        /// </summary>
        /// <param name="input">Instance of NotationSearchByTextDataValidationPricesLatest to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(NotationSearchByTextDataValidationPricesLatest input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.AvailableOnly == input.AvailableOnly ||
                    this.AvailableOnly.Equals(input.AvailableOnly)
                ) && 
                (
                    this.MinimumDate == input.MinimumDate ||
                    (this.MinimumDate != null &&
                    this.MinimumDate.Equals(input.MinimumDate))
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
                hashCode = hashCode * 59 + this.AvailableOnly.GetHashCode();
                if (this.MinimumDate != null)
                    hashCode = hashCode * 59 + this.MinimumDate.GetHashCode();
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
