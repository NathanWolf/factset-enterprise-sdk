/*
 * FactSet Estimates
 *
 * Gain access to 20+ years of comprehensive estimates and statistics of over 250+ estimated metrics, including financial statement items, product segments, geosegments, and industry metrics. FactSet's consensus estimates are aggregated from a wide base of over 800+ contributors and cover over 19,000 active companies across 90+ countries. Data returned can be accessed on the data frequencies based on quarterly, fiscal years, and calendar years. FactSet Estimates updates on a real time basis intraday (every 5 minutes). Updating times vary based on earning season vs. non-earning season but the goal is to have the data available to the client within a few hours that FactSet receives updated information. Often times updates times can be much faster as FactSet has always been known as one of the fastest estimate providers in the market. 
 *
 * The version of the OpenAPI document: 2.3.0
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
using OpenAPIDateConverter = FactSet.SDK.FactSetEstimates.Client.OpenAPIDateConverter;

namespace FactSet.SDK.FactSetEstimates.Model
{
    /// <summary>
    /// Surprise
    /// </summary>
    [DataContract(Name = "surprise")]
    public partial class Surprise : IEquatable<Surprise>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="Surprise" /> class.
        /// </summary>
        /// <param name="fsymId">fsymId.</param>
        /// <param name="date">Date for data expressed in YYYY-MM-DD format..</param>
        /// <param name="currency">Currency used estimates in consensus calculations. Currency used estimates in consensus calculations. For a list of currency ISO codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470)..</param>
        /// <param name="metric">Company&#39;s Financial statement &#39;metric&#39; that is estimated. Use the factset-estimates/v#/metrics endpoint for a complete list. For more details, visit [Online Assistant Page #15034](https://oa.apps.factset.com/pages/15034)..</param>
        /// <param name="statistic">Method of calculation for the consensus &#39;statistic&#39;. For more details, visit [Online Assistant Page #16598](https://oa.apps.factset.com/pages/16114)..</param>
        /// <param name="periodicity">Company&#39;s &#39;periodicity&#39; for the estimate record, reflecting Annual, Quarterly, or Semi-Annual report periods. Next-twelve-months (NTMA) and Last-twelve-months (LTMA) also supported..</param>
        /// <param name="fiscalEndDate">Company&#39;s &#39;fiscal end date&#39; for the estimate record expressed in YYYY-MM-DD format.</param>
        /// <param name="fiscalYear">Company&#39;s &#39;fiscal year&#39; for the estimate record.</param>
        /// <param name="fiscalPeriod">Company&#39;s &#39;fiscal period&#39; for the estimate record.  &#39;Periodicity&#39; defines context for period..</param>
        /// <param name="surpriseDate">Date of the reported event expressed in YYYY-MM-DD format. For more details, visit [Online Assistant Page #16601](https://oa.apps.factset.com/pages/16601)..</param>
        /// <param name="surpriseAmount">Amount of difference between last consensus and actual. For more details, visit [Online Assistant Page #16145](https://oa.apps.factset.com/pages/16145)..</param>
        /// <param name="surprisePercent">Percent difference between last consensus and actual. For more details, visit [Online Assistant Page #16145](https://oa.apps.factset.com/pages/16145)..</param>
        /// <param name="surpriseBefore">Last consensus before event. For more details, visit [Online Assistant Page #16145](https://oa.apps.factset.com/pages/16145)..</param>
        /// <param name="surpriseAfter">Actual value after event. For more details, visit [Online Assistant Page #16145](https://oa.apps.factset.com/pages/16145)..</param>
        /// <param name="eventDescription">Description of event. For more details, visit [Online Assistant Page #16601](https://oa.apps.factset.com/pages/16601)..</param>
        /// <param name="eventFlag">Flag for event. Code of Event Flag, where 0 &#x3D; results and 1 &#x3D; profit warning. For more details, visit [Online Assistant Page #16601](https://oa.apps.factset.com/pages/16601)..</param>
        /// <param name="requestId">requestId.</param>
        public Surprise(string fsymId = default(string), DateTime date = default(DateTime), string currency = default(string), string metric = default(string), string statistic = default(string), string periodicity = default(string), DateTime fiscalEndDate = default(DateTime), int fiscalYear = default(int), int fiscalPeriod = default(int), DateTime surpriseDate = default(DateTime), double surpriseAmount = default(double), double surprisePercent = default(double), double surpriseBefore = default(double), double surpriseAfter = default(double), string eventDescription = default(string), int eventFlag = default(int), string requestId = default(string))
        {
            this.FsymId = fsymId;
            this.Date = date;
            this.Currency = currency;
            this.Metric = metric;
            this.Statistic = statistic;
            this.Periodicity = periodicity;
            this.FiscalEndDate = fiscalEndDate;
            this.FiscalYear = fiscalYear;
            this.FiscalPeriod = fiscalPeriod;
            this.SurpriseDate = surpriseDate;
            this.SurpriseAmount = surpriseAmount;
            this.SurprisePercent = surprisePercent;
            this.SurpriseBefore = surpriseBefore;
            this.SurpriseAfter = surpriseAfter;
            this.EventDescription = eventDescription;
            this.EventFlag = eventFlag;
            this.RequestId = requestId;
        }

        /// <summary>
        /// Gets or Sets FsymId
        /// </summary>
        [DataMember(Name = "fsymId", EmitDefaultValue = false)]
        public string FsymId { get; set; }

        /// <summary>
        /// Date for data expressed in YYYY-MM-DD format.
        /// </summary>
        /// <value>Date for data expressed in YYYY-MM-DD format.</value>
        [DataMember(Name = "date", EmitDefaultValue = false)]
        [JsonConverter(typeof(OpenAPIDateConverter))]
        public DateTime Date { get; set; }

        /// <summary>
        /// Currency used estimates in consensus calculations. Currency used estimates in consensus calculations. For a list of currency ISO codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470).
        /// </summary>
        /// <value>Currency used estimates in consensus calculations. Currency used estimates in consensus calculations. For a list of currency ISO codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470).</value>
        [DataMember(Name = "currency", EmitDefaultValue = false)]
        public string Currency { get; set; }

        /// <summary>
        /// Company&#39;s Financial statement &#39;metric&#39; that is estimated. Use the factset-estimates/v#/metrics endpoint for a complete list. For more details, visit [Online Assistant Page #15034](https://oa.apps.factset.com/pages/15034).
        /// </summary>
        /// <value>Company&#39;s Financial statement &#39;metric&#39; that is estimated. Use the factset-estimates/v#/metrics endpoint for a complete list. For more details, visit [Online Assistant Page #15034](https://oa.apps.factset.com/pages/15034).</value>
        [DataMember(Name = "metric", EmitDefaultValue = false)]
        public string Metric { get; set; }

        /// <summary>
        /// Method of calculation for the consensus &#39;statistic&#39;. For more details, visit [Online Assistant Page #16598](https://oa.apps.factset.com/pages/16114).
        /// </summary>
        /// <value>Method of calculation for the consensus &#39;statistic&#39;. For more details, visit [Online Assistant Page #16598](https://oa.apps.factset.com/pages/16114).</value>
        [DataMember(Name = "statistic", EmitDefaultValue = false)]
        public string Statistic { get; set; }

        /// <summary>
        /// Company&#39;s &#39;periodicity&#39; for the estimate record, reflecting Annual, Quarterly, or Semi-Annual report periods. Next-twelve-months (NTMA) and Last-twelve-months (LTMA) also supported.
        /// </summary>
        /// <value>Company&#39;s &#39;periodicity&#39; for the estimate record, reflecting Annual, Quarterly, or Semi-Annual report periods. Next-twelve-months (NTMA) and Last-twelve-months (LTMA) also supported.</value>
        [DataMember(Name = "periodicity", EmitDefaultValue = false)]
        public string Periodicity { get; set; }

        /// <summary>
        /// Company&#39;s &#39;fiscal end date&#39; for the estimate record expressed in YYYY-MM-DD format
        /// </summary>
        /// <value>Company&#39;s &#39;fiscal end date&#39; for the estimate record expressed in YYYY-MM-DD format</value>
        [DataMember(Name = "fiscalEndDate", EmitDefaultValue = false)]
        [JsonConverter(typeof(OpenAPIDateConverter))]
        public DateTime FiscalEndDate { get; set; }

        /// <summary>
        /// Company&#39;s &#39;fiscal year&#39; for the estimate record
        /// </summary>
        /// <value>Company&#39;s &#39;fiscal year&#39; for the estimate record</value>
        [DataMember(Name = "fiscalYear", EmitDefaultValue = false)]
        public int FiscalYear { get; set; }

        /// <summary>
        /// Company&#39;s &#39;fiscal period&#39; for the estimate record.  &#39;Periodicity&#39; defines context for period.
        /// </summary>
        /// <value>Company&#39;s &#39;fiscal period&#39; for the estimate record.  &#39;Periodicity&#39; defines context for period.</value>
        [DataMember(Name = "fiscalPeriod", EmitDefaultValue = false)]
        public int FiscalPeriod { get; set; }

        /// <summary>
        /// Date of the reported event expressed in YYYY-MM-DD format. For more details, visit [Online Assistant Page #16601](https://oa.apps.factset.com/pages/16601).
        /// </summary>
        /// <value>Date of the reported event expressed in YYYY-MM-DD format. For more details, visit [Online Assistant Page #16601](https://oa.apps.factset.com/pages/16601).</value>
        [DataMember(Name = "surpriseDate", EmitDefaultValue = false)]
        [JsonConverter(typeof(OpenAPIDateConverter))]
        public DateTime SurpriseDate { get; set; }

        /// <summary>
        /// Amount of difference between last consensus and actual. For more details, visit [Online Assistant Page #16145](https://oa.apps.factset.com/pages/16145).
        /// </summary>
        /// <value>Amount of difference between last consensus and actual. For more details, visit [Online Assistant Page #16145](https://oa.apps.factset.com/pages/16145).</value>
        [DataMember(Name = "surpriseAmount", EmitDefaultValue = false)]
        public double SurpriseAmount { get; set; }

        /// <summary>
        /// Percent difference between last consensus and actual. For more details, visit [Online Assistant Page #16145](https://oa.apps.factset.com/pages/16145).
        /// </summary>
        /// <value>Percent difference between last consensus and actual. For more details, visit [Online Assistant Page #16145](https://oa.apps.factset.com/pages/16145).</value>
        [DataMember(Name = "surprisePercent", EmitDefaultValue = false)]
        public double SurprisePercent { get; set; }

        /// <summary>
        /// Last consensus before event. For more details, visit [Online Assistant Page #16145](https://oa.apps.factset.com/pages/16145).
        /// </summary>
        /// <value>Last consensus before event. For more details, visit [Online Assistant Page #16145](https://oa.apps.factset.com/pages/16145).</value>
        [DataMember(Name = "surpriseBefore", EmitDefaultValue = false)]
        public double SurpriseBefore { get; set; }

        /// <summary>
        /// Actual value after event. For more details, visit [Online Assistant Page #16145](https://oa.apps.factset.com/pages/16145).
        /// </summary>
        /// <value>Actual value after event. For more details, visit [Online Assistant Page #16145](https://oa.apps.factset.com/pages/16145).</value>
        [DataMember(Name = "surpriseAfter", EmitDefaultValue = false)]
        public double SurpriseAfter { get; set; }

        /// <summary>
        /// Description of event. For more details, visit [Online Assistant Page #16601](https://oa.apps.factset.com/pages/16601).
        /// </summary>
        /// <value>Description of event. For more details, visit [Online Assistant Page #16601](https://oa.apps.factset.com/pages/16601).</value>
        [DataMember(Name = "eventDescription", EmitDefaultValue = false)]
        public string EventDescription { get; set; }

        /// <summary>
        /// Flag for event. Code of Event Flag, where 0 &#x3D; results and 1 &#x3D; profit warning. For more details, visit [Online Assistant Page #16601](https://oa.apps.factset.com/pages/16601).
        /// </summary>
        /// <value>Flag for event. Code of Event Flag, where 0 &#x3D; results and 1 &#x3D; profit warning. For more details, visit [Online Assistant Page #16601](https://oa.apps.factset.com/pages/16601).</value>
        [DataMember(Name = "eventFlag", EmitDefaultValue = false)]
        public int EventFlag { get; set; }

        /// <summary>
        /// Gets or Sets RequestId
        /// </summary>
        [DataMember(Name = "requestId", EmitDefaultValue = false)]
        public string RequestId { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class Surprise {\n");
            sb.Append("  FsymId: ").Append(FsymId).Append("\n");
            sb.Append("  Date: ").Append(Date).Append("\n");
            sb.Append("  Currency: ").Append(Currency).Append("\n");
            sb.Append("  Metric: ").Append(Metric).Append("\n");
            sb.Append("  Statistic: ").Append(Statistic).Append("\n");
            sb.Append("  Periodicity: ").Append(Periodicity).Append("\n");
            sb.Append("  FiscalEndDate: ").Append(FiscalEndDate).Append("\n");
            sb.Append("  FiscalYear: ").Append(FiscalYear).Append("\n");
            sb.Append("  FiscalPeriod: ").Append(FiscalPeriod).Append("\n");
            sb.Append("  SurpriseDate: ").Append(SurpriseDate).Append("\n");
            sb.Append("  SurpriseAmount: ").Append(SurpriseAmount).Append("\n");
            sb.Append("  SurprisePercent: ").Append(SurprisePercent).Append("\n");
            sb.Append("  SurpriseBefore: ").Append(SurpriseBefore).Append("\n");
            sb.Append("  SurpriseAfter: ").Append(SurpriseAfter).Append("\n");
            sb.Append("  EventDescription: ").Append(EventDescription).Append("\n");
            sb.Append("  EventFlag: ").Append(EventFlag).Append("\n");
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
            return this.Equals(input as Surprise);
        }

        /// <summary>
        /// Returns true if Surprise instances are equal
        /// </summary>
        /// <param name="input">Instance of Surprise to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Surprise input)
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
                    this.Metric == input.Metric ||
                    (this.Metric != null &&
                    this.Metric.Equals(input.Metric))
                ) && 
                (
                    this.Statistic == input.Statistic ||
                    (this.Statistic != null &&
                    this.Statistic.Equals(input.Statistic))
                ) && 
                (
                    this.Periodicity == input.Periodicity ||
                    (this.Periodicity != null &&
                    this.Periodicity.Equals(input.Periodicity))
                ) && 
                (
                    this.FiscalEndDate == input.FiscalEndDate ||
                    (this.FiscalEndDate != null &&
                    this.FiscalEndDate.Equals(input.FiscalEndDate))
                ) && 
                (
                    this.FiscalYear == input.FiscalYear ||
                    this.FiscalYear.Equals(input.FiscalYear)
                ) && 
                (
                    this.FiscalPeriod == input.FiscalPeriod ||
                    this.FiscalPeriod.Equals(input.FiscalPeriod)
                ) && 
                (
                    this.SurpriseDate == input.SurpriseDate ||
                    (this.SurpriseDate != null &&
                    this.SurpriseDate.Equals(input.SurpriseDate))
                ) && 
                (
                    this.SurpriseAmount == input.SurpriseAmount ||
                    this.SurpriseAmount.Equals(input.SurpriseAmount)
                ) && 
                (
                    this.SurprisePercent == input.SurprisePercent ||
                    this.SurprisePercent.Equals(input.SurprisePercent)
                ) && 
                (
                    this.SurpriseBefore == input.SurpriseBefore ||
                    this.SurpriseBefore.Equals(input.SurpriseBefore)
                ) && 
                (
                    this.SurpriseAfter == input.SurpriseAfter ||
                    this.SurpriseAfter.Equals(input.SurpriseAfter)
                ) && 
                (
                    this.EventDescription == input.EventDescription ||
                    (this.EventDescription != null &&
                    this.EventDescription.Equals(input.EventDescription))
                ) && 
                (
                    this.EventFlag == input.EventFlag ||
                    this.EventFlag.Equals(input.EventFlag)
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
                if (this.Date != null)
                {
                    hashCode = (hashCode * 59) + this.Date.GetHashCode();
                }
                if (this.Currency != null)
                {
                    hashCode = (hashCode * 59) + this.Currency.GetHashCode();
                }
                if (this.Metric != null)
                {
                    hashCode = (hashCode * 59) + this.Metric.GetHashCode();
                }
                if (this.Statistic != null)
                {
                    hashCode = (hashCode * 59) + this.Statistic.GetHashCode();
                }
                if (this.Periodicity != null)
                {
                    hashCode = (hashCode * 59) + this.Periodicity.GetHashCode();
                }
                if (this.FiscalEndDate != null)
                {
                    hashCode = (hashCode * 59) + this.FiscalEndDate.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.FiscalYear.GetHashCode();
                hashCode = (hashCode * 59) + this.FiscalPeriod.GetHashCode();
                if (this.SurpriseDate != null)
                {
                    hashCode = (hashCode * 59) + this.SurpriseDate.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.SurpriseAmount.GetHashCode();
                hashCode = (hashCode * 59) + this.SurprisePercent.GetHashCode();
                hashCode = (hashCode * 59) + this.SurpriseBefore.GetHashCode();
                hashCode = (hashCode * 59) + this.SurpriseAfter.GetHashCode();
                if (this.EventDescription != null)
                {
                    hashCode = (hashCode * 59) + this.EventDescription.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.EventFlag.GetHashCode();
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
