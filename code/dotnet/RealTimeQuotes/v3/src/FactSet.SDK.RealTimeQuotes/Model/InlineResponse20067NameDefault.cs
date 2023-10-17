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
    /// Default instrument names. Sorting does not require an asset class selection, see parameter &#x60;assetClass.ids&#x60;.
    /// </summary>
    [DataContract(Name = "inline_response_200_67_name_default")]
    public partial class InlineResponse20067NameDefault : IEquatable<InlineResponse20067NameDefault>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse20067NameDefault" /> class.
        /// </summary>
        /// <param name="_long">Long name..</param>
        /// <param name="_short">Short name..</param>
        public InlineResponse20067NameDefault(string _long = default(string), string _short = default(string))
        {
            this.Long = _long;
            this.Short = _short;
        }

        /// <summary>
        /// Long name.
        /// </summary>
        /// <value>Long name.</value>
        [DataMember(Name = "long", EmitDefaultValue = true)]
        public string Long { get; set; }

        /// <summary>
        /// Short name.
        /// </summary>
        /// <value>Short name.</value>
        [DataMember(Name = "short", EmitDefaultValue = true)]
        public string Short { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class InlineResponse20067NameDefault {\n");
            sb.Append("  Long: ").Append(Long).Append("\n");
            sb.Append("  Short: ").Append(Short).Append("\n");
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
            return this.Equals(input as InlineResponse20067NameDefault);
        }

        /// <summary>
        /// Returns true if InlineResponse20067NameDefault instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse20067NameDefault to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse20067NameDefault input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Long == input.Long ||
                    (this.Long != null &&
                    this.Long.Equals(input.Long))
                ) && 
                (
                    this.Short == input.Short ||
                    (this.Short != null &&
                    this.Short.Equals(input.Short))
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
                if (this.Long != null)
                {
                    hashCode = (hashCode * 59) + this.Long.GetHashCode();
                }
                if (this.Short != null)
                {
                    hashCode = (hashCode * 59) + this.Short.GetHashCode();
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
