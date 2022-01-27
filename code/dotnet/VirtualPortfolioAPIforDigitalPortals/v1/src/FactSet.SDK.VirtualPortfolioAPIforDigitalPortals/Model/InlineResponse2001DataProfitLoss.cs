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
    /// Profit and loss analysis. Positive values indicate profit; negative values indicate loss. All calculations are performed in the currency of the portfolio.
    /// </summary>
    [DataContract(Name = "inline_response_200_1_data_profitLoss")]
    public partial class InlineResponse2001DataProfitLoss : IEquatable<InlineResponse2001DataProfitLoss>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse2001DataProfitLoss" /> class.
        /// </summary>
        /// <param name="realized">realized.</param>
        /// <param name="potential">potential.</param>
        /// <param name="total">total.</param>
        /// <param name="today">today.</param>
        public InlineResponse2001DataProfitLoss(InlineResponse2001DataProfitLossRealized realized = default(InlineResponse2001DataProfitLossRealized), InlineResponse2001DataProfitLossPotential potential = default(InlineResponse2001DataProfitLossPotential), InlineResponse2001DataProfitLossTotal total = default(InlineResponse2001DataProfitLossTotal), InlineResponse2001DataProfitLossToday today = default(InlineResponse2001DataProfitLossToday))
        {
            this.Realized = realized;
            this.Potential = potential;
            this.Total = total;
            this.Today = today;
        }

        /// <summary>
        /// Gets or Sets Realized
        /// </summary>
        [DataMember(Name = "realized", EmitDefaultValue = false)]
        public InlineResponse2001DataProfitLossRealized Realized { get; set; }

        /// <summary>
        /// Gets or Sets Potential
        /// </summary>
        [DataMember(Name = "potential", EmitDefaultValue = false)]
        public InlineResponse2001DataProfitLossPotential Potential { get; set; }

        /// <summary>
        /// Gets or Sets Total
        /// </summary>
        [DataMember(Name = "total", EmitDefaultValue = false)]
        public InlineResponse2001DataProfitLossTotal Total { get; set; }

        /// <summary>
        /// Gets or Sets Today
        /// </summary>
        [DataMember(Name = "today", EmitDefaultValue = false)]
        public InlineResponse2001DataProfitLossToday Today { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class InlineResponse2001DataProfitLoss {\n");
            sb.Append("  Realized: ").Append(Realized).Append("\n");
            sb.Append("  Potential: ").Append(Potential).Append("\n");
            sb.Append("  Total: ").Append(Total).Append("\n");
            sb.Append("  Today: ").Append(Today).Append("\n");
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
            return this.Equals(input as InlineResponse2001DataProfitLoss);
        }

        /// <summary>
        /// Returns true if InlineResponse2001DataProfitLoss instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse2001DataProfitLoss to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse2001DataProfitLoss input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Realized == input.Realized ||
                    (this.Realized != null &&
                    this.Realized.Equals(input.Realized))
                ) && 
                (
                    this.Potential == input.Potential ||
                    (this.Potential != null &&
                    this.Potential.Equals(input.Potential))
                ) && 
                (
                    this.Total == input.Total ||
                    (this.Total != null &&
                    this.Total.Equals(input.Total))
                ) && 
                (
                    this.Today == input.Today ||
                    (this.Today != null &&
                    this.Today.Equals(input.Today))
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
                if (this.Realized != null)
                    hashCode = hashCode * 59 + this.Realized.GetHashCode();
                if (this.Potential != null)
                    hashCode = hashCode * 59 + this.Potential.GetHashCode();
                if (this.Total != null)
                    hashCode = hashCode * 59 + this.Total.GetHashCode();
                if (this.Today != null)
                    hashCode = hashCode * 59 + this.Today.GetHashCode();
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
