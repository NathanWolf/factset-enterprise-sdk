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
using OpenAPIDateConverter = FactSet.SDK.StocksAPIforDigitalPortals.Client.OpenAPIDateConverter;

namespace FactSet.SDK.StocksAPIforDigitalPortals.Model
{
    /// <summary>
    /// Industry classification. Here, an industry is a category from any level of category system FactSet Revere Business Industry Classification System (RBICS), see endpoint &#x60;/category/listBySystem&#x60; with &#x60;id&#x3D;48&#x60; for valid values.
    /// </summary>
    [DataContract(Name = "_stock_notation_screener_search_data_industryClassification")]
    public partial class StockNotationScreenerSearchDataIndustryClassification : IEquatable<StockNotationScreenerSearchDataIndustryClassification>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="StockNotationScreenerSearchDataIndustryClassification" /> class.
        /// </summary>
        /// <param name="restrict">restrict.</param>
        /// <param name="exclude">exclude.</param>
        public StockNotationScreenerSearchDataIndustryClassification(StockNotationScreenerSearchDataIndustryClassificationRestrict restrict = default(StockNotationScreenerSearchDataIndustryClassificationRestrict), StockNotationScreenerSearchDataIndustryClassificationExclude exclude = default(StockNotationScreenerSearchDataIndustryClassificationExclude))
        {
            this.Restrict = restrict;
            this.Exclude = exclude;
        }

        /// <summary>
        /// Gets or Sets Restrict
        /// </summary>
        [DataMember(Name = "restrict", EmitDefaultValue = false)]
        public StockNotationScreenerSearchDataIndustryClassificationRestrict Restrict { get; set; }

        /// <summary>
        /// Gets or Sets Exclude
        /// </summary>
        [DataMember(Name = "exclude", EmitDefaultValue = false)]
        public StockNotationScreenerSearchDataIndustryClassificationExclude Exclude { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class StockNotationScreenerSearchDataIndustryClassification {\n");
            sb.Append("  Restrict: ").Append(Restrict).Append("\n");
            sb.Append("  Exclude: ").Append(Exclude).Append("\n");
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
            return this.Equals(input as StockNotationScreenerSearchDataIndustryClassification);
        }

        /// <summary>
        /// Returns true if StockNotationScreenerSearchDataIndustryClassification instances are equal
        /// </summary>
        /// <param name="input">Instance of StockNotationScreenerSearchDataIndustryClassification to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(StockNotationScreenerSearchDataIndustryClassification input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Restrict == input.Restrict ||
                    (this.Restrict != null &&
                    this.Restrict.Equals(input.Restrict))
                ) && 
                (
                    this.Exclude == input.Exclude ||
                    (this.Exclude != null &&
                    this.Exclude.Equals(input.Exclude))
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
                if (this.Restrict != null)
                    hashCode = hashCode * 59 + this.Restrict.GetHashCode();
                if (this.Exclude != null)
                    hashCode = hashCode * 59 + this.Exclude.GetHashCode();
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
