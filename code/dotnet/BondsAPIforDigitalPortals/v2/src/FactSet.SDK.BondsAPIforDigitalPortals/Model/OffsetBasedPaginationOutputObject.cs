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
using OpenAPIDateConverter = FactSet.SDK.BondsAPIforDigitalPortals.Client.OpenAPIDateConverter;

namespace FactSet.SDK.BondsAPIforDigitalPortals.Model
{
    /// <summary>
    /// Pagination attributes for the offset-based pagination strategy.
    /// </summary>
    [DataContract(Name = "OffsetBasedPaginationOutputObject")]
    public partial class OffsetBasedPaginationOutputObject : IEquatable<OffsetBasedPaginationOutputObject>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="OffsetBasedPaginationOutputObject" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected OffsetBasedPaginationOutputObject() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="OffsetBasedPaginationOutputObject" /> class.
        /// </summary>
        /// <param name="total">Total number of entries in the result set. (required).</param>
        /// <param name="isEstimatedTotal">Flag indicating that the value of \&quot;total\&quot; is estimated. (required).</param>
        public OffsetBasedPaginationOutputObject(decimal total = default(decimal), bool isEstimatedTotal = default(bool))
        {
            this.Total = total;
            this.IsEstimatedTotal = isEstimatedTotal;
        }

        /// <summary>
        /// Total number of entries in the result set.
        /// </summary>
        /// <value>Total number of entries in the result set.</value>
        [DataMember(Name = "total", IsRequired = true, EmitDefaultValue = false)]
        public decimal Total { get; set; }

        /// <summary>
        /// Flag indicating that the value of \&quot;total\&quot; is estimated.
        /// </summary>
        /// <value>Flag indicating that the value of \&quot;total\&quot; is estimated.</value>
        [DataMember(Name = "isEstimatedTotal", IsRequired = true, EmitDefaultValue = true)]
        public bool IsEstimatedTotal { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class OffsetBasedPaginationOutputObject {\n");
            sb.Append("  Total: ").Append(Total).Append("\n");
            sb.Append("  IsEstimatedTotal: ").Append(IsEstimatedTotal).Append("\n");
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
            return this.Equals(input as OffsetBasedPaginationOutputObject);
        }

        /// <summary>
        /// Returns true if OffsetBasedPaginationOutputObject instances are equal
        /// </summary>
        /// <param name="input">Instance of OffsetBasedPaginationOutputObject to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(OffsetBasedPaginationOutputObject input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Total == input.Total ||
                    this.Total.Equals(input.Total)
                ) && 
                (
                    this.IsEstimatedTotal == input.IsEstimatedTotal ||
                    this.IsEstimatedTotal.Equals(input.IsEstimatedTotal)
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
                hashCode = hashCode * 59 + this.Total.GetHashCode();
                hashCode = hashCode * 59 + this.IsEstimatedTotal.GetHashCode();
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
