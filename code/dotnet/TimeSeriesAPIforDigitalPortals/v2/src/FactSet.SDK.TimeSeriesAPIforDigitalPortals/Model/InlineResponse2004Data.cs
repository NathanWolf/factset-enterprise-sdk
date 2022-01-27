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
using OpenAPIDateConverter = FactSet.SDK.TimeSeriesAPIforDigitalPortals.Client.OpenAPIDateConverter;

namespace FactSet.SDK.TimeSeriesAPIforDigitalPortals.Model
{
    /// <summary>
    /// Subsampled time series data for the notation.
    /// </summary>
    [DataContract(Name = "inline_response_200_4_data")]
    public partial class InlineResponse2004Data : IEquatable<InlineResponse2004Data>, IValidatableObject
    {
        /// <summary>
        /// Quality of the price.
        /// </summary>
        /// <value>Quality of the price.</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum QualityEnum
        {
            /// <summary>
            /// Enum RLT for value: RLT
            /// </summary>
            [EnumMember(Value = "RLT")]
            RLT = 1,

            /// <summary>
            /// Enum DLY for value: DLY
            /// </summary>
            [EnumMember(Value = "DLY")]
            DLY = 2

        }


        /// <summary>
        /// Quality of the price.
        /// </summary>
        /// <value>Quality of the price.</value>
        [DataMember(Name = "quality", EmitDefaultValue = false)]
        public QualityEnum? Quality { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse2004Data" /> class.
        /// </summary>
        /// <param name="range">range.</param>
        /// <param name="quality">Quality of the price..</param>
        /// <param name="subsamples">List of summary records as an array of arrays. One record is represented as an array and consists of a timestamp, four price values, and the trading volume. For the unit of the price values, see attribute &#x60;valueUnit&#x60; in endpoint &#x60;/prices/get&#x60;, except for price type yield, where the &#x60;valueUnit&#x60; is always &#x60;percent&#x60; (id&#x3D;258). The order is as follows: timestamp of the start of the subsample (seconds since epoch in UTC); first price of the subsample; highest price of the subsample; lowest price of the subsample; last price of the subsample; accumulated number of units (e.g. shares) traded of the subsample. If the requested type of the price is ask, bid, or yield, the accumulated number of units is empty..</param>
        public InlineResponse2004Data(InlineResponse2004DataRange range = default(InlineResponse2004DataRange), QualityEnum? quality = default(QualityEnum?), List<List<decimal>> subsamples = default(List<List<decimal>>))
        {
            this.Range = range;
            this.Quality = quality;
            this.Subsamples = subsamples;
        }

        /// <summary>
        /// Gets or Sets Range
        /// </summary>
        [DataMember(Name = "range", EmitDefaultValue = false)]
        public InlineResponse2004DataRange Range { get; set; }

        /// <summary>
        /// List of summary records as an array of arrays. One record is represented as an array and consists of a timestamp, four price values, and the trading volume. For the unit of the price values, see attribute &#x60;valueUnit&#x60; in endpoint &#x60;/prices/get&#x60;, except for price type yield, where the &#x60;valueUnit&#x60; is always &#x60;percent&#x60; (id&#x3D;258). The order is as follows: timestamp of the start of the subsample (seconds since epoch in UTC); first price of the subsample; highest price of the subsample; lowest price of the subsample; last price of the subsample; accumulated number of units (e.g. shares) traded of the subsample. If the requested type of the price is ask, bid, or yield, the accumulated number of units is empty.
        /// </summary>
        /// <value>List of summary records as an array of arrays. One record is represented as an array and consists of a timestamp, four price values, and the trading volume. For the unit of the price values, see attribute &#x60;valueUnit&#x60; in endpoint &#x60;/prices/get&#x60;, except for price type yield, where the &#x60;valueUnit&#x60; is always &#x60;percent&#x60; (id&#x3D;258). The order is as follows: timestamp of the start of the subsample (seconds since epoch in UTC); first price of the subsample; highest price of the subsample; lowest price of the subsample; last price of the subsample; accumulated number of units (e.g. shares) traded of the subsample. If the requested type of the price is ask, bid, or yield, the accumulated number of units is empty.</value>
        [DataMember(Name = "subsamples", EmitDefaultValue = false)]
        public List<List<decimal>> Subsamples { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class InlineResponse2004Data {\n");
            sb.Append("  Range: ").Append(Range).Append("\n");
            sb.Append("  Quality: ").Append(Quality).Append("\n");
            sb.Append("  Subsamples: ").Append(Subsamples).Append("\n");
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
            return this.Equals(input as InlineResponse2004Data);
        }

        /// <summary>
        /// Returns true if InlineResponse2004Data instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse2004Data to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse2004Data input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Range == input.Range ||
                    (this.Range != null &&
                    this.Range.Equals(input.Range))
                ) && 
                (
                    this.Quality == input.Quality ||
                    this.Quality.Equals(input.Quality)
                ) && 
                (
                    this.Subsamples == input.Subsamples ||
                    this.Subsamples != null &&
                    input.Subsamples != null &&
                    this.Subsamples.SequenceEqual(input.Subsamples)
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
                if (this.Range != null)
                    hashCode = hashCode * 59 + this.Range.GetHashCode();
                hashCode = hashCode * 59 + this.Quality.GetHashCode();
                if (this.Subsamples != null)
                    hashCode = hashCode * 59 + this.Subsamples.GetHashCode();
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
