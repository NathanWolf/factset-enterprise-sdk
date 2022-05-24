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
    /// Profit and loss of the position. Positive values indicate profit; negative values indicate loss. All calculations are performed in the currency of the portfolio.
    /// </summary>
    [DataContract(Name = "inline_response_200_6_data_profitLoss")]
    public partial class InlineResponse2006DataProfitLoss : IEquatable<InlineResponse2006DataProfitLoss>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse2006DataProfitLoss" /> class.
        /// </summary>
        /// <param name="intraday">intraday.</param>
        /// <param name="potential">potential.</param>
        public InlineResponse2006DataProfitLoss(InlineResponse2001DataProfitLossToday intraday = default(InlineResponse2001DataProfitLossToday), InlineResponse2001DataProfitLossPotential potential = default(InlineResponse2001DataProfitLossPotential))
        {
            this.Intraday = intraday;
            this.Potential = potential;
        }

        /// <summary>
        /// Gets or Sets Intraday
        /// </summary>
        [DataMember(Name = "intraday", EmitDefaultValue = false)]
        public InlineResponse2001DataProfitLossToday Intraday { get; set; }

        /// <summary>
        /// Gets or Sets Potential
        /// </summary>
        [DataMember(Name = "potential", EmitDefaultValue = false)]
        public InlineResponse2001DataProfitLossPotential Potential { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class InlineResponse2006DataProfitLoss {\n");
            sb.Append("  Intraday: ").Append(Intraday).Append("\n");
            sb.Append("  Potential: ").Append(Potential).Append("\n");
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
            return this.Equals(input as InlineResponse2006DataProfitLoss);
        }

        /// <summary>
        /// Returns true if InlineResponse2006DataProfitLoss instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse2006DataProfitLoss to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse2006DataProfitLoss input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Intraday == input.Intraday ||
                    (this.Intraday != null &&
                    this.Intraday.Equals(input.Intraday))
                ) && 
                (
                    this.Potential == input.Potential ||
                    (this.Potential != null &&
                    this.Potential.Equals(input.Potential))
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
                {
                    hashCode = (hashCode * 59) + this.Intraday.GetHashCode();
                }
                if (this.Potential != null)
                {
                    hashCode = (hashCode * 59) + this.Potential.GetHashCode();
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
