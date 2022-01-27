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
using OpenAPIDateConverter = FactSet.SDK.StocksAPIforDigitalPortals.Client.OpenAPIDateConverter;

namespace FactSet.SDK.StocksAPIforDigitalPortals.Model
{
    /// <summary>
    /// Earnings per share (EPS), which is ratio of the net income, divided by the shares outstanding. For European equities, EPS is adjusted for exceptional and any non-recurring items. For Asian equities, EPS is as reported (as per local accounting standards). For US, Canada &amp; South Africa, EPS reflects the analysts’ and company’s standards.
    /// </summary>
    [DataContract(Name = "_stock_notation_screener_search_data_currencyDependentEstimates_perShare_earnings")]
    public partial class StockNotationScreenerSearchDataCurrencyDependentEstimatesPerShareEarnings : IEquatable<StockNotationScreenerSearchDataCurrencyDependentEstimatesPerShareEarnings>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="StockNotationScreenerSearchDataCurrencyDependentEstimatesPerShareEarnings" /> class.
        /// </summary>
        /// <param name="mean">mean.</param>
        public StockNotationScreenerSearchDataCurrencyDependentEstimatesPerShareEarnings(StockNotationScreenerSearchDataCurrencyDependentEstimatesEbitMean mean = default(StockNotationScreenerSearchDataCurrencyDependentEstimatesEbitMean))
        {
            this.Mean = mean;
        }

        /// <summary>
        /// Gets or Sets Mean
        /// </summary>
        [DataMember(Name = "mean", EmitDefaultValue = false)]
        public StockNotationScreenerSearchDataCurrencyDependentEstimatesEbitMean Mean { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class StockNotationScreenerSearchDataCurrencyDependentEstimatesPerShareEarnings {\n");
            sb.Append("  Mean: ").Append(Mean).Append("\n");
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
            return this.Equals(input as StockNotationScreenerSearchDataCurrencyDependentEstimatesPerShareEarnings);
        }

        /// <summary>
        /// Returns true if StockNotationScreenerSearchDataCurrencyDependentEstimatesPerShareEarnings instances are equal
        /// </summary>
        /// <param name="input">Instance of StockNotationScreenerSearchDataCurrencyDependentEstimatesPerShareEarnings to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(StockNotationScreenerSearchDataCurrencyDependentEstimatesPerShareEarnings input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Mean == input.Mean ||
                    (this.Mean != null &&
                    this.Mean.Equals(input.Mean))
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
                if (this.Mean != null)
                    hashCode = hashCode * 59 + this.Mean.GetHashCode();
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
