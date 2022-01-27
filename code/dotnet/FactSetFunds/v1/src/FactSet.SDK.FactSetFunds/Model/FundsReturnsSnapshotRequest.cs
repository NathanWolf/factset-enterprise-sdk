/*
 * FactSet Funds API
 *
 * FactSet Mutual Funds data offers over 50 fund- and share class-specific data points for mutual funds listed in the United States. <p>FactSet Mutual Funds Reference provides fund-specific reference information as well as FactSet's proprietary classification system. It includes but is not limited to the following coverage    * Fund descriptions    * A seven-tier classification system   * Leverage information   * Fees and expenses    * Portfolio managers       FactSet Mutual Funds Time Series provides quantitative data items on a historical basis. It includes but is not limited to the following coverage    * Net asset value   * Fund flows    * Assets under management   * Total return  
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
using OpenAPIDateConverter = FactSet.SDK.FactSetFunds.Client.OpenAPIDateConverter;

namespace FactSet.SDK.FactSetFunds.Model
{
    /// <summary>
    /// Returns Request Body
    /// </summary>
    [DataContract(Name = "fundsReturnsSnapshotRequest")]
    public partial class FundsReturnsSnapshotRequest : IEquatable<FundsReturnsSnapshotRequest>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="FundsReturnsSnapshotRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected FundsReturnsSnapshotRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="FundsReturnsSnapshotRequest" /> class.
        /// </summary>
        /// <param name="ids">The requested Fund Identifier. FactSet Identifiers, tickers, CUSIP and SEDOL are accepted input. &lt;p&gt;***ids limit** &#x3D;  1000 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;*  (required).</param>
        /// <param name="date">The date requested for a given date range in YYYY-MM-DD format. The date MUST be equal to or less than the &#x60;priceRecentDate&#x60; found within the /summary endpoint. .</param>
        /// <param name="dividendAdjust">dividendAdjust.</param>
        public FundsReturnsSnapshotRequest(List<string> ids = default(List<string>), string date = default(string), DividendAdjust dividendAdjust = default(DividendAdjust))
        {
            // to ensure "ids" is required (not null)
            if (ids == null) {
                throw new ArgumentNullException("ids is a required property for FundsReturnsSnapshotRequest and cannot be null");
            }
            this.Ids = ids;
            this.Date = date;
            this.DividendAdjust = dividendAdjust;
        }

        /// <summary>
        /// The requested Fund Identifier. FactSet Identifiers, tickers, CUSIP and SEDOL are accepted input. &lt;p&gt;***ids limit** &#x3D;  1000 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;* 
        /// </summary>
        /// <value>The requested Fund Identifier. FactSet Identifiers, tickers, CUSIP and SEDOL are accepted input. &lt;p&gt;***ids limit** &#x3D;  1000 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;* </value>
        [DataMember(Name = "ids", IsRequired = true, EmitDefaultValue = false)]
        public List<string> Ids { get; set; }

        /// <summary>
        /// The date requested for a given date range in YYYY-MM-DD format. The date MUST be equal to or less than the &#x60;priceRecentDate&#x60; found within the /summary endpoint. 
        /// </summary>
        /// <value>The date requested for a given date range in YYYY-MM-DD format. The date MUST be equal to or less than the &#x60;priceRecentDate&#x60; found within the /summary endpoint. </value>
        [DataMember(Name = "date", EmitDefaultValue = false)]
        public string Date { get; set; }

        /// <summary>
        /// Gets or Sets DividendAdjust
        /// </summary>
        [DataMember(Name = "dividendAdjust", EmitDefaultValue = false)]
        public DividendAdjust DividendAdjust { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class FundsReturnsSnapshotRequest {\n");
            sb.Append("  Ids: ").Append(Ids).Append("\n");
            sb.Append("  Date: ").Append(Date).Append("\n");
            sb.Append("  DividendAdjust: ").Append(DividendAdjust).Append("\n");
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
            return this.Equals(input as FundsReturnsSnapshotRequest);
        }

        /// <summary>
        /// Returns true if FundsReturnsSnapshotRequest instances are equal
        /// </summary>
        /// <param name="input">Instance of FundsReturnsSnapshotRequest to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(FundsReturnsSnapshotRequest input)
        {
            if (input == null)
                return false;

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
                    this.DividendAdjust == input.DividendAdjust ||
                    (this.DividendAdjust != null &&
                    this.DividendAdjust.Equals(input.DividendAdjust))
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
                    hashCode = hashCode * 59 + this.Ids.GetHashCode();
                if (this.Date != null)
                    hashCode = hashCode * 59 + this.Date.GetHashCode();
                if (this.DividendAdjust != null)
                    hashCode = hashCode * 59 + this.DividendAdjust.GetHashCode();
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
