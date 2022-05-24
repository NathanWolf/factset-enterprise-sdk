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
using OpenAPIDateConverter = FactSet.SDK.SecuritizedDerivativesAPIforDigitalPortals.Client.OpenAPIDateConverter;

namespace FactSet.SDK.SecuritizedDerivativesAPIforDigitalPortals.Model
{
    /// <summary>
    /// Information whether or not, and if yes - when a barrier breach has occurred.
    /// </summary>
    [DataContract(Name = "inline_response_200_7_data_range_upper_breach")]
    public partial class InlineResponse2007DataRangeUpperBreach : IEquatable<InlineResponse2007DataRangeUpperBreach>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse2007DataRangeUpperBreach" /> class.
        /// </summary>
        /// <param name="isBreached">If set to true, indicates that the upper bound has been breached..</param>
        /// <param name="datetimeBreach">Date and time of the breach..</param>
        public InlineResponse2007DataRangeUpperBreach(bool isBreached = default(bool), string datetimeBreach = default(string))
        {
            this.IsBreached = isBreached;
            this.DatetimeBreach = datetimeBreach;
        }

        /// <summary>
        /// If set to true, indicates that the upper bound has been breached.
        /// </summary>
        /// <value>If set to true, indicates that the upper bound has been breached.</value>
        [DataMember(Name = "isBreached", EmitDefaultValue = true)]
        public bool IsBreached { get; set; }

        /// <summary>
        /// Date and time of the breach.
        /// </summary>
        /// <value>Date and time of the breach.</value>
        [DataMember(Name = "datetimeBreach", EmitDefaultValue = false)]
        public string DatetimeBreach { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class InlineResponse2007DataRangeUpperBreach {\n");
            sb.Append("  IsBreached: ").Append(IsBreached).Append("\n");
            sb.Append("  DatetimeBreach: ").Append(DatetimeBreach).Append("\n");
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
            return this.Equals(input as InlineResponse2007DataRangeUpperBreach);
        }

        /// <summary>
        /// Returns true if InlineResponse2007DataRangeUpperBreach instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse2007DataRangeUpperBreach to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse2007DataRangeUpperBreach input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.IsBreached == input.IsBreached ||
                    this.IsBreached.Equals(input.IsBreached)
                ) && 
                (
                    this.DatetimeBreach == input.DatetimeBreach ||
                    (this.DatetimeBreach != null &&
                    this.DatetimeBreach.Equals(input.DatetimeBreach))
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
                hashCode = (hashCode * 59) + this.IsBreached.GetHashCode();
                if (this.DatetimeBreach != null)
                {
                    hashCode = (hashCode * 59) + this.DatetimeBreach.GetHashCode();
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
