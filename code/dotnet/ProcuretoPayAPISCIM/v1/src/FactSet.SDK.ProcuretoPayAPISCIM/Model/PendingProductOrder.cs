/*
 * FactSet SCIM API
 *
 * FactSet's SCIM API implementation.
 *
 * The version of the OpenAPI document: 1.0.0
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
using OpenAPIDateConverter = FactSet.SDK.ProcuretoPayAPISCIM.Client.OpenAPIDateConverter;

namespace FactSet.SDK.ProcuretoPayAPISCIM.Model
{
    /// <summary>
    /// PendingProductOrder
    /// </summary>
    [DataContract(Name = "PendingProductOrder")]
    public partial class PendingProductOrder : IEquatable<PendingProductOrder>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="PendingProductOrder" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected PendingProductOrder() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="PendingProductOrder" /> class.
        /// </summary>
        /// <param name="product">product (required).</param>
        public PendingProductOrder(ProductResourceReference product = default(ProductResourceReference))
        {
            // to ensure "product" is required (not null)
            if (product == null) {
                throw new ArgumentNullException("product is a required property for PendingProductOrder and cannot be null");
            }
            this.Product = product;
        }

        /// <summary>
        /// Gets or Sets Product
        /// </summary>
        [DataMember(Name = "product", IsRequired = true, EmitDefaultValue = false)]
        public ProductResourceReference Product { get; set; }

        /// <summary>
        /// Type of product order, e.g. &#39;Add&#39; or &#39;Remove&#39;.
        /// </summary>
        /// <value>Type of product order, e.g. &#39;Add&#39; or &#39;Remove&#39;.</value>
        [DataMember(Name = "type", IsRequired = true, EmitDefaultValue = false)]
        public string Type { get; private set; }

        /// <summary>
        /// Returns false as Type should not be serialized given that it's read-only.
        /// </summary>
        /// <returns>false (boolean)</returns>
        public bool ShouldSerializeType()
        {
            return false;
        }
        /// <summary>
        /// Status of the pending product order.
        /// </summary>
        /// <value>Status of the pending product order.</value>
        [DataMember(Name = "status", IsRequired = true, EmitDefaultValue = false)]
        public string Status { get; private set; }

        /// <summary>
        /// Returns false as Status should not be serialized given that it's read-only.
        /// </summary>
        /// <returns>false (boolean)</returns>
        public bool ShouldSerializeStatus()
        {
            return false;
        }
        /// <summary>
        /// Date and time when product was ordered.
        /// </summary>
        /// <value>Date and time when product was ordered.</value>
        [DataMember(Name = "requested", IsRequired = true, EmitDefaultValue = false)]
        public string Requested { get; private set; }

        /// <summary>
        /// Returns false as Requested should not be serialized given that it's read-only.
        /// </summary>
        /// <returns>false (boolean)</returns>
        public bool ShouldSerializeRequested()
        {
            return false;
        }
        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class PendingProductOrder {\n");
            sb.Append("  Product: ").Append(Product).Append("\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
            sb.Append("  Status: ").Append(Status).Append("\n");
            sb.Append("  Requested: ").Append(Requested).Append("\n");
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
            return this.Equals(input as PendingProductOrder);
        }

        /// <summary>
        /// Returns true if PendingProductOrder instances are equal
        /// </summary>
        /// <param name="input">Instance of PendingProductOrder to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PendingProductOrder input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Product == input.Product ||
                    (this.Product != null &&
                    this.Product.Equals(input.Product))
                ) && 
                (
                    this.Type == input.Type ||
                    (this.Type != null &&
                    this.Type.Equals(input.Type))
                ) && 
                (
                    this.Status == input.Status ||
                    (this.Status != null &&
                    this.Status.Equals(input.Status))
                ) && 
                (
                    this.Requested == input.Requested ||
                    (this.Requested != null &&
                    this.Requested.Equals(input.Requested))
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
                if (this.Product != null)
                {
                    hashCode = (hashCode * 59) + this.Product.GetHashCode();
                }
                if (this.Type != null)
                {
                    hashCode = (hashCode * 59) + this.Type.GetHashCode();
                }
                if (this.Status != null)
                {
                    hashCode = (hashCode * 59) + this.Status.GetHashCode();
                }
                if (this.Requested != null)
                {
                    hashCode = (hashCode * 59) + this.Requested.GetHashCode();
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
