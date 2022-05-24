/*
 * Time Series API For Digital Portals
 *
 * Time series data, end-of-day or intraday, tick-by-tick or subsampled. Additional vendor-specific endpoints provide a modified interface for seamless integration with the ChartIQ chart library.
 *
 * The version of the OpenAPI document: 2
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
    /// Non-empty interval of days specifying a single subsample period. The starting point &#x60;start&#x60; of the single subsample is usually the attribute &#x60;range.end&#x60; of a previously received &#x60;/prices/timeSeries/eod/subsample/list&#x60; request. A valid range is between 1900-01-01 and a day that is less than or equal to the maximum allowed day determined from the delay period (if any). The ending point &#x60;end&#x60; may exceed the maximally entitled date range.
    /// </summary>
    [DataContract(Name = "_prices_timeSeries_eod_subsample_get_data_interval")]
    public partial class PricesTimeSeriesEodSubsampleGetDataInterval : IEquatable<PricesTimeSeriesEodSubsampleGetDataInterval>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="PricesTimeSeriesEodSubsampleGetDataInterval" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected PricesTimeSeriesEodSubsampleGetDataInterval() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="PricesTimeSeriesEodSubsampleGetDataInterval" /> class.
        /// </summary>
        /// <param name="start">The starting point of the interval (inclusive).  (required).</param>
        /// <param name="end">The ending point of the interval (exclusive). (required).</param>
        public PricesTimeSeriesEodSubsampleGetDataInterval(DateTime start = default(DateTime), DateTime end = default(DateTime))
        {
            this.Start = start;
            this.End = end;
        }

        /// <summary>
        /// The starting point of the interval (inclusive). 
        /// </summary>
        /// <value>The starting point of the interval (inclusive). </value>
        [DataMember(Name = "start", IsRequired = true, EmitDefaultValue = false)]
        [JsonConverter(typeof(OpenAPIDateConverter))]
        public DateTime Start { get; set; }

        /// <summary>
        /// The ending point of the interval (exclusive).
        /// </summary>
        /// <value>The ending point of the interval (exclusive).</value>
        [DataMember(Name = "end", IsRequired = true, EmitDefaultValue = false)]
        [JsonConverter(typeof(OpenAPIDateConverter))]
        public DateTime End { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class PricesTimeSeriesEodSubsampleGetDataInterval {\n");
            sb.Append("  Start: ").Append(Start).Append("\n");
            sb.Append("  End: ").Append(End).Append("\n");
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
            return this.Equals(input as PricesTimeSeriesEodSubsampleGetDataInterval);
        }

        /// <summary>
        /// Returns true if PricesTimeSeriesEodSubsampleGetDataInterval instances are equal
        /// </summary>
        /// <param name="input">Instance of PricesTimeSeriesEodSubsampleGetDataInterval to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PricesTimeSeriesEodSubsampleGetDataInterval input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Start == input.Start ||
                    (this.Start != null &&
                    this.Start.Equals(input.Start))
                ) && 
                (
                    this.End == input.End ||
                    (this.End != null &&
                    this.End.Equals(input.End))
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
                if (this.Start != null)
                {
                    hashCode = (hashCode * 59) + this.Start.GetHashCode();
                }
                if (this.End != null)
                {
                    hashCode = (hashCode * 59) + this.End.GetHashCode();
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
