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
using OpenAPIDateConverter = FactSet.SDK.ETFProfileandPrices.Client.OpenAPIDateConverter;

namespace FactSet.SDK.ETFProfileandPrices.Model
{
    /// <summary>
    /// Class information of given ETP.
    /// </summary>
    [DataContract(Name = "inline_response_200_7_data")]
    public partial class InlineResponse2007Data : IEquatable<InlineResponse2007Data>, IValidatableObject
    {
        /// <summary>
        /// Asset class of ETP holdings (Equity, Fixed Income, Currency, Commodities, Asset Allocation, or Alternatives), text and standardized value available. This data is available for all the regions.
        /// </summary>
        /// <value>Asset class of ETP holdings (Equity, Fixed Income, Currency, Commodities, Asset Allocation, or Alternatives), text and standardized value available. This data is available for all the regions.</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum AssetEnum
        {
            /// <summary>
            /// Enum Equity for value: Equity
            /// </summary>
            [EnumMember(Value = "Equity")]
            Equity = 1,

            /// <summary>
            /// Enum Alternatives for value: Alternatives
            /// </summary>
            [EnumMember(Value = "Alternatives")]
            Alternatives = 2,

            /// <summary>
            /// Enum FixedIncome for value: Fixed Income
            /// </summary>
            [EnumMember(Value = "Fixed Income")]
            FixedIncome = 3,

            /// <summary>
            /// Enum Commodities for value: Commodities
            /// </summary>
            [EnumMember(Value = "Commodities")]
            Commodities = 4,

            /// <summary>
            /// Enum Currency for value: Currency
            /// </summary>
            [EnumMember(Value = "Currency")]
            Currency = 5,

            /// <summary>
            /// Enum AssetAllocation for value: Asset Allocation
            /// </summary>
            [EnumMember(Value = "Asset Allocation")]
            AssetAllocation = 6

        }


        /// <summary>
        /// Asset class of ETP holdings (Equity, Fixed Income, Currency, Commodities, Asset Allocation, or Alternatives), text and standardized value available. This data is available for all the regions.
        /// </summary>
        /// <value>Asset class of ETP holdings (Equity, Fixed Income, Currency, Commodities, Asset Allocation, or Alternatives), text and standardized value available. This data is available for all the regions.</value>
        [DataMember(Name = "asset", EmitDefaultValue = false)]
        public AssetEnum? Asset { get; set; }
        /// <summary>
        /// The country development level of the ETP&#39;s holdings (Developed, Emerging, Frontier, or Blended), text and standardized value available. This data is available for all the regions.
        /// </summary>
        /// <value>The country development level of the ETP&#39;s holdings (Developed, Emerging, Frontier, or Blended), text and standardized value available. This data is available for all the regions.</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum EconomicDevelopmentEnum
        {
            /// <summary>
            /// Enum DevelopedMarkets for value: Developed Markets
            /// </summary>
            [EnumMember(Value = "Developed Markets")]
            DevelopedMarkets = 1,

            /// <summary>
            /// Enum BlendedDevelopment for value: Blended Development
            /// </summary>
            [EnumMember(Value = "Blended Development")]
            BlendedDevelopment = 2,

            /// <summary>
            /// Enum EmergingMarkets for value: Emerging Markets
            /// </summary>
            [EnumMember(Value = "Emerging Markets")]
            EmergingMarkets = 3,

            /// <summary>
            /// Enum FrontierMarkets for value: Frontier Markets
            /// </summary>
            [EnumMember(Value = "Frontier Markets")]
            FrontierMarkets = 4

        }


        /// <summary>
        /// The country development level of the ETP&#39;s holdings (Developed, Emerging, Frontier, or Blended), text and standardized value available. This data is available for all the regions.
        /// </summary>
        /// <value>The country development level of the ETP&#39;s holdings (Developed, Emerging, Frontier, or Blended), text and standardized value available. This data is available for all the regions.</value>
        [DataMember(Name = "economicDevelopment", EmitDefaultValue = false)]
        public EconomicDevelopmentEnum? EconomicDevelopment { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse2007Data" /> class.
        /// </summary>
        /// <param name="asset">Asset class of ETP holdings (Equity, Fixed Income, Currency, Commodities, Asset Allocation, or Alternatives), text and standardized value available. This data is available for all the regions..</param>
        /// <param name="economicDevelopment">The country development level of the ETP&#39;s holdings (Developed, Emerging, Frontier, or Blended), text and standardized value available. This data is available for all the regions..</param>
        /// <param name="geography">geography.</param>
        /// <param name="category">category.</param>
        public InlineResponse2007Data(AssetEnum? asset = default(AssetEnum?), EconomicDevelopmentEnum? economicDevelopment = default(EconomicDevelopmentEnum?), InlineResponse2007DataGeography geography = default(InlineResponse2007DataGeography), InlineResponse2007DataCategory category = default(InlineResponse2007DataCategory))
        {
            this.Asset = asset;
            this.EconomicDevelopment = economicDevelopment;
            this.Geography = geography;
            this.Category = category;
        }

        /// <summary>
        /// Gets or Sets Geography
        /// </summary>
        [DataMember(Name = "geography", EmitDefaultValue = false)]
        public InlineResponse2007DataGeography Geography { get; set; }

        /// <summary>
        /// Gets or Sets Category
        /// </summary>
        [DataMember(Name = "category", EmitDefaultValue = false)]
        public InlineResponse2007DataCategory Category { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class InlineResponse2007Data {\n");
            sb.Append("  Asset: ").Append(Asset).Append("\n");
            sb.Append("  EconomicDevelopment: ").Append(EconomicDevelopment).Append("\n");
            sb.Append("  Geography: ").Append(Geography).Append("\n");
            sb.Append("  Category: ").Append(Category).Append("\n");
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
            return this.Equals(input as InlineResponse2007Data);
        }

        /// <summary>
        /// Returns true if InlineResponse2007Data instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse2007Data to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse2007Data input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Asset == input.Asset ||
                    this.Asset.Equals(input.Asset)
                ) && 
                (
                    this.EconomicDevelopment == input.EconomicDevelopment ||
                    this.EconomicDevelopment.Equals(input.EconomicDevelopment)
                ) && 
                (
                    this.Geography == input.Geography ||
                    (this.Geography != null &&
                    this.Geography.Equals(input.Geography))
                ) && 
                (
                    this.Category == input.Category ||
                    (this.Category != null &&
                    this.Category.Equals(input.Category))
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
                hashCode = hashCode * 59 + this.Asset.GetHashCode();
                hashCode = hashCode * 59 + this.EconomicDevelopment.GetHashCode();
                if (this.Geography != null)
                    hashCode = hashCode * 59 + this.Geography.GetHashCode();
                if (this.Category != null)
                    hashCode = hashCode * 59 + this.Category.GetHashCode();
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
