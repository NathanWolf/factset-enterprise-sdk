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
using OpenAPIDateConverter = FactSet.SDK.ETFProfileandPrices.Client.OpenAPIDateConverter;

namespace FactSet.SDK.ETFProfileandPrices.Model
{
    /// <summary>
    /// Market Aggregates
    /// </summary>
    [DataContract(Name = "inline_response_200_25_data")]
    public partial class InlineResponse20025Data : IEquatable<InlineResponse20025Data>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse20025Data" /> class.
        /// </summary>
        /// <param name="asOfDate">Date the analytics data was published. Available for the regions: US, Europe,and Canada..</param>
        /// <param name="optionAdjustedSpread">optionAdjustedSpread.</param>
        /// <param name="averageLife">averageLife.</param>
        public InlineResponse20025Data(DateTime asOfDate = default(DateTime), InlineResponse20025DataOptionAdjustedSpread optionAdjustedSpread = default(InlineResponse20025DataOptionAdjustedSpread), InlineResponse20025DataAverageLife averageLife = default(InlineResponse20025DataAverageLife))
        {
            this.AsOfDate = asOfDate;
            this.OptionAdjustedSpread = optionAdjustedSpread;
            this.AverageLife = averageLife;
        }

        /// <summary>
        /// Date the analytics data was published. Available for the regions: US, Europe,and Canada.
        /// </summary>
        /// <value>Date the analytics data was published. Available for the regions: US, Europe,and Canada.</value>
        [DataMember(Name = "asOfDate", EmitDefaultValue = false)]
        [JsonConverter(typeof(OpenAPIDateConverter))]
        public DateTime AsOfDate { get; set; }

        /// <summary>
        /// Gets or Sets OptionAdjustedSpread
        /// </summary>
        [DataMember(Name = "optionAdjustedSpread", EmitDefaultValue = false)]
        public InlineResponse20025DataOptionAdjustedSpread OptionAdjustedSpread { get; set; }

        /// <summary>
        /// Gets or Sets AverageLife
        /// </summary>
        [DataMember(Name = "averageLife", EmitDefaultValue = false)]
        public InlineResponse20025DataAverageLife AverageLife { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class InlineResponse20025Data {\n");
            sb.Append("  AsOfDate: ").Append(AsOfDate).Append("\n");
            sb.Append("  OptionAdjustedSpread: ").Append(OptionAdjustedSpread).Append("\n");
            sb.Append("  AverageLife: ").Append(AverageLife).Append("\n");
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
            return this.Equals(input as InlineResponse20025Data);
        }

        /// <summary>
        /// Returns true if InlineResponse20025Data instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse20025Data to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse20025Data input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.AsOfDate == input.AsOfDate ||
                    (this.AsOfDate != null &&
                    this.AsOfDate.Equals(input.AsOfDate))
                ) && 
                (
                    this.OptionAdjustedSpread == input.OptionAdjustedSpread ||
                    (this.OptionAdjustedSpread != null &&
                    this.OptionAdjustedSpread.Equals(input.OptionAdjustedSpread))
                ) && 
                (
                    this.AverageLife == input.AverageLife ||
                    (this.AverageLife != null &&
                    this.AverageLife.Equals(input.AverageLife))
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
                if (this.AsOfDate != null)
                {
                    hashCode = (hashCode * 59) + this.AsOfDate.GetHashCode();
                }
                if (this.OptionAdjustedSpread != null)
                {
                    hashCode = (hashCode * 59) + this.OptionAdjustedSpread.GetHashCode();
                }
                if (this.AverageLife != null)
                {
                    hashCode = (hashCode * 59) + this.AverageLife.GetHashCode();
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
