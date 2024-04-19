/*
 * StreetAccount News API
 *
 * The StreetAccount News API provides access to FactSet's proprietary news provider, StreetAccount. StreetAccount, is a premium real-time market intelligence news service that delivers comprehensive U.S., Canadian, and European coverage (and expanding Asia coverage). All possible sources for corporate news are scanned and key story facts are highlighted and presented in an easy-to-read format.  **StreetAccount Filters, Headlines, and Views:**  These endpoints allow for the retrieval of news headlines using filters such as Watchlists/Indices/Tickers, Categories (the equivalent of 'Subjects' within the Workstation), Market Topics, Regions, and Sectors.  Headlines can also be retrieved based on saved views within the Workstation.
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
using OpenAPIDateConverter = FactSet.SDK.StreetAccountNews.Client.OpenAPIDateConverter;

namespace FactSet.SDK.StreetAccountNews.Model
{
    /// <summary>
    /// FilterCategoriesResponseData
    /// </summary>
    [DataContract(Name = "FilterCategoriesResponse_data")]
    public partial class FilterCategoriesResponseData : IEquatable<FilterCategoriesResponseData>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="FilterCategoriesResponseData" /> class.
        /// </summary>
        /// <param name="structured">structured.</param>
        /// <param name="flattened">flattened.</param>
        public FilterCategoriesResponseData(StructuredFiltersCategories structured = default(StructuredFiltersCategories), FlattenedFiltersCategories flattened = default(FlattenedFiltersCategories))
        {
            this.Structured = structured;
            this.Flattened = flattened;
        }

        /// <summary>
        /// Gets or Sets Structured
        /// </summary>
        [DataMember(Name = "structured", EmitDefaultValue = false)]
        public StructuredFiltersCategories Structured { get; set; }

        /// <summary>
        /// Gets or Sets Flattened
        /// </summary>
        [DataMember(Name = "flattened", EmitDefaultValue = false)]
        public FlattenedFiltersCategories Flattened { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class FilterCategoriesResponseData {\n");
            sb.Append("  Structured: ").Append(Structured).Append("\n");
            sb.Append("  Flattened: ").Append(Flattened).Append("\n");
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
            return this.Equals(input as FilterCategoriesResponseData);
        }

        /// <summary>
        /// Returns true if FilterCategoriesResponseData instances are equal
        /// </summary>
        /// <param name="input">Instance of FilterCategoriesResponseData to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(FilterCategoriesResponseData input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Structured == input.Structured ||
                    (this.Structured != null &&
                    this.Structured.Equals(input.Structured))
                ) && 
                (
                    this.Flattened == input.Flattened ||
                    (this.Flattened != null &&
                    this.Flattened.Equals(input.Flattened))
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
                if (this.Structured != null)
                {
                    hashCode = (hashCode * 59) + this.Structured.GetHashCode();
                }
                if (this.Flattened != null)
                {
                    hashCode = (hashCode * 59) + this.Flattened.GetHashCode();
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
