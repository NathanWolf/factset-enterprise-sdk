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
    [DataContract(Name = "PostNotationCrossReferenceFactSetIdentifierListByFactSetIdentifierRequest_data")]
    public partial class PostNotationCrossReferenceFactSetIdentifierListByFactSetIdentifierRequestData : IEquatable<PostNotationCrossReferenceFactSetIdentifierListByFactSetIdentifierRequestData>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="PostNotationCrossReferenceFactSetIdentifierListByFactSetIdentifierRequestData" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected PostNotationCrossReferenceFactSetIdentifierListByFactSetIdentifierRequestData() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="PostNotationCrossReferenceFactSetIdentifierListByFactSetIdentifierRequestData" /> class.
        /// </summary>
        /// <param name="symbologyIdentifier">FactSet Symbology Identifier. See the endpoint description for valid FactSet Symbology Identifier types. (required).</param>
        public PostNotationCrossReferenceFactSetIdentifierListByFactSetIdentifierRequestData(string symbologyIdentifier)
        {
            // to ensure "symbologyIdentifier" is required (not null)
            if (symbologyIdentifier == null) {
                throw new ArgumentNullException("symbologyIdentifier is a required property for PostNotationCrossReferenceFactSetIdentifierListByFactSetIdentifierRequestData and cannot be null");
            }
            this.SymbologyIdentifier = symbologyIdentifier;
        }

        /// <summary>
        /// FactSet Symbology Identifier. See the endpoint description for valid FactSet Symbology Identifier types.
        /// </summary>
        /// <value>FactSet Symbology Identifier. See the endpoint description for valid FactSet Symbology Identifier types.</value>
        [DataMember(Name = "symbologyIdentifier", IsRequired = true, EmitDefaultValue = false)]
        public string SymbologyIdentifier { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class PostNotationCrossReferenceFactSetIdentifierListByFactSetIdentifierRequestData {\n");
            sb.Append("  SymbologyIdentifier: ").Append(SymbologyIdentifier).Append("\n");
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
            return this.Equals(input as PostNotationCrossReferenceFactSetIdentifierListByFactSetIdentifierRequestData);
        }

        /// <summary>
        /// Returns true if PostNotationCrossReferenceFactSetIdentifierListByFactSetIdentifierRequestData instances are equal
        /// </summary>
        /// <param name="input">Instance of PostNotationCrossReferenceFactSetIdentifierListByFactSetIdentifierRequestData to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PostNotationCrossReferenceFactSetIdentifierListByFactSetIdentifierRequestData input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.SymbologyIdentifier == input.SymbologyIdentifier ||
                    (this.SymbologyIdentifier != null &&
                    this.SymbologyIdentifier.Equals(input.SymbologyIdentifier))
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
                if (this.SymbologyIdentifier != null)
                {
                    hashCode = (hashCode * 59) + this.SymbologyIdentifier.GetHashCode();
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
            // SymbologyIdentifier (string) maxLength
            if (this.SymbologyIdentifier != null && this.SymbologyIdentifier.Length > 50)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for SymbologyIdentifier, length must be less than 50.", new [] { "SymbologyIdentifier" });
            }

            // SymbologyIdentifier (string) minLength
            if (this.SymbologyIdentifier != null && this.SymbologyIdentifier.Length < 4)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for SymbologyIdentifier, length must be greater than 4.", new [] { "SymbologyIdentifier" });
            }

            // SymbologyIdentifier (string) pattern
            Regex regexSymbologyIdentifier = new Regex(@"^[B-DF-HJ-NP-TV-Z0-9]{6}-[SLR]$|[A-Z0-9.#&*+]{1,47}-[A-Z0-9]{2,4}$", RegexOptions.CultureInvariant);
            if (false == regexSymbologyIdentifier.Match(this.SymbologyIdentifier).Success)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for SymbologyIdentifier, must match a pattern of " + regexSymbologyIdentifier, new [] { "SymbologyIdentifier" });
            }

            yield break;
        }
    }

}
