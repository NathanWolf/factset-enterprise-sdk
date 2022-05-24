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
    /// Details of a fractional currency.
    /// </summary>
    [DataContract(Name = "inline_response_200_28_data")]
    public partial class InlineResponse20028Data : IEquatable<InlineResponse20028Data>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse20028Data" /> class.
        /// </summary>
        /// <param name="code">Code of the fractional currency such as GBp (for British pence), USc (for U.S. cents), EUc for (Euro cent)..</param>
        /// <param name="name">Name of the fractional currency..</param>
        /// <param name="factor">Conversion factor between the fractional and its main currency. For example, the value 100 indicates that 100 US cents are equivalent to one US dollar..</param>
        /// <param name="mainCurrency">mainCurrency.</param>
        public InlineResponse20028Data(string code = default(string), string name = default(string), decimal factor = default(decimal), InlineResponse20028DataMainCurrency mainCurrency = default(InlineResponse20028DataMainCurrency))
        {
            this.Code = code;
            this.Name = name;
            this.Factor = factor;
            this.MainCurrency = mainCurrency;
        }

        /// <summary>
        /// Code of the fractional currency such as GBp (for British pence), USc (for U.S. cents), EUc for (Euro cent).
        /// </summary>
        /// <value>Code of the fractional currency such as GBp (for British pence), USc (for U.S. cents), EUc for (Euro cent).</value>
        [DataMember(Name = "code", EmitDefaultValue = false)]
        public string Code { get; set; }

        /// <summary>
        /// Name of the fractional currency.
        /// </summary>
        /// <value>Name of the fractional currency.</value>
        [DataMember(Name = "name", EmitDefaultValue = false)]
        public string Name { get; set; }

        /// <summary>
        /// Conversion factor between the fractional and its main currency. For example, the value 100 indicates that 100 US cents are equivalent to one US dollar.
        /// </summary>
        /// <value>Conversion factor between the fractional and its main currency. For example, the value 100 indicates that 100 US cents are equivalent to one US dollar.</value>
        [DataMember(Name = "factor", EmitDefaultValue = false)]
        public decimal Factor { get; set; }

        /// <summary>
        /// Gets or Sets MainCurrency
        /// </summary>
        [DataMember(Name = "mainCurrency", EmitDefaultValue = false)]
        public InlineResponse20028DataMainCurrency MainCurrency { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class InlineResponse20028Data {\n");
            sb.Append("  Code: ").Append(Code).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Factor: ").Append(Factor).Append("\n");
            sb.Append("  MainCurrency: ").Append(MainCurrency).Append("\n");
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
            return this.Equals(input as InlineResponse20028Data);
        }

        /// <summary>
        /// Returns true if InlineResponse20028Data instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse20028Data to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse20028Data input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Code == input.Code ||
                    (this.Code != null &&
                    this.Code.Equals(input.Code))
                ) && 
                (
                    this.Name == input.Name ||
                    (this.Name != null &&
                    this.Name.Equals(input.Name))
                ) && 
                (
                    this.Factor == input.Factor ||
                    this.Factor.Equals(input.Factor)
                ) && 
                (
                    this.MainCurrency == input.MainCurrency ||
                    (this.MainCurrency != null &&
                    this.MainCurrency.Equals(input.MainCurrency))
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
                if (this.Code != null)
                {
                    hashCode = (hashCode * 59) + this.Code.GetHashCode();
                }
                if (this.Name != null)
                {
                    hashCode = (hashCode * 59) + this.Name.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.Factor.GetHashCode();
                if (this.MainCurrency != null)
                {
                    hashCode = (hashCode * 59) + this.MainCurrency.GetHashCode();
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
