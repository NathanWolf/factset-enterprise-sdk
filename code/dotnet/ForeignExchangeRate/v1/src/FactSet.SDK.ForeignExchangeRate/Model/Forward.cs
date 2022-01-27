/*
 * Foreign Exchange Rates API
 *
 * Foreign Exchange Rates API in which retrieves Spots and Forwards for a given currency pair and date range. <p>*Spots and Forwards rates are sourced from W/M Reuters.The WM Company calculates daily standardized spot rates for global foreign exchange transactions, using rates provided by Reuters. These rates are recognized globally as the standard by banks, fund managers, and index compilers; increasingly these rates are also being used for benchmark currency trading. In 1994, WM Company began calculating closing spot rates. Closing spot rates provide a standard set of currency rates so that portfolio valuations can be compared to each other and their performances measured against benchmarks, without having discrepancies caused by exchange rates. Closing spot rates are recorded at 16:00 GMT.*</p> 
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
using OpenAPIDateConverter = FactSet.SDK.ForeignExchangeRate.Client.OpenAPIDateConverter;

namespace FactSet.SDK.ForeignExchangeRate.Model
{
    /// <summary>
    /// Forward
    /// </summary>
    [DataContract(Name = "forward")]
    public partial class Forward : IEquatable<Forward>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="Forward" /> class.
        /// </summary>
        /// <param name="requestId">The FX Forward Rate currency pair requested in the &#39;ids&#39; parameter. This represents the base and quote currency..</param>
        /// <param name="currencyName">The full text currency pair name expressed in Proper Case..</param>
        /// <param name="forwardBid">The currency pair&#39;s Forward Rate Bid..</param>
        /// <param name="forwardMid">The currency pair&#39;s Forward Rate Mid..</param>
        /// <param name="forwardAsk">The currency pair&#39;s Forward Rate Ask..</param>
        /// <param name="date">Ending date for the period expressed in YYYY-MM-DD format..</param>
        /// <param name="forwardPeriod">The Forward Time Period requested for the Currency Pair..</param>
        public Forward(string requestId = default(string), string currencyName = default(string), decimal forwardBid = default(decimal), decimal forwardMid = default(decimal), decimal forwardAsk = default(decimal), DateTime date = default(DateTime), string forwardPeriod = default(string))
        {
            this.RequestId = requestId;
            this.CurrencyName = currencyName;
            this.ForwardBid = forwardBid;
            this.ForwardMid = forwardMid;
            this.ForwardAsk = forwardAsk;
            this.Date = date;
            this.ForwardPeriod = forwardPeriod;
        }

        /// <summary>
        /// The FX Forward Rate currency pair requested in the &#39;ids&#39; parameter. This represents the base and quote currency.
        /// </summary>
        /// <value>The FX Forward Rate currency pair requested in the &#39;ids&#39; parameter. This represents the base and quote currency.</value>
        [DataMember(Name = "requestId", EmitDefaultValue = false)]
        public string RequestId { get; set; }

        /// <summary>
        /// The full text currency pair name expressed in Proper Case.
        /// </summary>
        /// <value>The full text currency pair name expressed in Proper Case.</value>
        [DataMember(Name = "currencyName", EmitDefaultValue = false)]
        public string CurrencyName { get; set; }

        /// <summary>
        /// The currency pair&#39;s Forward Rate Bid.
        /// </summary>
        /// <value>The currency pair&#39;s Forward Rate Bid.</value>
        [DataMember(Name = "forwardBid", EmitDefaultValue = false)]
        public decimal ForwardBid { get; set; }

        /// <summary>
        /// The currency pair&#39;s Forward Rate Mid.
        /// </summary>
        /// <value>The currency pair&#39;s Forward Rate Mid.</value>
        [DataMember(Name = "forwardMid", EmitDefaultValue = false)]
        public decimal ForwardMid { get; set; }

        /// <summary>
        /// The currency pair&#39;s Forward Rate Ask.
        /// </summary>
        /// <value>The currency pair&#39;s Forward Rate Ask.</value>
        [DataMember(Name = "forwardAsk", EmitDefaultValue = false)]
        public decimal ForwardAsk { get; set; }

        /// <summary>
        /// Ending date for the period expressed in YYYY-MM-DD format.
        /// </summary>
        /// <value>Ending date for the period expressed in YYYY-MM-DD format.</value>
        [DataMember(Name = "date", EmitDefaultValue = false)]
        [JsonConverter(typeof(OpenAPIDateConverter))]
        public DateTime Date { get; set; }

        /// <summary>
        /// The Forward Time Period requested for the Currency Pair.
        /// </summary>
        /// <value>The Forward Time Period requested for the Currency Pair.</value>
        [DataMember(Name = "forwardPeriod", EmitDefaultValue = false)]
        public string ForwardPeriod { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class Forward {\n");
            sb.Append("  RequestId: ").Append(RequestId).Append("\n");
            sb.Append("  CurrencyName: ").Append(CurrencyName).Append("\n");
            sb.Append("  ForwardBid: ").Append(ForwardBid).Append("\n");
            sb.Append("  ForwardMid: ").Append(ForwardMid).Append("\n");
            sb.Append("  ForwardAsk: ").Append(ForwardAsk).Append("\n");
            sb.Append("  Date: ").Append(Date).Append("\n");
            sb.Append("  ForwardPeriod: ").Append(ForwardPeriod).Append("\n");
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
            return this.Equals(input as Forward);
        }

        /// <summary>
        /// Returns true if Forward instances are equal
        /// </summary>
        /// <param name="input">Instance of Forward to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Forward input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.RequestId == input.RequestId ||
                    (this.RequestId != null &&
                    this.RequestId.Equals(input.RequestId))
                ) && 
                (
                    this.CurrencyName == input.CurrencyName ||
                    (this.CurrencyName != null &&
                    this.CurrencyName.Equals(input.CurrencyName))
                ) && 
                (
                    this.ForwardBid == input.ForwardBid ||
                    this.ForwardBid.Equals(input.ForwardBid)
                ) && 
                (
                    this.ForwardMid == input.ForwardMid ||
                    this.ForwardMid.Equals(input.ForwardMid)
                ) && 
                (
                    this.ForwardAsk == input.ForwardAsk ||
                    this.ForwardAsk.Equals(input.ForwardAsk)
                ) && 
                (
                    this.Date == input.Date ||
                    (this.Date != null &&
                    this.Date.Equals(input.Date))
                ) && 
                (
                    this.ForwardPeriod == input.ForwardPeriod ||
                    (this.ForwardPeriod != null &&
                    this.ForwardPeriod.Equals(input.ForwardPeriod))
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
                if (this.RequestId != null)
                    hashCode = hashCode * 59 + this.RequestId.GetHashCode();
                if (this.CurrencyName != null)
                    hashCode = hashCode * 59 + this.CurrencyName.GetHashCode();
                hashCode = hashCode * 59 + this.ForwardBid.GetHashCode();
                hashCode = hashCode * 59 + this.ForwardMid.GetHashCode();
                hashCode = hashCode * 59 + this.ForwardAsk.GetHashCode();
                if (this.Date != null)
                    hashCode = hashCode * 59 + this.Date.GetHashCode();
                if (this.ForwardPeriod != null)
                    hashCode = hashCode * 59 + this.ForwardPeriod.GetHashCode();
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
