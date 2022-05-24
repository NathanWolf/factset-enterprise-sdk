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
    /// ReturnsRange
    /// </summary>
    [DataContract(Name = "returnsRange")]
    public partial class ReturnsRange : IEquatable<ReturnsRange>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ReturnsRange" /> class.
        /// </summary>
        /// <param name="fsymId">FactSet Security Identifier. Six alpha-numeric characters, excluding vowels, with a -S suffix (XXXXXX-S), resolved from the requestId of the Fund requested..</param>
        /// <param name="_return">The Return calculated between two dates. The return type is determined by including or excluding dividends through the dividendAdjust parameter..</param>
        /// <param name="returnStartDate">The start date of the return in YYYY-MM-DD format. *NOTE - the startDate cannot be less than the &#x60;priceFirstDate&#x60; which can be accessed in the /summary endpoint..</param>
        /// <param name="returnEndDate">The end date of the return in YYYY-MM-DD format. The start date of the return in YYYY-MM-DD format. *NOTE - the startDate cannot be less than the &#x60;priceFirstDate&#x60; which can be accessed in the /summary endpoint..</param>
        /// <param name="requestId">The requested Id sent as input..</param>
        public ReturnsRange(string fsymId = default(string), double _return = default(double), string returnStartDate = default(string), string returnEndDate = default(string), string requestId = default(string))
        {
            this.FsymId = fsymId;
            this.Return = _return;
            this.ReturnStartDate = returnStartDate;
            this.ReturnEndDate = returnEndDate;
            this.RequestId = requestId;
        }

        /// <summary>
        /// FactSet Security Identifier. Six alpha-numeric characters, excluding vowels, with a -S suffix (XXXXXX-S), resolved from the requestId of the Fund requested.
        /// </summary>
        /// <value>FactSet Security Identifier. Six alpha-numeric characters, excluding vowels, with a -S suffix (XXXXXX-S), resolved from the requestId of the Fund requested.</value>
        [DataMember(Name = "fsymId", EmitDefaultValue = false)]
        public string FsymId { get; set; }

        /// <summary>
        /// The Return calculated between two dates. The return type is determined by including or excluding dividends through the dividendAdjust parameter.
        /// </summary>
        /// <value>The Return calculated between two dates. The return type is determined by including or excluding dividends through the dividendAdjust parameter.</value>
        [DataMember(Name = "return", EmitDefaultValue = false)]
        public double Return { get; set; }

        /// <summary>
        /// The start date of the return in YYYY-MM-DD format. *NOTE - the startDate cannot be less than the &#x60;priceFirstDate&#x60; which can be accessed in the /summary endpoint.
        /// </summary>
        /// <value>The start date of the return in YYYY-MM-DD format. *NOTE - the startDate cannot be less than the &#x60;priceFirstDate&#x60; which can be accessed in the /summary endpoint.</value>
        [DataMember(Name = "returnStartDate", EmitDefaultValue = false)]
        [JsonConverter(typeof(OpenAPIDateConverter))]
        public string ReturnStartDate { get; set; }

        /// <summary>
        /// The end date of the return in YYYY-MM-DD format. The start date of the return in YYYY-MM-DD format. *NOTE - the startDate cannot be less than the &#x60;priceFirstDate&#x60; which can be accessed in the /summary endpoint.
        /// </summary>
        /// <value>The end date of the return in YYYY-MM-DD format. The start date of the return in YYYY-MM-DD format. *NOTE - the startDate cannot be less than the &#x60;priceFirstDate&#x60; which can be accessed in the /summary endpoint.</value>
        [DataMember(Name = "returnEndDate", EmitDefaultValue = false)]
        [JsonConverter(typeof(OpenAPIDateConverter))]
        public string ReturnEndDate { get; set; }

        /// <summary>
        /// The requested Id sent as input.
        /// </summary>
        /// <value>The requested Id sent as input.</value>
        [DataMember(Name = "requestId", EmitDefaultValue = false)]
        public string RequestId { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ReturnsRange {\n");
            sb.Append("  FsymId: ").Append(FsymId).Append("\n");
            sb.Append("  Return: ").Append(Return).Append("\n");
            sb.Append("  ReturnStartDate: ").Append(ReturnStartDate).Append("\n");
            sb.Append("  ReturnEndDate: ").Append(ReturnEndDate).Append("\n");
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
            return this.Equals(input as ReturnsRange);
        }

        /// <summary>
        /// Returns true if ReturnsRange instances are equal
        /// </summary>
        /// <param name="input">Instance of ReturnsRange to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ReturnsRange input)
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
                    this.Return == input.Return ||
                    this.Return.Equals(input.Return)
                ) && 
                (
                    this.ReturnStartDate == input.ReturnStartDate ||
                    (this.ReturnStartDate != null &&
                    this.ReturnStartDate.Equals(input.ReturnStartDate))
                ) && 
                (
                    this.ReturnEndDate == input.ReturnEndDate ||
                    (this.ReturnEndDate != null &&
                    this.ReturnEndDate.Equals(input.ReturnEndDate))
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
                hashCode = (hashCode * 59) + this.Return.GetHashCode();
                if (this.ReturnStartDate != null)
                {
                    hashCode = (hashCode * 59) + this.ReturnStartDate.GetHashCode();
                }
                if (this.ReturnEndDate != null)
                {
                    hashCode = (hashCode * 59) + this.ReturnEndDate.GetHashCode();
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
