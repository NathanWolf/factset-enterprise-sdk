/*
 * FactSet Options API
 *
 * The Option Prices database provides pricing data such as mid bid-ask price, reference data (e.g., strike price), and risk measures (e.g., Greeks and implied volatility). Visit [Options Overview OA Page # 14925](https://my.apps.factset.com/oa/pages/14925) for details on database coverage. U.S. exchange-traded option bid and ask quotes are continuously updated throughout the day even when no trades have occurred on the option (zero volume). The end-of-day closing bid and ask quotes are always in line with the underlying closing price.  **Note** * Currently in Beta only **OPRA** exchanges are supported. 
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
using OpenAPIDateConverter = FactSet.SDK.FactSetOptions.Client.OpenAPIDateConverter;

namespace FactSet.SDK.FactSetOptions.Model
{
    /// <summary>
    /// Volatility Response fields
    /// </summary>
    [DataContract(Name = "impliedVolatility")]
    public partial class ImpliedVolatility : IEquatable<ImpliedVolatility>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ImpliedVolatility" /> class.
        /// </summary>
        /// <param name="impliedVolatility">The estimated volatility of a security&#39;s price * In general, implied volatility increases when the market is bearish and decreases when the market is bullish. This is due to the common belief that bearish markets are more risky than bullish markets.  * In addition to known factors such as market price, interest rate, expiration date, and strike price, implied volatility is used in calculating an option&#39;s premium.  * Barone-Adesi model used for American Style options and Black-Scholes model for European Style options. .</param>
        /// <param name="date">The date the data is as of in YYYY-MM-DD format..</param>
        /// <param name="fsymId">FactSet&#39;s Option Symbol. For more detail, visit [OA 12636](https://my.apps.factset.com/oa/pages/12636#options).</param>
        /// <param name="requestId">The requested identifier submitted in the query..</param>
        public ImpliedVolatility(double impliedVolatility = default(double), DateTime date = default(DateTime), string fsymId = default(string), string requestId = default(string))
        {
            this._ImpliedVolatility = impliedVolatility;
            this.Date = date;
            this.FsymId = fsymId;
            this.RequestId = requestId;
        }

        /// <summary>
        /// The estimated volatility of a security&#39;s price * In general, implied volatility increases when the market is bearish and decreases when the market is bullish. This is due to the common belief that bearish markets are more risky than bullish markets.  * In addition to known factors such as market price, interest rate, expiration date, and strike price, implied volatility is used in calculating an option&#39;s premium.  * Barone-Adesi model used for American Style options and Black-Scholes model for European Style options. 
        /// </summary>
        /// <value>The estimated volatility of a security&#39;s price * In general, implied volatility increases when the market is bearish and decreases when the market is bullish. This is due to the common belief that bearish markets are more risky than bullish markets.  * In addition to known factors such as market price, interest rate, expiration date, and strike price, implied volatility is used in calculating an option&#39;s premium.  * Barone-Adesi model used for American Style options and Black-Scholes model for European Style options. </value>
        [DataMember(Name = "impliedVolatility", EmitDefaultValue = false)]
        public double _ImpliedVolatility { get; set; }

        /// <summary>
        /// The date the data is as of in YYYY-MM-DD format.
        /// </summary>
        /// <value>The date the data is as of in YYYY-MM-DD format.</value>
        [DataMember(Name = "date", EmitDefaultValue = false)]
        [JsonConverter(typeof(OpenAPIDateConverter))]
        public DateTime Date { get; set; }

        /// <summary>
        /// FactSet&#39;s Option Symbol. For more detail, visit [OA 12636](https://my.apps.factset.com/oa/pages/12636#options)
        /// </summary>
        /// <value>FactSet&#39;s Option Symbol. For more detail, visit [OA 12636](https://my.apps.factset.com/oa/pages/12636#options)</value>
        [DataMember(Name = "fsymId", EmitDefaultValue = false)]
        public string FsymId { get; set; }

        /// <summary>
        /// The requested identifier submitted in the query.
        /// </summary>
        /// <value>The requested identifier submitted in the query.</value>
        [DataMember(Name = "requestId", EmitDefaultValue = false)]
        public string RequestId { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ImpliedVolatility {\n");
            sb.Append("  _ImpliedVolatility: ").Append(_ImpliedVolatility).Append("\n");
            sb.Append("  Date: ").Append(Date).Append("\n");
            sb.Append("  FsymId: ").Append(FsymId).Append("\n");
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
            return this.Equals(input as ImpliedVolatility);
        }

        /// <summary>
        /// Returns true if ImpliedVolatility instances are equal
        /// </summary>
        /// <param name="input">Instance of ImpliedVolatility to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ImpliedVolatility input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this._ImpliedVolatility == input._ImpliedVolatility ||
                    this._ImpliedVolatility.Equals(input._ImpliedVolatility)
                ) && 
                (
                    this.Date == input.Date ||
                    (this.Date != null &&
                    this.Date.Equals(input.Date))
                ) && 
                (
                    this.FsymId == input.FsymId ||
                    (this.FsymId != null &&
                    this.FsymId.Equals(input.FsymId))
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
                hashCode = (hashCode * 59) + this._ImpliedVolatility.GetHashCode();
                if (this.Date != null)
                {
                    hashCode = (hashCode * 59) + this.Date.GetHashCode();
                }
                if (this.FsymId != null)
                {
                    hashCode = (hashCode * 59) + this.FsymId.GetHashCode();
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
