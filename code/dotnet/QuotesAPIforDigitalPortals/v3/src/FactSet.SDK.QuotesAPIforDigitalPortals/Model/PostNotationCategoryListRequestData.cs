/*
 * Quotes API For Digital Portals
 *
 * The Quotes API combines endpoints for retrieving security end-of-day, delayed, and realtime prices with performance key figures and basic reference data on the security and market level.  The API supports over 20 different price types for each quote and comes with basic search endpoints based on security identifiers and instrument names. Market coverage is included in the *Sample Use Cases* section below.  The Digital Portal use case is focused on high-performance applications that are  * serving millions of end-users, * accessible by client browsers via the internet, * supporting subscriptions for streamed updates out-of-the-box, * typically combining a wide variety of *for Digital Portals*-APIs into a highly use-case specific solution for customers, * integrated into complex infrastructures such as existing frontend frameworks, authentication services.  All APIs labelled *for Digital Portals* have been designed for direct use by client web applications and feature extreme low latency: The average response time across all endpoints is 30 ms whereas 99% of all requests are answered in close to under 300ms.  See the [Time Series API for Digital Portals](https://developer.factset.com/api-catalog/time-series-api-digital-portals) for direct access to price histories, and the [News API for Digital Portals](https://developer.factset.com/api-catalog/news-api-digital-portals) for searching and fetching related news. 
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
    /// The data member contains the request&#39;s primary data.
    /// </summary>
    [DataContract(Name = "PostNotationCategoryListRequest_data")]
    public partial class PostNotationCategoryListRequestData : IEquatable<PostNotationCategoryListRequestData>, IValidatableObject
    {
        /// <summary>
        /// Type of the identifier.
        /// </summary>
        /// <value>Type of the identifier.</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum IdentifierTypeEnum
        {
            /// <summary>
            /// Enum IdNotation for value: idNotation
            /// </summary>
            [EnumMember(Value = "idNotation")]
            IdNotation = 1,

            /// <summary>
            /// Enum TickerExchange for value: tickerExchange
            /// </summary>
            [EnumMember(Value = "tickerExchange")]
            TickerExchange = 2,

            /// <summary>
            /// Enum TickerRegion for value: tickerRegion
            /// </summary>
            [EnumMember(Value = "tickerRegion")]
            TickerRegion = 3,

            /// <summary>
            /// Enum FdsPermanentIdentifierListing for value: fdsPermanentIdentifierListing
            /// </summary>
            [EnumMember(Value = "fdsPermanentIdentifierListing")]
            FdsPermanentIdentifierListing = 4,

            /// <summary>
            /// Enum FdsPermanentIdentifierRegional for value: fdsPermanentIdentifierRegional
            /// </summary>
            [EnumMember(Value = "fdsPermanentIdentifierRegional")]
            FdsPermanentIdentifierRegional = 5

        }


        /// <summary>
        /// Type of the identifier.
        /// </summary>
        /// <value>Type of the identifier.</value>
        [DataMember(Name = "identifierType", IsRequired = true, EmitDefaultValue = false)]
        public IdentifierTypeEnum IdentifierType { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="PostNotationCategoryListRequestData" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected PostNotationCategoryListRequestData() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="PostNotationCategoryListRequestData" /> class.
        /// </summary>
        /// <param name="identifier">Identifier to resolve. (required).</param>
        /// <param name="identifierType">Type of the identifier. (required).</param>
        /// <param name="filter">filter.</param>
        public PostNotationCategoryListRequestData(string identifier, IdentifierTypeEnum identifierType,PostNotationCategoryListRequestDataFilter filter = default(PostNotationCategoryListRequestDataFilter))
        {
            // to ensure "identifier" is required (not null)
            if (identifier == null) {
                throw new ArgumentNullException("identifier is a required property for PostNotationCategoryListRequestData and cannot be null");
            }
            this.Identifier = identifier;
            this.IdentifierType = identifierType;
            this.Filter = filter;
        }

        /// <summary>
        /// Identifier to resolve.
        /// </summary>
        /// <value>Identifier to resolve.</value>
        [DataMember(Name = "identifier", IsRequired = true, EmitDefaultValue = false)]
        public string Identifier { get; set; }

        /// <summary>
        /// Gets or Sets Filter
        /// </summary>
        [DataMember(Name = "filter", EmitDefaultValue = false)]
        public PostNotationCategoryListRequestDataFilter Filter { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class PostNotationCategoryListRequestData {\n");
            sb.Append("  Identifier: ").Append(Identifier).Append("\n");
            sb.Append("  IdentifierType: ").Append(IdentifierType).Append("\n");
            sb.Append("  Filter: ").Append(Filter).Append("\n");
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
            return this.Equals(input as PostNotationCategoryListRequestData);
        }

        /// <summary>
        /// Returns true if PostNotationCategoryListRequestData instances are equal
        /// </summary>
        /// <param name="input">Instance of PostNotationCategoryListRequestData to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PostNotationCategoryListRequestData input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Identifier == input.Identifier ||
                    (this.Identifier != null &&
                    this.Identifier.Equals(input.Identifier))
                ) && 
                (
                    this.IdentifierType == input.IdentifierType ||
                    this.IdentifierType.Equals(input.IdentifierType)
                ) && 
                (
                    this.Filter == input.Filter ||
                    (this.Filter != null &&
                    this.Filter.Equals(input.Filter))
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
                if (this.Identifier != null)
                {
                    hashCode = (hashCode * 59) + this.Identifier.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.IdentifierType.GetHashCode();
                if (this.Filter != null)
                {
                    hashCode = (hashCode * 59) + this.Filter.GetHashCode();
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
            // Identifier (string) maxLength
            if (this.Identifier != null && this.Identifier.Length > 50)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for Identifier, length must be less than 50.", new [] { "Identifier" });
            }

            // Identifier (string) minLength
            if (this.Identifier != null && this.Identifier.Length < 3)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for Identifier, length must be greater than 3.", new [] { "Identifier" });
            }

            // Identifier (string) pattern
            Regex regexIdentifier = new Regex(@"^[B-DF-HJ-NP-TV-Z0-9]{6}-[LR]$|^[A-Z0-9.#&*+]{1,47}-[A-Z0-9]{2,4}$|^[0-9]{3,20}$", RegexOptions.CultureInvariant);
            if (false == regexIdentifier.Match(this.Identifier).Success)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for Identifier, must match a pattern of " + regexIdentifier, new [] { "Identifier" });
            }

            yield break;
        }
    }

}
