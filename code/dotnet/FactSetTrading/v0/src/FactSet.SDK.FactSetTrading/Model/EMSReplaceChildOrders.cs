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
    /// EMSReplaceChildOrders
    /// </summary>
    [DataContract(Name = "EMSReplaceChildOrders")]
    public partial class EMSReplaceChildOrders : IEquatable<EMSReplaceChildOrders>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="EMSReplaceChildOrders" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected EMSReplaceChildOrders() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="EMSReplaceChildOrders" /> class.
        /// </summary>
        /// <param name="childOrders">childOrders (required).</param>
        public EMSReplaceChildOrders(List<ReplaceChildOrder> childOrders)
        {
            // to ensure "childOrders" is required (not null)
            if (childOrders == null) {
                throw new ArgumentNullException("childOrders is a required property for EMSReplaceChildOrders and cannot be null");
            }
            this.ChildOrders = childOrders;
        }

        /// <summary>
        /// Gets or Sets ChildOrders
        /// </summary>
        [DataMember(Name = "childOrders", IsRequired = true, EmitDefaultValue = false)]
        public List<ReplaceChildOrder> ChildOrders { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class EMSReplaceChildOrders {\n");
            sb.Append("  ChildOrders: ").Append(ChildOrders).Append("\n");
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
            return this.Equals(input as EMSReplaceChildOrders);
        }

        /// <summary>
        /// Returns true if EMSReplaceChildOrders instances are equal
        /// </summary>
        /// <param name="input">Instance of EMSReplaceChildOrders to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(EMSReplaceChildOrders input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.ChildOrders == input.ChildOrders ||
                    this.ChildOrders != null &&
                    input.ChildOrders != null &&
                    this.ChildOrders.SequenceEqual(input.ChildOrders)
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
                if (this.ChildOrders != null)
                {
                    hashCode = (hashCode * 59) + this.ChildOrders.GetHashCode();
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
