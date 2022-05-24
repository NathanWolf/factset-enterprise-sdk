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
    /// Per-share estimates.
    /// </summary>
    [DataContract(Name = "inline_response_200_12_data_estimates_firstFiscalYear_currencyDependentEstimates_perShare")]
    public partial class InlineResponse20012DataEstimatesFirstFiscalYearCurrencyDependentEstimatesPerShare : IEquatable<InlineResponse20012DataEstimatesFirstFiscalYearCurrencyDependentEstimatesPerShare>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse20012DataEstimatesFirstFiscalYearCurrencyDependentEstimatesPerShare" /> class.
        /// </summary>
        /// <param name="sales">sales.</param>
        /// <param name="earnings">earnings.</param>
        /// <param name="dividends">dividends.</param>
        /// <param name="cashFlow">cashFlow.</param>
        public InlineResponse20012DataEstimatesFirstFiscalYearCurrencyDependentEstimatesPerShare(InlineResponse20012DataEstimatesFirstFiscalYearCurrencyDependentEstimatesPerShareSales sales = default(InlineResponse20012DataEstimatesFirstFiscalYearCurrencyDependentEstimatesPerShareSales), InlineResponse20012DataEstimatesFirstFiscalYearCurrencyDependentEstimatesPerShareEarnings earnings = default(InlineResponse20012DataEstimatesFirstFiscalYearCurrencyDependentEstimatesPerShareEarnings), InlineResponse20012DataEstimatesFirstFiscalYearCurrencyDependentEstimatesPerShareDividends dividends = default(InlineResponse20012DataEstimatesFirstFiscalYearCurrencyDependentEstimatesPerShareDividends), InlineResponse20012DataEstimatesFirstFiscalYearCurrencyDependentEstimatesPerShareCashFlow cashFlow = default(InlineResponse20012DataEstimatesFirstFiscalYearCurrencyDependentEstimatesPerShareCashFlow))
        {
            this.Sales = sales;
            this.Earnings = earnings;
            this.Dividends = dividends;
            this.CashFlow = cashFlow;
        }

        /// <summary>
        /// Gets or Sets Sales
        /// </summary>
        [DataMember(Name = "sales", EmitDefaultValue = false)]
        public InlineResponse20012DataEstimatesFirstFiscalYearCurrencyDependentEstimatesPerShareSales Sales { get; set; }

        /// <summary>
        /// Gets or Sets Earnings
        /// </summary>
        [DataMember(Name = "earnings", EmitDefaultValue = false)]
        public InlineResponse20012DataEstimatesFirstFiscalYearCurrencyDependentEstimatesPerShareEarnings Earnings { get; set; }

        /// <summary>
        /// Gets or Sets Dividends
        /// </summary>
        [DataMember(Name = "dividends", EmitDefaultValue = false)]
        public InlineResponse20012DataEstimatesFirstFiscalYearCurrencyDependentEstimatesPerShareDividends Dividends { get; set; }

        /// <summary>
        /// Gets or Sets CashFlow
        /// </summary>
        [DataMember(Name = "cashFlow", EmitDefaultValue = false)]
        public InlineResponse20012DataEstimatesFirstFiscalYearCurrencyDependentEstimatesPerShareCashFlow CashFlow { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class InlineResponse20012DataEstimatesFirstFiscalYearCurrencyDependentEstimatesPerShare {\n");
            sb.Append("  Sales: ").Append(Sales).Append("\n");
            sb.Append("  Earnings: ").Append(Earnings).Append("\n");
            sb.Append("  Dividends: ").Append(Dividends).Append("\n");
            sb.Append("  CashFlow: ").Append(CashFlow).Append("\n");
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
            return this.Equals(input as InlineResponse20012DataEstimatesFirstFiscalYearCurrencyDependentEstimatesPerShare);
        }

        /// <summary>
        /// Returns true if InlineResponse20012DataEstimatesFirstFiscalYearCurrencyDependentEstimatesPerShare instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse20012DataEstimatesFirstFiscalYearCurrencyDependentEstimatesPerShare to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse20012DataEstimatesFirstFiscalYearCurrencyDependentEstimatesPerShare input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Sales == input.Sales ||
                    (this.Sales != null &&
                    this.Sales.Equals(input.Sales))
                ) && 
                (
                    this.Earnings == input.Earnings ||
                    (this.Earnings != null &&
                    this.Earnings.Equals(input.Earnings))
                ) && 
                (
                    this.Dividends == input.Dividends ||
                    (this.Dividends != null &&
                    this.Dividends.Equals(input.Dividends))
                ) && 
                (
                    this.CashFlow == input.CashFlow ||
                    (this.CashFlow != null &&
                    this.CashFlow.Equals(input.CashFlow))
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
                if (this.Sales != null)
                {
                    hashCode = (hashCode * 59) + this.Sales.GetHashCode();
                }
                if (this.Earnings != null)
                {
                    hashCode = (hashCode * 59) + this.Earnings.GetHashCode();
                }
                if (this.Dividends != null)
                {
                    hashCode = (hashCode * 59) + this.Dividends.GetHashCode();
                }
                if (this.CashFlow != null)
                {
                    hashCode = (hashCode * 59) + this.CashFlow.GetHashCode();
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
