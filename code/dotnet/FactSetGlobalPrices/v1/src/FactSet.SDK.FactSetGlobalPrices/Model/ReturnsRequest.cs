/*
 * FactSet Global Prices API
 *
 * The FactSet Global Prices API provides end of day market pricing content using cloud and microservices technology, encompassing both pricing as well as corporate actions and events data.</p> 
 *
 * The version of the OpenAPI document: 1.7.0
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
using OpenAPIDateConverter = FactSet.SDK.FactSetGlobalPrices.Client.OpenAPIDateConverter;

namespace FactSet.SDK.FactSetGlobalPrices.Model
{
    /// <summary>
    /// Returns Request Body
    /// </summary>
    [DataContract(Name = "returnsRequest")]
    public partial class ReturnsRequest : IEquatable<ReturnsRequest>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ReturnsRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ReturnsRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ReturnsRequest" /> class.
        /// </summary>
        /// <param name="ids">The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids.  &lt;p&gt;ids limit &#x3D;  1000 per non-batch request / 10000 per batch request for a single day and 50 per multi-day request&lt;/p&gt;  (required).</param>
        /// <param name="startDate">The start date requested for a given date range in **YYYY-MM-DD** format. Future dates (T+1) are not accepted in this endpoint.  (required).</param>
        /// <param name="endDate">The end date requested for a given date range in **YYYY-MM-DD** format. Future dates (T+1) are not accepted in this endpoint. .</param>
        /// <param name="currency">Currency code for adjusting prices. Default is Local. For a list of currency ISO codes, visit [Online Assistant Page 1470](https://oa.apps.factset.com/pages/1470)..</param>
        /// <param name="frequency">frequency.</param>
        /// <param name="dividendAdjust">dividendAdjust.</param>
        /// <param name="batch">batch.</param>
        public ReturnsRequest(List<string> ids, string startDate,string endDate = default(string), string currency = default(string), Frequency frequency = default(Frequency), DividendAdjust dividendAdjust = default(DividendAdjust), Batch batch = default(Batch))
        {
            // to ensure "ids" is required (not null)
            if (ids == null) {
                throw new ArgumentNullException("ids is a required property for ReturnsRequest and cannot be null");
            }
            this.Ids = ids;
            // to ensure "startDate" is required (not null)
            if (startDate == null) {
                throw new ArgumentNullException("startDate is a required property for ReturnsRequest and cannot be null");
            }
            this.StartDate = startDate;
            this.EndDate = endDate;
            this.Currency = currency;
            this.Frequency = frequency;
            this.DividendAdjust = dividendAdjust;
            this.Batch = batch;
        }

        /// <summary>
        /// The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids.  &lt;p&gt;ids limit &#x3D;  1000 per non-batch request / 10000 per batch request for a single day and 50 per multi-day request&lt;/p&gt; 
        /// </summary>
        /// <value>The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids.  &lt;p&gt;ids limit &#x3D;  1000 per non-batch request / 10000 per batch request for a single day and 50 per multi-day request&lt;/p&gt; </value>
        [DataMember(Name = "ids", IsRequired = true, EmitDefaultValue = false)]
        public List<string> Ids { get; set; }

        /// <summary>
        /// The start date requested for a given date range in **YYYY-MM-DD** format. Future dates (T+1) are not accepted in this endpoint. 
        /// </summary>
        /// <value>The start date requested for a given date range in **YYYY-MM-DD** format. Future dates (T+1) are not accepted in this endpoint. </value>
        [DataMember(Name = "startDate", IsRequired = true, EmitDefaultValue = false)]
        public string StartDate { get; set; }

        /// <summary>
        /// The end date requested for a given date range in **YYYY-MM-DD** format. Future dates (T+1) are not accepted in this endpoint. 
        /// </summary>
        /// <value>The end date requested for a given date range in **YYYY-MM-DD** format. Future dates (T+1) are not accepted in this endpoint. </value>
        [DataMember(Name = "endDate", EmitDefaultValue = false)]
        public string EndDate { get; set; }

        /// <summary>
        /// Currency code for adjusting prices. Default is Local. For a list of currency ISO codes, visit [Online Assistant Page 1470](https://oa.apps.factset.com/pages/1470).
        /// </summary>
        /// <value>Currency code for adjusting prices. Default is Local. For a list of currency ISO codes, visit [Online Assistant Page 1470](https://oa.apps.factset.com/pages/1470).</value>
        [DataMember(Name = "currency", EmitDefaultValue = false)]
        public string Currency { get; set; }

        /// <summary>
        /// Gets or Sets Frequency
        /// </summary>
        [DataMember(Name = "frequency", EmitDefaultValue = false)]
        public Frequency Frequency { get; set; }

        /// <summary>
        /// Gets or Sets DividendAdjust
        /// </summary>
        [DataMember(Name = "dividendAdjust", EmitDefaultValue = false)]
        public DividendAdjust DividendAdjust { get; set; }

        /// <summary>
        /// Gets or Sets Batch
        /// </summary>
        [DataMember(Name = "batch", EmitDefaultValue = false)]
        public Batch Batch { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ReturnsRequest {\n");
            sb.Append("  Ids: ").Append(Ids).Append("\n");
            sb.Append("  StartDate: ").Append(StartDate).Append("\n");
            sb.Append("  EndDate: ").Append(EndDate).Append("\n");
            sb.Append("  Currency: ").Append(Currency).Append("\n");
            sb.Append("  Frequency: ").Append(Frequency).Append("\n");
            sb.Append("  DividendAdjust: ").Append(DividendAdjust).Append("\n");
            sb.Append("  Batch: ").Append(Batch).Append("\n");
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
            return this.Equals(input as ReturnsRequest);
        }

        /// <summary>
        /// Returns true if ReturnsRequest instances are equal
        /// </summary>
        /// <param name="input">Instance of ReturnsRequest to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ReturnsRequest input)
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
                    this.StartDate == input.StartDate ||
                    (this.StartDate != null &&
                    this.StartDate.Equals(input.StartDate))
                ) && 
                (
                    this.EndDate == input.EndDate ||
                    (this.EndDate != null &&
                    this.EndDate.Equals(input.EndDate))
                ) && 
                (
                    this.Currency == input.Currency ||
                    (this.Currency != null &&
                    this.Currency.Equals(input.Currency))
                ) && 
                (
                    this.Frequency == input.Frequency ||
                    (this.Frequency != null &&
                    this.Frequency.Equals(input.Frequency))
                ) && 
                (
                    this.DividendAdjust == input.DividendAdjust ||
                    (this.DividendAdjust != null &&
                    this.DividendAdjust.Equals(input.DividendAdjust))
                ) && 
                (
                    this.Batch == input.Batch ||
                    (this.Batch != null &&
                    this.Batch.Equals(input.Batch))
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
                if (this.StartDate != null)
                {
                    hashCode = (hashCode * 59) + this.StartDate.GetHashCode();
                }
                if (this.EndDate != null)
                {
                    hashCode = (hashCode * 59) + this.EndDate.GetHashCode();
                }
                if (this.Currency != null)
                {
                    hashCode = (hashCode * 59) + this.Currency.GetHashCode();
                }
                if (this.Frequency != null)
                {
                    hashCode = (hashCode * 59) + this.Frequency.GetHashCode();
                }
                if (this.DividendAdjust != null)
                {
                    hashCode = (hashCode * 59) + this.DividendAdjust.GetHashCode();
                }
                if (this.Batch != null)
                {
                    hashCode = (hashCode * 59) + this.Batch.GetHashCode();
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
