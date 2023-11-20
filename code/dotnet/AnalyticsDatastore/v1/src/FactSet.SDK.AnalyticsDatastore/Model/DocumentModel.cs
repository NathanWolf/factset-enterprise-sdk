/*
 * Analytics Datastore  API
 *
 * Allow clients to fetch precalculated Analytics through predeterministic URLs.
 *
 * The version of the OpenAPI document: 1.0.0
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
using OpenAPIDateConverter = FactSet.SDK.AnalyticsDatastore.Client.OpenAPIDateConverter;

namespace FactSet.SDK.AnalyticsDatastore.Model
{
    /// <summary>
    /// Document model
    /// </summary>
    [DataContract(Name = "DocumentModel")]
    public partial class DocumentModel : IEquatable<DocumentModel>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="DocumentModel" /> class.
        /// </summary>
        /// <param name="url">The resolved URL pointing to the location of the underlying report.</param>
        /// <param name="productType">string property to denote what Product created this document..</param>
        /// <param name="tags">The documents tags, represented in a key value format with the tag name as the key; and the tag&#39;s value as the value.</param>
        public DocumentModel(string url = default(string), string productType = default(string), Dictionary<string, StringOrNumberTagValue> tags = default(Dictionary<string, StringOrNumberTagValue>))
        {
            this.Url = url;
            this.ProductType = productType;
            this.Tags = tags;
        }

        /// <summary>
        /// The resolved URL pointing to the location of the underlying report
        /// </summary>
        /// <value>The resolved URL pointing to the location of the underlying report</value>
        [DataMember(Name = "url", EmitDefaultValue = false)]
        public string Url { get; set; }

        /// <summary>
        /// string property to denote what Product created this document.
        /// </summary>
        /// <value>string property to denote what Product created this document.</value>
        [DataMember(Name = "productType", EmitDefaultValue = false)]
        public string ProductType { get; set; }

        /// <summary>
        /// The documents tags, represented in a key value format with the tag name as the key; and the tag&#39;s value as the value
        /// </summary>
        /// <value>The documents tags, represented in a key value format with the tag name as the key; and the tag&#39;s value as the value</value>
        [DataMember(Name = "tags", EmitDefaultValue = false)]
        public Dictionary<string, StringOrNumberTagValue> Tags { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class DocumentModel {\n");
            sb.Append("  Url: ").Append(Url).Append("\n");
            sb.Append("  ProductType: ").Append(ProductType).Append("\n");
            sb.Append("  Tags: ").Append(Tags).Append("\n");
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
            return this.Equals(input as DocumentModel);
        }

        /// <summary>
        /// Returns true if DocumentModel instances are equal
        /// </summary>
        /// <param name="input">Instance of DocumentModel to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(DocumentModel input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Url == input.Url ||
                    (this.Url != null &&
                    this.Url.Equals(input.Url))
                ) && 
                (
                    this.ProductType == input.ProductType ||
                    (this.ProductType != null &&
                    this.ProductType.Equals(input.ProductType))
                ) && 
                (
                    this.Tags == input.Tags ||
                    this.Tags != null &&
                    input.Tags != null &&
                    this.Tags.SequenceEqual(input.Tags)
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
                if (this.Url != null)
                {
                    hashCode = (hashCode * 59) + this.Url.GetHashCode();
                }
                if (this.ProductType != null)
                {
                    hashCode = (hashCode * 59) + this.ProductType.GetHashCode();
                }
                if (this.Tags != null)
                {
                    hashCode = (hashCode * 59) + this.Tags.GetHashCode();
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
