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
    /// The data member contains the request&#39;s primary data.
    /// </summary>
    [DataContract(Name = "_stock_notation_ranking_intraday_list_data")]
    public partial class StockNotationRankingIntradayListData : IEquatable<StockNotationRankingIntradayListData>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="StockNotationRankingIntradayListData" /> class.
        /// </summary>
        /// <param name="prices">prices.</param>
        /// <param name="currency">currency.</param>
        /// <param name="market">market.</param>
        /// <param name="instrumentRestrictionList">instrumentRestrictionList.</param>
        /// <param name="notationRestrictionList">notationRestrictionList.</param>
        /// <param name="industryClassification">industryClassification.</param>
        /// <param name="company">company.</param>
        /// <param name="indexMembership">indexMembership.</param>
        public StockNotationRankingIntradayListData(StockNotationRankingIntradayListDataPrices prices = default(StockNotationRankingIntradayListDataPrices), StockNotationRankingIntradayListDataCurrency currency = default(StockNotationRankingIntradayListDataCurrency), StockNotationRankingIntradayListDataMarket market = default(StockNotationRankingIntradayListDataMarket), StockNotationRankingIntradayListDataInstrumentRestrictionList instrumentRestrictionList = default(StockNotationRankingIntradayListDataInstrumentRestrictionList), StockNotationRankingIntradayListDataNotationRestrictionList notationRestrictionList = default(StockNotationRankingIntradayListDataNotationRestrictionList), StockNotationRankingIntradayListDataIndustryClassification industryClassification = default(StockNotationRankingIntradayListDataIndustryClassification), StockNotationRankingIntradayListDataCompany company = default(StockNotationRankingIntradayListDataCompany), StockNotationRankingIntradayListDataIndexMembership indexMembership = default(StockNotationRankingIntradayListDataIndexMembership))
        {
            this.Prices = prices;
            this.Currency = currency;
            this.Market = market;
            this.InstrumentRestrictionList = instrumentRestrictionList;
            this.NotationRestrictionList = notationRestrictionList;
            this.IndustryClassification = industryClassification;
            this.Company = company;
            this.IndexMembership = indexMembership;
        }

        /// <summary>
        /// Gets or Sets Prices
        /// </summary>
        [DataMember(Name = "prices", EmitDefaultValue = false)]
        public StockNotationRankingIntradayListDataPrices Prices { get; set; }

        /// <summary>
        /// Gets or Sets Currency
        /// </summary>
        [DataMember(Name = "currency", EmitDefaultValue = false)]
        public StockNotationRankingIntradayListDataCurrency Currency { get; set; }

        /// <summary>
        /// Gets or Sets Market
        /// </summary>
        [DataMember(Name = "market", EmitDefaultValue = false)]
        public StockNotationRankingIntradayListDataMarket Market { get; set; }

        /// <summary>
        /// Gets or Sets InstrumentRestrictionList
        /// </summary>
        [DataMember(Name = "instrumentRestrictionList", EmitDefaultValue = false)]
        public StockNotationRankingIntradayListDataInstrumentRestrictionList InstrumentRestrictionList { get; set; }

        /// <summary>
        /// Gets or Sets NotationRestrictionList
        /// </summary>
        [DataMember(Name = "notationRestrictionList", EmitDefaultValue = false)]
        public StockNotationRankingIntradayListDataNotationRestrictionList NotationRestrictionList { get; set; }

        /// <summary>
        /// Gets or Sets IndustryClassification
        /// </summary>
        [DataMember(Name = "industryClassification", EmitDefaultValue = false)]
        public StockNotationRankingIntradayListDataIndustryClassification IndustryClassification { get; set; }

        /// <summary>
        /// Gets or Sets Company
        /// </summary>
        [DataMember(Name = "company", EmitDefaultValue = false)]
        public StockNotationRankingIntradayListDataCompany Company { get; set; }

        /// <summary>
        /// Gets or Sets IndexMembership
        /// </summary>
        [DataMember(Name = "indexMembership", EmitDefaultValue = false)]
        public StockNotationRankingIntradayListDataIndexMembership IndexMembership { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class StockNotationRankingIntradayListData {\n");
            sb.Append("  Prices: ").Append(Prices).Append("\n");
            sb.Append("  Currency: ").Append(Currency).Append("\n");
            sb.Append("  Market: ").Append(Market).Append("\n");
            sb.Append("  InstrumentRestrictionList: ").Append(InstrumentRestrictionList).Append("\n");
            sb.Append("  NotationRestrictionList: ").Append(NotationRestrictionList).Append("\n");
            sb.Append("  IndustryClassification: ").Append(IndustryClassification).Append("\n");
            sb.Append("  Company: ").Append(Company).Append("\n");
            sb.Append("  IndexMembership: ").Append(IndexMembership).Append("\n");
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
            return this.Equals(input as StockNotationRankingIntradayListData);
        }

        /// <summary>
        /// Returns true if StockNotationRankingIntradayListData instances are equal
        /// </summary>
        /// <param name="input">Instance of StockNotationRankingIntradayListData to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(StockNotationRankingIntradayListData input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Prices == input.Prices ||
                    (this.Prices != null &&
                    this.Prices.Equals(input.Prices))
                ) && 
                (
                    this.Currency == input.Currency ||
                    (this.Currency != null &&
                    this.Currency.Equals(input.Currency))
                ) && 
                (
                    this.Market == input.Market ||
                    (this.Market != null &&
                    this.Market.Equals(input.Market))
                ) && 
                (
                    this.InstrumentRestrictionList == input.InstrumentRestrictionList ||
                    (this.InstrumentRestrictionList != null &&
                    this.InstrumentRestrictionList.Equals(input.InstrumentRestrictionList))
                ) && 
                (
                    this.NotationRestrictionList == input.NotationRestrictionList ||
                    (this.NotationRestrictionList != null &&
                    this.NotationRestrictionList.Equals(input.NotationRestrictionList))
                ) && 
                (
                    this.IndustryClassification == input.IndustryClassification ||
                    (this.IndustryClassification != null &&
                    this.IndustryClassification.Equals(input.IndustryClassification))
                ) && 
                (
                    this.Company == input.Company ||
                    (this.Company != null &&
                    this.Company.Equals(input.Company))
                ) && 
                (
                    this.IndexMembership == input.IndexMembership ||
                    (this.IndexMembership != null &&
                    this.IndexMembership.Equals(input.IndexMembership))
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
                if (this.Prices != null)
                    hashCode = hashCode * 59 + this.Prices.GetHashCode();
                if (this.Currency != null)
                    hashCode = hashCode * 59 + this.Currency.GetHashCode();
                if (this.Market != null)
                    hashCode = hashCode * 59 + this.Market.GetHashCode();
                if (this.InstrumentRestrictionList != null)
                    hashCode = hashCode * 59 + this.InstrumentRestrictionList.GetHashCode();
                if (this.NotationRestrictionList != null)
                    hashCode = hashCode * 59 + this.NotationRestrictionList.GetHashCode();
                if (this.IndustryClassification != null)
                    hashCode = hashCode * 59 + this.IndustryClassification.GetHashCode();
                if (this.Company != null)
                    hashCode = hashCode * 59 + this.Company.GetHashCode();
                if (this.IndexMembership != null)
                    hashCode = hashCode * 59 + this.IndexMembership.GetHashCode();
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
