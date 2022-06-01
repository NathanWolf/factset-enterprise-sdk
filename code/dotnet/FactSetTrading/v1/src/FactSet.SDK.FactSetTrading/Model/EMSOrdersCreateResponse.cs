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
    /// EMSOrdersCreateResponse
    /// </summary>
    [DataContract(Name = "EMSOrdersCreateResponse")]
    public partial class EMSOrdersCreateResponse : IEquatable<EMSOrdersCreateResponse>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="EMSOrdersCreateResponse" /> class.
        /// </summary>
        /// <param name="accepted">accepted.</param>
        /// <param name="rejected">rejected.</param>
        public EMSOrdersCreateResponse(Dictionary<string, EMSOrderMetadata> accepted = default(Dictionary<string, EMSOrderMetadata>), Dictionary<string, EMSOrderMetadata> rejected = default(Dictionary<string, EMSOrderMetadata>))
        {
            this.Accepted = accepted;
            this.Rejected = rejected;
        }

        /// <summary>
        /// Gets or Sets Accepted
        /// </summary>
        [DataMember(Name = "accepted", EmitDefaultValue = false)]
        public Dictionary<string, EMSOrderMetadata> Accepted { get; set; }

        /// <summary>
        /// Gets or Sets Rejected
        /// </summary>
        [DataMember(Name = "rejected", EmitDefaultValue = false)]
        public Dictionary<string, EMSOrderMetadata> Rejected { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class EMSOrdersCreateResponse {\n");
            sb.Append("  Accepted: ").Append(Accepted).Append("\n");
            sb.Append("  Rejected: ").Append(Rejected).Append("\n");
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
            return this.Equals(input as EMSOrdersCreateResponse);
        }

        /// <summary>
        /// Returns true if EMSOrdersCreateResponse instances are equal
        /// </summary>
        /// <param name="input">Instance of EMSOrdersCreateResponse to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(EMSOrdersCreateResponse input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Accepted == input.Accepted ||
                    this.Accepted != null &&
                    input.Accepted != null &&
                    this.Accepted.SequenceEqual(input.Accepted)
                ) && 
                (
                    this.Rejected == input.Rejected ||
                    this.Rejected != null &&
                    input.Rejected != null &&
                    this.Rejected.SequenceEqual(input.Rejected)
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
                if (this.Accepted != null)
                {
                    hashCode = (hashCode * 59) + this.Accepted.GetHashCode();
                }
                if (this.Rejected != null)
                {
                    hashCode = (hashCode * 59) + this.Rejected.GetHashCode();
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
