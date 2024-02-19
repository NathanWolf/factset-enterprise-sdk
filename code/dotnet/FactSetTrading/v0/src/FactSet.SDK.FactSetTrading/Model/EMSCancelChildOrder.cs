/*
 * EMS API
 *
 * Allow clients to trade orders.
 *
 * The version of the OpenAPI document: 0.3.0
 * Contact: api@factset.com
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
    /// EMS Cancel Child Order
    /// </summary>
    [DataContract(Name = "EMSCancelChildOrder")]
    public partial class EMSCancelChildOrder : IEquatable<EMSCancelChildOrder>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="EMSCancelChildOrder" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected EMSCancelChildOrder() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="EMSCancelChildOrder" /> class.
        /// </summary>
        /// <param name="ticketId">Ticket Id for the child order to be cancelled (required).</param>
        /// <param name="reason">Reason for cancelling the child order.</param>
        public EMSCancelChildOrder(string ticketId,string reason = default(string))
        {
            // to ensure "ticketId" is required (not null)
            if (ticketId == null) {
                throw new ArgumentNullException("ticketId is a required property for EMSCancelChildOrder and cannot be null");
            }
            this.TicketId = ticketId;
            this.Reason = reason;
        }

        /// <summary>
        /// Ticket Id for the child order to be cancelled
        /// </summary>
        /// <value>Ticket Id for the child order to be cancelled</value>
        [DataMember(Name = "ticketId", IsRequired = true, EmitDefaultValue = false)]
        public string TicketId { get; set; }

        /// <summary>
        /// Reason for cancelling the child order
        /// </summary>
        /// <value>Reason for cancelling the child order</value>
        [DataMember(Name = "reason", EmitDefaultValue = true)]
        public string Reason { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class EMSCancelChildOrder {\n");
            sb.Append("  TicketId: ").Append(TicketId).Append("\n");
            sb.Append("  Reason: ").Append(Reason).Append("\n");
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
            return this.Equals(input as EMSCancelChildOrder);
        }

        /// <summary>
        /// Returns true if EMSCancelChildOrder instances are equal
        /// </summary>
        /// <param name="input">Instance of EMSCancelChildOrder to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(EMSCancelChildOrder input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.TicketId == input.TicketId ||
                    (this.TicketId != null &&
                    this.TicketId.Equals(input.TicketId))
                ) && 
                (
                    this.Reason == input.Reason ||
                    (this.Reason != null &&
                    this.Reason.Equals(input.Reason))
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
                if (this.TicketId != null)
                {
                    hashCode = (hashCode * 59) + this.TicketId.GetHashCode();
                }
                if (this.Reason != null)
                {
                    hashCode = (hashCode * 59) + this.Reason.GetHashCode();
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
