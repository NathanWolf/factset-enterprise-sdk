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
    /// The data member contains the request&#39;s primary data.
    /// </summary>
    [DataContract(Name = "_stock_notation_screener_search_data")]
    public partial class StockNotationScreenerSearchData : IEquatable<StockNotationScreenerSearchData>, IValidatableObject
    {
        /// <summary>
        /// Defines StockType
        /// </summary>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum StockTypeEnum
        {
            /// <summary>
            /// Enum Common for value: common
            /// </summary>
            [EnumMember(Value = "common")]
            Common = 1,

            /// <summary>
            /// Enum Preferred for value: preferred
            /// </summary>
            [EnumMember(Value = "preferred")]
            Preferred = 2,

            /// <summary>
            /// Enum DepositoryReceipt for value: depositoryReceipt
            /// </summary>
            [EnumMember(Value = "depositoryReceipt")]
            DepositoryReceipt = 3,

            /// <summary>
            /// Enum Other for value: other
            /// </summary>
            [EnumMember(Value = "other")]
            Other = 4

        }



        /// <summary>
        /// Type of stock.
        /// </summary>
        /// <value>Type of stock.</value>
        [DataMember(Name = "stockType", EmitDefaultValue = false)]
        public List<StockTypeEnum> StockType { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="StockNotationScreenerSearchData" /> class.
        /// </summary>
        /// <param name="validation">validation.</param>
        /// <param name="stockType">Type of stock..</param>
        /// <param name="industryClassification">industryClassification.</param>
        /// <param name="company">company.</param>
        /// <param name="indexMembership">indexMembership.</param>
        /// <param name="compliance">compliance.</param>
        /// <param name="reportedKeyFigures">Parameters for stock-specific key figures as reported for a fiscal year..</param>
        /// <param name="performance">performance.</param>
        /// <param name="volatility">volatility.</param>
        /// <param name="tradingValue">tradingValue.</param>
        /// <param name="simpleMovingAverage">simpleMovingAverage.</param>
        /// <param name="rsiWilder">rsiWilder.</param>
        /// <param name="recommendation">recommendation.</param>
        /// <param name="estimates">Parameters for stock-specific consolidated estimates for a fiscal year..</param>
        public StockNotationScreenerSearchData(StockNotationScreenerSearchDataValidation validation = default(StockNotationScreenerSearchDataValidation), List<StockTypeEnum> stockType = default(List<StockTypeEnum>), StockNotationScreenerSearchDataIndustryClassification industryClassification = default(StockNotationScreenerSearchDataIndustryClassification), StockNotationScreenerSearchDataCompany company = default(StockNotationScreenerSearchDataCompany), StockNotationScreenerSearchDataIndexMembership indexMembership = default(StockNotationScreenerSearchDataIndexMembership), StockNotationScreenerSearchDataCompliance compliance = default(StockNotationScreenerSearchDataCompliance), List<StockNotationScreenerSearchDataReportedKeyFigures> reportedKeyFigures = default(List<StockNotationScreenerSearchDataReportedKeyFigures>), StockNotationScreenerSearchDataPerformance performance = default(StockNotationScreenerSearchDataPerformance), StockNotationScreenerSearchDataVolatility volatility = default(StockNotationScreenerSearchDataVolatility), StockNotationScreenerSearchDataTradingValue tradingValue = default(StockNotationScreenerSearchDataTradingValue), StockNotationScreenerSearchDataSimpleMovingAverage simpleMovingAverage = default(StockNotationScreenerSearchDataSimpleMovingAverage), StockNotationScreenerSearchDataRsiWilder rsiWilder = default(StockNotationScreenerSearchDataRsiWilder), StockNotationScreenerSearchDataRecommendation recommendation = default(StockNotationScreenerSearchDataRecommendation), List<StockNotationScreenerSearchDataEstimates> estimates = default(List<StockNotationScreenerSearchDataEstimates>))
        {
            this.Validation = validation;
            this.StockType = stockType;
            this.IndustryClassification = industryClassification;
            this.Company = company;
            this.IndexMembership = indexMembership;
            this.Compliance = compliance;
            this.ReportedKeyFigures = reportedKeyFigures;
            this.Performance = performance;
            this.Volatility = volatility;
            this.TradingValue = tradingValue;
            this.SimpleMovingAverage = simpleMovingAverage;
            this.RsiWilder = rsiWilder;
            this.Recommendation = recommendation;
            this.Estimates = estimates;
        }

        /// <summary>
        /// Gets or Sets Validation
        /// </summary>
        [DataMember(Name = "validation", EmitDefaultValue = false)]
        public StockNotationScreenerSearchDataValidation Validation { get; set; }

        /// <summary>
        /// Gets or Sets IndustryClassification
        /// </summary>
        [DataMember(Name = "industryClassification", EmitDefaultValue = false)]
        public StockNotationScreenerSearchDataIndustryClassification IndustryClassification { get; set; }

        /// <summary>
        /// Gets or Sets Company
        /// </summary>
        [DataMember(Name = "company", EmitDefaultValue = false)]
        public StockNotationScreenerSearchDataCompany Company { get; set; }

        /// <summary>
        /// Gets or Sets IndexMembership
        /// </summary>
        [DataMember(Name = "indexMembership", EmitDefaultValue = false)]
        public StockNotationScreenerSearchDataIndexMembership IndexMembership { get; set; }

        /// <summary>
        /// Gets or Sets Compliance
        /// </summary>
        [DataMember(Name = "compliance", EmitDefaultValue = false)]
        public StockNotationScreenerSearchDataCompliance Compliance { get; set; }

        /// <summary>
        /// Parameters for stock-specific key figures as reported for a fiscal year.
        /// </summary>
        /// <value>Parameters for stock-specific key figures as reported for a fiscal year.</value>
        [DataMember(Name = "reportedKeyFigures", EmitDefaultValue = false)]
        public List<StockNotationScreenerSearchDataReportedKeyFigures> ReportedKeyFigures { get; set; }

        /// <summary>
        /// Gets or Sets Performance
        /// </summary>
        [DataMember(Name = "performance", EmitDefaultValue = false)]
        public StockNotationScreenerSearchDataPerformance Performance { get; set; }

        /// <summary>
        /// Gets or Sets Volatility
        /// </summary>
        [DataMember(Name = "volatility", EmitDefaultValue = false)]
        public StockNotationScreenerSearchDataVolatility Volatility { get; set; }

        /// <summary>
        /// Gets or Sets TradingValue
        /// </summary>
        [DataMember(Name = "tradingValue", EmitDefaultValue = false)]
        public StockNotationScreenerSearchDataTradingValue TradingValue { get; set; }

        /// <summary>
        /// Gets or Sets SimpleMovingAverage
        /// </summary>
        [DataMember(Name = "simpleMovingAverage", EmitDefaultValue = false)]
        public StockNotationScreenerSearchDataSimpleMovingAverage SimpleMovingAverage { get; set; }

        /// <summary>
        /// Gets or Sets RsiWilder
        /// </summary>
        [DataMember(Name = "rsiWilder", EmitDefaultValue = false)]
        public StockNotationScreenerSearchDataRsiWilder RsiWilder { get; set; }

        /// <summary>
        /// Gets or Sets Recommendation
        /// </summary>
        [DataMember(Name = "recommendation", EmitDefaultValue = false)]
        public StockNotationScreenerSearchDataRecommendation Recommendation { get; set; }

        /// <summary>
        /// Parameters for stock-specific consolidated estimates for a fiscal year.
        /// </summary>
        /// <value>Parameters for stock-specific consolidated estimates for a fiscal year.</value>
        [DataMember(Name = "estimates", EmitDefaultValue = false)]
        public List<StockNotationScreenerSearchDataEstimates> Estimates { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class StockNotationScreenerSearchData {\n");
            sb.Append("  Validation: ").Append(Validation).Append("\n");
            sb.Append("  StockType: ").Append(StockType).Append("\n");
            sb.Append("  IndustryClassification: ").Append(IndustryClassification).Append("\n");
            sb.Append("  Company: ").Append(Company).Append("\n");
            sb.Append("  IndexMembership: ").Append(IndexMembership).Append("\n");
            sb.Append("  Compliance: ").Append(Compliance).Append("\n");
            sb.Append("  ReportedKeyFigures: ").Append(ReportedKeyFigures).Append("\n");
            sb.Append("  Performance: ").Append(Performance).Append("\n");
            sb.Append("  Volatility: ").Append(Volatility).Append("\n");
            sb.Append("  TradingValue: ").Append(TradingValue).Append("\n");
            sb.Append("  SimpleMovingAverage: ").Append(SimpleMovingAverage).Append("\n");
            sb.Append("  RsiWilder: ").Append(RsiWilder).Append("\n");
            sb.Append("  Recommendation: ").Append(Recommendation).Append("\n");
            sb.Append("  Estimates: ").Append(Estimates).Append("\n");
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
            return this.Equals(input as StockNotationScreenerSearchData);
        }

        /// <summary>
        /// Returns true if StockNotationScreenerSearchData instances are equal
        /// </summary>
        /// <param name="input">Instance of StockNotationScreenerSearchData to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(StockNotationScreenerSearchData input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Validation == input.Validation ||
                    (this.Validation != null &&
                    this.Validation.Equals(input.Validation))
                ) && 
                (
                    this.StockType == input.StockType ||
                    this.StockType.SequenceEqual(input.StockType)
                ) && 
                (
                    this.IndustryClassification == input.IndustryClassification ||
                    (this.IndustryClassification != null &&
                    this.IndustryClassification.Equals(input.IndustryClassification))
                ) && 
                (
                    this.Company == input.Company ||
                    (this.Company != null &&
                    this.Company.Equals(input.Company))
                ) && 
                (
                    this.IndexMembership == input.IndexMembership ||
                    (this.IndexMembership != null &&
                    this.IndexMembership.Equals(input.IndexMembership))
                ) && 
                (
                    this.Compliance == input.Compliance ||
                    (this.Compliance != null &&
                    this.Compliance.Equals(input.Compliance))
                ) && 
                (
                    this.ReportedKeyFigures == input.ReportedKeyFigures ||
                    this.ReportedKeyFigures != null &&
                    input.ReportedKeyFigures != null &&
                    this.ReportedKeyFigures.SequenceEqual(input.ReportedKeyFigures)
                ) && 
                (
                    this.Performance == input.Performance ||
                    (this.Performance != null &&
                    this.Performance.Equals(input.Performance))
                ) && 
                (
                    this.Volatility == input.Volatility ||
                    (this.Volatility != null &&
                    this.Volatility.Equals(input.Volatility))
                ) && 
                (
                    this.TradingValue == input.TradingValue ||
                    (this.TradingValue != null &&
                    this.TradingValue.Equals(input.TradingValue))
                ) && 
                (
                    this.SimpleMovingAverage == input.SimpleMovingAverage ||
                    (this.SimpleMovingAverage != null &&
                    this.SimpleMovingAverage.Equals(input.SimpleMovingAverage))
                ) && 
                (
                    this.RsiWilder == input.RsiWilder ||
                    (this.RsiWilder != null &&
                    this.RsiWilder.Equals(input.RsiWilder))
                ) && 
                (
                    this.Recommendation == input.Recommendation ||
                    (this.Recommendation != null &&
                    this.Recommendation.Equals(input.Recommendation))
                ) && 
                (
                    this.Estimates == input.Estimates ||
                    this.Estimates != null &&
                    input.Estimates != null &&
                    this.Estimates.SequenceEqual(input.Estimates)
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
                if (this.Validation != null)
                {
                    hashCode = (hashCode * 59) + this.Validation.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.StockType.GetHashCode();
                if (this.IndustryClassification != null)
                {
                    hashCode = (hashCode * 59) + this.IndustryClassification.GetHashCode();
                }
                if (this.Company != null)
                {
                    hashCode = (hashCode * 59) + this.Company.GetHashCode();
                }
                if (this.IndexMembership != null)
                {
                    hashCode = (hashCode * 59) + this.IndexMembership.GetHashCode();
                }
                if (this.Compliance != null)
                {
                    hashCode = (hashCode * 59) + this.Compliance.GetHashCode();
                }
                if (this.ReportedKeyFigures != null)
                {
                    hashCode = (hashCode * 59) + this.ReportedKeyFigures.GetHashCode();
                }
                if (this.Performance != null)
                {
                    hashCode = (hashCode * 59) + this.Performance.GetHashCode();
                }
                if (this.Volatility != null)
                {
                    hashCode = (hashCode * 59) + this.Volatility.GetHashCode();
                }
                if (this.TradingValue != null)
                {
                    hashCode = (hashCode * 59) + this.TradingValue.GetHashCode();
                }
                if (this.SimpleMovingAverage != null)
                {
                    hashCode = (hashCode * 59) + this.SimpleMovingAverage.GetHashCode();
                }
                if (this.RsiWilder != null)
                {
                    hashCode = (hashCode * 59) + this.RsiWilder.GetHashCode();
                }
                if (this.Recommendation != null)
                {
                    hashCode = (hashCode * 59) + this.Recommendation.GetHashCode();
                }
                if (this.Estimates != null)
                {
                    hashCode = (hashCode * 59) + this.Estimates.GetHashCode();
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
