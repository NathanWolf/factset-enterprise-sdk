/*
 * FactSet Funds API
 *
 * FactSet Mutual Funds data offers over 50 fund- and share class-specific data points for mutual funds listed in the United States. <p>FactSet Mutual Funds Reference provides fund-specific reference information as well as FactSet's proprietary classification system. It includes but is not limited to the following coverage    * Fund descriptions    * A seven-tier classification system   * Leverage information   * Fees and expenses    * Portfolio managers       FactSet Mutual Funds Time Series provides quantitative data items on a historical basis. It includes but is not limited to the following coverage    * Net asset value   * Fund flows    * Assets under management   * Total return  
 *
 * The version of the OpenAPI document: 1.0.1
 * Contact: api@factset.com
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
using OpenAPIDateConverter = FactSet.SDK.FactSetFunds.Client.OpenAPIDateConverter;

namespace FactSet.SDK.FactSetFunds.Model
{
    /// <summary>
    /// CostsFees
    /// </summary>
    [DataContract(Name = "costsFees")]
    public partial class CostsFees : IEquatable<CostsFees>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CostsFees" /> class.
        /// </summary>
        /// <param name="fsymId">FactSet Security Identifier. Six alpha-numeric characters, excluding vowels, with a -S suffix (XXXXXX-S), resolved from the requestId of the Fund requested..</param>
        /// <param name="managementExpenses">The management fee, or maintenance fee, is charged by the fund manager. This cost is usually between 0.5% and 2% of assets on average and is a periodic fee..</param>
        /// <param name="date">The Expense Date expressed in YYYY-MM-DD..</param>
        /// <param name="currency">ISO3 Currency.</param>
        /// <param name="entryExpenses">The transaction entry fee or purchase fee collected from investors when they join or leave a scheme. The fee is paid to the fund.</param>
        /// <param name="exitExpenses">The transaction exit fee is charged to investors when they redeem shares from a fund..</param>
        /// <param name="frontExpensesMax">The Maximum sales load or initial Sales Fee is a reduction made from each investment in the fund, the maximum paid is dependent on the size of the purchase, it decreases as the investment increases. Often associated with class &#39;A&#39; shares of a mutual fund it is also known as Sales Charge, this is a fee paid when shares are purchased. Also known as a \&quot;front-end load\&quot;, this fee typically goes to the brokers that sell the fund&#39;s shares.  (Under the Investment Company Act of 1940 is 9%. The maximum sales load under NASD Rules is 8 1/2%).\&quot; .</param>
        /// <param name="backExpensesMax">The Back Expense Maximum.</param>
        /// <param name="expenseRatio">The Expense Ratio.</param>
        /// <param name="expenseRatioProspectus">The Expense Ratio Prospectus.</param>
        /// <param name="initInvestmentMin">The Initial Investment Minimum.</param>
        /// <param name="initInvestmentIra">The Initial Investment Individual Retirement Accounts.</param>
        /// <param name="swingPrice">Swing Price. Swing pricing occurs when a fund provider adjusts the net asset value (NAV) of a fund in order to pass on trading costs to purchasing or redeeming shareholders. This anti-dilution technique is used to protect long-term shareholder&#39;s interests..</param>
        /// <param name="swingPriceDate">Swing Price Date. Swing pricing occurs when a fund provider adjusts the net asset value (NAV) of a fund in order to pass on trading costs to purchasing or redeeming shareholders. This anti-dilution technique is used to protect long-term shareholder&#39;s interests..</param>
        /// <param name="sriPriips">The SRI (Summary Risk Indicator) illustrates PRIIPs&#39; risk and reward profile by measuring the market and credit risk level. Returns 1 for low risk up to 7 for higher risk..</param>
        /// <param name="srriUcits">Synthetic Risk and Reward Indicator illustrates a UCITS or NURS (Non-UCITS Retail Scheme) fund&#39;s risk and reward profile by measuring the market risk level. Returns 1 for low risk up to 7 for high risk..</param>
        /// <param name="performanceFee">Represents fees made to an investment manager as a percentage of investment profits for generating positive returns..</param>
        /// <param name="tradingExpenseRatio">Represents the amount of trading commissions incurred to manage the portfolio as a percentage of the total assets of the fund..</param>
        /// <param name="requestId">The requested Id sent as input..</param>
        public CostsFees(string fsymId = default(string), double? managementExpenses = default(double?), DateTime? date = default(DateTime?), string currency = default(string), double? entryExpenses = default(double?), double? exitExpenses = default(double?), double? frontExpensesMax = default(double?), double? backExpensesMax = default(double?), double? expenseRatio = default(double?), double? expenseRatioProspectus = default(double?), double? initInvestmentMin = default(double?), double? initInvestmentIra = default(double?), double? swingPrice = default(double?), DateTime? swingPriceDate = default(DateTime?), int? sriPriips = default(int?), int? srriUcits = default(int?), double? performanceFee = default(double?), double? tradingExpenseRatio = default(double?), string requestId = default(string))
        {
            this.FsymId = fsymId;
            this.ManagementExpenses = managementExpenses;
            this.Date = date;
            this.Currency = currency;
            this.EntryExpenses = entryExpenses;
            this.ExitExpenses = exitExpenses;
            this.FrontExpensesMax = frontExpensesMax;
            this.BackExpensesMax = backExpensesMax;
            this.ExpenseRatio = expenseRatio;
            this.ExpenseRatioProspectus = expenseRatioProspectus;
            this.InitInvestmentMin = initInvestmentMin;
            this.InitInvestmentIra = initInvestmentIra;
            this.SwingPrice = swingPrice;
            this.SwingPriceDate = swingPriceDate;
            this.SriPriips = sriPriips;
            this.SrriUcits = srriUcits;
            this.PerformanceFee = performanceFee;
            this.TradingExpenseRatio = tradingExpenseRatio;
            this.RequestId = requestId;
        }

        /// <summary>
        /// FactSet Security Identifier. Six alpha-numeric characters, excluding vowels, with a -S suffix (XXXXXX-S), resolved from the requestId of the Fund requested.
        /// </summary>
        /// <value>FactSet Security Identifier. Six alpha-numeric characters, excluding vowels, with a -S suffix (XXXXXX-S), resolved from the requestId of the Fund requested.</value>
        [DataMember(Name = "fsymId", EmitDefaultValue = true)]
        public string FsymId { get; set; }

        /// <summary>
        /// The management fee, or maintenance fee, is charged by the fund manager. This cost is usually between 0.5% and 2% of assets on average and is a periodic fee.
        /// </summary>
        /// <value>The management fee, or maintenance fee, is charged by the fund manager. This cost is usually between 0.5% and 2% of assets on average and is a periodic fee.</value>
        [DataMember(Name = "managementExpenses", EmitDefaultValue = true)]
        public double? ManagementExpenses { get; set; }

        /// <summary>
        /// The Expense Date expressed in YYYY-MM-DD.
        /// </summary>
        /// <value>The Expense Date expressed in YYYY-MM-DD.</value>
        [DataMember(Name = "date", EmitDefaultValue = true)]
        [JsonConverter(typeof(OpenAPIDateConverter))]
        public DateTime? Date { get; set; }

        /// <summary>
        /// ISO3 Currency
        /// </summary>
        /// <value>ISO3 Currency</value>
        [DataMember(Name = "currency", EmitDefaultValue = true)]
        public string Currency { get; set; }

        /// <summary>
        /// The transaction entry fee or purchase fee collected from investors when they join or leave a scheme. The fee is paid to the fund
        /// </summary>
        /// <value>The transaction entry fee or purchase fee collected from investors when they join or leave a scheme. The fee is paid to the fund</value>
        [DataMember(Name = "entryExpenses", EmitDefaultValue = true)]
        public double? EntryExpenses { get; set; }

        /// <summary>
        /// The transaction exit fee is charged to investors when they redeem shares from a fund.
        /// </summary>
        /// <value>The transaction exit fee is charged to investors when they redeem shares from a fund.</value>
        [DataMember(Name = "exitExpenses", EmitDefaultValue = true)]
        public double? ExitExpenses { get; set; }

        /// <summary>
        /// The Maximum sales load or initial Sales Fee is a reduction made from each investment in the fund, the maximum paid is dependent on the size of the purchase, it decreases as the investment increases. Often associated with class &#39;A&#39; shares of a mutual fund it is also known as Sales Charge, this is a fee paid when shares are purchased. Also known as a \&quot;front-end load\&quot;, this fee typically goes to the brokers that sell the fund&#39;s shares.  (Under the Investment Company Act of 1940 is 9%. The maximum sales load under NASD Rules is 8 1/2%).\&quot; 
        /// </summary>
        /// <value>The Maximum sales load or initial Sales Fee is a reduction made from each investment in the fund, the maximum paid is dependent on the size of the purchase, it decreases as the investment increases. Often associated with class &#39;A&#39; shares of a mutual fund it is also known as Sales Charge, this is a fee paid when shares are purchased. Also known as a \&quot;front-end load\&quot;, this fee typically goes to the brokers that sell the fund&#39;s shares.  (Under the Investment Company Act of 1940 is 9%. The maximum sales load under NASD Rules is 8 1/2%).\&quot; </value>
        [DataMember(Name = "frontExpensesMax", EmitDefaultValue = true)]
        public double? FrontExpensesMax { get; set; }

        /// <summary>
        /// The Back Expense Maximum
        /// </summary>
        /// <value>The Back Expense Maximum</value>
        [DataMember(Name = "backExpensesMax", EmitDefaultValue = true)]
        public double? BackExpensesMax { get; set; }

        /// <summary>
        /// The Expense Ratio
        /// </summary>
        /// <value>The Expense Ratio</value>
        [DataMember(Name = "expenseRatio", EmitDefaultValue = true)]
        public double? ExpenseRatio { get; set; }

        /// <summary>
        /// The Expense Ratio Prospectus
        /// </summary>
        /// <value>The Expense Ratio Prospectus</value>
        [DataMember(Name = "expenseRatioProspectus", EmitDefaultValue = true)]
        public double? ExpenseRatioProspectus { get; set; }

        /// <summary>
        /// The Initial Investment Minimum
        /// </summary>
        /// <value>The Initial Investment Minimum</value>
        [DataMember(Name = "initInvestmentMin", EmitDefaultValue = true)]
        public double? InitInvestmentMin { get; set; }

        /// <summary>
        /// The Initial Investment Individual Retirement Accounts
        /// </summary>
        /// <value>The Initial Investment Individual Retirement Accounts</value>
        [DataMember(Name = "initInvestmentIra", EmitDefaultValue = true)]
        public double? InitInvestmentIra { get; set; }

        /// <summary>
        /// Swing Price. Swing pricing occurs when a fund provider adjusts the net asset value (NAV) of a fund in order to pass on trading costs to purchasing or redeeming shareholders. This anti-dilution technique is used to protect long-term shareholder&#39;s interests.
        /// </summary>
        /// <value>Swing Price. Swing pricing occurs when a fund provider adjusts the net asset value (NAV) of a fund in order to pass on trading costs to purchasing or redeeming shareholders. This anti-dilution technique is used to protect long-term shareholder&#39;s interests.</value>
        [DataMember(Name = "swingPrice", EmitDefaultValue = true)]
        public double? SwingPrice { get; set; }

        /// <summary>
        /// Swing Price Date. Swing pricing occurs when a fund provider adjusts the net asset value (NAV) of a fund in order to pass on trading costs to purchasing or redeeming shareholders. This anti-dilution technique is used to protect long-term shareholder&#39;s interests.
        /// </summary>
        /// <value>Swing Price Date. Swing pricing occurs when a fund provider adjusts the net asset value (NAV) of a fund in order to pass on trading costs to purchasing or redeeming shareholders. This anti-dilution technique is used to protect long-term shareholder&#39;s interests.</value>
        [DataMember(Name = "swingPriceDate", EmitDefaultValue = true)]
        [JsonConverter(typeof(OpenAPIDateConverter))]
        public DateTime? SwingPriceDate { get; set; }

        /// <summary>
        /// The SRI (Summary Risk Indicator) illustrates PRIIPs&#39; risk and reward profile by measuring the market and credit risk level. Returns 1 for low risk up to 7 for higher risk.
        /// </summary>
        /// <value>The SRI (Summary Risk Indicator) illustrates PRIIPs&#39; risk and reward profile by measuring the market and credit risk level. Returns 1 for low risk up to 7 for higher risk.</value>
        [DataMember(Name = "sriPriips", EmitDefaultValue = true)]
        public int? SriPriips { get; set; }

        /// <summary>
        /// Synthetic Risk and Reward Indicator illustrates a UCITS or NURS (Non-UCITS Retail Scheme) fund&#39;s risk and reward profile by measuring the market risk level. Returns 1 for low risk up to 7 for high risk.
        /// </summary>
        /// <value>Synthetic Risk and Reward Indicator illustrates a UCITS or NURS (Non-UCITS Retail Scheme) fund&#39;s risk and reward profile by measuring the market risk level. Returns 1 for low risk up to 7 for high risk.</value>
        [DataMember(Name = "srriUcits", EmitDefaultValue = true)]
        public int? SrriUcits { get; set; }

        /// <summary>
        /// Represents fees made to an investment manager as a percentage of investment profits for generating positive returns.
        /// </summary>
        /// <value>Represents fees made to an investment manager as a percentage of investment profits for generating positive returns.</value>
        [DataMember(Name = "performanceFee", EmitDefaultValue = true)]
        public double? PerformanceFee { get; set; }

        /// <summary>
        /// Represents the amount of trading commissions incurred to manage the portfolio as a percentage of the total assets of the fund.
        /// </summary>
        /// <value>Represents the amount of trading commissions incurred to manage the portfolio as a percentage of the total assets of the fund.</value>
        [DataMember(Name = "tradingExpenseRatio", EmitDefaultValue = true)]
        public double? TradingExpenseRatio { get; set; }

        /// <summary>
        /// The requested Id sent as input.
        /// </summary>
        /// <value>The requested Id sent as input.</value>
        [DataMember(Name = "requestId", EmitDefaultValue = false)]
        public string RequestId { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CostsFees {\n");
            sb.Append("  FsymId: ").Append(FsymId).Append("\n");
            sb.Append("  ManagementExpenses: ").Append(ManagementExpenses).Append("\n");
            sb.Append("  Date: ").Append(Date).Append("\n");
            sb.Append("  Currency: ").Append(Currency).Append("\n");
            sb.Append("  EntryExpenses: ").Append(EntryExpenses).Append("\n");
            sb.Append("  ExitExpenses: ").Append(ExitExpenses).Append("\n");
            sb.Append("  FrontExpensesMax: ").Append(FrontExpensesMax).Append("\n");
            sb.Append("  BackExpensesMax: ").Append(BackExpensesMax).Append("\n");
            sb.Append("  ExpenseRatio: ").Append(ExpenseRatio).Append("\n");
            sb.Append("  ExpenseRatioProspectus: ").Append(ExpenseRatioProspectus).Append("\n");
            sb.Append("  InitInvestmentMin: ").Append(InitInvestmentMin).Append("\n");
            sb.Append("  InitInvestmentIra: ").Append(InitInvestmentIra).Append("\n");
            sb.Append("  SwingPrice: ").Append(SwingPrice).Append("\n");
            sb.Append("  SwingPriceDate: ").Append(SwingPriceDate).Append("\n");
            sb.Append("  SriPriips: ").Append(SriPriips).Append("\n");
            sb.Append("  SrriUcits: ").Append(SrriUcits).Append("\n");
            sb.Append("  PerformanceFee: ").Append(PerformanceFee).Append("\n");
            sb.Append("  TradingExpenseRatio: ").Append(TradingExpenseRatio).Append("\n");
            sb.Append("  RequestId: ").Append(RequestId).Append("\n");
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
            return this.Equals(input as CostsFees);
        }

        /// <summary>
        /// Returns true if CostsFees instances are equal
        /// </summary>
        /// <param name="input">Instance of CostsFees to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CostsFees input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.FsymId == input.FsymId ||
                    (this.FsymId != null &&
                    this.FsymId.Equals(input.FsymId))
                ) && 
                (
                    this.ManagementExpenses == input.ManagementExpenses ||
                    (this.ManagementExpenses != null &&
                    this.ManagementExpenses.Equals(input.ManagementExpenses))
                ) && 
                (
                    this.Date == input.Date ||
                    (this.Date != null &&
                    this.Date.Equals(input.Date))
                ) && 
                (
                    this.Currency == input.Currency ||
                    (this.Currency != null &&
                    this.Currency.Equals(input.Currency))
                ) && 
                (
                    this.EntryExpenses == input.EntryExpenses ||
                    (this.EntryExpenses != null &&
                    this.EntryExpenses.Equals(input.EntryExpenses))
                ) && 
                (
                    this.ExitExpenses == input.ExitExpenses ||
                    (this.ExitExpenses != null &&
                    this.ExitExpenses.Equals(input.ExitExpenses))
                ) && 
                (
                    this.FrontExpensesMax == input.FrontExpensesMax ||
                    (this.FrontExpensesMax != null &&
                    this.FrontExpensesMax.Equals(input.FrontExpensesMax))
                ) && 
                (
                    this.BackExpensesMax == input.BackExpensesMax ||
                    (this.BackExpensesMax != null &&
                    this.BackExpensesMax.Equals(input.BackExpensesMax))
                ) && 
                (
                    this.ExpenseRatio == input.ExpenseRatio ||
                    (this.ExpenseRatio != null &&
                    this.ExpenseRatio.Equals(input.ExpenseRatio))
                ) && 
                (
                    this.ExpenseRatioProspectus == input.ExpenseRatioProspectus ||
                    (this.ExpenseRatioProspectus != null &&
                    this.ExpenseRatioProspectus.Equals(input.ExpenseRatioProspectus))
                ) && 
                (
                    this.InitInvestmentMin == input.InitInvestmentMin ||
                    (this.InitInvestmentMin != null &&
                    this.InitInvestmentMin.Equals(input.InitInvestmentMin))
                ) && 
                (
                    this.InitInvestmentIra == input.InitInvestmentIra ||
                    (this.InitInvestmentIra != null &&
                    this.InitInvestmentIra.Equals(input.InitInvestmentIra))
                ) && 
                (
                    this.SwingPrice == input.SwingPrice ||
                    (this.SwingPrice != null &&
                    this.SwingPrice.Equals(input.SwingPrice))
                ) && 
                (
                    this.SwingPriceDate == input.SwingPriceDate ||
                    (this.SwingPriceDate != null &&
                    this.SwingPriceDate.Equals(input.SwingPriceDate))
                ) && 
                (
                    this.SriPriips == input.SriPriips ||
                    (this.SriPriips != null &&
                    this.SriPriips.Equals(input.SriPriips))
                ) && 
                (
                    this.SrriUcits == input.SrriUcits ||
                    (this.SrriUcits != null &&
                    this.SrriUcits.Equals(input.SrriUcits))
                ) && 
                (
                    this.PerformanceFee == input.PerformanceFee ||
                    (this.PerformanceFee != null &&
                    this.PerformanceFee.Equals(input.PerformanceFee))
                ) && 
                (
                    this.TradingExpenseRatio == input.TradingExpenseRatio ||
                    (this.TradingExpenseRatio != null &&
                    this.TradingExpenseRatio.Equals(input.TradingExpenseRatio))
                ) && 
                (
                    this.RequestId == input.RequestId ||
                    (this.RequestId != null &&
                    this.RequestId.Equals(input.RequestId))
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
                if (this.FsymId != null)
                {
                    hashCode = (hashCode * 59) + this.FsymId.GetHashCode();
                }
                if (this.ManagementExpenses != null)
                {
                    hashCode = (hashCode * 59) + this.ManagementExpenses.GetHashCode();
                }
                if (this.Date != null)
                {
                    hashCode = (hashCode * 59) + this.Date.GetHashCode();
                }
                if (this.Currency != null)
                {
                    hashCode = (hashCode * 59) + this.Currency.GetHashCode();
                }
                if (this.EntryExpenses != null)
                {
                    hashCode = (hashCode * 59) + this.EntryExpenses.GetHashCode();
                }
                if (this.ExitExpenses != null)
                {
                    hashCode = (hashCode * 59) + this.ExitExpenses.GetHashCode();
                }
                if (this.FrontExpensesMax != null)
                {
                    hashCode = (hashCode * 59) + this.FrontExpensesMax.GetHashCode();
                }
                if (this.BackExpensesMax != null)
                {
                    hashCode = (hashCode * 59) + this.BackExpensesMax.GetHashCode();
                }
                if (this.ExpenseRatio != null)
                {
                    hashCode = (hashCode * 59) + this.ExpenseRatio.GetHashCode();
                }
                if (this.ExpenseRatioProspectus != null)
                {
                    hashCode = (hashCode * 59) + this.ExpenseRatioProspectus.GetHashCode();
                }
                if (this.InitInvestmentMin != null)
                {
                    hashCode = (hashCode * 59) + this.InitInvestmentMin.GetHashCode();
                }
                if (this.InitInvestmentIra != null)
                {
                    hashCode = (hashCode * 59) + this.InitInvestmentIra.GetHashCode();
                }
                if (this.SwingPrice != null)
                {
                    hashCode = (hashCode * 59) + this.SwingPrice.GetHashCode();
                }
                if (this.SwingPriceDate != null)
                {
                    hashCode = (hashCode * 59) + this.SwingPriceDate.GetHashCode();
                }
                if (this.SriPriips != null)
                {
                    hashCode = (hashCode * 59) + this.SriPriips.GetHashCode();
                }
                if (this.SrriUcits != null)
                {
                    hashCode = (hashCode * 59) + this.SrriUcits.GetHashCode();
                }
                if (this.PerformanceFee != null)
                {
                    hashCode = (hashCode * 59) + this.PerformanceFee.GetHashCode();
                }
                if (this.TradingExpenseRatio != null)
                {
                    hashCode = (hashCode * 59) + this.TradingExpenseRatio.GetHashCode();
                }
                if (this.RequestId != null)
                {
                    hashCode = (hashCode * 59) + this.RequestId.GetHashCode();
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
