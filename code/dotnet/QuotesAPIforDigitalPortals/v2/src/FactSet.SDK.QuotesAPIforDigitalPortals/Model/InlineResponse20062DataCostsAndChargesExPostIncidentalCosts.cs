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
    /// Annualized ex post incidental cost of the investment product. Among others, this includes the performance fee and the carried interests.
    /// </summary>
    [DataContract(Name = "inline_response_200_62_data_costsAndCharges_exPost_incidentalCosts")]
    public partial class InlineResponse20062DataCostsAndChargesExPostIncidentalCosts : IEquatable<InlineResponse20062DataCostsAndChargesExPostIncidentalCosts>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse20062DataCostsAndChargesExPostIncidentalCosts" /> class.
        /// </summary>
        /// <param name="value">Value of the attribute..</param>
        /// <param name="valueUnit">valueUnit.</param>
        public InlineResponse20062DataCostsAndChargesExPostIncidentalCosts(decimal value = default(decimal), InlineResponse20062DataCostsAndChargesExAnteOneOffEntryCostValueUnit valueUnit = default(InlineResponse20062DataCostsAndChargesExAnteOneOffEntryCostValueUnit))
        {
            this.Value = value;
            this.ValueUnit = valueUnit;
        }

        /// <summary>
        /// Value of the attribute.
        /// </summary>
        /// <value>Value of the attribute.</value>
        [DataMember(Name = "value", EmitDefaultValue = false)]
        public decimal Value { get; set; }

        /// <summary>
        /// Gets or Sets ValueUnit
        /// </summary>
        [DataMember(Name = "valueUnit", EmitDefaultValue = false)]
        public InlineResponse20062DataCostsAndChargesExAnteOneOffEntryCostValueUnit ValueUnit { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class InlineResponse20062DataCostsAndChargesExPostIncidentalCosts {\n");
            sb.Append("  Value: ").Append(Value).Append("\n");
            sb.Append("  ValueUnit: ").Append(ValueUnit).Append("\n");
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
            return this.Equals(input as InlineResponse20062DataCostsAndChargesExPostIncidentalCosts);
        }

        /// <summary>
        /// Returns true if InlineResponse20062DataCostsAndChargesExPostIncidentalCosts instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse20062DataCostsAndChargesExPostIncidentalCosts to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse20062DataCostsAndChargesExPostIncidentalCosts input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Value == input.Value ||
                    this.Value.Equals(input.Value)
                ) && 
                (
                    this.ValueUnit == input.ValueUnit ||
                    (this.ValueUnit != null &&
                    this.ValueUnit.Equals(input.ValueUnit))
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
                hashCode = (hashCode * 59) + this.Value.GetHashCode();
                if (this.ValueUnit != null)
                {
                    hashCode = (hashCode * 59) + this.ValueUnit.GetHashCode();
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
