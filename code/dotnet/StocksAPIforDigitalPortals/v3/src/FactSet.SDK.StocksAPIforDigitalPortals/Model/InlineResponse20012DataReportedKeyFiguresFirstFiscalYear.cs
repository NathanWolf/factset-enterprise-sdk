/*
 * Stocks API For Digital Portals
 *
 * The stocks API features a screener to search for equity instruments based on stock-specific parameters.  Parameters for up to three fiscal years might now be used in one request; data is available for the ten most recent completed fiscal years. Estimates are available for the current and two consecutive fiscal years.  A separate endpoint returns the possible values and value ranges for the parameters that the endpoint /stock/notation/screener/search accepts: Application developers can request the values and value ranges only for a restricted set of notations that match predefined parameters. This functionality may be used to pre-fill the values and value ranges of the parameters of the /stock/notation/screener/search endpoint so that performing a search always leads to a non-empty set of notations.  The endpoint /stock/notation/ranking/intraday/list ranks stocks notations using intraday figures, for example to build a gainers/losers list.   Additional endpoints include end-of-day benchmark key figures, and selected fundamentals (as of end of fiscal year and with potentially daily updates).  This API is fully integrated with the corresponding Quotes API, allowing access to detailed price and performance information of instruments, as well as basic security identifier cross-reference. For direct access to price histories, please refer to the Time Series API for Digital Portals.  Similar criteria based screener APIs exist for fixed income instruments and securitized derivatives: See the Bonds API and the Securitized Derivatives API for details.
 *
 * The version of the OpenAPI document: 2
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
    /// Value ranges of the most recent fiscal year that has been requested. If the parameters used in the request refer to data from only one fiscal year, the respective data is found here.
    /// </summary>
    [DataContract(Name = "inline_response_200_12_data_reportedKeyFigures_firstFiscalYear")]
    public partial class InlineResponse20012DataReportedKeyFiguresFirstFiscalYear : IEquatable<InlineResponse20012DataReportedKeyFiguresFirstFiscalYear>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse20012DataReportedKeyFiguresFirstFiscalYear" /> class.
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
        public InlineResponse20012DataReportedKeyFiguresFirstFiscalYear(InlineResponse20011ReportedKeyFiguresFirstFiscalYearFiscalYear fiscalYear = default(InlineResponse20011ReportedKeyFiguresFirstFiscalYearFiscalYear), InlineResponse20012DataReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFigures currencyDependentKeyFigures = default(InlineResponse20012DataReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFigures), InlineResponse20012DataReportedKeyFiguresFirstFiscalYearEbitMargin ebitMargin = default(InlineResponse20012DataReportedKeyFiguresFirstFiscalYearEbitMargin), InlineResponse20012DataReportedKeyFiguresFirstFiscalYearEbitdaMargin ebitdaMargin = default(InlineResponse20012DataReportedKeyFiguresFirstFiscalYearEbitdaMargin), InlineResponse20012DataReportedKeyFiguresFirstFiscalYearNetIncomeMargin netIncomeMargin = default(InlineResponse20012DataReportedKeyFiguresFirstFiscalYearNetIncomeMargin), InlineResponse20012DataReportedKeyFiguresFirstFiscalYearGrossIncomeMargin grossIncomeMargin = default(InlineResponse20012DataReportedKeyFiguresFirstFiscalYearGrossIncomeMargin), InlineResponse20012DataReportedKeyFiguresFirstFiscalYearOperatingMargin operatingMargin = default(InlineResponse20012DataReportedKeyFiguresFirstFiscalYearOperatingMargin), InlineResponse20012DataReportedKeyFiguresFirstFiscalYearReturnOnAssets returnOnAssets = default(InlineResponse20012DataReportedKeyFiguresFirstFiscalYearReturnOnAssets), InlineResponse20012DataReportedKeyFiguresFirstFiscalYearReturnOnEquity returnOnEquity = default(InlineResponse20012DataReportedKeyFiguresFirstFiscalYearReturnOnEquity), InlineResponse20012DataReportedKeyFiguresFirstFiscalYearRatios ratios = default(InlineResponse20012DataReportedKeyFiguresFirstFiscalYearRatios))
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
        public InlineResponse20011ReportedKeyFiguresFirstFiscalYearFiscalYear FiscalYear { get; set; }

        /// <summary>
        /// Gets or Sets CurrencyDependentKeyFigures
        /// </summary>
        [DataMember(Name = "currencyDependentKeyFigures", EmitDefaultValue = false)]
        public InlineResponse20012DataReportedKeyFiguresFirstFiscalYearCurrencyDependentKeyFigures CurrencyDependentKeyFigures { get; set; }

        /// <summary>
        /// Gets or Sets EbitMargin
        /// </summary>
        [DataMember(Name = "ebitMargin", EmitDefaultValue = false)]
        public InlineResponse20012DataReportedKeyFiguresFirstFiscalYearEbitMargin EbitMargin { get; set; }

        /// <summary>
        /// Gets or Sets EbitdaMargin
        /// </summary>
        [DataMember(Name = "ebitdaMargin", EmitDefaultValue = false)]
        public InlineResponse20012DataReportedKeyFiguresFirstFiscalYearEbitdaMargin EbitdaMargin { get; set; }

        /// <summary>
        /// Gets or Sets NetIncomeMargin
        /// </summary>
        [DataMember(Name = "netIncomeMargin", EmitDefaultValue = false)]
        public InlineResponse20012DataReportedKeyFiguresFirstFiscalYearNetIncomeMargin NetIncomeMargin { get; set; }

        /// <summary>
        /// Gets or Sets GrossIncomeMargin
        /// </summary>
        [DataMember(Name = "grossIncomeMargin", EmitDefaultValue = false)]
        public InlineResponse20012DataReportedKeyFiguresFirstFiscalYearGrossIncomeMargin GrossIncomeMargin { get; set; }

        /// <summary>
        /// Gets or Sets OperatingMargin
        /// </summary>
        [DataMember(Name = "operatingMargin", EmitDefaultValue = false)]
        public InlineResponse20012DataReportedKeyFiguresFirstFiscalYearOperatingMargin OperatingMargin { get; set; }

        /// <summary>
        /// Gets or Sets ReturnOnAssets
        /// </summary>
        [DataMember(Name = "returnOnAssets", EmitDefaultValue = false)]
        public InlineResponse20012DataReportedKeyFiguresFirstFiscalYearReturnOnAssets ReturnOnAssets { get; set; }

        /// <summary>
        /// Gets or Sets ReturnOnEquity
        /// </summary>
        [DataMember(Name = "returnOnEquity", EmitDefaultValue = false)]
        public InlineResponse20012DataReportedKeyFiguresFirstFiscalYearReturnOnEquity ReturnOnEquity { get; set; }

        /// <summary>
        /// Gets or Sets Ratios
        /// </summary>
        [DataMember(Name = "ratios", EmitDefaultValue = false)]
        public InlineResponse20012DataReportedKeyFiguresFirstFiscalYearRatios Ratios { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class InlineResponse20012DataReportedKeyFiguresFirstFiscalYear {\n");
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
            return this.Equals(input as InlineResponse20012DataReportedKeyFiguresFirstFiscalYear);
        }

        /// <summary>
        /// Returns true if InlineResponse20012DataReportedKeyFiguresFirstFiscalYear instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse20012DataReportedKeyFiguresFirstFiscalYear to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse20012DataReportedKeyFiguresFirstFiscalYear input)
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
                {
                    hashCode = (hashCode * 59) + this.FiscalYear.GetHashCode();
                }
                if (this.CurrencyDependentKeyFigures != null)
                {
                    hashCode = (hashCode * 59) + this.CurrencyDependentKeyFigures.GetHashCode();
                }
                if (this.EbitMargin != null)
                {
                    hashCode = (hashCode * 59) + this.EbitMargin.GetHashCode();
                }
                if (this.EbitdaMargin != null)
                {
                    hashCode = (hashCode * 59) + this.EbitdaMargin.GetHashCode();
                }
                if (this.NetIncomeMargin != null)
                {
                    hashCode = (hashCode * 59) + this.NetIncomeMargin.GetHashCode();
                }
                if (this.GrossIncomeMargin != null)
                {
                    hashCode = (hashCode * 59) + this.GrossIncomeMargin.GetHashCode();
                }
                if (this.OperatingMargin != null)
                {
                    hashCode = (hashCode * 59) + this.OperatingMargin.GetHashCode();
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
