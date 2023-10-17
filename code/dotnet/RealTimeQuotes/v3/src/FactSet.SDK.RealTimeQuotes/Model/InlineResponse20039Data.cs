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
    /// Details of the category system.
    /// </summary>
    [DataContract(Name = "inline_response_200_39_data")]
    public partial class InlineResponse20039Data : IEquatable<InlineResponse20039Data>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse20039Data" /> class.
        /// </summary>
        /// <param name="id">Identifier of the category system..</param>
        /// <param name="name">Name of the category system..</param>
        /// <param name="type">type.</param>
        /// <param name="numberOfLevels">Number of levels of the category system..</param>
        /// <param name="firstLevelWithLeafCategories">Number of the least detailed level of the category system that has leaf categories..</param>
        /// <param name="levels">List of category levels ordered by the number of the level in ascending order..</param>
        public InlineResponse20039Data(decimal? id = default(decimal?), string name = default(string), InlineResponse20039DataType type = default(InlineResponse20039DataType), decimal? numberOfLevels = default(decimal?), decimal? firstLevelWithLeafCategories = default(decimal?), List<InlineResponse20039DataLevels> levels = default(List<InlineResponse20039DataLevels>))
        {
            this.Id = id;
            this.Name = name;
            this.Type = type;
            this.NumberOfLevels = numberOfLevels;
            this.FirstLevelWithLeafCategories = firstLevelWithLeafCategories;
            this.Levels = levels;
        }

        /// <summary>
        /// Identifier of the category system.
        /// </summary>
        /// <value>Identifier of the category system.</value>
        [DataMember(Name = "id", EmitDefaultValue = true)]
        public decimal? Id { get; set; }

        /// <summary>
        /// Name of the category system.
        /// </summary>
        /// <value>Name of the category system.</value>
        [DataMember(Name = "name", EmitDefaultValue = true)]
        public string Name { get; set; }

        /// <summary>
        /// Gets or Sets Type
        /// </summary>
        [DataMember(Name = "type", EmitDefaultValue = false)]
        public InlineResponse20039DataType Type { get; set; }

        /// <summary>
        /// Number of levels of the category system.
        /// </summary>
        /// <value>Number of levels of the category system.</value>
        [DataMember(Name = "numberOfLevels", EmitDefaultValue = true)]
        public decimal? NumberOfLevels { get; set; }

        /// <summary>
        /// Number of the least detailed level of the category system that has leaf categories.
        /// </summary>
        /// <value>Number of the least detailed level of the category system that has leaf categories.</value>
        [DataMember(Name = "firstLevelWithLeafCategories", EmitDefaultValue = true)]
        public decimal? FirstLevelWithLeafCategories { get; set; }

        /// <summary>
        /// List of category levels ordered by the number of the level in ascending order.
        /// </summary>
        /// <value>List of category levels ordered by the number of the level in ascending order.</value>
        [DataMember(Name = "levels", EmitDefaultValue = false)]
        public List<InlineResponse20039DataLevels> Levels { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class InlineResponse20039Data {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
            sb.Append("  NumberOfLevels: ").Append(NumberOfLevels).Append("\n");
            sb.Append("  FirstLevelWithLeafCategories: ").Append(FirstLevelWithLeafCategories).Append("\n");
            sb.Append("  Levels: ").Append(Levels).Append("\n");
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
            return this.Equals(input as InlineResponse20039Data);
        }

        /// <summary>
        /// Returns true if InlineResponse20039Data instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse20039Data to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse20039Data input)
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
                    this.Type == input.Type ||
                    (this.Type != null &&
                    this.Type.Equals(input.Type))
                ) && 
                (
                    this.NumberOfLevels == input.NumberOfLevels ||
                    (this.NumberOfLevels != null &&
                    this.NumberOfLevels.Equals(input.NumberOfLevels))
                ) && 
                (
                    this.FirstLevelWithLeafCategories == input.FirstLevelWithLeafCategories ||
                    (this.FirstLevelWithLeafCategories != null &&
                    this.FirstLevelWithLeafCategories.Equals(input.FirstLevelWithLeafCategories))
                ) && 
                (
                    this.Levels == input.Levels ||
                    this.Levels != null &&
                    input.Levels != null &&
                    this.Levels.SequenceEqual(input.Levels)
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
                if (this.Type != null)
                {
                    hashCode = (hashCode * 59) + this.Type.GetHashCode();
                }
                if (this.NumberOfLevels != null)
                {
                    hashCode = (hashCode * 59) + this.NumberOfLevels.GetHashCode();
                }
                if (this.FirstLevelWithLeafCategories != null)
                {
                    hashCode = (hashCode * 59) + this.FirstLevelWithLeafCategories.GetHashCode();
                }
                if (this.Levels != null)
                {
                    hashCode = (hashCode * 59) + this.Levels.GetHashCode();
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
