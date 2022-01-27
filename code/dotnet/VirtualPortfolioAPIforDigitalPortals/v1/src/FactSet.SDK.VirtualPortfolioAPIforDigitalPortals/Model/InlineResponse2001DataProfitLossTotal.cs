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
using OpenAPIDateConverter = FactSet.SDK.VirtualPortfolioAPIforDigitalPortals.Client.OpenAPIDateConverter;

namespace FactSet.SDK.VirtualPortfolioAPIforDigitalPortals.Model
{
    /// <summary>
    /// Summary of potential profit or loss resulting from open and closed positions.
    /// </summary>
    [DataContract(Name = "inline_response_200_1_data_profitLoss_total")]
    public partial class InlineResponse2001DataProfitLossTotal : IEquatable<InlineResponse2001DataProfitLossTotal>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse2001DataProfitLossTotal" /> class.
        /// </summary>
        /// <param name="absolute">Absolute value of realized and potential profit or loss..</param>
        /// <param name="relative">Relative value of realized and potential profit or loss..</param>
        public InlineResponse2001DataProfitLossTotal(decimal absolute = default(decimal), decimal relative = default(decimal))
        {
            this.Absolute = absolute;
            this.Relative = relative;
        }

        /// <summary>
        /// Absolute value of realized and potential profit or loss.
        /// </summary>
        /// <value>Absolute value of realized and potential profit or loss.</value>
        [DataMember(Name = "absolute", EmitDefaultValue = false)]
        public decimal Absolute { get; set; }

        /// <summary>
        /// Relative value of realized and potential profit or loss.
        /// </summary>
        /// <value>Relative value of realized and potential profit or loss.</value>
        [DataMember(Name = "relative", EmitDefaultValue = false)]
        public decimal Relative { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class InlineResponse2001DataProfitLossTotal {\n");
            sb.Append("  Absolute: ").Append(Absolute).Append("\n");
            sb.Append("  Relative: ").Append(Relative).Append("\n");
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
            return this.Equals(input as InlineResponse2001DataProfitLossTotal);
        }

        /// <summary>
        /// Returns true if InlineResponse2001DataProfitLossTotal instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse2001DataProfitLossTotal to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse2001DataProfitLossTotal input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Absolute == input.Absolute ||
                    this.Absolute.Equals(input.Absolute)
                ) && 
                (
                    this.Relative == input.Relative ||
                    this.Relative.Equals(input.Relative)
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
                hashCode = hashCode * 59 + this.Absolute.GetHashCode();
                hashCode = hashCode * 59 + this.Relative.GetHashCode();
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
