/*
 * Documents Distributor - Documents API
 *
 * Documents APIs that provide filings such as Global Filings and XML files such as StreetAccount    Global Filings API provides the capability to search and download filings documents from various exchanges around the world. The API also provides relevant metadata such as document source, company identifiers and form type around each filings document. Filings providers currently include EDGAR and SYMEX WebDisclosure.      StreetAccount XML API provides access to historical StreetAccount (SA) news. SA provides a summary for various corporate and market news written by journalist with background in financial markets.    The API delivers SA stories in XML format based on user-specified date input parameters. When the API request is completed, output files will be made available back to the users through a secure URL. This API has three endpoints (1) Request Files (2) Check Status (3) Get Files.   Files delivered contain both metadata and content body in each file. This eliminates the need to make multiple requests through multiple services to get all the information.  
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
using OpenAPIDateConverter = FactSet.SDK.DocumentsDistributorDocuments.Client.OpenAPIDateConverter;

namespace FactSet.SDK.DocumentsDistributorDocuments.Model
{
    /// <summary>
    /// List of pagination objects
    /// </summary>
    [DataContract(Name = "paginationItems")]
    public partial class PaginationItems : IEquatable<PaginationItems>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="PaginationItems" /> class.
        /// </summary>
        /// <param name="total">Total number of files the API returns for a particular query.</param>
        /// <param name="isEstimatedTotal">Boolean value that represents whether the total count of files returned is exact or an estimate. This is defaulted to False as the API should always return the exact count.</param>
        /// <param name="limit">Number of results returned per page.</param>
        /// <param name="offset">The flag indicating the position in the results array if additional results are available beyond the default value or the value in paginationLimit parameter (if used). Thiis value is passed in the _paginationOffset parameter to retreieve subsequent results.</param>
        public PaginationItems(int total = default(int), bool isEstimatedTotal = default(bool), int limit = default(int), int offset = default(int))
        {
            this.Total = total;
            this.IsEstimatedTotal = isEstimatedTotal;
            this.Limit = limit;
            this.Offset = offset;
        }

        /// <summary>
        /// Total number of files the API returns for a particular query
        /// </summary>
        /// <value>Total number of files the API returns for a particular query</value>
        [DataMember(Name = "total", EmitDefaultValue = false)]
        public int Total { get; set; }

        /// <summary>
        /// Boolean value that represents whether the total count of files returned is exact or an estimate. This is defaulted to False as the API should always return the exact count
        /// </summary>
        /// <value>Boolean value that represents whether the total count of files returned is exact or an estimate. This is defaulted to False as the API should always return the exact count</value>
        [DataMember(Name = "isEstimatedTotal", EmitDefaultValue = true)]
        public bool IsEstimatedTotal { get; set; }

        /// <summary>
        /// Number of results returned per page
        /// </summary>
        /// <value>Number of results returned per page</value>
        [DataMember(Name = "limit", EmitDefaultValue = false)]
        public int Limit { get; set; }

        /// <summary>
        /// The flag indicating the position in the results array if additional results are available beyond the default value or the value in paginationLimit parameter (if used). Thiis value is passed in the _paginationOffset parameter to retreieve subsequent results
        /// </summary>
        /// <value>The flag indicating the position in the results array if additional results are available beyond the default value or the value in paginationLimit parameter (if used). Thiis value is passed in the _paginationOffset parameter to retreieve subsequent results</value>
        [DataMember(Name = "offset", EmitDefaultValue = false)]
        public int Offset { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class PaginationItems {\n");
            sb.Append("  Total: ").Append(Total).Append("\n");
            sb.Append("  IsEstimatedTotal: ").Append(IsEstimatedTotal).Append("\n");
            sb.Append("  Limit: ").Append(Limit).Append("\n");
            sb.Append("  Offset: ").Append(Offset).Append("\n");
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
            return this.Equals(input as PaginationItems);
        }

        /// <summary>
        /// Returns true if PaginationItems instances are equal
        /// </summary>
        /// <param name="input">Instance of PaginationItems to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PaginationItems input)
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
                ) && 
                (
                    this.Limit == input.Limit ||
                    this.Limit.Equals(input.Limit)
                ) && 
                (
                    this.Offset == input.Offset ||
                    this.Offset.Equals(input.Offset)
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
                hashCode = hashCode * 59 + this.Limit.GetHashCode();
                hashCode = hashCode * 59 + this.Offset.GetHashCode();
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
