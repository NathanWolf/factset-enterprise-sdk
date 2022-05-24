/*
 * FactSet Benchmarks API
 *
 * FactSet Benchmarks API gives access to Index Constituents, Prices, Returns, and Ratios. For a sample list of identifiers, use the /metrics endpoint. Equity Only - Fixed Income Benchmark support coming soon. 
 *
 * The version of the OpenAPI document: 1.5.0
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
using OpenAPIDateConverter = FactSet.SDK.FactSetBenchmarks.Client.OpenAPIDateConverter;

namespace FactSet.SDK.FactSetBenchmarks.Model
{
    /// <summary>
    /// IndexHistory
    /// </summary>
    [DataContract(Name = "indexHistory")]
    public partial class IndexHistory : IEquatable<IndexHistory>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="IndexHistory" /> class.
        /// </summary>
        /// <param name="fsymId">Requested Identifier. Must be a valid Benchmark Identifier recognized by FactSet..</param>
        /// <param name="date">The respective date for values as of the date requested in YYYY-MM-DD format..</param>
        /// <param name="name">Proper Name of Index..</param>
        /// <param name="constituentNumber">The total number of constituents as of the date requested..</param>
        /// <param name="currency">Currency Code used in adjustments. If no Currency was requested, the service will default to LOCAL (&#39;LOC&#39;)..</param>
        /// <param name="marketValue">Index Level Market Capitalization as of the date requested expressed in millions..</param>
        /// <param name="price">Index Level Price.</param>
        /// <param name="priceReturnPercent">Index Level Price Percent Change.</param>
        /// <param name="totalReturnLevel">Index Level Total Return Amount.</param>
        /// <param name="totalReturnPercent">Index Level Total Return Percent Change.</param>
        /// <param name="returnType">The requested Return Type - GROSS or NET.</param>
        /// <param name="hedgeType">The requested Hedge Type - HEDGED or UNHEDGED.</param>
        /// <param name="requestId">Benchmark Identifier specified in the request.</param>
        public IndexHistory(string fsymId = default(string), DateTime date = default(DateTime), string name = default(string), int constituentNumber = default(int), string currency = default(string), double marketValue = default(double), double price = default(double), double priceReturnPercent = default(double), double totalReturnLevel = default(double), double totalReturnPercent = default(double), string returnType = default(string), string hedgeType = default(string), string requestId = default(string))
        {
            this.FsymId = fsymId;
            this.Date = date;
            this.Name = name;
            this.ConstituentNumber = constituentNumber;
            this.Currency = currency;
            this.MarketValue = marketValue;
            this.Price = price;
            this.PriceReturnPercent = priceReturnPercent;
            this.TotalReturnLevel = totalReturnLevel;
            this.TotalReturnPercent = totalReturnPercent;
            this.ReturnType = returnType;
            this.HedgeType = hedgeType;
            this.RequestId = requestId;
        }

        /// <summary>
        /// Requested Identifier. Must be a valid Benchmark Identifier recognized by FactSet.
        /// </summary>
        /// <value>Requested Identifier. Must be a valid Benchmark Identifier recognized by FactSet.</value>
        [DataMember(Name = "fsymId", EmitDefaultValue = false)]
        public string FsymId { get; set; }

        /// <summary>
        /// The respective date for values as of the date requested in YYYY-MM-DD format.
        /// </summary>
        /// <value>The respective date for values as of the date requested in YYYY-MM-DD format.</value>
        [DataMember(Name = "date", EmitDefaultValue = false)]
        [JsonConverter(typeof(OpenAPIDateConverter))]
        public DateTime Date { get; set; }

        /// <summary>
        /// Proper Name of Index.
        /// </summary>
        /// <value>Proper Name of Index.</value>
        [DataMember(Name = "name", EmitDefaultValue = false)]
        public string Name { get; set; }

        /// <summary>
        /// The total number of constituents as of the date requested.
        /// </summary>
        /// <value>The total number of constituents as of the date requested.</value>
        [DataMember(Name = "constituentNumber", EmitDefaultValue = false)]
        public int ConstituentNumber { get; set; }

        /// <summary>
        /// Currency Code used in adjustments. If no Currency was requested, the service will default to LOCAL (&#39;LOC&#39;).
        /// </summary>
        /// <value>Currency Code used in adjustments. If no Currency was requested, the service will default to LOCAL (&#39;LOC&#39;).</value>
        [DataMember(Name = "currency", EmitDefaultValue = false)]
        public string Currency { get; set; }

        /// <summary>
        /// Index Level Market Capitalization as of the date requested expressed in millions.
        /// </summary>
        /// <value>Index Level Market Capitalization as of the date requested expressed in millions.</value>
        [DataMember(Name = "marketValue", EmitDefaultValue = false)]
        public double MarketValue { get; set; }

        /// <summary>
        /// Index Level Price
        /// </summary>
        /// <value>Index Level Price</value>
        [DataMember(Name = "price", EmitDefaultValue = false)]
        public double Price { get; set; }

        /// <summary>
        /// Index Level Price Percent Change
        /// </summary>
        /// <value>Index Level Price Percent Change</value>
        [DataMember(Name = "priceReturnPercent", EmitDefaultValue = false)]
        public double PriceReturnPercent { get; set; }

        /// <summary>
        /// Index Level Total Return Amount
        /// </summary>
        /// <value>Index Level Total Return Amount</value>
        [DataMember(Name = "totalReturnLevel", EmitDefaultValue = false)]
        public double TotalReturnLevel { get; set; }

        /// <summary>
        /// Index Level Total Return Percent Change
        /// </summary>
        /// <value>Index Level Total Return Percent Change</value>
        [DataMember(Name = "totalReturnPercent", EmitDefaultValue = false)]
        public double TotalReturnPercent { get; set; }

        /// <summary>
        /// The requested Return Type - GROSS or NET
        /// </summary>
        /// <value>The requested Return Type - GROSS or NET</value>
        [DataMember(Name = "returnType", EmitDefaultValue = false)]
        public string ReturnType { get; set; }

        /// <summary>
        /// The requested Hedge Type - HEDGED or UNHEDGED
        /// </summary>
        /// <value>The requested Hedge Type - HEDGED or UNHEDGED</value>
        [DataMember(Name = "hedgeType", EmitDefaultValue = false)]
        public string HedgeType { get; set; }

        /// <summary>
        /// Benchmark Identifier specified in the request
        /// </summary>
        /// <value>Benchmark Identifier specified in the request</value>
        [DataMember(Name = "requestId", EmitDefaultValue = false)]
        public string RequestId { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class IndexHistory {\n");
            sb.Append("  FsymId: ").Append(FsymId).Append("\n");
            sb.Append("  Date: ").Append(Date).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  ConstituentNumber: ").Append(ConstituentNumber).Append("\n");
            sb.Append("  Currency: ").Append(Currency).Append("\n");
            sb.Append("  MarketValue: ").Append(MarketValue).Append("\n");
            sb.Append("  Price: ").Append(Price).Append("\n");
            sb.Append("  PriceReturnPercent: ").Append(PriceReturnPercent).Append("\n");
            sb.Append("  TotalReturnLevel: ").Append(TotalReturnLevel).Append("\n");
            sb.Append("  TotalReturnPercent: ").Append(TotalReturnPercent).Append("\n");
            sb.Append("  ReturnType: ").Append(ReturnType).Append("\n");
            sb.Append("  HedgeType: ").Append(HedgeType).Append("\n");
            sb.Append("  RequestId: ").Append(RequestId).Append("\n");
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
            return this.Equals(input as IndexHistory);
        }

        /// <summary>
        /// Returns true if IndexHistory instances are equal
        /// </summary>
        /// <param name="input">Instance of IndexHistory to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(IndexHistory input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.FsymId == input.FsymId ||
                    (this.FsymId != null &&
                    this.FsymId.Equals(input.FsymId))
                ) && 
                (
                    this.Date == input.Date ||
                    (this.Date != null &&
                    this.Date.Equals(input.Date))
                ) && 
                (
                    this.Name == input.Name ||
                    (this.Name != null &&
                    this.Name.Equals(input.Name))
                ) && 
                (
                    this.ConstituentNumber == input.ConstituentNumber ||
                    this.ConstituentNumber.Equals(input.ConstituentNumber)
                ) && 
                (
                    this.Currency == input.Currency ||
                    (this.Currency != null &&
                    this.Currency.Equals(input.Currency))
                ) && 
                (
                    this.MarketValue == input.MarketValue ||
                    this.MarketValue.Equals(input.MarketValue)
                ) && 
                (
                    this.Price == input.Price ||
                    this.Price.Equals(input.Price)
                ) && 
                (
                    this.PriceReturnPercent == input.PriceReturnPercent ||
                    this.PriceReturnPercent.Equals(input.PriceReturnPercent)
                ) && 
                (
                    this.TotalReturnLevel == input.TotalReturnLevel ||
                    this.TotalReturnLevel.Equals(input.TotalReturnLevel)
                ) && 
                (
                    this.TotalReturnPercent == input.TotalReturnPercent ||
                    this.TotalReturnPercent.Equals(input.TotalReturnPercent)
                ) && 
                (
                    this.ReturnType == input.ReturnType ||
                    (this.ReturnType != null &&
                    this.ReturnType.Equals(input.ReturnType))
                ) && 
                (
                    this.HedgeType == input.HedgeType ||
                    (this.HedgeType != null &&
                    this.HedgeType.Equals(input.HedgeType))
                ) && 
                (
                    this.RequestId == input.RequestId ||
                    (this.RequestId != null &&
                    this.RequestId.Equals(input.RequestId))
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
                if (this.FsymId != null)
                {
                    hashCode = (hashCode * 59) + this.FsymId.GetHashCode();
                }
                if (this.Date != null)
                {
                    hashCode = (hashCode * 59) + this.Date.GetHashCode();
                }
                if (this.Name != null)
                {
                    hashCode = (hashCode * 59) + this.Name.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.ConstituentNumber.GetHashCode();
                if (this.Currency != null)
                {
                    hashCode = (hashCode * 59) + this.Currency.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.MarketValue.GetHashCode();
                hashCode = (hashCode * 59) + this.Price.GetHashCode();
                hashCode = (hashCode * 59) + this.PriceReturnPercent.GetHashCode();
                hashCode = (hashCode * 59) + this.TotalReturnLevel.GetHashCode();
                hashCode = (hashCode * 59) + this.TotalReturnPercent.GetHashCode();
                if (this.ReturnType != null)
                {
                    hashCode = (hashCode * 59) + this.ReturnType.GetHashCode();
                }
                if (this.HedgeType != null)
                {
                    hashCode = (hashCode * 59) + this.HedgeType.GetHashCode();
                }
                if (this.RequestId != null)
                {
                    hashCode = (hashCode * 59) + this.RequestId.GetHashCode();
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
