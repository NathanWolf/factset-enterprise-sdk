/*
 * Prime Developer Trial
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1
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
using OpenAPIDateConverter = FactSet.SDK.NewsAPIforDigitalPortals.Client.OpenAPIDateConverter;

namespace FactSet.SDK.NewsAPIforDigitalPortals.Model
{
    /// <summary>
    /// Restrict the response of news articles to given include and exclude text criteria.
    /// </summary>
    [DataContract(Name = "_news_article_searchByText_data_text")]
    public partial class NewsArticleSearchByTextDataText : IEquatable<NewsArticleSearchByTextDataText>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="NewsArticleSearchByTextDataText" /> class.
        /// </summary>
        /// <param name="criteria">criteria.</param>
        public NewsArticleSearchByTextDataText(NewsArticleSearchByTextDataTextCriteria criteria = default(NewsArticleSearchByTextDataTextCriteria))
        {
            this.Criteria = criteria;
        }

        /// <summary>
        /// Gets or Sets Criteria
        /// </summary>
        [DataMember(Name = "criteria", EmitDefaultValue = false)]
        public NewsArticleSearchByTextDataTextCriteria Criteria { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class NewsArticleSearchByTextDataText {\n");
            sb.Append("  Criteria: ").Append(Criteria).Append("\n");
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
            return this.Equals(input as NewsArticleSearchByTextDataText);
        }

        /// <summary>
        /// Returns true if NewsArticleSearchByTextDataText instances are equal
        /// </summary>
        /// <param name="input">Instance of NewsArticleSearchByTextDataText to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(NewsArticleSearchByTextDataText input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Criteria == input.Criteria ||
                    (this.Criteria != null &&
                    this.Criteria.Equals(input.Criteria))
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
                if (this.Criteria != null)
                    hashCode = hashCode * 59 + this.Criteria.GetHashCode();
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
