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
    /// StockNotationScreenerSearchDataEstimates
    /// </summary>
    [DataContract(Name = "_stock_notation_screener_search_data_estimates")]
    public partial class StockNotationScreenerSearchDataEstimates : IEquatable<StockNotationScreenerSearchDataEstimates>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="StockNotationScreenerSearchDataEstimates" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected StockNotationScreenerSearchDataEstimates() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="StockNotationScreenerSearchDataEstimates" /> class.
        /// </summary>
        /// <param name="fiscalYear">fiscalYear (required).</param>
        /// <param name="currencyDependentEstimates">currencyDependentEstimates.</param>
        /// <param name="returnOnAssets">returnOnAssets.</param>
        /// <param name="returnOnEquity">returnOnEquity.</param>
        /// <param name="ratios">ratios.</param>
        public StockNotationScreenerSearchDataEstimates(StockNotationScreenerSearchDataFiscalYear1 fiscalYear = default(StockNotationScreenerSearchDataFiscalYear1), StockNotationScreenerSearchDataCurrencyDependentEstimates currencyDependentEstimates = default(StockNotationScreenerSearchDataCurrencyDependentEstimates), StockNotationScreenerSearchDataReturnOnAssets1 returnOnAssets = default(StockNotationScreenerSearchDataReturnOnAssets1), StockNotationScreenerSearchDataReturnOnEquity1 returnOnEquity = default(StockNotationScreenerSearchDataReturnOnEquity1), StockNotationScreenerSearchDataRatios1 ratios = default(StockNotationScreenerSearchDataRatios1))
        {
            // to ensure "fiscalYear" is required (not null)
            if (fiscalYear == null) {
                throw new ArgumentNullException("fiscalYear is a required property for StockNotationScreenerSearchDataEstimates and cannot be null");
            }
            this.FiscalYear = fiscalYear;
            this.CurrencyDependentEstimates = currencyDependentEstimates;
            this.ReturnOnAssets = returnOnAssets;
            this.ReturnOnEquity = returnOnEquity;
            this.Ratios = ratios;
        }

        /// <summary>
        /// Gets or Sets FiscalYear
        /// </summary>
        [DataMember(Name = "fiscalYear", IsRequired = true, EmitDefaultValue = false)]
        public StockNotationScreenerSearchDataFiscalYear1 FiscalYear { get; set; }

        /// <summary>
        /// Gets or Sets CurrencyDependentEstimates
        /// </summary>
        [DataMember(Name = "currencyDependentEstimates", EmitDefaultValue = false)]
        public StockNotationScreenerSearchDataCurrencyDependentEstimates CurrencyDependentEstimates { get; set; }

        /// <summary>
        /// Gets or Sets ReturnOnAssets
        /// </summary>
        [DataMember(Name = "returnOnAssets", EmitDefaultValue = false)]
        public StockNotationScreenerSearchDataReturnOnAssets1 ReturnOnAssets { get; set; }

        /// <summary>
        /// Gets or Sets ReturnOnEquity
        /// </summary>
        [DataMember(Name = "returnOnEquity", EmitDefaultValue = false)]
        public StockNotationScreenerSearchDataReturnOnEquity1 ReturnOnEquity { get; set; }

        /// <summary>
        /// Gets or Sets Ratios
        /// </summary>
        [DataMember(Name = "ratios", EmitDefaultValue = false)]
        public StockNotationScreenerSearchDataRatios1 Ratios { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class StockNotationScreenerSearchDataEstimates {\n");
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
            return this.Equals(input as StockNotationScreenerSearchDataEstimates);
        }

        /// <summary>
        /// Returns true if StockNotationScreenerSearchDataEstimates instances are equal
        /// </summary>
        /// <param name="input">Instance of StockNotationScreenerSearchDataEstimates to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(StockNotationScreenerSearchDataEstimates input)
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
