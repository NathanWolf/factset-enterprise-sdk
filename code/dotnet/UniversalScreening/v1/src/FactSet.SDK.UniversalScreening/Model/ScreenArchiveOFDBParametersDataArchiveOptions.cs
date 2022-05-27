/*
 * Universal Screening API
 *
 * Through the Universal Screening API, you can access the power of FactSet's Universal Screening Application. Calculate and return the results of your saved Universal Screens.
 *
 * The version of the OpenAPI document: 0.0.1
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
using OpenAPIDateConverter = FactSet.SDK.UniversalScreening.Client.OpenAPIDateConverter;

namespace FactSet.SDK.UniversalScreening.Model
{
    /// <summary>
    /// ScreenArchiveOFDBParametersDataArchiveOptions
    /// </summary>
    [DataContract(Name = "ScreenArchiveOFDBParameters_data_archiveOptions")]
    public partial class ScreenArchiveOFDBParametersDataArchiveOptions : IEquatable<ScreenArchiveOFDBParametersDataArchiveOptions>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ScreenArchiveOFDBParametersDataArchiveOptions" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ScreenArchiveOFDBParametersDataArchiveOptions() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ScreenArchiveOFDBParametersDataArchiveOptions" /> class.
        /// </summary>
        /// <param name="archiveDate">archiveDate.</param>
        /// <param name="archiveType">Type of archive, i.e. ofdbSymbols, ofdbNts, ofdbQuickNts, ofdb (required).</param>
        /// <param name="autoSymbolUpdates">autoSymbolUpdates.</param>
        /// <param name="existed">existed.</param>
        /// <param name="filename">OFDB Filename to archive to (required).</param>
        /// <param name="overwriteData">overwriteData.</param>
        /// <param name="quickColumns">quickColumns.</param>
        /// <param name="symbolType">symbolType.</param>
        /// <param name="timeSeries">timeSeries.</param>
        /// <param name="unsplitHistory">unsplitHistory.</param>
        /// <param name="useReportOrder">useReportOrder.</param>
        public ScreenArchiveOFDBParametersDataArchiveOptions(string archiveDate = default(string), string archiveType = default(string), bool autoSymbolUpdates = default(bool), bool existed = default(bool), string filename = default(string), bool overwriteData = default(bool), string quickColumns = default(string), string symbolType = default(string), bool timeSeries = default(bool), bool unsplitHistory = default(bool), bool useReportOrder = default(bool))
        {
            // to ensure "archiveType" is required (not null)
            if (archiveType == null) {
                throw new ArgumentNullException("archiveType is a required property for ScreenArchiveOFDBParametersDataArchiveOptions and cannot be null");
            }
            this.ArchiveType = archiveType;
            // to ensure "filename" is required (not null)
            if (filename == null) {
                throw new ArgumentNullException("filename is a required property for ScreenArchiveOFDBParametersDataArchiveOptions and cannot be null");
            }
            this.Filename = filename;
            this.ArchiveDate = archiveDate;
            this.AutoSymbolUpdates = autoSymbolUpdates;
            this.Existed = existed;
            this.OverwriteData = overwriteData;
            this.QuickColumns = quickColumns;
            this.SymbolType = symbolType;
            this.TimeSeries = timeSeries;
            this.UnsplitHistory = unsplitHistory;
            this.UseReportOrder = useReportOrder;
        }

        /// <summary>
        /// Gets or Sets ArchiveDate
        /// </summary>
        [DataMember(Name = "archiveDate", EmitDefaultValue = false)]
        public string ArchiveDate { get; set; }

        /// <summary>
        /// Type of archive, i.e. ofdbSymbols, ofdbNts, ofdbQuickNts, ofdb
        /// </summary>
        /// <value>Type of archive, i.e. ofdbSymbols, ofdbNts, ofdbQuickNts, ofdb</value>
        [DataMember(Name = "archiveType", IsRequired = true, EmitDefaultValue = false)]
        public string ArchiveType { get; set; }

        /// <summary>
        /// Gets or Sets AutoSymbolUpdates
        /// </summary>
        [DataMember(Name = "autoSymbolUpdates", EmitDefaultValue = true)]
        public bool AutoSymbolUpdates { get; set; }

        /// <summary>
        /// Gets or Sets Existed
        /// </summary>
        [DataMember(Name = "existed", EmitDefaultValue = true)]
        public bool Existed { get; set; }

        /// <summary>
        /// OFDB Filename to archive to
        /// </summary>
        /// <value>OFDB Filename to archive to</value>
        [DataMember(Name = "filename", IsRequired = true, EmitDefaultValue = false)]
        public string Filename { get; set; }

        /// <summary>
        /// Gets or Sets OverwriteData
        /// </summary>
        [DataMember(Name = "overwriteData", EmitDefaultValue = true)]
        public bool OverwriteData { get; set; }

        /// <summary>
        /// Gets or Sets QuickColumns
        /// </summary>
        [DataMember(Name = "quickColumns", EmitDefaultValue = false)]
        public string QuickColumns { get; set; }

        /// <summary>
        /// Gets or Sets SymbolType
        /// </summary>
        [DataMember(Name = "symbolType", EmitDefaultValue = false)]
        public string SymbolType { get; set; }

        /// <summary>
        /// Gets or Sets TimeSeries
        /// </summary>
        [DataMember(Name = "timeSeries", EmitDefaultValue = true)]
        public bool TimeSeries { get; set; }

        /// <summary>
        /// Gets or Sets UnsplitHistory
        /// </summary>
        [DataMember(Name = "unsplitHistory", EmitDefaultValue = true)]
        public bool UnsplitHistory { get; set; }

        /// <summary>
        /// Gets or Sets UseReportOrder
        /// </summary>
        [DataMember(Name = "useReportOrder", EmitDefaultValue = true)]
        public bool UseReportOrder { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ScreenArchiveOFDBParametersDataArchiveOptions {\n");
            sb.Append("  ArchiveDate: ").Append(ArchiveDate).Append("\n");
            sb.Append("  ArchiveType: ").Append(ArchiveType).Append("\n");
            sb.Append("  AutoSymbolUpdates: ").Append(AutoSymbolUpdates).Append("\n");
            sb.Append("  Existed: ").Append(Existed).Append("\n");
            sb.Append("  Filename: ").Append(Filename).Append("\n");
            sb.Append("  OverwriteData: ").Append(OverwriteData).Append("\n");
            sb.Append("  QuickColumns: ").Append(QuickColumns).Append("\n");
            sb.Append("  SymbolType: ").Append(SymbolType).Append("\n");
            sb.Append("  TimeSeries: ").Append(TimeSeries).Append("\n");
            sb.Append("  UnsplitHistory: ").Append(UnsplitHistory).Append("\n");
            sb.Append("  UseReportOrder: ").Append(UseReportOrder).Append("\n");
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
            return this.Equals(input as ScreenArchiveOFDBParametersDataArchiveOptions);
        }

        /// <summary>
        /// Returns true if ScreenArchiveOFDBParametersDataArchiveOptions instances are equal
        /// </summary>
        /// <param name="input">Instance of ScreenArchiveOFDBParametersDataArchiveOptions to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ScreenArchiveOFDBParametersDataArchiveOptions input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.ArchiveDate == input.ArchiveDate ||
                    (this.ArchiveDate != null &&
                    this.ArchiveDate.Equals(input.ArchiveDate))
                ) && 
                (
                    this.ArchiveType == input.ArchiveType ||
                    (this.ArchiveType != null &&
                    this.ArchiveType.Equals(input.ArchiveType))
                ) && 
                (
                    this.AutoSymbolUpdates == input.AutoSymbolUpdates ||
                    this.AutoSymbolUpdates.Equals(input.AutoSymbolUpdates)
                ) && 
                (
                    this.Existed == input.Existed ||
                    this.Existed.Equals(input.Existed)
                ) && 
                (
                    this.Filename == input.Filename ||
                    (this.Filename != null &&
                    this.Filename.Equals(input.Filename))
                ) && 
                (
                    this.OverwriteData == input.OverwriteData ||
                    this.OverwriteData.Equals(input.OverwriteData)
                ) && 
                (
                    this.QuickColumns == input.QuickColumns ||
                    (this.QuickColumns != null &&
                    this.QuickColumns.Equals(input.QuickColumns))
                ) && 
                (
                    this.SymbolType == input.SymbolType ||
                    (this.SymbolType != null &&
                    this.SymbolType.Equals(input.SymbolType))
                ) && 
                (
                    this.TimeSeries == input.TimeSeries ||
                    this.TimeSeries.Equals(input.TimeSeries)
                ) && 
                (
                    this.UnsplitHistory == input.UnsplitHistory ||
                    this.UnsplitHistory.Equals(input.UnsplitHistory)
                ) && 
                (
                    this.UseReportOrder == input.UseReportOrder ||
                    this.UseReportOrder.Equals(input.UseReportOrder)
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
                if (this.ArchiveDate != null)
                {
                    hashCode = (hashCode * 59) + this.ArchiveDate.GetHashCode();
                }
                if (this.ArchiveType != null)
                {
                    hashCode = (hashCode * 59) + this.ArchiveType.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.AutoSymbolUpdates.GetHashCode();
                hashCode = (hashCode * 59) + this.Existed.GetHashCode();
                if (this.Filename != null)
                {
                    hashCode = (hashCode * 59) + this.Filename.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.OverwriteData.GetHashCode();
                if (this.QuickColumns != null)
                {
                    hashCode = (hashCode * 59) + this.QuickColumns.GetHashCode();
                }
                if (this.SymbolType != null)
                {
                    hashCode = (hashCode * 59) + this.SymbolType.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.TimeSeries.GetHashCode();
                hashCode = (hashCode * 59) + this.UnsplitHistory.GetHashCode();
                hashCode = (hashCode * 59) + this.UseReportOrder.GetHashCode();
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
