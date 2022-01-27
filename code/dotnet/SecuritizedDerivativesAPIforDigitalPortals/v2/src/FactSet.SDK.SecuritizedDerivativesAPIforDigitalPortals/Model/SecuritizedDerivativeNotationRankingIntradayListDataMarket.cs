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
using OpenAPIDateConverter = FactSet.SDK.SecuritizedDerivativesAPIforDigitalPortals.Client.OpenAPIDateConverter;

namespace FactSet.SDK.SecuritizedDerivativesAPIforDigitalPortals.Model
{
    /// <summary>
    /// Market-related parameters. See endpoint &#x60;/basic/market/list&#x60; for valid values.
    /// </summary>
    [DataContract(Name = "_securitizedDerivative_notation_ranking_intraday_list_data_market")]
    public partial class SecuritizedDerivativeNotationRankingIntradayListDataMarket : IEquatable<SecuritizedDerivativeNotationRankingIntradayListDataMarket>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="SecuritizedDerivativeNotationRankingIntradayListDataMarket" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected SecuritizedDerivativeNotationRankingIntradayListDataMarket() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="SecuritizedDerivativeNotationRankingIntradayListDataMarket" /> class.
        /// </summary>
        /// <param name="ids">List of market identifiers. Only securitized derivatives that are traded on a market in the provided list are returned. The list restricts the request to only those markets. (required).</param>
        public SecuritizedDerivativeNotationRankingIntradayListDataMarket(List<decimal> ids = default(List<decimal>))
        {
            // to ensure "ids" is required (not null)
            if (ids == null) {
                throw new ArgumentNullException("ids is a required property for SecuritizedDerivativeNotationRankingIntradayListDataMarket and cannot be null");
            }
            this.Ids = ids;
        }

        /// <summary>
        /// List of market identifiers. Only securitized derivatives that are traded on a market in the provided list are returned. The list restricts the request to only those markets.
        /// </summary>
        /// <value>List of market identifiers. Only securitized derivatives that are traded on a market in the provided list are returned. The list restricts the request to only those markets.</value>
        [DataMember(Name = "ids", IsRequired = true, EmitDefaultValue = false)]
        public List<decimal> Ids { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class SecuritizedDerivativeNotationRankingIntradayListDataMarket {\n");
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
            return this.Equals(input as SecuritizedDerivativeNotationRankingIntradayListDataMarket);
        }

        /// <summary>
        /// Returns true if SecuritizedDerivativeNotationRankingIntradayListDataMarket instances are equal
        /// </summary>
        /// <param name="input">Instance of SecuritizedDerivativeNotationRankingIntradayListDataMarket to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(SecuritizedDerivativeNotationRankingIntradayListDataMarket input)
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
