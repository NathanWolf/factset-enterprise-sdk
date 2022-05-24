/*
 * Prime Developer Trial
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1
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
using OpenAPIDateConverter = FactSet.SDK.TimeSeriesAPIforDigitalPortals.Client.OpenAPIDateConverter;

namespace FactSet.SDK.TimeSeriesAPIforDigitalPortals.Model
{
    /// <summary>
    /// The data member contains the request&#39;s primary data.
    /// </summary>
    [DataContract(Name = "_vendor_chartIQ_timeSeries_eod_subsample_list_data")]
    public partial class VendorChartIQTimeSeriesEodSubsampleListData : IEquatable<VendorChartIQTimeSeriesEodSubsampleListData>, IValidatableObject
    {
        /// <summary>
        /// Type of the price as configured for the customer.
        /// </summary>
        /// <value>Type of the price as configured for the customer.</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum TypeEnum
        {
            /// <summary>
            /// Enum Trade for value: trade
            /// </summary>
            [EnumMember(Value = "trade")]
            Trade = 1,

            /// <summary>
            /// Enum Bid for value: bid
            /// </summary>
            [EnumMember(Value = "bid")]
            Bid = 2,

            /// <summary>
            /// Enum Ask for value: ask
            /// </summary>
            [EnumMember(Value = "ask")]
            Ask = 3,

            /// <summary>
            /// Enum Yield for value: yield
            /// </summary>
            [EnumMember(Value = "yield")]
            Yield = 4,

            /// <summary>
            /// Enum Estimate for value: estimate
            /// </summary>
            [EnumMember(Value = "estimate")]
            Estimate = 5

        }


        /// <summary>
        /// Type of the price as configured for the customer.
        /// </summary>
        /// <value>Type of the price as configured for the customer.</value>
        [DataMember(Name = "type", EmitDefaultValue = false)]
        public TypeEnum? Type { get; set; }
        /// <summary>
        /// Quality of the price.
        /// </summary>
        /// <value>Quality of the price.</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum QualityEnum
        {
            /// <summary>
            /// Enum DLY for value: DLY
            /// </summary>
            [EnumMember(Value = "DLY")]
            DLY = 1,

            /// <summary>
            /// Enum EOD for value: EOD
            /// </summary>
            [EnumMember(Value = "EOD")]
            EOD = 2,

            /// <summary>
            /// Enum BST for value: BST
            /// </summary>
            [EnumMember(Value = "BST")]
            BST = 3

        }


        /// <summary>
        /// Quality of the price.
        /// </summary>
        /// <value>Quality of the price.</value>
        [DataMember(Name = "quality", EmitDefaultValue = false)]
        public QualityEnum? Quality { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="VendorChartIQTimeSeriesEodSubsampleListData" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected VendorChartIQTimeSeriesEodSubsampleListData() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="VendorChartIQTimeSeriesEodSubsampleListData" /> class.
        /// </summary>
        /// <param name="id">Identifier of the notation. (required).</param>
        /// <param name="type">Type of the price as configured for the customer. (default to TypeEnum.Trade).</param>
        /// <param name="quality">Quality of the price. (default to QualityEnum.DLY).</param>
        /// <param name="intervals">Non-empty intervals of days to consider for the request. The array contains a list of at least two days in increasing order. Each pair of adjacent entries day_n and day_(n+1) specifies a half-open interval, that is a range of days d where day_n &lt;&#x3D; d &lt; day_(n+1). A subsample is computed for each interval. The valid range of intervals is between 1900-01-01 and the day after the current day. (required).</param>
        /// <param name="adjustments">adjustments.</param>
        public VendorChartIQTimeSeriesEodSubsampleListData(string id = default(string), TypeEnum? type = TypeEnum.Trade, QualityEnum? quality = QualityEnum.DLY, List<DateTime> intervals = default(List<DateTime>), VendorChartIQTimeSeriesEodListDataAdjustments adjustments = default(VendorChartIQTimeSeriesEodListDataAdjustments))
        {
            // to ensure "id" is required (not null)
            if (id == null) {
                throw new ArgumentNullException("id is a required property for VendorChartIQTimeSeriesEodSubsampleListData and cannot be null");
            }
            this.Id = id;
            // to ensure "intervals" is required (not null)
            if (intervals == null) {
                throw new ArgumentNullException("intervals is a required property for VendorChartIQTimeSeriesEodSubsampleListData and cannot be null");
            }
            this.Intervals = intervals;
            this.Type = type;
            this.Quality = quality;
            this.Adjustments = adjustments;
        }

        /// <summary>
        /// Identifier of the notation.
        /// </summary>
        /// <value>Identifier of the notation.</value>
        [DataMember(Name = "id", IsRequired = true, EmitDefaultValue = false)]
        public string Id { get; set; }

        /// <summary>
        /// Non-empty intervals of days to consider for the request. The array contains a list of at least two days in increasing order. Each pair of adjacent entries day_n and day_(n+1) specifies a half-open interval, that is a range of days d where day_n &lt;&#x3D; d &lt; day_(n+1). A subsample is computed for each interval. The valid range of intervals is between 1900-01-01 and the day after the current day.
        /// </summary>
        /// <value>Non-empty intervals of days to consider for the request. The array contains a list of at least two days in increasing order. Each pair of adjacent entries day_n and day_(n+1) specifies a half-open interval, that is a range of days d where day_n &lt;&#x3D; d &lt; day_(n+1). A subsample is computed for each interval. The valid range of intervals is between 1900-01-01 and the day after the current day.</value>
        [DataMember(Name = "intervals", IsRequired = true, EmitDefaultValue = false)]
        public List<DateTime> Intervals { get; set; }

        /// <summary>
        /// Gets or Sets Adjustments
        /// </summary>
        [DataMember(Name = "adjustments", EmitDefaultValue = false)]
        public VendorChartIQTimeSeriesEodListDataAdjustments Adjustments { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class VendorChartIQTimeSeriesEodSubsampleListData {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
            sb.Append("  Quality: ").Append(Quality).Append("\n");
            sb.Append("  Intervals: ").Append(Intervals).Append("\n");
            sb.Append("  Adjustments: ").Append(Adjustments).Append("\n");
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
            return this.Equals(input as VendorChartIQTimeSeriesEodSubsampleListData);
        }

        /// <summary>
        /// Returns true if VendorChartIQTimeSeriesEodSubsampleListData instances are equal
        /// </summary>
        /// <param name="input">Instance of VendorChartIQTimeSeriesEodSubsampleListData to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(VendorChartIQTimeSeriesEodSubsampleListData input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Id == input.Id ||
                    (this.Id != null &&
                    this.Id.Equals(input.Id))
                ) && 
                (
                    this.Type == input.Type ||
                    this.Type.Equals(input.Type)
                ) && 
                (
                    this.Quality == input.Quality ||
                    this.Quality.Equals(input.Quality)
                ) && 
                (
                    this.Intervals == input.Intervals ||
                    this.Intervals != null &&
                    input.Intervals != null &&
                    this.Intervals.SequenceEqual(input.Intervals)
                ) && 
                (
                    this.Adjustments == input.Adjustments ||
                    (this.Adjustments != null &&
                    this.Adjustments.Equals(input.Adjustments))
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
                if (this.Id != null)
                {
                    hashCode = (hashCode * 59) + this.Id.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.Type.GetHashCode();
                hashCode = (hashCode * 59) + this.Quality.GetHashCode();
                if (this.Intervals != null)
                {
                    hashCode = (hashCode * 59) + this.Intervals.GetHashCode();
                }
                if (this.Adjustments != null)
                {
                    hashCode = (hashCode * 59) + this.Adjustments.GetHashCode();
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
