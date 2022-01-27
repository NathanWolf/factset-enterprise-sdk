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
    /// Request object for requesting rolling detail estimates.
    /// </summary>
    [DataContract(Name = "rollingDetailRequest")]
    public partial class RollingDetailRequest : IEquatable<RollingDetailRequest>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="RollingDetailRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected RollingDetailRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="RollingDetailRequest" /> class.
        /// </summary>
        /// <param name="ids">The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids. * Make Note - id limit of 3000 for defaults, otherwise the service is limited to a 30 second duration. This can be reached when increasing total number of metrics requested and depth of history. *  (required).</param>
        /// <param name="startDate">The start date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this #endpoint. .</param>
        /// <param name="endDate">The end date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint. .</param>
        /// <param name="frequency">frequency.</param>
        /// <param name="includeAll">Include All filter is used to identify included and excluded broker details from the consensus   By default the service would return only the brokers included in the consensus-   * **TRUE** &#x3D; Returns all the brokers included and excluded in the consensus   * **FALSE** &#x3D; Returns only the broker details included in the consensus  (default to false).</param>
        /// <param name="relativeFiscalStart">Relative fiscal period, expressed as an integer, used to filter results..</param>
        /// <param name="relativeFiscalEnd">Relative fiscal period, expressed as an integer, used to filter results..</param>
        /// <param name="periodicity">periodicity.</param>
        /// <param name="metrics">Requested metrics. Use the metrics endpoint for a list of estimate items. Note, the number of metrics you are allowed to supply is limited to 1 for now. For more details, visit [Online Assistant Page #15034](https://oa.apps.factset.com/pages/15034). (required).</param>
        /// <param name="currency">Currency code for adjusting the data. For a list of currency ISO codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470)..</param>
        public RollingDetailRequest(List<string> ids = default(List<string>), string startDate = default(string), string endDate = default(string), Frequency frequency = default(Frequency), bool includeAll = false, int relativeFiscalStart = default(int), int relativeFiscalEnd = default(int), Periodicity periodicity = default(Periodicity), List<string> metrics = default(List<string>), string currency = default(string))
        {
            // to ensure "ids" is required (not null)
            if (ids == null) {
                throw new ArgumentNullException("ids is a required property for RollingDetailRequest and cannot be null");
            }
            this.Ids = ids;
            // to ensure "metrics" is required (not null)
            if (metrics == null) {
                throw new ArgumentNullException("metrics is a required property for RollingDetailRequest and cannot be null");
            }
            this.Metrics = metrics;
            this.StartDate = startDate;
            this.EndDate = endDate;
            this.Frequency = frequency;
            this.IncludeAll = includeAll;
            this.RelativeFiscalStart = relativeFiscalStart;
            this.RelativeFiscalEnd = relativeFiscalEnd;
            this.Periodicity = periodicity;
            this.Currency = currency;
        }

        /// <summary>
        /// The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids. * Make Note - id limit of 3000 for defaults, otherwise the service is limited to a 30 second duration. This can be reached when increasing total number of metrics requested and depth of history. * 
        /// </summary>
        /// <value>The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids. * Make Note - id limit of 3000 for defaults, otherwise the service is limited to a 30 second duration. This can be reached when increasing total number of metrics requested and depth of history. * </value>
        [DataMember(Name = "ids", IsRequired = true, EmitDefaultValue = false)]
        public List<string> Ids { get; set; }

        /// <summary>
        /// The start date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this #endpoint. 
        /// </summary>
        /// <value>The start date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this #endpoint. </value>
        [DataMember(Name = "startDate", EmitDefaultValue = false)]
        public string StartDate { get; set; }

        /// <summary>
        /// The end date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint. 
        /// </summary>
        /// <value>The end date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint. </value>
        [DataMember(Name = "endDate", EmitDefaultValue = false)]
        public string EndDate { get; set; }

        /// <summary>
        /// Gets or Sets Frequency
        /// </summary>
        [DataMember(Name = "frequency", EmitDefaultValue = false)]
        public Frequency Frequency { get; set; }

        /// <summary>
        /// Include All filter is used to identify included and excluded broker details from the consensus   By default the service would return only the brokers included in the consensus-   * **TRUE** &#x3D; Returns all the brokers included and excluded in the consensus   * **FALSE** &#x3D; Returns only the broker details included in the consensus 
        /// </summary>
        /// <value>Include All filter is used to identify included and excluded broker details from the consensus   By default the service would return only the brokers included in the consensus-   * **TRUE** &#x3D; Returns all the brokers included and excluded in the consensus   * **FALSE** &#x3D; Returns only the broker details included in the consensus </value>
        [DataMember(Name = "includeAll", EmitDefaultValue = true)]
        public bool IncludeAll { get; set; }

        /// <summary>
        /// Relative fiscal period, expressed as an integer, used to filter results.
        /// </summary>
        /// <value>Relative fiscal period, expressed as an integer, used to filter results.</value>
        [DataMember(Name = "relativeFiscalStart", EmitDefaultValue = false)]
        public int RelativeFiscalStart { get; set; }

        /// <summary>
        /// Relative fiscal period, expressed as an integer, used to filter results.
        /// </summary>
        /// <value>Relative fiscal period, expressed as an integer, used to filter results.</value>
        [DataMember(Name = "relativeFiscalEnd", EmitDefaultValue = false)]
        public int RelativeFiscalEnd { get; set; }

        /// <summary>
        /// Gets or Sets Periodicity
        /// </summary>
        [DataMember(Name = "periodicity", EmitDefaultValue = false)]
        public Periodicity Periodicity { get; set; }

        /// <summary>
        /// Requested metrics. Use the metrics endpoint for a list of estimate items. Note, the number of metrics you are allowed to supply is limited to 1 for now. For more details, visit [Online Assistant Page #15034](https://oa.apps.factset.com/pages/15034).
        /// </summary>
        /// <value>Requested metrics. Use the metrics endpoint for a list of estimate items. Note, the number of metrics you are allowed to supply is limited to 1 for now. For more details, visit [Online Assistant Page #15034](https://oa.apps.factset.com/pages/15034).</value>
        [DataMember(Name = "metrics", IsRequired = true, EmitDefaultValue = false)]
        public List<string> Metrics { get; set; }

        /// <summary>
        /// Currency code for adjusting the data. For a list of currency ISO codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470).
        /// </summary>
        /// <value>Currency code for adjusting the data. For a list of currency ISO codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470).</value>
        [DataMember(Name = "currency", EmitDefaultValue = false)]
        public string Currency { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class RollingDetailRequest {\n");
            sb.Append("  Ids: ").Append(Ids).Append("\n");
            sb.Append("  StartDate: ").Append(StartDate).Append("\n");
            sb.Append("  EndDate: ").Append(EndDate).Append("\n");
            sb.Append("  Frequency: ").Append(Frequency).Append("\n");
            sb.Append("  IncludeAll: ").Append(IncludeAll).Append("\n");
            sb.Append("  RelativeFiscalStart: ").Append(RelativeFiscalStart).Append("\n");
            sb.Append("  RelativeFiscalEnd: ").Append(RelativeFiscalEnd).Append("\n");
            sb.Append("  Periodicity: ").Append(Periodicity).Append("\n");
            sb.Append("  Metrics: ").Append(Metrics).Append("\n");
            sb.Append("  Currency: ").Append(Currency).Append("\n");
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
            return this.Equals(input as RollingDetailRequest);
        }

        /// <summary>
        /// Returns true if RollingDetailRequest instances are equal
        /// </summary>
        /// <param name="input">Instance of RollingDetailRequest to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(RollingDetailRequest input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Ids == input.Ids ||
                    this.Ids != null &&
                    input.Ids != null &&
                    this.Ids.SequenceEqual(input.Ids)
                ) && 
                (
                    this.StartDate == input.StartDate ||
                    (this.StartDate != null &&
                    this.StartDate.Equals(input.StartDate))
                ) && 
                (
                    this.EndDate == input.EndDate ||
                    (this.EndDate != null &&
                    this.EndDate.Equals(input.EndDate))
                ) && 
                (
                    this.Frequency == input.Frequency ||
                    (this.Frequency != null &&
                    this.Frequency.Equals(input.Frequency))
                ) && 
                (
                    this.IncludeAll == input.IncludeAll ||
                    this.IncludeAll.Equals(input.IncludeAll)
                ) && 
                (
                    this.RelativeFiscalStart == input.RelativeFiscalStart ||
                    this.RelativeFiscalStart.Equals(input.RelativeFiscalStart)
                ) && 
                (
                    this.RelativeFiscalEnd == input.RelativeFiscalEnd ||
                    this.RelativeFiscalEnd.Equals(input.RelativeFiscalEnd)
                ) && 
                (
                    this.Periodicity == input.Periodicity ||
                    (this.Periodicity != null &&
                    this.Periodicity.Equals(input.Periodicity))
                ) && 
                (
                    this.Metrics == input.Metrics ||
                    this.Metrics != null &&
                    input.Metrics != null &&
                    this.Metrics.SequenceEqual(input.Metrics)
                ) && 
                (
                    this.Currency == input.Currency ||
                    (this.Currency != null &&
                    this.Currency.Equals(input.Currency))
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
                if (this.Ids != null)
                    hashCode = hashCode * 59 + this.Ids.GetHashCode();
                if (this.StartDate != null)
                    hashCode = hashCode * 59 + this.StartDate.GetHashCode();
                if (this.EndDate != null)
                    hashCode = hashCode * 59 + this.EndDate.GetHashCode();
                if (this.Frequency != null)
                    hashCode = hashCode * 59 + this.Frequency.GetHashCode();
                hashCode = hashCode * 59 + this.IncludeAll.GetHashCode();
                hashCode = hashCode * 59 + this.RelativeFiscalStart.GetHashCode();
                hashCode = hashCode * 59 + this.RelativeFiscalEnd.GetHashCode();
                if (this.Periodicity != null)
                    hashCode = hashCode * 59 + this.Periodicity.GetHashCode();
                if (this.Metrics != null)
                    hashCode = hashCode * 59 + this.Metrics.GetHashCode();
                if (this.Currency != null)
                    hashCode = hashCode * 59 + this.Currency.GetHashCode();
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
