/*
 * EMS API
 *
 * Allow clients to trade orders.
 *
 * The version of the OpenAPI document: 1
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
using OpenAPIDateConverter = FactSet.SDK.FactSetTrading.Client.OpenAPIDateConverter;

namespace FactSet.SDK.FactSetTrading.Model
{
    /// <summary>
    /// EMSCancelOrders
    /// </summary>
    [DataContract(Name = "EMSCancelOrders")]
    public partial class EMSCancelOrders : IEquatable<EMSCancelOrders>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="EMSCancelOrders" /> class.
        /// </summary>
        /// <param name="investorId">investorId.</param>
        /// <param name="orders">orders.</param>
        public EMSCancelOrders(string investorId = default(string), List<EMSCancelOrder> orders = default(List<EMSCancelOrder>))
        {
            this.InvestorId = investorId;
            this.Orders = orders;
        }

        /// <summary>
        /// Gets or Sets InvestorId
        /// </summary>
        [DataMember(Name = "investorId", EmitDefaultValue = false)]
        public string InvestorId { get; set; }

        /// <summary>
        /// Gets or Sets Orders
        /// </summary>
        [DataMember(Name = "orders", EmitDefaultValue = false)]
        public List<EMSCancelOrder> Orders { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class EMSCancelOrders {\n");
            sb.Append("  InvestorId: ").Append(InvestorId).Append("\n");
            sb.Append("  Orders: ").Append(Orders).Append("\n");
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
            return this.Equals(input as EMSCancelOrders);
        }

        /// <summary>
        /// Returns true if EMSCancelOrders instances are equal
        /// </summary>
        /// <param name="input">Instance of EMSCancelOrders to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(EMSCancelOrders input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.InvestorId == input.InvestorId ||
                    (this.InvestorId != null &&
                    this.InvestorId.Equals(input.InvestorId))
                ) && 
                (
                    this.Orders == input.Orders ||
                    this.Orders != null &&
                    input.Orders != null &&
                    this.Orders.SequenceEqual(input.Orders)
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
                if (this.InvestorId != null)
                {
                    hashCode = (hashCode * 59) + this.InvestorId.GetHashCode();
                }
                if (this.Orders != null)
                {
                    hashCode = (hashCode * 59) + this.Orders.GetHashCode();
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
