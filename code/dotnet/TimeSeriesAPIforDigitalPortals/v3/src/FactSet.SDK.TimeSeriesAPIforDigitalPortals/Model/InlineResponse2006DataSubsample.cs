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
    /// Single summary record. For the attributes first, last, low, high, see attribute &#x60;valueUnit&#x60; in endpoint &#x60;/prices/get&#x60; for their unit, except for price type yield, where the &#x60;valueUnit&#x60; is always &#x60;percent&#x60; (id&#x3D;258).
    /// </summary>
    [DataContract(Name = "inline_response_200_6_data_subsample")]
    public partial class InlineResponse2006DataSubsample : IEquatable<InlineResponse2006DataSubsample>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse2006DataSubsample" /> class.
        /// </summary>
        /// <param name="date">Date of the start of the subsample..</param>
        /// <param name="first">First price of the subsample..</param>
        /// <param name="last">Last price of the subsample..</param>
        /// <param name="low">Lowest price of the subsample..</param>
        /// <param name="high">Highest price of the subsample..</param>
        /// <param name="tradingVolume">Accumulated number of units (e.g. shares) traded of the subsample. If the requested type of the price is ask, bid, or yield, the value is empty..</param>
        /// <param name="tradingValue">Accumulated monetary equivalent (cash value) of the subsample. If the requested type of the price is ask, bid, or yield, the value is empty. See attribute &#x60;currency&#x60; in endpoint &#x60;/prices/get&#x60; for its unit..</param>
        public InlineResponse2006DataSubsample(DateTime date = default(DateTime), decimal first = default(decimal), decimal last = default(decimal), decimal low = default(decimal), decimal high = default(decimal), decimal tradingVolume = default(decimal), decimal tradingValue = default(decimal))
        {
            this.Date = date;
            this.First = first;
            this.Last = last;
            this.Low = low;
            this.High = high;
            this.TradingVolume = tradingVolume;
            this.TradingValue = tradingValue;
        }

        /// <summary>
        /// Date of the start of the subsample.
        /// </summary>
        /// <value>Date of the start of the subsample.</value>
        [DataMember(Name = "date", EmitDefaultValue = false)]
        [JsonConverter(typeof(OpenAPIDateConverter))]
        public DateTime Date { get; set; }

        /// <summary>
        /// First price of the subsample.
        /// </summary>
        /// <value>First price of the subsample.</value>
        [DataMember(Name = "first", EmitDefaultValue = false)]
        public decimal First { get; set; }

        /// <summary>
        /// Last price of the subsample.
        /// </summary>
        /// <value>Last price of the subsample.</value>
        [DataMember(Name = "last", EmitDefaultValue = false)]
        public decimal Last { get; set; }

        /// <summary>
        /// Lowest price of the subsample.
        /// </summary>
        /// <value>Lowest price of the subsample.</value>
        [DataMember(Name = "low", EmitDefaultValue = false)]
        public decimal Low { get; set; }

        /// <summary>
        /// Highest price of the subsample.
        /// </summary>
        /// <value>Highest price of the subsample.</value>
        [DataMember(Name = "high", EmitDefaultValue = false)]
        public decimal High { get; set; }

        /// <summary>
        /// Accumulated number of units (e.g. shares) traded of the subsample. If the requested type of the price is ask, bid, or yield, the value is empty.
        /// </summary>
        /// <value>Accumulated number of units (e.g. shares) traded of the subsample. If the requested type of the price is ask, bid, or yield, the value is empty.</value>
        [DataMember(Name = "tradingVolume", EmitDefaultValue = false)]
        public decimal TradingVolume { get; set; }

        /// <summary>
        /// Accumulated monetary equivalent (cash value) of the subsample. If the requested type of the price is ask, bid, or yield, the value is empty. See attribute &#x60;currency&#x60; in endpoint &#x60;/prices/get&#x60; for its unit.
        /// </summary>
        /// <value>Accumulated monetary equivalent (cash value) of the subsample. If the requested type of the price is ask, bid, or yield, the value is empty. See attribute &#x60;currency&#x60; in endpoint &#x60;/prices/get&#x60; for its unit.</value>
        [DataMember(Name = "tradingValue", EmitDefaultValue = false)]
        public decimal TradingValue { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class InlineResponse2006DataSubsample {\n");
            sb.Append("  Date: ").Append(Date).Append("\n");
            sb.Append("  First: ").Append(First).Append("\n");
            sb.Append("  Last: ").Append(Last).Append("\n");
            sb.Append("  Low: ").Append(Low).Append("\n");
            sb.Append("  High: ").Append(High).Append("\n");
            sb.Append("  TradingVolume: ").Append(TradingVolume).Append("\n");
            sb.Append("  TradingValue: ").Append(TradingValue).Append("\n");
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
            return this.Equals(input as InlineResponse2006DataSubsample);
        }

        /// <summary>
        /// Returns true if InlineResponse2006DataSubsample instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse2006DataSubsample to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse2006DataSubsample input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Date == input.Date ||
                    (this.Date != null &&
                    this.Date.Equals(input.Date))
                ) && 
                (
                    this.First == input.First ||
                    this.First.Equals(input.First)
                ) && 
                (
                    this.Last == input.Last ||
                    this.Last.Equals(input.Last)
                ) && 
                (
                    this.Low == input.Low ||
                    this.Low.Equals(input.Low)
                ) && 
                (
                    this.High == input.High ||
                    this.High.Equals(input.High)
                ) && 
                (
                    this.TradingVolume == input.TradingVolume ||
                    this.TradingVolume.Equals(input.TradingVolume)
                ) && 
                (
                    this.TradingValue == input.TradingValue ||
                    this.TradingValue.Equals(input.TradingValue)
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
                if (this.Date != null)
                {
                    hashCode = (hashCode * 59) + this.Date.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.First.GetHashCode();
                hashCode = (hashCode * 59) + this.Last.GetHashCode();
                hashCode = (hashCode * 59) + this.Low.GetHashCode();
                hashCode = (hashCode * 59) + this.High.GetHashCode();
                hashCode = (hashCode * 59) + this.TradingVolume.GetHashCode();
                hashCode = (hashCode * 59) + this.TradingValue.GetHashCode();
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
