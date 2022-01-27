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
using OpenAPIDateConverter = FactSet.SDK.QuotesAPIforDigitalPortals.Client.OpenAPIDateConverter;

namespace FactSet.SDK.QuotesAPIforDigitalPortals.Model
{
    /// <summary>
    /// Performance values.
    /// </summary>
    [DataContract(Name = "inline_response_200_80_latest_performance")]
    public partial class InlineResponse20080LatestPerformance : IEquatable<InlineResponse20080LatestPerformance>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse20080LatestPerformance" /> class.
        /// </summary>
        /// <param name="intraday">intraday.</param>
        public InlineResponse20080LatestPerformance(InlineResponse20080LatestPerformanceIntraday intraday = default(InlineResponse20080LatestPerformanceIntraday))
        {
            this.Intraday = intraday;
        }

        /// <summary>
        /// Gets or Sets Intraday
        /// </summary>
        [DataMember(Name = "intraday", EmitDefaultValue = false)]
        public InlineResponse20080LatestPerformanceIntraday Intraday { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class InlineResponse20080LatestPerformance {\n");
            sb.Append("  Intraday: ").Append(Intraday).Append("\n");
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
            return this.Equals(input as InlineResponse20080LatestPerformance);
        }

        /// <summary>
        /// Returns true if InlineResponse20080LatestPerformance instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse20080LatestPerformance to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse20080LatestPerformance input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Intraday == input.Intraday ||
                    (this.Intraday != null &&
                    this.Intraday.Equals(input.Intraday))
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
