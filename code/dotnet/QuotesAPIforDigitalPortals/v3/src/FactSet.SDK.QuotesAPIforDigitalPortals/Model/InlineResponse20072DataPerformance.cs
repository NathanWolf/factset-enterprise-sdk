/*
 * Quotes API For Digital Portals
 *
 * The quotes API combines endpoints for retrieving security end-of-day, delayed, and realtime prices with performance key figures and basic reference data on the security and market level.  The API supports over 20 different price types for each quote and comes with basic search endpoints based on security identifiers and instrument names. Market coverage is included in the *Sample Use Cases* section below.  The Digital Portal use case is focused on high-performance applications that are  * serving millions of end-users, * accessible by client browsers via the internet, * supporting subscriptions for streamed updates out-of-the-box, * typically combining a wide variety of *for Digital Portals*-APIs into a highly use-case specific solution for customers, * integrated into complex infrastructures such as existing frontend frameworks, authentication services.  All APIs labelled *for Digital Portals* have been designed for direct use by client web applications and feature extreme low latency: The average response time across all endpoints is 30 ms whereas 99% of all requests are answered in close to under 300ms.  See the Time Series API for Digital Portals for direct access to price histories, and the News API for Digital Portals for searching and fetching related news.
 *
 * The version of the OpenAPI document: 2
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
using OpenAPIDateConverter = FactSet.SDK.QuotesAPIforDigitalPortals.Client.OpenAPIDateConverter;

namespace FactSet.SDK.QuotesAPIforDigitalPortals.Model
{
    /// <summary>
    /// Performance values.
    /// </summary>
    [DataContract(Name = "inline_response_200_72_data_performance")]
    public partial class InlineResponse20072DataPerformance : IEquatable<InlineResponse20072DataPerformance>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse20072DataPerformance" /> class.
        /// </summary>
        /// <param name="absolute">Absolute difference of a notation&#39;s most recent EOD closing price against the EOD closing price on the reference date..</param>
        /// <param name="relative">Difference of a notation&#39;s most recent EOD closing price against the EOD closing price on the reference date, relative to the EOD closing price on the reference date..</param>
        /// <param name="referencePrice">EOD closing price as of the reference date (see attribute &#x60;referenceDate&#x60;) used for calculation..</param>
        public InlineResponse20072DataPerformance(decimal absolute = default(decimal), decimal relative = default(decimal), decimal referencePrice = default(decimal))
        {
            this.Absolute = absolute;
            this.Relative = relative;
            this.ReferencePrice = referencePrice;
        }

        /// <summary>
        /// Absolute difference of a notation&#39;s most recent EOD closing price against the EOD closing price on the reference date.
        /// </summary>
        /// <value>Absolute difference of a notation&#39;s most recent EOD closing price against the EOD closing price on the reference date.</value>
        [DataMember(Name = "absolute", EmitDefaultValue = false)]
        public decimal Absolute { get; set; }

        /// <summary>
        /// Difference of a notation&#39;s most recent EOD closing price against the EOD closing price on the reference date, relative to the EOD closing price on the reference date.
        /// </summary>
        /// <value>Difference of a notation&#39;s most recent EOD closing price against the EOD closing price on the reference date, relative to the EOD closing price on the reference date.</value>
        [DataMember(Name = "relative", EmitDefaultValue = false)]
        public decimal Relative { get; set; }

        /// <summary>
        /// EOD closing price as of the reference date (see attribute &#x60;referenceDate&#x60;) used for calculation.
        /// </summary>
        /// <value>EOD closing price as of the reference date (see attribute &#x60;referenceDate&#x60;) used for calculation.</value>
        [DataMember(Name = "referencePrice", EmitDefaultValue = false)]
        public decimal ReferencePrice { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class InlineResponse20072DataPerformance {\n");
            sb.Append("  Absolute: ").Append(Absolute).Append("\n");
            sb.Append("  Relative: ").Append(Relative).Append("\n");
            sb.Append("  ReferencePrice: ").Append(ReferencePrice).Append("\n");
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
            return this.Equals(input as InlineResponse20072DataPerformance);
        }

        /// <summary>
        /// Returns true if InlineResponse20072DataPerformance instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse20072DataPerformance to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse20072DataPerformance input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Absolute == input.Absolute ||
                    this.Absolute.Equals(input.Absolute)
                ) && 
                (
                    this.Relative == input.Relative ||
                    this.Relative.Equals(input.Relative)
                ) && 
                (
                    this.ReferencePrice == input.ReferencePrice ||
                    this.ReferencePrice.Equals(input.ReferencePrice)
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
                hashCode = (hashCode * 59) + this.Absolute.GetHashCode();
                hashCode = (hashCode * 59) + this.Relative.GetHashCode();
                hashCode = (hashCode * 59) + this.ReferencePrice.GetHashCode();
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
