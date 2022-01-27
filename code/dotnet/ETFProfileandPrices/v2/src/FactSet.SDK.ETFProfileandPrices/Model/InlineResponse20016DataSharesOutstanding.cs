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
    /// Shares outstanding.
    /// </summary>
    [DataContract(Name = "inline_response_200_16_data_sharesOutstanding")]
    public partial class InlineResponse20016DataSharesOutstanding : IEquatable<InlineResponse20016DataSharesOutstanding>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse20016DataSharesOutstanding" /> class.
        /// </summary>
        /// <param name="value">Daily shares outstanding (i.e., actual values) for a ETP. This data is available for all the regions..</param>
        /// <param name="lastValue">Last available shares outstanding for a ETP. This data is available for all the regions..</param>
        /// <param name="earliestDate">Returns the earliest date for which a shares outstanding figure is available. This data is available for all the regions..</param>
        public InlineResponse20016DataSharesOutstanding(decimal value = default(decimal), decimal lastValue = default(decimal), DateTime earliestDate = default(DateTime))
        {
            this.Value = value;
            this.LastValue = lastValue;
            this.EarliestDate = earliestDate;
        }

        /// <summary>
        /// Daily shares outstanding (i.e., actual values) for a ETP. This data is available for all the regions.
        /// </summary>
        /// <value>Daily shares outstanding (i.e., actual values) for a ETP. This data is available for all the regions.</value>
        [DataMember(Name = "value", EmitDefaultValue = false)]
        public decimal Value { get; set; }

        /// <summary>
        /// Last available shares outstanding for a ETP. This data is available for all the regions.
        /// </summary>
        /// <value>Last available shares outstanding for a ETP. This data is available for all the regions.</value>
        [DataMember(Name = "lastValue", EmitDefaultValue = false)]
        public decimal LastValue { get; set; }

        /// <summary>
        /// Returns the earliest date for which a shares outstanding figure is available. This data is available for all the regions.
        /// </summary>
        /// <value>Returns the earliest date for which a shares outstanding figure is available. This data is available for all the regions.</value>
        [DataMember(Name = "earliestDate", EmitDefaultValue = false)]
        [JsonConverter(typeof(OpenAPIDateConverter))]
        public DateTime EarliestDate { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class InlineResponse20016DataSharesOutstanding {\n");
            sb.Append("  Value: ").Append(Value).Append("\n");
            sb.Append("  LastValue: ").Append(LastValue).Append("\n");
            sb.Append("  EarliestDate: ").Append(EarliestDate).Append("\n");
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
            return this.Equals(input as InlineResponse20016DataSharesOutstanding);
        }

        /// <summary>
        /// Returns true if InlineResponse20016DataSharesOutstanding instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse20016DataSharesOutstanding to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse20016DataSharesOutstanding input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Value == input.Value ||
                    this.Value.Equals(input.Value)
                ) && 
                (
                    this.LastValue == input.LastValue ||
                    this.LastValue.Equals(input.LastValue)
                ) && 
                (
                    this.EarliestDate == input.EarliestDate ||
                    (this.EarliestDate != null &&
                    this.EarliestDate.Equals(input.EarliestDate))
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
                hashCode = hashCode * 59 + this.Value.GetHashCode();
                hashCode = hashCode * 59 + this.LastValue.GetHashCode();
                if (this.EarliestDate != null)
                    hashCode = hashCode * 59 + this.EarliestDate.GetHashCode();
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
