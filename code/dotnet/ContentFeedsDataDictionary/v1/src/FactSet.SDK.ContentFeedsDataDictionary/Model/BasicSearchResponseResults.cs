/*
 * CTS Data Dictionary API
 *
 * An API for interacting with CTS Data Dictionary.
 *
 * The version of the OpenAPI document: 0.2
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
using OpenAPIDateConverter = FactSet.SDK.ContentFeedsDataDictionary.Client.OpenAPIDateConverter;

namespace FactSet.SDK.ContentFeedsDataDictionary.Model
{
    /// <summary>
    /// BasicSearchResponseResults
    /// </summary>
    [DataContract(Name = "BasicSearchResponse_results")]
    public partial class BasicSearchResponseResults : IEquatable<BasicSearchResponseResults>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="BasicSearchResponseResults" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected BasicSearchResponseResults() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="BasicSearchResponseResults" /> class.
        /// </summary>
        /// <param name="product">product (required).</param>
        /// <param name="dataItem">dataItem (required).</param>
        public BasicSearchResponseResults(Product product = default(Product), DataItem dataItem = default(DataItem))
        {
            // to ensure "product" is required (not null)
            if (product == null) {
                throw new ArgumentNullException("product is a required property for BasicSearchResponseResults and cannot be null");
            }
            this.Product = product;
            // to ensure "dataItem" is required (not null)
            if (dataItem == null) {
                throw new ArgumentNullException("dataItem is a required property for BasicSearchResponseResults and cannot be null");
            }
            this.DataItem = dataItem;
        }

        /// <summary>
        /// Gets or Sets Product
        /// </summary>
        [DataMember(Name = "product", IsRequired = true, EmitDefaultValue = false)]
        public Product Product { get; set; }

        /// <summary>
        /// Gets or Sets DataItem
        /// </summary>
        [DataMember(Name = "dataItem", IsRequired = true, EmitDefaultValue = false)]
        public DataItem DataItem { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class BasicSearchResponseResults {\n");
            sb.Append("  Product: ").Append(Product).Append("\n");
            sb.Append("  DataItem: ").Append(DataItem).Append("\n");
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
            return this.Equals(input as BasicSearchResponseResults);
        }

        /// <summary>
        /// Returns true if BasicSearchResponseResults instances are equal
        /// </summary>
        /// <param name="input">Instance of BasicSearchResponseResults to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(BasicSearchResponseResults input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Product == input.Product ||
                    (this.Product != null &&
                    this.Product.Equals(input.Product))
                ) && 
                (
                    this.DataItem == input.DataItem ||
                    (this.DataItem != null &&
                    this.DataItem.Equals(input.DataItem))
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
                if (this.Product != null)
                {
                    hashCode = (hashCode * 59) + this.Product.GetHashCode();
                }
                if (this.DataItem != null)
                {
                    hashCode = (hashCode * 59) + this.DataItem.GetHashCode();
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
