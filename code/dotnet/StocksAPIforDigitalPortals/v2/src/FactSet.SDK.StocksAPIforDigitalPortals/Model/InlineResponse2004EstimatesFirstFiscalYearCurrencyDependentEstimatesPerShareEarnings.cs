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
    [DataContract(Name = "inline_response_200_4_estimates_firstFiscalYear_currencyDependentEstimates_perShare_earnings")]
    public partial class InlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimatesPerShareEarnings : IEquatable<InlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimatesPerShareEarnings>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimatesPerShareEarnings" /> class.
        /// </summary>
        /// <param name="mean">Mean value..</param>
        public InlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimatesPerShareEarnings(decimal mean = default(decimal))
        {
            this.Mean = mean;
        }

        /// <summary>
        /// Mean value.
        /// </summary>
        /// <value>Mean value.</value>
        [DataMember(Name = "mean", EmitDefaultValue = false)]
        public decimal Mean { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class InlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimatesPerShareEarnings {\n");
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
            return this.Equals(input as InlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimatesPerShareEarnings);
        }

        /// <summary>
        /// Returns true if InlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimatesPerShareEarnings instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimatesPerShareEarnings to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimatesPerShareEarnings input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Mean == input.Mean ||
                    this.Mean.Equals(input.Mean)
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
                hashCode = (hashCode * 59) + this.Mean.GetHashCode();
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
