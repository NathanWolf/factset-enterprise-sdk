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
    /// InlineResponse20030Data
    /// </summary>
    [DataContract(Name = "inline_response_200_30_data")]
    public partial class InlineResponse20030Data : IEquatable<InlineResponse20030Data>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse20030Data" /> class.
        /// </summary>
        /// <param name="id">Identifier of a currency..</param>
        /// <param name="code">Code of the currency: If assigned, a code according to ISO 4217, otherwise a local code..</param>
        /// <param name="isoCode">ISO 4217 code of the currency..</param>
        /// <param name="name">Name of the currency..</param>
        /// <param name="active">Indicates whether the currency is active..</param>
        public InlineResponse20030Data(decimal id = default(decimal), string code = default(string), string isoCode = default(string), string name = default(string), bool active = default(bool))
        {
            this.Id = id;
            this.Code = code;
            this.IsoCode = isoCode;
            this.Name = name;
            this.Active = active;
        }

        /// <summary>
        /// Identifier of a currency.
        /// </summary>
        /// <value>Identifier of a currency.</value>
        [DataMember(Name = "id", EmitDefaultValue = false)]
        public decimal Id { get; set; }

        /// <summary>
        /// Code of the currency: If assigned, a code according to ISO 4217, otherwise a local code.
        /// </summary>
        /// <value>Code of the currency: If assigned, a code according to ISO 4217, otherwise a local code.</value>
        [DataMember(Name = "code", EmitDefaultValue = false)]
        public string Code { get; set; }

        /// <summary>
        /// ISO 4217 code of the currency.
        /// </summary>
        /// <value>ISO 4217 code of the currency.</value>
        [DataMember(Name = "isoCode", EmitDefaultValue = false)]
        public string IsoCode { get; set; }

        /// <summary>
        /// Name of the currency.
        /// </summary>
        /// <value>Name of the currency.</value>
        [DataMember(Name = "name", EmitDefaultValue = false)]
        public string Name { get; set; }

        /// <summary>
        /// Indicates whether the currency is active.
        /// </summary>
        /// <value>Indicates whether the currency is active.</value>
        [DataMember(Name = "active", EmitDefaultValue = true)]
        public bool Active { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class InlineResponse20030Data {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Code: ").Append(Code).Append("\n");
            sb.Append("  IsoCode: ").Append(IsoCode).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Active: ").Append(Active).Append("\n");
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
            return this.Equals(input as InlineResponse20030Data);
        }

        /// <summary>
        /// Returns true if InlineResponse20030Data instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse20030Data to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse20030Data input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Id == input.Id ||
                    this.Id.Equals(input.Id)
                ) && 
                (
                    this.Code == input.Code ||
                    (this.Code != null &&
                    this.Code.Equals(input.Code))
                ) && 
                (
                    this.IsoCode == input.IsoCode ||
                    (this.IsoCode != null &&
                    this.IsoCode.Equals(input.IsoCode))
                ) && 
                (
                    this.Name == input.Name ||
                    (this.Name != null &&
                    this.Name.Equals(input.Name))
                ) && 
                (
                    this.Active == input.Active ||
                    this.Active.Equals(input.Active)
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
                hashCode = (hashCode * 59) + this.Id.GetHashCode();
                if (this.Code != null)
                {
                    hashCode = (hashCode * 59) + this.Code.GetHashCode();
                }
                if (this.IsoCode != null)
                {
                    hashCode = (hashCode * 59) + this.IsoCode.GetHashCode();
                }
                if (this.Name != null)
                {
                    hashCode = (hashCode * 59) + this.Name.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.Active.GetHashCode();
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
