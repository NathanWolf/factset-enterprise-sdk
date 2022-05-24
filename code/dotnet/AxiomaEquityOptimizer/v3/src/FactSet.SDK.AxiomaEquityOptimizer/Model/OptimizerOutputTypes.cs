/*
 * Axioma Equity API
 *
 * Allow clients to fetch Analytics through APIs.
 *
 * The version of the OpenAPI document: 3
 * Contact: analytics.api.support@factset.com
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
using OpenAPIDateConverter = FactSet.SDK.AxiomaEquityOptimizer.Client.OpenAPIDateConverter;

namespace FactSet.SDK.AxiomaEquityOptimizer.Model
{
    /// <summary>
    /// OptimizerOutputTypes
    /// </summary>
    [DataContract(Name = "OptimizerOutputTypes")]
    public partial class OptimizerOutputTypes : IEquatable<OptimizerOutputTypes>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="OptimizerOutputTypes" /> class.
        /// </summary>
        /// <param name="trades">trades.</param>
        /// <param name="optimal">optimal.</param>
        /// <param name="account">account.</param>
        public OptimizerOutputTypes(OptimizerTradesList trades = default(OptimizerTradesList), OptimizerOptimalHoldings optimal = default(OptimizerOptimalHoldings), OptimalPortfolio account = default(OptimalPortfolio))
        {
            this.Trades = trades;
            this.Optimal = optimal;
            this.Account = account;
        }

        /// <summary>
        /// Gets or Sets Trades
        /// </summary>
        [DataMember(Name = "trades", EmitDefaultValue = false)]
        public OptimizerTradesList Trades { get; set; }

        /// <summary>
        /// Gets or Sets Optimal
        /// </summary>
        [DataMember(Name = "optimal", EmitDefaultValue = false)]
        public OptimizerOptimalHoldings Optimal { get; set; }

        /// <summary>
        /// Gets or Sets Account
        /// </summary>
        [DataMember(Name = "account", EmitDefaultValue = false)]
        public OptimalPortfolio Account { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class OptimizerOutputTypes {\n");
            sb.Append("  Trades: ").Append(Trades).Append("\n");
            sb.Append("  Optimal: ").Append(Optimal).Append("\n");
            sb.Append("  Account: ").Append(Account).Append("\n");
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
            return this.Equals(input as OptimizerOutputTypes);
        }

        /// <summary>
        /// Returns true if OptimizerOutputTypes instances are equal
        /// </summary>
        /// <param name="input">Instance of OptimizerOutputTypes to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(OptimizerOutputTypes input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Trades == input.Trades ||
                    (this.Trades != null &&
                    this.Trades.Equals(input.Trades))
                ) && 
                (
                    this.Optimal == input.Optimal ||
                    (this.Optimal != null &&
                    this.Optimal.Equals(input.Optimal))
                ) && 
                (
                    this.Account == input.Account ||
                    (this.Account != null &&
                    this.Account.Equals(input.Account))
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
                if (this.Trades != null)
                {
                    hashCode = (hashCode * 59) + this.Trades.GetHashCode();
                }
                if (this.Optimal != null)
                {
                    hashCode = (hashCode * 59) + this.Optimal.GetHashCode();
                }
                if (this.Account != null)
                {
                    hashCode = (hashCode * 59) + this.Account.GetHashCode();
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
