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
    /// InlineResponse20082Data
    /// </summary>
    [DataContract(Name = "inline_response_200_82_data")]
    public partial class InlineResponse20082Data : IEquatable<InlineResponse20082Data>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse20082Data" /> class.
        /// </summary>
        /// <param name="id">Identifier of a market..</param>
        /// <param name="name">Name of the market..</param>
        /// <param name="shortName">Short name of the market..</param>
        /// <param name="country">country.</param>
        /// <param name="type">type.</param>
        /// <param name="group">group.</param>
        /// <param name="timezone">timezone.</param>
        /// <param name="count">Number of entitled notations..</param>
        public InlineResponse20082Data(decimal? id = default(decimal?), string name = default(string), string shortName = default(string), InlineResponse20082Country country = default(InlineResponse20082Country), InlineResponse20082Type type = default(InlineResponse20082Type), InlineResponse20082Group group = default(InlineResponse20082Group), InlineResponse20082Timezone timezone = default(InlineResponse20082Timezone), decimal? count = default(decimal?))
        {
            this.Id = id;
            this.Name = name;
            this.ShortName = shortName;
            this.Country = country;
            this.Type = type;
            this.Group = group;
            this.Timezone = timezone;
            this.Count = count;
        }

        /// <summary>
        /// Identifier of a market.
        /// </summary>
        /// <value>Identifier of a market.</value>
        [DataMember(Name = "id", EmitDefaultValue = true)]
        public decimal? Id { get; set; }

        /// <summary>
        /// Name of the market.
        /// </summary>
        /// <value>Name of the market.</value>
        [DataMember(Name = "name", EmitDefaultValue = true)]
        public string Name { get; set; }

        /// <summary>
        /// Short name of the market.
        /// </summary>
        /// <value>Short name of the market.</value>
        [DataMember(Name = "shortName", EmitDefaultValue = true)]
        public string ShortName { get; set; }

        /// <summary>
        /// Gets or Sets Country
        /// </summary>
        [DataMember(Name = "country", EmitDefaultValue = false)]
        public InlineResponse20082Country Country { get; set; }

        /// <summary>
        /// Gets or Sets Type
        /// </summary>
        [DataMember(Name = "type", EmitDefaultValue = false)]
        public InlineResponse20082Type Type { get; set; }

        /// <summary>
        /// Gets or Sets Group
        /// </summary>
        [DataMember(Name = "group", EmitDefaultValue = false)]
        public InlineResponse20082Group Group { get; set; }

        /// <summary>
        /// Gets or Sets Timezone
        /// </summary>
        [DataMember(Name = "timezone", EmitDefaultValue = false)]
        public InlineResponse20082Timezone Timezone { get; set; }

        /// <summary>
        /// Number of entitled notations.
        /// </summary>
        /// <value>Number of entitled notations.</value>
        [DataMember(Name = "count", EmitDefaultValue = true)]
        public decimal? Count { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class InlineResponse20082Data {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  ShortName: ").Append(ShortName).Append("\n");
            sb.Append("  Country: ").Append(Country).Append("\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
            sb.Append("  Group: ").Append(Group).Append("\n");
            sb.Append("  Timezone: ").Append(Timezone).Append("\n");
            sb.Append("  Count: ").Append(Count).Append("\n");
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
            return this.Equals(input as InlineResponse20082Data);
        }

        /// <summary>
        /// Returns true if InlineResponse20082Data instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse20082Data to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse20082Data input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Id == input.Id ||
                    (this.Id != null &&
                    this.Id.Equals(input.Id))
                ) && 
                (
                    this.Name == input.Name ||
                    (this.Name != null &&
                    this.Name.Equals(input.Name))
                ) && 
                (
                    this.ShortName == input.ShortName ||
                    (this.ShortName != null &&
                    this.ShortName.Equals(input.ShortName))
                ) && 
                (
                    this.Country == input.Country ||
                    (this.Country != null &&
                    this.Country.Equals(input.Country))
                ) && 
                (
                    this.Type == input.Type ||
                    (this.Type != null &&
                    this.Type.Equals(input.Type))
                ) && 
                (
                    this.Group == input.Group ||
                    (this.Group != null &&
                    this.Group.Equals(input.Group))
                ) && 
                (
                    this.Timezone == input.Timezone ||
                    (this.Timezone != null &&
                    this.Timezone.Equals(input.Timezone))
                ) && 
                (
                    this.Count == input.Count ||
                    (this.Count != null &&
                    this.Count.Equals(input.Count))
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
                if (this.Id != null)
                {
                    hashCode = (hashCode * 59) + this.Id.GetHashCode();
                }
                if (this.Name != null)
                {
                    hashCode = (hashCode * 59) + this.Name.GetHashCode();
                }
                if (this.ShortName != null)
                {
                    hashCode = (hashCode * 59) + this.ShortName.GetHashCode();
                }
                if (this.Country != null)
                {
                    hashCode = (hashCode * 59) + this.Country.GetHashCode();
                }
                if (this.Type != null)
                {
                    hashCode = (hashCode * 59) + this.Type.GetHashCode();
                }
                if (this.Group != null)
                {
                    hashCode = (hashCode * 59) + this.Group.GetHashCode();
                }
                if (this.Timezone != null)
                {
                    hashCode = (hashCode * 59) + this.Timezone.GetHashCode();
                }
                if (this.Count != null)
                {
                    hashCode = (hashCode * 59) + this.Count.GetHashCode();
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
