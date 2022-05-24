/*
 * Market Intelligence
 *
 * Through the Market Intelligence API, stay up to date on the companies and sectors you care most about with ease. Request the templates you have made in Market Intelligence to receive news and data on your portfolio.
 *
 * The version of the OpenAPI document: 1.0
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
using OpenAPIDateConverter = FactSet.SDK.MarketIntelligence.Client.OpenAPIDateConverter;

namespace FactSet.SDK.MarketIntelligence.Model
{
    /// <summary>
    /// Information users receive about their reports with the get-reports call.
    /// </summary>
    [DataContract(Name = "Get_Report_Info")]
    public partial class GetReportInfo : IEquatable<GetReportInfo>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="GetReportInfo" /> class.
        /// </summary>
        /// <param name="reportId">Report ID.</param>
        /// <param name="reportName">Report Name.</param>
        /// <param name="timeZone">Time zone.</param>
        /// <param name="lastRunDateTime">Last time the report was refreshed..</param>
        public GetReportInfo(string reportId = default(string), string reportName = default(string), string timeZone = default(string), string lastRunDateTime = default(string))
        {
            this.ReportId = reportId;
            this.ReportName = reportName;
            this.TimeZone = timeZone;
            this.LastRunDateTime = lastRunDateTime;
        }

        /// <summary>
        /// Report ID
        /// </summary>
        /// <value>Report ID</value>
        [DataMember(Name = "report_id", EmitDefaultValue = false)]
        public string ReportId { get; set; }

        /// <summary>
        /// Report Name
        /// </summary>
        /// <value>Report Name</value>
        [DataMember(Name = "report_name", EmitDefaultValue = false)]
        public string ReportName { get; set; }

        /// <summary>
        /// Time zone
        /// </summary>
        /// <value>Time zone</value>
        [DataMember(Name = "time_zone", EmitDefaultValue = false)]
        public string TimeZone { get; set; }

        /// <summary>
        /// Last time the report was refreshed.
        /// </summary>
        /// <value>Last time the report was refreshed.</value>
        [DataMember(Name = "last_run_date_time", EmitDefaultValue = false)]
        public string LastRunDateTime { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class GetReportInfo {\n");
            sb.Append("  ReportId: ").Append(ReportId).Append("\n");
            sb.Append("  ReportName: ").Append(ReportName).Append("\n");
            sb.Append("  TimeZone: ").Append(TimeZone).Append("\n");
            sb.Append("  LastRunDateTime: ").Append(LastRunDateTime).Append("\n");
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
            return this.Equals(input as GetReportInfo);
        }

        /// <summary>
        /// Returns true if GetReportInfo instances are equal
        /// </summary>
        /// <param name="input">Instance of GetReportInfo to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(GetReportInfo input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.ReportId == input.ReportId ||
                    (this.ReportId != null &&
                    this.ReportId.Equals(input.ReportId))
                ) && 
                (
                    this.ReportName == input.ReportName ||
                    (this.ReportName != null &&
                    this.ReportName.Equals(input.ReportName))
                ) && 
                (
                    this.TimeZone == input.TimeZone ||
                    (this.TimeZone != null &&
                    this.TimeZone.Equals(input.TimeZone))
                ) && 
                (
                    this.LastRunDateTime == input.LastRunDateTime ||
                    (this.LastRunDateTime != null &&
                    this.LastRunDateTime.Equals(input.LastRunDateTime))
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
                if (this.ReportId != null)
                {
                    hashCode = (hashCode * 59) + this.ReportId.GetHashCode();
                }
                if (this.ReportName != null)
                {
                    hashCode = (hashCode * 59) + this.ReportName.GetHashCode();
                }
                if (this.TimeZone != null)
                {
                    hashCode = (hashCode * 59) + this.TimeZone.GetHashCode();
                }
                if (this.LastRunDateTime != null)
                {
                    hashCode = (hashCode * 59) + this.LastRunDateTime.GetHashCode();
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
