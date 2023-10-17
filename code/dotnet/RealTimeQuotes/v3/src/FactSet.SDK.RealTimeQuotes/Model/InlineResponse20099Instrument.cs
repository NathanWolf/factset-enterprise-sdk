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
    /// Instrument data of the notation.
    /// </summary>
    [DataContract(Name = "inline_response_200_99_instrument")]
    public partial class InlineResponse20099Instrument : IEquatable<InlineResponse20099Instrument>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse20099Instrument" /> class.
        /// </summary>
        /// <param name="id">Identifier of the instrument..</param>
        /// <param name="name">name.</param>
        /// <param name="isin">International Securities Identification Number of the instrument..</param>
        /// <param name="nsin">nsin.</param>
        /// <param name="normalizedSymbol">Symbol of an option or a future, as normalized by FactSet..</param>
        /// <param name="fsym">fsym.</param>
        /// <param name="assetClass">assetClass.</param>
        /// <param name="instrumentCategory">Set of categories assigned to the instrument. The set of returned categories is limited to the values provided in the request parameter &#x60;category.restrict.ids&#x60;. Empty, if &#x60;category.restrict.ids&#x60; has not been used..</param>
        public InlineResponse20099Instrument(string id = default(string), InlineResponse20099InstrumentName name = default(InlineResponse20099InstrumentName), string isin = default(string), InlineResponse20067Nsin nsin = default(InlineResponse20067Nsin), string normalizedSymbol = default(string), InlineResponse20036Fsym fsym = default(InlineResponse20036Fsym), InlineResponse20099InstrumentAssetClass assetClass = default(InlineResponse20099InstrumentAssetClass), List<InlineResponse20038DataCategories> instrumentCategory = default(List<InlineResponse20038DataCategories>))
        {
            this.Id = id;
            this.Name = name;
            this.Isin = isin;
            this.Nsin = nsin;
            this.NormalizedSymbol = normalizedSymbol;
            this.Fsym = fsym;
            this.AssetClass = assetClass;
            this.InstrumentCategory = instrumentCategory;
        }

        /// <summary>
        /// Identifier of the instrument.
        /// </summary>
        /// <value>Identifier of the instrument.</value>
        [DataMember(Name = "id", EmitDefaultValue = true)]
        public string Id { get; set; }

        /// <summary>
        /// Gets or Sets Name
        /// </summary>
        [DataMember(Name = "name", EmitDefaultValue = false)]
        public InlineResponse20099InstrumentName Name { get; set; }

        /// <summary>
        /// International Securities Identification Number of the instrument.
        /// </summary>
        /// <value>International Securities Identification Number of the instrument.</value>
        [DataMember(Name = "isin", EmitDefaultValue = true)]
        public string Isin { get; set; }

        /// <summary>
        /// Gets or Sets Nsin
        /// </summary>
        [DataMember(Name = "nsin", EmitDefaultValue = false)]
        public InlineResponse20067Nsin Nsin { get; set; }

        /// <summary>
        /// Symbol of an option or a future, as normalized by FactSet.
        /// </summary>
        /// <value>Symbol of an option or a future, as normalized by FactSet.</value>
        [DataMember(Name = "normalizedSymbol", EmitDefaultValue = true)]
        public string NormalizedSymbol { get; set; }

        /// <summary>
        /// Gets or Sets Fsym
        /// </summary>
        [DataMember(Name = "fsym", EmitDefaultValue = false)]
        public InlineResponse20036Fsym Fsym { get; set; }

        /// <summary>
        /// Gets or Sets AssetClass
        /// </summary>
        [DataMember(Name = "assetClass", EmitDefaultValue = false)]
        public InlineResponse20099InstrumentAssetClass AssetClass { get; set; }

        /// <summary>
        /// Set of categories assigned to the instrument. The set of returned categories is limited to the values provided in the request parameter &#x60;category.restrict.ids&#x60;. Empty, if &#x60;category.restrict.ids&#x60; has not been used.
        /// </summary>
        /// <value>Set of categories assigned to the instrument. The set of returned categories is limited to the values provided in the request parameter &#x60;category.restrict.ids&#x60;. Empty, if &#x60;category.restrict.ids&#x60; has not been used.</value>
        [DataMember(Name = "instrumentCategory", EmitDefaultValue = false)]
        public List<InlineResponse20038DataCategories> InstrumentCategory { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class InlineResponse20099Instrument {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Isin: ").Append(Isin).Append("\n");
            sb.Append("  Nsin: ").Append(Nsin).Append("\n");
            sb.Append("  NormalizedSymbol: ").Append(NormalizedSymbol).Append("\n");
            sb.Append("  Fsym: ").Append(Fsym).Append("\n");
            sb.Append("  AssetClass: ").Append(AssetClass).Append("\n");
            sb.Append("  InstrumentCategory: ").Append(InstrumentCategory).Append("\n");
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
            return this.Equals(input as InlineResponse20099Instrument);
        }

        /// <summary>
        /// Returns true if InlineResponse20099Instrument instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse20099Instrument to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse20099Instrument input)
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
                    this.Isin == input.Isin ||
                    (this.Isin != null &&
                    this.Isin.Equals(input.Isin))
                ) && 
                (
                    this.Nsin == input.Nsin ||
                    (this.Nsin != null &&
                    this.Nsin.Equals(input.Nsin))
                ) && 
                (
                    this.NormalizedSymbol == input.NormalizedSymbol ||
                    (this.NormalizedSymbol != null &&
                    this.NormalizedSymbol.Equals(input.NormalizedSymbol))
                ) && 
                (
                    this.Fsym == input.Fsym ||
                    (this.Fsym != null &&
                    this.Fsym.Equals(input.Fsym))
                ) && 
                (
                    this.AssetClass == input.AssetClass ||
                    (this.AssetClass != null &&
                    this.AssetClass.Equals(input.AssetClass))
                ) && 
                (
                    this.InstrumentCategory == input.InstrumentCategory ||
                    this.InstrumentCategory != null &&
                    input.InstrumentCategory != null &&
                    this.InstrumentCategory.SequenceEqual(input.InstrumentCategory)
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
                if (this.Isin != null)
                {
                    hashCode = (hashCode * 59) + this.Isin.GetHashCode();
                }
                if (this.Nsin != null)
                {
                    hashCode = (hashCode * 59) + this.Nsin.GetHashCode();
                }
                if (this.NormalizedSymbol != null)
                {
                    hashCode = (hashCode * 59) + this.NormalizedSymbol.GetHashCode();
                }
                if (this.Fsym != null)
                {
                    hashCode = (hashCode * 59) + this.Fsym.GetHashCode();
                }
                if (this.AssetClass != null)
                {
                    hashCode = (hashCode * 59) + this.AssetClass.GetHashCode();
                }
                if (this.InstrumentCategory != null)
                {
                    hashCode = (hashCode * 59) + this.InstrumentCategory.GetHashCode();
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
