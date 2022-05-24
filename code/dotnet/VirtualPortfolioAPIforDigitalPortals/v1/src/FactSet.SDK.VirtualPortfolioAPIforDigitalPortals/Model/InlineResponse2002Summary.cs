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
    /// Summary of portfolio values in the portfolio&#39;s currency (see attribute &#x60;currency&#x60;).
    /// </summary>
    [DataContract(Name = "inline_response_200_2_summary")]
    public partial class InlineResponse2002Summary : IEquatable<InlineResponse2002Summary>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse2002Summary" /> class.
        /// </summary>
        /// <param name="totalValue">The total portfolio value, including the current cash amount..</param>
        /// <param name="numberPositions">Number of positions in the portfolio..</param>
        /// <param name="transactions">transactions.</param>
        /// <param name="cash">cash.</param>
        public InlineResponse2002Summary(decimal totalValue = default(decimal), decimal numberPositions = default(decimal), InlineResponse2002SummaryTransactions transactions = default(InlineResponse2002SummaryTransactions), InlineResponse2001DataSummaryCash cash = default(InlineResponse2001DataSummaryCash))
        {
            this.TotalValue = totalValue;
            this.NumberPositions = numberPositions;
            this.Transactions = transactions;
            this.Cash = cash;
        }

        /// <summary>
        /// The total portfolio value, including the current cash amount.
        /// </summary>
        /// <value>The total portfolio value, including the current cash amount.</value>
        [DataMember(Name = "totalValue", EmitDefaultValue = false)]
        public decimal TotalValue { get; set; }

        /// <summary>
        /// Number of positions in the portfolio.
        /// </summary>
        /// <value>Number of positions in the portfolio.</value>
        [DataMember(Name = "numberPositions", EmitDefaultValue = false)]
        public decimal NumberPositions { get; set; }

        /// <summary>
        /// Gets or Sets Transactions
        /// </summary>
        [DataMember(Name = "transactions", EmitDefaultValue = false)]
        public InlineResponse2002SummaryTransactions Transactions { get; set; }

        /// <summary>
        /// Gets or Sets Cash
        /// </summary>
        [DataMember(Name = "cash", EmitDefaultValue = false)]
        public InlineResponse2001DataSummaryCash Cash { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class InlineResponse2002Summary {\n");
            sb.Append("  TotalValue: ").Append(TotalValue).Append("\n");
            sb.Append("  NumberPositions: ").Append(NumberPositions).Append("\n");
            sb.Append("  Transactions: ").Append(Transactions).Append("\n");
            sb.Append("  Cash: ").Append(Cash).Append("\n");
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
            return this.Equals(input as InlineResponse2002Summary);
        }

        /// <summary>
        /// Returns true if InlineResponse2002Summary instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse2002Summary to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse2002Summary input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.TotalValue == input.TotalValue ||
                    this.TotalValue.Equals(input.TotalValue)
                ) && 
                (
                    this.NumberPositions == input.NumberPositions ||
                    this.NumberPositions.Equals(input.NumberPositions)
                ) && 
                (
                    this.Transactions == input.Transactions ||
                    (this.Transactions != null &&
                    this.Transactions.Equals(input.Transactions))
                ) && 
                (
                    this.Cash == input.Cash ||
                    (this.Cash != null &&
                    this.Cash.Equals(input.Cash))
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
                hashCode = (hashCode * 59) + this.TotalValue.GetHashCode();
                hashCode = (hashCode * 59) + this.NumberPositions.GetHashCode();
                if (this.Transactions != null)
                {
                    hashCode = (hashCode * 59) + this.Transactions.GetHashCode();
                }
                if (this.Cash != null)
                {
                    hashCode = (hashCode * 59) + this.Cash.GetHashCode();
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
