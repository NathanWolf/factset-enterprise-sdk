/*
 * StreetAccount API
 *
 * Collection of endpoints for retrieving StreetAccount headlines and filters
 *
 * The version of the OpenAPI document: 0.1.0
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
using OpenAPIDateConverter = FactSet.SDK.StreetAccountNews.Client.OpenAPIDateConverter;

namespace FactSet.SDK.StreetAccountNews.Model
{
    /// <summary>
    /// SaHeadlinesRequestByViewData
    /// </summary>
    [DataContract(Name = "saHeadlinesRequestByView_data")]
    public partial class SaHeadlinesRequestByViewData : IEquatable<SaHeadlinesRequestByViewData>, IValidatableObject
    {
        /// <summary>
        /// see list of valid date ranges. Date range is mutually exlusive to start/end time
        /// </summary>
        /// <value>see list of valid date ranges. Date range is mutually exlusive to start/end time</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum DateRangeEnum
        {
            /// <summary>
            /// Enum Today for value: Today
            /// </summary>
            [EnumMember(Value = "Today")]
            Today = 1,

            /// <summary>
            /// Enum _2Days for value: 2 Days
            /// </summary>
            [EnumMember(Value = "2 Days")]
            _2Days = 2,

            /// <summary>
            /// Enum _1Week for value: 1 Week
            /// </summary>
            [EnumMember(Value = "1 Week")]
            _1Week = 3,

            /// <summary>
            /// Enum _1Month for value: 1 Month
            /// </summary>
            [EnumMember(Value = "1 Month")]
            _1Month = 4,

            /// <summary>
            /// Enum _3Months for value: 3 Months
            /// </summary>
            [EnumMember(Value = "3 Months")]
            _3Months = 5,

            /// <summary>
            /// Enum _6Months for value: 6 Months
            /// </summary>
            [EnumMember(Value = "6 Months")]
            _6Months = 6,

            /// <summary>
            /// Enum _1Year for value: 1 Year
            /// </summary>
            [EnumMember(Value = "1 Year")]
            _1Year = 7,

            /// <summary>
            /// Enum _3Years for value: 3 Years
            /// </summary>
            [EnumMember(Value = "3 Years")]
            _3Years = 8,

            /// <summary>
            /// Enum _5Years for value: 5 Years
            /// </summary>
            [EnumMember(Value = "5 Years")]
            _5Years = 9,

            /// <summary>
            /// Enum _10Years for value: 10 Years
            /// </summary>
            [EnumMember(Value = "10 Years")]
            _10Years = 10,

            /// <summary>
            /// Enum AllAvailable for value: All Available
            /// </summary>
            [EnumMember(Value = "All Available")]
            AllAvailable = 11

        }


        /// <summary>
        /// see list of valid date ranges. Date range is mutually exlusive to start/end time
        /// </summary>
        /// <value>see list of valid date ranges. Date range is mutually exlusive to start/end time</value>
        [DataMember(Name = "dateRange", EmitDefaultValue = false)]
        public DateRangeEnum? DateRange { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="SaHeadlinesRequestByViewData" /> class.
        /// </summary>
        /// <param name="dateRange">see list of valid date ranges. Date range is mutually exlusive to start/end time.</param>
        /// <param name="searchDate">searchDate.</param>
        public SaHeadlinesRequestByViewData(DateRangeEnum? dateRange = default(DateRangeEnum?), SaHeadlinesRequestDataSearchDate searchDate = default(SaHeadlinesRequestDataSearchDate))
        {
            this.DateRange = dateRange;
            this.SearchDate = searchDate;
        }

        /// <summary>
        /// Gets or Sets SearchDate
        /// </summary>
        [DataMember(Name = "searchDate", EmitDefaultValue = false)]
        public SaHeadlinesRequestDataSearchDate SearchDate { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class SaHeadlinesRequestByViewData {\n");
            sb.Append("  DateRange: ").Append(DateRange).Append("\n");
            sb.Append("  SearchDate: ").Append(SearchDate).Append("\n");
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
            return this.Equals(input as SaHeadlinesRequestByViewData);
        }

        /// <summary>
        /// Returns true if SaHeadlinesRequestByViewData instances are equal
        /// </summary>
        /// <param name="input">Instance of SaHeadlinesRequestByViewData to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(SaHeadlinesRequestByViewData input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.DateRange == input.DateRange ||
                    this.DateRange.Equals(input.DateRange)
                ) && 
                (
                    this.SearchDate == input.SearchDate ||
                    (this.SearchDate != null &&
                    this.SearchDate.Equals(input.SearchDate))
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
                hashCode = (hashCode * 59) + this.DateRange.GetHashCode();
                if (this.SearchDate != null)
                {
                    hashCode = (hashCode * 59) + this.SearchDate.GetHashCode();
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
