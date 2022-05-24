/*
 * TickHistory
 *
 * TickHistory provides dynamic access to historical tick data for a specific security for specific dates or date range.
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
using OpenAPIDateConverter = FactSet.SDK.FactSetTickHistory.Client.OpenAPIDateConverter;

namespace FactSet.SDK.FactSetTickHistory.Model
{
    /// <summary>
    /// GetFilesErrorDetail
    /// </summary>
    [DataContract(Name = "Get-FilesErrorDetail")]
    public partial class GetFilesErrorDetail : IEquatable<GetFilesErrorDetail>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="GetFilesErrorDetail" /> class.
        /// </summary>
        /// <param name="notAuthorizedTickers">query with partial tickers, products or exchanges not subscribed to.</param>
        /// <param name="paginationLimit">_paginationLimit must be &lt;&#x3D;500.</param>
        /// <param name="paginationOffset">_paginationoffset must be an integer.</param>
        public GetFilesErrorDetail(List<string> notAuthorizedTickers = default(List<string>), List<string> paginationLimit = default(List<string>), List<string> paginationOffset = default(List<string>))
        {
            this.NotAuthorizedTickers = notAuthorizedTickers;
            this.PaginationLimit = paginationLimit;
            this.PaginationOffset = paginationOffset;
        }

        /// <summary>
        /// query with partial tickers, products or exchanges not subscribed to
        /// </summary>
        /// <value>query with partial tickers, products or exchanges not subscribed to</value>
        [DataMember(Name = "not_authorized_tickers", EmitDefaultValue = false)]
        public List<string> NotAuthorizedTickers { get; set; }

        /// <summary>
        /// _paginationLimit must be &lt;&#x3D;500
        /// </summary>
        /// <value>_paginationLimit must be &lt;&#x3D;500</value>
        [DataMember(Name = "_paginationLimit", EmitDefaultValue = false)]
        public List<string> PaginationLimit { get; set; }

        /// <summary>
        /// _paginationoffset must be an integer
        /// </summary>
        /// <value>_paginationoffset must be an integer</value>
        [DataMember(Name = "_paginationOffset", EmitDefaultValue = false)]
        public List<string> PaginationOffset { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class GetFilesErrorDetail {\n");
            sb.Append("  NotAuthorizedTickers: ").Append(NotAuthorizedTickers).Append("\n");
            sb.Append("  PaginationLimit: ").Append(PaginationLimit).Append("\n");
            sb.Append("  PaginationOffset: ").Append(PaginationOffset).Append("\n");
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
            return this.Equals(input as GetFilesErrorDetail);
        }

        /// <summary>
        /// Returns true if GetFilesErrorDetail instances are equal
        /// </summary>
        /// <param name="input">Instance of GetFilesErrorDetail to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(GetFilesErrorDetail input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.NotAuthorizedTickers == input.NotAuthorizedTickers ||
                    this.NotAuthorizedTickers != null &&
                    input.NotAuthorizedTickers != null &&
                    this.NotAuthorizedTickers.SequenceEqual(input.NotAuthorizedTickers)
                ) && 
                (
                    this.PaginationLimit == input.PaginationLimit ||
                    this.PaginationLimit != null &&
                    input.PaginationLimit != null &&
                    this.PaginationLimit.SequenceEqual(input.PaginationLimit)
                ) && 
                (
                    this.PaginationOffset == input.PaginationOffset ||
                    this.PaginationOffset != null &&
                    input.PaginationOffset != null &&
                    this.PaginationOffset.SequenceEqual(input.PaginationOffset)
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
                if (this.NotAuthorizedTickers != null)
                {
                    hashCode = (hashCode * 59) + this.NotAuthorizedTickers.GetHashCode();
                }
                if (this.PaginationLimit != null)
                {
                    hashCode = (hashCode * 59) + this.PaginationLimit.GetHashCode();
                }
                if (this.PaginationOffset != null)
                {
                    hashCode = (hashCode * 59) + this.PaginationOffset.GetHashCode();
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
