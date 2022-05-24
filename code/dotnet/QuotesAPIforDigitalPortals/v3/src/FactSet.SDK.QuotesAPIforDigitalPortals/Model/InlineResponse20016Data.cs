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
    /// InlineResponse20016Data
    /// </summary>
    [DataContract(Name = "inline_response_200_16_data")]
    public partial class InlineResponse20016Data : IEquatable<InlineResponse20016Data>, IValidatableObject
    {
        /// <summary>
        /// Type of the region.
        /// </summary>
        /// <value>Type of the region.</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum TypeEnum
        {
            /// <summary>
            /// Enum Continent for value: continent
            /// </summary>
            [EnumMember(Value = "continent")]
            Continent = 1,

            /// <summary>
            /// Enum Country for value: country
            /// </summary>
            [EnumMember(Value = "country")]
            Country = 2,

            /// <summary>
            /// Enum Subdivision for value: subdivision
            /// </summary>
            [EnumMember(Value = "subdivision")]
            Subdivision = 3,

            /// <summary>
            /// Enum Misc for value: misc
            /// </summary>
            [EnumMember(Value = "misc")]
            Misc = 4,

            /// <summary>
            /// Enum Compound for value: compound
            /// </summary>
            [EnumMember(Value = "compound")]
            Compound = 5

        }


        /// <summary>
        /// Type of the region.
        /// </summary>
        /// <value>Type of the region.</value>
        [DataMember(Name = "type", EmitDefaultValue = false)]
        public TypeEnum? Type { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse20016Data" /> class.
        /// </summary>
        /// <param name="id">Identifier of a region..</param>
        /// <param name="code">ISO 3166-1 alpha-2 code of the country. This attribute is set for each country, may be set for miscellaneous regions and is empty for regions of other types..</param>
        /// <param name="name">Name of the region..</param>
        /// <param name="type">Type of the region..</param>
        public InlineResponse20016Data(decimal id = default(decimal), string code = default(string), string name = default(string), TypeEnum? type = default(TypeEnum?))
        {
            this.Id = id;
            this.Code = code;
            this.Name = name;
            this.Type = type;
        }

        /// <summary>
        /// Identifier of a region.
        /// </summary>
        /// <value>Identifier of a region.</value>
        [DataMember(Name = "id", EmitDefaultValue = false)]
        public decimal Id { get; set; }

        /// <summary>
        /// ISO 3166-1 alpha-2 code of the country. This attribute is set for each country, may be set for miscellaneous regions and is empty for regions of other types.
        /// </summary>
        /// <value>ISO 3166-1 alpha-2 code of the country. This attribute is set for each country, may be set for miscellaneous regions and is empty for regions of other types.</value>
        [DataMember(Name = "code", EmitDefaultValue = false)]
        public string Code { get; set; }

        /// <summary>
        /// Name of the region.
        /// </summary>
        /// <value>Name of the region.</value>
        [DataMember(Name = "name", EmitDefaultValue = false)]
        public string Name { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class InlineResponse20016Data {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Code: ").Append(Code).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
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
            return this.Equals(input as InlineResponse20016Data);
        }

        /// <summary>
        /// Returns true if InlineResponse20016Data instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse20016Data to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse20016Data input)
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
                    this.Name == input.Name ||
                    (this.Name != null &&
                    this.Name.Equals(input.Name))
                ) && 
                (
                    this.Type == input.Type ||
                    this.Type.Equals(input.Type)
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
                if (this.Name != null)
                {
                    hashCode = (hashCode * 59) + this.Name.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.Type.GetHashCode();
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
