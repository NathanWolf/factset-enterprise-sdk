/*
 * FactSet Search Answers API
 *
 * The FactSet Search Answers API provides answers to search queries, reflecting the data shown within FactSet Search Answers, and allowing you to easily add financial data to your widgets, lookups, bots, and assistants. The API understands a fixed amount of search terms and returns structured data from FactSet’s many data sources. Possible answers include Price of a Company, Top 10 Year-to-Date Gainers, Revenue per Passenger Mile, and many more.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: FactSearch.Team@factset.com
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
using OpenAPIDateConverter = FactSet.SDK.FactSetSearchAnswers.Client.OpenAPIDateConverter;

namespace FactSet.SDK.FactSetSearchAnswers.Model
{
    /// <summary>
    /// NoAnswersFoundAllOf
    /// </summary>
    [DataContract(Name = "NoAnswersFound_allOf")]
    public partial class NoAnswersFoundAllOf : IEquatable<NoAnswersFoundAllOf>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="NoAnswersFoundAllOf" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected NoAnswersFoundAllOf() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="NoAnswersFoundAllOf" /> class.
        /// </summary>
        /// <param name="message">message (required).</param>
        /// <param name="querySuggestions">querySuggestions (required).</param>
        public NoAnswersFoundAllOf(string message = default(string), List<string> querySuggestions = default(List<string>))
        {
            // to ensure "message" is required (not null)
            if (message == null) {
                throw new ArgumentNullException("message is a required property for NoAnswersFoundAllOf and cannot be null");
            }
            this.Message = message;
            // to ensure "querySuggestions" is required (not null)
            if (querySuggestions == null) {
                throw new ArgumentNullException("querySuggestions is a required property for NoAnswersFoundAllOf and cannot be null");
            }
            this.QuerySuggestions = querySuggestions;
        }

        /// <summary>
        /// Gets or Sets Message
        /// </summary>
        [DataMember(Name = "message", IsRequired = true, EmitDefaultValue = false)]
        public string Message { get; set; }

        /// <summary>
        /// Gets or Sets QuerySuggestions
        /// </summary>
        [DataMember(Name = "querySuggestions", IsRequired = true, EmitDefaultValue = false)]
        public List<string> QuerySuggestions { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class NoAnswersFoundAllOf {\n");
            sb.Append("  Message: ").Append(Message).Append("\n");
            sb.Append("  QuerySuggestions: ").Append(QuerySuggestions).Append("\n");
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
            return this.Equals(input as NoAnswersFoundAllOf);
        }

        /// <summary>
        /// Returns true if NoAnswersFoundAllOf instances are equal
        /// </summary>
        /// <param name="input">Instance of NoAnswersFoundAllOf to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(NoAnswersFoundAllOf input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Message == input.Message ||
                    (this.Message != null &&
                    this.Message.Equals(input.Message))
                ) && 
                (
                    this.QuerySuggestions == input.QuerySuggestions ||
                    this.QuerySuggestions != null &&
                    input.QuerySuggestions != null &&
                    this.QuerySuggestions.SequenceEqual(input.QuerySuggestions)
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
                if (this.Message != null)
                {
                    hashCode = (hashCode * 59) + this.Message.GetHashCode();
                }
                if (this.QuerySuggestions != null)
                {
                    hashCode = (hashCode * 59) + this.QuerySuggestions.GetHashCode();
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
