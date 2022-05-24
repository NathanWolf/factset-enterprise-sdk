/*
 * FactSet Ownership API
 *
 * FactSet’s Fund Ownership API gives access to both **Holdings** and **Holders** data.<p> Factset's Holdings endpoints gives access to all the underlying securities and their position detils held within a given fund. Fund Types supported include Open-End Mutual Funds, Closed-end Mutual Funds, and Exchange Traded Funds. Security Holders information retrieves all \"holder types\" and their positions across institutions, funds, insiders, and stakeholders.</p><p>The FactSet Ownership and Mutual Funds database collects global equity ownership data for approximately 50,000 institutions, 60,000 unique Mutual Fund portfolios, and 400,000 Insider/Stake holders from around 110 countries.  For more details review our [Data Collection](https://my.apps.factset.com/oa/cms/oaAttachment/87e162be-f2d1-4f40-a85b-bfb1b020d270/20079) methodology. </p> 
 *
 * The version of the OpenAPI document: 1.1.0
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
using OpenAPIDateConverter = FactSet.SDK.FactSetOwnership.Client.OpenAPIDateConverter;

namespace FactSet.SDK.FactSetOwnership.Model
{
    /// <summary>
    /// Holdings Request
    /// </summary>
    [DataContract(Name = "fundHoldingsRequest")]
    public partial class FundHoldingsRequest : IEquatable<FundHoldingsRequest>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="FundHoldingsRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected FundHoldingsRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="FundHoldingsRequest" /> class.
        /// </summary>
        /// <param name="ids">List of Fund identifiers. (required).</param>
        /// <param name="date">Date of holdings expressed in YYYY-MM-DD format..</param>
        /// <param name="topn">Limits number of holdings or holders displayed by the top *n* securities. Default is ALL, or use integer to limit number. (default to &quot;ALL&quot;).</param>
        /// <param name="assetType">assetType.</param>
        /// <param name="currency">Currency code for adjusting prices. Default is Local. For a list of currency ISO codes, visit [Online Assistant Page 1470](https://oa.apps.factset.com/pages/1470)..</param>
        public FundHoldingsRequest(List<string> ids = default(List<string>), string date = default(string), string topn = "ALL", AssetType assetType = default(AssetType), string currency = default(string))
        {
            // to ensure "ids" is required (not null)
            if (ids == null) {
                throw new ArgumentNullException("ids is a required property for FundHoldingsRequest and cannot be null");
            }
            this.Ids = ids;
            this.Date = date;
            // use default value if no "topn" provided
            this.Topn = topn ?? "ALL";
            this.AssetType = assetType;
            this.Currency = currency;
        }

        /// <summary>
        /// List of Fund identifiers.
        /// </summary>
        /// <value>List of Fund identifiers.</value>
        [DataMember(Name = "ids", IsRequired = true, EmitDefaultValue = false)]
        public List<string> Ids { get; set; }

        /// <summary>
        /// Date of holdings expressed in YYYY-MM-DD format.
        /// </summary>
        /// <value>Date of holdings expressed in YYYY-MM-DD format.</value>
        [DataMember(Name = "date", EmitDefaultValue = false)]
        public string Date { get; set; }

        /// <summary>
        /// Limits number of holdings or holders displayed by the top *n* securities. Default is ALL, or use integer to limit number.
        /// </summary>
        /// <value>Limits number of holdings or holders displayed by the top *n* securities. Default is ALL, or use integer to limit number.</value>
        [DataMember(Name = "topn", EmitDefaultValue = false)]
        public string Topn { get; set; }

        /// <summary>
        /// Gets or Sets AssetType
        /// </summary>
        [DataMember(Name = "assetType", EmitDefaultValue = false)]
        public AssetType AssetType { get; set; }

        /// <summary>
        /// Currency code for adjusting prices. Default is Local. For a list of currency ISO codes, visit [Online Assistant Page 1470](https://oa.apps.factset.com/pages/1470).
        /// </summary>
        /// <value>Currency code for adjusting prices. Default is Local. For a list of currency ISO codes, visit [Online Assistant Page 1470](https://oa.apps.factset.com/pages/1470).</value>
        [DataMember(Name = "currency", EmitDefaultValue = false)]
        public string Currency { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class FundHoldingsRequest {\n");
            sb.Append("  Ids: ").Append(Ids).Append("\n");
            sb.Append("  Date: ").Append(Date).Append("\n");
            sb.Append("  Topn: ").Append(Topn).Append("\n");
            sb.Append("  AssetType: ").Append(AssetType).Append("\n");
            sb.Append("  Currency: ").Append(Currency).Append("\n");
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
            return this.Equals(input as FundHoldingsRequest);
        }

        /// <summary>
        /// Returns true if FundHoldingsRequest instances are equal
        /// </summary>
        /// <param name="input">Instance of FundHoldingsRequest to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(FundHoldingsRequest input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Ids == input.Ids ||
                    this.Ids != null &&
                    input.Ids != null &&
                    this.Ids.SequenceEqual(input.Ids)
                ) && 
                (
                    this.Date == input.Date ||
                    (this.Date != null &&
                    this.Date.Equals(input.Date))
                ) && 
                (
                    this.Topn == input.Topn ||
                    (this.Topn != null &&
                    this.Topn.Equals(input.Topn))
                ) && 
                (
                    this.AssetType == input.AssetType ||
                    (this.AssetType != null &&
                    this.AssetType.Equals(input.AssetType))
                ) && 
                (
                    this.Currency == input.Currency ||
                    (this.Currency != null &&
                    this.Currency.Equals(input.Currency))
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
                if (this.Ids != null)
                {
                    hashCode = (hashCode * 59) + this.Ids.GetHashCode();
                }
                if (this.Date != null)
                {
                    hashCode = (hashCode * 59) + this.Date.GetHashCode();
                }
                if (this.Topn != null)
                {
                    hashCode = (hashCode * 59) + this.Topn.GetHashCode();
                }
                if (this.AssetType != null)
                {
                    hashCode = (hashCode * 59) + this.AssetType.GetHashCode();
                }
                if (this.Currency != null)
                {
                    hashCode = (hashCode * 59) + this.Currency.GetHashCode();
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
