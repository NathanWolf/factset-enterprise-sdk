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
    /// Value ranges of the second most recent fiscal year that has been requested. If the parameters used in the request refer to data from two fiscals year, the respective data of the more distant one is found here.
    /// </summary>
    [DataContract(Name = "inline_response_200_5_data_reportedKeyFigures_secondFiscalYear")]
    public partial class InlineResponse2005DataReportedKeyFiguresSecondFiscalYear : IEquatable<InlineResponse2005DataReportedKeyFiguresSecondFiscalYear>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse2005DataReportedKeyFiguresSecondFiscalYear" /> class.
        /// </summary>
        /// <param name="fiscalYear">fiscalYear.</param>
        /// <param name="currencyDependentKeyFigures">currencyDependentKeyFigures.</param>
        /// <param name="ebitMargin">ebitMargin.</param>
        /// <param name="ebitdaMargin">ebitdaMargin.</param>
        /// <param name="netIncomeMargin">netIncomeMargin.</param>
        /// <param name="grossIncomeMargin">grossIncomeMargin.</param>
        /// <param name="operatingMargin">operatingMargin.</param>
        /// <param name="returnOnAssets">returnOnAssets.</param>
        /// <param name="returnOnEquity">returnOnEquity.</param>
        /// <param name="ratios">ratios.</param>
        public InlineResponse2005DataReportedKeyFiguresSecondFiscalYear(InlineResponse2004ReportedKeyFiguresFirstFiscalYearFiscalYear fiscalYear = default(InlineResponse2004ReportedKeyFiguresFirstFiscalYearFiscalYear), InlineResponse2005DataReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFigures currencyDependentKeyFigures = default(InlineResponse2005DataReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFigures), InlineResponse2005DataReportedKeyFiguresFirstFiscalYearEbitMargin ebitMargin = default(InlineResponse2005DataReportedKeyFiguresFirstFiscalYearEbitMargin), InlineResponse2005DataReportedKeyFiguresFirstFiscalYearEbitdaMargin ebitdaMargin = default(InlineResponse2005DataReportedKeyFiguresFirstFiscalYearEbitdaMargin), InlineResponse2005DataReportedKeyFiguresFirstFiscalYearNetIncomeMargin netIncomeMargin = default(InlineResponse2005DataReportedKeyFiguresFirstFiscalYearNetIncomeMargin), InlineResponse2005DataReportedKeyFiguresFirstFiscalYearGrossIncomeMargin grossIncomeMargin = default(InlineResponse2005DataReportedKeyFiguresFirstFiscalYearGrossIncomeMargin), InlineResponse2005DataReportedKeyFiguresFirstFiscalYearOperatingMargin operatingMargin = default(InlineResponse2005DataReportedKeyFiguresFirstFiscalYearOperatingMargin), InlineResponse2005DataReportedKeyFiguresFirstFiscalYearReturnOnAssets returnOnAssets = default(InlineResponse2005DataReportedKeyFiguresFirstFiscalYearReturnOnAssets), InlineResponse2005DataReportedKeyFiguresFirstFiscalYearReturnOnEquity returnOnEquity = default(InlineResponse2005DataReportedKeyFiguresFirstFiscalYearReturnOnEquity), InlineResponse2005DataReportedKeyFiguresFirstFiscalYearRatios ratios = default(InlineResponse2005DataReportedKeyFiguresFirstFiscalYearRatios))
        {
            this.FiscalYear = fiscalYear;
            this.CurrencyDependentKeyFigures = currencyDependentKeyFigures;
            this.EbitMargin = ebitMargin;
            this.EbitdaMargin = ebitdaMargin;
            this.NetIncomeMargin = netIncomeMargin;
            this.GrossIncomeMargin = grossIncomeMargin;
            this.OperatingMargin = operatingMargin;
            this.ReturnOnAssets = returnOnAssets;
            this.ReturnOnEquity = returnOnEquity;
            this.Ratios = ratios;
        }

        /// <summary>
        /// Gets or Sets FiscalYear
        /// </summary>
        [DataMember(Name = "fiscalYear", EmitDefaultValue = false)]
        public InlineResponse2004ReportedKeyFiguresFirstFiscalYearFiscalYear FiscalYear { get; set; }

        /// <summary>
        /// Gets or Sets CurrencyDependentKeyFigures
        /// </summary>
        [DataMember(Name = "currencyDependentKeyFigures", EmitDefaultValue = false)]
        public InlineResponse2005DataReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFigures CurrencyDependentKeyFigures { get; set; }

        /// <summary>
        /// Gets or Sets EbitMargin
        /// </summary>
        [DataMember(Name = "ebitMargin", EmitDefaultValue = false)]
        public InlineResponse2005DataReportedKeyFiguresFirstFiscalYearEbitMargin EbitMargin { get; set; }

        /// <summary>
        /// Gets or Sets EbitdaMargin
        /// </summary>
        [DataMember(Name = "ebitdaMargin", EmitDefaultValue = false)]
        public InlineResponse2005DataReportedKeyFiguresFirstFiscalYearEbitdaMargin EbitdaMargin { get; set; }

        /// <summary>
        /// Gets or Sets NetIncomeMargin
        /// </summary>
        [DataMember(Name = "netIncomeMargin", EmitDefaultValue = false)]
        public InlineResponse2005DataReportedKeyFiguresFirstFiscalYearNetIncomeMargin NetIncomeMargin { get; set; }

        /// <summary>
        /// Gets or Sets GrossIncomeMargin
        /// </summary>
        [DataMember(Name = "grossIncomeMargin", EmitDefaultValue = false)]
        public InlineResponse2005DataReportedKeyFiguresFirstFiscalYearGrossIncomeMargin GrossIncomeMargin { get; set; }

        /// <summary>
        /// Gets or Sets OperatingMargin
        /// </summary>
        [DataMember(Name = "operatingMargin", EmitDefaultValue = false)]
        public InlineResponse2005DataReportedKeyFiguresFirstFiscalYearOperatingMargin OperatingMargin { get; set; }

        /// <summary>
        /// Gets or Sets ReturnOnAssets
        /// </summary>
        [DataMember(Name = "returnOnAssets", EmitDefaultValue = false)]
        public InlineResponse2005DataReportedKeyFiguresFirstFiscalYearReturnOnAssets ReturnOnAssets { get; set; }

        /// <summary>
        /// Gets or Sets ReturnOnEquity
        /// </summary>
        [DataMember(Name = "returnOnEquity", EmitDefaultValue = false)]
        public InlineResponse2005DataReportedKeyFiguresFirstFiscalYearReturnOnEquity ReturnOnEquity { get; set; }

        /// <summary>
        /// Gets or Sets Ratios
        /// </summary>
        [DataMember(Name = "ratios", EmitDefaultValue = false)]
        public InlineResponse2005DataReportedKeyFiguresFirstFiscalYearRatios Ratios { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class InlineResponse2005DataReportedKeyFiguresSecondFiscalYear {\n");
            sb.Append("  FiscalYear: ").Append(FiscalYear).Append("\n");
            sb.Append("  CurrencyDependentKeyFigures: ").Append(CurrencyDependentKeyFigures).Append("\n");
            sb.Append("  EbitMargin: ").Append(EbitMargin).Append("\n");
            sb.Append("  EbitdaMargin: ").Append(EbitdaMargin).Append("\n");
            sb.Append("  NetIncomeMargin: ").Append(NetIncomeMargin).Append("\n");
            sb.Append("  GrossIncomeMargin: ").Append(GrossIncomeMargin).Append("\n");
            sb.Append("  OperatingMargin: ").Append(OperatingMargin).Append("\n");
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
            return this.Equals(input as InlineResponse2005DataReportedKeyFiguresSecondFiscalYear);
        }

        /// <summary>
        /// Returns true if InlineResponse2005DataReportedKeyFiguresSecondFiscalYear instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse2005DataReportedKeyFiguresSecondFiscalYear to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse2005DataReportedKeyFiguresSecondFiscalYear input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.FiscalYear == input.FiscalYear ||
                    (this.FiscalYear != null &&
                    this.FiscalYear.Equals(input.FiscalYear))
                ) && 
                (
                    this.CurrencyDependentKeyFigures == input.CurrencyDependentKeyFigures ||
                    (this.CurrencyDependentKeyFigures != null &&
                    this.CurrencyDependentKeyFigures.Equals(input.CurrencyDependentKeyFigures))
                ) && 
                (
                    this.EbitMargin == input.EbitMargin ||
                    (this.EbitMargin != null &&
                    this.EbitMargin.Equals(input.EbitMargin))
                ) && 
                (
                    this.EbitdaMargin == input.EbitdaMargin ||
                    (this.EbitdaMargin != null &&
                    this.EbitdaMargin.Equals(input.EbitdaMargin))
                ) && 
                (
                    this.NetIncomeMargin == input.NetIncomeMargin ||
                    (this.NetIncomeMargin != null &&
                    this.NetIncomeMargin.Equals(input.NetIncomeMargin))
                ) && 
                (
                    this.GrossIncomeMargin == input.GrossIncomeMargin ||
                    (this.GrossIncomeMargin != null &&
                    this.GrossIncomeMargin.Equals(input.GrossIncomeMargin))
                ) && 
                (
                    this.OperatingMargin == input.OperatingMargin ||
                    (this.OperatingMargin != null &&
                    this.OperatingMargin.Equals(input.OperatingMargin))
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
                    hashCode = hashCode * 59 + this.FiscalYear.GetHashCode();
                if (this.CurrencyDependentKeyFigures != null)
                    hashCode = hashCode * 59 + this.CurrencyDependentKeyFigures.GetHashCode();
                if (this.EbitMargin != null)
                    hashCode = hashCode * 59 + this.EbitMargin.GetHashCode();
                if (this.EbitdaMargin != null)
                    hashCode = hashCode * 59 + this.EbitdaMargin.GetHashCode();
                if (this.NetIncomeMargin != null)
                    hashCode = hashCode * 59 + this.NetIncomeMargin.GetHashCode();
                if (this.GrossIncomeMargin != null)
                    hashCode = hashCode * 59 + this.GrossIncomeMargin.GetHashCode();
                if (this.OperatingMargin != null)
                    hashCode = hashCode * 59 + this.OperatingMargin.GetHashCode();
                if (this.ReturnOnAssets != null)
                    hashCode = hashCode * 59 + this.ReturnOnAssets.GetHashCode();
                if (this.ReturnOnEquity != null)
                    hashCode = hashCode * 59 + this.ReturnOnEquity.GetHashCode();
                if (this.Ratios != null)
                    hashCode = hashCode * 59 + this.Ratios.GetHashCode();
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
