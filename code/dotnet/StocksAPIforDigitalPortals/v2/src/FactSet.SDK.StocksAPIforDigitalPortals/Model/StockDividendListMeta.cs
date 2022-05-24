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
using OpenAPIDateConverter = FactSet.SDK.StocksAPIforDigitalPortals.Client.OpenAPIDateConverter;

namespace FactSet.SDK.StocksAPIforDigitalPortals.Model
{
    /// <summary>
    /// The meta member contains the meta information of the request.
    /// </summary>
    [DataContract(Name = "_stock_dividend_list_meta")]
    public partial class StockDividendListMeta : IEquatable<StockDividendListMeta>, IValidatableObject
    {
        /// <summary>
        /// Defines Sort
        /// </summary>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum SortEnum
        {
            /// <summary>
            /// Enum DatesAnnouncement for value: dates.announcement
            /// </summary>
            [EnumMember(Value = "dates.announcement")]
            DatesAnnouncement = 1,

            /// <summary>
            /// Enum MINUS_DatesAnnouncement for value: -dates.announcement
            /// </summary>
            [EnumMember(Value = "-dates.announcement")]
            MINUS_DatesAnnouncement = 2,

            /// <summary>
            /// Enum DatesRecord for value: dates.record
            /// </summary>
            [EnumMember(Value = "dates.record")]
            DatesRecord = 3,

            /// <summary>
            /// Enum MINUS_DatesRecord for value: -dates.record
            /// </summary>
            [EnumMember(Value = "-dates.record")]
            MINUS_DatesRecord = 4,

            /// <summary>
            /// Enum DatesEffective for value: dates.effective
            /// </summary>
            [EnumMember(Value = "dates.effective")]
            DatesEffective = 5,

            /// <summary>
            /// Enum MINUS_DatesEffective for value: -dates.effective
            /// </summary>
            [EnumMember(Value = "-dates.effective")]
            MINUS_DatesEffective = 6,

            /// <summary>
            /// Enum DatesPayment for value: dates.payment
            /// </summary>
            [EnumMember(Value = "dates.payment")]
            DatesPayment = 7,

            /// <summary>
            /// Enum MINUS_DatesPayment for value: -dates.payment
            /// </summary>
            [EnumMember(Value = "-dates.payment")]
            MINUS_DatesPayment = 8

        }



        /// <summary>
        /// Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 4 (possibly prefixed) attribute name(s) is allowed.
        /// </summary>
        /// <value>Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 4 (possibly prefixed) attribute name(s) is allowed.</value>
        [DataMember(Name = "sort", EmitDefaultValue = false)]
        public List<SortEnum> Sort { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="StockDividendListMeta" /> class.
        /// </summary>
        /// <param name="attributes">Limit the attributes returned in the response to the specified set..</param>
        /// <param name="language">ISO 639-1 code of the language..</param>
        /// <param name="sort">Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 4 (possibly prefixed) attribute name(s) is allowed..</param>
        public StockDividendListMeta(List<string> attributes = default(List<string>), string language = default(string), List<SortEnum> sort = default(List<SortEnum>))
        {
            this.Attributes = attributes;
            this.Language = language;
            this.Sort = sort;
        }

        /// <summary>
        /// Limit the attributes returned in the response to the specified set.
        /// </summary>
        /// <value>Limit the attributes returned in the response to the specified set.</value>
        [DataMember(Name = "attributes", EmitDefaultValue = false)]
        public List<string> Attributes { get; set; }

        /// <summary>
        /// ISO 639-1 code of the language.
        /// </summary>
        /// <value>ISO 639-1 code of the language.</value>
        [DataMember(Name = "language", EmitDefaultValue = false)]
        public string Language { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class StockDividendListMeta {\n");
            sb.Append("  Attributes: ").Append(Attributes).Append("\n");
            sb.Append("  Language: ").Append(Language).Append("\n");
            sb.Append("  Sort: ").Append(Sort).Append("\n");
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
            return this.Equals(input as StockDividendListMeta);
        }

        /// <summary>
        /// Returns true if StockDividendListMeta instances are equal
        /// </summary>
        /// <param name="input">Instance of StockDividendListMeta to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(StockDividendListMeta input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Attributes == input.Attributes ||
                    this.Attributes != null &&
                    input.Attributes != null &&
                    this.Attributes.SequenceEqual(input.Attributes)
                ) && 
                (
                    this.Language == input.Language ||
                    (this.Language != null &&
                    this.Language.Equals(input.Language))
                ) && 
                (
                    this.Sort == input.Sort ||
                    this.Sort.SequenceEqual(input.Sort)
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
                if (this.Attributes != null)
                {
                    hashCode = (hashCode * 59) + this.Attributes.GetHashCode();
                }
                if (this.Language != null)
                {
                    hashCode = (hashCode * 59) + this.Language.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.Sort.GetHashCode();
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
            // Language (string) maxLength
            if (this.Language != null && this.Language.Length > 2)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for Language, length must be less than 2.", new [] { "Language" });
            }

            // Language (string) minLength
            if (this.Language != null && this.Language.Length < 2)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for Language, length must be greater than 2.", new [] { "Language" });
            }

            yield break;
        }
    }

}
