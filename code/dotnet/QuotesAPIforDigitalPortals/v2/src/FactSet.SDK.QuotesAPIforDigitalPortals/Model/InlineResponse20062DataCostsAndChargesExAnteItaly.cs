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
    /// Specific indicators for Italy.
    /// </summary>
    [DataContract(Name = "inline_response_200_62_data_costsAndCharges_exAnte_italy")]
    public partial class InlineResponse20062DataCostsAndChargesExAnteItaly : IEquatable<InlineResponse20062DataCostsAndChargesExAnteItaly>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse20062DataCostsAndChargesExAnteItaly" /> class.
        /// </summary>
        /// <param name="oneOffMaximumFixedEntryCost">oneOffMaximumFixedEntryCost.</param>
        /// <param name="oneOffMaximumFixedExitCost">oneOffMaximumFixedExitCost.</param>
        public InlineResponse20062DataCostsAndChargesExAnteItaly(InlineResponse20062DataCostsAndChargesExAnteItalyOneOffMaximumFixedEntryCost oneOffMaximumFixedEntryCost = default(InlineResponse20062DataCostsAndChargesExAnteItalyOneOffMaximumFixedEntryCost), InlineResponse20062DataCostsAndChargesExAnteItalyOneOffMaximumFixedExitCost oneOffMaximumFixedExitCost = default(InlineResponse20062DataCostsAndChargesExAnteItalyOneOffMaximumFixedExitCost))
        {
            this.OneOffMaximumFixedEntryCost = oneOffMaximumFixedEntryCost;
            this.OneOffMaximumFixedExitCost = oneOffMaximumFixedExitCost;
        }

        /// <summary>
        /// Gets or Sets OneOffMaximumFixedEntryCost
        /// </summary>
        [DataMember(Name = "oneOffMaximumFixedEntryCost", EmitDefaultValue = false)]
        public InlineResponse20062DataCostsAndChargesExAnteItalyOneOffMaximumFixedEntryCost OneOffMaximumFixedEntryCost { get; set; }

        /// <summary>
        /// Gets or Sets OneOffMaximumFixedExitCost
        /// </summary>
        [DataMember(Name = "oneOffMaximumFixedExitCost", EmitDefaultValue = false)]
        public InlineResponse20062DataCostsAndChargesExAnteItalyOneOffMaximumFixedExitCost OneOffMaximumFixedExitCost { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class InlineResponse20062DataCostsAndChargesExAnteItaly {\n");
            sb.Append("  OneOffMaximumFixedEntryCost: ").Append(OneOffMaximumFixedEntryCost).Append("\n");
            sb.Append("  OneOffMaximumFixedExitCost: ").Append(OneOffMaximumFixedExitCost).Append("\n");
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
            return this.Equals(input as InlineResponse20062DataCostsAndChargesExAnteItaly);
        }

        /// <summary>
        /// Returns true if InlineResponse20062DataCostsAndChargesExAnteItaly instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse20062DataCostsAndChargesExAnteItaly to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse20062DataCostsAndChargesExAnteItaly input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.OneOffMaximumFixedEntryCost == input.OneOffMaximumFixedEntryCost ||
                    (this.OneOffMaximumFixedEntryCost != null &&
                    this.OneOffMaximumFixedEntryCost.Equals(input.OneOffMaximumFixedEntryCost))
                ) && 
                (
                    this.OneOffMaximumFixedExitCost == input.OneOffMaximumFixedExitCost ||
                    (this.OneOffMaximumFixedExitCost != null &&
                    this.OneOffMaximumFixedExitCost.Equals(input.OneOffMaximumFixedExitCost))
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
                if (this.OneOffMaximumFixedEntryCost != null)
                {
                    hashCode = (hashCode * 59) + this.OneOffMaximumFixedEntryCost.GetHashCode();
                }
                if (this.OneOffMaximumFixedExitCost != null)
                {
                    hashCode = (hashCode * 59) + this.OneOffMaximumFixedExitCost.GetHashCode();
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
