/*
 * Quotes API For Digital Portals
 *
 * The Quotes API combines endpoints for retrieving security end-of-day, delayed, and realtime prices with performance key figures and basic reference data on the security and market level.  The API supports over 20 different price types for each quote and comes with basic search endpoints based on security identifiers and instrument names. Market coverage is included in the *Sample Use Cases* section below.  The Digital Portal use case is focused on high-performance applications that are  * serving millions of end-users, * accessible by client browsers via the internet, * supporting subscriptions for streamed updates out-of-the-box, * typically combining a wide variety of *for Digital Portals*-APIs into a highly use-case specific solution for customers, * integrated into complex infrastructures such as existing frontend frameworks, authentication services.  All APIs labelled *for Digital Portals* have been designed for direct use by client web applications and feature extreme low latency: The average response time across all endpoints is 30 ms whereas 99% of all requests are answered in close to under 300ms.  See the [Time Series API for Digital Portals](https://developer.factset.com/api-catalog/time-series-api-digital-portals) for direct access to price histories, and the [News API for Digital Portals](https://developer.factset.com/api-catalog/news-api-digital-portals) for searching and fetching related news. 
 *
 * The version of the OpenAPI document: 3.0.0
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
using OpenAPIDateConverter = FactSet.SDK.RealTimeQuotes.Client.OpenAPIDateConverter;

namespace FactSet.SDK.RealTimeQuotes.Model
{
    /// <summary>
    /// Listing-level data with a list of notations. If the set of listing identifiers contains an element for which the attribute &#x60;isPrimary &#x3D; true&#x60;, then this element is the first one in the array.
    /// </summary>
    [DataContract(Name = "inline_response_200_75_data_regional_listing")]
    public partial class InlineResponse20075DataRegionalListing : IEquatable<InlineResponse20075DataRegionalListing>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse20075DataRegionalListing" /> class.
        /// </summary>
        /// <param name="isPrimary">Indicates whether the listing identifier is the one for the primary listing among all listings with the same regional identifier (&#x60;true&#x60;) or not (&#x60;false&#x60;)..</param>
        /// <param name="permanentIdentifier">FactSet Permanent Identifier for a notation. The format is six alpha numeric characters, excluding vowels, with an L suffix (XXXXXX-L)..</param>
        /// <param name="tickerExchange">FactSet market symbol of the notation, usually consisting of the ticker (e.g. \&quot;FDS\&quot; for FactSet Research Systems Inc.) and the three-character code of the exchange on which the listing is traded (example: FDS-NYS)..</param>
        public InlineResponse20075DataRegionalListing(bool? isPrimary = default(bool?), string permanentIdentifier = default(string), string tickerExchange = default(string))
        {
            this.IsPrimary = isPrimary;
            this.PermanentIdentifier = permanentIdentifier;
            this.TickerExchange = tickerExchange;
        }

        /// <summary>
        /// Indicates whether the listing identifier is the one for the primary listing among all listings with the same regional identifier (&#x60;true&#x60;) or not (&#x60;false&#x60;).
        /// </summary>
        /// <value>Indicates whether the listing identifier is the one for the primary listing among all listings with the same regional identifier (&#x60;true&#x60;) or not (&#x60;false&#x60;).</value>
        [DataMember(Name = "isPrimary", EmitDefaultValue = true)]
        public bool? IsPrimary { get; set; }

        /// <summary>
        /// FactSet Permanent Identifier for a notation. The format is six alpha numeric characters, excluding vowels, with an L suffix (XXXXXX-L).
        /// </summary>
        /// <value>FactSet Permanent Identifier for a notation. The format is six alpha numeric characters, excluding vowels, with an L suffix (XXXXXX-L).</value>
        [DataMember(Name = "permanentIdentifier", EmitDefaultValue = true)]
        public string PermanentIdentifier { get; set; }

        /// <summary>
        /// FactSet market symbol of the notation, usually consisting of the ticker (e.g. \&quot;FDS\&quot; for FactSet Research Systems Inc.) and the three-character code of the exchange on which the listing is traded (example: FDS-NYS).
        /// </summary>
        /// <value>FactSet market symbol of the notation, usually consisting of the ticker (e.g. \&quot;FDS\&quot; for FactSet Research Systems Inc.) and the three-character code of the exchange on which the listing is traded (example: FDS-NYS).</value>
        [DataMember(Name = "tickerExchange", EmitDefaultValue = true)]
        public string TickerExchange { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class InlineResponse20075DataRegionalListing {\n");
            sb.Append("  IsPrimary: ").Append(IsPrimary).Append("\n");
            sb.Append("  PermanentIdentifier: ").Append(PermanentIdentifier).Append("\n");
            sb.Append("  TickerExchange: ").Append(TickerExchange).Append("\n");
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
            return this.Equals(input as InlineResponse20075DataRegionalListing);
        }

        /// <summary>
        /// Returns true if InlineResponse20075DataRegionalListing instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse20075DataRegionalListing to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse20075DataRegionalListing input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.IsPrimary == input.IsPrimary ||
                    (this.IsPrimary != null &&
                    this.IsPrimary.Equals(input.IsPrimary))
                ) && 
                (
                    this.PermanentIdentifier == input.PermanentIdentifier ||
                    (this.PermanentIdentifier != null &&
                    this.PermanentIdentifier.Equals(input.PermanentIdentifier))
                ) && 
                (
                    this.TickerExchange == input.TickerExchange ||
                    (this.TickerExchange != null &&
                    this.TickerExchange.Equals(input.TickerExchange))
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
                if (this.IsPrimary != null)
                {
                    hashCode = (hashCode * 59) + this.IsPrimary.GetHashCode();
                }
                if (this.PermanentIdentifier != null)
                {
                    hashCode = (hashCode * 59) + this.PermanentIdentifier.GetHashCode();
                }
                if (this.TickerExchange != null)
                {
                    hashCode = (hashCode * 59) + this.TickerExchange.GetHashCode();
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
