/*
 * Open:Risk API
 *
 * Service to calculate parametric linear risk statistics and generate risk model asset identifier mappings.
 *
 * The version of the OpenAPI document: 1.24.0
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
using OpenAPIDateConverter = FactSet.SDK.OpenRisk.Client.OpenAPIDateConverter;

namespace FactSet.SDK.OpenRisk.Model
{
    /// <summary>
    /// InlineResponse2001Data
    /// </summary>
    [DataContract(Name = "inline_response_200_1_data")]
    public partial class InlineResponse2001Data : IEquatable<InlineResponse2001Data>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse2001Data" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected InlineResponse2001Data() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse2001Data" /> class.
        /// </summary>
        /// <param name="code">Model code (required).</param>
        /// <param name="currencies">Currencies that can be used with the model (required).</param>
        /// <param name="currency">ISO-4217 currency code for risk model and holdings data to fetch and use. Ignored only for composite asset definitions provided as inputs via &#39;compositeAssets&#39; field. (required).</param>
        /// <param name="factors">Factors of the model (required).</param>
        /// <param name="factorIdToIsoCurrency">Map of currency factor IDs to ISO currency code. (required).</param>
        /// <param name="firstDate">**(since 1.12.0)**  Date format YYYY-MM-DD. (required).</param>
        /// <param name="frequency">Frequency of the model (required).</param>
        /// <param name="latestDate">**(since 1.12.0)**  Date format YYYY-MM-DD. (required).</param>
        /// <param name="name">Model name (required).</param>
        /// <param name="riskModelAppendFormat">List of fields which are supported by the risk model for appending additional asset data.</param>
        /// <param name="universeCount">Total universe count of the model (required).</param>
        /// <param name="vendor">Model vendor (required).</param>
        public InlineResponse2001Data(string code, List<string> currencies, string currency, List<InlineResponse2001DataFactors> factors, Dictionary<string, string> factorIdToIsoCurrency, DateTime firstDate, string frequency, DateTime latestDate, string name, int universeCount, string vendor,List<InlineResponse2001DataRiskModelAppendFormat> riskModelAppendFormat = default(List<InlineResponse2001DataRiskModelAppendFormat>))
        {
            // to ensure "code" is required (not null)
            if (code == null) {
                throw new ArgumentNullException("code is a required property for InlineResponse2001Data and cannot be null");
            }
            this.Code = code;
            // to ensure "currencies" is required (not null)
            if (currencies == null) {
                throw new ArgumentNullException("currencies is a required property for InlineResponse2001Data and cannot be null");
            }
            this.Currencies = currencies;
            // to ensure "currency" is required (not null)
            if (currency == null) {
                throw new ArgumentNullException("currency is a required property for InlineResponse2001Data and cannot be null");
            }
            this.Currency = currency;
            // to ensure "factors" is required (not null)
            if (factors == null) {
                throw new ArgumentNullException("factors is a required property for InlineResponse2001Data and cannot be null");
            }
            this.Factors = factors;
            // to ensure "factorIdToIsoCurrency" is required (not null)
            if (factorIdToIsoCurrency == null) {
                throw new ArgumentNullException("factorIdToIsoCurrency is a required property for InlineResponse2001Data and cannot be null");
            }
            this.FactorIdToIsoCurrency = factorIdToIsoCurrency;
            this.FirstDate = firstDate;
            // to ensure "frequency" is required (not null)
            if (frequency == null) {
                throw new ArgumentNullException("frequency is a required property for InlineResponse2001Data and cannot be null");
            }
            this.Frequency = frequency;
            this.LatestDate = latestDate;
            // to ensure "name" is required (not null)
            if (name == null) {
                throw new ArgumentNullException("name is a required property for InlineResponse2001Data and cannot be null");
            }
            this.Name = name;
            this.UniverseCount = universeCount;
            // to ensure "vendor" is required (not null)
            if (vendor == null) {
                throw new ArgumentNullException("vendor is a required property for InlineResponse2001Data and cannot be null");
            }
            this.Vendor = vendor;
            this.RiskModelAppendFormat = riskModelAppendFormat;
        }

        /// <summary>
        /// Model code
        /// </summary>
        /// <value>Model code</value>
        [DataMember(Name = "code", IsRequired = true, EmitDefaultValue = false)]
        public string Code { get; set; }

        /// <summary>
        /// Currencies that can be used with the model
        /// </summary>
        /// <value>Currencies that can be used with the model</value>
        [DataMember(Name = "currencies", IsRequired = true, EmitDefaultValue = false)]
        public List<string> Currencies { get; set; }

        /// <summary>
        /// ISO-4217 currency code for risk model and holdings data to fetch and use. Ignored only for composite asset definitions provided as inputs via &#39;compositeAssets&#39; field.
        /// </summary>
        /// <value>ISO-4217 currency code for risk model and holdings data to fetch and use. Ignored only for composite asset definitions provided as inputs via &#39;compositeAssets&#39; field.</value>
        [DataMember(Name = "currency", IsRequired = true, EmitDefaultValue = false)]
        public string Currency { get; set; }

        /// <summary>
        /// Factors of the model
        /// </summary>
        /// <value>Factors of the model</value>
        [DataMember(Name = "factors", IsRequired = true, EmitDefaultValue = false)]
        public List<InlineResponse2001DataFactors> Factors { get; set; }

        /// <summary>
        /// Map of currency factor IDs to ISO currency code.
        /// </summary>
        /// <value>Map of currency factor IDs to ISO currency code.</value>
        [DataMember(Name = "factorIdToIsoCurrency", IsRequired = true, EmitDefaultValue = false)]
        public Dictionary<string, string> FactorIdToIsoCurrency { get; set; }

        /// <summary>
        /// **(since 1.12.0)**  Date format YYYY-MM-DD.
        /// </summary>
        /// <value>**(since 1.12.0)**  Date format YYYY-MM-DD.</value>
        [DataMember(Name = "firstDate", IsRequired = true, EmitDefaultValue = false)]
        [JsonConverter(typeof(OpenAPIDateConverter))]
        public DateTime FirstDate { get; set; }

        /// <summary>
        /// Frequency of the model
        /// </summary>
        /// <value>Frequency of the model</value>
        [DataMember(Name = "frequency", IsRequired = true, EmitDefaultValue = false)]
        public string Frequency { get; set; }

        /// <summary>
        /// **(since 1.12.0)**  Date format YYYY-MM-DD.
        /// </summary>
        /// <value>**(since 1.12.0)**  Date format YYYY-MM-DD.</value>
        [DataMember(Name = "latestDate", IsRequired = true, EmitDefaultValue = false)]
        [JsonConverter(typeof(OpenAPIDateConverter))]
        public DateTime LatestDate { get; set; }

        /// <summary>
        /// Model name
        /// </summary>
        /// <value>Model name</value>
        [DataMember(Name = "name", IsRequired = true, EmitDefaultValue = false)]
        public string Name { get; set; }

        /// <summary>
        /// List of fields which are supported by the risk model for appending additional asset data
        /// </summary>
        /// <value>List of fields which are supported by the risk model for appending additional asset data</value>
        [DataMember(Name = "riskModelAppendFormat", EmitDefaultValue = false)]
        public List<InlineResponse2001DataRiskModelAppendFormat> RiskModelAppendFormat { get; set; }

        /// <summary>
        /// Total universe count of the model
        /// </summary>
        /// <value>Total universe count of the model</value>
        [DataMember(Name = "universeCount", IsRequired = true, EmitDefaultValue = false)]
        public int UniverseCount { get; set; }

        /// <summary>
        /// Model vendor
        /// </summary>
        /// <value>Model vendor</value>
        [DataMember(Name = "vendor", IsRequired = true, EmitDefaultValue = false)]
        public string Vendor { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class InlineResponse2001Data {\n");
            sb.Append("  Code: ").Append(Code).Append("\n");
            sb.Append("  Currencies: ").Append(Currencies).Append("\n");
            sb.Append("  Currency: ").Append(Currency).Append("\n");
            sb.Append("  Factors: ").Append(Factors).Append("\n");
            sb.Append("  FactorIdToIsoCurrency: ").Append(FactorIdToIsoCurrency).Append("\n");
            sb.Append("  FirstDate: ").Append(FirstDate).Append("\n");
            sb.Append("  Frequency: ").Append(Frequency).Append("\n");
            sb.Append("  LatestDate: ").Append(LatestDate).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  RiskModelAppendFormat: ").Append(RiskModelAppendFormat).Append("\n");
            sb.Append("  UniverseCount: ").Append(UniverseCount).Append("\n");
            sb.Append("  Vendor: ").Append(Vendor).Append("\n");
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
            return this.Equals(input as InlineResponse2001Data);
        }

        /// <summary>
        /// Returns true if InlineResponse2001Data instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse2001Data to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse2001Data input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Code == input.Code ||
                    (this.Code != null &&
                    this.Code.Equals(input.Code))
                ) && 
                (
                    this.Currencies == input.Currencies ||
                    this.Currencies != null &&
                    input.Currencies != null &&
                    this.Currencies.SequenceEqual(input.Currencies)
                ) && 
                (
                    this.Currency == input.Currency ||
                    (this.Currency != null &&
                    this.Currency.Equals(input.Currency))
                ) && 
                (
                    this.Factors == input.Factors ||
                    this.Factors != null &&
                    input.Factors != null &&
                    this.Factors.SequenceEqual(input.Factors)
                ) && 
                (
                    this.FactorIdToIsoCurrency == input.FactorIdToIsoCurrency ||
                    this.FactorIdToIsoCurrency != null &&
                    input.FactorIdToIsoCurrency != null &&
                    this.FactorIdToIsoCurrency.SequenceEqual(input.FactorIdToIsoCurrency)
                ) && 
                (
                    this.FirstDate == input.FirstDate ||
                    (this.FirstDate != null &&
                    this.FirstDate.Equals(input.FirstDate))
                ) && 
                (
                    this.Frequency == input.Frequency ||
                    (this.Frequency != null &&
                    this.Frequency.Equals(input.Frequency))
                ) && 
                (
                    this.LatestDate == input.LatestDate ||
                    (this.LatestDate != null &&
                    this.LatestDate.Equals(input.LatestDate))
                ) && 
                (
                    this.Name == input.Name ||
                    (this.Name != null &&
                    this.Name.Equals(input.Name))
                ) && 
                (
                    this.RiskModelAppendFormat == input.RiskModelAppendFormat ||
                    this.RiskModelAppendFormat != null &&
                    input.RiskModelAppendFormat != null &&
                    this.RiskModelAppendFormat.SequenceEqual(input.RiskModelAppendFormat)
                ) && 
                (
                    this.UniverseCount == input.UniverseCount ||
                    this.UniverseCount.Equals(input.UniverseCount)
                ) && 
                (
                    this.Vendor == input.Vendor ||
                    (this.Vendor != null &&
                    this.Vendor.Equals(input.Vendor))
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
                if (this.Code != null)
                {
                    hashCode = (hashCode * 59) + this.Code.GetHashCode();
                }
                if (this.Currencies != null)
                {
                    hashCode = (hashCode * 59) + this.Currencies.GetHashCode();
                }
                if (this.Currency != null)
                {
                    hashCode = (hashCode * 59) + this.Currency.GetHashCode();
                }
                if (this.Factors != null)
                {
                    hashCode = (hashCode * 59) + this.Factors.GetHashCode();
                }
                if (this.FactorIdToIsoCurrency != null)
                {
                    hashCode = (hashCode * 59) + this.FactorIdToIsoCurrency.GetHashCode();
                }
                if (this.FirstDate != null)
                {
                    hashCode = (hashCode * 59) + this.FirstDate.GetHashCode();
                }
                if (this.Frequency != null)
                {
                    hashCode = (hashCode * 59) + this.Frequency.GetHashCode();
                }
                if (this.LatestDate != null)
                {
                    hashCode = (hashCode * 59) + this.LatestDate.GetHashCode();
                }
                if (this.Name != null)
                {
                    hashCode = (hashCode * 59) + this.Name.GetHashCode();
                }
                if (this.RiskModelAppendFormat != null)
                {
                    hashCode = (hashCode * 59) + this.RiskModelAppendFormat.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.UniverseCount.GetHashCode();
                if (this.Vendor != null)
                {
                    hashCode = (hashCode * 59) + this.Vendor.GetHashCode();
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
            // Code (string) minLength
            if (this.Code != null && this.Code.Length < 1)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for Code, length must be greater than 1.", new [] { "Code" });
            }

            // Currency (string) minLength
            if (this.Currency != null && this.Currency.Length < 1)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for Currency, length must be greater than 1.", new [] { "Currency" });
            }

            // Frequency (string) minLength
            if (this.Frequency != null && this.Frequency.Length < 1)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for Frequency, length must be greater than 1.", new [] { "Frequency" });
            }

            // Name (string) minLength
            if (this.Name != null && this.Name.Length < 1)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for Name, length must be greater than 1.", new [] { "Name" });
            }

            // Vendor (string) minLength
            if (this.Vendor != null && this.Vendor.Length < 1)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for Vendor, length must be greater than 1.", new [] { "Vendor" });
            }

            yield break;
        }
    }

}
