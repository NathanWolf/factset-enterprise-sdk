/*
 * Funds API For Digital Portals
 *
 * Search for mutual funds and ETFs using one single consolidated API, including a criteria-based screener. The API provides also base data, key figures, and holdings.  A separate endpoint returns the possible values and value range for the parameters that the endpoint /fund/notation/screener/search accepts: Application developers can request the values and value range only for a restricted set of notations that match predefined parameters. This functionality may be used to pre-fill the values and value ranges of the parameters of the /fund/notation/screener/search endpoint so that performing a search always leads to a non-empty set of notations.  This API is fully integrated with the corresponding Quotes API, allowing access to detailed price and performance information of instruments, as well as basic security identifier cross-reference. For direct access to price histories, please refer to the Time Series API for Digital Portals.  Similar criteria based screener APIs exist for equity instruments and securitized derivatives: See the Stocks API and the Securitized Derivatives API for details.
 *
 * The version of the OpenAPI document: 2
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
using OpenAPIDateConverter = FactSet.SDK.FundsAPIforDigitalPortals.Client.OpenAPIDateConverter;

namespace FactSet.SDK.FundsAPIforDigitalPortals.Model
{
    /// <summary>
    /// Pagination attributes for the offset-based pagination strategy.
    /// </summary>
    [DataContract(Name = "_fund_notation_screener_search_meta_pagination")]
    public partial class FundNotationScreenerSearchMetaPagination : IEquatable<FundNotationScreenerSearchMetaPagination>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="FundNotationScreenerSearchMetaPagination" /> class.
        /// </summary>
        /// <param name="offset">Non-negative number of entries to skip, or 0 (default)..</param>
        /// <param name="limit">Non-negative maximum number of entries to return..</param>
        public FundNotationScreenerSearchMetaPagination(decimal offset = default(decimal), decimal limit = default(decimal))
        {
            this.Offset = offset;
            this.Limit = limit;
        }

        /// <summary>
        /// Non-negative number of entries to skip, or 0 (default).
        /// </summary>
        /// <value>Non-negative number of entries to skip, or 0 (default).</value>
        [DataMember(Name = "offset", EmitDefaultValue = false)]
        public decimal Offset { get; set; }

        /// <summary>
        /// Non-negative maximum number of entries to return.
        /// </summary>
        /// <value>Non-negative maximum number of entries to return.</value>
        [DataMember(Name = "limit", EmitDefaultValue = false)]
        public decimal Limit { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class FundNotationScreenerSearchMetaPagination {\n");
            sb.Append("  Offset: ").Append(Offset).Append("\n");
            sb.Append("  Limit: ").Append(Limit).Append("\n");
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
            return this.Equals(input as FundNotationScreenerSearchMetaPagination);
        }

        /// <summary>
        /// Returns true if FundNotationScreenerSearchMetaPagination instances are equal
        /// </summary>
        /// <param name="input">Instance of FundNotationScreenerSearchMetaPagination to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(FundNotationScreenerSearchMetaPagination input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Offset == input.Offset ||
                    this.Offset.Equals(input.Offset)
                ) && 
                (
                    this.Limit == input.Limit ||
                    this.Limit.Equals(input.Limit)
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
                hashCode = (hashCode * 59) + this.Offset.GetHashCode();
                hashCode = (hashCode * 59) + this.Limit.GetHashCode();
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
            // Offset (decimal) minimum
            if (this.Offset < (decimal)0)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for Offset, must be a value greater than or equal to 0.", new [] { "Offset" });
            }

            // Limit (decimal) maximum
            if (this.Limit > (decimal)5E+2)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for Limit, must be a value less than or equal to 5E+2.", new [] { "Limit" });
            }

            // Limit (decimal) minimum
            if (this.Limit < (decimal)0)
            {
                yield return new System.ComponentModel.DataAnnotations.ValidationResult("Invalid value for Limit, must be a value greater than or equal to 0.", new [] { "Limit" });
            }

            yield break;
        }
    }

}
