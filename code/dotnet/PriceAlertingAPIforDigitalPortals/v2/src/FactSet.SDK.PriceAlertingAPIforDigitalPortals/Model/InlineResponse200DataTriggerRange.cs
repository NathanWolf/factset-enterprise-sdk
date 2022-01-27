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
using OpenAPIDateConverter = FactSet.SDK.PriceAlertingAPIforDigitalPortals.Client.OpenAPIDateConverter;

namespace FactSet.SDK.PriceAlertingAPIforDigitalPortals.Model
{
    /// <summary>
    /// Price range for the trigger to monitor.
    /// </summary>
    [DataContract(Name = "inline_response_200_data_trigger_range")]
    public partial class InlineResponse200DataTriggerRange : IEquatable<InlineResponse200DataTriggerRange>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse200DataTriggerRange" /> class.
        /// </summary>
        /// <param name="upperLimit">Upper limit..</param>
        /// <param name="lowerLimit">Lower limit..</param>
        public InlineResponse200DataTriggerRange(decimal upperLimit = default(decimal), decimal lowerLimit = default(decimal))
        {
            this.UpperLimit = upperLimit;
            this.LowerLimit = lowerLimit;
        }

        /// <summary>
        /// Upper limit.
        /// </summary>
        /// <value>Upper limit.</value>
        [DataMember(Name = "upperLimit", EmitDefaultValue = false)]
        public decimal UpperLimit { get; set; }

        /// <summary>
        /// Lower limit.
        /// </summary>
        /// <value>Lower limit.</value>
        [DataMember(Name = "lowerLimit", EmitDefaultValue = false)]
        public decimal LowerLimit { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class InlineResponse200DataTriggerRange {\n");
            sb.Append("  UpperLimit: ").Append(UpperLimit).Append("\n");
            sb.Append("  LowerLimit: ").Append(LowerLimit).Append("\n");
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
            return this.Equals(input as InlineResponse200DataTriggerRange);
        }

        /// <summary>
        /// Returns true if InlineResponse200DataTriggerRange instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse200DataTriggerRange to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse200DataTriggerRange input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.UpperLimit == input.UpperLimit ||
                    this.UpperLimit.Equals(input.UpperLimit)
                ) && 
                (
                    this.LowerLimit == input.LowerLimit ||
                    this.LowerLimit.Equals(input.LowerLimit)
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
                hashCode = hashCode * 59 + this.UpperLimit.GetHashCode();
                hashCode = hashCode * 59 + this.LowerLimit.GetHashCode();
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
