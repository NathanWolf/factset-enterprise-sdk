/*
 * FactSet Fundamentals API
 *
 * Gain access to current, comprehensive, and comparative information on securities in worldwide developed and emerging markets. Composed of annual and interim/quarterly data, detailed historical financial statement content, per share data, and calculated ratios, FactSet Fundamentals provides you with the information you need for a global investment perspective. 
 *
 * The version of the OpenAPI document: 1.0.2
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
using OpenAPIDateConverter = FactSet.SDK.FactSetFundamentals.Client.OpenAPIDateConverter;

namespace FactSet.SDK.FactSetFundamentals.Model
{
    /// <summary>
    /// Fundamental
    /// </summary>
    [DataContract(Name = "fundamental")]
    public partial class Fundamental : IEquatable<Fundamental>, IValidatableObject
    {
        /// <summary>
        /// Periodicity or frequency of the fiscal periods, where ANN &#x3D; Annual Original, ANN_R &#x3D; Annual Latest, QTR &#x3D; Quarterly Original, QTR_R &#x3D; Quarterly Latest, SEMI &#x3D; Semi-Annual, LTM &#x3D; Last Twelve Months, LTMSG &#x3D; Last Twelve Months Global [OA17959](https://my.apps.factset.com/oa/pages/17959) and YTD &#x3D; Year-to-date.
        /// </summary>
        /// <value>Periodicity or frequency of the fiscal periods, where ANN &#x3D; Annual Original, ANN_R &#x3D; Annual Latest, QTR &#x3D; Quarterly Original, QTR_R &#x3D; Quarterly Latest, SEMI &#x3D; Semi-Annual, LTM &#x3D; Last Twelve Months, LTMSG &#x3D; Last Twelve Months Global [OA17959](https://my.apps.factset.com/oa/pages/17959) and YTD &#x3D; Year-to-date.</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum PeriodicityEnum
        {
            /// <summary>
            /// Enum ANN for value: ANN
            /// </summary>
            [EnumMember(Value = "ANN")]
            ANN = 1,

            /// <summary>
            /// Enum ANNR for value: ANN_R
            /// </summary>
            [EnumMember(Value = "ANN_R")]
            ANNR = 2,

            /// <summary>
            /// Enum QTR for value: QTR
            /// </summary>
            [EnumMember(Value = "QTR")]
            QTR = 3,

            /// <summary>
            /// Enum QTRR for value: QTR_R
            /// </summary>
            [EnumMember(Value = "QTR_R")]
            QTRR = 4,

            /// <summary>
            /// Enum SEMI for value: SEMI
            /// </summary>
            [EnumMember(Value = "SEMI")]
            SEMI = 5,

            /// <summary>
            /// Enum CAL for value: CAL
            /// </summary>
            [EnumMember(Value = "CAL")]
            CAL = 6,

            /// <summary>
            /// Enum LTM for value: LTM
            /// </summary>
            [EnumMember(Value = "LTM")]
            LTM = 7,

            /// <summary>
            /// Enum LTMSG for value: LTMSG
            /// </summary>
            [EnumMember(Value = "LTMSG")]
            LTMSG = 8,

            /// <summary>
            /// Enum YTD for value: YTD
            /// </summary>
            [EnumMember(Value = "YTD")]
            YTD = 9

        }


        /// <summary>
        /// Periodicity or frequency of the fiscal periods, where ANN &#x3D; Annual Original, ANN_R &#x3D; Annual Latest, QTR &#x3D; Quarterly Original, QTR_R &#x3D; Quarterly Latest, SEMI &#x3D; Semi-Annual, LTM &#x3D; Last Twelve Months, LTMSG &#x3D; Last Twelve Months Global [OA17959](https://my.apps.factset.com/oa/pages/17959) and YTD &#x3D; Year-to-date.
        /// </summary>
        /// <value>Periodicity or frequency of the fiscal periods, where ANN &#x3D; Annual Original, ANN_R &#x3D; Annual Latest, QTR &#x3D; Quarterly Original, QTR_R &#x3D; Quarterly Latest, SEMI &#x3D; Semi-Annual, LTM &#x3D; Last Twelve Months, LTMSG &#x3D; Last Twelve Months Global [OA17959](https://my.apps.factset.com/oa/pages/17959) and YTD &#x3D; Year-to-date.</value>
        [DataMember(Name = "periodicity", EmitDefaultValue = false)]
        public PeriodicityEnum? Periodicity { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="Fundamental" /> class.
        /// </summary>
        /// <param name="requestId">Identifier that was used for the request..</param>
        /// <param name="fsymId">FactSet Regional Security Identifier. Six alpha-numeric characters, excluding vowels, with an -R suffix (XXXXXX-R). Identifies the security&#39;s best regional security data series per currency. For equities, all primary listings per region and currency are allocated a regional-level permanent identifier. The regional-level permanent identifier will be available once a SEDOL representing the region/currency has been allocated and the identifiers are on FactSet..</param>
        /// <param name="metric">The requested &#x60;metric&#x60; input, representing the Fundamental Data Item. For a definition of the item please use the /fundamentals/v#/metrics endpoint..</param>
        /// <param name="periodicity">Periodicity or frequency of the fiscal periods, where ANN &#x3D; Annual Original, ANN_R &#x3D; Annual Latest, QTR &#x3D; Quarterly Original, QTR_R &#x3D; Quarterly Latest, SEMI &#x3D; Semi-Annual, LTM &#x3D; Last Twelve Months, LTMSG &#x3D; Last Twelve Months Global [OA17959](https://my.apps.factset.com/oa/pages/17959) and YTD &#x3D; Year-to-date..</param>
        /// <param name="fiscalPeriod">Fiscal Period indicator. Returns an integer representing the fiscal period for the requested item and periodicity. QUARTERLY CODE: 1-Fist Quarter; 2-Second Quarter; 3-Third Quarter; 4-Fourth Quarter. SEMI-CODE: 1-First Semi-annual Period; 2-Second Semi-annual Period..</param>
        /// <param name="fiscalYear">Fiscal year of the reported period in YYYY format..</param>
        /// <param name="fiscalPeriodLength">Length of fiscal period in days..</param>
        /// <param name="fiscalEndDate">The normalized data the fiscal period ended..</param>
        /// <param name="reportDate">The date the reported fiscal period actually ended..</param>
        /// <param name="epsReportDate">The date the EPS was reported for the requested periodicity. In YYYY-MM-DD format. Unavailable data returned as 0001-01-01..</param>
        /// <param name="updateType">The update type, where: 1 &#x3D; Preliminary; 2 &#x3D; FAST; 3 &#x3D; Final. For more details, visit [Online Assistant Page #D13094](https://oa.apps.factset.com/pages/D13094)..</param>
        /// <param name="updateStatus">Update Status Flag: P &#x3D; Preliminary - The period is updated from a report that usually contains limited or only key information., F &#x3D; Final - The period is updated from a report where detailed information are available in financial statements including the notes to the line items..</param>
        /// <param name="currency">Currency code for the data. For a list of currency ISO codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470)..</param>
        /// <param name="value">Value of the data metric requested. Note that the type of value is &#39;object&#39;, and depending on the data metric requested, the value could be an object representation of a string or double. .</param>
        public Fundamental(string requestId = default(string), string fsymId = default(string), string metric = default(string), PeriodicityEnum? periodicity = default(PeriodicityEnum?), int fiscalPeriod = default(int), int fiscalYear = default(int), int fiscalPeriodLength = default(int), DateTime fiscalEndDate = default(DateTime), DateTime reportDate = default(DateTime), DateTime epsReportDate = default(DateTime), int updateType = default(int), string updateStatus = default(string), string currency = default(string), Object value = default(Object))
        {
            this.RequestId = requestId;
            this.FsymId = fsymId;
            this.Metric = metric;
            this.Periodicity = periodicity;
            this.FiscalPeriod = fiscalPeriod;
            this.FiscalYear = fiscalYear;
            this.FiscalPeriodLength = fiscalPeriodLength;
            this.FiscalEndDate = fiscalEndDate;
            this.ReportDate = reportDate;
            this.EpsReportDate = epsReportDate;
            this.UpdateType = updateType;
            this.UpdateStatus = updateStatus;
            this.Currency = currency;
            this.Value = value;
        }

        /// <summary>
        /// Identifier that was used for the request.
        /// </summary>
        /// <value>Identifier that was used for the request.</value>
        [DataMember(Name = "requestId", EmitDefaultValue = false)]
        public string RequestId { get; set; }

        /// <summary>
        /// FactSet Regional Security Identifier. Six alpha-numeric characters, excluding vowels, with an -R suffix (XXXXXX-R). Identifies the security&#39;s best regional security data series per currency. For equities, all primary listings per region and currency are allocated a regional-level permanent identifier. The regional-level permanent identifier will be available once a SEDOL representing the region/currency has been allocated and the identifiers are on FactSet.
        /// </summary>
        /// <value>FactSet Regional Security Identifier. Six alpha-numeric characters, excluding vowels, with an -R suffix (XXXXXX-R). Identifies the security&#39;s best regional security data series per currency. For equities, all primary listings per region and currency are allocated a regional-level permanent identifier. The regional-level permanent identifier will be available once a SEDOL representing the region/currency has been allocated and the identifiers are on FactSet.</value>
        [DataMember(Name = "fsymId", EmitDefaultValue = false)]
        public string FsymId { get; set; }

        /// <summary>
        /// The requested &#x60;metric&#x60; input, representing the Fundamental Data Item. For a definition of the item please use the /fundamentals/v#/metrics endpoint.
        /// </summary>
        /// <value>The requested &#x60;metric&#x60; input, representing the Fundamental Data Item. For a definition of the item please use the /fundamentals/v#/metrics endpoint.</value>
        [DataMember(Name = "metric", EmitDefaultValue = false)]
        public string Metric { get; set; }

        /// <summary>
        /// Fiscal Period indicator. Returns an integer representing the fiscal period for the requested item and periodicity. QUARTERLY CODE: 1-Fist Quarter; 2-Second Quarter; 3-Third Quarter; 4-Fourth Quarter. SEMI-CODE: 1-First Semi-annual Period; 2-Second Semi-annual Period.
        /// </summary>
        /// <value>Fiscal Period indicator. Returns an integer representing the fiscal period for the requested item and periodicity. QUARTERLY CODE: 1-Fist Quarter; 2-Second Quarter; 3-Third Quarter; 4-Fourth Quarter. SEMI-CODE: 1-First Semi-annual Period; 2-Second Semi-annual Period.</value>
        [DataMember(Name = "fiscalPeriod", EmitDefaultValue = false)]
        public int FiscalPeriod { get; set; }

        /// <summary>
        /// Fiscal year of the reported period in YYYY format.
        /// </summary>
        /// <value>Fiscal year of the reported period in YYYY format.</value>
        [DataMember(Name = "fiscalYear", EmitDefaultValue = false)]
        public int FiscalYear { get; set; }

        /// <summary>
        /// Length of fiscal period in days.
        /// </summary>
        /// <value>Length of fiscal period in days.</value>
        [DataMember(Name = "fiscalPeriodLength", EmitDefaultValue = false)]
        public int FiscalPeriodLength { get; set; }

        /// <summary>
        /// The normalized data the fiscal period ended.
        /// </summary>
        /// <value>The normalized data the fiscal period ended.</value>
        [DataMember(Name = "fiscalEndDate", EmitDefaultValue = false)]
        [JsonConverter(typeof(OpenAPIDateConverter))]
        public DateTime FiscalEndDate { get; set; }

        /// <summary>
        /// The date the reported fiscal period actually ended.
        /// </summary>
        /// <value>The date the reported fiscal period actually ended.</value>
        [DataMember(Name = "reportDate", EmitDefaultValue = false)]
        [JsonConverter(typeof(OpenAPIDateConverter))]
        public DateTime ReportDate { get; set; }

        /// <summary>
        /// The date the EPS was reported for the requested periodicity. In YYYY-MM-DD format. Unavailable data returned as 0001-01-01.
        /// </summary>
        /// <value>The date the EPS was reported for the requested periodicity. In YYYY-MM-DD format. Unavailable data returned as 0001-01-01.</value>
        [DataMember(Name = "epsReportDate", EmitDefaultValue = false)]
        [JsonConverter(typeof(OpenAPIDateConverter))]
        public DateTime EpsReportDate { get; set; }

        /// <summary>
        /// The update type, where: 1 &#x3D; Preliminary; 2 &#x3D; FAST; 3 &#x3D; Final. For more details, visit [Online Assistant Page #D13094](https://oa.apps.factset.com/pages/D13094).
        /// </summary>
        /// <value>The update type, where: 1 &#x3D; Preliminary; 2 &#x3D; FAST; 3 &#x3D; Final. For more details, visit [Online Assistant Page #D13094](https://oa.apps.factset.com/pages/D13094).</value>
        [DataMember(Name = "updateType", EmitDefaultValue = false)]
        public int UpdateType { get; set; }

        /// <summary>
        /// Update Status Flag: P &#x3D; Preliminary - The period is updated from a report that usually contains limited or only key information., F &#x3D; Final - The period is updated from a report where detailed information are available in financial statements including the notes to the line items.
        /// </summary>
        /// <value>Update Status Flag: P &#x3D; Preliminary - The period is updated from a report that usually contains limited or only key information., F &#x3D; Final - The period is updated from a report where detailed information are available in financial statements including the notes to the line items.</value>
        [DataMember(Name = "updateStatus", EmitDefaultValue = false)]
        public string UpdateStatus { get; set; }

        /// <summary>
        /// Currency code for the data. For a list of currency ISO codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470).
        /// </summary>
        /// <value>Currency code for the data. For a list of currency ISO codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470).</value>
        [DataMember(Name = "currency", EmitDefaultValue = false)]
        public string Currency { get; set; }

        /// <summary>
        /// Value of the data metric requested. Note that the type of value is &#39;object&#39;, and depending on the data metric requested, the value could be an object representation of a string or double. 
        /// </summary>
        /// <value>Value of the data metric requested. Note that the type of value is &#39;object&#39;, and depending on the data metric requested, the value could be an object representation of a string or double. </value>
        [DataMember(Name = "value", EmitDefaultValue = false)]
        public Object Value { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class Fundamental {\n");
            sb.Append("  RequestId: ").Append(RequestId).Append("\n");
            sb.Append("  FsymId: ").Append(FsymId).Append("\n");
            sb.Append("  Metric: ").Append(Metric).Append("\n");
            sb.Append("  Periodicity: ").Append(Periodicity).Append("\n");
            sb.Append("  FiscalPeriod: ").Append(FiscalPeriod).Append("\n");
            sb.Append("  FiscalYear: ").Append(FiscalYear).Append("\n");
            sb.Append("  FiscalPeriodLength: ").Append(FiscalPeriodLength).Append("\n");
            sb.Append("  FiscalEndDate: ").Append(FiscalEndDate).Append("\n");
            sb.Append("  ReportDate: ").Append(ReportDate).Append("\n");
            sb.Append("  EpsReportDate: ").Append(EpsReportDate).Append("\n");
            sb.Append("  UpdateType: ").Append(UpdateType).Append("\n");
            sb.Append("  UpdateStatus: ").Append(UpdateStatus).Append("\n");
            sb.Append("  Currency: ").Append(Currency).Append("\n");
            sb.Append("  Value: ").Append(Value).Append("\n");
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
            return this.Equals(input as Fundamental);
        }

        /// <summary>
        /// Returns true if Fundamental instances are equal
        /// </summary>
        /// <param name="input">Instance of Fundamental to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Fundamental input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.RequestId == input.RequestId ||
                    (this.RequestId != null &&
                    this.RequestId.Equals(input.RequestId))
                ) && 
                (
                    this.FsymId == input.FsymId ||
                    (this.FsymId != null &&
                    this.FsymId.Equals(input.FsymId))
                ) && 
                (
                    this.Metric == input.Metric ||
                    (this.Metric != null &&
                    this.Metric.Equals(input.Metric))
                ) && 
                (
                    this.Periodicity == input.Periodicity ||
                    this.Periodicity.Equals(input.Periodicity)
                ) && 
                (
                    this.FiscalPeriod == input.FiscalPeriod ||
                    this.FiscalPeriod.Equals(input.FiscalPeriod)
                ) && 
                (
                    this.FiscalYear == input.FiscalYear ||
                    this.FiscalYear.Equals(input.FiscalYear)
                ) && 
                (
                    this.FiscalPeriodLength == input.FiscalPeriodLength ||
                    this.FiscalPeriodLength.Equals(input.FiscalPeriodLength)
                ) && 
                (
                    this.FiscalEndDate == input.FiscalEndDate ||
                    (this.FiscalEndDate != null &&
                    this.FiscalEndDate.Equals(input.FiscalEndDate))
                ) && 
                (
                    this.ReportDate == input.ReportDate ||
                    (this.ReportDate != null &&
                    this.ReportDate.Equals(input.ReportDate))
                ) && 
                (
                    this.EpsReportDate == input.EpsReportDate ||
                    (this.EpsReportDate != null &&
                    this.EpsReportDate.Equals(input.EpsReportDate))
                ) && 
                (
                    this.UpdateType == input.UpdateType ||
                    this.UpdateType.Equals(input.UpdateType)
                ) && 
                (
                    this.UpdateStatus == input.UpdateStatus ||
                    (this.UpdateStatus != null &&
                    this.UpdateStatus.Equals(input.UpdateStatus))
                ) && 
                (
                    this.Currency == input.Currency ||
                    (this.Currency != null &&
                    this.Currency.Equals(input.Currency))
                ) && 
                (
                    this.Value == input.Value ||
                    (this.Value != null &&
                    this.Value.Equals(input.Value))
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
                if (this.RequestId != null)
                    hashCode = hashCode * 59 + this.RequestId.GetHashCode();
                if (this.FsymId != null)
                    hashCode = hashCode * 59 + this.FsymId.GetHashCode();
                if (this.Metric != null)
                    hashCode = hashCode * 59 + this.Metric.GetHashCode();
                hashCode = hashCode * 59 + this.Periodicity.GetHashCode();
                hashCode = hashCode * 59 + this.FiscalPeriod.GetHashCode();
                hashCode = hashCode * 59 + this.FiscalYear.GetHashCode();
                hashCode = hashCode * 59 + this.FiscalPeriodLength.GetHashCode();
                if (this.FiscalEndDate != null)
                    hashCode = hashCode * 59 + this.FiscalEndDate.GetHashCode();
                if (this.ReportDate != null)
                    hashCode = hashCode * 59 + this.ReportDate.GetHashCode();
                if (this.EpsReportDate != null)
                    hashCode = hashCode * 59 + this.EpsReportDate.GetHashCode();
                hashCode = hashCode * 59 + this.UpdateType.GetHashCode();
                if (this.UpdateStatus != null)
                    hashCode = hashCode * 59 + this.UpdateStatus.GetHashCode();
                if (this.Currency != null)
                    hashCode = hashCode * 59 + this.Currency.GetHashCode();
                if (this.Value != null)
                    hashCode = hashCode * 59 + this.Value.GetHashCode();
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
