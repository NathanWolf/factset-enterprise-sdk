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
    /// Value ranges related to the relative performance.
    /// </summary>
    [DataContract(Name = "inline_response_200_5_data_performance")]
    public partial class InlineResponse2005DataPerformance : IEquatable<InlineResponse2005DataPerformance>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse2005DataPerformance" /> class.
        /// </summary>
        /// <param name="intraday">intraday.</param>
        /// <param name="endOfDay">endOfDay.</param>
        public InlineResponse2005DataPerformance(InlineResponse2005DataPerformanceIntraday intraday = default(InlineResponse2005DataPerformanceIntraday), InlineResponse2005DataPerformanceEndOfDay endOfDay = default(InlineResponse2005DataPerformanceEndOfDay))
        {
            this.Intraday = intraday;
            this.EndOfDay = endOfDay;
        }

        /// <summary>
        /// Gets or Sets Intraday
        /// </summary>
        [DataMember(Name = "intraday", EmitDefaultValue = false)]
        public InlineResponse2005DataPerformanceIntraday Intraday { get; set; }

        /// <summary>
        /// Gets or Sets EndOfDay
        /// </summary>
        [DataMember(Name = "endOfDay", EmitDefaultValue = false)]
        public InlineResponse2005DataPerformanceEndOfDay EndOfDay { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class InlineResponse2005DataPerformance {\n");
            sb.Append("  Intraday: ").Append(Intraday).Append("\n");
            sb.Append("  EndOfDay: ").Append(EndOfDay).Append("\n");
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
            return this.Equals(input as InlineResponse2005DataPerformance);
        }

        /// <summary>
        /// Returns true if InlineResponse2005DataPerformance instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse2005DataPerformance to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse2005DataPerformance input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Intraday == input.Intraday ||
                    (this.Intraday != null &&
                    this.Intraday.Equals(input.Intraday))
                ) && 
                (
                    this.EndOfDay == input.EndOfDay ||
                    (this.EndOfDay != null &&
                    this.EndOfDay.Equals(input.EndOfDay))
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
                if (this.Intraday != null)
                    hashCode = hashCode * 59 + this.Intraday.GetHashCode();
                if (this.EndOfDay != null)
                    hashCode = hashCode * 59 + this.EndOfDay.GetHashCode();
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
