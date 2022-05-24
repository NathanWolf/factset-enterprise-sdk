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
    /// Estimates for the second most distant fiscal year that has been requested. If the parameters used in the request refer to data from two fiscals year, the respective data of the more distant one is found here.
    /// </summary>
    [DataContract(Name = "inline_response_200_4_estimates_secondFiscalYear")]
    public partial class InlineResponse2004EstimatesSecondFiscalYear : IEquatable<InlineResponse2004EstimatesSecondFiscalYear>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse2004EstimatesSecondFiscalYear" /> class.
        /// </summary>
        /// <param name="fiscalYear">fiscalYear.</param>
        /// <param name="currencyDependentEstimates">currencyDependentEstimates.</param>
        /// <param name="returnOnAssets">returnOnAssets.</param>
        /// <param name="returnOnEquity">returnOnEquity.</param>
        /// <param name="ratios">ratios.</param>
        public InlineResponse2004EstimatesSecondFiscalYear(InlineResponse2004EstimatesFirstFiscalYearFiscalYear fiscalYear = default(InlineResponse2004EstimatesFirstFiscalYearFiscalYear), InlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimates currencyDependentEstimates = default(InlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimates), InlineResponse2004EstimatesFirstFiscalYearReturnOnAssets returnOnAssets = default(InlineResponse2004EstimatesFirstFiscalYearReturnOnAssets), InlineResponse2004EstimatesFirstFiscalYearReturnOnEquity returnOnEquity = default(InlineResponse2004EstimatesFirstFiscalYearReturnOnEquity), InlineResponse2004EstimatesFirstFiscalYearRatios ratios = default(InlineResponse2004EstimatesFirstFiscalYearRatios))
        {
            this.FiscalYear = fiscalYear;
            this.CurrencyDependentEstimates = currencyDependentEstimates;
            this.ReturnOnAssets = returnOnAssets;
            this.ReturnOnEquity = returnOnEquity;
            this.Ratios = ratios;
        }

        /// <summary>
        /// Gets or Sets FiscalYear
        /// </summary>
        [DataMember(Name = "fiscalYear", EmitDefaultValue = false)]
        public InlineResponse2004EstimatesFirstFiscalYearFiscalYear FiscalYear { get; set; }

        /// <summary>
        /// Gets or Sets CurrencyDependentEstimates
        /// </summary>
        [DataMember(Name = "currencyDependentEstimates", EmitDefaultValue = false)]
        public InlineResponse2004EstimatesFirstFiscalYearCurrencyDependentEstimates CurrencyDependentEstimates { get; set; }

        /// <summary>
        /// Gets or Sets ReturnOnAssets
        /// </summary>
        [DataMember(Name = "returnOnAssets", EmitDefaultValue = false)]
        public InlineResponse2004EstimatesFirstFiscalYearReturnOnAssets ReturnOnAssets { get; set; }

        /// <summary>
        /// Gets or Sets ReturnOnEquity
        /// </summary>
        [DataMember(Name = "returnOnEquity", EmitDefaultValue = false)]
        public InlineResponse2004EstimatesFirstFiscalYearReturnOnEquity ReturnOnEquity { get; set; }

        /// <summary>
        /// Gets or Sets Ratios
        /// </summary>
        [DataMember(Name = "ratios", EmitDefaultValue = false)]
        public InlineResponse2004EstimatesFirstFiscalYearRatios Ratios { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class InlineResponse2004EstimatesSecondFiscalYear {\n");
            sb.Append("  FiscalYear: ").Append(FiscalYear).Append("\n");
            sb.Append("  CurrencyDependentEstimates: ").Append(CurrencyDependentEstimates).Append("\n");
            sb.Append("  ReturnOnAssets: ").Append(ReturnOnAssets).Append("\n");
            sb.Append("  ReturnOnEquity: ").Append(ReturnOnEquity).Append("\n");
            sb.Append("  Ratios: ").Append(Ratios).Append("\n");
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
            return this.Equals(input as InlineResponse2004EstimatesSecondFiscalYear);
        }

        /// <summary>
        /// Returns true if InlineResponse2004EstimatesSecondFiscalYear instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse2004EstimatesSecondFiscalYear to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse2004EstimatesSecondFiscalYear input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.FiscalYear == input.FiscalYear ||
                    (this.FiscalYear != null &&
                    this.FiscalYear.Equals(input.FiscalYear))
                ) && 
                (
                    this.CurrencyDependentEstimates == input.CurrencyDependentEstimates ||
                    (this.CurrencyDependentEstimates != null &&
                    this.CurrencyDependentEstimates.Equals(input.CurrencyDependentEstimates))
                ) && 
                (
                    this.ReturnOnAssets == input.ReturnOnAssets ||
                    (this.ReturnOnAssets != null &&
                    this.ReturnOnAssets.Equals(input.ReturnOnAssets))
                ) && 
                (
                    this.ReturnOnEquity == input.ReturnOnEquity ||
                    (this.ReturnOnEquity != null &&
                    this.ReturnOnEquity.Equals(input.ReturnOnEquity))
                ) && 
                (
                    this.Ratios == input.Ratios ||
                    (this.Ratios != null &&
                    this.Ratios.Equals(input.Ratios))
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
                if (this.FiscalYear != null)
                {
                    hashCode = (hashCode * 59) + this.FiscalYear.GetHashCode();
                }
                if (this.CurrencyDependentEstimates != null)
                {
                    hashCode = (hashCode * 59) + this.CurrencyDependentEstimates.GetHashCode();
                }
                if (this.ReturnOnAssets != null)
                {
                    hashCode = (hashCode * 59) + this.ReturnOnAssets.GetHashCode();
                }
                if (this.ReturnOnEquity != null)
                {
                    hashCode = (hashCode * 59) + this.ReturnOnEquity.GetHashCode();
                }
                if (this.Ratios != null)
                {
                    hashCode = (hashCode * 59) + this.Ratios.GetHashCode();
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
