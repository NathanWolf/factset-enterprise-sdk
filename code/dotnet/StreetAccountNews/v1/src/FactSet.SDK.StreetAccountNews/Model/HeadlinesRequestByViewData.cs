/*
 * StreetAccount News API
 *
 * The StreetAccount News API provides access to FactSet's proprietary news provider, StreetAccount. StreetAccount, is a premium real-time market intelligence news service that delivers comprehensive U.S., Canadian, and European coverage (and expanding Asia coverage). All possible sources for corporate news are scanned and key story facts are highlighted and presented in an easy-to-read format.  **StreetAccount Filters, Headlines, and Views:**  These endpoints allow for the retrieval of news headlines using filters such as Watchlists/Indices/Tickers, Categories (the equivalent of 'Subjects' within the Workstation), Market Topics, Regions, and Sectors.  Headlines can also be retrieved based on saved views within the Workstation.
 *
 * The version of the OpenAPI document: 1.0.0
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
    /// HeadlinesRequestByViewData
    /// </summary>
    [DataContract(Name = "HeadlinesRequestByView_data")]
    public partial class HeadlinesRequestByViewData : IEquatable<HeadlinesRequestByViewData>, IValidatableObject
    {
        /// <summary>
        /// see list of valid date ranges. Date range is mutually exlusive to start/end time
        /// </summary>
        /// <value>see list of valid date ranges. Date range is mutually exlusive to start/end time</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum PredefinedRangeEnum
        {
            /// <summary>
            /// Enum Today for value: today
            /// </summary>
            [EnumMember(Value = "today")]
            Today = 1,

            /// <summary>
            /// Enum TwoDays for value: twoDays
            /// </summary>
            [EnumMember(Value = "twoDays")]
            TwoDays = 2,

            /// <summary>
            /// Enum OneWeek for value: oneWeek
            /// </summary>
            [EnumMember(Value = "oneWeek")]
            OneWeek = 3,

            /// <summary>
            /// Enum OneMonth for value: oneMonth
            /// </summary>
            [EnumMember(Value = "oneMonth")]
            OneMonth = 4,

            /// <summary>
            /// Enum ThreeMonths for value: threeMonths
            /// </summary>
            [EnumMember(Value = "threeMonths")]
            ThreeMonths = 5,

            /// <summary>
            /// Enum SixMonths for value: sixMonths
            /// </summary>
            [EnumMember(Value = "sixMonths")]
            SixMonths = 6,

            /// <summary>
            /// Enum OneYear for value: oneYear
            /// </summary>
            [EnumMember(Value = "oneYear")]
            OneYear = 7,

            /// <summary>
            /// Enum ThreeYears for value: threeYears
            /// </summary>
            [EnumMember(Value = "threeYears")]
            ThreeYears = 8,

            /// <summary>
            /// Enum FiveYears for value: fiveYears
            /// </summary>
            [EnumMember(Value = "fiveYears")]
            FiveYears = 9,

            /// <summary>
            /// Enum TenYears for value: tenYears
            /// </summary>
            [EnumMember(Value = "tenYears")]
            TenYears = 10,

            /// <summary>
            /// Enum AllAvailable for value: allAvailable
            /// </summary>
            [EnumMember(Value = "allAvailable")]
            AllAvailable = 11

        }


        /// <summary>
        /// see list of valid date ranges. Date range is mutually exlusive to start/end time
        /// </summary>
        /// <value>see list of valid date ranges. Date range is mutually exlusive to start/end time</value>
        [DataMember(Name = "predefinedRange", EmitDefaultValue = false)]
        public PredefinedRangeEnum? PredefinedRange { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="HeadlinesRequestByViewData" /> class.
        /// </summary>
        /// <param name="name">View name of the view to return headlines for.</param>
        /// <param name="predefinedRange">see list of valid date ranges. Date range is mutually exlusive to start/end time.</param>
        /// <param name="searchTime">searchTime.</param>
        public HeadlinesRequestByViewData(string name = default(string), PredefinedRangeEnum? predefinedRange = default(PredefinedRangeEnum?), HeadlinesRequestDataSearchTime searchTime = default(HeadlinesRequestDataSearchTime))
        {
            this.Name = name;
            this.PredefinedRange = predefinedRange;
            this.SearchTime = searchTime;
        }

        /// <summary>
        /// View name of the view to return headlines for
        /// </summary>
        /// <value>View name of the view to return headlines for</value>
        [DataMember(Name = "name", EmitDefaultValue = false)]
        public string Name { get; set; }

        /// <summary>
        /// Gets or Sets SearchTime
        /// </summary>
        [DataMember(Name = "searchTime", EmitDefaultValue = false)]
        public HeadlinesRequestDataSearchTime SearchTime { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class HeadlinesRequestByViewData {\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  PredefinedRange: ").Append(PredefinedRange).Append("\n");
            sb.Append("  SearchTime: ").Append(SearchTime).Append("\n");
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
            return this.Equals(input as HeadlinesRequestByViewData);
        }

        /// <summary>
        /// Returns true if HeadlinesRequestByViewData instances are equal
        /// </summary>
        /// <param name="input">Instance of HeadlinesRequestByViewData to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(HeadlinesRequestByViewData input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Name == input.Name ||
                    (this.Name != null &&
                    this.Name.Equals(input.Name))
                ) && 
                (
                    this.PredefinedRange == input.PredefinedRange ||
                    this.PredefinedRange.Equals(input.PredefinedRange)
                ) && 
                (
                    this.SearchTime == input.SearchTime ||
                    (this.SearchTime != null &&
                    this.SearchTime.Equals(input.SearchTime))
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
                if (this.Name != null)
                {
                    hashCode = (hashCode * 59) + this.Name.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.PredefinedRange.GetHashCode();
                if (this.SearchTime != null)
                {
                    hashCode = (hashCode * 59) + this.SearchTime.GetHashCode();
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
