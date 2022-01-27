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
using OpenAPIDateConverter = FactSet.SDK.SecuritizedDerivativesAPIforDigitalPortals.Client.OpenAPIDateConverter;

namespace FactSet.SDK.SecuritizedDerivativesAPIforDigitalPortals.Model
{
    /// <summary>
    /// The meta member contains the meta information of the request.
    /// </summary>
    [DataContract(Name = "_securitizedDerivative_notation_ranking_intraday_list_meta")]
    public partial class SecuritizedDerivativeNotationRankingIntradayListMeta : IEquatable<SecuritizedDerivativeNotationRankingIntradayListMeta>, IValidatableObject
    {
        /// <summary>
        /// Defines Sort
        /// </summary>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum SortEnum
        {
            /// <summary>
            /// Enum TradePerformanceAbsolute for value: trade.performance.absolute
            /// </summary>
            [EnumMember(Value = "trade.performance.absolute")]
            TradePerformanceAbsolute = 1,

            /// <summary>
            /// Enum MINUS_TradePerformanceAbsolute for value: -trade.performance.absolute
            /// </summary>
            [EnumMember(Value = "-trade.performance.absolute")]
            MINUS_TradePerformanceAbsolute = 2,

            /// <summary>
            /// Enum TradePerformanceRelative for value: trade.performance.relative
            /// </summary>
            [EnumMember(Value = "trade.performance.relative")]
            TradePerformanceRelative = 3,

            /// <summary>
            /// Enum MINUS_TradePerformanceRelative for value: -trade.performance.relative
            /// </summary>
            [EnumMember(Value = "-trade.performance.relative")]
            MINUS_TradePerformanceRelative = 4,

            /// <summary>
            /// Enum AccumulatedNumberTrades for value: accumulated.numberTrades
            /// </summary>
            [EnumMember(Value = "accumulated.numberTrades")]
            AccumulatedNumberTrades = 5,

            /// <summary>
            /// Enum MINUS_AccumulatedNumberTrades for value: -accumulated.numberTrades
            /// </summary>
            [EnumMember(Value = "-accumulated.numberTrades")]
            MINUS_AccumulatedNumberTrades = 6,

            /// <summary>
            /// Enum AccumulatedTradingVolume for value: accumulated.tradingVolume
            /// </summary>
            [EnumMember(Value = "accumulated.tradingVolume")]
            AccumulatedTradingVolume = 7,

            /// <summary>
            /// Enum MINUS_AccumulatedTradingVolume for value: -accumulated.tradingVolume
            /// </summary>
            [EnumMember(Value = "-accumulated.tradingVolume")]
            MINUS_AccumulatedTradingVolume = 8,

            /// <summary>
            /// Enum AccumulatedTradingValue for value: accumulated.tradingValue
            /// </summary>
            [EnumMember(Value = "accumulated.tradingValue")]
            AccumulatedTradingValue = 9,

            /// <summary>
            /// Enum MINUS_AccumulatedTradingValue for value: -accumulated.tradingValue
            /// </summary>
            [EnumMember(Value = "-accumulated.tradingValue")]
            MINUS_AccumulatedTradingValue = 10

        }



        /// <summary>
        /// Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 5 (possibly prefixed) attribute name(s) is allowed.
        /// </summary>
        /// <value>Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 5 (possibly prefixed) attribute name(s) is allowed.</value>
        [DataMember(Name = "sort", EmitDefaultValue = false)]
        public List<SortEnum> Sort { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="SecuritizedDerivativeNotationRankingIntradayListMeta" /> class.
        /// </summary>
        /// <param name="attributes">Limit the attributes returned in the response to the specified set..</param>
        /// <param name="language">ISO 639-1 code of the language..</param>
        /// <param name="sort">Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 5 (possibly prefixed) attribute name(s) is allowed..</param>
        /// <param name="pagination">pagination.</param>
        public SecuritizedDerivativeNotationRankingIntradayListMeta(List<string> attributes = default(List<string>), string language = default(string), List<SortEnum> sort = default(List<SortEnum>), SecuritizedDerivativeNotationRankingIntradayListMetaPagination pagination = default(SecuritizedDerivativeNotationRankingIntradayListMetaPagination))
        {
            this.Attributes = attributes;
            this.Language = language;
            this.Sort = sort;
            this.Pagination = pagination;
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
        /// Gets or Sets Pagination
        /// </summary>
        [DataMember(Name = "pagination", EmitDefaultValue = false)]
        public SecuritizedDerivativeNotationRankingIntradayListMetaPagination Pagination { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class SecuritizedDerivativeNotationRankingIntradayListMeta {\n");
            sb.Append("  Attributes: ").Append(Attributes).Append("\n");
            sb.Append("  Language: ").Append(Language).Append("\n");
            sb.Append("  Sort: ").Append(Sort).Append("\n");
            sb.Append("  Pagination: ").Append(Pagination).Append("\n");
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
            return this.Equals(input as SecuritizedDerivativeNotationRankingIntradayListMeta);
        }

        /// <summary>
        /// Returns true if SecuritizedDerivativeNotationRankingIntradayListMeta instances are equal
        /// </summary>
        /// <param name="input">Instance of SecuritizedDerivativeNotationRankingIntradayListMeta to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(SecuritizedDerivativeNotationRankingIntradayListMeta input)
        {
            if (input == null)
                return false;

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
                ) && 
                (
                    this.Pagination == input.Pagination ||
                    (this.Pagination != null &&
                    this.Pagination.Equals(input.Pagination))
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
                    hashCode = hashCode * 59 + this.Attributes.GetHashCode();
                if (this.Language != null)
                    hashCode = hashCode * 59 + this.Language.GetHashCode();
                hashCode = hashCode * 59 + this.Sort.GetHashCode();
                if (this.Pagination != null)
                    hashCode = hashCode * 59 + this.Pagination.GetHashCode();
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
            if(this.Language != null && this.Language.Length > 2)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for Language, length must be less than 2.", new [] { "Language" });
            }

            // Language (string) minLength
            if(this.Language != null && this.Language.Length < 2)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for Language, length must be greater than 2.", new [] { "Language" });
            }

            yield break;
        }
    }

}
