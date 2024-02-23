/*
 * FactSet Funds API
 *
 * FactSet Mutual Funds data offers over 50 fund- and share class-specific data points for mutual funds listed in the United States. <p>FactSet Mutual Funds Reference provides fund-specific reference information as well as FactSet's proprietary classification system. It includes but is not limited to the following coverage    * Fund descriptions    * A seven-tier classification system   * Leverage information   * Fees and expenses    * Portfolio managers       FactSet Mutual Funds Time Series provides quantitative data items on a historical basis. It includes but is not limited to the following coverage    * Net asset value   * Fund flows    * Assets under management   * Total return  
 *
 * The version of the OpenAPI document: 1.0.1
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
using OpenAPIDateConverter = FactSet.SDK.FactSetFunds.Client.OpenAPIDateConverter;

namespace FactSet.SDK.FactSetFunds.Model
{
    /// <summary>
    /// Classifications
    /// </summary>
    [DataContract(Name = "classifications")]
    public partial class Classifications : IEquatable<Classifications>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="Classifications" /> class.
        /// </summary>
        /// <param name="fsymId">FactSet Security Identifier. Six alpha-numeric characters, excluding vowels, with a -S suffix (XXXXXX-S), resolved from the requestId of the Fund requested..</param>
        /// <param name="requestId">The requested Id sent as input..</param>
        /// <param name="assetClass">Returns the asset class description from FactSet&#39;s fund classification system. Asset class designates the fund&#39;s underlying holding type, e.g. equity, fixed-income, etc..</param>
        /// <param name="categoryClass">Returns the asset class category description from FactSet&#39;s fund classification system. The asset class category is the first-tier subcategory within the fund&#39;s asset class, e.g. size &amp; style, sector, precious metals, etc..</param>
        /// <param name="economicDevelopmentClass">Returns the fund&#39;s economic development description from FactSet&#39;s fund classification system. This description refers to the development level for the fund&#39;s geographic region of focus, e.g. developed, emerging, etc..</param>
        /// <param name="focusClass">Returns the fund&#39;s focus description from FactSet&#39;s fund classification system. The fund&#39;s focus is the second-tier subcategory within the fund&#39;s asset class, e.g. small cap, energy, etc..</param>
        /// <param name="geographicClass">Returns the fund&#39;s specific geography description from FactSet&#39;s fund classification system. Specific geography refers to the fund&#39;s particular geographic focus within the region, e.g. Chile, BRICs, etc..</param>
        /// <param name="nicheClass">Returns the fund&#39;s niche description from FactSet&#39;s fund classification system. The fund&#39;s niche is the third-tier subcategory with the fund&#39;s asset class, e.g. growth, coal, etc..</param>
        /// <param name="regionClass">Returns the fund&#39;s region description from FactSet&#39;s fund classification system. Refers to the broad regional exposure of the fund&#39;s holdings, e.g. Latin America, Asia-Pacific, etc..</param>
        public Classifications(string fsymId = default(string), string requestId = default(string), string assetClass = default(string), string categoryClass = default(string), string economicDevelopmentClass = default(string), string focusClass = default(string), string geographicClass = default(string), string nicheClass = default(string), string regionClass = default(string))
        {
            this.FsymId = fsymId;
            this.RequestId = requestId;
            this.AssetClass = assetClass;
            this.CategoryClass = categoryClass;
            this.EconomicDevelopmentClass = economicDevelopmentClass;
            this.FocusClass = focusClass;
            this.GeographicClass = geographicClass;
            this.NicheClass = nicheClass;
            this.RegionClass = regionClass;
        }

        /// <summary>
        /// FactSet Security Identifier. Six alpha-numeric characters, excluding vowels, with a -S suffix (XXXXXX-S), resolved from the requestId of the Fund requested.
        /// </summary>
        /// <value>FactSet Security Identifier. Six alpha-numeric characters, excluding vowels, with a -S suffix (XXXXXX-S), resolved from the requestId of the Fund requested.</value>
        [DataMember(Name = "fsymId", EmitDefaultValue = true)]
        public string FsymId { get; set; }

        /// <summary>
        /// The requested Id sent as input.
        /// </summary>
        /// <value>The requested Id sent as input.</value>
        [DataMember(Name = "requestId", EmitDefaultValue = false)]
        public string RequestId { get; set; }

        /// <summary>
        /// Returns the asset class description from FactSet&#39;s fund classification system. Asset class designates the fund&#39;s underlying holding type, e.g. equity, fixed-income, etc.
        /// </summary>
        /// <value>Returns the asset class description from FactSet&#39;s fund classification system. Asset class designates the fund&#39;s underlying holding type, e.g. equity, fixed-income, etc.</value>
        [DataMember(Name = "assetClass", EmitDefaultValue = true)]
        public string AssetClass { get; set; }

        /// <summary>
        /// Returns the asset class category description from FactSet&#39;s fund classification system. The asset class category is the first-tier subcategory within the fund&#39;s asset class, e.g. size &amp; style, sector, precious metals, etc.
        /// </summary>
        /// <value>Returns the asset class category description from FactSet&#39;s fund classification system. The asset class category is the first-tier subcategory within the fund&#39;s asset class, e.g. size &amp; style, sector, precious metals, etc.</value>
        [DataMember(Name = "categoryClass", EmitDefaultValue = true)]
        public string CategoryClass { get; set; }

        /// <summary>
        /// Returns the fund&#39;s economic development description from FactSet&#39;s fund classification system. This description refers to the development level for the fund&#39;s geographic region of focus, e.g. developed, emerging, etc.
        /// </summary>
        /// <value>Returns the fund&#39;s economic development description from FactSet&#39;s fund classification system. This description refers to the development level for the fund&#39;s geographic region of focus, e.g. developed, emerging, etc.</value>
        [DataMember(Name = "economicDevelopmentClass", EmitDefaultValue = true)]
        public string EconomicDevelopmentClass { get; set; }

        /// <summary>
        /// Returns the fund&#39;s focus description from FactSet&#39;s fund classification system. The fund&#39;s focus is the second-tier subcategory within the fund&#39;s asset class, e.g. small cap, energy, etc.
        /// </summary>
        /// <value>Returns the fund&#39;s focus description from FactSet&#39;s fund classification system. The fund&#39;s focus is the second-tier subcategory within the fund&#39;s asset class, e.g. small cap, energy, etc.</value>
        [DataMember(Name = "focusClass", EmitDefaultValue = true)]
        public string FocusClass { get; set; }

        /// <summary>
        /// Returns the fund&#39;s specific geography description from FactSet&#39;s fund classification system. Specific geography refers to the fund&#39;s particular geographic focus within the region, e.g. Chile, BRICs, etc.
        /// </summary>
        /// <value>Returns the fund&#39;s specific geography description from FactSet&#39;s fund classification system. Specific geography refers to the fund&#39;s particular geographic focus within the region, e.g. Chile, BRICs, etc.</value>
        [DataMember(Name = "geographicClass", EmitDefaultValue = true)]
        public string GeographicClass { get; set; }

        /// <summary>
        /// Returns the fund&#39;s niche description from FactSet&#39;s fund classification system. The fund&#39;s niche is the third-tier subcategory with the fund&#39;s asset class, e.g. growth, coal, etc.
        /// </summary>
        /// <value>Returns the fund&#39;s niche description from FactSet&#39;s fund classification system. The fund&#39;s niche is the third-tier subcategory with the fund&#39;s asset class, e.g. growth, coal, etc.</value>
        [DataMember(Name = "nicheClass", EmitDefaultValue = true)]
        public string NicheClass { get; set; }

        /// <summary>
        /// Returns the fund&#39;s region description from FactSet&#39;s fund classification system. Refers to the broad regional exposure of the fund&#39;s holdings, e.g. Latin America, Asia-Pacific, etc.
        /// </summary>
        /// <value>Returns the fund&#39;s region description from FactSet&#39;s fund classification system. Refers to the broad regional exposure of the fund&#39;s holdings, e.g. Latin America, Asia-Pacific, etc.</value>
        [DataMember(Name = "regionClass", EmitDefaultValue = true)]
        public string RegionClass { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class Classifications {\n");
            sb.Append("  FsymId: ").Append(FsymId).Append("\n");
            sb.Append("  RequestId: ").Append(RequestId).Append("\n");
            sb.Append("  AssetClass: ").Append(AssetClass).Append("\n");
            sb.Append("  CategoryClass: ").Append(CategoryClass).Append("\n");
            sb.Append("  EconomicDevelopmentClass: ").Append(EconomicDevelopmentClass).Append("\n");
            sb.Append("  FocusClass: ").Append(FocusClass).Append("\n");
            sb.Append("  GeographicClass: ").Append(GeographicClass).Append("\n");
            sb.Append("  NicheClass: ").Append(NicheClass).Append("\n");
            sb.Append("  RegionClass: ").Append(RegionClass).Append("\n");
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
            return this.Equals(input as Classifications);
        }

        /// <summary>
        /// Returns true if Classifications instances are equal
        /// </summary>
        /// <param name="input">Instance of Classifications to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Classifications input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.FsymId == input.FsymId ||
                    (this.FsymId != null &&
                    this.FsymId.Equals(input.FsymId))
                ) && 
                (
                    this.RequestId == input.RequestId ||
                    (this.RequestId != null &&
                    this.RequestId.Equals(input.RequestId))
                ) && 
                (
                    this.AssetClass == input.AssetClass ||
                    (this.AssetClass != null &&
                    this.AssetClass.Equals(input.AssetClass))
                ) && 
                (
                    this.CategoryClass == input.CategoryClass ||
                    (this.CategoryClass != null &&
                    this.CategoryClass.Equals(input.CategoryClass))
                ) && 
                (
                    this.EconomicDevelopmentClass == input.EconomicDevelopmentClass ||
                    (this.EconomicDevelopmentClass != null &&
                    this.EconomicDevelopmentClass.Equals(input.EconomicDevelopmentClass))
                ) && 
                (
                    this.FocusClass == input.FocusClass ||
                    (this.FocusClass != null &&
                    this.FocusClass.Equals(input.FocusClass))
                ) && 
                (
                    this.GeographicClass == input.GeographicClass ||
                    (this.GeographicClass != null &&
                    this.GeographicClass.Equals(input.GeographicClass))
                ) && 
                (
                    this.NicheClass == input.NicheClass ||
                    (this.NicheClass != null &&
                    this.NicheClass.Equals(input.NicheClass))
                ) && 
                (
                    this.RegionClass == input.RegionClass ||
                    (this.RegionClass != null &&
                    this.RegionClass.Equals(input.RegionClass))
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
                if (this.FsymId != null)
                {
                    hashCode = (hashCode * 59) + this.FsymId.GetHashCode();
                }
                if (this.RequestId != null)
                {
                    hashCode = (hashCode * 59) + this.RequestId.GetHashCode();
                }
                if (this.AssetClass != null)
                {
                    hashCode = (hashCode * 59) + this.AssetClass.GetHashCode();
                }
                if (this.CategoryClass != null)
                {
                    hashCode = (hashCode * 59) + this.CategoryClass.GetHashCode();
                }
                if (this.EconomicDevelopmentClass != null)
                {
                    hashCode = (hashCode * 59) + this.EconomicDevelopmentClass.GetHashCode();
                }
                if (this.FocusClass != null)
                {
                    hashCode = (hashCode * 59) + this.FocusClass.GetHashCode();
                }
                if (this.GeographicClass != null)
                {
                    hashCode = (hashCode * 59) + this.GeographicClass.GetHashCode();
                }
                if (this.NicheClass != null)
                {
                    hashCode = (hashCode * 59) + this.NicheClass.GetHashCode();
                }
                if (this.RegionClass != null)
                {
                    hashCode = (hashCode * 59) + this.RegionClass.GetHashCode();
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
