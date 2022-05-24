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
using OpenAPIDateConverter = FactSet.SDK.CompanyLogoAPIforDigitalPortals.Client.OpenAPIDateConverter;

namespace FactSet.SDK.CompanyLogoAPIforDigitalPortals.Model
{
    /// <summary>
    /// Pagination attributes for the cursor-based pagination strategy; a total element count is not supported.
    /// </summary>
    [DataContract(Name = "CursorBasedPaginationOutputObjectWithoutTotal")]
    public partial class CursorBasedPaginationOutputObjectWithoutTotal : IEquatable<CursorBasedPaginationOutputObjectWithoutTotal>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CursorBasedPaginationOutputObjectWithoutTotal" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CursorBasedPaginationOutputObjectWithoutTotal() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CursorBasedPaginationOutputObjectWithoutTotal" /> class.
        /// </summary>
        /// <param name="next">Cursor position to use in the attribute &#x60;pagination.cursor&#x60; to retrieve the next page of results, if any, otherwise null. (required).</param>
        /// <param name="previous">Cursor position to use in the attribute &#x60;pagination.cursor&#x60; to retrieve the previous page of results, if any, otherwise null. (required).</param>
        public CursorBasedPaginationOutputObjectWithoutTotal(string next = default(string), string previous = default(string))
        {
            // to ensure "next" is required (not null)
            if (next == null) {
                throw new ArgumentNullException("next is a required property for CursorBasedPaginationOutputObjectWithoutTotal and cannot be null");
            }
            this.Next = next;
            // to ensure "previous" is required (not null)
            if (previous == null) {
                throw new ArgumentNullException("previous is a required property for CursorBasedPaginationOutputObjectWithoutTotal and cannot be null");
            }
            this.Previous = previous;
        }

        /// <summary>
        /// Cursor position to use in the attribute &#x60;pagination.cursor&#x60; to retrieve the next page of results, if any, otherwise null.
        /// </summary>
        /// <value>Cursor position to use in the attribute &#x60;pagination.cursor&#x60; to retrieve the next page of results, if any, otherwise null.</value>
        [DataMember(Name = "next", IsRequired = true, EmitDefaultValue = false)]
        public string Next { get; set; }

        /// <summary>
        /// Cursor position to use in the attribute &#x60;pagination.cursor&#x60; to retrieve the previous page of results, if any, otherwise null.
        /// </summary>
        /// <value>Cursor position to use in the attribute &#x60;pagination.cursor&#x60; to retrieve the previous page of results, if any, otherwise null.</value>
        [DataMember(Name = "previous", IsRequired = true, EmitDefaultValue = false)]
        public string Previous { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class CursorBasedPaginationOutputObjectWithoutTotal {\n");
            sb.Append("  Next: ").Append(Next).Append("\n");
            sb.Append("  Previous: ").Append(Previous).Append("\n");
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
            return this.Equals(input as CursorBasedPaginationOutputObjectWithoutTotal);
        }

        /// <summary>
        /// Returns true if CursorBasedPaginationOutputObjectWithoutTotal instances are equal
        /// </summary>
        /// <param name="input">Instance of CursorBasedPaginationOutputObjectWithoutTotal to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CursorBasedPaginationOutputObjectWithoutTotal input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Next == input.Next ||
                    (this.Next != null &&
                    this.Next.Equals(input.Next))
                ) && 
                (
                    this.Previous == input.Previous ||
                    (this.Previous != null &&
                    this.Previous.Equals(input.Previous))
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
                if (this.Next != null)
                {
                    hashCode = (hashCode * 59) + this.Next.GetHashCode();
                }
                if (this.Previous != null)
                {
                    hashCode = (hashCode * 59) + this.Previous.GetHashCode();
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
